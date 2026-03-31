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

import java.util.List;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Wiring Parameters Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersRefImpl#getParentControlRef <em>Parent Control Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersRefImpl#getParentControllingLNode <em>Parent Controlling LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersRefImpl#getParentSourceRef <em>Parent Source Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersRefImpl#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersRefImpl#getRefersToBinaryWiringParameters <em>Refers To Binary Wiring Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryWiringParametersRefImpl extends ServiceParametersRefImpl implements BinaryWiringParametersRef {
    /**
     * The cached value of the '{@link #getRefersToBinaryWiringParameters() <em>Refers To Binary Wiring Parameters</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToBinaryWiringParameters()
     * @generated
     * @ordered
     */
    protected BinaryWiringParameters refersToBinaryWiringParameters;

    /**
     * This is true if the Refers To Binary Wiring Parameters reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToBinaryWiringParametersESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BinaryWiringParametersRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getBinaryWiringParametersRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlRef getParentControlRef() {
        if( eContainerFeatureID() != AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF ) {
            return null;
        }
        return ( ControlRef ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentControlRef( ControlRef newParentControlRef, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentControlRef,
                AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentControlRef( ControlRef newParentControlRef ) {
        if( newParentControlRef != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF
                        && newParentControlRef != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentControlRef ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentControlRef != null ) {
                msgs = ( ( InternalEObject ) newParentControlRef ).eInverseAdd( this,
                        AsdPackage.CONTROL_REF__BINARY_WIRING_PARAMETERS_REF, ControlRef.class, msgs );
            }
            msgs = basicSetParentControlRef( newParentControlRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF, newParentControlRef,
                    newParentControlRef ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControllingLNode getParentControllingLNode() {
        if( eContainerFeatureID() != AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE ) {
            return null;
        }
        return ( ControllingLNode ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentControllingLNode( ControllingLNode newParentControllingLNode,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentControllingLNode,
                AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentControllingLNode( ControllingLNode newParentControllingLNode ) {
        if( newParentControllingLNode != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE
                        && newParentControllingLNode != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentControllingLNode ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentControllingLNode != null ) {
                msgs = ( ( InternalEObject ) newParentControllingLNode ).eInverseAdd( this,
                        AsdPackage.CONTROLLING_LNODE__BINARY_WIRING_PARAMETERS_REF, ControllingLNode.class, msgs );
            }
            msgs = basicSetParentControllingLNode( newParentControllingLNode, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE, newParentControllingLNode,
                    newParentControllingLNode ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SourceRef getParentSourceRef() {
        if( eContainerFeatureID() != AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF ) {
            return null;
        }
        return ( SourceRef ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSourceRef( SourceRef newParentSourceRef, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSourceRef,
                AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSourceRef( SourceRef newParentSourceRef ) {
        if( newParentSourceRef != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF
                        && newParentSourceRef != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSourceRef ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentSourceRef != null ) {
                msgs = ( ( InternalEObject ) newParentSourceRef ).eInverseAdd( this,
                        AsdPackage.SOURCE_REF__BINARY_WIRING_PARAMETERS_REF, SourceRef.class, msgs );
            }
            msgs = basicSetParentSourceRef( newParentSourceRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF, newParentSourceRef,
                    newParentSourceRef ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubscriberLNode getParentSubscriberLNode() {
        if( eContainerFeatureID() != AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE ) {
            return null;
        }
        return ( SubscriberLNode ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSubscriberLNode( SubscriberLNode newParentSubscriberLNode,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSubscriberLNode,
                AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSubscriberLNode( SubscriberLNode newParentSubscriberLNode ) {
        if( newParentSubscriberLNode != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE
                        && newParentSubscriberLNode != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSubscriberLNode ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentSubscriberLNode != null ) {
                msgs = ( ( InternalEObject ) newParentSubscriberLNode ).eInverseAdd( this,
                        AsdPackage.SUBSCRIBER_LNODE__BINARY_WIRING_PARAMETERS_REF, SubscriberLNode.class, msgs );
            }
            msgs = basicSetParentSubscriberLNode( newParentSubscriberLNode, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE, newParentSubscriberLNode,
                    newParentSubscriberLNode ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BinaryWiringParameters getRefersToBinaryWiringParameters() {
        if( refersToBinaryWiringParameters != null && refersToBinaryWiringParameters.eIsProxy() ) {
            InternalEObject oldRefersToBinaryWiringParameters = ( InternalEObject ) refersToBinaryWiringParameters;
            refersToBinaryWiringParameters = ( BinaryWiringParameters ) eResolveProxy(
                    oldRefersToBinaryWiringParameters );
            if( refersToBinaryWiringParameters != oldRefersToBinaryWiringParameters ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.BINARY_WIRING_PARAMETERS_REF__REFERS_TO_BINARY_WIRING_PARAMETERS,
                            oldRefersToBinaryWiringParameters, refersToBinaryWiringParameters ) );
                }
            }
        }
        return refersToBinaryWiringParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BinaryWiringParameters basicGetRefersToBinaryWiringParameters() {
        return refersToBinaryWiringParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToBinaryWiringParameters(
            BinaryWiringParameters newRefersToBinaryWiringParameters, NotificationChain msgs ) {
        BinaryWiringParameters oldRefersToBinaryWiringParameters = refersToBinaryWiringParameters;
        refersToBinaryWiringParameters = newRefersToBinaryWiringParameters;
        boolean oldRefersToBinaryWiringParametersESet = refersToBinaryWiringParametersESet;
        refersToBinaryWiringParametersESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.BINARY_WIRING_PARAMETERS_REF__REFERS_TO_BINARY_WIRING_PARAMETERS,
                    oldRefersToBinaryWiringParameters, newRefersToBinaryWiringParameters,
                    !oldRefersToBinaryWiringParametersESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToBinaryWiringParameters( BinaryWiringParameters newRefersToBinaryWiringParameters ) {
        if( newRefersToBinaryWiringParameters != refersToBinaryWiringParameters ) {
            NotificationChain msgs = null;
            if( refersToBinaryWiringParameters != null ) {
                msgs = ( ( InternalEObject ) refersToBinaryWiringParameters ).eInverseRemove( this,
                        AsdPackage.BINARY_WIRING_PARAMETERS__REFERRED_BY_BINARY_WIRING_PARAMETERS_REF,
                        BinaryWiringParameters.class, msgs );
            }
            if( newRefersToBinaryWiringParameters != null ) {
                msgs = ( ( InternalEObject ) newRefersToBinaryWiringParameters ).eInverseAdd( this,
                        AsdPackage.BINARY_WIRING_PARAMETERS__REFERRED_BY_BINARY_WIRING_PARAMETERS_REF,
                        BinaryWiringParameters.class, msgs );
            }
            msgs = basicSetRefersToBinaryWiringParameters( newRefersToBinaryWiringParameters, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToBinaryWiringParametersESet = refersToBinaryWiringParametersESet;
            refersToBinaryWiringParametersESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.BINARY_WIRING_PARAMETERS_REF__REFERS_TO_BINARY_WIRING_PARAMETERS,
                        newRefersToBinaryWiringParameters, newRefersToBinaryWiringParameters,
                        !oldRefersToBinaryWiringParametersESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToBinaryWiringParameters( NotificationChain msgs ) {
        BinaryWiringParameters oldRefersToBinaryWiringParameters = refersToBinaryWiringParameters;
        refersToBinaryWiringParameters = null;
        boolean oldRefersToBinaryWiringParametersESet = refersToBinaryWiringParametersESet;
        refersToBinaryWiringParametersESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.BINARY_WIRING_PARAMETERS_REF__REFERS_TO_BINARY_WIRING_PARAMETERS,
                    oldRefersToBinaryWiringParameters, null, oldRefersToBinaryWiringParametersESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToBinaryWiringParameters() {
        if( refersToBinaryWiringParameters != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToBinaryWiringParameters ).eInverseRemove( this,
                    AsdPackage.BINARY_WIRING_PARAMETERS__REFERRED_BY_BINARY_WIRING_PARAMETERS_REF,
                    BinaryWiringParameters.class, msgs );
            msgs = basicUnsetRefersToBinaryWiringParameters( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToBinaryWiringParametersESet = refersToBinaryWiringParametersESet;
            refersToBinaryWiringParametersESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.BINARY_WIRING_PARAMETERS_REF__REFERS_TO_BINARY_WIRING_PARAMETERS, null, null,
                        oldRefersToBinaryWiringParametersESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToBinaryWiringParameters() {
        return refersToBinaryWiringParametersESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentControlRef( ( ControlRef ) otherEnd, msgs );
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentControllingLNode( ( ControllingLNode ) otherEnd, msgs );
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSourceRef( ( SourceRef ) otherEnd, msgs );
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSubscriberLNode( ( SubscriberLNode ) otherEnd, msgs );
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__REFERS_TO_BINARY_WIRING_PARAMETERS:
            if( refersToBinaryWiringParameters != null ) {
                msgs = ( ( InternalEObject ) refersToBinaryWiringParameters ).eInverseRemove( this,
                        AsdPackage.BINARY_WIRING_PARAMETERS__REFERRED_BY_BINARY_WIRING_PARAMETERS_REF,
                        BinaryWiringParameters.class, msgs );
            }
            return basicSetRefersToBinaryWiringParameters( ( BinaryWiringParameters ) otherEnd, msgs );
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
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF:
            return basicSetParentControlRef( null, msgs );
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE:
            return basicSetParentControllingLNode( null, msgs );
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF:
            return basicSetParentSourceRef( null, msgs );
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            return basicSetParentSubscriberLNode( null, msgs );
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__REFERS_TO_BINARY_WIRING_PARAMETERS:
            return basicUnsetRefersToBinaryWiringParameters( msgs );
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
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF:
            return eInternalContainer().eInverseRemove( this, AsdPackage.CONTROL_REF__BINARY_WIRING_PARAMETERS_REF,
                    ControlRef.class, msgs );
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE:
            return eInternalContainer().eInverseRemove( this,
                    AsdPackage.CONTROLLING_LNODE__BINARY_WIRING_PARAMETERS_REF, ControllingLNode.class, msgs );
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SOURCE_REF__BINARY_WIRING_PARAMETERS_REF,
                    SourceRef.class, msgs );
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SUBSCRIBER_LNODE__BINARY_WIRING_PARAMETERS_REF,
                    SubscriberLNode.class, msgs );
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
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF:
            return getParentControlRef();
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE:
            return getParentControllingLNode();
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF:
            return getParentSourceRef();
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            return getParentSubscriberLNode();
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__REFERS_TO_BINARY_WIRING_PARAMETERS:
            if( resolve ) {
                return getRefersToBinaryWiringParameters();
            }
            return basicGetRefersToBinaryWiringParameters();
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
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF:
            setParentControlRef( ( ControlRef ) newValue );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE:
            setParentControllingLNode( ( ControllingLNode ) newValue );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF:
            setParentSourceRef( ( SourceRef ) newValue );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            setParentSubscriberLNode( ( SubscriberLNode ) newValue );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__REFERS_TO_BINARY_WIRING_PARAMETERS:
            setRefersToBinaryWiringParameters( ( BinaryWiringParameters ) newValue );
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
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF:
            setParentControlRef( ( ControlRef ) null );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE:
            setParentControllingLNode( ( ControllingLNode ) null );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF:
            setParentSourceRef( ( SourceRef ) null );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            setParentSubscriberLNode( ( SubscriberLNode ) null );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__REFERS_TO_BINARY_WIRING_PARAMETERS:
            unsetRefersToBinaryWiringParameters();
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
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF:
            return getParentControlRef() != null;
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE:
            return getParentControllingLNode() != null;
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF:
            return getParentSourceRef() != null;
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            return getParentSubscriberLNode() != null;
        case AsdPackage.BINARY_WIRING_PARAMETERS_REF__REFERS_TO_BINARY_WIRING_PARAMETERS:
            return isSetRefersToBinaryWiringParameters();
        }
        return super.eIsSet( featureID );
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "BinaryWiringParametersRef.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from BinaryWiringParametersRef: ";
        doBuildExplicitLinkWithBinaryWiringParameters( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithBinaryWiringParameters( @NonNull IRiseClipseConsole console,
            @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for BinaryWiringParameters) ";

        if( getId() != null && !getId().isEmpty() ) {
            Pair< ServiceSpecifications, Integer > serviceSpecifications = AsdUtilities
                    .getServiceSpecifications( this );
            if( serviceSpecifications.getLeft() == null ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( serviceSpecifications.getRight() == 0 ) ? "cannot find " : "found several " ),
                //         "ServiceSpecifications" );
                return;
            }

            List< BinaryWiringParameters > binaryWiringParameters = serviceSpecifications.getLeft()
                    .getBinaryWiringParameters().stream()
                    .filter( a -> getId().equals( a.getId() ) )
                    .toList();

            if( binaryWiringParameters.size() == 1 ) {
                setRefersToBinaryWiringParameters( binaryWiringParameters.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "BinaryWiringParametersRef refers to BinaryWiringParameters( id = ", getId(),
                        " ) on line ", getRefersToBinaryWiringParameters().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( binaryWiringParameters.size() == 0 ) ? "cannot find" : "found several" ),
                //         " BinaryWiringParameters( id = ", getId(), " ) );
            }

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because allocationRole and allocationRoleUuid are missing" );
        }

    }

} //BinaryWiringParametersRefImpl
