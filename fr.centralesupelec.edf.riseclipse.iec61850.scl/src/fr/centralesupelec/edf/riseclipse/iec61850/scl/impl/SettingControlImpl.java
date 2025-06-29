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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setting Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingControlImpl#getActSG <em>Act SG</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingControlImpl#getNumOfSGs <em>Num Of SGs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingControlImpl#getResvTms <em>Resv Tms</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingControlImpl#getParentLN0 <em>Parent LN0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SettingControlImpl extends UnNamingImpl implements SettingControl {
    /**
     * The default value of the '{@link #getActSG() <em>Act SG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActSG()
     * @generated
     * @ordered
     */
    protected static final Integer ACT_SG_EDEFAULT = Integer.valueOf( 1 );

    /**
     * The cached value of the '{@link #getActSG() <em>Act SG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActSG()
     * @generated
     * @ordered
     */
    protected Integer actSG = ACT_SG_EDEFAULT;

    /**
     * This is true if the Act SG attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean actSGESet;

    /**
     * The default value of the '{@link #getNumOfSGs() <em>Num Of SGs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumOfSGs()
     * @generated
     * @ordered
     */
    protected static final Integer NUM_OF_SGS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNumOfSGs() <em>Num Of SGs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumOfSGs()
     * @generated
     * @ordered
     */
    protected Integer numOfSGs = NUM_OF_SGS_EDEFAULT;

    /**
     * This is true if the Num Of SGs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean numOfSGsESet;

    /**
     * The default value of the '{@link #getResvTms() <em>Resv Tms</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResvTms()
     * @generated
     * @ordered
     */
    protected static final Short RESV_TMS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResvTms() <em>Resv Tms</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResvTms()
     * @generated
     * @ordered
     */
    protected Short resvTms = RESV_TMS_EDEFAULT;

    /**
     * This is true if the Resv Tms attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean resvTmsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SettingControlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSettingControl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getActSG() {
        return actSG;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setActSG( Integer newActSG ) {
        Integer oldActSG = actSG;
        actSG = newActSG;
        boolean oldActSGESet = actSGESet;
        actSGESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SETTING_CONTROL__ACT_SG, oldActSG, actSG,
                    !oldActSGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetActSG() {
        Integer oldActSG = actSG;
        boolean oldActSGESet = actSGESet;
        actSG = ACT_SG_EDEFAULT;
        actSGESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SETTING_CONTROL__ACT_SG, oldActSG,
                    ACT_SG_EDEFAULT, oldActSGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetActSG() {
        return actSGESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getNumOfSGs() {
        return numOfSGs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNumOfSGs( Integer newNumOfSGs ) {
        Integer oldNumOfSGs = numOfSGs;
        numOfSGs = newNumOfSGs;
        boolean oldNumOfSGsESet = numOfSGsESet;
        numOfSGsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SETTING_CONTROL__NUM_OF_SGS, oldNumOfSGs,
                    numOfSGs, !oldNumOfSGsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNumOfSGs() {
        Integer oldNumOfSGs = numOfSGs;
        boolean oldNumOfSGsESet = numOfSGsESet;
        numOfSGs = NUM_OF_SGS_EDEFAULT;
        numOfSGsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SETTING_CONTROL__NUM_OF_SGS,
                    oldNumOfSGs, NUM_OF_SGS_EDEFAULT, oldNumOfSGsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNumOfSGs() {
        return numOfSGsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Short getResvTms() {
        return resvTms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResvTms( Short newResvTms ) {
        Short oldResvTms = resvTms;
        resvTms = newResvTms;
        boolean oldResvTmsESet = resvTmsESet;
        resvTmsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SETTING_CONTROL__RESV_TMS, oldResvTms,
                    resvTms, !oldResvTmsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetResvTms() {
        Short oldResvTms = resvTms;
        boolean oldResvTmsESet = resvTmsESet;
        resvTms = RESV_TMS_EDEFAULT;
        resvTmsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SETTING_CONTROL__RESV_TMS, oldResvTms,
                    RESV_TMS_EDEFAULT, oldResvTmsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetResvTms() {
        return resvTmsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LN0 getParentLN0() {
        if( eContainerFeatureID() != SclPackage.SETTING_CONTROL__PARENT_LN0 ) return null;
        return ( LN0 ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentLN0( LN0 newParentLN0, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentLN0, SclPackage.SETTING_CONTROL__PARENT_LN0, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentLN0( LN0 newParentLN0 ) {
        if( newParentLN0 != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SETTING_CONTROL__PARENT_LN0 && newParentLN0 != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentLN0 ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentLN0 != null )
                msgs = ( ( InternalEObject ) newParentLN0 ).eInverseAdd( this, SclPackage.LN0__SETTING_CONTROL,
                        LN0.class, msgs );
            msgs = basicSetParentLN0( newParentLN0, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SETTING_CONTROL__PARENT_LN0,
                    newParentLN0, newParentLN0 ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.SETTING_CONTROL__PARENT_LN0:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentLN0( ( LN0 ) otherEnd, msgs );
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
        case SclPackage.SETTING_CONTROL__PARENT_LN0:
            return basicSetParentLN0( null, msgs );
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
        case SclPackage.SETTING_CONTROL__PARENT_LN0:
            return eInternalContainer().eInverseRemove( this, SclPackage.LN0__SETTING_CONTROL, LN0.class, msgs );
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
        case SclPackage.SETTING_CONTROL__ACT_SG:
            return getActSG();
        case SclPackage.SETTING_CONTROL__NUM_OF_SGS:
            return getNumOfSGs();
        case SclPackage.SETTING_CONTROL__RESV_TMS:
            return getResvTms();
        case SclPackage.SETTING_CONTROL__PARENT_LN0:
            return getParentLN0();
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
        case SclPackage.SETTING_CONTROL__ACT_SG:
            setActSG( ( Integer ) newValue );
            return;
        case SclPackage.SETTING_CONTROL__NUM_OF_SGS:
            setNumOfSGs( ( Integer ) newValue );
            return;
        case SclPackage.SETTING_CONTROL__RESV_TMS:
            setResvTms( ( Short ) newValue );
            return;
        case SclPackage.SETTING_CONTROL__PARENT_LN0:
            setParentLN0( ( LN0 ) newValue );
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
        case SclPackage.SETTING_CONTROL__ACT_SG:
            unsetActSG();
            return;
        case SclPackage.SETTING_CONTROL__NUM_OF_SGS:
            unsetNumOfSGs();
            return;
        case SclPackage.SETTING_CONTROL__RESV_TMS:
            unsetResvTms();
            return;
        case SclPackage.SETTING_CONTROL__PARENT_LN0:
            setParentLN0( ( LN0 ) null );
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
        case SclPackage.SETTING_CONTROL__ACT_SG:
            return isSetActSG();
        case SclPackage.SETTING_CONTROL__NUM_OF_SGS:
            return isSetNumOfSGs();
        case SclPackage.SETTING_CONTROL__RESV_TMS:
            return isSetResvTms();
        case SclPackage.SETTING_CONTROL__PARENT_LN0:
            return getParentLN0() != null;
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
        result.append( " (actSG: " );
        if( actSGESet )
            result.append( actSG );
        else
            result.append( "<unset>" );
        result.append( ", numOfSGs: " );
        if( numOfSGsESet )
            result.append( numOfSGs );
        else
            result.append( "<unset>" );
        result.append( ", resvTms: " );
        if( resvTmsESet )
            result.append( resvTms );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    @Override
    public String getXpath() {
        return getParentLN0().getXpath() + "/scl:SettingControlImpl";
    }

} //SettingControlImpl
