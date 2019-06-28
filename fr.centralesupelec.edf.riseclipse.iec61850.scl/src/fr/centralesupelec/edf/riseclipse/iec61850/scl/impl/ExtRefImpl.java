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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDesc;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Control;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclUtilities;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ext Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getDaName <em>Da Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getDoName <em>Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getIntAddr <em>Int Addr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getSrcCBName <em>Src CB Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getSrcLDInst <em>Src LD Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getSrcLNClass <em>Src LN Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getSrcLNInst <em>Src LN Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getSrcPrefix <em>Src Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getParentInputs <em>Parent Inputs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getRefersToAbstractDataObject <em>Refers To Abstract Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getPServT <em>PServ T</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getPLN <em>PLN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getPDO <em>PDO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getPDA <em>PDA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getRefersToControl <em>Refers To Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtRefImpl extends BaseElementImpl implements ExtRef {
    /**
     * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDesc()
     * @generated
     * @ordered
     */
    protected static final String DESC_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDesc()
     * @generated
     * @ordered
     */
    protected String desc = DESC_EDEFAULT;

    /**
     * This is true if the Desc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean descESet;

    /**
     * The default value of the '{@link #getDaName() <em>Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDaName()
     * @generated
     * @ordered
     */
    protected static final String DA_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDaName() <em>Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDaName()
     * @generated
     * @ordered
     */
    protected String daName = DA_NAME_EDEFAULT;

    /**
     * This is true if the Da Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean daNameESet;

    /**
     * The default value of the '{@link #getDoName() <em>Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDoName()
     * @generated
     * @ordered
     */
    protected static final String DO_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDoName() <em>Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDoName()
     * @generated
     * @ordered
     */
    protected String doName = DO_NAME_EDEFAULT;

    /**
     * This is true if the Do Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean doNameESet;

    /**
     * The default value of the '{@link #getIedName() <em>Ied Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIedName()
     * @generated
     * @ordered
     */
    protected static final String IED_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIedName() <em>Ied Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIedName()
     * @generated
     * @ordered
     */
    protected String iedName = IED_NAME_EDEFAULT;

    /**
     * This is true if the Ied Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iedNameESet;

    /**
     * The default value of the '{@link #getIntAddr() <em>Int Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntAddr()
     * @generated
     * @ordered
     */
    protected static final String INT_ADDR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIntAddr() <em>Int Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntAddr()
     * @generated
     * @ordered
     */
    protected String intAddr = INT_ADDR_EDEFAULT;

    /**
     * This is true if the Int Addr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean intAddrESet;

    /**
     * The default value of the '{@link #getLdInst() <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLdInst()
     * @generated
     * @ordered
     */
    protected static final String LD_INST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLdInst() <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLdInst()
     * @generated
     * @ordered
     */
    protected String ldInst = LD_INST_EDEFAULT;

    /**
     * This is true if the Ld Inst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ldInstESet;

    /**
     * The default value of the '{@link #getLnClass() <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnClass()
     * @generated
     * @ordered
     */
    protected static final String LN_CLASS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLnClass() <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnClass()
     * @generated
     * @ordered
     */
    protected String lnClass = LN_CLASS_EDEFAULT;

    /**
     * This is true if the Ln Class attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lnClassESet;

    /**
     * The default value of the '{@link #getLnInst() <em>Ln Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnInst()
     * @generated
     * @ordered
     */
    protected static final String LN_INST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLnInst() <em>Ln Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnInst()
     * @generated
     * @ordered
     */
    protected String lnInst = LN_INST_EDEFAULT;

    /**
     * This is true if the Ln Inst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lnInstESet;

    /**
     * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected static final String PREFIX_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected String prefix = PREFIX_EDEFAULT;

    /**
     * This is true if the Prefix attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean prefixESet;

    /**
     * The default value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceType()
     * @generated NOT because there is no default value in SCL
     * @ordered
     */
    protected static final ServiceType SERVICE_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceType()
     * @generated
     * @ordered
     */
    protected ServiceType serviceType = SERVICE_TYPE_EDEFAULT;

    /**
     * This is true if the Service Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serviceTypeESet;

    /**
     * The default value of the '{@link #getSrcCBName() <em>Src CB Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrcCBName()
     * @generated
     * @ordered
     */
    protected static final String SRC_CB_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSrcCBName() <em>Src CB Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrcCBName()
     * @generated
     * @ordered
     */
    protected String srcCBName = SRC_CB_NAME_EDEFAULT;

    /**
     * This is true if the Src CB Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean srcCBNameESet;

    /**
     * The default value of the '{@link #getSrcLDInst() <em>Src LD Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrcLDInst()
     * @generated
     * @ordered
     */
    protected static final String SRC_LD_INST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSrcLDInst() <em>Src LD Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrcLDInst()
     * @generated
     * @ordered
     */
    protected String srcLDInst = SRC_LD_INST_EDEFAULT;

    /**
     * This is true if the Src LD Inst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean srcLDInstESet;

    /**
     * The default value of the '{@link #getSrcLNClass() <em>Src LN Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrcLNClass()
     * @generated
     * @ordered
     */
    protected static final String SRC_LN_CLASS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSrcLNClass() <em>Src LN Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrcLNClass()
     * @generated
     * @ordered
     */
    protected String srcLNClass = SRC_LN_CLASS_EDEFAULT;

    /**
     * This is true if the Src LN Class attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean srcLNClassESet;

    /**
     * The default value of the '{@link #getSrcLNInst() <em>Src LN Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrcLNInst()
     * @generated
     * @ordered
     */
    protected static final String SRC_LN_INST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSrcLNInst() <em>Src LN Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrcLNInst()
     * @generated
     * @ordered
     */
    protected String srcLNInst = SRC_LN_INST_EDEFAULT;

    /**
     * This is true if the Src LN Inst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean srcLNInstESet;

    /**
     * The default value of the '{@link #getSrcPrefix() <em>Src Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrcPrefix()
     * @generated
     * @ordered
     */
    protected static final String SRC_PREFIX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSrcPrefix() <em>Src Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrcPrefix()
     * @generated
     * @ordered
     */
    protected String srcPrefix = SRC_PREFIX_EDEFAULT;

    /**
     * This is true if the Src Prefix attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean srcPrefixESet;

    /**
     * The cached value of the '{@link #getRefersToAbstractDataAttribute() <em>Refers To Abstract Data Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToAbstractDataAttribute()
     * @generated
     * @ordered
     */
    protected AbstractDataAttribute refersToAbstractDataAttribute;

    /**
     * This is true if the Refers To Abstract Data Attribute reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToAbstractDataAttributeESet;

    /**
     * The cached value of the '{@link #getRefersToAbstractDataObject() <em>Refers To Abstract Data Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToAbstractDataObject()
     * @generated
     * @ordered
     */
    protected AbstractDataObject refersToAbstractDataObject;

    /**
     * This is true if the Refers To Abstract Data Object reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToAbstractDataObjectESet;

    /**
     * The default value of the '{@link #getPServT() <em>PServ T</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPServT()
     * @generated
     * @ordered
     */
    protected static final ServiceType PSERV_T_EDEFAULT = ServiceType.POLL;

    /**
     * The cached value of the '{@link #getPServT() <em>PServ T</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPServT()
     * @generated
     * @ordered
     */
    protected ServiceType pServT = PSERV_T_EDEFAULT;

    /**
     * This is true if the PServ T attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pServTESet;

    /**
     * The default value of the '{@link #getPLN() <em>PLN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPLN()
     * @generated
     * @ordered
     */
    protected static final String PLN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPLN() <em>PLN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPLN()
     * @generated
     * @ordered
     */
    protected String pLN = PLN_EDEFAULT;

    /**
     * This is true if the PLN attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pLNESet;

    /**
     * The default value of the '{@link #getPDO() <em>PDO</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPDO()
     * @generated
     * @ordered
     */
    protected static final String PDO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPDO() <em>PDO</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPDO()
     * @generated
     * @ordered
     */
    protected String pDO = PDO_EDEFAULT;

    /**
     * This is true if the PDO attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pDOESet;

    /**
     * The default value of the '{@link #getPDA() <em>PDA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPDA()
     * @generated
     * @ordered
     */
    protected static final String PDA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPDA() <em>PDA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPDA()
     * @generated
     * @ordered
     */
    protected String pDA = PDA_EDEFAULT;

    /**
     * This is true if the PDA attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pDAESet;

    /**
     * The cached value of the '{@link #getRefersToControl() <em>Refers To Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToControl()
     * @generated
     * @ordered
     */
    protected Control refersToControl;

    /**
     * This is true if the Refers To Control reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToControlESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExtRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getExtRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDaName() {
        return daName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDaName( String newDaName ) {
        String oldDaName = daName;
        daName = newDaName;
        boolean oldDaNameESet = daNameESet;
        daNameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__DA_NAME, oldDaName, daName, !oldDaNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDaName() {
        String oldDaName = daName;
        boolean oldDaNameESet = daNameESet;
        daName = DA_NAME_EDEFAULT;
        daNameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__DA_NAME, oldDaName, DA_NAME_EDEFAULT, oldDaNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDaName() {
        return daNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDoName() {
        return doName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDoName( String newDoName ) {
        String oldDoName = doName;
        doName = newDoName;
        boolean oldDoNameESet = doNameESet;
        doNameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__DO_NAME, oldDoName, doName, !oldDoNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDoName() {
        String oldDoName = doName;
        boolean oldDoNameESet = doNameESet;
        doName = DO_NAME_EDEFAULT;
        doNameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__DO_NAME, oldDoName, DO_NAME_EDEFAULT, oldDoNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDoName() {
        return doNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIedName() {
        return iedName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIedName( String newIedName ) {
        String oldIedName = iedName;
        iedName = newIedName;
        boolean oldIedNameESet = iedNameESet;
        iedNameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__IED_NAME, oldIedName, iedName, !oldIedNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIedName() {
        String oldIedName = iedName;
        boolean oldIedNameESet = iedNameESet;
        iedName = IED_NAME_EDEFAULT;
        iedNameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__IED_NAME, oldIedName, IED_NAME_EDEFAULT, oldIedNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIedName() {
        return iedNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIntAddr() {
        return intAddr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIntAddr( String newIntAddr ) {
        String oldIntAddr = intAddr;
        intAddr = newIntAddr;
        boolean oldIntAddrESet = intAddrESet;
        intAddrESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__INT_ADDR, oldIntAddr, intAddr, !oldIntAddrESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIntAddr() {
        String oldIntAddr = intAddr;
        boolean oldIntAddrESet = intAddrESet;
        intAddr = INT_ADDR_EDEFAULT;
        intAddrESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__INT_ADDR, oldIntAddr, INT_ADDR_EDEFAULT, oldIntAddrESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIntAddr() {
        return intAddrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLdInst() {
        return ldInst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLdInst( String newLdInst ) {
        String oldLdInst = ldInst;
        ldInst = newLdInst;
        boolean oldLdInstESet = ldInstESet;
        ldInstESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__LD_INST, oldLdInst, ldInst, !oldLdInstESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLdInst() {
        String oldLdInst = ldInst;
        boolean oldLdInstESet = ldInstESet;
        ldInst = LD_INST_EDEFAULT;
        ldInstESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__LD_INST, oldLdInst, LD_INST_EDEFAULT, oldLdInstESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLdInst() {
        return ldInstESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLnClass() {
        return lnClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLnClass( String newLnClass ) {
        String oldLnClass = lnClass;
        lnClass = newLnClass;
        boolean oldLnClassESet = lnClassESet;
        lnClassESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__LN_CLASS, oldLnClass, lnClass, !oldLnClassESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLnClass() {
        String oldLnClass = lnClass;
        boolean oldLnClassESet = lnClassESet;
        lnClass = LN_CLASS_EDEFAULT;
        lnClassESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__LN_CLASS, oldLnClass, LN_CLASS_EDEFAULT, oldLnClassESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLnClass() {
        return lnClassESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLnInst() {
        return lnInst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLnInst( String newLnInst ) {
        String oldLnInst = lnInst;
        lnInst = newLnInst;
        boolean oldLnInstESet = lnInstESet;
        lnInstESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__LN_INST, oldLnInst, lnInst, !oldLnInstESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLnInst() {
        String oldLnInst = lnInst;
        boolean oldLnInstESet = lnInstESet;
        lnInst = LN_INST_EDEFAULT;
        lnInstESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__LN_INST, oldLnInst, LN_INST_EDEFAULT, oldLnInstESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLnInst() {
        return lnInstESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPrefix() {
        return prefix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPrefix( String newPrefix ) {
        String oldPrefix = prefix;
        prefix = newPrefix;
        boolean oldPrefixESet = prefixESet;
        prefixESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__PREFIX, oldPrefix, prefix, !oldPrefixESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrefix() {
        String oldPrefix = prefix;
        boolean oldPrefixESet = prefixESet;
        prefix = PREFIX_EDEFAULT;
        prefixESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__PREFIX, oldPrefix, PREFIX_EDEFAULT, oldPrefixESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrefix() {
        return prefixESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceType( ServiceType newServiceType ) {
        ServiceType oldServiceType = serviceType;
        serviceType = newServiceType == null ? SERVICE_TYPE_EDEFAULT : newServiceType;
        boolean oldServiceTypeESet = serviceTypeESet;
        serviceTypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__SERVICE_TYPE, oldServiceType, serviceType, !oldServiceTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServiceType() {
        ServiceType oldServiceType = serviceType;
        boolean oldServiceTypeESet = serviceTypeESet;
        serviceType = SERVICE_TYPE_EDEFAULT;
        serviceTypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__SERVICE_TYPE, oldServiceType, SERVICE_TYPE_EDEFAULT, oldServiceTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceType() {
        return serviceTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSrcCBName() {
        return srcCBName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSrcCBName( String newSrcCBName ) {
        String oldSrcCBName = srcCBName;
        srcCBName = newSrcCBName;
        boolean oldSrcCBNameESet = srcCBNameESet;
        srcCBNameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__SRC_CB_NAME, oldSrcCBName, srcCBName, !oldSrcCBNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSrcCBName() {
        String oldSrcCBName = srcCBName;
        boolean oldSrcCBNameESet = srcCBNameESet;
        srcCBName = SRC_CB_NAME_EDEFAULT;
        srcCBNameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__SRC_CB_NAME, oldSrcCBName, SRC_CB_NAME_EDEFAULT, oldSrcCBNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSrcCBName() {
        return srcCBNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSrcLDInst() {
        return srcLDInst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSrcLDInst( String newSrcLDInst ) {
        String oldSrcLDInst = srcLDInst;
        srcLDInst = newSrcLDInst;
        boolean oldSrcLDInstESet = srcLDInstESet;
        srcLDInstESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__SRC_LD_INST, oldSrcLDInst, srcLDInst, !oldSrcLDInstESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSrcLDInst() {
        String oldSrcLDInst = srcLDInst;
        boolean oldSrcLDInstESet = srcLDInstESet;
        srcLDInst = SRC_LD_INST_EDEFAULT;
        srcLDInstESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__SRC_LD_INST, oldSrcLDInst, SRC_LD_INST_EDEFAULT, oldSrcLDInstESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSrcLDInst() {
        return srcLDInstESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSrcLNClass() {
        return srcLNClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSrcLNClass( String newSrcLNClass ) {
        String oldSrcLNClass = srcLNClass;
        srcLNClass = newSrcLNClass;
        boolean oldSrcLNClassESet = srcLNClassESet;
        srcLNClassESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__SRC_LN_CLASS, oldSrcLNClass, srcLNClass, !oldSrcLNClassESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSrcLNClass() {
        String oldSrcLNClass = srcLNClass;
        boolean oldSrcLNClassESet = srcLNClassESet;
        srcLNClass = SRC_LN_CLASS_EDEFAULT;
        srcLNClassESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__SRC_LN_CLASS, oldSrcLNClass, SRC_LN_CLASS_EDEFAULT, oldSrcLNClassESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSrcLNClass() {
        return srcLNClassESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSrcLNInst() {
        return srcLNInst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSrcLNInst( String newSrcLNInst ) {
        String oldSrcLNInst = srcLNInst;
        srcLNInst = newSrcLNInst;
        boolean oldSrcLNInstESet = srcLNInstESet;
        srcLNInstESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__SRC_LN_INST, oldSrcLNInst, srcLNInst, !oldSrcLNInstESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSrcLNInst() {
        String oldSrcLNInst = srcLNInst;
        boolean oldSrcLNInstESet = srcLNInstESet;
        srcLNInst = SRC_LN_INST_EDEFAULT;
        srcLNInstESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__SRC_LN_INST, oldSrcLNInst, SRC_LN_INST_EDEFAULT, oldSrcLNInstESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSrcLNInst() {
        return srcLNInstESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSrcPrefix() {
        return srcPrefix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSrcPrefix( String newSrcPrefix ) {
        String oldSrcPrefix = srcPrefix;
        srcPrefix = newSrcPrefix;
        boolean oldSrcPrefixESet = srcPrefixESet;
        srcPrefixESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__SRC_PREFIX, oldSrcPrefix, srcPrefix, !oldSrcPrefixESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSrcPrefix() {
        String oldSrcPrefix = srcPrefix;
        boolean oldSrcPrefixESet = srcPrefixESet;
        srcPrefix = SRC_PREFIX_EDEFAULT;
        srcPrefixESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__SRC_PREFIX, oldSrcPrefix, SRC_PREFIX_EDEFAULT, oldSrcPrefixESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSrcPrefix() {
        return srcPrefixESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Inputs getParentInputs() {
        if (eContainerFeatureID() != SclPackage.EXT_REF__PARENT_INPUTS) return null;
        return (Inputs)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentInputs(Inputs newParentInputs, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentInputs, SclPackage.EXT_REF__PARENT_INPUTS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentInputs(Inputs newParentInputs) {
        if (newParentInputs != eInternalContainer() || (eContainerFeatureID() != SclPackage.EXT_REF__PARENT_INPUTS && newParentInputs != null)) {
            if (EcoreUtil.isAncestor(this, newParentInputs))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentInputs != null)
                msgs = ((InternalEObject)newParentInputs).eInverseAdd(this, SclPackage.INPUTS__EXT_REF, Inputs.class, msgs);
            msgs = basicSetParentInputs(newParentInputs, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__PARENT_INPUTS, newParentInputs, newParentInputs));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AbstractDataAttribute getRefersToAbstractDataAttribute() {
        return refersToAbstractDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToAbstractDataAttribute(AbstractDataAttribute newRefersToAbstractDataAttribute, NotificationChain msgs) {
        AbstractDataAttribute oldRefersToAbstractDataAttribute = refersToAbstractDataAttribute;
        refersToAbstractDataAttribute = newRefersToAbstractDataAttribute;
        boolean oldRefersToAbstractDataAttributeESet = refersToAbstractDataAttributeESet;
        refersToAbstractDataAttributeESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE, oldRefersToAbstractDataAttribute, newRefersToAbstractDataAttribute, !oldRefersToAbstractDataAttributeESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToAbstractDataAttribute(AbstractDataAttribute newRefersToAbstractDataAttribute) {
        if (newRefersToAbstractDataAttribute != refersToAbstractDataAttribute) {
            NotificationChain msgs = null;
            if (refersToAbstractDataAttribute != null)
                msgs = ((InternalEObject)refersToAbstractDataAttribute).eInverseRemove(this, SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_EXT_REF, AbstractDataAttribute.class, msgs);
            if (newRefersToAbstractDataAttribute != null)
                msgs = ((InternalEObject)newRefersToAbstractDataAttribute).eInverseAdd(this, SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_EXT_REF, AbstractDataAttribute.class, msgs);
            msgs = basicSetRefersToAbstractDataAttribute(newRefersToAbstractDataAttribute, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToAbstractDataAttributeESet = refersToAbstractDataAttributeESet;
            refersToAbstractDataAttributeESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE, newRefersToAbstractDataAttribute, newRefersToAbstractDataAttribute, !oldRefersToAbstractDataAttributeESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToAbstractDataAttribute(NotificationChain msgs) {
        AbstractDataAttribute oldRefersToAbstractDataAttribute = refersToAbstractDataAttribute;
        refersToAbstractDataAttribute = null;
        boolean oldRefersToAbstractDataAttributeESet = refersToAbstractDataAttributeESet;
        refersToAbstractDataAttributeESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE, oldRefersToAbstractDataAttribute, null, oldRefersToAbstractDataAttributeESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToAbstractDataAttribute() {
        if (refersToAbstractDataAttribute != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)refersToAbstractDataAttribute).eInverseRemove(this, SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_EXT_REF, AbstractDataAttribute.class, msgs);
            msgs = basicUnsetRefersToAbstractDataAttribute(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToAbstractDataAttributeESet = refersToAbstractDataAttributeESet;
            refersToAbstractDataAttributeESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE, null, null, oldRefersToAbstractDataAttributeESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToAbstractDataAttribute() {
        return refersToAbstractDataAttributeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AbstractDataObject getRefersToAbstractDataObject() {
        return refersToAbstractDataObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToAbstractDataObject(AbstractDataObject newRefersToAbstractDataObject, NotificationChain msgs) {
        AbstractDataObject oldRefersToAbstractDataObject = refersToAbstractDataObject;
        refersToAbstractDataObject = newRefersToAbstractDataObject;
        boolean oldRefersToAbstractDataObjectESet = refersToAbstractDataObjectESet;
        refersToAbstractDataObjectESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_OBJECT, oldRefersToAbstractDataObject, newRefersToAbstractDataObject, !oldRefersToAbstractDataObjectESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToAbstractDataObject(AbstractDataObject newRefersToAbstractDataObject) {
        if (newRefersToAbstractDataObject != refersToAbstractDataObject) {
            NotificationChain msgs = null;
            if (refersToAbstractDataObject != null)
                msgs = ((InternalEObject)refersToAbstractDataObject).eInverseRemove(this, SclPackage.ABSTRACT_DATA_OBJECT__REFERRED_BY_EXT_REF, AbstractDataObject.class, msgs);
            if (newRefersToAbstractDataObject != null)
                msgs = ((InternalEObject)newRefersToAbstractDataObject).eInverseAdd(this, SclPackage.ABSTRACT_DATA_OBJECT__REFERRED_BY_EXT_REF, AbstractDataObject.class, msgs);
            msgs = basicSetRefersToAbstractDataObject(newRefersToAbstractDataObject, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToAbstractDataObjectESet = refersToAbstractDataObjectESet;
            refersToAbstractDataObjectESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_OBJECT, newRefersToAbstractDataObject, newRefersToAbstractDataObject, !oldRefersToAbstractDataObjectESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToAbstractDataObject(NotificationChain msgs) {
        AbstractDataObject oldRefersToAbstractDataObject = refersToAbstractDataObject;
        refersToAbstractDataObject = null;
        boolean oldRefersToAbstractDataObjectESet = refersToAbstractDataObjectESet;
        refersToAbstractDataObjectESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_OBJECT, oldRefersToAbstractDataObject, null, oldRefersToAbstractDataObjectESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToAbstractDataObject() {
        if (refersToAbstractDataObject != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)refersToAbstractDataObject).eInverseRemove(this, SclPackage.ABSTRACT_DATA_OBJECT__REFERRED_BY_EXT_REF, AbstractDataObject.class, msgs);
            msgs = basicUnsetRefersToAbstractDataObject(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToAbstractDataObjectESet = refersToAbstractDataObjectESet;
            refersToAbstractDataObjectESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_OBJECT, null, null, oldRefersToAbstractDataObjectESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToAbstractDataObject() {
        return refersToAbstractDataObjectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDesc() {
        return desc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDesc(String newDesc) {
        String oldDesc = desc;
        desc = newDesc;
        boolean oldDescESet = descESet;
        descESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__DESC, oldDesc, desc, !oldDescESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDesc() {
        String oldDesc = desc;
        boolean oldDescESet = descESet;
        desc = DESC_EDEFAULT;
        descESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__DESC, oldDesc, DESC_EDEFAULT, oldDescESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDesc() {
        return descESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceType getPServT() {
        return pServT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPServT(ServiceType newPServT) {
        ServiceType oldPServT = pServT;
        pServT = newPServT == null ? PSERV_T_EDEFAULT : newPServT;
        boolean oldPServTESet = pServTESet;
        pServTESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__PSERV_T, oldPServT, pServT, !oldPServTESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPServT() {
        ServiceType oldPServT = pServT;
        boolean oldPServTESet = pServTESet;
        pServT = PSERV_T_EDEFAULT;
        pServTESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__PSERV_T, oldPServT, PSERV_T_EDEFAULT, oldPServTESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPServT() {
        return pServTESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPLN() {
        return pLN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPLN(String newPLN) {
        String oldPLN = pLN;
        pLN = newPLN;
        boolean oldPLNESet = pLNESet;
        pLNESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__PLN, oldPLN, pLN, !oldPLNESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPLN() {
        String oldPLN = pLN;
        boolean oldPLNESet = pLNESet;
        pLN = PLN_EDEFAULT;
        pLNESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__PLN, oldPLN, PLN_EDEFAULT, oldPLNESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPLN() {
        return pLNESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPDO() {
        return pDO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPDO(String newPDO) {
        String oldPDO = pDO;
        pDO = newPDO;
        boolean oldPDOESet = pDOESet;
        pDOESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__PDO, oldPDO, pDO, !oldPDOESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPDO() {
        String oldPDO = pDO;
        boolean oldPDOESet = pDOESet;
        pDO = PDO_EDEFAULT;
        pDOESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__PDO, oldPDO, PDO_EDEFAULT, oldPDOESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPDO() {
        return pDOESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPDA() {
        return pDA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPDA(String newPDA) {
        String oldPDA = pDA;
        pDA = newPDA;
        boolean oldPDAESet = pDAESet;
        pDAESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__PDA, oldPDA, pDA, !oldPDAESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPDA() {
        String oldPDA = pDA;
        boolean oldPDAESet = pDAESet;
        pDA = PDA_EDEFAULT;
        pDAESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__PDA, oldPDA, PDA_EDEFAULT, oldPDAESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPDA() {
        return pDAESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Control getRefersToControl() {
        return refersToControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToControl(Control newRefersToControl, NotificationChain msgs) {
        Control oldRefersToControl = refersToControl;
        refersToControl = newRefersToControl;
        boolean oldRefersToControlESet = refersToControlESet;
        refersToControlESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__REFERS_TO_CONTROL, oldRefersToControl, newRefersToControl, !oldRefersToControlESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToControl(Control newRefersToControl) {
        if (newRefersToControl != refersToControl) {
            NotificationChain msgs = null;
            if (refersToControl != null)
                msgs = ((InternalEObject)refersToControl).eInverseRemove(this, SclPackage.CONTROL__REFERRED_BY_EXT_REF, Control.class, msgs);
            if (newRefersToControl != null)
                msgs = ((InternalEObject)newRefersToControl).eInverseAdd(this, SclPackage.CONTROL__REFERRED_BY_EXT_REF, Control.class, msgs);
            msgs = basicSetRefersToControl(newRefersToControl, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToControlESet = refersToControlESet;
            refersToControlESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__REFERS_TO_CONTROL, newRefersToControl, newRefersToControl, !oldRefersToControlESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToControl(NotificationChain msgs) {
        Control oldRefersToControl = refersToControl;
        refersToControl = null;
        boolean oldRefersToControlESet = refersToControlESet;
        refersToControlESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__REFERS_TO_CONTROL, oldRefersToControl, null, oldRefersToControlESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToControl() {
        if (refersToControl != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)refersToControl).eInverseRemove(this, SclPackage.CONTROL__REFERRED_BY_EXT_REF, Control.class, msgs);
            msgs = basicUnsetRefersToControl(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToControlESet = refersToControlESet;
            refersToControlESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__REFERS_TO_CONTROL, null, null, oldRefersToControlESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToControl() {
        return refersToControlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.EXT_REF__PARENT_INPUTS:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentInputs((Inputs)otherEnd, msgs);
            case SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
                if (refersToAbstractDataAttribute != null)
                    msgs = ((InternalEObject)refersToAbstractDataAttribute).eInverseRemove(this, SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_EXT_REF, AbstractDataAttribute.class, msgs);
                return basicSetRefersToAbstractDataAttribute((AbstractDataAttribute)otherEnd, msgs);
            case SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_OBJECT:
                if (refersToAbstractDataObject != null)
                    msgs = ((InternalEObject)refersToAbstractDataObject).eInverseRemove(this, SclPackage.ABSTRACT_DATA_OBJECT__REFERRED_BY_EXT_REF, AbstractDataObject.class, msgs);
                return basicSetRefersToAbstractDataObject((AbstractDataObject)otherEnd, msgs);
            case SclPackage.EXT_REF__REFERS_TO_CONTROL:
                if (refersToControl != null)
                    msgs = ((InternalEObject)refersToControl).eInverseRemove(this, SclPackage.CONTROL__REFERRED_BY_EXT_REF, Control.class, msgs);
                return basicSetRefersToControl((Control)otherEnd, msgs);
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
            case SclPackage.EXT_REF__PARENT_INPUTS:
                return basicSetParentInputs(null, msgs);
            case SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
                return basicUnsetRefersToAbstractDataAttribute(msgs);
            case SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_OBJECT:
                return basicUnsetRefersToAbstractDataObject(msgs);
            case SclPackage.EXT_REF__REFERS_TO_CONTROL:
                return basicUnsetRefersToControl(msgs);
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
            case SclPackage.EXT_REF__PARENT_INPUTS:
                return eInternalContainer().eInverseRemove(this, SclPackage.INPUTS__EXT_REF, Inputs.class, msgs);
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
            case SclPackage.EXT_REF__DESC:
                return getDesc();
            case SclPackage.EXT_REF__DA_NAME:
                return getDaName();
            case SclPackage.EXT_REF__DO_NAME:
                return getDoName();
            case SclPackage.EXT_REF__IED_NAME:
                return getIedName();
            case SclPackage.EXT_REF__INT_ADDR:
                return getIntAddr();
            case SclPackage.EXT_REF__LD_INST:
                return getLdInst();
            case SclPackage.EXT_REF__LN_CLASS:
                return getLnClass();
            case SclPackage.EXT_REF__LN_INST:
                return getLnInst();
            case SclPackage.EXT_REF__PREFIX:
                return getPrefix();
            case SclPackage.EXT_REF__SERVICE_TYPE:
                return getServiceType();
            case SclPackage.EXT_REF__SRC_CB_NAME:
                return getSrcCBName();
            case SclPackage.EXT_REF__SRC_LD_INST:
                return getSrcLDInst();
            case SclPackage.EXT_REF__SRC_LN_CLASS:
                return getSrcLNClass();
            case SclPackage.EXT_REF__SRC_LN_INST:
                return getSrcLNInst();
            case SclPackage.EXT_REF__SRC_PREFIX:
                return getSrcPrefix();
            case SclPackage.EXT_REF__PARENT_INPUTS:
                return getParentInputs();
            case SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
                return getRefersToAbstractDataAttribute();
            case SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_OBJECT:
                return getRefersToAbstractDataObject();
            case SclPackage.EXT_REF__PSERV_T:
                return getPServT();
            case SclPackage.EXT_REF__PLN:
                return getPLN();
            case SclPackage.EXT_REF__PDO:
                return getPDO();
            case SclPackage.EXT_REF__PDA:
                return getPDA();
            case SclPackage.EXT_REF__REFERS_TO_CONTROL:
                return getRefersToControl();
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
            case SclPackage.EXT_REF__DESC:
                setDesc((String)newValue);
                return;
            case SclPackage.EXT_REF__DA_NAME:
                setDaName((String)newValue);
                return;
            case SclPackage.EXT_REF__DO_NAME:
                setDoName((String)newValue);
                return;
            case SclPackage.EXT_REF__IED_NAME:
                setIedName((String)newValue);
                return;
            case SclPackage.EXT_REF__INT_ADDR:
                setIntAddr((String)newValue);
                return;
            case SclPackage.EXT_REF__LD_INST:
                setLdInst((String)newValue);
                return;
            case SclPackage.EXT_REF__LN_CLASS:
                setLnClass((String)newValue);
                return;
            case SclPackage.EXT_REF__LN_INST:
                setLnInst((String)newValue);
                return;
            case SclPackage.EXT_REF__PREFIX:
                setPrefix((String)newValue);
                return;
            case SclPackage.EXT_REF__SERVICE_TYPE:
                setServiceType((ServiceType)newValue);
                return;
            case SclPackage.EXT_REF__SRC_CB_NAME:
                setSrcCBName((String)newValue);
                return;
            case SclPackage.EXT_REF__SRC_LD_INST:
                setSrcLDInst((String)newValue);
                return;
            case SclPackage.EXT_REF__SRC_LN_CLASS:
                setSrcLNClass((String)newValue);
                return;
            case SclPackage.EXT_REF__SRC_LN_INST:
                setSrcLNInst((String)newValue);
                return;
            case SclPackage.EXT_REF__SRC_PREFIX:
                setSrcPrefix((String)newValue);
                return;
            case SclPackage.EXT_REF__PARENT_INPUTS:
                setParentInputs((Inputs)newValue);
                return;
            case SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
                setRefersToAbstractDataAttribute((AbstractDataAttribute)newValue);
                return;
            case SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_OBJECT:
                setRefersToAbstractDataObject((AbstractDataObject)newValue);
                return;
            case SclPackage.EXT_REF__PSERV_T:
                setPServT((ServiceType)newValue);
                return;
            case SclPackage.EXT_REF__PLN:
                setPLN((String)newValue);
                return;
            case SclPackage.EXT_REF__PDO:
                setPDO((String)newValue);
                return;
            case SclPackage.EXT_REF__PDA:
                setPDA((String)newValue);
                return;
            case SclPackage.EXT_REF__REFERS_TO_CONTROL:
                setRefersToControl((Control)newValue);
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
            case SclPackage.EXT_REF__DESC:
                unsetDesc();
                return;
            case SclPackage.EXT_REF__DA_NAME:
                unsetDaName();
                return;
            case SclPackage.EXT_REF__DO_NAME:
                unsetDoName();
                return;
            case SclPackage.EXT_REF__IED_NAME:
                unsetIedName();
                return;
            case SclPackage.EXT_REF__INT_ADDR:
                unsetIntAddr();
                return;
            case SclPackage.EXT_REF__LD_INST:
                unsetLdInst();
                return;
            case SclPackage.EXT_REF__LN_CLASS:
                unsetLnClass();
                return;
            case SclPackage.EXT_REF__LN_INST:
                unsetLnInst();
                return;
            case SclPackage.EXT_REF__PREFIX:
                unsetPrefix();
                return;
            case SclPackage.EXT_REF__SERVICE_TYPE:
                unsetServiceType();
                return;
            case SclPackage.EXT_REF__SRC_CB_NAME:
                unsetSrcCBName();
                return;
            case SclPackage.EXT_REF__SRC_LD_INST:
                unsetSrcLDInst();
                return;
            case SclPackage.EXT_REF__SRC_LN_CLASS:
                unsetSrcLNClass();
                return;
            case SclPackage.EXT_REF__SRC_LN_INST:
                unsetSrcLNInst();
                return;
            case SclPackage.EXT_REF__SRC_PREFIX:
                unsetSrcPrefix();
                return;
            case SclPackage.EXT_REF__PARENT_INPUTS:
                setParentInputs((Inputs)null);
                return;
            case SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
                unsetRefersToAbstractDataAttribute();
                return;
            case SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_OBJECT:
                unsetRefersToAbstractDataObject();
                return;
            case SclPackage.EXT_REF__PSERV_T:
                unsetPServT();
                return;
            case SclPackage.EXT_REF__PLN:
                unsetPLN();
                return;
            case SclPackage.EXT_REF__PDO:
                unsetPDO();
                return;
            case SclPackage.EXT_REF__PDA:
                unsetPDA();
                return;
            case SclPackage.EXT_REF__REFERS_TO_CONTROL:
                unsetRefersToControl();
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
            case SclPackage.EXT_REF__DESC:
                return isSetDesc();
            case SclPackage.EXT_REF__DA_NAME:
                return isSetDaName();
            case SclPackage.EXT_REF__DO_NAME:
                return isSetDoName();
            case SclPackage.EXT_REF__IED_NAME:
                return isSetIedName();
            case SclPackage.EXT_REF__INT_ADDR:
                return isSetIntAddr();
            case SclPackage.EXT_REF__LD_INST:
                return isSetLdInst();
            case SclPackage.EXT_REF__LN_CLASS:
                return isSetLnClass();
            case SclPackage.EXT_REF__LN_INST:
                return isSetLnInst();
            case SclPackage.EXT_REF__PREFIX:
                return isSetPrefix();
            case SclPackage.EXT_REF__SERVICE_TYPE:
                return isSetServiceType();
            case SclPackage.EXT_REF__SRC_CB_NAME:
                return isSetSrcCBName();
            case SclPackage.EXT_REF__SRC_LD_INST:
                return isSetSrcLDInst();
            case SclPackage.EXT_REF__SRC_LN_CLASS:
                return isSetSrcLNClass();
            case SclPackage.EXT_REF__SRC_LN_INST:
                return isSetSrcLNInst();
            case SclPackage.EXT_REF__SRC_PREFIX:
                return isSetSrcPrefix();
            case SclPackage.EXT_REF__PARENT_INPUTS:
                return getParentInputs() != null;
            case SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
                return isSetRefersToAbstractDataAttribute();
            case SclPackage.EXT_REF__REFERS_TO_ABSTRACT_DATA_OBJECT:
                return isSetRefersToAbstractDataObject();
            case SclPackage.EXT_REF__PSERV_T:
                return isSetPServT();
            case SclPackage.EXT_REF__PLN:
                return isSetPLN();
            case SclPackage.EXT_REF__PDO:
                return isSetPDO();
            case SclPackage.EXT_REF__PDA:
                return isSetPDA();
            case SclPackage.EXT_REF__REFERS_TO_CONTROL:
                return isSetRefersToControl();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == AgDesc.class) {
            switch (derivedFeatureID) {
                case SclPackage.EXT_REF__DESC: return SclPackage.AG_DESC__DESC;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == AgDesc.class) {
            switch (baseFeatureID) {
                case SclPackage.AG_DESC__DESC: return SclPackage.EXT_REF__DESC;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (desc: ");
        if (descESet) result.append(desc); else result.append("<unset>");
        result.append(", daName: ");
        if (daNameESet) result.append(daName); else result.append("<unset>");
        result.append(", doName: ");
        if (doNameESet) result.append(doName); else result.append("<unset>");
        result.append(", iedName: ");
        if (iedNameESet) result.append(iedName); else result.append("<unset>");
        result.append(", intAddr: ");
        if (intAddrESet) result.append(intAddr); else result.append("<unset>");
        result.append(", ldInst: ");
        if (ldInstESet) result.append(ldInst); else result.append("<unset>");
        result.append(", lnClass: ");
        if (lnClassESet) result.append(lnClass); else result.append("<unset>");
        result.append(", lnInst: ");
        if (lnInstESet) result.append(lnInst); else result.append("<unset>");
        result.append(", prefix: ");
        if (prefixESet) result.append(prefix); else result.append("<unset>");
        result.append(", serviceType: ");
        if (serviceTypeESet) result.append(serviceType); else result.append("<unset>");
        result.append(", srcCBName: ");
        if (srcCBNameESet) result.append(srcCBName); else result.append("<unset>");
        result.append(", srcLDInst: ");
        if (srcLDInstESet) result.append(srcLDInst); else result.append("<unset>");
        result.append(", srcLNClass: ");
        if (srcLNClassESet) result.append(srcLNClass); else result.append("<unset>");
        result.append(", srcLNInst: ");
        if (srcLNInstESet) result.append(srcLNInst); else result.append("<unset>");
        result.append(", srcPrefix: ");
        if (srcPrefixESet) result.append(srcPrefix); else result.append("<unset>");
        result.append(", pServT: ");
        if (pServTESet) result.append(pServT); else result.append("<unset>");
        result.append(", pLN: ");
        if (pLNESet) result.append(pLN); else result.append("<unset>");
        result.append(", pDO: ");
        if (pDOESet) result.append(pDO); else result.append("<unset>");
        result.append(", pDA: ");
        if (pDAESet) result.append(pDA); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( IRiseClipseConsole console ) {
        // see Issue #13
        super.doBuildExplicitLinks( console );
        
        String messagePrefix = "[SCL links] while resolving link from ExtRef on line " + getLineNumber() + ": ";
        Pair< IED, LDevice > args = doBuildExplicitDataLink( console, messagePrefix );
        doBuildExplicitCBLink( console, messagePrefix, args );
    }
    
    private Pair< IED, LDevice > doBuildExplicitDataLink( IRiseClipseConsole console, String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for data) ";
        
        // iedName      The name of the IED from where the input comes
        // ldInst       The LD instance name from where the input comes
        // prefix       The LN prefix
        // lnClass      The LN class according to IEC 61850-7-x
        // lnInst       The instance id of this LN instance of above LN class in the IED; missing for a reference in LLN0. For backwards compatibility also the 
        //              empty string shall be accepted for LLN0
        // doName       A name identifying the DO (within the LN).In case of structured DO, the name parts are concatenated by dots (.)
        // daName       The attribute designating the input. The IED tool should use an empty value if it has some default binding (intAddr) for all process
        //              input attributes of a DO (fc = ST or MX), especially for t and q. If the attribute belongs to a data type structure, then the structure
        //              name parts shall be separated by dots (.)
        // intAddr      The internal address to which the input is bound. Only the IED tool of the concerned IED shall use the value. All other tools shall preserve it unchanged.
        // desc         A free description / text. Can e.g. be used at system engineering time to tell the IED engineer the purpose of this incoming data
        // serviceType  Optional, values: Poll, Report, GOOSE, SMV, Typically used at system design time to specify the service type to be used for sending the needed input data

        if(( getIedName() == null ) || getIedName().isEmpty() ) {
            // no warning if no iedName
            console.verbose( messagePrefix, "do not look for DA because iedName is missing" );
            return Pair.of( null, null );
        }

        if(( getDoName() == null ) || getDoName().isEmpty() ) {
            // No link if no doName
            console.verbose( messagePrefix, "doName is absent" );
            return Pair.of( null, null );
        }

        Pair< IED, Integer > ied = null;
        if( "@".equals( getIedName() )) {
            ied = Pair.of( SclUtilities.getMyIED( this ), 1 );
        }
        else {
            ied = SclUtilities.getIED( SclUtilities.getSCL( this ), getIedName() );
        }
        if( ied.getLeft() == null ) {
            SclUtilities.displayNotFoundWarning( console, messagePrefix, "IED( name = " + getIedName() + " )", ied.getRight() );
            return Pair.of( null, null );
        }
        console.verbose( messagePrefix, "found IED ( name = ", ied.getLeft().getName(), " ) on line ", ied.getLeft().getLineNumber() );

        // Only now so that we can give back ied
        if(( getLdInst() == null ) || getLdInst().isEmpty() ) {
            console.warning( messagePrefix, "ldInst is missing" );
            return Pair.of( ied.getLeft(), null );
        }
        if(( getLnClass() == null ) || getLnClass().isEmpty() ) {
            console.warning( messagePrefix, "lnClass is missing" );
            return Pair.of( ied.getLeft(), null );
        }

        Pair< LDevice, Integer > lDevice = SclUtilities.getLDevice( ied.getLeft(), getLdInst() );
        String mess1 = "LDevice( inst = " + getLdInst() + " )";
        if( lDevice.getLeft() == null ) {
            SclUtilities.displayNotFoundWarning( console, messagePrefix, mess1, lDevice.getRight() );
            return Pair.of( ied.getLeft(), null );
        }
        console.verbose( messagePrefix, "found ", mess1, " on line ", lDevice.getLeft().getLineNumber() );

        Pair< IED, LDevice > finalRes = Pair.of( ied.getLeft(), lDevice.getLeft() );

        Pair< AnyLN,Integer > anyLN = SclUtilities.getAnyLN( lDevice.getLeft(), getLnClass(), getLnInst(), getPrefix() );
        String mess2 = "LN( lnClass = " + getLnClass();
        if( getLnInst() != null ) {
            mess2 += ", inst = " + getLnInst();
            if( getPrefix() != "" ) mess2 += ", prefix = " + getPrefix();
        }
        mess2 += " )";
        if( anyLN.getLeft() == null ) {
            SclUtilities.displayNotFoundWarning( console, messagePrefix, mess2, anyLN.getRight() );
            return finalRes;
        }
        console.verbose( messagePrefix, "found ", mess2, " on line ", anyLN.getLeft().getLineNumber() );
        anyLN.getLeft().buildExplicitLinks( console, false );

        // No error or warning message here: if this happens, error should have been detected before
        if( anyLN.getLeft().getRefersToLNodeType() == null ) return finalRes;
        console.verbose( messagePrefix, "found LNodeType on line ", anyLN.getLeft().getRefersToLNodeType().getLineNumber() );

        // doName and daName are structured using . as separator
        // The first doName let us find the DO inside the LNodeType
        // referred by the LN
        // The type attribute of the DO give us the DOType with its id attribute
        // If doName is simple, use daName to find the DA in the DOType
        // If doName is structured, find the SDO and its DOType using remaining doName

        final String[] doNames = getDoName().split( "\\.", -1 );
        List< DO > res3a =
                anyLN
                .getLeft()
                .getRefersToLNodeType()
                .getDO()
                .stream()
                .filter( do2 -> doNames[0].equals( do2.getName() ))
                .collect( Collectors.toList() );

        String mess3a = "DO ( name = " + doNames[0] + " )";
        if( res3a.size() != 1 ) {
            SclUtilities.displayNotFoundWarning( console, messagePrefix, mess3a, res3a.size() );
            return finalRes;
        }

        AbstractDataObject ado = res3a.get( 0 );
        console.verbose( messagePrefix, "found ", mess3a, " on line ", ado.getLineNumber() );
        ado.buildExplicitLinks( console, false );

        for( int i = 1; i < doNames.length; ++i ) {
            DOType doType = ado.getRefersToDOType();
            if( doType == null ) return finalRes;
            console.verbose( messagePrefix, "found DOType on line ", doType.getLineNumber() );
            String name = doNames[i];
            List< SDO > res3b =
                    doType
                    .getSDO()
                    .stream()
                    .filter( sdo ->  name.equals( sdo.getName() ))
                    .collect( Collectors.toList() );

            String mess3b = "SDO ( name = " + name + " ) in DOType on line " + doType.getLineNumber();
            if( res3b.size() != 1 ) {
                SclUtilities.displayNotFoundWarning( console, messagePrefix, mess3b, res3b.size() );
                return finalRes;
            }
            ado = res3b.get( 0 );
            console.verbose( messagePrefix, "found ", mess3b, " on line ", ado.getLineNumber() );

            ado.buildExplicitLinks( console, false );
        }
        // Set link to DO/SDO only if no daName
        if( getDaName() == null ) {
            setRefersToAbstractDataObject( ado );
            console.info( "[SCL links] ExtRef on line ", getLineNumber(), " refers to AbstractDataObject ( name = ", ado.getName(), " ) on line ", ado.getLineNumber() );
            return finalRes;
        }

        DOType doType = ado.getRefersToDOType();
        // No error or warning message here: if this happens, error should have been detected before
        if( doType == null ) return finalRes;
        console.verbose( messagePrefix, "found DOType on line ", doType.getLineNumber() );
        
        // The first daName gives us the DA inside the DOType
        // If daName is structured, find the DAType and its BDA using remaining daName

        final String[] daNames = getDaName().split( "\\.", -1 );
        List< DA > res4a =
                doType
                .getDA()
                .stream()
                .filter(  da -> da.getName().equals( daNames[0] ))
                .collect( Collectors.toList() );

        String mess4a = "DA ( name = " + daNames[0] + " ) in DOType";
        if( res4a.size() != 1 ) {
            SclUtilities.displayNotFoundWarning( console, messagePrefix, mess4a, res4a.size() );
            return finalRes;
        }
        AbstractDataAttribute da = res4a.get( 0 );
        console.verbose( messagePrefix, "found ", mess4a, " on line ", da.getLineNumber() );

        for( int i = 1; i < daNames.length; ++i ) {
            da.buildExplicitLinks( console, false );

            String name = daNames[i];
            List< BDA > res4b =
                    da
                    .getRefersToDAType()
                    .getBDA()
                    .stream()
                    .filter(  bda -> name.equals(  bda.getName() ))
                    .collect( Collectors.toList() );

            String mess4b = "BDA ( name = " + name + " ) in DAType on line " + da.getRefersToDAType().getLineNumber();
            if( res4b.size() != 1 ) {
                SclUtilities.displayNotFoundWarning( console, messagePrefix, mess4b, res4b.size() );
                return finalRes;
            }
            da = res4b.get( 0 );
            console.verbose( messagePrefix, "found ", mess4b, " on line ", da.getLineNumber() );
        }

        console.info( "[SCL links] ExtRef on line ", getLineNumber(), " refers to AbstractDataAttribute ( name = ", da.getName(), " ) on line ", da.getLineNumber() );
        setRefersToAbstractDataAttribute( da );
        
        return finalRes;
    }

    private void doBuildExplicitCBLink( IRiseClipseConsole console, String mPrefix, Pair< IED, LDevice > args ) {

        String messagePrefix = mPrefix + "(looking for control) ";
        
        // srcLDInst    The LD inst of the source control block – if missing, same as ldInst above
        // srcPrefix    The prefix of the LN instance, where the source control block resides; if missing, no prefix
        // srcLNClass   The LN class of the LN, where the source control block resides; if missing, LLN0 
        // srcLNInst    The LN instance number of the LN where the source control block resides – if missing, no instance number exists (LLN0)
        // srcCBName    The source CB name; if missing, then all othere srcXX attributes should also be missing, i.e. no source control block is given.

        IED ied = args.getLeft();
        LDevice lDevice = args.getRight();
        
        if( ied == null ) return;

        if(( getSrcCBName() == null ) || getSrcCBName().isEmpty() ) {
            console.verbose( messagePrefix, "srcCBName is absent" );
            return;
        }

        if(( getSrcLDInst() != null ) && ( ! getSrcLDInst().isEmpty() )) {
            Pair< LDevice, Integer > lDevice1 = SclUtilities.getLDevice( ied, getSrcLDInst() );
            String mess5 = "LDevice( inst = " + getSrcLDInst() + " )";
            if( lDevice1.getLeft() == null ) {
                SclUtilities.displayNotFoundWarning( console, messagePrefix, mess5, lDevice1.getRight() );
                return;
            }
            lDevice = lDevice1.getLeft();
            console.verbose( messagePrefix, "found ", mess5, " on line ", lDevice.getLineNumber() );
        }
        if( lDevice == null ) return;

        String cbLNClass = "LLN0";
        if(( getSrcLNClass() != null ) && ( ! getSrcLNClass().isEmpty() )) {
            cbLNClass = getSrcLNClass();
        }
        Pair< AnyLN, Integer > anyLN = SclUtilities.getAnyLN( lDevice, cbLNClass, getSrcLNInst(), getSrcPrefix() );
        String mess6 = "LN( lnClass = " + cbLNClass;
        if( getSrcLNInst() != null ) {
            mess6 += ", inst = " + getSrcLNInst();
            if( getSrcPrefix() != "" ) mess6 += ", prefix = " + getSrcPrefix();
        }
        mess6 += " )";
        if( anyLN.getLeft() == null ) {
            SclUtilities.displayNotFoundWarning( console, messagePrefix, mess6, anyLN.getRight() );
            return;
        }
        console.verbose( messagePrefix, "found ", mess6, " on line ", anyLN.getLeft().getLineNumber() );

        List< Control > listControls = new ArrayList< Control >();
        listControls.addAll( anyLN.getLeft().getLogControl() );
        listControls.addAll( anyLN.getLeft().getReportControl() );
        if( "LLN0".equals( cbLNClass )) {
            listControls.addAll( lDevice.getLN0().getGSEControl() );
            listControls.addAll( lDevice.getLN0().getSampledValueControl() );
        }
        if( listControls.size() == 0 ) {
            console.warning( messagePrefix, "control not found because there are none of them in AnyLN line ", anyLN.getLeft().getLineNumber() );
            return;
        }

        List< Control > res7 =
                listControls
                .stream()
                .filter( c -> getSrcCBName().equals( c.getName() ))
                .collect( Collectors.toList() );
        String mess7 = "Control( name = " + getSrcCBName() + " )";
        if( res7.size() != 1 ) {
            SclUtilities.displayNotFoundWarning( console, messagePrefix, mess7, res7.size() );
            return;
        }
        setRefersToControl( res7.get( 0 ));
        console.info( "[SCL links] ExtRef on line ", getLineNumber(), " refers to ", mess7, " on line ", getRefersToControl().getLineNumber() );
    }

} //ExtRefImpl
