/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
 *      http://wdi.supelec.fr/software/RiseClipse/
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Address;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.P;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AddressImpl#getConnectedAP <em>Connected AP</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AddressImpl#getControlBlock <em>Control Block</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AddressImpl#getP <em>P</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressImpl extends SclObjectImpl implements Address {
    /**
     * The cached value of the '{@link #getP() <em>P</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP()
     * @generated
     * @ordered
     */
    protected EList<P> p;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AddressImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getAddress();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConnectedAP getConnectedAP() {
        if (eContainerFeatureID() != SclPackage.ADDRESS__CONNECTED_AP) return null;
        return (ConnectedAP)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConnectedAP( ConnectedAP newConnectedAP, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newConnectedAP, SclPackage.ADDRESS__CONNECTED_AP, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConnectedAP( ConnectedAP newConnectedAP ) {
        if (newConnectedAP != eInternalContainer() || (eContainerFeatureID() != SclPackage.ADDRESS__CONNECTED_AP && newConnectedAP != null)) {
            if (EcoreUtil.isAncestor(this, newConnectedAP))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newConnectedAP != null)
                msgs = ((InternalEObject)newConnectedAP).eInverseAdd(this, SclPackage.CONNECTED_AP__ADDRESS, ConnectedAP.class, msgs);
            msgs = basicSetConnectedAP(newConnectedAP, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ADDRESS__CONNECTED_AP, newConnectedAP, newConnectedAP));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlBlock getControlBlock() {
        if (eContainerFeatureID() != SclPackage.ADDRESS__CONTROL_BLOCK) return null;
        return (ControlBlock)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetControlBlock( ControlBlock newControlBlock, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newControlBlock, SclPackage.ADDRESS__CONTROL_BLOCK, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlBlock( ControlBlock newControlBlock ) {
        if (newControlBlock != eInternalContainer() || (eContainerFeatureID() != SclPackage.ADDRESS__CONTROL_BLOCK && newControlBlock != null)) {
            if (EcoreUtil.isAncestor(this, newControlBlock))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newControlBlock != null)
                msgs = ((InternalEObject)newControlBlock).eInverseAdd(this, SclPackage.CONTROL_BLOCK__ADDRESS, ControlBlock.class, msgs);
            msgs = basicSetControlBlock(newControlBlock, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ADDRESS__CONTROL_BLOCK, newControlBlock, newControlBlock));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<P> getP() {
        if (p == null) {
            p = new EObjectContainmentWithInverseEList.Unsettable<P>(P.class, this, SclPackage.ADDRESS__P, SclPackage.P__ADDRESS);
        }
        return p;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP() {
        if (p != null) ((InternalEList.Unsettable<?>)p).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP() {
        return p != null && ((InternalEList.Unsettable<?>)p).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.ADDRESS__CONNECTED_AP:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetConnectedAP((ConnectedAP)otherEnd, msgs);
            case SclPackage.ADDRESS__CONTROL_BLOCK:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetControlBlock((ControlBlock)otherEnd, msgs);
            case SclPackage.ADDRESS__P:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getP()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.ADDRESS__CONNECTED_AP:
                return basicSetConnectedAP(null, msgs);
            case SclPackage.ADDRESS__CONTROL_BLOCK:
                return basicSetControlBlock(null, msgs);
            case SclPackage.ADDRESS__P:
                return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs ) {
        switch (eContainerFeatureID()) {
            case SclPackage.ADDRESS__CONNECTED_AP:
                return eInternalContainer().eInverseRemove(this, SclPackage.CONNECTED_AP__ADDRESS, ConnectedAP.class, msgs);
            case SclPackage.ADDRESS__CONTROL_BLOCK:
                return eInternalContainer().eInverseRemove(this, SclPackage.CONTROL_BLOCK__ADDRESS, ControlBlock.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
            case SclPackage.ADDRESS__CONNECTED_AP:
                return getConnectedAP();
            case SclPackage.ADDRESS__CONTROL_BLOCK:
                return getControlBlock();
            case SclPackage.ADDRESS__P:
                return getP();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch (featureID) {
            case SclPackage.ADDRESS__CONNECTED_AP:
                setConnectedAP((ConnectedAP)newValue);
                return;
            case SclPackage.ADDRESS__CONTROL_BLOCK:
                setControlBlock((ControlBlock)newValue);
                return;
            case SclPackage.ADDRESS__P:
                getP().clear();
                getP().addAll((Collection<? extends P>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch (featureID) {
            case SclPackage.ADDRESS__CONNECTED_AP:
                setConnectedAP((ConnectedAP)null);
                return;
            case SclPackage.ADDRESS__CONTROL_BLOCK:
                setControlBlock((ControlBlock)null);
                return;
            case SclPackage.ADDRESS__P:
                unsetP();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch (featureID) {
            case SclPackage.ADDRESS__CONNECTED_AP:
                return getConnectedAP() != null;
            case SclPackage.ADDRESS__CONTROL_BLOCK:
                return getControlBlock() != null;
            case SclPackage.ADDRESS__P:
                return isSetP();
        }
        return super.eIsSet(featureID);
    }

} //AddressImpl
