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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableImpl#getVariableApplyTo <em>Variable Apply To</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableImpl#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableImpl#getTemplateUuid <em>Template Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableImpl#getReferredByVariableRef <em>Referred By Variable Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends BaseExtensionElementWithDescImpl implements Variable {
    /**
     * The cached value of the '{@link #getVariableApplyTo() <em>Variable Apply To</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariableApplyTo()
     * @generated
     * @ordered
     */
    protected EList< VariableApplyTo > variableApplyTo;

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
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * The cached value of the '{@link #getReferredByVariableRef() <em>Referred By Variable Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByVariableRef()
     * @generated
     * @ordered
     */
    protected EList< VariableRef > referredByVariableRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getVariable();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< VariableApplyTo > getVariableApplyTo() {
        if( variableApplyTo == null ) {
            variableApplyTo = new EObjectContainmentWithInverseEList.Unsettable< >(
                    VariableApplyTo.class, this, AsdPackage.VARIABLE__VARIABLE_APPLY_TO,
                    AsdPackage.VARIABLE_APPLY_TO__PARENT_VARIABLE );
        }
        return variableApplyTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVariableApplyTo() {
        if( variableApplyTo != null ) {
            ( ( InternalEList.Unsettable< ? > ) variableApplyTo ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVariableApplyTo() {
        return variableApplyTo != null && ( ( InternalEList.Unsettable< ? > ) variableApplyTo ).isSet();
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.VARIABLE__NAME, oldName, name ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.VARIABLE__ORIGIN_UUID, oldOriginUuid,
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.VARIABLE__TEMPLATE_UUID, oldTemplateUuid,
                    templateUuid ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.VARIABLE__UUID, oldUuid, uuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue( String newValue ) {
        String oldValue = value;
        value = newValue;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.VARIABLE__VALUE, oldValue, value ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< VariableRef > getReferredByVariableRef() {
        if( referredByVariableRef == null ) {
            referredByVariableRef = new EObjectWithInverseResolvingEList.Unsettable< >( VariableRef.class,
                    this, AsdPackage.VARIABLE__REFERRED_BY_VARIABLE_REF, AsdPackage.VARIABLE_REF__REFERS_TO_VARIABLE );
        }
        return referredByVariableRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByVariableRef() {
        if( referredByVariableRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByVariableRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByVariableRef() {
        return referredByVariableRef != null && ( ( InternalEList.Unsettable< ? > ) referredByVariableRef ).isSet();
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
        case AsdPackage.VARIABLE__VARIABLE_APPLY_TO:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getVariableApplyTo() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.VARIABLE__REFERRED_BY_VARIABLE_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByVariableRef() )
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
        case AsdPackage.VARIABLE__VARIABLE_APPLY_TO:
            return ( ( InternalEList< ? > ) getVariableApplyTo() ).basicRemove( otherEnd, msgs );
        case AsdPackage.VARIABLE__REFERRED_BY_VARIABLE_REF:
            return ( ( InternalEList< ? > ) getReferredByVariableRef() ).basicRemove( otherEnd, msgs );
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
        case AsdPackage.VARIABLE__VARIABLE_APPLY_TO:
            return getVariableApplyTo();
        case AsdPackage.VARIABLE__NAME:
            return getName();
        case AsdPackage.VARIABLE__ORIGIN_UUID:
            return getOriginUuid();
        case AsdPackage.VARIABLE__TEMPLATE_UUID:
            return getTemplateUuid();
        case AsdPackage.VARIABLE__UUID:
            return getUuid();
        case AsdPackage.VARIABLE__VALUE:
            return getValue();
        case AsdPackage.VARIABLE__REFERRED_BY_VARIABLE_REF:
            return getReferredByVariableRef();
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
        case AsdPackage.VARIABLE__VARIABLE_APPLY_TO:
            getVariableApplyTo().clear();
            getVariableApplyTo().addAll( ( Collection< ? extends VariableApplyTo > ) newValue );
            return;
        case AsdPackage.VARIABLE__NAME:
            setName( ( String ) newValue );
            return;
        case AsdPackage.VARIABLE__ORIGIN_UUID:
            setOriginUuid( ( String ) newValue );
            return;
        case AsdPackage.VARIABLE__TEMPLATE_UUID:
            setTemplateUuid( ( String ) newValue );
            return;
        case AsdPackage.VARIABLE__UUID:
            setUuid( ( String ) newValue );
            return;
        case AsdPackage.VARIABLE__VALUE:
            setValue( ( String ) newValue );
            return;
        case AsdPackage.VARIABLE__REFERRED_BY_VARIABLE_REF:
            getReferredByVariableRef().clear();
            getReferredByVariableRef().addAll( ( Collection< ? extends VariableRef > ) newValue );
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
        case AsdPackage.VARIABLE__VARIABLE_APPLY_TO:
            unsetVariableApplyTo();
            return;
        case AsdPackage.VARIABLE__NAME:
            setName( NAME_EDEFAULT );
            return;
        case AsdPackage.VARIABLE__ORIGIN_UUID:
            setOriginUuid( ORIGIN_UUID_EDEFAULT );
            return;
        case AsdPackage.VARIABLE__TEMPLATE_UUID:
            setTemplateUuid( TEMPLATE_UUID_EDEFAULT );
            return;
        case AsdPackage.VARIABLE__UUID:
            setUuid( UUID_EDEFAULT );
            return;
        case AsdPackage.VARIABLE__VALUE:
            setValue( VALUE_EDEFAULT );
            return;
        case AsdPackage.VARIABLE__REFERRED_BY_VARIABLE_REF:
            unsetReferredByVariableRef();
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
        case AsdPackage.VARIABLE__VARIABLE_APPLY_TO:
            return isSetVariableApplyTo();
        case AsdPackage.VARIABLE__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals( name );
        case AsdPackage.VARIABLE__ORIGIN_UUID:
            return ORIGIN_UUID_EDEFAULT == null ? originUuid != null : !ORIGIN_UUID_EDEFAULT.equals( originUuid );
        case AsdPackage.VARIABLE__TEMPLATE_UUID:
            return TEMPLATE_UUID_EDEFAULT == null ? templateUuid != null
                    : !TEMPLATE_UUID_EDEFAULT.equals( templateUuid );
        case AsdPackage.VARIABLE__UUID:
            return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals( uuid );
        case AsdPackage.VARIABLE__VALUE:
            return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals( value );
        case AsdPackage.VARIABLE__REFERRED_BY_VARIABLE_REF:
            return isSetReferredByVariableRef();
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
        result.append( ", uuid: " );
        result.append( uuid );
        result.append( ", value: " );
        result.append( value );
        result.append( ')' );
        return result.toString();
    }

} //VariableImpl
