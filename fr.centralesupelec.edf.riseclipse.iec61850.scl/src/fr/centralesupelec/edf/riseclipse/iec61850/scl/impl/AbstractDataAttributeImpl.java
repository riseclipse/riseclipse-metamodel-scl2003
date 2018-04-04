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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Val;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataAttributeImpl#getBType <em>BType</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataAttributeImpl#getCount <em>Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataAttributeImpl#getSAddr <em>SAddr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataAttributeImpl#getValImport <em>Val Import</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataAttributeImpl#getValKind <em>Val Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataAttributeImpl#getRefersToEnumType <em>Refers To Enum Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataAttributeImpl#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractDataAttributeImpl extends DataAttributeImpl implements AbstractDataAttribute {
    /**
	 * The default value of the '{@link #getBType() <em>BType</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBType()
	 * @generated
	 * @ordered
	 */
    protected static final String BTYPE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getBType() <em>BType</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBType()
	 * @generated
	 * @ordered
	 */
    protected String bType = BTYPE_EDEFAULT;

    /**
	 * This is true if the BType attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean bTypeESet;

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
	 * The default value of the '{@link #getSAddr() <em>SAddr</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSAddr()
	 * @generated
	 * @ordered
	 */
    protected static final String SADDR_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getSAddr() <em>SAddr</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSAddr()
	 * @generated
	 * @ordered
	 */
    protected String sAddr = SADDR_EDEFAULT;

    /**
	 * This is true if the SAddr attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean sAddrESet;

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
	 * The default value of the '{@link #getValImport() <em>Val Import</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValImport()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean VAL_IMPORT_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getValImport() <em>Val Import</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValImport()
	 * @generated
	 * @ordered
	 */
    protected Boolean valImport = VAL_IMPORT_EDEFAULT;

    /**
	 * This is true if the Val Import attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean valImportESet;

    /**
     * The default value of the '{@link #getValKind() <em>Val Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValKind()
     * @generated NOT
     * @ordered
     */
    protected static final ValKindEnum VAL_KIND_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getValKind() <em>Val Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValKind()
	 * @generated
	 * @ordered
	 */
    protected ValKindEnum valKind = VAL_KIND_EDEFAULT;

    /**
	 * This is true if the Val Kind attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean valKindESet;

    /**
	 * The cached value of the '{@link #getRefersToEnumType() <em>Refers To Enum Type</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRefersToEnumType()
	 * @generated
	 * @ordered
	 */
    protected EnumType refersToEnumType;

    /**
	 * This is true if the Refers To Enum Type reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean refersToEnumTypeESet;

    /**
	 * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVal()
	 * @generated
	 * @ordered
	 */
    protected EList<Val> val;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected AbstractDataAttributeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getAbstractDataAttribute();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getBType() {
		return bType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBType( String newBType ) {
		String oldBType = bType;
		bType = newBType;
		boolean oldBTypeESet = bTypeESet;
		bTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__BTYPE, oldBType, bType, !oldBTypeESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetBType() {
		String oldBType = bType;
		boolean oldBTypeESet = bTypeESet;
		bType = BTYPE_EDEFAULT;
		bTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__BTYPE, oldBType, BTYPE_EDEFAULT, oldBTypeESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetBType() {
		return bTypeESet;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getCount() {
        if( isSetCount() ) {
            return count;
        }
        return "0";
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__COUNT, oldCount, count, !oldCountESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__COUNT, oldCount, COUNT_EDEFAULT, oldCountESet));
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
	 * @generated
	 */
    public String getSAddr() {
		return sAddr;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSAddr( String newSAddr ) {
		String oldSAddr = sAddr;
		sAddr = newSAddr;
		boolean oldSAddrESet = sAddrESet;
		sAddrESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__SADDR, oldSAddr, sAddr, !oldSAddrESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSAddr() {
		String oldSAddr = sAddr;
		boolean oldSAddrESet = sAddrESet;
		sAddr = SADDR_EDEFAULT;
		sAddrESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__SADDR, oldSAddr, SADDR_EDEFAULT, oldSAddrESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSAddr() {
		return sAddrESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
     * @generated NOT
     */
    public Boolean getValImport() {
        if( isSetValImport() ) {
            return valImport;
        }
        return Boolean.FALSE;
    }

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void setValImport( Boolean newValImport ) {
		Boolean oldValImport = valImport;
		valImport = newValImport;
		boolean oldValImportESet = valImportESet;
		valImportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL_IMPORT, oldValImport, valImport, !oldValImportESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetValImport() {
		Boolean oldValImport = valImport;
		boolean oldValImportESet = valImportESet;
		valImport = VAL_IMPORT_EDEFAULT;
		valImportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL_IMPORT, oldValImport, VAL_IMPORT_EDEFAULT, oldValImportESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetValImport() {
		return valImportESet;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public ValKindEnum getValKind() {
        if( isSetValKind() ) {
            return valKind;
        }
        return ValKindEnum.SET;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setValKind( ValKindEnum newValKind ) {
		ValKindEnum oldValKind = valKind;
		valKind = newValKind == null ? VAL_KIND_EDEFAULT : newValKind;
		boolean oldValKindESet = valKindESet;
		valKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL_KIND, oldValKind, valKind, !oldValKindESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetValKind() {
		ValKindEnum oldValKind = valKind;
		boolean oldValKindESet = valKindESet;
		valKind = VAL_KIND_EDEFAULT;
		valKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL_KIND, oldValKind, VAL_KIND_EDEFAULT, oldValKindESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetValKind() {
		return valKindESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EnumType getRefersToEnumType() {
		return refersToEnumType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetRefersToEnumType(EnumType newRefersToEnumType, NotificationChain msgs) {
		EnumType oldRefersToEnumType = refersToEnumType;
		refersToEnumType = newRefersToEnumType;
		boolean oldRefersToEnumTypeESet = refersToEnumTypeESet;
		refersToEnumTypeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE, oldRefersToEnumType, newRefersToEnumType, !oldRefersToEnumTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRefersToEnumType(EnumType newRefersToEnumType) {
		if (newRefersToEnumType != refersToEnumType) {
			NotificationChain msgs = null;
			if (refersToEnumType != null)
				msgs = ((InternalEObject)refersToEnumType).eInverseRemove(this, SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE, EnumType.class, msgs);
			if (newRefersToEnumType != null)
				msgs = ((InternalEObject)newRefersToEnumType).eInverseAdd(this, SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE, EnumType.class, msgs);
			msgs = basicSetRefersToEnumType(newRefersToEnumType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToEnumTypeESet = refersToEnumTypeESet;
			refersToEnumTypeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE, newRefersToEnumType, newRefersToEnumType, !oldRefersToEnumTypeESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetRefersToEnumType(NotificationChain msgs) {
		EnumType oldRefersToEnumType = refersToEnumType;
		refersToEnumType = null;
		boolean oldRefersToEnumTypeESet = refersToEnumTypeESet;
		refersToEnumTypeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE, oldRefersToEnumType, null, oldRefersToEnumTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetRefersToEnumType() {
		if (refersToEnumType != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)refersToEnumType).eInverseRemove(this, SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE, EnumType.class, msgs);
			msgs = basicUnsetRefersToEnumType(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToEnumTypeESet = refersToEnumTypeESet;
			refersToEnumTypeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE, null, null, oldRefersToEnumTypeESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetRefersToEnumType() {
		return refersToEnumTypeESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Val> getVal() {
		if (val == null) {
			val = new EObjectContainmentWithInverseEList.Unsettable<Val>(Val.class, this, SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL, SclPackage.VAL__ABSTRACT_DATA_ATTRIBUTE);
		}
		return val;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetVal() {
		if (val != null) ((InternalEList.Unsettable<?>)val).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetVal() {
		return val != null && ((InternalEList.Unsettable<?>)val).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractDataAttribute_bType_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv AbstractDataAttribute_bType_required:
		 *   let
		 *     severity : Integer[1] = 'AbstractDataAttribute::AbstractDataAttribute_bType_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.bType <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'bType attribute shall be present in AbstractDataAttribute (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'AbstractDataAttribute::AbstractDataAttribute_bType_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_AbstractDataAttribute_c_c_AbstractDataAttribute_bType_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String bType = this.getBType();
			final /*@NonInvalid*/ boolean status = bType != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_bType_32_attribute_32_shall_32_be_32_present_32_in_32_AbstractDataAttribute_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_AbstractDataAttribute_c_c_AbstractDataAttribute_bType_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractDataAttribute_bType_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv AbstractDataAttribute_bType_valid:
		 *   let
		 *     severity : Integer[1] = 'AbstractDataAttribute::AbstractDataAttribute_bType_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.bType <> null implies
		 *           self.validSclBasicTypeEnum(bType)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'bType attribute shall be valid in AbstractDataAttribute (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.bType.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'AbstractDataAttribute::AbstractDataAttribute_bType_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_AbstractDataAttribute_c_c_AbstractDataAttribute_bType_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String bType = this.getBType();
				final /*@NonInvalid*/ boolean ne = bType != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclBasicTypeEnum = ((SclObject)this).validSclBasicTypeEnum(bType);
					status = validSclBasicTypeEnum;
				}
				else {
					status = ValueUtil.TRUE_VALUE;
				}
				/*@Thrown*/ Object symbol_1;
				if (status) {
					symbol_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_bType_32_attribute_32_shall_32_be_32_valid_32_in_32_AbstractDataAttribute_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(bType);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_AbstractDataAttribute_c_c_AbstractDataAttribute_bType_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractDataAttribute_type_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv AbstractDataAttribute_type_valid:
		 *   let
		 *     severity : Integer[1] = 'AbstractDataAttribute::AbstractDataAttribute_type_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.type <> null implies
		 *           self.validSclAnyName(bType)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'type attribute shall be valid in AbstractDataAttribute (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.type.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'AbstractDataAttribute::AbstractDataAttribute_type_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_AbstractDataAttribute_c_c_AbstractDataAttribute_type_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String type = this.getType();
				final /*@NonInvalid*/ boolean ne = type != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@NonInvalid*/ String bType = this.getBType();
					final /*@Thrown*/ boolean validSclAnyName = ((SclObject)this).validSclAnyName(bType);
					status = validSclAnyName;
				}
				else {
					status = ValueUtil.TRUE_VALUE;
				}
				/*@Thrown*/ Object symbol_1;
				if (status) {
					symbol_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_type_32_attribute_32_shall_32_be_32_valid_32_in_32_AbstractDataAttribute_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(type);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_AbstractDataAttribute_c_c_AbstractDataAttribute_type_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractDataAttribute_count_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv AbstractDataAttribute_count_valid:
		 *   let
		 *     severity : Integer[1] = 'AbstractDataAttribute::AbstractDataAttribute_count_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.count <> null implies
		 *           self.validSclDACount(count)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'count attribute shall be valid in AbstractDataAttribute (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.count.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'AbstractDataAttribute::AbstractDataAttribute_count_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_AbstractDataAttribute_c_c_AbstractDataAttribute_count_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String count_0 = this.getCount();
				final /*@NonInvalid*/ boolean ne = count_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclDACount = ((SclObject)this).validSclDACount(count_0);
					status = validSclDACount;
				}
				else {
					status = ValueUtil.TRUE_VALUE;
				}
				/*@Thrown*/ Object symbol_1;
				if (status) {
					symbol_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_count_32_attribute_32_shall_32_be_32_valid_32_in_32_AbstractDataAttribute_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(count_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_AbstractDataAttribute_c_c_AbstractDataAttribute_count_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
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
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE:
				if (refersToEnumType != null)
					msgs = ((InternalEObject)refersToEnumType).eInverseRemove(this, SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE, EnumType.class, msgs);
				return basicSetRefersToEnumType((EnumType)otherEnd, msgs);
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVal()).basicAdd(otherEnd, msgs);
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
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE:
				return basicUnsetRefersToEnumType(msgs);
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL:
				return ((InternalEList<?>)getVal()).basicRemove(otherEnd, msgs);
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
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__BTYPE:
				return getBType();
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__COUNT:
				return getCount();
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__SADDR:
				return getSAddr();
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__TYPE:
				return getType();
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL_IMPORT:
				return getValImport();
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL_KIND:
				return getValKind();
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE:
				return getRefersToEnumType();
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL:
				return getVal();
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
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__BTYPE:
				setBType((String)newValue);
				return;
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__COUNT:
				setCount((String)newValue);
				return;
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__SADDR:
				setSAddr((String)newValue);
				return;
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__TYPE:
				setType((String)newValue);
				return;
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL_IMPORT:
				setValImport((Boolean)newValue);
				return;
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL_KIND:
				setValKind((ValKindEnum)newValue);
				return;
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE:
				setRefersToEnumType((EnumType)newValue);
				return;
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL:
				getVal().clear();
				getVal().addAll((Collection<? extends Val>)newValue);
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
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__BTYPE:
				unsetBType();
				return;
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__COUNT:
				unsetCount();
				return;
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__SADDR:
				unsetSAddr();
				return;
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__TYPE:
				unsetType();
				return;
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL_IMPORT:
				unsetValImport();
				return;
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL_KIND:
				unsetValKind();
				return;
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE:
				unsetRefersToEnumType();
				return;
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL:
				unsetVal();
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
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__BTYPE:
				return isSetBType();
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__COUNT:
				return isSetCount();
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__SADDR:
				return isSetSAddr();
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__TYPE:
				return isSetType();
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL_IMPORT:
				return isSetValImport();
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL_KIND:
				return isSetValKind();
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE:
				return isSetRefersToEnumType();
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL:
				return isSetVal();
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
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE___VALIDATE_ABSTRACT_DATA_ATTRIBUTE_BTYPE_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateAbstractDataAttribute_bType_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE___VALIDATE_ABSTRACT_DATA_ATTRIBUTE_BTYPE_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAbstractDataAttribute_bType_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE___VALIDATE_ABSTRACT_DATA_ATTRIBUTE_TYPE_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAbstractDataAttribute_type_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE___VALIDATE_ABSTRACT_DATA_ATTRIBUTE_COUNT_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAbstractDataAttribute_count_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (bType: ");
		if (bTypeESet) result.append(bType); else result.append("<unset>");
		result.append(", count: ");
		if (countESet) result.append(count); else result.append("<unset>");
		result.append(", sAddr: ");
		if (sAddrESet) result.append(sAddr); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", valImport: ");
		if (valImportESet) result.append(valImport); else result.append("<unset>");
		result.append(", valKind: ");
		if (valKindESet) result.append(valKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AbstractDataAttributeImpl
