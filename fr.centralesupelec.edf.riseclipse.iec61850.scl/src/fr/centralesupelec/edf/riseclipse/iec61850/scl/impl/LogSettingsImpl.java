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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogSettingsImpl#getIntgPd <em>Intg Pd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogSettingsImpl#getLogEna <em>Log Ena</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogSettingsImpl#getTrgOps <em>Trg Ops</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogSettingsImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogSettingsImpl extends ServiceSettingsImpl implements LogSettings {
    /**
     * The default value of the '{@link #getIntgPd() <em>Intg Pd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntgPd()
     * @generated
     * @ordered
     */
    protected static final ServiceSettingsEnum INTG_PD_EDEFAULT = ServiceSettingsEnum.FIX;

    /**
     * The cached value of the '{@link #getIntgPd() <em>Intg Pd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntgPd()
     * @generated
     * @ordered
     */
    protected ServiceSettingsEnum intgPd = INTG_PD_EDEFAULT;

    /**
     * This is true if the Intg Pd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean intgPdESet;

    /**
     * The default value of the '{@link #getLogEna() <em>Log Ena</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogEna()
     * @generated
     * @ordered
     */
    protected static final ServiceSettingsEnum LOG_ENA_EDEFAULT = ServiceSettingsEnum.FIX;

    /**
     * The cached value of the '{@link #getLogEna() <em>Log Ena</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogEna()
     * @generated
     * @ordered
     */
    protected ServiceSettingsEnum logEna = LOG_ENA_EDEFAULT;

    /**
     * This is true if the Log Ena attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean logEnaESet;

    /**
     * The default value of the '{@link #getTrgOps() <em>Trg Ops</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrgOps()
     * @generated
     * @ordered
     */
    protected static final ServiceSettingsEnum TRG_OPS_EDEFAULT = ServiceSettingsEnum.FIX;

    /**
     * The cached value of the '{@link #getTrgOps() <em>Trg Ops</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrgOps()
     * @generated
     * @ordered
     */
    protected ServiceSettingsEnum trgOps = TRG_OPS_EDEFAULT;

    /**
     * This is true if the Trg Ops attribute has been set.
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
    protected LogSettingsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getLogSettings();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceSettingsEnum getIntgPd() {
        return intgPd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIntgPd( ServiceSettingsEnum newIntgPd ) {
        ServiceSettingsEnum oldIntgPd = intgPd;
        intgPd = newIntgPd == null ? INTG_PD_EDEFAULT : newIntgPd;
        boolean oldIntgPdESet = intgPdESet;
        intgPdESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LOG_SETTINGS__INTG_PD, oldIntgPd, intgPd, !oldIntgPdESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIntgPd() {
        ServiceSettingsEnum oldIntgPd = intgPd;
        boolean oldIntgPdESet = intgPdESet;
        intgPd = INTG_PD_EDEFAULT;
        intgPdESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LOG_SETTINGS__INTG_PD, oldIntgPd, INTG_PD_EDEFAULT, oldIntgPdESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIntgPd() {
        return intgPdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceSettingsEnum getLogEna() {
        return logEna;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLogEna( ServiceSettingsEnum newLogEna ) {
        ServiceSettingsEnum oldLogEna = logEna;
        logEna = newLogEna == null ? LOG_ENA_EDEFAULT : newLogEna;
        boolean oldLogEnaESet = logEnaESet;
        logEnaESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LOG_SETTINGS__LOG_ENA, oldLogEna, logEna, !oldLogEnaESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLogEna() {
        ServiceSettingsEnum oldLogEna = logEna;
        boolean oldLogEnaESet = logEnaESet;
        logEna = LOG_ENA_EDEFAULT;
        logEnaESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LOG_SETTINGS__LOG_ENA, oldLogEna, LOG_ENA_EDEFAULT, oldLogEnaESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLogEna() {
        return logEnaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceSettingsEnum getTrgOps() {
        return trgOps;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTrgOps( ServiceSettingsEnum newTrgOps ) {
        ServiceSettingsEnum oldTrgOps = trgOps;
        trgOps = newTrgOps == null ? TRG_OPS_EDEFAULT : newTrgOps;
        boolean oldTrgOpsESet = trgOpsESet;
        trgOpsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LOG_SETTINGS__TRG_OPS, oldTrgOps, trgOps, !oldTrgOpsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTrgOps() {
        ServiceSettingsEnum oldTrgOps = trgOps;
        boolean oldTrgOpsESet = trgOpsESet;
        trgOps = TRG_OPS_EDEFAULT;
        trgOpsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LOG_SETTINGS__TRG_OPS, oldTrgOps, TRG_OPS_EDEFAULT, oldTrgOpsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTrgOps() {
        return trgOpsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Services getServices() {
        if (eContainerFeatureID() != SclPackage.LOG_SETTINGS__SERVICES) return null;
        return (Services)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServices( Services newServices, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newServices, SclPackage.LOG_SETTINGS__SERVICES, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setServices( Services newServices ) {
        if (newServices != eInternalContainer() || (eContainerFeatureID() != SclPackage.LOG_SETTINGS__SERVICES && newServices != null)) {
            if (EcoreUtil.isAncestor(this, newServices))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newServices != null)
                msgs = ((InternalEObject)newServices).eInverseAdd(this, SclPackage.SERVICES__LOG_SETTINGS, Services.class, msgs);
            msgs = basicSetServices(newServices, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LOG_SETTINGS__SERVICES, newServices, newServices));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.LOG_SETTINGS__SERVICES:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetServices((Services)otherEnd, msgs);
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
            case SclPackage.LOG_SETTINGS__SERVICES:
                return basicSetServices(null, msgs);
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
            case SclPackage.LOG_SETTINGS__SERVICES:
                return eInternalContainer().eInverseRemove(this, SclPackage.SERVICES__LOG_SETTINGS, Services.class, msgs);
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
            case SclPackage.LOG_SETTINGS__INTG_PD:
                return getIntgPd();
            case SclPackage.LOG_SETTINGS__LOG_ENA:
                return getLogEna();
            case SclPackage.LOG_SETTINGS__TRG_OPS:
                return getTrgOps();
            case SclPackage.LOG_SETTINGS__SERVICES:
                return getServices();
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
            case SclPackage.LOG_SETTINGS__INTG_PD:
                setIntgPd((ServiceSettingsEnum)newValue);
                return;
            case SclPackage.LOG_SETTINGS__LOG_ENA:
                setLogEna((ServiceSettingsEnum)newValue);
                return;
            case SclPackage.LOG_SETTINGS__TRG_OPS:
                setTrgOps((ServiceSettingsEnum)newValue);
                return;
            case SclPackage.LOG_SETTINGS__SERVICES:
                setServices((Services)newValue);
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
            case SclPackage.LOG_SETTINGS__INTG_PD:
                unsetIntgPd();
                return;
            case SclPackage.LOG_SETTINGS__LOG_ENA:
                unsetLogEna();
                return;
            case SclPackage.LOG_SETTINGS__TRG_OPS:
                unsetTrgOps();
                return;
            case SclPackage.LOG_SETTINGS__SERVICES:
                setServices((Services)null);
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
            case SclPackage.LOG_SETTINGS__INTG_PD:
                return isSetIntgPd();
            case SclPackage.LOG_SETTINGS__LOG_ENA:
                return isSetLogEna();
            case SclPackage.LOG_SETTINGS__TRG_OPS:
                return isSetTrgOps();
            case SclPackage.LOG_SETTINGS__SERVICES:
                return getServices() != null;
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
        result.append(", logEna: ");
        if (logEnaESet) result.append(logEna); else result.append("<unset>");
        result.append(", trgOps: ");
        if (trgOpsESet) result.append(trgOps); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //LogSettingsImpl
