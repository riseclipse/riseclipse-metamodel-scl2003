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

import java.math.BigDecimal;
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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voltage Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageLevelImpl#getNomFreq <em>Nom Freq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageLevelImpl#getNumPhases <em>Num Phases</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageLevelImpl#getBay <em>Bay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageLevelImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageLevelImpl#getParentSubstation <em>Parent Substation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageLevelImpl#getVoltage <em>Voltage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VoltageLevelImpl extends EquipmentContainerImpl implements VoltageLevel {
    /**
     * The default value of the '{@link #getNomFreq() <em>Nom Freq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNomFreq()
     * @generated
     * @ordered
     */
    protected static final BigDecimal NOM_FREQ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNomFreq() <em>Nom Freq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNomFreq()
     * @generated
     * @ordered
     */
    protected BigDecimal nomFreq = NOM_FREQ_EDEFAULT;

    /**
     * This is true if the Nom Freq attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nomFreqESet;

    /**
     * The default value of the '{@link #getNumPhases() <em>Num Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumPhases()
     * @generated
     * @ordered
     */
    protected static final Integer NUM_PHASES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNumPhases() <em>Num Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumPhases()
     * @generated
     * @ordered
     */
    protected Integer numPhases = NUM_PHASES_EDEFAULT;

    /**
     * This is true if the Num Phases attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean numPhasesESet;

    /**
     * The cached value of the '{@link #getBay() <em>Bay</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBay()
     * @generated
     * @ordered
     */
    protected EList< Bay > bay;

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
     * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltage()
     * @generated
     * @ordered
     */
    protected Voltage voltage;

    /**
     * This is true if the Voltage containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageESet;

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    protected VoltageLevelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getVoltageLevel();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getNomFreq() {
        return nomFreq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNomFreq( BigDecimal newNomFreq ) {
        BigDecimal oldNomFreq = nomFreq;
        nomFreq = newNomFreq;
        boolean oldNomFreqESet = nomFreqESet;
        nomFreqESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.VOLTAGE_LEVEL__NOM_FREQ, oldNomFreq,
                    nomFreq, !oldNomFreqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNomFreq() {
        BigDecimal oldNomFreq = nomFreq;
        boolean oldNomFreqESet = nomFreqESet;
        nomFreq = NOM_FREQ_EDEFAULT;
        nomFreqESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.VOLTAGE_LEVEL__NOM_FREQ, oldNomFreq,
                    NOM_FREQ_EDEFAULT, oldNomFreqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNomFreq() {
        return nomFreqESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getNumPhases() {
        return numPhases;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNumPhases( Integer newNumPhases ) {
        Integer oldNumPhases = numPhases;
        numPhases = newNumPhases;
        boolean oldNumPhasesESet = numPhasesESet;
        numPhasesESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.VOLTAGE_LEVEL__NUM_PHASES, oldNumPhases,
                    numPhases, !oldNumPhasesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNumPhases() {
        Integer oldNumPhases = numPhases;
        boolean oldNumPhasesESet = numPhasesESet;
        numPhases = NUM_PHASES_EDEFAULT;
        numPhasesESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.VOLTAGE_LEVEL__NUM_PHASES,
                    oldNumPhases, NUM_PHASES_EDEFAULT, oldNumPhasesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNumPhases() {
        return numPhasesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Bay > getBay() {
        if( bay == null ) {
            bay = new EObjectContainmentWithInverseEList.Unsettable< Bay >( Bay.class, this,
                    SclPackage.VOLTAGE_LEVEL__BAY, SclPackage.BAY__PARENT_VOLTAGE_LEVEL );
        }
        return bay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBay() {
        if( bay != null ) ( ( InternalEList.Unsettable< ? > ) bay ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBay() {
        return bay != null && ( ( InternalEList.Unsettable< ? > ) bay ).isSet();
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
                    SclPackage.VOLTAGE_LEVEL__FUNCTION, SclPackage.FUNCTION__PARENT_VOLTAGE_LEVEL );
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
    public Substation getParentSubstation() {
        if( eContainerFeatureID() != SclPackage.VOLTAGE_LEVEL__PARENT_SUBSTATION ) return null;
        return ( Substation ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSubstation( Substation newParentSubstation, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSubstation, SclPackage.VOLTAGE_LEVEL__PARENT_SUBSTATION,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSubstation( Substation newParentSubstation ) {
        if( newParentSubstation != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.VOLTAGE_LEVEL__PARENT_SUBSTATION
                        && newParentSubstation != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSubstation ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentSubstation != null )
                msgs = ( ( InternalEObject ) newParentSubstation ).eInverseAdd( this,
                        SclPackage.SUBSTATION__VOLTAGE_LEVEL, Substation.class, msgs );
            msgs = basicSetParentSubstation( newParentSubstation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.VOLTAGE_LEVEL__PARENT_SUBSTATION,
                    newParentSubstation, newParentSubstation ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Voltage getVoltage() {
        return voltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVoltage( Voltage newVoltage, NotificationChain msgs ) {
        Voltage oldVoltage = voltage;
        voltage = newVoltage;
        boolean oldVoltageESet = voltageESet;
        voltageESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.VOLTAGE_LEVEL__VOLTAGE, oldVoltage, newVoltage, !oldVoltageESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVoltage( Voltage newVoltage ) {
        if( newVoltage != voltage ) {
            NotificationChain msgs = null;
            if( voltage != null )
                msgs = ( ( InternalEObject ) voltage ).eInverseRemove( this, SclPackage.VOLTAGE__PARENT_VOLTAGE_LEVEL,
                        Voltage.class, msgs );
            if( newVoltage != null )
                msgs = ( ( InternalEObject ) newVoltage ).eInverseAdd( this, SclPackage.VOLTAGE__PARENT_VOLTAGE_LEVEL,
                        Voltage.class, msgs );
            msgs = basicSetVoltage( newVoltage, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVoltageESet = voltageESet;
            voltageESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.VOLTAGE_LEVEL__VOLTAGE, newVoltage,
                        newVoltage, !oldVoltageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetVoltage( NotificationChain msgs ) {
        Voltage oldVoltage = voltage;
        voltage = null;
        boolean oldVoltageESet = voltageESet;
        voltageESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.VOLTAGE_LEVEL__VOLTAGE, oldVoltage, null, oldVoltageESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltage() {
        if( voltage != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) voltage ).eInverseRemove( this, SclPackage.VOLTAGE__PARENT_VOLTAGE_LEVEL,
                    Voltage.class, msgs );
            msgs = basicUnsetVoltage( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVoltageESet = voltageESet;
            voltageESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.VOLTAGE_LEVEL__VOLTAGE, null, null,
                        oldVoltageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltage() {
        return voltageESet;
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
        case SclPackage.VOLTAGE_LEVEL__BAY:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getBay() ).basicAdd( otherEnd, msgs );
        case SclPackage.VOLTAGE_LEVEL__FUNCTION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFunction() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.VOLTAGE_LEVEL__PARENT_SUBSTATION:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentSubstation( ( Substation ) otherEnd, msgs );
        case SclPackage.VOLTAGE_LEVEL__VOLTAGE:
            if( voltage != null )
                msgs = ( ( InternalEObject ) voltage ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.VOLTAGE_LEVEL__VOLTAGE, null, msgs );
            return basicSetVoltage( ( Voltage ) otherEnd, msgs );
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
        case SclPackage.VOLTAGE_LEVEL__BAY:
            return ( ( InternalEList< ? > ) getBay() ).basicRemove( otherEnd, msgs );
        case SclPackage.VOLTAGE_LEVEL__FUNCTION:
            return ( ( InternalEList< ? > ) getFunction() ).basicRemove( otherEnd, msgs );
        case SclPackage.VOLTAGE_LEVEL__PARENT_SUBSTATION:
            return basicSetParentSubstation( null, msgs );
        case SclPackage.VOLTAGE_LEVEL__VOLTAGE:
            return basicUnsetVoltage( msgs );
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
        case SclPackage.VOLTAGE_LEVEL__PARENT_SUBSTATION:
            return eInternalContainer().eInverseRemove( this, SclPackage.SUBSTATION__VOLTAGE_LEVEL, Substation.class,
                    msgs );
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
        case SclPackage.VOLTAGE_LEVEL__NOM_FREQ:
            return getNomFreq();
        case SclPackage.VOLTAGE_LEVEL__NUM_PHASES:
            return getNumPhases();
        case SclPackage.VOLTAGE_LEVEL__BAY:
            return getBay();
        case SclPackage.VOLTAGE_LEVEL__FUNCTION:
            return getFunction();
        case SclPackage.VOLTAGE_LEVEL__PARENT_SUBSTATION:
            return getParentSubstation();
        case SclPackage.VOLTAGE_LEVEL__VOLTAGE:
            return getVoltage();
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
        case SclPackage.VOLTAGE_LEVEL__NOM_FREQ:
            setNomFreq( ( BigDecimal ) newValue );
            return;
        case SclPackage.VOLTAGE_LEVEL__NUM_PHASES:
            setNumPhases( ( Integer ) newValue );
            return;
        case SclPackage.VOLTAGE_LEVEL__BAY:
            getBay().clear();
            getBay().addAll( ( Collection< ? extends Bay > ) newValue );
            return;
        case SclPackage.VOLTAGE_LEVEL__FUNCTION:
            getFunction().clear();
            getFunction().addAll( ( Collection< ? extends Function > ) newValue );
            return;
        case SclPackage.VOLTAGE_LEVEL__PARENT_SUBSTATION:
            setParentSubstation( ( Substation ) newValue );
            return;
        case SclPackage.VOLTAGE_LEVEL__VOLTAGE:
            setVoltage( ( Voltage ) newValue );
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
        case SclPackage.VOLTAGE_LEVEL__NOM_FREQ:
            unsetNomFreq();
            return;
        case SclPackage.VOLTAGE_LEVEL__NUM_PHASES:
            unsetNumPhases();
            return;
        case SclPackage.VOLTAGE_LEVEL__BAY:
            unsetBay();
            return;
        case SclPackage.VOLTAGE_LEVEL__FUNCTION:
            unsetFunction();
            return;
        case SclPackage.VOLTAGE_LEVEL__PARENT_SUBSTATION:
            setParentSubstation( ( Substation ) null );
            return;
        case SclPackage.VOLTAGE_LEVEL__VOLTAGE:
            unsetVoltage();
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
        case SclPackage.VOLTAGE_LEVEL__NOM_FREQ:
            return isSetNomFreq();
        case SclPackage.VOLTAGE_LEVEL__NUM_PHASES:
            return isSetNumPhases();
        case SclPackage.VOLTAGE_LEVEL__BAY:
            return isSetBay();
        case SclPackage.VOLTAGE_LEVEL__FUNCTION:
            return isSetFunction();
        case SclPackage.VOLTAGE_LEVEL__PARENT_SUBSTATION:
            return getParentSubstation() != null;
        case SclPackage.VOLTAGE_LEVEL__VOLTAGE:
            return isSetVoltage();
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
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (nomFreq: " );
        if( nomFreqESet )
            result.append( nomFreq );
        else
            result.append( "<unset>" );
        result.append( ", numPhases: " );
        if( numPhasesESet )
            result.append( numPhases );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    @Override
    public String getXpath() {
        return getParentSubstation().getXpath() + "/scl:VoltageLevel[@name='" + getName() + "']";
    }

} //VoltageLevelImpl
