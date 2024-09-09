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

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.DurationInMilliSec;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.UnitMultiplierEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration In Milli Sec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DurationInMilliSecImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DurationInMilliSecImpl#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DurationInMilliSecImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DurationInMilliSecImpl extends SclObjectImpl implements DurationInMilliSec {
    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final BigDecimal VALUE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected BigDecimal value = VALUE_EDEFAULT;
    /**
     * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplier()
     * @generated NOT because there is no default value in SCL
     * @ordered
     */
    protected static final UnitMultiplierEnum MULTIPLIER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplier()
     * @generated
     * @ordered
     */
    protected UnitMultiplierEnum multiplier = MULTIPLIER_EDEFAULT;
    /**
     * This is true if the Multiplier attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean multiplierESet;
    /**
     * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnit()
     * @generated
     * @ordered
     */
    protected static final String UNIT_EDEFAULT = "";
    /**
     * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnit()
     * @generated
     * @ordered
     */
    protected String unit = UNIT_EDEFAULT;
    /**
     * This is true if the Unit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean unitESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DurationInMilliSecImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getDurationInMilliSec();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue( BigDecimal newValue ) {
        BigDecimal oldValue = value;
        value = newValue;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DURATION_IN_MILLI_SEC__VALUE, oldValue,
                    value ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnitMultiplierEnum getMultiplier() {
        return multiplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMultiplier( UnitMultiplierEnum newMultiplier ) {
        UnitMultiplierEnum oldMultiplier = multiplier;
        multiplier = newMultiplier == null ? MULTIPLIER_EDEFAULT : newMultiplier;
        boolean oldMultiplierESet = multiplierESet;
        multiplierESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DURATION_IN_MILLI_SEC__MULTIPLIER,
                    oldMultiplier, multiplier, !oldMultiplierESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMultiplier() {
        UnitMultiplierEnum oldMultiplier = multiplier;
        boolean oldMultiplierESet = multiplierESet;
        multiplier = MULTIPLIER_EDEFAULT;
        multiplierESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DURATION_IN_MILLI_SEC__MULTIPLIER,
                    oldMultiplier, MULTIPLIER_EDEFAULT, oldMultiplierESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMultiplier() {
        return multiplierESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUnit() {
        return unit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnit( String newUnit ) {
        String oldUnit = unit;
        unit = newUnit;
        boolean oldUnitESet = unitESet;
        unitESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DURATION_IN_MILLI_SEC__UNIT, oldUnit,
                    unit, !oldUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUnit() {
        String oldUnit = unit;
        boolean oldUnitESet = unitESet;
        unit = UNIT_EDEFAULT;
        unitESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DURATION_IN_MILLI_SEC__UNIT, oldUnit,
                    UNIT_EDEFAULT, oldUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnit() {
        return unitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case SclPackage.DURATION_IN_MILLI_SEC__VALUE:
            return getValue();
        case SclPackage.DURATION_IN_MILLI_SEC__MULTIPLIER:
            return getMultiplier();
        case SclPackage.DURATION_IN_MILLI_SEC__UNIT:
            return getUnit();
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
        case SclPackage.DURATION_IN_MILLI_SEC__VALUE:
            setValue( ( BigDecimal ) newValue );
            return;
        case SclPackage.DURATION_IN_MILLI_SEC__MULTIPLIER:
            setMultiplier( ( UnitMultiplierEnum ) newValue );
            return;
        case SclPackage.DURATION_IN_MILLI_SEC__UNIT:
            setUnit( ( String ) newValue );
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
        case SclPackage.DURATION_IN_MILLI_SEC__VALUE:
            setValue( VALUE_EDEFAULT );
            return;
        case SclPackage.DURATION_IN_MILLI_SEC__MULTIPLIER:
            unsetMultiplier();
            return;
        case SclPackage.DURATION_IN_MILLI_SEC__UNIT:
            unsetUnit();
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
        case SclPackage.DURATION_IN_MILLI_SEC__VALUE:
            return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals( value );
        case SclPackage.DURATION_IN_MILLI_SEC__MULTIPLIER:
            return isSetMultiplier();
        case SclPackage.DURATION_IN_MILLI_SEC__UNIT:
            return isSetUnit();
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
        result.append( " (value: " );
        result.append( value );
        result.append( ", multiplier: " );
        if( multiplierESet ) {
            result.append( multiplier );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", unit: " );
        if( unitESet ) {
            result.append( unit );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //DurationInMilliSecImpl
