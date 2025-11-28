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
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionTemplate;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionTemplateImpl#getSubFunctionTemplate <em>Sub Function Template</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionTemplateImpl#getGeneralEquipment <em>General Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionTemplateImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionTemplateImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionTemplateImpl extends Abstract6100LNodeContainerImpl implements FunctionTemplate {
    /**
     * The cached value of the '{@link #getSubFunctionTemplate() <em>Sub Function Template</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubFunctionTemplate()
     * @generated
     * @ordered
     */
    protected EList< SubFunctionTemplate > subFunctionTemplate;

    /**
     * The cached value of the '{@link #getGeneralEquipment() <em>General Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneralEquipment()
     * @generated
     * @ordered
     */
    protected EList< GeneralEquipment > generalEquipment;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FunctionTemplateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getFunctionTemplate();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SubFunctionTemplate > getSubFunctionTemplate() {
        if( subFunctionTemplate == null ) {
            subFunctionTemplate = new EObjectContainmentWithInverseEList.Unsettable< >(
                    SubFunctionTemplate.class, this, AsdPackage.FUNCTION_TEMPLATE__SUB_FUNCTION_TEMPLATE,
                    AsdPackage.SUB_FUNCTION_TEMPLATE__PARENT_FUNCTION_TEMPLATE );
        }
        return subFunctionTemplate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubFunctionTemplate() {
        if( subFunctionTemplate != null ) {
            ( ( InternalEList.Unsettable< ? > ) subFunctionTemplate ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubFunctionTemplate() {
        return subFunctionTemplate != null && ( ( InternalEList.Unsettable< ? > ) subFunctionTemplate ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< GeneralEquipment > getGeneralEquipment() {
        if( generalEquipment == null ) {
            generalEquipment = new EObjectContainmentWithInverseEList.Unsettable< >(
                    GeneralEquipment.class, this, AsdPackage.FUNCTION_TEMPLATE__GENERAL_EQUIPMENT,
                    SclPackage.GENERAL_EQUIPMENT__PARENT_FUNCTION_TEMPLATE );
        }
        return generalEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGeneralEquipment() {
        if( generalEquipment != null ) {
            ( ( InternalEList.Unsettable< ? > ) generalEquipment ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGeneralEquipment() {
        return generalEquipment != null && ( ( InternalEList.Unsettable< ? > ) generalEquipment ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ConductingEquipment > getConductingEquipment() {
        if( conductingEquipment == null ) {
            conductingEquipment = new EObjectContainmentWithInverseEList.Unsettable< >(
                    ConductingEquipment.class, this, AsdPackage.FUNCTION_TEMPLATE__CONDUCTING_EQUIPMENT,
                    SclPackage.CONDUCTING_EQUIPMENT__PARENT_FUNCTION_TEMPLATE );
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
        if( conductingEquipment != null ) {
            ( ( InternalEList.Unsettable< ? > ) conductingEquipment ).unset();
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_TEMPLATE__TYPE, oldType,
                    type ) );
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
        case AsdPackage.FUNCTION_TEMPLATE__SUB_FUNCTION_TEMPLATE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSubFunctionTemplate() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.FUNCTION_TEMPLATE__GENERAL_EQUIPMENT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getGeneralEquipment() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.FUNCTION_TEMPLATE__CONDUCTING_EQUIPMENT:
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
        case AsdPackage.FUNCTION_TEMPLATE__SUB_FUNCTION_TEMPLATE:
            return ( ( InternalEList< ? > ) getSubFunctionTemplate() ).basicRemove( otherEnd, msgs );
        case AsdPackage.FUNCTION_TEMPLATE__GENERAL_EQUIPMENT:
            return ( ( InternalEList< ? > ) getGeneralEquipment() ).basicRemove( otherEnd, msgs );
        case AsdPackage.FUNCTION_TEMPLATE__CONDUCTING_EQUIPMENT:
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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case AsdPackage.FUNCTION_TEMPLATE__SUB_FUNCTION_TEMPLATE:
            return getSubFunctionTemplate();
        case AsdPackage.FUNCTION_TEMPLATE__GENERAL_EQUIPMENT:
            return getGeneralEquipment();
        case AsdPackage.FUNCTION_TEMPLATE__CONDUCTING_EQUIPMENT:
            return getConductingEquipment();
        case AsdPackage.FUNCTION_TEMPLATE__TYPE:
            return getType();
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
        case AsdPackage.FUNCTION_TEMPLATE__SUB_FUNCTION_TEMPLATE:
            getSubFunctionTemplate().clear();
            getSubFunctionTemplate().addAll( ( Collection< ? extends SubFunctionTemplate > ) newValue );
            return;
        case AsdPackage.FUNCTION_TEMPLATE__GENERAL_EQUIPMENT:
            getGeneralEquipment().clear();
            getGeneralEquipment().addAll( ( Collection< ? extends GeneralEquipment > ) newValue );
            return;
        case AsdPackage.FUNCTION_TEMPLATE__CONDUCTING_EQUIPMENT:
            getConductingEquipment().clear();
            getConductingEquipment().addAll( ( Collection< ? extends ConductingEquipment > ) newValue );
            return;
        case AsdPackage.FUNCTION_TEMPLATE__TYPE:
            setType( ( String ) newValue );
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
        case AsdPackage.FUNCTION_TEMPLATE__SUB_FUNCTION_TEMPLATE:
            unsetSubFunctionTemplate();
            return;
        case AsdPackage.FUNCTION_TEMPLATE__GENERAL_EQUIPMENT:
            unsetGeneralEquipment();
            return;
        case AsdPackage.FUNCTION_TEMPLATE__CONDUCTING_EQUIPMENT:
            unsetConductingEquipment();
            return;
        case AsdPackage.FUNCTION_TEMPLATE__TYPE:
            setType( TYPE_EDEFAULT );
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
        case AsdPackage.FUNCTION_TEMPLATE__SUB_FUNCTION_TEMPLATE:
            return isSetSubFunctionTemplate();
        case AsdPackage.FUNCTION_TEMPLATE__GENERAL_EQUIPMENT:
            return isSetGeneralEquipment();
        case AsdPackage.FUNCTION_TEMPLATE__CONDUCTING_EQUIPMENT:
            return isSetConductingEquipment();
        case AsdPackage.FUNCTION_TEMPLATE__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals( type );
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
        result.append( type );
        result.append( ')' );
        return result.toString();
    }

} //FunctionTemplateImpl
