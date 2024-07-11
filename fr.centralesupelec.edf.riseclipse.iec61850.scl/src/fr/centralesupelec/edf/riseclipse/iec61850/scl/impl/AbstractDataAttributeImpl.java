/*
*************************************************************************
**  Copyright (c) 2016-2022 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
**
**  This file is part of the RiseClipse tool
**
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Val;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclUtilities;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataAttributeImpl#getRefersToDAType <em>Refers To DA Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataAttributeImpl#getReferredByFCDA <em>Referred By FCDA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataAttributeImpl#getReferredByExtRef <em>Referred By Ext Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataAttributeImpl#getReferredByDAI <em>Referred By DAI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataAttributeImpl#getReferredBySDI <em>Referred By SDI</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractDataAttributeImpl extends UnNamingImpl implements AbstractDataAttribute {
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
    protected static final String COUNT_EDEFAULT = "0";

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
    protected static final Boolean VAL_IMPORT_EDEFAULT = Boolean.FALSE;

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
     * @generated
     * @ordered
     */
    protected static final ValKindEnum VAL_KIND_EDEFAULT = ValKindEnum.SET;

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
    protected EList< Val > val;

    /**
     * The cached value of the '{@link #getRefersToDAType() <em>Refers To DA Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToDAType()
     * @generated
     * @ordered
     */
    protected DAType refersToDAType;

    /**
     * This is true if the Refers To DA Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToDATypeESet;

    /**
     * The cached value of the '{@link #getReferredByFCDA() <em>Referred By FCDA</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByFCDA()
     * @generated
     * @ordered
     */
    protected EList< FCDA > referredByFCDA;

    /**
     * The cached value of the '{@link #getReferredByExtRef() <em>Referred By Ext Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByExtRef()
     * @generated
     * @ordered
     */
    protected EList< ExtRef > referredByExtRef;

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
     * The cached value of the '{@link #getReferredByDAI() <em>Referred By DAI</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByDAI()
     * @generated
     * @ordered
     */
    protected EList< DAI > referredByDAI;

    /**
     * The cached value of the '{@link #getReferredBySDI() <em>Referred By SDI</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredBySDI()
     * @generated
     * @ordered
     */
    protected EList< SDI > referredBySDI;

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
    @Override
    public String getBType() {
        return bType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBType( String newBType ) {
        String oldBType = bType;
        bType = newBType;
        boolean oldBTypeESet = bTypeESet;
        bTypeESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__BTYPE, oldBType,
                    bType, !oldBTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBType() {
        String oldBType = bType;
        boolean oldBTypeESet = bTypeESet;
        bType = BTYPE_EDEFAULT;
        bTypeESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__BTYPE,
                    oldBType, BTYPE_EDEFAULT, oldBTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBType() {
        return bTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCount() {
        return count;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCount( String newCount ) {
        String oldCount = count;
        count = newCount;
        boolean oldCountESet = countESet;
        countESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__COUNT, oldCount,
                    count, !oldCountESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCount() {
        String oldCount = count;
        boolean oldCountESet = countESet;
        count = COUNT_EDEFAULT;
        countESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__COUNT,
                    oldCount, COUNT_EDEFAULT, oldCountESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCount() {
        return countESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSAddr() {
        return sAddr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSAddr( String newSAddr ) {
        String oldSAddr = sAddr;
        sAddr = newSAddr;
        boolean oldSAddrESet = sAddrESet;
        sAddrESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__SADDR, oldSAddr,
                    sAddr, !oldSAddrESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSAddr() {
        String oldSAddr = sAddr;
        boolean oldSAddrESet = sAddrESet;
        sAddr = SADDR_EDEFAULT;
        sAddrESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__SADDR,
                    oldSAddr, SADDR_EDEFAULT, oldSAddrESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSAddr() {
        return sAddrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__TYPE, oldType,
                    type, !oldTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__TYPE, oldType,
                    TYPE_EDEFAULT, oldTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getValImport() {
        return valImport;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValImport( Boolean newValImport ) {
        Boolean oldValImport = valImport;
        valImport = newValImport;
        boolean oldValImportESet = valImportESet;
        valImportESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL_IMPORT,
                    oldValImport, valImport, !oldValImportESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValImport() {
        Boolean oldValImport = valImport;
        boolean oldValImportESet = valImportESet;
        valImport = VAL_IMPORT_EDEFAULT;
        valImportESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL_IMPORT,
                    oldValImport, VAL_IMPORT_EDEFAULT, oldValImportESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValImport() {
        return valImportESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValKindEnum getValKind() {
        return valKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValKind( ValKindEnum newValKind ) {
        ValKindEnum oldValKind = valKind;
        valKind = newValKind == null ? VAL_KIND_EDEFAULT : newValKind;
        boolean oldValKindESet = valKindESet;
        valKindESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL_KIND,
                    oldValKind, valKind, !oldValKindESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValKind() {
        ValKindEnum oldValKind = valKind;
        boolean oldValKindESet = valKindESet;
        valKind = VAL_KIND_EDEFAULT;
        valKindESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL_KIND,
                    oldValKind, VAL_KIND_EDEFAULT, oldValKindESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValKind() {
        return valKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnumType getRefersToEnumType() {
        return refersToEnumType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToEnumType( EnumType newRefersToEnumType, NotificationChain msgs ) {
        EnumType oldRefersToEnumType = refersToEnumType;
        refersToEnumType = newRefersToEnumType;
        boolean oldRefersToEnumTypeESet = refersToEnumTypeESet;
        refersToEnumTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE, oldRefersToEnumType, newRefersToEnumType,
                    !oldRefersToEnumTypeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToEnumType( EnumType newRefersToEnumType ) {
        if( newRefersToEnumType != refersToEnumType ) {
            NotificationChain msgs = null;
            if( refersToEnumType != null ) {
                msgs = ( ( InternalEObject ) refersToEnumType ).eInverseRemove( this,
                        SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE, EnumType.class, msgs );
            }
            if( newRefersToEnumType != null ) {
                msgs = ( ( InternalEObject ) newRefersToEnumType ).eInverseAdd( this,
                        SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE, EnumType.class, msgs );
            }
            msgs = basicSetRefersToEnumType( newRefersToEnumType, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToEnumTypeESet = refersToEnumTypeESet;
            refersToEnumTypeESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE, newRefersToEnumType,
                        newRefersToEnumType, !oldRefersToEnumTypeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToEnumType( NotificationChain msgs ) {
        EnumType oldRefersToEnumType = refersToEnumType;
        refersToEnumType = null;
        boolean oldRefersToEnumTypeESet = refersToEnumTypeESet;
        refersToEnumTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE, oldRefersToEnumType, null,
                    oldRefersToEnumTypeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToEnumType() {
        if( refersToEnumType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToEnumType ).eInverseRemove( this,
                    SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE, EnumType.class, msgs );
            msgs = basicUnsetRefersToEnumType( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToEnumTypeESet = refersToEnumTypeESet;
            refersToEnumTypeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE, null, null,
                        oldRefersToEnumTypeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToEnumType() {
        return refersToEnumTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Val > getVal() {
        if( val == null ) {
            val = new EObjectContainmentWithInverseEList.Unsettable< >( Val.class, this,
                    SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL, SclPackage.VAL__PARENT_ABSTRACT_DATA_ATTRIBUTE );
        }
        return val;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVal() {
        if( val != null ) {
            ( ( InternalEList.Unsettable< ? > ) val ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVal() {
        return val != null && ( ( InternalEList.Unsettable< ? > ) val ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DAType getRefersToDAType() {
        return refersToDAType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToDAType( DAType newRefersToDAType, NotificationChain msgs ) {
        DAType oldRefersToDAType = refersToDAType;
        refersToDAType = newRefersToDAType;
        boolean oldRefersToDATypeESet = refersToDATypeESet;
        refersToDATypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_DA_TYPE, oldRefersToDAType, newRefersToDAType,
                    !oldRefersToDATypeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToDAType( DAType newRefersToDAType ) {
        if( newRefersToDAType != refersToDAType ) {
            NotificationChain msgs = null;
            if( refersToDAType != null ) {
                msgs = ( ( InternalEObject ) refersToDAType ).eInverseRemove( this,
                        SclPackage.DA_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE, DAType.class, msgs );
            }
            if( newRefersToDAType != null ) {
                msgs = ( ( InternalEObject ) newRefersToDAType ).eInverseAdd( this,
                        SclPackage.DA_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE, DAType.class, msgs );
            }
            msgs = basicSetRefersToDAType( newRefersToDAType, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToDATypeESet = refersToDATypeESet;
            refersToDATypeESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_DA_TYPE, newRefersToDAType, newRefersToDAType,
                        !oldRefersToDATypeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToDAType( NotificationChain msgs ) {
        DAType oldRefersToDAType = refersToDAType;
        refersToDAType = null;
        boolean oldRefersToDATypeESet = refersToDATypeESet;
        refersToDATypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_DA_TYPE, oldRefersToDAType, null,
                    oldRefersToDATypeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToDAType() {
        if( refersToDAType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToDAType ).eInverseRemove( this,
                    SclPackage.DA_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE, DAType.class, msgs );
            msgs = basicUnsetRefersToDAType( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToDATypeESet = refersToDATypeESet;
            refersToDATypeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_DA_TYPE, null, null, oldRefersToDATypeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToDAType() {
        return refersToDATypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FCDA > getReferredByFCDA() {
        if( referredByFCDA == null ) {
            referredByFCDA = new EObjectWithInverseEList.Unsettable.ManyInverse< >( FCDA.class, this,
                    SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_FCDA,
                    SclPackage.FCDA__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE );
        }
        return referredByFCDA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByFCDA() {
        if( referredByFCDA != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByFCDA ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByFCDA() {
        return referredByFCDA != null && ( ( InternalEList.Unsettable< ? > ) referredByFCDA ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ExtRef > getReferredByExtRef() {
        if( referredByExtRef == null ) {
            referredByExtRef = new EObjectWithInverseEList.Unsettable< >( ExtRef.class, this,
                    SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_EXT_REF,
                    SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE );
        }
        return referredByExtRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByExtRef() {
        if( referredByExtRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByExtRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByExtRef() {
        return referredByExtRef != null && ( ( InternalEList.Unsettable< ? > ) referredByExtRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__NAME, oldName,
                    name, !oldNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ABSTRACT_DATA_ATTRIBUTE__NAME, oldName,
                    NAME_EDEFAULT, oldNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DAI > getReferredByDAI() {
        if( referredByDAI == null ) {
            referredByDAI = new EObjectWithInverseEList.Unsettable< >( DAI.class, this,
                    SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_DAI,
                    SclPackage.DAI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE );
        }
        return referredByDAI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByDAI() {
        if( referredByDAI != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByDAI ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByDAI() {
        return referredByDAI != null && ( ( InternalEList.Unsettable< ? > ) referredByDAI ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SDI > getReferredBySDI() {
        if( referredBySDI == null ) {
            referredBySDI = new EObjectWithInverseEList.Unsettable< >( SDI.class, this,
                    SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_SDI,
                    SclPackage.SDI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE );
        }
        return referredBySDI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredBySDI() {
        if( referredBySDI != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredBySDI ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredBySDI() {
        return referredBySDI != null && ( ( InternalEList.Unsettable< ? > ) referredBySDI ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE:
            if( refersToEnumType != null ) {
                msgs = ( ( InternalEObject ) refersToEnumType ).eInverseRemove( this,
                        SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE, EnumType.class, msgs );
            }
            return basicSetRefersToEnumType( ( EnumType ) otherEnd, msgs );
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getVal() ).basicAdd( otherEnd, msgs );
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_DA_TYPE:
            if( refersToDAType != null ) {
                msgs = ( ( InternalEObject ) refersToDAType ).eInverseRemove( this,
                        SclPackage.DA_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE, DAType.class, msgs );
            }
            return basicSetRefersToDAType( ( DAType ) otherEnd, msgs );
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_FCDA:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByFCDA() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_EXT_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByExtRef() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_DAI:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByDAI() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_SDI:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredBySDI() )
                    .basicAdd( otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE:
            return basicUnsetRefersToEnumType( msgs );
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL:
            return ( ( InternalEList< ? > ) getVal() ).basicRemove( otherEnd, msgs );
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_DA_TYPE:
            return basicUnsetRefersToDAType( msgs );
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_FCDA:
            return ( ( InternalEList< ? > ) getReferredByFCDA() ).basicRemove( otherEnd, msgs );
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_EXT_REF:
            return ( ( InternalEList< ? > ) getReferredByExtRef() ).basicRemove( otherEnd, msgs );
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_DAI:
            return ( ( InternalEList< ? > ) getReferredByDAI() ).basicRemove( otherEnd, msgs );
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_SDI:
            return ( ( InternalEList< ? > ) getReferredBySDI() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
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
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_DA_TYPE:
            return getRefersToDAType();
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_FCDA:
            return getReferredByFCDA();
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_EXT_REF:
            return getReferredByExtRef();
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__NAME:
            return getName();
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_DAI:
            return getReferredByDAI();
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_SDI:
            return getReferredBySDI();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__BTYPE:
            setBType( ( String ) newValue );
            return;
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__COUNT:
            setCount( ( String ) newValue );
            return;
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__SADDR:
            setSAddr( ( String ) newValue );
            return;
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__TYPE:
            setType( ( String ) newValue );
            return;
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL_IMPORT:
            setValImport( ( Boolean ) newValue );
            return;
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL_KIND:
            setValKind( ( ValKindEnum ) newValue );
            return;
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE:
            setRefersToEnumType( ( EnumType ) newValue );
            return;
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL:
            getVal().clear();
            getVal().addAll( ( Collection< ? extends Val > ) newValue );
            return;
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_DA_TYPE:
            setRefersToDAType( ( DAType ) newValue );
            return;
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_FCDA:
            getReferredByFCDA().clear();
            getReferredByFCDA().addAll( ( Collection< ? extends FCDA > ) newValue );
            return;
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_EXT_REF:
            getReferredByExtRef().clear();
            getReferredByExtRef().addAll( ( Collection< ? extends ExtRef > ) newValue );
            return;
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__NAME:
            setName( ( String ) newValue );
            return;
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_DAI:
            getReferredByDAI().clear();
            getReferredByDAI().addAll( ( Collection< ? extends DAI > ) newValue );
            return;
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_SDI:
            getReferredBySDI().clear();
            getReferredBySDI().addAll( ( Collection< ? extends SDI > ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
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
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_DA_TYPE:
            unsetRefersToDAType();
            return;
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_FCDA:
            unsetReferredByFCDA();
            return;
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_EXT_REF:
            unsetReferredByExtRef();
            return;
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__NAME:
            unsetName();
            return;
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_DAI:
            unsetReferredByDAI();
            return;
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_SDI:
            unsetReferredBySDI();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
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
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_DA_TYPE:
            return isSetRefersToDAType();
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_FCDA:
            return isSetReferredByFCDA();
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_EXT_REF:
            return isSetReferredByExtRef();
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__NAME:
            return isSetName();
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_DAI:
            return isSetReferredByDAI();
        case SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_SDI:
            return isSetReferredBySDI();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (bType: " );
        if( bTypeESet ) {
            result.append( bType );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", count: " );
        if( countESet ) {
            result.append( count );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", sAddr: " );
        if( sAddrESet ) {
            result.append( sAddr );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", type: " );
        if( typeESet ) {
            result.append( type );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", valImport: " );
        if( valImportESet ) {
            result.append( valImport );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", valKind: " );
        if( valKindESet ) {
            result.append( valKind );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", name: " );
        if( nameESet ) {
            result.append( name );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        //@formatter:off

        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "AbstractDataAttributeImpl.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        // desc                 Some descriptive text for the attribute
        // name                 The attribute name; the type tAttributeEnum restricts to the attribute names from IEC 61850-7-3, plus new ones starting with lower case letters
        // fc                   The functional constraint for this attribute; fc=SE always also implies fc=SG; fc=SG means that the values are visible, but not editable
        // dchg, qchg, dupd     Defines which trigger options are supported by the attribute (value true means supported)
        // sAddr                an optional short address of this DO attribute
        // bType                The basic type of the attribute, taken from tBasicTypeEnum
        // type                 Only used if bType= Enum or bType = Struct to refer to the appropriate enumeration type or DAType (attribute structure) definition
        // count                Optional. Shall state the number of array elements or reference the attribute stating this number in case that this attribute is an array.
        //                      A referenced attribute shall exist in the same type definition. The default value 0 states that the attribute is no array.
        // valKind              Determines how the value shall be interpreted if any is given

        if( !( "Enum".equals( getBType() ) || "Struct".equals( getBType() ) ) ) {
            return;
        }
        // String messagePrefix = "while resolving link from AbstractDataAttribute: ";

        if( ( getType() == null ) || getType().isEmpty() ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, "type is missing" );
            return;
        }

        DataTypeTemplates dtt = SclUtilities.getSCL( this ).getDataTypeTemplates();
        if( dtt == null ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, "DataTypeTemplates is missing" );
            return;
        }

        if( "Enum".equals( getBType() ) ) {

            // find an EnumType with
            //   EnumType.id == DA.type
            List< EnumType > res = dtt
                    .getEnumType()
                    .stream()
                    .filter( et -> getType().equals( et.getId() ) )
                    .collect( Collectors.toList() );

            if( res.size() != 1 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                //         " EnumType( id = ", getType(), " )" );
                return;
            }
            setRefersToEnumType( res.get( 0 ) );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "AbstractDataAttribute refers to EnumType( id = ", getType(), " ) on line ",
                    getRefersToEnumType().getLineNumber() );
        }
        else if( "Struct".equals( getBType() ) ) {

            // find an DAType with
            //   DAType.id == DA.type
            List< DAType > res = dtt
                    .getDAType()
                    .stream()
                    .filter( et -> getType().equals( et.getId() ) )
                    .collect( Collectors.toList() );

            if( res.size() != 1 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                //         " DAType( id = ", getType(), " )" );
                return;
            }
            setRefersToDAType( res.get( 0 ) );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "AbstractDataAttribute refers to EnumType( id = ", getType(), " ) on line ",
                    getRefersToDAType().getLineNumber() );
        }

        //@formatter:on
    }

} //AbstractDataAttributeImpl
