/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessControlImpl#getParentLDevice <em>Parent LDevice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessControlImpl extends SclObjectImpl implements AccessControl {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AccessControlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getAccessControl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LDevice getParentLDevice() {
        if( eContainerFeatureID() != SclPackage.ACCESS_CONTROL__PARENT_LDEVICE ) return null;
        return ( LDevice ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentLDevice( LDevice newParentLDevice, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentLDevice, SclPackage.ACCESS_CONTROL__PARENT_LDEVICE,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentLDevice( LDevice newParentLDevice ) {
        if( newParentLDevice != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.ACCESS_CONTROL__PARENT_LDEVICE
                        && newParentLDevice != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentLDevice ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentLDevice != null )
                msgs = ( ( InternalEObject ) newParentLDevice ).eInverseAdd( this, SclPackage.LDEVICE__ACCESS_CONTROL,
                        LDevice.class, msgs );
            msgs = basicSetParentLDevice( newParentLDevice, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ACCESS_CONTROL__PARENT_LDEVICE,
                    newParentLDevice, newParentLDevice ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.ACCESS_CONTROL__PARENT_LDEVICE:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentLDevice( ( LDevice ) otherEnd, msgs );
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
        case SclPackage.ACCESS_CONTROL__PARENT_LDEVICE:
            return basicSetParentLDevice( null, msgs );
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
        case SclPackage.ACCESS_CONTROL__PARENT_LDEVICE:
            return eInternalContainer().eInverseRemove( this, SclPackage.LDEVICE__ACCESS_CONTROL, LDevice.class, msgs );
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
        case SclPackage.ACCESS_CONTROL__PARENT_LDEVICE:
            return getParentLDevice();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case SclPackage.ACCESS_CONTROL__PARENT_LDEVICE:
            setParentLDevice( ( LDevice ) newValue );
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
        case SclPackage.ACCESS_CONTROL__PARENT_LDEVICE:
            setParentLDevice( ( LDevice ) null );
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
        case SclPackage.ACCESS_CONTROL__PARENT_LDEVICE:
            return getParentLDevice() != null;
        }
        return super.eIsSet( featureID );
    }

} //AccessControlImpl
