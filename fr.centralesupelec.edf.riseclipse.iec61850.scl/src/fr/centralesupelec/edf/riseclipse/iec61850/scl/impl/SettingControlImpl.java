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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setting Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingControlImpl#getActSG <em>Act SG</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingControlImpl#getNumOfSGs <em>Num Of SGs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingControlImpl#getResvTms <em>Resv Tms</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingControlImpl#getLN0 <em>LN0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SettingControlImpl extends UnNamingImpl implements SettingControl {
    /**
	 * The default value of the '{@link #getActSG() <em>Act SG</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getActSG()
	 * @generated
	 * @ordered
	 */
    protected static final Integer ACT_SG_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getActSG() <em>Act SG</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getActSG()
	 * @generated
	 * @ordered
	 */
    protected Integer actSG = ACT_SG_EDEFAULT;

    /**
	 * This is true if the Act SG attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean actSGESet;

    /**
	 * The default value of the '{@link #getNumOfSGs() <em>Num Of SGs</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNumOfSGs()
	 * @generated
	 * @ordered
	 */
    protected static final Integer NUM_OF_SGS_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getNumOfSGs() <em>Num Of SGs</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNumOfSGs()
	 * @generated
	 * @ordered
	 */
    protected Integer numOfSGs = NUM_OF_SGS_EDEFAULT;

    /**
	 * This is true if the Num Of SGs attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean numOfSGsESet;

    /**
	 * The default value of the '{@link #getResvTms() <em>Resv Tms</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getResvTms()
	 * @generated
	 * @ordered
	 */
    protected static final Short RESV_TMS_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getResvTms() <em>Resv Tms</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getResvTms()
	 * @generated
	 * @ordered
	 */
    protected Short resvTms = RESV_TMS_EDEFAULT;

    /**
	 * This is true if the Resv Tms attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean resvTmsESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SettingControlImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.SETTING_CONTROL;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Integer getActSG() {
        if( isSetActSG() ) {
            return actSG;
        }
        return 1;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setActSG( Integer newActSG ) {
		Integer oldActSG = actSG;
		actSG = newActSG;
		boolean oldActSGESet = actSGESet;
		actSGESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SETTING_CONTROL__ACT_SG, oldActSG, actSG, !oldActSGESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetActSG() {
		Integer oldActSG = actSG;
		boolean oldActSGESet = actSGESet;
		actSG = ACT_SG_EDEFAULT;
		actSGESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SETTING_CONTROL__ACT_SG, oldActSG, ACT_SG_EDEFAULT, oldActSGESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetActSG() {
		return actSGESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Integer getNumOfSGs() {
		return numOfSGs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNumOfSGs( Integer newNumOfSGs ) {
		Integer oldNumOfSGs = numOfSGs;
		numOfSGs = newNumOfSGs;
		boolean oldNumOfSGsESet = numOfSGsESet;
		numOfSGsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SETTING_CONTROL__NUM_OF_SGS, oldNumOfSGs, numOfSGs, !oldNumOfSGsESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetNumOfSGs() {
		Integer oldNumOfSGs = numOfSGs;
		boolean oldNumOfSGsESet = numOfSGsESet;
		numOfSGs = NUM_OF_SGS_EDEFAULT;
		numOfSGsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SETTING_CONTROL__NUM_OF_SGS, oldNumOfSGs, NUM_OF_SGS_EDEFAULT, oldNumOfSGsESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetNumOfSGs() {
		return numOfSGsESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Short getResvTms() {
		return resvTms;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setResvTms( Short newResvTms ) {
		Short oldResvTms = resvTms;
		resvTms = newResvTms;
		boolean oldResvTmsESet = resvTmsESet;
		resvTmsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SETTING_CONTROL__RESV_TMS, oldResvTms, resvTms, !oldResvTmsESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetResvTms() {
		Short oldResvTms = resvTms;
		boolean oldResvTmsESet = resvTmsESet;
		resvTms = RESV_TMS_EDEFAULT;
		resvTmsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SETTING_CONTROL__RESV_TMS, oldResvTms, RESV_TMS_EDEFAULT, oldResvTmsESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetResvTms() {
		return resvTmsESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LN0 getLN0() {
		if (eContainerFeatureID() != SclPackage.SETTING_CONTROL__LN0) return null;
		return (LN0)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLN0( LN0 newLN0, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newLN0, SclPackage.SETTING_CONTROL__LN0, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLN0( LN0 newLN0 ) {
		if (newLN0 != eInternalContainer() || (eContainerFeatureID() != SclPackage.SETTING_CONTROL__LN0 && newLN0 != null)) {
			if (EcoreUtil.isAncestor(this, newLN0))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLN0 != null)
				msgs = ((InternalEObject)newLN0).eInverseAdd(this, SclPackage.LN0__SETTING_CONTROL, LN0.class, msgs);
			msgs = basicSetLN0(newLN0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SETTING_CONTROL__LN0, newLN0, newLN0));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettingControl_numOfSGs_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SettingControl_numOfSGs_required:
		 *   let
		 *     severity : Integer[1] = 'SettingControl::SettingControl_numOfSGs_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.numOfSGs <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'numOfSGs attribute shall be present in SettingControl (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'SettingControl::SettingControl_numOfSGs_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SettingControl_c_c_SettingControl_numOfSGs_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ Integer numOfSGs = this.getNumOfSGs();
			final /*@NonInvalid*/ IntegerValue BOXED_numOfSGs = numOfSGs == null ? null : ValueUtil.integerValueOf(numOfSGs);
			final /*@NonInvalid*/ boolean status = BOXED_numOfSGs != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_numOfSGs_32_attribute_32_shall_32_be_32_present_32_in_32_SettingControl_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SettingControl_c_c_SettingControl_numOfSGs_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettingControl_numOfSGs_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SettingControl_numOfSGs_valid:
		 *   let
		 *     severity : Integer[1] = 'SettingControl::SettingControl_numOfSGs_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.numOfSGs <> null implies self.numOfSGs > 0
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'numOfSGs attribute shall be greater than 0 in SettingControl (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.numOfSGs.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'SettingControl::SettingControl_numOfSGs_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SettingControl_c_c_SettingControl_numOfSGs_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ Integer numOfSGs = this.getNumOfSGs();
				final /*@NonInvalid*/ IntegerValue BOXED_numOfSGs = numOfSGs == null ? null : ValueUtil.integerValueOf(numOfSGs);
				final /*@NonInvalid*/ boolean ne = BOXED_numOfSGs != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_numOfSGs, SclTables.INT_0).booleanValue();
					status = gt;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_numOfSGs_32_attribute_32_shall_32_be_32_greater_32_than_32_0_32_in_32_SettingControl_32_o_li, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_numOfSGs);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SettingControl_c_c_SettingControl_numOfSGs_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettingControl_actSG_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SettingControl_actSG_valid:
		 *   let
		 *     severity : Integer[1] = 'SettingControl::SettingControl_actSG_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.actSG <> null implies self.actSG > 0
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'actSG attribute shall be greater than 0 in SettingControl (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.actSG.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'SettingControl::SettingControl_actSG_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SettingControl_c_c_SettingControl_actSG_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ Integer actSG_0 = this.getActSG();
				final /*@NonInvalid*/ IntegerValue BOXED_actSG_0 = actSG_0 == null ? null : ValueUtil.integerValueOf(actSG_0);
				final /*@NonInvalid*/ boolean ne = BOXED_actSG_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_actSG_0, SclTables.INT_0).booleanValue();
					status = gt;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_actSG_32_attribute_32_shall_32_be_32_greater_32_than_32_0_32_in_32_SettingControl_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_actSG_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SettingControl_c_c_SettingControl_actSG_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettingControl_resvTms_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SettingControl_resvTms_valid:
		 *   let
		 *     severity : Integer[1] = 'SettingControl::SettingControl_resvTms_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.resvTms <> null implies self.resvTms >= 0
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'resvTms attribute shall be valid in SettingControl (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.resvTms.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'SettingControl::SettingControl_resvTms_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SettingControl_c_c_SettingControl_resvTms_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ Short resvTms = this.getResvTms();
				final /*@NonInvalid*/ IntegerValue BOXED_resvTms = resvTms == null ? null : ValueUtil.integerValueOf(resvTms);
				final /*@NonInvalid*/ boolean ne = BOXED_resvTms != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_resvTms, SclTables.INT_0).booleanValue();
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_resvTms_32_attribute_32_shall_32_be_32_valid_32_in_32_SettingControl_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_resvTms);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SettingControl_c_c_SettingControl_resvTms_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.SETTING_CONTROL__LN0:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case SclPackage.SETTING_CONTROL__LN0:
				return basicSetLN0(null, msgs);
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
			case SclPackage.SETTING_CONTROL__LN0:
				return eInternalContainer().eInverseRemove(this, SclPackage.LN0__SETTING_CONTROL, LN0.class, msgs);
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
			case SclPackage.SETTING_CONTROL__ACT_SG:
				return getActSG();
			case SclPackage.SETTING_CONTROL__NUM_OF_SGS:
				return getNumOfSGs();
			case SclPackage.SETTING_CONTROL__RESV_TMS:
				return getResvTms();
			case SclPackage.SETTING_CONTROL__LN0:
				return getLN0();
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
			case SclPackage.SETTING_CONTROL__ACT_SG:
				setActSG((Integer)newValue);
				return;
			case SclPackage.SETTING_CONTROL__NUM_OF_SGS:
				setNumOfSGs((Integer)newValue);
				return;
			case SclPackage.SETTING_CONTROL__RESV_TMS:
				setResvTms((Short)newValue);
				return;
			case SclPackage.SETTING_CONTROL__LN0:
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
			case SclPackage.SETTING_CONTROL__ACT_SG:
				unsetActSG();
				return;
			case SclPackage.SETTING_CONTROL__NUM_OF_SGS:
				unsetNumOfSGs();
				return;
			case SclPackage.SETTING_CONTROL__RESV_TMS:
				unsetResvTms();
				return;
			case SclPackage.SETTING_CONTROL__LN0:
				setLN0((LN0)null);
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
			case SclPackage.SETTING_CONTROL__ACT_SG:
				return isSetActSG();
			case SclPackage.SETTING_CONTROL__NUM_OF_SGS:
				return isSetNumOfSGs();
			case SclPackage.SETTING_CONTROL__RESV_TMS:
				return isSetResvTms();
			case SclPackage.SETTING_CONTROL__LN0:
				return getLN0() != null;
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
			case SclPackage.SETTING_CONTROL___VALIDATE_SETTING_CONTROL_NUM_OF_SGS_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateSettingControl_numOfSGs_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SETTING_CONTROL___VALIDATE_SETTING_CONTROL_NUM_OF_SGS_VALID__DIAGNOSTICCHAIN_MAP:
				return validateSettingControl_numOfSGs_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SETTING_CONTROL___VALIDATE_SETTING_CONTROL_ACT_SG_VALID__DIAGNOSTICCHAIN_MAP:
				return validateSettingControl_actSG_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SETTING_CONTROL___VALIDATE_SETTING_CONTROL_RESV_TMS_VALID__DIAGNOSTICCHAIN_MAP:
				return validateSettingControl_resvTms_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (actSG: ");
		if (actSGESet) result.append(actSG); else result.append("<unset>");
		result.append(", numOfSGs: ");
		if (numOfSGsESet) result.append(numOfSGs); else result.append("<unset>");
		result.append(", resvTms: ");
		if (resvTmsESet) result.append(resvTms); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SettingControlImpl
