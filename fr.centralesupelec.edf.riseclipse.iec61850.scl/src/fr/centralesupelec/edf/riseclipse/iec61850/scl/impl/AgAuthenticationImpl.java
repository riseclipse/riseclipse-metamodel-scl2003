/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
**
**  This file is part of the RiseClipse tool
**
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ag Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgAuthenticationImpl#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgAuthenticationImpl#getNone <em>None</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgAuthenticationImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgAuthenticationImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgAuthenticationImpl#getWeak <em>Weak</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgAuthenticationImpl extends MinimalEObjectImpl.Container implements AgAuthentication {
    /**
     * The default value of the '{@link #getCertificate() <em>Certificate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCertificate()
     * @generated
     * @ordered
     */
    protected static final Boolean CERTIFICATE_EDEFAULT = Boolean.FALSE;

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
    protected static final Boolean NONE_EDEFAULT = Boolean.TRUE;

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
    protected static final Boolean PASSWORD_EDEFAULT = Boolean.FALSE;

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
    protected static final Boolean STRONG_EDEFAULT = Boolean.FALSE;

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
    protected static final Boolean WEAK_EDEFAULT = Boolean.FALSE;

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
    protected AgAuthenticationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getAgAuthentication();
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.AG_AUTHENTICATION__CERTIFICATE,
                    oldCertificate, certificate, !oldCertificateESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.AG_AUTHENTICATION__CERTIFICATE,
                    oldCertificate, CERTIFICATE_EDEFAULT, oldCertificateESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.AG_AUTHENTICATION__NONE, oldNone, none,
                    !oldNoneESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.AG_AUTHENTICATION__NONE, oldNone,
                    NONE_EDEFAULT, oldNoneESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.AG_AUTHENTICATION__PASSWORD, oldPassword,
                    password, !oldPasswordESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.AG_AUTHENTICATION__PASSWORD,
                    oldPassword, PASSWORD_EDEFAULT, oldPasswordESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.AG_AUTHENTICATION__STRONG, oldStrong,
                    strong, !oldStrongESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.AG_AUTHENTICATION__STRONG, oldStrong,
                    STRONG_EDEFAULT, oldStrongESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.AG_AUTHENTICATION__WEAK, oldWeak, weak,
                    !oldWeakESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.AG_AUTHENTICATION__WEAK, oldWeak,
                    WEAK_EDEFAULT, oldWeakESet ) );
        }
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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case SclPackage.AG_AUTHENTICATION__CERTIFICATE:
            return getCertificate();
        case SclPackage.AG_AUTHENTICATION__NONE:
            return getNone();
        case SclPackage.AG_AUTHENTICATION__PASSWORD:
            return getPassword();
        case SclPackage.AG_AUTHENTICATION__STRONG:
            return getStrong();
        case SclPackage.AG_AUTHENTICATION__WEAK:
            return getWeak();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case SclPackage.AG_AUTHENTICATION__CERTIFICATE:
            setCertificate( ( Boolean ) newValue );
            return;
        case SclPackage.AG_AUTHENTICATION__NONE:
            setNone( ( Boolean ) newValue );
            return;
        case SclPackage.AG_AUTHENTICATION__PASSWORD:
            setPassword( ( Boolean ) newValue );
            return;
        case SclPackage.AG_AUTHENTICATION__STRONG:
            setStrong( ( Boolean ) newValue );
            return;
        case SclPackage.AG_AUTHENTICATION__WEAK:
            setWeak( ( Boolean ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case SclPackage.AG_AUTHENTICATION__CERTIFICATE:
            unsetCertificate();
            return;
        case SclPackage.AG_AUTHENTICATION__NONE:
            unsetNone();
            return;
        case SclPackage.AG_AUTHENTICATION__PASSWORD:
            unsetPassword();
            return;
        case SclPackage.AG_AUTHENTICATION__STRONG:
            unsetStrong();
            return;
        case SclPackage.AG_AUTHENTICATION__WEAK:
            unsetWeak();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case SclPackage.AG_AUTHENTICATION__CERTIFICATE:
            return isSetCertificate();
        case SclPackage.AG_AUTHENTICATION__NONE:
            return isSetNone();
        case SclPackage.AG_AUTHENTICATION__PASSWORD:
            return isSetPassword();
        case SclPackage.AG_AUTHENTICATION__STRONG:
            return isSetStrong();
        case SclPackage.AG_AUTHENTICATION__WEAK:
            return isSetWeak();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (certificate: " );
        if( certificateESet ) {
            result.append( certificate );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", none: " );
        if( noneESet ) {
            result.append( none );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", password: " );
        if( passwordESet ) {
            result.append( password );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", strong: " );
        if( strongESet ) {
            result.append( strong );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", weak: " );
        if( weakESet ) {
            result.append( weak );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //AgAuthenticationImpl
