/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      http://wdi.supelec.fr/software/RiseClipse/
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Val;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum;

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
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
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
