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

import java.math.BigDecimal;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voltage Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageLevelImpl#getNomFreq <em>Nom Freq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageLevelImpl#getNumPhases <em>Num Phases</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageLevelImpl#getBay <em>Bay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageLevelImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageLevelImpl#getSubstation <em>Substation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageLevelImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageLevelImpl#getTerminal <em>Terminal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VoltageLevelImpl extends EquipmentContainerImpl implements VoltageLevel {
    /**
	 * The default value of the '{@link #getNomFreq() <em>Nom Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNomFreq()
	 * @generated
	 * @ordered
	 */
    protected static final BigDecimal NOM_FREQ_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getNomFreq() <em>Nom Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNomFreq()
	 * @generated
	 * @ordered
	 */
    protected BigDecimal nomFreq = NOM_FREQ_EDEFAULT;

    /**
	 * This is true if the Nom Freq attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean nomFreqESet;

    /**
	 * The default value of the '{@link #getNumPhases() <em>Num Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNumPhases()
	 * @generated
	 * @ordered
	 */
    protected static final Byte NUM_PHASES_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getNumPhases() <em>Num Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNumPhases()
	 * @generated
	 * @ordered
	 */
    protected Byte numPhases = NUM_PHASES_EDEFAULT;

    /**
	 * This is true if the Num Phases attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean numPhasesESet;

    /**
	 * The cached value of the '{@link #getBay() <em>Bay</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBay()
	 * @generated
	 * @ordered
	 */
    protected EList<Bay> bay;

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
	 * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
    protected Voltage voltage;

    /**
	 * This is true if the Voltage containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean voltageESet;

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
    protected VoltageLevelImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getVoltageLevel();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BigDecimal getNomFreq() {
		return nomFreq;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNomFreq( BigDecimal newNomFreq ) {
		BigDecimal oldNomFreq = nomFreq;
		nomFreq = newNomFreq;
		boolean oldNomFreqESet = nomFreqESet;
		nomFreqESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.VOLTAGE_LEVEL__NOM_FREQ, oldNomFreq, nomFreq, !oldNomFreqESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetNomFreq() {
		BigDecimal oldNomFreq = nomFreq;
		boolean oldNomFreqESet = nomFreqESet;
		nomFreq = NOM_FREQ_EDEFAULT;
		nomFreqESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.VOLTAGE_LEVEL__NOM_FREQ, oldNomFreq, NOM_FREQ_EDEFAULT, oldNomFreqESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetNomFreq() {
		return nomFreqESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Byte getNumPhases() {
		return numPhases;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNumPhases( Byte newNumPhases ) {
		Byte oldNumPhases = numPhases;
		numPhases = newNumPhases;
		boolean oldNumPhasesESet = numPhasesESet;
		numPhasesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.VOLTAGE_LEVEL__NUM_PHASES, oldNumPhases, numPhases, !oldNumPhasesESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetNumPhases() {
		Byte oldNumPhases = numPhases;
		boolean oldNumPhasesESet = numPhasesESet;
		numPhases = NUM_PHASES_EDEFAULT;
		numPhasesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.VOLTAGE_LEVEL__NUM_PHASES, oldNumPhases, NUM_PHASES_EDEFAULT, oldNumPhasesESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetNumPhases() {
		return numPhasesESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Bay> getBay() {
		if (bay == null) {
			bay = new EObjectContainmentWithInverseEList.Unsettable<Bay>(Bay.class, this, SclPackage.VOLTAGE_LEVEL__BAY, SclPackage.BAY__VOLTAGE_LEVEL);
		}
		return bay;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetBay() {
		if (bay != null) ((InternalEList.Unsettable<?>)bay).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetBay() {
		return bay != null && ((InternalEList.Unsettable<?>)bay).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Function> getFunction() {
		if (function == null) {
			function = new EObjectContainmentWithInverseEList.Unsettable<Function>(Function.class, this, SclPackage.VOLTAGE_LEVEL__FUNCTION, SclPackage.FUNCTION__VOLTAGE_LEVEL);
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
    public Substation getSubstation() {
		if (eContainerFeatureID() != SclPackage.VOLTAGE_LEVEL__SUBSTATION) return null;
		return (Substation)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSubstation( Substation newSubstation, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newSubstation, SclPackage.VOLTAGE_LEVEL__SUBSTATION, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSubstation( Substation newSubstation ) {
		if (newSubstation != eInternalContainer() || (eContainerFeatureID() != SclPackage.VOLTAGE_LEVEL__SUBSTATION && newSubstation != null)) {
			if (EcoreUtil.isAncestor(this, newSubstation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSubstation != null)
				msgs = ((InternalEObject)newSubstation).eInverseAdd(this, SclPackage.SUBSTATION__VOLTAGE_LEVEL, Substation.class, msgs);
			msgs = basicSetSubstation(newSubstation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.VOLTAGE_LEVEL__SUBSTATION, newSubstation, newSubstation));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Voltage getVoltage() {
		return voltage;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetVoltage( Voltage newVoltage, NotificationChain msgs ) {
		Voltage oldVoltage = voltage;
		voltage = newVoltage;
		boolean oldVoltageESet = voltageESet;
		voltageESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.VOLTAGE_LEVEL__VOLTAGE, oldVoltage, newVoltage, !oldVoltageESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setVoltage( Voltage newVoltage ) {
		if (newVoltage != voltage) {
			NotificationChain msgs = null;
			if (voltage != null)
				msgs = ((InternalEObject)voltage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.VOLTAGE_LEVEL__VOLTAGE, null, msgs);
			if (newVoltage != null)
				msgs = ((InternalEObject)newVoltage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.VOLTAGE_LEVEL__VOLTAGE, null, msgs);
			msgs = basicSetVoltage(newVoltage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldVoltageESet = voltageESet;
			voltageESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.VOLTAGE_LEVEL__VOLTAGE, newVoltage, newVoltage, !oldVoltageESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetVoltage( NotificationChain msgs ) {
		Voltage oldVoltage = voltage;
		voltage = null;
		boolean oldVoltageESet = voltageESet;
		voltageESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.VOLTAGE_LEVEL__VOLTAGE, oldVoltage, null, oldVoltageESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetVoltage() {
		if (voltage != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)voltage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.VOLTAGE_LEVEL__VOLTAGE, null, msgs);
			msgs = basicUnsetVoltage(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldVoltageESet = voltageESet;
			voltageESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.VOLTAGE_LEVEL__VOLTAGE, null, null, oldVoltageESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetVoltage() {
		return voltageESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Terminal> getTerminal() {
		if (terminal == null) {
			terminal = new EObjectWithInverseEList.Unsettable<Terminal>(Terminal.class, this, SclPackage.VOLTAGE_LEVEL__TERMINAL, SclPackage.TERMINAL__VOLTAGE_LEVEL);
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
	 * The cached validation expression for the '{@link #validateVoltageLevel_nomFreq_value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Voltage Level nom Freq value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVoltageLevel_nomFreq_value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VOLTAGE_LEVEL_NOM_FREQ_VALUE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'nomFreq attribute shall a positive decimal in VoltageLevel (line ' + self.lineNumber.toString() + ').'\n" +
		"            + 'Current value is ' + self.nomFreq.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.nomFreq <> null implies self.nomFreq >= 0\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltageLevel_nomFreq_value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getVoltageLevel(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getVoltageLevel__ValidateVoltageLevel_nomFreq_value__DiagnosticChain_Map(),
				 VALIDATE_VOLTAGE_LEVEL_NOM_FREQ_VALUE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.VOLTAGE_LEVEL__VALIDATE_VOLTAGE_LEVEL_NOM_FREQ_VALUE);
	}

				/**
	 * The cached validation expression for the '{@link #validateVoltageLevel_numPhases_value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Voltage Level num Phases value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVoltageLevel_numPhases_value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VOLTAGE_LEVEL_NUM_PHASES_VALUE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'numPhases attribute shall be between 1 and 255 in VoltageLevel (line ' + self.lineNumber.toString() + ').'\n" +
		"            + 'Current value is ' + self.numPhases.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        -- test <= 255 is done by XML Handler because it is a byte\n" +
		"        self.numPhases <> null implies self.numPhases > 0\n" +
		"\n" +
		"\n" +
		"\n" +
		"\n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltageLevel_numPhases_value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getVoltageLevel(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getVoltageLevel__ValidateVoltageLevel_numPhases_value__DiagnosticChain_Map(),
				 VALIDATE_VOLTAGE_LEVEL_NUM_PHASES_VALUE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.VOLTAGE_LEVEL__VALIDATE_VOLTAGE_LEVEL_NUM_PHASES_VALUE);
	}

				/**
	 * The cached validation expression for the '{@link #validateVoltageLevel_at_least_one_Bay_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Voltage Level at least one Bay required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVoltageLevel_at_least_one_Bay_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VOLTAGE_LEVEL_AT_LEAST_ONE_BAY_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'VoltageLevel shall contain at least one Bay (line ' + self.lineNumber.toString() + ')' ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.Bay->notEmpty()\n" +
		"\n" +
		"\n" +
		"\n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltageLevel_at_least_one_Bay_required(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getVoltageLevel(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getVoltageLevel__ValidateVoltageLevel_at_least_one_Bay_required__DiagnosticChain_Map(),
				 VALIDATE_VOLTAGE_LEVEL_AT_LEAST_ONE_BAY_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.VOLTAGE_LEVEL__VALIDATE_VOLTAGE_LEVEL_AT_LEAST_ONE_BAY_REQUIRED);
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
			case SclPackage.VOLTAGE_LEVEL__BAY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBay()).basicAdd(otherEnd, msgs);
			case SclPackage.VOLTAGE_LEVEL__FUNCTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFunction()).basicAdd(otherEnd, msgs);
			case SclPackage.VOLTAGE_LEVEL__SUBSTATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSubstation((Substation)otherEnd, msgs);
			case SclPackage.VOLTAGE_LEVEL__TERMINAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerminal()).basicAdd(otherEnd, msgs);
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
			case SclPackage.VOLTAGE_LEVEL__BAY:
				return ((InternalEList<?>)getBay()).basicRemove(otherEnd, msgs);
			case SclPackage.VOLTAGE_LEVEL__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
			case SclPackage.VOLTAGE_LEVEL__SUBSTATION:
				return basicSetSubstation(null, msgs);
			case SclPackage.VOLTAGE_LEVEL__VOLTAGE:
				return basicUnsetVoltage(msgs);
			case SclPackage.VOLTAGE_LEVEL__TERMINAL:
				return ((InternalEList<?>)getTerminal()).basicRemove(otherEnd, msgs);
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
			case SclPackage.VOLTAGE_LEVEL__SUBSTATION:
				return eInternalContainer().eInverseRemove(this, SclPackage.SUBSTATION__VOLTAGE_LEVEL, Substation.class, msgs);
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
			case SclPackage.VOLTAGE_LEVEL__NOM_FREQ:
				return getNomFreq();
			case SclPackage.VOLTAGE_LEVEL__NUM_PHASES:
				return getNumPhases();
			case SclPackage.VOLTAGE_LEVEL__BAY:
				return getBay();
			case SclPackage.VOLTAGE_LEVEL__FUNCTION:
				return getFunction();
			case SclPackage.VOLTAGE_LEVEL__SUBSTATION:
				return getSubstation();
			case SclPackage.VOLTAGE_LEVEL__VOLTAGE:
				return getVoltage();
			case SclPackage.VOLTAGE_LEVEL__TERMINAL:
				return getTerminal();
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
			case SclPackage.VOLTAGE_LEVEL__NOM_FREQ:
				setNomFreq((BigDecimal)newValue);
				return;
			case SclPackage.VOLTAGE_LEVEL__NUM_PHASES:
				setNumPhases((Byte)newValue);
				return;
			case SclPackage.VOLTAGE_LEVEL__BAY:
				getBay().clear();
				getBay().addAll((Collection<? extends Bay>)newValue);
				return;
			case SclPackage.VOLTAGE_LEVEL__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends Function>)newValue);
				return;
			case SclPackage.VOLTAGE_LEVEL__SUBSTATION:
				setSubstation((Substation)newValue);
				return;
			case SclPackage.VOLTAGE_LEVEL__VOLTAGE:
				setVoltage((Voltage)newValue);
				return;
			case SclPackage.VOLTAGE_LEVEL__TERMINAL:
				getTerminal().clear();
				getTerminal().addAll((Collection<? extends Terminal>)newValue);
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
			case SclPackage.VOLTAGE_LEVEL__NOM_FREQ:
				unsetNomFreq();
				return;
			case SclPackage.VOLTAGE_LEVEL__NUM_PHASES:
				unsetNumPhases();
				return;
			case SclPackage.VOLTAGE_LEVEL__BAY:
				unsetBay();
				return;
			case SclPackage.VOLTAGE_LEVEL__FUNCTION:
				unsetFunction();
				return;
			case SclPackage.VOLTAGE_LEVEL__SUBSTATION:
				setSubstation((Substation)null);
				return;
			case SclPackage.VOLTAGE_LEVEL__VOLTAGE:
				unsetVoltage();
				return;
			case SclPackage.VOLTAGE_LEVEL__TERMINAL:
				unsetTerminal();
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
			case SclPackage.VOLTAGE_LEVEL__NOM_FREQ:
				return isSetNomFreq();
			case SclPackage.VOLTAGE_LEVEL__NUM_PHASES:
				return isSetNumPhases();
			case SclPackage.VOLTAGE_LEVEL__BAY:
				return isSetBay();
			case SclPackage.VOLTAGE_LEVEL__FUNCTION:
				return isSetFunction();
			case SclPackage.VOLTAGE_LEVEL__SUBSTATION:
				return getSubstation() != null;
			case SclPackage.VOLTAGE_LEVEL__VOLTAGE:
				return isSetVoltage();
			case SclPackage.VOLTAGE_LEVEL__TERMINAL:
				return isSetTerminal();
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
			case SclPackage.VOLTAGE_LEVEL___VALIDATE_VOLTAGE_LEVEL_NOM_FREQ_VALUE__DIAGNOSTICCHAIN_MAP:
				return validateVoltageLevel_nomFreq_value((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.VOLTAGE_LEVEL___VALIDATE_VOLTAGE_LEVEL_NUM_PHASES_VALUE__DIAGNOSTICCHAIN_MAP:
				return validateVoltageLevel_numPhases_value((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.VOLTAGE_LEVEL___VALIDATE_VOLTAGE_LEVEL_AT_LEAST_ONE_BAY_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateVoltageLevel_at_least_one_Bay_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (nomFreq: ");
		if (nomFreqESet) result.append(nomFreq); else result.append("<unset>");
		result.append(", numPhases: ");
		if (numPhasesESet) result.append(numPhases); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VoltageLevelImpl
