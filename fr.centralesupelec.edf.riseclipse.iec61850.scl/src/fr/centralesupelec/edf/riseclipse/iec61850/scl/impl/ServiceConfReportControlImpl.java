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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.bufModeEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Conf Report Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceConfReportControlImpl#getBufMode <em>Buf Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceConfReportControlImpl#getBufConf <em>Buf Conf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceConfReportControlImpl#getMaxBuf <em>Max Buf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceConfReportControlImpl extends ServiceWithMaxImpl implements ServiceConfReportControl {
    /**
     * The default value of the '{@link #getBufMode() <em>Buf Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufMode()
     * @generated
     * @ordered
     */
    protected static final bufModeEnum BUF_MODE_EDEFAULT = bufModeEnum.UNBUFFERED;

    /**
     * The cached value of the '{@link #getBufMode() <em>Buf Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufMode()
     * @generated
     * @ordered
     */
    protected bufModeEnum bufMode = BUF_MODE_EDEFAULT;

    /**
     * This is true if the Buf Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bufModeESet;

    /**
     * The default value of the '{@link #getBufConf() <em>Buf Conf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufConf()
     * @generated
     * @ordered
     */
    protected static final Boolean BUF_CONF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBufConf() <em>Buf Conf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufConf()
     * @generated
     * @ordered
     */
    protected Boolean bufConf = BUF_CONF_EDEFAULT;

    /**
     * This is true if the Buf Conf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bufConfESet;

    /**
     * The default value of the '{@link #getMaxBuf() <em>Max Buf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxBuf()
     * @generated
     * @ordered
     */
    protected static final Integer MAX_BUF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxBuf() <em>Max Buf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxBuf()
     * @generated
     * @ordered
     */
    protected Integer maxBuf = MAX_BUF_EDEFAULT;

    /**
     * This is true if the Max Buf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxBufESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceConfReportControlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getServiceConfReportControl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public bufModeEnum getBufMode() {
        return bufMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBufMode(bufModeEnum newBufMode) {
        bufModeEnum oldBufMode = bufMode;
        bufMode = newBufMode == null ? BUF_MODE_EDEFAULT : newBufMode;
        boolean oldBufModeESet = bufModeESet;
        bufModeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICE_CONF_REPORT_CONTROL__BUF_MODE, oldBufMode, bufMode, !oldBufModeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBufMode() {
        bufModeEnum oldBufMode = bufMode;
        boolean oldBufModeESet = bufModeESet;
        bufMode = BUF_MODE_EDEFAULT;
        bufModeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICE_CONF_REPORT_CONTROL__BUF_MODE, oldBufMode, BUF_MODE_EDEFAULT, oldBufModeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetBufMode() {
        return bufModeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getBufConf() {
        return bufConf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBufConf(Boolean newBufConf) {
        Boolean oldBufConf = bufConf;
        bufConf = newBufConf;
        boolean oldBufConfESet = bufConfESet;
        bufConfESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICE_CONF_REPORT_CONTROL__BUF_CONF, oldBufConf, bufConf, !oldBufConfESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBufConf() {
        Boolean oldBufConf = bufConf;
        boolean oldBufConfESet = bufConfESet;
        bufConf = BUF_CONF_EDEFAULT;
        bufConfESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICE_CONF_REPORT_CONTROL__BUF_CONF, oldBufConf, BUF_CONF_EDEFAULT, oldBufConfESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetBufConf() {
        return bufConfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getMaxBuf() {
        return maxBuf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxBuf(Integer newMaxBuf) {
        Integer oldMaxBuf = maxBuf;
        maxBuf = newMaxBuf;
        boolean oldMaxBufESet = maxBufESet;
        maxBufESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICE_CONF_REPORT_CONTROL__MAX_BUF, oldMaxBuf, maxBuf, !oldMaxBufESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMaxBuf() {
        Integer oldMaxBuf = maxBuf;
        boolean oldMaxBufESet = maxBufESet;
        maxBuf = MAX_BUF_EDEFAULT;
        maxBufESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICE_CONF_REPORT_CONTROL__MAX_BUF, oldMaxBuf, MAX_BUF_EDEFAULT, oldMaxBufESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMaxBuf() {
        return maxBufESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SclPackage.SERVICE_CONF_REPORT_CONTROL__BUF_MODE:
                return getBufMode();
            case SclPackage.SERVICE_CONF_REPORT_CONTROL__BUF_CONF:
                return getBufConf();
            case SclPackage.SERVICE_CONF_REPORT_CONTROL__MAX_BUF:
                return getMaxBuf();
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
            case SclPackage.SERVICE_CONF_REPORT_CONTROL__BUF_MODE:
                setBufMode((bufModeEnum)newValue);
                return;
            case SclPackage.SERVICE_CONF_REPORT_CONTROL__BUF_CONF:
                setBufConf((Boolean)newValue);
                return;
            case SclPackage.SERVICE_CONF_REPORT_CONTROL__MAX_BUF:
                setMaxBuf((Integer)newValue);
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
            case SclPackage.SERVICE_CONF_REPORT_CONTROL__BUF_MODE:
                unsetBufMode();
                return;
            case SclPackage.SERVICE_CONF_REPORT_CONTROL__BUF_CONF:
                unsetBufConf();
                return;
            case SclPackage.SERVICE_CONF_REPORT_CONTROL__MAX_BUF:
                unsetMaxBuf();
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
            case SclPackage.SERVICE_CONF_REPORT_CONTROL__BUF_MODE:
                return isSetBufMode();
            case SclPackage.SERVICE_CONF_REPORT_CONTROL__BUF_CONF:
                return isSetBufConf();
            case SclPackage.SERVICE_CONF_REPORT_CONTROL__MAX_BUF:
                return isSetMaxBuf();
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
        result.append(" (bufMode: ");
        if (bufModeESet) result.append(bufMode); else result.append("<unset>");
        result.append(", bufConf: ");
        if (bufConfESet) result.append(bufConf); else result.append("<unset>");
        result.append(", maxBuf: ");
        if (maxBufESet) result.append(maxBuf); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ServiceConfReportControlImpl
