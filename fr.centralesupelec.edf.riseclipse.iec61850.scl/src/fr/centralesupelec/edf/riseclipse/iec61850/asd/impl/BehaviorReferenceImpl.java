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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorReferenceImpl#getBehaviorReference <em>Behavior Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorReferenceImpl#getBehaviorUuid <em>Behavior Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorReferenceImpl#getParentBehaviorDescription <em>Parent Behavior Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorReferenceImpl extends BaseExtensionElementWithDescImpl implements BehaviorReference {
    /**
     * The default value of the '{@link #getBehaviorReference() <em>Behavior Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehaviorReference()
     * @generated
     * @ordered
     */
    protected static final String BEHAVIOR_REFERENCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBehaviorReference() <em>Behavior Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehaviorReference()
     * @generated
     * @ordered
     */
    protected String behaviorReference = BEHAVIOR_REFERENCE_EDEFAULT;

    /**
     * The default value of the '{@link #getBehaviorUuid() <em>Behavior Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehaviorUuid()
     * @generated
     * @ordered
     */
    protected static final String BEHAVIOR_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBehaviorUuid() <em>Behavior Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehaviorUuid()
     * @generated
     * @ordered
     */
    protected String behaviorUuid = BEHAVIOR_UUID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BehaviorReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getBehaviorReference();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBehaviorReference() {
        return behaviorReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBehaviorReference( String newBehaviorReference ) {
        String oldBehaviorReference = behaviorReference;
        behaviorReference = newBehaviorReference;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BEHAVIOR_REFERENCE__BEHAVIOR_REFERENCE,
                    oldBehaviorReference, behaviorReference ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBehaviorUuid() {
        return behaviorUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBehaviorUuid( String newBehaviorUuid ) {
        String oldBehaviorUuid = behaviorUuid;
        behaviorUuid = newBehaviorUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BEHAVIOR_REFERENCE__BEHAVIOR_UUID,
                    oldBehaviorUuid, behaviorUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BehaviorDescription getParentBehaviorDescription() {
        if( eContainerFeatureID() != AsdPackage.BEHAVIOR_REFERENCE__PARENT_BEHAVIOR_DESCRIPTION ) {
            return null;
        }
        return ( BehaviorDescription ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentBehaviorDescription( BehaviorDescription newParentBehaviorDescription,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentBehaviorDescription,
                AsdPackage.BEHAVIOR_REFERENCE__PARENT_BEHAVIOR_DESCRIPTION, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentBehaviorDescription( BehaviorDescription newParentBehaviorDescription ) {
        if( newParentBehaviorDescription != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.BEHAVIOR_REFERENCE__PARENT_BEHAVIOR_DESCRIPTION
                        && newParentBehaviorDescription != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentBehaviorDescription ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentBehaviorDescription != null ) {
                msgs = ( ( InternalEObject ) newParentBehaviorDescription ).eInverseAdd( this,
                        AsdPackage.BEHAVIOR_DESCRIPTION__BEHAVIOR_REFERENCE, BehaviorDescription.class, msgs );
            }
            msgs = basicSetParentBehaviorDescription( newParentBehaviorDescription, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.BEHAVIOR_REFERENCE__PARENT_BEHAVIOR_DESCRIPTION, newParentBehaviorDescription,
                    newParentBehaviorDescription ) );
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
        case AsdPackage.BEHAVIOR_REFERENCE__PARENT_BEHAVIOR_DESCRIPTION:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentBehaviorDescription( ( BehaviorDescription ) otherEnd, msgs );
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
        case AsdPackage.BEHAVIOR_REFERENCE__PARENT_BEHAVIOR_DESCRIPTION:
            return basicSetParentBehaviorDescription( null, msgs );
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
        case AsdPackage.BEHAVIOR_REFERENCE__PARENT_BEHAVIOR_DESCRIPTION:
            return eInternalContainer().eInverseRemove( this, AsdPackage.BEHAVIOR_DESCRIPTION__BEHAVIOR_REFERENCE,
                    BehaviorDescription.class, msgs );
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
        case AsdPackage.BEHAVIOR_REFERENCE__BEHAVIOR_REFERENCE:
            return getBehaviorReference();
        case AsdPackage.BEHAVIOR_REFERENCE__BEHAVIOR_UUID:
            return getBehaviorUuid();
        case AsdPackage.BEHAVIOR_REFERENCE__PARENT_BEHAVIOR_DESCRIPTION:
            return getParentBehaviorDescription();
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
        case AsdPackage.BEHAVIOR_REFERENCE__BEHAVIOR_REFERENCE:
            setBehaviorReference( ( String ) newValue );
            return;
        case AsdPackage.BEHAVIOR_REFERENCE__BEHAVIOR_UUID:
            setBehaviorUuid( ( String ) newValue );
            return;
        case AsdPackage.BEHAVIOR_REFERENCE__PARENT_BEHAVIOR_DESCRIPTION:
            setParentBehaviorDescription( ( BehaviorDescription ) newValue );
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
        case AsdPackage.BEHAVIOR_REFERENCE__BEHAVIOR_REFERENCE:
            setBehaviorReference( BEHAVIOR_REFERENCE_EDEFAULT );
            return;
        case AsdPackage.BEHAVIOR_REFERENCE__BEHAVIOR_UUID:
            setBehaviorUuid( BEHAVIOR_UUID_EDEFAULT );
            return;
        case AsdPackage.BEHAVIOR_REFERENCE__PARENT_BEHAVIOR_DESCRIPTION:
            setParentBehaviorDescription( ( BehaviorDescription ) null );
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
        case AsdPackage.BEHAVIOR_REFERENCE__BEHAVIOR_REFERENCE:
            return BEHAVIOR_REFERENCE_EDEFAULT == null ? behaviorReference != null
                    : !BEHAVIOR_REFERENCE_EDEFAULT.equals( behaviorReference );
        case AsdPackage.BEHAVIOR_REFERENCE__BEHAVIOR_UUID:
            return BEHAVIOR_UUID_EDEFAULT == null ? behaviorUuid != null
                    : !BEHAVIOR_UUID_EDEFAULT.equals( behaviorUuid );
        case AsdPackage.BEHAVIOR_REFERENCE__PARENT_BEHAVIOR_DESCRIPTION:
            return getParentBehaviorDescription() != null;
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
        result.append( " (behaviorReference: " );
        result.append( behaviorReference );
        result.append( ", behaviorUuid: " );
        result.append( behaviorUuid );
        result.append( ')' );
        return result.toString();
    }

} //BehaviorReferenceImpl
