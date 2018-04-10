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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CommunicationImpl#getSubNetwork <em>Sub Network</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CommunicationImpl#getSCL <em>SCL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationImpl extends UnNamingImpl implements Communication {
    /**
     * The cached value of the '{@link #getSubNetwork() <em>Sub Network</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubNetwork()
     * @generated
     * @ordered
     */
    protected EList<SubNetwork> subNetwork;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CommunicationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getCommunication();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SubNetwork> getSubNetwork() {
        if (subNetwork == null) {
            subNetwork = new EObjectContainmentWithInverseEList.Unsettable<SubNetwork>(SubNetwork.class, this, SclPackage.COMMUNICATION__SUB_NETWORK, SclPackage.SUB_NETWORK__COMMUNICATION);
        }
        return subNetwork;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSubNetwork() {
        if (subNetwork != null) ((InternalEList.Unsettable<?>)subNetwork).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSubNetwork() {
        return subNetwork != null && ((InternalEList.Unsettable<?>)subNetwork).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCL getSCL() {
        if (eContainerFeatureID() != SclPackage.COMMUNICATION__SCL) return null;
        return (SCL)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSCL( SCL newSCL, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newSCL, SclPackage.COMMUNICATION__SCL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSCL( SCL newSCL ) {
        if (newSCL != eInternalContainer() || (eContainerFeatureID() != SclPackage.COMMUNICATION__SCL && newSCL != null)) {
            if (EcoreUtil.isAncestor(this, newSCL))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSCL != null)
                msgs = ((InternalEObject)newSCL).eInverseAdd(this, SclPackage.SCL__COMMUNICATION, SCL.class, msgs);
            msgs = basicSetSCL(newSCL, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.COMMUNICATION__SCL, newSCL, newSCL));
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
            case SclPackage.COMMUNICATION__SUB_NETWORK:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubNetwork()).basicAdd(otherEnd, msgs);
            case SclPackage.COMMUNICATION__SCL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSCL((SCL)otherEnd, msgs);
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
            case SclPackage.COMMUNICATION__SUB_NETWORK:
                return ((InternalEList<?>)getSubNetwork()).basicRemove(otherEnd, msgs);
            case SclPackage.COMMUNICATION__SCL:
                return basicSetSCL(null, msgs);
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
            case SclPackage.COMMUNICATION__SCL:
                return eInternalContainer().eInverseRemove(this, SclPackage.SCL__COMMUNICATION, SCL.class, msgs);
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
            case SclPackage.COMMUNICATION__SUB_NETWORK:
                return getSubNetwork();
            case SclPackage.COMMUNICATION__SCL:
                return getSCL();
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
            case SclPackage.COMMUNICATION__SUB_NETWORK:
                getSubNetwork().clear();
                getSubNetwork().addAll((Collection<? extends SubNetwork>)newValue);
                return;
            case SclPackage.COMMUNICATION__SCL:
                setSCL((SCL)newValue);
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
            case SclPackage.COMMUNICATION__SUB_NETWORK:
                unsetSubNetwork();
                return;
            case SclPackage.COMMUNICATION__SCL:
                setSCL((SCL)null);
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
            case SclPackage.COMMUNICATION__SUB_NETWORK:
                return isSetSubNetwork();
            case SclPackage.COMMUNICATION__SCL:
                return getSCL() != null;
        }
        return super.eIsSet(featureID);
    }

} //CommunicationImpl
