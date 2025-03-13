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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opt Fields</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.OptFieldsImpl#getBufOvfl <em>Buf Ovfl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.OptFieldsImpl#getConfigRef <em>Config Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.OptFieldsImpl#getDataRef <em>Data Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.OptFieldsImpl#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.OptFieldsImpl#getEntryID <em>Entry ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.OptFieldsImpl#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.OptFieldsImpl#getSeqNum <em>Seq Num</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.OptFieldsImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.OptFieldsImpl#getParentReportControl <em>Parent Report Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptFieldsImpl extends SclObjectImpl implements OptFields {
    /**
     * The default value of the '{@link #getBufOvfl() <em>Buf Ovfl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufOvfl()
     * @generated
     * @ordered
     */
    protected static final Boolean BUF_OVFL_EDEFAULT = Boolean.TRUE;

    /**
     * The cached value of the '{@link #getBufOvfl() <em>Buf Ovfl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufOvfl()
     * @generated
     * @ordered
     */
    protected Boolean bufOvfl = BUF_OVFL_EDEFAULT;

    /**
     * This is true if the Buf Ovfl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bufOvflESet;

    /**
     * The default value of the '{@link #getConfigRef() <em>Config Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigRef()
     * @generated
     * @ordered
     */
    protected static final Boolean CONFIG_REF_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getConfigRef() <em>Config Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigRef()
     * @generated
     * @ordered
     */
    protected Boolean configRef = CONFIG_REF_EDEFAULT;

    /**
     * This is true if the Config Ref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean configRefESet;

    /**
     * The default value of the '{@link #getDataRef() <em>Data Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataRef()
     * @generated
     * @ordered
     */
    protected static final Boolean DATA_REF_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getDataRef() <em>Data Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataRef()
     * @generated
     * @ordered
     */
    protected Boolean dataRef = DATA_REF_EDEFAULT;

    /**
     * This is true if the Data Ref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dataRefESet;

    /**
     * The default value of the '{@link #getDataSet() <em>Data Set</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataSet()
     * @generated
     * @ordered
     */
    protected static final Boolean DATA_SET_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getDataSet() <em>Data Set</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataSet()
     * @generated
     * @ordered
     */
    protected Boolean dataSet = DATA_SET_EDEFAULT;

    /**
     * This is true if the Data Set attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dataSetESet;

    /**
     * The default value of the '{@link #getEntryID() <em>Entry ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntryID()
     * @generated
     * @ordered
     */
    protected static final Boolean ENTRY_ID_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getEntryID() <em>Entry ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntryID()
     * @generated
     * @ordered
     */
    protected Boolean entryID = ENTRY_ID_EDEFAULT;

    /**
     * This is true if the Entry ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean entryIDESet;

    /**
     * The default value of the '{@link #getReasonCode() <em>Reason Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReasonCode()
     * @generated
     * @ordered
     */
    protected static final Boolean REASON_CODE_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getReasonCode() <em>Reason Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReasonCode()
     * @generated
     * @ordered
     */
    protected Boolean reasonCode = REASON_CODE_EDEFAULT;

    /**
     * This is true if the Reason Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reasonCodeESet;

    /**
     * The default value of the '{@link #getSeqNum() <em>Seq Num</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeqNum()
     * @generated
     * @ordered
     */
    protected static final Boolean SEQ_NUM_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getSeqNum() <em>Seq Num</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeqNum()
     * @generated
     * @ordered
     */
    protected Boolean seqNum = SEQ_NUM_EDEFAULT;

    /**
     * This is true if the Seq Num attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean seqNumESet;

    /**
     * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStamp()
     * @generated
     * @ordered
     */
    protected static final Boolean TIME_STAMP_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStamp()
     * @generated
     * @ordered
     */
    protected Boolean timeStamp = TIME_STAMP_EDEFAULT;

    /**
     * This is true if the Time Stamp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeStampESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OptFieldsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getOptFields();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getBufOvfl() {
        return bufOvfl;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBufOvfl( Boolean newBufOvfl ) {
        Boolean oldBufOvfl = bufOvfl;
        bufOvfl = newBufOvfl;
        boolean oldBufOvflESet = bufOvflESet;
        bufOvflESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.OPT_FIELDS__BUF_OVFL, oldBufOvfl,
                    bufOvfl, !oldBufOvflESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBufOvfl() {
        Boolean oldBufOvfl = bufOvfl;
        boolean oldBufOvflESet = bufOvflESet;
        bufOvfl = BUF_OVFL_EDEFAULT;
        bufOvflESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.OPT_FIELDS__BUF_OVFL, oldBufOvfl,
                    BUF_OVFL_EDEFAULT, oldBufOvflESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBufOvfl() {
        return bufOvflESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getConfigRef() {
        return configRef;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConfigRef( Boolean newConfigRef ) {
        Boolean oldConfigRef = configRef;
        configRef = newConfigRef;
        boolean oldConfigRefESet = configRefESet;
        configRefESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.OPT_FIELDS__CONFIG_REF, oldConfigRef,
                    configRef, !oldConfigRefESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConfigRef() {
        Boolean oldConfigRef = configRef;
        boolean oldConfigRefESet = configRefESet;
        configRef = CONFIG_REF_EDEFAULT;
        configRefESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.OPT_FIELDS__CONFIG_REF, oldConfigRef,
                    CONFIG_REF_EDEFAULT, oldConfigRefESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConfigRef() {
        return configRefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getDataRef() {
        return dataRef;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDataRef( Boolean newDataRef ) {
        Boolean oldDataRef = dataRef;
        dataRef = newDataRef;
        boolean oldDataRefESet = dataRefESet;
        dataRefESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.OPT_FIELDS__DATA_REF, oldDataRef,
                    dataRef, !oldDataRefESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDataRef() {
        Boolean oldDataRef = dataRef;
        boolean oldDataRefESet = dataRefESet;
        dataRef = DATA_REF_EDEFAULT;
        dataRefESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.OPT_FIELDS__DATA_REF, oldDataRef,
                    DATA_REF_EDEFAULT, oldDataRefESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDataRef() {
        return dataRefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getDataSet() {
        return dataSet;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDataSet( Boolean newDataSet ) {
        Boolean oldDataSet = dataSet;
        dataSet = newDataSet;
        boolean oldDataSetESet = dataSetESet;
        dataSetESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.OPT_FIELDS__DATA_SET, oldDataSet,
                    dataSet, !oldDataSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDataSet() {
        Boolean oldDataSet = dataSet;
        boolean oldDataSetESet = dataSetESet;
        dataSet = DATA_SET_EDEFAULT;
        dataSetESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.OPT_FIELDS__DATA_SET, oldDataSet,
                    DATA_SET_EDEFAULT, oldDataSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDataSet() {
        return dataSetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getEntryID() {
        return entryID;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEntryID( Boolean newEntryID ) {
        Boolean oldEntryID = entryID;
        entryID = newEntryID;
        boolean oldEntryIDESet = entryIDESet;
        entryIDESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.OPT_FIELDS__ENTRY_ID, oldEntryID,
                    entryID, !oldEntryIDESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEntryID() {
        Boolean oldEntryID = entryID;
        boolean oldEntryIDESet = entryIDESet;
        entryID = ENTRY_ID_EDEFAULT;
        entryIDESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.OPT_FIELDS__ENTRY_ID, oldEntryID,
                    ENTRY_ID_EDEFAULT, oldEntryIDESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEntryID() {
        return entryIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getReasonCode() {
        return reasonCode;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReasonCode( Boolean newReasonCode ) {
        Boolean oldReasonCode = reasonCode;
        reasonCode = newReasonCode;
        boolean oldReasonCodeESet = reasonCodeESet;
        reasonCodeESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.OPT_FIELDS__REASON_CODE, oldReasonCode,
                    reasonCode, !oldReasonCodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReasonCode() {
        Boolean oldReasonCode = reasonCode;
        boolean oldReasonCodeESet = reasonCodeESet;
        reasonCode = REASON_CODE_EDEFAULT;
        reasonCodeESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.OPT_FIELDS__REASON_CODE, oldReasonCode,
                    REASON_CODE_EDEFAULT, oldReasonCodeESet ) );
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
    public Boolean getSeqNum() {
        return seqNum;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSeqNum( Boolean newSeqNum ) {
        Boolean oldSeqNum = seqNum;
        seqNum = newSeqNum;
        boolean oldSeqNumESet = seqNumESet;
        seqNumESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.OPT_FIELDS__SEQ_NUM, oldSeqNum, seqNum,
                    !oldSeqNumESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSeqNum() {
        Boolean oldSeqNum = seqNum;
        boolean oldSeqNumESet = seqNumESet;
        seqNum = SEQ_NUM_EDEFAULT;
        seqNumESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.OPT_FIELDS__SEQ_NUM, oldSeqNum,
                    SEQ_NUM_EDEFAULT, oldSeqNumESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSeqNum() {
        return seqNumESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getTimeStamp() {
        return timeStamp;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTimeStamp( Boolean newTimeStamp ) {
        Boolean oldTimeStamp = timeStamp;
        timeStamp = newTimeStamp;
        boolean oldTimeStampESet = timeStampESet;
        timeStampESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.OPT_FIELDS__TIME_STAMP, oldTimeStamp,
                    timeStamp, !oldTimeStampESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimeStamp() {
        Boolean oldTimeStamp = timeStamp;
        boolean oldTimeStampESet = timeStampESet;
        timeStamp = TIME_STAMP_EDEFAULT;
        timeStampESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.OPT_FIELDS__TIME_STAMP, oldTimeStamp,
                    TIME_STAMP_EDEFAULT, oldTimeStampESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimeStamp() {
        return timeStampESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReportControl getParentReportControl() {
        if( eContainerFeatureID() != SclPackage.OPT_FIELDS__PARENT_REPORT_CONTROL ) {
            return null;
        }
        return ( ReportControl ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentReportControl( ReportControl newParentReportControl,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentReportControl,
                SclPackage.OPT_FIELDS__PARENT_REPORT_CONTROL, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentReportControl( ReportControl newParentReportControl ) {
        if( newParentReportControl != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.OPT_FIELDS__PARENT_REPORT_CONTROL
                        && newParentReportControl != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentReportControl ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentReportControl != null ) {
                msgs = ( ( InternalEObject ) newParentReportControl ).eInverseAdd( this,
                        SclPackage.REPORT_CONTROL__OPT_FIELDS, ReportControl.class, msgs );
            }
            msgs = basicSetParentReportControl( newParentReportControl, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.OPT_FIELDS__PARENT_REPORT_CONTROL,
                    newParentReportControl, newParentReportControl ) );
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
        case SclPackage.OPT_FIELDS__PARENT_REPORT_CONTROL:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentReportControl( ( ReportControl ) otherEnd, msgs );
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
        case SclPackage.OPT_FIELDS__PARENT_REPORT_CONTROL:
            return basicSetParentReportControl( null, msgs );
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
        case SclPackage.OPT_FIELDS__PARENT_REPORT_CONTROL:
            return eInternalContainer().eInverseRemove( this, SclPackage.REPORT_CONTROL__OPT_FIELDS,
                    ReportControl.class, msgs );
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
        case SclPackage.OPT_FIELDS__BUF_OVFL:
            return getBufOvfl();
        case SclPackage.OPT_FIELDS__CONFIG_REF:
            return getConfigRef();
        case SclPackage.OPT_FIELDS__DATA_REF:
            return getDataRef();
        case SclPackage.OPT_FIELDS__DATA_SET:
            return getDataSet();
        case SclPackage.OPT_FIELDS__ENTRY_ID:
            return getEntryID();
        case SclPackage.OPT_FIELDS__REASON_CODE:
            return getReasonCode();
        case SclPackage.OPT_FIELDS__SEQ_NUM:
            return getSeqNum();
        case SclPackage.OPT_FIELDS__TIME_STAMP:
            return getTimeStamp();
        case SclPackage.OPT_FIELDS__PARENT_REPORT_CONTROL:
            return getParentReportControl();
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
        case SclPackage.OPT_FIELDS__BUF_OVFL:
            setBufOvfl( ( Boolean ) newValue );
            return;
        case SclPackage.OPT_FIELDS__CONFIG_REF:
            setConfigRef( ( Boolean ) newValue );
            return;
        case SclPackage.OPT_FIELDS__DATA_REF:
            setDataRef( ( Boolean ) newValue );
            return;
        case SclPackage.OPT_FIELDS__DATA_SET:
            setDataSet( ( Boolean ) newValue );
            return;
        case SclPackage.OPT_FIELDS__ENTRY_ID:
            setEntryID( ( Boolean ) newValue );
            return;
        case SclPackage.OPT_FIELDS__REASON_CODE:
            setReasonCode( ( Boolean ) newValue );
            return;
        case SclPackage.OPT_FIELDS__SEQ_NUM:
            setSeqNum( ( Boolean ) newValue );
            return;
        case SclPackage.OPT_FIELDS__TIME_STAMP:
            setTimeStamp( ( Boolean ) newValue );
            return;
        case SclPackage.OPT_FIELDS__PARENT_REPORT_CONTROL:
            setParentReportControl( ( ReportControl ) newValue );
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
        case SclPackage.OPT_FIELDS__BUF_OVFL:
            unsetBufOvfl();
            return;
        case SclPackage.OPT_FIELDS__CONFIG_REF:
            unsetConfigRef();
            return;
        case SclPackage.OPT_FIELDS__DATA_REF:
            unsetDataRef();
            return;
        case SclPackage.OPT_FIELDS__DATA_SET:
            unsetDataSet();
            return;
        case SclPackage.OPT_FIELDS__ENTRY_ID:
            unsetEntryID();
            return;
        case SclPackage.OPT_FIELDS__REASON_CODE:
            unsetReasonCode();
            return;
        case SclPackage.OPT_FIELDS__SEQ_NUM:
            unsetSeqNum();
            return;
        case SclPackage.OPT_FIELDS__TIME_STAMP:
            unsetTimeStamp();
            return;
        case SclPackage.OPT_FIELDS__PARENT_REPORT_CONTROL:
            setParentReportControl( ( ReportControl ) null );
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
        case SclPackage.OPT_FIELDS__BUF_OVFL:
            return isSetBufOvfl();
        case SclPackage.OPT_FIELDS__CONFIG_REF:
            return isSetConfigRef();
        case SclPackage.OPT_FIELDS__DATA_REF:
            return isSetDataRef();
        case SclPackage.OPT_FIELDS__DATA_SET:
            return isSetDataSet();
        case SclPackage.OPT_FIELDS__ENTRY_ID:
            return isSetEntryID();
        case SclPackage.OPT_FIELDS__REASON_CODE:
            return isSetReasonCode();
        case SclPackage.OPT_FIELDS__SEQ_NUM:
            return isSetSeqNum();
        case SclPackage.OPT_FIELDS__TIME_STAMP:
            return isSetTimeStamp();
        case SclPackage.OPT_FIELDS__PARENT_REPORT_CONTROL:
            return getParentReportControl() != null;
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID( int derivedFeatureID, Class< ? > baseClass ) {
        if( baseClass == AgOptFields.class ) {
            switch( derivedFeatureID ) {
            case SclPackage.OPT_FIELDS__BUF_OVFL:
                return SclPackage.AG_OPT_FIELDS__BUF_OVFL;
            case SclPackage.OPT_FIELDS__CONFIG_REF:
                return SclPackage.AG_OPT_FIELDS__CONFIG_REF;
            case SclPackage.OPT_FIELDS__DATA_REF:
                return SclPackage.AG_OPT_FIELDS__DATA_REF;
            case SclPackage.OPT_FIELDS__DATA_SET:
                return SclPackage.AG_OPT_FIELDS__DATA_SET;
            case SclPackage.OPT_FIELDS__ENTRY_ID:
                return SclPackage.AG_OPT_FIELDS__ENTRY_ID;
            case SclPackage.OPT_FIELDS__REASON_CODE:
                return SclPackage.AG_OPT_FIELDS__REASON_CODE;
            case SclPackage.OPT_FIELDS__SEQ_NUM:
                return SclPackage.AG_OPT_FIELDS__SEQ_NUM;
            case SclPackage.OPT_FIELDS__TIME_STAMP:
                return SclPackage.AG_OPT_FIELDS__TIME_STAMP;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID( derivedFeatureID, baseClass );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID( int baseFeatureID, Class< ? > baseClass ) {
        if( baseClass == AgOptFields.class ) {
            switch( baseFeatureID ) {
            case SclPackage.AG_OPT_FIELDS__BUF_OVFL:
                return SclPackage.OPT_FIELDS__BUF_OVFL;
            case SclPackage.AG_OPT_FIELDS__CONFIG_REF:
                return SclPackage.OPT_FIELDS__CONFIG_REF;
            case SclPackage.AG_OPT_FIELDS__DATA_REF:
                return SclPackage.OPT_FIELDS__DATA_REF;
            case SclPackage.AG_OPT_FIELDS__DATA_SET:
                return SclPackage.OPT_FIELDS__DATA_SET;
            case SclPackage.AG_OPT_FIELDS__ENTRY_ID:
                return SclPackage.OPT_FIELDS__ENTRY_ID;
            case SclPackage.AG_OPT_FIELDS__REASON_CODE:
                return SclPackage.OPT_FIELDS__REASON_CODE;
            case SclPackage.AG_OPT_FIELDS__SEQ_NUM:
                return SclPackage.OPT_FIELDS__SEQ_NUM;
            case SclPackage.AG_OPT_FIELDS__TIME_STAMP:
                return SclPackage.OPT_FIELDS__TIME_STAMP;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
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
        result.append( " (bufOvfl: " );
        if( bufOvflESet ) {
            result.append( bufOvfl );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", configRef: " );
        if( configRefESet ) {
            result.append( configRef );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", dataRef: " );
        if( dataRefESet ) {
            result.append( dataRef );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", dataSet: " );
        if( dataSetESet ) {
            result.append( dataSet );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", entryID: " );
        if( entryIDESet ) {
            result.append( entryID );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", reasonCode: " );
        if( reasonCodeESet ) {
            result.append( reasonCode );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", seqNum: " );
        if( seqNumESet ) {
            result.append( seqNum );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", timeStamp: " );
        if( timeStampESet ) {
            result.append( timeStamp );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    @Override
    public String getXpath() {
        return getParentReportControl().getXpath() + "/scl:OptFields";
    }

} //OptFieldsImpl
