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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgVirtual;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PhaseEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubEquipmentImpl#getVirtual <em>Virtual</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubEquipmentImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubEquipmentImpl#getParentAbstractConductingEquipment <em>Parent Abstract Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubEquipmentImpl#getEqFunction <em>Eq Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubEquipmentImpl#getParentPowerTransformer <em>Parent Power Transformer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubEquipmentImpl#getParentTapChanger <em>Parent Tap Changer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubEquipmentImpl extends PowerSystemResourceImpl implements SubEquipment {
    /**
     * The default value of the '{@link #getVirtual() <em>Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVirtual()
     * @generated
     * @ordered
     */
    protected static final Boolean VIRTUAL_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getVirtual() <em>Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVirtual()
     * @generated
     * @ordered
     */
    protected Boolean virtual = VIRTUAL_EDEFAULT;

    /**
     * This is true if the Virtual attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean virtualESet;

    /**
     * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected static final PhaseEnum PHASE_EDEFAULT = PhaseEnum.NONE;

    /**
     * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected PhaseEnum phase = PHASE_EDEFAULT;

    /**
     * This is true if the Phase attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseESet;

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
    protected SubEquipmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSubEquipment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseEnum getPhase() {
        return phase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhase( PhaseEnum newPhase ) {
        PhaseEnum oldPhase = phase;
        phase = newPhase == null ? PHASE_EDEFAULT : newPhase;
        boolean oldPhaseESet = phaseESet;
        phaseESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SUB_EQUIPMENT__PHASE, oldPhase, phase,
                    !oldPhaseESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhase() {
        PhaseEnum oldPhase = phase;
        boolean oldPhaseESet = phaseESet;
        phase = PHASE_EDEFAULT;
        phaseESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SUB_EQUIPMENT__PHASE, oldPhase,
                    PHASE_EDEFAULT, oldPhaseESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhase() {
        return phaseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AbstractConductingEquipment getParentAbstractConductingEquipment() {
        if( eContainerFeatureID() != SclPackage.SUB_EQUIPMENT__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT ) {
            return null;
        }
        return ( AbstractConductingEquipment ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAbstractConductingEquipment(
            AbstractConductingEquipment newParentAbstractConductingEquipment, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentAbstractConductingEquipment,
                SclPackage.SUB_EQUIPMENT__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAbstractConductingEquipment(
            AbstractConductingEquipment newParentAbstractConductingEquipment ) {
        if( newParentAbstractConductingEquipment != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SUB_EQUIPMENT__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT
                        && newParentAbstractConductingEquipment != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentAbstractConductingEquipment ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentAbstractConductingEquipment != null ) {
                msgs = ( ( InternalEObject ) newParentAbstractConductingEquipment ).eInverseAdd( this,
                        SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT, AbstractConductingEquipment.class,
                        msgs );
            }
            msgs = basicSetParentAbstractConductingEquipment( newParentAbstractConductingEquipment, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    SclPackage.SUB_EQUIPMENT__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT,
                    newParentAbstractConductingEquipment, newParentAbstractConductingEquipment ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getVirtual() {
        return virtual;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVirtual( Boolean newVirtual ) {
        Boolean oldVirtual = virtual;
        virtual = newVirtual;
        boolean oldVirtualESet = virtualESet;
        virtualESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SUB_EQUIPMENT__VIRTUAL, oldVirtual,
                    virtual, !oldVirtualESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVirtual() {
        Boolean oldVirtual = virtual;
        boolean oldVirtualESet = virtualESet;
        virtual = VIRTUAL_EDEFAULT;
        virtualESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SUB_EQUIPMENT__VIRTUAL, oldVirtual,
                    VIRTUAL_EDEFAULT, oldVirtualESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVirtual() {
        return virtualESet;
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
                    SclPackage.SUB_EQUIPMENT__EQ_FUNCTION, SclPackage.EQ_FUNCTION__PARENT_SUB_EQUIPMENT );
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
    public PowerTransformer getParentPowerTransformer() {
        if( eContainerFeatureID() != SclPackage.SUB_EQUIPMENT__PARENT_POWER_TRANSFORMER ) {
            return null;
        }
        return ( PowerTransformer ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentPowerTransformer( PowerTransformer newParentPowerTransformer,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentPowerTransformer,
                SclPackage.SUB_EQUIPMENT__PARENT_POWER_TRANSFORMER, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentPowerTransformer( PowerTransformer newParentPowerTransformer ) {
        if( newParentPowerTransformer != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SUB_EQUIPMENT__PARENT_POWER_TRANSFORMER
                        && newParentPowerTransformer != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentPowerTransformer ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentPowerTransformer != null ) {
                msgs = ( ( InternalEObject ) newParentPowerTransformer ).eInverseAdd( this,
                        SclPackage.POWER_TRANSFORMER__SUB_EQUIPMENT, PowerTransformer.class, msgs );
            }
            msgs = basicSetParentPowerTransformer( newParentPowerTransformer, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SUB_EQUIPMENT__PARENT_POWER_TRANSFORMER,
                    newParentPowerTransformer, newParentPowerTransformer ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TapChanger getParentTapChanger() {
        if( eContainerFeatureID() != SclPackage.SUB_EQUIPMENT__PARENT_TAP_CHANGER ) {
            return null;
        }
        return ( TapChanger ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentTapChanger( TapChanger newParentTapChanger, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentTapChanger,
                SclPackage.SUB_EQUIPMENT__PARENT_TAP_CHANGER, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentTapChanger( TapChanger newParentTapChanger ) {
        if( newParentTapChanger != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SUB_EQUIPMENT__PARENT_TAP_CHANGER
                        && newParentTapChanger != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentTapChanger ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentTapChanger != null ) {
                msgs = ( ( InternalEObject ) newParentTapChanger ).eInverseAdd( this,
                        SclPackage.TAP_CHANGER__SUB_EQUIPMENT, TapChanger.class, msgs );
            }
            msgs = basicSetParentTapChanger( newParentTapChanger, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SUB_EQUIPMENT__PARENT_TAP_CHANGER,
                    newParentTapChanger, newParentTapChanger ) );
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
        case SclPackage.SUB_EQUIPMENT__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentAbstractConductingEquipment( ( AbstractConductingEquipment ) otherEnd, msgs );
        case SclPackage.SUB_EQUIPMENT__EQ_FUNCTION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEqFunction() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.SUB_EQUIPMENT__PARENT_POWER_TRANSFORMER:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentPowerTransformer( ( PowerTransformer ) otherEnd, msgs );
        case SclPackage.SUB_EQUIPMENT__PARENT_TAP_CHANGER:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentTapChanger( ( TapChanger ) otherEnd, msgs );
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
        case SclPackage.SUB_EQUIPMENT__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT:
            return basicSetParentAbstractConductingEquipment( null, msgs );
        case SclPackage.SUB_EQUIPMENT__EQ_FUNCTION:
            return ( ( InternalEList< ? > ) getEqFunction() ).basicRemove( otherEnd, msgs );
        case SclPackage.SUB_EQUIPMENT__PARENT_POWER_TRANSFORMER:
            return basicSetParentPowerTransformer( null, msgs );
        case SclPackage.SUB_EQUIPMENT__PARENT_TAP_CHANGER:
            return basicSetParentTapChanger( null, msgs );
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
        case SclPackage.SUB_EQUIPMENT__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT:
            return eInternalContainer().eInverseRemove( this, SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT,
                    AbstractConductingEquipment.class, msgs );
        case SclPackage.SUB_EQUIPMENT__PARENT_POWER_TRANSFORMER:
            return eInternalContainer().eInverseRemove( this, SclPackage.POWER_TRANSFORMER__SUB_EQUIPMENT,
                    PowerTransformer.class, msgs );
        case SclPackage.SUB_EQUIPMENT__PARENT_TAP_CHANGER:
            return eInternalContainer().eInverseRemove( this, SclPackage.TAP_CHANGER__SUB_EQUIPMENT, TapChanger.class,
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
        case SclPackage.SUB_EQUIPMENT__VIRTUAL:
            return getVirtual();
        case SclPackage.SUB_EQUIPMENT__PHASE:
            return getPhase();
        case SclPackage.SUB_EQUIPMENT__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT:
            return getParentAbstractConductingEquipment();
        case SclPackage.SUB_EQUIPMENT__EQ_FUNCTION:
            return getEqFunction();
        case SclPackage.SUB_EQUIPMENT__PARENT_POWER_TRANSFORMER:
            return getParentPowerTransformer();
        case SclPackage.SUB_EQUIPMENT__PARENT_TAP_CHANGER:
            return getParentTapChanger();
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
        case SclPackage.SUB_EQUIPMENT__VIRTUAL:
            setVirtual( ( Boolean ) newValue );
            return;
        case SclPackage.SUB_EQUIPMENT__PHASE:
            setPhase( ( PhaseEnum ) newValue );
            return;
        case SclPackage.SUB_EQUIPMENT__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT:
            setParentAbstractConductingEquipment( ( AbstractConductingEquipment ) newValue );
            return;
        case SclPackage.SUB_EQUIPMENT__EQ_FUNCTION:
            getEqFunction().clear();
            getEqFunction().addAll( ( Collection< ? extends EqFunction > ) newValue );
            return;
        case SclPackage.SUB_EQUIPMENT__PARENT_POWER_TRANSFORMER:
            setParentPowerTransformer( ( PowerTransformer ) newValue );
            return;
        case SclPackage.SUB_EQUIPMENT__PARENT_TAP_CHANGER:
            setParentTapChanger( ( TapChanger ) newValue );
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
        case SclPackage.SUB_EQUIPMENT__VIRTUAL:
            unsetVirtual();
            return;
        case SclPackage.SUB_EQUIPMENT__PHASE:
            unsetPhase();
            return;
        case SclPackage.SUB_EQUIPMENT__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT:
            setParentAbstractConductingEquipment( ( AbstractConductingEquipment ) null );
            return;
        case SclPackage.SUB_EQUIPMENT__EQ_FUNCTION:
            unsetEqFunction();
            return;
        case SclPackage.SUB_EQUIPMENT__PARENT_POWER_TRANSFORMER:
            setParentPowerTransformer( ( PowerTransformer ) null );
            return;
        case SclPackage.SUB_EQUIPMENT__PARENT_TAP_CHANGER:
            setParentTapChanger( ( TapChanger ) null );
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
        case SclPackage.SUB_EQUIPMENT__VIRTUAL:
            return isSetVirtual();
        case SclPackage.SUB_EQUIPMENT__PHASE:
            return isSetPhase();
        case SclPackage.SUB_EQUIPMENT__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT:
            return getParentAbstractConductingEquipment() != null;
        case SclPackage.SUB_EQUIPMENT__EQ_FUNCTION:
            return isSetEqFunction();
        case SclPackage.SUB_EQUIPMENT__PARENT_POWER_TRANSFORMER:
            return getParentPowerTransformer() != null;
        case SclPackage.SUB_EQUIPMENT__PARENT_TAP_CHANGER:
            return getParentTapChanger() != null;
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID( int derivedFeatureID, Class< ? > baseClass ) {
        if( baseClass == AgVirtual.class ) {
            switch( derivedFeatureID ) {
            case SclPackage.SUB_EQUIPMENT__VIRTUAL:
                return SclPackage.AG_VIRTUAL__VIRTUAL;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID( derivedFeatureID, baseClass );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID( int baseFeatureID, Class< ? > baseClass ) {
        if( baseClass == AgVirtual.class ) {
            switch( baseFeatureID ) {
            case SclPackage.AG_VIRTUAL__VIRTUAL:
                return SclPackage.SUB_EQUIPMENT__VIRTUAL;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
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
        result.append( " (virtual: " );
        if( virtualESet ) {
            result.append( virtual );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", phase: " );
        if( phaseESet ) {
            result.append( phase );
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
        if( getParentAbstractConductingEquipment() != null ) {
            parentXpath = getParentAbstractConductingEquipment().getXpath();
        }
        if( getParentPowerTransformer() != null ) {
            parentXpath = getParentPowerTransformer().getXpath();
        }
        if( getParentTapChanger() != null ) {
            parentXpath = getParentTapChanger().getXpath();
        }
        return parentXpath + "/scl:SubEquipment[@name='" + getName() + "']";
    }

} //SubEquipmentImpl
