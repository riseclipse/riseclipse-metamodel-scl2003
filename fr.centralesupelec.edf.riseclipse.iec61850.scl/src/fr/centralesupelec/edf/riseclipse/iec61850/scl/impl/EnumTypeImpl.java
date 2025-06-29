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

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EnumTypeImpl#getReferredByAbstractDataAttribute <em>Referred By Abstract Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EnumTypeImpl#getParentDataTypeTemplates <em>Parent Data Type Templates</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EnumTypeImpl#getEnumVal <em>Enum Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumTypeImpl extends IDNamingImpl implements EnumType {
    /**
     * The cached value of the '{@link #getReferredByAbstractDataAttribute() <em>Referred By Abstract Data Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByAbstractDataAttribute()
     * @generated
     * @ordered
     */
    protected EList< AbstractDataAttribute > referredByAbstractDataAttribute;

    /**
     * The cached value of the '{@link #getEnumVal() <em>Enum Val</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnumVal()
     * @generated
     * @ordered
     */
    protected EList< EnumVal > enumVal;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnumTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getEnumType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AbstractDataAttribute > getReferredByAbstractDataAttribute() {
        if( referredByAbstractDataAttribute == null ) {
            referredByAbstractDataAttribute = new EObjectWithInverseEList.Unsettable< AbstractDataAttribute >(
                    AbstractDataAttribute.class, this, SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE,
                    SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE );
        }
        return referredByAbstractDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByAbstractDataAttribute() {
        if( referredByAbstractDataAttribute != null )
            ( ( InternalEList.Unsettable< ? > ) referredByAbstractDataAttribute ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByAbstractDataAttribute() {
        return referredByAbstractDataAttribute != null
                && ( ( InternalEList.Unsettable< ? > ) referredByAbstractDataAttribute ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataTypeTemplates getParentDataTypeTemplates() {
        if( eContainerFeatureID() != SclPackage.ENUM_TYPE__PARENT_DATA_TYPE_TEMPLATES ) return null;
        return ( DataTypeTemplates ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentDataTypeTemplates( DataTypeTemplates newParentDataTypeTemplates,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDataTypeTemplates,
                SclPackage.ENUM_TYPE__PARENT_DATA_TYPE_TEMPLATES, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentDataTypeTemplates( DataTypeTemplates newParentDataTypeTemplates ) {
        if( newParentDataTypeTemplates != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.ENUM_TYPE__PARENT_DATA_TYPE_TEMPLATES
                        && newParentDataTypeTemplates != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDataTypeTemplates ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentDataTypeTemplates != null )
                msgs = ( ( InternalEObject ) newParentDataTypeTemplates ).eInverseAdd( this,
                        SclPackage.DATA_TYPE_TEMPLATES__ENUM_TYPE, DataTypeTemplates.class, msgs );
            msgs = basicSetParentDataTypeTemplates( newParentDataTypeTemplates, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ENUM_TYPE__PARENT_DATA_TYPE_TEMPLATES,
                    newParentDataTypeTemplates, newParentDataTypeTemplates ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EnumVal > getEnumVal() {
        if( enumVal == null ) {
            enumVal = new EObjectContainmentWithInverseEList.Unsettable< EnumVal >( EnumVal.class, this,
                    SclPackage.ENUM_TYPE__ENUM_VAL, SclPackage.ENUM_VAL__PARENT_ENUM_TYPE );
        }
        return enumVal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnumVal() {
        if( enumVal != null ) ( ( InternalEList.Unsettable< ? > ) enumVal ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnumVal() {
        return enumVal != null && ( ( InternalEList.Unsettable< ? > ) enumVal ).isSet();
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
        case SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByAbstractDataAttribute() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.ENUM_TYPE__PARENT_DATA_TYPE_TEMPLATES:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentDataTypeTemplates( ( DataTypeTemplates ) otherEnd, msgs );
        case SclPackage.ENUM_TYPE__ENUM_VAL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEnumVal() ).basicAdd( otherEnd,
                    msgs );
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
        case SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE:
            return ( ( InternalEList< ? > ) getReferredByAbstractDataAttribute() ).basicRemove( otherEnd, msgs );
        case SclPackage.ENUM_TYPE__PARENT_DATA_TYPE_TEMPLATES:
            return basicSetParentDataTypeTemplates( null, msgs );
        case SclPackage.ENUM_TYPE__ENUM_VAL:
            return ( ( InternalEList< ? > ) getEnumVal() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs ) {
        switch( eContainerFeatureID() ) {
        case SclPackage.ENUM_TYPE__PARENT_DATA_TYPE_TEMPLATES:
            return eInternalContainer().eInverseRemove( this, SclPackage.DATA_TYPE_TEMPLATES__ENUM_TYPE,
                    DataTypeTemplates.class, msgs );
        }
        return super.eBasicRemoveFromContainerFeature( msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE:
            return getReferredByAbstractDataAttribute();
        case SclPackage.ENUM_TYPE__PARENT_DATA_TYPE_TEMPLATES:
            return getParentDataTypeTemplates();
        case SclPackage.ENUM_TYPE__ENUM_VAL:
            return getEnumVal();
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
        case SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE:
            getReferredByAbstractDataAttribute().clear();
            getReferredByAbstractDataAttribute().addAll( ( Collection< ? extends AbstractDataAttribute > ) newValue );
            return;
        case SclPackage.ENUM_TYPE__PARENT_DATA_TYPE_TEMPLATES:
            setParentDataTypeTemplates( ( DataTypeTemplates ) newValue );
            return;
        case SclPackage.ENUM_TYPE__ENUM_VAL:
            getEnumVal().clear();
            getEnumVal().addAll( ( Collection< ? extends EnumVal > ) newValue );
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
        case SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE:
            unsetReferredByAbstractDataAttribute();
            return;
        case SclPackage.ENUM_TYPE__PARENT_DATA_TYPE_TEMPLATES:
            setParentDataTypeTemplates( ( DataTypeTemplates ) null );
            return;
        case SclPackage.ENUM_TYPE__ENUM_VAL:
            unsetEnumVal();
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
        case SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE:
            return isSetReferredByAbstractDataAttribute();
        case SclPackage.ENUM_TYPE__PARENT_DATA_TYPE_TEMPLATES:
            return getParentDataTypeTemplates() != null;
        case SclPackage.ENUM_TYPE__ENUM_VAL:
            return isSetEnumVal();
        }
        return super.eIsSet( featureID );
    }

    @Override
    public String getXpath() {
        return getParentDataTypeTemplates().getXpath() + "/scl:EnumType[@id='" + getId() + "']";
    }

} //EnumTypeImpl
