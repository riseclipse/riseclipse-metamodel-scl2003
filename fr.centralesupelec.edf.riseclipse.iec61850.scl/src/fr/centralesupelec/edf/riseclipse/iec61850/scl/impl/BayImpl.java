/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BayImpl#getParentVoltageLevel <em>Parent Voltage Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BayImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BayImpl#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BayImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BayImpl extends EquipmentContainerImpl implements Bay {
    /**
     * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunction()
     * @generated
     * @ordered
     */
    protected EList< Function > function;

    /**
     * The cached value of the '{@link #getConnectivityNode() <em>Connectivity Node</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectivityNode()
     * @generated
     * @ordered
     */
    protected EList< ConnectivityNode > connectivityNode;

    /**
     * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConductingEquipment()
     * @generated
     * @ordered
     */
    protected EList< ConductingEquipment > conductingEquipment;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BayImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getBay();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageLevel getParentVoltageLevel() {
        if( eContainerFeatureID() != SclPackage.BAY__PARENT_VOLTAGE_LEVEL ) return null;
        return ( VoltageLevel ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentVoltageLevel( VoltageLevel newParentVoltageLevel, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentVoltageLevel, SclPackage.BAY__PARENT_VOLTAGE_LEVEL,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentVoltageLevel( VoltageLevel newParentVoltageLevel ) {
        if( newParentVoltageLevel != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.BAY__PARENT_VOLTAGE_LEVEL
                        && newParentVoltageLevel != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentVoltageLevel ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentVoltageLevel != null )
                msgs = ( ( InternalEObject ) newParentVoltageLevel ).eInverseAdd( this, SclPackage.VOLTAGE_LEVEL__BAY,
                        VoltageLevel.class, msgs );
            msgs = basicSetParentVoltageLevel( newParentVoltageLevel, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.BAY__PARENT_VOLTAGE_LEVEL,
                    newParentVoltageLevel, newParentVoltageLevel ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Function > getFunction() {
        if( function == null ) {
            function = new EObjectContainmentWithInverseEList.Unsettable< Function >( Function.class, this,
                    SclPackage.BAY__FUNCTION, SclPackage.FUNCTION__PARENT_BAY );
        }
        return function;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFunction() {
        if( function != null ) ( ( InternalEList.Unsettable< ? > ) function ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFunction() {
        return function != null && ( ( InternalEList.Unsettable< ? > ) function ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ConnectivityNode > getConnectivityNode() {
        if( connectivityNode == null ) {
            connectivityNode = new EObjectContainmentWithInverseEList.Unsettable< ConnectivityNode >(
                    ConnectivityNode.class, this, SclPackage.BAY__CONNECTIVITY_NODE,
                    SclPackage.CONNECTIVITY_NODE__PARENT_BAY );
        }
        return connectivityNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConnectivityNode() {
        if( connectivityNode != null ) ( ( InternalEList.Unsettable< ? > ) connectivityNode ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnectivityNode() {
        return connectivityNode != null && ( ( InternalEList.Unsettable< ? > ) connectivityNode ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ConductingEquipment > getConductingEquipment() {
        if( conductingEquipment == null ) {
            conductingEquipment = new EObjectContainmentWithInverseEList.Unsettable< ConductingEquipment >(
                    ConductingEquipment.class, this, SclPackage.BAY__CONDUCTING_EQUIPMENT,
                    SclPackage.CONDUCTING_EQUIPMENT__PARENT_BAY );
        }
        return conductingEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConductingEquipment() {
        if( conductingEquipment != null ) ( ( InternalEList.Unsettable< ? > ) conductingEquipment ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConductingEquipment() {
        return conductingEquipment != null && ( ( InternalEList.Unsettable< ? > ) conductingEquipment ).isSet();
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
        case SclPackage.BAY__PARENT_VOLTAGE_LEVEL:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentVoltageLevel( ( VoltageLevel ) otherEnd, msgs );
        case SclPackage.BAY__FUNCTION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFunction() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.BAY__CONNECTIVITY_NODE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConnectivityNode() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.BAY__CONDUCTING_EQUIPMENT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConductingEquipment() )
                    .basicAdd( otherEnd, msgs );
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
        case SclPackage.BAY__PARENT_VOLTAGE_LEVEL:
            return basicSetParentVoltageLevel( null, msgs );
        case SclPackage.BAY__FUNCTION:
            return ( ( InternalEList< ? > ) getFunction() ).basicRemove( otherEnd, msgs );
        case SclPackage.BAY__CONNECTIVITY_NODE:
            return ( ( InternalEList< ? > ) getConnectivityNode() ).basicRemove( otherEnd, msgs );
        case SclPackage.BAY__CONDUCTING_EQUIPMENT:
            return ( ( InternalEList< ? > ) getConductingEquipment() ).basicRemove( otherEnd, msgs );
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
        case SclPackage.BAY__PARENT_VOLTAGE_LEVEL:
            return eInternalContainer().eInverseRemove( this, SclPackage.VOLTAGE_LEVEL__BAY, VoltageLevel.class, msgs );
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
        case SclPackage.BAY__PARENT_VOLTAGE_LEVEL:
            return getParentVoltageLevel();
        case SclPackage.BAY__FUNCTION:
            return getFunction();
        case SclPackage.BAY__CONNECTIVITY_NODE:
            return getConnectivityNode();
        case SclPackage.BAY__CONDUCTING_EQUIPMENT:
            return getConductingEquipment();
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
        case SclPackage.BAY__PARENT_VOLTAGE_LEVEL:
            setParentVoltageLevel( ( VoltageLevel ) newValue );
            return;
        case SclPackage.BAY__FUNCTION:
            getFunction().clear();
            getFunction().addAll( ( Collection< ? extends Function > ) newValue );
            return;
        case SclPackage.BAY__CONNECTIVITY_NODE:
            getConnectivityNode().clear();
            getConnectivityNode().addAll( ( Collection< ? extends ConnectivityNode > ) newValue );
            return;
        case SclPackage.BAY__CONDUCTING_EQUIPMENT:
            getConductingEquipment().clear();
            getConductingEquipment().addAll( ( Collection< ? extends ConductingEquipment > ) newValue );
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
        case SclPackage.BAY__PARENT_VOLTAGE_LEVEL:
            setParentVoltageLevel( ( VoltageLevel ) null );
            return;
        case SclPackage.BAY__FUNCTION:
            unsetFunction();
            return;
        case SclPackage.BAY__CONNECTIVITY_NODE:
            unsetConnectivityNode();
            return;
        case SclPackage.BAY__CONDUCTING_EQUIPMENT:
            unsetConductingEquipment();
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
        case SclPackage.BAY__PARENT_VOLTAGE_LEVEL:
            return getParentVoltageLevel() != null;
        case SclPackage.BAY__FUNCTION:
            return isSetFunction();
        case SclPackage.BAY__CONNECTIVITY_NODE:
            return isSetConnectivityNode();
        case SclPackage.BAY__CONDUCTING_EQUIPMENT:
            return isSetConductingEquipment();
        }
        return super.eIsSet( featureID );
    }

} //BayImpl
