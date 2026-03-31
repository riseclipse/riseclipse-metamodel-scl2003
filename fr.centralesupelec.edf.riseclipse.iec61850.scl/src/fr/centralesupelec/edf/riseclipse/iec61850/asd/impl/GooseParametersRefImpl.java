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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goose Parameters Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.GooseParametersRefImpl#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.GooseParametersRefImpl#getParentSourceRef <em>Parent Source Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.GooseParametersRefImpl#getRefersToGooseParameters <em>Refers To Goose Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GooseParametersRefImpl extends ServiceParametersRefImpl implements GooseParametersRef {
    /**
     * The cached value of the '{@link #getRefersToGooseParameters() <em>Refers To Goose Parameters</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToGooseParameters()
     * @generated
     * @ordered
     */
    protected GooseParameters refersToGooseParameters;

    /**
     * This is true if the Refers To Goose Parameters reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToGooseParametersESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GooseParametersRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getGooseParametersRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubscriberLNode getParentSubscriberLNode() {
        if( eContainerFeatureID() != AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE ) {
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
                AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE
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
                        AsdPackage.SUBSCRIBER_LNODE__GOOSE_PARAMETERS_REF, SubscriberLNode.class, msgs );
            }
            msgs = basicSetParentSubscriberLNode( newParentSubscriberLNode, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE, newParentSubscriberLNode,
                    newParentSubscriberLNode ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SourceRef getParentSourceRef() {
        if( eContainerFeatureID() != AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SOURCE_REF ) {
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
                AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SOURCE_REF, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SOURCE_REF
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
                        AsdPackage.SOURCE_REF__GOOSE_PARAMETERS_REF, SourceRef.class, msgs );
            }
            msgs = basicSetParentSourceRef( newParentSourceRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SOURCE_REF,
                    newParentSourceRef, newParentSourceRef ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GooseParameters getRefersToGooseParameters() {
        if( refersToGooseParameters != null && refersToGooseParameters.eIsProxy() ) {
            InternalEObject oldRefersToGooseParameters = ( InternalEObject ) refersToGooseParameters;
            refersToGooseParameters = ( GooseParameters ) eResolveProxy( oldRefersToGooseParameters );
            if( refersToGooseParameters != oldRefersToGooseParameters ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.GOOSE_PARAMETERS_REF__REFERS_TO_GOOSE_PARAMETERS, oldRefersToGooseParameters,
                            refersToGooseParameters ) );
                }
            }
        }
        return refersToGooseParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GooseParameters basicGetRefersToGooseParameters() {
        return refersToGooseParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToGooseParameters( GooseParameters newRefersToGooseParameters,
            NotificationChain msgs ) {
        GooseParameters oldRefersToGooseParameters = refersToGooseParameters;
        refersToGooseParameters = newRefersToGooseParameters;
        boolean oldRefersToGooseParametersESet = refersToGooseParametersESet;
        refersToGooseParametersESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.GOOSE_PARAMETERS_REF__REFERS_TO_GOOSE_PARAMETERS, oldRefersToGooseParameters,
                    newRefersToGooseParameters, !oldRefersToGooseParametersESet );
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
    public void setRefersToGooseParameters( GooseParameters newRefersToGooseParameters ) {
        if( newRefersToGooseParameters != refersToGooseParameters ) {
            NotificationChain msgs = null;
            if( refersToGooseParameters != null ) {
                msgs = ( ( InternalEObject ) refersToGooseParameters ).eInverseRemove( this,
                        AsdPackage.GOOSE_PARAMETERS__REFERRED_BY_GOOSE_PARAMETERS_REF, GooseParameters.class, msgs );
            }
            if( newRefersToGooseParameters != null ) {
                msgs = ( ( InternalEObject ) newRefersToGooseParameters ).eInverseAdd( this,
                        AsdPackage.GOOSE_PARAMETERS__REFERRED_BY_GOOSE_PARAMETERS_REF, GooseParameters.class, msgs );
            }
            msgs = basicSetRefersToGooseParameters( newRefersToGooseParameters, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToGooseParametersESet = refersToGooseParametersESet;
            refersToGooseParametersESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.GOOSE_PARAMETERS_REF__REFERS_TO_GOOSE_PARAMETERS, newRefersToGooseParameters,
                        newRefersToGooseParameters, !oldRefersToGooseParametersESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToGooseParameters( NotificationChain msgs ) {
        GooseParameters oldRefersToGooseParameters = refersToGooseParameters;
        refersToGooseParameters = null;
        boolean oldRefersToGooseParametersESet = refersToGooseParametersESet;
        refersToGooseParametersESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.GOOSE_PARAMETERS_REF__REFERS_TO_GOOSE_PARAMETERS, oldRefersToGooseParameters, null,
                    oldRefersToGooseParametersESet );
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
    public void unsetRefersToGooseParameters() {
        if( refersToGooseParameters != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToGooseParameters ).eInverseRemove( this,
                    AsdPackage.GOOSE_PARAMETERS__REFERRED_BY_GOOSE_PARAMETERS_REF, GooseParameters.class, msgs );
            msgs = basicUnsetRefersToGooseParameters( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToGooseParametersESet = refersToGooseParametersESet;
            refersToGooseParametersESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.GOOSE_PARAMETERS_REF__REFERS_TO_GOOSE_PARAMETERS, null, null,
                        oldRefersToGooseParametersESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToGooseParameters() {
        return refersToGooseParametersESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSubscriberLNode( ( SubscriberLNode ) otherEnd, msgs );
        case AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SOURCE_REF:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSourceRef( ( SourceRef ) otherEnd, msgs );
        case AsdPackage.GOOSE_PARAMETERS_REF__REFERS_TO_GOOSE_PARAMETERS:
            if( refersToGooseParameters != null ) {
                msgs = ( ( InternalEObject ) refersToGooseParameters ).eInverseRemove( this,
                        AsdPackage.GOOSE_PARAMETERS__REFERRED_BY_GOOSE_PARAMETERS_REF, GooseParameters.class, msgs );
            }
            return basicSetRefersToGooseParameters( ( GooseParameters ) otherEnd, msgs );
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
        case AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            return basicSetParentSubscriberLNode( null, msgs );
        case AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SOURCE_REF:
            return basicSetParentSourceRef( null, msgs );
        case AsdPackage.GOOSE_PARAMETERS_REF__REFERS_TO_GOOSE_PARAMETERS:
            return basicUnsetRefersToGooseParameters( msgs );
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
        case AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SUBSCRIBER_LNODE__GOOSE_PARAMETERS_REF,
                    SubscriberLNode.class, msgs );
        case AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SOURCE_REF:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SOURCE_REF__GOOSE_PARAMETERS_REF,
                    SourceRef.class, msgs );
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
        case AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            return getParentSubscriberLNode();
        case AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SOURCE_REF:
            return getParentSourceRef();
        case AsdPackage.GOOSE_PARAMETERS_REF__REFERS_TO_GOOSE_PARAMETERS:
            if( resolve ) {
                return getRefersToGooseParameters();
            }
            return basicGetRefersToGooseParameters();
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
        case AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            setParentSubscriberLNode( ( SubscriberLNode ) newValue );
            return;
        case AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SOURCE_REF:
            setParentSourceRef( ( SourceRef ) newValue );
            return;
        case AsdPackage.GOOSE_PARAMETERS_REF__REFERS_TO_GOOSE_PARAMETERS:
            setRefersToGooseParameters( ( GooseParameters ) newValue );
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
        case AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            setParentSubscriberLNode( ( SubscriberLNode ) null );
            return;
        case AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SOURCE_REF:
            setParentSourceRef( ( SourceRef ) null );
            return;
        case AsdPackage.GOOSE_PARAMETERS_REF__REFERS_TO_GOOSE_PARAMETERS:
            unsetRefersToGooseParameters();
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
        case AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            return getParentSubscriberLNode() != null;
        case AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SOURCE_REF:
            return getParentSourceRef() != null;
        case AsdPackage.GOOSE_PARAMETERS_REF__REFERS_TO_GOOSE_PARAMETERS:
            return isSetRefersToGooseParameters();
        }
        return super.eIsSet( featureID );
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "GooseParametersRef.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from GooseParametersRef: ";
        doBuildExplicitLinkWithGooseParameters( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithGooseParameters( @NonNull IRiseClipseConsole console,
            @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for GooseParameters) ";

        if( getId() != null && !getId().isEmpty() ) {
            Pair< ServiceSpecifications, Integer > serviceSpecifications = AsdUtilities
                    .getServiceSpecifications( this );
            if( serviceSpecifications.getLeft() == null ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( serviceSpecifications.getRight() == 0 ) ? "cannot find " : "found several " ),
                //         "ServiceSpecifications" );
                return;
            }

            List< GooseParameters > gooseParameters = serviceSpecifications.getLeft()
                    .getGooseParameters().stream()
                    .filter( a -> getId().equals( a.getId() ) )
                    .toList();

            if( gooseParameters.size() == 1 ) {
                setRefersToGooseParameters( gooseParameters.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "GooseParametersRef refers to GooseParameters( id = ", getId(),
                        " ) on line ", getRefersToGooseParameters().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( gooseParameters.size() == 0 ) ? "cannot find" : "found several" ),
                //         " GooseParameters( id = ", getId(), " ) );
            }

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because allocationRole and allocationRoleUuid are missing" );
        }

    }

} //GooseParametersRefImpl
