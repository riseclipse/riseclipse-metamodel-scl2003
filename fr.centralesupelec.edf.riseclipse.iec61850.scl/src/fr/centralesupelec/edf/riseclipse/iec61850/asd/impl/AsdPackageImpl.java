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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsdPackageImpl extends EPackageImpl implements AsdPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractFunctionalVariantEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass allocationRoleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass allocationRoleRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass applicationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass analogueWiringParametersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstract6100LNodeContainerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass analogueWiringParametersRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass applicationSclRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass asdObjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass baseExtensionElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass baseExtensionElementWithDescEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bayTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorDescriptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorDescriptionRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass binaryWiringParametersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass binaryWiringParametersRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass checkoutIDEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass controlRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass commParametersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass commServiceSpecificationsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass controlBlockParametersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass controllingLNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dasEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dosEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionCategoryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionCategoryRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionCatRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionRoleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionRoleContentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionSclRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionTemplateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionalSubVariantEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionalVariantEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionalVariantGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionalVariantRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionalVariantRefContainerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gooseParametersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gooseParametersRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inputVarEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inputVarRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass l2CommParametersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass l3IPv4CommParametersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass l3IPv6CommParametersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass linkFCDARefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass linkFCDRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lNodeDataRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lNodeInputRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lNodeInputsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lNodeOutputRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lNodeOutputsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lNodeSpecNamingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass logParametersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass logParametersRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass logicVarRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass outputVarEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass outputVarRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass powerSystemRelationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass powerSystemRelationRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass powerSystemRelationsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processEchoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processResourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processResourceRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processResourcesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass projectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass projectProcessReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass reportParametersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass reportParametersRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sdsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceParametersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceParametersRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceSpecificationsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sourceRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subCategoryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subCheckoutIDEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subFunctionTemplateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass smvParametersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass smvParametersRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subscriberLNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass variableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass variableApplyToEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass variableRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass wiringParametersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum cardinalityEnumEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum outTypEnumEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum updateEnumEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum specServiceEnumEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private AsdPackageImpl() {
        super( eNS_URI, AsdFactory.eINSTANCE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link AsdPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @generated
     */
    public static AsdPackage init() {
        if( isInited ) {
            return ( AsdPackage ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI );
        }

        // Obtain or create and register package
        Object registeredAsdPackage = EPackage.Registry.INSTANCE.get( eNS_URI );
        AsdPackageImpl theAsdPackage = registeredAsdPackage instanceof AsdPackageImpl
                ? ( AsdPackageImpl ) registeredAsdPackage
                : new AsdPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage( SclPackage.eNS_URI );
        SclPackageImpl theSclPackage = ( SclPackageImpl ) ( registeredPackage instanceof SclPackageImpl
                ? registeredPackage
                : SclPackage.eINSTANCE );

        // Load packages
        theSclPackage.loadPackage();

        // Fix loaded packages
        theAsdPackage.fixPackageContents();
        theSclPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theAsdPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put( AsdPackage.eNS_URI, theAsdPackage );
        return theAsdPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAbstractFunctionalVariant() {
        if( abstractFunctionalVariantEClass == null ) {
            abstractFunctionalVariantEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 1 );
        }
        return abstractFunctionalVariantEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAbstractFunctionalVariant_FunctionalSubVariant() {
        return ( EReference ) getAbstractFunctionalVariant().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAbstractFunctionalVariant_VariableRef() {
        return ( EReference ) getAbstractFunctionalVariant().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractFunctionalVariant_IsBaseline() {
        return ( EAttribute ) getAbstractFunctionalVariant().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractFunctionalVariant_Name() {
        return ( EAttribute ) getAbstractFunctionalVariant().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractFunctionalVariant_OriginUuid() {
        return ( EAttribute ) getAbstractFunctionalVariant().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractFunctionalVariant_TemplateUuid() {
        return ( EAttribute ) getAbstractFunctionalVariant().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractFunctionalVariant_Uuid() {
        return ( EAttribute ) getAbstractFunctionalVariant().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAllocationRole() {
        if( allocationRoleEClass == null ) {
            allocationRoleEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 2 );
        }
        return allocationRoleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAllocationRole_FunctionRef() {
        return ( EReference ) getAllocationRole().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAllocationRole_Name() {
        return ( EAttribute ) getAllocationRole().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAllocationRole_OriginUuid() {
        return ( EAttribute ) getAllocationRole().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAllocationRole_TemplateUuid() {
        return ( EAttribute ) getAllocationRole().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAllocationRole_Uuid() {
        return ( EAttribute ) getAllocationRole().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAllocationRole_ReferredByAllocationRoleRef() {
        return ( EReference ) getAllocationRole().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAllocationRoleRef() {
        if( allocationRoleRefEClass == null ) {
            allocationRoleRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 3 );
        }
        return allocationRoleRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAllocationRoleRef_AllocationRole() {
        return ( EAttribute ) getAllocationRoleRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAllocationRoleRef_AllocationRoleUuid() {
        return ( EAttribute ) getAllocationRoleRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAllocationRoleRef_ParentApplication() {
        return ( EReference ) getAllocationRoleRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAllocationRoleRef_RefersToAllocationRole() {
        return ( EReference ) getAllocationRoleRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getApplication() {
        if( applicationEClass == null ) {
            applicationEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 4 );
        }
        return applicationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplication_FunctionRole() {
        return ( EReference ) getApplication().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplication_FunctionalVariant() {
        return ( EReference ) getApplication().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplication_FunctionalVariantGroup() {
        return ( EReference ) getApplication().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplication_AllocationRoleRef() {
        return ( EReference ) getApplication().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplication_ApplicationSclRef() {
        return ( EReference ) getApplication().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getApplication_Name() {
        return ( EAttribute ) getApplication().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getApplication_OriginUuid() {
        return ( EAttribute ) getApplication().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getApplication_TemplateUuid() {
        return ( EAttribute ) getApplication().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getApplication_Type() {
        return ( EAttribute ) getApplication().getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getApplication_Uuid() {
        return ( EAttribute ) getApplication().getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnalogueWiringParameters() {
        if( analogueWiringParametersEClass == null ) {
            analogueWiringParametersEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 5 );
        }
        return analogueWiringParametersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAnalogueWiringParameters_DsgInp() {
        return ( EAttribute ) getAnalogueWiringParameters().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAnalogueWiringParameters_FctInp() {
        return ( EAttribute ) getAnalogueWiringParameters().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnalogueWiringParameters_ParentServiceSpecifications() {
        return ( EReference ) getAnalogueWiringParameters().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnalogueWiringParameters_ReferredByAnalogueWiringParametersRef() {
        return ( EReference ) getAnalogueWiringParameters().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAbstract6100LNodeContainer() {
        if( abstract6100LNodeContainerEClass == null ) {
            abstract6100LNodeContainerEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 0 );
        }
        return abstract6100LNodeContainerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAbstract6100LNodeContainer_LNode() {
        return ( EReference ) getAbstract6100LNodeContainer().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstract6100LNodeContainer_Name() {
        return ( EAttribute ) getAbstract6100LNodeContainer().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstract6100LNodeContainer_OriginUuid() {
        return ( EAttribute ) getAbstract6100LNodeContainer().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstract6100LNodeContainer_TemplateUuid() {
        return ( EAttribute ) getAbstract6100LNodeContainer().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstract6100LNodeContainer_Uuid() {
        return ( EAttribute ) getAbstract6100LNodeContainer().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnalogueWiringParametersRef() {
        if( analogueWiringParametersRefEClass == null ) {
            analogueWiringParametersRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 6 );
        }
        return analogueWiringParametersRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnalogueWiringParametersRef_ParentControlRef() {
        return ( EReference ) getAnalogueWiringParametersRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnalogueWiringParametersRef_ParentControllingLNode() {
        return ( EReference ) getAnalogueWiringParametersRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnalogueWiringParametersRef_ParentSourceRef() {
        return ( EReference ) getAnalogueWiringParametersRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnalogueWiringParametersRef_RefersToAnalogueWiringParameters() {
        return ( EReference ) getAnalogueWiringParametersRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getApplicationSclRef() {
        if( applicationSclRefEClass == null ) {
            applicationSclRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 7 );
        }
        return applicationSclRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplicationSclRef_SclFileReference() {
        return ( EReference ) getApplicationSclRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplicationSclRef_ParentApplication() {
        return ( EReference ) getApplicationSclRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAsdObject() {
        if( asdObjectEClass == null ) {
            asdObjectEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI ).getEClassifiers()
                    .get( 8 );
        }
        return asdObjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAsdObject_Filename() {
        return ( EAttribute ) getAsdObject().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAsdObject_LineNumber() {
        return ( EAttribute ) getAsdObject().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAsdObject_ExplicitLinksBuilt() {
        return ( EAttribute ) getAsdObject().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAsdObject_ParentPrivate() {
        return ( EReference ) getAsdObject().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAsdObject__BuildExplicitLinks__IRiseClipseConsole_Boolean() {
        return getAsdObject().getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBaseExtensionElement() {
        if( baseExtensionElementEClass == null ) {
            baseExtensionElementEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 9 );
        }
        return baseExtensionElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBaseExtensionElement_Text() {
        return ( EReference ) getBaseExtensionElement().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBaseExtensionElementWithDesc() {
        if( baseExtensionElementWithDescEClass == null ) {
            baseExtensionElementWithDescEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 10 );
        }
        return baseExtensionElementWithDescEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBaseExtensionElementWithDesc_Desc() {
        return ( EAttribute ) getBaseExtensionElementWithDesc().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBayType() {
        if( bayTypeEClass == null ) {
            bayTypeEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI ).getEClassifiers()
                    .get( 11 );
        }
        return bayTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBayType_Value() {
        return ( EAttribute ) getBayType().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBehaviorDescription() {
        if( behaviorDescriptionEClass == null ) {
            behaviorDescriptionEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 12 );
        }
        return behaviorDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBehaviorDescription_InputVar() {
        return ( EReference ) getBehaviorDescription().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBehaviorDescription_OutputVar() {
        return ( EReference ) getBehaviorDescription().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBehaviorDescription_BehaviorReference() {
        return ( EReference ) getBehaviorDescription().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBehaviorDescription_FileReference() {
        return ( EAttribute ) getBehaviorDescription().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBehaviorDescription_Format() {
        return ( EAttribute ) getBehaviorDescription().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBehaviorDescription_IsSimulation() {
        return ( EAttribute ) getBehaviorDescription().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBehaviorDescription_IsSpecification() {
        return ( EAttribute ) getBehaviorDescription().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBehaviorDescription_Name() {
        return ( EAttribute ) getBehaviorDescription().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBehaviorDescription_OriginUuid() {
        return ( EAttribute ) getBehaviorDescription().getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBehaviorDescription_TemplateUuid() {
        return ( EAttribute ) getBehaviorDescription().getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBehaviorDescription_Uuid() {
        return ( EAttribute ) getBehaviorDescription().getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBehaviorDescription_ReferredByBehaviorDescriptionRef() {
        return ( EReference ) getBehaviorDescription().getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBehaviorDescriptionRef() {
        if( behaviorDescriptionRefEClass == null ) {
            behaviorDescriptionRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 13 );
        }
        return behaviorDescriptionRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBehaviorDescriptionRef_InputVarRef() {
        return ( EReference ) getBehaviorDescriptionRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBehaviorDescriptionRef_OutputVarRef() {
        return ( EReference ) getBehaviorDescriptionRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBehaviorDescriptionRef_BehaviorDescription() {
        return ( EAttribute ) getBehaviorDescriptionRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBehaviorDescriptionRef_BehaviorDescriptionUuid() {
        return ( EAttribute ) getBehaviorDescriptionRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBehaviorDescriptionRef_ParentFunctionRoleContent() {
        return ( EReference ) getBehaviorDescriptionRef().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBehaviorDescriptionRef_RefersToBehaviorDescription() {
        return ( EReference ) getBehaviorDescriptionRef().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBehaviorReference() {
        if( behaviorReferenceEClass == null ) {
            behaviorReferenceEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 14 );
        }
        return behaviorReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBehaviorReference_BehaviorReference() {
        return ( EAttribute ) getBehaviorReference().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBehaviorReference_BehaviorUuid() {
        return ( EAttribute ) getBehaviorReference().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBehaviorReference_ParentBehaviorDescription() {
        return ( EReference ) getBehaviorReference().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBinaryWiringParameters() {
        if( binaryWiringParametersEClass == null ) {
            binaryWiringParametersEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 15 );
        }
        return binaryWiringParametersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBinaryWiringParameters_DebTm() {
        return ( EAttribute ) getBinaryWiringParameters().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBinaryWiringParameters_FastOutput() {
        return ( EAttribute ) getBinaryWiringParameters().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBinaryWiringParameters_OutNam() {
        return ( EAttribute ) getBinaryWiringParameters().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBinaryWiringParameters_OutOffDl() {
        return ( EAttribute ) getBinaryWiringParameters().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBinaryWiringParameters_OutOnDl() {
        return ( EAttribute ) getBinaryWiringParameters().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBinaryWiringParameters_OutRef() {
        return ( EAttribute ) getBinaryWiringParameters().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBinaryWiringParameters_OutTyp() {
        return ( EAttribute ) getBinaryWiringParameters().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBinaryWiringParameters_VInOff() {
        return ( EAttribute ) getBinaryWiringParameters().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBinaryWiringParameters_VInOn() {
        return ( EAttribute ) getBinaryWiringParameters().getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBinaryWiringParameters_ParentServiceSpecifications() {
        return ( EReference ) getBinaryWiringParameters().getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBinaryWiringParameters_ReferredByBinaryWiringParametersRef() {
        return ( EReference ) getBinaryWiringParameters().getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBinaryWiringParametersRef() {
        if( binaryWiringParametersRefEClass == null ) {
            binaryWiringParametersRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 16 );
        }
        return binaryWiringParametersRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBinaryWiringParametersRef_ParentControlRef() {
        return ( EReference ) getBinaryWiringParametersRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBinaryWiringParametersRef_ParentControllingLNode() {
        return ( EReference ) getBinaryWiringParametersRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBinaryWiringParametersRef_ParentSourceRef() {
        return ( EReference ) getBinaryWiringParametersRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBinaryWiringParametersRef_ParentSubscriberLNode() {
        return ( EReference ) getBinaryWiringParametersRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBinaryWiringParametersRef_RefersToBinaryWiringParameters() {
        return ( EReference ) getBinaryWiringParametersRef().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCheckoutID() {
        if( checkoutIDEClass == null ) {
            checkoutIDEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI ).getEClassifiers()
                    .get( 17 );
        }
        return checkoutIDEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCheckoutID_SubCheckoutID() {
        return ( EReference ) getCheckoutID().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCheckoutID_EngRight() {
        return ( EAttribute ) getCheckoutID().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCheckoutID_HeaderId() {
        return ( EAttribute ) getCheckoutID().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getControlRef() {
        if( controlRefEClass == null ) {
            controlRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI ).getEClassifiers()
                    .get( 18 );
        }
        return controlRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControlRef_BinaryWiringParametersRef() {
        return ( EReference ) getControlRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControlRef_AnalogueWiringParametersRef() {
        return ( EReference ) getControlRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControlRef_Controlled() {
        return ( EAttribute ) getControlRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControlRef_ControlledDoName() {
        return ( EAttribute ) getControlRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControlRef_ControlledLNodeUuid() {
        return ( EAttribute ) getControlRef().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControlRef_ExtCtrlAddr() {
        return ( EAttribute ) getControlRef().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControlRef_ExtCtrlUuid() {
        return ( EAttribute ) getControlRef().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControlRef_Output() {
        return ( EAttribute ) getControlRef().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControlRef_OutputInst() {
        return ( EAttribute ) getControlRef().getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControlRef_ParentLNodeOutputs() {
        return ( EReference ) getControlRef().getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControlRef_ReferredByLNodeOutputRef() {
        return ( EReference ) getControlRef().getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControlRef_RefersToControllingLNode() {
        return ( EReference ) getControlRef().getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControlRef_RefersToProcessResource() {
        return ( EReference ) getControlRef().getEStructuralFeatures().get( 12 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControlRef_ReferredByOutputVar() {
        return ( EReference ) getControlRef().getEStructuralFeatures().get( 13 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControlRef_RefersToLNode() {
        return ( EReference ) getControlRef().getEStructuralFeatures().get( 14 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCommParameters() {
        if( commParametersEClass == null ) {
            commParametersEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 19 );
        }
        return commParametersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCommParameters_AppId() {
        return ( EAttribute ) getCommParameters().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCommParameters_VlanId() {
        return ( EAttribute ) getCommParameters().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCommParameters_VlanPriority() {
        return ( EAttribute ) getCommParameters().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCommServiceSpecifications() {
        if( commServiceSpecificationsEClass == null ) {
            commServiceSpecificationsEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 20 );
        }
        return commServiceSpecificationsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCommServiceSpecifications_GooseParameters() {
        return ( EReference ) getCommServiceSpecifications().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCommServiceSpecifications_SMVParameters() {
        return ( EReference ) getCommServiceSpecifications().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCommServiceSpecifications_ReportParameters() {
        return ( EReference ) getCommServiceSpecifications().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getControlBlockParameters() {
        if( controlBlockParametersEClass == null ) {
            controlBlockParametersEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 21 );
        }
        return controlBlockParametersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControlBlockParameters_CbName() {
        return ( EAttribute ) getControlBlockParameters().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControlBlockParameters_DsName() {
        return ( EAttribute ) getControlBlockParameters().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getControllingLNode() {
        if( controllingLNodeEClass == null ) {
            controllingLNodeEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 22 );
        }
        return controllingLNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControllingLNode_BinaryWiringParametersRef() {
        return ( EReference ) getControllingLNode().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControllingLNode_AnalogueWiringParametersRef() {
        return ( EReference ) getControllingLNode().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControllingLNode_OutputName() {
        return ( EAttribute ) getControllingLNode().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControllingLNode_PLN() {
        return ( EAttribute ) getControllingLNode().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControllingLNode_ResourceName() {
        return ( EAttribute ) getControllingLNode().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControllingLNode_ResourceUuid() {
        return ( EAttribute ) getControllingLNode().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControllingLNode_ParentDAS() {
        return ( EReference ) getControllingLNode().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControllingLNode_ParentDOS() {
        return ( EReference ) getControllingLNode().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControllingLNode_ParentSDS() {
        return ( EReference ) getControllingLNode().getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControllingLNode_RefersToProcessResource() {
        return ( EReference ) getControllingLNode().getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControllingLNode_ReferredByControlRef() {
        return ( EReference ) getControllingLNode().getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDAS() {
        if( dasEClass == null ) {
            dasEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI ).getEClassifiers()
                    .get( 23 );
        }
        return dasEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDAS_SubscriberLNode() {
        return ( EReference ) getDAS().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDAS_ControllingLNode() {
        return ( EReference ) getDAS().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDAS_ProcessEcho() {
        return ( EReference ) getDAS().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDAS_LogParametersRef() {
        return ( EReference ) getDAS().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDAS_Val() {
        return ( EReference ) getDAS().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDAS_Labels() {
        return ( EReference ) getDAS().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDAS_Ix() {
        return ( EAttribute ) getDAS().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDAS_MappedDaName() {
        return ( EAttribute ) getDAS().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDAS_MappedLnUuid() {
        return ( EAttribute ) getDAS().getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDAS_Name() {
        return ( EAttribute ) getDAS().getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDAS_ValImport() {
        return ( EAttribute ) getDAS().getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDAS_ValKind() {
        return ( EAttribute ) getDAS().getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDAS_ParentDOS() {
        return ( EReference ) getDAS().getEStructuralFeatures().get( 12 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDAS_ParentSDS() {
        return ( EReference ) getDAS().getEStructuralFeatures().get( 13 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDAS_RefersToAnyLN() {
        return ( EReference ) getDAS().getEStructuralFeatures().get( 14 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDOS() {
        if( dosEClass == null ) {
            dosEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI ).getEClassifiers()
                    .get( 24 );
        }
        return dosEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDOS_SDS() {
        return ( EReference ) getDOS().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDOS_DAS() {
        return ( EReference ) getDOS().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDOS_SubscriberLNode() {
        return ( EReference ) getDOS().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDOS_ControllingLNode() {
        return ( EReference ) getDOS().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDOS_ProcessEcho() {
        return ( EReference ) getDOS().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDOS_LogParametersRef() {
        return ( EReference ) getDOS().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDOS_Labels() {
        return ( EReference ) getDOS().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDOS_MappedDoName() {
        return ( EAttribute ) getDOS().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDOS_MappedLnUuid() {
        return ( EAttribute ) getDOS().getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDOS_Name() {
        return ( EAttribute ) getDOS().getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDOS_RefersToAnyLN() {
        return ( EReference ) getDOS().getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFunctionCategory() {
        if( functionCategoryEClass == null ) {
            functionCategoryEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 25 );
        }
        return functionCategoryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionCategory_SubCategory() {
        return ( EReference ) getFunctionCategory().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionCategory_FunctionCatRef() {
        return ( EReference ) getFunctionCategory().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionCategory_Name() {
        return ( EAttribute ) getFunctionCategory().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionCategory_OriginUuid() {
        return ( EAttribute ) getFunctionCategory().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionCategory_TemplateUuid() {
        return ( EAttribute ) getFunctionCategory().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionCategory_Uuid() {
        return ( EAttribute ) getFunctionCategory().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionCategory_ReferredByFunctionCategoryRef() {
        return ( EReference ) getFunctionCategory().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFunctionCategoryRef() {
        if( functionCategoryRefEClass == null ) {
            functionCategoryRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 26 );
        }
        return functionCategoryRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionCategoryRef_FunctionCategory() {
        return ( EAttribute ) getFunctionCategoryRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionCategoryRef_FunctionCategoryUuid() {
        return ( EAttribute ) getFunctionCategoryRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionCategoryRef_ParentFunctionRoleContent() {
        return ( EReference ) getFunctionCategoryRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionCategoryRef_RefersToFunctionCategory() {
        return ( EReference ) getFunctionCategoryRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFunctionCatRef() {
        if( functionCatRefEClass == null ) {
            functionCatRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 27 );
        }
        return functionCatRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionCatRef_Function() {
        return ( EAttribute ) getFunctionCatRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionCatRef_FunctionUuid() {
        return ( EAttribute ) getFunctionCatRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionCatRef_ParentFunctionCategory() {
        return ( EReference ) getFunctionCatRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionCatRef_RefersToFunction() {
        return ( EReference ) getFunctionCatRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFunctionRef() {
        if( functionRefEClass == null ) {
            functionRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 28 );
        }
        return functionRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionRef_SignalRole() {
        return ( EReference ) getFunctionRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionRef_Function() {
        return ( EAttribute ) getFunctionRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionRef_FunctionUuid() {
        return ( EAttribute ) getFunctionRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionRef_ParentAllocationRole() {
        return ( EReference ) getFunctionRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionRef_ParentFunctionRoleContent() {
        return ( EReference ) getFunctionRef().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionRef_RefersToFunction() {
        return ( EReference ) getFunctionRef().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFunctionRole() {
        if( functionRoleEClass == null ) {
            functionRoleEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 29 );
        }
        return functionRoleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionRole_FunctionRoleContent() {
        return ( EReference ) getFunctionRole().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionRole_Cardinality() {
        return ( EAttribute ) getFunctionRole().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionRole_Max() {
        return ( EAttribute ) getFunctionRole().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionRole_Name() {
        return ( EAttribute ) getFunctionRole().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionRole_OriginUuid() {
        return ( EAttribute ) getFunctionRole().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionRole_Selector() {
        return ( EAttribute ) getFunctionRole().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionRole_TemplateUuid() {
        return ( EAttribute ) getFunctionRole().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionRole_Type() {
        return ( EAttribute ) getFunctionRole().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionRole_Uuid() {
        return ( EAttribute ) getFunctionRole().getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionRole_ParentApplication() {
        return ( EReference ) getFunctionRole().getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFunctionRoleContent() {
        if( functionRoleContentEClass == null ) {
            functionRoleContentEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 30 );
        }
        return functionRoleContentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionRoleContent_FunctionRef() {
        return ( EReference ) getFunctionRoleContent().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionRoleContent_BehaviorDescriptionRef() {
        return ( EReference ) getFunctionRoleContent().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionRoleContent_ProcessResourceRef() {
        return ( EReference ) getFunctionRoleContent().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionRoleContent_VariableRef() {
        return ( EReference ) getFunctionRoleContent().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionRoleContent_FunctionCategoryRef() {
        return ( EReference ) getFunctionRoleContent().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionRoleContent_PowerSystemRelationRef() {
        return ( EReference ) getFunctionRoleContent().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionRoleContent_RoleInst() {
        return ( EAttribute ) getFunctionRoleContent().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionRoleContent_ParentFunctionRole() {
        return ( EReference ) getFunctionRoleContent().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFunctionSclRef() {
        if( functionSclRefEClass == null ) {
            functionSclRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 31 );
        }
        return functionSclRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionSclRef_SclFileReference() {
        return ( EReference ) getFunctionSclRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFunctionTemplate() {
        if( functionTemplateEClass == null ) {
            functionTemplateEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 32 );
        }
        return functionTemplateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionTemplate_SubFunctionTemplate() {
        return ( EReference ) getFunctionTemplate().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionTemplate_GeneralEquipment() {
        return ( EReference ) getFunctionTemplate().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionTemplate_ConductingEquipment() {
        return ( EReference ) getFunctionTemplate().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionTemplate_Type() {
        return ( EAttribute ) getFunctionTemplate().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFunctionalSubVariant() {
        if( functionalSubVariantEClass == null ) {
            functionalSubVariantEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 33 );
        }
        return functionalSubVariantEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionalSubVariant_ParentAbstractFunctionalVariant() {
        return ( EReference ) getFunctionalSubVariant().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFunctionalVariant() {
        if( functionalVariantEClass == null ) {
            functionalVariantEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 34 );
        }
        return functionalVariantEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionalVariant_ParentApplication() {
        return ( EReference ) getFunctionalVariant().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionalVariant_ParentFunctionalVariantGroup() {
        return ( EReference ) getFunctionalVariant().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionalVariant_ReferredByFunctionalVariantRef() {
        return ( EReference ) getFunctionalVariant().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFunctionalVariantGroup() {
        if( functionalVariantGroupEClass == null ) {
            functionalVariantGroupEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 35 );
        }
        return functionalVariantGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionalVariantGroup_FunctionalVariant() {
        return ( EReference ) getFunctionalVariantGroup().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionalVariantGroup_Name() {
        return ( EAttribute ) getFunctionalVariantGroup().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionalVariantGroup_OriginUuid() {
        return ( EAttribute ) getFunctionalVariantGroup().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionalVariantGroup_TemplateUuid() {
        return ( EAttribute ) getFunctionalVariantGroup().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionalVariantGroup_Uuid() {
        return ( EAttribute ) getFunctionalVariantGroup().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionalVariantGroup_ParentApplication() {
        return ( EReference ) getFunctionalVariantGroup().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFunctionalVariantRef() {
        if( functionalVariantRefEClass == null ) {
            functionalVariantRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 36 );
        }
        return functionalVariantRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionalVariantRef_FunctionalVariant() {
        return ( EAttribute ) getFunctionalVariantRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionalVariantRef_FunctionalVariantUuid() {
        return ( EAttribute ) getFunctionalVariantRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionalVariantRef_Update() {
        return ( EAttribute ) getFunctionalVariantRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionalVariantRef_ParentFunctionalVariantRefContainer() {
        return ( EReference ) getFunctionalVariantRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionalVariantRef_RefersToFunctionalVariant() {
        return ( EReference ) getFunctionalVariantRef().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFunctionalVariantRefContainer() {
        if( functionalVariantRefContainerEClass == null ) {
            functionalVariantRefContainerEClass = ( EClass ) EPackage.Registry.INSTANCE
                    .getEPackage( AsdPackage.eNS_URI ).getEClassifiers().get( 37 );
        }
        return functionalVariantRefContainerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionalVariantRefContainer_FunctionalVariantRef() {
        return ( EReference ) getFunctionalVariantRefContainer().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGooseParameters() {
        if( gooseParametersEClass == null ) {
            gooseParametersEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 38 );
        }
        return gooseParametersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGooseParameters_L2CommParameters() {
        return ( EReference ) getGooseParameters().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGooseParameters_L3IPv4CommParameters() {
        return ( EReference ) getGooseParameters().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGooseParameters_L3IPv6CommParameters() {
        return ( EReference ) getGooseParameters().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGooseParameters_GoId() {
        return ( EAttribute ) getGooseParameters().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGooseParameters_MaxTime() {
        return ( EAttribute ) getGooseParameters().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGooseParameters_MinTime() {
        return ( EAttribute ) getGooseParameters().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGooseParameters_SecurityEnabled() {
        return ( EAttribute ) getGooseParameters().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGooseParameters_ParentCommServiceSpecifications() {
        return ( EReference ) getGooseParameters().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGooseParameters_ParentServiceSpecifications() {
        return ( EReference ) getGooseParameters().getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGooseParameters_ReferredByGooseParametersRef() {
        return ( EReference ) getGooseParameters().getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGooseParametersRef() {
        if( gooseParametersRefEClass == null ) {
            gooseParametersRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 39 );
        }
        return gooseParametersRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGooseParametersRef_ParentSubscriberLNode() {
        return ( EReference ) getGooseParametersRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGooseParametersRef_ParentSourceRef() {
        return ( EReference ) getGooseParametersRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGooseParametersRef_RefersToGooseParameters() {
        return ( EReference ) getGooseParametersRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getInputVar() {
        if( inputVarEClass == null ) {
            inputVarEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI ).getEClassifiers()
                    .get( 40 );
        }
        return inputVarEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getInputVar_InputName() {
        return ( EAttribute ) getInputVar().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getInputVar_InputUuid() {
        return ( EAttribute ) getInputVar().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getInputVar_RefersToSourceRef() {
        return ( EReference ) getInputVar().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getInputVar_ParentBehaviorDescription() {
        return ( EReference ) getInputVar().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getInputVarRef() {
        if( inputVarRefEClass == null ) {
            inputVarRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 41 );
        }
        return inputVarRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getInputVarRef_ParentBehaviorDescriptionRef() {
        return ( EReference ) getInputVarRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getL2CommParameters() {
        if( l2CommParametersEClass == null ) {
            l2CommParametersEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 42 );
        }
        return l2CommParametersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getL2CommParameters_MacAddr() {
        return ( EAttribute ) getL2CommParameters().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getL2CommParameters_ParentGooseParameters() {
        return ( EReference ) getL2CommParameters().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getL2CommParameters_ParentSMVParameters() {
        return ( EReference ) getL2CommParameters().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getL3IPv4CommParameters() {
        if( l3IPv4CommParametersEClass == null ) {
            l3IPv4CommParametersEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 43 );
        }
        return l3IPv4CommParametersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getL3IPv4CommParameters_IPv4() {
        return ( EAttribute ) getL3IPv4CommParameters().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getL3IPv4CommParameters_IPv4IGMPv3Src() {
        return ( EAttribute ) getL3IPv4CommParameters().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getL3IPv4CommParameters_ParentGooseParameters() {
        return ( EReference ) getL3IPv4CommParameters().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getL3IPv4CommParameters_ParentSMVParameters() {
        return ( EReference ) getL3IPv4CommParameters().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getL3IPv6CommParameters() {
        if( l3IPv6CommParametersEClass == null ) {
            l3IPv6CommParametersEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 44 );
        }
        return l3IPv6CommParametersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getL3IPv6CommParameters_IPv6() {
        return ( EAttribute ) getL3IPv6CommParameters().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getL3IPv6CommParameters_IPv6IGMPv3Src() {
        return ( EAttribute ) getL3IPv6CommParameters().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getL3IPv6CommParameters_ParentGooseParameters() {
        return ( EReference ) getL3IPv6CommParameters().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getL3IPv6CommParameters_ParentSMVParameters() {
        return ( EReference ) getL3IPv6CommParameters().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLinkFCDARef() {
        if( linkFCDARefEClass == null ) {
            linkFCDARefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 45 );
        }
        return linkFCDARefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLinkFCDARef_PDA() {
        return ( EAttribute ) getLinkFCDARef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLinkFCDRef() {
        if( linkFCDRefEClass == null ) {
            linkFCDRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI ).getEClassifiers()
                    .get( 46 );
        }
        return linkFCDRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLinkFCDRef_OriginUuid() {
        return ( EAttribute ) getLinkFCDRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLinkFCDRef_PDO() {
        return ( EAttribute ) getLinkFCDRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLinkFCDRef_PLN() {
        return ( EAttribute ) getLinkFCDRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLinkFCDRef_ResourceName() {
        return ( EAttribute ) getLinkFCDRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLinkFCDRef_ResourceUuid() {
        return ( EAttribute ) getLinkFCDRef().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLinkFCDRef_TemplateUuid() {
        return ( EAttribute ) getLinkFCDRef().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLinkFCDRef_Uuid() {
        return ( EAttribute ) getLinkFCDRef().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLNodeDataRef() {
        if( lNodeDataRefEClass == null ) {
            lNodeDataRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 47 );
        }
        return lNodeDataRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNodeDataRef_DaName() {
        return ( EAttribute ) getLNodeDataRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNodeDataRef_Data() {
        return ( EAttribute ) getLNodeDataRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNodeDataRef_DoName() {
        return ( EAttribute ) getLNodeDataRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNodeDataRef_LnodeUuid() {
        return ( EAttribute ) getLNodeDataRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNodeDataRef_RefersToLNode() {
        return ( EReference ) getLNodeDataRef().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNodeDataRef_ParentSignalRole() {
        return ( EReference ) getLNodeDataRef().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLNodeInputRef() {
        if( lNodeInputRefEClass == null ) {
            lNodeInputRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 48 );
        }
        return lNodeInputRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNodeInputRef_SourceRef() {
        return ( EAttribute ) getLNodeInputRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNodeInputRef_SourceRefUuid() {
        return ( EAttribute ) getLNodeInputRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNodeInputRef_RefersToSourceRef() {
        return ( EReference ) getLNodeInputRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNodeInputRef_ParentSignalRole() {
        return ( EReference ) getLNodeInputRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLNodeInputs() {
        if( lNodeInputsEClass == null ) {
            lNodeInputsEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 49 );
        }
        return lNodeInputsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNodeInputs_SourceRef() {
        return ( EReference ) getLNodeInputs().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLNodeOutputRef() {
        if( lNodeOutputRefEClass == null ) {
            lNodeOutputRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 50 );
        }
        return lNodeOutputRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNodeOutputRef_ControlRef() {
        return ( EAttribute ) getLNodeOutputRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNodeOutputRef_ControlRefUuid() {
        return ( EAttribute ) getLNodeOutputRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNodeOutputRef_RefersToControlRef() {
        return ( EReference ) getLNodeOutputRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNodeOutputRef_ParentSignalRole() {
        return ( EReference ) getLNodeOutputRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLNodeOutputs() {
        if( lNodeOutputsEClass == null ) {
            lNodeOutputsEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 51 );
        }
        return lNodeOutputsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNodeOutputs_ControlRef() {
        return ( EReference ) getLNodeOutputs().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLNodeSpecNaming() {
        if( lNodeSpecNamingEClass == null ) {
            lNodeSpecNamingEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 52 );
        }
        return lNodeSpecNamingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNodeSpecNaming_SIedName() {
        return ( EAttribute ) getLNodeSpecNaming().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNodeSpecNaming_SLdInst() {
        return ( EAttribute ) getLNodeSpecNaming().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNodeSpecNaming_SLnClass() {
        return ( EAttribute ) getLNodeSpecNaming().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNodeSpecNaming_SLnInst() {
        return ( EAttribute ) getLNodeSpecNaming().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNodeSpecNaming_SPrefix() {
        return ( EAttribute ) getLNodeSpecNaming().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLogParameters() {
        if( logParametersEClass == null ) {
            logParametersEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 53 );
        }
        return logParametersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogParameters_IntgPd() {
        return ( EAttribute ) getLogParameters().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogParameters_LogEna() {
        return ( EAttribute ) getLogParameters().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogParameters_LogLdInst() {
        return ( EAttribute ) getLogParameters().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogParameters_LogLnClass() {
        return ( EAttribute ) getLogParameters().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogParameters_LogLnInst() {
        return ( EAttribute ) getLogParameters().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogParameters_LogName() {
        return ( EAttribute ) getLogParameters().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogParameters_LogPrefix() {
        return ( EAttribute ) getLogParameters().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogParameters_ReasonCode() {
        return ( EAttribute ) getLogParameters().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLogParameters_ParentServiceSpecifications() {
        return ( EReference ) getLogParameters().getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLogParameters_ReferredByLogParametersRef() {
        return ( EReference ) getLogParameters().getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLogParametersRef() {
        if( logParametersRefEClass == null ) {
            logParametersRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 54 );
        }
        return logParametersRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLogParametersRef_RefersToLogParameters() {
        return ( EReference ) getLogParametersRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLogParametersRef_ParentDAS() {
        return ( EReference ) getLogParametersRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLogParametersRef_ParentDOS() {
        return ( EReference ) getLogParametersRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLogParametersRef_ParentSDS() {
        return ( EReference ) getLogParametersRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLogicVarRef() {
        if( logicVarRefEClass == null ) {
            logicVarRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 55 );
        }
        return logicVarRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogicVarRef_DaName() {
        return ( EAttribute ) getLogicVarRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogicVarRef_DataName() {
        return ( EAttribute ) getLogicVarRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogicVarRef_DoName() {
        return ( EAttribute ) getLogicVarRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogicVarRef_LnodeUuid() {
        return ( EAttribute ) getLogicVarRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogicVarRef_Value() {
        return ( EAttribute ) getLogicVarRef().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogicVarRef_VarName() {
        return ( EAttribute ) getLogicVarRef().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLogicVarRef_RefersToLNode() {
        return ( EReference ) getLogicVarRef().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getOutputVar() {
        if( outputVarEClass == null ) {
            outputVarEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI ).getEClassifiers()
                    .get( 56 );
        }
        return outputVarEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getOutputVar_OutputName() {
        return ( EAttribute ) getOutputVar().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getOutputVar_OutputUuid() {
        return ( EAttribute ) getOutputVar().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getOutputVar_RefersToControlRef() {
        return ( EReference ) getOutputVar().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getOutputVar_ParentBehaviorDescription() {
        return ( EReference ) getOutputVar().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getOutputVarRef() {
        if( outputVarRefEClass == null ) {
            outputVarRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 57 );
        }
        return outputVarRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getOutputVarRef_ParentBehaviorDescriptionRef() {
        return ( EReference ) getOutputVarRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPowerSystemRelation() {
        if( powerSystemRelationEClass == null ) {
            powerSystemRelationEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 58 );
        }
        return powerSystemRelationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPowerSystemRelation_Name() {
        return ( EAttribute ) getPowerSystemRelation().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPowerSystemRelation_OriginUuid() {
        return ( EAttribute ) getPowerSystemRelation().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPowerSystemRelation_Relation() {
        return ( EAttribute ) getPowerSystemRelation().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPowerSystemRelation_RelationUuid() {
        return ( EAttribute ) getPowerSystemRelation().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPowerSystemRelation_Selector() {
        return ( EAttribute ) getPowerSystemRelation().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPowerSystemRelation_TemplateUuid() {
        return ( EAttribute ) getPowerSystemRelation().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPowerSystemRelation_Uuid() {
        return ( EAttribute ) getPowerSystemRelation().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPowerSystemRelation_ParentPowerSystemRelation() {
        return ( EReference ) getPowerSystemRelation().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPowerSystemRelation_ReferredByPowerSystemRelationRef() {
        return ( EReference ) getPowerSystemRelation().getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPowerSystemRelationRef() {
        if( powerSystemRelationRefEClass == null ) {
            powerSystemRelationRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 59 );
        }
        return powerSystemRelationRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPowerSystemRelationRef_PowerSystemRelation() {
        return ( EAttribute ) getPowerSystemRelationRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPowerSystemRelationRef_PowerSystemRelationUuid() {
        return ( EAttribute ) getPowerSystemRelationRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPowerSystemRelationRef_ParentFunctionRoleContent() {
        return ( EReference ) getPowerSystemRelationRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPowerSystemRelationRef_RefersToPowerSystemRelation() {
        return ( EReference ) getPowerSystemRelationRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPowerSystemRelations() {
        if( powerSystemRelationsEClass == null ) {
            powerSystemRelationsEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 60 );
        }
        return powerSystemRelationsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPowerSystemRelations_PowerSystemRelation() {
        return ( EReference ) getPowerSystemRelations().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProcessEcho() {
        if( processEchoEClass == null ) {
            processEchoEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 61 );
        }
        return processEchoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcessEcho_Source() {
        return ( EAttribute ) getProcessEcho().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcessEcho_SourceDaName() {
        return ( EAttribute ) getProcessEcho().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcessEcho_SourceDoName() {
        return ( EAttribute ) getProcessEcho().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcessEcho_SourceLNodeUuid() {
        return ( EAttribute ) getProcessEcho().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessEcho_ParentDAS() {
        return ( EReference ) getProcessEcho().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessEcho_ParentDOS() {
        return ( EReference ) getProcessEcho().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessEcho_ParentSDS() {
        return ( EReference ) getProcessEcho().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessEcho_RefersToLNode() {
        return ( EReference ) getProcessEcho().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProcessResource() {
        if( processResourceEClass == null ) {
            processResourceEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 62 );
        }
        return processResourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessResource_Resource() {
        return ( EReference ) getProcessResource().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcessResource_Cardinality() {
        return ( EAttribute ) getProcessResource().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcessResource_Max() {
        return ( EAttribute ) getProcessResource().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcessResource_Name() {
        return ( EAttribute ) getProcessResource().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcessResource_OriginUuid() {
        return ( EAttribute ) getProcessResource().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcessResource_Selector() {
        return ( EAttribute ) getProcessResource().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcessResource_TemplateUuid() {
        return ( EAttribute ) getProcessResource().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcessResource_Uuid() {
        return ( EAttribute ) getProcessResource().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessResource_ParentProcessResources() {
        return ( EReference ) getProcessResource().getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessResource_ReferredByProcessResourceRef() {
        return ( EReference ) getProcessResource().getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessResource_ReferredByControllingLNode() {
        return ( EReference ) getProcessResource().getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessResource_ReferredBySubscriberLNode() {
        return ( EReference ) getProcessResource().getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessResource_ReferredByControlRef() {
        return ( EReference ) getProcessResource().getEStructuralFeatures().get( 12 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessResource_ReferredbySourceRef() {
        return ( EReference ) getProcessResource().getEStructuralFeatures().get( 13 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProcessResourceRef() {
        if( processResourceRefEClass == null ) {
            processResourceRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 63 );
        }
        return processResourceRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcessResourceRef_ProcessResource() {
        return ( EAttribute ) getProcessResourceRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcessResourceRef_ProcessResourceUuid() {
        return ( EAttribute ) getProcessResourceRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessResourceRef_ParentFunctionRoleContent() {
        return ( EReference ) getProcessResourceRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessResourceRef_RefersToProcessResource() {
        return ( EReference ) getProcessResourceRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProcessResources() {
        if( processResourcesEClass == null ) {
            processResourcesEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 64 );
        }
        return processResourcesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcessResources_ProcessResource() {
        return ( EReference ) getProcessResources().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProject() {
        if( projectEClass == null ) {
            projectEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI ).getEClassifiers()
                    .get( 65 );
        }
        return projectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProject_ProjectProcessReference() {
        return ( EReference ) getProject().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProject_Name() {
        return ( EAttribute ) getProject().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProject_Uuid() {
        return ( EAttribute ) getProject().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProjectProcessReference() {
        if( projectProcessReferenceEClass == null ) {
            projectProcessReferenceEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 66 );
        }
        return projectProcessReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProjectProcessReference_ProcessReference() {
        return ( EAttribute ) getProjectProcessReference().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProjectProcessReference_ProcessUuid() {
        return ( EAttribute ) getProjectProcessReference().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProjectProcessReference_ParentProject() {
        return ( EReference ) getProjectProcessReference().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getReportParameters() {
        if( reportParametersEClass == null ) {
            reportParametersEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 67 );
        }
        return reportParametersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getReportParameters_Buffered() {
        return ( EAttribute ) getReportParameters().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getReportParameters_BufTime() {
        return ( EAttribute ) getReportParameters().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getReportParameters_IntgPd() {
        return ( EAttribute ) getReportParameters().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReportParameters_ParentCommServiceSpecifications() {
        return ( EReference ) getReportParameters().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReportParameters_ParentServiceSpecifications() {
        return ( EReference ) getReportParameters().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReportParameters_ReferredByReportParametersRef() {
        return ( EReference ) getReportParameters().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getReportParametersRef() {
        if( reportParametersRefEClass == null ) {
            reportParametersRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 68 );
        }
        return reportParametersRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReportParametersRef_RefersToReportParameters() {
        return ( EReference ) getReportParametersRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReportParametersRef_ParentSourceRef() {
        return ( EReference ) getReportParametersRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReportParametersRef_ParentSubscriberLNode() {
        return ( EReference ) getReportParametersRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getResource() {
        if( resourceEClass == null ) {
            resourceEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI ).getEClassifiers()
                    .get( 69 );
        }
        return resourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getResource_Value() {
        return ( EAttribute ) getResource().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getResource_ResInst() {
        return ( EAttribute ) getResource().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getResource_Source() {
        return ( EAttribute ) getResource().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getResource_SourceUuid() {
        return ( EAttribute ) getResource().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getResource_ParentProcessResource() {
        return ( EReference ) getResource().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSDS() {
        if( sdsEClass == null ) {
            sdsEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI ).getEClassifiers()
                    .get( 70 );
        }
        return sdsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSDS_SDS() {
        return ( EReference ) getSDS().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSDS_DAS() {
        return ( EReference ) getSDS().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSDS_SubscriberLNode() {
        return ( EReference ) getSDS().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSDS_ControllingLNode() {
        return ( EReference ) getSDS().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSDS_ProcessEcho() {
        return ( EReference ) getSDS().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSDS_LogParametersRef() {
        return ( EReference ) getSDS().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSDS_Labels() {
        return ( EReference ) getSDS().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSDS_Ix() {
        return ( EAttribute ) getSDS().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSDS_MappedDoName() {
        return ( EAttribute ) getSDS().getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSDS_MappedLnUuid() {
        return ( EAttribute ) getSDS().getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSDS_Name() {
        return ( EAttribute ) getSDS().getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSDS_ParentDOS() {
        return ( EReference ) getSDS().getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSDS_ParentSDS() {
        return ( EReference ) getSDS().getEStructuralFeatures().get( 12 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSDS_RefersToAnyLN() {
        return ( EReference ) getSDS().getEStructuralFeatures().get( 13 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceParameters() {
        if( serviceParametersEClass == null ) {
            serviceParametersEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 71 );
        }
        return serviceParametersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceParameters_Id() {
        return ( EAttribute ) getServiceParameters().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceParametersRef() {
        if( serviceParametersRefEClass == null ) {
            serviceParametersRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 72 );
        }
        return serviceParametersRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceParametersRef_Id() {
        return ( EAttribute ) getServiceParametersRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceSpecifications() {
        if( serviceSpecificationsEClass == null ) {
            serviceSpecificationsEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 73 );
        }
        return serviceSpecificationsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceSpecifications_GooseParameters() {
        return ( EReference ) getServiceSpecifications().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceSpecifications_SMVParameters() {
        return ( EReference ) getServiceSpecifications().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceSpecifications_ReportParameters() {
        return ( EReference ) getServiceSpecifications().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceSpecifications_BinaryWiringParameters() {
        return ( EReference ) getServiceSpecifications().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceSpecifications_AnalogueWiringParameters() {
        return ( EReference ) getServiceSpecifications().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceSpecifications_LogParameters() {
        return ( EReference ) getServiceSpecifications().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSourceRef() {
        if( sourceRefEClass == null ) {
            sourceRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI ).getEClassifiers()
                    .get( 74 );
        }
        return sourceRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSourceRef_GooseParametersRef() {
        return ( EReference ) getSourceRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSourceRef_SMVParametersRef() {
        return ( EReference ) getSourceRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSourceRef_ReportParametersRef() {
        return ( EReference ) getSourceRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSourceRef_BinaryWiringParametersRef() {
        return ( EReference ) getSourceRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSourceRef_AnalogueWiringParametersRef() {
        return ( EReference ) getSourceRef().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSourceRef_ExtRefAddr() {
        return ( EAttribute ) getSourceRef().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSourceRef_ExtRefUuid() {
        return ( EAttribute ) getSourceRef().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSourceRef_Input() {
        return ( EAttribute ) getSourceRef().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSourceRef_InputInst() {
        return ( EAttribute ) getSourceRef().getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSourceRef_Service() {
        return ( EAttribute ) getSourceRef().getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSourceRef_Source() {
        return ( EAttribute ) getSourceRef().getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSourceRef_SourceDaName() {
        return ( EAttribute ) getSourceRef().getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSourceRef_SourceDoName() {
        return ( EAttribute ) getSourceRef().getEStructuralFeatures().get( 12 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSourceRef_SourceLNodeUuid() {
        return ( EAttribute ) getSourceRef().getEStructuralFeatures().get( 13 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSourceRef_ParentLNodeInputs() {
        return ( EReference ) getSourceRef().getEStructuralFeatures().get( 14 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSourceRef_ReferredByInputVar() {
        return ( EReference ) getSourceRef().getEStructuralFeatures().get( 15 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSourceRef_ReferredByLNodeInputRef() {
        return ( EReference ) getSourceRef().getEStructuralFeatures().get( 16 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSourceRef_RefersToSubscriberLNode() {
        return ( EReference ) getSourceRef().getEStructuralFeatures().get( 17 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSourceRef_RefersToProcessResource() {
        return ( EReference ) getSourceRef().getEStructuralFeatures().get( 18 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSourceRef_RefersToLNode() {
        return ( EReference ) getSourceRef().getEStructuralFeatures().get( 19 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSourceRef_RefersToExtRef() {
        return ( EReference ) getSourceRef().getEStructuralFeatures().get( 20 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSubCategory() {
        if( subCategoryEClass == null ) {
            subCategoryEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 75 );
        }
        return subCategoryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubCategory_ParentFunctionCategory() {
        return ( EReference ) getSubCategory().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSubCheckoutID() {
        if( subCheckoutIDEClass == null ) {
            subCheckoutIDEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 76 );
        }
        return subCheckoutIDEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubCheckoutID_ParentCheckoutID() {
        return ( EReference ) getSubCheckoutID().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSubFunctionTemplate() {
        if( subFunctionTemplateEClass == null ) {
            subFunctionTemplateEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 77 );
        }
        return subFunctionTemplateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubFunctionTemplate_GeneralEquipment() {
        return ( EReference ) getSubFunctionTemplate().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubFunctionTemplate_ConductingEquipment() {
        return ( EReference ) getSubFunctionTemplate().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubFunctionTemplate_SubFunctionTemplate() {
        return ( EReference ) getSubFunctionTemplate().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubFunctionTemplate_Type() {
        return ( EAttribute ) getSubFunctionTemplate().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubFunctionTemplate_ParentFunctionTemplate() {
        return ( EReference ) getSubFunctionTemplate().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubFunctionTemplate_ParentSubFunctionTemplate() {
        return ( EReference ) getSubFunctionTemplate().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSMVParameters() {
        if( smvParametersEClass == null ) {
            smvParametersEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 78 );
        }
        return smvParametersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSMVParameters_L2CommParameters() {
        return ( EReference ) getSMVParameters().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSMVParameters_L3IPv4CommParameters() {
        return ( EReference ) getSMVParameters().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSMVParameters_L3IPv6CommParameters() {
        return ( EReference ) getSMVParameters().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSMVParameters_Multicast() {
        return ( EAttribute ) getSMVParameters().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSMVParameters_NofASDU() {
        return ( EAttribute ) getSMVParameters().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSMVParameters_SecurityEnabled() {
        return ( EAttribute ) getSMVParameters().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSMVParameters_SmpMod() {
        return ( EAttribute ) getSMVParameters().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSMVParameters_SmpRate() {
        return ( EAttribute ) getSMVParameters().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSMVParameters_SmvId() {
        return ( EAttribute ) getSMVParameters().getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSMVParameters_ParentCommServiceSpecifications() {
        return ( EReference ) getSMVParameters().getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSMVParameters_ParentServiceSpecifications() {
        return ( EReference ) getSMVParameters().getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSMVParameters_ReferredBySMVParametersRef() {
        return ( EReference ) getSMVParameters().getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSMVParametersRef() {
        if( smvParametersRefEClass == null ) {
            smvParametersRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 79 );
        }
        return smvParametersRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSMVParametersRef_RefersToSMVParameters() {
        return ( EReference ) getSMVParametersRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSMVParametersRef_ParentSourceRef() {
        return ( EReference ) getSMVParametersRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSMVParametersRef_ParentSubscriberLNode() {
        return ( EReference ) getSMVParametersRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSubscriberLNode() {
        if( subscriberLNodeEClass == null ) {
            subscriberLNodeEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 80 );
        }
        return subscriberLNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubscriberLNode_GooseParametersRef() {
        return ( EReference ) getSubscriberLNode().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubscriberLNode_SMVParametersRef() {
        return ( EReference ) getSubscriberLNode().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubscriberLNode_ReportParametersRef() {
        return ( EReference ) getSubscriberLNode().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubscriberLNode_BinaryWiringParametersRef() {
        return ( EReference ) getSubscriberLNode().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubscriberLNode_InputName() {
        return ( EAttribute ) getSubscriberLNode().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubscriberLNode_PLN() {
        return ( EAttribute ) getSubscriberLNode().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubscriberLNode_ResourceName() {
        return ( EAttribute ) getSubscriberLNode().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubscriberLNode_ResourceUuid() {
        return ( EAttribute ) getSubscriberLNode().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubscriberLNode_Service() {
        return ( EAttribute ) getSubscriberLNode().getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubscriberLNode_ParentDAS() {
        return ( EReference ) getSubscriberLNode().getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubscriberLNode_ParentDOS() {
        return ( EReference ) getSubscriberLNode().getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubscriberLNode_ParentSDS() {
        return ( EReference ) getSubscriberLNode().getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubscriberLNode_RefersToProcessResource() {
        return ( EReference ) getSubscriberLNode().getEStructuralFeatures().get( 12 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubscriberLNode_ReferredBySourceRef() {
        return ( EReference ) getSubscriberLNode().getEStructuralFeatures().get( 13 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getVariable() {
        if( variableEClass == null ) {
            variableEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI ).getEClassifiers()
                    .get( 81 );
        }
        return variableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getVariable_VariableApplyTo() {
        return ( EReference ) getVariable().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariable_Name() {
        return ( EAttribute ) getVariable().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariable_OriginUuid() {
        return ( EAttribute ) getVariable().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariable_TemplateUuid() {
        return ( EAttribute ) getVariable().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariable_Uuid() {
        return ( EAttribute ) getVariable().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariable_Value() {
        return ( EAttribute ) getVariable().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getVariable_ReferredByVariableRef() {
        return ( EReference ) getVariable().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getVariableApplyTo() {
        if( variableApplyToEClass == null ) {
            variableApplyToEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 82 );
        }
        return variableApplyToEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableApplyTo_Attribute() {
        return ( EAttribute ) getVariableApplyTo().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableApplyTo_DaName() {
        return ( EAttribute ) getVariableApplyTo().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableApplyTo_DefaultValue() {
        return ( EAttribute ) getVariableApplyTo().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableApplyTo_DoName() {
        return ( EAttribute ) getVariableApplyTo().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableApplyTo_Element() {
        return ( EAttribute ) getVariableApplyTo().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableApplyTo_ElementUuid() {
        return ( EAttribute ) getVariableApplyTo().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableApplyTo_Format() {
        return ( EAttribute ) getVariableApplyTo().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableApplyTo_SGroup() {
        return ( EAttribute ) getVariableApplyTo().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getVariableApplyTo_ParentVariable() {
        return ( EReference ) getVariableApplyTo().getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getVariableRef() {
        if( variableRefEClass == null ) {
            variableRefEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 83 );
        }
        return variableRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableRef_Value() {
        return ( EAttribute ) getVariableRef().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableRef_Variable() {
        return ( EAttribute ) getVariableRef().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableRef_VariableUuid() {
        return ( EAttribute ) getVariableRef().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getVariableRef_ParentAbstractFunctionalVariant() {
        return ( EReference ) getVariableRef().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getVariableRef_ParentFunctionRoleContent() {
        return ( EReference ) getVariableRef().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getVariableRef_RefersToVariable() {
        return ( EReference ) getVariableRef().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getWiringParameters() {
        if( wiringParametersEClass == null ) {
            wiringParametersEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 84 );
        }
        return wiringParametersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getWiringParameters_InpNam() {
        return ( EAttribute ) getWiringParameters().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getWiringParameters_InpRef() {
        return ( EAttribute ) getWiringParameters().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getCardinalityEnum() {
        if( cardinalityEnumEEnum == null ) {
            cardinalityEnumEEnum = ( EEnum ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 85 );
        }
        return cardinalityEnumEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getOutTypEnum() {
        if( outTypEnumEEnum == null ) {
            outTypEnumEEnum = ( EEnum ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI ).getEClassifiers()
                    .get( 86 );
        }
        return outTypEnumEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getUpdateEnum() {
        if( updateEnumEEnum == null ) {
            updateEnumEEnum = ( EEnum ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI ).getEClassifiers()
                    .get( 87 );
        }
        return updateEnumEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getSpecServiceEnum() {
        if( specServiceEnumEEnum == null ) {
            specServiceEnumEEnum = ( EEnum ) EPackage.Registry.INSTANCE.getEPackage( AsdPackage.eNS_URI )
                    .getEClassifiers().get( 88 );
        }
        return specServiceEnumEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsdFactory getAsdFactory() {
        return ( AsdFactory ) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isFixed = false;

    /**
     * Fixes up the loaded package, to make it appear as if it had been programmatically built.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fixPackageContents() {
        if( isFixed ) {
            return;
        }
        isFixed = true;
        fixEClassifiers();
    }

    /**
     * Sets the instance class on the given classifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void fixInstanceClass( EClassifier eClassifier ) {
        if( eClassifier.getInstanceClassName() == null ) {
            eClassifier
                    .setInstanceClassName( "fr.centralesupelec.edf.riseclipse.iec61850.asd." + eClassifier.getName() );
            setGeneratedClassName( eClassifier );
        }
    }

} //AsdPackageImpl
