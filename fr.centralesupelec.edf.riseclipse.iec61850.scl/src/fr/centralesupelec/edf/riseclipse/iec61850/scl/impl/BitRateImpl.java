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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRate;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bit Rate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BitRateImpl#getParentSubNetwork <em>Parent Sub Network</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BitRateImpl extends BitRateInMbPerSecImpl implements BitRate {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BitRateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getBitRate();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubNetwork getParentSubNetwork() {
        if (eContainerFeatureID() != SclPackage.BIT_RATE__PARENT_SUB_NETWORK) return null;
        return (SubNetwork)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSubNetwork(SubNetwork newParentSubNetwork, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentSubNetwork, SclPackage.BIT_RATE__PARENT_SUB_NETWORK, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSubNetwork(SubNetwork newParentSubNetwork) {
        if (newParentSubNetwork != eInternalContainer() || (eContainerFeatureID() != SclPackage.BIT_RATE__PARENT_SUB_NETWORK && newParentSubNetwork != null)) {
            if (EcoreUtil.isAncestor(this, newParentSubNetwork))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentSubNetwork != null)
                msgs = ((InternalEObject)newParentSubNetwork).eInverseAdd(this, SclPackage.SUB_NETWORK__BIT_RATE, SubNetwork.class, msgs);
            msgs = basicSetParentSubNetwork(newParentSubNetwork, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.BIT_RATE__PARENT_SUB_NETWORK, newParentSubNetwork, newParentSubNetwork));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SclPackage.BIT_RATE__PARENT_SUB_NETWORK:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentSubNetwork((SubNetwork)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SclPackage.BIT_RATE__PARENT_SUB_NETWORK:
                return basicSetParentSubNetwork(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case SclPackage.BIT_RATE__PARENT_SUB_NETWORK:
                return eInternalContainer().eInverseRemove(this, SclPackage.SUB_NETWORK__BIT_RATE, SubNetwork.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SclPackage.BIT_RATE__PARENT_SUB_NETWORK:
                return getParentSubNetwork();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SclPackage.BIT_RATE__PARENT_SUB_NETWORK:
                setParentSubNetwork((SubNetwork)newValue);
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
    public void eUnset(int featureID) {
        switch (featureID) {
            case SclPackage.BIT_RATE__PARENT_SUB_NETWORK:
                setParentSubNetwork((SubNetwork)null);
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
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case SclPackage.BIT_RATE__PARENT_SUB_NETWORK:
                return getParentSubNetwork() != null;
        }
        return super.eIsSet(featureID);
    }

} //BitRateImpl
