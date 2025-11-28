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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgUuid;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDSourceFiles;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.MinRequestedSCDFiles;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IED</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getTemplateUuid <em>Template Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getConfigVersion <em>Config Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getEngRight <em>Eng Right</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getOriginalSclRevision <em>Original Scl Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getOriginalSclVersion <em>Original Scl Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getAccessPoint <em>Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getKDC <em>KDC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getServices <em>Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getParentSCL <em>Parent SCL</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getOriginalSclRelease <em>Original Scl Release</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getReferredByIEDName <em>Referred By IED Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getIEDSourceFiles <em>IED Source Files</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl#getMinRequestedSCDFiles <em>Min Requested SCD Files</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IEDImpl extends UnNamingImpl implements IED {
    /**
     * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUuid()
     * @generated
     * @ordered
     */
    protected static final String UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUuid()
     * @generated
     * @ordered
     */
    protected String uuid = UUID_EDEFAULT;

    /**
     * This is true if the Uuid attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uuidESet;

    /**
     * The default value of the '{@link #getTemplateUuid() <em>Template Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemplateUuid()
     * @generated
     * @ordered
     */
    protected static final String TEMPLATE_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTemplateUuid() <em>Template Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemplateUuid()
     * @generated
     * @ordered
     */
    protected String templateUuid = TEMPLATE_UUID_EDEFAULT;

    /**
     * This is true if the Template Uuid attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean templateUuidESet;

    /**
     * The default value of the '{@link #getConfigVersion() <em>Config Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigVersion()
     * @generated
     * @ordered
     */
    protected static final String CONFIG_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConfigVersion() <em>Config Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigVersion()
     * @generated
     * @ordered
     */
    protected String configVersion = CONFIG_VERSION_EDEFAULT;

    /**
     * This is true if the Config Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean configVersionESet;

    /**
     * The default value of the '{@link #getEngRight() <em>Eng Right</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEngRight()
     * @generated
     * @ordered
     */
    protected static final String ENG_RIGHT_EDEFAULT = "full";

    /**
     * The cached value of the '{@link #getEngRight() <em>Eng Right</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEngRight()
     * @generated
     * @ordered
     */
    protected String engRight = ENG_RIGHT_EDEFAULT;

    /**
     * This is true if the Eng Right attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean engRightESet;

    /**
     * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getManufacturer()
     * @generated
     * @ordered
     */
    protected static final String MANUFACTURER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getManufacturer()
     * @generated
     * @ordered
     */
    protected String manufacturer = MANUFACTURER_EDEFAULT;

    /**
     * This is true if the Manufacturer attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean manufacturerESet;

    /**
     * The default value of the '{@link #getOriginalSclRevision() <em>Original Scl Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginalSclRevision()
     * @generated
     * @ordered
     */
    protected static final String ORIGINAL_SCL_REVISION_EDEFAULT = "A";

    /**
     * The cached value of the '{@link #getOriginalSclRevision() <em>Original Scl Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginalSclRevision()
     * @generated
     * @ordered
     */
    protected String originalSclRevision = ORIGINAL_SCL_REVISION_EDEFAULT;

    /**
     * This is true if the Original Scl Revision attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean originalSclRevisionESet;

    /**
     * The default value of the '{@link #getOriginalSclVersion() <em>Original Scl Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginalSclVersion()
     * @generated
     * @ordered
     */
    protected static final String ORIGINAL_SCL_VERSION_EDEFAULT = "2003";

    /**
     * The cached value of the '{@link #getOriginalSclVersion() <em>Original Scl Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginalSclVersion()
     * @generated
     * @ordered
     */
    protected String originalSclVersion = ORIGINAL_SCL_VERSION_EDEFAULT;

    /**
     * This is true if the Original Scl Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean originalSclVersionESet;

    /**
     * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwner()
     * @generated
     * @ordered
     */
    protected static final String OWNER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwner()
     * @generated
     * @ordered
     */
    protected String owner = OWNER_EDEFAULT;

    /**
     * This is true if the Owner attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ownerESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The cached value of the '{@link #getAccessPoint() <em>Access Point</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccessPoint()
     * @generated
     * @ordered
     */
    protected EList< AccessPoint > accessPoint;

    /**
     * The cached value of the '{@link #getKDC() <em>KDC</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKDC()
     * @generated
     * @ordered
     */
    protected EList< KDC > kdc;

    /**
     * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServices()
     * @generated
     * @ordered
     */
    protected Services services;

    /**
     * This is true if the Services containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean servicesESet;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

    /**
     * The default value of the '{@link #getOriginalSclRelease() <em>Original Scl Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginalSclRelease()
     * @generated
     * @ordered
     */
    protected static final Integer ORIGINAL_SCL_RELEASE_EDEFAULT = Integer.valueOf( 1 );

    /**
     * The cached value of the '{@link #getOriginalSclRelease() <em>Original Scl Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginalSclRelease()
     * @generated
     * @ordered
     */
    protected Integer originalSclRelease = ORIGINAL_SCL_RELEASE_EDEFAULT;

    /**
     * This is true if the Original Scl Release attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean originalSclReleaseESet;

    /**
     * The cached value of the '{@link #getReferredByIEDName() <em>Referred By IED Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByIEDName()
     * @generated
     * @ordered
     */
    protected IEDName referredByIEDName;

    /**
     * This is true if the Referred By IED Name reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean referredByIEDNameESet;

    /**
     * The cached value of the '{@link #getIEDSourceFiles() <em>IED Source Files</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIEDSourceFiles()
     * @generated
     * @ordered
     */
    protected IEDSourceFiles iedSourceFiles;

    /**
     * This is true if the IED Source Files containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iedSourceFilesESet;

    /**
     * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabels()
     * @generated
     * @ordered
     */
    protected Labels labels;

    /**
     * This is true if the Labels containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean labelsESet;

    /**
     * The cached value of the '{@link #getMinRequestedSCDFiles() <em>Min Requested SCD Files</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinRequestedSCDFiles()
     * @generated
     * @ordered
     */
    protected MinRequestedSCDFiles minRequestedSCDFiles;

    /**
     * This is true if the Min Requested SCD Files containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minRequestedSCDFilesESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IEDImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getIED();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUuid() {
        return uuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUuid( String newUuid ) {
        String oldUuid = uuid;
        uuid = newUuid;
        boolean oldUuidESet = uuidESet;
        uuidESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED__UUID, oldUuid, uuid,
                    !oldUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUuid() {
        String oldUuid = uuid;
        boolean oldUuidESet = uuidESet;
        uuid = UUID_EDEFAULT;
        uuidESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED__UUID, oldUuid, UUID_EDEFAULT,
                    oldUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUuid() {
        return uuidESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTemplateUuid() {
        return templateUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTemplateUuid( String newTemplateUuid ) {
        String oldTemplateUuid = templateUuid;
        templateUuid = newTemplateUuid;
        boolean oldTemplateUuidESet = templateUuidESet;
        templateUuidESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED__TEMPLATE_UUID, oldTemplateUuid,
                    templateUuid, !oldTemplateUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTemplateUuid() {
        String oldTemplateUuid = templateUuid;
        boolean oldTemplateUuidESet = templateUuidESet;
        templateUuid = TEMPLATE_UUID_EDEFAULT;
        templateUuidESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED__TEMPLATE_UUID, oldTemplateUuid,
                    TEMPLATE_UUID_EDEFAULT, oldTemplateUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTemplateUuid() {
        return templateUuidESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getConfigVersion() {
        return configVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConfigVersion( String newConfigVersion ) {
        String oldConfigVersion = configVersion;
        configVersion = newConfigVersion;
        boolean oldConfigVersionESet = configVersionESet;
        configVersionESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED__CONFIG_VERSION, oldConfigVersion,
                    configVersion, !oldConfigVersionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConfigVersion() {
        String oldConfigVersion = configVersion;
        boolean oldConfigVersionESet = configVersionESet;
        configVersion = CONFIG_VERSION_EDEFAULT;
        configVersionESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED__CONFIG_VERSION, oldConfigVersion,
                    CONFIG_VERSION_EDEFAULT, oldConfigVersionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConfigVersion() {
        return configVersionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getEngRight() {
        return engRight;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEngRight( String newEngRight ) {
        String oldEngRight = engRight;
        engRight = newEngRight;
        boolean oldEngRightESet = engRightESet;
        engRightESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED__ENG_RIGHT, oldEngRight, engRight,
                    !oldEngRightESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEngRight() {
        String oldEngRight = engRight;
        boolean oldEngRightESet = engRightESet;
        engRight = ENG_RIGHT_EDEFAULT;
        engRightESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED__ENG_RIGHT, oldEngRight,
                    ENG_RIGHT_EDEFAULT, oldEngRightESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEngRight() {
        return engRightESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setManufacturer( String newManufacturer ) {
        String oldManufacturer = manufacturer;
        manufacturer = newManufacturer;
        boolean oldManufacturerESet = manufacturerESet;
        manufacturerESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED__MANUFACTURER, oldManufacturer,
                    manufacturer, !oldManufacturerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetManufacturer() {
        String oldManufacturer = manufacturer;
        boolean oldManufacturerESet = manufacturerESet;
        manufacturer = MANUFACTURER_EDEFAULT;
        manufacturerESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED__MANUFACTURER, oldManufacturer,
                    MANUFACTURER_EDEFAULT, oldManufacturerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetManufacturer() {
        return manufacturerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOriginalSclRevision() {
        return originalSclRevision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOriginalSclRevision( String newOriginalSclRevision ) {
        String oldOriginalSclRevision = originalSclRevision;
        originalSclRevision = newOriginalSclRevision;
        boolean oldOriginalSclRevisionESet = originalSclRevisionESet;
        originalSclRevisionESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED__ORIGINAL_SCL_REVISION,
                    oldOriginalSclRevision, originalSclRevision, !oldOriginalSclRevisionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOriginalSclRevision() {
        String oldOriginalSclRevision = originalSclRevision;
        boolean oldOriginalSclRevisionESet = originalSclRevisionESet;
        originalSclRevision = ORIGINAL_SCL_REVISION_EDEFAULT;
        originalSclRevisionESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED__ORIGINAL_SCL_REVISION,
                    oldOriginalSclRevision, ORIGINAL_SCL_REVISION_EDEFAULT, oldOriginalSclRevisionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOriginalSclRevision() {
        return originalSclRevisionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOriginalSclVersion() {
        return originalSclVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOriginalSclVersion( String newOriginalSclVersion ) {
        String oldOriginalSclVersion = originalSclVersion;
        originalSclVersion = newOriginalSclVersion;
        boolean oldOriginalSclVersionESet = originalSclVersionESet;
        originalSclVersionESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED__ORIGINAL_SCL_VERSION,
                    oldOriginalSclVersion, originalSclVersion, !oldOriginalSclVersionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOriginalSclVersion() {
        String oldOriginalSclVersion = originalSclVersion;
        boolean oldOriginalSclVersionESet = originalSclVersionESet;
        originalSclVersion = ORIGINAL_SCL_VERSION_EDEFAULT;
        originalSclVersionESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED__ORIGINAL_SCL_VERSION,
                    oldOriginalSclVersion, ORIGINAL_SCL_VERSION_EDEFAULT, oldOriginalSclVersionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOriginalSclVersion() {
        return originalSclVersionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOwner() {
        return owner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOwner( String newOwner ) {
        String oldOwner = owner;
        owner = newOwner;
        boolean oldOwnerESet = ownerESet;
        ownerESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED__OWNER, oldOwner, owner,
                    !oldOwnerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOwner() {
        String oldOwner = owner;
        boolean oldOwnerESet = ownerESet;
        owner = OWNER_EDEFAULT;
        ownerESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED__OWNER, oldOwner, OWNER_EDEFAULT,
                    oldOwnerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOwner() {
        return ownerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED__TYPE, oldType, type,
                    !oldTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED__TYPE, oldType, TYPE_EDEFAULT,
                    oldTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AccessPoint > getAccessPoint() {
        if( accessPoint == null ) {
            accessPoint = new EObjectContainmentWithInverseEList.Unsettable< >( AccessPoint.class, this,
                    SclPackage.IED__ACCESS_POINT, SclPackage.ACCESS_POINT__PARENT_IED );
        }
        return accessPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAccessPoint() {
        if( accessPoint != null ) {
            ( ( InternalEList.Unsettable< ? > ) accessPoint ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccessPoint() {
        return accessPoint != null && ( ( InternalEList.Unsettable< ? > ) accessPoint ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< KDC > getKDC() {
        if( kdc == null ) {
            kdc = new EObjectContainmentWithInverseEList.Unsettable< >( KDC.class, this, SclPackage.IED__KDC,
                    SclPackage.KDC__PARENT_IED );
        }
        return kdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKDC() {
        if( kdc != null ) {
            ( ( InternalEList.Unsettable< ? > ) kdc ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKDC() {
        return kdc != null && ( ( InternalEList.Unsettable< ? > ) kdc ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Services getServices() {
        return services;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServices( Services newServices, NotificationChain msgs ) {
        Services oldServices = services;
        services = newServices;
        boolean oldServicesESet = servicesESet;
        servicesESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, SclPackage.IED__SERVICES,
                    oldServices, newServices, !oldServicesESet );
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
    public void setServices( Services newServices ) {
        if( newServices != services ) {
            NotificationChain msgs = null;
            if( services != null ) {
                msgs = ( ( InternalEObject ) services ).eInverseRemove( this, SclPackage.SERVICES__PARENT_IED,
                        Services.class, msgs );
            }
            if( newServices != null ) {
                msgs = ( ( InternalEObject ) newServices ).eInverseAdd( this, SclPackage.SERVICES__PARENT_IED,
                        Services.class, msgs );
            }
            msgs = basicSetServices( newServices, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldServicesESet = servicesESet;
            servicesESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED__SERVICES, newServices,
                        newServices, !oldServicesESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetServices( NotificationChain msgs ) {
        Services oldServices = services;
        services = null;
        boolean oldServicesESet = servicesESet;
        servicesESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, SclPackage.IED__SERVICES,
                    oldServices, null, oldServicesESet );
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
    public void unsetServices() {
        if( services != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) services ).eInverseRemove( this, SclPackage.SERVICES__PARENT_IED,
                    Services.class, msgs );
            msgs = basicUnsetServices( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldServicesESet = servicesESet;
            servicesESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED__SERVICES, null, null,
                        oldServicesESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServices() {
        return servicesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SCL getParentSCL() {
        if( eContainerFeatureID() != SclPackage.IED__PARENT_SCL ) {
            return null;
        }
        return ( SCL ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSCL( SCL newParentSCL, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSCL, SclPackage.IED__PARENT_SCL, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSCL( SCL newParentSCL ) {
        if( newParentSCL != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.IED__PARENT_SCL && newParentSCL != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSCL ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentSCL != null ) {
                msgs = ( ( InternalEObject ) newParentSCL ).eInverseAdd( this, SclPackage.SCL__IED, SCL.class, msgs );
            }
            msgs = basicSetParentSCL( newParentSCL, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED__PARENT_SCL, newParentSCL,
                    newParentSCL ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED__NAME, oldName, name,
                    !oldNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED__NAME, oldName, NAME_EDEFAULT,
                    oldNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getOriginalSclRelease() {
        return originalSclRelease;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOriginalSclRelease( Integer newOriginalSclRelease ) {
        Integer oldOriginalSclRelease = originalSclRelease;
        originalSclRelease = newOriginalSclRelease;
        boolean oldOriginalSclReleaseESet = originalSclReleaseESet;
        originalSclReleaseESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED__ORIGINAL_SCL_RELEASE,
                    oldOriginalSclRelease, originalSclRelease, !oldOriginalSclReleaseESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOriginalSclRelease() {
        Integer oldOriginalSclRelease = originalSclRelease;
        boolean oldOriginalSclReleaseESet = originalSclReleaseESet;
        originalSclRelease = ORIGINAL_SCL_RELEASE_EDEFAULT;
        originalSclReleaseESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED__ORIGINAL_SCL_RELEASE,
                    oldOriginalSclRelease, ORIGINAL_SCL_RELEASE_EDEFAULT, oldOriginalSclReleaseESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOriginalSclRelease() {
        return originalSclReleaseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IEDName getReferredByIEDName() {
        return referredByIEDName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReferredByIEDName( IEDName newReferredByIEDName, NotificationChain msgs ) {
        IEDName oldReferredByIEDName = referredByIEDName;
        referredByIEDName = newReferredByIEDName;
        boolean oldReferredByIEDNameESet = referredByIEDNameESet;
        referredByIEDNameESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.IED__REFERRED_BY_IED_NAME, oldReferredByIEDName, newReferredByIEDName,
                    !oldReferredByIEDNameESet );
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
    public void setReferredByIEDName( IEDName newReferredByIEDName ) {
        if( newReferredByIEDName != referredByIEDName ) {
            NotificationChain msgs = null;
            if( referredByIEDName != null ) {
                msgs = ( ( InternalEObject ) referredByIEDName ).eInverseRemove( this,
                        SclPackage.IED_NAME__REFERS_TO_IED, IEDName.class, msgs );
            }
            if( newReferredByIEDName != null ) {
                msgs = ( ( InternalEObject ) newReferredByIEDName ).eInverseAdd( this,
                        SclPackage.IED_NAME__REFERS_TO_IED, IEDName.class, msgs );
            }
            msgs = basicSetReferredByIEDName( newReferredByIEDName, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldReferredByIEDNameESet = referredByIEDNameESet;
            referredByIEDNameESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED__REFERRED_BY_IED_NAME,
                        newReferredByIEDName, newReferredByIEDName, !oldReferredByIEDNameESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReferredByIEDName( NotificationChain msgs ) {
        IEDName oldReferredByIEDName = referredByIEDName;
        referredByIEDName = null;
        boolean oldReferredByIEDNameESet = referredByIEDNameESet;
        referredByIEDNameESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.IED__REFERRED_BY_IED_NAME, oldReferredByIEDName, null, oldReferredByIEDNameESet );
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
    public void unsetReferredByIEDName() {
        if( referredByIEDName != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) referredByIEDName ).eInverseRemove( this, SclPackage.IED_NAME__REFERS_TO_IED,
                    IEDName.class, msgs );
            msgs = basicUnsetReferredByIEDName( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldReferredByIEDNameESet = referredByIEDNameESet;
            referredByIEDNameESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED__REFERRED_BY_IED_NAME, null,
                        null, oldReferredByIEDNameESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByIEDName() {
        return referredByIEDNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IEDSourceFiles getIEDSourceFiles() {
        return iedSourceFiles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIEDSourceFiles( IEDSourceFiles newIEDSourceFiles, NotificationChain msgs ) {
        IEDSourceFiles oldIEDSourceFiles = iedSourceFiles;
        iedSourceFiles = newIEDSourceFiles;
        boolean oldIEDSourceFilesESet = iedSourceFilesESet;
        iedSourceFilesESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.IED__IED_SOURCE_FILES, oldIEDSourceFiles, newIEDSourceFiles, !oldIEDSourceFilesESet );
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
    public void setIEDSourceFiles( IEDSourceFiles newIEDSourceFiles ) {
        if( newIEDSourceFiles != iedSourceFiles ) {
            NotificationChain msgs = null;
            if( iedSourceFiles != null ) {
                msgs = ( ( InternalEObject ) iedSourceFiles ).eInverseRemove( this,
                        SclPackage.IED_SOURCE_FILES__PARENT_IED, IEDSourceFiles.class, msgs );
            }
            if( newIEDSourceFiles != null ) {
                msgs = ( ( InternalEObject ) newIEDSourceFiles ).eInverseAdd( this,
                        SclPackage.IED_SOURCE_FILES__PARENT_IED, IEDSourceFiles.class, msgs );
            }
            msgs = basicSetIEDSourceFiles( newIEDSourceFiles, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldIEDSourceFilesESet = iedSourceFilesESet;
            iedSourceFilesESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED__IED_SOURCE_FILES,
                        newIEDSourceFiles, newIEDSourceFiles, !oldIEDSourceFilesESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetIEDSourceFiles( NotificationChain msgs ) {
        IEDSourceFiles oldIEDSourceFiles = iedSourceFiles;
        iedSourceFiles = null;
        boolean oldIEDSourceFilesESet = iedSourceFilesESet;
        iedSourceFilesESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.IED__IED_SOURCE_FILES, oldIEDSourceFiles, null, oldIEDSourceFilesESet );
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
    public void unsetIEDSourceFiles() {
        if( iedSourceFiles != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) iedSourceFiles ).eInverseRemove( this, SclPackage.IED_SOURCE_FILES__PARENT_IED,
                    IEDSourceFiles.class, msgs );
            msgs = basicUnsetIEDSourceFiles( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldIEDSourceFilesESet = iedSourceFilesESet;
            iedSourceFilesESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED__IED_SOURCE_FILES, null, null,
                        oldIEDSourceFilesESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIEDSourceFiles() {
        return iedSourceFilesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Labels getLabels() {
        return labels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLabels( Labels newLabels, NotificationChain msgs ) {
        Labels oldLabels = labels;
        labels = newLabels;
        boolean oldLabelsESet = labelsESet;
        labelsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, SclPackage.IED__LABELS,
                    oldLabels, newLabels, !oldLabelsESet );
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
    public void setLabels( Labels newLabels ) {
        if( newLabels != labels ) {
            NotificationChain msgs = null;
            if( labels != null ) {
                msgs = ( ( InternalEObject ) labels ).eInverseRemove( this, SclPackage.LABELS__PARENT_IED, Labels.class,
                        msgs );
            }
            if( newLabels != null ) {
                msgs = ( ( InternalEObject ) newLabels ).eInverseAdd( this, SclPackage.LABELS__PARENT_IED, Labels.class,
                        msgs );
            }
            msgs = basicSetLabels( newLabels, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldLabelsESet = labelsESet;
            labelsESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED__LABELS, newLabels, newLabels,
                        !oldLabelsESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLabels( NotificationChain msgs ) {
        Labels oldLabels = labels;
        labels = null;
        boolean oldLabelsESet = labelsESet;
        labelsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, SclPackage.IED__LABELS,
                    oldLabels, null, oldLabelsESet );
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
    public void unsetLabels() {
        if( labels != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) labels ).eInverseRemove( this, SclPackage.LABELS__PARENT_IED, Labels.class,
                    msgs );
            msgs = basicUnsetLabels( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldLabelsESet = labelsESet;
            labelsESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED__LABELS, null, null,
                        oldLabelsESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLabels() {
        return labelsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MinRequestedSCDFiles getMinRequestedSCDFiles() {
        return minRequestedSCDFiles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMinRequestedSCDFiles( MinRequestedSCDFiles newMinRequestedSCDFiles,
            NotificationChain msgs ) {
        MinRequestedSCDFiles oldMinRequestedSCDFiles = minRequestedSCDFiles;
        minRequestedSCDFiles = newMinRequestedSCDFiles;
        boolean oldMinRequestedSCDFilesESet = minRequestedSCDFilesESet;
        minRequestedSCDFilesESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.IED__MIN_REQUESTED_SCD_FILES, oldMinRequestedSCDFiles, newMinRequestedSCDFiles,
                    !oldMinRequestedSCDFilesESet );
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
    public void setMinRequestedSCDFiles( MinRequestedSCDFiles newMinRequestedSCDFiles ) {
        if( newMinRequestedSCDFiles != minRequestedSCDFiles ) {
            NotificationChain msgs = null;
            if( minRequestedSCDFiles != null ) {
                msgs = ( ( InternalEObject ) minRequestedSCDFiles ).eInverseRemove( this,
                        SclPackage.MIN_REQUESTED_SCD_FILES__PARENT_IED, MinRequestedSCDFiles.class, msgs );
            }
            if( newMinRequestedSCDFiles != null ) {
                msgs = ( ( InternalEObject ) newMinRequestedSCDFiles ).eInverseAdd( this,
                        SclPackage.MIN_REQUESTED_SCD_FILES__PARENT_IED, MinRequestedSCDFiles.class, msgs );
            }
            msgs = basicSetMinRequestedSCDFiles( newMinRequestedSCDFiles, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldMinRequestedSCDFilesESet = minRequestedSCDFilesESet;
            minRequestedSCDFilesESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED__MIN_REQUESTED_SCD_FILES,
                        newMinRequestedSCDFiles, newMinRequestedSCDFiles, !oldMinRequestedSCDFilesESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMinRequestedSCDFiles( NotificationChain msgs ) {
        MinRequestedSCDFiles oldMinRequestedSCDFiles = minRequestedSCDFiles;
        minRequestedSCDFiles = null;
        boolean oldMinRequestedSCDFilesESet = minRequestedSCDFilesESet;
        minRequestedSCDFilesESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.IED__MIN_REQUESTED_SCD_FILES, oldMinRequestedSCDFiles, null,
                    oldMinRequestedSCDFilesESet );
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
    public void unsetMinRequestedSCDFiles() {
        if( minRequestedSCDFiles != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) minRequestedSCDFiles ).eInverseRemove( this,
                    SclPackage.MIN_REQUESTED_SCD_FILES__PARENT_IED, MinRequestedSCDFiles.class, msgs );
            msgs = basicUnsetMinRequestedSCDFiles( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldMinRequestedSCDFilesESet = minRequestedSCDFilesESet;
            minRequestedSCDFilesESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED__MIN_REQUESTED_SCD_FILES, null,
                        null, oldMinRequestedSCDFilesESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinRequestedSCDFiles() {
        return minRequestedSCDFilesESet;
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
        case SclPackage.IED__ACCESS_POINT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAccessPoint() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.IED__KDC:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getKDC() ).basicAdd( otherEnd, msgs );
        case SclPackage.IED__SERVICES:
            if( services != null ) {
                msgs = ( ( InternalEObject ) services ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.IED__SERVICES, null, msgs );
            }
            return basicSetServices( ( Services ) otherEnd, msgs );
        case SclPackage.IED__PARENT_SCL:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSCL( ( SCL ) otherEnd, msgs );
        case SclPackage.IED__REFERRED_BY_IED_NAME:
            if( referredByIEDName != null ) {
                msgs = ( ( InternalEObject ) referredByIEDName ).eInverseRemove( this,
                        SclPackage.IED_NAME__REFERS_TO_IED, IEDName.class, msgs );
            }
            return basicSetReferredByIEDName( ( IEDName ) otherEnd, msgs );
        case SclPackage.IED__IED_SOURCE_FILES:
            if( iedSourceFiles != null ) {
                msgs = ( ( InternalEObject ) iedSourceFiles ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.IED__IED_SOURCE_FILES, null, msgs );
            }
            return basicSetIEDSourceFiles( ( IEDSourceFiles ) otherEnd, msgs );
        case SclPackage.IED__LABELS:
            if( labels != null ) {
                msgs = ( ( InternalEObject ) labels ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.IED__LABELS, null, msgs );
            }
            return basicSetLabels( ( Labels ) otherEnd, msgs );
        case SclPackage.IED__MIN_REQUESTED_SCD_FILES:
            if( minRequestedSCDFiles != null ) {
                msgs = ( ( InternalEObject ) minRequestedSCDFiles ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.IED__MIN_REQUESTED_SCD_FILES, null, msgs );
            }
            return basicSetMinRequestedSCDFiles( ( MinRequestedSCDFiles ) otherEnd, msgs );
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
        case SclPackage.IED__ACCESS_POINT:
            return ( ( InternalEList< ? > ) getAccessPoint() ).basicRemove( otherEnd, msgs );
        case SclPackage.IED__KDC:
            return ( ( InternalEList< ? > ) getKDC() ).basicRemove( otherEnd, msgs );
        case SclPackage.IED__SERVICES:
            return basicUnsetServices( msgs );
        case SclPackage.IED__PARENT_SCL:
            return basicSetParentSCL( null, msgs );
        case SclPackage.IED__REFERRED_BY_IED_NAME:
            return basicUnsetReferredByIEDName( msgs );
        case SclPackage.IED__IED_SOURCE_FILES:
            return basicUnsetIEDSourceFiles( msgs );
        case SclPackage.IED__LABELS:
            return basicUnsetLabels( msgs );
        case SclPackage.IED__MIN_REQUESTED_SCD_FILES:
            return basicUnsetMinRequestedSCDFiles( msgs );
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
        case SclPackage.IED__PARENT_SCL:
            return eInternalContainer().eInverseRemove( this, SclPackage.SCL__IED, SCL.class, msgs );
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
        case SclPackage.IED__UUID:
            return getUuid();
        case SclPackage.IED__TEMPLATE_UUID:
            return getTemplateUuid();
        case SclPackage.IED__CONFIG_VERSION:
            return getConfigVersion();
        case SclPackage.IED__ENG_RIGHT:
            return getEngRight();
        case SclPackage.IED__MANUFACTURER:
            return getManufacturer();
        case SclPackage.IED__ORIGINAL_SCL_REVISION:
            return getOriginalSclRevision();
        case SclPackage.IED__ORIGINAL_SCL_VERSION:
            return getOriginalSclVersion();
        case SclPackage.IED__OWNER:
            return getOwner();
        case SclPackage.IED__TYPE:
            return getType();
        case SclPackage.IED__ACCESS_POINT:
            return getAccessPoint();
        case SclPackage.IED__KDC:
            return getKDC();
        case SclPackage.IED__SERVICES:
            return getServices();
        case SclPackage.IED__PARENT_SCL:
            return getParentSCL();
        case SclPackage.IED__NAME:
            return getName();
        case SclPackage.IED__ORIGINAL_SCL_RELEASE:
            return getOriginalSclRelease();
        case SclPackage.IED__REFERRED_BY_IED_NAME:
            return getReferredByIEDName();
        case SclPackage.IED__IED_SOURCE_FILES:
            return getIEDSourceFiles();
        case SclPackage.IED__LABELS:
            return getLabels();
        case SclPackage.IED__MIN_REQUESTED_SCD_FILES:
            return getMinRequestedSCDFiles();
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
        case SclPackage.IED__UUID:
            setUuid( ( String ) newValue );
            return;
        case SclPackage.IED__TEMPLATE_UUID:
            setTemplateUuid( ( String ) newValue );
            return;
        case SclPackage.IED__CONFIG_VERSION:
            setConfigVersion( ( String ) newValue );
            return;
        case SclPackage.IED__ENG_RIGHT:
            setEngRight( ( String ) newValue );
            return;
        case SclPackage.IED__MANUFACTURER:
            setManufacturer( ( String ) newValue );
            return;
        case SclPackage.IED__ORIGINAL_SCL_REVISION:
            setOriginalSclRevision( ( String ) newValue );
            return;
        case SclPackage.IED__ORIGINAL_SCL_VERSION:
            setOriginalSclVersion( ( String ) newValue );
            return;
        case SclPackage.IED__OWNER:
            setOwner( ( String ) newValue );
            return;
        case SclPackage.IED__TYPE:
            setType( ( String ) newValue );
            return;
        case SclPackage.IED__ACCESS_POINT:
            getAccessPoint().clear();
            getAccessPoint().addAll( ( Collection< ? extends AccessPoint > ) newValue );
            return;
        case SclPackage.IED__KDC:
            getKDC().clear();
            getKDC().addAll( ( Collection< ? extends KDC > ) newValue );
            return;
        case SclPackage.IED__SERVICES:
            setServices( ( Services ) newValue );
            return;
        case SclPackage.IED__PARENT_SCL:
            setParentSCL( ( SCL ) newValue );
            return;
        case SclPackage.IED__NAME:
            setName( ( String ) newValue );
            return;
        case SclPackage.IED__ORIGINAL_SCL_RELEASE:
            setOriginalSclRelease( ( Integer ) newValue );
            return;
        case SclPackage.IED__REFERRED_BY_IED_NAME:
            setReferredByIEDName( ( IEDName ) newValue );
            return;
        case SclPackage.IED__IED_SOURCE_FILES:
            setIEDSourceFiles( ( IEDSourceFiles ) newValue );
            return;
        case SclPackage.IED__LABELS:
            setLabels( ( Labels ) newValue );
            return;
        case SclPackage.IED__MIN_REQUESTED_SCD_FILES:
            setMinRequestedSCDFiles( ( MinRequestedSCDFiles ) newValue );
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
        case SclPackage.IED__UUID:
            unsetUuid();
            return;
        case SclPackage.IED__TEMPLATE_UUID:
            unsetTemplateUuid();
            return;
        case SclPackage.IED__CONFIG_VERSION:
            unsetConfigVersion();
            return;
        case SclPackage.IED__ENG_RIGHT:
            unsetEngRight();
            return;
        case SclPackage.IED__MANUFACTURER:
            unsetManufacturer();
            return;
        case SclPackage.IED__ORIGINAL_SCL_REVISION:
            unsetOriginalSclRevision();
            return;
        case SclPackage.IED__ORIGINAL_SCL_VERSION:
            unsetOriginalSclVersion();
            return;
        case SclPackage.IED__OWNER:
            unsetOwner();
            return;
        case SclPackage.IED__TYPE:
            unsetType();
            return;
        case SclPackage.IED__ACCESS_POINT:
            unsetAccessPoint();
            return;
        case SclPackage.IED__KDC:
            unsetKDC();
            return;
        case SclPackage.IED__SERVICES:
            unsetServices();
            return;
        case SclPackage.IED__PARENT_SCL:
            setParentSCL( ( SCL ) null );
            return;
        case SclPackage.IED__NAME:
            unsetName();
            return;
        case SclPackage.IED__ORIGINAL_SCL_RELEASE:
            unsetOriginalSclRelease();
            return;
        case SclPackage.IED__REFERRED_BY_IED_NAME:
            unsetReferredByIEDName();
            return;
        case SclPackage.IED__IED_SOURCE_FILES:
            unsetIEDSourceFiles();
            return;
        case SclPackage.IED__LABELS:
            unsetLabels();
            return;
        case SclPackage.IED__MIN_REQUESTED_SCD_FILES:
            unsetMinRequestedSCDFiles();
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
        case SclPackage.IED__UUID:
            return isSetUuid();
        case SclPackage.IED__TEMPLATE_UUID:
            return isSetTemplateUuid();
        case SclPackage.IED__CONFIG_VERSION:
            return isSetConfigVersion();
        case SclPackage.IED__ENG_RIGHT:
            return isSetEngRight();
        case SclPackage.IED__MANUFACTURER:
            return isSetManufacturer();
        case SclPackage.IED__ORIGINAL_SCL_REVISION:
            return isSetOriginalSclRevision();
        case SclPackage.IED__ORIGINAL_SCL_VERSION:
            return isSetOriginalSclVersion();
        case SclPackage.IED__OWNER:
            return isSetOwner();
        case SclPackage.IED__TYPE:
            return isSetType();
        case SclPackage.IED__ACCESS_POINT:
            return isSetAccessPoint();
        case SclPackage.IED__KDC:
            return isSetKDC();
        case SclPackage.IED__SERVICES:
            return isSetServices();
        case SclPackage.IED__PARENT_SCL:
            return getParentSCL() != null;
        case SclPackage.IED__NAME:
            return isSetName();
        case SclPackage.IED__ORIGINAL_SCL_RELEASE:
            return isSetOriginalSclRelease();
        case SclPackage.IED__REFERRED_BY_IED_NAME:
            return isSetReferredByIEDName();
        case SclPackage.IED__IED_SOURCE_FILES:
            return isSetIEDSourceFiles();
        case SclPackage.IED__LABELS:
            return isSetLabels();
        case SclPackage.IED__MIN_REQUESTED_SCD_FILES:
            return isSetMinRequestedSCDFiles();
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
        if( baseClass == AgUuid.class ) {
            switch( derivedFeatureID ) {
            case SclPackage.IED__UUID:
                return SclPackage.AG_UUID__UUID;
            case SclPackage.IED__TEMPLATE_UUID:
                return SclPackage.AG_UUID__TEMPLATE_UUID;
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
        if( baseClass == AgUuid.class ) {
            switch( baseFeatureID ) {
            case SclPackage.AG_UUID__UUID:
                return SclPackage.IED__UUID;
            case SclPackage.AG_UUID__TEMPLATE_UUID:
                return SclPackage.IED__TEMPLATE_UUID;
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
        result.append( " (uuid: " );
        if( uuidESet ) {
            result.append( uuid );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", templateUuid: " );
        if( templateUuidESet ) {
            result.append( templateUuid );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", configVersion: " );
        if( configVersionESet ) {
            result.append( configVersion );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", engRight: " );
        if( engRightESet ) {
            result.append( engRight );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", manufacturer: " );
        if( manufacturerESet ) {
            result.append( manufacturer );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", originalSclRevision: " );
        if( originalSclRevisionESet ) {
            result.append( originalSclRevision );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", originalSclVersion: " );
        if( originalSclVersionESet ) {
            result.append( originalSclVersion );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", owner: " );
        if( ownerESet ) {
            result.append( owner );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", type: " );
        if( typeESet ) {
            result.append( type );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", name: " );
        if( nameESet ) {
            result.append( name );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", originalSclRelease: " );
        if( originalSclReleaseESet ) {
            result.append( originalSclRelease );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    @Override
    public String getXpath() {
        if( getParentSCL().getIED().size() == 1 ) {
            return getParentSCL().getXpath() + "/scl:IED";
        }
        return getParentSCL().getXpath() + "/scl:IED[@name='" + getName() + "']";
    }

} //IEDImpl
