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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Parameters Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ReportParametersRefImpl#getRefersToReportParameters <em>Refers To Report Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ReportParametersRefImpl#getParentSourceRef <em>Parent Source Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ReportParametersRefImpl#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportParametersRefImpl extends ServiceParametersRefImpl implements ReportParametersRef {
    /**
     * The cached value of the '{@link #getRefersToReportParameters() <em>Refers To Report Parameters</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToReportParameters()
     * @generated
     * @ordered
     */
    protected ReportParameters refersToReportParameters;

    /**
     * This is true if the Refers To Report Parameters reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToReportParametersESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReportParametersRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getReportParametersRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReportParameters getRefersToReportParameters() {
        if( refersToReportParameters != null && refersToReportParameters.eIsProxy() ) {
            InternalEObject oldRefersToReportParameters = ( InternalEObject ) refersToReportParameters;
            refersToReportParameters = ( ReportParameters ) eResolveProxy( oldRefersToReportParameters );
            if( refersToReportParameters != oldRefersToReportParameters ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.REPORT_PARAMETERS_REF__REFERS_TO_REPORT_PARAMETERS, oldRefersToReportParameters,
                            refersToReportParameters ) );
                }
            }
        }
        return refersToReportParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReportParameters basicGetRefersToReportParameters() {
        return refersToReportParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToReportParameters( ReportParameters newRefersToReportParameters,
            NotificationChain msgs ) {
        ReportParameters oldRefersToReportParameters = refersToReportParameters;
        refersToReportParameters = newRefersToReportParameters;
        boolean oldRefersToReportParametersESet = refersToReportParametersESet;
        refersToReportParametersESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.REPORT_PARAMETERS_REF__REFERS_TO_REPORT_PARAMETERS, oldRefersToReportParameters,
                    newRefersToReportParameters, !oldRefersToReportParametersESet );
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
    public void setRefersToReportParameters( ReportParameters newRefersToReportParameters ) {
        if( newRefersToReportParameters != refersToReportParameters ) {
            NotificationChain msgs = null;
            if( refersToReportParameters != null ) {
                msgs = ( ( InternalEObject ) refersToReportParameters ).eInverseRemove( this,
                        AsdPackage.REPORT_PARAMETERS__REFERRED_BY_REPORT_PARAMETERS_REF, ReportParameters.class, msgs );
            }
            if( newRefersToReportParameters != null ) {
                msgs = ( ( InternalEObject ) newRefersToReportParameters ).eInverseAdd( this,
                        AsdPackage.REPORT_PARAMETERS__REFERRED_BY_REPORT_PARAMETERS_REF, ReportParameters.class, msgs );
            }
            msgs = basicSetRefersToReportParameters( newRefersToReportParameters, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToReportParametersESet = refersToReportParametersESet;
            refersToReportParametersESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.REPORT_PARAMETERS_REF__REFERS_TO_REPORT_PARAMETERS, newRefersToReportParameters,
                        newRefersToReportParameters, !oldRefersToReportParametersESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToReportParameters( NotificationChain msgs ) {
        ReportParameters oldRefersToReportParameters = refersToReportParameters;
        refersToReportParameters = null;
        boolean oldRefersToReportParametersESet = refersToReportParametersESet;
        refersToReportParametersESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.REPORT_PARAMETERS_REF__REFERS_TO_REPORT_PARAMETERS, oldRefersToReportParameters, null,
                    oldRefersToReportParametersESet );
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
    public void unsetRefersToReportParameters() {
        if( refersToReportParameters != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToReportParameters ).eInverseRemove( this,
                    AsdPackage.REPORT_PARAMETERS__REFERRED_BY_REPORT_PARAMETERS_REF, ReportParameters.class, msgs );
            msgs = basicUnsetRefersToReportParameters( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToReportParametersESet = refersToReportParametersESet;
            refersToReportParametersESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.REPORT_PARAMETERS_REF__REFERS_TO_REPORT_PARAMETERS, null, null,
                        oldRefersToReportParametersESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToReportParameters() {
        return refersToReportParametersESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SourceRef getParentSourceRef() {
        if( eContainerFeatureID() != AsdPackage.REPORT_PARAMETERS_REF__PARENT_SOURCE_REF ) {
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
                AsdPackage.REPORT_PARAMETERS_REF__PARENT_SOURCE_REF, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.REPORT_PARAMETERS_REF__PARENT_SOURCE_REF
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
                        AsdPackage.SOURCE_REF__REPORT_PARAMETERS_REF, SourceRef.class, msgs );
            }
            msgs = basicSetParentSourceRef( newParentSourceRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.REPORT_PARAMETERS_REF__PARENT_SOURCE_REF,
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
        if( eContainerFeatureID() != AsdPackage.REPORT_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE ) {
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
                AsdPackage.REPORT_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.REPORT_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE
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
                        AsdPackage.SUBSCRIBER_LNODE__REPORT_PARAMETERS_REF, SubscriberLNode.class, msgs );
            }
            msgs = basicSetParentSubscriberLNode( newParentSubscriberLNode, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.REPORT_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE, newParentSubscriberLNode,
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
        case AsdPackage.REPORT_PARAMETERS_REF__REFERS_TO_REPORT_PARAMETERS:
            if( refersToReportParameters != null ) {
                msgs = ( ( InternalEObject ) refersToReportParameters ).eInverseRemove( this,
                        AsdPackage.REPORT_PARAMETERS__REFERRED_BY_REPORT_PARAMETERS_REF, ReportParameters.class, msgs );
            }
            return basicSetRefersToReportParameters( ( ReportParameters ) otherEnd, msgs );
        case AsdPackage.REPORT_PARAMETERS_REF__PARENT_SOURCE_REF:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSourceRef( ( SourceRef ) otherEnd, msgs );
        case AsdPackage.REPORT_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
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
        case AsdPackage.REPORT_PARAMETERS_REF__REFERS_TO_REPORT_PARAMETERS:
            return basicUnsetRefersToReportParameters( msgs );
        case AsdPackage.REPORT_PARAMETERS_REF__PARENT_SOURCE_REF:
            return basicSetParentSourceRef( null, msgs );
        case AsdPackage.REPORT_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
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
        case AsdPackage.REPORT_PARAMETERS_REF__PARENT_SOURCE_REF:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SOURCE_REF__REPORT_PARAMETERS_REF,
                    SourceRef.class, msgs );
        case AsdPackage.REPORT_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SUBSCRIBER_LNODE__REPORT_PARAMETERS_REF,
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
        case AsdPackage.REPORT_PARAMETERS_REF__REFERS_TO_REPORT_PARAMETERS:
            if( resolve ) {
                return getRefersToReportParameters();
            }
            return basicGetRefersToReportParameters();
        case AsdPackage.REPORT_PARAMETERS_REF__PARENT_SOURCE_REF:
            return getParentSourceRef();
        case AsdPackage.REPORT_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
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
        case AsdPackage.REPORT_PARAMETERS_REF__REFERS_TO_REPORT_PARAMETERS:
            setRefersToReportParameters( ( ReportParameters ) newValue );
            return;
        case AsdPackage.REPORT_PARAMETERS_REF__PARENT_SOURCE_REF:
            setParentSourceRef( ( SourceRef ) newValue );
            return;
        case AsdPackage.REPORT_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
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
        case AsdPackage.REPORT_PARAMETERS_REF__REFERS_TO_REPORT_PARAMETERS:
            unsetRefersToReportParameters();
            return;
        case AsdPackage.REPORT_PARAMETERS_REF__PARENT_SOURCE_REF:
            setParentSourceRef( ( SourceRef ) null );
            return;
        case AsdPackage.REPORT_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
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
        case AsdPackage.REPORT_PARAMETERS_REF__REFERS_TO_REPORT_PARAMETERS:
            return isSetRefersToReportParameters();
        case AsdPackage.REPORT_PARAMETERS_REF__PARENT_SOURCE_REF:
            return getParentSourceRef() != null;
        case AsdPackage.REPORT_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE:
            return getParentSubscriberLNode() != null;
        }
        return super.eIsSet( featureID );
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "ReportParametersRef.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from ReportParametersRef: ";
        doBuildExplicitLinkWithReportParameters( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithReportParameters( @NonNull IRiseClipseConsole console,
            @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for ReportParameters) ";

        if( getId() != null && !getId().isEmpty() ) {
            Pair< ServiceSpecifications, Integer > serviceSpecifications = AsdUtilities
                    .getServiceSpecifications( this );
            if( serviceSpecifications.getLeft() == null ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( serviceSpecifications.getRight() == 0 ) ? "cannot find " : "found several " ),
                //         "ServiceSpecifications" );
                return;
            }

            List< ReportParameters > reportParameters = serviceSpecifications.getLeft()
                    .getReportParameters().stream()
                    .filter( a -> getId().equals( a.getId() ) )
                    .toList();

            if( reportParameters.size() == 1 ) {
                setRefersToReportParameters( reportParameters.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "ReportParametersRef refers to ReportParameters( id = ", getId(),
                        " ) on line ", getRefersToReportParameters().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( reportParameters.size() == 0 ) ? "cannot find" : "found several" ),
                //         " ReportParameters( id = ", getId(), " ) );
            }

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because allocationRole and allocationRoleUuid are missing" );
        }

    }

} //ReportParametersRefImpl
