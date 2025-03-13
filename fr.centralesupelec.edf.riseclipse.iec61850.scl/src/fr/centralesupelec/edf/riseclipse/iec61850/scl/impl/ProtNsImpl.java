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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.DA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prot Ns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProtNsImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProtNsImpl#getParentDA <em>Parent DA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProtNsImpl#getParentDAType <em>Parent DA Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProtNsImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtNsImpl extends SclObjectImpl implements ProtNs {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = "8-MMS";

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
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProtNsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getProtNs();
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.PROT_NS__TYPE, oldType, type,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.PROT_NS__TYPE, oldType, TYPE_EDEFAULT,
                    oldTypeESet ) );
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
    public DA getParentDA() {
        if( eContainerFeatureID() != SclPackage.PROT_NS__PARENT_DA ) {
            return null;
        }
        return ( DA ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentDA( DA newParentDA, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDA, SclPackage.PROT_NS__PARENT_DA, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentDA( DA newParentDA ) {
        if( newParentDA != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.PROT_NS__PARENT_DA && newParentDA != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDA ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDA != null ) {
                msgs = ( ( InternalEObject ) newParentDA ).eInverseAdd( this, SclPackage.DA__PROT_NS, DA.class, msgs );
            }
            msgs = basicSetParentDA( newParentDA, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.PROT_NS__PARENT_DA, newParentDA,
                    newParentDA ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DAType getParentDAType() {
        if( eContainerFeatureID() != SclPackage.PROT_NS__PARENT_DA_TYPE ) {
            return null;
        }
        return ( DAType ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentDAType( DAType newParentDAType, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDAType, SclPackage.PROT_NS__PARENT_DA_TYPE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentDAType( DAType newParentDAType ) {
        if( newParentDAType != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.PROT_NS__PARENT_DA_TYPE && newParentDAType != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDAType ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDAType != null ) {
                msgs = ( ( InternalEObject ) newParentDAType ).eInverseAdd( this, SclPackage.DA_TYPE__PROT_NS,
                        DAType.class, msgs );
            }
            msgs = basicSetParentDAType( newParentDAType, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.PROT_NS__PARENT_DA_TYPE, newParentDAType,
                    newParentDAType ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue( String newValue ) {
        String oldValue = value;
        value = newValue;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.PROT_NS__VALUE, oldValue, value ) );
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
        case SclPackage.PROT_NS__PARENT_DA:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDA( ( DA ) otherEnd, msgs );
        case SclPackage.PROT_NS__PARENT_DA_TYPE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDAType( ( DAType ) otherEnd, msgs );
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
        case SclPackage.PROT_NS__PARENT_DA:
            return basicSetParentDA( null, msgs );
        case SclPackage.PROT_NS__PARENT_DA_TYPE:
            return basicSetParentDAType( null, msgs );
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
        case SclPackage.PROT_NS__PARENT_DA:
            return eInternalContainer().eInverseRemove( this, SclPackage.DA__PROT_NS, DA.class, msgs );
        case SclPackage.PROT_NS__PARENT_DA_TYPE:
            return eInternalContainer().eInverseRemove( this, SclPackage.DA_TYPE__PROT_NS, DAType.class, msgs );
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
        case SclPackage.PROT_NS__TYPE:
            return getType();
        case SclPackage.PROT_NS__PARENT_DA:
            return getParentDA();
        case SclPackage.PROT_NS__PARENT_DA_TYPE:
            return getParentDAType();
        case SclPackage.PROT_NS__VALUE:
            return getValue();
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
        case SclPackage.PROT_NS__TYPE:
            setType( ( String ) newValue );
            return;
        case SclPackage.PROT_NS__PARENT_DA:
            setParentDA( ( DA ) newValue );
            return;
        case SclPackage.PROT_NS__PARENT_DA_TYPE:
            setParentDAType( ( DAType ) newValue );
            return;
        case SclPackage.PROT_NS__VALUE:
            setValue( ( String ) newValue );
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
        case SclPackage.PROT_NS__TYPE:
            unsetType();
            return;
        case SclPackage.PROT_NS__PARENT_DA:
            setParentDA( ( DA ) null );
            return;
        case SclPackage.PROT_NS__PARENT_DA_TYPE:
            setParentDAType( ( DAType ) null );
            return;
        case SclPackage.PROT_NS__VALUE:
            setValue( VALUE_EDEFAULT );
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
        case SclPackage.PROT_NS__TYPE:
            return isSetType();
        case SclPackage.PROT_NS__PARENT_DA:
            return getParentDA() != null;
        case SclPackage.PROT_NS__PARENT_DA_TYPE:
            return getParentDAType() != null;
        case SclPackage.PROT_NS__VALUE:
            return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals( value );
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
        result.append( ", value: " );
        result.append( value );
        result.append( ')' );
        return result.toString();
    }

    @Override
    public String getXpath() {
        if( getParentDA() != null ) {
            if( getParentDA().getProtNs().size() == 1 ) {
                return getParentDA().getXpath() + "/scl:ProtNs";
            }
            return getParentDA().getXpath() + "/scl:ProtNs[" + ( getParentDA().getProtNs().indexOf( this ) + 1 ) + "]";
        }
        if( getParentDAType().getProtNs().size() == 1 ) {
            return getParentDAType().getXpath() + "/scl:ProtNs";
        }
        return getParentDAType().getXpath() + "/scl:ProtNs[" + ( getParentDAType().getProtNs().indexOf( this ) + 1 )
                + "]";
    }

} //ProtNsImpl
