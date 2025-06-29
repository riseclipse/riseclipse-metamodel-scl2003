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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Handling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FileHandlingImpl#getFtp <em>Ftp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FileHandlingImpl#getFtps <em>Ftps</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FileHandlingImpl#getMms <em>Mms</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FileHandlingImpl#getParentServices <em>Parent Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileHandlingImpl extends SclObjectImpl implements FileHandling {
    /**
     * The default value of the '{@link #getFtp() <em>Ftp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFtp()
     * @generated
     * @ordered
     */
    protected static final Boolean FTP_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getFtp() <em>Ftp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFtp()
     * @generated
     * @ordered
     */
    protected Boolean ftp = FTP_EDEFAULT;

    /**
     * This is true if the Ftp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ftpESet;

    /**
     * The default value of the '{@link #getFtps() <em>Ftps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFtps()
     * @generated
     * @ordered
     */
    protected static final Boolean FTPS_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getFtps() <em>Ftps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFtps()
     * @generated
     * @ordered
     */
    protected Boolean ftps = FTPS_EDEFAULT;

    /**
     * This is true if the Ftps attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ftpsESet;

    /**
     * The default value of the '{@link #getMms() <em>Mms</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMms()
     * @generated
     * @ordered
     */
    protected static final Boolean MMS_EDEFAULT = Boolean.TRUE;

    /**
     * The cached value of the '{@link #getMms() <em>Mms</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMms()
     * @generated
     * @ordered
     */
    protected Boolean mms = MMS_EDEFAULT;

    /**
     * This is true if the Mms attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mmsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FileHandlingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getFileHandling();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getFtp() {
        return ftp;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFtp( Boolean newFtp ) {
        Boolean oldFtp = ftp;
        ftp = newFtp;
        boolean oldFtpESet = ftpESet;
        ftpESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.FILE_HANDLING__FTP, oldFtp, ftp,
                    !oldFtpESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFtp() {
        Boolean oldFtp = ftp;
        boolean oldFtpESet = ftpESet;
        ftp = FTP_EDEFAULT;
        ftpESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.FILE_HANDLING__FTP, oldFtp,
                    FTP_EDEFAULT, oldFtpESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFtp() {
        return ftpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getFtps() {
        return ftps;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFtps( Boolean newFtps ) {
        Boolean oldFtps = ftps;
        ftps = newFtps;
        boolean oldFtpsESet = ftpsESet;
        ftpsESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.FILE_HANDLING__FTPS, oldFtps, ftps,
                    !oldFtpsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFtps() {
        Boolean oldFtps = ftps;
        boolean oldFtpsESet = ftpsESet;
        ftps = FTPS_EDEFAULT;
        ftpsESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.FILE_HANDLING__FTPS, oldFtps,
                    FTPS_EDEFAULT, oldFtpsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFtps() {
        return ftpsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMms() {
        return mms;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMms( Boolean newMms ) {
        Boolean oldMms = mms;
        mms = newMms;
        boolean oldMmsESet = mmsESet;
        mmsESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.FILE_HANDLING__MMS, oldMms, mms,
                    !oldMmsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMms() {
        Boolean oldMms = mms;
        boolean oldMmsESet = mmsESet;
        mms = MMS_EDEFAULT;
        mmsESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.FILE_HANDLING__MMS, oldMms,
                    MMS_EDEFAULT, oldMmsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMms() {
        return mmsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Services getParentServices() {
        if( eContainerFeatureID() != SclPackage.FILE_HANDLING__PARENT_SERVICES ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServices, SclPackage.FILE_HANDLING__PARENT_SERVICES,
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
                || ( eContainerFeatureID() != SclPackage.FILE_HANDLING__PARENT_SERVICES
                        && newParentServices != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServices ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentServices != null ) {
                msgs = ( ( InternalEObject ) newParentServices ).eInverseAdd( this, SclPackage.SERVICES__FILE_HANDLING,
                        Services.class, msgs );
            }
            msgs = basicSetParentServices( newParentServices, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.FILE_HANDLING__PARENT_SERVICES,
                    newParentServices, newParentServices ) );
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
        case SclPackage.FILE_HANDLING__PARENT_SERVICES:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentServices( ( Services ) otherEnd, msgs );
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
        case SclPackage.FILE_HANDLING__PARENT_SERVICES:
            return basicSetParentServices( null, msgs );
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
        case SclPackage.FILE_HANDLING__PARENT_SERVICES:
            return eInternalContainer().eInverseRemove( this, SclPackage.SERVICES__FILE_HANDLING, Services.class,
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
        case SclPackage.FILE_HANDLING__FTP:
            return getFtp();
        case SclPackage.FILE_HANDLING__FTPS:
            return getFtps();
        case SclPackage.FILE_HANDLING__MMS:
            return getMms();
        case SclPackage.FILE_HANDLING__PARENT_SERVICES:
            return getParentServices();
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
        case SclPackage.FILE_HANDLING__FTP:
            setFtp( ( Boolean ) newValue );
            return;
        case SclPackage.FILE_HANDLING__FTPS:
            setFtps( ( Boolean ) newValue );
            return;
        case SclPackage.FILE_HANDLING__MMS:
            setMms( ( Boolean ) newValue );
            return;
        case SclPackage.FILE_HANDLING__PARENT_SERVICES:
            setParentServices( ( Services ) newValue );
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
        case SclPackage.FILE_HANDLING__FTP:
            unsetFtp();
            return;
        case SclPackage.FILE_HANDLING__FTPS:
            unsetFtps();
            return;
        case SclPackage.FILE_HANDLING__MMS:
            unsetMms();
            return;
        case SclPackage.FILE_HANDLING__PARENT_SERVICES:
            setParentServices( ( Services ) null );
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
        case SclPackage.FILE_HANDLING__FTP:
            return isSetFtp();
        case SclPackage.FILE_HANDLING__FTPS:
            return isSetFtps();
        case SclPackage.FILE_HANDLING__MMS:
            return isSetMms();
        case SclPackage.FILE_HANDLING__PARENT_SERVICES:
            return getParentServices() != null;
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
        result.append( " (ftp: " );
        if( ftpESet ) {
            result.append( ftp );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", ftps: " );
        if( ftpsESet ) {
            result.append( ftps );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", mms: " );
        if( mmsESet ) {
            result.append( mms );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    @Override
    public String getXpath() {
        return getParentServices().getXpath() + "/scl:FileHandling";
    }

} //FileHandlingImpl
