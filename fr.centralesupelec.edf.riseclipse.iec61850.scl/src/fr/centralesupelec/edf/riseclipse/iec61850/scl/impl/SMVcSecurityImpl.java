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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVcSecurity;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SM Vc Security</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVcSecurityImpl#getParentClientServicesFromSMVcSecurity <em>Parent Client Services From SM Vc Security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SMVcSecurityImpl extends McSecurityImpl implements SMVcSecurity {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SMVcSecurityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSMVcSecurity();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClientServices getParentClientServicesFromSMVcSecurity() {
        if( eContainerFeatureID() != SclPackage.SM_VC_SECURITY__PARENT_CLIENT_SERVICES_FROM_SM_VC_SECURITY ) {
            return null;
        }
        return ( ClientServices ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentClientServicesFromSMVcSecurity(
            ClientServices newParentClientServicesFromSMVcSecurity, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentClientServicesFromSMVcSecurity,
                SclPackage.SM_VC_SECURITY__PARENT_CLIENT_SERVICES_FROM_SM_VC_SECURITY, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentClientServicesFromSMVcSecurity( ClientServices newParentClientServicesFromSMVcSecurity ) {
        if( newParentClientServicesFromSMVcSecurity != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SM_VC_SECURITY__PARENT_CLIENT_SERVICES_FROM_SM_VC_SECURITY
                        && newParentClientServicesFromSMVcSecurity != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentClientServicesFromSMVcSecurity ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentClientServicesFromSMVcSecurity != null ) {
                msgs = ( ( InternalEObject ) newParentClientServicesFromSMVcSecurity ).eInverseAdd( this,
                        SclPackage.CLIENT_SERVICES__SM_VC_SECURITY, ClientServices.class, msgs );
            }
            msgs = basicSetParentClientServicesFromSMVcSecurity( newParentClientServicesFromSMVcSecurity, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    SclPackage.SM_VC_SECURITY__PARENT_CLIENT_SERVICES_FROM_SM_VC_SECURITY,
                    newParentClientServicesFromSMVcSecurity, newParentClientServicesFromSMVcSecurity ) );
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
        case SclPackage.SM_VC_SECURITY__PARENT_CLIENT_SERVICES_FROM_SM_VC_SECURITY:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentClientServicesFromSMVcSecurity( ( ClientServices ) otherEnd, msgs );
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
        case SclPackage.SM_VC_SECURITY__PARENT_CLIENT_SERVICES_FROM_SM_VC_SECURITY:
            return basicSetParentClientServicesFromSMVcSecurity( null, msgs );
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
        case SclPackage.SM_VC_SECURITY__PARENT_CLIENT_SERVICES_FROM_SM_VC_SECURITY:
            return eInternalContainer().eInverseRemove( this, SclPackage.CLIENT_SERVICES__SM_VC_SECURITY,
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
        case SclPackage.SM_VC_SECURITY__PARENT_CLIENT_SERVICES_FROM_SM_VC_SECURITY:
            return getParentClientServicesFromSMVcSecurity();
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
        case SclPackage.SM_VC_SECURITY__PARENT_CLIENT_SERVICES_FROM_SM_VC_SECURITY:
            setParentClientServicesFromSMVcSecurity( ( ClientServices ) newValue );
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
        case SclPackage.SM_VC_SECURITY__PARENT_CLIENT_SERVICES_FROM_SM_VC_SECURITY:
            setParentClientServicesFromSMVcSecurity( ( ClientServices ) null );
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
        case SclPackage.SM_VC_SECURITY__PARENT_CLIENT_SERVICES_FROM_SM_VC_SECURITY:
            return getParentClientServicesFromSMVcSecurity() != null;
        }
        return super.eIsSet( featureID );
    }

} //SMVcSecurityImpl
