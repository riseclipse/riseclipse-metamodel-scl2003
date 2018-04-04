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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PowerTransformerImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PowerTransformerImpl#getEqFunction <em>Eq Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PowerTransformerImpl#getEquipmentContainer <em>Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PowerTransformerImpl#getSubEquipment <em>Sub Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PowerTransformerImpl#getTransformerWinding <em>Transformer Winding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerTransformerImpl extends EquipmentImpl implements PowerTransformer {
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
	 * The cached value of the '{@link #getSubEquipment() <em>Sub Equipment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSubEquipment()
	 * @generated
	 * @ordered
	 */
    protected EList<SubEquipment> subEquipment;

    /**
	 * The cached value of the '{@link #getTransformerWinding() <em>Transformer Winding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTransformerWinding()
	 * @generated
	 * @ordered
	 */
    protected EList<TransformerWinding> transformerWinding;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected PowerTransformerImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getPowerTransformer();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.POWER_TRANSFORMER__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.POWER_TRANSFORMER__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			eqFunction = new EObjectContainmentWithInverseEList.Unsettable<EqFunction>(EqFunction.class, this, SclPackage.POWER_TRANSFORMER__EQ_FUNCTION, SclPackage.EQ_FUNCTION__POWER_TRANSFORMER);
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
    public EquipmentContainer getEquipmentContainer() {
		if (eContainerFeatureID() != SclPackage.POWER_TRANSFORMER__EQUIPMENT_CONTAINER) return null;
		return (EquipmentContainer)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetEquipmentContainer( EquipmentContainer newEquipmentContainer,
            NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newEquipmentContainer, SclPackage.POWER_TRANSFORMER__EQUIPMENT_CONTAINER, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setEquipmentContainer( EquipmentContainer newEquipmentContainer ) {
		if (newEquipmentContainer != eInternalContainer() || (eContainerFeatureID() != SclPackage.POWER_TRANSFORMER__EQUIPMENT_CONTAINER && newEquipmentContainer != null)) {
			if (EcoreUtil.isAncestor(this, newEquipmentContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEquipmentContainer != null)
				msgs = ((InternalEObject)newEquipmentContainer).eInverseAdd(this, SclPackage.EQUIPMENT_CONTAINER__POWER_TRANSFORMER, EquipmentContainer.class, msgs);
			msgs = basicSetEquipmentContainer(newEquipmentContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.POWER_TRANSFORMER__EQUIPMENT_CONTAINER, newEquipmentContainer, newEquipmentContainer));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<SubEquipment> getSubEquipment() {
		if (subEquipment == null) {
			subEquipment = new EObjectContainmentWithInverseEList.Unsettable<SubEquipment>(SubEquipment.class, this, SclPackage.POWER_TRANSFORMER__SUB_EQUIPMENT, SclPackage.SUB_EQUIPMENT__POWER_TRANSFORMER);
		}
		return subEquipment;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSubEquipment() {
		if (subEquipment != null) ((InternalEList.Unsettable<?>)subEquipment).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSubEquipment() {
		return subEquipment != null && ((InternalEList.Unsettable<?>)subEquipment).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<TransformerWinding> getTransformerWinding() {
		if (transformerWinding == null) {
			transformerWinding = new EObjectContainmentWithInverseEList.Unsettable<TransformerWinding>(TransformerWinding.class, this, SclPackage.POWER_TRANSFORMER__TRANSFORMER_WINDING, SclPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER);
		}
		return transformerWinding;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetTransformerWinding() {
		if (transformerWinding != null) ((InternalEList.Unsettable<?>)transformerWinding).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetTransformerWinding() {
		return transformerWinding != null && ((InternalEList.Unsettable<?>)transformerWinding).isSet();
	}

    /**
	 * The cached validation expression for the '{@link #validatePowerTransformer_type_value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Power Transformer type value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePowerTransformer_type_value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POWER_TRANSFORMER_TYPE_VALUE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'type attribute shall be PTR in PowerTransformer (line ' + self.lineNumber.toString() + '). '\n" +
		"          + 'Current value is ' + self.type.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.type <> null implies self.type = 'PTR'\n" +
		"\n" +
		"\n" +
		"\n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerTransformer_type_value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getPowerTransformer(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getPowerTransformer__ValidatePowerTransformer_type_value__DiagnosticChain_Map(),
				 VALIDATE_POWER_TRANSFORMER_TYPE_VALUE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.POWER_TRANSFORMER__VALIDATE_POWER_TRANSFORMER_TYPE_VALUE);
	}

				/**
	 * The cached validation expression for the '{@link #validatePowerTransformer_at_least_one_TransformerWinding_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Power Transformer at least one Transformer Winding required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePowerTransformer_at_least_one_TransformerWinding_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POWER_TRANSFORMER_AT_LEAST_ONE_TRANSFORMER_WINDING_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'PowerTransformer shall contain at least one TransformerWinding (line ' + self.lineNumber.toString() + ')' ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.TransformerWinding->notEmpty()\n" +
		"\n" +
		"\n" +
		"\n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerTransformer_at_least_one_TransformerWinding_required(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getPowerTransformer(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getPowerTransformer__ValidatePowerTransformer_at_least_one_TransformerWinding_required__DiagnosticChain_Map(),
				 VALIDATE_POWER_TRANSFORMER_AT_LEAST_ONE_TRANSFORMER_WINDING_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.POWER_TRANSFORMER__VALIDATE_POWER_TRANSFORMER_AT_LEAST_ONE_TRANSFORMER_WINDING_REQUIRED);
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
			case SclPackage.POWER_TRANSFORMER__EQ_FUNCTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEqFunction()).basicAdd(otherEnd, msgs);
			case SclPackage.POWER_TRANSFORMER__EQUIPMENT_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEquipmentContainer((EquipmentContainer)otherEnd, msgs);
			case SclPackage.POWER_TRANSFORMER__SUB_EQUIPMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubEquipment()).basicAdd(otherEnd, msgs);
			case SclPackage.POWER_TRANSFORMER__TRANSFORMER_WINDING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerWinding()).basicAdd(otherEnd, msgs);
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
			case SclPackage.POWER_TRANSFORMER__EQ_FUNCTION:
				return ((InternalEList<?>)getEqFunction()).basicRemove(otherEnd, msgs);
			case SclPackage.POWER_TRANSFORMER__EQUIPMENT_CONTAINER:
				return basicSetEquipmentContainer(null, msgs);
			case SclPackage.POWER_TRANSFORMER__SUB_EQUIPMENT:
				return ((InternalEList<?>)getSubEquipment()).basicRemove(otherEnd, msgs);
			case SclPackage.POWER_TRANSFORMER__TRANSFORMER_WINDING:
				return ((InternalEList<?>)getTransformerWinding()).basicRemove(otherEnd, msgs);
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
			case SclPackage.POWER_TRANSFORMER__EQUIPMENT_CONTAINER:
				return eInternalContainer().eInverseRemove(this, SclPackage.EQUIPMENT_CONTAINER__POWER_TRANSFORMER, EquipmentContainer.class, msgs);
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
			case SclPackage.POWER_TRANSFORMER__TYPE:
				return getType();
			case SclPackage.POWER_TRANSFORMER__EQ_FUNCTION:
				return getEqFunction();
			case SclPackage.POWER_TRANSFORMER__EQUIPMENT_CONTAINER:
				return getEquipmentContainer();
			case SclPackage.POWER_TRANSFORMER__SUB_EQUIPMENT:
				return getSubEquipment();
			case SclPackage.POWER_TRANSFORMER__TRANSFORMER_WINDING:
				return getTransformerWinding();
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
			case SclPackage.POWER_TRANSFORMER__TYPE:
				setType((String)newValue);
				return;
			case SclPackage.POWER_TRANSFORMER__EQ_FUNCTION:
				getEqFunction().clear();
				getEqFunction().addAll((Collection<? extends EqFunction>)newValue);
				return;
			case SclPackage.POWER_TRANSFORMER__EQUIPMENT_CONTAINER:
				setEquipmentContainer((EquipmentContainer)newValue);
				return;
			case SclPackage.POWER_TRANSFORMER__SUB_EQUIPMENT:
				getSubEquipment().clear();
				getSubEquipment().addAll((Collection<? extends SubEquipment>)newValue);
				return;
			case SclPackage.POWER_TRANSFORMER__TRANSFORMER_WINDING:
				getTransformerWinding().clear();
				getTransformerWinding().addAll((Collection<? extends TransformerWinding>)newValue);
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
			case SclPackage.POWER_TRANSFORMER__TYPE:
				unsetType();
				return;
			case SclPackage.POWER_TRANSFORMER__EQ_FUNCTION:
				unsetEqFunction();
				return;
			case SclPackage.POWER_TRANSFORMER__EQUIPMENT_CONTAINER:
				setEquipmentContainer((EquipmentContainer)null);
				return;
			case SclPackage.POWER_TRANSFORMER__SUB_EQUIPMENT:
				unsetSubEquipment();
				return;
			case SclPackage.POWER_TRANSFORMER__TRANSFORMER_WINDING:
				unsetTransformerWinding();
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
			case SclPackage.POWER_TRANSFORMER__TYPE:
				return isSetType();
			case SclPackage.POWER_TRANSFORMER__EQ_FUNCTION:
				return isSetEqFunction();
			case SclPackage.POWER_TRANSFORMER__EQUIPMENT_CONTAINER:
				return getEquipmentContainer() != null;
			case SclPackage.POWER_TRANSFORMER__SUB_EQUIPMENT:
				return isSetSubEquipment();
			case SclPackage.POWER_TRANSFORMER__TRANSFORMER_WINDING:
				return isSetTransformerWinding();
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
			case SclPackage.POWER_TRANSFORMER___VALIDATE_POWER_TRANSFORMER_TYPE_VALUE__DIAGNOSTICCHAIN_MAP:
				return validatePowerTransformer_type_value((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.POWER_TRANSFORMER___VALIDATE_POWER_TRANSFORMER_AT_LEAST_ONE_TRANSFORMER_WINDING_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validatePowerTransformer_at_least_one_TransformerWinding_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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

} //PowerTransformerImpl
