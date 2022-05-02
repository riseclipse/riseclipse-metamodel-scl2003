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

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.DO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.INamespaceGetter;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclUtilities;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOImpl#getTransient <em>Transient</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOImpl#getParentLNodeType <em>Parent LNode Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOImpl#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOImpl#getReferredByDOI <em>Referred By DOI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DOImpl extends AbstractDataObjectImpl implements DO {
    /**
     * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespace()
     * @generated
     * @ordered
     */
    protected static final String NAMESPACE_EDEFAULT = null;

    /**
     * The default value of the '{@link #getTransient() <em>Transient</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransient()
     * @generated
     * @ordered
     */
    protected static final Boolean TRANSIENT_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getTransient() <em>Transient</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransient()
     * @generated
     * @ordered
     */
    protected Boolean transient_ = TRANSIENT_EDEFAULT;

    /**
     * This is true if the Transient attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transientESet;

    /**
     * The default value of the '{@link #getAccessControl() <em>Access Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccessControl()
     * @generated
     * @ordered
     */
    protected static final String ACCESS_CONTROL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAccessControl() <em>Access Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccessControl()
     * @generated
     * @ordered
     */
    protected String accessControl = ACCESS_CONTROL_EDEFAULT;

    /**
     * This is true if the Access Control attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean accessControlESet;

    /**
     * The cached value of the '{@link #getReferredByDOI() <em>Referred By DOI</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByDOI()
     * @generated
     * @ordered
     */
    protected EList< DOI > referredByDOI;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DOImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getDO();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getTransient() {
        return transient_;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTransient( Boolean newTransient ) {
        Boolean oldTransient = transient_;
        transient_ = newTransient;
        boolean oldTransientESet = transientESet;
        transientESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DO__TRANSIENT, oldTransient, transient_,
                    !oldTransientESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransient() {
        Boolean oldTransient = transient_;
        boolean oldTransientESet = transientESet;
        transient_ = TRANSIENT_EDEFAULT;
        transientESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DO__TRANSIENT, oldTransient,
                    TRANSIENT_EDEFAULT, oldTransientESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransient() {
        return transientESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNodeType getParentLNodeType() {
        if( eContainerFeatureID() != SclPackage.DO__PARENT_LNODE_TYPE ) return null;
        return ( LNodeType ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentLNodeType( LNodeType newParentLNodeType, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentLNodeType, SclPackage.DO__PARENT_LNODE_TYPE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentLNodeType( LNodeType newParentLNodeType ) {
        if( newParentLNodeType != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.DO__PARENT_LNODE_TYPE && newParentLNodeType != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentLNodeType ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentLNodeType != null )
                msgs = ( ( InternalEObject ) newParentLNodeType ).eInverseAdd( this, SclPackage.LNODE_TYPE__DO,
                        LNodeType.class, msgs );
            msgs = basicSetParentLNodeType( newParentLNodeType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DO__PARENT_LNODE_TYPE,
                    newParentLNodeType, newParentLNodeType ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAccessControl() {
        return accessControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAccessControl( String newAccessControl ) {
        String oldAccessControl = accessControl;
        accessControl = newAccessControl;
        boolean oldAccessControlESet = accessControlESet;
        accessControlESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DO__ACCESS_CONTROL, oldAccessControl,
                    accessControl, !oldAccessControlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAccessControl() {
        String oldAccessControl = accessControl;
        boolean oldAccessControlESet = accessControlESet;
        accessControl = ACCESS_CONTROL_EDEFAULT;
        accessControlESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DO__ACCESS_CONTROL, oldAccessControl,
                    ACCESS_CONTROL_EDEFAULT, oldAccessControlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccessControl() {
        return accessControlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DOI > getReferredByDOI() {
        if( referredByDOI == null ) {
            referredByDOI = new EObjectWithInverseEList.Unsettable< >( DOI.class, this,
                    SclPackage.DO__REFERRED_BY_DOI, SclPackage.DOI__REFERS_TO_DO );
        }
        return referredByDOI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByDOI() {
        if( referredByDOI != null ) ( ( InternalEList.Unsettable< ? > ) referredByDOI ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByDOI() {
        return referredByDOI != null && ( ( InternalEList.Unsettable< ? > ) referredByDOI ).isSet();
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
        case SclPackage.DO__PARENT_LNODE_TYPE:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentLNodeType( ( LNodeType ) otherEnd, msgs );
        case SclPackage.DO__REFERRED_BY_DOI:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByDOI() )
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
        case SclPackage.DO__PARENT_LNODE_TYPE:
            return basicSetParentLNodeType( null, msgs );
        case SclPackage.DO__REFERRED_BY_DOI:
            return ( ( InternalEList< ? > ) getReferredByDOI() ).basicRemove( otherEnd, msgs );
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
        case SclPackage.DO__PARENT_LNODE_TYPE:
            return eInternalContainer().eInverseRemove( this, SclPackage.LNODE_TYPE__DO, LNodeType.class, msgs );
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
        case SclPackage.DO__NAMESPACE:
            return getNamespace();
        case SclPackage.DO__TRANSIENT:
            return getTransient();
        case SclPackage.DO__PARENT_LNODE_TYPE:
            return getParentLNodeType();
        case SclPackage.DO__ACCESS_CONTROL:
            return getAccessControl();
        case SclPackage.DO__REFERRED_BY_DOI:
            return getReferredByDOI();
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
        case SclPackage.DO__TRANSIENT:
            setTransient( ( Boolean ) newValue );
            return;
        case SclPackage.DO__PARENT_LNODE_TYPE:
            setParentLNodeType( ( LNodeType ) newValue );
            return;
        case SclPackage.DO__ACCESS_CONTROL:
            setAccessControl( ( String ) newValue );
            return;
        case SclPackage.DO__REFERRED_BY_DOI:
            getReferredByDOI().clear();
            getReferredByDOI().addAll( ( Collection< ? extends DOI > ) newValue );
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
        case SclPackage.DO__TRANSIENT:
            unsetTransient();
            return;
        case SclPackage.DO__PARENT_LNODE_TYPE:
            setParentLNodeType( ( LNodeType ) null );
            return;
        case SclPackage.DO__ACCESS_CONTROL:
            unsetAccessControl();
            return;
        case SclPackage.DO__REFERRED_BY_DOI:
            unsetReferredByDOI();
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
        case SclPackage.DO__NAMESPACE:
            return NAMESPACE_EDEFAULT == null ? getNamespace() != null : !NAMESPACE_EDEFAULT.equals( getNamespace() );
        case SclPackage.DO__TRANSIENT:
            return isSetTransient();
        case SclPackage.DO__PARENT_LNODE_TYPE:
            return getParentLNodeType() != null;
        case SclPackage.DO__ACCESS_CONTROL:
            return isSetAccessControl();
        case SclPackage.DO__REFERRED_BY_DOI:
            return isSetReferredByDOI();
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
        if( baseClass == INamespaceGetter.class ) {
            switch( derivedFeatureID ) {
            case SclPackage.DO__NAMESPACE:
                return SclPackage.INAMESPACE_GETTER__NAMESPACE;
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
        if( baseClass == INamespaceGetter.class ) {
            switch( baseFeatureID ) {
            case SclPackage.INAMESPACE_GETTER__NAMESPACE:
                return SclPackage.DO__NAMESPACE;
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
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (transient: " );
        if( transientESet )
            result.append( transient_ );
        else
            result.append( "<unset>" );
        result.append( ", accessControl: " );
        if( accessControlESet )
            result.append( accessControl );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getLineNumber(), "DOImpl.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        // name             The data object name as specified for example in IEC 61850-7-4
        // type             The type references the id of a DOType definition
        // accessControl    Access control definition for this DO. If it is missing then any higher-level
        //                  access control definition applies
        // transient        If set to true, it indicates that the Transient definition from IEC 61850-7-4 applies

        String messagePrefix = "while resolving link from DO: ";

        if( ( getType() == null ) || getType().isEmpty() ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                    messagePrefix, "type is missing" );
            return;
        }
        // No error or warning message here: if this happens, error should have been detected before
        DataTypeTemplates dtt = SclUtilities.getSCL( this ).getDataTypeTemplates();
        if( dtt == null ) return;

        List< DOType > res = dtt
                .getDOType()
                .stream()
                .filter( d -> getType().equals( d.getId() ) )
                .collect( Collectors.toList() );

        if( res.size() != 1 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                    messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                    " DOType( id = ", getType(), " )" );
            return;
        }
        setRefersToDOType( res.get( 0 ) );
        console.notice( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                "DO refers to DOType( id = ", getType(), " ) on line ", getRefersToDOType().getLineNumber() );
    }

    @Override
    public String getNamespace() {
        //@formatter:off

        // The attribute dataNs shall be a DataAttribute of the data.
        //
        // 1.  DO.DOType.namespace                                  if not null
        // 2.  DO.ParentLNodeType.namespace                         otherwise

        if( getRefersToDOType() != null ) {
            String ns = getRefersToDOType().getNamespace();
            if( ns != null ) return ns;
        }

        if( getParentLNodeType() != null ) {
            return getParentLNodeType().getNamespace();
        }
        return null;

        //@formatter:on
    }

} //DOImpl
