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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Line;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProcessImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProcessImpl#getLine <em>Line</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProcessImpl#getSCL <em>SCL</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProcessImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProcessImpl#getSubstation <em>Substation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProcessImpl#getSubProcesses <em>Sub Processes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProcessImpl#getParentProcess <em>Parent Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends GeneralEquipmentContainerImpl implements
        fr.centralesupelec.edf.riseclipse.iec61850.scl.Process {
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
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
    protected EList<Line> line;

    /**
	 * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConductingEquipment()
	 * @generated
	 * @ordered
	 */
    protected EList<ConductingEquipment> conductingEquipment;

    /**
	 * The cached value of the '{@link #getSubstation() <em>Substation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSubstation()
	 * @generated
	 * @ordered
	 */
    protected EList<Substation> substation;

    /**
	 * The cached value of the '{@link #getSubProcesses() <em>Sub Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSubProcesses()
	 * @generated
	 * @ordered
	 */
    protected EList<fr.centralesupelec.edf.riseclipse.iec61850.scl.Process> subProcesses;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ProcessImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.PROCESS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.PROCESS__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.PROCESS__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
    public EList<Line> getLine() {
		if (line == null) {
			line = new EObjectContainmentWithInverseEList.Unsettable<Line>(Line.class, this, SclPackage.PROCESS__LINE, SclPackage.LINE__PROCESS);
		}
		return line;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetLine() {
		if (line != null) ((InternalEList.Unsettable<?>)line).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetLine() {
		return line != null && ((InternalEList.Unsettable<?>)line).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SCL getSCL() {
		if (eContainerFeatureID() != SclPackage.PROCESS__SCL) return null;
		return (SCL)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSCL( SCL newSCL, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newSCL, SclPackage.PROCESS__SCL, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSCL( SCL newSCL ) {
		if (newSCL != eInternalContainer() || (eContainerFeatureID() != SclPackage.PROCESS__SCL && newSCL != null)) {
			if (EcoreUtil.isAncestor(this, newSCL))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSCL != null)
				msgs = ((InternalEObject)newSCL).eInverseAdd(this, SclPackage.SCL__PROCESS, SCL.class, msgs);
			msgs = basicSetSCL(newSCL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.PROCESS__SCL, newSCL, newSCL));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ConductingEquipment> getConductingEquipment() {
		if (conductingEquipment == null) {
			conductingEquipment = new EObjectContainmentWithInverseEList.Unsettable<ConductingEquipment>(ConductingEquipment.class, this, SclPackage.PROCESS__CONDUCTING_EQUIPMENT, SclPackage.CONDUCTING_EQUIPMENT__PROCESS);
		}
		return conductingEquipment;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetConductingEquipment() {
		if (conductingEquipment != null) ((InternalEList.Unsettable<?>)conductingEquipment).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetConductingEquipment() {
		return conductingEquipment != null && ((InternalEList.Unsettable<?>)conductingEquipment).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Substation> getSubstation() {
		if (substation == null) {
			substation = new EObjectContainmentWithInverseEList.Unsettable<Substation>(Substation.class, this, SclPackage.PROCESS__SUBSTATION, SclPackage.SUBSTATION__PROCESS);
		}
		return substation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSubstation() {
		if (substation != null) ((InternalEList.Unsettable<?>)substation).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSubstation() {
		return substation != null && ((InternalEList.Unsettable<?>)substation).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<fr.centralesupelec.edf.riseclipse.iec61850.scl.Process> getSubProcesses() {
		if (subProcesses == null) {
			subProcesses = new EObjectContainmentWithInverseEList.Unsettable<fr.centralesupelec.edf.riseclipse.iec61850.scl.Process>(fr.centralesupelec.edf.riseclipse.iec61850.scl.Process.class, this, SclPackage.PROCESS__SUB_PROCESSES, SclPackage.PROCESS__PARENT_PROCESS);
		}
		return subProcesses;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSubProcesses() {
		if (subProcesses != null) ((InternalEList.Unsettable<?>)subProcesses).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSubProcesses() {
		return subProcesses != null && ((InternalEList.Unsettable<?>)subProcesses).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public fr.centralesupelec.edf.riseclipse.iec61850.scl.Process getParentProcess() {
		if (eContainerFeatureID() != SclPackage.PROCESS__PARENT_PROCESS) return null;
		return (fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetParentProcess(
            fr.centralesupelec.edf.riseclipse.iec61850.scl.Process newParentProcess, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newParentProcess, SclPackage.PROCESS__PARENT_PROCESS, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setParentProcess( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process newParentProcess ) {
		if (newParentProcess != eInternalContainer() || (eContainerFeatureID() != SclPackage.PROCESS__PARENT_PROCESS && newParentProcess != null)) {
			if (EcoreUtil.isAncestor(this, newParentProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentProcess != null)
				msgs = ((InternalEObject)newParentProcess).eInverseAdd(this, SclPackage.PROCESS__SUB_PROCESSES, fr.centralesupelec.edf.riseclipse.iec61850.scl.Process.class, msgs);
			msgs = basicSetParentProcess(newParentProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.PROCESS__PARENT_PROCESS, newParentProcess, newParentProcess));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_type_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv Process_type_valid:
		 *   let severity : Integer[1] = 'Process::Process_type_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.type <> null implies
		 *           self.validSclProcessType(type)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'type attribute shall be valid in Process (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.type.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'Process::Process_type_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_Process_c_c_Process_type_valid);
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
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclProcessType = ((SclObject)this).validSclProcessType(type);
					status = validSclProcessType;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_type_32_attribute_32_shall_32_be_32_valid_32_in_32_Process_32_o_line_32, toString);
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
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_Process_c_c_Process_type_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.PROCESS__LINE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLine()).basicAdd(otherEnd, msgs);
			case SclPackage.PROCESS__SCL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSCL((SCL)otherEnd, msgs);
			case SclPackage.PROCESS__CONDUCTING_EQUIPMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConductingEquipment()).basicAdd(otherEnd, msgs);
			case SclPackage.PROCESS__SUBSTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubstation()).basicAdd(otherEnd, msgs);
			case SclPackage.PROCESS__SUB_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubProcesses()).basicAdd(otherEnd, msgs);
			case SclPackage.PROCESS__PARENT_PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentProcess((fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)otherEnd, msgs);
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
			case SclPackage.PROCESS__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case SclPackage.PROCESS__SCL:
				return basicSetSCL(null, msgs);
			case SclPackage.PROCESS__CONDUCTING_EQUIPMENT:
				return ((InternalEList<?>)getConductingEquipment()).basicRemove(otherEnd, msgs);
			case SclPackage.PROCESS__SUBSTATION:
				return ((InternalEList<?>)getSubstation()).basicRemove(otherEnd, msgs);
			case SclPackage.PROCESS__SUB_PROCESSES:
				return ((InternalEList<?>)getSubProcesses()).basicRemove(otherEnd, msgs);
			case SclPackage.PROCESS__PARENT_PROCESS:
				return basicSetParentProcess(null, msgs);
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
			case SclPackage.PROCESS__SCL:
				return eInternalContainer().eInverseRemove(this, SclPackage.SCL__PROCESS, SCL.class, msgs);
			case SclPackage.PROCESS__PARENT_PROCESS:
				return eInternalContainer().eInverseRemove(this, SclPackage.PROCESS__SUB_PROCESSES, fr.centralesupelec.edf.riseclipse.iec61850.scl.Process.class, msgs);
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
			case SclPackage.PROCESS__TYPE:
				return getType();
			case SclPackage.PROCESS__LINE:
				return getLine();
			case SclPackage.PROCESS__SCL:
				return getSCL();
			case SclPackage.PROCESS__CONDUCTING_EQUIPMENT:
				return getConductingEquipment();
			case SclPackage.PROCESS__SUBSTATION:
				return getSubstation();
			case SclPackage.PROCESS__SUB_PROCESSES:
				return getSubProcesses();
			case SclPackage.PROCESS__PARENT_PROCESS:
				return getParentProcess();
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
			case SclPackage.PROCESS__TYPE:
				setType((String)newValue);
				return;
			case SclPackage.PROCESS__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends Line>)newValue);
				return;
			case SclPackage.PROCESS__SCL:
				setSCL((SCL)newValue);
				return;
			case SclPackage.PROCESS__CONDUCTING_EQUIPMENT:
				getConductingEquipment().clear();
				getConductingEquipment().addAll((Collection<? extends ConductingEquipment>)newValue);
				return;
			case SclPackage.PROCESS__SUBSTATION:
				getSubstation().clear();
				getSubstation().addAll((Collection<? extends Substation>)newValue);
				return;
			case SclPackage.PROCESS__SUB_PROCESSES:
				getSubProcesses().clear();
				getSubProcesses().addAll((Collection<? extends fr.centralesupelec.edf.riseclipse.iec61850.scl.Process>)newValue);
				return;
			case SclPackage.PROCESS__PARENT_PROCESS:
				setParentProcess((fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)newValue);
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
			case SclPackage.PROCESS__TYPE:
				unsetType();
				return;
			case SclPackage.PROCESS__LINE:
				unsetLine();
				return;
			case SclPackage.PROCESS__SCL:
				setSCL((SCL)null);
				return;
			case SclPackage.PROCESS__CONDUCTING_EQUIPMENT:
				unsetConductingEquipment();
				return;
			case SclPackage.PROCESS__SUBSTATION:
				unsetSubstation();
				return;
			case SclPackage.PROCESS__SUB_PROCESSES:
				unsetSubProcesses();
				return;
			case SclPackage.PROCESS__PARENT_PROCESS:
				setParentProcess((fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)null);
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
			case SclPackage.PROCESS__TYPE:
				return isSetType();
			case SclPackage.PROCESS__LINE:
				return isSetLine();
			case SclPackage.PROCESS__SCL:
				return getSCL() != null;
			case SclPackage.PROCESS__CONDUCTING_EQUIPMENT:
				return isSetConductingEquipment();
			case SclPackage.PROCESS__SUBSTATION:
				return isSetSubstation();
			case SclPackage.PROCESS__SUB_PROCESSES:
				return isSetSubProcesses();
			case SclPackage.PROCESS__PARENT_PROCESS:
				return getParentProcess() != null;
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
			case SclPackage.PROCESS___VALIDATE_PROCESS_TYPE_VALID__DIAGNOSTICCHAIN_MAP:
				return validateProcess_type_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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

} //ProcessImpl
