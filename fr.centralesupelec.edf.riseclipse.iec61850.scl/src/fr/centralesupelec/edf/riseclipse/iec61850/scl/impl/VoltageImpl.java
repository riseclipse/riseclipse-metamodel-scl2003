/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Line;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voltage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageImpl#getParentLine <em>Parent Line</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageImpl#getParentVoltageLevel <em>Parent Voltage Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VoltageImpl extends ValueWithUnitImpl implements Voltage {
    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    protected VoltageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getVoltage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Line getParentLine() {
        if (eContainerFeatureID() != SclPackage.VOLTAGE__PARENT_LINE) return null;
        return (Line)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentLine(Line newParentLine, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentLine, SclPackage.VOLTAGE__PARENT_LINE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentLine(Line newParentLine) {
        if (newParentLine != eInternalContainer() || (eContainerFeatureID() != SclPackage.VOLTAGE__PARENT_LINE && newParentLine != null)) {
            if (EcoreUtil.isAncestor(this, newParentLine))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentLine != null)
                msgs = ((InternalEObject)newParentLine).eInverseAdd(this, SclPackage.LINE__VOLTAGE, Line.class, msgs);
            msgs = basicSetParentLine(newParentLine, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.VOLTAGE__PARENT_LINE, newParentLine, newParentLine));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageLevel getParentVoltageLevel() {
        if (eContainerFeatureID() != SclPackage.VOLTAGE__PARENT_VOLTAGE_LEVEL) return null;
        return (VoltageLevel)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentVoltageLevel(VoltageLevel newParentVoltageLevel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentVoltageLevel, SclPackage.VOLTAGE__PARENT_VOLTAGE_LEVEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentVoltageLevel(VoltageLevel newParentVoltageLevel) {
        if (newParentVoltageLevel != eInternalContainer() || (eContainerFeatureID() != SclPackage.VOLTAGE__PARENT_VOLTAGE_LEVEL && newParentVoltageLevel != null)) {
            if (EcoreUtil.isAncestor(this, newParentVoltageLevel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentVoltageLevel != null)
                msgs = ((InternalEObject)newParentVoltageLevel).eInverseAdd(this, SclPackage.VOLTAGE_LEVEL__VOLTAGE, VoltageLevel.class, msgs);
            msgs = basicSetParentVoltageLevel(newParentVoltageLevel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.VOLTAGE__PARENT_VOLTAGE_LEVEL, newParentVoltageLevel, newParentVoltageLevel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SclPackage.VOLTAGE__PARENT_LINE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentLine((Line)otherEnd, msgs);
            case SclPackage.VOLTAGE__PARENT_VOLTAGE_LEVEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentVoltageLevel((VoltageLevel)otherEnd, msgs);
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
            case SclPackage.VOLTAGE__PARENT_LINE:
                return basicSetParentLine(null, msgs);
            case SclPackage.VOLTAGE__PARENT_VOLTAGE_LEVEL:
                return basicSetParentVoltageLevel(null, msgs);
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
            case SclPackage.VOLTAGE__PARENT_LINE:
                return eInternalContainer().eInverseRemove(this, SclPackage.LINE__VOLTAGE, Line.class, msgs);
            case SclPackage.VOLTAGE__PARENT_VOLTAGE_LEVEL:
                return eInternalContainer().eInverseRemove(this, SclPackage.VOLTAGE_LEVEL__VOLTAGE, VoltageLevel.class, msgs);
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
            case SclPackage.VOLTAGE__PARENT_LINE:
                return getParentLine();
            case SclPackage.VOLTAGE__PARENT_VOLTAGE_LEVEL:
                return getParentVoltageLevel();
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
            case SclPackage.VOLTAGE__PARENT_LINE:
                setParentLine((Line)newValue);
                return;
            case SclPackage.VOLTAGE__PARENT_VOLTAGE_LEVEL:
                setParentVoltageLevel((VoltageLevel)newValue);
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
            case SclPackage.VOLTAGE__PARENT_LINE:
                setParentLine((Line)null);
                return;
            case SclPackage.VOLTAGE__PARENT_VOLTAGE_LEVEL:
                setParentVoltageLevel((VoltageLevel)null);
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
            case SclPackage.VOLTAGE__PARENT_LINE:
                return getParentLine() != null;
            case SclPackage.VOLTAGE__PARENT_VOLTAGE_LEVEL:
                return getParentVoltageLevel() != null;
        }
        return super.eIsSet(featureID);
    }

} //VoltageImpl
