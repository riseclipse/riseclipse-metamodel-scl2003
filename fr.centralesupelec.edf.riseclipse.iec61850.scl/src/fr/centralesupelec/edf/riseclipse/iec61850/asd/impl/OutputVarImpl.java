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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputs;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.OutputVarImpl#getOutputName <em>Output Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.OutputVarImpl#getOutputUuid <em>Output Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.OutputVarImpl#getRefersToControlRef <em>Refers To Control Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.OutputVarImpl#getParentBehaviorDescription <em>Parent Behavior Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputVarImpl extends LogicVarRefImpl implements OutputVar {
    /**
     * The default value of the '{@link #getOutputName() <em>Output Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputName()
     * @generated
     * @ordered
     */
    protected static final String OUTPUT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutputName() <em>Output Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputName()
     * @generated
     * @ordered
     */
    protected String outputName = OUTPUT_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getOutputUuid() <em>Output Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputUuid()
     * @generated
     * @ordered
     */
    protected static final String OUTPUT_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutputUuid() <em>Output Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputUuid()
     * @generated
     * @ordered
     */
    protected String outputUuid = OUTPUT_UUID_EDEFAULT;

    /**
     * The cached value of the '{@link #getRefersToControlRef() <em>Refers To Control Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToControlRef()
     * @generated
     * @ordered
     */
    protected ControlRef refersToControlRef;

    /**
     * This is true if the Refers To Control Ref reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToControlRefESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OutputVarImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getOutputVar();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOutputName() {
        return outputName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutputName( String newOutputName ) {
        String oldOutputName = outputName;
        outputName = newOutputName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.OUTPUT_VAR__OUTPUT_NAME, oldOutputName,
                    outputName ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOutputUuid() {
        return outputUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutputUuid( String newOutputUuid ) {
        String oldOutputUuid = outputUuid;
        outputUuid = newOutputUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.OUTPUT_VAR__OUTPUT_UUID, oldOutputUuid,
                    outputUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlRef getRefersToControlRef() {
        if( refersToControlRef != null && refersToControlRef.eIsProxy() ) {
            InternalEObject oldRefersToControlRef = ( InternalEObject ) refersToControlRef;
            refersToControlRef = ( ControlRef ) eResolveProxy( oldRefersToControlRef );
            if( refersToControlRef != oldRefersToControlRef ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.OUTPUT_VAR__REFERS_TO_CONTROL_REF, oldRefersToControlRef, refersToControlRef ) );
                }
            }
        }
        return refersToControlRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControlRef basicGetRefersToControlRef() {
        return refersToControlRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToControlRef( ControlRef newRefersToControlRef, NotificationChain msgs ) {
        ControlRef oldRefersToControlRef = refersToControlRef;
        refersToControlRef = newRefersToControlRef;
        boolean oldRefersToControlRefESet = refersToControlRefESet;
        refersToControlRefESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.OUTPUT_VAR__REFERS_TO_CONTROL_REF, oldRefersToControlRef, newRefersToControlRef,
                    !oldRefersToControlRefESet );
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
    public void setRefersToControlRef( ControlRef newRefersToControlRef ) {
        if( newRefersToControlRef != refersToControlRef ) {
            NotificationChain msgs = null;
            if( refersToControlRef != null ) {
                msgs = ( ( InternalEObject ) refersToControlRef ).eInverseRemove( this,
                        AsdPackage.CONTROL_REF__REFERRED_BY_OUTPUT_VAR, ControlRef.class, msgs );
            }
            if( newRefersToControlRef != null ) {
                msgs = ( ( InternalEObject ) newRefersToControlRef ).eInverseAdd( this,
                        AsdPackage.CONTROL_REF__REFERRED_BY_OUTPUT_VAR, ControlRef.class, msgs );
            }
            msgs = basicSetRefersToControlRef( newRefersToControlRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToControlRefESet = refersToControlRefESet;
            refersToControlRefESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.OUTPUT_VAR__REFERS_TO_CONTROL_REF,
                        newRefersToControlRef, newRefersToControlRef, !oldRefersToControlRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToControlRef( NotificationChain msgs ) {
        ControlRef oldRefersToControlRef = refersToControlRef;
        refersToControlRef = null;
        boolean oldRefersToControlRefESet = refersToControlRefESet;
        refersToControlRefESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.OUTPUT_VAR__REFERS_TO_CONTROL_REF, oldRefersToControlRef, null,
                    oldRefersToControlRefESet );
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
    public void unsetRefersToControlRef() {
        if( refersToControlRef != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToControlRef ).eInverseRemove( this,
                    AsdPackage.CONTROL_REF__REFERRED_BY_OUTPUT_VAR, ControlRef.class, msgs );
            msgs = basicUnsetRefersToControlRef( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToControlRefESet = refersToControlRefESet;
            refersToControlRefESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.OUTPUT_VAR__REFERS_TO_CONTROL_REF,
                        null, null, oldRefersToControlRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToControlRef() {
        return refersToControlRefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BehaviorDescription getParentBehaviorDescription() {
        if( eContainerFeatureID() != AsdPackage.OUTPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION ) {
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
                AsdPackage.OUTPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.OUTPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION
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
                        AsdPackage.BEHAVIOR_DESCRIPTION__OUTPUT_VAR, BehaviorDescription.class, msgs );
            }
            msgs = basicSetParentBehaviorDescription( newParentBehaviorDescription, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.OUTPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION,
                    newParentBehaviorDescription, newParentBehaviorDescription ) );
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
        case AsdPackage.OUTPUT_VAR__REFERS_TO_CONTROL_REF:
            if( refersToControlRef != null ) {
                msgs = ( ( InternalEObject ) refersToControlRef ).eInverseRemove( this,
                        AsdPackage.CONTROL_REF__REFERRED_BY_OUTPUT_VAR, ControlRef.class, msgs );
            }
            return basicSetRefersToControlRef( ( ControlRef ) otherEnd, msgs );
        case AsdPackage.OUTPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION:
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
        case AsdPackage.OUTPUT_VAR__REFERS_TO_CONTROL_REF:
            return basicUnsetRefersToControlRef( msgs );
        case AsdPackage.OUTPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION:
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
        case AsdPackage.OUTPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION:
            return eInternalContainer().eInverseRemove( this, AsdPackage.BEHAVIOR_DESCRIPTION__OUTPUT_VAR,
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
        case AsdPackage.OUTPUT_VAR__OUTPUT_NAME:
            return getOutputName();
        case AsdPackage.OUTPUT_VAR__OUTPUT_UUID:
            return getOutputUuid();
        case AsdPackage.OUTPUT_VAR__REFERS_TO_CONTROL_REF:
            if( resolve ) {
                return getRefersToControlRef();
            }
            return basicGetRefersToControlRef();
        case AsdPackage.OUTPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION:
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
        case AsdPackage.OUTPUT_VAR__OUTPUT_NAME:
            setOutputName( ( String ) newValue );
            return;
        case AsdPackage.OUTPUT_VAR__OUTPUT_UUID:
            setOutputUuid( ( String ) newValue );
            return;
        case AsdPackage.OUTPUT_VAR__REFERS_TO_CONTROL_REF:
            setRefersToControlRef( ( ControlRef ) newValue );
            return;
        case AsdPackage.OUTPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION:
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
        case AsdPackage.OUTPUT_VAR__OUTPUT_NAME:
            setOutputName( OUTPUT_NAME_EDEFAULT );
            return;
        case AsdPackage.OUTPUT_VAR__OUTPUT_UUID:
            setOutputUuid( OUTPUT_UUID_EDEFAULT );
            return;
        case AsdPackage.OUTPUT_VAR__REFERS_TO_CONTROL_REF:
            unsetRefersToControlRef();
            return;
        case AsdPackage.OUTPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION:
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
        case AsdPackage.OUTPUT_VAR__OUTPUT_NAME:
            return OUTPUT_NAME_EDEFAULT == null ? outputName != null : !OUTPUT_NAME_EDEFAULT.equals( outputName );
        case AsdPackage.OUTPUT_VAR__OUTPUT_UUID:
            return OUTPUT_UUID_EDEFAULT == null ? outputUuid != null : !OUTPUT_UUID_EDEFAULT.equals( outputUuid );
        case AsdPackage.OUTPUT_VAR__REFERS_TO_CONTROL_REF:
            return isSetRefersToControlRef();
        case AsdPackage.OUTPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION:
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
        result.append( " (outputName: " );
        result.append( outputName );
        result.append( ", outputUuid: " );
        result.append( outputUuid );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "OutputVar.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from OutputVar: ";
        doBuildExplicitLinkWithControlRef( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithControlRef( @NonNull IRiseClipseConsole console, @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for ControlRef) ";

        BaseElement parent = getParentBehaviorDescription().getParentPrivate().getParentBaseElement();

        if( getOutputUuid() != null && !getOutputUuid().isEmpty() ) {
            List< ControlRef > res = new ArrayList<>();

            TreeIterator< EObject > it = parent.eAllContents();
            while( it.hasNext() ) {
                EObject o = it.next();
                if( o instanceof ControlRef && getOutputUuid().equals( ( ( ControlRef ) o ).getUuid() ) ) {
                    res.add( ( ControlRef ) o );
                }
            }

            if( res.size() == 1 ) {
                setRefersToControlRef( res.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "OutpuVar refers to ControlRef( id = ", getOutputUuid(), " ) on line ",
                        getRefersToControlRef().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                //         " ControlRef( uuid = ", getOutputUuid(), " )" );
            }

        }
        else if( getOutputName() != null && !getOutputName().isEmpty() ) {
            String[] controlRefPath = getOutputName().split( "\\.", 2 );

            if( controlRefPath.length < 2 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, "inexpected outputName format: ", getOutputName() );
                return;
            }

            String[] lnodePath = controlRefPath[0].split( "/" );

            Pair< LNode, Integer > lnode = AsdUtilities.getLNode( parent, lnodePath );
            if( lnode.getLeft() == null ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( lnode.getRight() == 0 ) ? "cannot find " : "found several " ),
                //         "LNode( name = ", lnodePath[lnodePath.length - 1], " )" );
                return;
            }
            console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "found LNode( name = ", lnodePath[lnodePath.length - 1], " ) on line ",
                    lnode.getLeft().getLineNumber() );

            List< ControlRef > res = lnode.getLeft().getPrivate()
                    .stream()
                    .filter( p -> "eIEC61850-6-100".equals( p.getType() ) )
                    .map( Private::getAsdObjects )
                    .flatMap( Collection::stream )
                    .filter( o -> o instanceof LNodeOutputs )
                    .map( i -> ( ( LNodeOutputs ) i ).getControlRef() )
                    .flatMap( Collection::stream )
                    .filter( c -> controlRefPath[1]
                            .equals( AsdUtilities.getControlRefName( c, controlRefPath[1].contains( "(" ) ) ) )
                    .toList();

            if( res.size() != 1 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                //         " ControlRef( name = ", controlRefPath[1], " )" );
                return;
            }

            setRefersToControlRef( res.get( 0 ) );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "OutputVar refers to ControlRef( id = ", controlRefPath[1], " )", " on line ",
                    getRefersToControlRef().getLineNumber() );

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because outputName and outputUuid are missing" );
        }

    }

} //OutputVarImpl
