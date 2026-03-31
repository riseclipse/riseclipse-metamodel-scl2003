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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputs;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.InputVarImpl#getInputName <em>Input Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.InputVarImpl#getInputUuid <em>Input Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.InputVarImpl#getRefersToSourceRef <em>Refers To Source Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.InputVarImpl#getParentBehaviorDescription <em>Parent Behavior Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputVarImpl extends LogicVarRefImpl implements InputVar {
    /**
     * The default value of the '{@link #getInputName() <em>Input Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputName()
     * @generated
     * @ordered
     */
    protected static final String INPUT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInputName() <em>Input Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputName()
     * @generated
     * @ordered
     */
    protected String inputName = INPUT_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getInputUuid() <em>Input Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputUuid()
     * @generated
     * @ordered
     */
    protected static final String INPUT_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInputUuid() <em>Input Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputUuid()
     * @generated
     * @ordered
     */
    protected String inputUuid = INPUT_UUID_EDEFAULT;

    /**
     * The cached value of the '{@link #getRefersToSourceRef() <em>Refers To Source Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToSourceRef()
     * @generated
     * @ordered
     */
    protected SourceRef refersToSourceRef;

    /**
     * This is true if the Refers To Source Ref reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToSourceRefESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InputVarImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getInputVar();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getInputName() {
        return inputName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInputName( String newInputName ) {
        String oldInputName = inputName;
        inputName = newInputName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.INPUT_VAR__INPUT_NAME, oldInputName,
                    inputName ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getInputUuid() {
        return inputUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInputUuid( String newInputUuid ) {
        String oldInputUuid = inputUuid;
        inputUuid = newInputUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.INPUT_VAR__INPUT_UUID, oldInputUuid,
                    inputUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SourceRef getRefersToSourceRef() {
        if( refersToSourceRef != null && refersToSourceRef.eIsProxy() ) {
            InternalEObject oldRefersToSourceRef = ( InternalEObject ) refersToSourceRef;
            refersToSourceRef = ( SourceRef ) eResolveProxy( oldRefersToSourceRef );
            if( refersToSourceRef != oldRefersToSourceRef ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.INPUT_VAR__REFERS_TO_SOURCE_REF, oldRefersToSourceRef, refersToSourceRef ) );
                }
            }
        }
        return refersToSourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SourceRef basicGetRefersToSourceRef() {
        return refersToSourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToSourceRef( SourceRef newRefersToSourceRef, NotificationChain msgs ) {
        SourceRef oldRefersToSourceRef = refersToSourceRef;
        refersToSourceRef = newRefersToSourceRef;
        boolean oldRefersToSourceRefESet = refersToSourceRefESet;
        refersToSourceRefESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.INPUT_VAR__REFERS_TO_SOURCE_REF, oldRefersToSourceRef, newRefersToSourceRef,
                    !oldRefersToSourceRefESet );
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
    public void setRefersToSourceRef( SourceRef newRefersToSourceRef ) {
        if( newRefersToSourceRef != refersToSourceRef ) {
            NotificationChain msgs = null;
            if( refersToSourceRef != null ) {
                msgs = ( ( InternalEObject ) refersToSourceRef ).eInverseRemove( this,
                        AsdPackage.SOURCE_REF__REFERRED_BY_INPUT_VAR, SourceRef.class, msgs );
            }
            if( newRefersToSourceRef != null ) {
                msgs = ( ( InternalEObject ) newRefersToSourceRef ).eInverseAdd( this,
                        AsdPackage.SOURCE_REF__REFERRED_BY_INPUT_VAR, SourceRef.class, msgs );
            }
            msgs = basicSetRefersToSourceRef( newRefersToSourceRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToSourceRefESet = refersToSourceRefESet;
            refersToSourceRefESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.INPUT_VAR__REFERS_TO_SOURCE_REF,
                        newRefersToSourceRef, newRefersToSourceRef, !oldRefersToSourceRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToSourceRef( NotificationChain msgs ) {
        SourceRef oldRefersToSourceRef = refersToSourceRef;
        refersToSourceRef = null;
        boolean oldRefersToSourceRefESet = refersToSourceRefESet;
        refersToSourceRefESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.INPUT_VAR__REFERS_TO_SOURCE_REF, oldRefersToSourceRef, null, oldRefersToSourceRefESet );
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
    public void unsetRefersToSourceRef() {
        if( refersToSourceRef != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToSourceRef ).eInverseRemove( this,
                    AsdPackage.SOURCE_REF__REFERRED_BY_INPUT_VAR, SourceRef.class, msgs );
            msgs = basicUnsetRefersToSourceRef( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToSourceRefESet = refersToSourceRefESet;
            refersToSourceRefESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.INPUT_VAR__REFERS_TO_SOURCE_REF,
                        null, null, oldRefersToSourceRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToSourceRef() {
        return refersToSourceRefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BehaviorDescription getParentBehaviorDescription() {
        if( eContainerFeatureID() != AsdPackage.INPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION ) {
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
                AsdPackage.INPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.INPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION
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
                        AsdPackage.BEHAVIOR_DESCRIPTION__INPUT_VAR, BehaviorDescription.class, msgs );
            }
            msgs = basicSetParentBehaviorDescription( newParentBehaviorDescription, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.INPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION,
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
        case AsdPackage.INPUT_VAR__REFERS_TO_SOURCE_REF:
            if( refersToSourceRef != null ) {
                msgs = ( ( InternalEObject ) refersToSourceRef ).eInverseRemove( this,
                        AsdPackage.SOURCE_REF__REFERRED_BY_INPUT_VAR, SourceRef.class, msgs );
            }
            return basicSetRefersToSourceRef( ( SourceRef ) otherEnd, msgs );
        case AsdPackage.INPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION:
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
        case AsdPackage.INPUT_VAR__REFERS_TO_SOURCE_REF:
            return basicUnsetRefersToSourceRef( msgs );
        case AsdPackage.INPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION:
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
        case AsdPackage.INPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION:
            return eInternalContainer().eInverseRemove( this, AsdPackage.BEHAVIOR_DESCRIPTION__INPUT_VAR,
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
        case AsdPackage.INPUT_VAR__INPUT_NAME:
            return getInputName();
        case AsdPackage.INPUT_VAR__INPUT_UUID:
            return getInputUuid();
        case AsdPackage.INPUT_VAR__REFERS_TO_SOURCE_REF:
            if( resolve ) {
                return getRefersToSourceRef();
            }
            return basicGetRefersToSourceRef();
        case AsdPackage.INPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION:
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
        case AsdPackage.INPUT_VAR__INPUT_NAME:
            setInputName( ( String ) newValue );
            return;
        case AsdPackage.INPUT_VAR__INPUT_UUID:
            setInputUuid( ( String ) newValue );
            return;
        case AsdPackage.INPUT_VAR__REFERS_TO_SOURCE_REF:
            setRefersToSourceRef( ( SourceRef ) newValue );
            return;
        case AsdPackage.INPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION:
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
        case AsdPackage.INPUT_VAR__INPUT_NAME:
            setInputName( INPUT_NAME_EDEFAULT );
            return;
        case AsdPackage.INPUT_VAR__INPUT_UUID:
            setInputUuid( INPUT_UUID_EDEFAULT );
            return;
        case AsdPackage.INPUT_VAR__REFERS_TO_SOURCE_REF:
            unsetRefersToSourceRef();
            return;
        case AsdPackage.INPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION:
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
        case AsdPackage.INPUT_VAR__INPUT_NAME:
            return INPUT_NAME_EDEFAULT == null ? inputName != null : !INPUT_NAME_EDEFAULT.equals( inputName );
        case AsdPackage.INPUT_VAR__INPUT_UUID:
            return INPUT_UUID_EDEFAULT == null ? inputUuid != null : !INPUT_UUID_EDEFAULT.equals( inputUuid );
        case AsdPackage.INPUT_VAR__REFERS_TO_SOURCE_REF:
            return isSetRefersToSourceRef();
        case AsdPackage.INPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION:
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
        result.append( " (inputName: " );
        result.append( inputName );
        result.append( ", inputUuid: " );
        result.append( inputUuid );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "InputVar.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from InputVar: ";
        doBuildExplicitLinkWithSourceRef( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithSourceRef( @NonNull IRiseClipseConsole console, @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for SourceRef) ";

        BaseElement parent = getParentBehaviorDescription().getParentPrivate().getParentBaseElement();

        if( getInputUuid() != null && !getInputUuid().isEmpty() ) {
            List< SourceRef > res = new ArrayList<>();

            TreeIterator< EObject > it = parent.eAllContents();
            while( it.hasNext() ) {
                EObject o = it.next();
                if( o instanceof SourceRef && getInputUuid().equals( ( ( SourceRef ) o ).getUuid() ) ) {
                    res.add( ( SourceRef ) o );
                }
            }

            if( res.size() == 1 ) {
                setRefersToSourceRef( res.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "InpurVar refers to SourceRef( id = ", getInputUuid(), " ) on line ",
                        getRefersToSourceRef().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                //         " SourceRef( uuid = ", getInputUuid(), " )" );
            }

        }
        else if( getInputName() != null && !getInputName().isEmpty() ) {
            String[] sourceRefPath = getInputName().split( "\\.", 2 );

            if( sourceRefPath.length < 2 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, "inexpected inputName format: ", getInputName() );
                return;
            }

            String[] lnodePath = sourceRefPath[0].split( "/" );

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

            List< SourceRef > res = lnode.getLeft().getPrivate()
                    .stream()
                    .filter( p -> "eIEC61850-6-100".equals( p.getType() ) )
                    .map( Private::getAsdObjects )
                    .flatMap( Collection::stream )
                    .filter( o -> o instanceof LNodeInputs )
                    .map( i -> ( ( LNodeInputs ) i ).getSourceRef() )
                    .flatMap( Collection::stream )
                    .filter( s -> sourceRefPath[1]
                            .equals( AsdUtilities.getSourceRefName( s, sourceRefPath[1].contains( "(" ) ) ) )
                    .toList();

            if( res.size() != 1 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                //         " SourceRef( name = ", sourceRefPath[1], " )" );
                return;
            }

            setRefersToSourceRef( res.get( 0 ) );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "InputVar refers to SourceRef( id = ", sourceRefPath[1], " )", " on line ",
                    getRefersToSourceRef().getLineNumber() );

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because inputName and inputUuid are missing" );
        }

    }

} //InputVarImpl
