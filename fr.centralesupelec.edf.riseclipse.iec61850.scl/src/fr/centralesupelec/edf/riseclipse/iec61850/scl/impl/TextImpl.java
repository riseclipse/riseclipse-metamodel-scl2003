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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Header;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TextImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TextImpl#getParentBaseElement <em>Parent Base Element</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TextImpl#getParentHeader <em>Parent Header</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TextImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextImpl extends SclObjectImpl implements Text {
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
    protected TextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getText();
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.TEXT__SOURCE, oldSource, source,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.TEXT__SOURCE, oldSource,
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
    public BaseElement getParentBaseElement() {
        if( eContainerFeatureID() != SclPackage.TEXT__PARENT_BASE_ELEMENT ) return null;
        return ( BaseElement ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentBaseElement( BaseElement newParentBaseElement, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentBaseElement, SclPackage.TEXT__PARENT_BASE_ELEMENT,
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
                || ( eContainerFeatureID() != SclPackage.TEXT__PARENT_BASE_ELEMENT && newParentBaseElement != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentBaseElement ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentBaseElement != null )
                msgs = ( ( InternalEObject ) newParentBaseElement ).eInverseAdd( this, SclPackage.BASE_ELEMENT__TEXT,
                        BaseElement.class, msgs );
            msgs = basicSetParentBaseElement( newParentBaseElement, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.TEXT__PARENT_BASE_ELEMENT,
                    newParentBaseElement, newParentBaseElement ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Header getParentHeader() {
        if( eContainerFeatureID() != SclPackage.TEXT__PARENT_HEADER ) return null;
        return ( Header ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentHeader( Header newParentHeader, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentHeader, SclPackage.TEXT__PARENT_HEADER, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentHeader( Header newParentHeader ) {
        if( newParentHeader != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.TEXT__PARENT_HEADER && newParentHeader != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentHeader ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentHeader != null )
                msgs = ( ( InternalEObject ) newParentHeader ).eInverseAdd( this, SclPackage.HEADER__TEXT, Header.class,
                        msgs );
            msgs = basicSetParentHeader( newParentHeader, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.TEXT__PARENT_HEADER, newParentHeader,
                    newParentHeader ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.TEXT__VALUE, oldValue, value ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.TEXT__PARENT_BASE_ELEMENT:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentBaseElement( ( BaseElement ) otherEnd, msgs );
        case SclPackage.TEXT__PARENT_HEADER:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentHeader( ( Header ) otherEnd, msgs );
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
        case SclPackage.TEXT__PARENT_BASE_ELEMENT:
            return basicSetParentBaseElement( null, msgs );
        case SclPackage.TEXT__PARENT_HEADER:
            return basicSetParentHeader( null, msgs );
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
        case SclPackage.TEXT__PARENT_BASE_ELEMENT:
            return eInternalContainer().eInverseRemove( this, SclPackage.BASE_ELEMENT__TEXT, BaseElement.class, msgs );
        case SclPackage.TEXT__PARENT_HEADER:
            return eInternalContainer().eInverseRemove( this, SclPackage.HEADER__TEXT, Header.class, msgs );
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
        case SclPackage.TEXT__SOURCE:
            return getSource();
        case SclPackage.TEXT__PARENT_BASE_ELEMENT:
            return getParentBaseElement();
        case SclPackage.TEXT__PARENT_HEADER:
            return getParentHeader();
        case SclPackage.TEXT__VALUE:
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
        case SclPackage.TEXT__SOURCE:
            setSource( ( String ) newValue );
            return;
        case SclPackage.TEXT__PARENT_BASE_ELEMENT:
            setParentBaseElement( ( BaseElement ) newValue );
            return;
        case SclPackage.TEXT__PARENT_HEADER:
            setParentHeader( ( Header ) newValue );
            return;
        case SclPackage.TEXT__VALUE:
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
        case SclPackage.TEXT__SOURCE:
            unsetSource();
            return;
        case SclPackage.TEXT__PARENT_BASE_ELEMENT:
            setParentBaseElement( ( BaseElement ) null );
            return;
        case SclPackage.TEXT__PARENT_HEADER:
            setParentHeader( ( Header ) null );
            return;
        case SclPackage.TEXT__VALUE:
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
        case SclPackage.TEXT__SOURCE:
            return isSetSource();
        case SclPackage.TEXT__PARENT_BASE_ELEMENT:
            return getParentBaseElement() != null;
        case SclPackage.TEXT__PARENT_HEADER:
            return getParentHeader() != null;
        case SclPackage.TEXT__VALUE:
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
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (source: " );
        if( sourceESet )
            result.append( source );
        else
            result.append( "<unset>" );
        result.append( ", value: " );
        result.append( value );
        result.append( ')' );
        return result.toString();
    }

} //TextImpl
