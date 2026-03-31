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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>L3I Pv4 Comm Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.L3IPv4CommParametersImpl#getIPv4 <em>IPv4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.L3IPv4CommParametersImpl#getIPv4IGMPv3Src <em>IPv4 IGM Pv3 Src</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.L3IPv4CommParametersImpl#getParentGooseParameters <em>Parent Goose Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.L3IPv4CommParametersImpl#getParentSMVParameters <em>Parent SMV Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class L3IPv4CommParametersImpl extends CommParametersImpl implements L3IPv4CommParameters {
    /**
     * The default value of the '{@link #getIPv4() <em>IPv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIPv4()
     * @generated
     * @ordered
     */
    protected static final String IPV4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIPv4() <em>IPv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIPv4()
     * @generated
     * @ordered
     */
    protected String iPv4 = IPV4_EDEFAULT;

    /**
     * The default value of the '{@link #getIPv4IGMPv3Src() <em>IPv4 IGM Pv3 Src</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIPv4IGMPv3Src()
     * @generated
     * @ordered
     */
    protected static final String IPV4_IGM_PV3_SRC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIPv4IGMPv3Src() <em>IPv4 IGM Pv3 Src</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIPv4IGMPv3Src()
     * @generated
     * @ordered
     */
    protected String iPv4IGMPv3Src = IPV4_IGM_PV3_SRC_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected L3IPv4CommParametersImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getL3IPv4CommParameters();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIPv4() {
        return iPv4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIPv4( String newIPv4 ) {
        String oldIPv4 = iPv4;
        iPv4 = newIPv4;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.L3I_PV4_COMM_PARAMETERS__IPV4, oldIPv4,
                    iPv4 ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIPv4IGMPv3Src() {
        return iPv4IGMPv3Src;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIPv4IGMPv3Src( String newIPv4IGMPv3Src ) {
        String oldIPv4IGMPv3Src = iPv4IGMPv3Src;
        iPv4IGMPv3Src = newIPv4IGMPv3Src;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.L3I_PV4_COMM_PARAMETERS__IPV4_IGM_PV3_SRC, oldIPv4IGMPv3Src, iPv4IGMPv3Src ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GooseParameters getParentGooseParameters() {
        if( eContainerFeatureID() != AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS ) {
            return null;
        }
        return ( GooseParameters ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentGooseParameters( GooseParameters newParentGooseParameters,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentGooseParameters,
                AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentGooseParameters( GooseParameters newParentGooseParameters ) {
        if( newParentGooseParameters != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS
                        && newParentGooseParameters != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentGooseParameters ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentGooseParameters != null ) {
                msgs = ( ( InternalEObject ) newParentGooseParameters ).eInverseAdd( this,
                        AsdPackage.GOOSE_PARAMETERS__L3I_PV4_COMM_PARAMETERS, GooseParameters.class, msgs );
            }
            msgs = basicSetParentGooseParameters( newParentGooseParameters, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS, newParentGooseParameters,
                    newParentGooseParameters ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SMVParameters getParentSMVParameters() {
        if( eContainerFeatureID() != AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_SMV_PARAMETERS ) {
            return null;
        }
        return ( SMVParameters ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSMVParameters( SMVParameters newParentSMVParameters,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSMVParameters,
                AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_SMV_PARAMETERS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSMVParameters( SMVParameters newParentSMVParameters ) {
        if( newParentSMVParameters != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_SMV_PARAMETERS
                        && newParentSMVParameters != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSMVParameters ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentSMVParameters != null ) {
                msgs = ( ( InternalEObject ) newParentSMVParameters ).eInverseAdd( this,
                        AsdPackage.SMV_PARAMETERS__L3I_PV4_COMM_PARAMETERS, SMVParameters.class, msgs );
            }
            msgs = basicSetParentSMVParameters( newParentSMVParameters, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_SMV_PARAMETERS, newParentSMVParameters,
                    newParentSMVParameters ) );
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
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentGooseParameters( ( GooseParameters ) otherEnd, msgs );
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_SMV_PARAMETERS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSMVParameters( ( SMVParameters ) otherEnd, msgs );
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
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS:
            return basicSetParentGooseParameters( null, msgs );
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_SMV_PARAMETERS:
            return basicSetParentSMVParameters( null, msgs );
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
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.GOOSE_PARAMETERS__L3I_PV4_COMM_PARAMETERS,
                    GooseParameters.class, msgs );
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_SMV_PARAMETERS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SMV_PARAMETERS__L3I_PV4_COMM_PARAMETERS,
                    SMVParameters.class, msgs );
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
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__IPV4:
            return getIPv4();
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__IPV4_IGM_PV3_SRC:
            return getIPv4IGMPv3Src();
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS:
            return getParentGooseParameters();
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_SMV_PARAMETERS:
            return getParentSMVParameters();
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
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__IPV4:
            setIPv4( ( String ) newValue );
            return;
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__IPV4_IGM_PV3_SRC:
            setIPv4IGMPv3Src( ( String ) newValue );
            return;
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS:
            setParentGooseParameters( ( GooseParameters ) newValue );
            return;
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_SMV_PARAMETERS:
            setParentSMVParameters( ( SMVParameters ) newValue );
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
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__IPV4:
            setIPv4( IPV4_EDEFAULT );
            return;
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__IPV4_IGM_PV3_SRC:
            setIPv4IGMPv3Src( IPV4_IGM_PV3_SRC_EDEFAULT );
            return;
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS:
            setParentGooseParameters( ( GooseParameters ) null );
            return;
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_SMV_PARAMETERS:
            setParentSMVParameters( ( SMVParameters ) null );
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
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__IPV4:
            return IPV4_EDEFAULT == null ? iPv4 != null : !IPV4_EDEFAULT.equals( iPv4 );
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__IPV4_IGM_PV3_SRC:
            return IPV4_IGM_PV3_SRC_EDEFAULT == null ? iPv4IGMPv3Src != null
                    : !IPV4_IGM_PV3_SRC_EDEFAULT.equals( iPv4IGMPv3Src );
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS:
            return getParentGooseParameters() != null;
        case AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_SMV_PARAMETERS:
            return getParentSMVParameters() != null;
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
        result.append( " (iPv4: " );
        result.append( iPv4 );
        result.append( ", iPv4IGMPv3Src: " );
        result.append( iPv4IGMPv3Src );
        result.append( ')' );
        return result.toString();
    }

} //L3IPv4CommParametersImpl
