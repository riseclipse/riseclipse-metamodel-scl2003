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

import java.util.Collections;
import java.util.List;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Address;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMV;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclSwitch;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlBlockImpl#getCbName <em>Cb Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlBlockImpl#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlBlockImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlBlockImpl#getRefersToLDevice <em>Refers To LDevice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlBlockImpl#getRefersToControlWithIEDName <em>Refers To Control With IED Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ControlBlockImpl extends UnNamingImpl implements ControlBlock {
    /**
     * The default value of the '{@link #getCbName() <em>Cb Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCbName()
     * @generated
     * @ordered
     */
    protected static final String CB_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCbName() <em>Cb Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCbName()
     * @generated
     * @ordered
     */
    protected String cbName = CB_NAME_EDEFAULT;

    /**
     * This is true if the Cb Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cbNameESet;

    /**
     * The default value of the '{@link #getLdInst() <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLdInst()
     * @generated
     * @ordered
     */
    protected static final String LD_INST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLdInst() <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLdInst()
     * @generated
     * @ordered
     */
    protected String ldInst = LD_INST_EDEFAULT;

    /**
     * This is true if the Ld Inst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ldInstESet;

    /**
     * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddress()
     * @generated
     * @ordered
     */
    protected Address address;

    /**
     * This is true if the Address containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean addressESet;

    /**
     * The cached value of the '{@link #getRefersToLDevice() <em>Refers To LDevice</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToLDevice()
     * @generated
     * @ordered
     */
    protected LDevice refersToLDevice;

    /**
     * This is true if the Refers To LDevice reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToLDeviceESet;

    /**
     * The cached value of the '{@link #getRefersToControlWithIEDName() <em>Refers To Control With IED Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToControlWithIEDName()
     * @generated
     * @ordered
     */
    protected ControlWithIEDName refersToControlWithIEDName;

    /**
     * This is true if the Refers To Control With IED Name reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToControlWithIEDNameESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ControlBlockImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getControlBlock();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCbName() {
        return cbName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCbName( String newCbName ) {
        String oldCbName = cbName;
        cbName = newCbName;
        boolean oldCbNameESet = cbNameESet;
        cbNameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL_BLOCK__CB_NAME, oldCbName, cbName, !oldCbNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetCbName() {
        String oldCbName = cbName;
        boolean oldCbNameESet = cbNameESet;
        cbName = CB_NAME_EDEFAULT;
        cbNameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL_BLOCK__CB_NAME, oldCbName, CB_NAME_EDEFAULT, oldCbNameESet));
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
    public String getLdInst() {
        return ldInst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLdInst( String newLdInst ) {
        String oldLdInst = ldInst;
        ldInst = newLdInst;
        boolean oldLdInstESet = ldInstESet;
        ldInstESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL_BLOCK__LD_INST, oldLdInst, ldInst, !oldLdInstESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLdInst() {
        String oldLdInst = ldInst;
        boolean oldLdInstESet = ldInstESet;
        ldInst = LD_INST_EDEFAULT;
        ldInstESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL_BLOCK__LD_INST, oldLdInst, LD_INST_EDEFAULT, oldLdInstESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLdInst() {
        return ldInstESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Address getAddress() {
        return address;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAddress( Address newAddress, NotificationChain msgs ) {
        Address oldAddress = address;
        address = newAddress;
        boolean oldAddressESet = addressESet;
        addressESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL_BLOCK__ADDRESS, oldAddress, newAddress, !oldAddressESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAddress( Address newAddress ) {
        if (newAddress != address) {
            NotificationChain msgs = null;
            if (address != null)
                msgs = ((InternalEObject)address).eInverseRemove(this, SclPackage.ADDRESS__CONTROL_BLOCK, Address.class, msgs);
            if (newAddress != null)
                msgs = ((InternalEObject)newAddress).eInverseAdd(this, SclPackage.ADDRESS__CONTROL_BLOCK, Address.class, msgs);
            msgs = basicSetAddress(newAddress, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldAddressESet = addressESet;
            addressESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL_BLOCK__ADDRESS, newAddress, newAddress, !oldAddressESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAddress( NotificationChain msgs ) {
        Address oldAddress = address;
        address = null;
        boolean oldAddressESet = addressESet;
        addressESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL_BLOCK__ADDRESS, oldAddress, null, oldAddressESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAddress() {
        if (address != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)address).eInverseRemove(this, SclPackage.ADDRESS__CONTROL_BLOCK, Address.class, msgs);
            msgs = basicUnsetAddress(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldAddressESet = addressESet;
            addressESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL_BLOCK__ADDRESS, null, null, oldAddressESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAddress() {
        return addressESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LDevice getRefersToLDevice() {
        return refersToLDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToLDevice( LDevice newRefersToLDevice, NotificationChain msgs ) {
        LDevice oldRefersToLDevice = refersToLDevice;
        refersToLDevice = newRefersToLDevice;
        boolean oldRefersToLDeviceESet = refersToLDeviceESet;
        refersToLDeviceESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL_BLOCK__REFERS_TO_LDEVICE, oldRefersToLDevice, newRefersToLDevice, !oldRefersToLDeviceESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRefersToLDevice( LDevice newRefersToLDevice ) {
        if (newRefersToLDevice != refersToLDevice) {
            NotificationChain msgs = null;
            if (refersToLDevice != null)
                msgs = ((InternalEObject)refersToLDevice).eInverseRemove(this, SclPackage.LDEVICE__REFERRED_BY_CONTROL_BLOCK, LDevice.class, msgs);
            if (newRefersToLDevice != null)
                msgs = ((InternalEObject)newRefersToLDevice).eInverseAdd(this, SclPackage.LDEVICE__REFERRED_BY_CONTROL_BLOCK, LDevice.class, msgs);
            msgs = basicSetRefersToLDevice(newRefersToLDevice, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToLDeviceESet = refersToLDeviceESet;
            refersToLDeviceESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL_BLOCK__REFERS_TO_LDEVICE, newRefersToLDevice, newRefersToLDevice, !oldRefersToLDeviceESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToLDevice( NotificationChain msgs ) {
        LDevice oldRefersToLDevice = refersToLDevice;
        refersToLDevice = null;
        boolean oldRefersToLDeviceESet = refersToLDeviceESet;
        refersToLDeviceESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL_BLOCK__REFERS_TO_LDEVICE, oldRefersToLDevice, null, oldRefersToLDeviceESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetRefersToLDevice() {
        if (refersToLDevice != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)refersToLDevice).eInverseRemove(this, SclPackage.LDEVICE__REFERRED_BY_CONTROL_BLOCK, LDevice.class, msgs);
            msgs = basicUnsetRefersToLDevice(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToLDeviceESet = refersToLDeviceESet;
            refersToLDeviceESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL_BLOCK__REFERS_TO_LDEVICE, null, null, oldRefersToLDeviceESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetRefersToLDevice() {
        return refersToLDeviceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControlWithIEDName getRefersToControlWithIEDName() {
        return refersToControlWithIEDName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToControlWithIEDName( ControlWithIEDName newRefersToControlWithIEDName,
            NotificationChain msgs ) {
        ControlWithIEDName oldRefersToControlWithIEDName = refersToControlWithIEDName;
        refersToControlWithIEDName = newRefersToControlWithIEDName;
        boolean oldRefersToControlWithIEDNameESet = refersToControlWithIEDNameESet;
        refersToControlWithIEDNameESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL_BLOCK__REFERS_TO_CONTROL_WITH_IED_NAME, oldRefersToControlWithIEDName, newRefersToControlWithIEDName, !oldRefersToControlWithIEDNameESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRefersToControlWithIEDName( ControlWithIEDName newRefersToControlWithIEDName ) {
        if (newRefersToControlWithIEDName != refersToControlWithIEDName) {
            NotificationChain msgs = null;
            if (refersToControlWithIEDName != null)
                msgs = ((InternalEObject)refersToControlWithIEDName).eInverseRemove(this, SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK, ControlWithIEDName.class, msgs);
            if (newRefersToControlWithIEDName != null)
                msgs = ((InternalEObject)newRefersToControlWithIEDName).eInverseAdd(this, SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK, ControlWithIEDName.class, msgs);
            msgs = basicSetRefersToControlWithIEDName(newRefersToControlWithIEDName, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToControlWithIEDNameESet = refersToControlWithIEDNameESet;
            refersToControlWithIEDNameESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL_BLOCK__REFERS_TO_CONTROL_WITH_IED_NAME, newRefersToControlWithIEDName, newRefersToControlWithIEDName, !oldRefersToControlWithIEDNameESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToControlWithIEDName( NotificationChain msgs ) {
        ControlWithIEDName oldRefersToControlWithIEDName = refersToControlWithIEDName;
        refersToControlWithIEDName = null;
        boolean oldRefersToControlWithIEDNameESet = refersToControlWithIEDNameESet;
        refersToControlWithIEDNameESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL_BLOCK__REFERS_TO_CONTROL_WITH_IED_NAME, oldRefersToControlWithIEDName, null, oldRefersToControlWithIEDNameESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetRefersToControlWithIEDName() {
        if (refersToControlWithIEDName != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)refersToControlWithIEDName).eInverseRemove(this, SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK, ControlWithIEDName.class, msgs);
            msgs = basicUnsetRefersToControlWithIEDName(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToControlWithIEDNameESet = refersToControlWithIEDNameESet;
            refersToControlWithIEDNameESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL_BLOCK__REFERS_TO_CONTROL_WITH_IED_NAME, null, null, oldRefersToControlWithIEDNameESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetRefersToControlWithIEDName() {
        return refersToControlWithIEDNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.CONTROL_BLOCK__ADDRESS:
                if (address != null)
                    msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.CONTROL_BLOCK__ADDRESS, null, msgs);
                return basicSetAddress((Address)otherEnd, msgs);
            case SclPackage.CONTROL_BLOCK__REFERS_TO_LDEVICE:
                if (refersToLDevice != null)
                    msgs = ((InternalEObject)refersToLDevice).eInverseRemove(this, SclPackage.LDEVICE__REFERRED_BY_CONTROL_BLOCK, LDevice.class, msgs);
                return basicSetRefersToLDevice((LDevice)otherEnd, msgs);
            case SclPackage.CONTROL_BLOCK__REFERS_TO_CONTROL_WITH_IED_NAME:
                if (refersToControlWithIEDName != null)
                    msgs = ((InternalEObject)refersToControlWithIEDName).eInverseRemove(this, SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK, ControlWithIEDName.class, msgs);
                return basicSetRefersToControlWithIEDName((ControlWithIEDName)otherEnd, msgs);
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
            case SclPackage.CONTROL_BLOCK__ADDRESS:
                return basicUnsetAddress(msgs);
            case SclPackage.CONTROL_BLOCK__REFERS_TO_LDEVICE:
                return basicUnsetRefersToLDevice(msgs);
            case SclPackage.CONTROL_BLOCK__REFERS_TO_CONTROL_WITH_IED_NAME:
                return basicUnsetRefersToControlWithIEDName(msgs);
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
            case SclPackage.CONTROL_BLOCK__CB_NAME:
                return getCbName();
            case SclPackage.CONTROL_BLOCK__LD_INST:
                return getLdInst();
            case SclPackage.CONTROL_BLOCK__ADDRESS:
                return getAddress();
            case SclPackage.CONTROL_BLOCK__REFERS_TO_LDEVICE:
                return getRefersToLDevice();
            case SclPackage.CONTROL_BLOCK__REFERS_TO_CONTROL_WITH_IED_NAME:
                return getRefersToControlWithIEDName();
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
            case SclPackage.CONTROL_BLOCK__CB_NAME:
                setCbName((String)newValue);
                return;
            case SclPackage.CONTROL_BLOCK__LD_INST:
                setLdInst((String)newValue);
                return;
            case SclPackage.CONTROL_BLOCK__ADDRESS:
                setAddress((Address)newValue);
                return;
            case SclPackage.CONTROL_BLOCK__REFERS_TO_LDEVICE:
                setRefersToLDevice((LDevice)newValue);
                return;
            case SclPackage.CONTROL_BLOCK__REFERS_TO_CONTROL_WITH_IED_NAME:
                setRefersToControlWithIEDName((ControlWithIEDName)newValue);
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
            case SclPackage.CONTROL_BLOCK__CB_NAME:
                unsetCbName();
                return;
            case SclPackage.CONTROL_BLOCK__LD_INST:
                unsetLdInst();
                return;
            case SclPackage.CONTROL_BLOCK__ADDRESS:
                unsetAddress();
                return;
            case SclPackage.CONTROL_BLOCK__REFERS_TO_LDEVICE:
                unsetRefersToLDevice();
                return;
            case SclPackage.CONTROL_BLOCK__REFERS_TO_CONTROL_WITH_IED_NAME:
                unsetRefersToControlWithIEDName();
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
            case SclPackage.CONTROL_BLOCK__CB_NAME:
                return isSetCbName();
            case SclPackage.CONTROL_BLOCK__LD_INST:
                return isSetLdInst();
            case SclPackage.CONTROL_BLOCK__ADDRESS:
                return isSetAddress();
            case SclPackage.CONTROL_BLOCK__REFERS_TO_LDEVICE:
                return isSetRefersToLDevice();
            case SclPackage.CONTROL_BLOCK__REFERS_TO_CONTROL_WITH_IED_NAME:
                return isSetRefersToControlWithIEDName();
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
        result.append(" (cbName: ");
        if (cbNameESet) result.append(cbName); else result.append("<unset>");
        result.append(", ldInst: ");
        if (ldInstESet) result.append(ldInst); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

    @Override
    protected void doResolveLinks() {
        // see Issue #13
        super.doResolveLinks();
        
        // desc    Textual description
        // ldInst  The instance identification of the LD within this IED, on which the control block is located.
        //         An LN is not necessary, as these control blocks are only in LLN0.
        // cbName  The name of the control block within the LLN0 of the LD ldInst.

        // TODO: update comment
        // Assumption : we need both an ied name and a ld instance to uniquely identify a LDevice.
        //              We will use the iedName provided by the enclosing connectedAP.

        if( getLdInst() == null ) return;

        IED ied = null;
        // TODO: put connectedAP in ControlBlock
        if( this instanceof GSE ) {
            GSE gse = ( ( GSE ) this );
            if( gse.getConnectedAP() == null ) return;
            gse.getConnectedAP().resolveLinks();
            if( gse.getConnectedAP().getRefersToAccessPoint() == null ) return;
            ied = gse.getConnectedAP().getRefersToAccessPoint().getIED();
        }
        else if( this instanceof SMV ) {
            SMV smv = ( ( SMV ) this );
            if( smv.getConnectedAP() == null ) return;
            smv.getConnectedAP().resolveLinks();
            if( smv.getConnectedAP().getRefersToAccessPoint() == null ) return;
            ied = ( ( SMV ) this ).getConnectedAP().getRefersToAccessPoint().getIED();
        }
        else {
            return;
        }
        if( ied == null ) return;

        // find an LDevice with
        //   LDevice.inst == ControlBlock.ldInst
        SclSwitch< Boolean > s = new SclSwitch< Boolean >() {

            @Override
            public Boolean caseLDevice( LDevice object ) {
                return getLdInst().equals( object.getInst() );
            }

            @Override
            public Boolean defaultCase( EObject object ) {
                return false;
            }

        };

        List< LDevice > res1 = deepSearchObjects( ied.getAccessPoint(), s );
        String mess1 = "LDevice( inst = " + getLdInst() + " ) for ControlBlock on line " + getLineNumber()
                + " ( cbName = " + getCbName() + " )";
        if( res1.isEmpty() ) {
            AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess1 );
            return;
        }
        if( res1.size() > 1 ) {
            AbstractRiseClipseConsole.getConsole().error( "found several " + mess1 );
            return;
        }
        // AbstractRiseClipseConsole.getConsole().info( "found " + mess );
        setRefersToLDevice( res1.get( 0 ) );

        if( getCbName() == null ) return;

        // Find a GSEControl inside LN0 of LDevice with
        //   GSEControl.name == ControlBlock.bName
        SclSwitch< Boolean > s2 = new SclSwitch< Boolean >() {

            @Override
            public Boolean caseControlWithIEDName( ControlWithIEDName object ) {
                return getCbName().equals( object.getName() );
            }

            @Override
            public Boolean defaultCase( EObject object ) {
                return false;
            }

        };

        if( getRefersToLDevice().getLN0() == null ) return;
        List< ControlWithIEDName > l2 = Collections.< ControlWithIEDName > unmodifiableList(
                getRefersToLDevice().getLN0().getGSEControl() );
        List< ControlWithIEDName > res2 = shallowSearchObjects( l2, s2 );
        if( res2.isEmpty() ) {
            l2 = Collections.< ControlWithIEDName > unmodifiableList( 
                    getRefersToLDevice().getLN0().getSampledValueControl() );
            res2 = shallowSearchObjects( l2, s2 );
        }
        String mess2 = "ControlWithIEDName( name = " + getCbName() + " ) for ControlBlock on line "
                + getLineNumber() + " ( ldInst = " + getLdInst() + " )";
        if( res2.isEmpty() ) {
            AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess2 );
            return;
        }
        if( res2.size() > 1 ) {
            AbstractRiseClipseConsole.getConsole().error( "found several " + mess2 );
            return;
        }
        // AbstractRiseClipseConsole.getConsole().info( "found " + mess2 );
        setRefersToControlWithIEDName( res2.get( 0 ) );
    }

} //ControlBlockImpl
