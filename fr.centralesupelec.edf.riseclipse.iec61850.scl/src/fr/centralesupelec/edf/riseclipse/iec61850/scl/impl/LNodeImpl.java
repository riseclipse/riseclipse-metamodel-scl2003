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

import java.util.List;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclSwitch;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LNode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getLnType <em>Ln Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getIED <em>IED</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getLDevice <em>LDevice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getLN <em>LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getLNodeContainer <em>LNode Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LNodeImpl extends UnNamingImpl implements LNode {
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
     * The default value of the '{@link #getLnType() <em>Ln Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnType()
     * @generated
     * @ordered
     */
    protected static final String LN_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLnType() <em>Ln Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnType()
     * @generated
     * @ordered
     */
    protected String lnType = LN_TYPE_EDEFAULT;

    /**
     * This is true if the Ln Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lnTypeESet;

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
     * The cached value of the '{@link #getIED() <em>IED</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIED()
     * @generated
     * @ordered
     */
    protected IED ied;

    /**
     * This is true if the IED reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iedESet;

    /**
     * The cached value of the '{@link #getLDevice() <em>LDevice</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLDevice()
     * @generated
     * @ordered
     */
    protected LDevice lDevice;

    /**
     * This is true if the LDevice reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lDeviceESet;

    /**
     * The cached value of the '{@link #getLN() <em>LN</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLN()
     * @generated
     * @ordered
     */
    protected LN ln;

    /**
     * This is true if the LN reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lnESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getLNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getIedName() {
        if( ied != null ) {
            return ied.getName();
        }
        if( iedNameESet ) {
            return iedName;
        }
        return "None";
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LNODE__IED_NAME, oldIedName, iedName, !oldIedNameESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LNODE__IED_NAME, oldIedName, IED_NAME_EDEFAULT, oldIedNameESet));
    }

    /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
    public boolean isSetIedName() {
        return isSetIED();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getLdInst() {
        if( lDevice != null ) {
            return lDevice.getInst();
        }
        if( ldInstESet ) {
            return ldInst;
        }
        return "";
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LNODE__LD_INST, oldLdInst, ldInst, !oldLdInstESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LNODE__LD_INST, oldLdInst, LD_INST_EDEFAULT, oldLdInstESet));
    }

    /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
    public boolean isSetLdInst() {
        return isSetLDevice();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getLnClass() {
        if( ln != null ) {
            return ln.getLnClass();
        }
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LNODE__LN_CLASS, oldLnClass, lnClass, !oldLnClassESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LNODE__LN_CLASS, oldLnClass, LN_CLASS_EDEFAULT, oldLnClassESet));
    }

    /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
    public boolean isSetLnClass() {
        return isSetLN();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getLnInst() {
        if( ln != null ) {
            return ln.getInst();
        }
        if( lnInstESet ) {
            return lnInst;
        }
        return "";
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LNODE__LN_INST, oldLnInst, lnInst, !oldLnInstESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LNODE__LN_INST, oldLnInst, LN_INST_EDEFAULT, oldLnInstESet));
    }

    /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated not
    */
    public boolean isSetLnInst() {
        return isSetLN();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLnType() {
        return lnType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLnType( String newLnType ) {
        String oldLnType = lnType;
        lnType = newLnType;
        boolean oldLnTypeESet = lnTypeESet;
        lnTypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LNODE__LN_TYPE, oldLnType, lnType, !oldLnTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLnType() {
        String oldLnType = lnType;
        boolean oldLnTypeESet = lnTypeESet;
        lnType = LN_TYPE_EDEFAULT;
        lnTypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LNODE__LN_TYPE, oldLnType, LN_TYPE_EDEFAULT, oldLnTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLnType() {
        return lnTypeESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LNODE__PREFIX, oldPrefix, prefix, !oldPrefixESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LNODE__PREFIX, oldPrefix, PREFIX_EDEFAULT, oldPrefixESet));
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
    public IED getIED() {
        return ied;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIED( IED newIED, NotificationChain msgs ) {
        IED oldIED = ied;
        ied = newIED;
        boolean oldIEDESet = iedESet;
        iedESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.LNODE__IED, oldIED, newIED, !oldIEDESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIED( IED newIED ) {
        if (newIED != ied) {
            NotificationChain msgs = null;
            if (ied != null)
                msgs = ((InternalEObject)ied).eInverseRemove(this, SclPackage.IED__LNODE, IED.class, msgs);
            if (newIED != null)
                msgs = ((InternalEObject)newIED).eInverseAdd(this, SclPackage.IED__LNODE, IED.class, msgs);
            msgs = basicSetIED(newIED, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldIEDESet = iedESet;
            iedESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LNODE__IED, newIED, newIED, !oldIEDESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetIED( NotificationChain msgs ) {
        IED oldIED = ied;
        ied = null;
        boolean oldIEDESet = iedESet;
        iedESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.LNODE__IED, oldIED, null, oldIEDESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIED() {
        if (ied != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)ied).eInverseRemove(this, SclPackage.IED__LNODE, IED.class, msgs);
            msgs = basicUnsetIED(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldIEDESet = iedESet;
            iedESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LNODE__IED, null, null, oldIEDESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIED() {
        return iedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LDevice getLDevice() {
        return lDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLDevice( LDevice newLDevice, NotificationChain msgs ) {
        LDevice oldLDevice = lDevice;
        lDevice = newLDevice;
        boolean oldLDeviceESet = lDeviceESet;
        lDeviceESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.LNODE__LDEVICE, oldLDevice, newLDevice, !oldLDeviceESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLDevice( LDevice newLDevice ) {
        if (newLDevice != lDevice) {
            NotificationChain msgs = null;
            if (lDevice != null)
                msgs = ((InternalEObject)lDevice).eInverseRemove(this, SclPackage.LDEVICE__LNODE, LDevice.class, msgs);
            if (newLDevice != null)
                msgs = ((InternalEObject)newLDevice).eInverseAdd(this, SclPackage.LDEVICE__LNODE, LDevice.class, msgs);
            msgs = basicSetLDevice(newLDevice, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldLDeviceESet = lDeviceESet;
            lDeviceESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LNODE__LDEVICE, newLDevice, newLDevice, !oldLDeviceESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLDevice( NotificationChain msgs ) {
        LDevice oldLDevice = lDevice;
        lDevice = null;
        boolean oldLDeviceESet = lDeviceESet;
        lDeviceESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.LNODE__LDEVICE, oldLDevice, null, oldLDeviceESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLDevice() {
        if (lDevice != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)lDevice).eInverseRemove(this, SclPackage.LDEVICE__LNODE, LDevice.class, msgs);
            msgs = basicUnsetLDevice(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldLDeviceESet = lDeviceESet;
            lDeviceESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LNODE__LDEVICE, null, null, oldLDeviceESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLDevice() {
        return lDeviceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LN getLN() {
        return ln;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLN( LN newLN, NotificationChain msgs ) {
        LN oldLN = ln;
        ln = newLN;
        boolean oldLNESet = lnESet;
        lnESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.LNODE__LN, oldLN, newLN, !oldLNESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLN( LN newLN ) {
        if (newLN != ln) {
            NotificationChain msgs = null;
            if (ln != null)
                msgs = ((InternalEObject)ln).eInverseRemove(this, SclPackage.LN__LNODE, LN.class, msgs);
            if (newLN != null)
                msgs = ((InternalEObject)newLN).eInverseAdd(this, SclPackage.LN__LNODE, LN.class, msgs);
            msgs = basicSetLN(newLN, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldLNESet = lnESet;
            lnESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LNODE__LN, newLN, newLN, !oldLNESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLN( NotificationChain msgs ) {
        LN oldLN = ln;
        ln = null;
        boolean oldLNESet = lnESet;
        lnESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.LNODE__LN, oldLN, null, oldLNESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLN() {
        if (ln != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)ln).eInverseRemove(this, SclPackage.LN__LNODE, LN.class, msgs);
            msgs = basicUnsetLN(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldLNESet = lnESet;
            lnESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LNODE__LN, null, null, oldLNESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLN() {
        return lnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LNodeContainer getLNodeContainer() {
        if (eContainerFeatureID() != SclPackage.LNODE__LNODE_CONTAINER) return null;
        return (LNodeContainer)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLNodeContainer( LNodeContainer newLNodeContainer, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newLNodeContainer, SclPackage.LNODE__LNODE_CONTAINER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLNodeContainer( LNodeContainer newLNodeContainer ) {
        if (newLNodeContainer != eInternalContainer() || (eContainerFeatureID() != SclPackage.LNODE__LNODE_CONTAINER && newLNodeContainer != null)) {
            if (EcoreUtil.isAncestor(this, newLNodeContainer))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newLNodeContainer != null)
                msgs = ((InternalEObject)newLNodeContainer).eInverseAdd(this, SclPackage.LNODE_CONTAINER__LNODE, LNodeContainer.class, msgs);
            msgs = basicSetLNodeContainer(newLNodeContainer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LNODE__LNODE_CONTAINER, newLNodeContainer, newLNodeContainer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.LNODE__IED:
                if (ied != null)
                    msgs = ((InternalEObject)ied).eInverseRemove(this, SclPackage.IED__LNODE, IED.class, msgs);
                return basicSetIED((IED)otherEnd, msgs);
            case SclPackage.LNODE__LDEVICE:
                if (lDevice != null)
                    msgs = ((InternalEObject)lDevice).eInverseRemove(this, SclPackage.LDEVICE__LNODE, LDevice.class, msgs);
                return basicSetLDevice((LDevice)otherEnd, msgs);
            case SclPackage.LNODE__LN:
                if (ln != null)
                    msgs = ((InternalEObject)ln).eInverseRemove(this, SclPackage.LN__LNODE, LN.class, msgs);
                return basicSetLN((LN)otherEnd, msgs);
            case SclPackage.LNODE__LNODE_CONTAINER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetLNodeContainer((LNodeContainer)otherEnd, msgs);
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
            case SclPackage.LNODE__IED:
                return basicUnsetIED(msgs);
            case SclPackage.LNODE__LDEVICE:
                return basicUnsetLDevice(msgs);
            case SclPackage.LNODE__LN:
                return basicUnsetLN(msgs);
            case SclPackage.LNODE__LNODE_CONTAINER:
                return basicSetLNodeContainer(null, msgs);
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
            case SclPackage.LNODE__LNODE_CONTAINER:
                return eInternalContainer().eInverseRemove(this, SclPackage.LNODE_CONTAINER__LNODE, LNodeContainer.class, msgs);
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
            case SclPackage.LNODE__IED_NAME:
                return getIedName();
            case SclPackage.LNODE__LD_INST:
                return getLdInst();
            case SclPackage.LNODE__LN_CLASS:
                return getLnClass();
            case SclPackage.LNODE__LN_INST:
                return getLnInst();
            case SclPackage.LNODE__LN_TYPE:
                return getLnType();
            case SclPackage.LNODE__PREFIX:
                return getPrefix();
            case SclPackage.LNODE__IED:
                return getIED();
            case SclPackage.LNODE__LDEVICE:
                return getLDevice();
            case SclPackage.LNODE__LN:
                return getLN();
            case SclPackage.LNODE__LNODE_CONTAINER:
                return getLNodeContainer();
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
            case SclPackage.LNODE__IED_NAME:
                setIedName((String)newValue);
                return;
            case SclPackage.LNODE__LD_INST:
                setLdInst((String)newValue);
                return;
            case SclPackage.LNODE__LN_CLASS:
                setLnClass((String)newValue);
                return;
            case SclPackage.LNODE__LN_INST:
                setLnInst((String)newValue);
                return;
            case SclPackage.LNODE__LN_TYPE:
                setLnType((String)newValue);
                return;
            case SclPackage.LNODE__PREFIX:
                setPrefix((String)newValue);
                return;
            case SclPackage.LNODE__IED:
                setIED((IED)newValue);
                return;
            case SclPackage.LNODE__LDEVICE:
                setLDevice((LDevice)newValue);
                return;
            case SclPackage.LNODE__LN:
                setLN((LN)newValue);
                return;
            case SclPackage.LNODE__LNODE_CONTAINER:
                setLNodeContainer((LNodeContainer)newValue);
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
            case SclPackage.LNODE__IED_NAME:
                unsetIedName();
                return;
            case SclPackage.LNODE__LD_INST:
                unsetLdInst();
                return;
            case SclPackage.LNODE__LN_CLASS:
                unsetLnClass();
                return;
            case SclPackage.LNODE__LN_INST:
                unsetLnInst();
                return;
            case SclPackage.LNODE__LN_TYPE:
                unsetLnType();
                return;
            case SclPackage.LNODE__PREFIX:
                unsetPrefix();
                return;
            case SclPackage.LNODE__IED:
                unsetIED();
                return;
            case SclPackage.LNODE__LDEVICE:
                unsetLDevice();
                return;
            case SclPackage.LNODE__LN:
                unsetLN();
                return;
            case SclPackage.LNODE__LNODE_CONTAINER:
                setLNodeContainer((LNodeContainer)null);
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
            case SclPackage.LNODE__IED_NAME:
                return isSetIedName();
            case SclPackage.LNODE__LD_INST:
                return isSetLdInst();
            case SclPackage.LNODE__LN_CLASS:
                return isSetLnClass();
            case SclPackage.LNODE__LN_INST:
                return isSetLnInst();
            case SclPackage.LNODE__LN_TYPE:
                return isSetLnType();
            case SclPackage.LNODE__PREFIX:
                return isSetPrefix();
            case SclPackage.LNODE__IED:
                return isSetIED();
            case SclPackage.LNODE__LDEVICE:
                return isSetLDevice();
            case SclPackage.LNODE__LN:
                return isSetLN();
            case SclPackage.LNODE__LNODE_CONTAINER:
                return getLNodeContainer() != null;
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (iedName: ");
        if (iedNameESet) result.append(iedName); else result.append("<unset>");
        result.append(", ldInst: ");
        if (ldInstESet) result.append(ldInst); else result.append("<unset>");
        result.append(", lnClass: ");
        if (lnClassESet) result.append(lnClass); else result.append("<unset>");
        result.append(", lnInst: ");
        if (lnInstESet) result.append(lnInst); else result.append("<unset>");
        result.append(", lnType: ");
        if (lnTypeESet) result.append(lnType); else result.append("<unset>");
        result.append(", prefix: ");
        if (prefixESet) result.append(prefix); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

    @Override
    protected void doResolveLinks() {
        // see Issue #13
        super.doResolveLinks();
        
        // lnInst   The LN instance identification. Can only be missing for lnClass=LLN0, meaning as value here the empty string
        // lnClass  The LN class as defined in IEC 61850-7-x
        // iedName  The name of the IED which contains the LN, none if used for specification (default if attribute is not specified)
        // ldInst   The LD instance on the IED which contains the LN within a specification (SSD file), where iedName=None, this shall
        //          result in unique LN instance identification, i.e. may contain the LD name
        // prefix   The LN prefix used in the IED (if needed; default, if not specified, is the empty string). Can be used for more
        //          detailed function specification than possible by LN class alone, if the LN is not allocated to an IED
        // lnType   The logical node type definition containing more detailed functional specification. Might be missing, if the LN is allocated to an IED.

        // Resolve only if attribute has been read
        // Cannot use isSetIedName() Here
        if( !iedNameESet ) return;

        // Resolve only if attribute is not None
        if( "None".equals(  getIedName() )) return;

        // find an IED with
        //   IED.name == LNode.iedName
        SclSwitch< Boolean > s1 = new SclSwitch< Boolean >() {

            @Override
            public Boolean caseIED( IED object ) {
                return object.getName().equals( getIedName() );
            }

            @Override
            public Boolean defaultCase( EObject object ) {
                return false;
            }

        };

        List< IED > res1 = shallowSearchObjects( getSCLRoot().getIED(), s1 );
        String mess1 = "IED( name = " + getIedName() + " ) for LNode on line " + getLineNumber() + " ( in container "
                + getLNodeContainer().getName() + " )";
        if( res1.isEmpty() ) {
            AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess1 );
        }
        else if( res1.size() > 1 ) {
            AbstractRiseClipseConsole.getConsole().error( "found several " + mess1 );
        }
        else {
            //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
            setIED( res1.get( 0 ) );
        }

        if( ied != null ) {
            // find inside an LDevice with
            //   LDevice.name == LNode.ldInst
            SclSwitch< Boolean > s2 = new SclSwitch< Boolean >() {

                @Override
                public Boolean caseLDevice( LDevice object ) {
                    return object.getInst().equals( getLdInst() );
                }

                @Override
                public Boolean defaultCase( EObject object ) {
                    return false;
                }

            };

            List< LDevice > res2 = deepSearchObjects( ied.getAccessPoint(), s2 );
            String mess2 = "LDevice( inst = " + getLdInst() + " ) for LNode on line " + getLineNumber()
                    + " ( in container " + getLNodeContainer().getName() + " )";
            if( res2.isEmpty() ) {
                AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess2 );
            }
            else if( res2.size() > 1 ) {
                AbstractRiseClipseConsole.getConsole().error( "found several " + mess2 );
            }
            else {
                //AbstractRiseClipseConsole.getConsole().info( "found " + mess2 );
                setLDevice( res2.get( 0 ) );
            }
        }

        if( lDevice != null ) {
            // find inside an LN with
            //   LN.lnClass == LNode.lnClass
            //   LN.prefix == LNode.prefix
            //   LN.inst == LNode.lnInst
            // Resolve only if attribute has been read
            if( !lnClassESet ) return;
            if( !lnInstESet ) return;
            // prefix is optional
            //if( ! prefixESet ) return;

            SclSwitch< Boolean > s3 = new SclSwitch< Boolean >() {

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

            List< LN > res3 = shallowSearchObjects( lDevice.getLN(), s3 );
            String mess3 = "LN( lnClass = " + getLnClass() + ", inst = " + getLnInst() + " ) for LNode on line "
                    + getLineNumber() + " ( in container " + getLNodeContainer().getName() + " )";
            if( res3.isEmpty() ) {
                AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess3 );
            }
            else if( res3.size() > 1 ) {
                AbstractRiseClipseConsole.getConsole().error( "found several " + mess3 );
            }
            else {
                //AbstractRiseClipseConsole.getConsole().info( "found " + mess3 );
                setLN( res3.get( 0 ) );
            }
        }
    }

} //LNodeImpl
