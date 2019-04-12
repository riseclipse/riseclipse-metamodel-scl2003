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
import java.util.Collections;
import java.util.List;
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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclSwitch;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}</li>
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
     * @generated NOT because there is no default value in SCL
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
     * The cached value of the '{@link #getRefersToAbstractDataAttribute() <em>Refers To Abstract Data Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToAbstractDataAttribute()
     * @generated
     * @ordered
     */
    protected EList<AbstractDataAttribute> refersToAbstractDataAttribute;

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
        return SclPackage.eINSTANCE.getFCDA();
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__DA_NAME, oldDaName, daName, !oldDaNameESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__DA_NAME, oldDaName, DA_NAME_EDEFAULT, oldDaNameESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__DO_NAME, oldDoName, doName, !oldDoNameESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__DO_NAME, oldDoName, DO_NAME_EDEFAULT, oldDoNameESet));
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
    public FCEnum getFc() {
        return fc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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
    @Override
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
    @Override
    public boolean isSetFc() {
        return fcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getIx() {
        return ix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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
    @Override
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
    @Override
    public boolean isSetIx() {
        return ixESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__LD_INST, oldLdInst, ldInst, !oldLdInstESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__LD_INST, oldLdInst, LD_INST_EDEFAULT, oldLdInstESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__LN_CLASS, oldLnClass, lnClass, !oldLnClassESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__LN_CLASS, oldLnClass, LN_CLASS_EDEFAULT, oldLnClassESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__LN_INST, oldLnInst, lnInst, !oldLnInstESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__LN_INST, oldLnInst, LN_INST_EDEFAULT, oldLnInstESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FCDA__PREFIX, oldPrefix, prefix, !oldPrefixESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.FCDA__PREFIX, oldPrefix, PREFIX_EDEFAULT, oldPrefixESet));
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
    @Override
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
    @Override
    public EList<AbstractDataAttribute> getRefersToAbstractDataAttribute() {
        if (refersToAbstractDataAttribute == null) {
            refersToAbstractDataAttribute = new EObjectWithInverseEList.Unsettable.ManyInverse<AbstractDataAttribute>(AbstractDataAttribute.class, this, SclPackage.FCDA__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE, SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_FCDA);
        }
        return refersToAbstractDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToAbstractDataAttribute() {
        if (refersToAbstractDataAttribute != null) ((InternalEList.Unsettable<?>)refersToAbstractDataAttribute).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToAbstractDataAttribute() {
        return refersToAbstractDataAttribute != null && ((InternalEList.Unsettable<?>)refersToAbstractDataAttribute).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.FCDA__DATA_SET:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetDataSet((DataSet)otherEnd, msgs);
            case SclPackage.FCDA__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefersToAbstractDataAttribute()).basicAdd(otherEnd, msgs);
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
            case SclPackage.FCDA__DATA_SET:
                return basicSetDataSet(null, msgs);
            case SclPackage.FCDA__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
                return ((InternalEList<?>)getRefersToAbstractDataAttribute()).basicRemove(otherEnd, msgs);
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
            case SclPackage.FCDA__DATA_SET:
                return getDataSet();
            case SclPackage.FCDA__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
                return getRefersToAbstractDataAttribute();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
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
            case SclPackage.FCDA__DATA_SET:
                setDataSet((DataSet)newValue);
                return;
            case SclPackage.FCDA__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
                getRefersToAbstractDataAttribute().clear();
                getRefersToAbstractDataAttribute().addAll((Collection<? extends AbstractDataAttribute>)newValue);
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
            case SclPackage.FCDA__DATA_SET:
                setDataSet((DataSet)null);
                return;
            case SclPackage.FCDA__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
                unsetRefersToAbstractDataAttribute();
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
            case SclPackage.FCDA__DATA_SET:
                return getDataSet() != null;
            case SclPackage.FCDA__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
                return isSetRefersToAbstractDataAttribute();
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
    protected void doResolveLinks() {/*
        // see Issue #13
        super.doResolveLinks();
        
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

        if( getLdInst() == null ) return;
        if( getLnClass() == null ) return;

        // We need the IED to find the LN
        if( getDataSet()                         == null ) return;
        if( getDataSet().getAnyLN()              == null ) return;
        if( getDataSet().getAnyLN().getLDevice() == null ) return;
        IED ied = getDataSet().getAnyLN().getLDevice().getIED();
        if( ied == null ) return;

        // find inside an LDevice with
        //   LDevice.name == FCDA.ldInst
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
        String mess1 = "LDevice( inst = " + getLdInst() + " ) for FCDA on line " + getLineNumber()
                + " ( in ied = " + ied.getName() + " )";
        LDevice lDevice = null;
        if( res1.isEmpty() ) {
            AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess1 );
            return;
        }
        if( res1.size() > 1 ) {
            AbstractRiseClipseConsole.getConsole().error( "found several " + mess1 );
            return;
        }
        //AbstractRiseClipseConsole.getConsole().info( "found " + mess2 );
        lDevice = res1.get( 0 );
        
        if( "LLN0".equals( getLnClass() ) ) {
            if( lDevice.getLN0() == null ) {
                AbstractRiseClipseConsole.getConsole().error( "cannot find LN0 for FCDA on line " + getLineNumber()
                        + " ( in ied = " + ied.getName() + " )" );
                return;
            }
            setRefersToAnyLN( lDevice.getLN0() );
        }
        else {
            if( getLnInst() == null ) return;
            // prefix is optional
            //if( getPrefix() == null ) return;

            // find inside an LN with
            //   LN.lnClass == FCDA.lnClass
            //   LN.prefix == FCDA.prefix
            //   LN.inst == FCDA.lnInst
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
            String mess2 = "LN( lnClass = " + getLnClass() + ", inst = " + getLnInst() + " ) for FCDA on line "
                    + getLineNumber() + " ( in ied = " + ied.getName() + " )";
            if( res2.isEmpty() ) {
                AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess2 );
                return;
            }
            if( res2.size() > 1 ) {
                AbstractRiseClipseConsole.getConsole().error( "found several " + mess2 );
                return;
            }
            //AbstractRiseClipseConsole.getConsole().info( "found " + mess3 );
            setRefersToAnyLN( res2.get( 0 ) );
        }
        getRefersToAnyLN().resolveLinks();
        
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
                return doNames[0].equals( object.getName() );
            }

            @Override
            public Boolean caseDOI( DOI object ) {
                return doNames[0].equals( object.getName() );
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
            if( getRefersToAnyLN().getRefersToLNodeType() != null ) {
                res3 = shallowSearchObjects(
                        Collections.< DataObject > unmodifiableList( getRefersToAnyLN().getRefersToLNodeType().getDO() ), s3 );
            }
        }
        if( res3.isEmpty() ) {
            AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess3 );
            return;
        }
        if( res3.size() > 1 ) {
            AbstractRiseClipseConsole.getConsole().error( "found several " + mess3 );
            return;
        }
        //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
        setRefersToDataObject( res3.get( 0 ) );
        
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
                        return sdiName.equals( object.getName() );
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
                if( res4.size() > 1 ) {
                    AbstractRiseClipseConsole.getConsole().error( "found several " + mess4 );
                    return;
                }
                //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
                sdi = res4.get( 0 );
            }

            SclSwitch< Boolean > s5 = new SclSwitch< Boolean >() {

                @Override
                public Boolean caseDAI( DAI object ) {
                    return daNames[daNames.length - 1].equals( object.getName() );
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
            if( res5.size() > 1 ) {
                AbstractRiseClipseConsole.getConsole().error( "found several " + mess5 );
                return;
            }
            //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
            setRefersToDataAttribute( res5.get( 0 ) );
        }

        else {
            // We have a DO, look for DA in DOType
            DO do_ = ( DO ) getRefersToDataObject();
            // Explicit link from DO to DOType may not be set
            do_.resolveLinks();
            if( do_.getRefersToDOType() != null ) {
                // daName may reference a BDA inside DAType
                // find an DA with
                //   DA.name      == FCDA.daName[0]
                SclSwitch< Boolean > s5 = new SclSwitch< Boolean >() {

                    @Override
                    public Boolean caseDA( DA object ) {
                        return daNames[0].equals( object.getName() );
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
                    return;
                }
                if( res5.size() > 1 ) {
                    AbstractRiseClipseConsole.getConsole().error( "found several " + mess5 );
                    return;
                }
                else {
                    //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
                    // Look for a BDA
                    if( daNames.length > 1 ) {
                        // Explicit link from DA to DAType may not be set
                        res5.get( 0 ).resolveLinks();

                        if( res5.get( 0 ).getRefersToDAType() != null ) {
                            SclSwitch< Boolean > s6 = new SclSwitch< Boolean >() {

                                @Override
                                public Boolean caseBDA( BDA object ) {
                                    return daNames[1].equals( object.getName() );
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
                                return;
                            }
                            if( res6.size() > 1 ) {
                                AbstractRiseClipseConsole.getConsole().error( "found several " + mess6 );
                                return;
                            }
                            setRefersToDataAttribute( res6.get( 0 ) );
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
    */}

} //FCDAImpl
