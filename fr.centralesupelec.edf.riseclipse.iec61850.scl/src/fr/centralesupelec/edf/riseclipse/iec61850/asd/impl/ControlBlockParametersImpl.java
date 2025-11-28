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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlBlockParameters;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Block Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlBlockParametersImpl#getCbName <em>Cb Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlBlockParametersImpl#getDsName <em>Ds Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ControlBlockParametersImpl extends ServiceParametersImpl implements ControlBlockParameters {
    /**
     * The default value of the '{@link #getCbName() <em>Cb Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCbName()
     * @generated
     * @ordered
     */
    protected static final String CB_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCbName() <em>Cb Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCbName()
     * @generated
     * @ordered
     */
    protected String cbName = CB_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getDsName() <em>Ds Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDsName()
     * @generated
     * @ordered
     */
    protected static final String DS_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDsName() <em>Ds Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDsName()
     * @generated
     * @ordered
     */
    protected String dsName = DS_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ControlBlockParametersImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getControlBlockParameters();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCbName() {
        return cbName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCbName( String newCbName ) {
        String oldCbName = cbName;
        cbName = newCbName;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CONTROL_BLOCK_PARAMETERS__CB_NAME,
                    oldCbName, cbName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDsName() {
        return dsName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDsName( String newDsName ) {
        String oldDsName = dsName;
        dsName = newDsName;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CONTROL_BLOCK_PARAMETERS__DS_NAME,
                    oldDsName, dsName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case AsdPackage.CONTROL_BLOCK_PARAMETERS__CB_NAME:
            return getCbName();
        case AsdPackage.CONTROL_BLOCK_PARAMETERS__DS_NAME:
            return getDsName();
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
        case AsdPackage.CONTROL_BLOCK_PARAMETERS__CB_NAME:
            setCbName( ( String ) newValue );
            return;
        case AsdPackage.CONTROL_BLOCK_PARAMETERS__DS_NAME:
            setDsName( ( String ) newValue );
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
        case AsdPackage.CONTROL_BLOCK_PARAMETERS__CB_NAME:
            setCbName( CB_NAME_EDEFAULT );
            return;
        case AsdPackage.CONTROL_BLOCK_PARAMETERS__DS_NAME:
            setDsName( DS_NAME_EDEFAULT );
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
        case AsdPackage.CONTROL_BLOCK_PARAMETERS__CB_NAME:
            return CB_NAME_EDEFAULT == null ? cbName != null : !CB_NAME_EDEFAULT.equals( cbName );
        case AsdPackage.CONTROL_BLOCK_PARAMETERS__DS_NAME:
            return DS_NAME_EDEFAULT == null ? dsName != null : !DS_NAME_EDEFAULT.equals( dsName );
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
        result.append( " (cbName: " );
        result.append( cbName );
        result.append( ", dsName: " );
        result.append( dsName );
        result.append( ')' );
        return result.toString();
    }

} //ControlBlockParametersImpl
