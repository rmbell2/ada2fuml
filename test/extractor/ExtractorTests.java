package extractor;

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
    void packageX_and_typeX_yields_classX() {
        var adaXML = GetAdaXMLFromResource("SingleClassWithSameName.ads.xml");

        var compilationUnit = AdaXmlParser.parseAndProduceCompilationUnit(adaXML);

        var resultingUML = Extractor.extractHighLevelConcepts(compilationUnit);

        Assertions.assertEquals(1,resultingUML.getClasses().size());
        Assertions.assertEquals("SomeClass",resultingUML.getClasses().get(0).getName());
    }

    @Test
    void packageX_and_typeY_yields_packageX_and_classY() {
        var adaXML = GetAdaXMLFromResource("CombinedTypesAndVariables.ads.xml");

        var compilationUnit = AdaXmlParser.parseAndProduceCompilationUnit(adaXML);

        var resultingUML = Extractor.extractHighLevelConcepts(compilationUnit);

        Assertions.assertEquals(1,resultingUML.getPackages().size());
        Assertions.assertEquals("SomeClass",resultingUML.getPackages().get(0).getName());

        Assertions.assertEquals(2,resultingUML.getPackages().get(0).getClasses().size());
    }
}
