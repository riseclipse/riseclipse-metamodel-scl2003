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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
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
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.logical.BooleanAndOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanNotOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FCDA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getDaName <em>Da Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getDoName <em>Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getFc <em>Fc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getIx <em>Ix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getRefersToDataAttribute <em>Refers To Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getRefersToDataObject <em>Refers To Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FCDAImpl extends ExplicitLinkResolverImpl implements FCDA {
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
     * The default value of the '{@link #getFc() <em>Fc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFc()
     * @generated NOT
     * @ordered
     */
    protected static final FCEnum FC_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getFc() <em>Fc</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFc()
	 * @generated
	 * @ordered
	 */
    protected FCEnum fc = FC_EDEFAULT;

    /**
	 * This is true if the Fc attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean fcESet;

    /**
	 * The default value of the '{@link #getIx() <em>Ix</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIx()
	 * @generated
	 * @ordered
	 */
    protected static final Integer IX_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getIx() <em>Ix</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIx()
	 * @generated
	 * @ordered
	 */
    protected Integer ix = IX_EDEFAULT;

    /**
	 * This is true if the Ix attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean ixESet;

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
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected FCDAImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.FCDA;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getDaName() {
        // TODO: wrong because it does not take into account structured names
        if( isSetRefersToDataAttribute() )
            return getRefersToDataAttribute().getName();
        else
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__DA_NAME, oldDaName, daName, !oldDaNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__DA_NAME, oldDaName, DA_NAME_EDEFAULT, oldDaNameESet));
	}

    /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
    public boolean isSetDaName() {
        return isSetRefersToDataAttribute();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getDoName() {
        // TODO: wrong because it does not take into account structured names
        if( isSetRefersToDataObject() )
            return getRefersToDataObject().getName();
        else
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__DO_NAME, oldDoName, doName, !oldDoNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__DO_NAME, oldDoName, DO_NAME_EDEFAULT, oldDoNameESet));
	}

    /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
    public boolean isSetDoName() {
        return isSetRefersToDataObject();
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FCEnum getFc() {
		return fc;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFc( FCEnum newFc ) {
		FCEnum oldFc = fc;
		fc = newFc == null ? FC_EDEFAULT : newFc;
		boolean oldFcESet = fcESet;
		fcESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__FC, oldFc, fc, !oldFcESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetFc() {
		FCEnum oldFc = fc;
		boolean oldFcESet = fcESet;
		fc = FC_EDEFAULT;
		fcESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__FC, oldFc, FC_EDEFAULT, oldFcESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetFc() {
		return fcESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Integer getIx() {
		return ix;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIx( Integer newIx ) {
		Integer oldIx = ix;
		ix = newIx;
		boolean oldIxESet = ixESet;
		ixESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__IX, oldIx, ix, !oldIxESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetIx() {
		Integer oldIx = ix;
		boolean oldIxESet = ixESet;
		ix = IX_EDEFAULT;
		ixESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__IX, oldIx, IX_EDEFAULT, oldIxESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetIx() {
		return ixESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__LD_INST, oldLdInst, ldInst, !oldLdInstESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__LD_INST, oldLdInst, LD_INST_EDEFAULT, oldLdInstESet));
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
     * @generated NOT
     */
    public String getLnClass() {
        if( isSetRefersToAnyLN() )
            return getRefersToAnyLN().getLnClass();
        else
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__LN_CLASS, oldLnClass, lnClass, !oldLnClassESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__LN_CLASS, oldLnClass, LN_CLASS_EDEFAULT, oldLnClassESet));
	}

    /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
    public boolean isSetLnClass() {
        return isSetRefersToAnyLN();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getLnInst() {
        if( isSetRefersToAnyLN() )
            return getRefersToAnyLN().getInst();
        else
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__LN_INST, oldLnInst, lnInst, !oldLnInstESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__LN_INST, oldLnInst, LN_INST_EDEFAULT, oldLnInstESet));
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean isSetLnInst() {
        return isSetRefersToAnyLN();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getPrefix() {
        // Default value is ""
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__PREFIX, oldPrefix, prefix, !oldPrefixESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__PREFIX, oldPrefix, PREFIX_EDEFAULT, oldPrefixESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__REFERS_TO_DATA_ATTRIBUTE, oldRefersToDataAttribute, newRefersToDataAttribute, !oldRefersToDataAttributeESet);
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
				msgs = ((InternalEObject)refersToDataAttribute).eInverseRemove(this, SclPackage.DATA_ATTRIBUTE__REFERRED_BY_FCDA, DataAttribute.class, msgs);
			if (newRefersToDataAttribute != null)
				msgs = ((InternalEObject)newRefersToDataAttribute).eInverseAdd(this, SclPackage.DATA_ATTRIBUTE__REFERRED_BY_FCDA, DataAttribute.class, msgs);
			msgs = basicSetRefersToDataAttribute(newRefersToDataAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToDataAttributeESet = refersToDataAttributeESet;
			refersToDataAttributeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__REFERS_TO_DATA_ATTRIBUTE, newRefersToDataAttribute, newRefersToDataAttribute, !oldRefersToDataAttributeESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__REFERS_TO_DATA_ATTRIBUTE, oldRefersToDataAttribute, null, oldRefersToDataAttributeESet);
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
			msgs = ((InternalEObject)refersToDataAttribute).eInverseRemove(this, SclPackage.DATA_ATTRIBUTE__REFERRED_BY_FCDA, DataAttribute.class, msgs);
			msgs = basicUnsetRefersToDataAttribute(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToDataAttributeESet = refersToDataAttributeESet;
			refersToDataAttributeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__REFERS_TO_DATA_ATTRIBUTE, null, null, oldRefersToDataAttributeESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__REFERS_TO_DATA_OBJECT, oldRefersToDataObject, newRefersToDataObject, !oldRefersToDataObjectESet);
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
				msgs = ((InternalEObject)refersToDataObject).eInverseRemove(this, SclPackage.DATA_OBJECT__REFERRED_BY_FCDA, DataObject.class, msgs);
			if (newRefersToDataObject != null)
				msgs = ((InternalEObject)newRefersToDataObject).eInverseAdd(this, SclPackage.DATA_OBJECT__REFERRED_BY_FCDA, DataObject.class, msgs);
			msgs = basicSetRefersToDataObject(newRefersToDataObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToDataObjectESet = refersToDataObjectESet;
			refersToDataObjectESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__REFERS_TO_DATA_OBJECT, newRefersToDataObject, newRefersToDataObject, !oldRefersToDataObjectESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__REFERS_TO_DATA_OBJECT, oldRefersToDataObject, null, oldRefersToDataObjectESet);
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
			msgs = ((InternalEObject)refersToDataObject).eInverseRemove(this, SclPackage.DATA_OBJECT__REFERRED_BY_FCDA, DataObject.class, msgs);
			msgs = basicUnsetRefersToDataObject(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToDataObjectESet = refersToDataObjectESet;
			refersToDataObjectESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__REFERS_TO_DATA_OBJECT, null, null, oldRefersToDataObjectESet));
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
    public DataSet getDataSet() {
		if (eContainerFeatureID() != SclPackage.FCDA__DATA_SET) return null;
		return (DataSet)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDataSet( DataSet newDataSet, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newDataSet, SclPackage.FCDA__DATA_SET, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDataSet( DataSet newDataSet ) {
		if (newDataSet != eInternalContainer() || (eContainerFeatureID() != SclPackage.FCDA__DATA_SET && newDataSet != null)) {
			if (EcoreUtil.isAncestor(this, newDataSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataSet != null)
				msgs = ((InternalEObject)newDataSet).eInverseAdd(this, SclPackage.DATA_SET__FCDA, DataSet.class, msgs);
			msgs = basicSetDataSet(newDataSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__DATA_SET, newDataSet, newDataSet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__REFERS_TO_ANY_LN, oldRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet);
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
				msgs = ((InternalEObject)refersToAnyLN).eInverseRemove(this, SclPackage.ANY_LN__REFERRED_BY_FCDA, AnyLN.class, msgs);
			if (newRefersToAnyLN != null)
				msgs = ((InternalEObject)newRefersToAnyLN).eInverseAdd(this, SclPackage.ANY_LN__REFERRED_BY_FCDA, AnyLN.class, msgs);
			msgs = basicSetRefersToAnyLN(newRefersToAnyLN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToAnyLNESet = refersToAnyLNESet;
			refersToAnyLNESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__REFERS_TO_ANY_LN, newRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__REFERS_TO_ANY_LN, oldRefersToAnyLN, null, oldRefersToAnyLNESet);
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
			msgs = ((InternalEObject)refersToAnyLN).eInverseRemove(this, SclPackage.ANY_LN__REFERRED_BY_FCDA, AnyLN.class, msgs);
			msgs = basicUnsetRefersToAnyLN(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToAnyLNESet = refersToAnyLNESet;
			refersToAnyLNESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__REFERS_TO_ANY_LN, null, null, oldRefersToAnyLNESet));
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
	public boolean validateFCDA_fc_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv FCDA_fc_required:
		 *   let severity : Integer[1] = 'FCDA::FCDA_fc_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.fc <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'fc attribute shall be present in FCDA (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'FCDA::FCDA_fc_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_FCDA_c_c_FCDA_fc_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ FCEnum fc = this.getFc();
			final /*@NonInvalid*/ EnumerationLiteralId BOXED_fc = fc == null ? null : SclTables.ENUMid_FCEnum.getEnumerationLiteralId(ClassUtil.nonNullState(fc.getName()));
			final /*@NonInvalid*/ boolean status = BOXED_fc != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_fc_32_attribute_32_shall_32_be_32_present_32_in_32_FCDA_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_FCDA_c_c_FCDA_fc_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_ldInst_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv FCDA_ldInst_required:
		 *   let severity : Integer[1] = 'FCDA::FCDA_ldInst_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.fc <> null and self.fc <> FCEnum::ST implies self.ldInst <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'ldInst attribute shall always be specified except for GSSE in FCDA (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'FCDA::FCDA_ldInst_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_FCDA_c_c_FCDA_ldInst_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ FCEnum fc_0 = this.getFc();
			final /*@NonInvalid*/ EnumerationLiteralId BOXED_fc_0 = fc_0 == null ? null : SclTables.ENUMid_FCEnum.getEnumerationLiteralId(ClassUtil.nonNullState(fc_0.getName()));
			final /*@NonInvalid*/ boolean ne = BOXED_fc_0 != null;
			/*@NonInvalid*/ boolean and;
			if (ne) {
				final /*@NonInvalid*/ boolean ne_0 = BOXED_fc_0 != SclTables.ELITid_ST;
				and = ne_0;
			}
			else {
				and = ValueUtil.FALSE_VALUE;
			}
			/*@NonInvalid*/ boolean status;
			if (and) {
				final /*@NonInvalid*/ String ldInst = this.getLdInst();
				final /*@NonInvalid*/ boolean ne_1 = ldInst != null;
				status = ne_1;
			}
			else {
				status = ValueUtil.TRUE_VALUE;
			}
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_ldInst_32_attribute_32_shall_32_always_32_be_32_specified_32_except_32_for_32_GSSE_32_in_32_FC, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_FCDA_c_c_FCDA_ldInst_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_lnClass_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv FCDA_lnClass_required:
		 *   let severity : Integer[1] = 'FCDA::FCDA_lnClass_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.fc <> null and self.fc <> FCEnum::ST implies self.lnClass <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'lnClass attribute shall always be specified except for GSSE in FCDA (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'FCDA::FCDA_lnClass_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_FCDA_c_c_FCDA_lnClass_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ FCEnum fc_0 = this.getFc();
			final /*@NonInvalid*/ EnumerationLiteralId BOXED_fc_0 = fc_0 == null ? null : SclTables.ENUMid_FCEnum.getEnumerationLiteralId(ClassUtil.nonNullState(fc_0.getName()));
			final /*@NonInvalid*/ boolean ne = BOXED_fc_0 != null;
			/*@NonInvalid*/ boolean and;
			if (ne) {
				final /*@NonInvalid*/ boolean ne_0 = BOXED_fc_0 != SclTables.ELITid_ST;
				and = ne_0;
			}
			else {
				and = ValueUtil.FALSE_VALUE;
			}
			/*@NonInvalid*/ boolean status;
			if (and) {
				final /*@NonInvalid*/ String lnClass = this.getLnClass();
				final /*@NonInvalid*/ boolean ne_1 = lnClass != null;
				status = ne_1;
			}
			else {
				status = ValueUtil.TRUE_VALUE;
			}
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_lnClass_32_attribute_32_shall_32_always_32_be_32_specified_32_except_32_for_32_GSSE_32_in_32_F, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_FCDA_c_c_FCDA_lnClass_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_lnClass_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv FCDA_lnClass_valid:
		 *   let severity : Integer[1] = 'FCDA::FCDA_lnClass_valid'.getSeverity()
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
		 *             Tuple{message = 'lnClass attribute shall be valid in FCDA (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.lnClass.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'FCDA::FCDA_lnClass_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_FCDA_c_c_FCDA_lnClass_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String lnClass_0 = this.getLnClass();
				final /*@NonInvalid*/ boolean ne = lnClass_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclLNClassEnum = ((SclObject)this).validSclLNClassEnum(lnClass_0);
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_lnClass_32_attribute_32_shall_32_be_32_valid_32_in_32_FCDA_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(lnClass_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_FCDA_c_c_FCDA_lnClass_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_lnInst_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv FCDA_lnInst_required:
		 *   let severity : Integer[1] = 'FCDA::FCDA_lnInst_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[?] = not self.DataSet.AnyLN.oclIsTypeOf(LN0) implies self.lnInst <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'lnInst attribute shall be specified except for LLN0 in FCDA (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'FCDA::FCDA_lnInst_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_FCDA_c_c_FCDA_lnInst_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_3;
		if (le) {
			symbol_3 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_2;
			try {
				/*@Caught*/ /*@NonNull*/ Object CAUGHT_oclIsTypeOf;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_scl_c_c_LN0 = idResolver.getClass(SclTables.CLSSid_LN0, null);
					final /*@NonInvalid*/ DataSet DataSet = this.getDataSet();
					if (DataSet == null) {
						throw new InvalidValueException("Null source for \'\'http://www.iec.ch/61850/2003/SCL\'::DataSet::AnyLN\'");
					}
					final /*@Thrown*/ AnyLN AnyLN = DataSet.getAnyLN();
					final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, AnyLN, TYP_scl_c_c_LN0).booleanValue();
					CAUGHT_oclIsTypeOf = oclIsTypeOf;
				}
				catch (Exception e) {
					CAUGHT_oclIsTypeOf = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_oclIsTypeOf);
				final /*@NonInvalid*/ String lnInst = this.getLnInst();
				final /*@NonInvalid*/ boolean ne = lnInst != null;
				final /*@Thrown*/ Boolean status = BooleanImpliesOperation.INSTANCE.evaluate(not, ne);
				final /*@Thrown*/ boolean symbol_0 = status == Boolean.TRUE;
				/*@Thrown*/ Object symbol_2;
				if (symbol_0) {
					symbol_2 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_lnInst_32_attribute_32_shall_32_be_32_specified_32_except_32_for_32_LLN0_32_in_32_FCDA_32_o_lin, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
					final /*@Thrown*/ TupleValue symbol_1 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
					symbol_2 = symbol_1;
				}
				CAUGHT_symbol_2 = symbol_2;
			}
			catch (Exception e) {
				CAUGHT_symbol_2 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_FCDA_c_c_FCDA_lnInst_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_2, SclTables.INT_0).booleanValue();
			symbol_3 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_3;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_lnInst_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv FCDA_lnInst_valid:
		 *   let severity : Integer[1] = 'FCDA::FCDA_lnInst_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[?] = not self.DataSet.AnyLN.oclIsTypeOf(LN0) implies self.lnInst <> null implies
		 *           self.validSclLNInst(lnInst)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'lnInst attribute shall be a number with no more than 7 digits in FCDA (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.lnInst.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'FCDA::FCDA_lnInst_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_FCDA_c_c_FCDA_lnInst_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_3;
		if (le) {
			symbol_3 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_2;
			try {
				/*@Caught*/ /*@NonNull*/ Object CAUGHT_oclIsTypeOf;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_scl_c_c_LN0_0 = idResolver.getClass(SclTables.CLSSid_LN0, null);
					final /*@NonInvalid*/ DataSet DataSet = this.getDataSet();
					if (DataSet == null) {
						throw new InvalidValueException("Null source for \'\'http://www.iec.ch/61850/2003/SCL\'::DataSet::AnyLN\'");
					}
					final /*@Thrown*/ AnyLN AnyLN = DataSet.getAnyLN();
					final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, AnyLN, TYP_scl_c_c_LN0_0).booleanValue();
					CAUGHT_oclIsTypeOf = oclIsTypeOf;
				}
				catch (Exception e) {
					CAUGHT_oclIsTypeOf = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(CAUGHT_oclIsTypeOf);
				/*@Caught*/ /*@NonNull*/ Object CAUGHT_implies;
				try {
					final /*@NonInvalid*/ String lnInst_0 = this.getLnInst();
					final /*@NonInvalid*/ boolean ne = lnInst_0 != null;
					/*@Thrown*/ boolean implies;
					if (ne) {
						final /*@Thrown*/ boolean validSclLNInst = ((SclObject)this).validSclLNInst(lnInst_0);
						implies = validSclLNInst;
					}
					else {
						implies = ValueUtil.TRUE_VALUE;
					}
					CAUGHT_implies = implies;
				}
				catch (Exception e) {
					CAUGHT_implies = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean status = BooleanImpliesOperation.INSTANCE.evaluate(not, CAUGHT_implies);
				final /*@Thrown*/ boolean symbol_0 = status == Boolean.TRUE;
				/*@Thrown*/ Object symbol_2;
				if (symbol_0) {
					symbol_2 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_lnInst_32_attribute_32_shall_32_be_32_a_32_number_32_with_32_no_32_more_32_than_32_7_32_digits_32_in, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@NonInvalid*/ String lnInst_1 = this.getLnInst();
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(lnInst_1);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_1 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_2 = symbol_1;
				}
				CAUGHT_symbol_2 = symbol_2;
			}
			catch (Exception e) {
				CAUGHT_symbol_2 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_FCDA_c_c_FCDA_lnInst_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_2, SclTables.INT_0).booleanValue();
			symbol_3 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_3;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_empty_attributes_only_if_GSSE(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv FCDA_empty_attributes_only_if_GSSE:
		 *   let
		 *     severity : Integer[1] = 'FCDA::FCDA_empty_attributes_only_if_GSSE'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[?] = (self.doName = null or self.doName.size() = 0
		 *         ) and
		 *         (self.daName = null or self.daName.size() = 0
		 *         ) and self.ix = null and
		 *         (self.ldInst = null or self.ldInst.size() = 0
		 *         ) and
		 *         (self.lnClass = null or self.lnClass.size() = 0
		 *         ) and
		 *         (self.lnInst = null or self.lnInst.size() = 0
		 *         ) and
		 *         (self.prefix = null or self.prefix.size() = 0
		 *         ) implies self.fc = FCEnum::ST
		 *       in
		 *         'FCDA::FCDA_empty_attributes_only_if_GSSE'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_FCDA_c_c_FCDA_empty_attributes_only_if_GSSE);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@Nullable*/ Object CAUGHT_result;
			try {
				/*@Caught*/ /*@Nullable*/ Object CAUGHT_and_4;
				try {
					/*@Caught*/ /*@Nullable*/ Object CAUGHT_and_3;
					try {
						/*@Caught*/ /*@Nullable*/ Object CAUGHT_and_2;
						try {
							/*@Caught*/ /*@Nullable*/ Object CAUGHT_and_1;
							try {
								/*@Caught*/ /*@Nullable*/ Object CAUGHT_and_0;
								try {
									/*@Caught*/ /*@Nullable*/ Object CAUGHT_and;
									try {
										/*@Caught*/ /*@NonNull*/ Object CAUGHT_or;
										try {
											final /*@NonInvalid*/ String doName = this.getDoName();
											final /*@NonInvalid*/ boolean eq = doName == null;
											/*@Thrown*/ boolean or;
											if (eq) {
												or = ValueUtil.TRUE_VALUE;
											}
											else {
												final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(doName);
												final /*@Thrown*/ boolean eq_0 = size.equals(SclTables.INT_0);
												or = eq_0;
											}
											CAUGHT_or = or;
										}
										catch (Exception e) {
											CAUGHT_or = ValueUtil.createInvalidValue(e);
										}
										/*@Caught*/ /*@NonNull*/ Object CAUGHT_or_0;
										try {
											final /*@NonInvalid*/ String daName = this.getDaName();
											final /*@NonInvalid*/ boolean eq_1 = daName == null;
											/*@Thrown*/ boolean or_0;
											if (eq_1) {
												or_0 = ValueUtil.TRUE_VALUE;
											}
											else {
												final /*@Thrown*/ IntegerValue size_0 = StringSizeOperation.INSTANCE.evaluate(daName);
												final /*@Thrown*/ boolean eq_2 = size_0.equals(SclTables.INT_0);
												or_0 = eq_2;
											}
											CAUGHT_or_0 = or_0;
										}
										catch (Exception e) {
											CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
										}
										final /*@Thrown*/ Boolean and = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_or, CAUGHT_or_0);
										CAUGHT_and = and;
									}
									catch (Exception e) {
										CAUGHT_and = ValueUtil.createInvalidValue(e);
									}
									final /*@NonInvalid*/ Integer ix = this.getIx();
									final /*@NonInvalid*/ IntegerValue BOXED_ix = ix == null ? null : ValueUtil.integerValueOf(ix);
									final /*@NonInvalid*/ boolean eq_3 = BOXED_ix == null;
									final /*@Thrown*/ Boolean and_0 = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_and, eq_3);
									CAUGHT_and_0 = and_0;
								}
								catch (Exception e) {
									CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
								}
								/*@Caught*/ /*@NonNull*/ Object CAUGHT_or_1;
								try {
									final /*@NonInvalid*/ String ldInst = this.getLdInst();
									final /*@NonInvalid*/ boolean eq_4 = ldInst == null;
									/*@Thrown*/ boolean or_1;
									if (eq_4) {
										or_1 = ValueUtil.TRUE_VALUE;
									}
									else {
										final /*@Thrown*/ IntegerValue size_1 = StringSizeOperation.INSTANCE.evaluate(ldInst);
										final /*@Thrown*/ boolean eq_5 = size_1.equals(SclTables.INT_0);
										or_1 = eq_5;
									}
									CAUGHT_or_1 = or_1;
								}
								catch (Exception e) {
									CAUGHT_or_1 = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean and_1 = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_and_0, CAUGHT_or_1);
								CAUGHT_and_1 = and_1;
							}
							catch (Exception e) {
								CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
							}
							/*@Caught*/ /*@NonNull*/ Object CAUGHT_or_2;
							try {
								final /*@NonInvalid*/ String lnClass = this.getLnClass();
								final /*@NonInvalid*/ boolean eq_6 = lnClass == null;
								/*@Thrown*/ boolean or_2;
								if (eq_6) {
									or_2 = ValueUtil.TRUE_VALUE;
								}
								else {
									final /*@Thrown*/ IntegerValue size_2 = StringSizeOperation.INSTANCE.evaluate(lnClass);
									final /*@Thrown*/ boolean eq_7 = size_2.equals(SclTables.INT_0);
									or_2 = eq_7;
								}
								CAUGHT_or_2 = or_2;
							}
							catch (Exception e) {
								CAUGHT_or_2 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_2 = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_and_1, CAUGHT_or_2);
							CAUGHT_and_2 = and_2;
						}
						catch (Exception e) {
							CAUGHT_and_2 = ValueUtil.createInvalidValue(e);
						}
						/*@Caught*/ /*@NonNull*/ Object CAUGHT_or_3;
						try {
							final /*@NonInvalid*/ String lnInst = this.getLnInst();
							final /*@NonInvalid*/ boolean eq_8 = lnInst == null;
							/*@Thrown*/ boolean or_3;
							if (eq_8) {
								or_3 = ValueUtil.TRUE_VALUE;
							}
							else {
								final /*@Thrown*/ IntegerValue size_3 = StringSizeOperation.INSTANCE.evaluate(lnInst);
								final /*@Thrown*/ boolean eq_9 = size_3.equals(SclTables.INT_0);
								or_3 = eq_9;
							}
							CAUGHT_or_3 = or_3;
						}
						catch (Exception e) {
							CAUGHT_or_3 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and_3 = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_and_2, CAUGHT_or_3);
						CAUGHT_and_3 = and_3;
					}
					catch (Exception e) {
						CAUGHT_and_3 = ValueUtil.createInvalidValue(e);
					}
					/*@Caught*/ /*@NonNull*/ Object CAUGHT_or_4;
					try {
						final /*@NonInvalid*/ String prefix = this.getPrefix();
						final /*@NonInvalid*/ boolean eq_10 = prefix == null;
						/*@Thrown*/ boolean or_4;
						if (eq_10) {
							or_4 = ValueUtil.TRUE_VALUE;
						}
						else {
							final /*@Thrown*/ IntegerValue size_4 = StringSizeOperation.INSTANCE.evaluate(prefix);
							final /*@Thrown*/ boolean eq_11 = size_4.equals(SclTables.INT_0);
							or_4 = eq_11;
						}
						CAUGHT_or_4 = or_4;
					}
					catch (Exception e) {
						CAUGHT_or_4 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean and_4 = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_and_3, CAUGHT_or_4);
					CAUGHT_and_4 = and_4;
				}
				catch (Exception e) {
					CAUGHT_and_4 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ FCEnum fc = this.getFc();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_fc = fc == null ? null : SclTables.ENUMid_FCEnum.getEnumerationLiteralId(ClassUtil.nonNullState(fc.getName()));
				final /*@NonInvalid*/ boolean eq_12 = BOXED_fc == SclTables.ELITid_ST;
				final /*@Thrown*/ Boolean result = BooleanImpliesOperation.INSTANCE.evaluate(CAUGHT_and_4, eq_12);
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_FCDA_c_c_FCDA_empty_attributes_only_if_GSSE, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, SclTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_ldInst_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv FCDA_ldInst_valid:
		 *   let severity : Integer[1] = 'FCDA::FCDA_ldInst_valid'.getSeverity()
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
		 *             Tuple{message = 'ldInst attribute shall be valid in FCDA (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.ldInst.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'FCDA::FCDA_ldInst_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_FCDA_c_c_FCDA_ldInst_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String ldInst = this.getLdInst();
				final /*@NonInvalid*/ boolean ne = ldInst != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclLDInst = ((SclObject)this).validSclLDInst(ldInst);
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_ldInst_32_attribute_32_shall_32_be_32_valid_32_in_32_FCDA_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(ldInst);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_FCDA_c_c_FCDA_ldInst_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_prefix_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv FCDA_prefix_valid:
		 *   let severity : Integer[1] = 'FCDA::FCDA_prefix_valid'.getSeverity()
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
		 *             Tuple{message = 'prefix attribute shall be valid in FCDA (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.prefix.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'FCDA::FCDA_prefix_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_FCDA_c_c_FCDA_prefix_valid);
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_prefix_32_attribute_32_shall_32_be_32_valid_32_in_32_FCDA_32_o_line_32, toString);
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
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_FCDA_c_c_FCDA_prefix_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
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
		 *   let severity : Integer[1] = 'FCDA::FCDA_doName_valid'.getSeverity()
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
		 *         'FCDA::FCDA_doName_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_FCDA_c_c_FCDA_doName_valid);
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
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_FCDA_c_c_FCDA_doName_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
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
		 *   let severity : Integer[1] = 'FCDA::FCDA_daName_valid'.getSeverity()
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
		 *         'FCDA::FCDA_daName_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_FCDA_c_c_FCDA_daName_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String daName = this.getDaName();
				final /*@NonInvalid*/ boolean ne = daName != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclFullAttributeName = ((SclObject)this).validSclFullAttributeName(daName);
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
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(daName);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_FCDA_c_c_FCDA_daName_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_ix_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv FCDA_ix_valid:
		 *   let severity : Integer[1] = 'FCDA::FCDA_ix_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.ix <> null implies self.ix >= 0
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'ix attribute shall be valid in FCDA (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.ix.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'FCDA::FCDA_ix_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_FCDA_c_c_FCDA_ix_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ Integer ix_0 = this.getIx();
				final /*@NonInvalid*/ IntegerValue BOXED_ix_0 = ix_0 == null ? null : ValueUtil.integerValueOf(ix_0);
				final /*@NonInvalid*/ boolean ne = BOXED_ix_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_ix_0, SclTables.INT_0).booleanValue();
					status = ge;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_ix_32_attribute_32_shall_32_be_32_valid_32_in_32_FCDA_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_ix_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_FCDA_c_c_FCDA_ix_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.FCDA__REFERS_TO_DATA_ATTRIBUTE:
				if (refersToDataAttribute != null)
					msgs = ((InternalEObject)refersToDataAttribute).eInverseRemove(this, SclPackage.DATA_ATTRIBUTE__REFERRED_BY_FCDA, DataAttribute.class, msgs);
				return basicSetRefersToDataAttribute((DataAttribute)otherEnd, msgs);
			case SclPackage.FCDA__REFERS_TO_DATA_OBJECT:
				if (refersToDataObject != null)
					msgs = ((InternalEObject)refersToDataObject).eInverseRemove(this, SclPackage.DATA_OBJECT__REFERRED_BY_FCDA, DataObject.class, msgs);
				return basicSetRefersToDataObject((DataObject)otherEnd, msgs);
			case SclPackage.FCDA__DATA_SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataSet((DataSet)otherEnd, msgs);
			case SclPackage.FCDA__REFERS_TO_ANY_LN:
				if (refersToAnyLN != null)
					msgs = ((InternalEObject)refersToAnyLN).eInverseRemove(this, SclPackage.ANY_LN__REFERRED_BY_FCDA, AnyLN.class, msgs);
				return basicSetRefersToAnyLN((AnyLN)otherEnd, msgs);
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
			case SclPackage.FCDA__REFERS_TO_DATA_ATTRIBUTE:
				return basicUnsetRefersToDataAttribute(msgs);
			case SclPackage.FCDA__REFERS_TO_DATA_OBJECT:
				return basicUnsetRefersToDataObject(msgs);
			case SclPackage.FCDA__DATA_SET:
				return basicSetDataSet(null, msgs);
			case SclPackage.FCDA__REFERS_TO_ANY_LN:
				return basicUnsetRefersToAnyLN(msgs);
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
			case SclPackage.FCDA__DATA_SET:
				return eInternalContainer().eInverseRemove(this, SclPackage.DATA_SET__FCDA, DataSet.class, msgs);
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
			case SclPackage.FCDA__DA_NAME:
				return getDaName();
			case SclPackage.FCDA__DO_NAME:
				return getDoName();
			case SclPackage.FCDA__FC:
				return getFc();
			case SclPackage.FCDA__IX:
				return getIx();
			case SclPackage.FCDA__LD_INST:
				return getLdInst();
			case SclPackage.FCDA__LN_CLASS:
				return getLnClass();
			case SclPackage.FCDA__LN_INST:
				return getLnInst();
			case SclPackage.FCDA__PREFIX:
				return getPrefix();
			case SclPackage.FCDA__REFERS_TO_DATA_ATTRIBUTE:
				return getRefersToDataAttribute();
			case SclPackage.FCDA__REFERS_TO_DATA_OBJECT:
				return getRefersToDataObject();
			case SclPackage.FCDA__DATA_SET:
				return getDataSet();
			case SclPackage.FCDA__REFERS_TO_ANY_LN:
				return getRefersToAnyLN();
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
			case SclPackage.FCDA__DA_NAME:
				setDaName((String)newValue);
				return;
			case SclPackage.FCDA__DO_NAME:
				setDoName((String)newValue);
				return;
			case SclPackage.FCDA__FC:
				setFc((FCEnum)newValue);
				return;
			case SclPackage.FCDA__IX:
				setIx((Integer)newValue);
				return;
			case SclPackage.FCDA__LD_INST:
				setLdInst((String)newValue);
				return;
			case SclPackage.FCDA__LN_CLASS:
				setLnClass((String)newValue);
				return;
			case SclPackage.FCDA__LN_INST:
				setLnInst((String)newValue);
				return;
			case SclPackage.FCDA__PREFIX:
				setPrefix((String)newValue);
				return;
			case SclPackage.FCDA__REFERS_TO_DATA_ATTRIBUTE:
				setRefersToDataAttribute((DataAttribute)newValue);
				return;
			case SclPackage.FCDA__REFERS_TO_DATA_OBJECT:
				setRefersToDataObject((DataObject)newValue);
				return;
			case SclPackage.FCDA__DATA_SET:
				setDataSet((DataSet)newValue);
				return;
			case SclPackage.FCDA__REFERS_TO_ANY_LN:
				setRefersToAnyLN((AnyLN)newValue);
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
			case SclPackage.FCDA__DA_NAME:
				unsetDaName();
				return;
			case SclPackage.FCDA__DO_NAME:
				unsetDoName();
				return;
			case SclPackage.FCDA__FC:
				unsetFc();
				return;
			case SclPackage.FCDA__IX:
				unsetIx();
				return;
			case SclPackage.FCDA__LD_INST:
				unsetLdInst();
				return;
			case SclPackage.FCDA__LN_CLASS:
				unsetLnClass();
				return;
			case SclPackage.FCDA__LN_INST:
				unsetLnInst();
				return;
			case SclPackage.FCDA__PREFIX:
				unsetPrefix();
				return;
			case SclPackage.FCDA__REFERS_TO_DATA_ATTRIBUTE:
				unsetRefersToDataAttribute();
				return;
			case SclPackage.FCDA__REFERS_TO_DATA_OBJECT:
				unsetRefersToDataObject();
				return;
			case SclPackage.FCDA__DATA_SET:
				setDataSet((DataSet)null);
				return;
			case SclPackage.FCDA__REFERS_TO_ANY_LN:
				unsetRefersToAnyLN();
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
			case SclPackage.FCDA__DA_NAME:
				return isSetDaName();
			case SclPackage.FCDA__DO_NAME:
				return isSetDoName();
			case SclPackage.FCDA__FC:
				return isSetFc();
			case SclPackage.FCDA__IX:
				return isSetIx();
			case SclPackage.FCDA__LD_INST:
				return isSetLdInst();
			case SclPackage.FCDA__LN_CLASS:
				return isSetLnClass();
			case SclPackage.FCDA__LN_INST:
				return isSetLnInst();
			case SclPackage.FCDA__PREFIX:
				return isSetPrefix();
			case SclPackage.FCDA__REFERS_TO_DATA_ATTRIBUTE:
				return isSetRefersToDataAttribute();
			case SclPackage.FCDA__REFERS_TO_DATA_OBJECT:
				return isSetRefersToDataObject();
			case SclPackage.FCDA__DATA_SET:
				return getDataSet() != null;
			case SclPackage.FCDA__REFERS_TO_ANY_LN:
				return isSetRefersToAnyLN();
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
			case SclPackage.FCDA___VALIDATE_FCDA_FC_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateFCDA_fc_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.FCDA___VALIDATE_FCDA_LD_INST_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateFCDA_ldInst_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.FCDA___VALIDATE_FCDA_LN_CLASS_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateFCDA_lnClass_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.FCDA___VALIDATE_FCDA_LN_CLASS_VALID__DIAGNOSTICCHAIN_MAP:
				return validateFCDA_lnClass_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.FCDA___VALIDATE_FCDA_LN_INST_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateFCDA_lnInst_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.FCDA___VALIDATE_FCDA_LN_INST_VALID__DIAGNOSTICCHAIN_MAP:
				return validateFCDA_lnInst_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.FCDA___VALIDATE_FCDA_EMPTY_ATTRIBUTES_ONLY_IF_GSSE__DIAGNOSTICCHAIN_MAP:
				return validateFCDA_empty_attributes_only_if_GSSE((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.FCDA___VALIDATE_FCDA_LD_INST_VALID__DIAGNOSTICCHAIN_MAP:
				return validateFCDA_ldInst_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.FCDA___VALIDATE_FCDA_PREFIX_VALID__DIAGNOSTICCHAIN_MAP:
				return validateFCDA_prefix_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.FCDA___VALIDATE_FCDA_DO_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateFCDA_doName_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.FCDA___VALIDATE_FCDA_DA_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateFCDA_daName_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.FCDA___VALIDATE_FCDA_IX_VALID__DIAGNOSTICCHAIN_MAP:
				return validateFCDA_ix_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", fc: ");
		if (fcESet) result.append(fc); else result.append("<unset>");
		result.append(", ix: ");
		if (ixESet) result.append(ix); else result.append("<unset>");
		result.append(", ldInst: ");
		if (ldInstESet) result.append(ldInst); else result.append("<unset>");
		result.append(", lnClass: ");
		if (lnClassESet) result.append(lnClass); else result.append("<unset>");
		result.append(", lnInst: ");
		if (lnInstESet) result.append(lnInst); else result.append("<unset>");
		result.append(", prefix: ");
		if (prefixESet) result.append(prefix); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

    @Override
    protected void doResolveLinks() {
        // ldInst   The LD where the DO resides; shall always be specified except for GSSE
        // prefix   Prefix identifying together with lnInst and lnClass the LN where the DO resides; optional, default value is the empty string
        // lnClass  LN class of the LN where the DO resides; shall always be specified except for GSSE DataLabel empty string
        // lnInst   Instance number of the LN where the DO resides; shall be specified except for LLN0
        // doName   A name identifying the DO (within the LN). A name standardized in IEC 61850-7-4. If doName is empty, then fc can contain a value,
        //          selecting the attribute category of all DOs of the defined LN. For elements or parts of structured data object types, all name parts
        //          are contained, separated by dots (.), down to (but without) the level where the fc is defined. If an SDO array element is selected,
        //          the appropriate name part shall contain at its end before a possible dot the array element number in the form (ArrayElementNumber).
        // daName   The attribute name – if missing, all attributes with functional characteristic given by fc are selected. For elements or parts of
        //          structured data types, all name parts are contained, separated by dots (.), starting at the level where the fc is defined. If an
        //          attribute’s array element is selected, the appropriate attribute name part shall contain at its end before any separating dot the
        //          array element number in the form (ArrayElementNumber).
        // fc       All attributes of this functional constraint are selected. Possible constraint values see IEC 61850-7-2 or the fc definition in 9.5
        // ix       An index to select an array element in case that one of the data elements is an array. The ix value shall be identical to the
        //          ArrayElementNumber value in the doName or daName part.

        // Resolve only if attribute has been read
        if( !ldInstESet ) return;

        // We need the IED to find the LN
        IED ied = getDataSet().getAnyLN().getLDevice().getIED();
        // TODO: error message
        if( ied == null ) return;

        // find inside an LDevice with
        //   LDevice.name == FCDA.ldInst
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
        String mess1 = "LDevice( inst = " + getLdInst() + " ) for FCDA on line " + getLineNumber()
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
                AbstractRiseClipseConsole.getConsole().error( "cannot find LN0 for FCDA on line " + getLineNumber()
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
            //   LN.lnClass == FCDA.lnClass
            //   LN.prefix == FCDA.prefix
            //   LN.inst == FCDA.lnInst
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
            String mess2 = "LN( lnClass = " + getLnClass() + ", inst = " + getLnInst() + " ) for FCDA on line "
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
        String mess3 = "DO or DOI( name = " + getDoName() + " ) for FCDA on line " + getLineNumber()
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
                String mess4 = "SDI( name = " + sdiNames[i] + " ) for FCDA on line " + getLineNumber()
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
            String mess5 = "DAI( name = " + getDaName() + " ) for FCDA on line " + getLineNumber() + " ( in ied = "
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
                //   DA.name      == FCDA.daName[0]
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
                String mess5 = "DA( name = " + daNames[0] + " ) for FCDA on line " + getLineNumber()
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
                            String mess6 = "BDA( name = " + daNames[1] + " ) for FCDA on line " + getLineNumber()
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
                            String mess6 = "DA( name = " + getDaName() + " ) for FCDA on line " + getLineNumber()
                                    + " ( in ied = " + ied.getName() + " )";
                            AbstractRiseClipseConsole.getConsole().warning(
                                    "cannot find BDA for " + mess6
                                            + " because there is no DAType, FCDA will reference DA" );
                            setRefersToDataAttribute( res5.get( 0 ) );
                        }
                    }
                    else {
                        setRefersToDataAttribute( res5.get( 0 ) );
                    }
                }

            }
            else {
                String mess5 = "DA( name = " + getDaName() + " ) for FCDA on line " + getLineNumber()
                        + " ( in ied = " + ied.getName() + " )";
                AbstractRiseClipseConsole.getConsole().error(
                        "cannot find " + mess5 + " because there is no DOType" );
            }
        }
    }

} //FCDAImpl
