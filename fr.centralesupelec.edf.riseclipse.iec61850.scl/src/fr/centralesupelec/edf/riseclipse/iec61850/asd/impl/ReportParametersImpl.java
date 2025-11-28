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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ReportParametersImpl#isBuffered <em>Buffered</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ReportParametersImpl#getBufTime <em>Buf Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ReportParametersImpl#getIntgPd <em>Intg Pd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ReportParametersImpl#getParentCommServiceSpecifications <em>Parent Comm Service Specifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ReportParametersImpl#getParentServiceSpecifications <em>Parent Service Specifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ReportParametersImpl#getReferredByReportParametersRef <em>Referred By Report Parameters Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportParametersImpl extends ControlBlockParametersImpl implements ReportParameters {
    /**
     * The default value of the '{@link #isBuffered() <em>Buffered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBuffered()
     * @generated
     * @ordered
     */
    protected static final boolean BUFFERED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isBuffered() <em>Buffered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBuffered()
     * @generated
     * @ordered
     */
    protected boolean buffered = BUFFERED_EDEFAULT;

    /**
     * This is true if the Buffered attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bufferedESet;

    /**
     * The default value of the '{@link #getBufTime() <em>Buf Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufTime()
     * @generated
     * @ordered
     */
    protected static final long BUF_TIME_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getBufTime() <em>Buf Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufTime()
     * @generated
     * @ordered
     */
    protected long bufTime = BUF_TIME_EDEFAULT;

    /**
     * This is true if the Buf Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bufTimeESet;

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
     * The cached value of the '{@link #getReferredByReportParametersRef() <em>Referred By Report Parameters Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByReportParametersRef()
     * @generated
     * @ordered
     */
    protected EList< ReportParametersRef > referredByReportParametersRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReportParametersImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getReportParameters();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isBuffered() {
        return buffered;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBuffered( boolean newBuffered ) {
        boolean oldBuffered = buffered;
        buffered = newBuffered;
        boolean oldBufferedESet = bufferedESet;
        bufferedESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.REPORT_PARAMETERS__BUFFERED, oldBuffered,
                    buffered, !oldBufferedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBuffered() {
        boolean oldBuffered = buffered;
        boolean oldBufferedESet = bufferedESet;
        buffered = BUFFERED_EDEFAULT;
        bufferedESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.REPORT_PARAMETERS__BUFFERED,
                    oldBuffered, BUFFERED_EDEFAULT, oldBufferedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBuffered() {
        return bufferedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getBufTime() {
        return bufTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBufTime( long newBufTime ) {
        long oldBufTime = bufTime;
        bufTime = newBufTime;
        boolean oldBufTimeESet = bufTimeESet;
        bufTimeESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.REPORT_PARAMETERS__BUF_TIME, oldBufTime,
                    bufTime, !oldBufTimeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBufTime() {
        long oldBufTime = bufTime;
        boolean oldBufTimeESet = bufTimeESet;
        bufTime = BUF_TIME_EDEFAULT;
        bufTimeESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.REPORT_PARAMETERS__BUF_TIME,
                    oldBufTime, BUF_TIME_EDEFAULT, oldBufTimeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBufTime() {
        return bufTimeESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.REPORT_PARAMETERS__INTG_PD, oldIntgPd,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.REPORT_PARAMETERS__INTG_PD, oldIntgPd,
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
    public CommServiceSpecifications getParentCommServiceSpecifications() {
        if( eContainerFeatureID() != AsdPackage.REPORT_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS ) {
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
                AsdPackage.REPORT_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.REPORT_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS
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
                        AsdPackage.COMM_SERVICE_SPECIFICATIONS__REPORT_PARAMETERS, CommServiceSpecifications.class,
                        msgs );
            }
            msgs = basicSetParentCommServiceSpecifications( newParentCommServiceSpecifications, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.REPORT_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS,
                    newParentCommServiceSpecifications, newParentCommServiceSpecifications ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceSpecifications getParentServiceSpecifications() {
        if( eContainerFeatureID() != AsdPackage.REPORT_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS ) {
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
                AsdPackage.REPORT_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.REPORT_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS
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
                        AsdPackage.SERVICE_SPECIFICATIONS__REPORT_PARAMETERS, ServiceSpecifications.class, msgs );
            }
            msgs = basicSetParentServiceSpecifications( newParentServiceSpecifications, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.REPORT_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS, newParentServiceSpecifications,
                    newParentServiceSpecifications ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ReportParametersRef > getReferredByReportParametersRef() {
        if( referredByReportParametersRef == null ) {
            referredByReportParametersRef = new EObjectWithInverseResolvingEList.Unsettable< >(
                    ReportParametersRef.class, this, AsdPackage.REPORT_PARAMETERS__REFERRED_BY_REPORT_PARAMETERS_REF,
                    AsdPackage.REPORT_PARAMETERS_REF__REFERS_TO_REPORT_PARAMETERS );
        }
        return referredByReportParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByReportParametersRef() {
        if( referredByReportParametersRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByReportParametersRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByReportParametersRef() {
        return referredByReportParametersRef != null
                && ( ( InternalEList.Unsettable< ? > ) referredByReportParametersRef ).isSet();
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
        case AsdPackage.REPORT_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentCommServiceSpecifications( ( CommServiceSpecifications ) otherEnd, msgs );
        case AsdPackage.REPORT_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentServiceSpecifications( ( ServiceSpecifications ) otherEnd, msgs );
        case AsdPackage.REPORT_PARAMETERS__REFERRED_BY_REPORT_PARAMETERS_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByReportParametersRef() )
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
        case AsdPackage.REPORT_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            return basicSetParentCommServiceSpecifications( null, msgs );
        case AsdPackage.REPORT_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return basicSetParentServiceSpecifications( null, msgs );
        case AsdPackage.REPORT_PARAMETERS__REFERRED_BY_REPORT_PARAMETERS_REF:
            return ( ( InternalEList< ? > ) getReferredByReportParametersRef() ).basicRemove( otherEnd, msgs );
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
        case AsdPackage.REPORT_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.COMM_SERVICE_SPECIFICATIONS__REPORT_PARAMETERS,
                    CommServiceSpecifications.class, msgs );
        case AsdPackage.REPORT_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SERVICE_SPECIFICATIONS__REPORT_PARAMETERS,
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
        case AsdPackage.REPORT_PARAMETERS__BUFFERED:
            return isBuffered();
        case AsdPackage.REPORT_PARAMETERS__BUF_TIME:
            return getBufTime();
        case AsdPackage.REPORT_PARAMETERS__INTG_PD:
            return getIntgPd();
        case AsdPackage.REPORT_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            return getParentCommServiceSpecifications();
        case AsdPackage.REPORT_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return getParentServiceSpecifications();
        case AsdPackage.REPORT_PARAMETERS__REFERRED_BY_REPORT_PARAMETERS_REF:
            return getReferredByReportParametersRef();
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
        case AsdPackage.REPORT_PARAMETERS__BUFFERED:
            setBuffered( ( Boolean ) newValue );
            return;
        case AsdPackage.REPORT_PARAMETERS__BUF_TIME:
            setBufTime( ( Long ) newValue );
            return;
        case AsdPackage.REPORT_PARAMETERS__INTG_PD:
            setIntgPd( ( Long ) newValue );
            return;
        case AsdPackage.REPORT_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            setParentCommServiceSpecifications( ( CommServiceSpecifications ) newValue );
            return;
        case AsdPackage.REPORT_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            setParentServiceSpecifications( ( ServiceSpecifications ) newValue );
            return;
        case AsdPackage.REPORT_PARAMETERS__REFERRED_BY_REPORT_PARAMETERS_REF:
            getReferredByReportParametersRef().clear();
            getReferredByReportParametersRef().addAll( ( Collection< ? extends ReportParametersRef > ) newValue );
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
        case AsdPackage.REPORT_PARAMETERS__BUFFERED:
            unsetBuffered();
            return;
        case AsdPackage.REPORT_PARAMETERS__BUF_TIME:
            unsetBufTime();
            return;
        case AsdPackage.REPORT_PARAMETERS__INTG_PD:
            unsetIntgPd();
            return;
        case AsdPackage.REPORT_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            setParentCommServiceSpecifications( ( CommServiceSpecifications ) null );
            return;
        case AsdPackage.REPORT_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            setParentServiceSpecifications( ( ServiceSpecifications ) null );
            return;
        case AsdPackage.REPORT_PARAMETERS__REFERRED_BY_REPORT_PARAMETERS_REF:
            unsetReferredByReportParametersRef();
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
        case AsdPackage.REPORT_PARAMETERS__BUFFERED:
            return isSetBuffered();
        case AsdPackage.REPORT_PARAMETERS__BUF_TIME:
            return isSetBufTime();
        case AsdPackage.REPORT_PARAMETERS__INTG_PD:
            return isSetIntgPd();
        case AsdPackage.REPORT_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS:
            return getParentCommServiceSpecifications() != null;
        case AsdPackage.REPORT_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return getParentServiceSpecifications() != null;
        case AsdPackage.REPORT_PARAMETERS__REFERRED_BY_REPORT_PARAMETERS_REF:
            return isSetReferredByReportParametersRef();
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
        result.append( " (buffered: " );
        if( bufferedESet ) {
            result.append( buffered );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", bufTime: " );
        if( bufTimeESet ) {
            result.append( bufTime );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", intgPd: " );
        if( intgPdESet ) {
            result.append( intgPd );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //ReportParametersImpl
