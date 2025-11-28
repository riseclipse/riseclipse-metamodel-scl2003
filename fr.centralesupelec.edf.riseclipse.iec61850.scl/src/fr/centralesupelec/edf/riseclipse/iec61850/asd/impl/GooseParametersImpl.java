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

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goose Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.GooseParametersImpl#getL2CommParameters <em>L2 Comm Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.GooseParametersImpl#getL3IPv4CommParameters <em>L3I Pv4 Comm Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.GooseParametersImpl#getL3IPv6CommParameters <em>L3I Pv6 Comm Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.GooseParametersImpl#getGoId <em>Go Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.GooseParametersImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.GooseParametersImpl#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.GooseParametersImpl#isSecurityEnabled <em>Security Enabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.GooseParametersImpl#getParentCommServiceSpecifications <em>Parent Comm Service Specifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.GooseParametersImpl#getParentServiceSpecifications <em>Parent Service Specifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.GooseParametersImpl#getReferredByGooseParametersRef <em>Referred By Goose Parameters Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GooseParametersImpl extends ControlBlockParametersImpl implements GooseParameters {
    /**
     * The cached value of the '{@link #getL2CommParameters() <em>L2 Comm Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getL2CommParameters()
     * @generated
     * @ordered
     */
    protected L2CommParameters l2CommParameters;

    /**
     * This is true if the L2 Comm Parameters containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean l2CommParametersESet;

    /**
     * The cached value of the '{@link #getL3IPv4CommParameters() <em>L3I Pv4 Comm Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getL3IPv4CommParameters()
     * @generated
     * @ordered
     */
    protected L3IPv4CommParameters l3IPv4CommParameters;

    /**
     * This is true if the L3I Pv4 Comm Parameters containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean l3IPv4CommParametersESet;

    /**
     * The cached value of the '{@link #getL3IPv6CommParameters() <em>L3I Pv6 Comm Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getL3IPv6CommParameters()
     * @generated
     * @ordered
     */
    protected L3IPv6CommParameters l3IPv6CommParameters;

    /**
     * This is true if the L3I Pv6 Comm Parameters containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean l3IPv6CommParametersESet;

    /**
     * The default value of the '{@link #getGoId() <em>Go Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGoId()
     * @generated
     * @ordered
     */
    protected static final String GO_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGoId() <em>Go Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGoId()
     * @generated
     * @ordered
     */
    protected String goId = GO_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxTime()
     * @generated
     * @ordered
     */
    protected static final BigDecimal MAX_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxTime()
     * @generated
     * @ordered
     */
    protected BigDecimal maxTime = MAX_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinTime()
     * @generated
     * @ordered
     */
    protected static final BigDecimal MIN_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinTime()
     * @generated
     * @ordered
     */
    protected BigDecimal minTime = MIN_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #isSecurityEnabled() <em>Security Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSecurityEnabled()
     * @generated
     * @ordered
     */
    protected static final boolean SECURITY_ENABLED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSecurityEnabled() <em>Security Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSecurityEnabled()
     * @generated
     * @ordered
     */
    protected boolean securityEnabled = SECURITY_ENABLED_EDEFAULT;

    /**
     * This is true if the Security Enabled attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean securityEnabledESet;

    /**
     * The cached value of the '{@link #getReferredByGooseParametersRef() <em>Referred By Goose Parameters Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByGooseParametersRef()
     * @generated
     * @ordered
     */
    protected GooseParametersRef referredByGooseParametersRef;

    /**
     * This is true if the Referred By Goose Parameters Ref reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean referredByGooseParametersRefESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GooseParametersImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getGooseParameters();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public L2CommParameters getL2CommParameters() {
        return l2CommParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetL2CommParameters( L2CommParameters newL2CommParameters, NotificationChain msgs ) {
        L2CommParameters oldL2CommParameters = l2CommParameters;
        l2CommParameters = newL2CommParameters;
        boolean oldL2CommParametersESet = l2CommParametersESet;
        l2CommParametersESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.GOOSE_PARAMETERS__L2_COMM_PARAMETERS, oldL2CommParameters, newL2CommParameters,
                    !oldL2CommParametersESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setL2CommParameters( L2CommParameters newL2CommParameters ) {
        if( newL2CommParameters != l2CommParameters ) {
            NotificationChain msgs = null;
            if( l2CommParameters != null ) {
                msgs = ( ( InternalEObject ) l2CommParameters ).eInverseRemove( this,
                        AsdPackage.L2_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS, L2CommParameters.class, msgs );
            }
            if( newL2CommParameters != null ) {
                msgs = ( ( InternalEObject ) newL2CommParameters ).eInverseAdd( this,
                        AsdPackage.L2_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS, L2CommParameters.class, msgs );
            }
            msgs = basicSetL2CommParameters( newL2CommParameters, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldL2CommParametersESet = l2CommParametersESet;
            l2CommParametersESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.GOOSE_PARAMETERS__L2_COMM_PARAMETERS,
                        newL2CommParameters, newL2CommParameters, !oldL2CommParametersESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetL2CommParameters( NotificationChain msgs ) {
        L2CommParameters oldL2CommParameters = l2CommParameters;
        l2CommParameters = null;
        boolean oldL2CommParametersESet = l2CommParametersESet;
        l2CommParametersESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.GOOSE_PARAMETERS__L2_COMM_PARAMETERS, oldL2CommParameters, null,
                    oldL2CommParametersESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetL2CommParameters() {
        if( l2CommParameters != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) l2CommParameters ).eInverseRemove( this,
                    AsdPackage.L2_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS, L2CommParameters.class, msgs );
            msgs = basicUnsetL2CommParameters( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldL2CommParametersESet = l2CommParametersESet;
            l2CommParametersESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.GOOSE_PARAMETERS__L2_COMM_PARAMETERS, null, null, oldL2CommParametersESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetL2CommParameters() {
        return l2CommParametersESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public L3IPv4CommParameters getL3IPv4CommParameters() {
        return l3IPv4CommParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetL3IPv4CommParameters( L3IPv4CommParameters newL3IPv4CommParameters,
            NotificationChain msgs ) {
        L3IPv4CommParameters oldL3IPv4CommParameters = l3IPv4CommParameters;
        l3IPv4CommParameters = newL3IPv4CommParameters;
        boolean oldL3IPv4CommParametersESet = l3IPv4CommParametersESet;
        l3IPv4CommParametersESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.GOOSE_PARAMETERS__L3_IPV4_COMM_PARAMETERS, oldL3IPv4CommParameters,
                    newL3IPv4CommParameters, !oldL3IPv4CommParametersESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setL3IPv4CommParameters( L3IPv4CommParameters newL3IPv4CommParameters ) {
        if( newL3IPv4CommParameters != l3IPv4CommParameters ) {
            NotificationChain msgs = null;
            if( l3IPv4CommParameters != null ) {
                msgs = ( ( InternalEObject ) l3IPv4CommParameters ).eInverseRemove( this,
                        AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS, L3IPv4CommParameters.class, msgs );
            }
            if( newL3IPv4CommParameters != null ) {
                msgs = ( ( InternalEObject ) newL3IPv4CommParameters ).eInverseAdd( this,
                        AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS, L3IPv4CommParameters.class, msgs );
            }
            msgs = basicSetL3IPv4CommParameters( newL3IPv4CommParameters, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldL3IPv4CommParametersESet = l3IPv4CommParametersESet;
            l3IPv4CommParametersESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.GOOSE_PARAMETERS__L3_IPV4_COMM_PARAMETERS, newL3IPv4CommParameters,
                        newL3IPv4CommParameters, !oldL3IPv4CommParametersESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetL3IPv4CommParameters( NotificationChain msgs ) {
        L3IPv4CommParameters oldL3IPv4CommParameters = l3IPv4CommParameters;
        l3IPv4CommParameters = null;
        boolean oldL3IPv4CommParametersESet = l3IPv4CommParametersESet;
        l3IPv4CommParametersESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.GOOSE_PARAMETERS__L3_IPV4_COMM_PARAMETERS, oldL3IPv4CommParameters, null,
                    oldL3IPv4CommParametersESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetL3IPv4CommParameters() {
        if( l3IPv4CommParameters != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) l3IPv4CommParameters ).eInverseRemove( this,
                    AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS, L3IPv4CommParameters.class, msgs );
            msgs = basicUnsetL3IPv4CommParameters( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldL3IPv4CommParametersESet = l3IPv4CommParametersESet;
            l3IPv4CommParametersESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.GOOSE_PARAMETERS__L3_IPV4_COMM_PARAMETERS, null, null,
                        oldL3IPv4CommParametersESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetL3IPv4CommParameters() {
        return l3IPv4CommParametersESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public L3IPv6CommParameters getL3IPv6CommParameters() {
        return l3IPv6CommParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetL3IPv6CommParameters( L3IPv6CommParameters newL3IPv6CommParameters,
            NotificationChain msgs ) {
        L3IPv6CommParameters oldL3IPv6CommParameters = l3IPv6CommParameters;
        l3IPv6CommParameters = newL3IPv6CommParameters;
        boolean oldL3IPv6CommParametersESet = l3IPv6CommParametersESet;
        l3IPv6CommParametersESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.GOOSE_PARAMETERS__L3_IPV6_COMM_PARAMETERS, oldL3IPv6CommParameters,
                    newL3IPv6CommParameters, !oldL3IPv6CommParametersESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setL3IPv6CommParameters( L3IPv6CommParameters newL3IPv6CommParameters ) {
        if( newL3IPv6CommParameters != l3IPv6CommParameters ) {
            NotificationChain msgs = null;
            if( l3IPv6CommParameters != null ) {
                msgs = ( ( InternalEObject ) l3IPv6CommParameters ).eInverseRemove( this,
                        AsdPackage.L3I_PV6_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS, L3IPv6CommParameters.class, msgs );
            }
            if( newL3IPv6CommParameters != null ) {
                msgs = ( ( InternalEObject ) newL3IPv6CommParameters ).eInverseAdd( this,
                        AsdPackage.L3I_PV6_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS, L3IPv6CommParameters.class, msgs );
            }
            msgs = basicSetL3IPv6CommParameters( newL3IPv6CommParameters, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldL3IPv6CommParametersESet = l3IPv6CommParametersESet;
            l3IPv6CommParametersESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.GOOSE_PARAMETERS__L3_IPV6_COMM_PARAMETERS, newL3IPv6CommParameters,
                        newL3IPv6CommParameters, !oldL3IPv6CommParametersESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetL3IPv6CommParameters( NotificationChain msgs ) {
        L3IPv6CommParameters oldL3IPv6CommParameters = l3IPv6CommParameters;
        l3IPv6CommParameters = null;
        boolean oldL3IPv6CommParametersESet = l3IPv6CommParametersESet;
        l3IPv6CommParametersESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.GOOSE_PARAMETERS__L3_IPV6_COMM_PARAMETERS, oldL3IPv6CommParameters, null,
                    oldL3IPv6CommParametersESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetL3IPv6CommParameters() {
        if( l3IPv6CommParameters != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) l3IPv6CommParameters ).eInverseRemove( this,
                    AsdPackage.L3I_PV6_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS, L3IPv6CommParameters.class, msgs );
            msgs = basicUnsetL3IPv6CommParameters( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldL3IPv6CommParametersESet = l3IPv6CommParametersESet;
            l3IPv6CommParametersESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.GOOSE_PARAMETERS__L3_IPV6_COMM_PARAMETERS, null, null,
                        oldL3IPv6CommParametersESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetL3IPv6CommParameters() {
        return l3IPv6CommParametersESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getGoId() {
        return goId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGoId( String newGoId ) {
        String oldGoId = goId;
        goId = newGoId;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.GOOSE_PARAMETERS__GO_ID, oldGoId,
                    goId ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getMaxTime() {
        return maxTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxTime( BigDecimal newMaxTime ) {
        BigDecimal oldMaxTime = maxTime;
        maxTime = newMaxTime;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.GOOSE_PARAMETERS__MAX_TIME, oldMaxTime,
                    maxTime ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getMinTime() {
        return minTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinTime( BigDecimal newMinTime ) {
        BigDecimal oldMinTime = minTime;
        minTime = newMinTime;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.GOOSE_PARAMETERS__MIN_TIME, oldMinTime,
                    minTime ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSecurityEnabled() {
        return securityEnabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSecurityEnabled( boolean newSecurityEnabled ) {
        boolean oldSecurityEnabled = securityEnabled;
        securityEnabled = newSecurityEnabled;
        boolean oldSecurityEnabledESet = securityEnabledESet;
        securityEnabledESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.GOOSE_PARAMETERS__SECURITY_ENABLED,
                    oldSecurityEnabled, securityEnabled, !oldSecurityEnabledESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSecurityEnabled() {
        boolean oldSecurityEnabled = securityEnabled;
        boolean oldSecurityEnabledESet = securityEnabledESet;
        securityEnabled = SECURITY_ENABLED_EDEFAULT;
        securityEnabledESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.GOOSE_PARAMETERS__SECURITY_ENABLED,
                    oldSecurityEnabled, SECURITY_ENABLED_EDEFAULT, oldSecurityEnabledESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSecurityEnabled() {
        return securityEnabledESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CommServiceSpecifications getParentCommServiceSpecifications() {
        if( eContainerFeatureID() != AsdPackage.GOOSE_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS ) {
            return null;
        }
        return ( CommServiceSpecifications ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentCommServiceSpecifications(
            CommServiceSpecifications newParentCommServiceSpecifications, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentCommServiceSpecifications,
                AsdPackage.GOOSE_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentCommServiceSpecifications( CommServiceSpecifications newParentCommServiceSpecifications ) {
        if( newParentCommServiceSpecifications != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.GOOSE_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS
                        && newParentCommServiceSpecifications != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentCommServiceSpecifications ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentCommServiceSpecifications != null ) {
                msgs = ( ( InternalEObject ) newParentCommServiceSpecifications ).eInverseAdd( this,
                        AsdPackage.COMM_SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS, CommServiceSpecifications.class,
                        msgs );
            }
            msgs = basicSetParentCommServiceSpecifications( newParentCommServiceSpecifications, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.GOOSE_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS, newParentCommServiceSpecifications,
                    newParentCommServiceSpecifications ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceSpecifications getParentServiceSpecifications() {
        if( eContainerFeatureID() != AsdPackage.GOOSE_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS ) {
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
                AsdPackage.GOOSE_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.GOOSE_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS
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
                        AsdPackage.SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS, ServiceSpecifications.class, msgs );
            }
            msgs = basicSetParentServiceSpecifications( newParentServiceSpecifications, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.GOOSE_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS, newParentServiceSpecifications,
                    newParentServiceSpecifications ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GooseParametersRef getReferredByGooseParametersRef() {
        if( referredByGooseParametersRef != null && referredByGooseParametersRef.eIsProxy() ) {
            InternalEObject oldReferredByGooseParametersRef = ( InternalEObject ) referredByGooseParametersRef;
            referredByGooseParametersRef = ( GooseParametersRef ) eResolveProxy( oldReferredByGooseParametersRef );
            if( referredByGooseParametersRef != oldReferredByGooseParametersRef ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.GOOSE_PARAMETERS__REFERRED_BY_GOOSE_PARAMETERS_REF,
                            oldReferredByGooseParametersRef, referredByGooseParametersRef ) );
                }
            }
        }
        return referredByGooseParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GooseParametersRef basicGetReferredByGooseParametersRef() {
        return referredByGooseParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReferredByGooseParametersRef( GooseParametersRef newReferredByGooseParametersRef,
            NotificationChain msgs ) {
        GooseParametersRef oldReferredByGooseParametersRef = referredByGooseParametersRef;
        referredByGooseParametersRef = newReferredByGooseParametersRef;
        boolean oldReferredByGooseParametersRefESet = referredByGooseParametersRefESet;
        referredByGooseParametersRefESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.GOOSE_PARAMETERS__REFERRED_BY_GOOSE_PARAMETERS_REF, oldReferredByGooseParametersRef,
                    newReferredByGooseParametersRef, !oldReferredByGooseParametersRefESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReferredByGooseParametersRef( GooseParametersRef newReferredByGooseParametersRef ) {
        if( newReferredByGooseParametersRef != referredByGooseParametersRef ) {
            NotificationChain msgs = null;
            if( referredByGooseParametersRef != null ) {
                msgs = ( ( InternalEObject ) referredByGooseParametersRef ).eInverseRemove( this,
                        AsdPackage.GOOSE_PARAMETERS_REF__REFERS_TO_GOOSE_PARAMETERS, GooseParametersRef.class, msgs );
            }
            if( newReferredByGooseParametersRef != null ) {
                msgs = ( ( InternalEObject ) newReferredByGooseParametersRef ).eInverseAdd( this,
                        AsdPackage.GOOSE_PARAMETERS_REF__REFERS_TO_GOOSE_PARAMETERS, GooseParametersRef.class, msgs );
            }
            msgs = basicSetReferredByGooseParametersRef( newReferredByGooseParametersRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldReferredByGooseParametersRefESet = referredByGooseParametersRefESet;
            referredByGooseParametersRefESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.GOOSE_PARAMETERS__REFERRED_BY_GOOSE_PARAMETERS_REF, newReferredByGooseParametersRef,
                        newReferredByGooseParametersRef, !oldReferredByGooseParametersRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReferredByGooseParametersRef( NotificationChain msgs ) {
        GooseParametersRef oldReferredByGooseParametersRef = referredByGooseParametersRef;
        referredByGooseParametersRef = null;
        boolean oldReferredByGooseParametersRefESet = referredByGooseParametersRefESet;
        referredByGooseParametersRefESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.GOOSE_PARAMETERS__REFERRED_BY_GOOSE_PARAMETERS_REF, oldReferredByGooseParametersRef,
                    null, oldReferredByGooseParametersRefESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByGooseParametersRef() {
        if( referredByGooseParametersRef != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) referredByGooseParametersRef ).eInverseRemove( this,
                    AsdPackage.GOOSE_PARAMETERS_REF__REFERS_TO_GOOSE_PARAMETERS, GooseParametersRef.class, msgs );
            msgs = basicUnsetReferredByGooseParametersRef( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldReferredByGooseParametersRefESet = referredByGooseParametersRefESet;
            referredByGooseParametersRefESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.GOOSE_PARAMETERS__REFERRED_BY_GOOSE_PARAMETERS_REF, null, null,
                        oldReferredByGooseParametersRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByGooseParametersRef() {
        return referredByGooseParametersRefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.GOOSE_PARAMETERS__L2_COMM_PARAMETERS:
            if( l2CommParameters != null ) {
                msgs = ( ( InternalEObject ) l2CommParameters ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.GOOSE_PARAMETERS__L2_COMM_PARAMETERS, null, msgs );
            }
            return basicSetL2CommParameters( ( L2CommParameters ) otherEnd, msgs );
        case AsdPackage.GOOSE_PARAMETERS__L3_IPV4_COMM_PARAMETERS:
            if( l3IPv4CommParameters != null ) {
                msgs = ( ( InternalEObject ) l3IPv4CommParameters ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.GOOSE_PARAMETERS__L3_IPV4_COMM_PARAMETERS, null, msgs );
            }
            return basicSetL3IPv4CommParameters( ( L3IPv4CommParameters ) otherEnd, msgs );
        case AsdPackage.GOOSE_PARAMETERS__L3_IPV6_COMM_PARAMETERS:
            if( l3IPv6CommParameters != null ) {
                msgs = ( ( InternalEObject ) l3IPv6CommParameters ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.GOOSE_PARAMETERS__L3_IPV6_COMM_PARAMETERS, null, msgs );
            }
            return basicSetL3IPv6CommParameters( ( L3IPv6CommParameters ) otherEnd, msgs );
        case AsdPackage.GOOSE_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentCommServiceSpecifications( ( CommServiceSpecifications ) otherEnd, msgs );
        case AsdPackage.GOOSE_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentServiceSpecifications( ( ServiceSpecifications ) otherEnd, msgs );
        case AsdPackage.GOOSE_PARAMETERS__REFERRED_BY_GOOSE_PARAMETERS_REF:
            if( referredByGooseParametersRef != null ) {
                msgs = ( ( InternalEObject ) referredByGooseParametersRef ).eInverseRemove( this,
                        AsdPackage.GOOSE_PARAMETERS_REF__REFERS_TO_GOOSE_PARAMETERS, GooseParametersRef.class, msgs );
            }
            return basicSetReferredByGooseParametersRef( ( GooseParametersRef ) otherEnd, msgs );
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
        case AsdPackage.GOOSE_PARAMETERS__L2_COMM_PARAMETERS:
            return basicUnsetL2CommParameters( msgs );
        case AsdPackage.GOOSE_PARAMETERS__L3_IPV4_COMM_PARAMETERS:
            return basicUnsetL3IPv4CommParameters( msgs );
        case AsdPackage.GOOSE_PARAMETERS__L3_IPV6_COMM_PARAMETERS:
            return basicUnsetL3IPv6CommParameters( msgs );
        case AsdPackage.GOOSE_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            return basicSetParentCommServiceSpecifications( null, msgs );
        case AsdPackage.GOOSE_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return basicSetParentServiceSpecifications( null, msgs );
        case AsdPackage.GOOSE_PARAMETERS__REFERRED_BY_GOOSE_PARAMETERS_REF:
            return basicUnsetReferredByGooseParametersRef( msgs );
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
        case AsdPackage.GOOSE_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.COMM_SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS,
                    CommServiceSpecifications.class, msgs );
        case AsdPackage.GOOSE_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS,
                    ServiceSpecifications.class, msgs );
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
        case AsdPackage.GOOSE_PARAMETERS__L2_COMM_PARAMETERS:
            return getL2CommParameters();
        case AsdPackage.GOOSE_PARAMETERS__L3_IPV4_COMM_PARAMETERS:
            return getL3IPv4CommParameters();
        case AsdPackage.GOOSE_PARAMETERS__L3_IPV6_COMM_PARAMETERS:
            return getL3IPv6CommParameters();
        case AsdPackage.GOOSE_PARAMETERS__GO_ID:
            return getGoId();
        case AsdPackage.GOOSE_PARAMETERS__MAX_TIME:
            return getMaxTime();
        case AsdPackage.GOOSE_PARAMETERS__MIN_TIME:
            return getMinTime();
        case AsdPackage.GOOSE_PARAMETERS__SECURITY_ENABLED:
            return isSecurityEnabled();
        case AsdPackage.GOOSE_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            return getParentCommServiceSpecifications();
        case AsdPackage.GOOSE_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return getParentServiceSpecifications();
        case AsdPackage.GOOSE_PARAMETERS__REFERRED_BY_GOOSE_PARAMETERS_REF:
            if( resolve ) {
                return getReferredByGooseParametersRef();
            }
            return basicGetReferredByGooseParametersRef();
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
        case AsdPackage.GOOSE_PARAMETERS__L2_COMM_PARAMETERS:
            setL2CommParameters( ( L2CommParameters ) newValue );
            return;
        case AsdPackage.GOOSE_PARAMETERS__L3_IPV4_COMM_PARAMETERS:
            setL3IPv4CommParameters( ( L3IPv4CommParameters ) newValue );
            return;
        case AsdPackage.GOOSE_PARAMETERS__L3_IPV6_COMM_PARAMETERS:
            setL3IPv6CommParameters( ( L3IPv6CommParameters ) newValue );
            return;
        case AsdPackage.GOOSE_PARAMETERS__GO_ID:
            setGoId( ( String ) newValue );
            return;
        case AsdPackage.GOOSE_PARAMETERS__MAX_TIME:
            setMaxTime( ( BigDecimal ) newValue );
            return;
        case AsdPackage.GOOSE_PARAMETERS__MIN_TIME:
            setMinTime( ( BigDecimal ) newValue );
            return;
        case AsdPackage.GOOSE_PARAMETERS__SECURITY_ENABLED:
            setSecurityEnabled( ( Boolean ) newValue );
            return;
        case AsdPackage.GOOSE_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            setParentCommServiceSpecifications( ( CommServiceSpecifications ) newValue );
            return;
        case AsdPackage.GOOSE_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            setParentServiceSpecifications( ( ServiceSpecifications ) newValue );
            return;
        case AsdPackage.GOOSE_PARAMETERS__REFERRED_BY_GOOSE_PARAMETERS_REF:
            setReferredByGooseParametersRef( ( GooseParametersRef ) newValue );
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
        case AsdPackage.GOOSE_PARAMETERS__L2_COMM_PARAMETERS:
            unsetL2CommParameters();
            return;
        case AsdPackage.GOOSE_PARAMETERS__L3_IPV4_COMM_PARAMETERS:
            unsetL3IPv4CommParameters();
            return;
        case AsdPackage.GOOSE_PARAMETERS__L3_IPV6_COMM_PARAMETERS:
            unsetL3IPv6CommParameters();
            return;
        case AsdPackage.GOOSE_PARAMETERS__GO_ID:
            setGoId( GO_ID_EDEFAULT );
            return;
        case AsdPackage.GOOSE_PARAMETERS__MAX_TIME:
            setMaxTime( MAX_TIME_EDEFAULT );
            return;
        case AsdPackage.GOOSE_PARAMETERS__MIN_TIME:
            setMinTime( MIN_TIME_EDEFAULT );
            return;
        case AsdPackage.GOOSE_PARAMETERS__SECURITY_ENABLED:
            unsetSecurityEnabled();
            return;
        case AsdPackage.GOOSE_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            setParentCommServiceSpecifications( ( CommServiceSpecifications ) null );
            return;
        case AsdPackage.GOOSE_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            setParentServiceSpecifications( ( ServiceSpecifications ) null );
            return;
        case AsdPackage.GOOSE_PARAMETERS__REFERRED_BY_GOOSE_PARAMETERS_REF:
            unsetReferredByGooseParametersRef();
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
        case AsdPackage.GOOSE_PARAMETERS__L2_COMM_PARAMETERS:
            return isSetL2CommParameters();
        case AsdPackage.GOOSE_PARAMETERS__L3_IPV4_COMM_PARAMETERS:
            return isSetL3IPv4CommParameters();
        case AsdPackage.GOOSE_PARAMETERS__L3_IPV6_COMM_PARAMETERS:
            return isSetL3IPv6CommParameters();
        case AsdPackage.GOOSE_PARAMETERS__GO_ID:
            return GO_ID_EDEFAULT == null ? goId != null : !GO_ID_EDEFAULT.equals( goId );
        case AsdPackage.GOOSE_PARAMETERS__MAX_TIME:
            return MAX_TIME_EDEFAULT == null ? maxTime != null : !MAX_TIME_EDEFAULT.equals( maxTime );
        case AsdPackage.GOOSE_PARAMETERS__MIN_TIME:
            return MIN_TIME_EDEFAULT == null ? minTime != null : !MIN_TIME_EDEFAULT.equals( minTime );
        case AsdPackage.GOOSE_PARAMETERS__SECURITY_ENABLED:
            return isSetSecurityEnabled();
        case AsdPackage.GOOSE_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            return getParentCommServiceSpecifications() != null;
        case AsdPackage.GOOSE_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return getParentServiceSpecifications() != null;
        case AsdPackage.GOOSE_PARAMETERS__REFERRED_BY_GOOSE_PARAMETERS_REF:
            return isSetReferredByGooseParametersRef();
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
        result.append( " (goId: " );
        result.append( goId );
        result.append( ", maxTime: " );
        result.append( maxTime );
        result.append( ", minTime: " );
        result.append( minTime );
        result.append( ", securityEnabled: " );
        if( securityEnabledESet ) {
            result.append( securityEnabled );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //GooseParametersImpl
