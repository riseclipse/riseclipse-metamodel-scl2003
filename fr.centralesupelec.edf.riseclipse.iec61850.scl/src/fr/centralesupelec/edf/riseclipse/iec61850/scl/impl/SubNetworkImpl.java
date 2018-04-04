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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRate;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubNetworkImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubNetworkImpl#getBitRate <em>Bit Rate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubNetworkImpl#getCommunication <em>Communication</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubNetworkImpl#getConnectedAP <em>Connected AP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubNetworkImpl extends NamingImpl implements SubNetwork {
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
	 * The cached value of the '{@link #getBitRate() <em>Bit Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBitRate()
	 * @generated
	 * @ordered
	 */
    protected BitRate bitRate;

    /**
	 * This is true if the Bit Rate containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean bitRateESet;

    /**
	 * The cached value of the '{@link #getConnectedAP() <em>Connected AP</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConnectedAP()
	 * @generated
	 * @ordered
	 */
    protected EList<ConnectedAP> connectedAP;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SubNetworkImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getSubNetwork();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SUB_NETWORK__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SUB_NETWORK__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
    public BitRate getBitRate() {
		return bitRate;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetBitRate(BitRate newBitRate, NotificationChain msgs) {
		BitRate oldBitRate = bitRate;
		bitRate = newBitRate;
		boolean oldBitRateESet = bitRateESet;
		bitRateESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SUB_NETWORK__BIT_RATE, oldBitRate, newBitRate, !oldBitRateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBitRate(BitRate newBitRate) {
		if (newBitRate != bitRate) {
			NotificationChain msgs = null;
			if (bitRate != null)
				msgs = ((InternalEObject)bitRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SUB_NETWORK__BIT_RATE, null, msgs);
			if (newBitRate != null)
				msgs = ((InternalEObject)newBitRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.SUB_NETWORK__BIT_RATE, null, msgs);
			msgs = basicSetBitRate(newBitRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBitRateESet = bitRateESet;
			bitRateESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SUB_NETWORK__BIT_RATE, newBitRate, newBitRate, !oldBitRateESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetBitRate( NotificationChain msgs ) {
		BitRate oldBitRate = bitRate;
		bitRate = null;
		boolean oldBitRateESet = bitRateESet;
		bitRateESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SUB_NETWORK__BIT_RATE, oldBitRate, null, oldBitRateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetBitRate() {
		if (bitRate != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)bitRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SUB_NETWORK__BIT_RATE, null, msgs);
			msgs = basicUnsetBitRate(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBitRateESet = bitRateESet;
			bitRateESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SUB_NETWORK__BIT_RATE, null, null, oldBitRateESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetBitRate() {
		return bitRateESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Communication getCommunication() {
		if (eContainerFeatureID() != SclPackage.SUB_NETWORK__COMMUNICATION) return null;
		return (Communication)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetCommunication( Communication newCommunication, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newCommunication, SclPackage.SUB_NETWORK__COMMUNICATION, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCommunication( Communication newCommunication ) {
		if (newCommunication != eInternalContainer() || (eContainerFeatureID() != SclPackage.SUB_NETWORK__COMMUNICATION && newCommunication != null)) {
			if (EcoreUtil.isAncestor(this, newCommunication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCommunication != null)
				msgs = ((InternalEObject)newCommunication).eInverseAdd(this, SclPackage.COMMUNICATION__SUB_NETWORK, Communication.class, msgs);
			msgs = basicSetCommunication(newCommunication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SUB_NETWORK__COMMUNICATION, newCommunication, newCommunication));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ConnectedAP> getConnectedAP() {
		if (connectedAP == null) {
			connectedAP = new EObjectContainmentWithInverseEList.Unsettable<ConnectedAP>(ConnectedAP.class, this, SclPackage.SUB_NETWORK__CONNECTED_AP, SclPackage.CONNECTED_AP__SUB_NETWORK);
		}
		return connectedAP;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetConnectedAP() {
		if (connectedAP != null) ((InternalEList.Unsettable<?>)connectedAP).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetConnectedAP() {
		return connectedAP != null && ((InternalEList.Unsettable<?>)connectedAP).isSet();
	}

    /**
	 * The cached validation expression for the '{@link #validateSubNetwork_nothing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sub Network nothing</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubNetwork_nothing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUB_NETWORK_NOTHING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"        true\n" +
		"\n" +
		"\n" +
		"";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubNetwork_nothing(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getSubNetwork(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getSubNetwork__ValidateSubNetwork_nothing__DiagnosticChain_Map(),
				 VALIDATE_SUB_NETWORK_NOTHING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.SUB_NETWORK__VALIDATE_SUB_NETWORK_NOTHING);
	}

				/**
	 * The cached validation expression for the '{@link #validateSubNetwork_at_least_one_ConnectedAP_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sub Network at least one Connected AP required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubNetwork_at_least_one_ConnectedAP_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUB_NETWORK_AT_LEAST_ONE_CONNECTED_AP_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'SubNetwork shall contain at least one ConnectedAP (line ' + self.lineNumber.toString() + ')' ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.ConnectedAP->notEmpty()\n" +
		"\n" +
		"\n" +
		"\n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubNetwork_at_least_one_ConnectedAP_required(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getSubNetwork(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getSubNetwork__ValidateSubNetwork_at_least_one_ConnectedAP_required__DiagnosticChain_Map(),
				 VALIDATE_SUB_NETWORK_AT_LEAST_ONE_CONNECTED_AP_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.SUB_NETWORK__VALIDATE_SUB_NETWORK_AT_LEAST_ONE_CONNECTED_AP_REQUIRED);
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
			case SclPackage.SUB_NETWORK__COMMUNICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCommunication((Communication)otherEnd, msgs);
			case SclPackage.SUB_NETWORK__CONNECTED_AP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectedAP()).basicAdd(otherEnd, msgs);
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
			case SclPackage.SUB_NETWORK__BIT_RATE:
				return basicUnsetBitRate(msgs);
			case SclPackage.SUB_NETWORK__COMMUNICATION:
				return basicSetCommunication(null, msgs);
			case SclPackage.SUB_NETWORK__CONNECTED_AP:
				return ((InternalEList<?>)getConnectedAP()).basicRemove(otherEnd, msgs);
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
			case SclPackage.SUB_NETWORK__COMMUNICATION:
				return eInternalContainer().eInverseRemove(this, SclPackage.COMMUNICATION__SUB_NETWORK, Communication.class, msgs);
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
			case SclPackage.SUB_NETWORK__TYPE:
				return getType();
			case SclPackage.SUB_NETWORK__BIT_RATE:
				return getBitRate();
			case SclPackage.SUB_NETWORK__COMMUNICATION:
				return getCommunication();
			case SclPackage.SUB_NETWORK__CONNECTED_AP:
				return getConnectedAP();
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
			case SclPackage.SUB_NETWORK__TYPE:
				setType((String)newValue);
				return;
			case SclPackage.SUB_NETWORK__BIT_RATE:
				setBitRate((BitRate)newValue);
				return;
			case SclPackage.SUB_NETWORK__COMMUNICATION:
				setCommunication((Communication)newValue);
				return;
			case SclPackage.SUB_NETWORK__CONNECTED_AP:
				getConnectedAP().clear();
				getConnectedAP().addAll((Collection<? extends ConnectedAP>)newValue);
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
			case SclPackage.SUB_NETWORK__TYPE:
				unsetType();
				return;
			case SclPackage.SUB_NETWORK__BIT_RATE:
				unsetBitRate();
				return;
			case SclPackage.SUB_NETWORK__COMMUNICATION:
				setCommunication((Communication)null);
				return;
			case SclPackage.SUB_NETWORK__CONNECTED_AP:
				unsetConnectedAP();
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
			case SclPackage.SUB_NETWORK__TYPE:
				return isSetType();
			case SclPackage.SUB_NETWORK__BIT_RATE:
				return isSetBitRate();
			case SclPackage.SUB_NETWORK__COMMUNICATION:
				return getCommunication() != null;
			case SclPackage.SUB_NETWORK__CONNECTED_AP:
				return isSetConnectedAP();
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
			case SclPackage.SUB_NETWORK___VALIDATE_SUB_NETWORK_NOTHING__DIAGNOSTICCHAIN_MAP:
				return validateSubNetwork_nothing((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SUB_NETWORK___VALIDATE_SUB_NETWORK_AT_LEAST_ONE_CONNECTED_AP_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateSubNetwork_at_least_one_ConnectedAP_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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

} //SubNetworkImpl
