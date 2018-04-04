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

import java.util.List;

import java.util.Map;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclSwitch;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SDO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDOImpl#getCount <em>Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDOImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDOImpl#getDOType <em>DO Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDOImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDOImpl#getRefersToDOType <em>Refers To DO Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SDOImpl extends UnNamingImpl implements SDO {
    /**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
    protected static final String COUNT_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
    protected String count = COUNT_EDEFAULT;

    /**
	 * This is true if the Count attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean countESet;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected static final String NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected String name = NAME_EDEFAULT;

    /**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean nameESet;

    /**
	 * The cached value of the '{@link #getRefersToDOType() <em>Refers To DO Type</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRefersToDOType()
	 * @generated
	 * @ordered
	 */
    protected DOType refersToDOType;

    /**
	 * This is true if the Refers To DO Type reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean refersToDOTypeESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SDOImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getSDO();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getCount() {
		return count;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCount(String newCount) {
		String oldCount = count;
		count = newCount;
		boolean oldCountESet = countESet;
		countESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SDO__COUNT, oldCount, count, !oldCountESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetCount() {
		String oldCount = count;
		boolean oldCountESet = countESet;
		count = COUNT_EDEFAULT;
		countESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SDO__COUNT, oldCount, COUNT_EDEFAULT, oldCountESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetCount() {
		return countESet;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getType() {
        if( isSetRefersToDOType() ) {
            return getRefersToDOType().getId();
        }
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SDO__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SDO__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean isSetType() {
        return isSetRefersToDOType();
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DOType getDOType() {
		if (eContainerFeatureID() != SclPackage.SDO__DO_TYPE) return null;
		return (DOType)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDOType( DOType newDOType, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newDOType, SclPackage.SDO__DO_TYPE, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDOType( DOType newDOType ) {
		if (newDOType != eInternalContainer() || (eContainerFeatureID() != SclPackage.SDO__DO_TYPE && newDOType != null)) {
			if (EcoreUtil.isAncestor(this, newDOType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDOType != null)
				msgs = ((InternalEObject)newDOType).eInverseAdd(this, SclPackage.DO_TYPE__SDO, DOType.class, msgs);
			msgs = basicSetDOType(newDOType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SDO__DO_TYPE, newDOType, newDOType));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getName() {
		return name;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(String newName) {
		String oldName = name;
		name = newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SDO__NAME, oldName, name, !oldNameESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SDO__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetName() {
		return nameESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DOType getRefersToDOType() {
		return refersToDOType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetRefersToDOType(DOType newRefersToDOType, NotificationChain msgs) {
		DOType oldRefersToDOType = refersToDOType;
		refersToDOType = newRefersToDOType;
		boolean oldRefersToDOTypeESet = refersToDOTypeESet;
		refersToDOTypeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SDO__REFERS_TO_DO_TYPE, oldRefersToDOType, newRefersToDOType, !oldRefersToDOTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRefersToDOType(DOType newRefersToDOType) {
		if (newRefersToDOType != refersToDOType) {
			NotificationChain msgs = null;
			if (refersToDOType != null)
				msgs = ((InternalEObject)refersToDOType).eInverseRemove(this, SclPackage.DO_TYPE__REFERRED_BY_SDO, DOType.class, msgs);
			if (newRefersToDOType != null)
				msgs = ((InternalEObject)newRefersToDOType).eInverseAdd(this, SclPackage.DO_TYPE__REFERRED_BY_SDO, DOType.class, msgs);
			msgs = basicSetRefersToDOType(newRefersToDOType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToDOTypeESet = refersToDOTypeESet;
			refersToDOTypeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SDO__REFERS_TO_DO_TYPE, newRefersToDOType, newRefersToDOType, !oldRefersToDOTypeESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetRefersToDOType(NotificationChain msgs) {
		DOType oldRefersToDOType = refersToDOType;
		refersToDOType = null;
		boolean oldRefersToDOTypeESet = refersToDOTypeESet;
		refersToDOTypeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SDO__REFERS_TO_DO_TYPE, oldRefersToDOType, null, oldRefersToDOTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetRefersToDOType() {
		if (refersToDOType != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)refersToDOType).eInverseRemove(this, SclPackage.DO_TYPE__REFERRED_BY_SDO, DOType.class, msgs);
			msgs = basicUnsetRefersToDOType(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToDOTypeESet = refersToDOTypeESet;
			refersToDOTypeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SDO__REFERS_TO_DO_TYPE, null, null, oldRefersToDOTypeESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetRefersToDOType() {
		return refersToDOTypeESet;
	}

    /**
	 * The cached validation expression for the '{@link #validateSDO_name_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SDO name required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSDO_name_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SDO_NAME_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'name attribute shall be present in SDO (line ' + self.lineNumber.toString() + ')' ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.name <> null\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSDO_name_required(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getSDO(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getSDO__ValidateSDO_name_required__DiagnosticChain_Map(),
				 VALIDATE_SDO_NAME_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.SDO__VALIDATE_SDO_NAME_REQUIRED);
	}

				/**
	 * The cached validation expression for the '{@link #validateSDO_name_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SDO name valid</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSDO_name_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SDO_NAME_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'name attribute shall be valid in SDO (line ' + self.lineNumber.toString() + ')). '\n" +
		"          + 'Current value is ' + self.name.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.name <> null implies self.validSclSubDataName( name )\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSDO_name_valid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getSDO(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getSDO__ValidateSDO_name_valid__DiagnosticChain_Map(),
				 VALIDATE_SDO_NAME_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.SDO__VALIDATE_SDO_NAME_VALID);
	}

				/**
	 * The cached validation expression for the '{@link #validateSDO_type_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SDO type required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSDO_type_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SDO_TYPE_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'type attribute shall be present in SDO (line ' + self.lineNumber.toString() + ')' ,\n" +
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
	public boolean validateSDO_type_required(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getSDO(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getSDO__ValidateSDO_type_required__DiagnosticChain_Map(),
				 VALIDATE_SDO_TYPE_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.SDO__VALIDATE_SDO_TYPE_REQUIRED);
	}

				/**
	 * The cached validation expression for the '{@link #validateSDO_type_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SDO type valid</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSDO_type_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SDO_TYPE_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'type attribute shall be valid in SDO (line ' + self.lineNumber.toString() + ')). '\n" +
		"          + 'Current value is ' + self.type.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.type <> null implies self.validSclName( type )\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSDO_type_valid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getSDO(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getSDO__ValidateSDO_type_valid__DiagnosticChain_Map(),
				 VALIDATE_SDO_TYPE_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.SDO__VALIDATE_SDO_TYPE_VALID);
	}

				/**
	 * The cached validation expression for the '{@link #validateSDO_count_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SDO count valid</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSDO_count_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SDO_COUNT_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'count attribute shall be valid in SDO (line ' + self.lineNumber.toString() + ')). '\n" +
		"          + 'Current value is ' + self.type.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.count <> null implies self.validSclSDOCount( count )\n" +
		"\n" +
		"\n" +
		"\n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSDO_count_valid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getSDO(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getSDO__ValidateSDO_count_valid__DiagnosticChain_Map(),
				 VALIDATE_SDO_COUNT_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.SDO__VALIDATE_SDO_COUNT_VALID);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.SDO__DO_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDOType((DOType)otherEnd, msgs);
			case SclPackage.SDO__REFERS_TO_DO_TYPE:
				if (refersToDOType != null)
					msgs = ((InternalEObject)refersToDOType).eInverseRemove(this, SclPackage.DO_TYPE__REFERRED_BY_SDO, DOType.class, msgs);
				return basicSetRefersToDOType((DOType)otherEnd, msgs);
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
			case SclPackage.SDO__DO_TYPE:
				return basicSetDOType(null, msgs);
			case SclPackage.SDO__REFERS_TO_DO_TYPE:
				return basicUnsetRefersToDOType(msgs);
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
			case SclPackage.SDO__DO_TYPE:
				return eInternalContainer().eInverseRemove(this, SclPackage.DO_TYPE__SDO, DOType.class, msgs);
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
			case SclPackage.SDO__COUNT:
				return getCount();
			case SclPackage.SDO__TYPE:
				return getType();
			case SclPackage.SDO__DO_TYPE:
				return getDOType();
			case SclPackage.SDO__NAME:
				return getName();
			case SclPackage.SDO__REFERS_TO_DO_TYPE:
				return getRefersToDOType();
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
			case SclPackage.SDO__COUNT:
				setCount((String)newValue);
				return;
			case SclPackage.SDO__TYPE:
				setType((String)newValue);
				return;
			case SclPackage.SDO__DO_TYPE:
				setDOType((DOType)newValue);
				return;
			case SclPackage.SDO__NAME:
				setName((String)newValue);
				return;
			case SclPackage.SDO__REFERS_TO_DO_TYPE:
				setRefersToDOType((DOType)newValue);
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
			case SclPackage.SDO__COUNT:
				unsetCount();
				return;
			case SclPackage.SDO__TYPE:
				unsetType();
				return;
			case SclPackage.SDO__DO_TYPE:
				setDOType((DOType)null);
				return;
			case SclPackage.SDO__NAME:
				unsetName();
				return;
			case SclPackage.SDO__REFERS_TO_DO_TYPE:
				unsetRefersToDOType();
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
			case SclPackage.SDO__COUNT:
				return isSetCount();
			case SclPackage.SDO__TYPE:
				return isSetType();
			case SclPackage.SDO__DO_TYPE:
				return getDOType() != null;
			case SclPackage.SDO__NAME:
				return isSetName();
			case SclPackage.SDO__REFERS_TO_DO_TYPE:
				return isSetRefersToDOType();
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
			case SclPackage.SDO___VALIDATE_SDO_NAME_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateSDO_name_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SDO___VALIDATE_SDO_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateSDO_name_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SDO___VALIDATE_SDO_TYPE_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateSDO_type_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SDO___VALIDATE_SDO_TYPE_VALID__DIAGNOSTICCHAIN_MAP:
				return validateSDO_type_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SDO___VALIDATE_SDO_COUNT_VALID__DIAGNOSTICCHAIN_MAP:
				return validateSDO_count_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (count: ");
		if (countESet) result.append(count); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

    @Override
    protected void doResolveLinks() {
        // Resolve only if attribute has been read
        if( ! typeESet ) return;

        // find an DOType with
        //   DOType.id      == SDO.type
        SclSwitch< Boolean > s = new SclSwitch< Boolean >() {

            @Override
            public Boolean caseDOType( DOType object ) {
                return object.getId().equals( getType() );
            }

            @Override
            public Boolean defaultCase( EObject object ) {
                return false;
            }

        };

        List< DOType > res = shallowSearchObjects( getSCLRoot().getDataTypeTemplates().getDOType(), s );
        String mess = "DOType( id = " + getType() + " ) for SDO on line " + getLineNumber() + " )";
        if( res.isEmpty() ) {
            AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess );
        }
        else if( res.size() > 1 ) {
            AbstractRiseClipseConsole.getConsole().error( "found several " + mess );
        }
        else {
            //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
            setRefersToDOType( res.get( 0 ) );
        }
    }

} //SDOImpl
