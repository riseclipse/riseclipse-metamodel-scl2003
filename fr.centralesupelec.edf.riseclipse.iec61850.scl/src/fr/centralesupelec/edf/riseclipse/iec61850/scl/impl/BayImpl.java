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
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.utilities.ValueUtil;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BayImpl#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BayImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BayImpl#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BayImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BayImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BayImpl extends EquipmentContainerImpl implements Bay {
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
	 * The cached value of the '{@link #getConnectivityNode() <em>Connectivity Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConnectivityNode()
	 * @generated
	 * @ordered
	 */
    protected EList<ConnectivityNode> connectivityNode;

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
	 * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConductingEquipment()
	 * @generated
	 * @ordered
	 */
    protected EList<ConductingEquipment> conductingEquipment;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected BayImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getBay();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public VoltageLevel getVoltageLevel() {
		if (eContainerFeatureID() != SclPackage.BAY__VOLTAGE_LEVEL) return null;
		return (VoltageLevel)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetVoltageLevel( VoltageLevel newVoltageLevel, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newVoltageLevel, SclPackage.BAY__VOLTAGE_LEVEL, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setVoltageLevel( VoltageLevel newVoltageLevel ) {
		if (newVoltageLevel != eInternalContainer() || (eContainerFeatureID() != SclPackage.BAY__VOLTAGE_LEVEL && newVoltageLevel != null)) {
			if (EcoreUtil.isAncestor(this, newVoltageLevel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVoltageLevel != null)
				msgs = ((InternalEObject)newVoltageLevel).eInverseAdd(this, SclPackage.VOLTAGE_LEVEL__BAY, VoltageLevel.class, msgs);
			msgs = basicSetVoltageLevel(newVoltageLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.BAY__VOLTAGE_LEVEL, newVoltageLevel, newVoltageLevel));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Function> getFunction() {
		if (function == null) {
			function = new EObjectContainmentWithInverseEList.Unsettable<Function>(Function.class, this, SclPackage.BAY__FUNCTION, SclPackage.FUNCTION__BAY);
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
    public EList<ConnectivityNode> getConnectivityNode() {
		if (connectivityNode == null) {
			connectivityNode = new EObjectContainmentWithInverseEList.Unsettable<ConnectivityNode>(ConnectivityNode.class, this, SclPackage.BAY__CONNECTIVITY_NODE, SclPackage.CONNECTIVITY_NODE__BAY);
		}
		return connectivityNode;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetConnectivityNode() {
		if (connectivityNode != null) ((InternalEList.Unsettable<?>)connectivityNode).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetConnectivityNode() {
		return connectivityNode != null && ((InternalEList.Unsettable<?>)connectivityNode).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Terminal> getTerminal() {
		if (terminal == null) {
			terminal = new EObjectWithInverseEList.Unsettable<Terminal>(Terminal.class, this, SclPackage.BAY__TERMINAL, SclPackage.TERMINAL__BAY);
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
    public EList<ConductingEquipment> getConductingEquipment() {
		if (conductingEquipment == null) {
			conductingEquipment = new EObjectContainmentWithInverseEList.Unsettable<ConductingEquipment>(ConductingEquipment.class, this, SclPackage.BAY__CONDUCTING_EQUIPMENT, SclPackage.CONDUCTING_EQUIPMENT__BAY);
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
	public boolean validateBay_nothing(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv Bay_nothing: true
		 */
		return ValueUtil.TRUE_VALUE;
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
			case SclPackage.BAY__VOLTAGE_LEVEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVoltageLevel((VoltageLevel)otherEnd, msgs);
			case SclPackage.BAY__FUNCTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFunction()).basicAdd(otherEnd, msgs);
			case SclPackage.BAY__CONNECTIVITY_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectivityNode()).basicAdd(otherEnd, msgs);
			case SclPackage.BAY__TERMINAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerminal()).basicAdd(otherEnd, msgs);
			case SclPackage.BAY__CONDUCTING_EQUIPMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConductingEquipment()).basicAdd(otherEnd, msgs);
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
			case SclPackage.BAY__VOLTAGE_LEVEL:
				return basicSetVoltageLevel(null, msgs);
			case SclPackage.BAY__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
			case SclPackage.BAY__CONNECTIVITY_NODE:
				return ((InternalEList<?>)getConnectivityNode()).basicRemove(otherEnd, msgs);
			case SclPackage.BAY__TERMINAL:
				return ((InternalEList<?>)getTerminal()).basicRemove(otherEnd, msgs);
			case SclPackage.BAY__CONDUCTING_EQUIPMENT:
				return ((InternalEList<?>)getConductingEquipment()).basicRemove(otherEnd, msgs);
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
			case SclPackage.BAY__VOLTAGE_LEVEL:
				return eInternalContainer().eInverseRemove(this, SclPackage.VOLTAGE_LEVEL__BAY, VoltageLevel.class, msgs);
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
			case SclPackage.BAY__VOLTAGE_LEVEL:
				return getVoltageLevel();
			case SclPackage.BAY__FUNCTION:
				return getFunction();
			case SclPackage.BAY__CONNECTIVITY_NODE:
				return getConnectivityNode();
			case SclPackage.BAY__TERMINAL:
				return getTerminal();
			case SclPackage.BAY__CONDUCTING_EQUIPMENT:
				return getConductingEquipment();
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
			case SclPackage.BAY__VOLTAGE_LEVEL:
				setVoltageLevel((VoltageLevel)newValue);
				return;
			case SclPackage.BAY__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends Function>)newValue);
				return;
			case SclPackage.BAY__CONNECTIVITY_NODE:
				getConnectivityNode().clear();
				getConnectivityNode().addAll((Collection<? extends ConnectivityNode>)newValue);
				return;
			case SclPackage.BAY__TERMINAL:
				getTerminal().clear();
				getTerminal().addAll((Collection<? extends Terminal>)newValue);
				return;
			case SclPackage.BAY__CONDUCTING_EQUIPMENT:
				getConductingEquipment().clear();
				getConductingEquipment().addAll((Collection<? extends ConductingEquipment>)newValue);
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
			case SclPackage.BAY__VOLTAGE_LEVEL:
				setVoltageLevel((VoltageLevel)null);
				return;
			case SclPackage.BAY__FUNCTION:
				unsetFunction();
				return;
			case SclPackage.BAY__CONNECTIVITY_NODE:
				unsetConnectivityNode();
				return;
			case SclPackage.BAY__TERMINAL:
				unsetTerminal();
				return;
			case SclPackage.BAY__CONDUCTING_EQUIPMENT:
				unsetConductingEquipment();
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
			case SclPackage.BAY__VOLTAGE_LEVEL:
				return getVoltageLevel() != null;
			case SclPackage.BAY__FUNCTION:
				return isSetFunction();
			case SclPackage.BAY__CONNECTIVITY_NODE:
				return isSetConnectivityNode();
			case SclPackage.BAY__TERMINAL:
				return isSetTerminal();
			case SclPackage.BAY__CONDUCTING_EQUIPMENT:
				return isSetConductingEquipment();
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
			case SclPackage.BAY___VALIDATE_BAY_NOTHING__DIAGNOSTICCHAIN_MAP:
				return validateBay_nothing((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BayImpl
