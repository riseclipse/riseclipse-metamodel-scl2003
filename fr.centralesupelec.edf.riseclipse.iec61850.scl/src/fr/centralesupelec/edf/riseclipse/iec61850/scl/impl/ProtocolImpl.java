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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProtocolImpl#getMustUnderstand <em>Must Understand</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProtocolImpl#getControlWithIEDName <em>Control With IED Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolImpl extends SclObjectImpl implements Protocol {
    /**
	 * The default value of the '{@link #getMustUnderstand() <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMustUnderstand()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean MUST_UNDERSTAND_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getMustUnderstand() <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMustUnderstand()
	 * @generated
	 * @ordered
	 */
    protected Boolean mustUnderstand = MUST_UNDERSTAND_EDEFAULT;

    /**
	 * This is true if the Must Understand attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean mustUnderstandESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ProtocolImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getProtocol();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getMustUnderstand() {
		return mustUnderstand;
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMustUnderstand( Boolean newMustUnderstand ) {
		Boolean oldMustUnderstand = mustUnderstand;
		mustUnderstand = newMustUnderstand;
		boolean oldMustUnderstandESet = mustUnderstandESet;
		mustUnderstandESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.PROTOCOL__MUST_UNDERSTAND, oldMustUnderstand, mustUnderstand, !oldMustUnderstandESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetMustUnderstand() {
		Boolean oldMustUnderstand = mustUnderstand;
		boolean oldMustUnderstandESet = mustUnderstandESet;
		mustUnderstand = MUST_UNDERSTAND_EDEFAULT;
		mustUnderstandESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.PROTOCOL__MUST_UNDERSTAND, oldMustUnderstand, MUST_UNDERSTAND_EDEFAULT, oldMustUnderstandESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetMustUnderstand() {
		return mustUnderstandESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ControlWithIEDName getControlWithIEDName() {
		if (eContainerFeatureID() != SclPackage.PROTOCOL__CONTROL_WITH_IED_NAME) return null;
		return (ControlWithIEDName)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetControlWithIEDName( ControlWithIEDName newControlWithIEDName,
            NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newControlWithIEDName, SclPackage.PROTOCOL__CONTROL_WITH_IED_NAME, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setControlWithIEDName( ControlWithIEDName newControlWithIEDName ) {
		if (newControlWithIEDName != eInternalContainer() || (eContainerFeatureID() != SclPackage.PROTOCOL__CONTROL_WITH_IED_NAME && newControlWithIEDName != null)) {
			if (EcoreUtil.isAncestor(this, newControlWithIEDName))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newControlWithIEDName != null)
				msgs = ((InternalEObject)newControlWithIEDName).eInverseAdd(this, SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL, ControlWithIEDName.class, msgs);
			msgs = basicSetControlWithIEDName(newControlWithIEDName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.PROTOCOL__CONTROL_WITH_IED_NAME, newControlWithIEDName, newControlWithIEDName));
	}

    /**
	 * The cached validation expression for the '{@link #validateVoltage_mustUnderstand_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Voltage must Understand required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVoltage_mustUnderstand_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VOLTAGE_MUST_UNDERSTAND_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'mustUnderstand attribute shall be present in Protocol (line ' + self.lineNumber.toString() + ')' ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.mustUnderstand <> null\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltage_mustUnderstand_required(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getProtocol(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getProtocol__ValidateVoltage_mustUnderstand_required__DiagnosticChain_Map(),
				 VALIDATE_VOLTAGE_MUST_UNDERSTAND_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.PROTOCOL__VALIDATE_VOLTAGE_MUST_UNDERSTAND_REQUIRED);
	}

				/**
	 * The cached validation expression for the '{@link #validateVoltage_mustUnderstand_value_fixed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Voltage must Understand value fixed</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVoltage_mustUnderstand_value_fixed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VOLTAGE_MUST_UNDERSTAND_VALUE_FIXED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'mustUnderstand attribute shall be V in Protocol (line ' + self.lineNumber.toString() + '). '\n" +
		"          + 'Current value is ' + self.mustUnderstand.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.mustUnderstand <> null implies self.mustUnderstand = true\n" +
		"\n" +
		"\n" +
		"\n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltage_mustUnderstand_value_fixed(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getProtocol(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getProtocol__ValidateVoltage_mustUnderstand_value_fixed__DiagnosticChain_Map(),
				 VALIDATE_VOLTAGE_MUST_UNDERSTAND_VALUE_FIXED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.PROTOCOL__VALIDATE_VOLTAGE_MUST_UNDERSTAND_VALUE_FIXED);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.PROTOCOL__CONTROL_WITH_IED_NAME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetControlWithIEDName((ControlWithIEDName)otherEnd, msgs);
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
			case SclPackage.PROTOCOL__CONTROL_WITH_IED_NAME:
				return basicSetControlWithIEDName(null, msgs);
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
			case SclPackage.PROTOCOL__CONTROL_WITH_IED_NAME:
				return eInternalContainer().eInverseRemove(this, SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL, ControlWithIEDName.class, msgs);
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
			case SclPackage.PROTOCOL__MUST_UNDERSTAND:
				return getMustUnderstand();
			case SclPackage.PROTOCOL__CONTROL_WITH_IED_NAME:
				return getControlWithIEDName();
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
			case SclPackage.PROTOCOL__MUST_UNDERSTAND:
				setMustUnderstand((Boolean)newValue);
				return;
			case SclPackage.PROTOCOL__CONTROL_WITH_IED_NAME:
				setControlWithIEDName((ControlWithIEDName)newValue);
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
			case SclPackage.PROTOCOL__MUST_UNDERSTAND:
				unsetMustUnderstand();
				return;
			case SclPackage.PROTOCOL__CONTROL_WITH_IED_NAME:
				setControlWithIEDName((ControlWithIEDName)null);
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
			case SclPackage.PROTOCOL__MUST_UNDERSTAND:
				return isSetMustUnderstand();
			case SclPackage.PROTOCOL__CONTROL_WITH_IED_NAME:
				return getControlWithIEDName() != null;
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
			case SclPackage.PROTOCOL___VALIDATE_VOLTAGE_MUST_UNDERSTAND_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateVoltage_mustUnderstand_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.PROTOCOL___VALIDATE_VOLTAGE_MUST_UNDERSTAND_VALUE_FIXED__DIAGNOSTICCHAIN_MAP:
				return validateVoltage_mustUnderstand_value_fixed((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (mustUnderstand: ");
		if (mustUnderstandESet) result.append(mustUnderstand); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProtocolImpl
