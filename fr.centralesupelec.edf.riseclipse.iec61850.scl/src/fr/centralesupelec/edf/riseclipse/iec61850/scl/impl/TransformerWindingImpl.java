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
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.NeutralPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformer Winding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TransformerWindingImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TransformerWindingImpl#getEqFunction <em>Eq Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TransformerWindingImpl#getNeutralPoint <em>Neutral Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TransformerWindingImpl#getPowerTransformer <em>Power Transformer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TransformerWindingImpl#getTapChanger <em>Tap Changer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformerWindingImpl extends AbstractConductingEquipmentImpl implements TransformerWinding {
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
	 * The cached value of the '{@link #getEqFunction() <em>Eq Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getEqFunction()
	 * @generated
	 * @ordered
	 */
    protected EList<EqFunction> eqFunction;

    /**
	 * The cached value of the '{@link #getNeutralPoint() <em>Neutral Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNeutralPoint()
	 * @generated
	 * @ordered
	 */
    protected NeutralPoint neutralPoint;

    /**
	 * This is true if the Neutral Point containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean neutralPointESet;

    /**
	 * The cached value of the '{@link #getTapChanger() <em>Tap Changer</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTapChanger()
	 * @generated
	 * @ordered
	 */
    protected TapChanger tapChanger;

    /**
	 * This is true if the Tap Changer containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean tapChangerESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected TransformerWindingImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.TRANSFORMER_WINDING;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getType() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TRANSFORMER_WINDING__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TRANSFORMER_WINDING__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
    public EList<EqFunction> getEqFunction() {
		if (eqFunction == null) {
			eqFunction = new EObjectContainmentWithInverseEList.Unsettable<EqFunction>(EqFunction.class, this, SclPackage.TRANSFORMER_WINDING__EQ_FUNCTION, SclPackage.EQ_FUNCTION__TRANSFORMER_WINDING);
		}
		return eqFunction;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetEqFunction() {
		if (eqFunction != null) ((InternalEList.Unsettable<?>)eqFunction).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetEqFunction() {
		return eqFunction != null && ((InternalEList.Unsettable<?>)eqFunction).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NeutralPoint getNeutralPoint() {
		return neutralPoint;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetNeutralPoint( NeutralPoint newNeutralPoint, NotificationChain msgs ) {
		NeutralPoint oldNeutralPoint = neutralPoint;
		neutralPoint = newNeutralPoint;
		boolean oldNeutralPointESet = neutralPointESet;
		neutralPointESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TRANSFORMER_WINDING__NEUTRAL_POINT, oldNeutralPoint, newNeutralPoint, !oldNeutralPointESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNeutralPoint( NeutralPoint newNeutralPoint ) {
		if (newNeutralPoint != neutralPoint) {
			NotificationChain msgs = null;
			if (neutralPoint != null)
				msgs = ((InternalEObject)neutralPoint).eInverseRemove(this, SclPackage.NEUTRAL_POINT__TRANSFORMER_WINDING, NeutralPoint.class, msgs);
			if (newNeutralPoint != null)
				msgs = ((InternalEObject)newNeutralPoint).eInverseAdd(this, SclPackage.NEUTRAL_POINT__TRANSFORMER_WINDING, NeutralPoint.class, msgs);
			msgs = basicSetNeutralPoint(newNeutralPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNeutralPointESet = neutralPointESet;
			neutralPointESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TRANSFORMER_WINDING__NEUTRAL_POINT, newNeutralPoint, newNeutralPoint, !oldNeutralPointESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetNeutralPoint( NotificationChain msgs ) {
		NeutralPoint oldNeutralPoint = neutralPoint;
		neutralPoint = null;
		boolean oldNeutralPointESet = neutralPointESet;
		neutralPointESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.TRANSFORMER_WINDING__NEUTRAL_POINT, oldNeutralPoint, null, oldNeutralPointESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetNeutralPoint() {
		if (neutralPoint != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)neutralPoint).eInverseRemove(this, SclPackage.NEUTRAL_POINT__TRANSFORMER_WINDING, NeutralPoint.class, msgs);
			msgs = basicUnsetNeutralPoint(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldNeutralPointESet = neutralPointESet;
			neutralPointESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TRANSFORMER_WINDING__NEUTRAL_POINT, null, null, oldNeutralPointESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetNeutralPoint() {
		return neutralPointESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public PowerTransformer getPowerTransformer() {
		if (eContainerFeatureID() != SclPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER) return null;
		return (PowerTransformer)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetPowerTransformer( PowerTransformer newPowerTransformer, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newPowerTransformer, SclPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPowerTransformer( PowerTransformer newPowerTransformer ) {
		if (newPowerTransformer != eInternalContainer() || (eContainerFeatureID() != SclPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER && newPowerTransformer != null)) {
			if (EcoreUtil.isAncestor(this, newPowerTransformer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPowerTransformer != null)
				msgs = ((InternalEObject)newPowerTransformer).eInverseAdd(this, SclPackage.POWER_TRANSFORMER__TRANSFORMER_WINDING, PowerTransformer.class, msgs);
			msgs = basicSetPowerTransformer(newPowerTransformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER, newPowerTransformer, newPowerTransformer));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TapChanger getTapChanger() {
		return tapChanger;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetTapChanger( TapChanger newTapChanger, NotificationChain msgs ) {
		TapChanger oldTapChanger = tapChanger;
		tapChanger = newTapChanger;
		boolean oldTapChangerESet = tapChangerESet;
		tapChangerESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TRANSFORMER_WINDING__TAP_CHANGER, oldTapChanger, newTapChanger, !oldTapChangerESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTapChanger( TapChanger newTapChanger ) {
		if (newTapChanger != tapChanger) {
			NotificationChain msgs = null;
			if (tapChanger != null)
				msgs = ((InternalEObject)tapChanger).eInverseRemove(this, SclPackage.TAP_CHANGER__TRANSFORMER_WINDING, TapChanger.class, msgs);
			if (newTapChanger != null)
				msgs = ((InternalEObject)newTapChanger).eInverseAdd(this, SclPackage.TAP_CHANGER__TRANSFORMER_WINDING, TapChanger.class, msgs);
			msgs = basicSetTapChanger(newTapChanger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTapChangerESet = tapChangerESet;
			tapChangerESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TRANSFORMER_WINDING__TAP_CHANGER, newTapChanger, newTapChanger, !oldTapChangerESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetTapChanger( NotificationChain msgs ) {
		TapChanger oldTapChanger = tapChanger;
		tapChanger = null;
		boolean oldTapChangerESet = tapChangerESet;
		tapChangerESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.TRANSFORMER_WINDING__TAP_CHANGER, oldTapChanger, null, oldTapChangerESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetTapChanger() {
		if (tapChanger != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)tapChanger).eInverseRemove(this, SclPackage.TAP_CHANGER__TRANSFORMER_WINDING, TapChanger.class, msgs);
			msgs = basicUnsetTapChanger(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTapChangerESet = tapChangerESet;
			tapChangerESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TRANSFORMER_WINDING__TAP_CHANGER, null, null, oldTapChangerESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetTapChanger() {
		return tapChangerESet;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformerWinding_type_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv TransformerWinding_type_required:
		 *   let
		 *     severity : Integer[1] = 'TransformerWinding::TransformerWinding_type_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.type <> null implies self.type = 'PTW'
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'type attribute shall be PTW in TransformerWinding (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.type.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'TransformerWinding::TransformerWinding_type_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_TransformerWinding_c_c_TransformerWinding_type_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String type = this.getType();
				final /*@NonInvalid*/ boolean ne = type != null;
				/*@NonInvalid*/ boolean status;
				if (ne) {
					final /*@NonInvalid*/ boolean eq = SclTables.STR_PTW.equals(type);
					status = eq;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_type_32_attribute_32_shall_32_be_32_PTW_32_in_32_TransformerWinding_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(type);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_TransformerWinding_c_c_TransformerWinding_type_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.TRANSFORMER_WINDING__EQ_FUNCTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEqFunction()).basicAdd(otherEnd, msgs);
			case SclPackage.TRANSFORMER_WINDING__NEUTRAL_POINT:
				if (neutralPoint != null)
					msgs = ((InternalEObject)neutralPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TRANSFORMER_WINDING__NEUTRAL_POINT, null, msgs);
				return basicSetNeutralPoint((NeutralPoint)otherEnd, msgs);
			case SclPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPowerTransformer((PowerTransformer)otherEnd, msgs);
			case SclPackage.TRANSFORMER_WINDING__TAP_CHANGER:
				if (tapChanger != null)
					msgs = ((InternalEObject)tapChanger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TRANSFORMER_WINDING__TAP_CHANGER, null, msgs);
				return basicSetTapChanger((TapChanger)otherEnd, msgs);
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
			case SclPackage.TRANSFORMER_WINDING__EQ_FUNCTION:
				return ((InternalEList<?>)getEqFunction()).basicRemove(otherEnd, msgs);
			case SclPackage.TRANSFORMER_WINDING__NEUTRAL_POINT:
				return basicUnsetNeutralPoint(msgs);
			case SclPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER:
				return basicSetPowerTransformer(null, msgs);
			case SclPackage.TRANSFORMER_WINDING__TAP_CHANGER:
				return basicUnsetTapChanger(msgs);
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
			case SclPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER:
				return eInternalContainer().eInverseRemove(this, SclPackage.POWER_TRANSFORMER__TRANSFORMER_WINDING, PowerTransformer.class, msgs);
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
			case SclPackage.TRANSFORMER_WINDING__TYPE:
				return getType();
			case SclPackage.TRANSFORMER_WINDING__EQ_FUNCTION:
				return getEqFunction();
			case SclPackage.TRANSFORMER_WINDING__NEUTRAL_POINT:
				return getNeutralPoint();
			case SclPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER:
				return getPowerTransformer();
			case SclPackage.TRANSFORMER_WINDING__TAP_CHANGER:
				return getTapChanger();
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
			case SclPackage.TRANSFORMER_WINDING__TYPE:
				setType((String)newValue);
				return;
			case SclPackage.TRANSFORMER_WINDING__EQ_FUNCTION:
				getEqFunction().clear();
				getEqFunction().addAll((Collection<? extends EqFunction>)newValue);
				return;
			case SclPackage.TRANSFORMER_WINDING__NEUTRAL_POINT:
				setNeutralPoint((NeutralPoint)newValue);
				return;
			case SclPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER:
				setPowerTransformer((PowerTransformer)newValue);
				return;
			case SclPackage.TRANSFORMER_WINDING__TAP_CHANGER:
				setTapChanger((TapChanger)newValue);
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
			case SclPackage.TRANSFORMER_WINDING__TYPE:
				unsetType();
				return;
			case SclPackage.TRANSFORMER_WINDING__EQ_FUNCTION:
				unsetEqFunction();
				return;
			case SclPackage.TRANSFORMER_WINDING__NEUTRAL_POINT:
				unsetNeutralPoint();
				return;
			case SclPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER:
				setPowerTransformer((PowerTransformer)null);
				return;
			case SclPackage.TRANSFORMER_WINDING__TAP_CHANGER:
				unsetTapChanger();
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
			case SclPackage.TRANSFORMER_WINDING__TYPE:
				return isSetType();
			case SclPackage.TRANSFORMER_WINDING__EQ_FUNCTION:
				return isSetEqFunction();
			case SclPackage.TRANSFORMER_WINDING__NEUTRAL_POINT:
				return isSetNeutralPoint();
			case SclPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER:
				return getPowerTransformer() != null;
			case SclPackage.TRANSFORMER_WINDING__TAP_CHANGER:
				return isSetTapChanger();
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
			case SclPackage.TRANSFORMER_WINDING___VALIDATE_TRANSFORMER_WINDING_TYPE_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateTransformerWinding_type_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TransformerWindingImpl
