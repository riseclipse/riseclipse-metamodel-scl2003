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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgVirtual;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ag Virtual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgVirtualImpl#getVirtual <em>Virtual</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AgVirtualImpl extends MinimalEObjectImpl.Container implements AgVirtual {
    /**
     * The default value of the '{@link #getVirtual() <em>Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVirtual()
     * @generated
     * @ordered
     */
    protected static final Boolean VIRTUAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVirtual() <em>Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVirtual()
     * @generated
     * @ordered
     */
    protected Boolean virtual = VIRTUAL_EDEFAULT;

    /**
     * This is true if the Virtual attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean virtualESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AgVirtualImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getAgVirtual();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getVirtual() {
        return virtual;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVirtual( Boolean newVirtual ) {
        Boolean oldVirtual = virtual;
        virtual = newVirtual;
        boolean oldVirtualESet = virtualESet;
        virtualESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.AG_VIRTUAL__VIRTUAL, oldVirtual, virtual,
                    !oldVirtualESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVirtual() {
        Boolean oldVirtual = virtual;
        boolean oldVirtualESet = virtualESet;
        virtual = VIRTUAL_EDEFAULT;
        virtualESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.AG_VIRTUAL__VIRTUAL, oldVirtual,
                    VIRTUAL_EDEFAULT, oldVirtualESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVirtual() {
        return virtualESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case SclPackage.AG_VIRTUAL__VIRTUAL:
            return getVirtual();
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
        case SclPackage.AG_VIRTUAL__VIRTUAL:
            setVirtual( ( Boolean ) newValue );
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
        case SclPackage.AG_VIRTUAL__VIRTUAL:
            unsetVirtual();
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
        case SclPackage.AG_VIRTUAL__VIRTUAL:
            return isSetVirtual();
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
        result.append( " (virtual: " );
        if( virtualESet )
            result.append( virtual );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AgVirtualImpl
