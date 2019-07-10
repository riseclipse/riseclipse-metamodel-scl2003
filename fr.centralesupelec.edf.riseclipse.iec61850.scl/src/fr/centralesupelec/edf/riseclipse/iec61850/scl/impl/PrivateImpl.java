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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Private</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PrivateImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PrivateImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PrivateImpl#getParentBaseElement <em>Parent Base Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivateImpl extends AnyContentFromOtherNamespaceImpl implements Private {
    /**
     * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected String source = SOURCE_EDEFAULT;

    /**
     * This is true if the Source attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sourceESet;

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
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PrivateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getPrivate();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSource( String newSource ) {
        String oldSource = source;
        source = newSource;
        boolean oldSourceESet = sourceESet;
        sourceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.PRIVATE__SOURCE, oldSource, source,
                    !oldSourceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSource() {
        String oldSource = source;
        boolean oldSourceESet = sourceESet;
        source = SOURCE_EDEFAULT;
        sourceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.PRIVATE__SOURCE, oldSource,
                    SOURCE_EDEFAULT, oldSourceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSource() {
        return sourceESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.PRIVATE__TYPE, oldType, type,
                    !oldTypeESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.PRIVATE__TYPE, oldType, TYPE_EDEFAULT,
                    oldTypeESet ) );
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
    public BaseElement getParentBaseElement() {
        if( eContainerFeatureID() != SclPackage.PRIVATE__PARENT_BASE_ELEMENT ) return null;
        return ( BaseElement ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentBaseElement( BaseElement newParentBaseElement, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentBaseElement, SclPackage.PRIVATE__PARENT_BASE_ELEMENT,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentBaseElement( BaseElement newParentBaseElement ) {
        if( newParentBaseElement != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.PRIVATE__PARENT_BASE_ELEMENT
                        && newParentBaseElement != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentBaseElement ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentBaseElement != null )
                msgs = ( ( InternalEObject ) newParentBaseElement ).eInverseAdd( this, SclPackage.BASE_ELEMENT__PRIVATE,
                        BaseElement.class, msgs );
            msgs = basicSetParentBaseElement( newParentBaseElement, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.PRIVATE__PARENT_BASE_ELEMENT,
                    newParentBaseElement, newParentBaseElement ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.PRIVATE__PARENT_BASE_ELEMENT:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentBaseElement( ( BaseElement ) otherEnd, msgs );
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
        case SclPackage.PRIVATE__PARENT_BASE_ELEMENT:
            return basicSetParentBaseElement( null, msgs );
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
        case SclPackage.PRIVATE__PARENT_BASE_ELEMENT:
            return eInternalContainer().eInverseRemove( this, SclPackage.BASE_ELEMENT__PRIVATE, BaseElement.class,
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
        case SclPackage.PRIVATE__SOURCE:
            return getSource();
        case SclPackage.PRIVATE__TYPE:
            return getType();
        case SclPackage.PRIVATE__PARENT_BASE_ELEMENT:
            return getParentBaseElement();
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
        case SclPackage.PRIVATE__SOURCE:
            setSource( ( String ) newValue );
            return;
        case SclPackage.PRIVATE__TYPE:
            setType( ( String ) newValue );
            return;
        case SclPackage.PRIVATE__PARENT_BASE_ELEMENT:
            setParentBaseElement( ( BaseElement ) newValue );
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
        case SclPackage.PRIVATE__SOURCE:
            unsetSource();
            return;
        case SclPackage.PRIVATE__TYPE:
            unsetType();
            return;
        case SclPackage.PRIVATE__PARENT_BASE_ELEMENT:
            setParentBaseElement( ( BaseElement ) null );
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
        case SclPackage.PRIVATE__SOURCE:
            return isSetSource();
        case SclPackage.PRIVATE__TYPE:
            return isSetType();
        case SclPackage.PRIVATE__PARENT_BASE_ELEMENT:
            return getParentBaseElement() != null;
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
        result.append( " (source: " );
        if( sourceESet )
            result.append( source );
        else
            result.append( "<unset>" );
        result.append( ", type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PrivateImpl
