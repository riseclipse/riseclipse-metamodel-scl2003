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
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVarRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVarRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Description Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionRefImpl#getInputVarRef <em>Input Var Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionRefImpl#getOutputVarRef <em>Output Var Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionRefImpl#getBehaviorDescription <em>Behavior Description</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionRefImpl#getBehaviorDescriptionUuid <em>Behavior Description Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionRefImpl#getParentFunctionRoleContent <em>Parent Function Role Content</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionRefImpl#getRefersToBehaviorDescription <em>Refers To Behavior Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorDescriptionRefImpl extends FunctionalVariantRefContainerImpl implements BehaviorDescriptionRef {
    /**
     * The cached value of the '{@link #getInputVarRef() <em>Input Var Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputVarRef()
     * @generated
     * @ordered
     */
    protected EList< InputVarRef > inputVarRef;

    /**
     * The cached value of the '{@link #getOutputVarRef() <em>Output Var Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputVarRef()
     * @generated
     * @ordered
     */
    protected EList< OutputVarRef > outputVarRef;

    /**
     * The default value of the '{@link #getBehaviorDescription() <em>Behavior Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehaviorDescription()
     * @generated
     * @ordered
     */
    protected static final String BEHAVIOR_DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBehaviorDescription() <em>Behavior Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehaviorDescription()
     * @generated
     * @ordered
     */
    protected String behaviorDescription = BEHAVIOR_DESCRIPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getBehaviorDescriptionUuid() <em>Behavior Description Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehaviorDescriptionUuid()
     * @generated
     * @ordered
     */
    protected static final String BEHAVIOR_DESCRIPTION_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBehaviorDescriptionUuid() <em>Behavior Description Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehaviorDescriptionUuid()
     * @generated
     * @ordered
     */
    protected String behaviorDescriptionUuid = BEHAVIOR_DESCRIPTION_UUID_EDEFAULT;

    /**
     * The cached value of the '{@link #getRefersToBehaviorDescription() <em>Refers To Behavior Description</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToBehaviorDescription()
     * @generated
     * @ordered
     */
    protected BehaviorDescription refersToBehaviorDescription;

    /**
     * This is true if the Refers To Behavior Description reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToBehaviorDescriptionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BehaviorDescriptionRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getBehaviorDescriptionRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< InputVarRef > getInputVarRef() {
        if( inputVarRef == null ) {
            inputVarRef = new EObjectContainmentWithInverseEList.Unsettable< >( InputVarRef.class, this,
                    AsdPackage.BEHAVIOR_DESCRIPTION_REF__INPUT_VAR_REF,
                    AsdPackage.INPUT_VAR_REF__PARENT_BEHAVIOR_DESCRIPTION_REF );
        }
        return inputVarRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInputVarRef() {
        if( inputVarRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) inputVarRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInputVarRef() {
        return inputVarRef != null && ( ( InternalEList.Unsettable< ? > ) inputVarRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OutputVarRef > getOutputVarRef() {
        if( outputVarRef == null ) {
            outputVarRef = new EObjectContainmentWithInverseEList.Unsettable< >( OutputVarRef.class, this,
                    AsdPackage.BEHAVIOR_DESCRIPTION_REF__OUTPUT_VAR_REF,
                    AsdPackage.OUTPUT_VAR_REF__PARENT_BEHAVIOR_DESCRIPTION_REF );
        }
        return outputVarRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOutputVarRef() {
        if( outputVarRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) outputVarRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutputVarRef() {
        return outputVarRef != null && ( ( InternalEList.Unsettable< ? > ) outputVarRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBehaviorDescription() {
        return behaviorDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBehaviorDescription( String newBehaviorDescription ) {
        String oldBehaviorDescription = behaviorDescription;
        behaviorDescription = newBehaviorDescription;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.BEHAVIOR_DESCRIPTION_REF__BEHAVIOR_DESCRIPTION, oldBehaviorDescription,
                    behaviorDescription ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBehaviorDescriptionUuid() {
        return behaviorDescriptionUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBehaviorDescriptionUuid( String newBehaviorDescriptionUuid ) {
        String oldBehaviorDescriptionUuid = behaviorDescriptionUuid;
        behaviorDescriptionUuid = newBehaviorDescriptionUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.BEHAVIOR_DESCRIPTION_REF__BEHAVIOR_DESCRIPTION_UUID, oldBehaviorDescriptionUuid,
                    behaviorDescriptionUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionRoleContent getParentFunctionRoleContent() {
        if( eContainerFeatureID() != AsdPackage.BEHAVIOR_DESCRIPTION_REF__PARENT_FUNCTION_ROLE_CONTENT ) {
            return null;
        }
        return ( FunctionRoleContent ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentFunctionRoleContent( FunctionRoleContent newParentFunctionRoleContent,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentFunctionRoleContent,
                AsdPackage.BEHAVIOR_DESCRIPTION_REF__PARENT_FUNCTION_ROLE_CONTENT, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentFunctionRoleContent( FunctionRoleContent newParentFunctionRoleContent ) {
        if( newParentFunctionRoleContent != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.BEHAVIOR_DESCRIPTION_REF__PARENT_FUNCTION_ROLE_CONTENT
                        && newParentFunctionRoleContent != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentFunctionRoleContent ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentFunctionRoleContent != null ) {
                msgs = ( ( InternalEObject ) newParentFunctionRoleContent ).eInverseAdd( this,
                        AsdPackage.FUNCTION_ROLE_CONTENT__BEHAVIOR_DESCRIPTION_REF, FunctionRoleContent.class, msgs );
            }
            msgs = basicSetParentFunctionRoleContent( newParentFunctionRoleContent, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.BEHAVIOR_DESCRIPTION_REF__PARENT_FUNCTION_ROLE_CONTENT, newParentFunctionRoleContent,
                    newParentFunctionRoleContent ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BehaviorDescription getRefersToBehaviorDescription() {
        if( refersToBehaviorDescription != null && refersToBehaviorDescription.eIsProxy() ) {
            InternalEObject oldRefersToBehaviorDescription = ( InternalEObject ) refersToBehaviorDescription;
            refersToBehaviorDescription = ( BehaviorDescription ) eResolveProxy( oldRefersToBehaviorDescription );
            if( refersToBehaviorDescription != oldRefersToBehaviorDescription ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.BEHAVIOR_DESCRIPTION_REF__REFERS_TO_BEHAVIOR_DESCRIPTION,
                            oldRefersToBehaviorDescription, refersToBehaviorDescription ) );
                }
            }
        }
        return refersToBehaviorDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorDescription basicGetRefersToBehaviorDescription() {
        return refersToBehaviorDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToBehaviorDescription( BehaviorDescription newRefersToBehaviorDescription,
            NotificationChain msgs ) {
        BehaviorDescription oldRefersToBehaviorDescription = refersToBehaviorDescription;
        refersToBehaviorDescription = newRefersToBehaviorDescription;
        boolean oldRefersToBehaviorDescriptionESet = refersToBehaviorDescriptionESet;
        refersToBehaviorDescriptionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.BEHAVIOR_DESCRIPTION_REF__REFERS_TO_BEHAVIOR_DESCRIPTION, oldRefersToBehaviorDescription,
                    newRefersToBehaviorDescription, !oldRefersToBehaviorDescriptionESet );
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
    public void setRefersToBehaviorDescription( BehaviorDescription newRefersToBehaviorDescription ) {
        if( newRefersToBehaviorDescription != refersToBehaviorDescription ) {
            NotificationChain msgs = null;
            if( refersToBehaviorDescription != null ) {
                msgs = ( ( InternalEObject ) refersToBehaviorDescription ).eInverseRemove( this,
                        AsdPackage.BEHAVIOR_DESCRIPTION__REFERRED_BY_BEHAVIOR_DESCRIPTION_REF,
                        BehaviorDescription.class, msgs );
            }
            if( newRefersToBehaviorDescription != null ) {
                msgs = ( ( InternalEObject ) newRefersToBehaviorDescription ).eInverseAdd( this,
                        AsdPackage.BEHAVIOR_DESCRIPTION__REFERRED_BY_BEHAVIOR_DESCRIPTION_REF,
                        BehaviorDescription.class, msgs );
            }
            msgs = basicSetRefersToBehaviorDescription( newRefersToBehaviorDescription, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToBehaviorDescriptionESet = refersToBehaviorDescriptionESet;
            refersToBehaviorDescriptionESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.BEHAVIOR_DESCRIPTION_REF__REFERS_TO_BEHAVIOR_DESCRIPTION,
                        newRefersToBehaviorDescription, newRefersToBehaviorDescription,
                        !oldRefersToBehaviorDescriptionESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToBehaviorDescription( NotificationChain msgs ) {
        BehaviorDescription oldRefersToBehaviorDescription = refersToBehaviorDescription;
        refersToBehaviorDescription = null;
        boolean oldRefersToBehaviorDescriptionESet = refersToBehaviorDescriptionESet;
        refersToBehaviorDescriptionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.BEHAVIOR_DESCRIPTION_REF__REFERS_TO_BEHAVIOR_DESCRIPTION, oldRefersToBehaviorDescription,
                    null, oldRefersToBehaviorDescriptionESet );
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
    public void unsetRefersToBehaviorDescription() {
        if( refersToBehaviorDescription != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToBehaviorDescription ).eInverseRemove( this,
                    AsdPackage.BEHAVIOR_DESCRIPTION__REFERRED_BY_BEHAVIOR_DESCRIPTION_REF, BehaviorDescription.class,
                    msgs );
            msgs = basicUnsetRefersToBehaviorDescription( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToBehaviorDescriptionESet = refersToBehaviorDescriptionESet;
            refersToBehaviorDescriptionESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.BEHAVIOR_DESCRIPTION_REF__REFERS_TO_BEHAVIOR_DESCRIPTION, null, null,
                        oldRefersToBehaviorDescriptionESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToBehaviorDescription() {
        return refersToBehaviorDescriptionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__INPUT_VAR_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getInputVarRef() ).basicAdd( otherEnd,
                    msgs );
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__OUTPUT_VAR_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOutputVarRef() ).basicAdd( otherEnd,
                    msgs );
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentFunctionRoleContent( ( FunctionRoleContent ) otherEnd, msgs );
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__REFERS_TO_BEHAVIOR_DESCRIPTION:
            if( refersToBehaviorDescription != null ) {
                msgs = ( ( InternalEObject ) refersToBehaviorDescription ).eInverseRemove( this,
                        AsdPackage.BEHAVIOR_DESCRIPTION__REFERRED_BY_BEHAVIOR_DESCRIPTION_REF,
                        BehaviorDescription.class, msgs );
            }
            return basicSetRefersToBehaviorDescription( ( BehaviorDescription ) otherEnd, msgs );
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
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__INPUT_VAR_REF:
            return ( ( InternalEList< ? > ) getInputVarRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__OUTPUT_VAR_REF:
            return ( ( InternalEList< ? > ) getOutputVarRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return basicSetParentFunctionRoleContent( null, msgs );
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__REFERS_TO_BEHAVIOR_DESCRIPTION:
            return basicUnsetRefersToBehaviorDescription( msgs );
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
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return eInternalContainer().eInverseRemove( this,
                    AsdPackage.FUNCTION_ROLE_CONTENT__BEHAVIOR_DESCRIPTION_REF, FunctionRoleContent.class, msgs );
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
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__INPUT_VAR_REF:
            return getInputVarRef();
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__OUTPUT_VAR_REF:
            return getOutputVarRef();
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__BEHAVIOR_DESCRIPTION:
            return getBehaviorDescription();
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__BEHAVIOR_DESCRIPTION_UUID:
            return getBehaviorDescriptionUuid();
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return getParentFunctionRoleContent();
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__REFERS_TO_BEHAVIOR_DESCRIPTION:
            if( resolve ) {
                return getRefersToBehaviorDescription();
            }
            return basicGetRefersToBehaviorDescription();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__INPUT_VAR_REF:
            getInputVarRef().clear();
            getInputVarRef().addAll( ( Collection< ? extends InputVarRef > ) newValue );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__OUTPUT_VAR_REF:
            getOutputVarRef().clear();
            getOutputVarRef().addAll( ( Collection< ? extends OutputVarRef > ) newValue );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__BEHAVIOR_DESCRIPTION:
            setBehaviorDescription( ( String ) newValue );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__BEHAVIOR_DESCRIPTION_UUID:
            setBehaviorDescriptionUuid( ( String ) newValue );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            setParentFunctionRoleContent( ( FunctionRoleContent ) newValue );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__REFERS_TO_BEHAVIOR_DESCRIPTION:
            setRefersToBehaviorDescription( ( BehaviorDescription ) newValue );
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
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__INPUT_VAR_REF:
            unsetInputVarRef();
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__OUTPUT_VAR_REF:
            unsetOutputVarRef();
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__BEHAVIOR_DESCRIPTION:
            setBehaviorDescription( BEHAVIOR_DESCRIPTION_EDEFAULT );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__BEHAVIOR_DESCRIPTION_UUID:
            setBehaviorDescriptionUuid( BEHAVIOR_DESCRIPTION_UUID_EDEFAULT );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            setParentFunctionRoleContent( ( FunctionRoleContent ) null );
            return;
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__REFERS_TO_BEHAVIOR_DESCRIPTION:
            unsetRefersToBehaviorDescription();
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
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__INPUT_VAR_REF:
            return isSetInputVarRef();
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__OUTPUT_VAR_REF:
            return isSetOutputVarRef();
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__BEHAVIOR_DESCRIPTION:
            return BEHAVIOR_DESCRIPTION_EDEFAULT == null ? behaviorDescription != null
                    : !BEHAVIOR_DESCRIPTION_EDEFAULT.equals( behaviorDescription );
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__BEHAVIOR_DESCRIPTION_UUID:
            return BEHAVIOR_DESCRIPTION_UUID_EDEFAULT == null ? behaviorDescriptionUuid != null
                    : !BEHAVIOR_DESCRIPTION_UUID_EDEFAULT.equals( behaviorDescriptionUuid );
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return getParentFunctionRoleContent() != null;
        case AsdPackage.BEHAVIOR_DESCRIPTION_REF__REFERS_TO_BEHAVIOR_DESCRIPTION:
            return isSetRefersToBehaviorDescription();
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
        result.append( " (behaviorDescription: " );
        result.append( behaviorDescription );
        result.append( ", behaviorDescriptionUuid: " );
        result.append( behaviorDescriptionUuid );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "BehaviorDescriptionRef.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from BehaviorDescriptionRef: ";
        doBuildExplicitLinkWithBehaviorDescription( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithBehaviorDescription( @NonNull IRiseClipseConsole console,
            @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for BehaviorDescription) ";

        SCL scl = AsdUtilities.getSCL( this );

        if( getBehaviorDescriptionUuid() != null && !getBehaviorDescriptionUuid().isEmpty() ) {
            List< BehaviorDescription > refersToBehaviorDescription = new ArrayList<>();

            TreeIterator< EObject > it = scl.eAllContents();
            while( it.hasNext() ) {
                EObject o = it.next();
                if( o instanceof SourceRef && getBehaviorDescriptionUuid().equals( ( ( SourceRef ) o ).getUuid() ) ) {
                    refersToBehaviorDescription.add( ( BehaviorDescription ) o );
                }
            }

            if( refersToBehaviorDescription.size() == 1 ) {
                setRefersToBehaviorDescription( refersToBehaviorDescription.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "BehaviorDescriptionRef refers to BehaviorDescription( id = ", getBehaviorDescriptionUuid(),
                        " ) on line ",
                        getRefersToBehaviorDescription().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( refersToBehaviorDescription.size() == 0 ) ? "cannot find" : "found several" ),
                //         " BehaviorDescription( id = ", getBehaviorDescriptionUuid(), " )" );
            }

        }
        else if( getBehaviorDescription() != null && !getBehaviorDescription().isEmpty() ) {
            String[] behaviorDescriptionPath = getBehaviorDescription().split( "/" );

            if( behaviorDescriptionPath.length < 2 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, "inexpected behaviorDescription format: ", getBehaviorDescription() );
                return;
            }

            Pair< ? extends BaseElement, Integer > behaviorParent;
            if( behaviorDescriptionPath.length == 2 ) {
                behaviorParent = AsdUtilities.getLNodeContainer(
                        scl,
                        Arrays.copyOfRange( behaviorDescriptionPath, 0, behaviorDescriptionPath.length - 1 ) );
            }
            else {
                Pair< LNodeContainer, Integer > parentContainer = AsdUtilities.getLNodeContainer(
                        scl,
                        Arrays.copyOfRange( behaviorDescriptionPath, 0, behaviorDescriptionPath.length - 2 ) );

                if( parentContainer.getLeft() != null ) {
                    // Le parent direct peut être un LNodeContainer ou un LNode
                    Pair< LNodeContainer, Integer > lnodeContainer = AsdUtilities.getLNodeContainer(
                            parentContainer.getLeft(),
                            new String[] { behaviorDescriptionPath[behaviorDescriptionPath.length - 2] } );

                    Pair< LNode, Integer > lnode = AsdUtilities.getLNode(
                            parentContainer.getLeft(),
                            new String[] { behaviorDescriptionPath[behaviorDescriptionPath.length - 2] } );

                    if( lnodeContainer.getRight() + lnode.getRight() != 1 ) {
                        // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        //         messagePrefix, ( ( lnodeContainer.getRight() + lnode.getRight() == 0 ) ? "cannot find " : "found several " ),
                        //         "BehaviorDescription( name = ", behaviorDescriptionPath[behaviorDescriptionPath.length - 1], " )" );
                        return;
                    }
                    else if( lnodeContainer.getLeft() != null ) {
                        behaviorParent = lnodeContainer;
                    }
                    else {
                        behaviorParent = lnode;
                    }
                }
                else {
                    // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    //         messagePrefix, ( ( parentContainer.getRight() == 0 ) ? "cannot find " : "found several " ),
                    //         "BehaviorDescription( name = ", behaviorDescriptionPath[behaviorDescriptionPath.length - 1], " )" );
                    return;
                }
            }

            if( behaviorParent.getLeft() != null ) {
                String name = behaviorDescriptionPath[behaviorDescriptionPath.length - 1];
                List< BehaviorDescription > res = behaviorParent.getLeft().getPrivate()
                        .stream()
                        .filter( p -> "eIEC61850-6-100".equals( p.getType() ) )
                        .map( Private::getAsdObjects )
                        .flatMap( Collection::stream )
                        .filter( o -> o instanceof BehaviorDescription
                                && name.equals( ( ( BehaviorDescription ) o ).getName() ) )
                        .map( b -> ( BehaviorDescription ) b )
                        .toList();

                if( res.size() == 1 ) {
                    setRefersToBehaviorDescription( res.get( 0 ) );
                    console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                            "BehaviorDescriptionRef refers to BehaviorDescription( id = ", getBehaviorDescription(),
                            " ) on line ",
                            getRefersToBehaviorDescription().getLineNumber() );
                }
                else {
                    // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    //         messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                    //         " BehaviorDescription( name = ", getBehaviorDescription(), " )" );
                }

            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( refersToFunction.size() == 0 ) ? "cannot find" : "found several" ),
                //         " BehaviorDescription( name = ", getFunction(), " )" );
            }

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because function and functionUuid are missing" );
        }

    }

} //BehaviorDescriptionRefImpl
