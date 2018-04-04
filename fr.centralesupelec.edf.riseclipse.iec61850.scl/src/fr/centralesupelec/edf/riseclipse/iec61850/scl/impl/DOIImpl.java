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
import org.eclipse.emf.ecore.util.EcoreUtil;
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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DOI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOIImpl#getIx <em>Ix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOIImpl#getAnyLN <em>Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOIImpl#getDAI <em>DAI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOIImpl#getSDI <em>SDI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DOIImpl extends DataObjectImpl implements DOI {
    /**
	 * The default value of the '{@link #getIx() <em>Ix</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIx()
	 * @generated
	 * @ordered
	 */
    protected static final Integer IX_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getIx() <em>Ix</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIx()
	 * @generated
	 * @ordered
	 */
    protected Integer ix = IX_EDEFAULT;

    /**
	 * This is true if the Ix attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean ixESet;

    /**
	 * The cached value of the '{@link #getDAI() <em>DAI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDAI()
	 * @generated
	 * @ordered
	 */
    protected EList<DAI> dai;

    /**
	 * The cached value of the '{@link #getSDI() <em>SDI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSDI()
	 * @generated
	 * @ordered
	 */
    protected EList<SDI> sdi;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DOIImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.DOI;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Integer getIx() {
		return ix;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIx( Integer newIx ) {
		Integer oldIx = ix;
		ix = newIx;
		boolean oldIxESet = ixESet;
		ixESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DOI__IX, oldIx, ix, !oldIxESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetIx() {
		Integer oldIx = ix;
		boolean oldIxESet = ixESet;
		ix = IX_EDEFAULT;
		ixESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DOI__IX, oldIx, IX_EDEFAULT, oldIxESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetIx() {
		return ixESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AnyLN getAnyLN() {
		if (eContainerFeatureID() != SclPackage.DOI__ANY_LN) return null;
		return (AnyLN)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetAnyLN( AnyLN newAnyLN, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newAnyLN, SclPackage.DOI__ANY_LN, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAnyLN( AnyLN newAnyLN ) {
		if (newAnyLN != eInternalContainer() || (eContainerFeatureID() != SclPackage.DOI__ANY_LN && newAnyLN != null)) {
			if (EcoreUtil.isAncestor(this, newAnyLN))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnyLN != null)
				msgs = ((InternalEObject)newAnyLN).eInverseAdd(this, SclPackage.ANY_LN__DOI, AnyLN.class, msgs);
			msgs = basicSetAnyLN(newAnyLN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DOI__ANY_LN, newAnyLN, newAnyLN));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DAI> getDAI() {
		if (dai == null) {
			dai = new EObjectContainmentWithInverseEList.Unsettable<DAI>(DAI.class, this, SclPackage.DOI__DAI, SclPackage.DAI__DOI);
		}
		return dai;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetDAI() {
		if (dai != null) ((InternalEList.Unsettable<?>)dai).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetDAI() {
		return dai != null && ((InternalEList.Unsettable<?>)dai).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<SDI> getSDI() {
		if (sdi == null) {
			sdi = new EObjectContainmentWithInverseEList.Unsettable<SDI>(SDI.class, this, SclPackage.DOI__SDI, SclPackage.SDI__DOI);
		}
		return sdi;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSDI() {
		if (sdi != null) ((InternalEList.Unsettable<?>)sdi).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSDI() {
		return sdi != null && ((InternalEList.Unsettable<?>)sdi).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOI_name_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv DOI_name_required:
		 *   let severity : Integer[1] = 'DOI::DOI_name_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.name <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'name attribute shall be present in DOI (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'DOI::DOI_name_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_DOI_c_c_DOI_name_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String name = this.getName();
			final /*@NonInvalid*/ boolean status = name != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_name_32_attribute_32_shall_32_be_32_present_32_in_32_DOI_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_DOI_c_c_DOI_name_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOI_name_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv DOI_name_valid:
		 *   let severity : Integer[1] = 'DOI::DOI_name_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.name <> null implies
		 *           self.validSclDataName(name)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'name attribute shall be valid in DOI (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.name.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'DOI::DOI_name_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_DOI_c_c_DOI_name_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String name_0 = this.getName();
				final /*@NonInvalid*/ boolean ne = name_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclDataName = ((SclObject)this).validSclDataName(name_0);
					status = validSclDataName;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_name_32_attribute_32_shall_32_be_32_valid_32_in_32_DOI_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(name_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_DOI_c_c_DOI_name_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOI_ix_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv DOI_ix_valid:
		 *   let severity : Integer[1] = 'DOI::DOI_ix_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.ix <> null implies self.ix >= 0
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'ix attribute shall be valid in DOI (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.ix.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'DOI::DOI_ix_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_DOI_c_c_DOI_ix_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ Integer ix_0 = this.getIx();
				final /*@NonInvalid*/ IntegerValue BOXED_ix_0 = ix_0 == null ? null : ValueUtil.integerValueOf(ix_0);
				final /*@NonInvalid*/ boolean ne = BOXED_ix_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_ix_0, SclTables.INT_0).booleanValue();
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_ix_32_attribute_32_shall_32_be_32_valid_32_in_32_DOI_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_ix_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_DOI_c_c_DOI_ix_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.DOI__ANY_LN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAnyLN((AnyLN)otherEnd, msgs);
			case SclPackage.DOI__DAI:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDAI()).basicAdd(otherEnd, msgs);
			case SclPackage.DOI__SDI:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSDI()).basicAdd(otherEnd, msgs);
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
			case SclPackage.DOI__ANY_LN:
				return basicSetAnyLN(null, msgs);
			case SclPackage.DOI__DAI:
				return ((InternalEList<?>)getDAI()).basicRemove(otherEnd, msgs);
			case SclPackage.DOI__SDI:
				return ((InternalEList<?>)getSDI()).basicRemove(otherEnd, msgs);
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
			case SclPackage.DOI__ANY_LN:
				return eInternalContainer().eInverseRemove(this, SclPackage.ANY_LN__DOI, AnyLN.class, msgs);
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
			case SclPackage.DOI__IX:
				return getIx();
			case SclPackage.DOI__ANY_LN:
				return getAnyLN();
			case SclPackage.DOI__DAI:
				return getDAI();
			case SclPackage.DOI__SDI:
				return getSDI();
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
			case SclPackage.DOI__IX:
				setIx((Integer)newValue);
				return;
			case SclPackage.DOI__ANY_LN:
				setAnyLN((AnyLN)newValue);
				return;
			case SclPackage.DOI__DAI:
				getDAI().clear();
				getDAI().addAll((Collection<? extends DAI>)newValue);
				return;
			case SclPackage.DOI__SDI:
				getSDI().clear();
				getSDI().addAll((Collection<? extends SDI>)newValue);
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
			case SclPackage.DOI__IX:
				unsetIx();
				return;
			case SclPackage.DOI__ANY_LN:
				setAnyLN((AnyLN)null);
				return;
			case SclPackage.DOI__DAI:
				unsetDAI();
				return;
			case SclPackage.DOI__SDI:
				unsetSDI();
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
			case SclPackage.DOI__IX:
				return isSetIx();
			case SclPackage.DOI__ANY_LN:
				return getAnyLN() != null;
			case SclPackage.DOI__DAI:
				return isSetDAI();
			case SclPackage.DOI__SDI:
				return isSetSDI();
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
			case SclPackage.DOI___VALIDATE_DOI_NAME_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateDOI_name_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.DOI___VALIDATE_DOI_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateDOI_name_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.DOI___VALIDATE_DOI_IX_VALID__DIAGNOSTICCHAIN_MAP:
				return validateDOI_ix_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (ix: ");
		if (ixESet) result.append(ix); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DOIImpl
