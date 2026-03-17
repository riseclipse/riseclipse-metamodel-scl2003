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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage
 * @generated
 */
public class AsdSwitch< T > extends Switch< T > {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static AsdPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AsdSwitch() {
        if( modelPackage == null ) {
            modelPackage = AsdPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor( EPackage ePackage ) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch( int classifierID, EObject theEObject ) {
        switch( classifierID ) {
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER: {
            Abstract6100LNodeContainer abstract6100LNodeContainer = ( Abstract6100LNodeContainer ) theEObject;
            T result = caseAbstract6100LNodeContainer( abstract6100LNodeContainer );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( abstract6100LNodeContainer );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( abstract6100LNodeContainer );
            }
            if( result == null ) {
                result = caseAsdObject( abstract6100LNodeContainer );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT: {
            AbstractFunctionalVariant abstractFunctionalVariant = ( AbstractFunctionalVariant ) theEObject;
            T result = caseAbstractFunctionalVariant( abstractFunctionalVariant );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( abstractFunctionalVariant );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( abstractFunctionalVariant );
            }
            if( result == null ) {
                result = caseAsdObject( abstractFunctionalVariant );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.ALLOCATION_ROLE: {
            AllocationRole allocationRole = ( AllocationRole ) theEObject;
            T result = caseAllocationRole( allocationRole );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( allocationRole );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( allocationRole );
            }
            if( result == null ) {
                result = caseAsdObject( allocationRole );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.ALLOCATION_ROLE_REF: {
            AllocationRoleRef allocationRoleRef = ( AllocationRoleRef ) theEObject;
            T result = caseAllocationRoleRef( allocationRoleRef );
            if( result == null ) {
                result = caseFunctionalVariantRefContainer( allocationRoleRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( allocationRoleRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( allocationRoleRef );
            }
            if( result == null ) {
                result = caseAsdObject( allocationRoleRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.APPLICATION: {
            Application application = ( Application ) theEObject;
            T result = caseApplication( application );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( application );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( application );
            }
            if( result == null ) {
                result = caseAsdObject( application );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS: {
            AnalogueWiringParameters analogueWiringParameters = ( AnalogueWiringParameters ) theEObject;
            T result = caseAnalogueWiringParameters( analogueWiringParameters );
            if( result == null ) {
                result = caseWiringParameters( analogueWiringParameters );
            }
            if( result == null ) {
                result = caseServiceParameters( analogueWiringParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( analogueWiringParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( analogueWiringParameters );
            }
            if( result == null ) {
                result = caseAsdObject( analogueWiringParameters );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF: {
            AnalogueWiringParametersRef analogueWiringParametersRef = ( AnalogueWiringParametersRef ) theEObject;
            T result = caseAnalogueWiringParametersRef( analogueWiringParametersRef );
            if( result == null ) {
                result = caseServiceParametersRef( analogueWiringParametersRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( analogueWiringParametersRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( analogueWiringParametersRef );
            }
            if( result == null ) {
                result = caseAsdObject( analogueWiringParametersRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.APPLICATION_SCL_REF: {
            ApplicationSclRef applicationSclRef = ( ApplicationSclRef ) theEObject;
            T result = caseApplicationSclRef( applicationSclRef );
            if( result == null ) {
                result = caseBaseExtensionElement( applicationSclRef );
            }
            if( result == null ) {
                result = caseAsdObject( applicationSclRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.ASD_OBJECT: {
            AsdObject asdObject = ( AsdObject ) theEObject;
            T result = caseAsdObject( asdObject );
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.BASE_EXTENSION_ELEMENT: {
            BaseExtensionElement baseExtensionElement = ( BaseExtensionElement ) theEObject;
            T result = caseBaseExtensionElement( baseExtensionElement );
            if( result == null ) {
                result = caseAsdObject( baseExtensionElement );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.BASE_EXTENSION_ELEMENT_WITH_DESC: {
            BaseExtensionElementWithDesc baseExtensionElementWithDesc = ( BaseExtensionElementWithDesc ) theEObject;
            T result = caseBaseExtensionElementWithDesc( baseExtensionElementWithDesc );
            if( result == null ) {
                result = caseBaseExtensionElement( baseExtensionElementWithDesc );
            }
            if( result == null ) {
                result = caseAsdObject( baseExtensionElementWithDesc );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.BAY_TYPE: {
            BayType bayType = ( BayType ) theEObject;
            T result = caseBayType( bayType );
            if( result == null ) {
                result = caseAsdObject( bayType );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.BEHAVIOR_DESCRIPTION: {
            BehaviorDescription behaviorDescription = ( BehaviorDescription ) theEObject;
            T result = caseBehaviorDescription( behaviorDescription );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( behaviorDescription );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( behaviorDescription );
            }
            if( result == null ) {
                result = caseAsdObject( behaviorDescription );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF: {
            BehaviorDescriptionRef behaviorDescriptionRef = ( BehaviorDescriptionRef ) theEObject;
            T result = caseBehaviorDescriptionRef( behaviorDescriptionRef );
            if( result == null ) {
                result = caseFunctionalVariantRefContainer( behaviorDescriptionRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( behaviorDescriptionRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( behaviorDescriptionRef );
            }
            if( result == null ) {
                result = caseAsdObject( behaviorDescriptionRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.BEHAVIOR_REFERENCE: {
            BehaviorReference behaviorReference = ( BehaviorReference ) theEObject;
            T result = caseBehaviorReference( behaviorReference );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( behaviorReference );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( behaviorReference );
            }
            if( result == null ) {
                result = caseAsdObject( behaviorReference );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.BINARY_WIRING_PARAMETERS: {
            BinaryWiringParameters binaryWiringParameters = ( BinaryWiringParameters ) theEObject;
            T result = caseBinaryWiringParameters( binaryWiringParameters );
            if( result == null ) {
                result = caseWiringParameters( binaryWiringParameters );
            }
            if( result == null ) {
                result = caseServiceParameters( binaryWiringParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( binaryWiringParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( binaryWiringParameters );
            }
            if( result == null ) {
                result = caseAsdObject( binaryWiringParameters );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF: {
            BinaryWiringParametersRef binaryWiringParametersRef = ( BinaryWiringParametersRef ) theEObject;
            T result = caseBinaryWiringParametersRef( binaryWiringParametersRef );
            if( result == null ) {
                result = caseServiceParametersRef( binaryWiringParametersRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( binaryWiringParametersRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( binaryWiringParametersRef );
            }
            if( result == null ) {
                result = caseAsdObject( binaryWiringParametersRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.CHECKOUT_ID: {
            CheckoutID checkoutID = ( CheckoutID ) theEObject;
            T result = caseCheckoutID( checkoutID );
            if( result == null ) {
                result = caseSclFileReference( checkoutID );
            }
            if( result == null ) {
                result = caseSclObject( checkoutID );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.CONTROL_REF: {
            ControlRef controlRef = ( ControlRef ) theEObject;
            T result = caseControlRef( controlRef );
            if( result == null ) {
                result = caseLinkFCDRef( controlRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( controlRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( controlRef );
            }
            if( result == null ) {
                result = caseAsdObject( controlRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.COMM_PARAMETERS: {
            CommParameters commParameters = ( CommParameters ) theEObject;
            T result = caseCommParameters( commParameters );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( commParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( commParameters );
            }
            if( result == null ) {
                result = caseAsdObject( commParameters );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS: {
            CommServiceSpecifications commServiceSpecifications = ( CommServiceSpecifications ) theEObject;
            T result = caseCommServiceSpecifications( commServiceSpecifications );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( commServiceSpecifications );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( commServiceSpecifications );
            }
            if( result == null ) {
                result = caseAsdObject( commServiceSpecifications );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.CONTROL_BLOCK_PARAMETERS: {
            ControlBlockParameters controlBlockParameters = ( ControlBlockParameters ) theEObject;
            T result = caseControlBlockParameters( controlBlockParameters );
            if( result == null ) {
                result = caseServiceParameters( controlBlockParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( controlBlockParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( controlBlockParameters );
            }
            if( result == null ) {
                result = caseAsdObject( controlBlockParameters );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.CONTROLLING_LNODE: {
            ControllingLNode controllingLNode = ( ControllingLNode ) theEObject;
            T result = caseControllingLNode( controllingLNode );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( controllingLNode );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( controllingLNode );
            }
            if( result == null ) {
                result = caseAsdObject( controllingLNode );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.DAS: {
            DAS das = ( DAS ) theEObject;
            T result = caseDAS( das );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( das );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( das );
            }
            if( result == null ) {
                result = caseAsdObject( das );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.DOS: {
            DOS dos = ( DOS ) theEObject;
            T result = caseDOS( dos );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( dos );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( dos );
            }
            if( result == null ) {
                result = caseAsdObject( dos );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.FUNCTION_CATEGORY: {
            FunctionCategory functionCategory = ( FunctionCategory ) theEObject;
            T result = caseFunctionCategory( functionCategory );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( functionCategory );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( functionCategory );
            }
            if( result == null ) {
                result = caseAsdObject( functionCategory );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.FUNCTION_CATEGORY_REF: {
            FunctionCategoryRef functionCategoryRef = ( FunctionCategoryRef ) theEObject;
            T result = caseFunctionCategoryRef( functionCategoryRef );
            if( result == null ) {
                result = caseFunctionalVariantRefContainer( functionCategoryRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( functionCategoryRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( functionCategoryRef );
            }
            if( result == null ) {
                result = caseAsdObject( functionCategoryRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.FUNCTION_CAT_REF: {
            FunctionCatRef functionCatRef = ( FunctionCatRef ) theEObject;
            T result = caseFunctionCatRef( functionCatRef );
            if( result == null ) {
                result = caseBaseExtensionElement( functionCatRef );
            }
            if( result == null ) {
                result = caseAsdObject( functionCatRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.FUNCTION_REF: {
            FunctionRef functionRef = ( FunctionRef ) theEObject;
            T result = caseFunctionRef( functionRef );
            if( result == null ) {
                result = caseFunctionalVariantRefContainer( functionRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( functionRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( functionRef );
            }
            if( result == null ) {
                result = caseAsdObject( functionRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.FUNCTION_ROLE: {
            FunctionRole functionRole = ( FunctionRole ) theEObject;
            T result = caseFunctionRole( functionRole );
            if( result == null ) {
                result = caseFunctionalVariantRefContainer( functionRole );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( functionRole );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( functionRole );
            }
            if( result == null ) {
                result = caseAsdObject( functionRole );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.FUNCTION_ROLE_CONTENT: {
            FunctionRoleContent functionRoleContent = ( FunctionRoleContent ) theEObject;
            T result = caseFunctionRoleContent( functionRoleContent );
            if( result == null ) {
                result = caseBaseExtensionElement( functionRoleContent );
            }
            if( result == null ) {
                result = caseAsdObject( functionRoleContent );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.FUNCTION_SCL_REF: {
            FunctionSclRef functionSclRef = ( FunctionSclRef ) theEObject;
            T result = caseFunctionSclRef( functionSclRef );
            if( result == null ) {
                result = caseBaseExtensionElement( functionSclRef );
            }
            if( result == null ) {
                result = caseAsdObject( functionSclRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.FUNCTION_TEMPLATE: {
            FunctionTemplate functionTemplate = ( FunctionTemplate ) theEObject;
            T result = caseFunctionTemplate( functionTemplate );
            if( result == null ) {
                result = caseAbstract6100LNodeContainer( functionTemplate );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( functionTemplate );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( functionTemplate );
            }
            if( result == null ) {
                result = caseAsdObject( functionTemplate );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.FUNCTIONAL_SUB_VARIANT: {
            FunctionalSubVariant functionalSubVariant = ( FunctionalSubVariant ) theEObject;
            T result = caseFunctionalSubVariant( functionalSubVariant );
            if( result == null ) {
                result = caseAbstractFunctionalVariant( functionalSubVariant );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( functionalSubVariant );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( functionalSubVariant );
            }
            if( result == null ) {
                result = caseAsdObject( functionalSubVariant );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.FUNCTIONAL_VARIANT: {
            FunctionalVariant functionalVariant = ( FunctionalVariant ) theEObject;
            T result = caseFunctionalVariant( functionalVariant );
            if( result == null ) {
                result = caseAbstractFunctionalVariant( functionalVariant );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( functionalVariant );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( functionalVariant );
            }
            if( result == null ) {
                result = caseAsdObject( functionalVariant );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.FUNCTIONAL_VARIANT_GROUP: {
            FunctionalVariantGroup functionalVariantGroup = ( FunctionalVariantGroup ) theEObject;
            T result = caseFunctionalVariantGroup( functionalVariantGroup );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( functionalVariantGroup );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( functionalVariantGroup );
            }
            if( result == null ) {
                result = caseAsdObject( functionalVariantGroup );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.FUNCTIONAL_VARIANT_REF: {
            FunctionalVariantRef functionalVariantRef = ( FunctionalVariantRef ) theEObject;
            T result = caseFunctionalVariantRef( functionalVariantRef );
            if( result == null ) {
                result = caseBaseExtensionElement( functionalVariantRef );
            }
            if( result == null ) {
                result = caseAsdObject( functionalVariantRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.FUNCTIONAL_VARIANT_REF_CONTAINER: {
            FunctionalVariantRefContainer functionalVariantRefContainer = ( FunctionalVariantRefContainer ) theEObject;
            T result = caseFunctionalVariantRefContainer( functionalVariantRefContainer );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( functionalVariantRefContainer );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( functionalVariantRefContainer );
            }
            if( result == null ) {
                result = caseAsdObject( functionalVariantRefContainer );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.GOOSE_PARAMETERS: {
            GooseParameters gooseParameters = ( GooseParameters ) theEObject;
            T result = caseGooseParameters( gooseParameters );
            if( result == null ) {
                result = caseControlBlockParameters( gooseParameters );
            }
            if( result == null ) {
                result = caseServiceParameters( gooseParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( gooseParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( gooseParameters );
            }
            if( result == null ) {
                result = caseAsdObject( gooseParameters );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.GOOSE_PARAMETERS_REF: {
            GooseParametersRef gooseParametersRef = ( GooseParametersRef ) theEObject;
            T result = caseGooseParametersRef( gooseParametersRef );
            if( result == null ) {
                result = caseServiceParametersRef( gooseParametersRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( gooseParametersRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( gooseParametersRef );
            }
            if( result == null ) {
                result = caseAsdObject( gooseParametersRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.INPUT_VAR: {
            InputVar inputVar = ( InputVar ) theEObject;
            T result = caseInputVar( inputVar );
            if( result == null ) {
                result = caseLogicVarRef( inputVar );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( inputVar );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( inputVar );
            }
            if( result == null ) {
                result = caseAsdObject( inputVar );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.INPUT_VAR_REF: {
            InputVarRef inputVarRef = ( InputVarRef ) theEObject;
            T result = caseInputVarRef( inputVarRef );
            if( result == null ) {
                result = caseVariableRef( inputVarRef );
            }
            if( result == null ) {
                result = caseFunctionalVariantRefContainer( inputVarRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( inputVarRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( inputVarRef );
            }
            if( result == null ) {
                result = caseAsdObject( inputVarRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.L2_COMM_PARAMETERS: {
            L2CommParameters l2CommParameters = ( L2CommParameters ) theEObject;
            T result = caseL2CommParameters( l2CommParameters );
            if( result == null ) {
                result = caseCommParameters( l2CommParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( l2CommParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( l2CommParameters );
            }
            if( result == null ) {
                result = caseAsdObject( l2CommParameters );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.L3I_PV4_COMM_PARAMETERS: {
            L3IPv4CommParameters l3IPv4CommParameters = ( L3IPv4CommParameters ) theEObject;
            T result = caseL3IPv4CommParameters( l3IPv4CommParameters );
            if( result == null ) {
                result = caseCommParameters( l3IPv4CommParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( l3IPv4CommParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( l3IPv4CommParameters );
            }
            if( result == null ) {
                result = caseAsdObject( l3IPv4CommParameters );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.L3I_PV6_COMM_PARAMETERS: {
            L3IPv6CommParameters l3IPv6CommParameters = ( L3IPv6CommParameters ) theEObject;
            T result = caseL3IPv6CommParameters( l3IPv6CommParameters );
            if( result == null ) {
                result = caseCommParameters( l3IPv6CommParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( l3IPv6CommParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( l3IPv6CommParameters );
            }
            if( result == null ) {
                result = caseAsdObject( l3IPv6CommParameters );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.LINK_FCDA_REF: {
            LinkFCDARef linkFCDARef = ( LinkFCDARef ) theEObject;
            T result = caseLinkFCDARef( linkFCDARef );
            if( result == null ) {
                result = caseLinkFCDRef( linkFCDARef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( linkFCDARef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( linkFCDARef );
            }
            if( result == null ) {
                result = caseAsdObject( linkFCDARef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.LINK_FCD_REF: {
            LinkFCDRef linkFCDRef = ( LinkFCDRef ) theEObject;
            T result = caseLinkFCDRef( linkFCDRef );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( linkFCDRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( linkFCDRef );
            }
            if( result == null ) {
                result = caseAsdObject( linkFCDRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.LNODE_DATA_REF: {
            LNodeDataRef lNodeDataRef = ( LNodeDataRef ) theEObject;
            T result = caseLNodeDataRef( lNodeDataRef );
            if( result == null ) {
                result = caseFunctionalVariantRefContainer( lNodeDataRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( lNodeDataRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( lNodeDataRef );
            }
            if( result == null ) {
                result = caseAsdObject( lNodeDataRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.LNODE_INPUT_REF: {
            LNodeInputRef lNodeInputRef = ( LNodeInputRef ) theEObject;
            T result = caseLNodeInputRef( lNodeInputRef );
            if( result == null ) {
                result = caseFunctionalVariantRefContainer( lNodeInputRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( lNodeInputRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( lNodeInputRef );
            }
            if( result == null ) {
                result = caseAsdObject( lNodeInputRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.LNODE_INPUTS: {
            LNodeInputs lNodeInputs = ( LNodeInputs ) theEObject;
            T result = caseLNodeInputs( lNodeInputs );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( lNodeInputs );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( lNodeInputs );
            }
            if( result == null ) {
                result = caseAsdObject( lNodeInputs );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.LNODE_OUTPUT_REF: {
            LNodeOutputRef lNodeOutputRef = ( LNodeOutputRef ) theEObject;
            T result = caseLNodeOutputRef( lNodeOutputRef );
            if( result == null ) {
                result = caseFunctionalVariantRefContainer( lNodeOutputRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( lNodeOutputRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( lNodeOutputRef );
            }
            if( result == null ) {
                result = caseAsdObject( lNodeOutputRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.LNODE_OUTPUTS: {
            LNodeOutputs lNodeOutputs = ( LNodeOutputs ) theEObject;
            T result = caseLNodeOutputs( lNodeOutputs );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( lNodeOutputs );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( lNodeOutputs );
            }
            if( result == null ) {
                result = caseAsdObject( lNodeOutputs );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.LNODE_SPEC_NAMING: {
            LNodeSpecNaming lNodeSpecNaming = ( LNodeSpecNaming ) theEObject;
            T result = caseLNodeSpecNaming( lNodeSpecNaming );
            if( result == null ) {
                result = caseBaseExtensionElement( lNodeSpecNaming );
            }
            if( result == null ) {
                result = caseAsdObject( lNodeSpecNaming );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.LOG_PARAMETERS: {
            LogParameters logParameters = ( LogParameters ) theEObject;
            T result = caseLogParameters( logParameters );
            if( result == null ) {
                result = caseControlBlockParameters( logParameters );
            }
            if( result == null ) {
                result = caseServiceParameters( logParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( logParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( logParameters );
            }
            if( result == null ) {
                result = caseAsdObject( logParameters );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.LOG_PARAMETERS_REF: {
            LogParametersRef logParametersRef = ( LogParametersRef ) theEObject;
            T result = caseLogParametersRef( logParametersRef );
            if( result == null ) {
                result = caseServiceParametersRef( logParametersRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( logParametersRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( logParametersRef );
            }
            if( result == null ) {
                result = caseAsdObject( logParametersRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.LOGIC_VAR_REF: {
            LogicVarRef logicVarRef = ( LogicVarRef ) theEObject;
            T result = caseLogicVarRef( logicVarRef );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( logicVarRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( logicVarRef );
            }
            if( result == null ) {
                result = caseAsdObject( logicVarRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.OUTPUT_VAR: {
            OutputVar outputVar = ( OutputVar ) theEObject;
            T result = caseOutputVar( outputVar );
            if( result == null ) {
                result = caseLogicVarRef( outputVar );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( outputVar );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( outputVar );
            }
            if( result == null ) {
                result = caseAsdObject( outputVar );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.OUTPUT_VAR_REF: {
            OutputVarRef outputVarRef = ( OutputVarRef ) theEObject;
            T result = caseOutputVarRef( outputVarRef );
            if( result == null ) {
                result = caseVariableRef( outputVarRef );
            }
            if( result == null ) {
                result = caseFunctionalVariantRefContainer( outputVarRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( outputVarRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( outputVarRef );
            }
            if( result == null ) {
                result = caseAsdObject( outputVarRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.POWER_SYSTEM_RELATION: {
            PowerSystemRelation powerSystemRelation = ( PowerSystemRelation ) theEObject;
            T result = casePowerSystemRelation( powerSystemRelation );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( powerSystemRelation );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( powerSystemRelation );
            }
            if( result == null ) {
                result = caseAsdObject( powerSystemRelation );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.POWER_SYSTEM_RELATION_REF: {
            PowerSystemRelationRef powerSystemRelationRef = ( PowerSystemRelationRef ) theEObject;
            T result = casePowerSystemRelationRef( powerSystemRelationRef );
            if( result == null ) {
                result = caseFunctionalVariantRefContainer( powerSystemRelationRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( powerSystemRelationRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( powerSystemRelationRef );
            }
            if( result == null ) {
                result = caseAsdObject( powerSystemRelationRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.POWER_SYSTEM_RELATIONS: {
            PowerSystemRelations powerSystemRelations = ( PowerSystemRelations ) theEObject;
            T result = casePowerSystemRelations( powerSystemRelations );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( powerSystemRelations );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( powerSystemRelations );
            }
            if( result == null ) {
                result = caseAsdObject( powerSystemRelations );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.PROCESS_ECHO: {
            ProcessEcho processEcho = ( ProcessEcho ) theEObject;
            T result = caseProcessEcho( processEcho );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( processEcho );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( processEcho );
            }
            if( result == null ) {
                result = caseAsdObject( processEcho );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.PROCESS_RESOURCE: {
            ProcessResource processResource = ( ProcessResource ) theEObject;
            T result = caseProcessResource( processResource );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( processResource );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( processResource );
            }
            if( result == null ) {
                result = caseAsdObject( processResource );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.PROCESS_RESOURCE_REF: {
            ProcessResourceRef processResourceRef = ( ProcessResourceRef ) theEObject;
            T result = caseProcessResourceRef( processResourceRef );
            if( result == null ) {
                result = caseFunctionalVariantRefContainer( processResourceRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( processResourceRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( processResourceRef );
            }
            if( result == null ) {
                result = caseAsdObject( processResourceRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.PROCESS_RESOURCES: {
            ProcessResources processResources = ( ProcessResources ) theEObject;
            T result = caseProcessResources( processResources );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( processResources );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( processResources );
            }
            if( result == null ) {
                result = caseAsdObject( processResources );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.PROJECT: {
            Project project = ( Project ) theEObject;
            T result = caseProject( project );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( project );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( project );
            }
            if( result == null ) {
                result = caseAsdObject( project );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.PROJECT_PROCESS_REFERENCE: {
            ProjectProcessReference projectProcessReference = ( ProjectProcessReference ) theEObject;
            T result = caseProjectProcessReference( projectProcessReference );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( projectProcessReference );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( projectProcessReference );
            }
            if( result == null ) {
                result = caseAsdObject( projectProcessReference );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.REPORT_PARAMETERS: {
            ReportParameters reportParameters = ( ReportParameters ) theEObject;
            T result = caseReportParameters( reportParameters );
            if( result == null ) {
                result = caseControlBlockParameters( reportParameters );
            }
            if( result == null ) {
                result = caseServiceParameters( reportParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( reportParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( reportParameters );
            }
            if( result == null ) {
                result = caseAsdObject( reportParameters );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.REPORT_PARAMETERS_REF: {
            ReportParametersRef reportParametersRef = ( ReportParametersRef ) theEObject;
            T result = caseReportParametersRef( reportParametersRef );
            if( result == null ) {
                result = caseServiceParametersRef( reportParametersRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( reportParametersRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( reportParametersRef );
            }
            if( result == null ) {
                result = caseAsdObject( reportParametersRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.RESOURCE: {
            Resource resource = ( Resource ) theEObject;
            T result = caseResource( resource );
            if( result == null ) {
                result = caseAsdObject( resource );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.SDS: {
            SDS sds = ( SDS ) theEObject;
            T result = caseSDS( sds );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( sds );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( sds );
            }
            if( result == null ) {
                result = caseAsdObject( sds );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.SERVICE_PARAMETERS: {
            ServiceParameters serviceParameters = ( ServiceParameters ) theEObject;
            T result = caseServiceParameters( serviceParameters );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( serviceParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( serviceParameters );
            }
            if( result == null ) {
                result = caseAsdObject( serviceParameters );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.SERVICE_PARAMETERS_REF: {
            ServiceParametersRef serviceParametersRef = ( ServiceParametersRef ) theEObject;
            T result = caseServiceParametersRef( serviceParametersRef );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( serviceParametersRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( serviceParametersRef );
            }
            if( result == null ) {
                result = caseAsdObject( serviceParametersRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.SERVICE_SPECIFICATIONS: {
            ServiceSpecifications serviceSpecifications = ( ServiceSpecifications ) theEObject;
            T result = caseServiceSpecifications( serviceSpecifications );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( serviceSpecifications );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( serviceSpecifications );
            }
            if( result == null ) {
                result = caseAsdObject( serviceSpecifications );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.SIGNAL_ROLE: {
            SignalRole signalRole = ( SignalRole ) theEObject;
            T result = caseSignalRole( signalRole );
            if( result == null ) {
                result = caseFunctionalVariantRefContainer( signalRole );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( signalRole );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( signalRole );
            }
            if( result == null ) {
                result = caseAsdObject( signalRole );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.SOURCE_REF: {
            SourceRef sourceRef = ( SourceRef ) theEObject;
            T result = caseSourceRef( sourceRef );
            if( result == null ) {
                result = caseLinkFCDARef( sourceRef );
            }
            if( result == null ) {
                result = caseLinkFCDRef( sourceRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( sourceRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( sourceRef );
            }
            if( result == null ) {
                result = caseAsdObject( sourceRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.SUB_CATEGORY: {
            SubCategory subCategory = ( SubCategory ) theEObject;
            T result = caseSubCategory( subCategory );
            if( result == null ) {
                result = caseFunctionCategory( subCategory );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( subCategory );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( subCategory );
            }
            if( result == null ) {
                result = caseAsdObject( subCategory );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.SUB_CHECKOUT_ID: {
            SubCheckoutID subCheckoutID = ( SubCheckoutID ) theEObject;
            T result = caseSubCheckoutID( subCheckoutID );
            if( result == null ) {
                result = caseCheckoutID( subCheckoutID );
            }
            if( result == null ) {
                result = caseSclFileReference( subCheckoutID );
            }
            if( result == null ) {
                result = caseSclObject( subCheckoutID );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.SUB_FUNCTION_TEMPLATE: {
            SubFunctionTemplate subFunctionTemplate = ( SubFunctionTemplate ) theEObject;
            T result = caseSubFunctionTemplate( subFunctionTemplate );
            if( result == null ) {
                result = caseAbstract6100LNodeContainer( subFunctionTemplate );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( subFunctionTemplate );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( subFunctionTemplate );
            }
            if( result == null ) {
                result = caseAsdObject( subFunctionTemplate );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.SMV_PARAMETERS: {
            SMVParameters smvParameters = ( SMVParameters ) theEObject;
            T result = caseSMVParameters( smvParameters );
            if( result == null ) {
                result = caseControlBlockParameters( smvParameters );
            }
            if( result == null ) {
                result = caseServiceParameters( smvParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( smvParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( smvParameters );
            }
            if( result == null ) {
                result = caseAsdObject( smvParameters );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.SMV_PARAMETERS_REF: {
            SMVParametersRef smvParametersRef = ( SMVParametersRef ) theEObject;
            T result = caseSMVParametersRef( smvParametersRef );
            if( result == null ) {
                result = caseServiceParametersRef( smvParametersRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( smvParametersRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( smvParametersRef );
            }
            if( result == null ) {
                result = caseAsdObject( smvParametersRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.SUBSCRIBER_LNODE: {
            SubscriberLNode subscriberLNode = ( SubscriberLNode ) theEObject;
            T result = caseSubscriberLNode( subscriberLNode );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( subscriberLNode );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( subscriberLNode );
            }
            if( result == null ) {
                result = caseAsdObject( subscriberLNode );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.VARIABLE: {
            Variable variable = ( Variable ) theEObject;
            T result = caseVariable( variable );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( variable );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( variable );
            }
            if( result == null ) {
                result = caseAsdObject( variable );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.VARIABLE_APPLY_TO: {
            VariableApplyTo variableApplyTo = ( VariableApplyTo ) theEObject;
            T result = caseVariableApplyTo( variableApplyTo );
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( variableApplyTo );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( variableApplyTo );
            }
            if( result == null ) {
                result = caseAsdObject( variableApplyTo );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.VARIABLE_REF: {
            VariableRef variableRef = ( VariableRef ) theEObject;
            T result = caseVariableRef( variableRef );
            if( result == null ) {
                result = caseFunctionalVariantRefContainer( variableRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( variableRef );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( variableRef );
            }
            if( result == null ) {
                result = caseAsdObject( variableRef );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case AsdPackage.WIRING_PARAMETERS: {
            WiringParameters wiringParameters = ( WiringParameters ) theEObject;
            T result = caseWiringParameters( wiringParameters );
            if( result == null ) {
                result = caseServiceParameters( wiringParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElementWithDesc( wiringParameters );
            }
            if( result == null ) {
                result = caseBaseExtensionElement( wiringParameters );
            }
            if( result == null ) {
                result = caseAsdObject( wiringParameters );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        default:
            return defaultCase( theEObject );
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Functional Variant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Functional Variant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractFunctionalVariant( AbstractFunctionalVariant object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Allocation Role</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Allocation Role</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAllocationRole( AllocationRole object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Allocation Role Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Allocation Role Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAllocationRoleRef( AllocationRoleRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Application</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseApplication( Application object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Analogue Wiring Parameters</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Analogue Wiring Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalogueWiringParameters( AnalogueWiringParameters object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract6100 LNode Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract6100 LNode Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstract6100LNodeContainer( Abstract6100LNodeContainer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Analogue Wiring Parameters Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Analogue Wiring Parameters Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalogueWiringParametersRef( AnalogueWiringParametersRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Application Scl Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Application Scl Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseApplicationSclRef( ApplicationSclRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAsdObject( AsdObject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Base Extension Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Extension Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBaseExtensionElement( BaseExtensionElement object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Base Extension Element With Desc</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Extension Element With Desc</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBaseExtensionElementWithDesc( BaseExtensionElementWithDesc object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bay Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bay Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBayType( BayType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Description</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorDescription( BehaviorDescription object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Description Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Description Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorDescriptionRef( BehaviorDescriptionRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorReference( BehaviorReference object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Binary Wiring Parameters</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binary Wiring Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBinaryWiringParameters( BinaryWiringParameters object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Binary Wiring Parameters Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binary Wiring Parameters Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBinaryWiringParametersRef( BinaryWiringParametersRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Checkout ID</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Checkout ID</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCheckoutID( CheckoutID object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Control Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Control Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseControlRef( ControlRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Comm Parameters</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Comm Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommParameters( CommParameters object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Comm Service Specifications</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Comm Service Specifications</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommServiceSpecifications( CommServiceSpecifications object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Control Block Parameters</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Control Block Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseControlBlockParameters( ControlBlockParameters object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Controlling LNode</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Controlling LNode</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseControllingLNode( ControllingLNode object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DAS</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DAS</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDAS( DAS object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DOS</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DOS</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDOS( DOS object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function Category</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function Category</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionCategory( FunctionCategory object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function Category Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function Category Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionCategoryRef( FunctionCategoryRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function Cat Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function Cat Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionCatRef( FunctionCatRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionRef( FunctionRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function Role</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function Role</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionRole( FunctionRole object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function Role Content</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function Role Content</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionRoleContent( FunctionRoleContent object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function Scl Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function Scl Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionSclRef( FunctionSclRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function Template</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function Template</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionTemplate( FunctionTemplate object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Functional Sub Variant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Functional Sub Variant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionalSubVariant( FunctionalSubVariant object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Functional Variant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Functional Variant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionalVariant( FunctionalVariant object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Functional Variant Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Functional Variant Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionalVariantGroup( FunctionalVariantGroup object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Functional Variant Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Functional Variant Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionalVariantRef( FunctionalVariantRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Functional Variant Ref Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Functional Variant Ref Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionalVariantRefContainer( FunctionalVariantRefContainer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Goose Parameters</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Goose Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGooseParameters( GooseParameters object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Goose Parameters Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Goose Parameters Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGooseParametersRef( GooseParametersRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input Var</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input Var</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInputVar( InputVar object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input Var Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input Var Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInputVarRef( InputVarRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>L2 Comm Parameters</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>L2 Comm Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseL2CommParameters( L2CommParameters object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>L3I Pv4 Comm Parameters</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>L3I Pv4 Comm Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseL3IPv4CommParameters( L3IPv4CommParameters object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>L3I Pv6 Comm Parameters</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>L3I Pv6 Comm Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseL3IPv6CommParameters( L3IPv6CommParameters object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Link FCDA Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Link FCDA Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinkFCDARef( LinkFCDARef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Link FCD Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Link FCD Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinkFCDRef( LinkFCDRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>LNode Data Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>LNode Data Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLNodeDataRef( LNodeDataRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>LNode Input Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>LNode Input Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLNodeInputRef( LNodeInputRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>LNode Inputs</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>LNode Inputs</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLNodeInputs( LNodeInputs object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>LNode Output Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>LNode Output Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLNodeOutputRef( LNodeOutputRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>LNode Outputs</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>LNode Outputs</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLNodeOutputs( LNodeOutputs object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>LNode Spec Naming</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>LNode Spec Naming</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLNodeSpecNaming( LNodeSpecNaming object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Log Parameters</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Log Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLogParameters( LogParameters object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Log Parameters Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Log Parameters Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLogParametersRef( LogParametersRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Logic Var Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Logic Var Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLogicVarRef( LogicVarRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Output Var</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Output Var</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputVar( OutputVar object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Output Var Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Output Var Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputVarRef( OutputVarRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power System Relation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power System Relation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerSystemRelation( PowerSystemRelation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power System Relation Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power System Relation Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerSystemRelationRef( PowerSystemRelationRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power System Relations</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power System Relations</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerSystemRelations( PowerSystemRelations object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Process Echo</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Process Echo</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessEcho( ProcessEcho object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Process Resource</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Process Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessResource( ProcessResource object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Process Resource Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Process Resource Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessResourceRef( ProcessResourceRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Process Resources</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Process Resources</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessResources( ProcessResources object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Project</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProject( Project object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Project Process Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Project Process Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProjectProcessReference( ProjectProcessReference object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Report Parameters</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Report Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReportParameters( ReportParameters object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Report Parameters Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Report Parameters Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReportParametersRef( ReportParametersRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResource( Resource object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SDS</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SDS</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSDS( SDS object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Parameters</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceParameters( ServiceParameters object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Parameters Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Parameters Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceParametersRef( ServiceParametersRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Specifications</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Specifications</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceSpecifications( ServiceSpecifications object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Signal Role</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Signal Role</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSignalRole( SignalRole object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Source Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Source Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSourceRef( SourceRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sub Category</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sub Category</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubCategory( SubCategory object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sub Checkout ID</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sub Checkout ID</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubCheckoutID( SubCheckoutID object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sub Function Template</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sub Function Template</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubFunctionTemplate( SubFunctionTemplate object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SMV Parameters</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SMV Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSMVParameters( SMVParameters object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SMV Parameters Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SMV Parameters Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSMVParametersRef( SMVParametersRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Subscriber LNode</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Subscriber LNode</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubscriberLNode( SubscriberLNode object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariable( Variable object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable Apply To</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable Apply To</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableApplyTo( VariableApplyTo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableRef( VariableRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wiring Parameters</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wiring Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWiringParameters( WiringParameters object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSclObject( SclObject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSclFileReference( SclFileReference object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase( EObject object ) {
        return null;
    }

} //AsdSwitch
