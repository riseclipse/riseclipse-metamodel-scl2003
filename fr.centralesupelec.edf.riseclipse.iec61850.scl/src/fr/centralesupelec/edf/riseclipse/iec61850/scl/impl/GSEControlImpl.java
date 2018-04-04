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
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControlTypeEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PredefinedTypeOfSecurityEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSE Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEControlImpl#getAppID <em>App ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEControlImpl#getFixedOffs <em>Fixed Offs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEControlImpl#getSecurityEnable <em>Security Enable</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEControlImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEControlImpl#getLN0 <em>LN0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSEControlImpl extends ControlWithIEDNameImpl implements GSEControl {
    /**
	 * The default value of the '{@link #getAppID() <em>App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAppID()
	 * @generated
	 * @ordered
	 */
    protected static final String APP_ID_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getAppID() <em>App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAppID()
	 * @generated
	 * @ordered
	 */
    protected String appID = APP_ID_EDEFAULT;

    /**
	 * This is true if the App ID attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean appIDESet;

    /**
	 * The default value of the '{@link #getFixedOffs() <em>Fixed Offs</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFixedOffs()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean FIXED_OFFS_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getFixedOffs() <em>Fixed Offs</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFixedOffs()
	 * @generated
	 * @ordered
	 */
    protected Boolean fixedOffs = FIXED_OFFS_EDEFAULT;

    /**
	 * This is true if the Fixed Offs attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean fixedOffsESet;

    /**
     * The default value of the '{@link #getSecurityEnable() <em>Security Enable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecurityEnable()
     * @generated NOT
     * @ordered
     */
    protected static final PredefinedTypeOfSecurityEnum SECURITY_ENABLE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getSecurityEnable() <em>Security Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSecurityEnable()
	 * @generated
	 * @ordered
	 */
    protected PredefinedTypeOfSecurityEnum securityEnable = SECURITY_ENABLE_EDEFAULT;

    /**
	 * This is true if the Security Enable attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean securityEnableESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated NOT
     * @ordered
     */
    protected static final GSEControlTypeEnum TYPE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
    protected GSEControlTypeEnum type = TYPE_EDEFAULT;

    /**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean typeESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected GSEControlImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getGSEControl();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getAppID() {
		return appID;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAppID( String newAppID ) {
		String oldAppID = appID;
		appID = newAppID;
		boolean oldAppIDESet = appIDESet;
		appIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GSE_CONTROL__APP_ID, oldAppID, appID, !oldAppIDESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetAppID() {
		String oldAppID = appID;
		boolean oldAppIDESet = appIDESet;
		appID = APP_ID_EDEFAULT;
		appIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.GSE_CONTROL__APP_ID, oldAppID, APP_ID_EDEFAULT, oldAppIDESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetAppID() {
		return appIDESet;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Boolean getFixedOffs() {
        if( isSetFixedOffs() ) {
            return fixedOffs;
        }
        return Boolean.FALSE;
    }

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFixedOffs( Boolean newFixedOffs ) {
		Boolean oldFixedOffs = fixedOffs;
		fixedOffs = newFixedOffs;
		boolean oldFixedOffsESet = fixedOffsESet;
		fixedOffsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GSE_CONTROL__FIXED_OFFS, oldFixedOffs, fixedOffs, !oldFixedOffsESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetFixedOffs() {
		Boolean oldFixedOffs = fixedOffs;
		boolean oldFixedOffsESet = fixedOffsESet;
		fixedOffs = FIXED_OFFS_EDEFAULT;
		fixedOffsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.GSE_CONTROL__FIXED_OFFS, oldFixedOffs, FIXED_OFFS_EDEFAULT, oldFixedOffsESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetFixedOffs() {
		return fixedOffsESet;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public PredefinedTypeOfSecurityEnum getSecurityEnable() {
        if( isSetSecurityEnable() ) {
            return securityEnable;
        }
        return PredefinedTypeOfSecurityEnum.NONE;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSecurityEnable( PredefinedTypeOfSecurityEnum newSecurityEnable ) {
		PredefinedTypeOfSecurityEnum oldSecurityEnable = securityEnable;
		securityEnable = newSecurityEnable == null ? SECURITY_ENABLE_EDEFAULT : newSecurityEnable;
		boolean oldSecurityEnableESet = securityEnableESet;
		securityEnableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GSE_CONTROL__SECURITY_ENABLE, oldSecurityEnable, securityEnable, !oldSecurityEnableESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSecurityEnable() {
		PredefinedTypeOfSecurityEnum oldSecurityEnable = securityEnable;
		boolean oldSecurityEnableESet = securityEnableESet;
		securityEnable = SECURITY_ENABLE_EDEFAULT;
		securityEnableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.GSE_CONTROL__SECURITY_ENABLE, oldSecurityEnable, SECURITY_ENABLE_EDEFAULT, oldSecurityEnableESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSecurityEnable() {
		return securityEnableESet;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public GSEControlTypeEnum getType() {
        if( isSetType() ) {
            return type;
        }
        return GSEControlTypeEnum.GOOSE;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setType( GSEControlTypeEnum newType ) {
		GSEControlTypeEnum oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GSE_CONTROL__TYPE, oldType, type, !oldTypeESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetType() {
		GSEControlTypeEnum oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.GSE_CONTROL__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetType() {
		return typeESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LN0 getLN0() {
		if (eContainerFeatureID() != SclPackage.GSE_CONTROL__LN0) return null;
		return (LN0)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLN0( LN0 newLN0, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newLN0, SclPackage.GSE_CONTROL__LN0, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLN0( LN0 newLN0 ) {
		if (newLN0 != eInternalContainer() || (eContainerFeatureID() != SclPackage.GSE_CONTROL__LN0 && newLN0 != null)) {
			if (EcoreUtil.isAncestor(this, newLN0))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLN0 != null)
				msgs = ((InternalEObject)newLN0).eInverseAdd(this, SclPackage.LN0__GSE_CONTROL, LN0.class, msgs);
			msgs = basicSetLN0(newLN0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GSE_CONTROL__LN0, newLN0, newLN0));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGSEControl_appID_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv GSEControl_appID_required:
		 *   let
		 *     severity : Integer[1] = 'GSEControl::GSEControl_appID_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.appID <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'appID attribute shall be present in GSEControl (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'GSEControl::GSEControl_appID_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_GSEControl_c_c_GSEControl_appID_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String appID = this.getAppID();
			final /*@NonInvalid*/ boolean status = appID != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_appID_32_attribute_32_shall_32_be_32_present_32_in_32_GSEControl_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_GSEControl_c_c_GSEControl_appID_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGSEControl_appID_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv GSEControl_appID_valid:
		 *   let
		 *     severity : Integer[1] = 'GSEControl::GSEControl_appID_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.appID <> null implies
		 *           self.validSclMessageID(appID)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'appID attribute shall be valid in GSEControl (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.appID.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'GSEControl::GSEControl_appID_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_GSEControl_c_c_GSEControl_appID_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String appID_0 = this.getAppID();
				final /*@NonInvalid*/ boolean ne = appID_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclMessageID = ((SclObject)this).validSclMessageID(appID_0);
					status = validSclMessageID;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_appID_32_attribute_32_shall_32_be_32_valid_32_in_32_GSEControl_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(appID_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_GSEControl_c_c_GSEControl_appID_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGSEControl_confRev_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv GSEControl_confRev_required:
		 *   let
		 *     severity : Integer[1] = 'GSEControl::GSEControl_confRev_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.type = null or self.type = GSEControlTypeEnum::GOOSE implies self.confRev <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'confRev attribute shall be present when type is GOOSE in GSEControl (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'GSEControl::GSEControl_confRev_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_GSEControl_c_c_GSEControl_confRev_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ GSEControlTypeEnum type_0 = this.getType();
			final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = type_0 == null ? null : SclTables.ENUMid_GSEControlTypeEnum.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
			final /*@NonInvalid*/ boolean eq = BOXED_type_0 == null;
			/*@NonInvalid*/ boolean or;
			if (eq) {
				or = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ boolean eq_0 = BOXED_type_0 == SclTables.ELITid_GOOSE;
				or = eq_0;
			}
			/*@NonInvalid*/ boolean status;
			if (or) {
				final /*@NonInvalid*/ Integer confRev = this.getConfRev();
				final /*@NonInvalid*/ IntegerValue BOXED_confRev = confRev == null ? null : ValueUtil.integerValueOf(confRev);
				final /*@NonInvalid*/ boolean ne = BOXED_confRev != null;
				status = ne;
			}
			else {
				status = ValueUtil.TRUE_VALUE;
			}
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_confRev_32_attribute_32_shall_32_be_32_present_32_when_32_type_32_is_32_GOOSE_32_in_32_GSECont, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_GSEControl_c_c_GSEControl_confRev_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGSEControl_confRev_unsignedInt(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv GSEControl_confRev_unsignedInt:
		 *   let
		 *     severity : Integer[1] = 'GSEControl::GSEControl_confRev_unsignedInt'.getSeverity()
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
		 *             Tuple{message = 'confRev attribute shall be valid in GSEControl (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.confRev.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'GSEControl::GSEControl_confRev_unsignedInt'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_GSEControl_c_c_GSEControl_confRev_unsignedInt);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ Integer confRev = this.getConfRev();
				final /*@NonInvalid*/ IntegerValue BOXED_confRev = confRev == null ? null : ValueUtil.integerValueOf(confRev);
				final /*@NonInvalid*/ boolean ne = BOXED_confRev != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_confRev, SclTables.INT_0).booleanValue();
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_confRev_32_attribute_32_shall_32_be_32_valid_32_in_32_GSEControl_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_confRev);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_GSEControl_c_c_GSEControl_confRev_unsignedInt, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.GSE_CONTROL__LN0:
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
			case SclPackage.GSE_CONTROL__LN0:
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
			case SclPackage.GSE_CONTROL__LN0:
				return eInternalContainer().eInverseRemove(this, SclPackage.LN0__GSE_CONTROL, LN0.class, msgs);
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
			case SclPackage.GSE_CONTROL__APP_ID:
				return getAppID();
			case SclPackage.GSE_CONTROL__FIXED_OFFS:
				return getFixedOffs();
			case SclPackage.GSE_CONTROL__SECURITY_ENABLE:
				return getSecurityEnable();
			case SclPackage.GSE_CONTROL__TYPE:
				return getType();
			case SclPackage.GSE_CONTROL__LN0:
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
			case SclPackage.GSE_CONTROL__APP_ID:
				setAppID((String)newValue);
				return;
			case SclPackage.GSE_CONTROL__FIXED_OFFS:
				setFixedOffs((Boolean)newValue);
				return;
			case SclPackage.GSE_CONTROL__SECURITY_ENABLE:
				setSecurityEnable((PredefinedTypeOfSecurityEnum)newValue);
				return;
			case SclPackage.GSE_CONTROL__TYPE:
				setType((GSEControlTypeEnum)newValue);
				return;
			case SclPackage.GSE_CONTROL__LN0:
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
			case SclPackage.GSE_CONTROL__APP_ID:
				unsetAppID();
				return;
			case SclPackage.GSE_CONTROL__FIXED_OFFS:
				unsetFixedOffs();
				return;
			case SclPackage.GSE_CONTROL__SECURITY_ENABLE:
				unsetSecurityEnable();
				return;
			case SclPackage.GSE_CONTROL__TYPE:
				unsetType();
				return;
			case SclPackage.GSE_CONTROL__LN0:
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
			case SclPackage.GSE_CONTROL__APP_ID:
				return isSetAppID();
			case SclPackage.GSE_CONTROL__FIXED_OFFS:
				return isSetFixedOffs();
			case SclPackage.GSE_CONTROL__SECURITY_ENABLE:
				return isSetSecurityEnable();
			case SclPackage.GSE_CONTROL__TYPE:
				return isSetType();
			case SclPackage.GSE_CONTROL__LN0:
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
			case SclPackage.GSE_CONTROL___VALIDATE_GSE_CONTROL_APP_ID_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateGSEControl_appID_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.GSE_CONTROL___VALIDATE_GSE_CONTROL_APP_ID_VALID__DIAGNOSTICCHAIN_MAP:
				return validateGSEControl_appID_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.GSE_CONTROL___VALIDATE_GSE_CONTROL_CONF_REV_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateGSEControl_confRev_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.GSE_CONTROL___VALIDATE_GSE_CONTROL_CONF_REV_UNSIGNED_INT__DIAGNOSTICCHAIN_MAP:
				return validateGSEControl_confRev_unsignedInt((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (appID: ");
		if (appIDESet) result.append(appID); else result.append("<unset>");
		result.append(", fixedOffs: ");
		if (fixedOffsESet) result.append(fixedOffs); else result.append("<unset>");
		result.append(", securityEnable: ");
		if (securityEnableESet) result.append(securityEnable); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSEControlImpl
