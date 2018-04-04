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

import java.util.Collections;
import java.util.List;

import java.util.Map;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclSwitch;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ext Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtRefImpl extends BaseElementImpl implements ExtRef {
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
     * @generated NOT
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
	 * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
    protected static final String DESC_EDEFAULT = null;

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
    public String getDaName() {
		return daName;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetDaName() {
		return daNameESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getDoName() {
		return doName;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetDoName() {
		return doNameESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getIedName() {
		return iedName;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetIedName() {
		return iedNameESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getIntAddr() {
		return intAddr;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetIntAddr() {
		return intAddrESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getLdInst() {
		return ldInst;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetLdInst() {
		return ldInstESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getLnClass() {
		return lnClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetLnClass() {
		return lnClassESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getLnInst() {
		return lnInst;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetLnInst() {
		return lnInstESet;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getPrefix() {
        if( isSetPrefix() ) {
            return prefix;
        }
        return "";
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetPrefix() {
		return prefixESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ServiceType getServiceType() {
		return serviceType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetServiceType() {
		return serviceTypeESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getSrcCBName() {
		return srcCBName;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetSrcCBName() {
		return srcCBNameESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getSrcLDInst() {
		return srcLDInst;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetSrcLDInst() {
		return srcLDInstESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getSrcLNClass() {
		return srcLNClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetSrcLNClass() {
		return srcLNClassESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getSrcLNInst() {
		return srcLNInst;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetSrcLNInst() {
		return srcLNInstESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getSrcPrefix() {
		return srcPrefix;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetSrcPrefix() {
		return srcPrefixESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetRefersToAnyLN() {
		return refersToAnyLNESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetRefersToDataAttribute() {
		return refersToDataAttributeESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetRefersToDataObject() {
		return refersToDataObjectESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getDesc() {
		return desc;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetDesc() {
		return descESet;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_iedName_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ExtRef_iedName_valid:
		 *   let severity : Integer[1] = 'ExtRef::ExtRef_iedName_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.iedName <> null implies
		 *           self.validSclIEDNameOrRelative(iedName)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'iedName attribute shall be valid in ExtRef (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.iedName.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ExtRef::ExtRef_iedName_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ExtRef_c_c_ExtRef_iedName_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String iedName = this.getIedName();
				final /*@NonInvalid*/ boolean ne = iedName != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclIEDNameOrRelative = ((SclObject)this).validSclIEDNameOrRelative(iedName);
					status = validSclIEDNameOrRelative;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_iedName_32_attribute_32_shall_32_be_32_valid_32_in_32_ExtRef_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(iedName);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ExtRef_c_c_ExtRef_iedName_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_ldInst_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ExtRef_ldInst_valid:
		 *   let severity : Integer[1] = 'ExtRef::ExtRef_ldInst_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.ldInst <> null implies
		 *           self.validSclLDInst(ldInst)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'ldInst attribute shall be valid in ExtRef (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.ldInst.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ExtRef::ExtRef_ldInst_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ExtRef_c_c_ExtRef_ldInst_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String ldInst_0 = this.getLdInst();
				final /*@NonInvalid*/ boolean ne = ldInst_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclLDInst = ((SclObject)this).validSclLDInst(ldInst_0);
					status = validSclLDInst;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_ldInst_32_attribute_32_shall_32_be_32_valid_32_in_32_ExtRef_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(ldInst_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ExtRef_c_c_ExtRef_ldInst_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_prefix_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ExtRef_prefix_valid:
		 *   let severity : Integer[1] = 'ExtRef::ExtRef_prefix_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.prefix <> null implies
		 *           self.validSclPrefix(prefix)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'prefix attribute shall be valid in ExtRef (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.prefix.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ExtRef::ExtRef_prefix_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ExtRef_c_c_ExtRef_prefix_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String prefix_0 = this.getPrefix();
				final /*@NonInvalid*/ boolean ne = prefix_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclPrefix = ((SclObject)this).validSclPrefix(prefix_0);
					status = validSclPrefix;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_prefix_32_attribute_32_shall_32_be_32_valid_32_in_32_ExtRef_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(prefix_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ExtRef_c_c_ExtRef_prefix_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_lnClass_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ExtRef_lnClass_valid:
		 *   let severity : Integer[1] = 'ExtRef::ExtRef_lnClass_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.lnClass <> null implies
		 *           self.validSclLNClassEnum(lnClass)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'lnClass attribute shall be valid in ExtRef (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.lnClass.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ExtRef::ExtRef_lnClass_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ExtRef_c_c_ExtRef_lnClass_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String lnClass = this.getLnClass();
				final /*@NonInvalid*/ boolean ne = lnClass != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclLNClassEnum = ((SclObject)this).validSclLNClassEnum(lnClass);
					status = validSclLNClassEnum;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_lnClass_32_attribute_32_shall_32_be_32_valid_32_in_32_ExtRef_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(lnClass);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ExtRef_c_c_ExtRef_lnClass_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_lnInst_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ExtRef_lnInst_valid:
		 *   let severity : Integer[1] = 'ExtRef::ExtRef_lnInst_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.lnInst <> null implies
		 *           self.validSclLNInstOrEmpty(lnInst)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'lnInst attribute shall be valid in ExtRef (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.lnInst.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ExtRef::ExtRef_lnInst_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ExtRef_c_c_ExtRef_lnInst_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String lnInst = this.getLnInst();
				final /*@NonInvalid*/ boolean ne = lnInst != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclLNInstOrEmpty = ((SclObject)this).validSclLNInstOrEmpty(lnInst);
					status = validSclLNInstOrEmpty;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_lnInst_32_attribute_32_shall_32_be_32_valid_32_in_32_ExtRef_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(lnInst);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ExtRef_c_c_ExtRef_lnInst_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_doName_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv FCDA_doName_valid:
		 *   let severity : Integer[1] = 'ExtRef::FCDA_doName_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.doName <> null implies
		 *           self.validSclFullDOName(doName)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'doName attribute shall be valid in FCDA (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.doName.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ExtRef::FCDA_doName_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ExtRef_c_c_FCDA_doName_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String doName = this.getDoName();
				final /*@NonInvalid*/ boolean ne = doName != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclFullDOName = ((SclObject)this).validSclFullDOName(doName);
					status = validSclFullDOName;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_doName_32_attribute_32_shall_32_be_32_valid_32_in_32_FCDA_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(doName);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ExtRef_c_c_FCDA_doName_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_daName_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv FCDA_daName_valid:
		 *   let severity : Integer[1] = 'ExtRef::FCDA_daName_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.daName <> null implies
		 *           self.validSclFullAttributeName(daName)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'daName attribute shall be valid in FCDA (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.daName.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ExtRef::FCDA_daName_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ExtRef_c_c_FCDA_daName_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String daName_0 = this.getDaName();
				final /*@NonInvalid*/ boolean ne = daName_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclFullAttributeName = ((SclObject)this).validSclFullAttributeName(daName_0);
					status = validSclFullAttributeName;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_daName_32_attribute_32_shall_32_be_32_valid_32_in_32_FCDA_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(daName_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ExtRef_c_c_FCDA_daName_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_srcLDInst_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ExtRef_srcLDInst_valid:
		 *   let severity : Integer[1] = 'ExtRef::ExtRef_srcLDInst_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.srcLDInst <> null implies
		 *           self.validSclLDInst(srcLDInst)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'srcLDInst attribute shall be valid in ExtRef (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.srcLDInst.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ExtRef::ExtRef_srcLDInst_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ExtRef_c_c_ExtRef_srcLDInst_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String srcLDInst = this.getSrcLDInst();
				final /*@NonInvalid*/ boolean ne = srcLDInst != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclLDInst = ((SclObject)this).validSclLDInst(srcLDInst);
					status = validSclLDInst;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_srcLDInst_32_attribute_32_shall_32_be_32_valid_32_in_32_ExtRef_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(srcLDInst);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ExtRef_c_c_ExtRef_srcLDInst_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_srcPrefix_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ExtRef_srcPrefix_valid:
		 *   let severity : Integer[1] = 'ExtRef::ExtRef_srcPrefix_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.srcPrefix <> null implies
		 *           self.validSclPrefix(srcPrefix)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'srcPrefix attribute shall be valid in ExtRef (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.srcPrefix.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ExtRef::ExtRef_srcPrefix_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ExtRef_c_c_ExtRef_srcPrefix_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String srcPrefix_0 = this.getSrcPrefix();
				final /*@NonInvalid*/ boolean ne = srcPrefix_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclPrefix = ((SclObject)this).validSclPrefix(srcPrefix_0);
					status = validSclPrefix;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_srcPrefix_32_attribute_32_shall_32_be_32_valid_32_in_32_ExtRef_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(srcPrefix_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ExtRef_c_c_ExtRef_srcPrefix_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_srcLNClass_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ExtRef_srcLNClass_valid:
		 *   let severity : Integer[1] = 'ExtRef::ExtRef_srcLNClass_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.srcLNClass <> null implies
		 *           self.validSclLNClassEnum(srcLNClass)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'srcLNClass attribute shall be valid in ExtRef (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.srcLNClass.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ExtRef::ExtRef_srcLNClass_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ExtRef_c_c_ExtRef_srcLNClass_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String srcLNClass = this.getSrcLNClass();
				final /*@NonInvalid*/ boolean ne = srcLNClass != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclLNClassEnum = ((SclObject)this).validSclLNClassEnum(srcLNClass);
					status = validSclLNClassEnum;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_srcLNClass_32_attribute_32_shall_32_be_32_valid_32_in_32_ExtRef_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(srcLNClass);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ExtRef_c_c_ExtRef_srcLNClass_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_srcLNInst_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ExtRef_srcLNInst_valid:
		 *   let severity : Integer[1] = 'ExtRef::ExtRef_srcLNInst_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.srcLNInst <> null implies
		 *           self.validSclLNInstOrEmpty(srcLNInst)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'srcLNInst attribute shall be valid in ExtRef (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.srcLNInst.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ExtRef::ExtRef_srcLNInst_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ExtRef_c_c_ExtRef_srcLNInst_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String srcLNInst_0 = this.getSrcLNInst();
				final /*@NonInvalid*/ boolean ne = srcLNInst_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclLNInstOrEmpty = ((SclObject)this).validSclLNInstOrEmpty(srcLNInst_0);
					status = validSclLNInstOrEmpty;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_srcLNInst_32_attribute_32_shall_32_be_32_valid_32_in_32_ExtRef_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(srcLNInst_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ExtRef_c_c_ExtRef_srcLNInst_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_srcCBName_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ExtRef_srcCBName_valid:
		 *   let severity : Integer[1] = 'ExtRef::ExtRef_srcCBName_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.srcCBName <> null implies
		 *           self.validSclCBName(srcCBName)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'srcCBName attribute shall be valid ExtRef (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.srcCBName.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ExtRef::ExtRef_srcCBName_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ExtRef_c_c_ExtRef_srcCBName_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String srcCBName = this.getSrcCBName();
				final /*@NonInvalid*/ boolean ne = srcCBName != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclCBName = ((SclObject)this).validSclCBName(srcCBName);
					status = validSclCBName;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_srcCBName_32_attribute_32_shall_32_be_32_valid_32_ExtRef_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(srcCBName);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ExtRef_c_c_ExtRef_srcCBName_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
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
			case SclPackage.EXT_REF__DESC:
				return getDesc();
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
			case SclPackage.EXT_REF__DESC:
				setDesc((String)newValue);
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
			case SclPackage.EXT_REF__DESC:
				unsetDesc();
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
			case SclPackage.EXT_REF__DESC:
				return isSetDesc();
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
			case SclPackage.EXT_REF___VALIDATE_EXT_REF_IED_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateExtRef_iedName_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.EXT_REF___VALIDATE_EXT_REF_LD_INST_VALID__DIAGNOSTICCHAIN_MAP:
				return validateExtRef_ldInst_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.EXT_REF___VALIDATE_EXT_REF_PREFIX_VALID__DIAGNOSTICCHAIN_MAP:
				return validateExtRef_prefix_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.EXT_REF___VALIDATE_EXT_REF_LN_CLASS_VALID__DIAGNOSTICCHAIN_MAP:
				return validateExtRef_lnClass_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.EXT_REF___VALIDATE_EXT_REF_LN_INST_VALID__DIAGNOSTICCHAIN_MAP:
				return validateExtRef_lnInst_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.EXT_REF___VALIDATE_FCDA_DO_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateFCDA_doName_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.EXT_REF___VALIDATE_FCDA_DA_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateFCDA_daName_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.EXT_REF___VALIDATE_EXT_REF_SRC_LD_INST_VALID__DIAGNOSTICCHAIN_MAP:
				return validateExtRef_srcLDInst_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.EXT_REF___VALIDATE_EXT_REF_SRC_PREFIX_VALID__DIAGNOSTICCHAIN_MAP:
				return validateExtRef_srcPrefix_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.EXT_REF___VALIDATE_EXT_REF_SRC_LN_CLASS_VALID__DIAGNOSTICCHAIN_MAP:
				return validateExtRef_srcLNClass_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.EXT_REF___VALIDATE_EXT_REF_SRC_LN_INST_VALID__DIAGNOSTICCHAIN_MAP:
				return validateExtRef_srcLNInst_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.EXT_REF___VALIDATE_EXT_REF_SRC_CB_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateExtRef_srcCBName_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (daName: ");
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
		result.append(", desc: ");
		if (descESet) result.append(desc); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

    @Override
    protected void doResolveLinks() {
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

        // Resolve only if attribute has been read
        if( ! isSetIedName() ) return;

        // find an IED with
        //   IED.name == ExtRef.iedName
        SclSwitch< Boolean > s = new SclSwitch< Boolean >() {

            @Override
            public Boolean caseIED( IED object ) {
                return object.getName().equals( getIedName() );
            }

            @Override
            public Boolean defaultCase( EObject object ) {
                return false;
            }

        };

        IED ied = null;
        List< IED > res = shallowSearchObjects( getSCLRoot().getIED(), s );
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
        
        // find inside an LDevice with
        //   LDevice.name == ExtRef.ldInst
        SclSwitch< Boolean > s1 = new SclSwitch< Boolean >() {

            @Override
            public Boolean caseLDevice( LDevice object ) {
                return object.getInst().equals( getLdInst() );
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
            if( !lnClassESet ) return;
            if( !lnInstESet ) return;
            // prefix is optional
            //if( ! prefixESet ) return;

            // find inside an LN with
            //   LN.lnClass == ExtRef.lnClass
            //   LN.prefix == ExtRef.prefix
            //   LN.inst == ExtRef.lnInst
            SclSwitch< Boolean > s2 = new SclSwitch< Boolean >() {

                @Override
                public Boolean caseLN( LN object ) {
                    if( object.getLnClass().equals( getLnClass() ) && object.getInst().equals( getLnInst() ) ) {
                        if( object.getPrefix() == null ) return getPrefix() == null;
                        return object.getPrefix().equals( getPrefix() );
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
        if( ! isSetDoName() ) return;
        
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
    }

} //ExtRefImpl
