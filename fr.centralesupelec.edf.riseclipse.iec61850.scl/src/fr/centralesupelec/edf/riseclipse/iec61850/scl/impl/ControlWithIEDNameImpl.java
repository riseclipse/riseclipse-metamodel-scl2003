/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
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
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control With IED Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlWithIEDNameImpl#getConfRev <em>Conf Rev</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlWithIEDNameImpl#getIEDName <em>IED Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlWithIEDNameImpl#getReferredByControlBlock <em>Referred By Control Block</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlWithIEDNameImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlWithIEDNameImpl extends ControlImpl implements ControlWithIEDName {
    /**
     * The default value of the '{@link #getConfRev() <em>Conf Rev</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfRev()
     * @generated
     * @ordered
     */
    protected static final Integer CONF_REV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConfRev() <em>Conf Rev</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfRev()
     * @generated
     * @ordered
     */
    protected Integer confRev = CONF_REV_EDEFAULT;

    /**
     * This is true if the Conf Rev attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean confRevESet;

    /**
     * The cached value of the '{@link #getIEDName() <em>IED Name</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIEDName()
     * @generated
     * @ordered
     */
    protected EList< IEDName > iedName;

    /**
     * The cached value of the '{@link #getReferredByControlBlock() <em>Referred By Control Block</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByControlBlock()
     * @generated
     * @ordered
     */
    protected EList< ControlBlock > referredByControlBlock;

    /**
     * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProtocol()
     * @generated
     * @ordered
     */
    protected Protocol protocol;

    /**
     * This is true if the Protocol containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean protocolESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ControlWithIEDNameImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getControlWithIEDName();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getConfRev() {
        return confRev;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConfRev( Integer newConfRev ) {
        Integer oldConfRev = confRev;
        confRev = newConfRev;
        boolean oldConfRevESet = confRevESet;
        confRevESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CONTROL_WITH_IED_NAME__CONF_REV,
                    oldConfRev, confRev, !oldConfRevESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConfRev() {
        Integer oldConfRev = confRev;
        boolean oldConfRevESet = confRevESet;
        confRev = CONF_REV_EDEFAULT;
        confRevESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CONTROL_WITH_IED_NAME__CONF_REV,
                    oldConfRev, CONF_REV_EDEFAULT, oldConfRevESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConfRev() {
        return confRevESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< IEDName > getIEDName() {
        if( iedName == null ) {
            iedName = new EObjectContainmentWithInverseEList.Unsettable< IEDName >( IEDName.class, this,
                    SclPackage.CONTROL_WITH_IED_NAME__IED_NAME, SclPackage.IED_NAME__PARENT_CONTROL_WITH_IED_NAME );
        }
        return iedName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIEDName() {
        if( iedName != null ) ( ( InternalEList.Unsettable< ? > ) iedName ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIEDName() {
        return iedName != null && ( ( InternalEList.Unsettable< ? > ) iedName ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ControlBlock > getReferredByControlBlock() {
        if( referredByControlBlock == null ) {
            referredByControlBlock = new EObjectWithInverseEList.Unsettable< ControlBlock >( ControlBlock.class, this,
                    SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK,
                    SclPackage.CONTROL_BLOCK__REFERS_TO_CONTROL_WITH_IED_NAME );
        }
        return referredByControlBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByControlBlock() {
        if( referredByControlBlock != null ) ( ( InternalEList.Unsettable< ? > ) referredByControlBlock ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByControlBlock() {
        return referredByControlBlock != null && ( ( InternalEList.Unsettable< ? > ) referredByControlBlock ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Protocol getProtocol() {
        return protocol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProtocol( Protocol newProtocol, NotificationChain msgs ) {
        Protocol oldProtocol = protocol;
        protocol = newProtocol;
        boolean oldProtocolESet = protocolESet;
        protocolESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL, oldProtocol, newProtocol, !oldProtocolESet );
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
    public void setProtocol( Protocol newProtocol ) {
        if( newProtocol != protocol ) {
            NotificationChain msgs = null;
            if( protocol != null )
                msgs = ( ( InternalEObject ) protocol ).eInverseRemove( this,
                        SclPackage.PROTOCOL__PARENT_CONTROL_WITH_IED_NAME, Protocol.class, msgs );
            if( newProtocol != null )
                msgs = ( ( InternalEObject ) newProtocol ).eInverseAdd( this,
                        SclPackage.PROTOCOL__PARENT_CONTROL_WITH_IED_NAME, Protocol.class, msgs );
            msgs = basicSetProtocol( newProtocol, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldProtocolESet = protocolESet;
            protocolESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL,
                        newProtocol, newProtocol, !oldProtocolESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetProtocol( NotificationChain msgs ) {
        Protocol oldProtocol = protocol;
        protocol = null;
        boolean oldProtocolESet = protocolESet;
        protocolESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL, oldProtocol, null, oldProtocolESet );
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
    public void unsetProtocol() {
        if( protocol != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) protocol ).eInverseRemove( this,
                    SclPackage.PROTOCOL__PARENT_CONTROL_WITH_IED_NAME, Protocol.class, msgs );
            msgs = basicUnsetProtocol( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldProtocolESet = protocolESet;
            protocolESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL,
                        null, null, oldProtocolESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProtocol() {
        return protocolESet;
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
        case SclPackage.CONTROL_WITH_IED_NAME__IED_NAME:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getIEDName() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByControlBlock() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL:
            if( protocol != null )
                msgs = ( ( InternalEObject ) protocol ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL, null, msgs );
            return basicSetProtocol( ( Protocol ) otherEnd, msgs );
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
        case SclPackage.CONTROL_WITH_IED_NAME__IED_NAME:
            return ( ( InternalEList< ? > ) getIEDName() ).basicRemove( otherEnd, msgs );
        case SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK:
            return ( ( InternalEList< ? > ) getReferredByControlBlock() ).basicRemove( otherEnd, msgs );
        case SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL:
            return basicUnsetProtocol( msgs );
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
        case SclPackage.CONTROL_WITH_IED_NAME__CONF_REV:
            return getConfRev();
        case SclPackage.CONTROL_WITH_IED_NAME__IED_NAME:
            return getIEDName();
        case SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK:
            return getReferredByControlBlock();
        case SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL:
            return getProtocol();
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
        case SclPackage.CONTROL_WITH_IED_NAME__CONF_REV:
            setConfRev( ( Integer ) newValue );
            return;
        case SclPackage.CONTROL_WITH_IED_NAME__IED_NAME:
            getIEDName().clear();
            getIEDName().addAll( ( Collection< ? extends IEDName > ) newValue );
            return;
        case SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK:
            getReferredByControlBlock().clear();
            getReferredByControlBlock().addAll( ( Collection< ? extends ControlBlock > ) newValue );
            return;
        case SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL:
            setProtocol( ( Protocol ) newValue );
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
        case SclPackage.CONTROL_WITH_IED_NAME__CONF_REV:
            unsetConfRev();
            return;
        case SclPackage.CONTROL_WITH_IED_NAME__IED_NAME:
            unsetIEDName();
            return;
        case SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK:
            unsetReferredByControlBlock();
            return;
        case SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL:
            unsetProtocol();
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
        case SclPackage.CONTROL_WITH_IED_NAME__CONF_REV:
            return isSetConfRev();
        case SclPackage.CONTROL_WITH_IED_NAME__IED_NAME:
            return isSetIEDName();
        case SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK:
            return isSetReferredByControlBlock();
        case SclPackage.CONTROL_WITH_IED_NAME__PROTOCOL:
            return isSetProtocol();
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
        result.append( " (confRev: " );
        if( confRevESet )
            result.append( confRev );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ControlWithIEDNameImpl
