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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PowerTransformerImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PowerTransformerImpl#getEqFunction <em>Eq Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PowerTransformerImpl#getParentEquipmentContainer <em>Parent Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PowerTransformerImpl#getSubEquipment <em>Sub Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PowerTransformerImpl#getTransformerWinding <em>Transformer Winding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerTransformerImpl extends EquipmentImpl implements PowerTransformer {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = "";

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
     * The cached value of the '{@link #getSubEquipment() <em>Sub Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubEquipment()
     * @generated
     * @ordered
     */
    protected EList< SubEquipment > subEquipment;

    /**
     * The cached value of the '{@link #getTransformerWinding() <em>Transformer Winding</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerWinding()
     * @generated
     * @ordered
     */
    protected EList< TransformerWinding > transformerWinding;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerTransformerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getPowerTransformer();
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.POWER_TRANSFORMER__TYPE, oldType, type,
                    !oldTypeESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.POWER_TRANSFORMER__TYPE, oldType,
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
    public EList< EqFunction > getEqFunction() {
        if( eqFunction == null ) {
            eqFunction = new EObjectContainmentWithInverseEList.Unsettable< >( EqFunction.class, this,
                    SclPackage.POWER_TRANSFORMER__EQ_FUNCTION, SclPackage.EQ_FUNCTION__PARENT_POWER_TRANSFORMER );
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
    public EquipmentContainer getParentEquipmentContainer() {
        if( eContainerFeatureID() != SclPackage.POWER_TRANSFORMER__PARENT_EQUIPMENT_CONTAINER ) {
            return null;
        }
        return ( EquipmentContainer ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentEquipmentContainer( EquipmentContainer newParentEquipmentContainer,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentEquipmentContainer,
                SclPackage.POWER_TRANSFORMER__PARENT_EQUIPMENT_CONTAINER, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentEquipmentContainer( EquipmentContainer newParentEquipmentContainer ) {
        if( newParentEquipmentContainer != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.POWER_TRANSFORMER__PARENT_EQUIPMENT_CONTAINER
                        && newParentEquipmentContainer != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentEquipmentContainer ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentEquipmentContainer != null ) {
                msgs = ( ( InternalEObject ) newParentEquipmentContainer ).eInverseAdd( this,
                        SclPackage.EQUIPMENT_CONTAINER__POWER_TRANSFORMER, EquipmentContainer.class, msgs );
            }
            msgs = basicSetParentEquipmentContainer( newParentEquipmentContainer, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    SclPackage.POWER_TRANSFORMER__PARENT_EQUIPMENT_CONTAINER, newParentEquipmentContainer,
                    newParentEquipmentContainer ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SubEquipment > getSubEquipment() {
        if( subEquipment == null ) {
            subEquipment = new EObjectContainmentWithInverseEList.Unsettable< >( SubEquipment.class, this,
                    SclPackage.POWER_TRANSFORMER__SUB_EQUIPMENT, SclPackage.SUB_EQUIPMENT__PARENT_POWER_TRANSFORMER );
        }
        return subEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubEquipment() {
        if( subEquipment != null ) {
            ( ( InternalEList.Unsettable< ? > ) subEquipment ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubEquipment() {
        return subEquipment != null && ( ( InternalEList.Unsettable< ? > ) subEquipment ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TransformerWinding > getTransformerWinding() {
        if( transformerWinding == null ) {
            transformerWinding = new EObjectContainmentWithInverseEList.Unsettable< >(
                    TransformerWinding.class, this, SclPackage.POWER_TRANSFORMER__TRANSFORMER_WINDING,
                    SclPackage.TRANSFORMER_WINDING__PARENT_POWER_TRANSFORMER );
        }
        return transformerWinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransformerWinding() {
        if( transformerWinding != null ) {
            ( ( InternalEList.Unsettable< ? > ) transformerWinding ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransformerWinding() {
        return transformerWinding != null && ( ( InternalEList.Unsettable< ? > ) transformerWinding ).isSet();
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
        case SclPackage.POWER_TRANSFORMER__EQ_FUNCTION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEqFunction() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.POWER_TRANSFORMER__PARENT_EQUIPMENT_CONTAINER:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentEquipmentContainer( ( EquipmentContainer ) otherEnd, msgs );
        case SclPackage.POWER_TRANSFORMER__SUB_EQUIPMENT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSubEquipment() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.POWER_TRANSFORMER__TRANSFORMER_WINDING:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTransformerWinding() )
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
        case SclPackage.POWER_TRANSFORMER__EQ_FUNCTION:
            return ( ( InternalEList< ? > ) getEqFunction() ).basicRemove( otherEnd, msgs );
        case SclPackage.POWER_TRANSFORMER__PARENT_EQUIPMENT_CONTAINER:
            return basicSetParentEquipmentContainer( null, msgs );
        case SclPackage.POWER_TRANSFORMER__SUB_EQUIPMENT:
            return ( ( InternalEList< ? > ) getSubEquipment() ).basicRemove( otherEnd, msgs );
        case SclPackage.POWER_TRANSFORMER__TRANSFORMER_WINDING:
            return ( ( InternalEList< ? > ) getTransformerWinding() ).basicRemove( otherEnd, msgs );
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
        case SclPackage.POWER_TRANSFORMER__PARENT_EQUIPMENT_CONTAINER:
            return eInternalContainer().eInverseRemove( this, SclPackage.EQUIPMENT_CONTAINER__POWER_TRANSFORMER,
                    EquipmentContainer.class, msgs );
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
        case SclPackage.POWER_TRANSFORMER__TYPE:
            return getType();
        case SclPackage.POWER_TRANSFORMER__EQ_FUNCTION:
            return getEqFunction();
        case SclPackage.POWER_TRANSFORMER__PARENT_EQUIPMENT_CONTAINER:
            return getParentEquipmentContainer();
        case SclPackage.POWER_TRANSFORMER__SUB_EQUIPMENT:
            return getSubEquipment();
        case SclPackage.POWER_TRANSFORMER__TRANSFORMER_WINDING:
            return getTransformerWinding();
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
        case SclPackage.POWER_TRANSFORMER__TYPE:
            setType( ( String ) newValue );
            return;
        case SclPackage.POWER_TRANSFORMER__EQ_FUNCTION:
            getEqFunction().clear();
            getEqFunction().addAll( ( Collection< ? extends EqFunction > ) newValue );
            return;
        case SclPackage.POWER_TRANSFORMER__PARENT_EQUIPMENT_CONTAINER:
            setParentEquipmentContainer( ( EquipmentContainer ) newValue );
            return;
        case SclPackage.POWER_TRANSFORMER__SUB_EQUIPMENT:
            getSubEquipment().clear();
            getSubEquipment().addAll( ( Collection< ? extends SubEquipment > ) newValue );
            return;
        case SclPackage.POWER_TRANSFORMER__TRANSFORMER_WINDING:
            getTransformerWinding().clear();
            getTransformerWinding().addAll( ( Collection< ? extends TransformerWinding > ) newValue );
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
        case SclPackage.POWER_TRANSFORMER__TYPE:
            unsetType();
            return;
        case SclPackage.POWER_TRANSFORMER__EQ_FUNCTION:
            unsetEqFunction();
            return;
        case SclPackage.POWER_TRANSFORMER__PARENT_EQUIPMENT_CONTAINER:
            setParentEquipmentContainer( ( EquipmentContainer ) null );
            return;
        case SclPackage.POWER_TRANSFORMER__SUB_EQUIPMENT:
            unsetSubEquipment();
            return;
        case SclPackage.POWER_TRANSFORMER__TRANSFORMER_WINDING:
            unsetTransformerWinding();
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
        case SclPackage.POWER_TRANSFORMER__TYPE:
            return isSetType();
        case SclPackage.POWER_TRANSFORMER__EQ_FUNCTION:
            return isSetEqFunction();
        case SclPackage.POWER_TRANSFORMER__PARENT_EQUIPMENT_CONTAINER:
            return getParentEquipmentContainer() != null;
        case SclPackage.POWER_TRANSFORMER__SUB_EQUIPMENT:
            return isSetSubEquipment();
        case SclPackage.POWER_TRANSFORMER__TRANSFORMER_WINDING:
            return isSetTransformerWinding();
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

} //PowerTransformerImpl
