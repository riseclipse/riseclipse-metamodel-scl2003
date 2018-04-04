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

import java.util.List;

import java.util.Map;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 * An implementation of the model object '<em><b>DO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOImpl#getTransient <em>Transient</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOImpl#getLNodeType <em>LNode Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOImpl#getRefersToDOType <em>Refers To DO Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DOImpl extends DataObjectImpl implements DO {
    /**
	 * The default value of the '{@link #getTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTransient()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean TRANSIENT_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTransient()
	 * @generated
	 * @ordered
	 */
    protected Boolean transient_ = TRANSIENT_EDEFAULT;

    /**
	 * This is true if the Transient attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean transientESet;

    /**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
    protected static final String TYPE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
    protected String type = TYPE_EDEFAULT;

    /**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean typeESet;

    /**
	 * The cached value of the '{@link #getRefersToDOType() <em>Refers To DO Type</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRefersToDOType()
	 * @generated
	 * @ordered
	 */
    protected DOType refersToDOType;

    /**
	 * This is true if the Refers To DO Type reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean refersToDOTypeESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DOImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.DO;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Boolean getTransient() {
        if( isSetTransient() ) {
            return transient_;
        }
        return Boolean.FALSE;
    }

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTransient( Boolean newTransient ) {
		Boolean oldTransient = transient_;
		transient_ = newTransient;
		boolean oldTransientESet = transientESet;
		transientESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DO__TRANSIENT, oldTransient, transient_, !oldTransientESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetTransient() {
		Boolean oldTransient = transient_;
		boolean oldTransientESet = transientESet;
		transient_ = TRANSIENT_EDEFAULT;
		transientESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DO__TRANSIENT, oldTransient, TRANSIENT_EDEFAULT, oldTransientESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetTransient() {
		return transientESet;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getType() {
        if( isSetRefersToDOType() )
            return getRefersToDOType().getId();
        else
            return type;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setType( String newType ) {
		String oldType = type;
		type = newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DO__TYPE, oldType, type, !oldTypeESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetType() {
		String oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DO__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean isSetType() {
        return isSetRefersToDOType();
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LNodeType getLNodeType() {
		if (eContainerFeatureID() != SclPackage.DO__LNODE_TYPE) return null;
		return (LNodeType)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLNodeType( LNodeType newLNodeType, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newLNodeType, SclPackage.DO__LNODE_TYPE, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLNodeType( LNodeType newLNodeType ) {
		if (newLNodeType != eInternalContainer() || (eContainerFeatureID() != SclPackage.DO__LNODE_TYPE && newLNodeType != null)) {
			if (EcoreUtil.isAncestor(this, newLNodeType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLNodeType != null)
				msgs = ((InternalEObject)newLNodeType).eInverseAdd(this, SclPackage.LNODE_TYPE__DO, LNodeType.class, msgs);
			msgs = basicSetLNodeType(newLNodeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DO__LNODE_TYPE, newLNodeType, newLNodeType));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DOType getRefersToDOType() {
		return refersToDOType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetRefersToDOType(DOType newRefersToDOType, NotificationChain msgs) {
		DOType oldRefersToDOType = refersToDOType;
		refersToDOType = newRefersToDOType;
		boolean oldRefersToDOTypeESet = refersToDOTypeESet;
		refersToDOTypeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.DO__REFERS_TO_DO_TYPE, oldRefersToDOType, newRefersToDOType, !oldRefersToDOTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRefersToDOType(DOType newRefersToDOType) {
		if (newRefersToDOType != refersToDOType) {
			NotificationChain msgs = null;
			if (refersToDOType != null)
				msgs = ((InternalEObject)refersToDOType).eInverseRemove(this, SclPackage.DO_TYPE__REFERRED_BY_DO, DOType.class, msgs);
			if (newRefersToDOType != null)
				msgs = ((InternalEObject)newRefersToDOType).eInverseAdd(this, SclPackage.DO_TYPE__REFERRED_BY_DO, DOType.class, msgs);
			msgs = basicSetRefersToDOType(newRefersToDOType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToDOTypeESet = refersToDOTypeESet;
			refersToDOTypeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DO__REFERS_TO_DO_TYPE, newRefersToDOType, newRefersToDOType, !oldRefersToDOTypeESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetRefersToDOType(NotificationChain msgs) {
		DOType oldRefersToDOType = refersToDOType;
		refersToDOType = null;
		boolean oldRefersToDOTypeESet = refersToDOTypeESet;
		refersToDOTypeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.DO__REFERS_TO_DO_TYPE, oldRefersToDOType, null, oldRefersToDOTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetRefersToDOType() {
		if (refersToDOType != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)refersToDOType).eInverseRemove(this, SclPackage.DO_TYPE__REFERRED_BY_DO, DOType.class, msgs);
			msgs = basicUnsetRefersToDOType(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToDOTypeESet = refersToDOTypeESet;
			refersToDOTypeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DO__REFERS_TO_DO_TYPE, null, null, oldRefersToDOTypeESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetRefersToDOType() {
		return refersToDOTypeESet;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDO_type_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv DO_type_required:
		 *   let severity : Integer[1] = 'DO::DO_type_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.type <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'type attribute shall be present in DO (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'DO::DO_type_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_DO_c_c_DO_type_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String type = this.getType();
			final /*@NonInvalid*/ boolean status = type != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_type_32_attribute_32_shall_32_be_32_present_32_in_32_DO_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_DO_c_c_DO_type_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDO_type_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv DO_type_valid:
		 *   let severity : Integer[1] = 'DO::DO_type_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.type <> null implies
		 *           self.validSclName(type)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'type attribute shall be valid in DO (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.type.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'DO::DO_type_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_DO_c_c_DO_type_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String type_0 = this.getType();
				final /*@NonInvalid*/ boolean ne = type_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclName = ((SclObject)this).validSclName(type_0);
					status = validSclName;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_type_32_attribute_32_shall_32_be_32_valid_32_in_32_DO_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(type_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_DO_c_c_DO_type_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.DO__LNODE_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLNodeType((LNodeType)otherEnd, msgs);
			case SclPackage.DO__REFERS_TO_DO_TYPE:
				if (refersToDOType != null)
					msgs = ((InternalEObject)refersToDOType).eInverseRemove(this, SclPackage.DO_TYPE__REFERRED_BY_DO, DOType.class, msgs);
				return basicSetRefersToDOType((DOType)otherEnd, msgs);
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
			case SclPackage.DO__LNODE_TYPE:
				return basicSetLNodeType(null, msgs);
			case SclPackage.DO__REFERS_TO_DO_TYPE:
				return basicUnsetRefersToDOType(msgs);
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
			case SclPackage.DO__LNODE_TYPE:
				return eInternalContainer().eInverseRemove(this, SclPackage.LNODE_TYPE__DO, LNodeType.class, msgs);
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
			case SclPackage.DO__TRANSIENT:
				return getTransient();
			case SclPackage.DO__TYPE:
				return getType();
			case SclPackage.DO__LNODE_TYPE:
				return getLNodeType();
			case SclPackage.DO__REFERS_TO_DO_TYPE:
				return getRefersToDOType();
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
			case SclPackage.DO__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case SclPackage.DO__TYPE:
				setType((String)newValue);
				return;
			case SclPackage.DO__LNODE_TYPE:
				setLNodeType((LNodeType)newValue);
				return;
			case SclPackage.DO__REFERS_TO_DO_TYPE:
				setRefersToDOType((DOType)newValue);
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
			case SclPackage.DO__TRANSIENT:
				unsetTransient();
				return;
			case SclPackage.DO__TYPE:
				unsetType();
				return;
			case SclPackage.DO__LNODE_TYPE:
				setLNodeType((LNodeType)null);
				return;
			case SclPackage.DO__REFERS_TO_DO_TYPE:
				unsetRefersToDOType();
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
			case SclPackage.DO__TRANSIENT:
				return isSetTransient();
			case SclPackage.DO__TYPE:
				return isSetType();
			case SclPackage.DO__LNODE_TYPE:
				return getLNodeType() != null;
			case SclPackage.DO__REFERS_TO_DO_TYPE:
				return isSetRefersToDOType();
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
			case SclPackage.DO___VALIDATE_DO_TYPE_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateDO_type_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.DO___VALIDATE_DO_TYPE_VALID__DIAGNOSTICCHAIN_MAP:
				return validateDO_type_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (transient: ");
		if (transientESet) result.append(transient_); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

    @Override
    protected void doResolveLinks() {
        // name             The data object name as specified for example in IEC 61850-7-4
        // type             The type references the id of a DOType definition
        // accessControl    Access control definition for this DO. If it is missing then any higher-level
        //                  access control definition applies
        // transient        If set to true, it indicates that the Transient definition from IEC 61850-7-4 applies

        // Resolve only if attribute has been read
        if( type == null ) return;

        // find an DOType with
        //   DOType.id      == DO.type
        SclSwitch< Boolean > s = new SclSwitch< Boolean >() {

            @Override
            public Boolean caseDOType( DOType object ) {
                return object.getId().equals( getType() );
            }

            @Override
            public Boolean defaultCase( EObject object ) {
                return false;
            }

        };

        List< DOType > res = shallowSearchObjects( getSCLRoot().getDataTypeTemplates().getDOType(), s );
        String mess = "DOType( id = " + getType() + " ) for DO on line " + getLineNumber() + " )";
        if( res.isEmpty() ) {
            AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess );
        }
        else if( res.size() > 1 ) {
            AbstractRiseClipseConsole.getConsole().error( "found several " + mess );
        }
        else {
            //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
            setRefersToDOType( res.get( 0 ) );
        }
    }

} //DOImpl
