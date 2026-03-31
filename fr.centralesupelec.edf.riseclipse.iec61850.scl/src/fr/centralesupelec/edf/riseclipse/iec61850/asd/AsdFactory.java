/**
 *  Copyright (c) 2016-2024 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
 *
 *  This file is part of the RiseClipse tool
 *
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      https://riseclipse.github.io/
 *
 */
package fr.centralesupelec.edf.riseclipse.iec61850.asd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage
 * @generated
 */
public interface AsdFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AsdFactory eINSTANCE = fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Allocation Role</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Allocation Role</em>'.
     * @generated
     */
    AllocationRole createAllocationRole();

    /**
     * Returns a new object of class '<em>Allocation Role Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Allocation Role Ref</em>'.
     * @generated
     */
    AllocationRoleRef createAllocationRoleRef();

    /**
     * Returns a new object of class '<em>Application</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Application</em>'.
     * @generated
     */
    Application createApplication();

    /**
     * Returns a new object of class '<em>Analogue Wiring Parameters</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analogue Wiring Parameters</em>'.
     * @generated
     */
    AnalogueWiringParameters createAnalogueWiringParameters();

    /**
     * Returns a new object of class '<em>Analogue Wiring Parameters Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analogue Wiring Parameters Ref</em>'.
     * @generated
     */
    AnalogueWiringParametersRef createAnalogueWiringParametersRef();

    /**
     * Returns a new object of class '<em>Application Scl Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Application Scl Ref</em>'.
     * @generated
     */
    ApplicationSclRef createApplicationSclRef();

    /**
     * Returns a new object of class '<em>Bay Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bay Type</em>'.
     * @generated
     */
    BayType createBayType();

    /**
     * Returns a new object of class '<em>Behavior Description</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Description</em>'.
     * @generated
     */
    BehaviorDescription createBehaviorDescription();

    /**
     * Returns a new object of class '<em>Behavior Description Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Description Ref</em>'.
     * @generated
     */
    BehaviorDescriptionRef createBehaviorDescriptionRef();

    /**
     * Returns a new object of class '<em>Behavior Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Reference</em>'.
     * @generated
     */
    BehaviorReference createBehaviorReference();

    /**
     * Returns a new object of class '<em>Binary Wiring Parameters</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Binary Wiring Parameters</em>'.
     * @generated
     */
    BinaryWiringParameters createBinaryWiringParameters();

    /**
     * Returns a new object of class '<em>Binary Wiring Parameters Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Binary Wiring Parameters Ref</em>'.
     * @generated
     */
    BinaryWiringParametersRef createBinaryWiringParametersRef();

    /**
     * Returns a new object of class '<em>Checkout ID</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Checkout ID</em>'.
     * @generated
     */
    CheckoutID createCheckoutID();

    /**
     * Returns a new object of class '<em>Control Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Control Ref</em>'.
     * @generated
     */
    ControlRef createControlRef();

    /**
     * Returns a new object of class '<em>Comm Service Specifications</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Comm Service Specifications</em>'.
     * @generated
     */
    CommServiceSpecifications createCommServiceSpecifications();

    /**
     * Returns a new object of class '<em>Controlling LNode</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Controlling LNode</em>'.
     * @generated
     */
    ControllingLNode createControllingLNode();

    /**
     * Returns a new object of class '<em>DAS</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DAS</em>'.
     * @generated
     */
    DAS createDAS();

    /**
     * Returns a new object of class '<em>DOS</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DOS</em>'.
     * @generated
     */
    DOS createDOS();

    /**
     * Returns a new object of class '<em>Function Category</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function Category</em>'.
     * @generated
     */
    FunctionCategory createFunctionCategory();

    /**
     * Returns a new object of class '<em>Function Category Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function Category Ref</em>'.
     * @generated
     */
    FunctionCategoryRef createFunctionCategoryRef();

    /**
     * Returns a new object of class '<em>Function Cat Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function Cat Ref</em>'.
     * @generated
     */
    FunctionCatRef createFunctionCatRef();

    /**
     * Returns a new object of class '<em>Function Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function Ref</em>'.
     * @generated
     */
    FunctionRef createFunctionRef();

    /**
     * Returns a new object of class '<em>Function Role</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function Role</em>'.
     * @generated
     */
    FunctionRole createFunctionRole();

    /**
     * Returns a new object of class '<em>Function Role Content</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function Role Content</em>'.
     * @generated
     */
    FunctionRoleContent createFunctionRoleContent();

    /**
     * Returns a new object of class '<em>Function Scl Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function Scl Ref</em>'.
     * @generated
     */
    FunctionSclRef createFunctionSclRef();

    /**
     * Returns a new object of class '<em>Function Template</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function Template</em>'.
     * @generated
     */
    FunctionTemplate createFunctionTemplate();

    /**
     * Returns a new object of class '<em>Functional Sub Variant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Functional Sub Variant</em>'.
     * @generated
     */
    FunctionalSubVariant createFunctionalSubVariant();

    /**
     * Returns a new object of class '<em>Functional Variant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Functional Variant</em>'.
     * @generated
     */
    FunctionalVariant createFunctionalVariant();

    /**
     * Returns a new object of class '<em>Functional Variant Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Functional Variant Group</em>'.
     * @generated
     */
    FunctionalVariantGroup createFunctionalVariantGroup();

    /**
     * Returns a new object of class '<em>Functional Variant Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Functional Variant Ref</em>'.
     * @generated
     */
    FunctionalVariantRef createFunctionalVariantRef();

    /**
     * Returns a new object of class '<em>Goose Parameters</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Goose Parameters</em>'.
     * @generated
     */
    GooseParameters createGooseParameters();

    /**
     * Returns a new object of class '<em>Goose Parameters Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Goose Parameters Ref</em>'.
     * @generated
     */
    GooseParametersRef createGooseParametersRef();

    /**
     * Returns a new object of class '<em>Input Var</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Input Var</em>'.
     * @generated
     */
    InputVar createInputVar();

    /**
     * Returns a new object of class '<em>Input Var Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Input Var Ref</em>'.
     * @generated
     */
    InputVarRef createInputVarRef();

    /**
     * Returns a new object of class '<em>L2 Comm Parameters</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>L2 Comm Parameters</em>'.
     * @generated
     */
    L2CommParameters createL2CommParameters();

    /**
     * Returns a new object of class '<em>L3I Pv4 Comm Parameters</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>L3I Pv4 Comm Parameters</em>'.
     * @generated
     */
    L3IPv4CommParameters createL3IPv4CommParameters();

    /**
     * Returns a new object of class '<em>L3I Pv6 Comm Parameters</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>L3I Pv6 Comm Parameters</em>'.
     * @generated
     */
    L3IPv6CommParameters createL3IPv6CommParameters();

    /**
     * Returns a new object of class '<em>LNode Data Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>LNode Data Ref</em>'.
     * @generated
     */
    LNodeDataRef createLNodeDataRef();

    /**
     * Returns a new object of class '<em>LNode Input Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>LNode Input Ref</em>'.
     * @generated
     */
    LNodeInputRef createLNodeInputRef();

    /**
     * Returns a new object of class '<em>LNode Inputs</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>LNode Inputs</em>'.
     * @generated
     */
    LNodeInputs createLNodeInputs();

    /**
     * Returns a new object of class '<em>LNode Output Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>LNode Output Ref</em>'.
     * @generated
     */
    LNodeOutputRef createLNodeOutputRef();

    /**
     * Returns a new object of class '<em>LNode Outputs</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>LNode Outputs</em>'.
     * @generated
     */
    LNodeOutputs createLNodeOutputs();

    /**
     * Returns a new object of class '<em>LNode Spec Naming</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>LNode Spec Naming</em>'.
     * @generated
     */
    LNodeSpecNaming createLNodeSpecNaming();

    /**
     * Returns a new object of class '<em>Log Parameters</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Log Parameters</em>'.
     * @generated
     */
    LogParameters createLogParameters();

    /**
     * Returns a new object of class '<em>Log Parameters Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Log Parameters Ref</em>'.
     * @generated
     */
    LogParametersRef createLogParametersRef();

    /**
     * Returns a new object of class '<em>Logic Var Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Logic Var Ref</em>'.
     * @generated
     */
    LogicVarRef createLogicVarRef();

    /**
     * Returns a new object of class '<em>Output Var</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Output Var</em>'.
     * @generated
     */
    OutputVar createOutputVar();

    /**
     * Returns a new object of class '<em>Output Var Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Output Var Ref</em>'.
     * @generated
     */
    OutputVarRef createOutputVarRef();

    /**
     * Returns a new object of class '<em>Power System Relation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power System Relation</em>'.
     * @generated
     */
    PowerSystemRelation createPowerSystemRelation();

    /**
     * Returns a new object of class '<em>Power System Relation Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power System Relation Ref</em>'.
     * @generated
     */
    PowerSystemRelationRef createPowerSystemRelationRef();

    /**
     * Returns a new object of class '<em>Power System Relations</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power System Relations</em>'.
     * @generated
     */
    PowerSystemRelations createPowerSystemRelations();

    /**
     * Returns a new object of class '<em>Process Echo</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Process Echo</em>'.
     * @generated
     */
    ProcessEcho createProcessEcho();

    /**
     * Returns a new object of class '<em>Process Resource</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Process Resource</em>'.
     * @generated
     */
    ProcessResource createProcessResource();

    /**
     * Returns a new object of class '<em>Process Resource Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Process Resource Ref</em>'.
     * @generated
     */
    ProcessResourceRef createProcessResourceRef();

    /**
     * Returns a new object of class '<em>Process Resources</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Process Resources</em>'.
     * @generated
     */
    ProcessResources createProcessResources();

    /**
     * Returns a new object of class '<em>Project</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Project</em>'.
     * @generated
     */
    Project createProject();

    /**
     * Returns a new object of class '<em>Project Process Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Project Process Reference</em>'.
     * @generated
     */
    ProjectProcessReference createProjectProcessReference();

    /**
     * Returns a new object of class '<em>Report Parameters</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Report Parameters</em>'.
     * @generated
     */
    ReportParameters createReportParameters();

    /**
     * Returns a new object of class '<em>Report Parameters Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Report Parameters Ref</em>'.
     * @generated
     */
    ReportParametersRef createReportParametersRef();

    /**
     * Returns a new object of class '<em>Resource</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Resource</em>'.
     * @generated
     */
    Resource createResource();

    /**
     * Returns a new object of class '<em>SDS</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SDS</em>'.
     * @generated
     */
    SDS createSDS();

    /**
     * Returns a new object of class '<em>Service Parameters Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Parameters Ref</em>'.
     * @generated
     */
    ServiceParametersRef createServiceParametersRef();

    /**
     * Returns a new object of class '<em>Service Specifications</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Specifications</em>'.
     * @generated
     */
    ServiceSpecifications createServiceSpecifications();

    /**
     * Returns a new object of class '<em>Signal Role</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Signal Role</em>'.
     * @generated
     */
    SignalRole createSignalRole();

    /**
     * Returns a new object of class '<em>Source Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Source Ref</em>'.
     * @generated
     */
    SourceRef createSourceRef();

    /**
     * Returns a new object of class '<em>Sub Category</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sub Category</em>'.
     * @generated
     */
    SubCategory createSubCategory();

    /**
     * Returns a new object of class '<em>Sub Checkout ID</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sub Checkout ID</em>'.
     * @generated
     */
    SubCheckoutID createSubCheckoutID();

    /**
     * Returns a new object of class '<em>Sub Function Template</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sub Function Template</em>'.
     * @generated
     */
    SubFunctionTemplate createSubFunctionTemplate();

    /**
     * Returns a new object of class '<em>SMV Parameters</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SMV Parameters</em>'.
     * @generated
     */
    SMVParameters createSMVParameters();

    /**
     * Returns a new object of class '<em>SMV Parameters Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SMV Parameters Ref</em>'.
     * @generated
     */
    SMVParametersRef createSMVParametersRef();

    /**
     * Returns a new object of class '<em>Subscriber LNode</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Subscriber LNode</em>'.
     * @generated
     */
    SubscriberLNode createSubscriberLNode();

    /**
     * Returns a new object of class '<em>Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable</em>'.
     * @generated
     */
    Variable createVariable();

    /**
     * Returns a new object of class '<em>Variable Apply To</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable Apply To</em>'.
     * @generated
     */
    VariableApplyTo createVariableApplyTo();

    /**
     * Returns a new object of class '<em>Variable Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable Ref</em>'.
     * @generated
     */
    VariableRef createVariableRef();

    /**
     * Returns a new object of class '<em>Wiring Parameters</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wiring Parameters</em>'.
     * @generated
     */
    WiringParameters createWiringParameters();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    AsdPackage getAsdPackage();

} //AsdFactory
