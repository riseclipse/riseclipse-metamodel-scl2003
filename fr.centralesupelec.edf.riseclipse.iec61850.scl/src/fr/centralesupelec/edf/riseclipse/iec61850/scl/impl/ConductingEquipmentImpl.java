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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Line;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConductingEquipmentImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConductingEquipmentImpl#getBay <em>Bay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConductingEquipmentImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConductingEquipmentImpl#getSubFunction <em>Sub Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConductingEquipmentImpl#getEqFunction <em>Eq Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConductingEquipmentImpl#getLine <em>Line</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConductingEquipmentImpl#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConductingEquipmentImpl extends AbstractConductingEquipmentImpl implements ConductingEquipment {
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
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ConductingEquipmentImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getConductingEquipment();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONDUCTING_EQUIPMENT__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONDUCTING_EQUIPMENT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
    public Bay getBay() {
		if (eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__BAY) return null;
		return (Bay)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetBay( Bay newBay, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newBay, SclPackage.CONDUCTING_EQUIPMENT__BAY, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBay( Bay newBay ) {
		if (newBay != eInternalContainer() || (eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__BAY && newBay != null)) {
			if (EcoreUtil.isAncestor(this, newBay))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBay != null)
				msgs = ((InternalEObject)newBay).eInverseAdd(this, SclPackage.BAY__CONDUCTING_EQUIPMENT, Bay.class, msgs);
			msgs = basicSetBay(newBay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONDUCTING_EQUIPMENT__BAY, newBay, newBay));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Function getFunction() {
		if (eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__FUNCTION) return null;
		return (Function)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetFunction( Function newFunction, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newFunction, SclPackage.CONDUCTING_EQUIPMENT__FUNCTION, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFunction( Function newFunction ) {
		if (newFunction != eInternalContainer() || (eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__FUNCTION && newFunction != null)) {
			if (EcoreUtil.isAncestor(this, newFunction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, SclPackage.FUNCTION__CONDUCTING_EQUIPMENT, Function.class, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONDUCTING_EQUIPMENT__FUNCTION, newFunction, newFunction));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SubFunction getSubFunction() {
		if (eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__SUB_FUNCTION) return null;
		return (SubFunction)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSubFunction( SubFunction newSubFunction, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newSubFunction, SclPackage.CONDUCTING_EQUIPMENT__SUB_FUNCTION, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSubFunction( SubFunction newSubFunction ) {
		if (newSubFunction != eInternalContainer() || (eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__SUB_FUNCTION && newSubFunction != null)) {
			if (EcoreUtil.isAncestor(this, newSubFunction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSubFunction != null)
				msgs = ((InternalEObject)newSubFunction).eInverseAdd(this, SclPackage.SUB_FUNCTION__CONDUCTING_EQUIPMENT, SubFunction.class, msgs);
			msgs = basicSetSubFunction(newSubFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONDUCTING_EQUIPMENT__SUB_FUNCTION, newSubFunction, newSubFunction));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<EqFunction> getEqFunction() {
		if (eqFunction == null) {
			eqFunction = new EObjectContainmentWithInverseEList.Unsettable<EqFunction>(EqFunction.class, this, SclPackage.CONDUCTING_EQUIPMENT__EQ_FUNCTION, SclPackage.EQ_FUNCTION__CONDUCTING_EQUIPMENT);
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
    public Line getLine() {
		if (eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__LINE) return null;
		return (Line)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLine( Line newLine, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newLine, SclPackage.CONDUCTING_EQUIPMENT__LINE, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLine( Line newLine ) {
		if (newLine != eInternalContainer() || (eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__LINE && newLine != null)) {
			if (EcoreUtil.isAncestor(this, newLine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLine != null)
				msgs = ((InternalEObject)newLine).eInverseAdd(this, SclPackage.LINE__CONDUCTING_EQUIPMENT, Line.class, msgs);
			msgs = basicSetLine(newLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONDUCTING_EQUIPMENT__LINE, newLine, newLine));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public fr.centralesupelec.edf.riseclipse.iec61850.scl.Process getProcess() {
		if (eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__PROCESS) return null;
		return (fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetProcess( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process newProcess,
            NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newProcess, SclPackage.CONDUCTING_EQUIPMENT__PROCESS, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setProcess( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process newProcess ) {
		if (newProcess != eInternalContainer() || (eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__PROCESS && newProcess != null)) {
			if (EcoreUtil.isAncestor(this, newProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcess != null)
				msgs = ((InternalEObject)newProcess).eInverseAdd(this, SclPackage.PROCESS__CONDUCTING_EQUIPMENT, fr.centralesupelec.edf.riseclipse.iec61850.scl.Process.class, msgs);
			msgs = basicSetProcess(newProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONDUCTING_EQUIPMENT__PROCESS, newProcess, newProcess));
	}

    /**
	 * The cached validation expression for the '{@link #validateConductingEquipment_type_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Conducting Equipment type required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConductingEquipment_type_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDUCTING_EQUIPMENT_TYPE_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'type attribute shall be present in ConductingEquipment (line ' + self.lineNumber.toString() + ')' ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.type <> null\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConductingEquipment_type_required(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getConductingEquipment(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getConductingEquipment__ValidateConductingEquipment_type_required__DiagnosticChain_Map(),
				 VALIDATE_CONDUCTING_EQUIPMENT_TYPE_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.CONDUCTING_EQUIPMENT__VALIDATE_CONDUCTING_EQUIPMENT_TYPE_REQUIRED);
	}

				/**
	 * The cached validation expression for the '{@link #validateConductingEquipment_type_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Conducting Equipment type valid</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConductingEquipment_type_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDUCTING_EQUIPMENT_TYPE_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'type attribute shall be valid in ConductingEquipment (line ' + self.lineNumber.toString() + '). '\n" +
		"          + 'Current value is ' + self.type.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.type <> null implies self.validSclCommonConductingEquipmentEnum( type )\n" +
		"\n" +
		"\n" +
		"\n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConductingEquipment_type_valid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getConductingEquipment(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getConductingEquipment__ValidateConductingEquipment_type_valid__DiagnosticChain_Map(),
				 VALIDATE_CONDUCTING_EQUIPMENT_TYPE_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.CONDUCTING_EQUIPMENT__VALIDATE_CONDUCTING_EQUIPMENT_TYPE_VALID);
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
			case SclPackage.CONDUCTING_EQUIPMENT__BAY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBay((Bay)otherEnd, msgs);
			case SclPackage.CONDUCTING_EQUIPMENT__FUNCTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFunction((Function)otherEnd, msgs);
			case SclPackage.CONDUCTING_EQUIPMENT__SUB_FUNCTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSubFunction((SubFunction)otherEnd, msgs);
			case SclPackage.CONDUCTING_EQUIPMENT__EQ_FUNCTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEqFunction()).basicAdd(otherEnd, msgs);
			case SclPackage.CONDUCTING_EQUIPMENT__LINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLine((Line)otherEnd, msgs);
			case SclPackage.CONDUCTING_EQUIPMENT__PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProcess((fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)otherEnd, msgs);
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
			case SclPackage.CONDUCTING_EQUIPMENT__BAY:
				return basicSetBay(null, msgs);
			case SclPackage.CONDUCTING_EQUIPMENT__FUNCTION:
				return basicSetFunction(null, msgs);
			case SclPackage.CONDUCTING_EQUIPMENT__SUB_FUNCTION:
				return basicSetSubFunction(null, msgs);
			case SclPackage.CONDUCTING_EQUIPMENT__EQ_FUNCTION:
				return ((InternalEList<?>)getEqFunction()).basicRemove(otherEnd, msgs);
			case SclPackage.CONDUCTING_EQUIPMENT__LINE:
				return basicSetLine(null, msgs);
			case SclPackage.CONDUCTING_EQUIPMENT__PROCESS:
				return basicSetProcess(null, msgs);
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
			case SclPackage.CONDUCTING_EQUIPMENT__BAY:
				return eInternalContainer().eInverseRemove(this, SclPackage.BAY__CONDUCTING_EQUIPMENT, Bay.class, msgs);
			case SclPackage.CONDUCTING_EQUIPMENT__FUNCTION:
				return eInternalContainer().eInverseRemove(this, SclPackage.FUNCTION__CONDUCTING_EQUIPMENT, Function.class, msgs);
			case SclPackage.CONDUCTING_EQUIPMENT__SUB_FUNCTION:
				return eInternalContainer().eInverseRemove(this, SclPackage.SUB_FUNCTION__CONDUCTING_EQUIPMENT, SubFunction.class, msgs);
			case SclPackage.CONDUCTING_EQUIPMENT__LINE:
				return eInternalContainer().eInverseRemove(this, SclPackage.LINE__CONDUCTING_EQUIPMENT, Line.class, msgs);
			case SclPackage.CONDUCTING_EQUIPMENT__PROCESS:
				return eInternalContainer().eInverseRemove(this, SclPackage.PROCESS__CONDUCTING_EQUIPMENT, fr.centralesupelec.edf.riseclipse.iec61850.scl.Process.class, msgs);
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
			case SclPackage.CONDUCTING_EQUIPMENT__TYPE:
				return getType();
			case SclPackage.CONDUCTING_EQUIPMENT__BAY:
				return getBay();
			case SclPackage.CONDUCTING_EQUIPMENT__FUNCTION:
				return getFunction();
			case SclPackage.CONDUCTING_EQUIPMENT__SUB_FUNCTION:
				return getSubFunction();
			case SclPackage.CONDUCTING_EQUIPMENT__EQ_FUNCTION:
				return getEqFunction();
			case SclPackage.CONDUCTING_EQUIPMENT__LINE:
				return getLine();
			case SclPackage.CONDUCTING_EQUIPMENT__PROCESS:
				return getProcess();
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
			case SclPackage.CONDUCTING_EQUIPMENT__TYPE:
				setType((String)newValue);
				return;
			case SclPackage.CONDUCTING_EQUIPMENT__BAY:
				setBay((Bay)newValue);
				return;
			case SclPackage.CONDUCTING_EQUIPMENT__FUNCTION:
				setFunction((Function)newValue);
				return;
			case SclPackage.CONDUCTING_EQUIPMENT__SUB_FUNCTION:
				setSubFunction((SubFunction)newValue);
				return;
			case SclPackage.CONDUCTING_EQUIPMENT__EQ_FUNCTION:
				getEqFunction().clear();
				getEqFunction().addAll((Collection<? extends EqFunction>)newValue);
				return;
			case SclPackage.CONDUCTING_EQUIPMENT__LINE:
				setLine((Line)newValue);
				return;
			case SclPackage.CONDUCTING_EQUIPMENT__PROCESS:
				setProcess((fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)newValue);
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
			case SclPackage.CONDUCTING_EQUIPMENT__TYPE:
				unsetType();
				return;
			case SclPackage.CONDUCTING_EQUIPMENT__BAY:
				setBay((Bay)null);
				return;
			case SclPackage.CONDUCTING_EQUIPMENT__FUNCTION:
				setFunction((Function)null);
				return;
			case SclPackage.CONDUCTING_EQUIPMENT__SUB_FUNCTION:
				setSubFunction((SubFunction)null);
				return;
			case SclPackage.CONDUCTING_EQUIPMENT__EQ_FUNCTION:
				unsetEqFunction();
				return;
			case SclPackage.CONDUCTING_EQUIPMENT__LINE:
				setLine((Line)null);
				return;
			case SclPackage.CONDUCTING_EQUIPMENT__PROCESS:
				setProcess((fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)null);
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
			case SclPackage.CONDUCTING_EQUIPMENT__TYPE:
				return isSetType();
			case SclPackage.CONDUCTING_EQUIPMENT__BAY:
				return getBay() != null;
			case SclPackage.CONDUCTING_EQUIPMENT__FUNCTION:
				return getFunction() != null;
			case SclPackage.CONDUCTING_EQUIPMENT__SUB_FUNCTION:
				return getSubFunction() != null;
			case SclPackage.CONDUCTING_EQUIPMENT__EQ_FUNCTION:
				return isSetEqFunction();
			case SclPackage.CONDUCTING_EQUIPMENT__LINE:
				return getLine() != null;
			case SclPackage.CONDUCTING_EQUIPMENT__PROCESS:
				return getProcess() != null;
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
			case SclPackage.CONDUCTING_EQUIPMENT___VALIDATE_CONDUCTING_EQUIPMENT_TYPE_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateConductingEquipment_type_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CONDUCTING_EQUIPMENT___VALIDATE_CONDUCTING_EQUIPMENT_TYPE_VALID__DIAGNOSTICCHAIN_MAP:
				return validateConductingEquipment_type_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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

} //ConductingEquipmentImpl
