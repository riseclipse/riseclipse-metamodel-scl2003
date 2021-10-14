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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSecurity;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMV Security</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSecurityImpl#getParentAccessPoint <em>Parent Access Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SMVSecurityImpl extends CertificateImpl implements SMVSecurity {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SMVSecurityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSMVSecurity();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccessPoint getParentAccessPoint() {
        if( eContainerFeatureID() != SclPackage.SMV_SECURITY__PARENT_ACCESS_POINT ) return null;
        return ( AccessPoint ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAccessPoint( AccessPoint newParentAccessPoint, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentAccessPoint,
                SclPackage.SMV_SECURITY__PARENT_ACCESS_POINT, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAccessPoint( AccessPoint newParentAccessPoint ) {
        if( newParentAccessPoint != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SMV_SECURITY__PARENT_ACCESS_POINT
                        && newParentAccessPoint != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentAccessPoint ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentAccessPoint != null )
                msgs = ( ( InternalEObject ) newParentAccessPoint ).eInverseAdd( this,
                        SclPackage.ACCESS_POINT__SMV_SECURITY, AccessPoint.class, msgs );
            msgs = basicSetParentAccessPoint( newParentAccessPoint, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SMV_SECURITY__PARENT_ACCESS_POINT,
                    newParentAccessPoint, newParentAccessPoint ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.SMV_SECURITY__PARENT_ACCESS_POINT:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentAccessPoint( ( AccessPoint ) otherEnd, msgs );
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
        case SclPackage.SMV_SECURITY__PARENT_ACCESS_POINT:
            return basicSetParentAccessPoint( null, msgs );
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
        case SclPackage.SMV_SECURITY__PARENT_ACCESS_POINT:
            return eInternalContainer().eInverseRemove( this, SclPackage.ACCESS_POINT__SMV_SECURITY, AccessPoint.class,
                    msgs );
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
        case SclPackage.SMV_SECURITY__PARENT_ACCESS_POINT:
            return getParentAccessPoint();
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
        case SclPackage.SMV_SECURITY__PARENT_ACCESS_POINT:
            setParentAccessPoint( ( AccessPoint ) newValue );
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
        case SclPackage.SMV_SECURITY__PARENT_ACCESS_POINT:
            setParentAccessPoint( ( AccessPoint ) null );
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
        case SclPackage.SMV_SECURITY__PARENT_ACCESS_POINT:
            return getParentAccessPoint() != null;
        }
        return super.eIsSet( featureID );
    }

} //SMVSecurityImpl
