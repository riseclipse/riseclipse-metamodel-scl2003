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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubstationImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubstationImpl#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubstationImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubstationImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubstationImpl#getSCL <em>SCL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstationImpl extends EquipmentContainerImpl implements Substation {
    /**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
    protected EList<Function> function;

    /**
	 * The cached value of the '{@link #getVoltageLevel() <em>Voltage Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVoltageLevel()
	 * @generated
	 * @ordered
	 */
    protected EList<VoltageLevel> voltageLevel;

    /**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
    protected EList<Terminal> terminal;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SubstationImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.SUBSTATION;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Function> getFunction() {
		if (function == null) {
			function = new EObjectContainmentWithInverseEList.Unsettable<Function>(Function.class, this, SclPackage.SUBSTATION__FUNCTION, SclPackage.FUNCTION__SUBSTATION);
		}
		return function;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetFunction() {
		if (function != null) ((InternalEList.Unsettable<?>)function).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetFunction() {
		return function != null && ((InternalEList.Unsettable<?>)function).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<VoltageLevel> getVoltageLevel() {
		if (voltageLevel == null) {
			voltageLevel = new EObjectContainmentWithInverseEList.Unsettable<VoltageLevel>(VoltageLevel.class, this, SclPackage.SUBSTATION__VOLTAGE_LEVEL, SclPackage.VOLTAGE_LEVEL__SUBSTATION);
		}
		return voltageLevel;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetVoltageLevel() {
		if (voltageLevel != null) ((InternalEList.Unsettable<?>)voltageLevel).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetVoltageLevel() {
		return voltageLevel != null && ((InternalEList.Unsettable<?>)voltageLevel).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Terminal> getTerminal() {
		if (terminal == null) {
			terminal = new EObjectWithInverseEList.Unsettable<Terminal>(Terminal.class, this, SclPackage.SUBSTATION__TERMINAL, SclPackage.TERMINAL__SUBSTATION);
		}
		return terminal;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetTerminal() {
		if (terminal != null) ((InternalEList.Unsettable<?>)terminal).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetTerminal() {
		return terminal != null && ((InternalEList.Unsettable<?>)terminal).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public fr.centralesupelec.edf.riseclipse.iec61850.scl.Process getProcess() {
		if (eContainerFeatureID() != SclPackage.SUBSTATION__PROCESS) return null;
		return (fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetProcess( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process newProcess,
            NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newProcess, SclPackage.SUBSTATION__PROCESS, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setProcess( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process newProcess ) {
		if (newProcess != eInternalContainer() || (eContainerFeatureID() != SclPackage.SUBSTATION__PROCESS && newProcess != null)) {
			if (EcoreUtil.isAncestor(this, newProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcess != null)
				msgs = ((InternalEObject)newProcess).eInverseAdd(this, SclPackage.PROCESS__SUBSTATION, fr.centralesupelec.edf.riseclipse.iec61850.scl.Process.class, msgs);
			msgs = basicSetProcess(newProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SUBSTATION__PROCESS, newProcess, newProcess));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SCL getSCL() {
		if (eContainerFeatureID() != SclPackage.SUBSTATION__SCL) return null;
		return (SCL)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSCL( SCL newSCL, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newSCL, SclPackage.SUBSTATION__SCL, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSCL( SCL newSCL ) {
		if (newSCL != eInternalContainer() || (eContainerFeatureID() != SclPackage.SUBSTATION__SCL && newSCL != null)) {
			if (EcoreUtil.isAncestor(this, newSCL))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSCL != null)
				msgs = ((InternalEObject)newSCL).eInverseAdd(this, SclPackage.SCL__SUBSTATION, SCL.class, msgs);
			msgs = basicSetSCL(newSCL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SUBSTATION__SCL, newSCL, newSCL));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstation_nothing(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv Substation_nothing: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstation_at_least_one_VoltageLevel_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv Substation_at_least_one_VoltageLevel_required:
		 *   let
		 *     severity : Integer[1] = 'Substation::Substation_at_least_one_VoltageLevel_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[1] = self.VoltageLevel->notEmpty()
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'Substation shall contain at least one VoltageLevel (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'Substation::Substation_at_least_one_VoltageLevel_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_Substation_c_c_Substation_at_least_one_VoltageLevel_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ List<VoltageLevel> VoltageLevel = this.getVoltageLevel();
			final /*@NonInvalid*/ SetValue BOXED_VoltageLevel = idResolver.createSetOfAll(SclTables.SET_CLSSid_VoltageLevel, VoltageLevel);
			final /*@NonInvalid*/ boolean status = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_VoltageLevel).booleanValue();
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_Substation_32_shall_32_contain_32_at_32_least_32_one_32_VoltageLevel_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_Substation_c_c_Substation_at_least_one_VoltageLevel_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.SUBSTATION__FUNCTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFunction()).basicAdd(otherEnd, msgs);
			case SclPackage.SUBSTATION__VOLTAGE_LEVEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVoltageLevel()).basicAdd(otherEnd, msgs);
			case SclPackage.SUBSTATION__TERMINAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerminal()).basicAdd(otherEnd, msgs);
			case SclPackage.SUBSTATION__PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProcess((fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)otherEnd, msgs);
			case SclPackage.SUBSTATION__SCL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSCL((SCL)otherEnd, msgs);
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
			case SclPackage.SUBSTATION__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
			case SclPackage.SUBSTATION__VOLTAGE_LEVEL:
				return ((InternalEList<?>)getVoltageLevel()).basicRemove(otherEnd, msgs);
			case SclPackage.SUBSTATION__TERMINAL:
				return ((InternalEList<?>)getTerminal()).basicRemove(otherEnd, msgs);
			case SclPackage.SUBSTATION__PROCESS:
				return basicSetProcess(null, msgs);
			case SclPackage.SUBSTATION__SCL:
				return basicSetSCL(null, msgs);
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
			case SclPackage.SUBSTATION__PROCESS:
				return eInternalContainer().eInverseRemove(this, SclPackage.PROCESS__SUBSTATION, fr.centralesupelec.edf.riseclipse.iec61850.scl.Process.class, msgs);
			case SclPackage.SUBSTATION__SCL:
				return eInternalContainer().eInverseRemove(this, SclPackage.SCL__SUBSTATION, SCL.class, msgs);
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
			case SclPackage.SUBSTATION__FUNCTION:
				return getFunction();
			case SclPackage.SUBSTATION__VOLTAGE_LEVEL:
				return getVoltageLevel();
			case SclPackage.SUBSTATION__TERMINAL:
				return getTerminal();
			case SclPackage.SUBSTATION__PROCESS:
				return getProcess();
			case SclPackage.SUBSTATION__SCL:
				return getSCL();
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
			case SclPackage.SUBSTATION__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends Function>)newValue);
				return;
			case SclPackage.SUBSTATION__VOLTAGE_LEVEL:
				getVoltageLevel().clear();
				getVoltageLevel().addAll((Collection<? extends VoltageLevel>)newValue);
				return;
			case SclPackage.SUBSTATION__TERMINAL:
				getTerminal().clear();
				getTerminal().addAll((Collection<? extends Terminal>)newValue);
				return;
			case SclPackage.SUBSTATION__PROCESS:
				setProcess((fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)newValue);
				return;
			case SclPackage.SUBSTATION__SCL:
				setSCL((SCL)newValue);
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
			case SclPackage.SUBSTATION__FUNCTION:
				unsetFunction();
				return;
			case SclPackage.SUBSTATION__VOLTAGE_LEVEL:
				unsetVoltageLevel();
				return;
			case SclPackage.SUBSTATION__TERMINAL:
				unsetTerminal();
				return;
			case SclPackage.SUBSTATION__PROCESS:
				setProcess((fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)null);
				return;
			case SclPackage.SUBSTATION__SCL:
				setSCL((SCL)null);
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
			case SclPackage.SUBSTATION__FUNCTION:
				return isSetFunction();
			case SclPackage.SUBSTATION__VOLTAGE_LEVEL:
				return isSetVoltageLevel();
			case SclPackage.SUBSTATION__TERMINAL:
				return isSetTerminal();
			case SclPackage.SUBSTATION__PROCESS:
				return getProcess() != null;
			case SclPackage.SUBSTATION__SCL:
				return getSCL() != null;
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
			case SclPackage.SUBSTATION___VALIDATE_SUBSTATION_NOTHING__DIAGNOSTICCHAIN_MAP:
				return validateSubstation_nothing((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SUBSTATION___VALIDATE_SUBSTATION_AT_LEAST_ONE_VOLTAGE_LEVEL_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateSubstation_at_least_one_VoltageLevel_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SubstationImpl
