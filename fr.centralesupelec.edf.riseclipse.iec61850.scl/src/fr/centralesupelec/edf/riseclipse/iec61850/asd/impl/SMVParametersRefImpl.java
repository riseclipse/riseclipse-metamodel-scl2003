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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMV Parameters Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersRefImpl#getRefersToSMVParameters <em>Refers To SMV Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersRefImpl#getParentSourceRef <em>Parent Source Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersRefImpl#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SMVParametersRefImpl extends ServiceParametersRefImpl implements SMVParametersRef {
    /**
     * The cached value of the '{@link #getRefersToSMVParameters() <em>Refers To SMV Parameters</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToSMVParameters()
     * @generated
     * @ordered
     */
    protected SMVParameters refersToSMVParameters;

    /**
     * This is true if the Refers To SMV Parameters reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToSMVParametersESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SMVParametersRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getSMVParametersRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SMVParameters getRefersToSMVParameters() {
        if( refersToSMVParameters != null && refersToSMVParameters.eIsProxy() ) {
            InternalEObject oldRefersToSMVParameters = ( InternalEObject ) refersToSMVParameters;
            refersToSMVParameters = ( SMVParameters ) eResolveProxy( oldRefersToSMVParameters );
            if( refersToSMVParameters != oldRefersToSMVParameters ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.SMV_PARAMETERS_REF__REFERS_TO_SMV_PARAMETERS, oldRefersToSMVParameters,
                            refersToSMVParameters ) );
                }
            }
        }
        return refersToSMVParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SMVParameters basicGetRefersToSMVParameters() {
        return refersToSMVParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToSMVParameters( SMVParameters newRefersToSMVParameters,
            NotificationChain msgs ) {
        SMVParameters oldRefersToSMVParameters = refersToSMVParameters;
        refersToSMVParameters = newRefersToSMVParameters;
        boolean oldRefersToSMVParametersESet = refersToSMVParametersESet;
        refersToSMVParametersESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.SMV_PARAMETERS_REF__REFERS_TO_SMV_PARAMETERS, oldRefersToSMVParameters,
                    newRefersToSMVParameters, !oldRefersToSMVParametersESet );
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
    public void setRefersToSMVParameters( SMVParameters newRefersToSMVParameters ) {
        if( newRefersToSMVParameters != refersToSMVParameters ) {
            NotificationChain msgs = null;
            if( refersToSMVParameters != null ) {
                msgs = ( ( InternalEObject ) refersToSMVParameters ).eInverseRemove( this,
                        AsdPackage.SMV_PARAMETERS__REFERRED_BY_SMV_PARAMETERS_REF, SMVParameters.class, msgs );
            }
            if( newRefersToSMVParameters != null ) {
                msgs = ( ( InternalEObject ) newRefersToSMVParameters ).eInverseAdd( this,
                        AsdPackage.SMV_PARAMETERS__REFERRED_BY_SMV_PARAMETERS_REF, SMVParameters.class, msgs );
            }
            msgs = basicSetRefersToSMVParameters( newRefersToSMVParameters, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToSMVParametersESet = refersToSMVParametersESet;
            refersToSMVParametersESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.SMV_PARAMETERS_REF__REFERS_TO_SMV_PARAMETERS, newRefersToSMVParameters,
                        newRefersToSMVParameters, !oldRefersToSMVParametersESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToSMVParameters( NotificationChain msgs ) {
        SMVParameters oldRefersToSMVParameters = refersToSMVParameters;
        refersToSMVParameters = null;
        boolean oldRefersToSMVParametersESet = refersToSMVParametersESet;
        refersToSMVParametersESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.SMV_PARAMETERS_REF__REFERS_TO_SMV_PARAMETERS, oldRefersToSMVParameters, null,
                    oldRefersToSMVParametersESet );
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
    public void unsetRefersToSMVParameters() {
        if( refersToSMVParameters != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToSMVParameters ).eInverseRemove( this,
                    AsdPackage.SMV_PARAMETERS__REFERRED_BY_SMV_PARAMETERS_REF, SMVParameters.class, msgs );
            msgs = basicUnsetRefersToSMVParameters( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToSMVParametersESet = refersToSMVParametersESet;
            refersToSMVParametersESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.SMV_PARAMETERS_REF__REFERS_TO_SMV_PARAMETERS, null, null,
                        oldRefersToSMVParametersESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToSMVParameters() {
        return refersToSMVParametersESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SourceRef getParentSourceRef() {
        if( eContainerFeatureID() != AsdPackage.SMV_PARAMETERS_REF__PARENT_SOURCE_REF ) {
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
                AsdPackage.SMV_PARAMETERS_REF__PARENT_SOURCE_REF, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.SMV_PARAMETERS_REF__PARENT_SOURCE_REF
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
                        AsdPackage.SOURCE_REF__SMV_PARAMETERS_REF, SourceRef.class, msgs );
            }
            msgs = basicSetParentSourceRef( newParentSourceRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SMV_PARAMETERS_REF__PARENT_SOURCE_REF,
                    newParentSourceRef, newParentSourceRef ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubscriberLNode getParentSubscriberLNode() {
        if( eContainerFeatureID() != AsdPackage.SMV_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE ) {
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
                AsdPackage.SMV_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.SMV_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE
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
                        AsdPackage.SUBSCRIBER_LNODE__SMV_PARAMETERS_REF, SubscriberLNode.class, msgs );
            }
            msgs = basicSetParentSubscriberLNode( newParentSubscriberLNode, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.SMV_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE, newParentSubscriberLNode,
                    newParentSubscriberLNode ) );
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
        case AsdPackage.SMV_PARAMETERS_REF__REFERS_TO_SMV_PARAMETERS:
            if( refersToSMVParameters != null ) {
                msgs = ( ( InternalEObject ) refersToSMVParameters ).eInverseRemove( this,
                        AsdPackage.SMV_PARAMETERS__REFERRED_BY_SMV_PARAMETERS_REF, SMVParameters.class, msgs );
            }
            return basicSetRefersToSMVParameters( ( SMVParameters ) otherEnd, msgs );
        case AsdPackage.SMV_PARAMETERS_REF__PARENT_SOURCE_REF:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSourceRef( ( SourceRef ) otherEnd, msgs );
        case AsdPackage.SMV_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSubscriberLNode( ( SubscriberLNode ) otherEnd, msgs );
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
        case AsdPackage.SMV_PARAMETERS_REF__REFERS_TO_SMV_PARAMETERS:
            return basicUnsetRefersToSMVParameters( msgs );
        case AsdPackage.SMV_PARAMETERS_REF__PARENT_SOURCE_REF:
            return basicSetParentSourceRef( null, msgs );
        case AsdPackage.SMV_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            return basicSetParentSubscriberLNode( null, msgs );
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
        case AsdPackage.SMV_PARAMETERS_REF__PARENT_SOURCE_REF:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SOURCE_REF__SMV_PARAMETERS_REF,
                    SourceRef.class, msgs );
        case AsdPackage.SMV_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SUBSCRIBER_LNODE__SMV_PARAMETERS_REF,
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
        case AsdPackage.SMV_PARAMETERS_REF__REFERS_TO_SMV_PARAMETERS:
            if( resolve ) {
                return getRefersToSMVParameters();
            }
            return basicGetRefersToSMVParameters();
        case AsdPackage.SMV_PARAMETERS_REF__PARENT_SOURCE_REF:
            return getParentSourceRef();
        case AsdPackage.SMV_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            return getParentSubscriberLNode();
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
        case AsdPackage.SMV_PARAMETERS_REF__REFERS_TO_SMV_PARAMETERS:
            setRefersToSMVParameters( ( SMVParameters ) newValue );
            return;
        case AsdPackage.SMV_PARAMETERS_REF__PARENT_SOURCE_REF:
            setParentSourceRef( ( SourceRef ) newValue );
            return;
        case AsdPackage.SMV_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            setParentSubscriberLNode( ( SubscriberLNode ) newValue );
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
        case AsdPackage.SMV_PARAMETERS_REF__REFERS_TO_SMV_PARAMETERS:
            unsetRefersToSMVParameters();
            return;
        case AsdPackage.SMV_PARAMETERS_REF__PARENT_SOURCE_REF:
            setParentSourceRef( ( SourceRef ) null );
            return;
        case AsdPackage.SMV_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            setParentSubscriberLNode( ( SubscriberLNode ) null );
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
        case AsdPackage.SMV_PARAMETERS_REF__REFERS_TO_SMV_PARAMETERS:
            return isSetRefersToSMVParameters();
        case AsdPackage.SMV_PARAMETERS_REF__PARENT_SOURCE_REF:
            return getParentSourceRef() != null;
        case AsdPackage.SMV_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            return getParentSubscriberLNode() != null;
        }
        return super.eIsSet( featureID );
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "SMVParametersRef.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from SMVParametersRef: ";
        doBuildExplicitLinkWithSMVParameters( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithSMVParameters( @NonNull IRiseClipseConsole console,
            @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for SMVParameters) ";

        if( getId() != null && !getId().isEmpty() ) {
            Pair< ServiceSpecifications, Integer > serviceSpecifications = AsdUtilities
                    .getServiceSpecifications( this );
            if( serviceSpecifications.getLeft() == null ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( serviceSpecifications.getRight() == 0 ) ? "cannot find " : "found several " ),
                //         "ServiceSpecifications" );
                return;
            }

            List< SMVParameters > smvParameters = serviceSpecifications.getLeft()
                    .getSMVParameters().stream()
                    .filter( a -> getId().equals( a.getId() ) )
                    .toList();

            if( smvParameters.size() == 1 ) {
                setRefersToSMVParameters( smvParameters.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "SMVParametersRef refers to SMVParameters( id = ", getId(),
                        " ) on line ", getRefersToSMVParameters().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( smvParameters.size() == 0 ) ? "cannot find" : "found several" ),
                //         " SMVParameters( id = ", getId(), " ) );
            }

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because allocationRole and allocationRoleUuid are missing" );
        }

    }

} //SMVParametersRefImpl
