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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsNoDynEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceSettingsImpl#getCbName <em>Cb Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceSettingsImpl#getDatSet <em>Dat Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceSettingsImpl extends SclObjectImpl implements ServiceSettings {
    /**
     * The default value of the '{@link #getCbName() <em>Cb Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCbName()
     * @generated NOT
     * @ordered
     */
    protected static final ServiceSettingsNoDynEnum CB_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCbName() <em>Cb Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCbName()
     * @generated
     * @ordered
     */
    protected ServiceSettingsNoDynEnum cbName = CB_NAME_EDEFAULT;

    /**
     * This is true if the Cb Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cbNameESet;

    /**
     * The default value of the '{@link #getDatSet() <em>Dat Set</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDatSet()
     * @generated NOT
     * @ordered
     */
    protected static final ServiceSettingsEnum DAT_SET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDatSet() <em>Dat Set</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDatSet()
     * @generated
     * @ordered
     */
    protected ServiceSettingsEnum datSet = DAT_SET_EDEFAULT;

    /**
     * This is true if the Dat Set attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean datSetESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceSettingsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getServiceSettings();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceSettingsNoDynEnum getCbName() {
        return cbName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCbName( ServiceSettingsNoDynEnum newCbName ) {
        ServiceSettingsNoDynEnum oldCbName = cbName;
        cbName = newCbName == null ? CB_NAME_EDEFAULT : newCbName;
        boolean oldCbNameESet = cbNameESet;
        cbNameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICE_SETTINGS__CB_NAME, oldCbName, cbName, !oldCbNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetCbName() {
        ServiceSettingsNoDynEnum oldCbName = cbName;
        boolean oldCbNameESet = cbNameESet;
        cbName = CB_NAME_EDEFAULT;
        cbNameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICE_SETTINGS__CB_NAME, oldCbName, CB_NAME_EDEFAULT, oldCbNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetCbName() {
        return cbNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceSettingsEnum getDatSet() {
        return datSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDatSet( ServiceSettingsEnum newDatSet ) {
        ServiceSettingsEnum oldDatSet = datSet;
        datSet = newDatSet == null ? DAT_SET_EDEFAULT : newDatSet;
        boolean oldDatSetESet = datSetESet;
        datSetESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICE_SETTINGS__DAT_SET, oldDatSet, datSet, !oldDatSetESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDatSet() {
        ServiceSettingsEnum oldDatSet = datSet;
        boolean oldDatSetESet = datSetESet;
        datSet = DAT_SET_EDEFAULT;
        datSetESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICE_SETTINGS__DAT_SET, oldDatSet, DAT_SET_EDEFAULT, oldDatSetESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDatSet() {
        return datSetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
            case SclPackage.SERVICE_SETTINGS__CB_NAME:
                return getCbName();
            case SclPackage.SERVICE_SETTINGS__DAT_SET:
                return getDatSet();
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
            case SclPackage.SERVICE_SETTINGS__CB_NAME:
                setCbName((ServiceSettingsNoDynEnum)newValue);
                return;
            case SclPackage.SERVICE_SETTINGS__DAT_SET:
                setDatSet((ServiceSettingsEnum)newValue);
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
            case SclPackage.SERVICE_SETTINGS__CB_NAME:
                unsetCbName();
                return;
            case SclPackage.SERVICE_SETTINGS__DAT_SET:
                unsetDatSet();
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
            case SclPackage.SERVICE_SETTINGS__CB_NAME:
                return isSetCbName();
            case SclPackage.SERVICE_SETTINGS__DAT_SET:
                return isSetDatSet();
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (cbName: ");
        if (cbNameESet) result.append(cbName); else result.append("<unset>");
        result.append(", datSet: ");
        if (datSetESet) result.append(datSet); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ServiceSettingsImpl
