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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpMod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMV Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersImpl#getL2CommParameters <em>L2 Comm Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersImpl#getL3IPv4CommParameters <em>L3I Pv4 Comm Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersImpl#getL3IPv6CommParameters <em>L3I Pv6 Comm Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersImpl#isMulticast <em>Multicast</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersImpl#getNofASDU <em>Nof ASDU</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersImpl#isSecurityEnabled <em>Security Enabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersImpl#getSmpMod <em>Smp Mod</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersImpl#getSmpRate <em>Smp Rate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersImpl#getSmvId <em>Smv Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersImpl#getParentCommServiceSpecifications <em>Parent Comm Service Specifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersImpl#getParentServiceSpecifications <em>Parent Service Specifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersImpl#getReferredBySMVParametersRef <em>Referred By SMV Parameters Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SMVParametersImpl extends ControlBlockParametersImpl implements SMVParameters {
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
     * The default value of the '{@link #isMulticast() <em>Multicast</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMulticast()
     * @generated
     * @ordered
     */
    protected static final boolean MULTICAST_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isMulticast() <em>Multicast</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMulticast()
     * @generated
     * @ordered
     */
    protected boolean multicast = MULTICAST_EDEFAULT;

    /**
     * This is true if the Multicast attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean multicastESet;

    /**
     * The default value of the '{@link #getNofASDU() <em>Nof ASDU</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNofASDU()
     * @generated
     * @ordered
     */
    protected static final long NOF_ASDU_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getNofASDU() <em>Nof ASDU</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNofASDU()
     * @generated
     * @ordered
     */
    protected long nofASDU = NOF_ASDU_EDEFAULT;

    /**
     * This is true if the Nof ASDU attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nofASDUESet;

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
     * The default value of the '{@link #getSmpMod() <em>Smp Mod</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmpMod()
     * @generated
     * @ordered
     */
    protected static final SmpMod SMP_MOD_EDEFAULT = SmpMod.SMP_PER_PERIOD;

    /**
     * The cached value of the '{@link #getSmpMod() <em>Smp Mod</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmpMod()
     * @generated
     * @ordered
     */
    protected SmpMod smpMod = SMP_MOD_EDEFAULT;

    /**
     * This is true if the Smp Mod attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean smpModESet;

    /**
     * The default value of the '{@link #getSmpRate() <em>Smp Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmpRate()
     * @generated
     * @ordered
     */
    protected static final long SMP_RATE_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getSmpRate() <em>Smp Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmpRate()
     * @generated
     * @ordered
     */
    protected long smpRate = SMP_RATE_EDEFAULT;

    /**
     * This is true if the Smp Rate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean smpRateESet;

    /**
     * The default value of the '{@link #getSmvId() <em>Smv Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmvId()
     * @generated
     * @ordered
     */
    protected static final String SMV_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSmvId() <em>Smv Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmvId()
     * @generated
     * @ordered
     */
    protected String smvId = SMV_ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getReferredBySMVParametersRef() <em>Referred By SMV Parameters Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredBySMVParametersRef()
     * @generated
     * @ordered
     */
    protected SMVParametersRef referredBySMVParametersRef;

    /**
     * This is true if the Referred By SMV Parameters Ref reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean referredBySMVParametersRefESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SMVParametersImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getSMVParameters();
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
                    AsdPackage.SMV_PARAMETERS__L2_COMM_PARAMETERS, oldL2CommParameters, newL2CommParameters,
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
                        AsdPackage.L2_COMM_PARAMETERS__PARENT_SMV_PARAMETERS, L2CommParameters.class, msgs );
            }
            if( newL2CommParameters != null ) {
                msgs = ( ( InternalEObject ) newL2CommParameters ).eInverseAdd( this,
                        AsdPackage.L2_COMM_PARAMETERS__PARENT_SMV_PARAMETERS, L2CommParameters.class, msgs );
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
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SMV_PARAMETERS__L2_COMM_PARAMETERS,
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
                    AsdPackage.SMV_PARAMETERS__L2_COMM_PARAMETERS, oldL2CommParameters, null, oldL2CommParametersESet );
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
                    AsdPackage.L2_COMM_PARAMETERS__PARENT_SMV_PARAMETERS, L2CommParameters.class, msgs );
            msgs = basicUnsetL2CommParameters( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldL2CommParametersESet = l2CommParametersESet;
            l2CommParametersESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SMV_PARAMETERS__L2_COMM_PARAMETERS,
                        null, null, oldL2CommParametersESet ) );
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
                    AsdPackage.SMV_PARAMETERS__L3_IPV4_COMM_PARAMETERS, oldL3IPv4CommParameters,
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
                        AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_SMV_PARAMETERS, L3IPv4CommParameters.class, msgs );
            }
            if( newL3IPv4CommParameters != null ) {
                msgs = ( ( InternalEObject ) newL3IPv4CommParameters ).eInverseAdd( this,
                        AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_SMV_PARAMETERS, L3IPv4CommParameters.class, msgs );
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
                        AsdPackage.SMV_PARAMETERS__L3_IPV4_COMM_PARAMETERS, newL3IPv4CommParameters,
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
                    AsdPackage.SMV_PARAMETERS__L3_IPV4_COMM_PARAMETERS, oldL3IPv4CommParameters, null,
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
                    AsdPackage.L3I_PV4_COMM_PARAMETERS__PARENT_SMV_PARAMETERS, L3IPv4CommParameters.class, msgs );
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
                        AsdPackage.SMV_PARAMETERS__L3_IPV4_COMM_PARAMETERS, null, null, oldL3IPv4CommParametersESet ) );
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
                    AsdPackage.SMV_PARAMETERS__L3_IPV6_COMM_PARAMETERS, oldL3IPv6CommParameters,
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
                        AsdPackage.L3I_PV6_COMM_PARAMETERS__PARENT_SMV_PARAMETERS, L3IPv6CommParameters.class, msgs );
            }
            if( newL3IPv6CommParameters != null ) {
                msgs = ( ( InternalEObject ) newL3IPv6CommParameters ).eInverseAdd( this,
                        AsdPackage.L3I_PV6_COMM_PARAMETERS__PARENT_SMV_PARAMETERS, L3IPv6CommParameters.class, msgs );
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
                        AsdPackage.SMV_PARAMETERS__L3_IPV6_COMM_PARAMETERS, newL3IPv6CommParameters,
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
                    AsdPackage.SMV_PARAMETERS__L3_IPV6_COMM_PARAMETERS, oldL3IPv6CommParameters, null,
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
                    AsdPackage.L3I_PV6_COMM_PARAMETERS__PARENT_SMV_PARAMETERS, L3IPv6CommParameters.class, msgs );
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
                        AsdPackage.SMV_PARAMETERS__L3_IPV6_COMM_PARAMETERS, null, null, oldL3IPv6CommParametersESet ) );
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
    public boolean isMulticast() {
        return multicast;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMulticast( boolean newMulticast ) {
        boolean oldMulticast = multicast;
        multicast = newMulticast;
        boolean oldMulticastESet = multicastESet;
        multicastESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SMV_PARAMETERS__MULTICAST, oldMulticast,
                    multicast, !oldMulticastESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMulticast() {
        boolean oldMulticast = multicast;
        boolean oldMulticastESet = multicastESet;
        multicast = MULTICAST_EDEFAULT;
        multicastESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SMV_PARAMETERS__MULTICAST,
                    oldMulticast, MULTICAST_EDEFAULT, oldMulticastESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMulticast() {
        return multicastESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getNofASDU() {
        return nofASDU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNofASDU( long newNofASDU ) {
        long oldNofASDU = nofASDU;
        nofASDU = newNofASDU;
        boolean oldNofASDUESet = nofASDUESet;
        nofASDUESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SMV_PARAMETERS__NOF_ASDU, oldNofASDU,
                    nofASDU, !oldNofASDUESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNofASDU() {
        long oldNofASDU = nofASDU;
        boolean oldNofASDUESet = nofASDUESet;
        nofASDU = NOF_ASDU_EDEFAULT;
        nofASDUESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SMV_PARAMETERS__NOF_ASDU, oldNofASDU,
                    NOF_ASDU_EDEFAULT, oldNofASDUESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNofASDU() {
        return nofASDUESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SMV_PARAMETERS__SECURITY_ENABLED,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SMV_PARAMETERS__SECURITY_ENABLED,
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
    public SmpMod getSmpMod() {
        return smpMod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSmpMod( SmpMod newSmpMod ) {
        SmpMod oldSmpMod = smpMod;
        smpMod = newSmpMod == null ? SMP_MOD_EDEFAULT : newSmpMod;
        boolean oldSmpModESet = smpModESet;
        smpModESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SMV_PARAMETERS__SMP_MOD, oldSmpMod,
                    smpMod, !oldSmpModESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSmpMod() {
        SmpMod oldSmpMod = smpMod;
        boolean oldSmpModESet = smpModESet;
        smpMod = SMP_MOD_EDEFAULT;
        smpModESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SMV_PARAMETERS__SMP_MOD, oldSmpMod,
                    SMP_MOD_EDEFAULT, oldSmpModESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSmpMod() {
        return smpModESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getSmpRate() {
        return smpRate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSmpRate( long newSmpRate ) {
        long oldSmpRate = smpRate;
        smpRate = newSmpRate;
        boolean oldSmpRateESet = smpRateESet;
        smpRateESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SMV_PARAMETERS__SMP_RATE, oldSmpRate,
                    smpRate, !oldSmpRateESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSmpRate() {
        long oldSmpRate = smpRate;
        boolean oldSmpRateESet = smpRateESet;
        smpRate = SMP_RATE_EDEFAULT;
        smpRateESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SMV_PARAMETERS__SMP_RATE, oldSmpRate,
                    SMP_RATE_EDEFAULT, oldSmpRateESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSmpRate() {
        return smpRateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSmvId() {
        return smvId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSmvId( String newSmvId ) {
        String oldSmvId = smvId;
        smvId = newSmvId;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SMV_PARAMETERS__SMV_ID, oldSmvId,
                    smvId ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CommServiceSpecifications getParentCommServiceSpecifications() {
        if( eContainerFeatureID() != AsdPackage.SMV_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS ) {
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
                AsdPackage.SMV_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.SMV_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS
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
                        AsdPackage.COMM_SERVICE_SPECIFICATIONS__SMV_PARAMETERS, CommServiceSpecifications.class, msgs );
            }
            msgs = basicSetParentCommServiceSpecifications( newParentCommServiceSpecifications, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.SMV_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS, newParentCommServiceSpecifications,
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
        if( eContainerFeatureID() != AsdPackage.SMV_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS ) {
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
                AsdPackage.SMV_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.SMV_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS
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
                        AsdPackage.SERVICE_SPECIFICATIONS__SMV_PARAMETERS, ServiceSpecifications.class, msgs );
            }
            msgs = basicSetParentServiceSpecifications( newParentServiceSpecifications, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.SMV_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS, newParentServiceSpecifications,
                    newParentServiceSpecifications ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SMVParametersRef getReferredBySMVParametersRef() {
        if( referredBySMVParametersRef != null && referredBySMVParametersRef.eIsProxy() ) {
            InternalEObject oldReferredBySMVParametersRef = ( InternalEObject ) referredBySMVParametersRef;
            referredBySMVParametersRef = ( SMVParametersRef ) eResolveProxy( oldReferredBySMVParametersRef );
            if( referredBySMVParametersRef != oldReferredBySMVParametersRef ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.SMV_PARAMETERS__REFERRED_BY_SMV_PARAMETERS_REF, oldReferredBySMVParametersRef,
                            referredBySMVParametersRef ) );
                }
            }
        }
        return referredBySMVParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SMVParametersRef basicGetReferredBySMVParametersRef() {
        return referredBySMVParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReferredBySMVParametersRef( SMVParametersRef newReferredBySMVParametersRef,
            NotificationChain msgs ) {
        SMVParametersRef oldReferredBySMVParametersRef = referredBySMVParametersRef;
        referredBySMVParametersRef = newReferredBySMVParametersRef;
        boolean oldReferredBySMVParametersRefESet = referredBySMVParametersRefESet;
        referredBySMVParametersRefESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.SMV_PARAMETERS__REFERRED_BY_SMV_PARAMETERS_REF, oldReferredBySMVParametersRef,
                    newReferredBySMVParametersRef, !oldReferredBySMVParametersRefESet );
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
    public void setReferredBySMVParametersRef( SMVParametersRef newReferredBySMVParametersRef ) {
        if( newReferredBySMVParametersRef != referredBySMVParametersRef ) {
            NotificationChain msgs = null;
            if( referredBySMVParametersRef != null ) {
                msgs = ( ( InternalEObject ) referredBySMVParametersRef ).eInverseRemove( this,
                        AsdPackage.SMV_PARAMETERS_REF__REFERS_TO_SMV_PARAMETERS, SMVParametersRef.class, msgs );
            }
            if( newReferredBySMVParametersRef != null ) {
                msgs = ( ( InternalEObject ) newReferredBySMVParametersRef ).eInverseAdd( this,
                        AsdPackage.SMV_PARAMETERS_REF__REFERS_TO_SMV_PARAMETERS, SMVParametersRef.class, msgs );
            }
            msgs = basicSetReferredBySMVParametersRef( newReferredBySMVParametersRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldReferredBySMVParametersRefESet = referredBySMVParametersRefESet;
            referredBySMVParametersRefESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.SMV_PARAMETERS__REFERRED_BY_SMV_PARAMETERS_REF, newReferredBySMVParametersRef,
                        newReferredBySMVParametersRef, !oldReferredBySMVParametersRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReferredBySMVParametersRef( NotificationChain msgs ) {
        SMVParametersRef oldReferredBySMVParametersRef = referredBySMVParametersRef;
        referredBySMVParametersRef = null;
        boolean oldReferredBySMVParametersRefESet = referredBySMVParametersRefESet;
        referredBySMVParametersRefESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.SMV_PARAMETERS__REFERRED_BY_SMV_PARAMETERS_REF, oldReferredBySMVParametersRef, null,
                    oldReferredBySMVParametersRefESet );
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
    public void unsetReferredBySMVParametersRef() {
        if( referredBySMVParametersRef != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) referredBySMVParametersRef ).eInverseRemove( this,
                    AsdPackage.SMV_PARAMETERS_REF__REFERS_TO_SMV_PARAMETERS, SMVParametersRef.class, msgs );
            msgs = basicUnsetReferredBySMVParametersRef( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldReferredBySMVParametersRefESet = referredBySMVParametersRefESet;
            referredBySMVParametersRefESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.SMV_PARAMETERS__REFERRED_BY_SMV_PARAMETERS_REF, null, null,
                        oldReferredBySMVParametersRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredBySMVParametersRef() {
        return referredBySMVParametersRefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.SMV_PARAMETERS__L2_COMM_PARAMETERS:
            if( l2CommParameters != null ) {
                msgs = ( ( InternalEObject ) l2CommParameters ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.SMV_PARAMETERS__L2_COMM_PARAMETERS, null, msgs );
            }
            return basicSetL2CommParameters( ( L2CommParameters ) otherEnd, msgs );
        case AsdPackage.SMV_PARAMETERS__L3_IPV4_COMM_PARAMETERS:
            if( l3IPv4CommParameters != null ) {
                msgs = ( ( InternalEObject ) l3IPv4CommParameters ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.SMV_PARAMETERS__L3_IPV4_COMM_PARAMETERS, null, msgs );
            }
            return basicSetL3IPv4CommParameters( ( L3IPv4CommParameters ) otherEnd, msgs );
        case AsdPackage.SMV_PARAMETERS__L3_IPV6_COMM_PARAMETERS:
            if( l3IPv6CommParameters != null ) {
                msgs = ( ( InternalEObject ) l3IPv6CommParameters ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.SMV_PARAMETERS__L3_IPV6_COMM_PARAMETERS, null, msgs );
            }
            return basicSetL3IPv6CommParameters( ( L3IPv6CommParameters ) otherEnd, msgs );
        case AsdPackage.SMV_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentCommServiceSpecifications( ( CommServiceSpecifications ) otherEnd, msgs );
        case AsdPackage.SMV_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentServiceSpecifications( ( ServiceSpecifications ) otherEnd, msgs );
        case AsdPackage.SMV_PARAMETERS__REFERRED_BY_SMV_PARAMETERS_REF:
            if( referredBySMVParametersRef != null ) {
                msgs = ( ( InternalEObject ) referredBySMVParametersRef ).eInverseRemove( this,
                        AsdPackage.SMV_PARAMETERS_REF__REFERS_TO_SMV_PARAMETERS, SMVParametersRef.class, msgs );
            }
            return basicSetReferredBySMVParametersRef( ( SMVParametersRef ) otherEnd, msgs );
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
        case AsdPackage.SMV_PARAMETERS__L2_COMM_PARAMETERS:
            return basicUnsetL2CommParameters( msgs );
        case AsdPackage.SMV_PARAMETERS__L3_IPV4_COMM_PARAMETERS:
            return basicUnsetL3IPv4CommParameters( msgs );
        case AsdPackage.SMV_PARAMETERS__L3_IPV6_COMM_PARAMETERS:
            return basicUnsetL3IPv6CommParameters( msgs );
        case AsdPackage.SMV_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            return basicSetParentCommServiceSpecifications( null, msgs );
        case AsdPackage.SMV_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return basicSetParentServiceSpecifications( null, msgs );
        case AsdPackage.SMV_PARAMETERS__REFERRED_BY_SMV_PARAMETERS_REF:
            return basicUnsetReferredBySMVParametersRef( msgs );
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
        case AsdPackage.SMV_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.COMM_SERVICE_SPECIFICATIONS__SMV_PARAMETERS,
                    CommServiceSpecifications.class, msgs );
        case AsdPackage.SMV_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SERVICE_SPECIFICATIONS__SMV_PARAMETERS,
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
        case AsdPackage.SMV_PARAMETERS__L2_COMM_PARAMETERS:
            return getL2CommParameters();
        case AsdPackage.SMV_PARAMETERS__L3_IPV4_COMM_PARAMETERS:
            return getL3IPv4CommParameters();
        case AsdPackage.SMV_PARAMETERS__L3_IPV6_COMM_PARAMETERS:
            return getL3IPv6CommParameters();
        case AsdPackage.SMV_PARAMETERS__MULTICAST:
            return isMulticast();
        case AsdPackage.SMV_PARAMETERS__NOF_ASDU:
            return getNofASDU();
        case AsdPackage.SMV_PARAMETERS__SECURITY_ENABLED:
            return isSecurityEnabled();
        case AsdPackage.SMV_PARAMETERS__SMP_MOD:
            return getSmpMod();
        case AsdPackage.SMV_PARAMETERS__SMP_RATE:
            return getSmpRate();
        case AsdPackage.SMV_PARAMETERS__SMV_ID:
            return getSmvId();
        case AsdPackage.SMV_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            return getParentCommServiceSpecifications();
        case AsdPackage.SMV_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return getParentServiceSpecifications();
        case AsdPackage.SMV_PARAMETERS__REFERRED_BY_SMV_PARAMETERS_REF:
            if( resolve ) {
                return getReferredBySMVParametersRef();
            }
            return basicGetReferredBySMVParametersRef();
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
        case AsdPackage.SMV_PARAMETERS__L2_COMM_PARAMETERS:
            setL2CommParameters( ( L2CommParameters ) newValue );
            return;
        case AsdPackage.SMV_PARAMETERS__L3_IPV4_COMM_PARAMETERS:
            setL3IPv4CommParameters( ( L3IPv4CommParameters ) newValue );
            return;
        case AsdPackage.SMV_PARAMETERS__L3_IPV6_COMM_PARAMETERS:
            setL3IPv6CommParameters( ( L3IPv6CommParameters ) newValue );
            return;
        case AsdPackage.SMV_PARAMETERS__MULTICAST:
            setMulticast( ( Boolean ) newValue );
            return;
        case AsdPackage.SMV_PARAMETERS__NOF_ASDU:
            setNofASDU( ( Long ) newValue );
            return;
        case AsdPackage.SMV_PARAMETERS__SECURITY_ENABLED:
            setSecurityEnabled( ( Boolean ) newValue );
            return;
        case AsdPackage.SMV_PARAMETERS__SMP_MOD:
            setSmpMod( ( SmpMod ) newValue );
            return;
        case AsdPackage.SMV_PARAMETERS__SMP_RATE:
            setSmpRate( ( Long ) newValue );
            return;
        case AsdPackage.SMV_PARAMETERS__SMV_ID:
            setSmvId( ( String ) newValue );
            return;
        case AsdPackage.SMV_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            setParentCommServiceSpecifications( ( CommServiceSpecifications ) newValue );
            return;
        case AsdPackage.SMV_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            setParentServiceSpecifications( ( ServiceSpecifications ) newValue );
            return;
        case AsdPackage.SMV_PARAMETERS__REFERRED_BY_SMV_PARAMETERS_REF:
            setReferredBySMVParametersRef( ( SMVParametersRef ) newValue );
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
        case AsdPackage.SMV_PARAMETERS__L2_COMM_PARAMETERS:
            unsetL2CommParameters();
            return;
        case AsdPackage.SMV_PARAMETERS__L3_IPV4_COMM_PARAMETERS:
            unsetL3IPv4CommParameters();
            return;
        case AsdPackage.SMV_PARAMETERS__L3_IPV6_COMM_PARAMETERS:
            unsetL3IPv6CommParameters();
            return;
        case AsdPackage.SMV_PARAMETERS__MULTICAST:
            unsetMulticast();
            return;
        case AsdPackage.SMV_PARAMETERS__NOF_ASDU:
            unsetNofASDU();
            return;
        case AsdPackage.SMV_PARAMETERS__SECURITY_ENABLED:
            unsetSecurityEnabled();
            return;
        case AsdPackage.SMV_PARAMETERS__SMP_MOD:
            unsetSmpMod();
            return;
        case AsdPackage.SMV_PARAMETERS__SMP_RATE:
            unsetSmpRate();
            return;
        case AsdPackage.SMV_PARAMETERS__SMV_ID:
            setSmvId( SMV_ID_EDEFAULT );
            return;
        case AsdPackage.SMV_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            setParentCommServiceSpecifications( ( CommServiceSpecifications ) null );
            return;
        case AsdPackage.SMV_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            setParentServiceSpecifications( ( ServiceSpecifications ) null );
            return;
        case AsdPackage.SMV_PARAMETERS__REFERRED_BY_SMV_PARAMETERS_REF:
            unsetReferredBySMVParametersRef();
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
        case AsdPackage.SMV_PARAMETERS__L2_COMM_PARAMETERS:
            return isSetL2CommParameters();
        case AsdPackage.SMV_PARAMETERS__L3_IPV4_COMM_PARAMETERS:
            return isSetL3IPv4CommParameters();
        case AsdPackage.SMV_PARAMETERS__L3_IPV6_COMM_PARAMETERS:
            return isSetL3IPv6CommParameters();
        case AsdPackage.SMV_PARAMETERS__MULTICAST:
            return isSetMulticast();
        case AsdPackage.SMV_PARAMETERS__NOF_ASDU:
            return isSetNofASDU();
        case AsdPackage.SMV_PARAMETERS__SECURITY_ENABLED:
            return isSetSecurityEnabled();
        case AsdPackage.SMV_PARAMETERS__SMP_MOD:
            return isSetSmpMod();
        case AsdPackage.SMV_PARAMETERS__SMP_RATE:
            return isSetSmpRate();
        case AsdPackage.SMV_PARAMETERS__SMV_ID:
            return SMV_ID_EDEFAULT == null ? smvId != null : !SMV_ID_EDEFAULT.equals( smvId );
        case AsdPackage.SMV_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            return getParentCommServiceSpecifications() != null;
        case AsdPackage.SMV_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return getParentServiceSpecifications() != null;
        case AsdPackage.SMV_PARAMETERS__REFERRED_BY_SMV_PARAMETERS_REF:
            return isSetReferredBySMVParametersRef();
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
        result.append( " (multicast: " );
        if( multicastESet ) {
            result.append( multicast );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", nofASDU: " );
        if( nofASDUESet ) {
            result.append( nofASDU );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", securityEnabled: " );
        if( securityEnabledESet ) {
            result.append( securityEnabled );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", smpMod: " );
        if( smpModESet ) {
            result.append( smpMod );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", smpRate: " );
        if( smpRateESet ) {
            result.append( smpRate );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", smvId: " );
        result.append( smvId );
        result.append( ')' );
        return result.toString();
    }

} //SMVParametersImpl
