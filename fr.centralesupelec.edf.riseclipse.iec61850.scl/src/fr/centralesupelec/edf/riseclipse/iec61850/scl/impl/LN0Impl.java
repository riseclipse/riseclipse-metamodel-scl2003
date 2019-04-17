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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LN0</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LN0Impl#getGSEControl <em>GSE Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LN0Impl#getLDevice <em>LDevice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LN0Impl#getSampledValueControl <em>Sampled Value Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LN0Impl#getSettingControl <em>Setting Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LN0Impl#getControlWithIEDName <em>Control With IED Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LN0Impl extends AnyLNImpl implements LN0 {
    /**
     * The cached value of the '{@link #getSettingControl() <em>Setting Control</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSettingControl()
     * @generated
     * @ordered
     */
    protected SettingControl settingControl;

    /**
     * This is true if the Setting Control containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean settingControlESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LN0Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getLN0();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<GSEControl> getGSEControl() {
        return getControlWithIEDName().list(SclPackage.eINSTANCE.getLN0_GSEControl());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGSEControl() {
        ((FeatureMap.Internal)getControlWithIEDName()).clear(SclPackage.eINSTANCE.getLN0_GSEControl());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGSEControl() {
        return !((FeatureMap.Internal)getControlWithIEDName()).isEmpty(SclPackage.eINSTANCE.getLN0_GSEControl());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LDevice getLDevice() {
        if (eContainerFeatureID() != SclPackage.LN0__LDEVICE) return null;
        return (LDevice)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLDevice(LDevice newLDevice, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newLDevice, SclPackage.LN0__LDEVICE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLDevice( LDevice newLDevice ) {
        if (newLDevice != eInternalContainer() || (eContainerFeatureID() != SclPackage.LN0__LDEVICE && newLDevice != null)) {
            if (EcoreUtil.isAncestor(this, newLDevice))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newLDevice != null)
                msgs = ((InternalEObject)newLDevice).eInverseAdd(this, SclPackage.LDEVICE__LN0, LDevice.class, msgs);
            msgs = basicSetLDevice(newLDevice, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LN0__LDEVICE, newLDevice, newLDevice));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<SampledValueControl> getSampledValueControl() {
        return getControlWithIEDName().list(SclPackage.eINSTANCE.getLN0_SampledValueControl());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSampledValueControl() {
        ((FeatureMap.Internal)getControlWithIEDName()).clear(SclPackage.eINSTANCE.getLN0_SampledValueControl());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSampledValueControl() {
        return !((FeatureMap.Internal)getControlWithIEDName()).isEmpty(SclPackage.eINSTANCE.getLN0_SampledValueControl());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SettingControl getSettingControl() {
        return settingControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSettingControl( SettingControl newSettingControl, NotificationChain msgs ) {
        SettingControl oldSettingControl = settingControl;
        settingControl = newSettingControl;
        boolean oldSettingControlESet = settingControlESet;
        settingControlESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.LN0__SETTING_CONTROL, oldSettingControl, newSettingControl, !oldSettingControlESet);
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
    public void setSettingControl( SettingControl newSettingControl ) {
        if (newSettingControl != settingControl) {
            NotificationChain msgs = null;
            if (settingControl != null)
                msgs = ((InternalEObject)settingControl).eInverseRemove(this, SclPackage.SETTING_CONTROL__LN0, SettingControl.class, msgs);
            if (newSettingControl != null)
                msgs = ((InternalEObject)newSettingControl).eInverseAdd(this, SclPackage.SETTING_CONTROL__LN0, SettingControl.class, msgs);
            msgs = basicSetSettingControl(newSettingControl, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldSettingControlESet = settingControlESet;
            settingControlESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LN0__SETTING_CONTROL, newSettingControl, newSettingControl, !oldSettingControlESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSettingControl( NotificationChain msgs ) {
        SettingControl oldSettingControl = settingControl;
        settingControl = null;
        boolean oldSettingControlESet = settingControlESet;
        settingControlESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.LN0__SETTING_CONTROL, oldSettingControl, null, oldSettingControlESet);
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
    public void unsetSettingControl() {
        if (settingControl != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)settingControl).eInverseRemove(this, SclPackage.SETTING_CONTROL__LN0, SettingControl.class, msgs);
            msgs = basicUnsetSettingControl(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldSettingControlESet = settingControlESet;
            settingControlESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LN0__SETTING_CONTROL, null, null, oldSettingControlESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSettingControl() {
        return settingControlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FeatureMap getControlWithIEDName() {
        return (FeatureMap)getControl().<FeatureMap.Entry>list(SclPackage.eINSTANCE.getLN0_ControlWithIEDName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControlWithIEDName() {
        ((FeatureMap.Internal)getControl()).clear(SclPackage.eINSTANCE.getLN0_ControlWithIEDName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlWithIEDName() {
        return !((FeatureMap.Internal)getControl()).isEmpty(SclPackage.eINSTANCE.getLN0_ControlWithIEDName());
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
            case SclPackage.LN0__GSE_CONTROL:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getGSEControl()).basicAdd(otherEnd, msgs);
            case SclPackage.LN0__LDEVICE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetLDevice((LDevice)otherEnd, msgs);
            case SclPackage.LN0__SAMPLED_VALUE_CONTROL:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSampledValueControl()).basicAdd(otherEnd, msgs);
            case SclPackage.LN0__SETTING_CONTROL:
                if (settingControl != null)
                    msgs = ((InternalEObject)settingControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.LN0__SETTING_CONTROL, null, msgs);
                return basicSetSettingControl((SettingControl)otherEnd, msgs);
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
            case SclPackage.LN0__GSE_CONTROL:
                return ((InternalEList<?>)getGSEControl()).basicRemove(otherEnd, msgs);
            case SclPackage.LN0__LDEVICE:
                return basicSetLDevice(null, msgs);
            case SclPackage.LN0__SAMPLED_VALUE_CONTROL:
                return ((InternalEList<?>)getSampledValueControl()).basicRemove(otherEnd, msgs);
            case SclPackage.LN0__SETTING_CONTROL:
                return basicUnsetSettingControl(msgs);
            case SclPackage.LN0__CONTROL_WITH_IED_NAME:
                return ((InternalEList<?>)getControlWithIEDName()).basicRemove(otherEnd, msgs);
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
            case SclPackage.LN0__LDEVICE:
                return eInternalContainer().eInverseRemove(this, SclPackage.LDEVICE__LN0, LDevice.class, msgs);
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
            case SclPackage.LN0__GSE_CONTROL:
                return getGSEControl();
            case SclPackage.LN0__LDEVICE:
                return getLDevice();
            case SclPackage.LN0__SAMPLED_VALUE_CONTROL:
                return getSampledValueControl();
            case SclPackage.LN0__SETTING_CONTROL:
                return getSettingControl();
            case SclPackage.LN0__CONTROL_WITH_IED_NAME:
                if (coreType) return getControlWithIEDName();
                return ((FeatureMap.Internal)getControlWithIEDName()).getWrapper();
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
            case SclPackage.LN0__GSE_CONTROL:
                getGSEControl().clear();
                getGSEControl().addAll((Collection<? extends GSEControl>)newValue);
                return;
            case SclPackage.LN0__LDEVICE:
                setLDevice((LDevice)newValue);
                return;
            case SclPackage.LN0__SAMPLED_VALUE_CONTROL:
                getSampledValueControl().clear();
                getSampledValueControl().addAll((Collection<? extends SampledValueControl>)newValue);
                return;
            case SclPackage.LN0__SETTING_CONTROL:
                setSettingControl((SettingControl)newValue);
                return;
            case SclPackage.LN0__CONTROL_WITH_IED_NAME:
                ((FeatureMap.Internal)getControlWithIEDName()).set(newValue);
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
            case SclPackage.LN0__GSE_CONTROL:
                unsetGSEControl();
                return;
            case SclPackage.LN0__LDEVICE:
                setLDevice((LDevice)null);
                return;
            case SclPackage.LN0__SAMPLED_VALUE_CONTROL:
                unsetSampledValueControl();
                return;
            case SclPackage.LN0__SETTING_CONTROL:
                unsetSettingControl();
                return;
            case SclPackage.LN0__CONTROL_WITH_IED_NAME:
                unsetControlWithIEDName();
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
            case SclPackage.LN0__GSE_CONTROL:
                return isSetGSEControl();
            case SclPackage.LN0__LDEVICE:
                return getLDevice() != null;
            case SclPackage.LN0__SAMPLED_VALUE_CONTROL:
                return isSetSampledValueControl();
            case SclPackage.LN0__SETTING_CONTROL:
                return isSetSettingControl();
            case SclPackage.LN0__CONTROL_WITH_IED_NAME:
                return isSetControlWithIEDName();
        }
        return super.eIsSet(featureID);
    }

} //LN0Impl
