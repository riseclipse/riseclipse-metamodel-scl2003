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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSEMcSecurity;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GOOSE Mc Security</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GOOSEMcSecurityImpl#getParentClientServicesFromGooseMcSecurity <em>Parent Client Services From Goose Mc Security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GOOSEMcSecurityImpl extends McSecurityImpl implements GOOSEMcSecurity {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GOOSEMcSecurityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getGOOSEMcSecurity();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClientServices getParentClientServicesFromGooseMcSecurity() {
        if( eContainerFeatureID() != SclPackage.GOOSE_MC_SECURITY__PARENT_CLIENT_SERVICES_FROM_GOOSE_MC_SECURITY ) {
            return null;
        }
        return ( ClientServices ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentClientServicesFromGooseMcSecurity(
            ClientServices newParentClientServicesFromGooseMcSecurity, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentClientServicesFromGooseMcSecurity,
                SclPackage.GOOSE_MC_SECURITY__PARENT_CLIENT_SERVICES_FROM_GOOSE_MC_SECURITY, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentClientServicesFromGooseMcSecurity(
            ClientServices newParentClientServicesFromGooseMcSecurity ) {
        if( newParentClientServicesFromGooseMcSecurity != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.GOOSE_MC_SECURITY__PARENT_CLIENT_SERVICES_FROM_GOOSE_MC_SECURITY
                        && newParentClientServicesFromGooseMcSecurity != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentClientServicesFromGooseMcSecurity ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentClientServicesFromGooseMcSecurity != null ) {
                msgs = ( ( InternalEObject ) newParentClientServicesFromGooseMcSecurity ).eInverseAdd( this,
                        SclPackage.CLIENT_SERVICES__GOOSE_MC_SECURITY, ClientServices.class, msgs );
            }
            msgs = basicSetParentClientServicesFromGooseMcSecurity( newParentClientServicesFromGooseMcSecurity, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    SclPackage.GOOSE_MC_SECURITY__PARENT_CLIENT_SERVICES_FROM_GOOSE_MC_SECURITY,
                    newParentClientServicesFromGooseMcSecurity, newParentClientServicesFromGooseMcSecurity ) );
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
        case SclPackage.GOOSE_MC_SECURITY__PARENT_CLIENT_SERVICES_FROM_GOOSE_MC_SECURITY:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentClientServicesFromGooseMcSecurity( ( ClientServices ) otherEnd, msgs );
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
        case SclPackage.GOOSE_MC_SECURITY__PARENT_CLIENT_SERVICES_FROM_GOOSE_MC_SECURITY:
            return basicSetParentClientServicesFromGooseMcSecurity( null, msgs );
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
        case SclPackage.GOOSE_MC_SECURITY__PARENT_CLIENT_SERVICES_FROM_GOOSE_MC_SECURITY:
            return eInternalContainer().eInverseRemove( this, SclPackage.CLIENT_SERVICES__GOOSE_MC_SECURITY,
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
        case SclPackage.GOOSE_MC_SECURITY__PARENT_CLIENT_SERVICES_FROM_GOOSE_MC_SECURITY:
            return getParentClientServicesFromGooseMcSecurity();
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
        case SclPackage.GOOSE_MC_SECURITY__PARENT_CLIENT_SERVICES_FROM_GOOSE_MC_SECURITY:
            setParentClientServicesFromGooseMcSecurity( ( ClientServices ) newValue );
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
        case SclPackage.GOOSE_MC_SECURITY__PARENT_CLIENT_SERVICES_FROM_GOOSE_MC_SECURITY:
            setParentClientServicesFromGooseMcSecurity( ( ClientServices ) null );
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
        case SclPackage.GOOSE_MC_SECURITY__PARENT_CLIENT_SERVICES_FROM_GOOSE_MC_SECURITY:
            return getParentClientServicesFromGooseMcSecurity() != null;
        }
        return super.eIsSet( featureID );
    }

} //GOOSEMcSecurityImpl
