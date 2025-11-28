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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVarRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Var Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.OutputVarRefImpl#getParentBehaviorDescriptionRef <em>Parent Behavior Description Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputVarRefImpl extends VariableRefImpl implements OutputVarRef {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OutputVarRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getOutputVarRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BehaviorDescriptionRef getParentBehaviorDescriptionRef() {
        if( eContainerFeatureID() != AsdPackage.OUTPUT_VAR_REF__PARENT_BEHAVIOR_DESCRIPTION_REF ) {
            return null;
        }
        return ( BehaviorDescriptionRef ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentBehaviorDescriptionRef(
            BehaviorDescriptionRef newParentBehaviorDescriptionRef, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentBehaviorDescriptionRef,
                AsdPackage.OUTPUT_VAR_REF__PARENT_BEHAVIOR_DESCRIPTION_REF, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentBehaviorDescriptionRef( BehaviorDescriptionRef newParentBehaviorDescriptionRef ) {
        if( newParentBehaviorDescriptionRef != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.OUTPUT_VAR_REF__PARENT_BEHAVIOR_DESCRIPTION_REF
                        && newParentBehaviorDescriptionRef != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentBehaviorDescriptionRef ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentBehaviorDescriptionRef != null ) {
                msgs = ( ( InternalEObject ) newParentBehaviorDescriptionRef ).eInverseAdd( this,
                        AsdPackage.BEHAVIOR_DESCRIPTION_REF__OUTPUT_VAR_REF, BehaviorDescriptionRef.class, msgs );
            }
            msgs = basicSetParentBehaviorDescriptionRef( newParentBehaviorDescriptionRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.OUTPUT_VAR_REF__PARENT_BEHAVIOR_DESCRIPTION_REF, newParentBehaviorDescriptionRef,
                    newParentBehaviorDescriptionRef ) );
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
        case AsdPackage.OUTPUT_VAR_REF__PARENT_BEHAVIOR_DESCRIPTION_REF:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentBehaviorDescriptionRef( ( BehaviorDescriptionRef ) otherEnd, msgs );
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
        case AsdPackage.OUTPUT_VAR_REF__PARENT_BEHAVIOR_DESCRIPTION_REF:
            return basicSetParentBehaviorDescriptionRef( null, msgs );
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
        case AsdPackage.OUTPUT_VAR_REF__PARENT_BEHAVIOR_DESCRIPTION_REF:
            return eInternalContainer().eInverseRemove( this, AsdPackage.BEHAVIOR_DESCRIPTION_REF__OUTPUT_VAR_REF,
                    BehaviorDescriptionRef.class, msgs );
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
        case AsdPackage.OUTPUT_VAR_REF__PARENT_BEHAVIOR_DESCRIPTION_REF:
            return getParentBehaviorDescriptionRef();
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
        case AsdPackage.OUTPUT_VAR_REF__PARENT_BEHAVIOR_DESCRIPTION_REF:
            setParentBehaviorDescriptionRef( ( BehaviorDescriptionRef ) newValue );
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
        case AsdPackage.OUTPUT_VAR_REF__PARENT_BEHAVIOR_DESCRIPTION_REF:
            setParentBehaviorDescriptionRef( ( BehaviorDescriptionRef ) null );
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
        case AsdPackage.OUTPUT_VAR_REF__PARENT_BEHAVIOR_DESCRIPTION_REF:
            return getParentBehaviorDescriptionRef() != null;
        }
        return super.eIsSet( featureID );
    }

} //OutputVarRefImpl
