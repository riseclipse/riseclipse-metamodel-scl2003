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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SamplesPerSec;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SecPerSamples;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsNoDynEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpRate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMV Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#getSvID <em>Sv ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#getOptFields <em>Opt Fields</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#getSmpRateAttribute <em>Smp Rate Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#isSamplesPerSecAttribute <em>Samples Per Sec Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#isPdcTimeStamp <em>Pdc Time Stamp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#getSmpRate <em>Smp Rate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#getSamplesPerSec <em>Samples Per Sec</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#getSecPerSamples <em>Sec Per Samples</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#getParentServices <em>Parent Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#getSynchSrcId <em>Synch Src Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#getNofASDU <em>Nof ASDU</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#getKdaParticipant <em>Kda Participant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#getMcSecurity <em>Mc Security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SMVSettingsImpl extends ServiceSettingsImpl implements SMVSettings {
    /**
     * The default value of the '{@link #getSvID() <em>Sv ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvID()
     * @generated
     * @ordered
     */
    protected static final ServiceSettingsEnum SV_ID_EDEFAULT = ServiceSettingsEnum.FIX;
    /**
     * The cached value of the '{@link #getSvID() <em>Sv ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvID()
     * @generated
     * @ordered
     */
    protected ServiceSettingsEnum svID = SV_ID_EDEFAULT;
    /**
     * This is true if the Sv ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean svIDESet;
    /**
     * The default value of the '{@link #getOptFields() <em>Opt Fields</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOptFields()
     * @generated
     * @ordered
     */
    protected static final ServiceSettingsEnum OPT_FIELDS_EDEFAULT = ServiceSettingsEnum.FIX;
    /**
     * The cached value of the '{@link #getOptFields() <em>Opt Fields</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOptFields()
     * @generated
     * @ordered
     */
    protected ServiceSettingsEnum optFields = OPT_FIELDS_EDEFAULT;
    /**
     * This is true if the Opt Fields attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean optFieldsESet;
    /**
     * The default value of the '{@link #getSmpRateAttribute() <em>Smp Rate Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmpRateAttribute()
     * @generated
     * @ordered
     */
    protected static final ServiceSettingsEnum SMP_RATE_ATTRIBUTE_EDEFAULT = ServiceSettingsEnum.FIX;
    /**
     * The cached value of the '{@link #getSmpRateAttribute() <em>Smp Rate Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmpRateAttribute()
     * @generated
     * @ordered
     */
    protected ServiceSettingsEnum smpRateAttribute = SMP_RATE_ATTRIBUTE_EDEFAULT;
    /**
     * This is true if the Smp Rate Attribute attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean smpRateAttributeESet;
    /**
     * The default value of the '{@link #isSamplesPerSecAttribute() <em>Samples Per Sec Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSamplesPerSecAttribute()
     * @generated
     * @ordered
     */
    protected static final boolean SAMPLES_PER_SEC_ATTRIBUTE_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isSamplesPerSecAttribute() <em>Samples Per Sec Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSamplesPerSecAttribute()
     * @generated
     * @ordered
     */
    protected boolean samplesPerSecAttribute = SAMPLES_PER_SEC_ATTRIBUTE_EDEFAULT;
    /**
     * This is true if the Samples Per Sec Attribute attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean samplesPerSecAttributeESet;
    /**
     * The default value of the '{@link #isPdcTimeStamp() <em>Pdc Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPdcTimeStamp()
     * @generated
     * @ordered
     */
    protected static final boolean PDC_TIME_STAMP_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isPdcTimeStamp() <em>Pdc Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPdcTimeStamp()
     * @generated
     * @ordered
     */
    protected boolean pdcTimeStamp = PDC_TIME_STAMP_EDEFAULT;
    /**
     * This is true if the Pdc Time Stamp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pdcTimeStampESet;
    /**
     * The cached value of the '{@link #getSmpRate() <em>Smp Rate</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmpRate()
     * @generated
     * @ordered
     */
    protected EList< SmpRate > smpRate;
    /**
     * The cached value of the '{@link #getSamplesPerSec() <em>Samples Per Sec</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSamplesPerSec()
     * @generated
     * @ordered
     */
    protected EList< SamplesPerSec > samplesPerSec;
    /**
     * The cached value of the '{@link #getSecPerSamples() <em>Sec Per Samples</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecPerSamples()
     * @generated
     * @ordered
     */
    protected EList< SecPerSamples > secPerSamples;

    /**
     * The default value of the '{@link #getSynchSrcId() <em>Synch Src Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSynchSrcId()
     * @generated
     * @ordered
     */
    protected static final Boolean SYNCH_SRC_ID_EDEFAULT = Boolean.FALSE;
    /**
     * The cached value of the '{@link #getSynchSrcId() <em>Synch Src Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSynchSrcId()
     * @generated
     * @ordered
     */
    protected Boolean synchSrcId = SYNCH_SRC_ID_EDEFAULT;
    /**
     * This is true if the Synch Src Id attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean synchSrcIdESet;
    /**
     * The default value of the '{@link #getNofASDU() <em>Nof ASDU</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNofASDU()
     * @generated
     * @ordered
     */
    protected static final ServiceSettingsNoDynEnum NOF_ASDU_EDEFAULT = ServiceSettingsNoDynEnum.FIX;
    /**
     * The cached value of the '{@link #getNofASDU() <em>Nof ASDU</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNofASDU()
     * @generated
     * @ordered
     */
    protected ServiceSettingsNoDynEnum nofASDU = NOF_ASDU_EDEFAULT;
    /**
     * This is true if the Nof ASDU attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nofASDUESet;
    /**
     * The default value of the '{@link #getKdaParticipant() <em>Kda Participant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdaParticipant()
     * @generated
     * @ordered
     */
    protected static final Boolean KDA_PARTICIPANT_EDEFAULT = Boolean.FALSE;
    /**
     * The cached value of the '{@link #getKdaParticipant() <em>Kda Participant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdaParticipant()
     * @generated
     * @ordered
     */
    protected Boolean kdaParticipant = KDA_PARTICIPANT_EDEFAULT;
    /**
     * This is true if the Kda Participant attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kdaParticipantESet;

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
    protected SMVSettingsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSMVSettings();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceSettingsEnum getSvID() {
        return svID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSvID( ServiceSettingsEnum newSvID ) {
        ServiceSettingsEnum oldSvID = svID;
        svID = newSvID == null ? SV_ID_EDEFAULT : newSvID;
        boolean oldSvIDESet = svIDESet;
        svIDESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SMV_SETTINGS__SV_ID, oldSvID, svID,
                    !oldSvIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSvID() {
        ServiceSettingsEnum oldSvID = svID;
        boolean oldSvIDESet = svIDESet;
        svID = SV_ID_EDEFAULT;
        svIDESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SMV_SETTINGS__SV_ID, oldSvID,
                    SV_ID_EDEFAULT, oldSvIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSvID() {
        return svIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceSettingsEnum getOptFields() {
        return optFields;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOptFields( ServiceSettingsEnum newOptFields ) {
        ServiceSettingsEnum oldOptFields = optFields;
        optFields = newOptFields == null ? OPT_FIELDS_EDEFAULT : newOptFields;
        boolean oldOptFieldsESet = optFieldsESet;
        optFieldsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SMV_SETTINGS__OPT_FIELDS, oldOptFields,
                    optFields, !oldOptFieldsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOptFields() {
        ServiceSettingsEnum oldOptFields = optFields;
        boolean oldOptFieldsESet = optFieldsESet;
        optFields = OPT_FIELDS_EDEFAULT;
        optFieldsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SMV_SETTINGS__OPT_FIELDS, oldOptFields,
                    OPT_FIELDS_EDEFAULT, oldOptFieldsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOptFields() {
        return optFieldsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceSettingsEnum getSmpRateAttribute() {
        return smpRateAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSmpRateAttribute( ServiceSettingsEnum newSmpRateAttribute ) {
        ServiceSettingsEnum oldSmpRateAttribute = smpRateAttribute;
        smpRateAttribute = newSmpRateAttribute == null ? SMP_RATE_ATTRIBUTE_EDEFAULT : newSmpRateAttribute;
        boolean oldSmpRateAttributeESet = smpRateAttributeESet;
        smpRateAttributeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SMV_SETTINGS__SMP_RATE_ATTRIBUTE,
                    oldSmpRateAttribute, smpRateAttribute, !oldSmpRateAttributeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSmpRateAttribute() {
        ServiceSettingsEnum oldSmpRateAttribute = smpRateAttribute;
        boolean oldSmpRateAttributeESet = smpRateAttributeESet;
        smpRateAttribute = SMP_RATE_ATTRIBUTE_EDEFAULT;
        smpRateAttributeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SMV_SETTINGS__SMP_RATE_ATTRIBUTE,
                    oldSmpRateAttribute, SMP_RATE_ATTRIBUTE_EDEFAULT, oldSmpRateAttributeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSmpRateAttribute() {
        return smpRateAttributeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSamplesPerSecAttribute() {
        return samplesPerSecAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSamplesPerSecAttribute( boolean newSamplesPerSecAttribute ) {
        boolean oldSamplesPerSecAttribute = samplesPerSecAttribute;
        samplesPerSecAttribute = newSamplesPerSecAttribute;
        boolean oldSamplesPerSecAttributeESet = samplesPerSecAttributeESet;
        samplesPerSecAttributeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC_ATTRIBUTE,
                    oldSamplesPerSecAttribute, samplesPerSecAttribute, !oldSamplesPerSecAttributeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSamplesPerSecAttribute() {
        boolean oldSamplesPerSecAttribute = samplesPerSecAttribute;
        boolean oldSamplesPerSecAttributeESet = samplesPerSecAttributeESet;
        samplesPerSecAttribute = SAMPLES_PER_SEC_ATTRIBUTE_EDEFAULT;
        samplesPerSecAttributeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC_ATTRIBUTE, oldSamplesPerSecAttribute,
                    SAMPLES_PER_SEC_ATTRIBUTE_EDEFAULT, oldSamplesPerSecAttributeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSamplesPerSecAttribute() {
        return samplesPerSecAttributeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isPdcTimeStamp() {
        return pdcTimeStamp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPdcTimeStamp( boolean newPdcTimeStamp ) {
        boolean oldPdcTimeStamp = pdcTimeStamp;
        pdcTimeStamp = newPdcTimeStamp;
        boolean oldPdcTimeStampESet = pdcTimeStampESet;
        pdcTimeStampESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SMV_SETTINGS__PDC_TIME_STAMP,
                    oldPdcTimeStamp, pdcTimeStamp, !oldPdcTimeStampESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPdcTimeStamp() {
        boolean oldPdcTimeStamp = pdcTimeStamp;
        boolean oldPdcTimeStampESet = pdcTimeStampESet;
        pdcTimeStamp = PDC_TIME_STAMP_EDEFAULT;
        pdcTimeStampESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SMV_SETTINGS__PDC_TIME_STAMP,
                    oldPdcTimeStamp, PDC_TIME_STAMP_EDEFAULT, oldPdcTimeStampESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPdcTimeStamp() {
        return pdcTimeStampESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SmpRate > getSmpRate() {
        if( smpRate == null ) {
            smpRate = new EObjectContainmentWithInverseEList.Unsettable< SmpRate >( SmpRate.class, this,
                    SclPackage.SMV_SETTINGS__SMP_RATE, SclPackage.SMP_RATE__PARENT_SMV_SETTINGS );
        }
        return smpRate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSmpRate() {
        if( smpRate != null ) ( ( InternalEList.Unsettable< ? > ) smpRate ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSmpRate() {
        return smpRate != null && ( ( InternalEList.Unsettable< ? > ) smpRate ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SamplesPerSec > getSamplesPerSec() {
        if( samplesPerSec == null ) {
            samplesPerSec = new EObjectContainmentWithInverseEList.Unsettable< SamplesPerSec >( SamplesPerSec.class,
                    this, SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC, SclPackage.SAMPLES_PER_SEC__PARENT_SMV_SETTINGS );
        }
        return samplesPerSec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSamplesPerSec() {
        if( samplesPerSec != null ) ( ( InternalEList.Unsettable< ? > ) samplesPerSec ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSamplesPerSec() {
        return samplesPerSec != null && ( ( InternalEList.Unsettable< ? > ) samplesPerSec ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SecPerSamples > getSecPerSamples() {
        if( secPerSamples == null ) {
            secPerSamples = new EObjectContainmentWithInverseEList.Unsettable< SecPerSamples >( SecPerSamples.class,
                    this, SclPackage.SMV_SETTINGS__SEC_PER_SAMPLES, SclPackage.SEC_PER_SAMPLES__PARENT_SMV_SETTINGS );
        }
        return secPerSamples;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSecPerSamples() {
        if( secPerSamples != null ) ( ( InternalEList.Unsettable< ? > ) secPerSamples ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSecPerSamples() {
        return secPerSamples != null && ( ( InternalEList.Unsettable< ? > ) secPerSamples ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Services getParentServices() {
        if( eContainerFeatureID() != SclPackage.SMV_SETTINGS__PARENT_SERVICES ) return null;
        return ( Services ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServices( Services newParentServices, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServices, SclPackage.SMV_SETTINGS__PARENT_SERVICES,
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
                || ( eContainerFeatureID() != SclPackage.SMV_SETTINGS__PARENT_SERVICES
                        && newParentServices != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServices ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentServices != null )
                msgs = ( ( InternalEObject ) newParentServices ).eInverseAdd( this, SclPackage.SERVICES__SMV_SETTINGS,
                        Services.class, msgs );
            msgs = basicSetParentServices( newParentServices, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SMV_SETTINGS__PARENT_SERVICES,
                    newParentServices, newParentServices ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSynchSrcId() {
        return synchSrcId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSynchSrcId( Boolean newSynchSrcId ) {
        Boolean oldSynchSrcId = synchSrcId;
        synchSrcId = newSynchSrcId;
        boolean oldSynchSrcIdESet = synchSrcIdESet;
        synchSrcIdESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SMV_SETTINGS__SYNCH_SRC_ID,
                    oldSynchSrcId, synchSrcId, !oldSynchSrcIdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSynchSrcId() {
        Boolean oldSynchSrcId = synchSrcId;
        boolean oldSynchSrcIdESet = synchSrcIdESet;
        synchSrcId = SYNCH_SRC_ID_EDEFAULT;
        synchSrcIdESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SMV_SETTINGS__SYNCH_SRC_ID,
                    oldSynchSrcId, SYNCH_SRC_ID_EDEFAULT, oldSynchSrcIdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSynchSrcId() {
        return synchSrcIdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceSettingsNoDynEnum getNofASDU() {
        return nofASDU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNofASDU( ServiceSettingsNoDynEnum newNofASDU ) {
        ServiceSettingsNoDynEnum oldNofASDU = nofASDU;
        nofASDU = newNofASDU == null ? NOF_ASDU_EDEFAULT : newNofASDU;
        boolean oldNofASDUESet = nofASDUESet;
        nofASDUESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SMV_SETTINGS__NOF_ASDU, oldNofASDU,
                    nofASDU, !oldNofASDUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNofASDU() {
        ServiceSettingsNoDynEnum oldNofASDU = nofASDU;
        boolean oldNofASDUESet = nofASDUESet;
        nofASDU = NOF_ASDU_EDEFAULT;
        nofASDUESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SMV_SETTINGS__NOF_ASDU, oldNofASDU,
                    NOF_ASDU_EDEFAULT, oldNofASDUESet ) );
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
    public Boolean getKdaParticipant() {
        return kdaParticipant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKdaParticipant( Boolean newKdaParticipant ) {
        Boolean oldKdaParticipant = kdaParticipant;
        kdaParticipant = newKdaParticipant;
        boolean oldKdaParticipantESet = kdaParticipantESet;
        kdaParticipantESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SMV_SETTINGS__KDA_PARTICIPANT,
                    oldKdaParticipant, kdaParticipant, !oldKdaParticipantESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKdaParticipant() {
        Boolean oldKdaParticipant = kdaParticipant;
        boolean oldKdaParticipantESet = kdaParticipantESet;
        kdaParticipant = KDA_PARTICIPANT_EDEFAULT;
        kdaParticipantESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SMV_SETTINGS__KDA_PARTICIPANT,
                    oldKdaParticipant, KDA_PARTICIPANT_EDEFAULT, oldKdaParticipantESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKdaParticipant() {
        return kdaParticipantESet;
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
                    SclPackage.SMV_SETTINGS__MC_SECURITY, oldMcSecurity, newMcSecurity, !oldMcSecurityESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
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
            if( mcSecurity != null )
                msgs = ( ( InternalEObject ) mcSecurity ).eInverseRemove( this,
                        SclPackage.MC_SECURITY__PARENT_SMV_SETTINGS, McSecurity.class, msgs );
            if( newMcSecurity != null )
                msgs = ( ( InternalEObject ) newMcSecurity ).eInverseAdd( this,
                        SclPackage.MC_SECURITY__PARENT_SMV_SETTINGS, McSecurity.class, msgs );
            msgs = basicSetMcSecurity( newMcSecurity, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMcSecurityESet = mcSecurityESet;
            mcSecurityESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SMV_SETTINGS__MC_SECURITY,
                        newMcSecurity, newMcSecurity, !oldMcSecurityESet ) );
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
                    SclPackage.SMV_SETTINGS__MC_SECURITY, oldMcSecurity, null, oldMcSecurityESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
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
            msgs = ( ( InternalEObject ) mcSecurity ).eInverseRemove( this, SclPackage.MC_SECURITY__PARENT_SMV_SETTINGS,
                    McSecurity.class, msgs );
            msgs = basicUnsetMcSecurity( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMcSecurityESet = mcSecurityESet;
            mcSecurityESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SMV_SETTINGS__MC_SECURITY, null,
                        null, oldMcSecurityESet ) );
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.SMV_SETTINGS__SMP_RATE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSmpRate() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSamplesPerSec() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.SMV_SETTINGS__SEC_PER_SAMPLES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSecPerSamples() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.SMV_SETTINGS__PARENT_SERVICES:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentServices( ( Services ) otherEnd, msgs );
        case SclPackage.SMV_SETTINGS__MC_SECURITY:
            if( mcSecurity != null )
                msgs = ( ( InternalEObject ) mcSecurity ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.SMV_SETTINGS__MC_SECURITY, null, msgs );
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
        case SclPackage.SMV_SETTINGS__SMP_RATE:
            return ( ( InternalEList< ? > ) getSmpRate() ).basicRemove( otherEnd, msgs );
        case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC:
            return ( ( InternalEList< ? > ) getSamplesPerSec() ).basicRemove( otherEnd, msgs );
        case SclPackage.SMV_SETTINGS__SEC_PER_SAMPLES:
            return ( ( InternalEList< ? > ) getSecPerSamples() ).basicRemove( otherEnd, msgs );
        case SclPackage.SMV_SETTINGS__PARENT_SERVICES:
            return basicSetParentServices( null, msgs );
        case SclPackage.SMV_SETTINGS__MC_SECURITY:
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
        case SclPackage.SMV_SETTINGS__PARENT_SERVICES:
            return eInternalContainer().eInverseRemove( this, SclPackage.SERVICES__SMV_SETTINGS, Services.class, msgs );
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
        case SclPackage.SMV_SETTINGS__SV_ID:
            return getSvID();
        case SclPackage.SMV_SETTINGS__OPT_FIELDS:
            return getOptFields();
        case SclPackage.SMV_SETTINGS__SMP_RATE_ATTRIBUTE:
            return getSmpRateAttribute();
        case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC_ATTRIBUTE:
            return isSamplesPerSecAttribute();
        case SclPackage.SMV_SETTINGS__PDC_TIME_STAMP:
            return isPdcTimeStamp();
        case SclPackage.SMV_SETTINGS__SMP_RATE:
            return getSmpRate();
        case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC:
            return getSamplesPerSec();
        case SclPackage.SMV_SETTINGS__SEC_PER_SAMPLES:
            return getSecPerSamples();
        case SclPackage.SMV_SETTINGS__PARENT_SERVICES:
            return getParentServices();
        case SclPackage.SMV_SETTINGS__SYNCH_SRC_ID:
            return getSynchSrcId();
        case SclPackage.SMV_SETTINGS__NOF_ASDU:
            return getNofASDU();
        case SclPackage.SMV_SETTINGS__KDA_PARTICIPANT:
            return getKdaParticipant();
        case SclPackage.SMV_SETTINGS__MC_SECURITY:
            return getMcSecurity();
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
        case SclPackage.SMV_SETTINGS__SV_ID:
            setSvID( ( ServiceSettingsEnum ) newValue );
            return;
        case SclPackage.SMV_SETTINGS__OPT_FIELDS:
            setOptFields( ( ServiceSettingsEnum ) newValue );
            return;
        case SclPackage.SMV_SETTINGS__SMP_RATE_ATTRIBUTE:
            setSmpRateAttribute( ( ServiceSettingsEnum ) newValue );
            return;
        case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC_ATTRIBUTE:
            setSamplesPerSecAttribute( ( Boolean ) newValue );
            return;
        case SclPackage.SMV_SETTINGS__PDC_TIME_STAMP:
            setPdcTimeStamp( ( Boolean ) newValue );
            return;
        case SclPackage.SMV_SETTINGS__SMP_RATE:
            getSmpRate().clear();
            getSmpRate().addAll( ( Collection< ? extends SmpRate > ) newValue );
            return;
        case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC:
            getSamplesPerSec().clear();
            getSamplesPerSec().addAll( ( Collection< ? extends SamplesPerSec > ) newValue );
            return;
        case SclPackage.SMV_SETTINGS__SEC_PER_SAMPLES:
            getSecPerSamples().clear();
            getSecPerSamples().addAll( ( Collection< ? extends SecPerSamples > ) newValue );
            return;
        case SclPackage.SMV_SETTINGS__PARENT_SERVICES:
            setParentServices( ( Services ) newValue );
            return;
        case SclPackage.SMV_SETTINGS__SYNCH_SRC_ID:
            setSynchSrcId( ( Boolean ) newValue );
            return;
        case SclPackage.SMV_SETTINGS__NOF_ASDU:
            setNofASDU( ( ServiceSettingsNoDynEnum ) newValue );
            return;
        case SclPackage.SMV_SETTINGS__KDA_PARTICIPANT:
            setKdaParticipant( ( Boolean ) newValue );
            return;
        case SclPackage.SMV_SETTINGS__MC_SECURITY:
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
        case SclPackage.SMV_SETTINGS__SV_ID:
            unsetSvID();
            return;
        case SclPackage.SMV_SETTINGS__OPT_FIELDS:
            unsetOptFields();
            return;
        case SclPackage.SMV_SETTINGS__SMP_RATE_ATTRIBUTE:
            unsetSmpRateAttribute();
            return;
        case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC_ATTRIBUTE:
            unsetSamplesPerSecAttribute();
            return;
        case SclPackage.SMV_SETTINGS__PDC_TIME_STAMP:
            unsetPdcTimeStamp();
            return;
        case SclPackage.SMV_SETTINGS__SMP_RATE:
            unsetSmpRate();
            return;
        case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC:
            unsetSamplesPerSec();
            return;
        case SclPackage.SMV_SETTINGS__SEC_PER_SAMPLES:
            unsetSecPerSamples();
            return;
        case SclPackage.SMV_SETTINGS__PARENT_SERVICES:
            setParentServices( ( Services ) null );
            return;
        case SclPackage.SMV_SETTINGS__SYNCH_SRC_ID:
            unsetSynchSrcId();
            return;
        case SclPackage.SMV_SETTINGS__NOF_ASDU:
            unsetNofASDU();
            return;
        case SclPackage.SMV_SETTINGS__KDA_PARTICIPANT:
            unsetKdaParticipant();
            return;
        case SclPackage.SMV_SETTINGS__MC_SECURITY:
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
        case SclPackage.SMV_SETTINGS__SV_ID:
            return isSetSvID();
        case SclPackage.SMV_SETTINGS__OPT_FIELDS:
            return isSetOptFields();
        case SclPackage.SMV_SETTINGS__SMP_RATE_ATTRIBUTE:
            return isSetSmpRateAttribute();
        case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC_ATTRIBUTE:
            return isSetSamplesPerSecAttribute();
        case SclPackage.SMV_SETTINGS__PDC_TIME_STAMP:
            return isSetPdcTimeStamp();
        case SclPackage.SMV_SETTINGS__SMP_RATE:
            return isSetSmpRate();
        case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC:
            return isSetSamplesPerSec();
        case SclPackage.SMV_SETTINGS__SEC_PER_SAMPLES:
            return isSetSecPerSamples();
        case SclPackage.SMV_SETTINGS__PARENT_SERVICES:
            return getParentServices() != null;
        case SclPackage.SMV_SETTINGS__SYNCH_SRC_ID:
            return isSetSynchSrcId();
        case SclPackage.SMV_SETTINGS__NOF_ASDU:
            return isSetNofASDU();
        case SclPackage.SMV_SETTINGS__KDA_PARTICIPANT:
            return isSetKdaParticipant();
        case SclPackage.SMV_SETTINGS__MC_SECURITY:
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
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (svID: " );
        if( svIDESet )
            result.append( svID );
        else
            result.append( "<unset>" );
        result.append( ", optFields: " );
        if( optFieldsESet )
            result.append( optFields );
        else
            result.append( "<unset>" );
        result.append( ", smpRateAttribute: " );
        if( smpRateAttributeESet )
            result.append( smpRateAttribute );
        else
            result.append( "<unset>" );
        result.append( ", samplesPerSecAttribute: " );
        if( samplesPerSecAttributeESet )
            result.append( samplesPerSecAttribute );
        else
            result.append( "<unset>" );
        result.append( ", pdcTimeStamp: " );
        if( pdcTimeStampESet )
            result.append( pdcTimeStamp );
        else
            result.append( "<unset>" );
        result.append( ", synchSrcId: " );
        if( synchSrcIdESet )
            result.append( synchSrcId );
        else
            result.append( "<unset>" );
        result.append( ", nofASDU: " );
        if( nofASDUESet )
            result.append( nofASDU );
        else
            result.append( "<unset>" );
        result.append( ", kdaParticipant: " );
        if( kdaParticipantESet )
            result.append( kdaParticipant );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    @Override
    public String getXpath() {
        return getParentServices().getXpath() + "/scl:SMVSettings";
    }

} //SMVSettingsImpl
