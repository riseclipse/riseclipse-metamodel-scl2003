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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubstationImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubstationImpl#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubstationImpl#getParentProcess <em>Parent Process</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubstationImpl#getParentSCL <em>Parent SCL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstationImpl extends EquipmentContainerImpl implements Substation {
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
     * The cached value of the '{@link #getVoltageLevel() <em>Voltage Level</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageLevel()
     * @generated
     * @ordered
     */
    protected EList< VoltageLevel > voltageLevel;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubstationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSubstation();
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
                    SclPackage.SUBSTATION__FUNCTION, SclPackage.FUNCTION__PARENT_SUBSTATION );
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
    public EList< VoltageLevel > getVoltageLevel() {
        if( voltageLevel == null ) {
            voltageLevel = new EObjectContainmentWithInverseEList.Unsettable< VoltageLevel >( VoltageLevel.class, this,
                    SclPackage.SUBSTATION__VOLTAGE_LEVEL, SclPackage.VOLTAGE_LEVEL__PARENT_SUBSTATION );
        }
        return voltageLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltageLevel() {
        if( voltageLevel != null ) ( ( InternalEList.Unsettable< ? > ) voltageLevel ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageLevel() {
        return voltageLevel != null && ( ( InternalEList.Unsettable< ? > ) voltageLevel ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public fr.centralesupelec.edf.riseclipse.iec61850.scl.Process getParentProcess() {
        if( eContainerFeatureID() != SclPackage.SUBSTATION__PARENT_PROCESS ) return null;
        return ( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentProcess(
            fr.centralesupelec.edf.riseclipse.iec61850.scl.Process newParentProcess, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentProcess, SclPackage.SUBSTATION__PARENT_PROCESS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentProcess( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process newParentProcess ) {
        if( newParentProcess != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SUBSTATION__PARENT_PROCESS && newParentProcess != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentProcess ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentProcess != null )
                msgs = ( ( InternalEObject ) newParentProcess ).eInverseAdd( this, SclPackage.PROCESS__SUBSTATION,
                        fr.centralesupelec.edf.riseclipse.iec61850.scl.Process.class, msgs );
            msgs = basicSetParentProcess( newParentProcess, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SUBSTATION__PARENT_PROCESS,
                    newParentProcess, newParentProcess ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SCL getParentSCL() {
        if( eContainerFeatureID() != SclPackage.SUBSTATION__PARENT_SCL ) return null;
        return ( SCL ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSCL( SCL newParentSCL, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSCL, SclPackage.SUBSTATION__PARENT_SCL, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSCL( SCL newParentSCL ) {
        if( newParentSCL != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SUBSTATION__PARENT_SCL && newParentSCL != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSCL ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentSCL != null )
                msgs = ( ( InternalEObject ) newParentSCL ).eInverseAdd( this, SclPackage.SCL__SUBSTATION, SCL.class,
                        msgs );
            msgs = basicSetParentSCL( newParentSCL, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SUBSTATION__PARENT_SCL, newParentSCL,
                    newParentSCL ) );
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
        case SclPackage.SUBSTATION__FUNCTION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFunction() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.SUBSTATION__VOLTAGE_LEVEL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getVoltageLevel() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.SUBSTATION__PARENT_PROCESS:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentProcess( ( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process ) otherEnd, msgs );
        case SclPackage.SUBSTATION__PARENT_SCL:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentSCL( ( SCL ) otherEnd, msgs );
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
        case SclPackage.SUBSTATION__FUNCTION:
            return ( ( InternalEList< ? > ) getFunction() ).basicRemove( otherEnd, msgs );
        case SclPackage.SUBSTATION__VOLTAGE_LEVEL:
            return ( ( InternalEList< ? > ) getVoltageLevel() ).basicRemove( otherEnd, msgs );
        case SclPackage.SUBSTATION__PARENT_PROCESS:
            return basicSetParentProcess( null, msgs );
        case SclPackage.SUBSTATION__PARENT_SCL:
            return basicSetParentSCL( null, msgs );
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
        case SclPackage.SUBSTATION__PARENT_PROCESS:
            return eInternalContainer().eInverseRemove( this, SclPackage.PROCESS__SUBSTATION,
                    fr.centralesupelec.edf.riseclipse.iec61850.scl.Process.class, msgs );
        case SclPackage.SUBSTATION__PARENT_SCL:
            return eInternalContainer().eInverseRemove( this, SclPackage.SCL__SUBSTATION, SCL.class, msgs );
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
        case SclPackage.SUBSTATION__FUNCTION:
            return getFunction();
        case SclPackage.SUBSTATION__VOLTAGE_LEVEL:
            return getVoltageLevel();
        case SclPackage.SUBSTATION__PARENT_PROCESS:
            return getParentProcess();
        case SclPackage.SUBSTATION__PARENT_SCL:
            return getParentSCL();
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
        case SclPackage.SUBSTATION__FUNCTION:
            getFunction().clear();
            getFunction().addAll( ( Collection< ? extends Function > ) newValue );
            return;
        case SclPackage.SUBSTATION__VOLTAGE_LEVEL:
            getVoltageLevel().clear();
            getVoltageLevel().addAll( ( Collection< ? extends VoltageLevel > ) newValue );
            return;
        case SclPackage.SUBSTATION__PARENT_PROCESS:
            setParentProcess( ( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process ) newValue );
            return;
        case SclPackage.SUBSTATION__PARENT_SCL:
            setParentSCL( ( SCL ) newValue );
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
        case SclPackage.SUBSTATION__FUNCTION:
            unsetFunction();
            return;
        case SclPackage.SUBSTATION__VOLTAGE_LEVEL:
            unsetVoltageLevel();
            return;
        case SclPackage.SUBSTATION__PARENT_PROCESS:
            setParentProcess( ( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process ) null );
            return;
        case SclPackage.SUBSTATION__PARENT_SCL:
            setParentSCL( ( SCL ) null );
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
        case SclPackage.SUBSTATION__FUNCTION:
            return isSetFunction();
        case SclPackage.SUBSTATION__VOLTAGE_LEVEL:
            return isSetVoltageLevel();
        case SclPackage.SUBSTATION__PARENT_PROCESS:
            return getParentProcess() != null;
        case SclPackage.SUBSTATION__PARENT_SCL:
            return getParentSCL() != null;
        }
        return super.eIsSet( featureID );
    }

} //SubstationImpl
