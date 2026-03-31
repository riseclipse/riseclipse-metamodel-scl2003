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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclFileReferenceImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Checkout ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.CheckoutIDImpl#getSubCheckoutID <em>Sub Checkout ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.CheckoutIDImpl#getEngRight <em>Eng Right</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.CheckoutIDImpl#getHeaderId <em>Header Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckoutIDImpl extends SclFileReferenceImpl implements CheckoutID {
    /**
     * The cached value of the '{@link #getSubCheckoutID() <em>Sub Checkout ID</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubCheckoutID()
     * @generated
     * @ordered
     */
    protected SubCheckoutID subCheckoutID;

    /**
     * This is true if the Sub Checkout ID containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean subCheckoutIDESet;

    /**
     * The default value of the '{@link #getEngRight() <em>Eng Right</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEngRight()
     * @generated
     * @ordered
     */
    protected static final String ENG_RIGHT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEngRight() <em>Eng Right</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEngRight()
     * @generated
     * @ordered
     */
    protected String engRight = ENG_RIGHT_EDEFAULT;

    /**
     * This is true if the Eng Right attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean engRightESet;

    /**
     * The default value of the '{@link #getHeaderId() <em>Header Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeaderId()
     * @generated
     * @ordered
     */
    protected static final String HEADER_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHeaderId() <em>Header Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeaderId()
     * @generated
     * @ordered
     */
    protected String headerId = HEADER_ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CheckoutIDImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getCheckoutID();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubCheckoutID getSubCheckoutID() {
        return subCheckoutID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubCheckoutID( SubCheckoutID newSubCheckoutID, NotificationChain msgs ) {
        SubCheckoutID oldSubCheckoutID = subCheckoutID;
        subCheckoutID = newSubCheckoutID;
        boolean oldSubCheckoutIDESet = subCheckoutIDESet;
        subCheckoutIDESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.CHECKOUT_ID__SUB_CHECKOUT_ID, oldSubCheckoutID, newSubCheckoutID,
                    !oldSubCheckoutIDESet );
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
    public void setSubCheckoutID( SubCheckoutID newSubCheckoutID ) {
        if( newSubCheckoutID != subCheckoutID ) {
            NotificationChain msgs = null;
            if( subCheckoutID != null )
                msgs = ( ( InternalEObject ) subCheckoutID ).eInverseRemove( this,
                        AsdPackage.SUB_CHECKOUT_ID__PARENT_CHECKOUT_ID, SubCheckoutID.class, msgs );
            if( newSubCheckoutID != null )
                msgs = ( ( InternalEObject ) newSubCheckoutID ).eInverseAdd( this,
                        AsdPackage.SUB_CHECKOUT_ID__PARENT_CHECKOUT_ID, SubCheckoutID.class, msgs );
            msgs = basicSetSubCheckoutID( newSubCheckoutID, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSubCheckoutIDESet = subCheckoutIDESet;
            subCheckoutIDESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CHECKOUT_ID__SUB_CHECKOUT_ID,
                        newSubCheckoutID, newSubCheckoutID, !oldSubCheckoutIDESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSubCheckoutID( NotificationChain msgs ) {
        SubCheckoutID oldSubCheckoutID = subCheckoutID;
        subCheckoutID = null;
        boolean oldSubCheckoutIDESet = subCheckoutIDESet;
        subCheckoutIDESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.CHECKOUT_ID__SUB_CHECKOUT_ID, oldSubCheckoutID, null, oldSubCheckoutIDESet );
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
    public void unsetSubCheckoutID() {
        if( subCheckoutID != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) subCheckoutID ).eInverseRemove( this,
                    AsdPackage.SUB_CHECKOUT_ID__PARENT_CHECKOUT_ID, SubCheckoutID.class, msgs );
            msgs = basicUnsetSubCheckoutID( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSubCheckoutIDESet = subCheckoutIDESet;
            subCheckoutIDESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.CHECKOUT_ID__SUB_CHECKOUT_ID, null,
                        null, oldSubCheckoutIDESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubCheckoutID() {
        return subCheckoutIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getEngRight() {
        return engRight;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEngRight( String newEngRight ) {
        String oldEngRight = engRight;
        engRight = newEngRight;
        boolean oldEngRightESet = engRightESet;
        engRightESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CHECKOUT_ID__ENG_RIGHT, oldEngRight,
                    engRight, !oldEngRightESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEngRight() {
        String oldEngRight = engRight;
        boolean oldEngRightESet = engRightESet;
        engRight = ENG_RIGHT_EDEFAULT;
        engRightESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.CHECKOUT_ID__ENG_RIGHT, oldEngRight,
                    ENG_RIGHT_EDEFAULT, oldEngRightESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEngRight() {
        return engRightESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getHeaderId() {
        return headerId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHeaderId( String newHeaderId ) {
        String oldHeaderId = headerId;
        headerId = newHeaderId;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CHECKOUT_ID__HEADER_ID, oldHeaderId,
                    headerId ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.CHECKOUT_ID__SUB_CHECKOUT_ID:
            if( subCheckoutID != null )
                msgs = ( ( InternalEObject ) subCheckoutID ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.CHECKOUT_ID__SUB_CHECKOUT_ID, null, msgs );
            return basicSetSubCheckoutID( ( SubCheckoutID ) otherEnd, msgs );
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
        case AsdPackage.CHECKOUT_ID__SUB_CHECKOUT_ID:
            return basicUnsetSubCheckoutID( msgs );
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
        case AsdPackage.CHECKOUT_ID__SUB_CHECKOUT_ID:
            return getSubCheckoutID();
        case AsdPackage.CHECKOUT_ID__ENG_RIGHT:
            return getEngRight();
        case AsdPackage.CHECKOUT_ID__HEADER_ID:
            return getHeaderId();
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
        case AsdPackage.CHECKOUT_ID__SUB_CHECKOUT_ID:
            setSubCheckoutID( ( SubCheckoutID ) newValue );
            return;
        case AsdPackage.CHECKOUT_ID__ENG_RIGHT:
            setEngRight( ( String ) newValue );
            return;
        case AsdPackage.CHECKOUT_ID__HEADER_ID:
            setHeaderId( ( String ) newValue );
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
        case AsdPackage.CHECKOUT_ID__SUB_CHECKOUT_ID:
            unsetSubCheckoutID();
            return;
        case AsdPackage.CHECKOUT_ID__ENG_RIGHT:
            unsetEngRight();
            return;
        case AsdPackage.CHECKOUT_ID__HEADER_ID:
            setHeaderId( HEADER_ID_EDEFAULT );
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
        case AsdPackage.CHECKOUT_ID__SUB_CHECKOUT_ID:
            return isSetSubCheckoutID();
        case AsdPackage.CHECKOUT_ID__ENG_RIGHT:
            return isSetEngRight();
        case AsdPackage.CHECKOUT_ID__HEADER_ID:
            return HEADER_ID_EDEFAULT == null ? headerId != null : !HEADER_ID_EDEFAULT.equals( headerId );
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
        result.append( " (engRight: " );
        if( engRightESet )
            result.append( engRight );
        else
            result.append( "<unset>" );
        result.append( ", headerId: " );
        result.append( headerId );
        result.append( ')' );
        return result.toString();
    }

} //CheckoutIDImpl
