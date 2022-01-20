/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Data Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataObjectImpl#getRefersToDOType <em>Refers To DO Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataObjectImpl#getReferredByExtRef <em>Referred By Ext Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractDataObjectImpl extends UnNamingImpl implements AbstractDataObject {
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
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

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
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The cached value of the '{@link #getRefersToDOType() <em>Refers To DO Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToDOType()
     * @generated
     * @ordered
     */
    protected DOType refersToDOType;

    /**
     * This is true if the Refers To DO Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToDOTypeESet;

    /**
     * The cached value of the '{@link #getReferredByExtRef() <em>Referred By Ext Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByExtRef()
     * @generated
     * @ordered
     */
    protected EList< ExtRef > referredByExtRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractDataObjectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getAbstractDataObject();
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
        boolean oldNameESet = nameESet;
        nameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ABSTRACT_DATA_OBJECT__NAME, oldName,
                    name, !oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ABSTRACT_DATA_OBJECT__NAME, oldName,
                    NAME_EDEFAULT, oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
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
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ABSTRACT_DATA_OBJECT__TYPE, oldType,
                    type, !oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ABSTRACT_DATA_OBJECT__TYPE, oldType,
                    TYPE_EDEFAULT, oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DOType getRefersToDOType() {
        return refersToDOType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToDOType( DOType newRefersToDOType, NotificationChain msgs ) {
        DOType oldRefersToDOType = refersToDOType;
        refersToDOType = newRefersToDOType;
        boolean oldRefersToDOTypeESet = refersToDOTypeESet;
        refersToDOTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.ABSTRACT_DATA_OBJECT__REFERS_TO_DO_TYPE, oldRefersToDOType, newRefersToDOType,
                    !oldRefersToDOTypeESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToDOType( DOType newRefersToDOType ) {
        if( newRefersToDOType != refersToDOType ) {
            NotificationChain msgs = null;
            if( refersToDOType != null )
                msgs = ( ( InternalEObject ) refersToDOType ).eInverseRemove( this,
                        SclPackage.DO_TYPE__REFERRED_BY_ABSTRACT_DATA_OBJECT, DOType.class, msgs );
            if( newRefersToDOType != null )
                msgs = ( ( InternalEObject ) newRefersToDOType ).eInverseAdd( this,
                        SclPackage.DO_TYPE__REFERRED_BY_ABSTRACT_DATA_OBJECT, DOType.class, msgs );
            msgs = basicSetRefersToDOType( newRefersToDOType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDOTypeESet = refersToDOTypeESet;
            refersToDOTypeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        SclPackage.ABSTRACT_DATA_OBJECT__REFERS_TO_DO_TYPE, newRefersToDOType, newRefersToDOType,
                        !oldRefersToDOTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToDOType( NotificationChain msgs ) {
        DOType oldRefersToDOType = refersToDOType;
        refersToDOType = null;
        boolean oldRefersToDOTypeESet = refersToDOTypeESet;
        refersToDOTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.ABSTRACT_DATA_OBJECT__REFERS_TO_DO_TYPE, oldRefersToDOType, null,
                    oldRefersToDOTypeESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToDOType() {
        if( refersToDOType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToDOType ).eInverseRemove( this,
                    SclPackage.DO_TYPE__REFERRED_BY_ABSTRACT_DATA_OBJECT, DOType.class, msgs );
            msgs = basicUnsetRefersToDOType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDOTypeESet = refersToDOTypeESet;
            refersToDOTypeESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        SclPackage.ABSTRACT_DATA_OBJECT__REFERS_TO_DO_TYPE, null, null, oldRefersToDOTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToDOType() {
        return refersToDOTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ExtRef > getReferredByExtRef() {
        if( referredByExtRef == null ) {
            referredByExtRef = new EObjectWithInverseEList.Unsettable< ExtRef >( ExtRef.class, this,
                    SclPackage.ABSTRACT_DATA_OBJECT__REFERRED_BY_EXT_REF,
                    SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_OBJECT );
        }
        return referredByExtRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByExtRef() {
        if( referredByExtRef != null ) ( ( InternalEList.Unsettable< ? > ) referredByExtRef ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByExtRef() {
        return referredByExtRef != null && ( ( InternalEList.Unsettable< ? > ) referredByExtRef ).isSet();
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
        case SclPackage.ABSTRACT_DATA_OBJECT__REFERS_TO_DO_TYPE:
            if( refersToDOType != null )
                msgs = ( ( InternalEObject ) refersToDOType ).eInverseRemove( this,
                        SclPackage.DO_TYPE__REFERRED_BY_ABSTRACT_DATA_OBJECT, DOType.class, msgs );
            return basicSetRefersToDOType( ( DOType ) otherEnd, msgs );
        case SclPackage.ABSTRACT_DATA_OBJECT__REFERRED_BY_EXT_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByExtRef() )
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
        case SclPackage.ABSTRACT_DATA_OBJECT__REFERS_TO_DO_TYPE:
            return basicUnsetRefersToDOType( msgs );
        case SclPackage.ABSTRACT_DATA_OBJECT__REFERRED_BY_EXT_REF:
            return ( ( InternalEList< ? > ) getReferredByExtRef() ).basicRemove( otherEnd, msgs );
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
        case SclPackage.ABSTRACT_DATA_OBJECT__NAME:
            return getName();
        case SclPackage.ABSTRACT_DATA_OBJECT__TYPE:
            return getType();
        case SclPackage.ABSTRACT_DATA_OBJECT__REFERS_TO_DO_TYPE:
            return getRefersToDOType();
        case SclPackage.ABSTRACT_DATA_OBJECT__REFERRED_BY_EXT_REF:
            return getReferredByExtRef();
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
        case SclPackage.ABSTRACT_DATA_OBJECT__NAME:
            setName( ( String ) newValue );
            return;
        case SclPackage.ABSTRACT_DATA_OBJECT__TYPE:
            setType( ( String ) newValue );
            return;
        case SclPackage.ABSTRACT_DATA_OBJECT__REFERS_TO_DO_TYPE:
            setRefersToDOType( ( DOType ) newValue );
            return;
        case SclPackage.ABSTRACT_DATA_OBJECT__REFERRED_BY_EXT_REF:
            getReferredByExtRef().clear();
            getReferredByExtRef().addAll( ( Collection< ? extends ExtRef > ) newValue );
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
        case SclPackage.ABSTRACT_DATA_OBJECT__NAME:
            unsetName();
            return;
        case SclPackage.ABSTRACT_DATA_OBJECT__TYPE:
            unsetType();
            return;
        case SclPackage.ABSTRACT_DATA_OBJECT__REFERS_TO_DO_TYPE:
            unsetRefersToDOType();
            return;
        case SclPackage.ABSTRACT_DATA_OBJECT__REFERRED_BY_EXT_REF:
            unsetReferredByExtRef();
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
        case SclPackage.ABSTRACT_DATA_OBJECT__NAME:
            return isSetName();
        case SclPackage.ABSTRACT_DATA_OBJECT__TYPE:
            return isSetType();
        case SclPackage.ABSTRACT_DATA_OBJECT__REFERS_TO_DO_TYPE:
            return isSetRefersToDOType();
        case SclPackage.ABSTRACT_DATA_OBJECT__REFERRED_BY_EXT_REF:
            return isSetReferredByExtRef();
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
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ", type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AbstractDataObjectImpl
