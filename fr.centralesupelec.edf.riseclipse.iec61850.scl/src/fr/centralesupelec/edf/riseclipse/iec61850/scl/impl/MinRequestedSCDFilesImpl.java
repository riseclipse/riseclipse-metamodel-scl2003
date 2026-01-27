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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.MinRequestedSCDFile;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.MinRequestedSCDFiles;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Min Requested SCD Files</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.MinRequestedSCDFilesImpl#getMinRequestedSCDFile <em>Min Requested SCD File</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.MinRequestedSCDFilesImpl#getParentIED <em>Parent IED</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinRequestedSCDFilesImpl extends BaseElementImpl implements MinRequestedSCDFiles {
    /**
     * The cached value of the '{@link #getMinRequestedSCDFile() <em>Min Requested SCD File</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinRequestedSCDFile()
     * @generated
     * @ordered
     */
    protected EList< MinRequestedSCDFile > minRequestedSCDFile;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MinRequestedSCDFilesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getMinRequestedSCDFiles();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< MinRequestedSCDFile > getMinRequestedSCDFile() {
        if( minRequestedSCDFile == null ) {
            minRequestedSCDFile = new EObjectContainmentWithInverseEList.Unsettable< >(
                    MinRequestedSCDFile.class, this, SclPackage.MIN_REQUESTED_SCD_FILES__MIN_REQUESTED_SCD_FILE,
                    SclPackage.MIN_REQUESTED_SCD_FILE__PARENT_MIN_REQUESTED_SCD_FILES );
        }
        return minRequestedSCDFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinRequestedSCDFile() {
        if( minRequestedSCDFile != null ) {
            ( ( InternalEList.Unsettable< ? > ) minRequestedSCDFile ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinRequestedSCDFile() {
        return minRequestedSCDFile != null && ( ( InternalEList.Unsettable< ? > ) minRequestedSCDFile ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IED getParentIED() {
        if( eContainerFeatureID() != SclPackage.MIN_REQUESTED_SCD_FILES__PARENT_IED ) {
            return null;
        }
        return ( IED ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentIED( IED newParentIED, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentIED, SclPackage.MIN_REQUESTED_SCD_FILES__PARENT_IED,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentIED( IED newParentIED ) {
        if( newParentIED != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.MIN_REQUESTED_SCD_FILES__PARENT_IED
                        && newParentIED != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentIED ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentIED != null ) {
                msgs = ( ( InternalEObject ) newParentIED ).eInverseAdd( this, SclPackage.IED__MIN_REQUESTED_SCD_FILES,
                        IED.class, msgs );
            }
            msgs = basicSetParentIED( newParentIED, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.MIN_REQUESTED_SCD_FILES__PARENT_IED,
                    newParentIED, newParentIED ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.MIN_REQUESTED_SCD_FILES__MIN_REQUESTED_SCD_FILE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMinRequestedSCDFile() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.MIN_REQUESTED_SCD_FILES__PARENT_IED:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentIED( ( IED ) otherEnd, msgs );
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
        case SclPackage.MIN_REQUESTED_SCD_FILES__MIN_REQUESTED_SCD_FILE:
            return ( ( InternalEList< ? > ) getMinRequestedSCDFile() ).basicRemove( otherEnd, msgs );
        case SclPackage.MIN_REQUESTED_SCD_FILES__PARENT_IED:
            return basicSetParentIED( null, msgs );
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
        case SclPackage.MIN_REQUESTED_SCD_FILES__PARENT_IED:
            return eInternalContainer().eInverseRemove( this, SclPackage.IED__MIN_REQUESTED_SCD_FILES, IED.class,
                    msgs );
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
        case SclPackage.MIN_REQUESTED_SCD_FILES__MIN_REQUESTED_SCD_FILE:
            return getMinRequestedSCDFile();
        case SclPackage.MIN_REQUESTED_SCD_FILES__PARENT_IED:
            return getParentIED();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case SclPackage.MIN_REQUESTED_SCD_FILES__MIN_REQUESTED_SCD_FILE:
            getMinRequestedSCDFile().clear();
            getMinRequestedSCDFile().addAll( ( Collection< ? extends MinRequestedSCDFile > ) newValue );
            return;
        case SclPackage.MIN_REQUESTED_SCD_FILES__PARENT_IED:
            setParentIED( ( IED ) newValue );
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
        case SclPackage.MIN_REQUESTED_SCD_FILES__MIN_REQUESTED_SCD_FILE:
            unsetMinRequestedSCDFile();
            return;
        case SclPackage.MIN_REQUESTED_SCD_FILES__PARENT_IED:
            setParentIED( ( IED ) null );
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
        case SclPackage.MIN_REQUESTED_SCD_FILES__MIN_REQUESTED_SCD_FILE:
            return isSetMinRequestedSCDFile();
        case SclPackage.MIN_REQUESTED_SCD_FILES__PARENT_IED:
            return getParentIED() != null;
        }
        return super.eIsSet( featureID );
    }

} //MinRequestedSCDFilesImpl
