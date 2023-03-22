/*
*************************************************************************
**  Copyright (c) 2016-2022 CentraleSupélec & EDF.
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

import org.apache.commons.lang3.tuple.Pair;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclUtilities;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server At</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerAtImpl#getApName <em>Ap Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerAtImpl#getParentAccessPoint <em>Parent Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerAtImpl#getRefersToAccessPoint <em>Refers To Access Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerAtImpl extends UnNamingImpl implements ServerAt {
    /**
     * The default value of the '{@link #getApName() <em>Ap Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApName()
     * @generated
     * @ordered
     */
    protected static final String AP_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getApName() <em>Ap Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApName()
     * @generated
     * @ordered
     */
    protected String apName = AP_NAME_EDEFAULT;

    /**
     * This is true if the Ap Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean apNameESet;

    /**
     * The cached value of the '{@link #getRefersToAccessPoint() <em>Refers To Access Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToAccessPoint()
     * @generated
     * @ordered
     */
    protected AccessPoint refersToAccessPoint;

    /**
     * This is true if the Refers To Access Point reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToAccessPointESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServerAtImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getServerAt();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getApName() {
        return apName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApName( String newApName ) {
        String oldApName = apName;
        apName = newApName;
        boolean oldApNameESet = apNameESet;
        apNameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SERVER_AT__AP_NAME, oldApName, apName,
                    !oldApNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetApName() {
        String oldApName = apName;
        boolean oldApNameESet = apNameESet;
        apName = AP_NAME_EDEFAULT;
        apNameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SERVER_AT__AP_NAME, oldApName,
                    AP_NAME_EDEFAULT, oldApNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetApName() {
        return apNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccessPoint getParentAccessPoint() {
        if( eContainerFeatureID() != SclPackage.SERVER_AT__PARENT_ACCESS_POINT ) return null;
        return ( AccessPoint ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAccessPoint( AccessPoint newParentAccessPoint, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentAccessPoint, SclPackage.SERVER_AT__PARENT_ACCESS_POINT,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAccessPoint( AccessPoint newParentAccessPoint ) {
        if( newParentAccessPoint != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SERVER_AT__PARENT_ACCESS_POINT
                        && newParentAccessPoint != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentAccessPoint ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentAccessPoint != null )
                msgs = ( ( InternalEObject ) newParentAccessPoint ).eInverseAdd( this,
                        SclPackage.ACCESS_POINT__SERVER_AT, AccessPoint.class, msgs );
            msgs = basicSetParentAccessPoint( newParentAccessPoint, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SERVER_AT__PARENT_ACCESS_POINT,
                    newParentAccessPoint, newParentAccessPoint ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccessPoint getRefersToAccessPoint() {
        return refersToAccessPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToAccessPoint( AccessPoint newRefersToAccessPoint, NotificationChain msgs ) {
        AccessPoint oldRefersToAccessPoint = refersToAccessPoint;
        refersToAccessPoint = newRefersToAccessPoint;
        boolean oldRefersToAccessPointESet = refersToAccessPointESet;
        refersToAccessPointESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT, oldRefersToAccessPoint, newRefersToAccessPoint,
                    !oldRefersToAccessPointESet );
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
    public void setRefersToAccessPoint( AccessPoint newRefersToAccessPoint ) {
        if( newRefersToAccessPoint != refersToAccessPoint ) {
            NotificationChain msgs = null;
            if( refersToAccessPoint != null )
                msgs = ( ( InternalEObject ) refersToAccessPoint ).eInverseRemove( this,
                        SclPackage.ACCESS_POINT__REFERRED_BY_SERVER_AT, AccessPoint.class, msgs );
            if( newRefersToAccessPoint != null )
                msgs = ( ( InternalEObject ) newRefersToAccessPoint ).eInverseAdd( this,
                        SclPackage.ACCESS_POINT__REFERRED_BY_SERVER_AT, AccessPoint.class, msgs );
            msgs = basicSetRefersToAccessPoint( newRefersToAccessPoint, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToAccessPointESet = refersToAccessPointESet;
            refersToAccessPointESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT,
                        newRefersToAccessPoint, newRefersToAccessPoint, !oldRefersToAccessPointESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToAccessPoint( NotificationChain msgs ) {
        AccessPoint oldRefersToAccessPoint = refersToAccessPoint;
        refersToAccessPoint = null;
        boolean oldRefersToAccessPointESet = refersToAccessPointESet;
        refersToAccessPointESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT, oldRefersToAccessPoint, null,
                    oldRefersToAccessPointESet );
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
    public void unsetRefersToAccessPoint() {
        if( refersToAccessPoint != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToAccessPoint ).eInverseRemove( this,
                    SclPackage.ACCESS_POINT__REFERRED_BY_SERVER_AT, AccessPoint.class, msgs );
            msgs = basicUnsetRefersToAccessPoint( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToAccessPointESet = refersToAccessPointESet;
            refersToAccessPointESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT,
                        null, null, oldRefersToAccessPointESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToAccessPoint() {
        return refersToAccessPointESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.SERVER_AT__PARENT_ACCESS_POINT:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentAccessPoint( ( AccessPoint ) otherEnd, msgs );
        case SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT:
            if( refersToAccessPoint != null )
                msgs = ( ( InternalEObject ) refersToAccessPoint ).eInverseRemove( this,
                        SclPackage.ACCESS_POINT__REFERRED_BY_SERVER_AT, AccessPoint.class, msgs );
            return basicSetRefersToAccessPoint( ( AccessPoint ) otherEnd, msgs );
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
        case SclPackage.SERVER_AT__PARENT_ACCESS_POINT:
            return basicSetParentAccessPoint( null, msgs );
        case SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT:
            return basicUnsetRefersToAccessPoint( msgs );
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
        case SclPackage.SERVER_AT__PARENT_ACCESS_POINT:
            return eInternalContainer().eInverseRemove( this, SclPackage.ACCESS_POINT__SERVER_AT, AccessPoint.class,
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
        case SclPackage.SERVER_AT__AP_NAME:
            return getApName();
        case SclPackage.SERVER_AT__PARENT_ACCESS_POINT:
            return getParentAccessPoint();
        case SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT:
            return getRefersToAccessPoint();
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
        case SclPackage.SERVER_AT__AP_NAME:
            setApName( ( String ) newValue );
            return;
        case SclPackage.SERVER_AT__PARENT_ACCESS_POINT:
            setParentAccessPoint( ( AccessPoint ) newValue );
            return;
        case SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT:
            setRefersToAccessPoint( ( AccessPoint ) newValue );
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
        case SclPackage.SERVER_AT__AP_NAME:
            unsetApName();
            return;
        case SclPackage.SERVER_AT__PARENT_ACCESS_POINT:
            setParentAccessPoint( ( AccessPoint ) null );
            return;
        case SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT:
            unsetRefersToAccessPoint();
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
        case SclPackage.SERVER_AT__AP_NAME:
            return isSetApName();
        case SclPackage.SERVER_AT__PARENT_ACCESS_POINT:
            return getParentAccessPoint() != null;
        case SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT:
            return isSetRefersToAccessPoint();
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
        result.append( " (apName: " );
        if( apNameESet )
            result.append( apName );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(), "ServerAtImpl.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from ServerAt: ";

        if( ( getApName() == null ) || getApName().isEmpty() ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "apName is missing" );
            return;
        }

        // No error or warning messages here: if this happens, error should have been detected before
        IED ied = SclUtilities.getMyIED( this );
        if( ied == null ) return;

        Pair< AccessPoint, Integer > ap = SclUtilities.getAccessPoint( ied, getApName() );
        if( ap.getLeft() == null ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, ( ( ap.getRight() == 0 ) ? "cannot find" : "found several" ),
                    " AccessPoint( name = ", getApName(), " )" );
            return;
        }
        setRefersToAccessPoint( ap.getLeft() );
        console.notice( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "ServerAt refers to AccessPoint( name = ", getApName(), " ) on line ",
                getRefersToAccessPoint().getLineNumber() );
    }

} //ServerAtImpl
