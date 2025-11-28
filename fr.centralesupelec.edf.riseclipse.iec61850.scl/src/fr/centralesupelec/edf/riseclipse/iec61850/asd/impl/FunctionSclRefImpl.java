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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionSclRef;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileReference;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Scl Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionSclRefImpl#getSclFileReference <em>Scl File Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionSclRefImpl extends BaseExtensionElementImpl implements FunctionSclRef {
    /**
     * The cached value of the '{@link #getSclFileReference() <em>Scl File Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSclFileReference()
     * @generated
     * @ordered
     */
    protected SclFileReference sclFileReference;

    /**
     * This is true if the Scl File Reference containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sclFileReferenceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FunctionSclRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getFunctionSclRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SclFileReference getSclFileReference() {
        return sclFileReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSclFileReference( SclFileReference newSclFileReference, NotificationChain msgs ) {
        SclFileReference oldSclFileReference = sclFileReference;
        sclFileReference = newSclFileReference;
        boolean oldSclFileReferenceESet = sclFileReferenceESet;
        sclFileReferenceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.FUNCTION_SCL_REF__SCL_FILE_REFERENCE, oldSclFileReference, newSclFileReference,
                    !oldSclFileReferenceESet );
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
    public void setSclFileReference( SclFileReference newSclFileReference ) {
        if( newSclFileReference != sclFileReference ) {
            NotificationChain msgs = null;
            if( sclFileReference != null )
                msgs = ( ( InternalEObject ) sclFileReference ).eInverseRemove( this,
                        SclPackage.SCL_FILE_REFERENCE__PARENT_FUNCTION_SCL_REF, SclFileReference.class, msgs );
            if( newSclFileReference != null )
                msgs = ( ( InternalEObject ) newSclFileReference ).eInverseAdd( this,
                        SclPackage.SCL_FILE_REFERENCE__PARENT_FUNCTION_SCL_REF, SclFileReference.class, msgs );
            msgs = basicSetSclFileReference( newSclFileReference, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSclFileReferenceESet = sclFileReferenceESet;
            sclFileReferenceESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_SCL_REF__SCL_FILE_REFERENCE,
                        newSclFileReference, newSclFileReference, !oldSclFileReferenceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSclFileReference( NotificationChain msgs ) {
        SclFileReference oldSclFileReference = sclFileReference;
        sclFileReference = null;
        boolean oldSclFileReferenceESet = sclFileReferenceESet;
        sclFileReferenceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.FUNCTION_SCL_REF__SCL_FILE_REFERENCE, oldSclFileReference, null,
                    oldSclFileReferenceESet );
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
    public void unsetSclFileReference() {
        if( sclFileReference != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) sclFileReference ).eInverseRemove( this,
                    SclPackage.SCL_FILE_REFERENCE__PARENT_FUNCTION_SCL_REF, SclFileReference.class, msgs );
            msgs = basicUnsetSclFileReference( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSclFileReferenceESet = sclFileReferenceESet;
            sclFileReferenceESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.FUNCTION_SCL_REF__SCL_FILE_REFERENCE, null, null, oldSclFileReferenceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSclFileReference() {
        return sclFileReferenceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.FUNCTION_SCL_REF__SCL_FILE_REFERENCE:
            if( sclFileReference != null )
                msgs = ( ( InternalEObject ) sclFileReference ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.FUNCTION_SCL_REF__SCL_FILE_REFERENCE, null, msgs );
            return basicSetSclFileReference( ( SclFileReference ) otherEnd, msgs );
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
        case AsdPackage.FUNCTION_SCL_REF__SCL_FILE_REFERENCE:
            return basicUnsetSclFileReference( msgs );
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
        case AsdPackage.FUNCTION_SCL_REF__SCL_FILE_REFERENCE:
            return getSclFileReference();
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
        case AsdPackage.FUNCTION_SCL_REF__SCL_FILE_REFERENCE:
            setSclFileReference( ( SclFileReference ) newValue );
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
        case AsdPackage.FUNCTION_SCL_REF__SCL_FILE_REFERENCE:
            unsetSclFileReference();
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
        case AsdPackage.FUNCTION_SCL_REF__SCL_FILE_REFERENCE:
            return isSetSclFileReference();
        }
        return super.eIsSet( featureID );
    }

} //FunctionSclRefImpl
