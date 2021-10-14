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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mc Security</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.McSecurityImpl#getParentClientServices <em>Parent Client Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.McSecurityImpl#getParentGSESettings <em>Parent GSE Settings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.McSecurityImpl#getParentSMVSettings <em>Parent SMV Settings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.McSecurityImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.McSecurityImpl#getEncryption <em>Encryption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class McSecurityImpl extends SclObjectImpl implements McSecurity {
    /**
     * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSignature()
     * @generated
     * @ordered
     */
    protected static final Boolean SIGNATURE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSignature()
     * @generated
     * @ordered
     */
    protected Boolean signature = SIGNATURE_EDEFAULT;

    /**
     * This is true if the Signature attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean signatureESet;

    /**
     * The default value of the '{@link #getEncryption() <em>Encryption</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEncryption()
     * @generated
     * @ordered
     */
    protected static final Boolean ENCRYPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEncryption() <em>Encryption</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEncryption()
     * @generated
     * @ordered
     */
    protected Boolean encryption = ENCRYPTION_EDEFAULT;

    /**
     * This is true if the Encryption attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean encryptionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected McSecurityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getMcSecurity();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClientServices getParentClientServices() {
        if( eContainerFeatureID() != SclPackage.MC_SECURITY__PARENT_CLIENT_SERVICES ) return null;
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
                SclPackage.MC_SECURITY__PARENT_CLIENT_SERVICES, msgs );
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
                || ( eContainerFeatureID() != SclPackage.MC_SECURITY__PARENT_CLIENT_SERVICES
                        && newParentClientServices != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentClientServices ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentClientServices != null )
                msgs = ( ( InternalEObject ) newParentClientServices ).eInverseAdd( this,
                        SclPackage.CLIENT_SERVICES__MC_SECURITY, ClientServices.class, msgs );
            msgs = basicSetParentClientServices( newParentClientServices, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.MC_SECURITY__PARENT_CLIENT_SERVICES,
                    newParentClientServices, newParentClientServices ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GSESettings getParentGSESettings() {
        if( eContainerFeatureID() != SclPackage.MC_SECURITY__PARENT_GSE_SETTINGS ) return null;
        return ( GSESettings ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentGSESettings( GSESettings newParentGSESettings, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentGSESettings,
                SclPackage.MC_SECURITY__PARENT_GSE_SETTINGS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentGSESettings( GSESettings newParentGSESettings ) {
        if( newParentGSESettings != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.MC_SECURITY__PARENT_GSE_SETTINGS
                        && newParentGSESettings != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentGSESettings ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentGSESettings != null )
                msgs = ( ( InternalEObject ) newParentGSESettings ).eInverseAdd( this,
                        SclPackage.GSE_SETTINGS__MC_SECURITY, GSESettings.class, msgs );
            msgs = basicSetParentGSESettings( newParentGSESettings, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.MC_SECURITY__PARENT_GSE_SETTINGS,
                    newParentGSESettings, newParentGSESettings ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SMVSettings getParentSMVSettings() {
        if( eContainerFeatureID() != SclPackage.MC_SECURITY__PARENT_SMV_SETTINGS ) return null;
        return ( SMVSettings ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSMVSettings( SMVSettings newParentSMVSettings, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSMVSettings,
                SclPackage.MC_SECURITY__PARENT_SMV_SETTINGS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSMVSettings( SMVSettings newParentSMVSettings ) {
        if( newParentSMVSettings != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.MC_SECURITY__PARENT_SMV_SETTINGS
                        && newParentSMVSettings != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSMVSettings ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentSMVSettings != null )
                msgs = ( ( InternalEObject ) newParentSMVSettings ).eInverseAdd( this,
                        SclPackage.SMV_SETTINGS__MC_SECURITY, SMVSettings.class, msgs );
            msgs = basicSetParentSMVSettings( newParentSMVSettings, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.MC_SECURITY__PARENT_SMV_SETTINGS,
                    newParentSMVSettings, newParentSMVSettings ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSignature() {
        return signature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSignature( Boolean newSignature ) {
        Boolean oldSignature = signature;
        signature = newSignature;
        boolean oldSignatureESet = signatureESet;
        signatureESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.MC_SECURITY__SIGNATURE, oldSignature,
                    signature, !oldSignatureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSignature() {
        Boolean oldSignature = signature;
        boolean oldSignatureESet = signatureESet;
        signature = SIGNATURE_EDEFAULT;
        signatureESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.MC_SECURITY__SIGNATURE, oldSignature,
                    SIGNATURE_EDEFAULT, oldSignatureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSignature() {
        return signatureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getEncryption() {
        return encryption;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEncryption( Boolean newEncryption ) {
        Boolean oldEncryption = encryption;
        encryption = newEncryption;
        boolean oldEncryptionESet = encryptionESet;
        encryptionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.MC_SECURITY__ENCRYPTION, oldEncryption,
                    encryption, !oldEncryptionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEncryption() {
        Boolean oldEncryption = encryption;
        boolean oldEncryptionESet = encryptionESet;
        encryption = ENCRYPTION_EDEFAULT;
        encryptionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.MC_SECURITY__ENCRYPTION, oldEncryption,
                    ENCRYPTION_EDEFAULT, oldEncryptionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEncryption() {
        return encryptionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.MC_SECURITY__PARENT_CLIENT_SERVICES:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentClientServices( ( ClientServices ) otherEnd, msgs );
        case SclPackage.MC_SECURITY__PARENT_GSE_SETTINGS:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentGSESettings( ( GSESettings ) otherEnd, msgs );
        case SclPackage.MC_SECURITY__PARENT_SMV_SETTINGS:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentSMVSettings( ( SMVSettings ) otherEnd, msgs );
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
        case SclPackage.MC_SECURITY__PARENT_CLIENT_SERVICES:
            return basicSetParentClientServices( null, msgs );
        case SclPackage.MC_SECURITY__PARENT_GSE_SETTINGS:
            return basicSetParentGSESettings( null, msgs );
        case SclPackage.MC_SECURITY__PARENT_SMV_SETTINGS:
            return basicSetParentSMVSettings( null, msgs );
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
        case SclPackage.MC_SECURITY__PARENT_CLIENT_SERVICES:
            return eInternalContainer().eInverseRemove( this, SclPackage.CLIENT_SERVICES__MC_SECURITY,
                    ClientServices.class, msgs );
        case SclPackage.MC_SECURITY__PARENT_GSE_SETTINGS:
            return eInternalContainer().eInverseRemove( this, SclPackage.GSE_SETTINGS__MC_SECURITY, GSESettings.class,
                    msgs );
        case SclPackage.MC_SECURITY__PARENT_SMV_SETTINGS:
            return eInternalContainer().eInverseRemove( this, SclPackage.SMV_SETTINGS__MC_SECURITY, SMVSettings.class,
                    msgs );
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
        case SclPackage.MC_SECURITY__PARENT_CLIENT_SERVICES:
            return getParentClientServices();
        case SclPackage.MC_SECURITY__PARENT_GSE_SETTINGS:
            return getParentGSESettings();
        case SclPackage.MC_SECURITY__PARENT_SMV_SETTINGS:
            return getParentSMVSettings();
        case SclPackage.MC_SECURITY__SIGNATURE:
            return getSignature();
        case SclPackage.MC_SECURITY__ENCRYPTION:
            return getEncryption();
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
        case SclPackage.MC_SECURITY__PARENT_CLIENT_SERVICES:
            setParentClientServices( ( ClientServices ) newValue );
            return;
        case SclPackage.MC_SECURITY__PARENT_GSE_SETTINGS:
            setParentGSESettings( ( GSESettings ) newValue );
            return;
        case SclPackage.MC_SECURITY__PARENT_SMV_SETTINGS:
            setParentSMVSettings( ( SMVSettings ) newValue );
            return;
        case SclPackage.MC_SECURITY__SIGNATURE:
            setSignature( ( Boolean ) newValue );
            return;
        case SclPackage.MC_SECURITY__ENCRYPTION:
            setEncryption( ( Boolean ) newValue );
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
        case SclPackage.MC_SECURITY__PARENT_CLIENT_SERVICES:
            setParentClientServices( ( ClientServices ) null );
            return;
        case SclPackage.MC_SECURITY__PARENT_GSE_SETTINGS:
            setParentGSESettings( ( GSESettings ) null );
            return;
        case SclPackage.MC_SECURITY__PARENT_SMV_SETTINGS:
            setParentSMVSettings( ( SMVSettings ) null );
            return;
        case SclPackage.MC_SECURITY__SIGNATURE:
            unsetSignature();
            return;
        case SclPackage.MC_SECURITY__ENCRYPTION:
            unsetEncryption();
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
        case SclPackage.MC_SECURITY__PARENT_CLIENT_SERVICES:
            return getParentClientServices() != null;
        case SclPackage.MC_SECURITY__PARENT_GSE_SETTINGS:
            return getParentGSESettings() != null;
        case SclPackage.MC_SECURITY__PARENT_SMV_SETTINGS:
            return getParentSMVSettings() != null;
        case SclPackage.MC_SECURITY__SIGNATURE:
            return isSetSignature();
        case SclPackage.MC_SECURITY__ENCRYPTION:
            return isSetEncryption();
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
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (signature: " );
        if( signatureESet )
            result.append( signature );
        else
            result.append( "<unset>" );
        result.append( ", encryption: " );
        if( encryptionESet )
            result.append( encryption );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //McSecurityImpl
