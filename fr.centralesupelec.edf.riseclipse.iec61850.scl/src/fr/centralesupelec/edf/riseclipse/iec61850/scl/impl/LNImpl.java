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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNImpl#getAccessPoint <em>Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNImpl#getLDevice <em>LDevice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNImpl#getLNode <em>LNode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LNImpl extends AnyLNImpl implements LN {
    /**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
    protected static final String PREFIX_EDEFAULT = "";

    /**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
    protected String prefix = PREFIX_EDEFAULT;

    /**
	 * This is true if the Prefix attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean prefixESet;

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
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected LNImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.LN;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getPrefix() {
        if( isSetPrefix() ) {
            return prefix;
        }
        return "";
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPrefix( String newPrefix ) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		boolean oldPrefixESet = prefixESet;
		prefixESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LN__PREFIX, oldPrefix, prefix, !oldPrefixESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetPrefix() {
		String oldPrefix = prefix;
		boolean oldPrefixESet = prefixESet;
		prefix = PREFIX_EDEFAULT;
		prefixESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LN__PREFIX, oldPrefix, PREFIX_EDEFAULT, oldPrefixESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetPrefix() {
		return prefixESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AccessPoint getAccessPoint() {
		if (eContainerFeatureID() != SclPackage.LN__ACCESS_POINT) return null;
		return (AccessPoint)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetAccessPoint( AccessPoint newAccessPoint, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newAccessPoint, SclPackage.LN__ACCESS_POINT, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAccessPoint( AccessPoint newAccessPoint ) {
		if (newAccessPoint != eInternalContainer() || (eContainerFeatureID() != SclPackage.LN__ACCESS_POINT && newAccessPoint != null)) {
			if (EcoreUtil.isAncestor(this, newAccessPoint))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAccessPoint != null)
				msgs = ((InternalEObject)newAccessPoint).eInverseAdd(this, SclPackage.ACCESS_POINT__LN, AccessPoint.class, msgs);
			msgs = basicSetAccessPoint(newAccessPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LN__ACCESS_POINT, newAccessPoint, newAccessPoint));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LDevice getLDevice() {
		if (eContainerFeatureID() != SclPackage.LN__LDEVICE) return null;
		return (LDevice)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLDevice( LDevice newLDevice, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newLDevice, SclPackage.LN__LDEVICE, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLDevice( LDevice newLDevice ) {
		if (newLDevice != eInternalContainer() || (eContainerFeatureID() != SclPackage.LN__LDEVICE && newLDevice != null)) {
			if (EcoreUtil.isAncestor(this, newLDevice))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLDevice != null)
				msgs = ((InternalEObject)newLDevice).eInverseAdd(this, SclPackage.LDEVICE__LN, LDevice.class, msgs);
			msgs = basicSetLDevice(newLDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LN__LDEVICE, newLDevice, newLDevice));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<LNode> getLNode() {
		if (lNode == null) {
			lNode = new EObjectWithInverseEList.Unsettable<LNode>(LNode.class, this, SclPackage.LN__LNODE, SclPackage.LNODE__LN);
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
	public boolean validateLN_inst_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv LN_inst_valid:
		 *   let severity : Integer[1] = 'LN::LN_inst_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.inst <> null implies
		 *           self.validSclLNInst(inst)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'inst attribute shall be a number with no more than 7 digits in LN (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.inst.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'LN::LN_inst_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_LN_c_c_LN_inst_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String inst = this.getInst();
				final /*@NonInvalid*/ boolean ne = inst != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclLNInst = ((SclObject)this).validSclLNInst(inst);
					status = validSclLNInst;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_inst_32_attribute_32_shall_32_be_32_a_32_number_32_with_32_no_32_more_32_than_32_7_32_digits_32_in_32_L, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(inst);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_LN_c_c_LN_inst_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLN_prefix_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv LN_prefix_valid:
		 *   let severity : Integer[1] = 'LN::LN_prefix_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.prefix <> null implies
		 *           self.validSclPrefix(prefix)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'prefix attribute shall be valid in LN (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.prefix.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'LN::LN_prefix_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_LN_c_c_LN_prefix_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String prefix_0 = this.getPrefix();
				final /*@NonInvalid*/ boolean ne = prefix_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclPrefix = ((SclObject)this).validSclPrefix(prefix_0);
					status = validSclPrefix;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_prefix_32_attribute_32_shall_32_be_32_valid_32_in_32_LN_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(prefix_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_LN_c_c_LN_prefix_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.LN__ACCESS_POINT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAccessPoint((AccessPoint)otherEnd, msgs);
			case SclPackage.LN__LDEVICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLDevice((LDevice)otherEnd, msgs);
			case SclPackage.LN__LNODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLNode()).basicAdd(otherEnd, msgs);
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
			case SclPackage.LN__ACCESS_POINT:
				return basicSetAccessPoint(null, msgs);
			case SclPackage.LN__LDEVICE:
				return basicSetLDevice(null, msgs);
			case SclPackage.LN__LNODE:
				return ((InternalEList<?>)getLNode()).basicRemove(otherEnd, msgs);
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
			case SclPackage.LN__ACCESS_POINT:
				return eInternalContainer().eInverseRemove(this, SclPackage.ACCESS_POINT__LN, AccessPoint.class, msgs);
			case SclPackage.LN__LDEVICE:
				return eInternalContainer().eInverseRemove(this, SclPackage.LDEVICE__LN, LDevice.class, msgs);
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
			case SclPackage.LN__PREFIX:
				return getPrefix();
			case SclPackage.LN__ACCESS_POINT:
				return getAccessPoint();
			case SclPackage.LN__LDEVICE:
				return getLDevice();
			case SclPackage.LN__LNODE:
				return getLNode();
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
			case SclPackage.LN__PREFIX:
				setPrefix((String)newValue);
				return;
			case SclPackage.LN__ACCESS_POINT:
				setAccessPoint((AccessPoint)newValue);
				return;
			case SclPackage.LN__LDEVICE:
				setLDevice((LDevice)newValue);
				return;
			case SclPackage.LN__LNODE:
				getLNode().clear();
				getLNode().addAll((Collection<? extends LNode>)newValue);
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
			case SclPackage.LN__PREFIX:
				unsetPrefix();
				return;
			case SclPackage.LN__ACCESS_POINT:
				setAccessPoint((AccessPoint)null);
				return;
			case SclPackage.LN__LDEVICE:
				setLDevice((LDevice)null);
				return;
			case SclPackage.LN__LNODE:
				unsetLNode();
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
			case SclPackage.LN__PREFIX:
				return isSetPrefix();
			case SclPackage.LN__ACCESS_POINT:
				return getAccessPoint() != null;
			case SclPackage.LN__LDEVICE:
				return getLDevice() != null;
			case SclPackage.LN__LNODE:
				return isSetLNode();
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
			case SclPackage.LN___VALIDATE_LN_INST_VALID__DIAGNOSTICCHAIN_MAP:
				return validateLN_inst_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.LN___VALIDATE_LN_PREFIX_VALID__DIAGNOSTICCHAIN_MAP:
				return validateLN_prefix_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (prefix: ");
		if (prefixESet) result.append(prefix); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LNImpl
