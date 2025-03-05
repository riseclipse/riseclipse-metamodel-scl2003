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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProtocolImpl#getMustUnderstand <em>Must Understand</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProtocolImpl#getParentControlWithIEDName <em>Parent Control With IED Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProtocolImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolImpl extends SclObjectImpl implements Protocol {
    /**
     * The default value of the '{@link #getMustUnderstand() <em>Must Understand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMustUnderstand()
     * @generated
     * @ordered
     */
    protected static final Boolean MUST_UNDERSTAND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMustUnderstand() <em>Must Understand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMustUnderstand()
     * @generated
     * @ordered
     */
    protected Boolean mustUnderstand = MUST_UNDERSTAND_EDEFAULT;

    /**
     * This is true if the Must Understand attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mustUnderstandESet;

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
    protected ProtocolImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getProtocol();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMustUnderstand() {
        return mustUnderstand;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMustUnderstand( Boolean newMustUnderstand ) {
        Boolean oldMustUnderstand = mustUnderstand;
        mustUnderstand = newMustUnderstand;
        boolean oldMustUnderstandESet = mustUnderstandESet;
        mustUnderstandESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.PROTOCOL__MUST_UNDERSTAND,
                    oldMustUnderstand, mustUnderstand, !oldMustUnderstandESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMustUnderstand() {
        Boolean oldMustUnderstand = mustUnderstand;
        boolean oldMustUnderstandESet = mustUnderstandESet;
        mustUnderstand = MUST_UNDERSTAND_EDEFAULT;
        mustUnderstandESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.PROTOCOL__MUST_UNDERSTAND,
                    oldMustUnderstand, MUST_UNDERSTAND_EDEFAULT, oldMustUnderstandESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMustUnderstand() {
        return mustUnderstandESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlWithIEDName getParentControlWithIEDName() {
        if( eContainerFeatureID() != SclPackage.PROTOCOL__PARENT_CONTROL_WITH_IED_NAME ) {
            return null;
        }
        return ( ControlWithIEDName ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentControlWithIEDName( ControlWithIEDName newParentControlWithIEDName,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentControlWithIEDName,
                SclPackage.PROTOCOL__PARENT_CONTROL_WITH_IED_NAME, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentControlWithIEDName( ControlWithIEDName newParentControlWithIEDName ) {
        if( newParentControlWithIEDName != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.PROTOCOL__PARENT_CONTROL_WITH_IED_NAME
                        && newParentControlWithIEDName != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentControlWithIEDName ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentControlWithIEDName != null ) {
                msgs = ( ( InternalEObject ) newParentControlWithIEDName ).eInverseAdd( this,
                        SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL, ControlWithIEDName.class, msgs );
            }
            msgs = basicSetParentControlWithIEDName( newParentControlWithIEDName, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.PROTOCOL__PARENT_CONTROL_WITH_IED_NAME,
                    newParentControlWithIEDName, newParentControlWithIEDName ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.PROTOCOL__VALUE, oldValue, value ) );
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
        case SclPackage.PROTOCOL__PARENT_CONTROL_WITH_IED_NAME:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentControlWithIEDName( ( ControlWithIEDName ) otherEnd, msgs );
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
        case SclPackage.PROTOCOL__PARENT_CONTROL_WITH_IED_NAME:
            return basicSetParentControlWithIEDName( null, msgs );
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
        case SclPackage.PROTOCOL__PARENT_CONTROL_WITH_IED_NAME:
            return eInternalContainer().eInverseRemove( this, SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL,
                    ControlWithIEDName.class, msgs );
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
        case SclPackage.PROTOCOL__MUST_UNDERSTAND:
            return getMustUnderstand();
        case SclPackage.PROTOCOL__PARENT_CONTROL_WITH_IED_NAME:
            return getParentControlWithIEDName();
        case SclPackage.PROTOCOL__VALUE:
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
        case SclPackage.PROTOCOL__MUST_UNDERSTAND:
            setMustUnderstand( ( Boolean ) newValue );
            return;
        case SclPackage.PROTOCOL__PARENT_CONTROL_WITH_IED_NAME:
            setParentControlWithIEDName( ( ControlWithIEDName ) newValue );
            return;
        case SclPackage.PROTOCOL__VALUE:
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
        case SclPackage.PROTOCOL__MUST_UNDERSTAND:
            unsetMustUnderstand();
            return;
        case SclPackage.PROTOCOL__PARENT_CONTROL_WITH_IED_NAME:
            setParentControlWithIEDName( ( ControlWithIEDName ) null );
            return;
        case SclPackage.PROTOCOL__VALUE:
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
        case SclPackage.PROTOCOL__MUST_UNDERSTAND:
            return isSetMustUnderstand();
        case SclPackage.PROTOCOL__PARENT_CONTROL_WITH_IED_NAME:
            return getParentControlWithIEDName() != null;
        case SclPackage.PROTOCOL__VALUE:
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
        result.append( " (mustUnderstand: " );
        if( mustUnderstandESet ) {
            result.append( mustUnderstand );
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
        return getParentControlWithIEDName().getXpath() + "/scl:Protocol";
    }

} //ProtocolImpl
