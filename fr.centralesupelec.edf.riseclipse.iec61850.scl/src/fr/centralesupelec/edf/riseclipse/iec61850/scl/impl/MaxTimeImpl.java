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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.MaxTime;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.MaxTimeImpl#getParentGSE <em>Parent GSE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaxTimeImpl extends DurationInMilliSecImpl implements MaxTime {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MaxTimeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getMaxTime();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GSE getParentGSE() {
        if( eContainerFeatureID() != SclPackage.MAX_TIME__PARENT_GSE ) {
            return null;
        }
        return ( GSE ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentGSE( GSE newParentGSE, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentGSE, SclPackage.MAX_TIME__PARENT_GSE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentGSE( GSE newParentGSE ) {
        if( newParentGSE != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.MAX_TIME__PARENT_GSE && newParentGSE != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentGSE ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentGSE != null ) {
                msgs = ( ( InternalEObject ) newParentGSE ).eInverseAdd( this, SclPackage.GSE__MAX_TIME, GSE.class,
                        msgs );
            }
            msgs = basicSetParentGSE( newParentGSE, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.MAX_TIME__PARENT_GSE, newParentGSE,
                    newParentGSE ) );
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
        case SclPackage.MAX_TIME__PARENT_GSE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentGSE( ( GSE ) otherEnd, msgs );
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
        case SclPackage.MAX_TIME__PARENT_GSE:
            return basicSetParentGSE( null, msgs );
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
        case SclPackage.MAX_TIME__PARENT_GSE:
            return eInternalContainer().eInverseRemove( this, SclPackage.GSE__MAX_TIME, GSE.class, msgs );
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
        case SclPackage.MAX_TIME__PARENT_GSE:
            return getParentGSE();
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
        case SclPackage.MAX_TIME__PARENT_GSE:
            setParentGSE( ( GSE ) newValue );
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
        case SclPackage.MAX_TIME__PARENT_GSE:
            setParentGSE( ( GSE ) null );
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
        case SclPackage.MAX_TIME__PARENT_GSE:
            return getParentGSE() != null;
        }
        return super.eIsSet( featureID );
    }

    @Override
    public String getXpath() {
        if( eContainer() instanceof SclObject ) {
            return ( ( SclObject ) eContainer() ).getXpath() + "/scl:MaxTime";
        }
        return "/scl:MaxTime";
    }

} //MaxTimeImpl
