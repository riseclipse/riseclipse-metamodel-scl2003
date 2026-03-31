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

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogParametersImpl#getIntgPd <em>Intg Pd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogParametersImpl#isLogEna <em>Log Ena</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogParametersImpl#getLogLdInst <em>Log Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogParametersImpl#getLogLnClass <em>Log Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogParametersImpl#getLogLnInst <em>Log Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogParametersImpl#getLogName <em>Log Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogParametersImpl#getLogPrefix <em>Log Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogParametersImpl#isReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogParametersImpl#getParentServiceSpecifications <em>Parent Service Specifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogParametersImpl#getReferredByLogParametersRef <em>Referred By Log Parameters Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogParametersImpl extends ControlBlockParametersImpl implements LogParameters {
    /**
     * The default value of the '{@link #getIntgPd() <em>Intg Pd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntgPd()
     * @generated
     * @ordered
     */
    protected static final long INTG_PD_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getIntgPd() <em>Intg Pd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntgPd()
     * @generated
     * @ordered
     */
    protected long intgPd = INTG_PD_EDEFAULT;

    /**
     * This is true if the Intg Pd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean intgPdESet;

    /**
     * The default value of the '{@link #isLogEna() <em>Log Ena</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLogEna()
     * @generated
     * @ordered
     */
    protected static final boolean LOG_ENA_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLogEna() <em>Log Ena</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLogEna()
     * @generated
     * @ordered
     */
    protected boolean logEna = LOG_ENA_EDEFAULT;

    /**
     * This is true if the Log Ena attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean logEnaESet;

    /**
     * The default value of the '{@link #getLogLdInst() <em>Log Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogLdInst()
     * @generated
     * @ordered
     */
    protected static final String LOG_LD_INST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLogLdInst() <em>Log Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogLdInst()
     * @generated
     * @ordered
     */
    protected String logLdInst = LOG_LD_INST_EDEFAULT;

    /**
     * The default value of the '{@link #getLogLnClass() <em>Log Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogLnClass()
     * @generated
     * @ordered
     */
    protected static final String LOG_LN_CLASS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLogLnClass() <em>Log Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogLnClass()
     * @generated
     * @ordered
     */
    protected String logLnClass = LOG_LN_CLASS_EDEFAULT;

    /**
     * The default value of the '{@link #getLogLnInst() <em>Log Ln Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogLnInst()
     * @generated
     * @ordered
     */
    protected static final String LOG_LN_INST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLogLnInst() <em>Log Ln Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogLnInst()
     * @generated
     * @ordered
     */
    protected String logLnInst = LOG_LN_INST_EDEFAULT;

    /**
     * The default value of the '{@link #getLogName() <em>Log Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogName()
     * @generated
     * @ordered
     */
    protected static final String LOG_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLogName() <em>Log Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogName()
     * @generated
     * @ordered
     */
    protected String logName = LOG_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getLogPrefix() <em>Log Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogPrefix()
     * @generated
     * @ordered
     */
    protected static final String LOG_PREFIX_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getLogPrefix() <em>Log Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogPrefix()
     * @generated
     * @ordered
     */
    protected String logPrefix = LOG_PREFIX_EDEFAULT;

    /**
     * The default value of the '{@link #isReasonCode() <em>Reason Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isReasonCode()
     * @generated
     * @ordered
     */
    protected static final boolean REASON_CODE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isReasonCode() <em>Reason Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isReasonCode()
     * @generated
     * @ordered
     */
    protected boolean reasonCode = REASON_CODE_EDEFAULT;

    /**
     * This is true if the Reason Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reasonCodeESet;

    /**
     * The cached value of the '{@link #getReferredByLogParametersRef() <em>Referred By Log Parameters Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByLogParametersRef()
     * @generated
     * @ordered
     */
    protected EList< LogParametersRef > referredByLogParametersRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LogParametersImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getLogParameters();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getIntgPd() {
        return intgPd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIntgPd( long newIntgPd ) {
        long oldIntgPd = intgPd;
        intgPd = newIntgPd;
        boolean oldIntgPdESet = intgPdESet;
        intgPdESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LOG_PARAMETERS__INTG_PD, oldIntgPd,
                    intgPd, !oldIntgPdESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIntgPd() {
        long oldIntgPd = intgPd;
        boolean oldIntgPdESet = intgPdESet;
        intgPd = INTG_PD_EDEFAULT;
        intgPdESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.LOG_PARAMETERS__INTG_PD, oldIntgPd,
                    INTG_PD_EDEFAULT, oldIntgPdESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIntgPd() {
        return intgPdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isLogEna() {
        return logEna;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLogEna( boolean newLogEna ) {
        boolean oldLogEna = logEna;
        logEna = newLogEna;
        boolean oldLogEnaESet = logEnaESet;
        logEnaESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LOG_PARAMETERS__LOG_ENA, oldLogEna,
                    logEna, !oldLogEnaESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLogEna() {
        boolean oldLogEna = logEna;
        boolean oldLogEnaESet = logEnaESet;
        logEna = LOG_ENA_EDEFAULT;
        logEnaESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.LOG_PARAMETERS__LOG_ENA, oldLogEna,
                    LOG_ENA_EDEFAULT, oldLogEnaESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLogEna() {
        return logEnaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLogLdInst() {
        return logLdInst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLogLdInst( String newLogLdInst ) {
        String oldLogLdInst = logLdInst;
        logLdInst = newLogLdInst;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LOG_PARAMETERS__LOG_LD_INST,
                    oldLogLdInst, logLdInst ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLogLnClass() {
        return logLnClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLogLnClass( String newLogLnClass ) {
        String oldLogLnClass = logLnClass;
        logLnClass = newLogLnClass;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LOG_PARAMETERS__LOG_LN_CLASS,
                    oldLogLnClass, logLnClass ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLogLnInst() {
        return logLnInst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLogLnInst( String newLogLnInst ) {
        String oldLogLnInst = logLnInst;
        logLnInst = newLogLnInst;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LOG_PARAMETERS__LOG_LN_INST,
                    oldLogLnInst, logLnInst ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLogName() {
        return logName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLogName( String newLogName ) {
        String oldLogName = logName;
        logName = newLogName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LOG_PARAMETERS__LOG_NAME, oldLogName,
                    logName ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLogPrefix() {
        return logPrefix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLogPrefix( String newLogPrefix ) {
        String oldLogPrefix = logPrefix;
        logPrefix = newLogPrefix;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LOG_PARAMETERS__LOG_PREFIX, oldLogPrefix,
                    logPrefix ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isReasonCode() {
        return reasonCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReasonCode( boolean newReasonCode ) {
        boolean oldReasonCode = reasonCode;
        reasonCode = newReasonCode;
        boolean oldReasonCodeESet = reasonCodeESet;
        reasonCodeESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LOG_PARAMETERS__REASON_CODE,
                    oldReasonCode, reasonCode, !oldReasonCodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReasonCode() {
        boolean oldReasonCode = reasonCode;
        boolean oldReasonCodeESet = reasonCodeESet;
        reasonCode = REASON_CODE_EDEFAULT;
        reasonCodeESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.LOG_PARAMETERS__REASON_CODE,
                    oldReasonCode, REASON_CODE_EDEFAULT, oldReasonCodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReasonCode() {
        return reasonCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceSpecifications getParentServiceSpecifications() {
        if( eContainerFeatureID() != AsdPackage.LOG_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS ) {
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
                AsdPackage.LOG_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.LOG_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS
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
                        AsdPackage.SERVICE_SPECIFICATIONS__LOG_PARAMETERS, ServiceSpecifications.class, msgs );
            }
            msgs = basicSetParentServiceSpecifications( newParentServiceSpecifications, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.LOG_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS, newParentServiceSpecifications,
                    newParentServiceSpecifications ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LogParametersRef > getReferredByLogParametersRef() {
        if( referredByLogParametersRef == null ) {
            referredByLogParametersRef = new EObjectWithInverseResolvingEList.Unsettable< >(
                    LogParametersRef.class, this, AsdPackage.LOG_PARAMETERS__REFERRED_BY_LOG_PARAMETERS_REF,
                    AsdPackage.LOG_PARAMETERS_REF__REFERS_TO_LOG_PARAMETERS );
        }
        return referredByLogParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByLogParametersRef() {
        if( referredByLogParametersRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByLogParametersRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByLogParametersRef() {
        return referredByLogParametersRef != null
                && ( ( InternalEList.Unsettable< ? > ) referredByLogParametersRef ).isSet();
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
        case AsdPackage.LOG_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentServiceSpecifications( ( ServiceSpecifications ) otherEnd, msgs );
        case AsdPackage.LOG_PARAMETERS__REFERRED_BY_LOG_PARAMETERS_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByLogParametersRef() )
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
        case AsdPackage.LOG_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return basicSetParentServiceSpecifications( null, msgs );
        case AsdPackage.LOG_PARAMETERS__REFERRED_BY_LOG_PARAMETERS_REF:
            return ( ( InternalEList< ? > ) getReferredByLogParametersRef() ).basicRemove( otherEnd, msgs );
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
        case AsdPackage.LOG_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SERVICE_SPECIFICATIONS__LOG_PARAMETERS,
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
        case AsdPackage.LOG_PARAMETERS__INTG_PD:
            return getIntgPd();
        case AsdPackage.LOG_PARAMETERS__LOG_ENA:
            return isLogEna();
        case AsdPackage.LOG_PARAMETERS__LOG_LD_INST:
            return getLogLdInst();
        case AsdPackage.LOG_PARAMETERS__LOG_LN_CLASS:
            return getLogLnClass();
        case AsdPackage.LOG_PARAMETERS__LOG_LN_INST:
            return getLogLnInst();
        case AsdPackage.LOG_PARAMETERS__LOG_NAME:
            return getLogName();
        case AsdPackage.LOG_PARAMETERS__LOG_PREFIX:
            return getLogPrefix();
        case AsdPackage.LOG_PARAMETERS__REASON_CODE:
            return isReasonCode();
        case AsdPackage.LOG_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return getParentServiceSpecifications();
        case AsdPackage.LOG_PARAMETERS__REFERRED_BY_LOG_PARAMETERS_REF:
            return getReferredByLogParametersRef();
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
        case AsdPackage.LOG_PARAMETERS__INTG_PD:
            setIntgPd( ( Long ) newValue );
            return;
        case AsdPackage.LOG_PARAMETERS__LOG_ENA:
            setLogEna( ( Boolean ) newValue );
            return;
        case AsdPackage.LOG_PARAMETERS__LOG_LD_INST:
            setLogLdInst( ( String ) newValue );
            return;
        case AsdPackage.LOG_PARAMETERS__LOG_LN_CLASS:
            setLogLnClass( ( String ) newValue );
            return;
        case AsdPackage.LOG_PARAMETERS__LOG_LN_INST:
            setLogLnInst( ( String ) newValue );
            return;
        case AsdPackage.LOG_PARAMETERS__LOG_NAME:
            setLogName( ( String ) newValue );
            return;
        case AsdPackage.LOG_PARAMETERS__LOG_PREFIX:
            setLogPrefix( ( String ) newValue );
            return;
        case AsdPackage.LOG_PARAMETERS__REASON_CODE:
            setReasonCode( ( Boolean ) newValue );
            return;
        case AsdPackage.LOG_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            setParentServiceSpecifications( ( ServiceSpecifications ) newValue );
            return;
        case AsdPackage.LOG_PARAMETERS__REFERRED_BY_LOG_PARAMETERS_REF:
            getReferredByLogParametersRef().clear();
            getReferredByLogParametersRef().addAll( ( Collection< ? extends LogParametersRef > ) newValue );
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
        case AsdPackage.LOG_PARAMETERS__INTG_PD:
            unsetIntgPd();
            return;
        case AsdPackage.LOG_PARAMETERS__LOG_ENA:
            unsetLogEna();
            return;
        case AsdPackage.LOG_PARAMETERS__LOG_LD_INST:
            setLogLdInst( LOG_LD_INST_EDEFAULT );
            return;
        case AsdPackage.LOG_PARAMETERS__LOG_LN_CLASS:
            setLogLnClass( LOG_LN_CLASS_EDEFAULT );
            return;
        case AsdPackage.LOG_PARAMETERS__LOG_LN_INST:
            setLogLnInst( LOG_LN_INST_EDEFAULT );
            return;
        case AsdPackage.LOG_PARAMETERS__LOG_NAME:
            setLogName( LOG_NAME_EDEFAULT );
            return;
        case AsdPackage.LOG_PARAMETERS__LOG_PREFIX:
            setLogPrefix( LOG_PREFIX_EDEFAULT );
            return;
        case AsdPackage.LOG_PARAMETERS__REASON_CODE:
            unsetReasonCode();
            return;
        case AsdPackage.LOG_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            setParentServiceSpecifications( ( ServiceSpecifications ) null );
            return;
        case AsdPackage.LOG_PARAMETERS__REFERRED_BY_LOG_PARAMETERS_REF:
            unsetReferredByLogParametersRef();
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
        case AsdPackage.LOG_PARAMETERS__INTG_PD:
            return isSetIntgPd();
        case AsdPackage.LOG_PARAMETERS__LOG_ENA:
            return isSetLogEna();
        case AsdPackage.LOG_PARAMETERS__LOG_LD_INST:
            return LOG_LD_INST_EDEFAULT == null ? logLdInst != null : !LOG_LD_INST_EDEFAULT.equals( logLdInst );
        case AsdPackage.LOG_PARAMETERS__LOG_LN_CLASS:
            return LOG_LN_CLASS_EDEFAULT == null ? logLnClass != null : !LOG_LN_CLASS_EDEFAULT.equals( logLnClass );
        case AsdPackage.LOG_PARAMETERS__LOG_LN_INST:
            return LOG_LN_INST_EDEFAULT == null ? logLnInst != null : !LOG_LN_INST_EDEFAULT.equals( logLnInst );
        case AsdPackage.LOG_PARAMETERS__LOG_NAME:
            return LOG_NAME_EDEFAULT == null ? logName != null : !LOG_NAME_EDEFAULT.equals( logName );
        case AsdPackage.LOG_PARAMETERS__LOG_PREFIX:
            return LOG_PREFIX_EDEFAULT == null ? logPrefix != null : !LOG_PREFIX_EDEFAULT.equals( logPrefix );
        case AsdPackage.LOG_PARAMETERS__REASON_CODE:
            return isSetReasonCode();
        case AsdPackage.LOG_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return getParentServiceSpecifications() != null;
        case AsdPackage.LOG_PARAMETERS__REFERRED_BY_LOG_PARAMETERS_REF:
            return isSetReferredByLogParametersRef();
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
        result.append( " (intgPd: " );
        if( intgPdESet ) {
            result.append( intgPd );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", logEna: " );
        if( logEnaESet ) {
            result.append( logEna );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", logLdInst: " );
        result.append( logLdInst );
        result.append( ", logLnClass: " );
        result.append( logLnClass );
        result.append( ", logLnInst: " );
        result.append( logLnInst );
        result.append( ", logName: " );
        result.append( logName );
        result.append( ", logPrefix: " );
        result.append( logPrefix );
        result.append( ", reasonCode: " );
        if( reasonCodeESet ) {
            result.append( reasonCode );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //LogParametersImpl
