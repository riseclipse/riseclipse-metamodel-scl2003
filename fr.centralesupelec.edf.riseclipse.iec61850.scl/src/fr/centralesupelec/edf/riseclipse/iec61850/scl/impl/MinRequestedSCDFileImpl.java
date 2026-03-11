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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.MinRequestedSCDFile;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.MinRequestedSCDFiles;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Min Requested SCD File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.MinRequestedSCDFileImpl#getParentMinRequestedSCDFiles <em>Parent Min Requested SCD Files</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinRequestedSCDFileImpl extends SclFileReferenceImpl implements MinRequestedSCDFile {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MinRequestedSCDFileImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getMinRequestedSCDFile();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MinRequestedSCDFiles getParentMinRequestedSCDFiles() {
        if( eContainerFeatureID() != SclPackage.MIN_REQUESTED_SCD_FILE__PARENT_MIN_REQUESTED_SCD_FILES ) {
            return null;
        }
        return ( MinRequestedSCDFiles ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentMinRequestedSCDFiles( MinRequestedSCDFiles newParentMinRequestedSCDFiles,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentMinRequestedSCDFiles,
                SclPackage.MIN_REQUESTED_SCD_FILE__PARENT_MIN_REQUESTED_SCD_FILES, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentMinRequestedSCDFiles( MinRequestedSCDFiles newParentMinRequestedSCDFiles ) {
        if( newParentMinRequestedSCDFiles != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.MIN_REQUESTED_SCD_FILE__PARENT_MIN_REQUESTED_SCD_FILES
                        && newParentMinRequestedSCDFiles != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentMinRequestedSCDFiles ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentMinRequestedSCDFiles != null ) {
                msgs = ( ( InternalEObject ) newParentMinRequestedSCDFiles ).eInverseAdd( this,
                        SclPackage.MIN_REQUESTED_SCD_FILES__MIN_REQUESTED_SCD_FILE, MinRequestedSCDFiles.class, msgs );
            }
            msgs = basicSetParentMinRequestedSCDFiles( newParentMinRequestedSCDFiles, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    SclPackage.MIN_REQUESTED_SCD_FILE__PARENT_MIN_REQUESTED_SCD_FILES, newParentMinRequestedSCDFiles,
                    newParentMinRequestedSCDFiles ) );
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
        case SclPackage.MIN_REQUESTED_SCD_FILE__PARENT_MIN_REQUESTED_SCD_FILES:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentMinRequestedSCDFiles( ( MinRequestedSCDFiles ) otherEnd, msgs );
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
        case SclPackage.MIN_REQUESTED_SCD_FILE__PARENT_MIN_REQUESTED_SCD_FILES:
            return basicSetParentMinRequestedSCDFiles( null, msgs );
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
        case SclPackage.MIN_REQUESTED_SCD_FILE__PARENT_MIN_REQUESTED_SCD_FILES:
            return eInternalContainer().eInverseRemove( this,
                    SclPackage.MIN_REQUESTED_SCD_FILES__MIN_REQUESTED_SCD_FILE, MinRequestedSCDFiles.class, msgs );
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
        case SclPackage.MIN_REQUESTED_SCD_FILE__PARENT_MIN_REQUESTED_SCD_FILES:
            return getParentMinRequestedSCDFiles();
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
        case SclPackage.MIN_REQUESTED_SCD_FILE__PARENT_MIN_REQUESTED_SCD_FILES:
            setParentMinRequestedSCDFiles( ( MinRequestedSCDFiles ) newValue );
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
        case SclPackage.MIN_REQUESTED_SCD_FILE__PARENT_MIN_REQUESTED_SCD_FILES:
            setParentMinRequestedSCDFiles( ( MinRequestedSCDFiles ) null );
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
        case SclPackage.MIN_REQUESTED_SCD_FILE__PARENT_MIN_REQUESTED_SCD_FILES:
            return getParentMinRequestedSCDFiles() != null;
        }
        return super.eIsSet( featureID );
    }

} //MinRequestedSCDFileImpl
