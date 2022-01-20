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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CertImpl#getCommonName <em>Common Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CertImpl#getIdHierarchy <em>Id Hierarchy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CertImpl extends SclObjectImpl implements Cert {
    /**
     * The default value of the '{@link #getCommonName() <em>Common Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommonName()
     * @generated
     * @ordered
     */
    protected static final String COMMON_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCommonName() <em>Common Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommonName()
     * @generated
     * @ordered
     */
    protected String commonName = COMMON_NAME_EDEFAULT;

    /**
     * This is true if the Common Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean commonNameESet;

    /**
     * The default value of the '{@link #getIdHierarchy() <em>Id Hierarchy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdHierarchy()
     * @generated
     * @ordered
     */
    protected static final String ID_HIERARCHY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIdHierarchy() <em>Id Hierarchy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdHierarchy()
     * @generated
     * @ordered
     */
    protected String idHierarchy = ID_HIERARCHY_EDEFAULT;

    /**
     * This is true if the Id Hierarchy attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean idHierarchyESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CertImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getCert();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCommonName() {
        return commonName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCommonName( String newCommonName ) {
        String oldCommonName = commonName;
        commonName = newCommonName;
        boolean oldCommonNameESet = commonNameESet;
        commonNameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CERT__COMMON_NAME, oldCommonName,
                    commonName, !oldCommonNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCommonName() {
        String oldCommonName = commonName;
        boolean oldCommonNameESet = commonNameESet;
        commonName = COMMON_NAME_EDEFAULT;
        commonNameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CERT__COMMON_NAME, oldCommonName,
                    COMMON_NAME_EDEFAULT, oldCommonNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCommonName() {
        return commonNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIdHierarchy() {
        return idHierarchy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIdHierarchy( String newIdHierarchy ) {
        String oldIdHierarchy = idHierarchy;
        idHierarchy = newIdHierarchy;
        boolean oldIdHierarchyESet = idHierarchyESet;
        idHierarchyESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CERT__ID_HIERARCHY, oldIdHierarchy,
                    idHierarchy, !oldIdHierarchyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIdHierarchy() {
        String oldIdHierarchy = idHierarchy;
        boolean oldIdHierarchyESet = idHierarchyESet;
        idHierarchy = ID_HIERARCHY_EDEFAULT;
        idHierarchyESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CERT__ID_HIERARCHY, oldIdHierarchy,
                    ID_HIERARCHY_EDEFAULT, oldIdHierarchyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIdHierarchy() {
        return idHierarchyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case SclPackage.CERT__COMMON_NAME:
            return getCommonName();
        case SclPackage.CERT__ID_HIERARCHY:
            return getIdHierarchy();
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
        case SclPackage.CERT__COMMON_NAME:
            setCommonName( ( String ) newValue );
            return;
        case SclPackage.CERT__ID_HIERARCHY:
            setIdHierarchy( ( String ) newValue );
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
        case SclPackage.CERT__COMMON_NAME:
            unsetCommonName();
            return;
        case SclPackage.CERT__ID_HIERARCHY:
            unsetIdHierarchy();
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
        case SclPackage.CERT__COMMON_NAME:
            return isSetCommonName();
        case SclPackage.CERT__ID_HIERARCHY:
            return isSetIdHierarchy();
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
        result.append( " (commonName: " );
        if( commonNameESet )
            result.append( commonName );
        else
            result.append( "<unset>" );
        result.append( ", idHierarchy: " );
        if( idHierarchyESet )
            result.append( idHierarchy );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CertImpl
