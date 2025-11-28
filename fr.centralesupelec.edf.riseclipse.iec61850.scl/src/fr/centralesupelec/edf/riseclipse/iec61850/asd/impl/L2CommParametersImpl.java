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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>L2 Comm Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.L2CommParametersImpl#getMacAddr <em>Mac Addr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.L2CommParametersImpl#getParentGooseParameters <em>Parent Goose Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.L2CommParametersImpl#getParentSMVParameters <em>Parent SMV Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class L2CommParametersImpl extends CommParametersImpl implements L2CommParameters {
    /**
     * The default value of the '{@link #getMacAddr() <em>Mac Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMacAddr()
     * @generated
     * @ordered
     */
    protected static final String MAC_ADDR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMacAddr() <em>Mac Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMacAddr()
     * @generated
     * @ordered
     */
    protected String macAddr = MAC_ADDR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected L2CommParametersImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getL2CommParameters();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMacAddr() {
        return macAddr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMacAddr( String newMacAddr ) {
        String oldMacAddr = macAddr;
        macAddr = newMacAddr;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.L2_COMM_PARAMETERS__MAC_ADDR, oldMacAddr,
                    macAddr ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GooseParameters getParentGooseParameters() {
        if( eContainerFeatureID() != AsdPackage.L2_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS ) {
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
                AsdPackage.L2_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.L2_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS
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
                        AsdPackage.GOOSE_PARAMETERS__L2_COMM_PARAMETERS, GooseParameters.class, msgs );
            }
            msgs = basicSetParentGooseParameters( newParentGooseParameters, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.L2_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS, newParentGooseParameters,
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
        if( eContainerFeatureID() != AsdPackage.L2_COMM_PARAMETERS__PARENT_SMV_PARAMETERS ) {
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
                AsdPackage.L2_COMM_PARAMETERS__PARENT_SMV_PARAMETERS, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.L2_COMM_PARAMETERS__PARENT_SMV_PARAMETERS
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
                        AsdPackage.SMV_PARAMETERS__L2_COMM_PARAMETERS, SMVParameters.class, msgs );
            }
            msgs = basicSetParentSMVParameters( newParentSMVParameters, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.L2_COMM_PARAMETERS__PARENT_SMV_PARAMETERS, newParentSMVParameters,
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
        case AsdPackage.L2_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentGooseParameters( ( GooseParameters ) otherEnd, msgs );
        case AsdPackage.L2_COMM_PARAMETERS__PARENT_SMV_PARAMETERS:
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
        case AsdPackage.L2_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS:
            return basicSetParentGooseParameters( null, msgs );
        case AsdPackage.L2_COMM_PARAMETERS__PARENT_SMV_PARAMETERS:
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
        case AsdPackage.L2_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.GOOSE_PARAMETERS__L2_COMM_PARAMETERS,
                    GooseParameters.class, msgs );
        case AsdPackage.L2_COMM_PARAMETERS__PARENT_SMV_PARAMETERS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SMV_PARAMETERS__L2_COMM_PARAMETERS,
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
        case AsdPackage.L2_COMM_PARAMETERS__MAC_ADDR:
            return getMacAddr();
        case AsdPackage.L2_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS:
            return getParentGooseParameters();
        case AsdPackage.L2_COMM_PARAMETERS__PARENT_SMV_PARAMETERS:
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
        case AsdPackage.L2_COMM_PARAMETERS__MAC_ADDR:
            setMacAddr( ( String ) newValue );
            return;
        case AsdPackage.L2_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS:
            setParentGooseParameters( ( GooseParameters ) newValue );
            return;
        case AsdPackage.L2_COMM_PARAMETERS__PARENT_SMV_PARAMETERS:
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
        case AsdPackage.L2_COMM_PARAMETERS__MAC_ADDR:
            setMacAddr( MAC_ADDR_EDEFAULT );
            return;
        case AsdPackage.L2_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS:
            setParentGooseParameters( ( GooseParameters ) null );
            return;
        case AsdPackage.L2_COMM_PARAMETERS__PARENT_SMV_PARAMETERS:
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
        case AsdPackage.L2_COMM_PARAMETERS__MAC_ADDR:
            return MAC_ADDR_EDEFAULT == null ? macAddr != null : !MAC_ADDR_EDEFAULT.equals( macAddr );
        case AsdPackage.L2_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS:
            return getParentGooseParameters() != null;
        case AsdPackage.L2_COMM_PARAMETERS__PARENT_SMV_PARAMETERS:
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
        result.append( " (macAddr: " );
        result.append( macAddr );
        result.append( ')' );
        return result.toString();
    }

} //L2CommParametersImpl
