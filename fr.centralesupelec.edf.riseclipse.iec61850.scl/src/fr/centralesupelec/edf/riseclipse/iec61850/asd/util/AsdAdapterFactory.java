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
package fr.centralesupelec.edf.riseclipse.iec61850.asd.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.Application;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElement;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElementWithDesc;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BayType;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.CommParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlBlockParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionSclRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionTemplate;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalSubVariant;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRefContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVarRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputs;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputs;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDARef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVarRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelations;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResources;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.Project;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProjectProcessReference;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCategory;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCheckoutID;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.WiringParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileReference;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage
 * @generated
 */
public class AsdAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static AsdPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AsdAdapterFactory() {
        if( modelPackage == null ) {
            modelPackage = AsdPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType( Object object ) {
        if( object == modelPackage ) {
            return true;
        }
        if( object instanceof EObject ) {
            return ( ( EObject ) object ).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AsdSwitch< Adapter > modelSwitch = new AsdSwitch< >() {
        @Override
        public Adapter caseAbstract6100LNodeContainer( Abstract6100LNodeContainer object ) {
            return createAbstract6100LNodeContainerAdapter();
        }

        @Override
        public Adapter caseAbstractFunctionalVariant( AbstractFunctionalVariant object ) {
            return createAbstractFunctionalVariantAdapter();
        }

        @Override
        public Adapter caseAllocationRole( AllocationRole object ) {
            return createAllocationRoleAdapter();
        }

        @Override
        public Adapter caseAllocationRoleRef( AllocationRoleRef object ) {
            return createAllocationRoleRefAdapter();
        }

        @Override
        public Adapter caseApplication( Application object ) {
            return createApplicationAdapter();
        }

        @Override
        public Adapter caseAnalogueWiringParameters( AnalogueWiringParameters object ) {
            return createAnalogueWiringParametersAdapter();
        }

        @Override
        public Adapter caseAnalogueWiringParametersRef( AnalogueWiringParametersRef object ) {
            return createAnalogueWiringParametersRefAdapter();
        }

        @Override
        public Adapter caseApplicationSclRef( ApplicationSclRef object ) {
            return createApplicationSclRefAdapter();
        }

        @Override
        public Adapter caseAsdObject( AsdObject object ) {
            return createAsdObjectAdapter();
        }

        @Override
        public Adapter caseBaseExtensionElement( BaseExtensionElement object ) {
            return createBaseExtensionElementAdapter();
        }

        @Override
        public Adapter caseBaseExtensionElementWithDesc( BaseExtensionElementWithDesc object ) {
            return createBaseExtensionElementWithDescAdapter();
        }

        @Override
        public Adapter caseBayType( BayType object ) {
            return createBayTypeAdapter();
        }

        @Override
        public Adapter caseBehaviorDescription( BehaviorDescription object ) {
            return createBehaviorDescriptionAdapter();
        }

        @Override
        public Adapter caseBehaviorDescriptionRef( BehaviorDescriptionRef object ) {
            return createBehaviorDescriptionRefAdapter();
        }

        @Override
        public Adapter caseBehaviorReference( BehaviorReference object ) {
            return createBehaviorReferenceAdapter();
        }

        @Override
        public Adapter caseBinaryWiringParameters( BinaryWiringParameters object ) {
            return createBinaryWiringParametersAdapter();
        }

        @Override
        public Adapter caseBinaryWiringParametersRef( BinaryWiringParametersRef object ) {
            return createBinaryWiringParametersRefAdapter();
        }

        @Override
        public Adapter caseCheckoutID( CheckoutID object ) {
            return createCheckoutIDAdapter();
        }

        @Override
        public Adapter caseControlRef( ControlRef object ) {
            return createControlRefAdapter();
        }

        @Override
        public Adapter caseCommParameters( CommParameters object ) {
            return createCommParametersAdapter();
        }

        @Override
        public Adapter caseCommServiceSpecifications( CommServiceSpecifications object ) {
            return createCommServiceSpecificationsAdapter();
        }

        @Override
        public Adapter caseControlBlockParameters( ControlBlockParameters object ) {
            return createControlBlockParametersAdapter();
        }

        @Override
        public Adapter caseControllingLNode( ControllingLNode object ) {
            return createControllingLNodeAdapter();
        }

        @Override
        public Adapter caseDAS( DAS object ) {
            return createDASAdapter();
        }

        @Override
        public Adapter caseDOS( DOS object ) {
            return createDOSAdapter();
        }

        @Override
        public Adapter caseFunctionCategory( FunctionCategory object ) {
            return createFunctionCategoryAdapter();
        }

        @Override
        public Adapter caseFunctionCategoryRef( FunctionCategoryRef object ) {
            return createFunctionCategoryRefAdapter();
        }

        @Override
        public Adapter caseFunctionCatRef( FunctionCatRef object ) {
            return createFunctionCatRefAdapter();
        }

        @Override
        public Adapter caseFunctionRef( FunctionRef object ) {
            return createFunctionRefAdapter();
        }

        @Override
        public Adapter caseFunctionRole( FunctionRole object ) {
            return createFunctionRoleAdapter();
        }

        @Override
        public Adapter caseFunctionRoleContent( FunctionRoleContent object ) {
            return createFunctionRoleContentAdapter();
        }

        @Override
        public Adapter caseFunctionSclRef( FunctionSclRef object ) {
            return createFunctionSclRefAdapter();
        }

        @Override
        public Adapter caseFunctionTemplate( FunctionTemplate object ) {
            return createFunctionTemplateAdapter();
        }

        @Override
        public Adapter caseFunctionalSubVariant( FunctionalSubVariant object ) {
            return createFunctionalSubVariantAdapter();
        }

        @Override
        public Adapter caseFunctionalVariant( FunctionalVariant object ) {
            return createFunctionalVariantAdapter();
        }

        @Override
        public Adapter caseFunctionalVariantGroup( FunctionalVariantGroup object ) {
            return createFunctionalVariantGroupAdapter();
        }

        @Override
        public Adapter caseFunctionalVariantRef( FunctionalVariantRef object ) {
            return createFunctionalVariantRefAdapter();
        }

        @Override
        public Adapter caseFunctionalVariantRefContainer( FunctionalVariantRefContainer object ) {
            return createFunctionalVariantRefContainerAdapter();
        }

        @Override
        public Adapter caseGooseParameters( GooseParameters object ) {
            return createGooseParametersAdapter();
        }

        @Override
        public Adapter caseGooseParametersRef( GooseParametersRef object ) {
            return createGooseParametersRefAdapter();
        }

        @Override
        public Adapter caseInputVar( InputVar object ) {
            return createInputVarAdapter();
        }

        @Override
        public Adapter caseInputVarRef( InputVarRef object ) {
            return createInputVarRefAdapter();
        }

        @Override
        public Adapter caseL2CommParameters( L2CommParameters object ) {
            return createL2CommParametersAdapter();
        }

        @Override
        public Adapter caseL3IPv4CommParameters( L3IPv4CommParameters object ) {
            return createL3IPv4CommParametersAdapter();
        }

        @Override
        public Adapter caseL3IPv6CommParameters( L3IPv6CommParameters object ) {
            return createL3IPv6CommParametersAdapter();
        }

        @Override
        public Adapter caseLinkFCDARef( LinkFCDARef object ) {
            return createLinkFCDARefAdapter();
        }

        @Override
        public Adapter caseLinkFCDRef( LinkFCDRef object ) {
            return createLinkFCDRefAdapter();
        }

        @Override
        public Adapter caseLNodeDataRef( LNodeDataRef object ) {
            return createLNodeDataRefAdapter();
        }

        @Override
        public Adapter caseLNodeInputRef( LNodeInputRef object ) {
            return createLNodeInputRefAdapter();
        }

        @Override
        public Adapter caseLNodeInputs( LNodeInputs object ) {
            return createLNodeInputsAdapter();
        }

        @Override
        public Adapter caseLNodeOutputRef( LNodeOutputRef object ) {
            return createLNodeOutputRefAdapter();
        }

        @Override
        public Adapter caseLNodeOutputs( LNodeOutputs object ) {
            return createLNodeOutputsAdapter();
        }

        @Override
        public Adapter caseLNodeSpecNaming( LNodeSpecNaming object ) {
            return createLNodeSpecNamingAdapter();
        }

        @Override
        public Adapter caseLogParameters( LogParameters object ) {
            return createLogParametersAdapter();
        }

        @Override
        public Adapter caseLogParametersRef( LogParametersRef object ) {
            return createLogParametersRefAdapter();
        }

        @Override
        public Adapter caseLogicVarRef( LogicVarRef object ) {
            return createLogicVarRefAdapter();
        }

        @Override
        public Adapter caseOutputVar( OutputVar object ) {
            return createOutputVarAdapter();
        }

        @Override
        public Adapter caseOutputVarRef( OutputVarRef object ) {
            return createOutputVarRefAdapter();
        }

        @Override
        public Adapter casePowerSystemRelation( PowerSystemRelation object ) {
            return createPowerSystemRelationAdapter();
        }

        @Override
        public Adapter casePowerSystemRelationRef( PowerSystemRelationRef object ) {
            return createPowerSystemRelationRefAdapter();
        }

        @Override
        public Adapter casePowerSystemRelations( PowerSystemRelations object ) {
            return createPowerSystemRelationsAdapter();
        }

        @Override
        public Adapter caseProcessEcho( ProcessEcho object ) {
            return createProcessEchoAdapter();
        }

        @Override
        public Adapter caseProcessResource( ProcessResource object ) {
            return createProcessResourceAdapter();
        }

        @Override
        public Adapter caseProcessResourceRef( ProcessResourceRef object ) {
            return createProcessResourceRefAdapter();
        }

        @Override
        public Adapter caseProcessResources( ProcessResources object ) {
            return createProcessResourcesAdapter();
        }

        @Override
        public Adapter caseProject( Project object ) {
            return createProjectAdapter();
        }

        @Override
        public Adapter caseProjectProcessReference( ProjectProcessReference object ) {
            return createProjectProcessReferenceAdapter();
        }

        @Override
        public Adapter caseReportParameters( ReportParameters object ) {
            return createReportParametersAdapter();
        }

        @Override
        public Adapter caseReportParametersRef( ReportParametersRef object ) {
            return createReportParametersRefAdapter();
        }

        @Override
        public Adapter caseResource( Resource object ) {
            return createResourceAdapter();
        }

        @Override
        public Adapter caseSDS( SDS object ) {
            return createSDSAdapter();
        }

        @Override
        public Adapter caseServiceParameters( ServiceParameters object ) {
            return createServiceParametersAdapter();
        }

        @Override
        public Adapter caseServiceParametersRef( ServiceParametersRef object ) {
            return createServiceParametersRefAdapter();
        }

        @Override
        public Adapter caseServiceSpecifications( ServiceSpecifications object ) {
            return createServiceSpecificationsAdapter();
        }

        @Override
        public Adapter caseSignalRole( SignalRole object ) {
            return createSignalRoleAdapter();
        }

        @Override
        public Adapter caseSourceRef( SourceRef object ) {
            return createSourceRefAdapter();
        }

        @Override
        public Adapter caseSubCategory( SubCategory object ) {
            return createSubCategoryAdapter();
        }

        @Override
        public Adapter caseSubCheckoutID( SubCheckoutID object ) {
            return createSubCheckoutIDAdapter();
        }

        @Override
        public Adapter caseSubFunctionTemplate( SubFunctionTemplate object ) {
            return createSubFunctionTemplateAdapter();
        }

        @Override
        public Adapter caseSMVParameters( SMVParameters object ) {
            return createSMVParametersAdapter();
        }

        @Override
        public Adapter caseSMVParametersRef( SMVParametersRef object ) {
            return createSMVParametersRefAdapter();
        }

        @Override
        public Adapter caseSubscriberLNode( SubscriberLNode object ) {
            return createSubscriberLNodeAdapter();
        }

        @Override
        public Adapter caseVariable( Variable object ) {
            return createVariableAdapter();
        }

        @Override
        public Adapter caseVariableApplyTo( VariableApplyTo object ) {
            return createVariableApplyToAdapter();
        }

        @Override
        public Adapter caseVariableRef( VariableRef object ) {
            return createVariableRefAdapter();
        }

        @Override
        public Adapter caseWiringParameters( WiringParameters object ) {
            return createWiringParametersAdapter();
        }

        @Override
        public Adapter caseSclObject( SclObject object ) {
            return createSclObjectAdapter();
        }

        @Override
        public Adapter caseSclFileReference( SclFileReference object ) {
            return createSclFileReferenceAdapter();
        }

        @Override
        public Adapter defaultCase( EObject object ) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter( Notifier target ) {
        return modelSwitch.doSwitch( ( EObject ) target );
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant <em>Abstract Functional Variant</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant
     * @generated
     */
    public Adapter createAbstractFunctionalVariantAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole <em>Allocation Role</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole
     * @generated
     */
    public Adapter createAllocationRoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef <em>Allocation Role Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef
     * @generated
     */
    public Adapter createAllocationRoleRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application <em>Application</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Application
     * @generated
     */
    public Adapter createApplicationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters <em>Analogue Wiring Parameters</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters
     * @generated
     */
    public Adapter createAnalogueWiringParametersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer <em>Abstract6100 LNode Container</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer
     * @generated
     */
    public Adapter createAbstract6100LNodeContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef
     * @generated
     */
    public Adapter createAnalogueWiringParametersRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef <em>Application Scl Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef
     * @generated
     */
    public Adapter createApplicationSclRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject
     * @generated
     */
    public Adapter createAsdObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElement <em>Base Extension Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElement
     * @generated
     */
    public Adapter createBaseExtensionElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElementWithDesc <em>Base Extension Element With Desc</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElementWithDesc
     * @generated
     */
    public Adapter createBaseExtensionElementWithDescAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BayType <em>Bay Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BayType
     * @generated
     */
    public Adapter createBayTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription <em>Behavior Description</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription
     * @generated
     */
    public Adapter createBehaviorDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef <em>Behavior Description Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef
     * @generated
     */
    public Adapter createBehaviorDescriptionRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference <em>Behavior Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference
     * @generated
     */
    public Adapter createBehaviorReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters <em>Binary Wiring Parameters</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters
     * @generated
     */
    public Adapter createBinaryWiringParametersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef
     * @generated
     */
    public Adapter createBinaryWiringParametersRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID <em>Checkout ID</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID
     * @generated
     */
    public Adapter createCheckoutIDAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef <em>Control Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef
     * @generated
     */
    public Adapter createControlRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommParameters <em>Comm Parameters</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CommParameters
     * @generated
     */
    public Adapter createCommParametersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications <em>Comm Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications
     * @generated
     */
    public Adapter createCommServiceSpecificationsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlBlockParameters <em>Control Block Parameters</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlBlockParameters
     * @generated
     */
    public Adapter createControlBlockParametersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode <em>Controlling LNode</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode
     * @generated
     */
    public Adapter createControllingLNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS <em>DAS</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS
     * @generated
     */
    public Adapter createDASAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS <em>DOS</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS
     * @generated
     */
    public Adapter createDOSAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory <em>Function Category</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory
     * @generated
     */
    public Adapter createFunctionCategoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef <em>Function Category Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef
     * @generated
     */
    public Adapter createFunctionCategoryRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef <em>Function Cat Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef
     * @generated
     */
    public Adapter createFunctionCatRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef <em>Function Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef
     * @generated
     */
    public Adapter createFunctionRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole <em>Function Role</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole
     * @generated
     */
    public Adapter createFunctionRoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent <em>Function Role Content</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent
     * @generated
     */
    public Adapter createFunctionRoleContentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionSclRef <em>Function Scl Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionSclRef
     * @generated
     */
    public Adapter createFunctionSclRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionTemplate <em>Function Template</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionTemplate
     * @generated
     */
    public Adapter createFunctionTemplateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalSubVariant <em>Functional Sub Variant</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalSubVariant
     * @generated
     */
    public Adapter createFunctionalSubVariantAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant <em>Functional Variant</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant
     * @generated
     */
    public Adapter createFunctionalVariantAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup <em>Functional Variant Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup
     * @generated
     */
    public Adapter createFunctionalVariantGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef <em>Functional Variant Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef
     * @generated
     */
    public Adapter createFunctionalVariantRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRefContainer <em>Functional Variant Ref Container</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRefContainer
     * @generated
     */
    public Adapter createFunctionalVariantRefContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters <em>Goose Parameters</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters
     * @generated
     */
    public Adapter createGooseParametersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef <em>Goose Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef
     * @generated
     */
    public Adapter createGooseParametersRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar <em>Input Var</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar
     * @generated
     */
    public Adapter createInputVarAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVarRef <em>Input Var Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVarRef
     * @generated
     */
    public Adapter createInputVarRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters <em>L2 Comm Parameters</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters
     * @generated
     */
    public Adapter createL2CommParametersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters <em>L3I Pv4 Comm Parameters</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters
     * @generated
     */
    public Adapter createL3IPv4CommParametersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters <em>L3I Pv6 Comm Parameters</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters
     * @generated
     */
    public Adapter createL3IPv6CommParametersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDARef <em>Link FCDA Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDARef
     * @generated
     */
    public Adapter createLinkFCDARefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef <em>Link FCD Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef
     * @generated
     */
    public Adapter createLinkFCDRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef <em>LNode Data Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef
     * @generated
     */
    public Adapter createLNodeDataRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef <em>LNode Input Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef
     * @generated
     */
    public Adapter createLNodeInputRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputs <em>LNode Inputs</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputs
     * @generated
     */
    public Adapter createLNodeInputsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef <em>LNode Output Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef
     * @generated
     */
    public Adapter createLNodeOutputRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputs <em>LNode Outputs</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputs
     * @generated
     */
    public Adapter createLNodeOutputsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming <em>LNode Spec Naming</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming
     * @generated
     */
    public Adapter createLNodeSpecNamingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters <em>Log Parameters</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters
     * @generated
     */
    public Adapter createLogParametersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef <em>Log Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef
     * @generated
     */
    public Adapter createLogParametersRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef <em>Logic Var Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef
     * @generated
     */
    public Adapter createLogicVarRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar <em>Output Var</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar
     * @generated
     */
    public Adapter createOutputVarAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVarRef <em>Output Var Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVarRef
     * @generated
     */
    public Adapter createOutputVarRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation <em>Power System Relation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation
     * @generated
     */
    public Adapter createPowerSystemRelationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef <em>Power System Relation Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef
     * @generated
     */
    public Adapter createPowerSystemRelationRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelations <em>Power System Relations</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelations
     * @generated
     */
    public Adapter createPowerSystemRelationsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho <em>Process Echo</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho
     * @generated
     */
    public Adapter createProcessEchoAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource <em>Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource
     * @generated
     */
    public Adapter createProcessResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef <em>Process Resource Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef
     * @generated
     */
    public Adapter createProcessResourceRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResources <em>Process Resources</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResources
     * @generated
     */
    public Adapter createProcessResourcesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Project <em>Project</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Project
     * @generated
     */
    public Adapter createProjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProjectProcessReference <em>Project Process Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProjectProcessReference
     * @generated
     */
    public Adapter createProjectProcessReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters <em>Report Parameters</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters
     * @generated
     */
    public Adapter createReportParametersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef <em>Report Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef
     * @generated
     */
    public Adapter createReportParametersRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource
     * @generated
     */
    public Adapter createResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS <em>SDS</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS
     * @generated
     */
    public Adapter createSDSAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceParameters <em>Service Parameters</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceParameters
     * @generated
     */
    public Adapter createServiceParametersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceParametersRef <em>Service Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceParametersRef
     * @generated
     */
    public Adapter createServiceParametersRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications <em>Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications
     * @generated
     */
    public Adapter createServiceSpecificationsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole <em>Signal Role</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole
     * @generated
     */
    public Adapter createSignalRoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef
     * @generated
     */
    public Adapter createSourceRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCategory <em>Sub Category</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCategory
     * @generated
     */
    public Adapter createSubCategoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCheckoutID <em>Sub Checkout ID</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCheckoutID
     * @generated
     */
    public Adapter createSubCheckoutIDAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate <em>Sub Function Template</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate
     * @generated
     */
    public Adapter createSubFunctionTemplateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters <em>SMV Parameters</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters
     * @generated
     */
    public Adapter createSMVParametersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef <em>SMV Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef
     * @generated
     */
    public Adapter createSMVParametersRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode <em>Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode
     * @generated
     */
    public Adapter createSubscriberLNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable
     * @generated
     */
    public Adapter createVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo <em>Variable Apply To</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo
     * @generated
     */
    public Adapter createVariableApplyToAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef <em>Variable Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef
     * @generated
     */
    public Adapter createVariableRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.WiringParameters <em>Wiring Parameters</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.WiringParameters
     * @generated
     */
    public Adapter createWiringParametersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject
     * @generated
     */
    public Adapter createSclObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileReference <em>File Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileReference
     * @generated
     */
    public Adapter createSclFileReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //AsdAdapterFactory
