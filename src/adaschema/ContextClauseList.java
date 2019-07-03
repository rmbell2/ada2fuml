//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.27 at 12:30:50 PM EDT 
//


package adaschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Context_Clause_List complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Context_Clause_List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}not_an_element"/>
 *         &lt;element ref="{}use_package_clause"/>
 *         &lt;element ref="{}use_type_clause"/>
 *         &lt;element ref="{}use_all_type_clause"/>
 *         &lt;element ref="{}with_clause"/>
 *         &lt;element ref="{}comment"/>
 *         &lt;group ref="{}pragmas_group"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Context_Clause_List", propOrder = {
    "notAnElementOrUsePackageClauseOrUseTypeClause"
})
public class ContextClauseList {

    @XmlElements({
        @XmlElement(name = "not_an_element", type = NotAnElement.class),
        @XmlElement(name = "use_package_clause", type = UsePackageClause.class),
        @XmlElement(name = "use_type_clause", type = UseTypeClause.class),
        @XmlElement(name = "use_all_type_clause", type = UseAllTypeClause.class),
        @XmlElement(name = "with_clause", type = WithClause.class),
        @XmlElement(name = "comment", type = Comment.class),
        @XmlElement(name = "all_calls_remote_pragma", type = AllCallsRemotePragma.class),
        @XmlElement(name = "asynchronous_pragma", type = AsynchronousPragma.class),
        @XmlElement(name = "atomic_pragma", type = AtomicPragma.class),
        @XmlElement(name = "atomic_components_pragma", type = AtomicComponentsPragma.class),
        @XmlElement(name = "attach_handler_pragma", type = AttachHandlerPragma.class),
        @XmlElement(name = "controlled_pragma", type = ControlledPragma.class),
        @XmlElement(name = "convention_pragma", type = ConventionPragma.class),
        @XmlElement(name = "discard_names_pragma", type = DiscardNamesPragma.class),
        @XmlElement(name = "elaborate_pragma", type = ElaboratePragma.class),
        @XmlElement(name = "elaborate_all_pragma", type = ElaborateAllPragma.class),
        @XmlElement(name = "elaborate_body_pragma", type = ElaborateBodyPragma.class),
        @XmlElement(name = "export_pragma", type = ExportPragma.class),
        @XmlElement(name = "import_pragma", type = ImportPragma.class),
        @XmlElement(name = "inline_pragma", type = InlinePragma.class),
        @XmlElement(name = "inspection_point_pragma", type = InspectionPointPragma.class),
        @XmlElement(name = "interrupt_handler_pragma", type = InterruptHandlerPragma.class),
        @XmlElement(name = "interrupt_priority_pragma", type = InterruptPriorityPragma.class),
        @XmlElement(name = "linker_options_pragma", type = LinkerOptionsPragma.class),
        @XmlElement(name = "list_pragma", type = ListPragma.class),
        @XmlElement(name = "locking_policy_pragma", type = LockingPolicyPragma.class),
        @XmlElement(name = "normalize_scalars_pragma", type = NormalizeScalarsPragma.class),
        @XmlElement(name = "optimize_pragma", type = OptimizePragma.class),
        @XmlElement(name = "pack_pragma", type = PackPragma.class),
        @XmlElement(name = "page_pragma", type = PagePragma.class),
        @XmlElement(name = "preelaborate_pragma", type = PreelaboratePragma.class),
        @XmlElement(name = "priority_pragma", type = PriorityPragma.class),
        @XmlElement(name = "pure_pragma", type = PurePragma.class),
        @XmlElement(name = "queuing_policy_pragma", type = QueuingPolicyPragma.class),
        @XmlElement(name = "remote_call_interface_pragma", type = RemoteCallInterfacePragma.class),
        @XmlElement(name = "remote_types_pragma", type = RemoteTypesPragma.class),
        @XmlElement(name = "restrictions_pragma", type = RestrictionsPragma.class),
        @XmlElement(name = "reviewable_pragma", type = ReviewablePragma.class),
        @XmlElement(name = "shared_passive_pragma", type = SharedPassivePragma.class),
        @XmlElement(name = "storage_size_pragma", type = StorageSizePragma.class),
        @XmlElement(name = "suppress_pragma", type = SuppressPragma.class),
        @XmlElement(name = "task_dispatching_policy_pragma", type = TaskDispatchingPolicyPragma.class),
        @XmlElement(name = "volatile_pragma", type = VolatilePragma.class),
        @XmlElement(name = "volatile_components_pragma", type = VolatileComponentsPragma.class),
        @XmlElement(name = "assert_pragma", type = AssertPragma.class),
        @XmlElement(name = "assertion_policy_pragma", type = AssertionPolicyPragma.class),
        @XmlElement(name = "detect_blocking_pragma", type = DetectBlockingPragma.class),
        @XmlElement(name = "no_return_pragma", type = NoReturnPragma.class),
        @XmlElement(name = "partition_elaboration_policy_pragma", type = PartitionElaborationPolicyPragma.class),
        @XmlElement(name = "preelaborable_initialization_pragma", type = PreelaborableInitializationPragma.class),
        @XmlElement(name = "priority_specific_dispatching_pragma", type = PrioritySpecificDispatchingPragma.class),
        @XmlElement(name = "profile_pragma", type = ProfilePragma.class),
        @XmlElement(name = "relative_deadline_pragma", type = RelativeDeadlinePragma.class),
        @XmlElement(name = "unchecked_union_pragma", type = UncheckedUnionPragma.class),
        @XmlElement(name = "unsuppress_pragma", type = UnsuppressPragma.class),
        @XmlElement(name = "default_storage_pool_pragma", type = DefaultStoragePoolPragma.class),
        @XmlElement(name = "dispatching_domain_pragma", type = DispatchingDomainPragma.class),
        @XmlElement(name = "cpu_pragma", type = CpuPragma.class),
        @XmlElement(name = "independent_pragma", type = IndependentPragma.class),
        @XmlElement(name = "independent_components_pragma", type = IndependentComponentsPragma.class),
        @XmlElement(name = "implementation_defined_pragma", type = ImplementationDefinedPragma.class),
        @XmlElement(name = "unknown_pragma", type = UnknownPragma.class)
    })
    protected List<Object> notAnElementOrUsePackageClauseOrUseTypeClause;

    /**
     * Gets the value of the notAnElementOrUsePackageClauseOrUseTypeClause property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notAnElementOrUsePackageClauseOrUseTypeClause property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotAnElementOrUsePackageClauseOrUseTypeClause().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotAnElement }
     * {@link UsePackageClause }
     * {@link UseTypeClause }
     * {@link UseAllTypeClause }
     * {@link WithClause }
     * {@link Comment }
     * {@link AllCallsRemotePragma }
     * {@link AsynchronousPragma }
     * {@link AtomicPragma }
     * {@link AtomicComponentsPragma }
     * {@link AttachHandlerPragma }
     * {@link ControlledPragma }
     * {@link ConventionPragma }
     * {@link DiscardNamesPragma }
     * {@link ElaboratePragma }
     * {@link ElaborateAllPragma }
     * {@link ElaborateBodyPragma }
     * {@link ExportPragma }
     * {@link ImportPragma }
     * {@link InlinePragma }
     * {@link InspectionPointPragma }
     * {@link InterruptHandlerPragma }
     * {@link InterruptPriorityPragma }
     * {@link LinkerOptionsPragma }
     * {@link ListPragma }
     * {@link LockingPolicyPragma }
     * {@link NormalizeScalarsPragma }
     * {@link OptimizePragma }
     * {@link PackPragma }
     * {@link PagePragma }
     * {@link PreelaboratePragma }
     * {@link PriorityPragma }
     * {@link PurePragma }
     * {@link QueuingPolicyPragma }
     * {@link RemoteCallInterfacePragma }
     * {@link RemoteTypesPragma }
     * {@link RestrictionsPragma }
     * {@link ReviewablePragma }
     * {@link SharedPassivePragma }
     * {@link StorageSizePragma }
     * {@link SuppressPragma }
     * {@link TaskDispatchingPolicyPragma }
     * {@link VolatilePragma }
     * {@link VolatileComponentsPragma }
     * {@link AssertPragma }
     * {@link AssertionPolicyPragma }
     * {@link DetectBlockingPragma }
     * {@link NoReturnPragma }
     * {@link PartitionElaborationPolicyPragma }
     * {@link PreelaborableInitializationPragma }
     * {@link PrioritySpecificDispatchingPragma }
     * {@link ProfilePragma }
     * {@link RelativeDeadlinePragma }
     * {@link UncheckedUnionPragma }
     * {@link UnsuppressPragma }
     * {@link DefaultStoragePoolPragma }
     * {@link DispatchingDomainPragma }
     * {@link CpuPragma }
     * {@link IndependentPragma }
     * {@link IndependentComponentsPragma }
     * {@link ImplementationDefinedPragma }
     * {@link UnknownPragma }
     * 
     * 
     */
    public List<Object> getNotAnElementOrUsePackageClauseOrUseTypeClause() {
        if (notAnElementOrUsePackageClauseOrUseTypeClause == null) {
            notAnElementOrUsePackageClauseOrUseTypeClause = new ArrayList<Object>();
        }
        return this.notAnElementOrUsePackageClauseOrUseTypeClause;
    }

}
