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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.WiringParameters;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wiring Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.WiringParametersImpl#getInpNam <em>Inp Nam</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.WiringParametersImpl#getInpRef <em>Inp Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WiringParametersImpl extends ServiceParametersImpl implements WiringParameters {
    /**
     * The default value of the '{@link #getInpNam() <em>Inp Nam</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInpNam()
     * @generated
     * @ordered
     */
    protected static final String INP_NAM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInpNam() <em>Inp Nam</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInpNam()
     * @generated
     * @ordered
     */
    protected String inpNam = INP_NAM_EDEFAULT;

    /**
     * The default value of the '{@link #getInpRef() <em>Inp Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInpRef()
     * @generated
     * @ordered
     */
    protected static final String INP_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInpRef() <em>Inp Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInpRef()
     * @generated
     * @ordered
     */
    protected String inpRef = INP_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WiringParametersImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getWiringParameters();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getInpNam() {
        return inpNam;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInpNam( String newInpNam ) {
        String oldInpNam = inpNam;
        inpNam = newInpNam;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.WIRING_PARAMETERS__INP_NAM, oldInpNam,
                    inpNam ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getInpRef() {
        return inpRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInpRef( String newInpRef ) {
        String oldInpRef = inpRef;
        inpRef = newInpRef;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.WIRING_PARAMETERS__INP_REF, oldInpRef,
                    inpRef ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case AsdPackage.WIRING_PARAMETERS__INP_NAM:
            return getInpNam();
        case AsdPackage.WIRING_PARAMETERS__INP_REF:
            return getInpRef();
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
        case AsdPackage.WIRING_PARAMETERS__INP_NAM:
            setInpNam( ( String ) newValue );
            return;
        case AsdPackage.WIRING_PARAMETERS__INP_REF:
            setInpRef( ( String ) newValue );
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
        case AsdPackage.WIRING_PARAMETERS__INP_NAM:
            setInpNam( INP_NAM_EDEFAULT );
            return;
        case AsdPackage.WIRING_PARAMETERS__INP_REF:
            setInpRef( INP_REF_EDEFAULT );
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
        case AsdPackage.WIRING_PARAMETERS__INP_NAM:
            return INP_NAM_EDEFAULT == null ? inpNam != null : !INP_NAM_EDEFAULT.equals( inpNam );
        case AsdPackage.WIRING_PARAMETERS__INP_REF:
            return INP_REF_EDEFAULT == null ? inpRef != null : !INP_REF_EDEFAULT.equals( inpRef );
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
        result.append( " (inpNam: " );
        result.append( inpNam );
        result.append( ", inpRef: " );
        result.append( inpRef );
        result.append( ')' );
        return result.toString();
    }

} //WiringParametersImpl
