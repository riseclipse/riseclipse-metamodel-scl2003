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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionImpl#getInputVar <em>Input Var</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionImpl#getOutputVar <em>Output Var</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionImpl#getBehaviorReference <em>Behavior Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionImpl#getFileReference <em>File Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionImpl#isIsSimulation <em>Is Simulation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionImpl#isIsSpecification <em>Is Specification</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionImpl#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionImpl#getTemplateUuid <em>Template Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionImpl#getReferredByBehaviorDescriptionRef <em>Referred By Behavior Description Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorDescriptionImpl extends BaseExtensionElementWithDescImpl implements BehaviorDescription {
    /**
     * The cached value of the '{@link #getInputVar() <em>Input Var</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputVar()
     * @generated
     * @ordered
     */
    protected EList< InputVar > inputVar;

    /**
     * The cached value of the '{@link #getOutputVar() <em>Output Var</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputVar()
     * @generated
     * @ordered
     */
    protected EList< OutputVar > outputVar;

    /**
     * The cached value of the '{@link #getBehaviorReference() <em>Behavior Reference</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehaviorReference()
     * @generated
     * @ordered
     */
    protected EList< BehaviorReference > behaviorReference;

    /**
     * The default value of the '{@link #getFileReference() <em>File Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileReference()
     * @generated
     * @ordered
     */
    protected static final String FILE_REFERENCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFileReference() <em>File Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileReference()
     * @generated
     * @ordered
     */
    protected String fileReference = FILE_REFERENCE_EDEFAULT;

    /**
     * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFormat()
     * @generated
     * @ordered
     */
    protected static final int FORMAT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFormat()
     * @generated
     * @ordered
     */
    protected int format = FORMAT_EDEFAULT;

    /**
     * The default value of the '{@link #isIsSimulation() <em>Is Simulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsSimulation()
     * @generated
     * @ordered
     */
    protected static final boolean IS_SIMULATION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsSimulation() <em>Is Simulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsSimulation()
     * @generated
     * @ordered
     */
    protected boolean isSimulation = IS_SIMULATION_EDEFAULT;

    /**
     * This is true if the Is Simulation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isSimulationESet;

    /**
     * The default value of the '{@link #isIsSpecification() <em>Is Specification</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsSpecification()
     * @generated
     * @ordered
     */
    protected static final boolean IS_SPECIFICATION_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isIsSpecification() <em>Is Specification</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsSpecification()
     * @generated
     * @ordered
     */
    protected boolean isSpecification = IS_SPECIFICATION_EDEFAULT;

    /**
     * This is true if the Is Specification attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isSpecificationESet;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getOriginUuid() <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginUuid()
     * @generated
     * @ordered
     */
    protected static final String ORIGIN_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOriginUuid() <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginUuid()
     * @generated
     * @ordered
     */
    protected String originUuid = ORIGIN_UUID_EDEFAULT;

    /**
     * The default value of the '{@link #getTemplateUuid() <em>Template Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemplateUuid()
     * @generated
     * @ordered
     */
    protected static final String TEMPLATE_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTemplateUuid() <em>Template Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemplateUuid()
     * @generated
     * @ordered
     */
    protected String templateUuid = TEMPLATE_UUID_EDEFAULT;

    /**
     * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUuid()
     * @generated
     * @ordered
     */
    protected static final String UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUuid()
     * @generated
     * @ordered
     */
    protected String uuid = UUID_EDEFAULT;

    /**
     * The cached value of the '{@link #getReferredByBehaviorDescriptionRef() <em>Referred By Behavior Description Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByBehaviorDescriptionRef()
     * @generated
     * @ordered
     */
    protected EList< BehaviorDescriptionRef > referredByBehaviorDescriptionRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BehaviorDescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getBehaviorDescription();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< InputVar > getInputVar() {
        if( inputVar == null ) {
            inputVar = new EObjectContainmentWithInverseEList.Unsettable< >( InputVar.class, this,
                    AsdPackage.BEHAVIOR_DESCRIPTION__INPUT_VAR, AsdPackage.INPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION );
        }
        return inputVar;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInputVar() {
        if( inputVar != null ) {
            ( ( InternalEList.Unsettable< ? > ) inputVar ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInputVar() {
        return inputVar != null && ( ( InternalEList.Unsettable< ? > ) inputVar ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OutputVar > getOutputVar() {
        if( outputVar == null ) {
            outputVar = new EObjectContainmentWithInverseEList.Unsettable< >( OutputVar.class, this,
                    AsdPackage.BEHAVIOR_DESCRIPTION__OUTPUT_VAR, AsdPackage.OUTPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION );
        }
        return outputVar;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOutputVar() {
        if( outputVar != null ) {
            ( ( InternalEList.Unsettable< ? > ) outputVar ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutputVar() {
        return outputVar != null && ( ( InternalEList.Unsettable< ? > ) outputVar ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< BehaviorReference > getBehaviorReference() {
        if( behaviorReference == null ) {
            behaviorReference = new EObjectContainmentWithInverseEList.Unsettable< >(
                    BehaviorReference.class, this, AsdPackage.BEHAVIOR_DESCRIPTION__BEHAVIOR_REFERENCE,
                    AsdPackage.BEHAVIOR_REFERENCE__PARENT_BEHAVIOR_DESCRIPTION );
        }
        return behaviorReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBehaviorReference() {
        if( behaviorReference != null ) {
            ( ( InternalEList.Unsettable< ? > ) behaviorReference ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBehaviorReference() {
        return behaviorReference != null && ( ( InternalEList.Unsettable< ? > ) behaviorReference ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFileReference() {
        return fileReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFileReference( String newFileReference ) {
        String oldFileReference = fileReference;
        fileReference = newFileReference;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BEHAVIOR_DESCRIPTION__FILE_REFERENCE,
                    oldFileReference, fileReference ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getFormat() {
        return format;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFormat( int newFormat ) {
        int oldFormat = format;
        format = newFormat;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BEHAVIOR_DESCRIPTION__FORMAT, oldFormat,
                    format ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isIsSimulation() {
        return isSimulation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsSimulation( boolean newIsSimulation ) {
        boolean oldIsSimulation = isSimulation;
        isSimulation = newIsSimulation;
        boolean oldIsSimulationESet = isSimulationESet;
        isSimulationESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BEHAVIOR_DESCRIPTION__IS_SIMULATION,
                    oldIsSimulation, isSimulation, !oldIsSimulationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsSimulation() {
        boolean oldIsSimulation = isSimulation;
        boolean oldIsSimulationESet = isSimulationESet;
        isSimulation = IS_SIMULATION_EDEFAULT;
        isSimulationESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.BEHAVIOR_DESCRIPTION__IS_SIMULATION,
                    oldIsSimulation, IS_SIMULATION_EDEFAULT, oldIsSimulationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsSimulation() {
        return isSimulationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isIsSpecification() {
        return isSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsSpecification( boolean newIsSpecification ) {
        boolean oldIsSpecification = isSpecification;
        isSpecification = newIsSpecification;
        boolean oldIsSpecificationESet = isSpecificationESet;
        isSpecificationESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BEHAVIOR_DESCRIPTION__IS_SPECIFICATION,
                    oldIsSpecification, isSpecification, !oldIsSpecificationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsSpecification() {
        boolean oldIsSpecification = isSpecification;
        boolean oldIsSpecificationESet = isSpecificationESet;
        isSpecification = IS_SPECIFICATION_EDEFAULT;
        isSpecificationESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.BEHAVIOR_DESCRIPTION__IS_SPECIFICATION,
                    oldIsSpecification, IS_SPECIFICATION_EDEFAULT, oldIsSpecificationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsSpecification() {
        return isSpecificationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BEHAVIOR_DESCRIPTION__NAME, oldName,
                    name ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOriginUuid() {
        return originUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOriginUuid( String newOriginUuid ) {
        String oldOriginUuid = originUuid;
        originUuid = newOriginUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BEHAVIOR_DESCRIPTION__ORIGIN_UUID,
                    oldOriginUuid, originUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTemplateUuid() {
        return templateUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTemplateUuid( String newTemplateUuid ) {
        String oldTemplateUuid = templateUuid;
        templateUuid = newTemplateUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BEHAVIOR_DESCRIPTION__TEMPLATE_UUID,
                    oldTemplateUuid, templateUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUuid() {
        return uuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUuid( String newUuid ) {
        String oldUuid = uuid;
        uuid = newUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BEHAVIOR_DESCRIPTION__UUID, oldUuid,
                    uuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< BehaviorDescriptionRef > getReferredByBehaviorDescriptionRef() {
        if( referredByBehaviorDescriptionRef == null ) {
            referredByBehaviorDescriptionRef = new EObjectWithInverseResolvingEList.Unsettable< >(
                    BehaviorDescriptionRef.class, this,
                    AsdPackage.BEHAVIOR_DESCRIPTION__REFERRED_BY_BEHAVIOR_DESCRIPTION_REF,
                    AsdPackage.BEHAVIOR_DESCRIPTION_REF__REFERS_TO_BEHAVIOR_DESCRIPTION );
        }
        return referredByBehaviorDescriptionRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByBehaviorDescriptionRef() {
        if( referredByBehaviorDescriptionRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByBehaviorDescriptionRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByBehaviorDescriptionRef() {
        return referredByBehaviorDescriptionRef != null
                && ( ( InternalEList.Unsettable< ? > ) referredByBehaviorDescriptionRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.BEHAVIOR_DESCRIPTION__INPUT_VAR:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getInputVar() ).basicAdd( otherEnd,
                    msgs );
        case AsdPackage.BEHAVIOR_DESCRIPTION__OUTPUT_VAR:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOutputVar() ).basicAdd( otherEnd,
                    msgs );
        case AsdPackage.BEHAVIOR_DESCRIPTION__BEHAVIOR_REFERENCE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getBehaviorReference() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.BEHAVIOR_DESCRIPTION__REFERRED_BY_BEHAVIOR_DESCRIPTION_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByBehaviorDescriptionRef() )
                    .basicAdd( otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.BEHAVIOR_DESCRIPTION__INPUT_VAR:
            return ( ( InternalEList< ? > ) getInputVar() ).basicRemove( otherEnd, msgs );
        case AsdPackage.BEHAVIOR_DESCRIPTION__OUTPUT_VAR:
            return ( ( InternalEList< ? > ) getOutputVar() ).basicRemove( otherEnd, msgs );
        case AsdPackage.BEHAVIOR_DESCRIPTION__BEHAVIOR_REFERENCE:
            return ( ( InternalEList< ? > ) getBehaviorReference() ).basicRemove( otherEnd, msgs );
        case AsdPackage.BEHAVIOR_DESCRIPTION__REFERRED_BY_BEHAVIOR_DESCRIPTION_REF:
            return ( ( InternalEList< ? > ) getReferredByBehaviorDescriptionRef() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case AsdPackage.BEHAVIOR_DESCRIPTION__INPUT_VAR:
            return getInputVar();
        case AsdPackage.BEHAVIOR_DESCRIPTION__OUTPUT_VAR:
            return getOutputVar();
        case AsdPackage.BEHAVIOR_DESCRIPTION__BEHAVIOR_REFERENCE:
            return getBehaviorReference();
        case AsdPackage.BEHAVIOR_DESCRIPTION__FILE_REFERENCE:
            return getFileReference();
        case AsdPackage.BEHAVIOR_DESCRIPTION__FORMAT:
            return getFormat();
        case AsdPackage.BEHAVIOR_DESCRIPTION__IS_SIMULATION:
            return isIsSimulation();
        case AsdPackage.BEHAVIOR_DESCRIPTION__IS_SPECIFICATION:
            return isIsSpecification();
        case AsdPackage.BEHAVIOR_DESCRIPTION__NAME:
            return getName();
        case AsdPackage.BEHAVIOR_DESCRIPTION__ORIGIN_UUID:
            return getOriginUuid();
        case AsdPackage.BEHAVIOR_DESCRIPTION__TEMPLATE_UUID:
            return getTemplateUuid();
        case AsdPackage.BEHAVIOR_DESCRIPTION__UUID:
            return getUuid();
        case AsdPackage.BEHAVIOR_DESCRIPTION__REFERRED_BY_BEHAVIOR_DESCRIPTION_REF:
            return getReferredByBehaviorDescriptionRef();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case AsdPackage.BEHAVIOR_DESCRIPTION__INPUT_VAR:
            getInputVar().clear();
            getInputVar().addAll( ( Collection< ? extends InputVar > ) newValue );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__OUTPUT_VAR:
            getOutputVar().clear();
            getOutputVar().addAll( ( Collection< ? extends OutputVar > ) newValue );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__BEHAVIOR_REFERENCE:
            getBehaviorReference().clear();
            getBehaviorReference().addAll( ( Collection< ? extends BehaviorReference > ) newValue );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__FILE_REFERENCE:
            setFileReference( ( String ) newValue );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__FORMAT:
            setFormat( ( Integer ) newValue );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__IS_SIMULATION:
            setIsSimulation( ( Boolean ) newValue );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__IS_SPECIFICATION:
            setIsSpecification( ( Boolean ) newValue );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__NAME:
            setName( ( String ) newValue );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__ORIGIN_UUID:
            setOriginUuid( ( String ) newValue );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__TEMPLATE_UUID:
            setTemplateUuid( ( String ) newValue );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__UUID:
            setUuid( ( String ) newValue );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__REFERRED_BY_BEHAVIOR_DESCRIPTION_REF:
            getReferredByBehaviorDescriptionRef().clear();
            getReferredByBehaviorDescriptionRef().addAll( ( Collection< ? extends BehaviorDescriptionRef > ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case AsdPackage.BEHAVIOR_DESCRIPTION__INPUT_VAR:
            unsetInputVar();
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__OUTPUT_VAR:
            unsetOutputVar();
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__BEHAVIOR_REFERENCE:
            unsetBehaviorReference();
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__FILE_REFERENCE:
            setFileReference( FILE_REFERENCE_EDEFAULT );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__FORMAT:
            setFormat( FORMAT_EDEFAULT );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__IS_SIMULATION:
            unsetIsSimulation();
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__IS_SPECIFICATION:
            unsetIsSpecification();
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__NAME:
            setName( NAME_EDEFAULT );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__ORIGIN_UUID:
            setOriginUuid( ORIGIN_UUID_EDEFAULT );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__TEMPLATE_UUID:
            setTemplateUuid( TEMPLATE_UUID_EDEFAULT );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__UUID:
            setUuid( UUID_EDEFAULT );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION__REFERRED_BY_BEHAVIOR_DESCRIPTION_REF:
            unsetReferredByBehaviorDescriptionRef();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case AsdPackage.BEHAVIOR_DESCRIPTION__INPUT_VAR:
            return isSetInputVar();
        case AsdPackage.BEHAVIOR_DESCRIPTION__OUTPUT_VAR:
            return isSetOutputVar();
        case AsdPackage.BEHAVIOR_DESCRIPTION__BEHAVIOR_REFERENCE:
            return isSetBehaviorReference();
        case AsdPackage.BEHAVIOR_DESCRIPTION__FILE_REFERENCE:
            return FILE_REFERENCE_EDEFAULT == null ? fileReference != null
                    : !FILE_REFERENCE_EDEFAULT.equals( fileReference );
        case AsdPackage.BEHAVIOR_DESCRIPTION__FORMAT:
            return format != FORMAT_EDEFAULT;
        case AsdPackage.BEHAVIOR_DESCRIPTION__IS_SIMULATION:
            return isSetIsSimulation();
        case AsdPackage.BEHAVIOR_DESCRIPTION__IS_SPECIFICATION:
            return isSetIsSpecification();
        case AsdPackage.BEHAVIOR_DESCRIPTION__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals( name );
        case AsdPackage.BEHAVIOR_DESCRIPTION__ORIGIN_UUID:
            return ORIGIN_UUID_EDEFAULT == null ? originUuid != null : !ORIGIN_UUID_EDEFAULT.equals( originUuid );
        case AsdPackage.BEHAVIOR_DESCRIPTION__TEMPLATE_UUID:
            return TEMPLATE_UUID_EDEFAULT == null ? templateUuid != null
                    : !TEMPLATE_UUID_EDEFAULT.equals( templateUuid );
        case AsdPackage.BEHAVIOR_DESCRIPTION__UUID:
            return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals( uuid );
        case AsdPackage.BEHAVIOR_DESCRIPTION__REFERRED_BY_BEHAVIOR_DESCRIPTION_REF:
            return isSetReferredByBehaviorDescriptionRef();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (fileReference: " );
        result.append( fileReference );
        result.append( ", format: " );
        result.append( format );
        result.append( ", isSimulation: " );
        if( isSimulationESet ) {
            result.append( isSimulation );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", isSpecification: " );
        if( isSpecificationESet ) {
            result.append( isSpecification );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", name: " );
        result.append( name );
        result.append( ", originUuid: " );
        result.append( originUuid );
        result.append( ", templateUuid: " );
        result.append( templateUuid );
        result.append( ", uuid: " );
        result.append( uuid );
        result.append( ')' );
        return result.toString();
    }

} //BehaviorDescriptionImpl
