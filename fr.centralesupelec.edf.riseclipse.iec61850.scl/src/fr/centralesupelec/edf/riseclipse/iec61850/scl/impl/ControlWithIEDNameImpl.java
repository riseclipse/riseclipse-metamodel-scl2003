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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control With IED Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlWithIEDNameImpl#getConfRev <em>Conf Rev</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlWithIEDNameImpl#getIEDName <em>IED Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlWithIEDNameImpl#getReferredByControlBlock <em>Referred By Control Block</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlWithIEDNameImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlWithIEDNameImpl extends ControlImpl implements ControlWithIEDName {
    /**
	 * The default value of the '{@link #getConfRev() <em>Conf Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConfRev()
	 * @generated
	 * @ordered
	 */
    protected static final Integer CONF_REV_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getConfRev() <em>Conf Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConfRev()
	 * @generated
	 * @ordered
	 */
    protected Integer confRev = CONF_REV_EDEFAULT;

    /**
	 * This is true if the Conf Rev attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean confRevESet;

    /**
	 * The cached value of the '{@link #getIEDName() <em>IED Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIEDName()
	 * @generated
	 * @ordered
	 */
    protected EList<IEDName> iedName;

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
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
    protected Protocol protocol;

    /**
	 * This is true if the Protocol containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean protocolESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ControlWithIEDNameImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.CONTROL_WITH_IED_NAME;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Integer getConfRev() {
		return confRev;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setConfRev( Integer newConfRev ) {
		Integer oldConfRev = confRev;
		confRev = newConfRev;
		boolean oldConfRevESet = confRevESet;
		confRevESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL_WITH_IED_NAME__CONF_REV, oldConfRev, confRev, !oldConfRevESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetConfRev() {
		Integer oldConfRev = confRev;
		boolean oldConfRevESet = confRevESet;
		confRev = CONF_REV_EDEFAULT;
		confRevESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL_WITH_IED_NAME__CONF_REV, oldConfRev, CONF_REV_EDEFAULT, oldConfRevESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetConfRev() {
		return confRevESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IEDName> getIEDName() {
		if (iedName == null) {
			iedName = new EObjectContainmentWithInverseEList.Unsettable<IEDName>(IEDName.class, this, SclPackage.CONTROL_WITH_IED_NAME__IED_NAME, SclPackage.IED_NAME__CONTROL_WITH_IED_NAME);
		}
		return iedName;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetIEDName() {
		if (iedName != null) ((InternalEList.Unsettable<?>)iedName).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetIEDName() {
		return iedName != null && ((InternalEList.Unsettable<?>)iedName).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ControlBlock> getReferredByControlBlock() {
		if (referredByControlBlock == null) {
			referredByControlBlock = new EObjectWithInverseEList.Unsettable<ControlBlock>(ControlBlock.class, this, SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK, SclPackage.CONTROL_BLOCK__REFERS_TO_CONTROL_WITH_IED_NAME);
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
    public Protocol getProtocol() {
		return protocol;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetProtocol( Protocol newProtocol, NotificationChain msgs ) {
		Protocol oldProtocol = protocol;
		protocol = newProtocol;
		boolean oldProtocolESet = protocolESet;
		protocolESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL, oldProtocol, newProtocol, !oldProtocolESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setProtocol( Protocol newProtocol ) {
		if (newProtocol != protocol) {
			NotificationChain msgs = null;
			if (protocol != null)
				msgs = ((InternalEObject)protocol).eInverseRemove(this, SclPackage.PROTOCOL__CONTROL_WITH_IED_NAME, Protocol.class, msgs);
			if (newProtocol != null)
				msgs = ((InternalEObject)newProtocol).eInverseAdd(this, SclPackage.PROTOCOL__CONTROL_WITH_IED_NAME, Protocol.class, msgs);
			msgs = basicSetProtocol(newProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldProtocolESet = protocolESet;
			protocolESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL, newProtocol, newProtocol, !oldProtocolESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetProtocol( NotificationChain msgs ) {
		Protocol oldProtocol = protocol;
		protocol = null;
		boolean oldProtocolESet = protocolESet;
		protocolESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL, oldProtocol, null, oldProtocolESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetProtocol() {
		if (protocol != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)protocol).eInverseRemove(this, SclPackage.PROTOCOL__CONTROL_WITH_IED_NAME, Protocol.class, msgs);
			msgs = basicUnsetProtocol(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldProtocolESet = protocolESet;
			protocolESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL, null, null, oldProtocolESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetProtocol() {
		return protocolESet;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlWithIEDName_confRev_unsignedInt(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ControlWithIEDName_confRev_unsignedInt:
		 *   let
		 *     severity : Integer[1] = 'ControlWithIEDName::ControlWithIEDName_confRev_unsignedInt'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.confRev <> null implies self.confRev >= 0
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'confRev attribute shall be valid in ControlWithIEDName (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.confRev.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ControlWithIEDName::ControlWithIEDName_confRev_unsignedInt'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ControlWithIEDName_c_c_ControlWithIEDName_confRev_unsignedInt);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ Integer confRev_0 = this.getConfRev();
				final /*@NonInvalid*/ IntegerValue BOXED_confRev_0 = confRev_0 == null ? null : ValueUtil.integerValueOf(confRev_0);
				final /*@NonInvalid*/ boolean ne = BOXED_confRev_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_confRev_0, SclTables.INT_0).booleanValue();
					status = ge;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_confRev_32_attribute_32_shall_32_be_32_valid_32_in_32_ControlWithIEDName_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_confRev_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ControlWithIEDName_c_c_ControlWithIEDName_confRev_unsignedInt, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.CONTROL_WITH_IED_NAME__IED_NAME:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIEDName()).basicAdd(otherEnd, msgs);
			case SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferredByControlBlock()).basicAdd(otherEnd, msgs);
			case SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL:
				if (protocol != null)
					msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL, null, msgs);
				return basicSetProtocol((Protocol)otherEnd, msgs);
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
			case SclPackage.CONTROL_WITH_IED_NAME__IED_NAME:
				return ((InternalEList<?>)getIEDName()).basicRemove(otherEnd, msgs);
			case SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK:
				return ((InternalEList<?>)getReferredByControlBlock()).basicRemove(otherEnd, msgs);
			case SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL:
				return basicUnsetProtocol(msgs);
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
			case SclPackage.CONTROL_WITH_IED_NAME__CONF_REV:
				return getConfRev();
			case SclPackage.CONTROL_WITH_IED_NAME__IED_NAME:
				return getIEDName();
			case SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK:
				return getReferredByControlBlock();
			case SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL:
				return getProtocol();
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
			case SclPackage.CONTROL_WITH_IED_NAME__CONF_REV:
				setConfRev((Integer)newValue);
				return;
			case SclPackage.CONTROL_WITH_IED_NAME__IED_NAME:
				getIEDName().clear();
				getIEDName().addAll((Collection<? extends IEDName>)newValue);
				return;
			case SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK:
				getReferredByControlBlock().clear();
				getReferredByControlBlock().addAll((Collection<? extends ControlBlock>)newValue);
				return;
			case SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL:
				setProtocol((Protocol)newValue);
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
			case SclPackage.CONTROL_WITH_IED_NAME__CONF_REV:
				unsetConfRev();
				return;
			case SclPackage.CONTROL_WITH_IED_NAME__IED_NAME:
				unsetIEDName();
				return;
			case SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK:
				unsetReferredByControlBlock();
				return;
			case SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL:
				unsetProtocol();
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
			case SclPackage.CONTROL_WITH_IED_NAME__CONF_REV:
				return isSetConfRev();
			case SclPackage.CONTROL_WITH_IED_NAME__IED_NAME:
				return isSetIEDName();
			case SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK:
				return isSetReferredByControlBlock();
			case SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL:
				return isSetProtocol();
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
			case SclPackage.CONTROL_WITH_IED_NAME___VALIDATE_CONTROL_WITH_IED_NAME_CONF_REV_UNSIGNED_INT__DIAGNOSTICCHAIN_MAP:
				return validateControlWithIEDName_confRev_unsignedInt((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (confRev: ");
		if (confRevESet) result.append(confRev); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

    public LN0 getLN0() {
        return null;
    }

    public AnyLN getAnyLN() {
        return getLN0();
    }

} //ControlWithIEDNameImpl
