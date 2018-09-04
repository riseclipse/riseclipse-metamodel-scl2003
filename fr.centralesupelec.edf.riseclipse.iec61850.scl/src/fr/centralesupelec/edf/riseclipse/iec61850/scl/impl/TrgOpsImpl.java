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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Ops</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TrgOpsImpl#getDchg <em>Dchg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TrgOpsImpl#getDupd <em>Dupd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TrgOpsImpl#getGi <em>Gi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TrgOpsImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TrgOpsImpl#getQchg <em>Qchg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TrgOpsImpl#getControlWithTriggerOpt <em>Control With Trigger Opt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgOpsImpl extends SclObjectImpl implements TrgOps {
    /**
     * The default value of the '{@link #getDchg() <em>Dchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDchg()
     * @generated
     * @ordered
     */
    protected static final Boolean DCHG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDchg() <em>Dchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDchg()
     * @generated
     * @ordered
     */
    protected Boolean dchg = DCHG_EDEFAULT;

    /**
     * This is true if the Dchg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dchgESet;

    /**
     * The default value of the '{@link #getDupd() <em>Dupd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDupd()
     * @generated
     * @ordered
     */
    protected static final Boolean DUPD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDupd() <em>Dupd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDupd()
     * @generated
     * @ordered
     */
    protected Boolean dupd = DUPD_EDEFAULT;

    /**
     * This is true if the Dupd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dupdESet;

    /**
     * The default value of the '{@link #getGi() <em>Gi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGi()
     * @generated
     * @ordered
     */
    protected static final Boolean GI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGi() <em>Gi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGi()
     * @generated
     * @ordered
     */
    protected Boolean gi = GI_EDEFAULT;

    /**
     * This is true if the Gi attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean giESet;

    /**
     * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPeriod()
     * @generated
     * @ordered
     */
    protected static final Boolean PERIOD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPeriod()
     * @generated
     * @ordered
     */
    protected Boolean period = PERIOD_EDEFAULT;

    /**
     * This is true if the Period attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean periodESet;

    /**
     * The default value of the '{@link #getQchg() <em>Qchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQchg()
     * @generated
     * @ordered
     */
    protected static final Boolean QCHG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQchg() <em>Qchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQchg()
     * @generated
     * @ordered
     */
    protected Boolean qchg = QCHG_EDEFAULT;

    /**
     * This is true if the Qchg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qchgESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TrgOpsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getTrgOps();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getDchg() {
        return dchg;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void setDchg( Boolean newDchg ) {
        Boolean oldDchg = dchg;
        dchg = newDchg;
        boolean oldDchgESet = dchgESet;
        dchgESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TRG_OPS__DCHG, oldDchg, dchg, !oldDchgESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDchg() {
        Boolean oldDchg = dchg;
        boolean oldDchgESet = dchgESet;
        dchg = DCHG_EDEFAULT;
        dchgESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TRG_OPS__DCHG, oldDchg, DCHG_EDEFAULT, oldDchgESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDchg() {
        return dchgESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getDupd() {
        return dupd;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void setDupd( Boolean newDupd ) {
        Boolean oldDupd = dupd;
        dupd = newDupd;
        boolean oldDupdESet = dupdESet;
        dupdESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TRG_OPS__DUPD, oldDupd, dupd, !oldDupdESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDupd() {
        Boolean oldDupd = dupd;
        boolean oldDupdESet = dupdESet;
        dupd = DUPD_EDEFAULT;
        dupdESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TRG_OPS__DUPD, oldDupd, DUPD_EDEFAULT, oldDupdESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDupd() {
        return dupdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getGi() {
        return gi;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void setGi( Boolean newGi ) {
        Boolean oldGi = gi;
        gi = newGi;
        boolean oldGiESet = giESet;
        giESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TRG_OPS__GI, oldGi, gi, !oldGiESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetGi() {
        Boolean oldGi = gi;
        boolean oldGiESet = giESet;
        gi = GI_EDEFAULT;
        giESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TRG_OPS__GI, oldGi, GI_EDEFAULT, oldGiESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetGi() {
        return giESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getPeriod() {
        return period;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void setPeriod( Boolean newPeriod ) {
        Boolean oldPeriod = period;
        period = newPeriod;
        boolean oldPeriodESet = periodESet;
        periodESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TRG_OPS__PERIOD, oldPeriod, period, !oldPeriodESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPeriod() {
        Boolean oldPeriod = period;
        boolean oldPeriodESet = periodESet;
        period = PERIOD_EDEFAULT;
        periodESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TRG_OPS__PERIOD, oldPeriod, PERIOD_EDEFAULT, oldPeriodESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPeriod() {
        return periodESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getQchg() {
        return qchg;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void setQchg( Boolean newQchg ) {
        Boolean oldQchg = qchg;
        qchg = newQchg;
        boolean oldQchgESet = qchgESet;
        qchgESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TRG_OPS__QCHG, oldQchg, qchg, !oldQchgESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetQchg() {
        Boolean oldQchg = qchg;
        boolean oldQchgESet = qchgESet;
        qchg = QCHG_EDEFAULT;
        qchgESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TRG_OPS__QCHG, oldQchg, QCHG_EDEFAULT, oldQchgESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetQchg() {
        return qchgESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControlWithTriggerOpt getControlWithTriggerOpt() {
        if (eContainerFeatureID() != SclPackage.TRG_OPS__CONTROL_WITH_TRIGGER_OPT) return null;
        return (ControlWithTriggerOpt)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetControlWithTriggerOpt( ControlWithTriggerOpt newControlWithTriggerOpt,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newControlWithTriggerOpt, SclPackage.TRG_OPS__CONTROL_WITH_TRIGGER_OPT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setControlWithTriggerOpt( ControlWithTriggerOpt newControlWithTriggerOpt ) {
        if (newControlWithTriggerOpt != eInternalContainer() || (eContainerFeatureID() != SclPackage.TRG_OPS__CONTROL_WITH_TRIGGER_OPT && newControlWithTriggerOpt != null)) {
            if (EcoreUtil.isAncestor(this, newControlWithTriggerOpt))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newControlWithTriggerOpt != null)
                msgs = ((InternalEObject)newControlWithTriggerOpt).eInverseAdd(this, SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS, ControlWithTriggerOpt.class, msgs);
            msgs = basicSetControlWithTriggerOpt(newControlWithTriggerOpt, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TRG_OPS__CONTROL_WITH_TRIGGER_OPT, newControlWithTriggerOpt, newControlWithTriggerOpt));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.TRG_OPS__CONTROL_WITH_TRIGGER_OPT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetControlWithTriggerOpt((ControlWithTriggerOpt)otherEnd, msgs);
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
            case SclPackage.TRG_OPS__CONTROL_WITH_TRIGGER_OPT:
                return basicSetControlWithTriggerOpt(null, msgs);
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
            case SclPackage.TRG_OPS__CONTROL_WITH_TRIGGER_OPT:
                return eInternalContainer().eInverseRemove(this, SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS, ControlWithTriggerOpt.class, msgs);
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
            case SclPackage.TRG_OPS__DCHG:
                return getDchg();
            case SclPackage.TRG_OPS__DUPD:
                return getDupd();
            case SclPackage.TRG_OPS__GI:
                return getGi();
            case SclPackage.TRG_OPS__PERIOD:
                return getPeriod();
            case SclPackage.TRG_OPS__QCHG:
                return getQchg();
            case SclPackage.TRG_OPS__CONTROL_WITH_TRIGGER_OPT:
                return getControlWithTriggerOpt();
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
            case SclPackage.TRG_OPS__DCHG:
                setDchg((Boolean)newValue);
                return;
            case SclPackage.TRG_OPS__DUPD:
                setDupd((Boolean)newValue);
                return;
            case SclPackage.TRG_OPS__GI:
                setGi((Boolean)newValue);
                return;
            case SclPackage.TRG_OPS__PERIOD:
                setPeriod((Boolean)newValue);
                return;
            case SclPackage.TRG_OPS__QCHG:
                setQchg((Boolean)newValue);
                return;
            case SclPackage.TRG_OPS__CONTROL_WITH_TRIGGER_OPT:
                setControlWithTriggerOpt((ControlWithTriggerOpt)newValue);
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
            case SclPackage.TRG_OPS__DCHG:
                unsetDchg();
                return;
            case SclPackage.TRG_OPS__DUPD:
                unsetDupd();
                return;
            case SclPackage.TRG_OPS__GI:
                unsetGi();
                return;
            case SclPackage.TRG_OPS__PERIOD:
                unsetPeriod();
                return;
            case SclPackage.TRG_OPS__QCHG:
                unsetQchg();
                return;
            case SclPackage.TRG_OPS__CONTROL_WITH_TRIGGER_OPT:
                setControlWithTriggerOpt((ControlWithTriggerOpt)null);
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
            case SclPackage.TRG_OPS__DCHG:
                return isSetDchg();
            case SclPackage.TRG_OPS__DUPD:
                return isSetDupd();
            case SclPackage.TRG_OPS__GI:
                return isSetGi();
            case SclPackage.TRG_OPS__PERIOD:
                return isSetPeriod();
            case SclPackage.TRG_OPS__QCHG:
                return isSetQchg();
            case SclPackage.TRG_OPS__CONTROL_WITH_TRIGGER_OPT:
                return getControlWithTriggerOpt() != null;
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
        result.append(" (dchg: ");
        if (dchgESet) result.append(dchg); else result.append("<unset>");
        result.append(", dupd: ");
        if (dupdESet) result.append(dupd); else result.append("<unset>");
        result.append(", gi: ");
        if (giESet) result.append(gi); else result.append("<unset>");
        result.append(", period: ");
        if (periodESet) result.append(period); else result.append("<unset>");
        result.append(", qchg: ");
        if (qchgESet) result.append(qchg); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //TrgOpsImpl
