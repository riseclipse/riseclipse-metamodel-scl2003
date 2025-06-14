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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl#getBufReport <em>Buf Report</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl#getGoose <em>Goose</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl#getGsse <em>Gsse</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl#getMaxAttributes <em>Max Attributes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl#getMaxGOOSE <em>Max GOOSE</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl#getMaxReports <em>Max Reports</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl#getMaxSMV <em>Max SMV</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl#getReadLog <em>Read Log</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl#getSupportsLdName <em>Supports Ld Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl#getSv <em>Sv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl#getUnbufReport <em>Unbuf Report</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl#getParentServices <em>Parent Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl#getTimeSyncProt <em>Time Sync Prot</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl#getRGOOSE <em>RGOOSE</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl#getRSV <em>RSV</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl#getNoIctBinding <em>No Ict Binding</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl#getMcSecurity <em>Mc Security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientServicesImpl extends SclObjectImpl implements ClientServices {
    /**
     * The default value of the '{@link #getBufReport() <em>Buf Report</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufReport()
     * @generated
     * @ordered
     */
    protected static final Boolean BUF_REPORT_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getBufReport() <em>Buf Report</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufReport()
     * @generated
     * @ordered
     */
    protected Boolean bufReport = BUF_REPORT_EDEFAULT;

    /**
     * This is true if the Buf Report attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bufReportESet;

    /**
     * The default value of the '{@link #getGoose() <em>Goose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGoose()
     * @generated
     * @ordered
     */
    protected static final Boolean GOOSE_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getGoose() <em>Goose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGoose()
     * @generated
     * @ordered
     */
    protected Boolean goose = GOOSE_EDEFAULT;

    /**
     * This is true if the Goose attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gooseESet;

    /**
     * The default value of the '{@link #getGsse() <em>Gsse</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGsse()
     * @generated
     * @ordered
     */
    protected static final Boolean GSSE_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getGsse() <em>Gsse</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGsse()
     * @generated
     * @ordered
     */
    protected Boolean gsse = GSSE_EDEFAULT;

    /**
     * This is true if the Gsse attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gsseESet;

    /**
     * The default value of the '{@link #getMaxAttributes() <em>Max Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxAttributes()
     * @generated
     * @ordered
     */
    protected static final Integer MAX_ATTRIBUTES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxAttributes() <em>Max Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxAttributes()
     * @generated
     * @ordered
     */
    protected Integer maxAttributes = MAX_ATTRIBUTES_EDEFAULT;

    /**
     * This is true if the Max Attributes attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxAttributesESet;

    /**
     * The default value of the '{@link #getMaxGOOSE() <em>Max GOOSE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxGOOSE()
     * @generated
     * @ordered
     */
    protected static final Integer MAX_GOOSE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxGOOSE() <em>Max GOOSE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxGOOSE()
     * @generated
     * @ordered
     */
    protected Integer maxGOOSE = MAX_GOOSE_EDEFAULT;

    /**
     * This is true if the Max GOOSE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxGOOSEESet;

    /**
     * The default value of the '{@link #getMaxReports() <em>Max Reports</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxReports()
     * @generated
     * @ordered
     */
    protected static final Integer MAX_REPORTS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxReports() <em>Max Reports</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxReports()
     * @generated
     * @ordered
     */
    protected Integer maxReports = MAX_REPORTS_EDEFAULT;

    /**
     * This is true if the Max Reports attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxReportsESet;

    /**
     * The default value of the '{@link #getMaxSMV() <em>Max SMV</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxSMV()
     * @generated
     * @ordered
     */
    protected static final Integer MAX_SMV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxSMV() <em>Max SMV</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxSMV()
     * @generated
     * @ordered
     */
    protected Integer maxSMV = MAX_SMV_EDEFAULT;

    /**
     * This is true if the Max SMV attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxSMVESet;

    /**
     * The default value of the '{@link #getReadLog() <em>Read Log</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadLog()
     * @generated
     * @ordered
     */
    protected static final Boolean READ_LOG_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getReadLog() <em>Read Log</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadLog()
     * @generated
     * @ordered
     */
    protected Boolean readLog = READ_LOG_EDEFAULT;

    /**
     * This is true if the Read Log attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean readLogESet;

    /**
     * The default value of the '{@link #getSupportsLdName() <em>Supports Ld Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportsLdName()
     * @generated
     * @ordered
     */
    protected static final Boolean SUPPORTS_LD_NAME_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getSupportsLdName() <em>Supports Ld Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportsLdName()
     * @generated
     * @ordered
     */
    protected Boolean supportsLdName = SUPPORTS_LD_NAME_EDEFAULT;

    /**
     * This is true if the Supports Ld Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean supportsLdNameESet;

    /**
     * The default value of the '{@link #getSv() <em>Sv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSv()
     * @generated
     * @ordered
     */
    protected static final Boolean SV_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getSv() <em>Sv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSv()
     * @generated
     * @ordered
     */
    protected Boolean sv = SV_EDEFAULT;

    /**
     * This is true if the Sv attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean svESet;

    /**
     * The default value of the '{@link #getUnbufReport() <em>Unbuf Report</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnbufReport()
     * @generated
     * @ordered
     */
    protected static final Boolean UNBUF_REPORT_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getUnbufReport() <em>Unbuf Report</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnbufReport()
     * @generated
     * @ordered
     */
    protected Boolean unbufReport = UNBUF_REPORT_EDEFAULT;

    /**
     * This is true if the Unbuf Report attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean unbufReportESet;

    /**
     * The cached value of the '{@link #getTimeSyncProt() <em>Time Sync Prot</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeSyncProt()
     * @generated
     * @ordered
     */
    protected TimeSyncProt timeSyncProt;

    /**
     * This is true if the Time Sync Prot containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeSyncProtESet;

    /**
     * The default value of the '{@link #getRGOOSE() <em>RGOOSE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRGOOSE()
     * @generated
     * @ordered
     */
    protected static final Boolean RGOOSE_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getRGOOSE() <em>RGOOSE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRGOOSE()
     * @generated
     * @ordered
     */
    protected Boolean rGOOSE = RGOOSE_EDEFAULT;

    /**
     * This is true if the RGOOSE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rGOOSEESet;

    /**
     * The default value of the '{@link #getRSV() <em>RSV</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRSV()
     * @generated
     * @ordered
     */
    protected static final Boolean RSV_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getRSV() <em>RSV</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRSV()
     * @generated
     * @ordered
     */
    protected Boolean rSV = RSV_EDEFAULT;

    /**
     * This is true if the RSV attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rSVESet;

    /**
     * The default value of the '{@link #getNoIctBinding() <em>No Ict Binding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNoIctBinding()
     * @generated
     * @ordered
     */
    protected static final Boolean NO_ICT_BINDING_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getNoIctBinding() <em>No Ict Binding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNoIctBinding()
     * @generated
     * @ordered
     */
    protected Boolean noIctBinding = NO_ICT_BINDING_EDEFAULT;

    /**
     * This is true if the No Ict Binding attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean noIctBindingESet;

    /**
     * The cached value of the '{@link #getMcSecurity() <em>Mc Security</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMcSecurity()
     * @generated
     * @ordered
     */
    protected McSecurity mcSecurity;

    /**
     * This is true if the Mc Security containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mcSecurityESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClientServicesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getClientServices();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getBufReport() {
        return bufReport;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBufReport( Boolean newBufReport ) {
        Boolean oldBufReport = bufReport;
        bufReport = newBufReport;
        boolean oldBufReportESet = bufReportESet;
        bufReportESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CLIENT_SERVICES__BUF_REPORT,
                    oldBufReport, bufReport, !oldBufReportESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBufReport() {
        Boolean oldBufReport = bufReport;
        boolean oldBufReportESet = bufReportESet;
        bufReport = BUF_REPORT_EDEFAULT;
        bufReportESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CLIENT_SERVICES__BUF_REPORT,
                    oldBufReport, BUF_REPORT_EDEFAULT, oldBufReportESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBufReport() {
        return bufReportESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getGoose() {
        return goose;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGoose( Boolean newGoose ) {
        Boolean oldGoose = goose;
        goose = newGoose;
        boolean oldGooseESet = gooseESet;
        gooseESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CLIENT_SERVICES__GOOSE, oldGoose, goose,
                    !oldGooseESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGoose() {
        Boolean oldGoose = goose;
        boolean oldGooseESet = gooseESet;
        goose = GOOSE_EDEFAULT;
        gooseESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CLIENT_SERVICES__GOOSE, oldGoose,
                    GOOSE_EDEFAULT, oldGooseESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGoose() {
        return gooseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getGsse() {
        return gsse;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGsse( Boolean newGsse ) {
        Boolean oldGsse = gsse;
        gsse = newGsse;
        boolean oldGsseESet = gsseESet;
        gsseESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CLIENT_SERVICES__GSSE, oldGsse, gsse,
                    !oldGsseESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGsse() {
        Boolean oldGsse = gsse;
        boolean oldGsseESet = gsseESet;
        gsse = GSSE_EDEFAULT;
        gsseESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CLIENT_SERVICES__GSSE, oldGsse,
                    GSSE_EDEFAULT, oldGsseESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGsse() {
        return gsseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getMaxAttributes() {
        return maxAttributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxAttributes( Integer newMaxAttributes ) {
        Integer oldMaxAttributes = maxAttributes;
        maxAttributes = newMaxAttributes;
        boolean oldMaxAttributesESet = maxAttributesESet;
        maxAttributesESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CLIENT_SERVICES__MAX_ATTRIBUTES,
                    oldMaxAttributes, maxAttributes, !oldMaxAttributesESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxAttributes() {
        Integer oldMaxAttributes = maxAttributes;
        boolean oldMaxAttributesESet = maxAttributesESet;
        maxAttributes = MAX_ATTRIBUTES_EDEFAULT;
        maxAttributesESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CLIENT_SERVICES__MAX_ATTRIBUTES,
                    oldMaxAttributes, MAX_ATTRIBUTES_EDEFAULT, oldMaxAttributesESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxAttributes() {
        return maxAttributesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getMaxGOOSE() {
        return maxGOOSE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxGOOSE( Integer newMaxGOOSE ) {
        Integer oldMaxGOOSE = maxGOOSE;
        maxGOOSE = newMaxGOOSE;
        boolean oldMaxGOOSEESet = maxGOOSEESet;
        maxGOOSEESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CLIENT_SERVICES__MAX_GOOSE, oldMaxGOOSE,
                    maxGOOSE, !oldMaxGOOSEESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxGOOSE() {
        Integer oldMaxGOOSE = maxGOOSE;
        boolean oldMaxGOOSEESet = maxGOOSEESet;
        maxGOOSE = MAX_GOOSE_EDEFAULT;
        maxGOOSEESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CLIENT_SERVICES__MAX_GOOSE,
                    oldMaxGOOSE, MAX_GOOSE_EDEFAULT, oldMaxGOOSEESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxGOOSE() {
        return maxGOOSEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getMaxReports() {
        return maxReports;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxReports( Integer newMaxReports ) {
        Integer oldMaxReports = maxReports;
        maxReports = newMaxReports;
        boolean oldMaxReportsESet = maxReportsESet;
        maxReportsESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CLIENT_SERVICES__MAX_REPORTS,
                    oldMaxReports, maxReports, !oldMaxReportsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxReports() {
        Integer oldMaxReports = maxReports;
        boolean oldMaxReportsESet = maxReportsESet;
        maxReports = MAX_REPORTS_EDEFAULT;
        maxReportsESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CLIENT_SERVICES__MAX_REPORTS,
                    oldMaxReports, MAX_REPORTS_EDEFAULT, oldMaxReportsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxReports() {
        return maxReportsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getMaxSMV() {
        return maxSMV;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxSMV( Integer newMaxSMV ) {
        Integer oldMaxSMV = maxSMV;
        maxSMV = newMaxSMV;
        boolean oldMaxSMVESet = maxSMVESet;
        maxSMVESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CLIENT_SERVICES__MAX_SMV, oldMaxSMV,
                    maxSMV, !oldMaxSMVESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxSMV() {
        Integer oldMaxSMV = maxSMV;
        boolean oldMaxSMVESet = maxSMVESet;
        maxSMV = MAX_SMV_EDEFAULT;
        maxSMVESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CLIENT_SERVICES__MAX_SMV, oldMaxSMV,
                    MAX_SMV_EDEFAULT, oldMaxSMVESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxSMV() {
        return maxSMVESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getReadLog() {
        return readLog;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReadLog( Boolean newReadLog ) {
        Boolean oldReadLog = readLog;
        readLog = newReadLog;
        boolean oldReadLogESet = readLogESet;
        readLogESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CLIENT_SERVICES__READ_LOG, oldReadLog,
                    readLog, !oldReadLogESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReadLog() {
        Boolean oldReadLog = readLog;
        boolean oldReadLogESet = readLogESet;
        readLog = READ_LOG_EDEFAULT;
        readLogESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CLIENT_SERVICES__READ_LOG, oldReadLog,
                    READ_LOG_EDEFAULT, oldReadLogESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReadLog() {
        return readLogESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSupportsLdName() {
        return supportsLdName;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSupportsLdName( Boolean newSupportsLdName ) {
        Boolean oldSupportsLdName = supportsLdName;
        supportsLdName = newSupportsLdName;
        boolean oldSupportsLdNameESet = supportsLdNameESet;
        supportsLdNameESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CLIENT_SERVICES__SUPPORTS_LD_NAME,
                    oldSupportsLdName, supportsLdName, !oldSupportsLdNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSupportsLdName() {
        Boolean oldSupportsLdName = supportsLdName;
        boolean oldSupportsLdNameESet = supportsLdNameESet;
        supportsLdName = SUPPORTS_LD_NAME_EDEFAULT;
        supportsLdNameESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CLIENT_SERVICES__SUPPORTS_LD_NAME,
                    oldSupportsLdName, SUPPORTS_LD_NAME_EDEFAULT, oldSupportsLdNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSupportsLdName() {
        return supportsLdNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSv() {
        return sv;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSv( Boolean newSv ) {
        Boolean oldSv = sv;
        sv = newSv;
        boolean oldSvESet = svESet;
        svESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CLIENT_SERVICES__SV, oldSv, sv,
                    !oldSvESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSv() {
        Boolean oldSv = sv;
        boolean oldSvESet = svESet;
        sv = SV_EDEFAULT;
        svESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CLIENT_SERVICES__SV, oldSv,
                    SV_EDEFAULT, oldSvESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSv() {
        return svESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getUnbufReport() {
        return unbufReport;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnbufReport( Boolean newUnbufReport ) {
        Boolean oldUnbufReport = unbufReport;
        unbufReport = newUnbufReport;
        boolean oldUnbufReportESet = unbufReportESet;
        unbufReportESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CLIENT_SERVICES__UNBUF_REPORT,
                    oldUnbufReport, unbufReport, !oldUnbufReportESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUnbufReport() {
        Boolean oldUnbufReport = unbufReport;
        boolean oldUnbufReportESet = unbufReportESet;
        unbufReport = UNBUF_REPORT_EDEFAULT;
        unbufReportESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CLIENT_SERVICES__UNBUF_REPORT,
                    oldUnbufReport, UNBUF_REPORT_EDEFAULT, oldUnbufReportESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnbufReport() {
        return unbufReportESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Services getParentServices() {
        if( eContainerFeatureID() != SclPackage.CLIENT_SERVICES__PARENT_SERVICES ) {
            return null;
        }
        return ( Services ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServices( Services newParentServices, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServices, SclPackage.CLIENT_SERVICES__PARENT_SERVICES,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentServices( Services newParentServices ) {
        if( newParentServices != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.CLIENT_SERVICES__PARENT_SERVICES
                        && newParentServices != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServices ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentServices != null ) {
                msgs = ( ( InternalEObject ) newParentServices ).eInverseAdd( this,
                        SclPackage.SERVICES__CLIENT_SERVICES, Services.class, msgs );
            }
            msgs = basicSetParentServices( newParentServices, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CLIENT_SERVICES__PARENT_SERVICES,
                    newParentServices, newParentServices ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TimeSyncProt getTimeSyncProt() {
        return timeSyncProt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTimeSyncProt( TimeSyncProt newTimeSyncProt, NotificationChain msgs ) {
        TimeSyncProt oldTimeSyncProt = timeSyncProt;
        timeSyncProt = newTimeSyncProt;
        boolean oldTimeSyncProtESet = timeSyncProtESet;
        timeSyncProtESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.CLIENT_SERVICES__TIME_SYNC_PROT, oldTimeSyncProt, newTimeSyncProt,
                    !oldTimeSyncProtESet );
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
    public void setTimeSyncProt( TimeSyncProt newTimeSyncProt ) {
        if( newTimeSyncProt != timeSyncProt ) {
            NotificationChain msgs = null;
            if( timeSyncProt != null ) {
                msgs = ( ( InternalEObject ) timeSyncProt ).eInverseRemove( this,
                        SclPackage.TIME_SYNC_PROT__PARENT_CLIENT_SERVICES, TimeSyncProt.class, msgs );
            }
            if( newTimeSyncProt != null ) {
                msgs = ( ( InternalEObject ) newTimeSyncProt ).eInverseAdd( this,
                        SclPackage.TIME_SYNC_PROT__PARENT_CLIENT_SERVICES, TimeSyncProt.class, msgs );
            }
            msgs = basicSetTimeSyncProt( newTimeSyncProt, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldTimeSyncProtESet = timeSyncProtESet;
            timeSyncProtESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CLIENT_SERVICES__TIME_SYNC_PROT,
                        newTimeSyncProt, newTimeSyncProt, !oldTimeSyncProtESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTimeSyncProt( NotificationChain msgs ) {
        TimeSyncProt oldTimeSyncProt = timeSyncProt;
        timeSyncProt = null;
        boolean oldTimeSyncProtESet = timeSyncProtESet;
        timeSyncProtESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.CLIENT_SERVICES__TIME_SYNC_PROT, oldTimeSyncProt, null, oldTimeSyncProtESet );
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
    public void unsetTimeSyncProt() {
        if( timeSyncProt != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) timeSyncProt ).eInverseRemove( this,
                    SclPackage.TIME_SYNC_PROT__PARENT_CLIENT_SERVICES, TimeSyncProt.class, msgs );
            msgs = basicUnsetTimeSyncProt( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldTimeSyncProtESet = timeSyncProtESet;
            timeSyncProtESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CLIENT_SERVICES__TIME_SYNC_PROT,
                        null, null, oldTimeSyncProtESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimeSyncProt() {
        return timeSyncProtESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getRGOOSE() {
        return rGOOSE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRGOOSE( Boolean newRGOOSE ) {
        Boolean oldRGOOSE = rGOOSE;
        rGOOSE = newRGOOSE;
        boolean oldRGOOSEESet = rGOOSEESet;
        rGOOSEESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CLIENT_SERVICES__RGOOSE, oldRGOOSE,
                    rGOOSE, !oldRGOOSEESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRGOOSE() {
        Boolean oldRGOOSE = rGOOSE;
        boolean oldRGOOSEESet = rGOOSEESet;
        rGOOSE = RGOOSE_EDEFAULT;
        rGOOSEESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CLIENT_SERVICES__RGOOSE, oldRGOOSE,
                    RGOOSE_EDEFAULT, oldRGOOSEESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRGOOSE() {
        return rGOOSEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getRSV() {
        return rSV;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRSV( Boolean newRSV ) {
        Boolean oldRSV = rSV;
        rSV = newRSV;
        boolean oldRSVESet = rSVESet;
        rSVESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CLIENT_SERVICES__RSV, oldRSV, rSV,
                    !oldRSVESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRSV() {
        Boolean oldRSV = rSV;
        boolean oldRSVESet = rSVESet;
        rSV = RSV_EDEFAULT;
        rSVESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CLIENT_SERVICES__RSV, oldRSV,
                    RSV_EDEFAULT, oldRSVESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRSV() {
        return rSVESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getNoIctBinding() {
        return noIctBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNoIctBinding( Boolean newNoIctBinding ) {
        Boolean oldNoIctBinding = noIctBinding;
        noIctBinding = newNoIctBinding;
        boolean oldNoIctBindingESet = noIctBindingESet;
        noIctBindingESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CLIENT_SERVICES__NO_ICT_BINDING,
                    oldNoIctBinding, noIctBinding, !oldNoIctBindingESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNoIctBinding() {
        Boolean oldNoIctBinding = noIctBinding;
        boolean oldNoIctBindingESet = noIctBindingESet;
        noIctBinding = NO_ICT_BINDING_EDEFAULT;
        noIctBindingESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CLIENT_SERVICES__NO_ICT_BINDING,
                    oldNoIctBinding, NO_ICT_BINDING_EDEFAULT, oldNoIctBindingESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNoIctBinding() {
        return noIctBindingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public McSecurity getMcSecurity() {
        return mcSecurity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMcSecurity( McSecurity newMcSecurity, NotificationChain msgs ) {
        McSecurity oldMcSecurity = mcSecurity;
        mcSecurity = newMcSecurity;
        boolean oldMcSecurityESet = mcSecurityESet;
        mcSecurityESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.CLIENT_SERVICES__MC_SECURITY, oldMcSecurity, newMcSecurity, !oldMcSecurityESet );
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
    public void setMcSecurity( McSecurity newMcSecurity ) {
        if( newMcSecurity != mcSecurity ) {
            NotificationChain msgs = null;
            if( mcSecurity != null ) {
                msgs = ( ( InternalEObject ) mcSecurity ).eInverseRemove( this,
                        SclPackage.MC_SECURITY__PARENT_CLIENT_SERVICES, McSecurity.class, msgs );
            }
            if( newMcSecurity != null ) {
                msgs = ( ( InternalEObject ) newMcSecurity ).eInverseAdd( this,
                        SclPackage.MC_SECURITY__PARENT_CLIENT_SERVICES, McSecurity.class, msgs );
            }
            msgs = basicSetMcSecurity( newMcSecurity, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldMcSecurityESet = mcSecurityESet;
            mcSecurityESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CLIENT_SERVICES__MC_SECURITY,
                        newMcSecurity, newMcSecurity, !oldMcSecurityESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMcSecurity( NotificationChain msgs ) {
        McSecurity oldMcSecurity = mcSecurity;
        mcSecurity = null;
        boolean oldMcSecurityESet = mcSecurityESet;
        mcSecurityESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.CLIENT_SERVICES__MC_SECURITY, oldMcSecurity, null, oldMcSecurityESet );
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
    public void unsetMcSecurity() {
        if( mcSecurity != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) mcSecurity ).eInverseRemove( this,
                    SclPackage.MC_SECURITY__PARENT_CLIENT_SERVICES, McSecurity.class, msgs );
            msgs = basicUnsetMcSecurity( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldMcSecurityESet = mcSecurityESet;
            mcSecurityESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CLIENT_SERVICES__MC_SECURITY, null,
                        null, oldMcSecurityESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMcSecurity() {
        return mcSecurityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.CLIENT_SERVICES__PARENT_SERVICES:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentServices( ( Services ) otherEnd, msgs );
        case SclPackage.CLIENT_SERVICES__TIME_SYNC_PROT:
            if( timeSyncProt != null ) {
                msgs = ( ( InternalEObject ) timeSyncProt ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.CLIENT_SERVICES__TIME_SYNC_PROT, null, msgs );
            }
            return basicSetTimeSyncProt( ( TimeSyncProt ) otherEnd, msgs );
        case SclPackage.CLIENT_SERVICES__MC_SECURITY:
            if( mcSecurity != null ) {
                msgs = ( ( InternalEObject ) mcSecurity ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.CLIENT_SERVICES__MC_SECURITY, null, msgs );
            }
            return basicSetMcSecurity( ( McSecurity ) otherEnd, msgs );
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
        case SclPackage.CLIENT_SERVICES__PARENT_SERVICES:
            return basicSetParentServices( null, msgs );
        case SclPackage.CLIENT_SERVICES__TIME_SYNC_PROT:
            return basicUnsetTimeSyncProt( msgs );
        case SclPackage.CLIENT_SERVICES__MC_SECURITY:
            return basicUnsetMcSecurity( msgs );
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
        case SclPackage.CLIENT_SERVICES__PARENT_SERVICES:
            return eInternalContainer().eInverseRemove( this, SclPackage.SERVICES__CLIENT_SERVICES, Services.class,
                    msgs );
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
        case SclPackage.CLIENT_SERVICES__BUF_REPORT:
            return getBufReport();
        case SclPackage.CLIENT_SERVICES__GOOSE:
            return getGoose();
        case SclPackage.CLIENT_SERVICES__GSSE:
            return getGsse();
        case SclPackage.CLIENT_SERVICES__MAX_ATTRIBUTES:
            return getMaxAttributes();
        case SclPackage.CLIENT_SERVICES__MAX_GOOSE:
            return getMaxGOOSE();
        case SclPackage.CLIENT_SERVICES__MAX_REPORTS:
            return getMaxReports();
        case SclPackage.CLIENT_SERVICES__MAX_SMV:
            return getMaxSMV();
        case SclPackage.CLIENT_SERVICES__READ_LOG:
            return getReadLog();
        case SclPackage.CLIENT_SERVICES__SUPPORTS_LD_NAME:
            return getSupportsLdName();
        case SclPackage.CLIENT_SERVICES__SV:
            return getSv();
        case SclPackage.CLIENT_SERVICES__UNBUF_REPORT:
            return getUnbufReport();
        case SclPackage.CLIENT_SERVICES__PARENT_SERVICES:
            return getParentServices();
        case SclPackage.CLIENT_SERVICES__TIME_SYNC_PROT:
            return getTimeSyncProt();
        case SclPackage.CLIENT_SERVICES__RGOOSE:
            return getRGOOSE();
        case SclPackage.CLIENT_SERVICES__RSV:
            return getRSV();
        case SclPackage.CLIENT_SERVICES__NO_ICT_BINDING:
            return getNoIctBinding();
        case SclPackage.CLIENT_SERVICES__MC_SECURITY:
            return getMcSecurity();
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
        case SclPackage.CLIENT_SERVICES__BUF_REPORT:
            setBufReport( ( Boolean ) newValue );
            return;
        case SclPackage.CLIENT_SERVICES__GOOSE:
            setGoose( ( Boolean ) newValue );
            return;
        case SclPackage.CLIENT_SERVICES__GSSE:
            setGsse( ( Boolean ) newValue );
            return;
        case SclPackage.CLIENT_SERVICES__MAX_ATTRIBUTES:
            setMaxAttributes( ( Integer ) newValue );
            return;
        case SclPackage.CLIENT_SERVICES__MAX_GOOSE:
            setMaxGOOSE( ( Integer ) newValue );
            return;
        case SclPackage.CLIENT_SERVICES__MAX_REPORTS:
            setMaxReports( ( Integer ) newValue );
            return;
        case SclPackage.CLIENT_SERVICES__MAX_SMV:
            setMaxSMV( ( Integer ) newValue );
            return;
        case SclPackage.CLIENT_SERVICES__READ_LOG:
            setReadLog( ( Boolean ) newValue );
            return;
        case SclPackage.CLIENT_SERVICES__SUPPORTS_LD_NAME:
            setSupportsLdName( ( Boolean ) newValue );
            return;
        case SclPackage.CLIENT_SERVICES__SV:
            setSv( ( Boolean ) newValue );
            return;
        case SclPackage.CLIENT_SERVICES__UNBUF_REPORT:
            setUnbufReport( ( Boolean ) newValue );
            return;
        case SclPackage.CLIENT_SERVICES__PARENT_SERVICES:
            setParentServices( ( Services ) newValue );
            return;
        case SclPackage.CLIENT_SERVICES__TIME_SYNC_PROT:
            setTimeSyncProt( ( TimeSyncProt ) newValue );
            return;
        case SclPackage.CLIENT_SERVICES__RGOOSE:
            setRGOOSE( ( Boolean ) newValue );
            return;
        case SclPackage.CLIENT_SERVICES__RSV:
            setRSV( ( Boolean ) newValue );
            return;
        case SclPackage.CLIENT_SERVICES__NO_ICT_BINDING:
            setNoIctBinding( ( Boolean ) newValue );
            return;
        case SclPackage.CLIENT_SERVICES__MC_SECURITY:
            setMcSecurity( ( McSecurity ) newValue );
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
        case SclPackage.CLIENT_SERVICES__BUF_REPORT:
            unsetBufReport();
            return;
        case SclPackage.CLIENT_SERVICES__GOOSE:
            unsetGoose();
            return;
        case SclPackage.CLIENT_SERVICES__GSSE:
            unsetGsse();
            return;
        case SclPackage.CLIENT_SERVICES__MAX_ATTRIBUTES:
            unsetMaxAttributes();
            return;
        case SclPackage.CLIENT_SERVICES__MAX_GOOSE:
            unsetMaxGOOSE();
            return;
        case SclPackage.CLIENT_SERVICES__MAX_REPORTS:
            unsetMaxReports();
            return;
        case SclPackage.CLIENT_SERVICES__MAX_SMV:
            unsetMaxSMV();
            return;
        case SclPackage.CLIENT_SERVICES__READ_LOG:
            unsetReadLog();
            return;
        case SclPackage.CLIENT_SERVICES__SUPPORTS_LD_NAME:
            unsetSupportsLdName();
            return;
        case SclPackage.CLIENT_SERVICES__SV:
            unsetSv();
            return;
        case SclPackage.CLIENT_SERVICES__UNBUF_REPORT:
            unsetUnbufReport();
            return;
        case SclPackage.CLIENT_SERVICES__PARENT_SERVICES:
            setParentServices( ( Services ) null );
            return;
        case SclPackage.CLIENT_SERVICES__TIME_SYNC_PROT:
            unsetTimeSyncProt();
            return;
        case SclPackage.CLIENT_SERVICES__RGOOSE:
            unsetRGOOSE();
            return;
        case SclPackage.CLIENT_SERVICES__RSV:
            unsetRSV();
            return;
        case SclPackage.CLIENT_SERVICES__NO_ICT_BINDING:
            unsetNoIctBinding();
            return;
        case SclPackage.CLIENT_SERVICES__MC_SECURITY:
            unsetMcSecurity();
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
        case SclPackage.CLIENT_SERVICES__BUF_REPORT:
            return isSetBufReport();
        case SclPackage.CLIENT_SERVICES__GOOSE:
            return isSetGoose();
        case SclPackage.CLIENT_SERVICES__GSSE:
            return isSetGsse();
        case SclPackage.CLIENT_SERVICES__MAX_ATTRIBUTES:
            return isSetMaxAttributes();
        case SclPackage.CLIENT_SERVICES__MAX_GOOSE:
            return isSetMaxGOOSE();
        case SclPackage.CLIENT_SERVICES__MAX_REPORTS:
            return isSetMaxReports();
        case SclPackage.CLIENT_SERVICES__MAX_SMV:
            return isSetMaxSMV();
        case SclPackage.CLIENT_SERVICES__READ_LOG:
            return isSetReadLog();
        case SclPackage.CLIENT_SERVICES__SUPPORTS_LD_NAME:
            return isSetSupportsLdName();
        case SclPackage.CLIENT_SERVICES__SV:
            return isSetSv();
        case SclPackage.CLIENT_SERVICES__UNBUF_REPORT:
            return isSetUnbufReport();
        case SclPackage.CLIENT_SERVICES__PARENT_SERVICES:
            return getParentServices() != null;
        case SclPackage.CLIENT_SERVICES__TIME_SYNC_PROT:
            return isSetTimeSyncProt();
        case SclPackage.CLIENT_SERVICES__RGOOSE:
            return isSetRGOOSE();
        case SclPackage.CLIENT_SERVICES__RSV:
            return isSetRSV();
        case SclPackage.CLIENT_SERVICES__NO_ICT_BINDING:
            return isSetNoIctBinding();
        case SclPackage.CLIENT_SERVICES__MC_SECURITY:
            return isSetMcSecurity();
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
        result.append( " (bufReport: " );
        if( bufReportESet ) {
            result.append( bufReport );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", goose: " );
        if( gooseESet ) {
            result.append( goose );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", gsse: " );
        if( gsseESet ) {
            result.append( gsse );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", maxAttributes: " );
        if( maxAttributesESet ) {
            result.append( maxAttributes );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", maxGOOSE: " );
        if( maxGOOSEESet ) {
            result.append( maxGOOSE );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", maxReports: " );
        if( maxReportsESet ) {
            result.append( maxReports );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", maxSMV: " );
        if( maxSMVESet ) {
            result.append( maxSMV );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", readLog: " );
        if( readLogESet ) {
            result.append( readLog );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", supportsLdName: " );
        if( supportsLdNameESet ) {
            result.append( supportsLdName );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", sv: " );
        if( svESet ) {
            result.append( sv );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", unbufReport: " );
        if( unbufReportESet ) {
            result.append( unbufReport );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", rGOOSE: " );
        if( rGOOSEESet ) {
            result.append( rGOOSE );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", rSV: " );
        if( rSVESet ) {
            result.append( rSV );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", noIctBinding: " );
        if( noIctBindingESet ) {
            result.append( noIctBinding );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    @Override
    public String getXpath() {
        return getParentServices().getXpath() + "/scl:ClientServices";
    }

} //ClientServicesImpl
