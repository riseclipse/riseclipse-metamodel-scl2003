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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Line;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConductingEquipmentImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConductingEquipmentImpl#getParentBay <em>Parent Bay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConductingEquipmentImpl#getParentFunction <em>Parent Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConductingEquipmentImpl#getParentSubFunction <em>Parent Sub Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConductingEquipmentImpl#getEqFunction <em>Eq Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConductingEquipmentImpl#getParentLine <em>Parent Line</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConductingEquipmentImpl#getParentProcess <em>Parent Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConductingEquipmentImpl extends AbstractConductingEquipmentImpl implements ConductingEquipment {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The cached value of the '{@link #getEqFunction() <em>Eq Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEqFunction()
     * @generated
     * @ordered
     */
    protected EList< EqFunction > eqFunction;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConductingEquipmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getConductingEquipment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CONDUCTING_EQUIPMENT__TYPE, oldType,
                    type, !oldTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CONDUCTING_EQUIPMENT__TYPE, oldType,
                    TYPE_EDEFAULT, oldTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Bay getParentBay() {
        if( eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__PARENT_BAY ) {
            return null;
        }
        return ( Bay ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentBay( Bay newParentBay, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentBay, SclPackage.CONDUCTING_EQUIPMENT__PARENT_BAY,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentBay( Bay newParentBay ) {
        if( newParentBay != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__PARENT_BAY && newParentBay != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentBay ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentBay != null ) {
                msgs = ( ( InternalEObject ) newParentBay ).eInverseAdd( this, SclPackage.BAY__CONDUCTING_EQUIPMENT,
                        Bay.class, msgs );
            }
            msgs = basicSetParentBay( newParentBay, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CONDUCTING_EQUIPMENT__PARENT_BAY,
                    newParentBay, newParentBay ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Function getParentFunction() {
        if( eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__PARENT_FUNCTION ) {
            return null;
        }
        return ( Function ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentFunction( Function newParentFunction, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentFunction,
                SclPackage.CONDUCTING_EQUIPMENT__PARENT_FUNCTION, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentFunction( Function newParentFunction ) {
        if( newParentFunction != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__PARENT_FUNCTION
                        && newParentFunction != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentFunction ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentFunction != null ) {
                msgs = ( ( InternalEObject ) newParentFunction ).eInverseAdd( this,
                        SclPackage.FUNCTION__CONDUCTING_EQUIPMENT, Function.class, msgs );
            }
            msgs = basicSetParentFunction( newParentFunction, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CONDUCTING_EQUIPMENT__PARENT_FUNCTION,
                    newParentFunction, newParentFunction ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubFunction getParentSubFunction() {
        if( eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__PARENT_SUB_FUNCTION ) {
            return null;
        }
        return ( SubFunction ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSubFunction( SubFunction newParentSubFunction, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSubFunction,
                SclPackage.CONDUCTING_EQUIPMENT__PARENT_SUB_FUNCTION, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSubFunction( SubFunction newParentSubFunction ) {
        if( newParentSubFunction != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__PARENT_SUB_FUNCTION
                        && newParentSubFunction != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSubFunction ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentSubFunction != null ) {
                msgs = ( ( InternalEObject ) newParentSubFunction ).eInverseAdd( this,
                        SclPackage.SUB_FUNCTION__CONDUCTING_EQUIPMENT, SubFunction.class, msgs );
            }
            msgs = basicSetParentSubFunction( newParentSubFunction, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    SclPackage.CONDUCTING_EQUIPMENT__PARENT_SUB_FUNCTION, newParentSubFunction,
                    newParentSubFunction ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EqFunction > getEqFunction() {
        if( eqFunction == null ) {
            eqFunction = new EObjectContainmentWithInverseEList.Unsettable< >( EqFunction.class, this,
                    SclPackage.CONDUCTING_EQUIPMENT__EQ_FUNCTION, SclPackage.EQ_FUNCTION__PARENT_CONDUCTING_EQUIPMENT );
        }
        return eqFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEqFunction() {
        if( eqFunction != null ) {
            ( ( InternalEList.Unsettable< ? > ) eqFunction ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEqFunction() {
        return eqFunction != null && ( ( InternalEList.Unsettable< ? > ) eqFunction ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Line getParentLine() {
        if( eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__PARENT_LINE ) {
            return null;
        }
        return ( Line ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentLine( Line newParentLine, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentLine, SclPackage.CONDUCTING_EQUIPMENT__PARENT_LINE,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentLine( Line newParentLine ) {
        if( newParentLine != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__PARENT_LINE
                        && newParentLine != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentLine ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentLine != null ) {
                msgs = ( ( InternalEObject ) newParentLine ).eInverseAdd( this, SclPackage.LINE__CONDUCTING_EQUIPMENT,
                        Line.class, msgs );
            }
            msgs = basicSetParentLine( newParentLine, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CONDUCTING_EQUIPMENT__PARENT_LINE,
                    newParentLine, newParentLine ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public fr.centralesupelec.edf.riseclipse.iec61850.scl.Process getParentProcess() {
        if( eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__PARENT_PROCESS ) {
            return null;
        }
        return ( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentProcess(
            fr.centralesupelec.edf.riseclipse.iec61850.scl.Process newParentProcess, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentProcess,
                SclPackage.CONDUCTING_EQUIPMENT__PARENT_PROCESS, msgs );
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
                || ( eContainerFeatureID() != SclPackage.CONDUCTING_EQUIPMENT__PARENT_PROCESS
                        && newParentProcess != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentProcess ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentProcess != null ) {
                msgs = ( ( InternalEObject ) newParentProcess ).eInverseAdd( this,
                        SclPackage.PROCESS__CONDUCTING_EQUIPMENT,
                        fr.centralesupelec.edf.riseclipse.iec61850.scl.Process.class, msgs );
            }
            msgs = basicSetParentProcess( newParentProcess, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CONDUCTING_EQUIPMENT__PARENT_PROCESS,
                    newParentProcess, newParentProcess ) );
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
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_BAY:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentBay( ( Bay ) otherEnd, msgs );
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_FUNCTION:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentFunction( ( Function ) otherEnd, msgs );
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_SUB_FUNCTION:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSubFunction( ( SubFunction ) otherEnd, msgs );
        case SclPackage.CONDUCTING_EQUIPMENT__EQ_FUNCTION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEqFunction() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_LINE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentLine( ( Line ) otherEnd, msgs );
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_PROCESS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentProcess( ( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process ) otherEnd, msgs );
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
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_BAY:
            return basicSetParentBay( null, msgs );
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_FUNCTION:
            return basicSetParentFunction( null, msgs );
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_SUB_FUNCTION:
            return basicSetParentSubFunction( null, msgs );
        case SclPackage.CONDUCTING_EQUIPMENT__EQ_FUNCTION:
            return ( ( InternalEList< ? > ) getEqFunction() ).basicRemove( otherEnd, msgs );
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_LINE:
            return basicSetParentLine( null, msgs );
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_PROCESS:
            return basicSetParentProcess( null, msgs );
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
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_BAY:
            return eInternalContainer().eInverseRemove( this, SclPackage.BAY__CONDUCTING_EQUIPMENT, Bay.class, msgs );
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_FUNCTION:
            return eInternalContainer().eInverseRemove( this, SclPackage.FUNCTION__CONDUCTING_EQUIPMENT, Function.class,
                    msgs );
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_SUB_FUNCTION:
            return eInternalContainer().eInverseRemove( this, SclPackage.SUB_FUNCTION__CONDUCTING_EQUIPMENT,
                    SubFunction.class, msgs );
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_LINE:
            return eInternalContainer().eInverseRemove( this, SclPackage.LINE__CONDUCTING_EQUIPMENT, Line.class, msgs );
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_PROCESS:
            return eInternalContainer().eInverseRemove( this, SclPackage.PROCESS__CONDUCTING_EQUIPMENT,
                    fr.centralesupelec.edf.riseclipse.iec61850.scl.Process.class, msgs );
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
        case SclPackage.CONDUCTING_EQUIPMENT__TYPE:
            return getType();
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_BAY:
            return getParentBay();
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_FUNCTION:
            return getParentFunction();
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_SUB_FUNCTION:
            return getParentSubFunction();
        case SclPackage.CONDUCTING_EQUIPMENT__EQ_FUNCTION:
            return getEqFunction();
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_LINE:
            return getParentLine();
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_PROCESS:
            return getParentProcess();
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
        case SclPackage.CONDUCTING_EQUIPMENT__TYPE:
            setType( ( String ) newValue );
            return;
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_BAY:
            setParentBay( ( Bay ) newValue );
            return;
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_FUNCTION:
            setParentFunction( ( Function ) newValue );
            return;
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_SUB_FUNCTION:
            setParentSubFunction( ( SubFunction ) newValue );
            return;
        case SclPackage.CONDUCTING_EQUIPMENT__EQ_FUNCTION:
            getEqFunction().clear();
            getEqFunction().addAll( ( Collection< ? extends EqFunction > ) newValue );
            return;
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_LINE:
            setParentLine( ( Line ) newValue );
            return;
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_PROCESS:
            setParentProcess( ( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process ) newValue );
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
        case SclPackage.CONDUCTING_EQUIPMENT__TYPE:
            unsetType();
            return;
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_BAY:
            setParentBay( ( Bay ) null );
            return;
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_FUNCTION:
            setParentFunction( ( Function ) null );
            return;
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_SUB_FUNCTION:
            setParentSubFunction( ( SubFunction ) null );
            return;
        case SclPackage.CONDUCTING_EQUIPMENT__EQ_FUNCTION:
            unsetEqFunction();
            return;
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_LINE:
            setParentLine( ( Line ) null );
            return;
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_PROCESS:
            setParentProcess( ( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process ) null );
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
        case SclPackage.CONDUCTING_EQUIPMENT__TYPE:
            return isSetType();
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_BAY:
            return getParentBay() != null;
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_FUNCTION:
            return getParentFunction() != null;
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_SUB_FUNCTION:
            return getParentSubFunction() != null;
        case SclPackage.CONDUCTING_EQUIPMENT__EQ_FUNCTION:
            return isSetEqFunction();
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_LINE:
            return getParentLine() != null;
        case SclPackage.CONDUCTING_EQUIPMENT__PARENT_PROCESS:
            return getParentProcess() != null;
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
        result.append( " (type: " );
        if( typeESet ) {
            result.append( type );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    @Override
    public String getXpath() {
        String parentXpath = "";
        if( getParentBay() != null ) {
            parentXpath = getParentBay().getXpath();
        }
        if( getParentFunction() != null ) {
            parentXpath = getParentFunction().getXpath();
        }
        if( getParentLine() != null ) {
            parentXpath = getParentLine().getXpath();
        }
        if( getParentProcess() != null ) {
            parentXpath = getParentProcess().getXpath();
        }
        if( getParentSubFunction() != null ) {
            parentXpath = getParentSubFunction().getXpath();
        }
        return parentXpath + "/scl:ConductingEquipment[@name='" + getName() + "']";
    }

} //ConductingEquipmentImpl
