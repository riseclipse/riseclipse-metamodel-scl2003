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
package fr.centralesupelec.edf.riseclipse.iec61850.asd.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.CommParameters;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comm Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.CommParametersImpl#getAppId <em>App Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.CommParametersImpl#getVlanId <em>Vlan Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.CommParametersImpl#getVlanPriority <em>Vlan Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommParametersImpl extends BaseExtensionElementWithDescImpl implements CommParameters {
    /**
     * The default value of the '{@link #getAppId() <em>App Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAppId()
     * @generated
     * @ordered
     */
    protected static final String APP_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAppId() <em>App Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAppId()
     * @generated
     * @ordered
     */
    protected String appId = APP_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getVlanId() <em>Vlan Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVlanId()
     * @generated
     * @ordered
     */
    protected static final String VLAN_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVlanId() <em>Vlan Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVlanId()
     * @generated
     * @ordered
     */
    protected String vlanId = VLAN_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getVlanPriority() <em>Vlan Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVlanPriority()
     * @generated
     * @ordered
     */
    protected static final String VLAN_PRIORITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVlanPriority() <em>Vlan Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVlanPriority()
     * @generated
     * @ordered
     */
    protected String vlanPriority = VLAN_PRIORITY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CommParametersImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getCommParameters();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAppId() {
        return appId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAppId( String newAppId ) {
        String oldAppId = appId;
        appId = newAppId;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.COMM_PARAMETERS__APP_ID, oldAppId,
                    appId ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVlanId() {
        return vlanId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVlanId( String newVlanId ) {
        String oldVlanId = vlanId;
        vlanId = newVlanId;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.COMM_PARAMETERS__VLAN_ID, oldVlanId,
                    vlanId ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVlanPriority() {
        return vlanPriority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVlanPriority( String newVlanPriority ) {
        String oldVlanPriority = vlanPriority;
        vlanPriority = newVlanPriority;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.COMM_PARAMETERS__VLAN_PRIORITY,
                    oldVlanPriority, vlanPriority ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case AsdPackage.COMM_PARAMETERS__APP_ID:
            return getAppId();
        case AsdPackage.COMM_PARAMETERS__VLAN_ID:
            return getVlanId();
        case AsdPackage.COMM_PARAMETERS__VLAN_PRIORITY:
            return getVlanPriority();
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
        case AsdPackage.COMM_PARAMETERS__APP_ID:
            setAppId( ( String ) newValue );
            return;
        case AsdPackage.COMM_PARAMETERS__VLAN_ID:
            setVlanId( ( String ) newValue );
            return;
        case AsdPackage.COMM_PARAMETERS__VLAN_PRIORITY:
            setVlanPriority( ( String ) newValue );
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
        case AsdPackage.COMM_PARAMETERS__APP_ID:
            setAppId( APP_ID_EDEFAULT );
            return;
        case AsdPackage.COMM_PARAMETERS__VLAN_ID:
            setVlanId( VLAN_ID_EDEFAULT );
            return;
        case AsdPackage.COMM_PARAMETERS__VLAN_PRIORITY:
            setVlanPriority( VLAN_PRIORITY_EDEFAULT );
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
        case AsdPackage.COMM_PARAMETERS__APP_ID:
            return APP_ID_EDEFAULT == null ? appId != null : !APP_ID_EDEFAULT.equals( appId );
        case AsdPackage.COMM_PARAMETERS__VLAN_ID:
            return VLAN_ID_EDEFAULT == null ? vlanId != null : !VLAN_ID_EDEFAULT.equals( vlanId );
        case AsdPackage.COMM_PARAMETERS__VLAN_PRIORITY:
            return VLAN_PRIORITY_EDEFAULT == null ? vlanPriority != null
                    : !VLAN_PRIORITY_EDEFAULT.equals( vlanPriority );
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
        result.append( " (appId: " );
        result.append( appId );
        result.append( ", vlanId: " );
        result.append( vlanId );
        result.append( ", vlanPriority: " );
        result.append( vlanPriority );
        result.append( ')' );
        return result.toString();
    }

} //CommParametersImpl
