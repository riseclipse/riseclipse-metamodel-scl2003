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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.NeutralPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neutral Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.NeutralPointImpl#getTransformerWinding <em>Transformer Winding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeutralPointImpl extends TerminalImpl implements NeutralPoint {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NeutralPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getNeutralPoint();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerWinding getTransformerWinding() {
        if (eContainerFeatureID() != SclPackage.NEUTRAL_POINT__TRANSFORMER_WINDING) return null;
        return (TransformerWinding)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTransformerWinding( TransformerWinding newTransformerWinding,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newTransformerWinding, SclPackage.NEUTRAL_POINT__TRANSFORMER_WINDING, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTransformerWinding( TransformerWinding newTransformerWinding ) {
        if (newTransformerWinding != eInternalContainer() || (eContainerFeatureID() != SclPackage.NEUTRAL_POINT__TRANSFORMER_WINDING && newTransformerWinding != null)) {
            if (EcoreUtil.isAncestor(this, newTransformerWinding))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newTransformerWinding != null)
                msgs = ((InternalEObject)newTransformerWinding).eInverseAdd(this, SclPackage.TRANSFORMER_WINDING__NEUTRAL_POINT, TransformerWinding.class, msgs);
            msgs = basicSetTransformerWinding(newTransformerWinding, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.NEUTRAL_POINT__TRANSFORMER_WINDING, newTransformerWinding, newTransformerWinding));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.NEUTRAL_POINT__TRANSFORMER_WINDING:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetTransformerWinding((TransformerWinding)otherEnd, msgs);
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
            case SclPackage.NEUTRAL_POINT__TRANSFORMER_WINDING:
                return basicSetTransformerWinding(null, msgs);
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
            case SclPackage.NEUTRAL_POINT__TRANSFORMER_WINDING:
                return eInternalContainer().eInverseRemove(this, SclPackage.TRANSFORMER_WINDING__NEUTRAL_POINT, TransformerWinding.class, msgs);
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
            case SclPackage.NEUTRAL_POINT__TRANSFORMER_WINDING:
                return getTransformerWinding();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch (featureID) {
            case SclPackage.NEUTRAL_POINT__TRANSFORMER_WINDING:
                setTransformerWinding((TransformerWinding)newValue);
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
            case SclPackage.NEUTRAL_POINT__TRANSFORMER_WINDING:
                setTransformerWinding((TransformerWinding)null);
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
            case SclPackage.NEUTRAL_POINT__TRANSFORMER_WINDING:
                return getTransformerWinding() != null;
        }
        return super.eIsSet(featureID);
    }

} //NeutralPointImpl
