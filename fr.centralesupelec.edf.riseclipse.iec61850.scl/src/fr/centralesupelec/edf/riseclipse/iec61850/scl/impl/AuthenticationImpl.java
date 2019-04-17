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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Server;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AuthenticationImpl#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AuthenticationImpl#getNone <em>None</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AuthenticationImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AuthenticationImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AuthenticationImpl#getWeak <em>Weak</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AuthenticationImpl#getParentServer <em>Parent Server</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthenticationImpl extends SclObjectImpl implements Authentication {
    /**
     * The default value of the '{@link #getCertificate() <em>Certificate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCertificate()
     * @generated
     * @ordered
     */
    protected static final Boolean CERTIFICATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCertificate() <em>Certificate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCertificate()
     * @generated
     * @ordered
     */
    protected Boolean certificate = CERTIFICATE_EDEFAULT;

    /**
     * This is true if the Certificate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean certificateESet;

    /**
     * The default value of the '{@link #getNone() <em>None</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNone()
     * @generated
     * @ordered
     */
    protected static final Boolean NONE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNone() <em>None</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNone()
     * @generated
     * @ordered
     */
    protected Boolean none = NONE_EDEFAULT;

    /**
     * This is true if the None attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean noneESet;

    /**
     * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected static final Boolean PASSWORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected Boolean password = PASSWORD_EDEFAULT;

    /**
     * This is true if the Password attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean passwordESet;

    /**
     * The default value of the '{@link #getStrong() <em>Strong</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStrong()
     * @generated
     * @ordered
     */
    protected static final Boolean STRONG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStrong() <em>Strong</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStrong()
     * @generated
     * @ordered
     */
    protected Boolean strong = STRONG_EDEFAULT;

    /**
     * This is true if the Strong attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean strongESet;

    /**
     * The default value of the '{@link #getWeak() <em>Weak</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeak()
     * @generated
     * @ordered
     */
    protected static final Boolean WEAK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWeak() <em>Weak</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeak()
     * @generated
     * @ordered
     */
    protected Boolean weak = WEAK_EDEFAULT;

    /**
     * This is true if the Weak attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean weakESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AuthenticationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getAuthentication();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getCertificate() {
        return certificate;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCertificate( Boolean newCertificate ) {
        Boolean oldCertificate = certificate;
        certificate = newCertificate;
        boolean oldCertificateESet = certificateESet;
        certificateESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.AUTHENTICATION__CERTIFICATE, oldCertificate, certificate, !oldCertificateESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCertificate() {
        Boolean oldCertificate = certificate;
        boolean oldCertificateESet = certificateESet;
        certificate = CERTIFICATE_EDEFAULT;
        certificateESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.AUTHENTICATION__CERTIFICATE, oldCertificate, CERTIFICATE_EDEFAULT, oldCertificateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCertificate() {
        return certificateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getNone() {
        return none;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNone( Boolean newNone ) {
        Boolean oldNone = none;
        none = newNone;
        boolean oldNoneESet = noneESet;
        noneESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.AUTHENTICATION__NONE, oldNone, none, !oldNoneESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNone() {
        Boolean oldNone = none;
        boolean oldNoneESet = noneESet;
        none = NONE_EDEFAULT;
        noneESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.AUTHENTICATION__NONE, oldNone, NONE_EDEFAULT, oldNoneESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNone() {
        return noneESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getPassword() {
        return password;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPassword( Boolean newPassword ) {
        Boolean oldPassword = password;
        password = newPassword;
        boolean oldPasswordESet = passwordESet;
        passwordESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.AUTHENTICATION__PASSWORD, oldPassword, password, !oldPasswordESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPassword() {
        Boolean oldPassword = password;
        boolean oldPasswordESet = passwordESet;
        password = PASSWORD_EDEFAULT;
        passwordESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.AUTHENTICATION__PASSWORD, oldPassword, PASSWORD_EDEFAULT, oldPasswordESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPassword() {
        return passwordESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getStrong() {
        return strong;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStrong( Boolean newStrong ) {
        Boolean oldStrong = strong;
        strong = newStrong;
        boolean oldStrongESet = strongESet;
        strongESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.AUTHENTICATION__STRONG, oldStrong, strong, !oldStrongESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStrong() {
        Boolean oldStrong = strong;
        boolean oldStrongESet = strongESet;
        strong = STRONG_EDEFAULT;
        strongESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.AUTHENTICATION__STRONG, oldStrong, STRONG_EDEFAULT, oldStrongESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStrong() {
        return strongESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getWeak() {
        return weak;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWeak( Boolean newWeak ) {
        Boolean oldWeak = weak;
        weak = newWeak;
        boolean oldWeakESet = weakESet;
        weakESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.AUTHENTICATION__WEAK, oldWeak, weak, !oldWeakESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWeak() {
        Boolean oldWeak = weak;
        boolean oldWeakESet = weakESet;
        weak = WEAK_EDEFAULT;
        weakESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.AUTHENTICATION__WEAK, oldWeak, WEAK_EDEFAULT, oldWeakESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWeak() {
        return weakESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Server getParentServer() {
        if (eContainerFeatureID() != SclPackage.AUTHENTICATION__PARENT_SERVER) return null;
        return (Server)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServer(Server newParentServer, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentServer, SclPackage.AUTHENTICATION__PARENT_SERVER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentServer(Server newParentServer) {
        if (newParentServer != eInternalContainer() || (eContainerFeatureID() != SclPackage.AUTHENTICATION__PARENT_SERVER && newParentServer != null)) {
            if (EcoreUtil.isAncestor(this, newParentServer))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentServer != null)
                msgs = ((InternalEObject)newParentServer).eInverseAdd(this, SclPackage.SERVER__AUTHENTICATION, Server.class, msgs);
            msgs = basicSetParentServer(newParentServer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.AUTHENTICATION__PARENT_SERVER, newParentServer, newParentServer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.AUTHENTICATION__PARENT_SERVER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentServer((Server)otherEnd, msgs);
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
            case SclPackage.AUTHENTICATION__PARENT_SERVER:
                return basicSetParentServer(null, msgs);
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
            case SclPackage.AUTHENTICATION__PARENT_SERVER:
                return eInternalContainer().eInverseRemove(this, SclPackage.SERVER__AUTHENTICATION, Server.class, msgs);
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
            case SclPackage.AUTHENTICATION__CERTIFICATE:
                return getCertificate();
            case SclPackage.AUTHENTICATION__NONE:
                return getNone();
            case SclPackage.AUTHENTICATION__PASSWORD:
                return getPassword();
            case SclPackage.AUTHENTICATION__STRONG:
                return getStrong();
            case SclPackage.AUTHENTICATION__WEAK:
                return getWeak();
            case SclPackage.AUTHENTICATION__PARENT_SERVER:
                return getParentServer();
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
            case SclPackage.AUTHENTICATION__CERTIFICATE:
                setCertificate((Boolean)newValue);
                return;
            case SclPackage.AUTHENTICATION__NONE:
                setNone((Boolean)newValue);
                return;
            case SclPackage.AUTHENTICATION__PASSWORD:
                setPassword((Boolean)newValue);
                return;
            case SclPackage.AUTHENTICATION__STRONG:
                setStrong((Boolean)newValue);
                return;
            case SclPackage.AUTHENTICATION__WEAK:
                setWeak((Boolean)newValue);
                return;
            case SclPackage.AUTHENTICATION__PARENT_SERVER:
                setParentServer((Server)newValue);
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
            case SclPackage.AUTHENTICATION__CERTIFICATE:
                unsetCertificate();
                return;
            case SclPackage.AUTHENTICATION__NONE:
                unsetNone();
                return;
            case SclPackage.AUTHENTICATION__PASSWORD:
                unsetPassword();
                return;
            case SclPackage.AUTHENTICATION__STRONG:
                unsetStrong();
                return;
            case SclPackage.AUTHENTICATION__WEAK:
                unsetWeak();
                return;
            case SclPackage.AUTHENTICATION__PARENT_SERVER:
                setParentServer((Server)null);
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
            case SclPackage.AUTHENTICATION__CERTIFICATE:
                return isSetCertificate();
            case SclPackage.AUTHENTICATION__NONE:
                return isSetNone();
            case SclPackage.AUTHENTICATION__PASSWORD:
                return isSetPassword();
            case SclPackage.AUTHENTICATION__STRONG:
                return isSetStrong();
            case SclPackage.AUTHENTICATION__WEAK:
                return isSetWeak();
            case SclPackage.AUTHENTICATION__PARENT_SERVER:
                return getParentServer() != null;
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
        if (baseClass == AgAuthentication.class) {
            switch (derivedFeatureID) {
                case SclPackage.AUTHENTICATION__CERTIFICATE: return SclPackage.AG_AUTHENTICATION__CERTIFICATE;
                case SclPackage.AUTHENTICATION__NONE: return SclPackage.AG_AUTHENTICATION__NONE;
                case SclPackage.AUTHENTICATION__PASSWORD: return SclPackage.AG_AUTHENTICATION__PASSWORD;
                case SclPackage.AUTHENTICATION__STRONG: return SclPackage.AG_AUTHENTICATION__STRONG;
                case SclPackage.AUTHENTICATION__WEAK: return SclPackage.AG_AUTHENTICATION__WEAK;
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
        if (baseClass == AgAuthentication.class) {
            switch (baseFeatureID) {
                case SclPackage.AG_AUTHENTICATION__CERTIFICATE: return SclPackage.AUTHENTICATION__CERTIFICATE;
                case SclPackage.AG_AUTHENTICATION__NONE: return SclPackage.AUTHENTICATION__NONE;
                case SclPackage.AG_AUTHENTICATION__PASSWORD: return SclPackage.AUTHENTICATION__PASSWORD;
                case SclPackage.AG_AUTHENTICATION__STRONG: return SclPackage.AUTHENTICATION__STRONG;
                case SclPackage.AG_AUTHENTICATION__WEAK: return SclPackage.AUTHENTICATION__WEAK;
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
        result.append(" (certificate: ");
        if (certificateESet) result.append(certificate); else result.append("<unset>");
        result.append(", none: ");
        if (noneESet) result.append(none); else result.append("<unset>");
        result.append(", password: ");
        if (passwordESet) result.append(password); else result.append("<unset>");
        result.append(", strong: ");
        if (strongESet) result.append(strong); else result.append("<unset>");
        result.append(", weak: ");
        if (weakESet) result.append(weak); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //AuthenticationImpl
