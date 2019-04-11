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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDesc;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceType;
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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getRefersToDataAttribute <em>Refers To Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getRefersToDataObject <em>Refers To Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getPServT <em>PServ T</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getPLN <em>PLN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getPDO <em>PDO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getPDA <em>PDA</em>}</li>
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
    protected static final String PREFIX_EDEFAULT = null;

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
     * The cached value of the '{@link #getRefersToAnyLN() <em>Refers To Any LN</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToAnyLN()
     * @generated
     * @ordered
     */
    protected AnyLN refersToAnyLN;

    /**
     * This is true if the Refers To Any LN reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToAnyLNESet;

    /**
     * The cached value of the '{@link #getRefersToDataAttribute() <em>Refers To Data Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToDataAttribute()
     * @generated
     * @ordered
     */
    protected DataAttribute refersToDataAttribute;

    /**
     * This is true if the Refers To Data Attribute reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToDataAttributeESet;

    /**
     * The cached value of the '{@link #getRefersToDataObject() <em>Refers To Data Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToDataObject()
     * @generated
     * @ordered
     */
    protected DataObject refersToDataObject;

    /**
     * This is true if the Refers To Data Object reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToDataObjectESet;

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
    public Inputs getInputs() {
        if (eContainerFeatureID() != SclPackage.EXT_REF__INPUTS) return null;
        return (Inputs)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInputs( Inputs newInputs, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newInputs, SclPackage.EXT_REF__INPUTS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInputs( Inputs newInputs ) {
        if (newInputs != eInternalContainer() || (eContainerFeatureID() != SclPackage.EXT_REF__INPUTS && newInputs != null)) {
            if (EcoreUtil.isAncestor(this, newInputs))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newInputs != null)
                msgs = ((InternalEObject)newInputs).eInverseAdd(this, SclPackage.INPUTS__EXT_REF, Inputs.class, msgs);
            msgs = basicSetInputs(newInputs, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__INPUTS, newInputs, newInputs));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnyLN getRefersToAnyLN() {
        return refersToAnyLN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToAnyLN(AnyLN newRefersToAnyLN, NotificationChain msgs) {
        AnyLN oldRefersToAnyLN = refersToAnyLN;
        refersToAnyLN = newRefersToAnyLN;
        boolean oldRefersToAnyLNESet = refersToAnyLNESet;
        refersToAnyLNESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__REFERS_TO_ANY_LN, oldRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet);
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
    public void setRefersToAnyLN(AnyLN newRefersToAnyLN) {
        if (newRefersToAnyLN != refersToAnyLN) {
            NotificationChain msgs = null;
            if (refersToAnyLN != null)
                msgs = ((InternalEObject)refersToAnyLN).eInverseRemove(this, SclPackage.ANY_LN__REFERRED_BY_EXT_REF, AnyLN.class, msgs);
            if (newRefersToAnyLN != null)
                msgs = ((InternalEObject)newRefersToAnyLN).eInverseAdd(this, SclPackage.ANY_LN__REFERRED_BY_EXT_REF, AnyLN.class, msgs);
            msgs = basicSetRefersToAnyLN(newRefersToAnyLN, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToAnyLNESet = refersToAnyLNESet;
            refersToAnyLNESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__REFERS_TO_ANY_LN, newRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToAnyLN(NotificationChain msgs) {
        AnyLN oldRefersToAnyLN = refersToAnyLN;
        refersToAnyLN = null;
        boolean oldRefersToAnyLNESet = refersToAnyLNESet;
        refersToAnyLNESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__REFERS_TO_ANY_LN, oldRefersToAnyLN, null, oldRefersToAnyLNESet);
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
    public void unsetRefersToAnyLN() {
        if (refersToAnyLN != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)refersToAnyLN).eInverseRemove(this, SclPackage.ANY_LN__REFERRED_BY_EXT_REF, AnyLN.class, msgs);
            msgs = basicUnsetRefersToAnyLN(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToAnyLNESet = refersToAnyLNESet;
            refersToAnyLNESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__REFERS_TO_ANY_LN, null, null, oldRefersToAnyLNESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToAnyLN() {
        return refersToAnyLNESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataAttribute getRefersToDataAttribute() {
        return refersToDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToDataAttribute(DataAttribute newRefersToDataAttribute, NotificationChain msgs) {
        DataAttribute oldRefersToDataAttribute = refersToDataAttribute;
        refersToDataAttribute = newRefersToDataAttribute;
        boolean oldRefersToDataAttributeESet = refersToDataAttributeESet;
        refersToDataAttributeESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__REFERS_TO_DATA_ATTRIBUTE, oldRefersToDataAttribute, newRefersToDataAttribute, !oldRefersToDataAttributeESet);
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
    public void setRefersToDataAttribute(DataAttribute newRefersToDataAttribute) {
        if (newRefersToDataAttribute != refersToDataAttribute) {
            NotificationChain msgs = null;
            if (refersToDataAttribute != null)
                msgs = ((InternalEObject)refersToDataAttribute).eInverseRemove(this, SclPackage.DATA_ATTRIBUTE__REFERRED_BY_EXT_REF, DataAttribute.class, msgs);
            if (newRefersToDataAttribute != null)
                msgs = ((InternalEObject)newRefersToDataAttribute).eInverseAdd(this, SclPackage.DATA_ATTRIBUTE__REFERRED_BY_EXT_REF, DataAttribute.class, msgs);
            msgs = basicSetRefersToDataAttribute(newRefersToDataAttribute, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToDataAttributeESet = refersToDataAttributeESet;
            refersToDataAttributeESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__REFERS_TO_DATA_ATTRIBUTE, newRefersToDataAttribute, newRefersToDataAttribute, !oldRefersToDataAttributeESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToDataAttribute(NotificationChain msgs) {
        DataAttribute oldRefersToDataAttribute = refersToDataAttribute;
        refersToDataAttribute = null;
        boolean oldRefersToDataAttributeESet = refersToDataAttributeESet;
        refersToDataAttributeESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__REFERS_TO_DATA_ATTRIBUTE, oldRefersToDataAttribute, null, oldRefersToDataAttributeESet);
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
    public void unsetRefersToDataAttribute() {
        if (refersToDataAttribute != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)refersToDataAttribute).eInverseRemove(this, SclPackage.DATA_ATTRIBUTE__REFERRED_BY_EXT_REF, DataAttribute.class, msgs);
            msgs = basicUnsetRefersToDataAttribute(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToDataAttributeESet = refersToDataAttributeESet;
            refersToDataAttributeESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__REFERS_TO_DATA_ATTRIBUTE, null, null, oldRefersToDataAttributeESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToDataAttribute() {
        return refersToDataAttributeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataObject getRefersToDataObject() {
        return refersToDataObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToDataObject(DataObject newRefersToDataObject, NotificationChain msgs) {
        DataObject oldRefersToDataObject = refersToDataObject;
        refersToDataObject = newRefersToDataObject;
        boolean oldRefersToDataObjectESet = refersToDataObjectESet;
        refersToDataObjectESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__REFERS_TO_DATA_OBJECT, oldRefersToDataObject, newRefersToDataObject, !oldRefersToDataObjectESet);
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
    public void setRefersToDataObject(DataObject newRefersToDataObject) {
        if (newRefersToDataObject != refersToDataObject) {
            NotificationChain msgs = null;
            if (refersToDataObject != null)
                msgs = ((InternalEObject)refersToDataObject).eInverseRemove(this, SclPackage.DATA_OBJECT__REFERRED_BY_EXT_REF, DataObject.class, msgs);
            if (newRefersToDataObject != null)
                msgs = ((InternalEObject)newRefersToDataObject).eInverseAdd(this, SclPackage.DATA_OBJECT__REFERRED_BY_EXT_REF, DataObject.class, msgs);
            msgs = basicSetRefersToDataObject(newRefersToDataObject, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToDataObjectESet = refersToDataObjectESet;
            refersToDataObjectESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EXT_REF__REFERS_TO_DATA_OBJECT, newRefersToDataObject, newRefersToDataObject, !oldRefersToDataObjectESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToDataObject(NotificationChain msgs) {
        DataObject oldRefersToDataObject = refersToDataObject;
        refersToDataObject = null;
        boolean oldRefersToDataObjectESet = refersToDataObjectESet;
        refersToDataObjectESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__REFERS_TO_DATA_OBJECT, oldRefersToDataObject, null, oldRefersToDataObjectESet);
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
    public void unsetRefersToDataObject() {
        if (refersToDataObject != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)refersToDataObject).eInverseRemove(this, SclPackage.DATA_OBJECT__REFERRED_BY_EXT_REF, DataObject.class, msgs);
            msgs = basicUnsetRefersToDataObject(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToDataObjectESet = refersToDataObjectESet;
            refersToDataObjectESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.EXT_REF__REFERS_TO_DATA_OBJECT, null, null, oldRefersToDataObjectESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToDataObject() {
        return refersToDataObjectESet;
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.EXT_REF__INPUTS:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetInputs((Inputs)otherEnd, msgs);
            case SclPackage.EXT_REF__REFERS_TO_ANY_LN:
                if (refersToAnyLN != null)
                    msgs = ((InternalEObject)refersToAnyLN).eInverseRemove(this, SclPackage.ANY_LN__REFERRED_BY_EXT_REF, AnyLN.class, msgs);
                return basicSetRefersToAnyLN((AnyLN)otherEnd, msgs);
            case SclPackage.EXT_REF__REFERS_TO_DATA_ATTRIBUTE:
                if (refersToDataAttribute != null)
                    msgs = ((InternalEObject)refersToDataAttribute).eInverseRemove(this, SclPackage.DATA_ATTRIBUTE__REFERRED_BY_EXT_REF, DataAttribute.class, msgs);
                return basicSetRefersToDataAttribute((DataAttribute)otherEnd, msgs);
            case SclPackage.EXT_REF__REFERS_TO_DATA_OBJECT:
                if (refersToDataObject != null)
                    msgs = ((InternalEObject)refersToDataObject).eInverseRemove(this, SclPackage.DATA_OBJECT__REFERRED_BY_EXT_REF, DataObject.class, msgs);
                return basicSetRefersToDataObject((DataObject)otherEnd, msgs);
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
            case SclPackage.EXT_REF__INPUTS:
                return basicSetInputs(null, msgs);
            case SclPackage.EXT_REF__REFERS_TO_ANY_LN:
                return basicUnsetRefersToAnyLN(msgs);
            case SclPackage.EXT_REF__REFERS_TO_DATA_ATTRIBUTE:
                return basicUnsetRefersToDataAttribute(msgs);
            case SclPackage.EXT_REF__REFERS_TO_DATA_OBJECT:
                return basicUnsetRefersToDataObject(msgs);
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
            case SclPackage.EXT_REF__INPUTS:
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
            case SclPackage.EXT_REF__INPUTS:
                return getInputs();
            case SclPackage.EXT_REF__REFERS_TO_ANY_LN:
                return getRefersToAnyLN();
            case SclPackage.EXT_REF__REFERS_TO_DATA_ATTRIBUTE:
                return getRefersToDataAttribute();
            case SclPackage.EXT_REF__REFERS_TO_DATA_OBJECT:
                return getRefersToDataObject();
            case SclPackage.EXT_REF__PSERV_T:
                return getPServT();
            case SclPackage.EXT_REF__PLN:
                return getPLN();
            case SclPackage.EXT_REF__PDO:
                return getPDO();
            case SclPackage.EXT_REF__PDA:
                return getPDA();
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
            case SclPackage.EXT_REF__INPUTS:
                setInputs((Inputs)newValue);
                return;
            case SclPackage.EXT_REF__REFERS_TO_ANY_LN:
                setRefersToAnyLN((AnyLN)newValue);
                return;
            case SclPackage.EXT_REF__REFERS_TO_DATA_ATTRIBUTE:
                setRefersToDataAttribute((DataAttribute)newValue);
                return;
            case SclPackage.EXT_REF__REFERS_TO_DATA_OBJECT:
                setRefersToDataObject((DataObject)newValue);
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
            case SclPackage.EXT_REF__INPUTS:
                setInputs((Inputs)null);
                return;
            case SclPackage.EXT_REF__REFERS_TO_ANY_LN:
                unsetRefersToAnyLN();
                return;
            case SclPackage.EXT_REF__REFERS_TO_DATA_ATTRIBUTE:
                unsetRefersToDataAttribute();
                return;
            case SclPackage.EXT_REF__REFERS_TO_DATA_OBJECT:
                unsetRefersToDataObject();
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
            case SclPackage.EXT_REF__INPUTS:
                return getInputs() != null;
            case SclPackage.EXT_REF__REFERS_TO_ANY_LN:
                return isSetRefersToAnyLN();
            case SclPackage.EXT_REF__REFERS_TO_DATA_ATTRIBUTE:
                return isSetRefersToDataAttribute();
            case SclPackage.EXT_REF__REFERS_TO_DATA_OBJECT:
                return isSetRefersToDataObject();
            case SclPackage.EXT_REF__PSERV_T:
                return isSetPServT();
            case SclPackage.EXT_REF__PLN:
                return isSetPLN();
            case SclPackage.EXT_REF__PDO:
                return isSetPDO();
            case SclPackage.EXT_REF__PDA:
                return isSetPDA();
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
    protected void doResolveLinks() {
        // see Issue #13
        super.doResolveLinks();
        
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
        // srcLDInst    The LD inst of the source control block – if missing, same as ldInst above
        // srcPrefix    The prefix of the LN instance, where the source control block resides; if missing, no prefix
        // srcLNClass   The LN class of the LN, where the source control block resides; if missing, LLN0 
        // srcLNInst    The LN instance number of the LN where the source control block resides – if missing, no instance number exists (LLN0)
        // srcCBName    The source CB name; if missing, then all othere srcXX attributes should also be missing, i.e. no source control block is given.

        if( getIedName() == null ) return;
        
        /*
         * Must be completely rewritten
         */
        return;

/*
        // find an IED with
        //   IED.name == ExtRef.iedName
        SclSwitch< Boolean > s = new SclSwitch< Boolean >() {

            @Override
            public Boolean caseIED( IED object ) {
                return getIedName().equals( object.getName() );
            }

            @Override
            public Boolean defaultCase( EObject object ) {
                return false;
            }

        };

        IED ied = null;
        List< IED > res = shallowSearchObjects( get_SCL().getIED(), s );
        String mess = "IED( name = " + getIedName() + " ) for ExtRef on line " + getLineNumber() + " )";
        if( res.isEmpty() ) {
            AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess );
            return;
        }
        else if( res.size() > 1 ) {
            AbstractRiseClipseConsole.getConsole().error( "found several " + mess );
            return;
        }
        else {
            //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
            ied = res.get( 0 );
        }
        
        // The following is copy/paste from FCDA
        // TODO: factor out ?
        
        if( getLdInst() == null ) return;
        // find inside an LDevice with
        //   LDevice.name == ExtRef.ldInst
        SclSwitch< Boolean > s1 = new SclSwitch< Boolean >() {

            @Override
            public Boolean caseLDevice( LDevice object ) {
                return getLdInst().equals( object.getInst() );
            }

            @Override
            public Boolean defaultCase( EObject object ) {
                return false;
            }

        };

        List< LDevice > res1 = deepSearchObjects( ied.getAccessPoint(), s1 );
        String mess1 = "LDevice( inst = " + getLdInst() + " ) for ExtRef on line " + getLineNumber()
                + " ( in ied = " + ied.getName() + " )";
        LDevice lDevice = null;
        if( res1.isEmpty() ) {
            AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess1 );
            return;
        }
        else if( res1.size() > 1 ) {
            AbstractRiseClipseConsole.getConsole().error( "found several " + mess1 );
            return;
        }
        else {
            //AbstractRiseClipseConsole.getConsole().info( "found " + mess2 );
            lDevice = res1.get( 0 );
        }
        
        if( "LLN0".equals( getLnClass() ) ) {
            if( lDevice.getLN0() == null ) {
                AbstractRiseClipseConsole.getConsole().error( "cannot find LN0 for ExtRef on line " + getLineNumber()
                        + " ( in ied = " + ied.getName() + " )" );
                return;
            }
            else {
                setRefersToAnyLN( lDevice.getLN0() );
            }
        }
        else {
            // Resolve only if attribute has been read
            if( getLnClass() == null ) return;
            if( getLnInst() == null ) return;
            // prefix is optional
            //if( getPrefix() == null ) return;

            // find inside an LN with
            //   LN.lnClass == ExtRef.lnClass
            //   LN.prefix == ExtRef.prefix
            //   LN.inst == ExtRef.lnInst
            SclSwitch< Boolean > s2 = new SclSwitch< Boolean >() {

                @Override
                public Boolean caseLN( LN object ) {
                    if( getLnClass().equals( object.getLnClass() ) && getLnInst().equals( object.getInst() ) ) {
                        if( object.getPrefix() == null ) return getPrefix() == null;
                        return getPrefix().equals( object.getPrefix() );
                    }
                    return false;
                }

                @Override
                public Boolean defaultCase( EObject object ) {
                    return false;
                }

            };

            List< LN > res2 = shallowSearchObjects( lDevice.getLN(), s2 );
            String mess2 = "LN( lnClass = " + getLnClass() + ", inst = " + getLnInst() + " ) for ExtRef on line "
                    + getLineNumber() + " ( in ied = " + ied.getName() + " )";
            if( res2.isEmpty() ) {
                AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess2 );
                return;
            }
            else if( res2.size() > 1 ) {
                AbstractRiseClipseConsole.getConsole().error( "found several " + mess2 );
                return;
            }
            else {
                //AbstractRiseClipseConsole.getConsole().info( "found " + mess3 );
                setRefersToAnyLN( res2.get( 0 ) );
            }
        }
        getRefersToAnyLN().resolveLinks();
        
        // doName is optional
        if( getDoName() == null ) return;
        
        // names of the SDI between DOI and DAI may be in doName, daName or both ! 

        final String[] doNames = getDoName().split( "\\.", -1 );
        final String[] daNames = getDaName() == null ? null : getDaName().split( "\\.", -1 );
        final String[] sdiNames = new String[doNames.length + ( daNames == null ? 0 : daNames.length - 2 )];
        {
            int sdix = 0;
            for( int i = 1; i < doNames.length;     ++i ) sdiNames[sdix++] = doNames[i];
            if( daNames != null ) for( int i = 0; i < daNames.length - 1; ++i ) sdiNames[sdix++] = daNames[i];
        }
        
        SclSwitch< Boolean > s3 = new SclSwitch< Boolean >() {

            @Override
            public Boolean caseDO( DO object ) {
                return object.getName().equals( doNames[0] );
            }

            @Override
            public Boolean caseDOI( DOI object ) {
                return object.getName().equals( doNames[0] );
            }

            @Override
            public Boolean defaultCase( EObject object ) {
                return false;
            }

        };

        List< DataObject > res3 = shallowSearchObjects( Collections.< DataObject > unmodifiableList( getRefersToAnyLN().getDOI() ), s3 );
        String mess3 = "DO or DOI( name = " + getDoName() + " ) for ExtRef on line " + getLineNumber()
                + " ( in ied = " + ied.getName() + " )";
        if( res3.isEmpty() ) {
            // if we don't find the DOI, we have to look for a DO in the LNodeType if any
            if( getRefersToAnyLN().isSetRefersToLNodeType() ) {
                res3 = shallowSearchObjects(
                        Collections.< DataObject > unmodifiableList( getRefersToAnyLN().getRefersToLNodeType().getDO() ), s3 );
            }
        }
        if( res3.isEmpty() ) {
            AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess3 );
            return;
        }
        else if( res3.size() > 1 ) {
            AbstractRiseClipseConsole.getConsole().error( "found several " + mess3 );
            return;
        }
        else {
            //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
            setRefersToDataObject( res3.get( 0 ) );
        }
        
        if( daNames == null ) return;

        if( getRefersToDataObject() instanceof DOI ) {
            DOI doi = ( DOI ) getRefersToDataObject();
            // Look inside SDI if needed
            SDI sdi = null;
            for( int i = 0; i < sdiNames.length; ++i ) {

                final String sdiName = sdiNames[i];
                SclSwitch< Boolean > s4 = new SclSwitch< Boolean >() {

                    @Override
                    public Boolean caseSDI( SDI object ) {
                        return object.getName().equals( sdiName );
                    }

                    @Override
                    public Boolean defaultCase( EObject object ) {
                        return false;
                    }

                };

                List< SDI > res4 = null;
                if( sdi == null ) {
                    res4 = shallowSearchObjects( doi.getSDI(), s4 );
                }
                else {
                    res4 = shallowSearchObjects( sdi.getSubSDI(), s4 );
                }
                String mess4 = "SDI( name = " + sdiNames[i] + " ) for ExtRef on line " + getLineNumber()
                        + " ( in ied = " + ied.getName() + " )";
                if( res4.isEmpty() ) {
                    AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess4 );
                    return;
                }
                else if( res4.size() > 1 ) {
                    AbstractRiseClipseConsole.getConsole().error( "found several " + mess4 );
                    return;
                }
                else {
                    //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
                    sdi = res4.get( 0 );
                }
            }

            SclSwitch< Boolean > s5 = new SclSwitch< Boolean >() {

                @Override
                public Boolean caseDAI( DAI object ) {
                    return object.getName().equals( daNames[daNames.length - 1] );
                }

                @Override
                public Boolean defaultCase( EObject object ) {
                    return false;
                }

            };

            List< DataAttribute > res5 = null;
            if( sdi == null ) {
                res5 = shallowSearchObjects( Collections.< DataAttribute > unmodifiableList( doi.getDAI() ), s5 );
            }
            else {
                res5 = shallowSearchObjects( Collections.< DataAttribute > unmodifiableList( sdi.getDAI() ), s5 );
            }
            String mess5 = "DAI( name = " + getDaName() + " ) for ExtRef on line " + getLineNumber() + " ( in ied = "
                    + ied.getName() + " )";
            if( res5.isEmpty() ) {
                AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess5 );
                return;
            }
            else if( res5.size() > 1 ) {
                AbstractRiseClipseConsole.getConsole().error( "found several " + mess5 );
                return;
            }
            else {
                //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
                setRefersToDataAttribute( res5.get( 0 ) );
            }
        }

        else {
            // We have a DO, look for DA in DOType
            DO do_ = ( DO ) getRefersToDataObject();
            // Explicit link from DO to DOType may not be set
            do_.resolveLinks();
            if( do_.isSetRefersToDOType() ) {
                // daName may reference a BDA inside DAType
                // find an DA with
                //   DA.name      == ExtRef.daName[0]
                SclSwitch< Boolean > s5 = new SclSwitch< Boolean >() {

                    @Override
                    public Boolean caseDA( DA object ) {
                        return object.getName().equals( daNames[0] );
                    }

                    @Override
                    public Boolean defaultCase( EObject object ) {
                        return false;
                    }

                };

                List< DA > res5 = shallowSearchObjects( do_.getRefersToDOType().getDA(), s5 );
                String mess5 = "DA( name = " + daNames[0] + " ) for ExtRef on line " + getLineNumber()
                        + " ( in ied = " + ied.getName() + " )";
                if( res5.isEmpty() ) {
                    AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess5 );
                }
                else if( res5.size() > 1 ) {
                    AbstractRiseClipseConsole.getConsole().error( "found several " + mess5 );
                }
                else {
                    //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
                    // Look for a BDA
                    if( daNames.length > 1 ) {
                        // Explicit link from DA to DAType may not be set
                        res5.get( 0 ).resolveLinks();

                        if( res5.get( 0 ).isSetRefersToDAType() ) {
                            SclSwitch< Boolean > s6 = new SclSwitch< Boolean >() {

                                @Override
                                public Boolean caseBDA( BDA object ) {
                                    return object.getName().equals( daNames[1] );
                                }

                                @Override
                                public Boolean defaultCase( EObject object ) {
                                    return false;
                                }

                            };

                            List< BDA > res6 = shallowSearchObjects( res5.get( 0 ).getRefersToDAType().getBDA(), s6 );
                            String mess6 = "BDA( name = " + daNames[1] + " ) for ExtRef on line " + getLineNumber()
                                    + " ( in ied = " + ied.getName() + " )";
                            if( res6.isEmpty() ) {
                                AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess6 );
                            }
                            else if( res6.size() > 1 ) {
                                AbstractRiseClipseConsole.getConsole().error( "found several " + mess6 );
                            }
                            else {
                                setRefersToDataAttribute( res6.get( 0 ) );
                            }
                        }
                        else {
                            String mess6 = "DA( name = " + getDaName() + " ) for ExtRef on line " + getLineNumber()
                                    + " ( in ied = " + ied.getName() + " )";
                            AbstractRiseClipseConsole.getConsole().warning(
                                    "cannot find BDA for " + mess6
                                            + " because there is no DAType, ExtRef will reference DA" );
                            setRefersToDataAttribute( res5.get( 0 ) );
                        }
                    }
                    else {
                        setRefersToDataAttribute( res5.get( 0 ) );
                    }
                }

            }
            else {
                String mess5 = "DA( name = " + getDaName() + " ) for ExtRef on line " + getLineNumber()
                        + " ( in ied = " + ied.getName() + " )";
                AbstractRiseClipseConsole.getConsole().error(
                        "cannot find " + mess5 + " because there is no DOType" );
            }
        }
*/    }

} //ExtRefImpl
