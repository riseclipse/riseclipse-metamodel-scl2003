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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC;
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
 * </ul>
 *
 * @generated
 */
public class IEDImpl extends UnNamingImpl implements IED {
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
        result.append( " (configVersion: " );
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
