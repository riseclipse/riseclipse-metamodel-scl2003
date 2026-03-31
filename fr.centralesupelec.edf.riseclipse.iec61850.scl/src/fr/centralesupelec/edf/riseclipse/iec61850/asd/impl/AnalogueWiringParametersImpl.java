/**
 *  Copyright (c) 2016-2024 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
 *
 *  This file is part of the RiseClipse tool
 *
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      https://riseclipse.github.io/
 *
 */
package fr.centralesupelec.edf.riseclipse.iec61850.asd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analogue Wiring Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AnalogueWiringParametersImpl#getDsgInp <em>Dsg Inp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AnalogueWiringParametersImpl#getFctInp <em>Fct Inp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AnalogueWiringParametersImpl#getParentServiceSpecifications <em>Parent Service Specifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AnalogueWiringParametersImpl#getReferredByAnalogueWiringParametersRef <em>Referred By Analogue Wiring Parameters Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogueWiringParametersImpl extends WiringParametersImpl implements AnalogueWiringParameters {
    /**
     * The default value of the '{@link #getDsgInp() <em>Dsg Inp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDsgInp()
     * @generated
     * @ordered
     */
    protected static final String DSG_INP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDsgInp() <em>Dsg Inp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDsgInp()
     * @generated
     * @ordered
     */
    protected String dsgInp = DSG_INP_EDEFAULT;

    /**
     * The default value of the '{@link #getFctInp() <em>Fct Inp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFctInp()
     * @generated
     * @ordered
     */
    protected static final String FCT_INP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFctInp() <em>Fct Inp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFctInp()
     * @generated
     * @ordered
     */
    protected String fctInp = FCT_INP_EDEFAULT;

    /**
     * The cached value of the '{@link #getReferredByAnalogueWiringParametersRef() <em>Referred By Analogue Wiring Parameters Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByAnalogueWiringParametersRef()
     * @generated
     * @ordered
     */
    protected EList< AnalogueWiringParametersRef > referredByAnalogueWiringParametersRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnalogueWiringParametersImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getAnalogueWiringParameters();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDsgInp() {
        return dsgInp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDsgInp( String newDsgInp ) {
        String oldDsgInp = dsgInp;
        dsgInp = newDsgInp;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.ANALOGUE_WIRING_PARAMETERS__DSG_INP,
                    oldDsgInp, dsgInp ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFctInp() {
        return fctInp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFctInp( String newFctInp ) {
        String oldFctInp = fctInp;
        fctInp = newFctInp;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.ANALOGUE_WIRING_PARAMETERS__FCT_INP,
                    oldFctInp, fctInp ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceSpecifications getParentServiceSpecifications() {
        if( eContainerFeatureID() != AsdPackage.ANALOGUE_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS ) {
            return null;
        }
        return ( ServiceSpecifications ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServiceSpecifications( ServiceSpecifications newParentServiceSpecifications,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServiceSpecifications,
                AsdPackage.ANALOGUE_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentServiceSpecifications( ServiceSpecifications newParentServiceSpecifications ) {
        if( newParentServiceSpecifications != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.ANALOGUE_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS
                        && newParentServiceSpecifications != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServiceSpecifications ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentServiceSpecifications != null ) {
                msgs = ( ( InternalEObject ) newParentServiceSpecifications ).eInverseAdd( this,
                        AsdPackage.SERVICE_SPECIFICATIONS__ANALOGUE_WIRING_PARAMETERS, ServiceSpecifications.class,
                        msgs );
            }
            msgs = basicSetParentServiceSpecifications( newParentServiceSpecifications, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.ANALOGUE_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS,
                    newParentServiceSpecifications, newParentServiceSpecifications ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AnalogueWiringParametersRef > getReferredByAnalogueWiringParametersRef() {
        if( referredByAnalogueWiringParametersRef == null ) {
            referredByAnalogueWiringParametersRef = new EObjectWithInverseResolvingEList.Unsettable< >(
                    AnalogueWiringParametersRef.class, this,
                    AsdPackage.ANALOGUE_WIRING_PARAMETERS__REFERRED_BY_ANALOGUE_WIRING_PARAMETERS_REF,
                    AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__REFERS_TO_ANALOGUE_WIRING_PARAMETERS );
        }
        return referredByAnalogueWiringParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByAnalogueWiringParametersRef() {
        if( referredByAnalogueWiringParametersRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByAnalogueWiringParametersRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByAnalogueWiringParametersRef() {
        return referredByAnalogueWiringParametersRef != null
                && ( ( InternalEList.Unsettable< ? > ) referredByAnalogueWiringParametersRef ).isSet();
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
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentServiceSpecifications( ( ServiceSpecifications ) otherEnd, msgs );
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__REFERRED_BY_ANALOGUE_WIRING_PARAMETERS_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByAnalogueWiringParametersRef() )
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
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return basicSetParentServiceSpecifications( null, msgs );
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__REFERRED_BY_ANALOGUE_WIRING_PARAMETERS_REF:
            return ( ( InternalEList< ? > ) getReferredByAnalogueWiringParametersRef() ).basicRemove( otherEnd, msgs );
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
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return eInternalContainer().eInverseRemove( this,
                    AsdPackage.SERVICE_SPECIFICATIONS__ANALOGUE_WIRING_PARAMETERS, ServiceSpecifications.class, msgs );
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
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__DSG_INP:
            return getDsgInp();
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__FCT_INP:
            return getFctInp();
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return getParentServiceSpecifications();
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__REFERRED_BY_ANALOGUE_WIRING_PARAMETERS_REF:
            return getReferredByAnalogueWiringParametersRef();
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
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__DSG_INP:
            setDsgInp( ( String ) newValue );
            return;
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__FCT_INP:
            setFctInp( ( String ) newValue );
            return;
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            setParentServiceSpecifications( ( ServiceSpecifications ) newValue );
            return;
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__REFERRED_BY_ANALOGUE_WIRING_PARAMETERS_REF:
            getReferredByAnalogueWiringParametersRef().clear();
            getReferredByAnalogueWiringParametersRef()
                    .addAll( ( Collection< ? extends AnalogueWiringParametersRef > ) newValue );
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
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__DSG_INP:
            setDsgInp( DSG_INP_EDEFAULT );
            return;
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__FCT_INP:
            setFctInp( FCT_INP_EDEFAULT );
            return;
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            setParentServiceSpecifications( ( ServiceSpecifications ) null );
            return;
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__REFERRED_BY_ANALOGUE_WIRING_PARAMETERS_REF:
            unsetReferredByAnalogueWiringParametersRef();
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
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__DSG_INP:
            return DSG_INP_EDEFAULT == null ? dsgInp != null : !DSG_INP_EDEFAULT.equals( dsgInp );
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__FCT_INP:
            return FCT_INP_EDEFAULT == null ? fctInp != null : !FCT_INP_EDEFAULT.equals( fctInp );
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return getParentServiceSpecifications() != null;
        case AsdPackage.ANALOGUE_WIRING_PARAMETERS__REFERRED_BY_ANALOGUE_WIRING_PARAMETERS_REF:
            return isSetReferredByAnalogueWiringParametersRef();
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
        result.append( " (dsgInp: " );
        result.append( dsgInp );
        result.append( ", fctInp: " );
        result.append( fctInp );
        result.append( ')' );
        return result.toString();
    }

} //AnalogueWiringParametersImpl
