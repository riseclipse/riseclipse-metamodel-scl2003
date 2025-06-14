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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.P_PhysConn;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PPhys Conn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.P_PhysConnImpl#getParentPhysConn <em>Parent Phys Conn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class P_PhysConnImpl extends PAddrImpl implements P_PhysConn {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected P_PhysConnImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getP_PhysConn();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhysConn getParentPhysConn() {
        if( eContainerFeatureID() != SclPackage.PPHYS_CONN__PARENT_PHYS_CONN ) return null;
        return ( PhysConn ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentPhysConn( PhysConn newParentPhysConn, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentPhysConn, SclPackage.PPHYS_CONN__PARENT_PHYS_CONN,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentPhysConn( PhysConn newParentPhysConn ) {
        if( newParentPhysConn != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.PPHYS_CONN__PARENT_PHYS_CONN && newParentPhysConn != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentPhysConn ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentPhysConn != null )
                msgs = ( ( InternalEObject ) newParentPhysConn ).eInverseAdd( this, SclPackage.PHYS_CONN__P,
                        PhysConn.class, msgs );
            msgs = basicSetParentPhysConn( newParentPhysConn, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.PPHYS_CONN__PARENT_PHYS_CONN,
                    newParentPhysConn, newParentPhysConn ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.PPHYS_CONN__PARENT_PHYS_CONN:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentPhysConn( ( PhysConn ) otherEnd, msgs );
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
        case SclPackage.PPHYS_CONN__PARENT_PHYS_CONN:
            return basicSetParentPhysConn( null, msgs );
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
        case SclPackage.PPHYS_CONN__PARENT_PHYS_CONN:
            return eInternalContainer().eInverseRemove( this, SclPackage.PHYS_CONN__P, PhysConn.class, msgs );
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
        case SclPackage.PPHYS_CONN__PARENT_PHYS_CONN:
            return getParentPhysConn();
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
        case SclPackage.PPHYS_CONN__PARENT_PHYS_CONN:
            setParentPhysConn( ( PhysConn ) newValue );
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
        case SclPackage.PPHYS_CONN__PARENT_PHYS_CONN:
            setParentPhysConn( ( PhysConn ) null );
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
        case SclPackage.PPHYS_CONN__PARENT_PHYS_CONN:
            return getParentPhysConn() != null;
        }
        return super.eIsSet( featureID );
    }

    @Override
    public String getXpath() {
        return getParentPhysConn().getXpath() + "/scl:P_PhysConn[@type='" + getType() + "']";
    }

} //P_PhysConnImpl
