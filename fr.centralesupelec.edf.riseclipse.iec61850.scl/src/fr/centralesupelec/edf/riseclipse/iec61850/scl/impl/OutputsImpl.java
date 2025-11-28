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
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Outputs;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outputs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.OutputsImpl#getExtCtrl <em>Ext Ctrl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.OutputsImpl#getParentAnyLN <em>Parent Any LN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputsImpl extends UnNamingImpl implements Outputs {
    /**
     * The cached value of the '{@link #getExtCtrl() <em>Ext Ctrl</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtCtrl()
     * @generated
     * @ordered
     */
    protected EList< ExtCtrl > extCtrl;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OutputsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getOutputs();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ExtCtrl > getExtCtrl() {
        if( extCtrl == null ) {
            extCtrl = new EObjectContainmentWithInverseEList.Unsettable< ExtCtrl >( ExtCtrl.class, this,
                    SclPackage.OUTPUTS__EXT_CTRL, SclPackage.EXT_CTRL__PARENT_OUTPUTS );
        }
        return extCtrl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetExtCtrl() {
        if( extCtrl != null ) {
            ( ( InternalEList.Unsettable< ? > ) extCtrl ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExtCtrl() {
        return extCtrl != null && ( ( InternalEList.Unsettable< ? > ) extCtrl ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnyLN getParentAnyLN() {
        if( eContainerFeatureID() != SclPackage.OUTPUTS__PARENT_ANY_LN ) {
            return null;
        }
        return ( AnyLN ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAnyLN( AnyLN newParentAnyLN, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentAnyLN, SclPackage.OUTPUTS__PARENT_ANY_LN, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAnyLN( AnyLN newParentAnyLN ) {
        if( newParentAnyLN != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.OUTPUTS__PARENT_ANY_LN && newParentAnyLN != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentAnyLN ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentAnyLN != null ) {
                msgs = ( ( InternalEObject ) newParentAnyLN ).eInverseAdd( this, SclPackage.ANY_LN__OUTPUTS,
                        AnyLN.class, msgs );
            }
            msgs = basicSetParentAnyLN( newParentAnyLN, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.OUTPUTS__PARENT_ANY_LN, newParentAnyLN,
                    newParentAnyLN ) );
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
        case SclPackage.OUTPUTS__EXT_CTRL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getExtCtrl() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.OUTPUTS__PARENT_ANY_LN:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentAnyLN( ( AnyLN ) otherEnd, msgs );
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
        case SclPackage.OUTPUTS__EXT_CTRL:
            return ( ( InternalEList< ? > ) getExtCtrl() ).basicRemove( otherEnd, msgs );
        case SclPackage.OUTPUTS__PARENT_ANY_LN:
            return basicSetParentAnyLN( null, msgs );
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
        case SclPackage.OUTPUTS__PARENT_ANY_LN:
            return eInternalContainer().eInverseRemove( this, SclPackage.ANY_LN__OUTPUTS, AnyLN.class, msgs );
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
        case SclPackage.OUTPUTS__EXT_CTRL:
            return getExtCtrl();
        case SclPackage.OUTPUTS__PARENT_ANY_LN:
            return getParentAnyLN();
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
        case SclPackage.OUTPUTS__EXT_CTRL:
            getExtCtrl().clear();
            getExtCtrl().addAll( ( Collection< ? extends ExtCtrl > ) newValue );
            return;
        case SclPackage.OUTPUTS__PARENT_ANY_LN:
            setParentAnyLN( ( AnyLN ) newValue );
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
        case SclPackage.OUTPUTS__EXT_CTRL:
            unsetExtCtrl();
            return;
        case SclPackage.OUTPUTS__PARENT_ANY_LN:
            setParentAnyLN( ( AnyLN ) null );
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
        case SclPackage.OUTPUTS__EXT_CTRL:
            return isSetExtCtrl();
        case SclPackage.OUTPUTS__PARENT_ANY_LN:
            return getParentAnyLN() != null;
        }
        return super.eIsSet( featureID );
    }

} //OutputsImpl
