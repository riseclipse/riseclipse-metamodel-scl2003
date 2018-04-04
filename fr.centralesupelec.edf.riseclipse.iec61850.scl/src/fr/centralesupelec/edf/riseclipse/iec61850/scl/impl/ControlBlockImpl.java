/**
 *  Copyright (c) 2017 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import java.util.Collections;
import java.util.List;

import java.util.Map;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Address;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMV;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclSwitch;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;

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
     * @generated NOT
     */
    public String getCbName() {
        if( isSetRefersToControlWithIEDName() )
            return getRefersToControlWithIEDName().getName();
        else
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
     * @generated NOT
     */
    public boolean isSetCbName() {
        return isSetRefersToControlWithIEDName();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getLdInst() {
        if( isSetRefersToLDevice() )
            return getRefersToLDevice().getInst();
        else
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
    * @generated NOT
    */
    public boolean isSetLdInst() {
        return isSetRefersToLDevice();
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
	public boolean validateControlBlock_ldInst_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ControlBlock_ldInst_required:
		 *   let
		 *     severity : Integer[1] = 'ControlBlock::ControlBlock_ldInst_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.ldInst <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'ldInst attribute shall be present in ControlBlock (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'ControlBlock::ControlBlock_ldInst_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ControlBlock_c_c_ControlBlock_ldInst_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String ldInst = this.getLdInst();
			final /*@NonInvalid*/ boolean status = ldInst != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_ldInst_32_attribute_32_shall_32_be_32_present_32_in_32_ControlBlock_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ControlBlock_c_c_ControlBlock_ldInst_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlBlock_ldInst_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ControlBlock_ldInst_valid:
		 *   let
		 *     severity : Integer[1] = 'ControlBlock::ControlBlock_ldInst_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.ldInst <> null implies
		 *           self.validSclLDInst(ldInst)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'ldInst attribute shall be valid in ControlBlock (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.ldInst.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ControlBlock::ControlBlock_ldInst_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ControlBlock_c_c_ControlBlock_ldInst_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String ldInst = this.getLdInst();
				final /*@NonInvalid*/ boolean ne = ldInst != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclLDInst = ((SclObject)this).validSclLDInst(ldInst);
					status = validSclLDInst;
				}
				else {
					status = ValueUtil.TRUE_VALUE;
				}
				/*@Thrown*/ Object symbol_1;
				if (status) {
					symbol_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_ldInst_32_attribute_32_shall_32_be_32_valid_32_in_32_ControlBlock_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(ldInst);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ControlBlock_c_c_ControlBlock_ldInst_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlBlock_cbName_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ControlBlock_cbName_required:
		 *   let
		 *     severity : Integer[1] = 'ControlBlock::ControlBlock_cbName_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.cbName <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'cbName attribute shall be present ControlBlock (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'ControlBlock::ControlBlock_cbName_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ControlBlock_c_c_ControlBlock_cbName_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String cbName = this.getCbName();
			final /*@NonInvalid*/ boolean status = cbName != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_cbName_32_attribute_32_shall_32_be_32_present_32_ControlBlock_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ControlBlock_c_c_ControlBlock_cbName_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlBlock_cbName_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ControlBlock_cbName_valid:
		 *   let
		 *     severity : Integer[1] = 'ControlBlock::ControlBlock_cbName_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.cbName <> null implies
		 *           self.validSclCBName(cbName)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'cbName attribute shall be valid ControlBlock (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.cbName.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ControlBlock::ControlBlock_cbName_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ControlBlock_c_c_ControlBlock_cbName_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String cbName = this.getCbName();
				final /*@NonInvalid*/ boolean ne = cbName != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclCBName = ((SclObject)this).validSclCBName(cbName);
					status = validSclCBName;
				}
				else {
					status = ValueUtil.TRUE_VALUE;
				}
				/*@Thrown*/ Object symbol_1;
				if (status) {
					symbol_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_cbName_32_attribute_32_shall_32_be_32_valid_32_ControlBlock_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(cbName);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ControlBlock_c_c_ControlBlock_cbName_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SclPackage.CONTROL_BLOCK___VALIDATE_CONTROL_BLOCK_LD_INST_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateControlBlock_ldInst_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CONTROL_BLOCK___VALIDATE_CONTROL_BLOCK_LD_INST_VALID__DIAGNOSTICCHAIN_MAP:
				return validateControlBlock_ldInst_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CONTROL_BLOCK___VALIDATE_CONTROL_BLOCK_CB_NAME_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateControlBlock_cbName_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CONTROL_BLOCK___VALIDATE_CONTROL_BLOCK_CB_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateControlBlock_cbName_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", ldInst: ");
		if (ldInstESet) result.append(ldInst); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

    @Override
    protected void doResolveLinks() {
        // desc    Textual description
        // ldInst  The instance identification of the LD within this IED, on which the control block is located.
        //         An LN is not necessary, as these control blocks are only in LLN0.
        // cbName  The name of the control block within the LLN0 of the LD ldInst.

        // TODO: update comment
        // Assumption : we need both an ied name and a ld instance to uniquely identify a LDevice.
        //              We will use the iedName provided by the enclosing connectedAP.
        IED ied = null;
        // TODO: put connectedAP in ControlBlock
        if( this instanceof GSE ) {
            ( ( GSE ) this ).getConnectedAP().resolveLinks();
            ied = ( ( GSE ) this ).getConnectedAP().getRefersToAccessPoint().getIED();
        }
        else {
            ( ( SMV ) this ).getConnectedAP().resolveLinks();
            ied = ( ( SMV ) this ).getConnectedAP().getRefersToAccessPoint().getIED();
        }

        // Resolve only if attribute has been read
        // Cannot use isSetLdInst() Here
        if( !ldInstESet ) return;

        // find an LDevice with
        //   LDevice.inst == ControlBlock.ldInst
        SclSwitch< Boolean > s = new SclSwitch< Boolean >() {

            @Override
            public Boolean caseLDevice( LDevice object ) {
                return object.getInst().equals( getLdInst() );
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
        }
        else if( res1.size() > 1 ) {
            AbstractRiseClipseConsole.getConsole().error( "found several " + mess1 );
        }
        else {
            // AbstractRiseClipseConsole.getConsole().info( "found " + mess );
            setRefersToLDevice( res1.get( 0 ) );
        }

        // Resolve only if attribute has been read
        // Cannot use isSetCbName() Here
        if( !cbNameESet ) return;

        // Find a GSEControl inside LN0 of LDevice with
        //   GSEControl.name == ControlBlock.bName
        SclSwitch< Boolean > s2 = new SclSwitch< Boolean >() {

            @Override
            public Boolean caseControlWithIEDName( ControlWithIEDName object ) {
                return object.getName().equals( getCbName() );
            }

            @Override
            public Boolean defaultCase( EObject object ) {
                return false;
            }

        };

        if( isSetRefersToLDevice() ) {
            List< ControlWithIEDName > l2 = Collections.< ControlWithIEDName > unmodifiableList( getRefersToLDevice()
                    .getLN0().getGSEControl() );
            List< ControlWithIEDName > res2 = shallowSearchObjects( l2, s2 );
            if( res2.isEmpty() ) {
                l2 = Collections.< ControlWithIEDName > unmodifiableList( getRefersToLDevice().getLN0()
                        .getSampledValueControl() );
                res2 = shallowSearchObjects( l2, s2 );
            }
            String mess2 = "ControlWithIEDName( name = " + getCbName() + " ) for ControlBlock on line "
                    + getLineNumber() + " ( ldInst = " + getLdInst() + " )";
            if( res2.isEmpty() ) {
                AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess2 );
            }
            else if( res2.size() > 1 ) {
                AbstractRiseClipseConsole.getConsole().error( "found several " + mess2 );
            }
            else {
                // AbstractRiseClipseConsole.getConsole().info( "found " + mess2 );
                setRefersToControlWithIEDName( res2.get( 0 ) );
            }
        }
    }

} //ControlBlockImpl
