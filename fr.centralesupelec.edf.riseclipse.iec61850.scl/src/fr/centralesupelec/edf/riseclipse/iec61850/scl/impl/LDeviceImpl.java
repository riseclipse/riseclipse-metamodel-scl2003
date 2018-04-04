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

import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Server;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LDevice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl#getInst <em>Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl#getLdName <em>Ld Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl#getReferredByControlBlock <em>Referred By Control Block</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl#getServer <em>Server</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl#getLNode <em>LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl#getLN <em>LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl#getLN0 <em>LN0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LDeviceImpl extends UnNamingImpl implements LDevice {
    /**
	 * The default value of the '{@link #getInst() <em>Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInst()
	 * @generated
	 * @ordered
	 */
    protected static final String INST_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getInst() <em>Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInst()
	 * @generated
	 * @ordered
	 */
    protected String inst = INST_EDEFAULT;

    /**
	 * This is true if the Inst attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean instESet;

    /**
	 * The default value of the '{@link #getLdName() <em>Ld Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLdName()
	 * @generated
	 * @ordered
	 */
    protected static final String LD_NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getLdName() <em>Ld Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLdName()
	 * @generated
	 * @ordered
	 */
    protected String ldName = LD_NAME_EDEFAULT;

    /**
	 * This is true if the Ld Name attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean ldNameESet;

    /**
	 * The cached value of the '{@link #getReferredByControlBlock() <em>Referred By Control Block</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReferredByControlBlock()
	 * @generated
	 * @ordered
	 */
    protected EList<ControlBlock> referredByControlBlock;

    /**
	 * The cached value of the '{@link #getAccessControl() <em>Access Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAccessControl()
	 * @generated
	 * @ordered
	 */
    protected AccessControl accessControl;

    /**
	 * This is true if the Access Control containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean accessControlESet;

    /**
	 * The cached value of the '{@link #getLNode() <em>LNode</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLNode()
	 * @generated
	 * @ordered
	 */
    protected EList<LNode> lNode;

    /**
	 * The cached value of the '{@link #getLN() <em>LN</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLN()
	 * @generated
	 * @ordered
	 */
    protected EList<LN> ln;

    /**
	 * The cached value of the '{@link #getLN0() <em>LN0</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLN0()
	 * @generated
	 * @ordered
	 */
    protected LN0 ln0;

    /**
	 * This is true if the LN0 containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean ln0ESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected LDeviceImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.LDEVICE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getInst() {
		return inst;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setInst( String newInst ) {
		String oldInst = inst;
		inst = newInst;
		boolean oldInstESet = instESet;
		instESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LDEVICE__INST, oldInst, inst, !oldInstESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetInst() {
		String oldInst = inst;
		boolean oldInstESet = instESet;
		inst = INST_EDEFAULT;
		instESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LDEVICE__INST, oldInst, INST_EDEFAULT, oldInstESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetInst() {
		return instESet;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getLdName() {
        // the default is the IED name concatenated with the inst
        if( isSetLdName() ) {
            return ldName;
        }
        return getServer().getAccessPoint().getIED().getName() + getInst();
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLdName( String newLdName ) {
		String oldLdName = ldName;
		ldName = newLdName;
		boolean oldLdNameESet = ldNameESet;
		ldNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LDEVICE__LD_NAME, oldLdName, ldName, !oldLdNameESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetLdName() {
		String oldLdName = ldName;
		boolean oldLdNameESet = ldNameESet;
		ldName = LD_NAME_EDEFAULT;
		ldNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LDEVICE__LD_NAME, oldLdName, LD_NAME_EDEFAULT, oldLdNameESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetLdName() {
		return ldNameESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ControlBlock> getReferredByControlBlock() {
		if (referredByControlBlock == null) {
			referredByControlBlock = new EObjectWithInverseEList.Unsettable<ControlBlock>(ControlBlock.class, this, SclPackage.LDEVICE__REFERRED_BY_CONTROL_BLOCK, SclPackage.CONTROL_BLOCK__REFERS_TO_LDEVICE);
		}
		return referredByControlBlock;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetReferredByControlBlock() {
		if (referredByControlBlock != null) ((InternalEList.Unsettable<?>)referredByControlBlock).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetReferredByControlBlock() {
		return referredByControlBlock != null && ((InternalEList.Unsettable<?>)referredByControlBlock).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AccessControl getAccessControl() {
		return accessControl;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetAccessControl( AccessControl newAccessControl, NotificationChain msgs ) {
		AccessControl oldAccessControl = accessControl;
		accessControl = newAccessControl;
		boolean oldAccessControlESet = accessControlESet;
		accessControlESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.LDEVICE__ACCESS_CONTROL, oldAccessControl, newAccessControl, !oldAccessControlESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAccessControl( AccessControl newAccessControl ) {
		if (newAccessControl != accessControl) {
			NotificationChain msgs = null;
			if (accessControl != null)
				msgs = ((InternalEObject)accessControl).eInverseRemove(this, SclPackage.ACCESS_CONTROL__LDEVICE, AccessControl.class, msgs);
			if (newAccessControl != null)
				msgs = ((InternalEObject)newAccessControl).eInverseAdd(this, SclPackage.ACCESS_CONTROL__LDEVICE, AccessControl.class, msgs);
			msgs = basicSetAccessControl(newAccessControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAccessControlESet = accessControlESet;
			accessControlESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LDEVICE__ACCESS_CONTROL, newAccessControl, newAccessControl, !oldAccessControlESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetAccessControl( NotificationChain msgs ) {
		AccessControl oldAccessControl = accessControl;
		accessControl = null;
		boolean oldAccessControlESet = accessControlESet;
		accessControlESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.LDEVICE__ACCESS_CONTROL, oldAccessControl, null, oldAccessControlESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetAccessControl() {
		if (accessControl != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)accessControl).eInverseRemove(this, SclPackage.ACCESS_CONTROL__LDEVICE, AccessControl.class, msgs);
			msgs = basicUnsetAccessControl(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAccessControlESet = accessControlESet;
			accessControlESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LDEVICE__ACCESS_CONTROL, null, null, oldAccessControlESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetAccessControl() {
		return accessControlESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Server getServer() {
		if (eContainerFeatureID() != SclPackage.LDEVICE__SERVER) return null;
		return (Server)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetServer( Server newServer, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newServer, SclPackage.LDEVICE__SERVER, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setServer( Server newServer ) {
		if (newServer != eInternalContainer() || (eContainerFeatureID() != SclPackage.LDEVICE__SERVER && newServer != null)) {
			if (EcoreUtil.isAncestor(this, newServer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServer != null)
				msgs = ((InternalEObject)newServer).eInverseAdd(this, SclPackage.SERVER__LDEVICE, Server.class, msgs);
			msgs = basicSetServer(newServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LDEVICE__SERVER, newServer, newServer));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<LNode> getLNode() {
		if (lNode == null) {
			lNode = new EObjectWithInverseEList.Unsettable<LNode>(LNode.class, this, SclPackage.LDEVICE__LNODE, SclPackage.LNODE__LDEVICE);
		}
		return lNode;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetLNode() {
		if (lNode != null) ((InternalEList.Unsettable<?>)lNode).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetLNode() {
		return lNode != null && ((InternalEList.Unsettable<?>)lNode).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<LN> getLN() {
		if (ln == null) {
			ln = new EObjectContainmentWithInverseEList.Unsettable<LN>(LN.class, this, SclPackage.LDEVICE__LN, SclPackage.LN__LDEVICE);
		}
		return ln;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetLN() {
		if (ln != null) ((InternalEList.Unsettable<?>)ln).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetLN() {
		return ln != null && ((InternalEList.Unsettable<?>)ln).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LN0 getLN0() {
		return ln0;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLN0( LN0 newLN0, NotificationChain msgs ) {
		LN0 oldLN0 = ln0;
		ln0 = newLN0;
		boolean oldLN0ESet = ln0ESet;
		ln0ESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.LDEVICE__LN0, oldLN0, newLN0, !oldLN0ESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLN0( LN0 newLN0 ) {
		if (newLN0 != ln0) {
			NotificationChain msgs = null;
			if (ln0 != null)
				msgs = ((InternalEObject)ln0).eInverseRemove(this, SclPackage.LN0__LDEVICE, LN0.class, msgs);
			if (newLN0 != null)
				msgs = ((InternalEObject)newLN0).eInverseAdd(this, SclPackage.LN0__LDEVICE, LN0.class, msgs);
			msgs = basicSetLN0(newLN0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLN0ESet = ln0ESet;
			ln0ESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LDEVICE__LN0, newLN0, newLN0, !oldLN0ESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetLN0( NotificationChain msgs ) {
		LN0 oldLN0 = ln0;
		ln0 = null;
		boolean oldLN0ESet = ln0ESet;
		ln0ESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.LDEVICE__LN0, oldLN0, null, oldLN0ESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetLN0() {
		if (ln0 != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)ln0).eInverseRemove(this, SclPackage.LN0__LDEVICE, LN0.class, msgs);
			msgs = basicUnsetLN0(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLN0ESet = ln0ESet;
			ln0ESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LDEVICE__LN0, null, null, oldLN0ESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetLN0() {
		return ln0ESet;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLDevice_inst_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv LDevice_inst_required:
		 *   let severity : Integer[1] = 'LDevice::LDevice_inst_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.inst <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'inst attribute shall be present in LDevice (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'LDevice::LDevice_inst_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_LDevice_c_c_LDevice_inst_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String inst = this.getInst();
			final /*@NonInvalid*/ boolean status = inst != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_inst_32_attribute_32_shall_32_be_32_present_32_in_32_LDevice_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_LDevice_c_c_LDevice_inst_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLDevice_inst_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv LDevice_inst_valid:
		 *   let severity : Integer[1] = 'LDevice::LDevice_inst_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.inst <> null implies
		 *           self.validSclLDInst(inst)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'inst attribute shall be valid in LDevice (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.inst.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'LDevice::LDevice_inst_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_LDevice_c_c_LDevice_inst_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String inst_0 = this.getInst();
				final /*@NonInvalid*/ boolean ne = inst_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclLDInst = ((SclObject)this).validSclLDInst(inst_0);
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_inst_32_attribute_32_shall_32_be_32_valid_32_in_32_LDevice_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(inst_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_LDevice_c_c_LDevice_inst_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLDevice_ldName_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv LDevice_ldName_valid:
		 *   let severity : Integer[1] = 'LDevice::LDevice_ldName_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[?] = self.validSclLDName(ldName)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'LdName attribute shall be valid in LDevice (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.ldName.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'LDevice::LDevice_ldName_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_LDevice_c_c_LDevice_ldName_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String ldName = this.getLdName();
				final /*@Thrown*/ boolean status = ((SclObject)this).validSclLDName(ldName);
				/*@Thrown*/ Object symbol_1;
				if (status) {
					symbol_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_LdName_32_attribute_32_shall_32_be_32_valid_32_in_32_LDevice_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(ldName);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_LDevice_c_c_LDevice_ldName_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLDevice_one_LN0_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv LDevice_one_LN0_required:
		 *   let
		 *     severity : Integer[1] = 'LDevice::LDevice_one_LN0_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.LN0 <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'LDevice shall contain one LN0 (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'LDevice::LDevice_one_LN0_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_LDevice_c_c_LDevice_one_LN0_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ LN0 LN0 = this.getLN0();
			final /*@NonInvalid*/ boolean status = LN0 != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_LDevice_32_shall_32_contain_32_one_32_LN0_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_LDevice_c_c_LDevice_one_LN0_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
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
			case SclPackage.LDEVICE__REFERRED_BY_CONTROL_BLOCK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferredByControlBlock()).basicAdd(otherEnd, msgs);
			case SclPackage.LDEVICE__ACCESS_CONTROL:
				if (accessControl != null)
					msgs = ((InternalEObject)accessControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.LDEVICE__ACCESS_CONTROL, null, msgs);
				return basicSetAccessControl((AccessControl)otherEnd, msgs);
			case SclPackage.LDEVICE__SERVER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetServer((Server)otherEnd, msgs);
			case SclPackage.LDEVICE__LNODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLNode()).basicAdd(otherEnd, msgs);
			case SclPackage.LDEVICE__LN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLN()).basicAdd(otherEnd, msgs);
			case SclPackage.LDEVICE__LN0:
				if (ln0 != null)
					msgs = ((InternalEObject)ln0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.LDEVICE__LN0, null, msgs);
				return basicSetLN0((LN0)otherEnd, msgs);
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
			case SclPackage.LDEVICE__REFERRED_BY_CONTROL_BLOCK:
				return ((InternalEList<?>)getReferredByControlBlock()).basicRemove(otherEnd, msgs);
			case SclPackage.LDEVICE__ACCESS_CONTROL:
				return basicUnsetAccessControl(msgs);
			case SclPackage.LDEVICE__SERVER:
				return basicSetServer(null, msgs);
			case SclPackage.LDEVICE__LNODE:
				return ((InternalEList<?>)getLNode()).basicRemove(otherEnd, msgs);
			case SclPackage.LDEVICE__LN:
				return ((InternalEList<?>)getLN()).basicRemove(otherEnd, msgs);
			case SclPackage.LDEVICE__LN0:
				return basicUnsetLN0(msgs);
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
			case SclPackage.LDEVICE__SERVER:
				return eInternalContainer().eInverseRemove(this, SclPackage.SERVER__LDEVICE, Server.class, msgs);
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
			case SclPackage.LDEVICE__INST:
				return getInst();
			case SclPackage.LDEVICE__LD_NAME:
				return getLdName();
			case SclPackage.LDEVICE__REFERRED_BY_CONTROL_BLOCK:
				return getReferredByControlBlock();
			case SclPackage.LDEVICE__ACCESS_CONTROL:
				return getAccessControl();
			case SclPackage.LDEVICE__SERVER:
				return getServer();
			case SclPackage.LDEVICE__LNODE:
				return getLNode();
			case SclPackage.LDEVICE__LN:
				return getLN();
			case SclPackage.LDEVICE__LN0:
				return getLN0();
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
			case SclPackage.LDEVICE__INST:
				setInst((String)newValue);
				return;
			case SclPackage.LDEVICE__LD_NAME:
				setLdName((String)newValue);
				return;
			case SclPackage.LDEVICE__REFERRED_BY_CONTROL_BLOCK:
				getReferredByControlBlock().clear();
				getReferredByControlBlock().addAll((Collection<? extends ControlBlock>)newValue);
				return;
			case SclPackage.LDEVICE__ACCESS_CONTROL:
				setAccessControl((AccessControl)newValue);
				return;
			case SclPackage.LDEVICE__SERVER:
				setServer((Server)newValue);
				return;
			case SclPackage.LDEVICE__LNODE:
				getLNode().clear();
				getLNode().addAll((Collection<? extends LNode>)newValue);
				return;
			case SclPackage.LDEVICE__LN:
				getLN().clear();
				getLN().addAll((Collection<? extends LN>)newValue);
				return;
			case SclPackage.LDEVICE__LN0:
				setLN0((LN0)newValue);
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
			case SclPackage.LDEVICE__INST:
				unsetInst();
				return;
			case SclPackage.LDEVICE__LD_NAME:
				unsetLdName();
				return;
			case SclPackage.LDEVICE__REFERRED_BY_CONTROL_BLOCK:
				unsetReferredByControlBlock();
				return;
			case SclPackage.LDEVICE__ACCESS_CONTROL:
				unsetAccessControl();
				return;
			case SclPackage.LDEVICE__SERVER:
				setServer((Server)null);
				return;
			case SclPackage.LDEVICE__LNODE:
				unsetLNode();
				return;
			case SclPackage.LDEVICE__LN:
				unsetLN();
				return;
			case SclPackage.LDEVICE__LN0:
				unsetLN0();
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
			case SclPackage.LDEVICE__INST:
				return isSetInst();
			case SclPackage.LDEVICE__LD_NAME:
				return isSetLdName();
			case SclPackage.LDEVICE__REFERRED_BY_CONTROL_BLOCK:
				return isSetReferredByControlBlock();
			case SclPackage.LDEVICE__ACCESS_CONTROL:
				return isSetAccessControl();
			case SclPackage.LDEVICE__SERVER:
				return getServer() != null;
			case SclPackage.LDEVICE__LNODE:
				return isSetLNode();
			case SclPackage.LDEVICE__LN:
				return isSetLN();
			case SclPackage.LDEVICE__LN0:
				return isSetLN0();
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
			case SclPackage.LDEVICE___VALIDATE_LDEVICE_INST_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateLDevice_inst_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.LDEVICE___VALIDATE_LDEVICE_INST_VALID__DIAGNOSTICCHAIN_MAP:
				return validateLDevice_inst_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.LDEVICE___VALIDATE_LDEVICE_LD_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateLDevice_ldName_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.LDEVICE___VALIDATE_LDEVICE_ONE_LN0_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateLDevice_one_LN0_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (inst: ");
		if (instESet) result.append(inst); else result.append("<unset>");
		result.append(", ldName: ");
		if (ldNameESet) result.append(ldName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

    @Override
    public IED getIED() {
        return getServer().getAccessPoint().getIED();
    }

} //LDeviceImpl
