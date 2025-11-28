/**
 *  Copyright (c) 2016-2024 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
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
 *      https://riseclipse.github.io/
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Security;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SecurityImpl#isACSEAuthentication <em>ACSE Authentication</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SecurityImpl#isE2ESecurity <em>E2E Security</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SecurityImpl#getParentServices <em>Parent Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SecurityImpl#getParentClientServices <em>Parent Client Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityImpl extends SclObjectImpl implements Security {
    /**
     * The default value of the '{@link #isACSEAuthentication() <em>ACSE Authentication</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isACSEAuthentication()
     * @generated
     * @ordered
     */
    protected static final boolean ACSE_AUTHENTICATION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isACSEAuthentication() <em>ACSE Authentication</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isACSEAuthentication()
     * @generated
     * @ordered
     */
    protected boolean acseAuthentication = ACSE_AUTHENTICATION_EDEFAULT;

    /**
     * This is true if the ACSE Authentication attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean acseAuthenticationESet;

    /**
     * The default value of the '{@link #isE2ESecurity() <em>E2E Security</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isE2ESecurity()
     * @generated
     * @ordered
     */
    protected static final boolean E2E_SECURITY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isE2ESecurity() <em>E2E Security</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isE2ESecurity()
     * @generated
     * @ordered
     */
    protected boolean e2ESecurity = E2E_SECURITY_EDEFAULT;

    /**
     * This is true if the E2E Security attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean e2ESecurityESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SecurityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSecurity();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isACSEAuthentication() {
        return acseAuthentication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setACSEAuthentication( boolean newACSEAuthentication ) {
        boolean oldACSEAuthentication = acseAuthentication;
        acseAuthentication = newACSEAuthentication;
        boolean oldACSEAuthenticationESet = acseAuthenticationESet;
        acseAuthenticationESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SECURITY__ACSE_AUTHENTICATION,
                    oldACSEAuthentication, acseAuthentication, !oldACSEAuthenticationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetACSEAuthentication() {
        boolean oldACSEAuthentication = acseAuthentication;
        boolean oldACSEAuthenticationESet = acseAuthenticationESet;
        acseAuthentication = ACSE_AUTHENTICATION_EDEFAULT;
        acseAuthenticationESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SECURITY__ACSE_AUTHENTICATION,
                    oldACSEAuthentication, ACSE_AUTHENTICATION_EDEFAULT, oldACSEAuthenticationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetACSEAuthentication() {
        return acseAuthenticationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isE2ESecurity() {
        return e2ESecurity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setE2ESecurity( boolean newE2ESecurity ) {
        boolean oldE2ESecurity = e2ESecurity;
        e2ESecurity = newE2ESecurity;
        boolean oldE2ESecurityESet = e2ESecurityESet;
        e2ESecurityESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SECURITY__E2E_SECURITY, oldE2ESecurity,
                    e2ESecurity, !oldE2ESecurityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetE2ESecurity() {
        boolean oldE2ESecurity = e2ESecurity;
        boolean oldE2ESecurityESet = e2ESecurityESet;
        e2ESecurity = E2E_SECURITY_EDEFAULT;
        e2ESecurityESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SECURITY__E2E_SECURITY, oldE2ESecurity,
                    E2E_SECURITY_EDEFAULT, oldE2ESecurityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetE2ESecurity() {
        return e2ESecurityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Services getParentServices() {
        if( eContainerFeatureID() != SclPackage.SECURITY__PARENT_SERVICES ) {
            return null;
        }
        return ( Services ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServices( Services newParentServices, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServices, SclPackage.SECURITY__PARENT_SERVICES, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentServices( Services newParentServices ) {
        if( newParentServices != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SECURITY__PARENT_SERVICES && newParentServices != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServices ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentServices != null ) {
                msgs = ( ( InternalEObject ) newParentServices ).eInverseAdd( this, SclPackage.SERVICES__SECURITY,
                        Services.class, msgs );
            }
            msgs = basicSetParentServices( newParentServices, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SECURITY__PARENT_SERVICES,
                    newParentServices, newParentServices ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClientServices getParentClientServices() {
        if( eContainerFeatureID() != SclPackage.SECURITY__PARENT_CLIENT_SERVICES ) {
            return null;
        }
        return ( ClientServices ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentClientServices( ClientServices newParentClientServices,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentClientServices,
                SclPackage.SECURITY__PARENT_CLIENT_SERVICES, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentClientServices( ClientServices newParentClientServices ) {
        if( newParentClientServices != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SECURITY__PARENT_CLIENT_SERVICES
                        && newParentClientServices != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentClientServices ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentClientServices != null ) {
                msgs = ( ( InternalEObject ) newParentClientServices ).eInverseAdd( this,
                        SclPackage.CLIENT_SERVICES__SECURITY, ClientServices.class, msgs );
            }
            msgs = basicSetParentClientServices( newParentClientServices, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SECURITY__PARENT_CLIENT_SERVICES,
                    newParentClientServices, newParentClientServices ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.SECURITY__PARENT_SERVICES:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentServices( ( Services ) otherEnd, msgs );
        case SclPackage.SECURITY__PARENT_CLIENT_SERVICES:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentClientServices( ( ClientServices ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.SECURITY__PARENT_SERVICES:
            return basicSetParentServices( null, msgs );
        case SclPackage.SECURITY__PARENT_CLIENT_SERVICES:
            return basicSetParentClientServices( null, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs ) {
        switch( eContainerFeatureID() ) {
        case SclPackage.SECURITY__PARENT_SERVICES:
            return eInternalContainer().eInverseRemove( this, SclPackage.SERVICES__SECURITY, Services.class, msgs );
        case SclPackage.SECURITY__PARENT_CLIENT_SERVICES:
            return eInternalContainer().eInverseRemove( this, SclPackage.CLIENT_SERVICES__SECURITY,
                    ClientServices.class, msgs );
        }
        return super.eBasicRemoveFromContainerFeature( msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case SclPackage.SECURITY__ACSE_AUTHENTICATION:
            return isACSEAuthentication();
        case SclPackage.SECURITY__E2E_SECURITY:
            return isE2ESecurity();
        case SclPackage.SECURITY__PARENT_SERVICES:
            return getParentServices();
        case SclPackage.SECURITY__PARENT_CLIENT_SERVICES:
            return getParentClientServices();
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
        case SclPackage.SECURITY__ACSE_AUTHENTICATION:
            setACSEAuthentication( ( Boolean ) newValue );
            return;
        case SclPackage.SECURITY__E2E_SECURITY:
            setE2ESecurity( ( Boolean ) newValue );
            return;
        case SclPackage.SECURITY__PARENT_SERVICES:
            setParentServices( ( Services ) newValue );
            return;
        case SclPackage.SECURITY__PARENT_CLIENT_SERVICES:
            setParentClientServices( ( ClientServices ) newValue );
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
        case SclPackage.SECURITY__ACSE_AUTHENTICATION:
            unsetACSEAuthentication();
            return;
        case SclPackage.SECURITY__E2E_SECURITY:
            unsetE2ESecurity();
            return;
        case SclPackage.SECURITY__PARENT_SERVICES:
            setParentServices( ( Services ) null );
            return;
        case SclPackage.SECURITY__PARENT_CLIENT_SERVICES:
            setParentClientServices( ( ClientServices ) null );
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
        case SclPackage.SECURITY__ACSE_AUTHENTICATION:
            return isSetACSEAuthentication();
        case SclPackage.SECURITY__E2E_SECURITY:
            return isSetE2ESecurity();
        case SclPackage.SECURITY__PARENT_SERVICES:
            return getParentServices() != null;
        case SclPackage.SECURITY__PARENT_CLIENT_SERVICES:
            return getParentClientServices() != null;
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
        result.append( " (ACSEAuthentication: " );
        if( acseAuthenticationESet ) {
            result.append( acseAuthentication );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", E2ESecurity: " );
        if( e2ESecurityESet ) {
            result.append( e2ESecurity );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //SecurityImpl
