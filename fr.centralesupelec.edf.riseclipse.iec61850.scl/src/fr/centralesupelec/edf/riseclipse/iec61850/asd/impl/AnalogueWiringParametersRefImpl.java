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

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analogue Wiring Parameters Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AnalogueWiringParametersRefImpl#getParentControlRef <em>Parent Control Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AnalogueWiringParametersRefImpl#getParentControllingLNode <em>Parent Controlling LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AnalogueWiringParametersRefImpl#getParentSourceRef <em>Parent Source Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AnalogueWiringParametersRefImpl#getRefersToAnalogueWiringParameters <em>Refers To Analogue Wiring Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogueWiringParametersRefImpl extends ServiceParametersRefImpl implements AnalogueWiringParametersRef {
    /**
     * The cached value of the '{@link #getRefersToAnalogueWiringParameters() <em>Refers To Analogue Wiring Parameters</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToAnalogueWiringParameters()
     * @generated
     * @ordered
     */
    protected AnalogueWiringParameters refersToAnalogueWiringParameters;

    /**
     * This is true if the Refers To Analogue Wiring Parameters reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToAnalogueWiringParametersESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnalogueWiringParametersRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getAnalogueWiringParametersRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlRef getParentControlRef() {
        if( eContainerFeatureID() != AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF ) {
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
                AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF
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
                        AsdPackage.CONTROL_REF__ANALOGUE_WIRING_PARAMETERS_REF, ControlRef.class, msgs );
            }
            msgs = basicSetParentControlRef( newParentControlRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF, newParentControlRef,
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
        if( eContainerFeatureID() != AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE ) {
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
                AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE
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
                        AsdPackage.CONTROLLING_LNODE__ANALOGUE_WIRING_PARAMETERS_REF, ControllingLNode.class, msgs );
            }
            msgs = basicSetParentControllingLNode( newParentControllingLNode, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE, newParentControllingLNode,
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
        if( eContainerFeatureID() != AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF ) {
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
                AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF
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
                        AsdPackage.SOURCE_REF__ANALOGUE_WIRING_PARAMETERS_REF, SourceRef.class, msgs );
            }
            msgs = basicSetParentSourceRef( newParentSourceRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF, newParentSourceRef,
                    newParentSourceRef ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnalogueWiringParameters getRefersToAnalogueWiringParameters() {
        if( refersToAnalogueWiringParameters != null && refersToAnalogueWiringParameters.eIsProxy() ) {
            InternalEObject oldRefersToAnalogueWiringParameters = ( InternalEObject ) refersToAnalogueWiringParameters;
            refersToAnalogueWiringParameters = ( AnalogueWiringParameters ) eResolveProxy(
                    oldRefersToAnalogueWiringParameters );
            if( refersToAnalogueWiringParameters != oldRefersToAnalogueWiringParameters ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__REFERS_TO_ANALOGUE_WIRING_PARAMETERS,
                            oldRefersToAnalogueWiringParameters, refersToAnalogueWiringParameters ) );
                }
            }
        }
        return refersToAnalogueWiringParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalogueWiringParameters basicGetRefersToAnalogueWiringParameters() {
        return refersToAnalogueWiringParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToAnalogueWiringParameters(
            AnalogueWiringParameters newRefersToAnalogueWiringParameters, NotificationChain msgs ) {
        AnalogueWiringParameters oldRefersToAnalogueWiringParameters = refersToAnalogueWiringParameters;
        refersToAnalogueWiringParameters = newRefersToAnalogueWiringParameters;
        boolean oldRefersToAnalogueWiringParametersESet = refersToAnalogueWiringParametersESet;
        refersToAnalogueWiringParametersESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__REFERS_TO_ANALOGUE_WIRING_PARAMETERS,
                    oldRefersToAnalogueWiringParameters, newRefersToAnalogueWiringParameters,
                    !oldRefersToAnalogueWiringParametersESet );
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
    public void setRefersToAnalogueWiringParameters( AnalogueWiringParameters newRefersToAnalogueWiringParameters ) {
        if( newRefersToAnalogueWiringParameters != refersToAnalogueWiringParameters ) {
            NotificationChain msgs = null;
            if( refersToAnalogueWiringParameters != null ) {
                msgs = ( ( InternalEObject ) refersToAnalogueWiringParameters ).eInverseRemove( this,
                        AsdPackage.ANALOGUE_WIRING_PARAMETERS__REFERRED_BY_ANALOGUE_WIRING_PARAMETERS_REF,
                        AnalogueWiringParameters.class, msgs );
            }
            if( newRefersToAnalogueWiringParameters != null ) {
                msgs = ( ( InternalEObject ) newRefersToAnalogueWiringParameters ).eInverseAdd( this,
                        AsdPackage.ANALOGUE_WIRING_PARAMETERS__REFERRED_BY_ANALOGUE_WIRING_PARAMETERS_REF,
                        AnalogueWiringParameters.class, msgs );
            }
            msgs = basicSetRefersToAnalogueWiringParameters( newRefersToAnalogueWiringParameters, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToAnalogueWiringParametersESet = refersToAnalogueWiringParametersESet;
            refersToAnalogueWiringParametersESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__REFERS_TO_ANALOGUE_WIRING_PARAMETERS,
                        newRefersToAnalogueWiringParameters, newRefersToAnalogueWiringParameters,
                        !oldRefersToAnalogueWiringParametersESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToAnalogueWiringParameters( NotificationChain msgs ) {
        AnalogueWiringParameters oldRefersToAnalogueWiringParameters = refersToAnalogueWiringParameters;
        refersToAnalogueWiringParameters = null;
        boolean oldRefersToAnalogueWiringParametersESet = refersToAnalogueWiringParametersESet;
        refersToAnalogueWiringParametersESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__REFERS_TO_ANALOGUE_WIRING_PARAMETERS,
                    oldRefersToAnalogueWiringParameters, null, oldRefersToAnalogueWiringParametersESet );
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
    public void unsetRefersToAnalogueWiringParameters() {
        if( refersToAnalogueWiringParameters != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToAnalogueWiringParameters ).eInverseRemove( this,
                    AsdPackage.ANALOGUE_WIRING_PARAMETERS__REFERRED_BY_ANALOGUE_WIRING_PARAMETERS_REF,
                    AnalogueWiringParameters.class, msgs );
            msgs = basicUnsetRefersToAnalogueWiringParameters( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToAnalogueWiringParametersESet = refersToAnalogueWiringParametersESet;
            refersToAnalogueWiringParametersESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__REFERS_TO_ANALOGUE_WIRING_PARAMETERS, null, null,
                        oldRefersToAnalogueWiringParametersESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToAnalogueWiringParameters() {
        return refersToAnalogueWiringParametersESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentControlRef( ( ControlRef ) otherEnd, msgs );
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentControllingLNode( ( ControllingLNode ) otherEnd, msgs );
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSourceRef( ( SourceRef ) otherEnd, msgs );
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__REFERS_TO_ANALOGUE_WIRING_PARAMETERS:
            if( refersToAnalogueWiringParameters != null ) {
                msgs = ( ( InternalEObject ) refersToAnalogueWiringParameters ).eInverseRemove( this,
                        AsdPackage.ANALOGUE_WIRING_PARAMETERS__REFERRED_BY_ANALOGUE_WIRING_PARAMETERS_REF,
                        AnalogueWiringParameters.class, msgs );
            }
            return basicSetRefersToAnalogueWiringParameters( ( AnalogueWiringParameters ) otherEnd, msgs );
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
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF:
            return basicSetParentControlRef( null, msgs );
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE:
            return basicSetParentControllingLNode( null, msgs );
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF:
            return basicSetParentSourceRef( null, msgs );
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__REFERS_TO_ANALOGUE_WIRING_PARAMETERS:
            return basicUnsetRefersToAnalogueWiringParameters( msgs );
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
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF:
            return eInternalContainer().eInverseRemove( this, AsdPackage.CONTROL_REF__ANALOGUE_WIRING_PARAMETERS_REF,
                    ControlRef.class, msgs );
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE:
            return eInternalContainer().eInverseRemove( this,
                    AsdPackage.CONTROLLING_LNODE__ANALOGUE_WIRING_PARAMETERS_REF, ControllingLNode.class, msgs );
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SOURCE_REF__ANALOGUE_WIRING_PARAMETERS_REF,
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
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF:
            return getParentControlRef();
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE:
            return getParentControllingLNode();
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF:
            return getParentSourceRef();
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__REFERS_TO_ANALOGUE_WIRING_PARAMETERS:
            if( resolve ) {
                return getRefersToAnalogueWiringParameters();
            }
            return basicGetRefersToAnalogueWiringParameters();
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
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF:
            setParentControlRef( ( ControlRef ) newValue );
            return;
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE:
            setParentControllingLNode( ( ControllingLNode ) newValue );
            return;
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF:
            setParentSourceRef( ( SourceRef ) newValue );
            return;
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__REFERS_TO_ANALOGUE_WIRING_PARAMETERS:
            setRefersToAnalogueWiringParameters( ( AnalogueWiringParameters ) newValue );
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
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF:
            setParentControlRef( ( ControlRef ) null );
            return;
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE:
            setParentControllingLNode( ( ControllingLNode ) null );
            return;
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF:
            setParentSourceRef( ( SourceRef ) null );
            return;
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__REFERS_TO_ANALOGUE_WIRING_PARAMETERS:
            unsetRefersToAnalogueWiringParameters();
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
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF:
            return getParentControlRef() != null;
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE:
            return getParentControllingLNode() != null;
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF:
            return getParentSourceRef() != null;
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__REFERS_TO_ANALOGUE_WIRING_PARAMETERS:
            return isSetRefersToAnalogueWiringParameters();
        }
        return super.eIsSet( featureID );
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "AnalogueWiringParametersRef.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from AnalogueWiringParametersRef: ";
        doBuildExplicitLinkWithAnalogueWiringParameters( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithAnalogueWiringParameters( @NonNull IRiseClipseConsole console,
            @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for AnalogueWiringParameters) ";

        if( getId() != null && !getId().isEmpty() ) {
            Pair< ServiceSpecifications, Integer > serviceSpecifications = AsdUtilities
                    .getServiceSpecifications( this );
            if( serviceSpecifications.getLeft() == null ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( serviceSpecifications.getRight() == 0 ) ? "cannot find " : "found several " ),
                //         "ServiceSpecifications" );
                return;
            }

            List< AnalogueWiringParameters > analogueWiringParameters = serviceSpecifications.getLeft()
                    .getAnalogueWiringParameters().stream()
                    .filter( a -> getId().equals( a.getId() ) )
                    .toList();

            if( analogueWiringParameters.size() == 1 ) {
                setRefersToAnalogueWiringParameters( analogueWiringParameters.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "AnalogueWiringParametersRef refers to AnalogueWiringParameters( id = ", getId(),
                        " ) on line ", getRefersToAnalogueWiringParameters().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( analogueWiringParameters.size() == 0 ) ? "cannot find" : "found several" ),
                //         " AnalogueWiringParameters( id = ", getId(), " ) );
            }

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because allocationRole and allocationRoleUuid are missing" );
        }

    }

} //AnalogueWiringParametersRefImpl
