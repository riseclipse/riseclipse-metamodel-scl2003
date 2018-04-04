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

import org.eclipse.ocl.pivot.utilities.ValueUtil;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PhaseEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubEquipmentImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubEquipmentImpl#getVirtual <em>Virtual</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubEquipmentImpl#getAbstractConductingEquipment <em>Abstract Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubEquipmentImpl#getEqFunction <em>Eq Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubEquipmentImpl#getPowerTransformer <em>Power Transformer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubEquipmentImpl#getTapChanger <em>Tap Changer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubEquipmentImpl extends PowerSystemResourceImpl implements SubEquipment {
    /**
     * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated NOT
     * @ordered
     */
    protected static final PhaseEnum PHASE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
    protected PhaseEnum phase = PHASE_EDEFAULT;

    /**
	 * This is true if the Phase attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean phaseESet;

    /**
	 * The default value of the '{@link #getVirtual() <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVirtual()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean VIRTUAL_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getVirtual() <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVirtual()
	 * @generated
	 * @ordered
	 */
    protected Boolean virtual = VIRTUAL_EDEFAULT;

    /**
	 * This is true if the Virtual attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean virtualESet;

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
    protected SubEquipmentImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.SUB_EQUIPMENT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public PhaseEnum getPhase() {
		return phase;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPhase( PhaseEnum newPhase ) {
		PhaseEnum oldPhase = phase;
		phase = newPhase == null ? PHASE_EDEFAULT : newPhase;
		boolean oldPhaseESet = phaseESet;
		phaseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SUB_EQUIPMENT__PHASE, oldPhase, phase, !oldPhaseESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetPhase() {
		PhaseEnum oldPhase = phase;
		boolean oldPhaseESet = phaseESet;
		phase = PHASE_EDEFAULT;
		phaseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SUB_EQUIPMENT__PHASE, oldPhase, PHASE_EDEFAULT, oldPhaseESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetPhase() {
		return phaseESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getVirtual() {
		return virtual;
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void setVirtual( Boolean newVirtual ) {
		Boolean oldVirtual = virtual;
		virtual = newVirtual;
		boolean oldVirtualESet = virtualESet;
		virtualESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SUB_EQUIPMENT__VIRTUAL, oldVirtual, virtual, !oldVirtualESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetVirtual() {
		Boolean oldVirtual = virtual;
		boolean oldVirtualESet = virtualESet;
		virtual = VIRTUAL_EDEFAULT;
		virtualESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SUB_EQUIPMENT__VIRTUAL, oldVirtual, VIRTUAL_EDEFAULT, oldVirtualESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetVirtual() {
		return virtualESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AbstractConductingEquipment getAbstractConductingEquipment() {
		if (eContainerFeatureID() != SclPackage.SUB_EQUIPMENT__ABSTRACT_CONDUCTING_EQUIPMENT) return null;
		return (AbstractConductingEquipment)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetAbstractConductingEquipment(
            AbstractConductingEquipment newAbstractConductingEquipment, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newAbstractConductingEquipment, SclPackage.SUB_EQUIPMENT__ABSTRACT_CONDUCTING_EQUIPMENT, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAbstractConductingEquipment( AbstractConductingEquipment newAbstractConductingEquipment ) {
		if (newAbstractConductingEquipment != eInternalContainer() || (eContainerFeatureID() != SclPackage.SUB_EQUIPMENT__ABSTRACT_CONDUCTING_EQUIPMENT && newAbstractConductingEquipment != null)) {
			if (EcoreUtil.isAncestor(this, newAbstractConductingEquipment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAbstractConductingEquipment != null)
				msgs = ((InternalEObject)newAbstractConductingEquipment).eInverseAdd(this, SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT, AbstractConductingEquipment.class, msgs);
			msgs = basicSetAbstractConductingEquipment(newAbstractConductingEquipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SUB_EQUIPMENT__ABSTRACT_CONDUCTING_EQUIPMENT, newAbstractConductingEquipment, newAbstractConductingEquipment));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<EqFunction> getEqFunction() {
		if (eqFunction == null) {
			eqFunction = new EObjectContainmentWithInverseEList.Unsettable<EqFunction>(EqFunction.class, this, SclPackage.SUB_EQUIPMENT__EQ_FUNCTION, SclPackage.EQ_FUNCTION__SUB_EQUIPMENT);
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
    public PowerTransformer getPowerTransformer() {
		if (eContainerFeatureID() != SclPackage.SUB_EQUIPMENT__POWER_TRANSFORMER) return null;
		return (PowerTransformer)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetPowerTransformer( PowerTransformer newPowerTransformer, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newPowerTransformer, SclPackage.SUB_EQUIPMENT__POWER_TRANSFORMER, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPowerTransformer( PowerTransformer newPowerTransformer ) {
		if (newPowerTransformer != eInternalContainer() || (eContainerFeatureID() != SclPackage.SUB_EQUIPMENT__POWER_TRANSFORMER && newPowerTransformer != null)) {
			if (EcoreUtil.isAncestor(this, newPowerTransformer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPowerTransformer != null)
				msgs = ((InternalEObject)newPowerTransformer).eInverseAdd(this, SclPackage.POWER_TRANSFORMER__SUB_EQUIPMENT, PowerTransformer.class, msgs);
			msgs = basicSetPowerTransformer(newPowerTransformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SUB_EQUIPMENT__POWER_TRANSFORMER, newPowerTransformer, newPowerTransformer));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TapChanger getTapChanger() {
		if (eContainerFeatureID() != SclPackage.SUB_EQUIPMENT__TAP_CHANGER) return null;
		return (TapChanger)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetTapChanger( TapChanger newTapChanger, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newTapChanger, SclPackage.SUB_EQUIPMENT__TAP_CHANGER, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTapChanger( TapChanger newTapChanger ) {
		if (newTapChanger != eInternalContainer() || (eContainerFeatureID() != SclPackage.SUB_EQUIPMENT__TAP_CHANGER && newTapChanger != null)) {
			if (EcoreUtil.isAncestor(this, newTapChanger))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTapChanger != null)
				msgs = ((InternalEObject)newTapChanger).eInverseAdd(this, SclPackage.TAP_CHANGER__SUB_EQUIPMENT, TapChanger.class, msgs);
			msgs = basicSetTapChanger(newTapChanger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SUB_EQUIPMENT__TAP_CHANGER, newTapChanger, newTapChanger));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubEquipment_nothing(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv SubEquipment_nothing: true
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
			case SclPackage.SUB_EQUIPMENT__ABSTRACT_CONDUCTING_EQUIPMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAbstractConductingEquipment((AbstractConductingEquipment)otherEnd, msgs);
			case SclPackage.SUB_EQUIPMENT__EQ_FUNCTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEqFunction()).basicAdd(otherEnd, msgs);
			case SclPackage.SUB_EQUIPMENT__POWER_TRANSFORMER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPowerTransformer((PowerTransformer)otherEnd, msgs);
			case SclPackage.SUB_EQUIPMENT__TAP_CHANGER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case SclPackage.SUB_EQUIPMENT__ABSTRACT_CONDUCTING_EQUIPMENT:
				return basicSetAbstractConductingEquipment(null, msgs);
			case SclPackage.SUB_EQUIPMENT__EQ_FUNCTION:
				return ((InternalEList<?>)getEqFunction()).basicRemove(otherEnd, msgs);
			case SclPackage.SUB_EQUIPMENT__POWER_TRANSFORMER:
				return basicSetPowerTransformer(null, msgs);
			case SclPackage.SUB_EQUIPMENT__TAP_CHANGER:
				return basicSetTapChanger(null, msgs);
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
			case SclPackage.SUB_EQUIPMENT__ABSTRACT_CONDUCTING_EQUIPMENT:
				return eInternalContainer().eInverseRemove(this, SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT, AbstractConductingEquipment.class, msgs);
			case SclPackage.SUB_EQUIPMENT__POWER_TRANSFORMER:
				return eInternalContainer().eInverseRemove(this, SclPackage.POWER_TRANSFORMER__SUB_EQUIPMENT, PowerTransformer.class, msgs);
			case SclPackage.SUB_EQUIPMENT__TAP_CHANGER:
				return eInternalContainer().eInverseRemove(this, SclPackage.TAP_CHANGER__SUB_EQUIPMENT, TapChanger.class, msgs);
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
			case SclPackage.SUB_EQUIPMENT__PHASE:
				return getPhase();
			case SclPackage.SUB_EQUIPMENT__VIRTUAL:
				return getVirtual();
			case SclPackage.SUB_EQUIPMENT__ABSTRACT_CONDUCTING_EQUIPMENT:
				return getAbstractConductingEquipment();
			case SclPackage.SUB_EQUIPMENT__EQ_FUNCTION:
				return getEqFunction();
			case SclPackage.SUB_EQUIPMENT__POWER_TRANSFORMER:
				return getPowerTransformer();
			case SclPackage.SUB_EQUIPMENT__TAP_CHANGER:
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
			case SclPackage.SUB_EQUIPMENT__PHASE:
				setPhase((PhaseEnum)newValue);
				return;
			case SclPackage.SUB_EQUIPMENT__VIRTUAL:
				setVirtual((Boolean)newValue);
				return;
			case SclPackage.SUB_EQUIPMENT__ABSTRACT_CONDUCTING_EQUIPMENT:
				setAbstractConductingEquipment((AbstractConductingEquipment)newValue);
				return;
			case SclPackage.SUB_EQUIPMENT__EQ_FUNCTION:
				getEqFunction().clear();
				getEqFunction().addAll((Collection<? extends EqFunction>)newValue);
				return;
			case SclPackage.SUB_EQUIPMENT__POWER_TRANSFORMER:
				setPowerTransformer((PowerTransformer)newValue);
				return;
			case SclPackage.SUB_EQUIPMENT__TAP_CHANGER:
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
			case SclPackage.SUB_EQUIPMENT__PHASE:
				unsetPhase();
				return;
			case SclPackage.SUB_EQUIPMENT__VIRTUAL:
				unsetVirtual();
				return;
			case SclPackage.SUB_EQUIPMENT__ABSTRACT_CONDUCTING_EQUIPMENT:
				setAbstractConductingEquipment((AbstractConductingEquipment)null);
				return;
			case SclPackage.SUB_EQUIPMENT__EQ_FUNCTION:
				unsetEqFunction();
				return;
			case SclPackage.SUB_EQUIPMENT__POWER_TRANSFORMER:
				setPowerTransformer((PowerTransformer)null);
				return;
			case SclPackage.SUB_EQUIPMENT__TAP_CHANGER:
				setTapChanger((TapChanger)null);
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
			case SclPackage.SUB_EQUIPMENT__PHASE:
				return isSetPhase();
			case SclPackage.SUB_EQUIPMENT__VIRTUAL:
				return isSetVirtual();
			case SclPackage.SUB_EQUIPMENT__ABSTRACT_CONDUCTING_EQUIPMENT:
				return getAbstractConductingEquipment() != null;
			case SclPackage.SUB_EQUIPMENT__EQ_FUNCTION:
				return isSetEqFunction();
			case SclPackage.SUB_EQUIPMENT__POWER_TRANSFORMER:
				return getPowerTransformer() != null;
			case SclPackage.SUB_EQUIPMENT__TAP_CHANGER:
				return getTapChanger() != null;
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
			case SclPackage.SUB_EQUIPMENT___VALIDATE_SUB_EQUIPMENT_NOTHING__DIAGNOSTICCHAIN_MAP:
				return validateSubEquipment_nothing((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (phase: ");
		if (phaseESet) result.append(phase); else result.append("<unset>");
		result.append(", virtual: ");
		if (virtualESet) result.append(virtual); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SubEquipmentImpl
