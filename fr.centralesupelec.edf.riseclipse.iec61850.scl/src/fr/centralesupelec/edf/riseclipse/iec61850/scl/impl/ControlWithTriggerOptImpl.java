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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control With Trigger Opt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlWithTriggerOptImpl#getIntgPd <em>Intg Pd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlWithTriggerOptImpl#getTrgOps <em>Trg Ops</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ControlWithTriggerOptImpl extends ControlImpl implements ControlWithTriggerOpt {
    /**
     * The default value of the '{@link #getIntgPd() <em>Intg Pd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntgPd()
     * @generated
     * @ordered
     */
    protected static final Integer INTG_PD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIntgPd() <em>Intg Pd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntgPd()
     * @generated
     * @ordered
     */
    protected Integer intgPd = INTG_PD_EDEFAULT;

    /**
     * This is true if the Intg Pd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean intgPdESet;

    /**
     * The cached value of the '{@link #getTrgOps() <em>Trg Ops</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrgOps()
     * @generated
     * @ordered
     */
    protected TrgOps trgOps;

    /**
     * This is true if the Trg Ops containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean trgOpsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ControlWithTriggerOptImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getControlWithTriggerOpt();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getIntgPd() {
        return intgPd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIntgPd( Integer newIntgPd ) {
        Integer oldIntgPd = intgPd;
        intgPd = newIntgPd;
        boolean oldIntgPdESet = intgPdESet;
        intgPdESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL_WITH_TRIGGER_OPT__INTG_PD, oldIntgPd, intgPd, !oldIntgPdESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIntgPd() {
        Integer oldIntgPd = intgPd;
        boolean oldIntgPdESet = intgPdESet;
        intgPd = INTG_PD_EDEFAULT;
        intgPdESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL_WITH_TRIGGER_OPT__INTG_PD, oldIntgPd, INTG_PD_EDEFAULT, oldIntgPdESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIntgPd() {
        return intgPdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TrgOps getTrgOps() {
        return trgOps;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTrgOps( TrgOps newTrgOps, NotificationChain msgs ) {
        TrgOps oldTrgOps = trgOps;
        trgOps = newTrgOps;
        boolean oldTrgOpsESet = trgOpsESet;
        trgOpsESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS, oldTrgOps, newTrgOps, !oldTrgOpsESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTrgOps( TrgOps newTrgOps ) {
        if (newTrgOps != trgOps) {
            NotificationChain msgs = null;
            if (trgOps != null)
                msgs = ((InternalEObject)trgOps).eInverseRemove(this, SclPackage.TRG_OPS__CONTROL_WITH_TRIGGER_OPT, TrgOps.class, msgs);
            if (newTrgOps != null)
                msgs = ((InternalEObject)newTrgOps).eInverseAdd(this, SclPackage.TRG_OPS__CONTROL_WITH_TRIGGER_OPT, TrgOps.class, msgs);
            msgs = basicSetTrgOps(newTrgOps, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldTrgOpsESet = trgOpsESet;
            trgOpsESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS, newTrgOps, newTrgOps, !oldTrgOpsESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTrgOps( NotificationChain msgs ) {
        TrgOps oldTrgOps = trgOps;
        trgOps = null;
        boolean oldTrgOpsESet = trgOpsESet;
        trgOpsESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS, oldTrgOps, null, oldTrgOpsESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTrgOps() {
        if (trgOps != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)trgOps).eInverseRemove(this, SclPackage.TRG_OPS__CONTROL_WITH_TRIGGER_OPT, TrgOps.class, msgs);
            msgs = basicUnsetTrgOps(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldTrgOpsESet = trgOpsESet;
            trgOpsESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS, null, null, oldTrgOpsESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTrgOps() {
        return trgOpsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS:
                if (trgOps != null)
                    msgs = ((InternalEObject)trgOps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS, null, msgs);
                return basicSetTrgOps((TrgOps)otherEnd, msgs);
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
            case SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS:
                return basicUnsetTrgOps(msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
            case SclPackage.CONTROL_WITH_TRIGGER_OPT__INTG_PD:
                return getIntgPd();
            case SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS:
                return getTrgOps();
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
            case SclPackage.CONTROL_WITH_TRIGGER_OPT__INTG_PD:
                setIntgPd((Integer)newValue);
                return;
            case SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS:
                setTrgOps((TrgOps)newValue);
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
            case SclPackage.CONTROL_WITH_TRIGGER_OPT__INTG_PD:
                unsetIntgPd();
                return;
            case SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS:
                unsetTrgOps();
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
            case SclPackage.CONTROL_WITH_TRIGGER_OPT__INTG_PD:
                return isSetIntgPd();
            case SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS:
                return isSetTrgOps();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (intgPd: ");
        if (intgPdESet) result.append(intgPd); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ControlWithTriggerOptImpl
