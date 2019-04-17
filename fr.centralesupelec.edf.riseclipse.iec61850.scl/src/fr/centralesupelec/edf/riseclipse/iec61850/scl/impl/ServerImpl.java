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

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Association;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Server;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerImpl#getParentAccessPoint <em>Parent Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerImpl#getLDevice <em>LDevice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerImpl extends UnNamingImpl implements Server {
    /**
     * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeout()
     * @generated
     * @ordered
     */
    protected static final Integer TIMEOUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeout()
     * @generated
     * @ordered
     */
    protected Integer timeout = TIMEOUT_EDEFAULT;

    /**
     * This is true if the Timeout attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeoutESet;

    /**
     * The cached value of the '{@link #getAssociation() <em>Association</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssociation()
     * @generated
     * @ordered
     */
    protected EList<Association> association;

    /**
     * The cached value of the '{@link #getAuthentication() <em>Authentication</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthentication()
     * @generated
     * @ordered
     */
    protected Authentication authentication;

    /**
     * This is true if the Authentication containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean authenticationESet;

    /**
     * The cached value of the '{@link #getLDevice() <em>LDevice</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLDevice()
     * @generated
     * @ordered
     */
    protected EList<LDevice> lDevice;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getServer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTimeout( Integer newTimeout ) {
        Integer oldTimeout = timeout;
        timeout = newTimeout;
        boolean oldTimeoutESet = timeoutESet;
        timeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVER__TIMEOUT, oldTimeout, timeout, !oldTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimeout() {
        Integer oldTimeout = timeout;
        boolean oldTimeoutESet = timeoutESet;
        timeout = TIMEOUT_EDEFAULT;
        timeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVER__TIMEOUT, oldTimeout, TIMEOUT_EDEFAULT, oldTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimeout() {
        return timeoutESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccessPoint getParentAccessPoint() {
        if (eContainerFeatureID() != SclPackage.SERVER__PARENT_ACCESS_POINT) return null;
        return (AccessPoint)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAccessPoint(AccessPoint newParentAccessPoint, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentAccessPoint, SclPackage.SERVER__PARENT_ACCESS_POINT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAccessPoint(AccessPoint newParentAccessPoint) {
        if (newParentAccessPoint != eInternalContainer() || (eContainerFeatureID() != SclPackage.SERVER__PARENT_ACCESS_POINT && newParentAccessPoint != null)) {
            if (EcoreUtil.isAncestor(this, newParentAccessPoint))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentAccessPoint != null)
                msgs = ((InternalEObject)newParentAccessPoint).eInverseAdd(this, SclPackage.ACCESS_POINT__SERVER, AccessPoint.class, msgs);
            msgs = basicSetParentAccessPoint(newParentAccessPoint, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVER__PARENT_ACCESS_POINT, newParentAccessPoint, newParentAccessPoint));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Association> getAssociation() {
        if (association == null) {
            association = new EObjectContainmentWithInverseEList.Unsettable<Association>(Association.class, this, SclPackage.SERVER__ASSOCIATION, SclPackage.ASSOCIATION__PARENT_SERVER);
        }
        return association;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAssociation() {
        if (association != null) ((InternalEList.Unsettable<?>)association).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssociation() {
        return association != null && ((InternalEList.Unsettable<?>)association).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAuthentication( Authentication newAuthentication, NotificationChain msgs ) {
        Authentication oldAuthentication = authentication;
        authentication = newAuthentication;
        boolean oldAuthenticationESet = authenticationESet;
        authenticationESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVER__AUTHENTICATION, oldAuthentication, newAuthentication, !oldAuthenticationESet);
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
    public void setAuthentication( Authentication newAuthentication ) {
        if (newAuthentication != authentication) {
            NotificationChain msgs = null;
            if (authentication != null)
                msgs = ((InternalEObject)authentication).eInverseRemove(this, SclPackage.AUTHENTICATION__PARENT_SERVER, Authentication.class, msgs);
            if (newAuthentication != null)
                msgs = ((InternalEObject)newAuthentication).eInverseAdd(this, SclPackage.AUTHENTICATION__PARENT_SERVER, Authentication.class, msgs);
            msgs = basicSetAuthentication(newAuthentication, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldAuthenticationESet = authenticationESet;
            authenticationESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVER__AUTHENTICATION, newAuthentication, newAuthentication, !oldAuthenticationESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAuthentication( NotificationChain msgs ) {
        Authentication oldAuthentication = authentication;
        authentication = null;
        boolean oldAuthenticationESet = authenticationESet;
        authenticationESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVER__AUTHENTICATION, oldAuthentication, null, oldAuthenticationESet);
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
    public void unsetAuthentication() {
        if (authentication != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)authentication).eInverseRemove(this, SclPackage.AUTHENTICATION__PARENT_SERVER, Authentication.class, msgs);
            msgs = basicUnsetAuthentication(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldAuthenticationESet = authenticationESet;
            authenticationESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVER__AUTHENTICATION, null, null, oldAuthenticationESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAuthentication() {
        return authenticationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<LDevice> getLDevice() {
        if (lDevice == null) {
            lDevice = new EObjectContainmentWithInverseEList.Unsettable<LDevice>(LDevice.class, this, SclPackage.SERVER__LDEVICE, SclPackage.LDEVICE__PARENT_SERVER);
        }
        return lDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLDevice() {
        if (lDevice != null) ((InternalEList.Unsettable<?>)lDevice).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLDevice() {
        return lDevice != null && ((InternalEList.Unsettable<?>)lDevice).isSet();
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
            case SclPackage.SERVER__PARENT_ACCESS_POINT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentAccessPoint((AccessPoint)otherEnd, msgs);
            case SclPackage.SERVER__ASSOCIATION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociation()).basicAdd(otherEnd, msgs);
            case SclPackage.SERVER__AUTHENTICATION:
                if (authentication != null)
                    msgs = ((InternalEObject)authentication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVER__AUTHENTICATION, null, msgs);
                return basicSetAuthentication((Authentication)otherEnd, msgs);
            case SclPackage.SERVER__LDEVICE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getLDevice()).basicAdd(otherEnd, msgs);
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
            case SclPackage.SERVER__PARENT_ACCESS_POINT:
                return basicSetParentAccessPoint(null, msgs);
            case SclPackage.SERVER__ASSOCIATION:
                return ((InternalEList<?>)getAssociation()).basicRemove(otherEnd, msgs);
            case SclPackage.SERVER__AUTHENTICATION:
                return basicUnsetAuthentication(msgs);
            case SclPackage.SERVER__LDEVICE:
                return ((InternalEList<?>)getLDevice()).basicRemove(otherEnd, msgs);
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
            case SclPackage.SERVER__PARENT_ACCESS_POINT:
                return eInternalContainer().eInverseRemove(this, SclPackage.ACCESS_POINT__SERVER, AccessPoint.class, msgs);
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
            case SclPackage.SERVER__TIMEOUT:
                return getTimeout();
            case SclPackage.SERVER__PARENT_ACCESS_POINT:
                return getParentAccessPoint();
            case SclPackage.SERVER__ASSOCIATION:
                return getAssociation();
            case SclPackage.SERVER__AUTHENTICATION:
                return getAuthentication();
            case SclPackage.SERVER__LDEVICE:
                return getLDevice();
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
            case SclPackage.SERVER__TIMEOUT:
                setTimeout((Integer)newValue);
                return;
            case SclPackage.SERVER__PARENT_ACCESS_POINT:
                setParentAccessPoint((AccessPoint)newValue);
                return;
            case SclPackage.SERVER__ASSOCIATION:
                getAssociation().clear();
                getAssociation().addAll((Collection<? extends Association>)newValue);
                return;
            case SclPackage.SERVER__AUTHENTICATION:
                setAuthentication((Authentication)newValue);
                return;
            case SclPackage.SERVER__LDEVICE:
                getLDevice().clear();
                getLDevice().addAll((Collection<? extends LDevice>)newValue);
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
            case SclPackage.SERVER__TIMEOUT:
                unsetTimeout();
                return;
            case SclPackage.SERVER__PARENT_ACCESS_POINT:
                setParentAccessPoint((AccessPoint)null);
                return;
            case SclPackage.SERVER__ASSOCIATION:
                unsetAssociation();
                return;
            case SclPackage.SERVER__AUTHENTICATION:
                unsetAuthentication();
                return;
            case SclPackage.SERVER__LDEVICE:
                unsetLDevice();
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
            case SclPackage.SERVER__TIMEOUT:
                return isSetTimeout();
            case SclPackage.SERVER__PARENT_ACCESS_POINT:
                return getParentAccessPoint() != null;
            case SclPackage.SERVER__ASSOCIATION:
                return isSetAssociation();
            case SclPackage.SERVER__AUTHENTICATION:
                return isSetAuthentication();
            case SclPackage.SERVER__LDEVICE:
                return isSetLDevice();
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
        result.append(" (timeout: ");
        if (timeoutESet) result.append(timeout); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ServerImpl
