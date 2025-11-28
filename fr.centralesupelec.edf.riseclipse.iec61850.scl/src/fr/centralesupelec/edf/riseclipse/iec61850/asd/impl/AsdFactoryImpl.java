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
package fr.centralesupelec.edf.riseclipse.iec61850.asd.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsdFactoryImpl extends EFactoryImpl implements AsdFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AsdFactory init() {
        try {
            AsdFactory theAsdFactory = ( AsdFactory ) EPackage.Registry.INSTANCE.getEFactory( AsdPackage.eNS_URI );
            if( theAsdFactory != null ) {
                return theAsdFactory;
            }
        }
        catch( Exception exception ) {
            EcorePlugin.INSTANCE.log( exception );
        }
        return new AsdFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AsdFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create( EClass eClass ) {
        switch( eClass.getClassifierID() ) {
        case AsdPackage.ALLOCATION_ROLE:
            return createAllocationRole();
        case AsdPackage.ALLOCATION_ROLE_REF:
            return createAllocationRoleRef();
        case AsdPackage.APPLICATION:
            return createApplication();
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS:
            return createAnalogueWiringParameters();
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF:
            return createAnalogueWiringParametersRef();
        case AsdPackage.APPLICATION_SCL_REF:
            return createApplicationSclRef();
        case AsdPackage.BAY_TYPE:
            return createBayType();
        case AsdPackage.BEHAVIOR_DESCRIPTION:
            return createBehaviorDescription();
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF:
            return createBehaviorDescriptionRef();
        case AsdPackage.BEHAVIOR_REFERENCE:
            return createBehaviorReference();
        case AsdPackage.BINARY_WIRING_PARAMETERS:
            return createBinaryWiringParameters();
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF:
            return createBinaryWiringParametersRef();
        case AsdPackage.CHECKOUT_ID:
            return createCheckoutID();
        case AsdPackage.CONTROL_REF:
            return createControlRef();
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS:
            return createCommServiceSpecifications();
        case AsdPackage.CONTROLLING_LNODE:
            return createControllingLNode();
        case AsdPackage.DAS:
            return createDAS();
        case AsdPackage.DOS:
            return createDOS();
        case AsdPackage.FUNCTION_CATEGORY:
            return createFunctionCategory();
        case AsdPackage.FUNCTION_CATEGORY_REF:
            return createFunctionCategoryRef();
        case AsdPackage.FUNCTION_CAT_REF:
            return createFunctionCatRef();
        case AsdPackage.FUNCTION_REF:
            return createFunctionRef();
        case AsdPackage.FUNCTION_ROLE:
            return createFunctionRole();
        case AsdPackage.FUNCTION_ROLE_CONTENT:
            return createFunctionRoleContent();
        case AsdPackage.FUNCTION_SCL_REF:
            return createFunctionSclRef();
        case AsdPackage.FUNCTION_TEMPLATE:
            return createFunctionTemplate();
        case AsdPackage.FUNCTIONAL_SUB_VARIANT:
            return createFunctionalSubVariant();
        case AsdPackage.FUNCTIONAL_VARIANT:
            return createFunctionalVariant();
        case AsdPackage.FUNCTIONAL_VARIANT_GROUP:
            return createFunctionalVariantGroup();
        case AsdPackage.FUNCTIONAL_VARIANT_REF:
            return createFunctionalVariantRef();
        case AsdPackage.GOOSE_PARAMETERS:
            return createGooseParameters();
        case AsdPackage.GOOSE_PARAMETERS_REF:
            return createGooseParametersRef();
        case AsdPackage.INPUT_VAR:
            return createInputVar();
        case AsdPackage.INPUT_VAR_REF:
            return createInputVarRef();
        case AsdPackage.L2_COMM_PARAMETERS:
            return createL2CommParameters();
        case AsdPackage.L3I_PV4_COMM_PARAMETERS:
            return createL3IPv4CommParameters();
        case AsdPackage.L3I_PV6_COMM_PARAMETERS:
            return createL3IPv6CommParameters();
        case AsdPackage.LNODE_DATA_REF:
            return createLNodeDataRef();
        case AsdPackage.LNODE_INPUT_REF:
            return createLNodeInputRef();
        case AsdPackage.LNODE_INPUTS:
            return createLNodeInputs();
        case AsdPackage.LNODE_OUTPUT_REF:
            return createLNodeOutputRef();
        case AsdPackage.LNODE_OUTPUTS:
            return createLNodeOutputs();
        case AsdPackage.LNODE_SPEC_NAMING:
            return createLNodeSpecNaming();
        case AsdPackage.LOG_PARAMETERS:
            return createLogParameters();
        case AsdPackage.LOG_PARAMETERS_REF:
            return createLogParametersRef();
        case AsdPackage.LOGIC_VAR_REF:
            return createLogicVarRef();
        case AsdPackage.OUTPUT_VAR:
            return createOutputVar();
        case AsdPackage.OUTPUT_VAR_REF:
            return createOutputVarRef();
        case AsdPackage.POWER_SYSTEM_RELATION:
            return createPowerSystemRelation();
        case AsdPackage.POWER_SYSTEM_RELATION_REF:
            return createPowerSystemRelationRef();
        case AsdPackage.POWER_SYSTEM_RELATIONS:
            return createPowerSystemRelations();
        case AsdPackage.PROCESS_ECHO:
            return createProcessEcho();
        case AsdPackage.PROCESS_RESOURCE:
            return createProcessResource();
        case AsdPackage.PROCESS_RESOURCE_REF:
            return createProcessResourceRef();
        case AsdPackage.PROCESS_RESOURCES:
            return createProcessResources();
        case AsdPackage.PROJECT:
            return createProject();
        case AsdPackage.PROJECT_PROCESS_REFERENCE:
            return createProjectProcessReference();
        case AsdPackage.REPORT_PARAMETERS:
            return createReportParameters();
        case AsdPackage.REPORT_PARAMETERS_REF:
            return createReportParametersRef();
        case AsdPackage.RESOURCE:
            return createResource();
        case AsdPackage.SDS:
            return createSDS();
        case AsdPackage.SERVICE_PARAMETERS_REF:
            return createServiceParametersRef();
        case AsdPackage.SERVICE_SPECIFICATIONS:
            return createServiceSpecifications();
        case AsdPackage.SOURCE_REF:
            return createSourceRef();
        case AsdPackage.SUB_CATEGORY:
            return createSubCategory();
        case AsdPackage.SUB_CHECKOUT_ID:
            return createSubCheckoutID();
        case AsdPackage.SUB_FUNCTION_TEMPLATE:
            return createSubFunctionTemplate();
        case AsdPackage.SMV_PARAMETERS:
            return createSMVParameters();
        case AsdPackage.SMV_PARAMETERS_REF:
            return createSMVParametersRef();
        case AsdPackage.SUBSCRIBER_LNODE:
            return createSubscriberLNode();
        case AsdPackage.VARIABLE:
            return createVariable();
        case AsdPackage.VARIABLE_APPLY_TO:
            return createVariableApplyTo();
        case AsdPackage.VARIABLE_REF:
            return createVariableRef();
        case AsdPackage.WIRING_PARAMETERS:
            return createWiringParameters();
        default:
            throw new IllegalArgumentException( "The class '" + eClass.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString( EDataType eDataType, String initialValue ) {
        switch( eDataType.getClassifierID() ) {
        case AsdPackage.CARDINALITY_ENUM:
            return createCardinalityEnumFromString( eDataType, initialValue );
        case AsdPackage.OUT_TYP_ENUM:
            return createOutTypEnumFromString( eDataType, initialValue );
        case AsdPackage.UPDATE_ENUM:
            return createUpdateEnumFromString( eDataType, initialValue );
        case AsdPackage.SPEC_SERVICE_ENUM:
            return createSpecServiceEnumFromString( eDataType, initialValue );
        default:
            throw new IllegalArgumentException(
                    "The datatype '" + eDataType.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString( EDataType eDataType, Object instanceValue ) {
        switch( eDataType.getClassifierID() ) {
        case AsdPackage.CARDINALITY_ENUM:
            return convertCardinalityEnumToString( eDataType, instanceValue );
        case AsdPackage.OUT_TYP_ENUM:
            return convertOutTypEnumToString( eDataType, instanceValue );
        case AsdPackage.UPDATE_ENUM:
            return convertUpdateEnumToString( eDataType, instanceValue );
        case AsdPackage.SPEC_SERVICE_ENUM:
            return convertSpecServiceEnumToString( eDataType, instanceValue );
        default:
            throw new IllegalArgumentException(
                    "The datatype '" + eDataType.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AllocationRole createAllocationRole() {
        AllocationRoleImpl allocationRole = new AllocationRoleImpl();
        return allocationRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AllocationRoleRef createAllocationRoleRef() {
        AllocationRoleRefImpl allocationRoleRef = new AllocationRoleRefImpl();
        return allocationRoleRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Application createApplication() {
        ApplicationImpl application = new ApplicationImpl();
        return application;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnalogueWiringParameters createAnalogueWiringParameters() {
        AnalogueWiringParametersImpl analogueWiringParameters = new AnalogueWiringParametersImpl();
        return analogueWiringParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnalogueWiringParametersRef createAnalogueWiringParametersRef() {
        AnalogueWiringParametersRefImpl analogueWiringParametersRef = new AnalogueWiringParametersRefImpl();
        return analogueWiringParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ApplicationSclRef createApplicationSclRef() {
        ApplicationSclRefImpl applicationSclRef = new ApplicationSclRefImpl();
        return applicationSclRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BayType createBayType() {
        BayTypeImpl bayType = new BayTypeImpl();
        return bayType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BehaviorDescription createBehaviorDescription() {
        BehaviorDescriptionImpl behaviorDescription = new BehaviorDescriptionImpl();
        return behaviorDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BehaviorDescriptionRef createBehaviorDescriptionRef() {
        BehaviorDescriptionRefImpl behaviorDescriptionRef = new BehaviorDescriptionRefImpl();
        return behaviorDescriptionRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BehaviorReference createBehaviorReference() {
        BehaviorReferenceImpl behaviorReference = new BehaviorReferenceImpl();
        return behaviorReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BinaryWiringParameters createBinaryWiringParameters() {
        BinaryWiringParametersImpl binaryWiringParameters = new BinaryWiringParametersImpl();
        return binaryWiringParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BinaryWiringParametersRef createBinaryWiringParametersRef() {
        BinaryWiringParametersRefImpl binaryWiringParametersRef = new BinaryWiringParametersRefImpl();
        return binaryWiringParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CheckoutID createCheckoutID() {
        CheckoutIDImpl checkoutID = new CheckoutIDImpl();
        return checkoutID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlRef createControlRef() {
        ControlRefImpl controlRef = new ControlRefImpl();
        return controlRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CommServiceSpecifications createCommServiceSpecifications() {
        CommServiceSpecificationsImpl commServiceSpecifications = new CommServiceSpecificationsImpl();
        return commServiceSpecifications;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControllingLNode createControllingLNode() {
        ControllingLNodeImpl controllingLNode = new ControllingLNodeImpl();
        return controllingLNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DAS createDAS() {
        DASImpl das = new DASImpl();
        return das;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DOS createDOS() {
        DOSImpl dos = new DOSImpl();
        return dos;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionCategory createFunctionCategory() {
        FunctionCategoryImpl functionCategory = new FunctionCategoryImpl();
        return functionCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionCategoryRef createFunctionCategoryRef() {
        FunctionCategoryRefImpl functionCategoryRef = new FunctionCategoryRefImpl();
        return functionCategoryRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionCatRef createFunctionCatRef() {
        FunctionCatRefImpl functionCatRef = new FunctionCatRefImpl();
        return functionCatRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionRef createFunctionRef() {
        FunctionRefImpl functionRef = new FunctionRefImpl();
        return functionRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionRole createFunctionRole() {
        FunctionRoleImpl functionRole = new FunctionRoleImpl();
        return functionRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionRoleContent createFunctionRoleContent() {
        FunctionRoleContentImpl functionRoleContent = new FunctionRoleContentImpl();
        return functionRoleContent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionSclRef createFunctionSclRef() {
        FunctionSclRefImpl functionSclRef = new FunctionSclRefImpl();
        return functionSclRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionTemplate createFunctionTemplate() {
        FunctionTemplateImpl functionTemplate = new FunctionTemplateImpl();
        return functionTemplate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionalSubVariant createFunctionalSubVariant() {
        FunctionalSubVariantImpl functionalSubVariant = new FunctionalSubVariantImpl();
        return functionalSubVariant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionalVariant createFunctionalVariant() {
        FunctionalVariantImpl functionalVariant = new FunctionalVariantImpl();
        return functionalVariant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionalVariantGroup createFunctionalVariantGroup() {
        FunctionalVariantGroupImpl functionalVariantGroup = new FunctionalVariantGroupImpl();
        return functionalVariantGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionalVariantRef createFunctionalVariantRef() {
        FunctionalVariantRefImpl functionalVariantRef = new FunctionalVariantRefImpl();
        return functionalVariantRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GooseParameters createGooseParameters() {
        GooseParametersImpl gooseParameters = new GooseParametersImpl();
        return gooseParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GooseParametersRef createGooseParametersRef() {
        GooseParametersRefImpl gooseParametersRef = new GooseParametersRefImpl();
        return gooseParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InputVar createInputVar() {
        InputVarImpl inputVar = new InputVarImpl();
        return inputVar;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InputVarRef createInputVarRef() {
        InputVarRefImpl inputVarRef = new InputVarRefImpl();
        return inputVarRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public L2CommParameters createL2CommParameters() {
        L2CommParametersImpl l2CommParameters = new L2CommParametersImpl();
        return l2CommParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public L3IPv4CommParameters createL3IPv4CommParameters() {
        L3IPv4CommParametersImpl l3IPv4CommParameters = new L3IPv4CommParametersImpl();
        return l3IPv4CommParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public L3IPv6CommParameters createL3IPv6CommParameters() {
        L3IPv6CommParametersImpl l3IPv6CommParameters = new L3IPv6CommParametersImpl();
        return l3IPv6CommParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNodeDataRef createLNodeDataRef() {
        LNodeDataRefImpl lNodeDataRef = new LNodeDataRefImpl();
        return lNodeDataRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNodeInputRef createLNodeInputRef() {
        LNodeInputRefImpl lNodeInputRef = new LNodeInputRefImpl();
        return lNodeInputRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNodeInputs createLNodeInputs() {
        LNodeInputsImpl lNodeInputs = new LNodeInputsImpl();
        return lNodeInputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNodeOutputRef createLNodeOutputRef() {
        LNodeOutputRefImpl lNodeOutputRef = new LNodeOutputRefImpl();
        return lNodeOutputRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNodeOutputs createLNodeOutputs() {
        LNodeOutputsImpl lNodeOutputs = new LNodeOutputsImpl();
        return lNodeOutputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNodeSpecNaming createLNodeSpecNaming() {
        LNodeSpecNamingImpl lNodeSpecNaming = new LNodeSpecNamingImpl();
        return lNodeSpecNaming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LogParameters createLogParameters() {
        LogParametersImpl logParameters = new LogParametersImpl();
        return logParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LogParametersRef createLogParametersRef() {
        LogParametersRefImpl logParametersRef = new LogParametersRefImpl();
        return logParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LogicVarRef createLogicVarRef() {
        LogicVarRefImpl logicVarRef = new LogicVarRefImpl();
        return logicVarRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OutputVar createOutputVar() {
        OutputVarImpl outputVar = new OutputVarImpl();
        return outputVar;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OutputVarRef createOutputVarRef() {
        OutputVarRefImpl outputVarRef = new OutputVarRefImpl();
        return outputVarRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemRelation createPowerSystemRelation() {
        PowerSystemRelationImpl powerSystemRelation = new PowerSystemRelationImpl();
        return powerSystemRelation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemRelationRef createPowerSystemRelationRef() {
        PowerSystemRelationRefImpl powerSystemRelationRef = new PowerSystemRelationRefImpl();
        return powerSystemRelationRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemRelations createPowerSystemRelations() {
        PowerSystemRelationsImpl powerSystemRelations = new PowerSystemRelationsImpl();
        return powerSystemRelations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProcessEcho createProcessEcho() {
        ProcessEchoImpl processEcho = new ProcessEchoImpl();
        return processEcho;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProcessResource createProcessResource() {
        ProcessResourceImpl processResource = new ProcessResourceImpl();
        return processResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProcessResourceRef createProcessResourceRef() {
        ProcessResourceRefImpl processResourceRef = new ProcessResourceRefImpl();
        return processResourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProcessResources createProcessResources() {
        ProcessResourcesImpl processResources = new ProcessResourcesImpl();
        return processResources;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Project createProject() {
        ProjectImpl project = new ProjectImpl();
        return project;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProjectProcessReference createProjectProcessReference() {
        ProjectProcessReferenceImpl projectProcessReference = new ProjectProcessReferenceImpl();
        return projectProcessReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReportParameters createReportParameters() {
        ReportParametersImpl reportParameters = new ReportParametersImpl();
        return reportParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReportParametersRef createReportParametersRef() {
        ReportParametersRefImpl reportParametersRef = new ReportParametersRefImpl();
        return reportParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Resource createResource() {
        ResourceImpl resource = new ResourceImpl();
        return resource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SDS createSDS() {
        SDSImpl sds = new SDSImpl();
        return sds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceParametersRef createServiceParametersRef() {
        ServiceParametersRefImpl serviceParametersRef = new ServiceParametersRefImpl();
        return serviceParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceSpecifications createServiceSpecifications() {
        ServiceSpecificationsImpl serviceSpecifications = new ServiceSpecificationsImpl();
        return serviceSpecifications;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SourceRef createSourceRef() {
        SourceRefImpl sourceRef = new SourceRefImpl();
        return sourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubCategory createSubCategory() {
        SubCategoryImpl subCategory = new SubCategoryImpl();
        return subCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubCheckoutID createSubCheckoutID() {
        SubCheckoutIDImpl subCheckoutID = new SubCheckoutIDImpl();
        return subCheckoutID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubFunctionTemplate createSubFunctionTemplate() {
        SubFunctionTemplateImpl subFunctionTemplate = new SubFunctionTemplateImpl();
        return subFunctionTemplate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SMVParameters createSMVParameters() {
        SMVParametersImpl smvParameters = new SMVParametersImpl();
        return smvParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SMVParametersRef createSMVParametersRef() {
        SMVParametersRefImpl smvParametersRef = new SMVParametersRefImpl();
        return smvParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubscriberLNode createSubscriberLNode() {
        SubscriberLNodeImpl subscriberLNode = new SubscriberLNodeImpl();
        return subscriberLNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Variable createVariable() {
        VariableImpl variable = new VariableImpl();
        return variable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VariableApplyTo createVariableApplyTo() {
        VariableApplyToImpl variableApplyTo = new VariableApplyToImpl();
        return variableApplyTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VariableRef createVariableRef() {
        VariableRefImpl variableRef = new VariableRefImpl();
        return variableRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WiringParameters createWiringParameters() {
        WiringParametersImpl wiringParameters = new WiringParametersImpl();
        return wiringParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CardinalityEnum createCardinalityEnumFromString( EDataType eDataType, String initialValue ) {
        CardinalityEnum result = CardinalityEnum.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCardinalityEnumToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutTypEnum createOutTypEnumFromString( EDataType eDataType, String initialValue ) {
        OutTypEnum result = OutTypEnum.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOutTypEnumToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UpdateEnum createUpdateEnumFromString( EDataType eDataType, String initialValue ) {
        UpdateEnum result = UpdateEnum.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUpdateEnumToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecServiceEnum createSpecServiceEnumFromString( EDataType eDataType, String initialValue ) {
        SpecServiceEnum result = SpecServiceEnum.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSpecServiceEnumToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsdPackage getAsdPackage() {
        return ( AsdPackage ) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static AsdPackage getPackage() {
        return AsdPackage.eINSTANCE;
    }

} //AsdFactoryImpl
