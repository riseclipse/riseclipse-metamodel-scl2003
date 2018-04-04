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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setting Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingControlImpl#getActSG <em>Act SG</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingControlImpl#getNumOfSGs <em>Num Of SGs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingControlImpl#getResvTms <em>Resv Tms</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingControlImpl#getLN0 <em>LN0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SettingControlImpl extends UnNamingImpl implements SettingControl {
    /**
	 * The default value of the '{@link #getActSG() <em>Act SG</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getActSG()
	 * @generated
	 * @ordered
	 */
    protected static final Integer ACT_SG_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getActSG() <em>Act SG</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getActSG()
	 * @generated
	 * @ordered
	 */
    protected Integer actSG = ACT_SG_EDEFAULT;

    /**
	 * This is true if the Act SG attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean actSGESet;

    /**
	 * The default value of the '{@link #getNumOfSGs() <em>Num Of SGs</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNumOfSGs()
	 * @generated
	 * @ordered
	 */
    protected static final Integer NUM_OF_SGS_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getNumOfSGs() <em>Num Of SGs</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNumOfSGs()
	 * @generated
	 * @ordered
	 */
    protected Integer numOfSGs = NUM_OF_SGS_EDEFAULT;

    /**
	 * This is true if the Num Of SGs attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean numOfSGsESet;

    /**
	 * The default value of the '{@link #getResvTms() <em>Resv Tms</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getResvTms()
	 * @generated
	 * @ordered
	 */
    protected static final Short RESV_TMS_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getResvTms() <em>Resv Tms</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getResvTms()
	 * @generated
	 * @ordered
	 */
    protected Short resvTms = RESV_TMS_EDEFAULT;

    /**
	 * This is true if the Resv Tms attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean resvTmsESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SettingControlImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getSettingControl();
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Integer getActSG() {
        if( isSetActSG() ) {
            return actSG;
        }
        return 1;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setActSG( Integer newActSG ) {
		Integer oldActSG = actSG;
		actSG = newActSG;
		boolean oldActSGESet = actSGESet;
		actSGESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SETTING_CONTROL__ACT_SG, oldActSG, actSG, !oldActSGESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetActSG() {
		Integer oldActSG = actSG;
		boolean oldActSGESet = actSGESet;
		actSG = ACT_SG_EDEFAULT;
		actSGESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SETTING_CONTROL__ACT_SG, oldActSG, ACT_SG_EDEFAULT, oldActSGESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetActSG() {
		return actSGESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Integer getNumOfSGs() {
		return numOfSGs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNumOfSGs( Integer newNumOfSGs ) {
		Integer oldNumOfSGs = numOfSGs;
		numOfSGs = newNumOfSGs;
		boolean oldNumOfSGsESet = numOfSGsESet;
		numOfSGsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SETTING_CONTROL__NUM_OF_SGS, oldNumOfSGs, numOfSGs, !oldNumOfSGsESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetNumOfSGs() {
		Integer oldNumOfSGs = numOfSGs;
		boolean oldNumOfSGsESet = numOfSGsESet;
		numOfSGs = NUM_OF_SGS_EDEFAULT;
		numOfSGsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SETTING_CONTROL__NUM_OF_SGS, oldNumOfSGs, NUM_OF_SGS_EDEFAULT, oldNumOfSGsESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetNumOfSGs() {
		return numOfSGsESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Short getResvTms() {
		return resvTms;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setResvTms( Short newResvTms ) {
		Short oldResvTms = resvTms;
		resvTms = newResvTms;
		boolean oldResvTmsESet = resvTmsESet;
		resvTmsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SETTING_CONTROL__RESV_TMS, oldResvTms, resvTms, !oldResvTmsESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetResvTms() {
		Short oldResvTms = resvTms;
		boolean oldResvTmsESet = resvTmsESet;
		resvTms = RESV_TMS_EDEFAULT;
		resvTmsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SETTING_CONTROL__RESV_TMS, oldResvTms, RESV_TMS_EDEFAULT, oldResvTmsESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetResvTms() {
		return resvTmsESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LN0 getLN0() {
		if (eContainerFeatureID() != SclPackage.SETTING_CONTROL__LN0) return null;
		return (LN0)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLN0( LN0 newLN0, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newLN0, SclPackage.SETTING_CONTROL__LN0, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLN0( LN0 newLN0 ) {
		if (newLN0 != eInternalContainer() || (eContainerFeatureID() != SclPackage.SETTING_CONTROL__LN0 && newLN0 != null)) {
			if (EcoreUtil.isAncestor(this, newLN0))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLN0 != null)
				msgs = ((InternalEObject)newLN0).eInverseAdd(this, SclPackage.LN0__SETTING_CONTROL, LN0.class, msgs);
			msgs = basicSetLN0(newLN0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SETTING_CONTROL__LN0, newLN0, newLN0));
	}

    /**
	 * The cached validation expression for the '{@link #validateSettingControl_numOfSGs_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Setting Control num Of SGs required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSettingControl_numOfSGs_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SETTING_CONTROL_NUM_OF_SGS_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'numOfSGs attribute shall be present in SettingControl (line ' + self.lineNumber.toString() + ')' ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.numOfSGs <> null\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettingControl_numOfSGs_required(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getSettingControl(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getSettingControl__ValidateSettingControl_numOfSGs_required__DiagnosticChain_Map(),
				 VALIDATE_SETTING_CONTROL_NUM_OF_SGS_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.SETTING_CONTROL__VALIDATE_SETTING_CONTROL_NUM_OF_SGS_REQUIRED);
	}

				/**
	 * The cached validation expression for the '{@link #validateSettingControl_numOfSGs_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Setting Control num Of SGs valid</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSettingControl_numOfSGs_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SETTING_CONTROL_NUM_OF_SGS_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'numOfSGs attribute shall be greater than 0 in SettingControl (line ' + self.lineNumber.toString() + '). '\n" +
		"          + 'Current value is ' + self.numOfSGs.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.numOfSGs <> null implies self.numOfSGs > 0\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettingControl_numOfSGs_valid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getSettingControl(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getSettingControl__ValidateSettingControl_numOfSGs_valid__DiagnosticChain_Map(),
				 VALIDATE_SETTING_CONTROL_NUM_OF_SGS_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.SETTING_CONTROL__VALIDATE_SETTING_CONTROL_NUM_OF_SGS_VALID);
	}

				/**
	 * The cached validation expression for the '{@link #validateSettingControl_actSG_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Setting Control act SG valid</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSettingControl_actSG_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SETTING_CONTROL_ACT_SG_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'actSG attribute shall be greater than 0 in SettingControl (line ' + self.lineNumber.toString() + '). '\n" +
		"          + 'Current value is ' + self.actSG.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.actSG <> null implies self.actSG > 0\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettingControl_actSG_valid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getSettingControl(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getSettingControl__ValidateSettingControl_actSG_valid__DiagnosticChain_Map(),
				 VALIDATE_SETTING_CONTROL_ACT_SG_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.SETTING_CONTROL__VALIDATE_SETTING_CONTROL_ACT_SG_VALID);
	}

				/**
	 * The cached validation expression for the '{@link #validateSettingControl_resvTms_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Setting Control resv Tms valid</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSettingControl_resvTms_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SETTING_CONTROL_RESV_TMS_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'resvTms attribute shall be valid in SettingControl (line ' + self.lineNumber.toString() + '). '\n" +
		"          + 'Current value is ' + self.resvTms.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.resvTms <> null implies self.resvTms >= 0\n" +
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
	public boolean validateSettingControl_resvTms_valid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getSettingControl(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getSettingControl__ValidateSettingControl_resvTms_valid__DiagnosticChain_Map(),
				 VALIDATE_SETTING_CONTROL_RESV_TMS_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.SETTING_CONTROL__VALIDATE_SETTING_CONTROL_RESV_TMS_VALID);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.SETTING_CONTROL__LN0:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLN0((LN0)otherEnd, msgs);
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
			case SclPackage.SETTING_CONTROL__LN0:
				return basicSetLN0(null, msgs);
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
			case SclPackage.SETTING_CONTROL__LN0:
				return eInternalContainer().eInverseRemove(this, SclPackage.LN0__SETTING_CONTROL, LN0.class, msgs);
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
			case SclPackage.SETTING_CONTROL__ACT_SG:
				return getActSG();
			case SclPackage.SETTING_CONTROL__NUM_OF_SGS:
				return getNumOfSGs();
			case SclPackage.SETTING_CONTROL__RESV_TMS:
				return getResvTms();
			case SclPackage.SETTING_CONTROL__LN0:
				return getLN0();
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
			case SclPackage.SETTING_CONTROL__ACT_SG:
				setActSG((Integer)newValue);
				return;
			case SclPackage.SETTING_CONTROL__NUM_OF_SGS:
				setNumOfSGs((Integer)newValue);
				return;
			case SclPackage.SETTING_CONTROL__RESV_TMS:
				setResvTms((Short)newValue);
				return;
			case SclPackage.SETTING_CONTROL__LN0:
				setLN0((LN0)newValue);
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
			case SclPackage.SETTING_CONTROL__ACT_SG:
				unsetActSG();
				return;
			case SclPackage.SETTING_CONTROL__NUM_OF_SGS:
				unsetNumOfSGs();
				return;
			case SclPackage.SETTING_CONTROL__RESV_TMS:
				unsetResvTms();
				return;
			case SclPackage.SETTING_CONTROL__LN0:
				setLN0((LN0)null);
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
			case SclPackage.SETTING_CONTROL__ACT_SG:
				return isSetActSG();
			case SclPackage.SETTING_CONTROL__NUM_OF_SGS:
				return isSetNumOfSGs();
			case SclPackage.SETTING_CONTROL__RESV_TMS:
				return isSetResvTms();
			case SclPackage.SETTING_CONTROL__LN0:
				return getLN0() != null;
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
			case SclPackage.SETTING_CONTROL___VALIDATE_SETTING_CONTROL_NUM_OF_SGS_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateSettingControl_numOfSGs_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SETTING_CONTROL___VALIDATE_SETTING_CONTROL_NUM_OF_SGS_VALID__DIAGNOSTICCHAIN_MAP:
				return validateSettingControl_numOfSGs_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SETTING_CONTROL___VALIDATE_SETTING_CONTROL_ACT_SG_VALID__DIAGNOSTICCHAIN_MAP:
				return validateSettingControl_actSG_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SETTING_CONTROL___VALIDATE_SETTING_CONTROL_RESV_TMS_VALID__DIAGNOSTICCHAIN_MAP:
				return validateSettingControl_resvTms_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (actSG: ");
		if (actSGESet) result.append(actSG); else result.append("<unset>");
		result.append(", numOfSGs: ");
		if (numOfSGsESet) result.append(numOfSGs); else result.append("<unset>");
		result.append(", resvTms: ");
		if (resvTmsESet) result.append(resvTms); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SettingControlImpl
