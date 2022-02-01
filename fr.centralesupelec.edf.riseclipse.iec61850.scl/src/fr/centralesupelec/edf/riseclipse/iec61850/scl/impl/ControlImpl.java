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

import java.util.List;
import java.util.stream.Collectors;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Control;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlImpl#getDatSet <em>Dat Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlImpl#getRefersToDataSet <em>Refers To Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlImpl#getReferredByExtRef <em>Referred By Ext Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ControlImpl extends UnNamingImpl implements Control {
    /**
     * The default value of the '{@link #getDatSet() <em>Dat Set</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDatSet()
     * @generated
     * @ordered
     */
    protected static final String DAT_SET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDatSet() <em>Dat Set</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDatSet()
     * @generated
     * @ordered
     */
    protected String datSet = DAT_SET_EDEFAULT;

    /**
     * This is true if the Dat Set attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean datSetESet;

    /**
     * The cached value of the '{@link #getRefersToDataSet() <em>Refers To Data Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToDataSet()
     * @generated
     * @ordered
     */
    protected DataSet refersToDataSet;

    /**
     * This is true if the Refers To Data Set reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToDataSetESet;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

    /**
     * The cached value of the '{@link #getReferredByExtRef() <em>Referred By Ext Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByExtRef()
     * @generated
     * @ordered
     */
    protected EList< ExtRef > referredByExtRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ControlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getControl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDatSet() {
        return datSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDatSet( String newDatSet ) {
        String oldDatSet = datSet;
        datSet = newDatSet;
        boolean oldDatSetESet = datSetESet;
        datSetESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CONTROL__DAT_SET, oldDatSet, datSet,
                    !oldDatSetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDatSet() {
        String oldDatSet = datSet;
        boolean oldDatSetESet = datSetESet;
        datSet = DAT_SET_EDEFAULT;
        datSetESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CONTROL__DAT_SET, oldDatSet,
                    DAT_SET_EDEFAULT, oldDatSetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDatSet() {
        return datSetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataSet getRefersToDataSet() {
        return refersToDataSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToDataSet( DataSet newRefersToDataSet, NotificationChain msgs ) {
        DataSet oldRefersToDataSet = refersToDataSet;
        refersToDataSet = newRefersToDataSet;
        boolean oldRefersToDataSetESet = refersToDataSetESet;
        refersToDataSetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.CONTROL__REFERS_TO_DATA_SET, oldRefersToDataSet, newRefersToDataSet,
                    !oldRefersToDataSetESet );
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
    public void setRefersToDataSet( DataSet newRefersToDataSet ) {
        if( newRefersToDataSet != refersToDataSet ) {
            NotificationChain msgs = null;
            if( refersToDataSet != null )
                msgs = ( ( InternalEObject ) refersToDataSet ).eInverseRemove( this,
                        SclPackage.DATA_SET__REFERRED_BY_CONTROL, DataSet.class, msgs );
            if( newRefersToDataSet != null )
                msgs = ( ( InternalEObject ) newRefersToDataSet ).eInverseAdd( this,
                        SclPackage.DATA_SET__REFERRED_BY_CONTROL, DataSet.class, msgs );
            msgs = basicSetRefersToDataSet( newRefersToDataSet, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDataSetESet = refersToDataSetESet;
            refersToDataSetESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CONTROL__REFERS_TO_DATA_SET,
                        newRefersToDataSet, newRefersToDataSet, !oldRefersToDataSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToDataSet( NotificationChain msgs ) {
        DataSet oldRefersToDataSet = refersToDataSet;
        refersToDataSet = null;
        boolean oldRefersToDataSetESet = refersToDataSetESet;
        refersToDataSetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.CONTROL__REFERS_TO_DATA_SET, oldRefersToDataSet, null, oldRefersToDataSetESet );
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
    public void unsetRefersToDataSet() {
        if( refersToDataSet != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToDataSet ).eInverseRemove( this,
                    SclPackage.DATA_SET__REFERRED_BY_CONTROL, DataSet.class, msgs );
            msgs = basicUnsetRefersToDataSet( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDataSetESet = refersToDataSetESet;
            refersToDataSetESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CONTROL__REFERS_TO_DATA_SET, null,
                        null, oldRefersToDataSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToDataSet() {
        return refersToDataSetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CONTROL__NAME, oldName, name,
                    !oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CONTROL__NAME, oldName, NAME_EDEFAULT,
                    oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ExtRef > getReferredByExtRef() {
        if( referredByExtRef == null ) {
            referredByExtRef = new EObjectWithInverseEList.Unsettable< ExtRef >( ExtRef.class, this,
                    SclPackage.CONTROL__REFERRED_BY_EXT_REF, SclPackage.EXT_REF__REFERS_TO_CONTROL );
        }
        return referredByExtRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByExtRef() {
        if( referredByExtRef != null ) ( ( InternalEList.Unsettable< ? > ) referredByExtRef ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByExtRef() {
        return referredByExtRef != null && ( ( InternalEList.Unsettable< ? > ) referredByExtRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public AnyLN getParentAnyLN() {
        AbstractRiseClipseConsole.getConsole().emergency( EXPLICIT_LINK_CATEGORY, getLineNumber(), "Control.getParentAnyLN() called" );
        return null;
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
        case SclPackage.CONTROL__REFERS_TO_DATA_SET:
            if( refersToDataSet != null )
                msgs = ( ( InternalEObject ) refersToDataSet ).eInverseRemove( this,
                        SclPackage.DATA_SET__REFERRED_BY_CONTROL, DataSet.class, msgs );
            return basicSetRefersToDataSet( ( DataSet ) otherEnd, msgs );
        case SclPackage.CONTROL__REFERRED_BY_EXT_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByExtRef() )
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
        case SclPackage.CONTROL__REFERS_TO_DATA_SET:
            return basicUnsetRefersToDataSet( msgs );
        case SclPackage.CONTROL__REFERRED_BY_EXT_REF:
            return ( ( InternalEList< ? > ) getReferredByExtRef() ).basicRemove( otherEnd, msgs );
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
        case SclPackage.CONTROL__DAT_SET:
            return getDatSet();
        case SclPackage.CONTROL__REFERS_TO_DATA_SET:
            return getRefersToDataSet();
        case SclPackage.CONTROL__NAME:
            return getName();
        case SclPackage.CONTROL__REFERRED_BY_EXT_REF:
            return getReferredByExtRef();
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
        case SclPackage.CONTROL__DAT_SET:
            setDatSet( ( String ) newValue );
            return;
        case SclPackage.CONTROL__REFERS_TO_DATA_SET:
            setRefersToDataSet( ( DataSet ) newValue );
            return;
        case SclPackage.CONTROL__NAME:
            setName( ( String ) newValue );
            return;
        case SclPackage.CONTROL__REFERRED_BY_EXT_REF:
            getReferredByExtRef().clear();
            getReferredByExtRef().addAll( ( Collection< ? extends ExtRef > ) newValue );
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
        case SclPackage.CONTROL__DAT_SET:
            unsetDatSet();
            return;
        case SclPackage.CONTROL__REFERS_TO_DATA_SET:
            unsetRefersToDataSet();
            return;
        case SclPackage.CONTROL__NAME:
            unsetName();
            return;
        case SclPackage.CONTROL__REFERRED_BY_EXT_REF:
            unsetReferredByExtRef();
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
        case SclPackage.CONTROL__DAT_SET:
            return isSetDatSet();
        case SclPackage.CONTROL__REFERS_TO_DATA_SET:
            return isSetRefersToDataSet();
        case SclPackage.CONTROL__NAME:
            return isSetName();
        case SclPackage.CONTROL__REFERRED_BY_EXT_REF:
            return isSetReferredByExtRef();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke( int operationID, EList< ? > arguments ) throws InvocationTargetException {
        switch( operationID ) {
        case SclPackage.CONTROL___GET_PARENT_ANY_LN:
            return getParentAnyLN();
        }
        return super.eInvoke( operationID, arguments );
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
        result.append( " (datSet: " );
        if( datSetESet )
            result.append( datSet );
        else
            result.append( "<unset>" );
        result.append( ", name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getLineNumber(), "ControlImpl.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        // name    Name of the report control block. This name is relative to the LN hosting the RCB, and shall be unique within the LN
        // desc    The description text 
        // datSet  The name of the data set to be sent by the report control block; datSet should only be missing within an ICD-File,
        //         or to indicate an unused control block. The referenced data set must be in the same LN as the control block.

        String messagePrefix = "while resolving link from Control: ";

        if( ( getDatSet() == null ) || getDatSet().isEmpty() ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                             messagePrefix, "datSet is missing" );
            return;
        }

        // No error or warning message here: if this happens, error should have been detected before
        if( getParentAnyLN() == null ) return;

        // find an DataSet with
        //   DataSet.name == Control.datSet
        List< DataSet > res = getParentAnyLN()
                .getDataSet()
                .stream()
                .filter( d -> getDatSet().equals( d.getName() ) )
                .collect( Collectors.toList() );

        if( res.size() != 1 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                             messagePrefix, (( res.size() == 0 ) ? "cannot find" : "found several" ),
                             " DataSet( name = ", getDatSet(), " )" );
            return;
        }
        setRefersToDataSet( res.get( 0 ) );
        console.notice( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                     "Control refers to DataSet( name = ", getDatSet(), " ) on line ",
                     getRefersToDataSet().getLineNumber() );
    }

} //ControlImpl
