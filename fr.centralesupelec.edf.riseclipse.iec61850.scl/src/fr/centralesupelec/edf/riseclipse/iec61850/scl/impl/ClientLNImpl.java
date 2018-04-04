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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled;
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
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client LN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl#getApRef <em>Ap Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl#getRptEnabled <em>Rpt Enabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientLNImpl extends ExplicitLinkResolverImpl implements ClientLN {
    /**
	 * The default value of the '{@link #getApRef() <em>Ap Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getApRef()
	 * @generated
	 * @ordered
	 */
    protected static final String AP_REF_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getApRef() <em>Ap Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getApRef()
	 * @generated
	 * @ordered
	 */
    protected String apRef = AP_REF_EDEFAULT;

    /**
	 * This is true if the Ap Ref attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean apRefESet;

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
	 * The default value of the '{@link #getLdInst() <em>Ld Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLdInst()
	 * @generated
	 * @ordered
	 */
    protected static final String LD_INST_EDEFAULT = "";

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
    protected ClientLNImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.CLIENT_LN;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getApRef() {
		return apRef;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setApRef( String newApRef ) {
		String oldApRef = apRef;
		apRef = newApRef;
		boolean oldApRefESet = apRefESet;
		apRefESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__AP_REF, oldApRef, apRef, !oldApRefESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetApRef() {
		String oldApRef = apRef;
		boolean oldApRefESet = apRefESet;
		apRef = AP_REF_EDEFAULT;
		apRefESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CLIENT_LN__AP_REF, oldApRef, AP_REF_EDEFAULT, oldApRefESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetApRef() {
		return apRefESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__IED_NAME, oldIedName, iedName, !oldIedNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CLIENT_LN__IED_NAME, oldIedName, IED_NAME_EDEFAULT, oldIedNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__LD_INST, oldLdInst, ldInst, !oldLdInstESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CLIENT_LN__LD_INST, oldLdInst, LD_INST_EDEFAULT, oldLdInstESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__LN_CLASS, oldLnClass, lnClass, !oldLnClassESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CLIENT_LN__LN_CLASS, oldLnClass, LN_CLASS_EDEFAULT, oldLnClassESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__LN_INST, oldLnInst, lnInst, !oldLnInstESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CLIENT_LN__LN_INST, oldLnInst, LN_INST_EDEFAULT, oldLnInstESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__PREFIX, oldPrefix, prefix, !oldPrefixESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CLIENT_LN__PREFIX, oldPrefix, PREFIX_EDEFAULT, oldPrefixESet));
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
    public RptEnabled getRptEnabled() {
		if (eContainerFeatureID() != SclPackage.CLIENT_LN__RPT_ENABLED) return null;
		return (RptEnabled)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetRptEnabled( RptEnabled newRptEnabled, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newRptEnabled, SclPackage.CLIENT_LN__RPT_ENABLED, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRptEnabled( RptEnabled newRptEnabled ) {
		if (newRptEnabled != eInternalContainer() || (eContainerFeatureID() != SclPackage.CLIENT_LN__RPT_ENABLED && newRptEnabled != null)) {
			if (EcoreUtil.isAncestor(this, newRptEnabled))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRptEnabled != null)
				msgs = ((InternalEObject)newRptEnabled).eInverseAdd(this, SclPackage.RPT_ENABLED__CLIENT_LN, RptEnabled.class, msgs);
			msgs = basicSetRptEnabled(newRptEnabled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__RPT_ENABLED, newRptEnabled, newRptEnabled));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__DESC, oldDesc, desc, !oldDescESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CLIENT_LN__DESC, oldDesc, DESC_EDEFAULT, oldDescESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__REFERS_TO_ANY_LN, oldRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet);
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
				msgs = ((InternalEObject)refersToAnyLN).eInverseRemove(this, SclPackage.ANY_LN__REFERRED_BY_CLIENT_LN, AnyLN.class, msgs);
			if (newRefersToAnyLN != null)
				msgs = ((InternalEObject)newRefersToAnyLN).eInverseAdd(this, SclPackage.ANY_LN__REFERRED_BY_CLIENT_LN, AnyLN.class, msgs);
			msgs = basicSetRefersToAnyLN(newRefersToAnyLN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToAnyLNESet = refersToAnyLNESet;
			refersToAnyLNESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__REFERS_TO_ANY_LN, newRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.CLIENT_LN__REFERS_TO_ANY_LN, oldRefersToAnyLN, null, oldRefersToAnyLNESet);
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
			msgs = ((InternalEObject)refersToAnyLN).eInverseRemove(this, SclPackage.ANY_LN__REFERRED_BY_CLIENT_LN, AnyLN.class, msgs);
			msgs = basicUnsetRefersToAnyLN(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToAnyLNESet = refersToAnyLNESet;
			refersToAnyLNESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CLIENT_LN__REFERS_TO_ANY_LN, null, null, oldRefersToAnyLNESet));
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
	public boolean validateClientLN_apRef_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ClientLN_apRef_valid:
		 *   let severity : Integer[1] = 'ClientLN::ClientLN_apRef_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.apRef <> null implies
		 *           self.validSclAccessPointName(apRef)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'apRef attribute shall be valid in ClientLN (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.apRef.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ClientLN::ClientLN_apRef_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ClientLN_c_c_ClientLN_apRef_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String apRef = this.getApRef();
				final /*@NonInvalid*/ boolean ne = apRef != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclAccessPointName = ((SclObject)this).validSclAccessPointName(apRef);
					status = validSclAccessPointName;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_apRef_32_attribute_32_shall_32_be_32_valid_32_in_32_ClientLN_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(apRef);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ClientLN_c_c_ClientLN_apRef_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_iedName_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ClientLN_iedName_required:
		 *   let
		 *     severity : Integer[1] = 'ClientLN::ClientLN_iedName_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.iedName <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'iedName attribute shall be present in ClientLN (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'ClientLN::ClientLN_iedName_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ClientLN_c_c_ClientLN_iedName_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String iedName = this.getIedName();
			final /*@NonInvalid*/ boolean status = iedName != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_iedName_32_attribute_32_shall_32_be_32_present_32_in_32_ClientLN_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ClientLN_c_c_ClientLN_iedName_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_iedName_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ClientLN_iedName_valid:
		 *   let severity : Integer[1] = 'ClientLN::ClientLN_iedName_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.iedName <> null implies
		 *           self.validSclIEDName(iedName)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'iedName attribute shall be valid in ClientLN (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.iedName.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ClientLN::ClientLN_iedName_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ClientLN_c_c_ClientLN_iedName_valid);
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
					final /*@Thrown*/ boolean validSclIEDName = ((SclObject)this).validSclIEDName(iedName);
					status = validSclIEDName;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_iedName_32_attribute_32_shall_32_be_32_valid_32_in_32_ClientLN_32_o_line_32, toString);
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
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ClientLN_c_c_ClientLN_iedName_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_ldInst_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ClientLN_ldInst_required:
		 *   let
		 *     severity : Integer[1] = 'ClientLN::ClientLN_ldInst_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.ldInst <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'ldInst attribute shall present in ClientLN (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'ClientLN::ClientLN_ldInst_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ClientLN_c_c_ClientLN_ldInst_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String ldInst = this.getLdInst();
			final /*@NonInvalid*/ boolean status = ldInst != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_ldInst_32_attribute_32_shall_32_present_32_in_32_ClientLN_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ClientLN_c_c_ClientLN_ldInst_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_ldInst_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ClientLN_ldInst_valid:
		 *   let severity : Integer[1] = 'ClientLN::ClientLN_ldInst_valid'.getSeverity()
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
		 *             Tuple{message = 'ldInst attribute shall be valid in ClientLN (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.ldInst.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ClientLN::ClientLN_ldInst_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ClientLN_c_c_ClientLN_ldInst_valid);
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_ldInst_32_attribute_32_shall_32_be_32_valid_32_in_32_ClientLN_32_o_line_32, toString);
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
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ClientLN_c_c_ClientLN_ldInst_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_lnClass_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ClientLN_lnClass_required:
		 *   let
		 *     severity : Integer[1] = 'ClientLN::ClientLN_lnClass_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.lnClass <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'lnClass attribute shall present in ClientLN (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'ClientLN::ClientLN_lnClass_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ClientLN_c_c_ClientLN_lnClass_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String lnClass = this.getLnClass();
			final /*@NonInvalid*/ boolean status = lnClass != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_lnClass_32_attribute_32_shall_32_present_32_in_32_ClientLN_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ClientLN_c_c_ClientLN_lnClass_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_lnClass_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ClientLN_lnClass_valid:
		 *   let severity : Integer[1] = 'ClientLN::ClientLN_lnClass_valid'.getSeverity()
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
		 *             Tuple{message = 'lnClass attribute shall be valid in ClientLN (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.lnClass.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ClientLN::ClientLN_lnClass_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ClientLN_c_c_ClientLN_lnClass_valid);
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_lnClass_32_attribute_32_shall_32_be_32_valid_32_in_32_ClientLN_32_o_line_32, toString);
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
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ClientLN_c_c_ClientLN_lnClass_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_lnInst_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ClientLN_lnInst_required:
		 *   let
		 *     severity : Integer[1] = 'ClientLN::ClientLN_lnInst_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.lnInst <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'lnInst attribute shall be present in ClientLN (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'ClientLN::ClientLN_lnInst_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ClientLN_c_c_ClientLN_lnInst_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String lnInst = this.getLnInst();
			final /*@NonInvalid*/ boolean status = lnInst != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_lnInst_32_attribute_32_shall_32_be_32_present_32_in_32_ClientLN_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ClientLN_c_c_ClientLN_lnInst_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_lnInst_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ClientLN_lnInst_valid:
		 *   let severity : Integer[1] = 'ClientLN::ClientLN_lnInst_valid'.getSeverity()
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
		 *             Tuple{message = 'lnInst attribute shall be valid in ClientLN (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.lnInst.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ClientLN::ClientLN_lnInst_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ClientLN_c_c_ClientLN_lnInst_valid);
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_lnInst_32_attribute_32_shall_32_be_32_valid_32_in_32_ClientLN_32_o_line_32, toString);
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
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ClientLN_c_c_ClientLN_lnInst_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_lnInst_empty_for_LLN0(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ClientLN_lnInst_empty_for_LLN0:
		 *   let
		 *     severity : Integer[1] = 'ClientLN::ClientLN_lnInst_empty_for_LLN0'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.lnInst <> null implies
		 *           if self.lnClass = 'LLN0'
		 *           then self.lnInst.size() = 0
		 *           else self.lnInst.size() > 0
		 *           endif
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'lnInst attribute shall be empty for LLN0 in ClientLN (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.lnInst.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ClientLN::ClientLN_lnInst_empty_for_LLN0'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ClientLN_c_c_ClientLN_lnInst_empty_for_LLN0);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_3;
		if (le) {
			symbol_3 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_2;
			try {
				final /*@NonInvalid*/ String lnInst = this.getLnInst();
				final /*@NonInvalid*/ boolean ne = lnInst != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ IntegerValue size_0 = StringSizeOperation.INSTANCE.evaluate(lnInst);
					final /*@NonInvalid*/ String lnClass = this.getLnClass();
					final /*@NonInvalid*/ boolean eq = SclTables.STR_LLN0.equals(lnClass);
					/*@Thrown*/ boolean symbol_0;
					if (eq) {
						final /*@Thrown*/ boolean eq_0 = size_0.equals(SclTables.INT_0);
						symbol_0 = eq_0;
					}
					else {
						final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size_0, SclTables.INT_0).booleanValue();
						symbol_0 = gt;
					}
					status = symbol_0;
				}
				else {
					status = ValueUtil.TRUE_VALUE;
				}
				/*@Thrown*/ Object symbol_2;
				if (status) {
					symbol_2 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_lnInst_32_attribute_32_shall_32_be_32_empty_32_for_32_LLN0_32_in_32_ClientLN_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(lnInst);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_1 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_2 = symbol_1;
				}
				CAUGHT_symbol_2 = symbol_2;
			}
			catch (Exception e) {
				CAUGHT_symbol_2 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ClientLN_c_c_ClientLN_lnInst_empty_for_LLN0, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_2, SclTables.INT_0).booleanValue();
			symbol_3 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_3;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_prefix_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ClientLN_prefix_valid:
		 *   let severity : Integer[1] = 'ClientLN::ClientLN_prefix_valid'.getSeverity()
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
		 *             Tuple{message = 'prefix attribute shall be valid in ClientLN (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.prefix.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ClientLN::ClientLN_prefix_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ClientLN_c_c_ClientLN_prefix_valid);
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_prefix_32_attribute_32_shall_32_be_32_valid_32_in_32_ClientLN_32_o_line_32, toString);
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
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ClientLN_c_c_ClientLN_prefix_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.CLIENT_LN__RPT_ENABLED:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRptEnabled((RptEnabled)otherEnd, msgs);
			case SclPackage.CLIENT_LN__REFERS_TO_ANY_LN:
				if (refersToAnyLN != null)
					msgs = ((InternalEObject)refersToAnyLN).eInverseRemove(this, SclPackage.ANY_LN__REFERRED_BY_CLIENT_LN, AnyLN.class, msgs);
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
			case SclPackage.CLIENT_LN__RPT_ENABLED:
				return basicSetRptEnabled(null, msgs);
			case SclPackage.CLIENT_LN__REFERS_TO_ANY_LN:
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
			case SclPackage.CLIENT_LN__RPT_ENABLED:
				return eInternalContainer().eInverseRemove(this, SclPackage.RPT_ENABLED__CLIENT_LN, RptEnabled.class, msgs);
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
			case SclPackage.CLIENT_LN__AP_REF:
				return getApRef();
			case SclPackage.CLIENT_LN__IED_NAME:
				return getIedName();
			case SclPackage.CLIENT_LN__LD_INST:
				return getLdInst();
			case SclPackage.CLIENT_LN__LN_CLASS:
				return getLnClass();
			case SclPackage.CLIENT_LN__LN_INST:
				return getLnInst();
			case SclPackage.CLIENT_LN__PREFIX:
				return getPrefix();
			case SclPackage.CLIENT_LN__RPT_ENABLED:
				return getRptEnabled();
			case SclPackage.CLIENT_LN__DESC:
				return getDesc();
			case SclPackage.CLIENT_LN__REFERS_TO_ANY_LN:
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
			case SclPackage.CLIENT_LN__AP_REF:
				setApRef((String)newValue);
				return;
			case SclPackage.CLIENT_LN__IED_NAME:
				setIedName((String)newValue);
				return;
			case SclPackage.CLIENT_LN__LD_INST:
				setLdInst((String)newValue);
				return;
			case SclPackage.CLIENT_LN__LN_CLASS:
				setLnClass((String)newValue);
				return;
			case SclPackage.CLIENT_LN__LN_INST:
				setLnInst((String)newValue);
				return;
			case SclPackage.CLIENT_LN__PREFIX:
				setPrefix((String)newValue);
				return;
			case SclPackage.CLIENT_LN__RPT_ENABLED:
				setRptEnabled((RptEnabled)newValue);
				return;
			case SclPackage.CLIENT_LN__DESC:
				setDesc((String)newValue);
				return;
			case SclPackage.CLIENT_LN__REFERS_TO_ANY_LN:
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
			case SclPackage.CLIENT_LN__AP_REF:
				unsetApRef();
				return;
			case SclPackage.CLIENT_LN__IED_NAME:
				unsetIedName();
				return;
			case SclPackage.CLIENT_LN__LD_INST:
				unsetLdInst();
				return;
			case SclPackage.CLIENT_LN__LN_CLASS:
				unsetLnClass();
				return;
			case SclPackage.CLIENT_LN__LN_INST:
				unsetLnInst();
				return;
			case SclPackage.CLIENT_LN__PREFIX:
				unsetPrefix();
				return;
			case SclPackage.CLIENT_LN__RPT_ENABLED:
				setRptEnabled((RptEnabled)null);
				return;
			case SclPackage.CLIENT_LN__DESC:
				unsetDesc();
				return;
			case SclPackage.CLIENT_LN__REFERS_TO_ANY_LN:
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
			case SclPackage.CLIENT_LN__AP_REF:
				return isSetApRef();
			case SclPackage.CLIENT_LN__IED_NAME:
				return isSetIedName();
			case SclPackage.CLIENT_LN__LD_INST:
				return isSetLdInst();
			case SclPackage.CLIENT_LN__LN_CLASS:
				return isSetLnClass();
			case SclPackage.CLIENT_LN__LN_INST:
				return isSetLnInst();
			case SclPackage.CLIENT_LN__PREFIX:
				return isSetPrefix();
			case SclPackage.CLIENT_LN__RPT_ENABLED:
				return getRptEnabled() != null;
			case SclPackage.CLIENT_LN__DESC:
				return isSetDesc();
			case SclPackage.CLIENT_LN__REFERS_TO_ANY_LN:
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
			case SclPackage.CLIENT_LN___VALIDATE_CLIENT_LN_AP_REF_VALID__DIAGNOSTICCHAIN_MAP:
				return validateClientLN_apRef_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CLIENT_LN___VALIDATE_CLIENT_LN_IED_NAME_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateClientLN_iedName_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CLIENT_LN___VALIDATE_CLIENT_LN_IED_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateClientLN_iedName_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CLIENT_LN___VALIDATE_CLIENT_LN_LD_INST_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateClientLN_ldInst_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CLIENT_LN___VALIDATE_CLIENT_LN_LD_INST_VALID__DIAGNOSTICCHAIN_MAP:
				return validateClientLN_ldInst_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CLIENT_LN___VALIDATE_CLIENT_LN_LN_CLASS_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateClientLN_lnClass_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CLIENT_LN___VALIDATE_CLIENT_LN_LN_CLASS_VALID__DIAGNOSTICCHAIN_MAP:
				return validateClientLN_lnClass_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CLIENT_LN___VALIDATE_CLIENT_LN_LN_INST_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateClientLN_lnInst_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CLIENT_LN___VALIDATE_CLIENT_LN_LN_INST_VALID__DIAGNOSTICCHAIN_MAP:
				return validateClientLN_lnInst_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CLIENT_LN___VALIDATE_CLIENT_LN_LN_INST_EMPTY_FOR_LLN0__DIAGNOSTICCHAIN_MAP:
				return validateClientLN_lnInst_empty_for_LLN0((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CLIENT_LN___VALIDATE_CLIENT_LN_PREFIX_VALID__DIAGNOSTICCHAIN_MAP:
				return validateClientLN_prefix_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (apRef: ");
		if (apRefESet) result.append(apRef); else result.append("<unset>");
		result.append(", iedName: ");
		if (iedNameESet) result.append(iedName); else result.append("<unset>");
		result.append(", ldInst: ");
		if (ldInstESet) result.append(ldInst); else result.append("<unset>");
		result.append(", lnClass: ");
		if (lnClassESet) result.append(lnClass); else result.append("<unset>");
		result.append(", lnInst: ");
		if (lnInstESet) result.append(lnInst); else result.append("<unset>");
		result.append(", prefix: ");
		if (prefixESet) result.append(prefix); else result.append("<unset>");
		result.append(", desc: ");
		if (descESet) result.append(desc); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

    @Override
    protected void doResolveLinks() {
        // iedName The name of the IED where the LN resides
        // apRef   The name of the access point via which the IED shall be accessed. Optional, not needed if the IED has only one access point.
        // ldInst  The instance identification of the LD where the LN resides
        // prefix  The LN prefix
        // lnClass The LN class according to IEC 61850-7-4
        // lnInst  The instance id of this LN instance of below LN class in the IED
        // desc    optional descriptive text, e.g. about purpose of the client

        // Resolve only if attribute has been read
        if( ! isSetIedName() ) return;

        // find an IED with
        //   IED.name == ClientLN.iedName
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
        String mess = "IED( name = " + getIedName() + " ) for ClientLN on line " + getLineNumber() + " )";
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
        
        // The following is copy/paste from ExtRef/FCDA
        // TODO: factor out ?
        
        // find inside an LDevice with
        //   LDevice.name == ClientLN.ldInst
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
        String mess1 = "LDevice( inst = " + getLdInst() + " ) for ClientLN on line " + getLineNumber()
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
                AbstractRiseClipseConsole.getConsole().error( "cannot find LN0 for ClientLN on line " + getLineNumber()
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
            //   LN.lnClass == ClientLN.lnClass
            //   LN.prefix == ClientLN.prefix
            //   LN.inst == ClientLN.lnInst
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
            String mess2 = "LN( lnClass = " + getLnClass() + ", inst = " + getLnInst() + " ) for ClientLN on line "
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
    }

} //ClientLNImpl
