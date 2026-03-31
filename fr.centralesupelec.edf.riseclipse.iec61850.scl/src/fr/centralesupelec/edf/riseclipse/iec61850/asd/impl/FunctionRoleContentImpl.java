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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Role Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleContentImpl#getFunctionRef <em>Function Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleContentImpl#getBehaviorDescriptionRef <em>Behavior Description Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleContentImpl#getProcessResourceRef <em>Process Resource Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleContentImpl#getVariableRef <em>Variable Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleContentImpl#getFunctionCategoryRef <em>Function Category Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleContentImpl#getPowerSystemRelationRef <em>Power System Relation Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleContentImpl#getRoleInst <em>Role Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleContentImpl#getParentFunctionRole <em>Parent Function Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionRoleContentImpl extends BaseExtensionElementImpl implements FunctionRoleContent {
    /**
     * The cached value of the '{@link #getFunctionRef() <em>Function Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionRef()
     * @generated
     * @ordered
     */
    protected EList< FunctionRef > functionRef;

    /**
     * The cached value of the '{@link #getBehaviorDescriptionRef() <em>Behavior Description Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehaviorDescriptionRef()
     * @generated
     * @ordered
     */
    protected EList< BehaviorDescriptionRef > behaviorDescriptionRef;

    /**
     * The cached value of the '{@link #getProcessResourceRef() <em>Process Resource Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessResourceRef()
     * @generated
     * @ordered
     */
    protected EList< ProcessResourceRef > processResourceRef;

    /**
     * The cached value of the '{@link #getVariableRef() <em>Variable Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariableRef()
     * @generated
     * @ordered
     */
    protected EList< VariableRef > variableRef;

    /**
     * The cached value of the '{@link #getFunctionCategoryRef() <em>Function Category Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionCategoryRef()
     * @generated
     * @ordered
     */
    protected EList< FunctionCategoryRef > functionCategoryRef;

    /**
     * The cached value of the '{@link #getPowerSystemRelationRef() <em>Power System Relation Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemRelationRef()
     * @generated
     * @ordered
     */
    protected EList< PowerSystemRelationRef > powerSystemRelationRef;

    /**
     * The default value of the '{@link #getRoleInst() <em>Role Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoleInst()
     * @generated
     * @ordered
     */
    protected static final int ROLE_INST_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getRoleInst() <em>Role Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoleInst()
     * @generated
     * @ordered
     */
    protected int roleInst = ROLE_INST_EDEFAULT;

    /**
     * This is true if the Role Inst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean roleInstESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FunctionRoleContentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getFunctionRoleContent();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FunctionRef > getFunctionRef() {
        if( functionRef == null ) {
            functionRef = new EObjectContainmentWithInverseEList.Unsettable< >( FunctionRef.class, this,
                    AsdPackage.FUNCTION_ROLE_CONTENT__FUNCTION_REF,
                    AsdPackage.FUNCTION_REF__PARENT_FUNCTION_ROLE_CONTENT );
        }
        return functionRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFunctionRef() {
        if( functionRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) functionRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFunctionRef() {
        return functionRef != null && ( ( InternalEList.Unsettable< ? > ) functionRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< BehaviorDescriptionRef > getBehaviorDescriptionRef() {
        if( behaviorDescriptionRef == null ) {
            behaviorDescriptionRef = new EObjectContainmentWithInverseEList.Unsettable< >(
                    BehaviorDescriptionRef.class, this, AsdPackage.FUNCTION_ROLE_CONTENT__BEHAVIOR_DESCRIPTION_REF,
                    AsdPackage.BEHAVIOR_DESCRIPTION_REF__PARENT_FUNCTION_ROLE_CONTENT );
        }
        return behaviorDescriptionRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBehaviorDescriptionRef() {
        if( behaviorDescriptionRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) behaviorDescriptionRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBehaviorDescriptionRef() {
        return behaviorDescriptionRef != null && ( ( InternalEList.Unsettable< ? > ) behaviorDescriptionRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ProcessResourceRef > getProcessResourceRef() {
        if( processResourceRef == null ) {
            processResourceRef = new EObjectContainmentWithInverseEList.Unsettable< >(
                    ProcessResourceRef.class, this, AsdPackage.FUNCTION_ROLE_CONTENT__PROCESS_RESOURCE_REF,
                    AsdPackage.PROCESS_RESOURCE_REF__PARENT_FUNCTION_ROLE_CONTENT );
        }
        return processResourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProcessResourceRef() {
        if( processResourceRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) processResourceRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProcessResourceRef() {
        return processResourceRef != null && ( ( InternalEList.Unsettable< ? > ) processResourceRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< VariableRef > getVariableRef() {
        if( variableRef == null ) {
            variableRef = new EObjectContainmentWithInverseEList.Unsettable< >( VariableRef.class, this,
                    AsdPackage.FUNCTION_ROLE_CONTENT__VARIABLE_REF,
                    AsdPackage.VARIABLE_REF__PARENT_FUNCTION_ROLE_CONTENT );
        }
        return variableRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVariableRef() {
        if( variableRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) variableRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVariableRef() {
        return variableRef != null && ( ( InternalEList.Unsettable< ? > ) variableRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FunctionCategoryRef > getFunctionCategoryRef() {
        if( functionCategoryRef == null ) {
            functionCategoryRef = new EObjectContainmentWithInverseEList.Unsettable< >(
                    FunctionCategoryRef.class, this, AsdPackage.FUNCTION_ROLE_CONTENT__FUNCTION_CATEGORY_REF,
                    AsdPackage.FUNCTION_CATEGORY_REF__PARENT_FUNCTION_ROLE_CONTENT );
        }
        return functionCategoryRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFunctionCategoryRef() {
        if( functionCategoryRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) functionCategoryRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFunctionCategoryRef() {
        return functionCategoryRef != null && ( ( InternalEList.Unsettable< ? > ) functionCategoryRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PowerSystemRelationRef > getPowerSystemRelationRef() {
        if( powerSystemRelationRef == null ) {
            powerSystemRelationRef = new EObjectContainmentWithInverseEList.Unsettable< >(
                    PowerSystemRelationRef.class, this, AsdPackage.FUNCTION_ROLE_CONTENT__POWER_SYSTEM_RELATION_REF,
                    AsdPackage.POWER_SYSTEM_RELATION_REF__PARENT_FUNCTION_ROLE_CONTENT );
        }
        return powerSystemRelationRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPowerSystemRelationRef() {
        if( powerSystemRelationRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) powerSystemRelationRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerSystemRelationRef() {
        return powerSystemRelationRef != null && ( ( InternalEList.Unsettable< ? > ) powerSystemRelationRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getRoleInst() {
        return roleInst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRoleInst( int newRoleInst ) {
        int oldRoleInst = roleInst;
        roleInst = newRoleInst;
        boolean oldRoleInstESet = roleInstESet;
        roleInstESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_ROLE_CONTENT__ROLE_INST,
                    oldRoleInst, roleInst, !oldRoleInstESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRoleInst() {
        int oldRoleInst = roleInst;
        boolean oldRoleInstESet = roleInstESet;
        roleInst = ROLE_INST_EDEFAULT;
        roleInstESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.FUNCTION_ROLE_CONTENT__ROLE_INST,
                    oldRoleInst, ROLE_INST_EDEFAULT, oldRoleInstESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRoleInst() {
        return roleInstESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionRole getParentFunctionRole() {
        if( eContainerFeatureID() != AsdPackage.FUNCTION_ROLE_CONTENT__PARENT_FUNCTION_ROLE ) {
            return null;
        }
        return ( FunctionRole ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentFunctionRole( FunctionRole newParentFunctionRole, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentFunctionRole,
                AsdPackage.FUNCTION_ROLE_CONTENT__PARENT_FUNCTION_ROLE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentFunctionRole( FunctionRole newParentFunctionRole ) {
        if( newParentFunctionRole != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.FUNCTION_ROLE_CONTENT__PARENT_FUNCTION_ROLE
                        && newParentFunctionRole != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentFunctionRole ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentFunctionRole != null ) {
                msgs = ( ( InternalEObject ) newParentFunctionRole ).eInverseAdd( this,
                        AsdPackage.FUNCTION_ROLE__FUNCTION_ROLE_CONTENT, FunctionRole.class, msgs );
            }
            msgs = basicSetParentFunctionRole( newParentFunctionRole, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.FUNCTION_ROLE_CONTENT__PARENT_FUNCTION_ROLE, newParentFunctionRole,
                    newParentFunctionRole ) );
        }
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
        case AsdPackage.FUNCTION_ROLE_CONTENT__FUNCTION_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFunctionRef() ).basicAdd( otherEnd,
                    msgs );
        case AsdPackage.FUNCTION_ROLE_CONTENT__BEHAVIOR_DESCRIPTION_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getBehaviorDescriptionRef() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.FUNCTION_ROLE_CONTENT__PROCESS_RESOURCE_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProcessResourceRef() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.FUNCTION_ROLE_CONTENT__VARIABLE_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getVariableRef() ).basicAdd( otherEnd,
                    msgs );
        case AsdPackage.FUNCTION_ROLE_CONTENT__FUNCTION_CATEGORY_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFunctionCategoryRef() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.FUNCTION_ROLE_CONTENT__POWER_SYSTEM_RELATION_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPowerSystemRelationRef() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.FUNCTION_ROLE_CONTENT__PARENT_FUNCTION_ROLE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentFunctionRole( ( FunctionRole ) otherEnd, msgs );
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
        case AsdPackage.FUNCTION_ROLE_CONTENT__FUNCTION_REF:
            return ( ( InternalEList< ? > ) getFunctionRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.FUNCTION_ROLE_CONTENT__BEHAVIOR_DESCRIPTION_REF:
            return ( ( InternalEList< ? > ) getBehaviorDescriptionRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.FUNCTION_ROLE_CONTENT__PROCESS_RESOURCE_REF:
            return ( ( InternalEList< ? > ) getProcessResourceRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.FUNCTION_ROLE_CONTENT__VARIABLE_REF:
            return ( ( InternalEList< ? > ) getVariableRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.FUNCTION_ROLE_CONTENT__FUNCTION_CATEGORY_REF:
            return ( ( InternalEList< ? > ) getFunctionCategoryRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.FUNCTION_ROLE_CONTENT__POWER_SYSTEM_RELATION_REF:
            return ( ( InternalEList< ? > ) getPowerSystemRelationRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.FUNCTION_ROLE_CONTENT__PARENT_FUNCTION_ROLE:
            return basicSetParentFunctionRole( null, msgs );
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
        case AsdPackage.FUNCTION_ROLE_CONTENT__PARENT_FUNCTION_ROLE:
            return eInternalContainer().eInverseRemove( this, AsdPackage.FUNCTION_ROLE__FUNCTION_ROLE_CONTENT,
                    FunctionRole.class, msgs );
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
        case AsdPackage.FUNCTION_ROLE_CONTENT__FUNCTION_REF:
            return getFunctionRef();
        case AsdPackage.FUNCTION_ROLE_CONTENT__BEHAVIOR_DESCRIPTION_REF:
            return getBehaviorDescriptionRef();
        case AsdPackage.FUNCTION_ROLE_CONTENT__PROCESS_RESOURCE_REF:
            return getProcessResourceRef();
        case AsdPackage.FUNCTION_ROLE_CONTENT__VARIABLE_REF:
            return getVariableRef();
        case AsdPackage.FUNCTION_ROLE_CONTENT__FUNCTION_CATEGORY_REF:
            return getFunctionCategoryRef();
        case AsdPackage.FUNCTION_ROLE_CONTENT__POWER_SYSTEM_RELATION_REF:
            return getPowerSystemRelationRef();
        case AsdPackage.FUNCTION_ROLE_CONTENT__ROLE_INST:
            return getRoleInst();
        case AsdPackage.FUNCTION_ROLE_CONTENT__PARENT_FUNCTION_ROLE:
            return getParentFunctionRole();
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
        case AsdPackage.FUNCTION_ROLE_CONTENT__FUNCTION_REF:
            getFunctionRef().clear();
            getFunctionRef().addAll( ( Collection< ? extends FunctionRef > ) newValue );
            return;
        case AsdPackage.FUNCTION_ROLE_CONTENT__BEHAVIOR_DESCRIPTION_REF:
            getBehaviorDescriptionRef().clear();
            getBehaviorDescriptionRef().addAll( ( Collection< ? extends BehaviorDescriptionRef > ) newValue );
            return;
        case AsdPackage.FUNCTION_ROLE_CONTENT__PROCESS_RESOURCE_REF:
            getProcessResourceRef().clear();
            getProcessResourceRef().addAll( ( Collection< ? extends ProcessResourceRef > ) newValue );
            return;
        case AsdPackage.FUNCTION_ROLE_CONTENT__VARIABLE_REF:
            getVariableRef().clear();
            getVariableRef().addAll( ( Collection< ? extends VariableRef > ) newValue );
            return;
        case AsdPackage.FUNCTION_ROLE_CONTENT__FUNCTION_CATEGORY_REF:
            getFunctionCategoryRef().clear();
            getFunctionCategoryRef().addAll( ( Collection< ? extends FunctionCategoryRef > ) newValue );
            return;
        case AsdPackage.FUNCTION_ROLE_CONTENT__POWER_SYSTEM_RELATION_REF:
            getPowerSystemRelationRef().clear();
            getPowerSystemRelationRef().addAll( ( Collection< ? extends PowerSystemRelationRef > ) newValue );
            return;
        case AsdPackage.FUNCTION_ROLE_CONTENT__ROLE_INST:
            setRoleInst( ( Integer ) newValue );
            return;
        case AsdPackage.FUNCTION_ROLE_CONTENT__PARENT_FUNCTION_ROLE:
            setParentFunctionRole( ( FunctionRole ) newValue );
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
        case AsdPackage.FUNCTION_ROLE_CONTENT__FUNCTION_REF:
            unsetFunctionRef();
            return;
        case AsdPackage.FUNCTION_ROLE_CONTENT__BEHAVIOR_DESCRIPTION_REF:
            unsetBehaviorDescriptionRef();
            return;
        case AsdPackage.FUNCTION_ROLE_CONTENT__PROCESS_RESOURCE_REF:
            unsetProcessResourceRef();
            return;
        case AsdPackage.FUNCTION_ROLE_CONTENT__VARIABLE_REF:
            unsetVariableRef();
            return;
        case AsdPackage.FUNCTION_ROLE_CONTENT__FUNCTION_CATEGORY_REF:
            unsetFunctionCategoryRef();
            return;
        case AsdPackage.FUNCTION_ROLE_CONTENT__POWER_SYSTEM_RELATION_REF:
            unsetPowerSystemRelationRef();
            return;
        case AsdPackage.FUNCTION_ROLE_CONTENT__ROLE_INST:
            unsetRoleInst();
            return;
        case AsdPackage.FUNCTION_ROLE_CONTENT__PARENT_FUNCTION_ROLE:
            setParentFunctionRole( ( FunctionRole ) null );
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
        case AsdPackage.FUNCTION_ROLE_CONTENT__FUNCTION_REF:
            return isSetFunctionRef();
        case AsdPackage.FUNCTION_ROLE_CONTENT__BEHAVIOR_DESCRIPTION_REF:
            return isSetBehaviorDescriptionRef();
        case AsdPackage.FUNCTION_ROLE_CONTENT__PROCESS_RESOURCE_REF:
            return isSetProcessResourceRef();
        case AsdPackage.FUNCTION_ROLE_CONTENT__VARIABLE_REF:
            return isSetVariableRef();
        case AsdPackage.FUNCTION_ROLE_CONTENT__FUNCTION_CATEGORY_REF:
            return isSetFunctionCategoryRef();
        case AsdPackage.FUNCTION_ROLE_CONTENT__POWER_SYSTEM_RELATION_REF:
            return isSetPowerSystemRelationRef();
        case AsdPackage.FUNCTION_ROLE_CONTENT__ROLE_INST:
            return isSetRoleInst();
        case AsdPackage.FUNCTION_ROLE_CONTENT__PARENT_FUNCTION_ROLE:
            return getParentFunctionRole() != null;
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
        result.append( " (roleInst: " );
        if( roleInstESet ) {
            result.append( roleInst );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //FunctionRoleContentImpl
