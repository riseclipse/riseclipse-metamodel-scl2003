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
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.Application;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ApplicationImpl#getFunctionRole <em>Function Role</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ApplicationImpl#getFunctionalVariant <em>Functional Variant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ApplicationImpl#getFunctionalVariantGroup <em>Functional Variant Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ApplicationImpl#getAllocationRoleRef <em>Allocation Role Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ApplicationImpl#getApplicationSclRef <em>Application Scl Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ApplicationImpl#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ApplicationImpl#getTemplateUuid <em>Template Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ApplicationImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ApplicationImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends BaseExtensionElementWithDescImpl implements Application {
    /**
     * The cached value of the '{@link #getFunctionRole() <em>Function Role</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionRole()
     * @generated
     * @ordered
     */
    protected EList< FunctionRole > functionRole;

    /**
     * The cached value of the '{@link #getFunctionalVariant() <em>Functional Variant</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionalVariant()
     * @generated
     * @ordered
     */
    protected EList< FunctionalVariant > functionalVariant;

    /**
     * The cached value of the '{@link #getFunctionalVariantGroup() <em>Functional Variant Group</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionalVariantGroup()
     * @generated
     * @ordered
     */
    protected EList< FunctionalVariantGroup > functionalVariantGroup;

    /**
     * The cached value of the '{@link #getAllocationRoleRef() <em>Allocation Role Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAllocationRoleRef()
     * @generated
     * @ordered
     */
    protected EList< AllocationRoleRef > allocationRoleRef;

    /**
     * The cached value of the '{@link #getApplicationSclRef() <em>Application Scl Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplicationSclRef()
     * @generated
     * @ordered
     */
    protected ApplicationSclRef applicationSclRef;

    /**
     * This is true if the Application Scl Ref containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean applicationSclRefESet;

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
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ApplicationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getApplication();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FunctionRole > getFunctionRole() {
        if( functionRole == null ) {
            functionRole = new EObjectContainmentWithInverseEList.Unsettable< >( FunctionRole.class, this,
                    AsdPackage.APPLICATION__FUNCTION_ROLE, AsdPackage.FUNCTION_ROLE__PARENT_APPLICATION );
        }
        return functionRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFunctionRole() {
        if( functionRole != null ) {
            ( ( InternalEList.Unsettable< ? > ) functionRole ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFunctionRole() {
        return functionRole != null && ( ( InternalEList.Unsettable< ? > ) functionRole ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FunctionalVariant > getFunctionalVariant() {
        if( functionalVariant == null ) {
            functionalVariant = new EObjectContainmentWithInverseEList.Unsettable< >(
                    FunctionalVariant.class, this, AsdPackage.APPLICATION__FUNCTIONAL_VARIANT,
                    AsdPackage.FUNCTIONAL_VARIANT__PARENT_APPLICATION );
        }
        return functionalVariant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFunctionalVariant() {
        if( functionalVariant != null ) {
            ( ( InternalEList.Unsettable< ? > ) functionalVariant ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFunctionalVariant() {
        return functionalVariant != null && ( ( InternalEList.Unsettable< ? > ) functionalVariant ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FunctionalVariantGroup > getFunctionalVariantGroup() {
        if( functionalVariantGroup == null ) {
            functionalVariantGroup = new EObjectContainmentWithInverseEList.Unsettable< >(
                    FunctionalVariantGroup.class, this, AsdPackage.APPLICATION__FUNCTIONAL_VARIANT_GROUP,
                    AsdPackage.FUNCTIONAL_VARIANT_GROUP__PARENT_APPLICATION );
        }
        return functionalVariantGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFunctionalVariantGroup() {
        if( functionalVariantGroup != null ) {
            ( ( InternalEList.Unsettable< ? > ) functionalVariantGroup ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFunctionalVariantGroup() {
        return functionalVariantGroup != null && ( ( InternalEList.Unsettable< ? > ) functionalVariantGroup ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AllocationRoleRef > getAllocationRoleRef() {
        if( allocationRoleRef == null ) {
            allocationRoleRef = new EObjectContainmentWithInverseEList.Unsettable< >(
                    AllocationRoleRef.class, this, AsdPackage.APPLICATION__ALLOCATION_ROLE_REF,
                    AsdPackage.ALLOCATION_ROLE_REF__PARENT_APPLICATION );
        }
        return allocationRoleRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAllocationRoleRef() {
        if( allocationRoleRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) allocationRoleRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAllocationRoleRef() {
        return allocationRoleRef != null && ( ( InternalEList.Unsettable< ? > ) allocationRoleRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ApplicationSclRef getApplicationSclRef() {
        return applicationSclRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetApplicationSclRef( ApplicationSclRef newApplicationSclRef,
            NotificationChain msgs ) {
        ApplicationSclRef oldApplicationSclRef = applicationSclRef;
        applicationSclRef = newApplicationSclRef;
        boolean oldApplicationSclRefESet = applicationSclRefESet;
        applicationSclRefESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.APPLICATION__APPLICATION_SCL_REF, oldApplicationSclRef, newApplicationSclRef,
                    !oldApplicationSclRefESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApplicationSclRef( ApplicationSclRef newApplicationSclRef ) {
        if( newApplicationSclRef != applicationSclRef ) {
            NotificationChain msgs = null;
            if( applicationSclRef != null ) {
                msgs = ( ( InternalEObject ) applicationSclRef ).eInverseRemove( this,
                        AsdPackage.APPLICATION_SCL_REF__PARENT_APPLICATION, ApplicationSclRef.class, msgs );
            }
            if( newApplicationSclRef != null ) {
                msgs = ( ( InternalEObject ) newApplicationSclRef ).eInverseAdd( this,
                        AsdPackage.APPLICATION_SCL_REF__PARENT_APPLICATION, ApplicationSclRef.class, msgs );
            }
            msgs = basicSetApplicationSclRef( newApplicationSclRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldApplicationSclRefESet = applicationSclRefESet;
            applicationSclRefESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.APPLICATION__APPLICATION_SCL_REF,
                        newApplicationSclRef, newApplicationSclRef, !oldApplicationSclRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetApplicationSclRef( NotificationChain msgs ) {
        ApplicationSclRef oldApplicationSclRef = applicationSclRef;
        applicationSclRef = null;
        boolean oldApplicationSclRefESet = applicationSclRefESet;
        applicationSclRefESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.APPLICATION__APPLICATION_SCL_REF, oldApplicationSclRef, null, oldApplicationSclRefESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetApplicationSclRef() {
        if( applicationSclRef != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) applicationSclRef ).eInverseRemove( this,
                    AsdPackage.APPLICATION_SCL_REF__PARENT_APPLICATION, ApplicationSclRef.class, msgs );
            msgs = basicUnsetApplicationSclRef( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldApplicationSclRefESet = applicationSclRefESet;
            applicationSclRefESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.APPLICATION__APPLICATION_SCL_REF,
                        null, null, oldApplicationSclRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetApplicationSclRef() {
        return applicationSclRefESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.APPLICATION__NAME, oldName, name ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.APPLICATION__ORIGIN_UUID, oldOriginUuid,
                    originUuid ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.APPLICATION__TEMPLATE_UUID,
                    oldTemplateUuid, templateUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.APPLICATION__TYPE, oldType, type ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.APPLICATION__UUID, oldUuid, uuid ) );
        }
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
        case AsdPackage.APPLICATION__FUNCTION_ROLE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFunctionRole() ).basicAdd( otherEnd,
                    msgs );
        case AsdPackage.APPLICATION__FUNCTIONAL_VARIANT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFunctionalVariant() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.APPLICATION__FUNCTIONAL_VARIANT_GROUP:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFunctionalVariantGroup() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.APPLICATION__ALLOCATION_ROLE_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAllocationRoleRef() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.APPLICATION__APPLICATION_SCL_REF:
            if( applicationSclRef != null ) {
                msgs = ( ( InternalEObject ) applicationSclRef ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.APPLICATION__APPLICATION_SCL_REF, null, msgs );
            }
            return basicSetApplicationSclRef( ( ApplicationSclRef ) otherEnd, msgs );
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
        case AsdPackage.APPLICATION__FUNCTION_ROLE:
            return ( ( InternalEList< ? > ) getFunctionRole() ).basicRemove( otherEnd, msgs );
        case AsdPackage.APPLICATION__FUNCTIONAL_VARIANT:
            return ( ( InternalEList< ? > ) getFunctionalVariant() ).basicRemove( otherEnd, msgs );
        case AsdPackage.APPLICATION__FUNCTIONAL_VARIANT_GROUP:
            return ( ( InternalEList< ? > ) getFunctionalVariantGroup() ).basicRemove( otherEnd, msgs );
        case AsdPackage.APPLICATION__ALLOCATION_ROLE_REF:
            return ( ( InternalEList< ? > ) getAllocationRoleRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.APPLICATION__APPLICATION_SCL_REF:
            return basicUnsetApplicationSclRef( msgs );
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
        case AsdPackage.APPLICATION__FUNCTION_ROLE:
            return getFunctionRole();
        case AsdPackage.APPLICATION__FUNCTIONAL_VARIANT:
            return getFunctionalVariant();
        case AsdPackage.APPLICATION__FUNCTIONAL_VARIANT_GROUP:
            return getFunctionalVariantGroup();
        case AsdPackage.APPLICATION__ALLOCATION_ROLE_REF:
            return getAllocationRoleRef();
        case AsdPackage.APPLICATION__APPLICATION_SCL_REF:
            return getApplicationSclRef();
        case AsdPackage.APPLICATION__NAME:
            return getName();
        case AsdPackage.APPLICATION__ORIGIN_UUID:
            return getOriginUuid();
        case AsdPackage.APPLICATION__TEMPLATE_UUID:
            return getTemplateUuid();
        case AsdPackage.APPLICATION__TYPE:
            return getType();
        case AsdPackage.APPLICATION__UUID:
            return getUuid();
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
        case AsdPackage.APPLICATION__FUNCTION_ROLE:
            getFunctionRole().clear();
            getFunctionRole().addAll( ( Collection< ? extends FunctionRole > ) newValue );
            return;
        case AsdPackage.APPLICATION__FUNCTIONAL_VARIANT:
            getFunctionalVariant().clear();
            getFunctionalVariant().addAll( ( Collection< ? extends FunctionalVariant > ) newValue );
            return;
        case AsdPackage.APPLICATION__FUNCTIONAL_VARIANT_GROUP:
            getFunctionalVariantGroup().clear();
            getFunctionalVariantGroup().addAll( ( Collection< ? extends FunctionalVariantGroup > ) newValue );
            return;
        case AsdPackage.APPLICATION__ALLOCATION_ROLE_REF:
            getAllocationRoleRef().clear();
            getAllocationRoleRef().addAll( ( Collection< ? extends AllocationRoleRef > ) newValue );
            return;
        case AsdPackage.APPLICATION__APPLICATION_SCL_REF:
            setApplicationSclRef( ( ApplicationSclRef ) newValue );
            return;
        case AsdPackage.APPLICATION__NAME:
            setName( ( String ) newValue );
            return;
        case AsdPackage.APPLICATION__ORIGIN_UUID:
            setOriginUuid( ( String ) newValue );
            return;
        case AsdPackage.APPLICATION__TEMPLATE_UUID:
            setTemplateUuid( ( String ) newValue );
            return;
        case AsdPackage.APPLICATION__TYPE:
            setType( ( String ) newValue );
            return;
        case AsdPackage.APPLICATION__UUID:
            setUuid( ( String ) newValue );
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
        case AsdPackage.APPLICATION__FUNCTION_ROLE:
            unsetFunctionRole();
            return;
        case AsdPackage.APPLICATION__FUNCTIONAL_VARIANT:
            unsetFunctionalVariant();
            return;
        case AsdPackage.APPLICATION__FUNCTIONAL_VARIANT_GROUP:
            unsetFunctionalVariantGroup();
            return;
        case AsdPackage.APPLICATION__ALLOCATION_ROLE_REF:
            unsetAllocationRoleRef();
            return;
        case AsdPackage.APPLICATION__APPLICATION_SCL_REF:
            unsetApplicationSclRef();
            return;
        case AsdPackage.APPLICATION__NAME:
            setName( NAME_EDEFAULT );
            return;
        case AsdPackage.APPLICATION__ORIGIN_UUID:
            setOriginUuid( ORIGIN_UUID_EDEFAULT );
            return;
        case AsdPackage.APPLICATION__TEMPLATE_UUID:
            setTemplateUuid( TEMPLATE_UUID_EDEFAULT );
            return;
        case AsdPackage.APPLICATION__TYPE:
            setType( TYPE_EDEFAULT );
            return;
        case AsdPackage.APPLICATION__UUID:
            setUuid( UUID_EDEFAULT );
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
        case AsdPackage.APPLICATION__FUNCTION_ROLE:
            return isSetFunctionRole();
        case AsdPackage.APPLICATION__FUNCTIONAL_VARIANT:
            return isSetFunctionalVariant();
        case AsdPackage.APPLICATION__FUNCTIONAL_VARIANT_GROUP:
            return isSetFunctionalVariantGroup();
        case AsdPackage.APPLICATION__ALLOCATION_ROLE_REF:
            return isSetAllocationRoleRef();
        case AsdPackage.APPLICATION__APPLICATION_SCL_REF:
            return isSetApplicationSclRef();
        case AsdPackage.APPLICATION__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals( name );
        case AsdPackage.APPLICATION__ORIGIN_UUID:
            return ORIGIN_UUID_EDEFAULT == null ? originUuid != null : !ORIGIN_UUID_EDEFAULT.equals( originUuid );
        case AsdPackage.APPLICATION__TEMPLATE_UUID:
            return TEMPLATE_UUID_EDEFAULT == null ? templateUuid != null
                    : !TEMPLATE_UUID_EDEFAULT.equals( templateUuid );
        case AsdPackage.APPLICATION__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals( type );
        case AsdPackage.APPLICATION__UUID:
            return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals( uuid );
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
        result.append( " (name: " );
        result.append( name );
        result.append( ", originUuid: " );
        result.append( originUuid );
        result.append( ", templateUuid: " );
        result.append( templateUuid );
        result.append( ", type: " );
        result.append( type );
        result.append( ", uuid: " );
        result.append( uuid );
        result.append( ')' );
        return result.toString();
    }

} //ApplicationImpl
