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
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Line;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectivity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectivityNodeImpl#getPathName <em>Path Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectivityNodeImpl#getParentBay <em>Parent Bay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectivityNodeImpl#getReferredByTerminal <em>Referred By Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectivityNodeImpl#getParentLine <em>Parent Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectivityNodeImpl extends LNodeContainerImpl implements ConnectivityNode {
    /**
     * The default value of the '{@link #getPathName() <em>Path Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPathName()
     * @generated
     * @ordered
     */
    protected static final String PATH_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPathName() <em>Path Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPathName()
     * @generated
     * @ordered
     */
    protected String pathName = PATH_NAME_EDEFAULT;

    /**
     * This is true if the Path Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pathNameESet;

    /**
     * The cached value of the '{@link #getReferredByTerminal() <em>Referred By Terminal</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByTerminal()
     * @generated
     * @ordered
     */
    protected EList< Terminal > referredByTerminal;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectivityNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getConnectivityNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPathName() {
        return pathName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPathName( String newPathName ) {
        String oldPathName = pathName;
        pathName = newPathName;
        boolean oldPathNameESet = pathNameESet;
        pathNameESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CONNECTIVITY_NODE__PATH_NAME,
                    oldPathName, pathName, !oldPathNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPathName() {
        String oldPathName = pathName;
        boolean oldPathNameESet = pathNameESet;
        pathName = PATH_NAME_EDEFAULT;
        pathNameESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CONNECTIVITY_NODE__PATH_NAME,
                    oldPathName, PATH_NAME_EDEFAULT, oldPathNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPathName() {
        return pathNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Bay getParentBay() {
        if( eContainerFeatureID() != SclPackage.CONNECTIVITY_NODE__PARENT_BAY ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentBay, SclPackage.CONNECTIVITY_NODE__PARENT_BAY, msgs );
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
                || ( eContainerFeatureID() != SclPackage.CONNECTIVITY_NODE__PARENT_BAY && newParentBay != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentBay ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentBay != null ) {
                msgs = ( ( InternalEObject ) newParentBay ).eInverseAdd( this, SclPackage.BAY__CONNECTIVITY_NODE,
                        Bay.class, msgs );
            }
            msgs = basicSetParentBay( newParentBay, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CONNECTIVITY_NODE__PARENT_BAY,
                    newParentBay, newParentBay ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Terminal > getReferredByTerminal() {
        if( referredByTerminal == null ) {
            referredByTerminal = new EObjectWithInverseEList.Unsettable< >( Terminal.class, this,
                    SclPackage.CONNECTIVITY_NODE__REFERRED_BY_TERMINAL,
                    SclPackage.TERMINAL__REFERS_TO_CONNECTIVITY_NODE );
        }
        return referredByTerminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByTerminal() {
        if( referredByTerminal != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByTerminal ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByTerminal() {
        return referredByTerminal != null && ( ( InternalEList.Unsettable< ? > ) referredByTerminal ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Line getParentLine() {
        if( eContainerFeatureID() != SclPackage.CONNECTIVITY_NODE__PARENT_LINE ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentLine, SclPackage.CONNECTIVITY_NODE__PARENT_LINE, msgs );
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
                || ( eContainerFeatureID() != SclPackage.CONNECTIVITY_NODE__PARENT_LINE && newParentLine != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentLine ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentLine != null ) {
                msgs = ( ( InternalEObject ) newParentLine ).eInverseAdd( this, SclPackage.LINE__CONNECTIVITY_NODE,
                        Line.class, msgs );
            }
            msgs = basicSetParentLine( newParentLine, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CONNECTIVITY_NODE__PARENT_LINE,
                    newParentLine, newParentLine ) );
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
        case SclPackage.CONNECTIVITY_NODE__PARENT_BAY:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentBay( ( Bay ) otherEnd, msgs );
        case SclPackage.CONNECTIVITY_NODE__REFERRED_BY_TERMINAL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByTerminal() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.CONNECTIVITY_NODE__PARENT_LINE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentLine( ( Line ) otherEnd, msgs );
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
        case SclPackage.CONNECTIVITY_NODE__PARENT_BAY:
            return basicSetParentBay( null, msgs );
        case SclPackage.CONNECTIVITY_NODE__REFERRED_BY_TERMINAL:
            return ( ( InternalEList< ? > ) getReferredByTerminal() ).basicRemove( otherEnd, msgs );
        case SclPackage.CONNECTIVITY_NODE__PARENT_LINE:
            return basicSetParentLine( null, msgs );
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
        case SclPackage.CONNECTIVITY_NODE__PARENT_BAY:
            return eInternalContainer().eInverseRemove( this, SclPackage.BAY__CONNECTIVITY_NODE, Bay.class, msgs );
        case SclPackage.CONNECTIVITY_NODE__PARENT_LINE:
            return eInternalContainer().eInverseRemove( this, SclPackage.LINE__CONNECTIVITY_NODE, Line.class, msgs );
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
        case SclPackage.CONNECTIVITY_NODE__PATH_NAME:
            return getPathName();
        case SclPackage.CONNECTIVITY_NODE__PARENT_BAY:
            return getParentBay();
        case SclPackage.CONNECTIVITY_NODE__REFERRED_BY_TERMINAL:
            return getReferredByTerminal();
        case SclPackage.CONNECTIVITY_NODE__PARENT_LINE:
            return getParentLine();
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
        case SclPackage.CONNECTIVITY_NODE__PATH_NAME:
            setPathName( ( String ) newValue );
            return;
        case SclPackage.CONNECTIVITY_NODE__PARENT_BAY:
            setParentBay( ( Bay ) newValue );
            return;
        case SclPackage.CONNECTIVITY_NODE__REFERRED_BY_TERMINAL:
            getReferredByTerminal().clear();
            getReferredByTerminal().addAll( ( Collection< ? extends Terminal > ) newValue );
            return;
        case SclPackage.CONNECTIVITY_NODE__PARENT_LINE:
            setParentLine( ( Line ) newValue );
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
        case SclPackage.CONNECTIVITY_NODE__PATH_NAME:
            unsetPathName();
            return;
        case SclPackage.CONNECTIVITY_NODE__PARENT_BAY:
            setParentBay( ( Bay ) null );
            return;
        case SclPackage.CONNECTIVITY_NODE__REFERRED_BY_TERMINAL:
            unsetReferredByTerminal();
            return;
        case SclPackage.CONNECTIVITY_NODE__PARENT_LINE:
            setParentLine( ( Line ) null );
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
        case SclPackage.CONNECTIVITY_NODE__PATH_NAME:
            return isSetPathName();
        case SclPackage.CONNECTIVITY_NODE__PARENT_BAY:
            return getParentBay() != null;
        case SclPackage.CONNECTIVITY_NODE__REFERRED_BY_TERMINAL:
            return isSetReferredByTerminal();
        case SclPackage.CONNECTIVITY_NODE__PARENT_LINE:
            return getParentLine() != null;
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
        result.append( " (pathName: " );
        if( pathNameESet ) {
            result.append( pathName );
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
        if( getParentLine() != null ) {
            parentXpath = getParentLine().getXpath();
        }
        return parentXpath + "/scl:ConnectivityNode[@pathName='" + getPathName() + "']";
    }

} //ConnectivityNodeImpl
