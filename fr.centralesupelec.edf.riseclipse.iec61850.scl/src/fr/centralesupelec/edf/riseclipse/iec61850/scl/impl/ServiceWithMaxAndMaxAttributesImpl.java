/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndMaxAttributes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service With Max And Max Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceWithMaxAndMaxAttributesImpl#getMaxAttributes <em>Max Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceWithMaxAndMaxAttributesImpl extends ServiceWithMaxImpl implements ServiceWithMaxAndMaxAttributes {
    /**
     * The default value of the '{@link #getMaxAttributes() <em>Max Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxAttributes()
     * @generated
     * @ordered
     */
    protected static final Integer MAX_ATTRIBUTES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxAttributes() <em>Max Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxAttributes()
     * @generated
     * @ordered
     */
    protected Integer maxAttributes = MAX_ATTRIBUTES_EDEFAULT;

    /**
     * This is true if the Max Attributes attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxAttributesESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceWithMaxAndMaxAttributesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getServiceWithMaxAndMaxAttributes();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getMaxAttributes() {
        return maxAttributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxAttributes( Integer newMaxAttributes ) {
        Integer oldMaxAttributes = maxAttributes;
        maxAttributes = newMaxAttributes;
        boolean oldMaxAttributesESet = maxAttributesESet;
        maxAttributesESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    SclPackage.SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES, oldMaxAttributes, maxAttributes,
                    !oldMaxAttributesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxAttributes() {
        Integer oldMaxAttributes = maxAttributes;
        boolean oldMaxAttributesESet = maxAttributesESet;
        maxAttributes = MAX_ATTRIBUTES_EDEFAULT;
        maxAttributesESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES, oldMaxAttributes,
                    MAX_ATTRIBUTES_EDEFAULT, oldMaxAttributesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxAttributes() {
        return maxAttributesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case SclPackage.SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES:
            return getMaxAttributes();
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
        case SclPackage.SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES:
            setMaxAttributes( ( Integer ) newValue );
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
        case SclPackage.SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES:
            unsetMaxAttributes();
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
        case SclPackage.SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES:
            return isSetMaxAttributes();
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
        result.append( " (maxAttributes: " );
        if( maxAttributesESet )
            result.append( maxAttributes );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ServiceWithMaxAndMaxAttributesImpl
