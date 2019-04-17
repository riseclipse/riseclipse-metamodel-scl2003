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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Sync Prot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TimeSyncProtImpl#getC37_238 <em>C37 238</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TimeSyncProtImpl#getOther <em>Other</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TimeSyncProtImpl#getSntp <em>Sntp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TimeSyncProtImpl#getParentClientServices <em>Parent Client Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TimeSyncProtImpl#getParentServices <em>Parent Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TimeSyncProtImpl#getIec61850_9_3 <em>Iec61850 93</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSyncProtImpl extends SclObjectImpl implements TimeSyncProt {
    /**
     * The default value of the '{@link #getC37_238() <em>C37 238</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getC37_238()
     * @generated
     * @ordered
     */
    protected static final Boolean C37_238_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getC37_238() <em>C37 238</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getC37_238()
     * @generated
     * @ordered
     */
    protected Boolean c37_238 = C37_238_EDEFAULT;

    /**
     * This is true if the C37 238 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean c37_238ESet;

    /**
     * The default value of the '{@link #getOther() <em>Other</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOther()
     * @generated
     * @ordered
     */
    protected static final Boolean OTHER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOther() <em>Other</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOther()
     * @generated
     * @ordered
     */
    protected Boolean other = OTHER_EDEFAULT;

    /**
     * This is true if the Other attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean otherESet;

    /**
     * The default value of the '{@link #getSntp() <em>Sntp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSntp()
     * @generated
     * @ordered
     */
    protected static final Boolean SNTP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSntp() <em>Sntp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSntp()
     * @generated
     * @ordered
     */
    protected Boolean sntp = SNTP_EDEFAULT;

    /**
     * This is true if the Sntp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sntpESet;

    /**
     * The default value of the '{@link #getIec61850_9_3() <em>Iec61850 93</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIec61850_9_3()
     * @generated
     * @ordered
     */
    protected static final Boolean IEC61850_93_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIec61850_9_3() <em>Iec61850 93</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIec61850_9_3()
     * @generated
     * @ordered
     */
    protected Boolean iec61850_9_3 = IEC61850_93_EDEFAULT;

    /**
     * This is true if the Iec61850 93 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iec61850_9_3ESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimeSyncProtImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getTimeSyncProt();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getC37_238() {
        return c37_238;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setC37_238( Boolean newC37_238 ) {
        Boolean oldC37_238 = c37_238;
        c37_238 = newC37_238;
        boolean oldC37_238ESet = c37_238ESet;
        c37_238ESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TIME_SYNC_PROT__C37_238, oldC37_238, c37_238, !oldC37_238ESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetC37_238() {
        Boolean oldC37_238 = c37_238;
        boolean oldC37_238ESet = c37_238ESet;
        c37_238 = C37_238_EDEFAULT;
        c37_238ESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TIME_SYNC_PROT__C37_238, oldC37_238, C37_238_EDEFAULT, oldC37_238ESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetC37_238() {
        return c37_238ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getOther() {
        return other;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOther( Boolean newOther ) {
        Boolean oldOther = other;
        other = newOther;
        boolean oldOtherESet = otherESet;
        otherESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TIME_SYNC_PROT__OTHER, oldOther, other, !oldOtherESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOther() {
        Boolean oldOther = other;
        boolean oldOtherESet = otherESet;
        other = OTHER_EDEFAULT;
        otherESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TIME_SYNC_PROT__OTHER, oldOther, OTHER_EDEFAULT, oldOtherESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOther() {
        return otherESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSntp() {
        return sntp;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSntp( Boolean newSntp ) {
        Boolean oldSntp = sntp;
        sntp = newSntp;
        boolean oldSntpESet = sntpESet;
        sntpESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TIME_SYNC_PROT__SNTP, oldSntp, sntp, !oldSntpESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSntp() {
        Boolean oldSntp = sntp;
        boolean oldSntpESet = sntpESet;
        sntp = SNTP_EDEFAULT;
        sntpESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TIME_SYNC_PROT__SNTP, oldSntp, SNTP_EDEFAULT, oldSntpESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSntp() {
        return sntpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClientServices getParentClientServices() {
        if (eContainerFeatureID() != SclPackage.TIME_SYNC_PROT__PARENT_CLIENT_SERVICES) return null;
        return (ClientServices)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentClientServices(ClientServices newParentClientServices, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentClientServices, SclPackage.TIME_SYNC_PROT__PARENT_CLIENT_SERVICES, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentClientServices(ClientServices newParentClientServices) {
        if (newParentClientServices != eInternalContainer() || (eContainerFeatureID() != SclPackage.TIME_SYNC_PROT__PARENT_CLIENT_SERVICES && newParentClientServices != null)) {
            if (EcoreUtil.isAncestor(this, newParentClientServices))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentClientServices != null)
                msgs = ((InternalEObject)newParentClientServices).eInverseAdd(this, SclPackage.CLIENT_SERVICES__TIME_SYNC_PROT, ClientServices.class, msgs);
            msgs = basicSetParentClientServices(newParentClientServices, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TIME_SYNC_PROT__PARENT_CLIENT_SERVICES, newParentClientServices, newParentClientServices));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Services getParentServices() {
        if (eContainerFeatureID() != SclPackage.TIME_SYNC_PROT__PARENT_SERVICES) return null;
        return (Services)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServices(Services newParentServices, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentServices, SclPackage.TIME_SYNC_PROT__PARENT_SERVICES, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentServices(Services newParentServices) {
        if (newParentServices != eInternalContainer() || (eContainerFeatureID() != SclPackage.TIME_SYNC_PROT__PARENT_SERVICES && newParentServices != null)) {
            if (EcoreUtil.isAncestor(this, newParentServices))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentServices != null)
                msgs = ((InternalEObject)newParentServices).eInverseAdd(this, SclPackage.SERVICES__TIME_SYNC_PROT, Services.class, msgs);
            msgs = basicSetParentServices(newParentServices, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TIME_SYNC_PROT__PARENT_SERVICES, newParentServices, newParentServices));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIec61850_9_3() {
        return iec61850_9_3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIec61850_9_3(Boolean newIec61850_9_3) {
        Boolean oldIec61850_9_3 = iec61850_9_3;
        iec61850_9_3 = newIec61850_9_3;
        boolean oldIec61850_9_3ESet = iec61850_9_3ESet;
        iec61850_9_3ESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TIME_SYNC_PROT__IEC61850_93, oldIec61850_9_3, iec61850_9_3, !oldIec61850_9_3ESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIec61850_9_3() {
        Boolean oldIec61850_9_3 = iec61850_9_3;
        boolean oldIec61850_9_3ESet = iec61850_9_3ESet;
        iec61850_9_3 = IEC61850_93_EDEFAULT;
        iec61850_9_3ESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TIME_SYNC_PROT__IEC61850_93, oldIec61850_9_3, IEC61850_93_EDEFAULT, oldIec61850_9_3ESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIec61850_9_3() {
        return iec61850_9_3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.TIME_SYNC_PROT__PARENT_CLIENT_SERVICES:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentClientServices((ClientServices)otherEnd, msgs);
            case SclPackage.TIME_SYNC_PROT__PARENT_SERVICES:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentServices((Services)otherEnd, msgs);
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
            case SclPackage.TIME_SYNC_PROT__PARENT_CLIENT_SERVICES:
                return basicSetParentClientServices(null, msgs);
            case SclPackage.TIME_SYNC_PROT__PARENT_SERVICES:
                return basicSetParentServices(null, msgs);
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
            case SclPackage.TIME_SYNC_PROT__PARENT_CLIENT_SERVICES:
                return eInternalContainer().eInverseRemove(this, SclPackage.CLIENT_SERVICES__TIME_SYNC_PROT, ClientServices.class, msgs);
            case SclPackage.TIME_SYNC_PROT__PARENT_SERVICES:
                return eInternalContainer().eInverseRemove(this, SclPackage.SERVICES__TIME_SYNC_PROT, Services.class, msgs);
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
            case SclPackage.TIME_SYNC_PROT__C37_238:
                return getC37_238();
            case SclPackage.TIME_SYNC_PROT__OTHER:
                return getOther();
            case SclPackage.TIME_SYNC_PROT__SNTP:
                return getSntp();
            case SclPackage.TIME_SYNC_PROT__PARENT_CLIENT_SERVICES:
                return getParentClientServices();
            case SclPackage.TIME_SYNC_PROT__PARENT_SERVICES:
                return getParentServices();
            case SclPackage.TIME_SYNC_PROT__IEC61850_93:
                return getIec61850_9_3();
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
            case SclPackage.TIME_SYNC_PROT__C37_238:
                setC37_238((Boolean)newValue);
                return;
            case SclPackage.TIME_SYNC_PROT__OTHER:
                setOther((Boolean)newValue);
                return;
            case SclPackage.TIME_SYNC_PROT__SNTP:
                setSntp((Boolean)newValue);
                return;
            case SclPackage.TIME_SYNC_PROT__PARENT_CLIENT_SERVICES:
                setParentClientServices((ClientServices)newValue);
                return;
            case SclPackage.TIME_SYNC_PROT__PARENT_SERVICES:
                setParentServices((Services)newValue);
                return;
            case SclPackage.TIME_SYNC_PROT__IEC61850_93:
                setIec61850_9_3((Boolean)newValue);
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
            case SclPackage.TIME_SYNC_PROT__C37_238:
                unsetC37_238();
                return;
            case SclPackage.TIME_SYNC_PROT__OTHER:
                unsetOther();
                return;
            case SclPackage.TIME_SYNC_PROT__SNTP:
                unsetSntp();
                return;
            case SclPackage.TIME_SYNC_PROT__PARENT_CLIENT_SERVICES:
                setParentClientServices((ClientServices)null);
                return;
            case SclPackage.TIME_SYNC_PROT__PARENT_SERVICES:
                setParentServices((Services)null);
                return;
            case SclPackage.TIME_SYNC_PROT__IEC61850_93:
                unsetIec61850_9_3();
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
            case SclPackage.TIME_SYNC_PROT__C37_238:
                return isSetC37_238();
            case SclPackage.TIME_SYNC_PROT__OTHER:
                return isSetOther();
            case SclPackage.TIME_SYNC_PROT__SNTP:
                return isSetSntp();
            case SclPackage.TIME_SYNC_PROT__PARENT_CLIENT_SERVICES:
                return getParentClientServices() != null;
            case SclPackage.TIME_SYNC_PROT__PARENT_SERVICES:
                return getParentServices() != null;
            case SclPackage.TIME_SYNC_PROT__IEC61850_93:
                return isSetIec61850_9_3();
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
        result.append(" (c37_238: ");
        if (c37_238ESet) result.append(c37_238); else result.append("<unset>");
        result.append(", other: ");
        if (otherESet) result.append(other); else result.append("<unset>");
        result.append(", sntp: ");
        if (sntpESet) result.append(sntp); else result.append("<unset>");
        result.append(", iec61850_9_3: ");
        if (iec61850_9_3ESet) result.append(iec61850_9_3); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //TimeSyncProtImpl
