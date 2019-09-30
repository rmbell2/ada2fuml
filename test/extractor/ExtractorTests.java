package extractor;

import exceptions.UnhandledTypeException;
import model.Property;
import model.enums.TypeEnum;
import model.properties.PrimitiveProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import xmlparsing.AdaXmlParser;

import java.io.IOException;

class ExtractorTests {

    public static String GetAdaXMLFromResource(String name) {
        try {
            return new String(ExtractorTests.class.getClassLoader().getResource(name).openStream().readAllBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Test
    void packageX_and_typeX_yields_classX() throws UnhandledTypeException {
        var adaXML = GetAdaXMLFromResource("SingleClassWithSameName.ads.xml");

        var compilationUnit = AdaXmlParser.parseAndProduceCompilationUnit(adaXML);

        var resultingUML = Extractor.extractHighLevelConcepts(compilationUnit);

        Assertions.assertEquals(1,resultingUML.getClasses().size());
        Assertions.assertEquals("SomeClass",resultingUML.getClasses().get(0).getName());
    }

    @Test
    void packageX_and_typeY_yields_packageX_and_classY() throws UnhandledTypeException {
        var adaXML = GetAdaXMLFromResource("CombinedTypesAndVariables.ads.xml");

        var compilationUnit = AdaXmlParser.parseAndProduceCompilationUnit(adaXML);

        var resultingUML = Extractor.extractHighLevelConcepts(compilationUnit);

        Assertions.assertEquals(1,resultingUML.getPackages().size());
        Assertions.assertEquals("SomeClass",resultingUML.getPackages().get(0).getName());

        Assertions.assertEquals(2,resultingUML.getPackages().get(0).getClasses().size());
    }

    @Test
    void primitivePropertyTests() throws UnhandledTypeException {
        var adaXML = GetAdaXMLFromResource("CombinedTypesAndVariables.ads.xml");

        var compilationUnit = AdaXmlParser.parseAndProduceCompilationUnit(adaXML);

        var resultingUML = Extractor.extractHighLevelConcepts(compilationUnit);

        Assertions.assertEquals(1,resultingUML.getPackages().size());
        Assertions.assertEquals("SomeClass",resultingUML.getPackages().get(0).getName());

        Assertions.assertEquals(2,resultingUML.getPackages().get(0).getClasses().size());

        Assertions.assertEquals(2,resultingUML.getClasses().get(0).getProperties().size());
        Assertions.assertEquals("someAttribute",resultingUML.getClasses().get(0).getProperties().get(0).getName());
        Assertions.assertEquals(TypeEnum.Integer, ((PrimitiveProperty) resultingUML.getClasses().get(0).getProperties().get(0)).getType());

        Assertions.assertEquals(1,resultingUML.getPackages().get(0).getClasses().get(0).getProperties().size());
        Assertions.assertEquals(1,resultingUML.getPackages().get(0).getClasses().get(1).getProperties().size());

        Assertions.assertEquals("someAttribute3",resultingUML.getPackages().get(0).getClasses().get(1).getProperties().get(0).getName());
        Assertions.assertEquals(TypeEnum.Integer, ((PrimitiveProperty) resultingUML.getPackages().get(0).getClasses().get(1).getProperties().get(0)).getType());
    }

    @Test
    void variableAssignmentTests() throws UnhandledTypeException {
        var adaXML = GetAdaXMLFromResource("CombinedTypesAndVariables.ads.xml");

        var compilationUnit = AdaXmlParser.parseAndProduceCompilationUnit(adaXML);

        var resultingUML = Extractor.extractHighLevelConcepts(compilationUnit);

        Assertions.assertEquals(2,resultingUML.getClassByName("SomeClass").getProperties().size());
    }
}
