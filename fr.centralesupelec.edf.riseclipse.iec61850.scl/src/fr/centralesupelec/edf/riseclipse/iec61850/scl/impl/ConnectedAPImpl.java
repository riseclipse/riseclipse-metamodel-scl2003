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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Address;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMV;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclUtilities;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connected AP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getApName <em>Ap Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getRedProt <em>Red Prot</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getParentSubNetwork <em>Parent Sub Network</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getRefersToAccessPoint <em>Refers To Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getPhysConn <em>Phys Conn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getGSE <em>GSE</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getSMV <em>SMV</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getControlBlock <em>Control Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectedAPImpl extends UnNamingImpl implements ConnectedAP {
    /**
     * The default value of the '{@link #getApName() <em>Ap Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApName()
     * @generated
     * @ordered
     */
    protected static final String AP_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getApName() <em>Ap Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApName()
     * @generated
     * @ordered
     */
    protected String apName = AP_NAME_EDEFAULT;

    /**
     * This is true if the Ap Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean apNameESet;

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
     * The default value of the '{@link #getRedProt() <em>Red Prot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRedProt()
     * @generated
     * @ordered
     */
    protected static final String RED_PROT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRedProt() <em>Red Prot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRedProt()
     * @generated
     * @ordered
     */
    protected String redProt = RED_PROT_EDEFAULT;

    /**
     * This is true if the Red Prot attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean redProtESet;

    /**
     * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddress()
     * @generated
     * @ordered
     */
    protected Address address;

    /**
     * This is true if the Address containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean addressESet;

    /**
     * The cached value of the '{@link #getRefersToAccessPoint() <em>Refers To Access Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToAccessPoint()
     * @generated
     * @ordered
     */
    protected AccessPoint refersToAccessPoint;

    /**
     * This is true if the Refers To Access Point reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToAccessPointESet;

    /**
     * The cached value of the '{@link #getPhysConn() <em>Phys Conn</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhysConn()
     * @generated
     * @ordered
     */
    protected EList<PhysConn> physConn;

    /**
     * The cached value of the '{@link #getControlBlock() <em>Control Block</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlBlock()
     * @generated
     * @ordered
     */
    protected FeatureMap controlBlock;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectedAPImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getConnectedAP();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getApName() {
        return apName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApName( String newApName ) {
        String oldApName = apName;
        apName = newApName;
        boolean oldApNameESet = apNameESet;
        apNameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTED_AP__AP_NAME, oldApName, apName, !oldApNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetApName() {
        String oldApName = apName;
        boolean oldApNameESet = apNameESet;
        apName = AP_NAME_EDEFAULT;
        apNameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONNECTED_AP__AP_NAME, oldApName, AP_NAME_EDEFAULT, oldApNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetApName() {
        return apNameESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTED_AP__IED_NAME, oldIedName, iedName, !oldIedNameESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONNECTED_AP__IED_NAME, oldIedName, IED_NAME_EDEFAULT, oldIedNameESet));
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
    public String getRedProt() {
        return redProt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRedProt( String newRedProt ) {
        String oldRedProt = redProt;
        redProt = newRedProt;
        boolean oldRedProtESet = redProtESet;
        redProtESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTED_AP__RED_PROT, oldRedProt, redProt, !oldRedProtESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRedProt() {
        String oldRedProt = redProt;
        boolean oldRedProtESet = redProtESet;
        redProt = RED_PROT_EDEFAULT;
        redProtESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONNECTED_AP__RED_PROT, oldRedProt, RED_PROT_EDEFAULT, oldRedProtESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRedProt() {
        return redProtESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Address getAddress() {
        return address;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAddress( Address newAddress, NotificationChain msgs ) {
        Address oldAddress = address;
        address = newAddress;
        boolean oldAddressESet = addressESet;
        addressESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTED_AP__ADDRESS, oldAddress, newAddress, !oldAddressESet);
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
    public void setAddress( Address newAddress ) {
        if (newAddress != address) {
            NotificationChain msgs = null;
            if (address != null)
                msgs = ((InternalEObject)address).eInverseRemove(this, SclPackage.ADDRESS__PARENT_CONNECTED_AP, Address.class, msgs);
            if (newAddress != null)
                msgs = ((InternalEObject)newAddress).eInverseAdd(this, SclPackage.ADDRESS__PARENT_CONNECTED_AP, Address.class, msgs);
            msgs = basicSetAddress(newAddress, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldAddressESet = addressESet;
            addressESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTED_AP__ADDRESS, newAddress, newAddress, !oldAddressESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAddress( NotificationChain msgs ) {
        Address oldAddress = address;
        address = null;
        boolean oldAddressESet = addressESet;
        addressESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.CONNECTED_AP__ADDRESS, oldAddress, null, oldAddressESet);
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
    public void unsetAddress() {
        if (address != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)address).eInverseRemove(this, SclPackage.ADDRESS__PARENT_CONNECTED_AP, Address.class, msgs);
            msgs = basicUnsetAddress(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldAddressESet = addressESet;
            addressESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONNECTED_AP__ADDRESS, null, null, oldAddressESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAddress() {
        return addressESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubNetwork getParentSubNetwork() {
        if (eContainerFeatureID() != SclPackage.CONNECTED_AP__PARENT_SUB_NETWORK) return null;
        return (SubNetwork)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSubNetwork(SubNetwork newParentSubNetwork, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentSubNetwork, SclPackage.CONNECTED_AP__PARENT_SUB_NETWORK, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSubNetwork(SubNetwork newParentSubNetwork) {
        if (newParentSubNetwork != eInternalContainer() || (eContainerFeatureID() != SclPackage.CONNECTED_AP__PARENT_SUB_NETWORK && newParentSubNetwork != null)) {
            if (EcoreUtil.isAncestor(this, newParentSubNetwork))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentSubNetwork != null)
                msgs = ((InternalEObject)newParentSubNetwork).eInverseAdd(this, SclPackage.SUB_NETWORK__CONNECTED_AP, SubNetwork.class, msgs);
            msgs = basicSetParentSubNetwork(newParentSubNetwork, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTED_AP__PARENT_SUB_NETWORK, newParentSubNetwork, newParentSubNetwork));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccessPoint getRefersToAccessPoint() {
        return refersToAccessPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToAccessPoint( AccessPoint newRefersToAccessPoint, NotificationChain msgs ) {
        AccessPoint oldRefersToAccessPoint = refersToAccessPoint;
        refersToAccessPoint = newRefersToAccessPoint;
        boolean oldRefersToAccessPointESet = refersToAccessPointESet;
        refersToAccessPointESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT, oldRefersToAccessPoint, newRefersToAccessPoint, !oldRefersToAccessPointESet);
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
    public void setRefersToAccessPoint( AccessPoint newRefersToAccessPoint ) {
        if (newRefersToAccessPoint != refersToAccessPoint) {
            NotificationChain msgs = null;
            if (refersToAccessPoint != null)
                msgs = ((InternalEObject)refersToAccessPoint).eInverseRemove(this, SclPackage.ACCESS_POINT__REFERRED_BY_CONNECTED_AP, AccessPoint.class, msgs);
            if (newRefersToAccessPoint != null)
                msgs = ((InternalEObject)newRefersToAccessPoint).eInverseAdd(this, SclPackage.ACCESS_POINT__REFERRED_BY_CONNECTED_AP, AccessPoint.class, msgs);
            msgs = basicSetRefersToAccessPoint(newRefersToAccessPoint, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToAccessPointESet = refersToAccessPointESet;
            refersToAccessPointESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT, newRefersToAccessPoint, newRefersToAccessPoint, !oldRefersToAccessPointESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToAccessPoint( NotificationChain msgs ) {
        AccessPoint oldRefersToAccessPoint = refersToAccessPoint;
        refersToAccessPoint = null;
        boolean oldRefersToAccessPointESet = refersToAccessPointESet;
        refersToAccessPointESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT, oldRefersToAccessPoint, null, oldRefersToAccessPointESet);
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
    public void unsetRefersToAccessPoint() {
        if (refersToAccessPoint != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)refersToAccessPoint).eInverseRemove(this, SclPackage.ACCESS_POINT__REFERRED_BY_CONNECTED_AP, AccessPoint.class, msgs);
            msgs = basicUnsetRefersToAccessPoint(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToAccessPointESet = refersToAccessPointESet;
            refersToAccessPointESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT, null, null, oldRefersToAccessPointESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToAccessPoint() {
        return refersToAccessPointESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<PhysConn> getPhysConn() {
        if (physConn == null) {
            physConn = new EObjectContainmentWithInverseEList.Unsettable<PhysConn>(PhysConn.class, this, SclPackage.CONNECTED_AP__PHYS_CONN, SclPackage.PHYS_CONN__PARENT_CONNECTED_AP);
        }
        return physConn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhysConn() {
        if (physConn != null) ((InternalEList.Unsettable<?>)physConn).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhysConn() {
        return physConn != null && ((InternalEList.Unsettable<?>)physConn).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<GSE> getGSE() {
        return getControlBlock().list(SclPackage.eINSTANCE.getConnectedAP_GSE());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGSE() {
        ((FeatureMap.Internal)getControlBlock()).clear(SclPackage.eINSTANCE.getConnectedAP_GSE());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGSE() {
        return !((FeatureMap.Internal)getControlBlock()).isEmpty(SclPackage.eINSTANCE.getConnectedAP_GSE());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<SMV> getSMV() {
        return getControlBlock().list(SclPackage.eINSTANCE.getConnectedAP_SMV());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSMV() {
        ((FeatureMap.Internal)getControlBlock()).clear(SclPackage.eINSTANCE.getConnectedAP_SMV());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSMV() {
        return !((FeatureMap.Internal)getControlBlock()).isEmpty(SclPackage.eINSTANCE.getConnectedAP_SMV());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FeatureMap getControlBlock() {
        if (controlBlock == null) {
            controlBlock = new BasicFeatureMap(this, SclPackage.CONNECTED_AP__CONTROL_BLOCK);
        }
        return controlBlock;
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
            case SclPackage.CONNECTED_AP__ADDRESS:
                if (address != null)
                    msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.CONNECTED_AP__ADDRESS, null, msgs);
                return basicSetAddress((Address)otherEnd, msgs);
            case SclPackage.CONNECTED_AP__PARENT_SUB_NETWORK:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentSubNetwork((SubNetwork)otherEnd, msgs);
            case SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT:
                if (refersToAccessPoint != null)
                    msgs = ((InternalEObject)refersToAccessPoint).eInverseRemove(this, SclPackage.ACCESS_POINT__REFERRED_BY_CONNECTED_AP, AccessPoint.class, msgs);
                return basicSetRefersToAccessPoint((AccessPoint)otherEnd, msgs);
            case SclPackage.CONNECTED_AP__PHYS_CONN:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPhysConn()).basicAdd(otherEnd, msgs);
            case SclPackage.CONNECTED_AP__GSE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getGSE()).basicAdd(otherEnd, msgs);
            case SclPackage.CONNECTED_AP__SMV:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSMV()).basicAdd(otherEnd, msgs);
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
            case SclPackage.CONNECTED_AP__ADDRESS:
                return basicUnsetAddress(msgs);
            case SclPackage.CONNECTED_AP__PARENT_SUB_NETWORK:
                return basicSetParentSubNetwork(null, msgs);
            case SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT:
                return basicUnsetRefersToAccessPoint(msgs);
            case SclPackage.CONNECTED_AP__PHYS_CONN:
                return ((InternalEList<?>)getPhysConn()).basicRemove(otherEnd, msgs);
            case SclPackage.CONNECTED_AP__GSE:
                return ((InternalEList<?>)getGSE()).basicRemove(otherEnd, msgs);
            case SclPackage.CONNECTED_AP__SMV:
                return ((InternalEList<?>)getSMV()).basicRemove(otherEnd, msgs);
            case SclPackage.CONNECTED_AP__CONTROL_BLOCK:
                return ((InternalEList<?>)getControlBlock()).basicRemove(otherEnd, msgs);
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
            case SclPackage.CONNECTED_AP__PARENT_SUB_NETWORK:
                return eInternalContainer().eInverseRemove(this, SclPackage.SUB_NETWORK__CONNECTED_AP, SubNetwork.class, msgs);
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
            case SclPackage.CONNECTED_AP__AP_NAME:
                return getApName();
            case SclPackage.CONNECTED_AP__IED_NAME:
                return getIedName();
            case SclPackage.CONNECTED_AP__RED_PROT:
                return getRedProt();
            case SclPackage.CONNECTED_AP__ADDRESS:
                return getAddress();
            case SclPackage.CONNECTED_AP__PARENT_SUB_NETWORK:
                return getParentSubNetwork();
            case SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT:
                return getRefersToAccessPoint();
            case SclPackage.CONNECTED_AP__PHYS_CONN:
                return getPhysConn();
            case SclPackage.CONNECTED_AP__GSE:
                return getGSE();
            case SclPackage.CONNECTED_AP__SMV:
                return getSMV();
            case SclPackage.CONNECTED_AP__CONTROL_BLOCK:
                if (coreType) return getControlBlock();
                return ((FeatureMap.Internal)getControlBlock()).getWrapper();
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
            case SclPackage.CONNECTED_AP__AP_NAME:
                setApName((String)newValue);
                return;
            case SclPackage.CONNECTED_AP__IED_NAME:
                setIedName((String)newValue);
                return;
            case SclPackage.CONNECTED_AP__RED_PROT:
                setRedProt((String)newValue);
                return;
            case SclPackage.CONNECTED_AP__ADDRESS:
                setAddress((Address)newValue);
                return;
            case SclPackage.CONNECTED_AP__PARENT_SUB_NETWORK:
                setParentSubNetwork((SubNetwork)newValue);
                return;
            case SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT:
                setRefersToAccessPoint((AccessPoint)newValue);
                return;
            case SclPackage.CONNECTED_AP__PHYS_CONN:
                getPhysConn().clear();
                getPhysConn().addAll((Collection<? extends PhysConn>)newValue);
                return;
            case SclPackage.CONNECTED_AP__GSE:
                getGSE().clear();
                getGSE().addAll((Collection<? extends GSE>)newValue);
                return;
            case SclPackage.CONNECTED_AP__SMV:
                getSMV().clear();
                getSMV().addAll((Collection<? extends SMV>)newValue);
                return;
            case SclPackage.CONNECTED_AP__CONTROL_BLOCK:
                ((FeatureMap.Internal)getControlBlock()).set(newValue);
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
            case SclPackage.CONNECTED_AP__AP_NAME:
                unsetApName();
                return;
            case SclPackage.CONNECTED_AP__IED_NAME:
                unsetIedName();
                return;
            case SclPackage.CONNECTED_AP__RED_PROT:
                unsetRedProt();
                return;
            case SclPackage.CONNECTED_AP__ADDRESS:
                unsetAddress();
                return;
            case SclPackage.CONNECTED_AP__PARENT_SUB_NETWORK:
                setParentSubNetwork((SubNetwork)null);
                return;
            case SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT:
                unsetRefersToAccessPoint();
                return;
            case SclPackage.CONNECTED_AP__PHYS_CONN:
                unsetPhysConn();
                return;
            case SclPackage.CONNECTED_AP__GSE:
                unsetGSE();
                return;
            case SclPackage.CONNECTED_AP__SMV:
                unsetSMV();
                return;
            case SclPackage.CONNECTED_AP__CONTROL_BLOCK:
                getControlBlock().clear();
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
            case SclPackage.CONNECTED_AP__AP_NAME:
                return isSetApName();
            case SclPackage.CONNECTED_AP__IED_NAME:
                return isSetIedName();
            case SclPackage.CONNECTED_AP__RED_PROT:
                return isSetRedProt();
            case SclPackage.CONNECTED_AP__ADDRESS:
                return isSetAddress();
            case SclPackage.CONNECTED_AP__PARENT_SUB_NETWORK:
                return getParentSubNetwork() != null;
            case SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT:
                return isSetRefersToAccessPoint();
            case SclPackage.CONNECTED_AP__PHYS_CONN:
                return isSetPhysConn();
            case SclPackage.CONNECTED_AP__GSE:
                return isSetGSE();
            case SclPackage.CONNECTED_AP__SMV:
                return isSetSMV();
            case SclPackage.CONNECTED_AP__CONTROL_BLOCK:
                return controlBlock != null && !controlBlock.isEmpty();
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
        result.append(" (apName: ");
        if (apNameESet) result.append(apName); else result.append("<unset>");
        result.append(", iedName: ");
        if (iedNameESet) result.append(iedName); else result.append("<unset>");
        result.append(", redProt: ");
        if (redProtESet) result.append(redProt); else result.append("<unset>");
        result.append(", ControlBlock: ");
        result.append(controlBlock);
        result.append(')');
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( IRiseClipseConsole console ) {
        // see Issue #13
        super.doBuildExplicitLinks( console );
        
        // iedName a name identifying the IED
        // apName  a name identifying this access point within the IED
        // desc    some descriptive text for this access point at this subnetwork

        if( getIedName() == null ) return;
        if( getApName() == null ) return;

        String messagePrefix = "while resolving link from ConnectedAP on line " + getLineNumber() + ": ";

        // find an IED with
        //   IED.name == ConnectedAP.iedName
        List< IED > res1 =
                SclUtilities
                .get_IEDs( this )
                .stream()
                .filter( ied -> getIedName().equals( ied.getName() ))
                .collect( Collectors.toList() );

        IED ied = null;
        String mess1 = "IED( name = " + getIedName() + " )";
        if( res1.isEmpty() ) {
            console.error( messagePrefix + "cannot find " + mess1 );
            return;
        }
        if( res1.size() > 1 ) {
            console.error( messagePrefix + "found several " + mess1 );
            return;
        }
        ied = res1.get( 0 );
        console.verbose( messagePrefix + "found " + mess1 + " on line " + ied.getLineNumber() );
        
        List< AccessPoint > res2 =
                ied
                .getAccessPoint()
                .stream()
                .filter(  a -> getApName().equals( a.getName() ))
                .collect( Collectors.toList() );
        String mess2 = "AccessPoint( name = " + getApName() + " )";
        if( res2.isEmpty() ) {
            console.error( messagePrefix + "cannot find " + mess2 );
            return;
        }
        if( res2.size() > 1 ) {
            console.error( messagePrefix + "found several " + mess2 );
            return;
        }
        setRefersToAccessPoint( res2.get( 0 ));
        console.info( "ConnectedAP on line " + getLineNumber() + " refers to " + mess2 + " on line " + getRefersToAccessPoint().getLineNumber() );
    }

} //ConnectedAPImpl
