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
import java.util.List;
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
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LNode Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeTypeImpl#getIedType <em>Ied Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeTypeImpl#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeTypeImpl#getDO <em>DO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeTypeImpl#getDataTypeTemplates <em>Data Type Templates</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeTypeImpl#getReferredByAnyLN <em>Referred By Any LN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LNodeTypeImpl extends IDNamingImpl implements LNodeType {
    /**
	 * The default value of the '{@link #getIedType() <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIedType()
	 * @generated
	 * @ordered
	 */
    protected static final String IED_TYPE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getIedType() <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIedType()
	 * @generated
	 * @ordered
	 */
    protected String iedType = IED_TYPE_EDEFAULT;

    /**
	 * This is true if the Ied Type attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean iedTypeESet;

    /**
	 * The default value of the '{@link #getLnClass() <em>Ln Class</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLnClass()
	 * @generated
	 * @ordered
	 */
    protected static final String LN_CLASS_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getLnClass() <em>Ln Class</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLnClass()
	 * @generated
	 * @ordered
	 */
    protected String lnClass = LN_CLASS_EDEFAULT;

    /**
	 * This is true if the Ln Class attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean lnClassESet;

    /**
	 * The cached value of the '{@link #getDO() <em>DO</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDO()
	 * @generated
	 * @ordered
	 */
    protected EList<DO> do_;

    /**
	 * The cached value of the '{@link #getReferredByAnyLN() <em>Referred By Any LN</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReferredByAnyLN()
	 * @generated
	 * @ordered
	 */
    protected EList<AnyLN> referredByAnyLN;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected LNodeTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.LNODE_TYPE;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getIedType() {
        if( isSetIedType() ) {
            return iedType;
        }
        return "";
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIedType( String newIedType ) {
		String oldIedType = iedType;
		iedType = newIedType;
		boolean oldIedTypeESet = iedTypeESet;
		iedTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LNODE_TYPE__IED_TYPE, oldIedType, iedType, !oldIedTypeESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetIedType() {
		String oldIedType = iedType;
		boolean oldIedTypeESet = iedTypeESet;
		iedType = IED_TYPE_EDEFAULT;
		iedTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LNODE_TYPE__IED_TYPE, oldIedType, IED_TYPE_EDEFAULT, oldIedTypeESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetIedType() {
		return iedTypeESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getLnClass() {
		return lnClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLnClass( String newLnClass ) {
		String oldLnClass = lnClass;
		lnClass = newLnClass;
		boolean oldLnClassESet = lnClassESet;
		lnClassESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LNODE_TYPE__LN_CLASS, oldLnClass, lnClass, !oldLnClassESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetLnClass() {
		String oldLnClass = lnClass;
		boolean oldLnClassESet = lnClassESet;
		lnClass = LN_CLASS_EDEFAULT;
		lnClassESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LNODE_TYPE__LN_CLASS, oldLnClass, LN_CLASS_EDEFAULT, oldLnClassESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetLnClass() {
		return lnClassESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DO> getDO() {
		if (do_ == null) {
			do_ = new EObjectContainmentWithInverseEList.Unsettable<DO>(DO.class, this, SclPackage.LNODE_TYPE__DO, SclPackage.DO__LNODE_TYPE);
		}
		return do_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetDO() {
		if (do_ != null) ((InternalEList.Unsettable<?>)do_).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetDO() {
		return do_ != null && ((InternalEList.Unsettable<?>)do_).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataTypeTemplates getDataTypeTemplates() {
		if (eContainerFeatureID() != SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES) return null;
		return (DataTypeTemplates)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDataTypeTemplates( DataTypeTemplates newDataTypeTemplates, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newDataTypeTemplates, SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDataTypeTemplates( DataTypeTemplates newDataTypeTemplates ) {
		if (newDataTypeTemplates != eInternalContainer() || (eContainerFeatureID() != SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES && newDataTypeTemplates != null)) {
			if (EcoreUtil.isAncestor(this, newDataTypeTemplates))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataTypeTemplates != null)
				msgs = ((InternalEObject)newDataTypeTemplates).eInverseAdd(this, SclPackage.DATA_TYPE_TEMPLATES__LNODE_TYPE, DataTypeTemplates.class, msgs);
			msgs = basicSetDataTypeTemplates(newDataTypeTemplates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES, newDataTypeTemplates, newDataTypeTemplates));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<AnyLN> getReferredByAnyLN() {
		if (referredByAnyLN == null) {
			referredByAnyLN = new EObjectWithInverseEList.Unsettable<AnyLN>(AnyLN.class, this, SclPackage.LNODE_TYPE__REFERRED_BY_ANY_LN, SclPackage.ANY_LN__REFERS_TO_LNODE_TYPE);
		}
		return referredByAnyLN;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetReferredByAnyLN() {
		if (referredByAnyLN != null) ((InternalEList.Unsettable<?>)referredByAnyLN).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetReferredByAnyLN() {
		return referredByAnyLN != null && ((InternalEList.Unsettable<?>)referredByAnyLN).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLNodeType_lnClass_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv LNodeType_lnClass_required:
		 *   let
		 *     severity : Integer[1] = 'LNodeType::LNodeType_lnClass_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.lnClass <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'lnClass attribute shall be present in LNodeType (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'LNodeType::LNodeType_lnClass_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_LNodeType_c_c_LNodeType_lnClass_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String lnClass = this.getLnClass();
			final /*@NonInvalid*/ boolean status = lnClass != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_lnClass_32_attribute_32_shall_32_be_32_present_32_in_32_LNodeType_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_LNodeType_c_c_LNodeType_lnClass_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLNodeType_lnClass_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv LNodeType_lnClass_valid:
		 *   let
		 *     severity : Integer[1] = 'LNodeType::LNodeType_lnClass_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.lnClass <> null implies
		 *           self.validSclLNClassEnum(lnClass)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'lnClass attribute shall be valid in LNodeType (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.lnClass.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'LNodeType::LNodeType_lnClass_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_LNodeType_c_c_LNodeType_lnClass_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String lnClass_0 = this.getLnClass();
				final /*@NonInvalid*/ boolean ne = lnClass_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclLNClassEnum = ((SclObject)this).validSclLNClassEnum(lnClass_0);
					status = validSclLNClassEnum;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_lnClass_32_attribute_32_shall_32_be_32_valid_32_in_32_LNodeType_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(lnClass_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_LNodeType_c_c_LNodeType_lnClass_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistory_at_least_one_DO_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv History_at_least_one_DO_required:
		 *   let
		 *     severity : Integer[1] = 'LNodeType::History_at_least_one_DO_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.DO->notEmpty()
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'LNodeType shall contain at least one DO (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'LNodeType::History_at_least_one_DO_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_LNodeType_c_c_History_at_least_one_DO_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ List<DO> DO = this.getDO();
			final /*@NonInvalid*/ SetValue BOXED_DO = idResolver.createSetOfAll(SclTables.SET_CLSSid_DO, DO);
			final /*@NonInvalid*/ boolean status = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_DO).booleanValue();
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_LNodeType_32_shall_32_contain_32_at_32_least_32_one_32_DO_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_LNodeType_c_c_History_at_least_one_DO_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.LNODE_TYPE__DO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDO()).basicAdd(otherEnd, msgs);
			case SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataTypeTemplates((DataTypeTemplates)otherEnd, msgs);
			case SclPackage.LNODE_TYPE__REFERRED_BY_ANY_LN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferredByAnyLN()).basicAdd(otherEnd, msgs);
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
			case SclPackage.LNODE_TYPE__DO:
				return ((InternalEList<?>)getDO()).basicRemove(otherEnd, msgs);
			case SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES:
				return basicSetDataTypeTemplates(null, msgs);
			case SclPackage.LNODE_TYPE__REFERRED_BY_ANY_LN:
				return ((InternalEList<?>)getReferredByAnyLN()).basicRemove(otherEnd, msgs);
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
			case SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES:
				return eInternalContainer().eInverseRemove(this, SclPackage.DATA_TYPE_TEMPLATES__LNODE_TYPE, DataTypeTemplates.class, msgs);
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
			case SclPackage.LNODE_TYPE__IED_TYPE:
				return getIedType();
			case SclPackage.LNODE_TYPE__LN_CLASS:
				return getLnClass();
			case SclPackage.LNODE_TYPE__DO:
				return getDO();
			case SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES:
				return getDataTypeTemplates();
			case SclPackage.LNODE_TYPE__REFERRED_BY_ANY_LN:
				return getReferredByAnyLN();
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
			case SclPackage.LNODE_TYPE__IED_TYPE:
				setIedType((String)newValue);
				return;
			case SclPackage.LNODE_TYPE__LN_CLASS:
				setLnClass((String)newValue);
				return;
			case SclPackage.LNODE_TYPE__DO:
				getDO().clear();
				getDO().addAll((Collection<? extends DO>)newValue);
				return;
			case SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES:
				setDataTypeTemplates((DataTypeTemplates)newValue);
				return;
			case SclPackage.LNODE_TYPE__REFERRED_BY_ANY_LN:
				getReferredByAnyLN().clear();
				getReferredByAnyLN().addAll((Collection<? extends AnyLN>)newValue);
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
			case SclPackage.LNODE_TYPE__IED_TYPE:
				unsetIedType();
				return;
			case SclPackage.LNODE_TYPE__LN_CLASS:
				unsetLnClass();
				return;
			case SclPackage.LNODE_TYPE__DO:
				unsetDO();
				return;
			case SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES:
				setDataTypeTemplates((DataTypeTemplates)null);
				return;
			case SclPackage.LNODE_TYPE__REFERRED_BY_ANY_LN:
				unsetReferredByAnyLN();
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
			case SclPackage.LNODE_TYPE__IED_TYPE:
				return isSetIedType();
			case SclPackage.LNODE_TYPE__LN_CLASS:
				return isSetLnClass();
			case SclPackage.LNODE_TYPE__DO:
				return isSetDO();
			case SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES:
				return getDataTypeTemplates() != null;
			case SclPackage.LNODE_TYPE__REFERRED_BY_ANY_LN:
				return isSetReferredByAnyLN();
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
			case SclPackage.LNODE_TYPE___VALIDATE_LNODE_TYPE_LN_CLASS_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateLNodeType_lnClass_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.LNODE_TYPE___VALIDATE_LNODE_TYPE_LN_CLASS_VALID__DIAGNOSTICCHAIN_MAP:
				return validateLNodeType_lnClass_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.LNODE_TYPE___VALIDATE_HISTORY_AT_LEAST_ONE_DO_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateHistory_at_least_one_DO_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (iedType: ");
		if (iedTypeESet) result.append(iedType); else result.append("<unset>");
		result.append(", lnClass: ");
		if (lnClassESet) result.append(lnClass); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LNodeTypeImpl
