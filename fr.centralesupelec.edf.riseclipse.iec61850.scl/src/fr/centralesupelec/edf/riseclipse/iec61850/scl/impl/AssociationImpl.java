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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Association;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AssociationKindEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Server;
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
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getAssociationID <em>Association ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getServer <em>Server</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends BaseElementImpl implements Association {
    /**
	 * The default value of the '{@link #getAssociationID() <em>Association ID</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAssociationID()
	 * @generated
	 * @ordered
	 */
    protected static final String ASSOCIATION_ID_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getAssociationID() <em>Association ID</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAssociationID()
	 * @generated
	 * @ordered
	 */
    protected String associationID = ASSOCIATION_ID_EDEFAULT;

    /**
	 * This is true if the Association ID attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean associationIDESet;

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
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated NOT
     * @ordered
     */
    protected static final AssociationKindEnum KIND_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
    protected AssociationKindEnum kind = KIND_EDEFAULT;

    /**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean kindESet;

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
    protected AssociationImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.ASSOCIATION;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getAssociationID() {
		return associationID;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAssociationID( String newAssociationID ) {
		String oldAssociationID = associationID;
		associationID = newAssociationID;
		boolean oldAssociationIDESet = associationIDESet;
		associationIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ASSOCIATION__ASSOCIATION_ID, oldAssociationID, associationID, !oldAssociationIDESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetAssociationID() {
		String oldAssociationID = associationID;
		boolean oldAssociationIDESet = associationIDESet;
		associationID = ASSOCIATION_ID_EDEFAULT;
		associationIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ASSOCIATION__ASSOCIATION_ID, oldAssociationID, ASSOCIATION_ID_EDEFAULT, oldAssociationIDESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetAssociationID() {
		return associationIDESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ASSOCIATION__IED_NAME, oldIedName, iedName, !oldIedNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ASSOCIATION__IED_NAME, oldIedName, IED_NAME_EDEFAULT, oldIedNameESet));
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
    public AssociationKindEnum getKind() {
		return kind;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setKind( AssociationKindEnum newKind ) {
		AssociationKindEnum oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		boolean oldKindESet = kindESet;
		kindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ASSOCIATION__KIND, oldKind, kind, !oldKindESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetKind() {
		AssociationKindEnum oldKind = kind;
		boolean oldKindESet = kindESet;
		kind = KIND_EDEFAULT;
		kindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ASSOCIATION__KIND, oldKind, KIND_EDEFAULT, oldKindESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetKind() {
		return kindESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ASSOCIATION__LD_INST, oldLdInst, ldInst, !oldLdInstESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ASSOCIATION__LD_INST, oldLdInst, LD_INST_EDEFAULT, oldLdInstESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ASSOCIATION__LN_CLASS, oldLnClass, lnClass, !oldLnClassESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ASSOCIATION__LN_CLASS, oldLnClass, LN_CLASS_EDEFAULT, oldLnClassESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ASSOCIATION__LN_INST, oldLnInst, lnInst, !oldLnInstESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ASSOCIATION__LN_INST, oldLnInst, LN_INST_EDEFAULT, oldLnInstESet));
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
	 * @generated
	 */
    public String getPrefix() {
		return prefix;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ASSOCIATION__PREFIX, oldPrefix, prefix, !oldPrefixESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ASSOCIATION__PREFIX, oldPrefix, PREFIX_EDEFAULT, oldPrefixESet));
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
    public Server getServer() {
		if (eContainerFeatureID() != SclPackage.ASSOCIATION__SERVER) return null;
		return (Server)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetServer( Server newServer, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newServer, SclPackage.ASSOCIATION__SERVER, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setServer( Server newServer ) {
		if (newServer != eInternalContainer() || (eContainerFeatureID() != SclPackage.ASSOCIATION__SERVER && newServer != null)) {
			if (EcoreUtil.isAncestor(this, newServer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServer != null)
				msgs = ((InternalEObject)newServer).eInverseAdd(this, SclPackage.SERVER__ASSOCIATION, Server.class, msgs);
			msgs = basicSetServer(newServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ASSOCIATION__SERVER, newServer, newServer));
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
    public NotificationChain basicSetRefersToAnyLN( AnyLN newRefersToAnyLN, NotificationChain msgs ) {
		AnyLN oldRefersToAnyLN = refersToAnyLN;
		refersToAnyLN = newRefersToAnyLN;
		boolean oldRefersToAnyLNESet = refersToAnyLNESet;
		refersToAnyLNESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.ASSOCIATION__REFERS_TO_ANY_LN, oldRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRefersToAnyLN( AnyLN newRefersToAnyLN ) {
		if (newRefersToAnyLN != refersToAnyLN) {
			NotificationChain msgs = null;
			if (refersToAnyLN != null)
				msgs = ((InternalEObject)refersToAnyLN).eInverseRemove(this, SclPackage.ANY_LN__REFERRED_BY_ASSOCIATION, AnyLN.class, msgs);
			if (newRefersToAnyLN != null)
				msgs = ((InternalEObject)newRefersToAnyLN).eInverseAdd(this, SclPackage.ANY_LN__REFERRED_BY_ASSOCIATION, AnyLN.class, msgs);
			msgs = basicSetRefersToAnyLN(newRefersToAnyLN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToAnyLNESet = refersToAnyLNESet;
			refersToAnyLNESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ASSOCIATION__REFERS_TO_ANY_LN, newRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetRefersToAnyLN( NotificationChain msgs ) {
		AnyLN oldRefersToAnyLN = refersToAnyLN;
		refersToAnyLN = null;
		boolean oldRefersToAnyLNESet = refersToAnyLNESet;
		refersToAnyLNESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.ASSOCIATION__REFERS_TO_ANY_LN, oldRefersToAnyLN, null, oldRefersToAnyLNESet);
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
			msgs = ((InternalEObject)refersToAnyLN).eInverseRemove(this, SclPackage.ANY_LN__REFERRED_BY_ASSOCIATION, AnyLN.class, msgs);
			msgs = basicUnsetRefersToAnyLN(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToAnyLNESet = refersToAnyLNESet;
			refersToAnyLNESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ASSOCIATION__REFERS_TO_ANY_LN, null, null, oldRefersToAnyLNESet));
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
	public boolean validateAssociation_kind_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv Association_kind_required:
		 *   let
		 *     severity : Integer[1] = 'Association::Association_kind_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.kind <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'kind attribute shall be present in Association (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'Association::Association_kind_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_Association_c_c_Association_kind_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ AssociationKindEnum kind = this.getKind();
			final /*@NonInvalid*/ EnumerationLiteralId BOXED_kind = kind == null ? null : SclTables.ENUMid_AssociationKindEnum.getEnumerationLiteralId(ClassUtil.nonNullState(kind.getName()));
			final /*@NonInvalid*/ boolean status = BOXED_kind != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_kind_32_attribute_32_shall_32_be_32_present_32_in_32_Association_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_Association_c_c_Association_kind_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_associationID_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv Association_associationID_valid:
		 *   let
		 *     severity : Integer[1] = 'Association::Association_associationID_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.associationID <> null implies
		 *           self.validSclAssociationID(associationID)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'The length of the association ID shall be at least one (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.associationID.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'Association::Association_associationID_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_Association_c_c_Association_associationID_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String associationID_0 = this.getAssociationID();
				final /*@NonInvalid*/ boolean ne = associationID_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclAssociationID = ((SclObject)this).validSclAssociationID(associationID_0);
					status = validSclAssociationID;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_The_32_length_32_of_32_the_32_association_32_ID_32_shall_32_be_32_at_32_least_32_one_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(associationID_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_Association_c_c_Association_associationID_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.ASSOCIATION__SERVER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetServer((Server)otherEnd, msgs);
			case SclPackage.ASSOCIATION__REFERS_TO_ANY_LN:
				if (refersToAnyLN != null)
					msgs = ((InternalEObject)refersToAnyLN).eInverseRemove(this, SclPackage.ANY_LN__REFERRED_BY_ASSOCIATION, AnyLN.class, msgs);
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
			case SclPackage.ASSOCIATION__SERVER:
				return basicSetServer(null, msgs);
			case SclPackage.ASSOCIATION__REFERS_TO_ANY_LN:
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
			case SclPackage.ASSOCIATION__SERVER:
				return eInternalContainer().eInverseRemove(this, SclPackage.SERVER__ASSOCIATION, Server.class, msgs);
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
			case SclPackage.ASSOCIATION__ASSOCIATION_ID:
				return getAssociationID();
			case SclPackage.ASSOCIATION__IED_NAME:
				return getIedName();
			case SclPackage.ASSOCIATION__KIND:
				return getKind();
			case SclPackage.ASSOCIATION__LD_INST:
				return getLdInst();
			case SclPackage.ASSOCIATION__LN_CLASS:
				return getLnClass();
			case SclPackage.ASSOCIATION__LN_INST:
				return getLnInst();
			case SclPackage.ASSOCIATION__PREFIX:
				return getPrefix();
			case SclPackage.ASSOCIATION__SERVER:
				return getServer();
			case SclPackage.ASSOCIATION__REFERS_TO_ANY_LN:
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
			case SclPackage.ASSOCIATION__ASSOCIATION_ID:
				setAssociationID((String)newValue);
				return;
			case SclPackage.ASSOCIATION__IED_NAME:
				setIedName((String)newValue);
				return;
			case SclPackage.ASSOCIATION__KIND:
				setKind((AssociationKindEnum)newValue);
				return;
			case SclPackage.ASSOCIATION__LD_INST:
				setLdInst((String)newValue);
				return;
			case SclPackage.ASSOCIATION__LN_CLASS:
				setLnClass((String)newValue);
				return;
			case SclPackage.ASSOCIATION__LN_INST:
				setLnInst((String)newValue);
				return;
			case SclPackage.ASSOCIATION__PREFIX:
				setPrefix((String)newValue);
				return;
			case SclPackage.ASSOCIATION__SERVER:
				setServer((Server)newValue);
				return;
			case SclPackage.ASSOCIATION__REFERS_TO_ANY_LN:
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
			case SclPackage.ASSOCIATION__ASSOCIATION_ID:
				unsetAssociationID();
				return;
			case SclPackage.ASSOCIATION__IED_NAME:
				unsetIedName();
				return;
			case SclPackage.ASSOCIATION__KIND:
				unsetKind();
				return;
			case SclPackage.ASSOCIATION__LD_INST:
				unsetLdInst();
				return;
			case SclPackage.ASSOCIATION__LN_CLASS:
				unsetLnClass();
				return;
			case SclPackage.ASSOCIATION__LN_INST:
				unsetLnInst();
				return;
			case SclPackage.ASSOCIATION__PREFIX:
				unsetPrefix();
				return;
			case SclPackage.ASSOCIATION__SERVER:
				setServer((Server)null);
				return;
			case SclPackage.ASSOCIATION__REFERS_TO_ANY_LN:
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
			case SclPackage.ASSOCIATION__ASSOCIATION_ID:
				return isSetAssociationID();
			case SclPackage.ASSOCIATION__IED_NAME:
				return isSetIedName();
			case SclPackage.ASSOCIATION__KIND:
				return isSetKind();
			case SclPackage.ASSOCIATION__LD_INST:
				return isSetLdInst();
			case SclPackage.ASSOCIATION__LN_CLASS:
				return isSetLnClass();
			case SclPackage.ASSOCIATION__LN_INST:
				return isSetLnInst();
			case SclPackage.ASSOCIATION__PREFIX:
				return isSetPrefix();
			case SclPackage.ASSOCIATION__SERVER:
				return getServer() != null;
			case SclPackage.ASSOCIATION__REFERS_TO_ANY_LN:
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
			case SclPackage.ASSOCIATION___VALIDATE_ASSOCIATION_KIND_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateAssociation_kind_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.ASSOCIATION___VALIDATE_ASSOCIATION_ASSOCIATION_ID_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAssociation_associationID_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (associationID: ");
		if (associationIDESet) result.append(associationID); else result.append("<unset>");
		result.append(", iedName: ");
		if (iedNameESet) result.append(iedName); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
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
        // kind            The kind of pre-configured association, pre-established or predefined
        // associationID   The identification of a pre-configured association (otherwise empty)
        // iedName         The reference identifying the IED on which the client resides
        // ldInst          The reference to the client logical device
        // lnClass         The class of the client LN
        // prefix          The LN prefix
        // lnInst          The instance number of the client LN

        // Resolve only if attribute has been read
        if( !isSetIedName() ) return;

        // find an IED with
        //   IED.name == Association.iedName
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
        String mess = "IED( name = " + getIedName() + " ) for Association on line " + getLineNumber() + " )";
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
        //   LDevice.name == Association.ldInst
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
        String mess1 = "LDevice( inst = " + getLdInst() + " ) for Association on line " + getLineNumber() + " ( in ied = "
                + ied.getName() + " )";
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
                AbstractRiseClipseConsole.getConsole().error(
                        "cannot find LN0 for Association on line " + getLineNumber() + " ( in ied = " + ied.getName()
                                + " )" );
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
            //   LN.lnClass == Association.lnClass
            //   LN.prefix == Association.prefix
            //   LN.inst == Association.lnInst
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
            String mess2 = "LN( lnClass = " + getLnClass() + ", inst = " + getLnInst() + " ) for Association on line "
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

} //AssociationImpl
