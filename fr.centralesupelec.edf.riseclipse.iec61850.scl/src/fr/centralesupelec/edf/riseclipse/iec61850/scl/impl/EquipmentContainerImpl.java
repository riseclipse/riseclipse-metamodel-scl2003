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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equipment Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EquipmentContainerImpl#getPowerTransformer <em>Power Transformer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EquipmentContainerImpl#getGeneralEquipment <em>General Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquipmentContainerImpl extends PowerSystemResourceImpl implements EquipmentContainer {
    /**
	 * The cached value of the '{@link #getPowerTransformer() <em>Power Transformer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPowerTransformer()
	 * @generated
	 * @ordered
	 */
    protected EList<PowerTransformer> powerTransformer;

    /**
	 * The cached value of the '{@link #getGeneralEquipment() <em>General Equipment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getGeneralEquipment()
	 * @generated
	 * @ordered
	 */
    protected EList<GeneralEquipment> generalEquipment;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected EquipmentContainerImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getEquipmentContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<PowerTransformer> getPowerTransformer() {
		if (powerTransformer == null) {
			powerTransformer = new EObjectContainmentWithInverseEList.Unsettable<PowerTransformer>(PowerTransformer.class, this, SclPackage.EQUIPMENT_CONTAINER__POWER_TRANSFORMER, SclPackage.POWER_TRANSFORMER__EQUIPMENT_CONTAINER);
		}
		return powerTransformer;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetPowerTransformer() {
		if (powerTransformer != null) ((InternalEList.Unsettable<?>)powerTransformer).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetPowerTransformer() {
		return powerTransformer != null && ((InternalEList.Unsettable<?>)powerTransformer).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<GeneralEquipment> getGeneralEquipment() {
		if (generalEquipment == null) {
			generalEquipment = new EObjectContainmentWithInverseEList.Unsettable<GeneralEquipment>(GeneralEquipment.class, this, SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT, SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER);
		}
		return generalEquipment;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetGeneralEquipment() {
		if (generalEquipment != null) ((InternalEList.Unsettable<?>)generalEquipment).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetGeneralEquipment() {
		return generalEquipment != null && ((InternalEList.Unsettable<?>)generalEquipment).isSet();
	}

    /**
	 * The cached validation expression for the '{@link #validateEquipmentContainer_nothing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Equipment Container nothing</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEquipmentContainer_nothing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EQUIPMENT_CONTAINER_NOTHING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"        true\n" +
		"\n" +
		"\n" +
		"";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquipmentContainer_nothing(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getEquipmentContainer(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getEquipmentContainer__ValidateEquipmentContainer_nothing__DiagnosticChain_Map(),
				 VALIDATE_EQUIPMENT_CONTAINER_NOTHING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.EQUIPMENT_CONTAINER__VALIDATE_EQUIPMENT_CONTAINER_NOTHING);
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
			case SclPackage.EQUIPMENT_CONTAINER__POWER_TRANSFORMER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerTransformer()).basicAdd(otherEnd, msgs);
			case SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralEquipment()).basicAdd(otherEnd, msgs);
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
			case SclPackage.EQUIPMENT_CONTAINER__POWER_TRANSFORMER:
				return ((InternalEList<?>)getPowerTransformer()).basicRemove(otherEnd, msgs);
			case SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
				return ((InternalEList<?>)getGeneralEquipment()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
		switch (featureID) {
			case SclPackage.EQUIPMENT_CONTAINER__POWER_TRANSFORMER:
				return getPowerTransformer();
			case SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
				return getGeneralEquipment();
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
			case SclPackage.EQUIPMENT_CONTAINER__POWER_TRANSFORMER:
				getPowerTransformer().clear();
				getPowerTransformer().addAll((Collection<? extends PowerTransformer>)newValue);
				return;
			case SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
				getGeneralEquipment().clear();
				getGeneralEquipment().addAll((Collection<? extends GeneralEquipment>)newValue);
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
			case SclPackage.EQUIPMENT_CONTAINER__POWER_TRANSFORMER:
				unsetPowerTransformer();
				return;
			case SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
				unsetGeneralEquipment();
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
			case SclPackage.EQUIPMENT_CONTAINER__POWER_TRANSFORMER:
				return isSetPowerTransformer();
			case SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
				return isSetGeneralEquipment();
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
			case SclPackage.EQUIPMENT_CONTAINER___VALIDATE_EQUIPMENT_CONTAINER_NOTHING__DIAGNOSTICCHAIN_MAP:
				return validateEquipmentContainer_nothing((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EquipmentContainerImpl
