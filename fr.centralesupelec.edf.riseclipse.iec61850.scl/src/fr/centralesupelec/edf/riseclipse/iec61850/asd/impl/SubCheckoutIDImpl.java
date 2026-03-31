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

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCheckoutID;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Checkout ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubCheckoutIDImpl#getParentCheckoutID <em>Parent Checkout ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubCheckoutIDImpl extends CheckoutIDImpl implements SubCheckoutID {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubCheckoutIDImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getSubCheckoutID();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CheckoutID getParentCheckoutID() {
        if( eContainerFeatureID() != AsdPackage.SUB_CHECKOUT_ID__PARENT_CHECKOUT_ID ) return null;
        return ( CheckoutID ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentCheckoutID( CheckoutID newParentCheckoutID, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentCheckoutID,
                AsdPackage.SUB_CHECKOUT_ID__PARENT_CHECKOUT_ID, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentCheckoutID( CheckoutID newParentCheckoutID ) {
        if( newParentCheckoutID != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.SUB_CHECKOUT_ID__PARENT_CHECKOUT_ID
                        && newParentCheckoutID != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentCheckoutID ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentCheckoutID != null )
                msgs = ( ( InternalEObject ) newParentCheckoutID ).eInverseAdd( this,
                        AsdPackage.CHECKOUT_ID__SUB_CHECKOUT_ID, CheckoutID.class, msgs );
            msgs = basicSetParentCheckoutID( newParentCheckoutID, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SUB_CHECKOUT_ID__PARENT_CHECKOUT_ID,
                    newParentCheckoutID, newParentCheckoutID ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.SUB_CHECKOUT_ID__PARENT_CHECKOUT_ID:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentCheckoutID( ( CheckoutID ) otherEnd, msgs );
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
        case AsdPackage.SUB_CHECKOUT_ID__PARENT_CHECKOUT_ID:
            return basicSetParentCheckoutID( null, msgs );
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
        case AsdPackage.SUB_CHECKOUT_ID__PARENT_CHECKOUT_ID:
            return eInternalContainer().eInverseRemove( this, AsdPackage.CHECKOUT_ID__SUB_CHECKOUT_ID, CheckoutID.class,
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
        case AsdPackage.SUB_CHECKOUT_ID__PARENT_CHECKOUT_ID:
            return getParentCheckoutID();
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
        case AsdPackage.SUB_CHECKOUT_ID__PARENT_CHECKOUT_ID:
            setParentCheckoutID( ( CheckoutID ) newValue );
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
        case AsdPackage.SUB_CHECKOUT_ID__PARENT_CHECKOUT_ID:
            setParentCheckoutID( ( CheckoutID ) null );
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
        case AsdPackage.SUB_CHECKOUT_ID__PARENT_CHECKOUT_ID:
            return getParentCheckoutID() != null;
        }
        return super.eIsSet( featureID );
    }

} //SubCheckoutIDImpl
