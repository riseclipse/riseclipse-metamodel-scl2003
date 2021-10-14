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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IssuerName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Subject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Certificate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CertificateImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CertificateImpl#getXferNumber <em>Xfer Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CertificateImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CertificateImpl#getIssuerName <em>Issuer Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CertificateImpl extends NamingImpl implements Certificate {
    /**
     * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSerialNumber()
     * @generated
     * @ordered
     */
    protected static final String SERIAL_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSerialNumber()
     * @generated
     * @ordered
     */
    protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

    /**
     * This is true if the Serial Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serialNumberESet;

    /**
     * The default value of the '{@link #getXferNumber() <em>Xfer Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXferNumber()
     * @generated
     * @ordered
     */
    protected static final Integer XFER_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXferNumber() <em>Xfer Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXferNumber()
     * @generated
     * @ordered
     */
    protected Integer xferNumber = XFER_NUMBER_EDEFAULT;

    /**
     * This is true if the Xfer Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xferNumberESet;

    /**
     * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubject()
     * @generated
     * @ordered
     */
    protected Subject subject;

    /**
     * This is true if the Subject containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean subjectESet;

    /**
     * The cached value of the '{@link #getIssuerName() <em>Issuer Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIssuerName()
     * @generated
     * @ordered
     */
    protected IssuerName issuerName;

    /**
     * This is true if the Issuer Name containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean issuerNameESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CertificateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getCertificate();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSerialNumber( String newSerialNumber ) {
        String oldSerialNumber = serialNumber;
        serialNumber = newSerialNumber;
        boolean oldSerialNumberESet = serialNumberESet;
        serialNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CERTIFICATE__SERIAL_NUMBER,
                    oldSerialNumber, serialNumber, !oldSerialNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSerialNumber() {
        String oldSerialNumber = serialNumber;
        boolean oldSerialNumberESet = serialNumberESet;
        serialNumber = SERIAL_NUMBER_EDEFAULT;
        serialNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CERTIFICATE__SERIAL_NUMBER,
                    oldSerialNumber, SERIAL_NUMBER_EDEFAULT, oldSerialNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSerialNumber() {
        return serialNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getXferNumber() {
        return xferNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXferNumber( Integer newXferNumber ) {
        Integer oldXferNumber = xferNumber;
        xferNumber = newXferNumber;
        boolean oldXferNumberESet = xferNumberESet;
        xferNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CERTIFICATE__XFER_NUMBER, oldXferNumber,
                    xferNumber, !oldXferNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXferNumber() {
        Integer oldXferNumber = xferNumber;
        boolean oldXferNumberESet = xferNumberESet;
        xferNumber = XFER_NUMBER_EDEFAULT;
        xferNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CERTIFICATE__XFER_NUMBER,
                    oldXferNumber, XFER_NUMBER_EDEFAULT, oldXferNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXferNumber() {
        return xferNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Subject getSubject() {
        return subject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubject( Subject newSubject, NotificationChain msgs ) {
        Subject oldSubject = subject;
        subject = newSubject;
        boolean oldSubjectESet = subjectESet;
        subjectESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.CERTIFICATE__SUBJECT, oldSubject, newSubject, !oldSubjectESet );
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
    public void setSubject( Subject newSubject ) {
        if( newSubject != subject ) {
            NotificationChain msgs = null;
            if( subject != null )
                msgs = ( ( InternalEObject ) subject ).eInverseRemove( this, SclPackage.SUBJECT__PARENT_CERTIFICATE,
                        Subject.class, msgs );
            if( newSubject != null )
                msgs = ( ( InternalEObject ) newSubject ).eInverseAdd( this, SclPackage.SUBJECT__PARENT_CERTIFICATE,
                        Subject.class, msgs );
            msgs = basicSetSubject( newSubject, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSubjectESet = subjectESet;
            subjectESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CERTIFICATE__SUBJECT, newSubject,
                        newSubject, !oldSubjectESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSubject( NotificationChain msgs ) {
        Subject oldSubject = subject;
        subject = null;
        boolean oldSubjectESet = subjectESet;
        subjectESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.CERTIFICATE__SUBJECT, oldSubject, null, oldSubjectESet );
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
    public void unsetSubject() {
        if( subject != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) subject ).eInverseRemove( this, SclPackage.SUBJECT__PARENT_CERTIFICATE,
                    Subject.class, msgs );
            msgs = basicUnsetSubject( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSubjectESet = subjectESet;
            subjectESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CERTIFICATE__SUBJECT, null, null,
                        oldSubjectESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubject() {
        return subjectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IssuerName getIssuerName() {
        return issuerName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIssuerName( IssuerName newIssuerName, NotificationChain msgs ) {
        IssuerName oldIssuerName = issuerName;
        issuerName = newIssuerName;
        boolean oldIssuerNameESet = issuerNameESet;
        issuerNameESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.CERTIFICATE__ISSUER_NAME, oldIssuerName, newIssuerName, !oldIssuerNameESet );
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
    public void setIssuerName( IssuerName newIssuerName ) {
        if( newIssuerName != issuerName ) {
            NotificationChain msgs = null;
            if( issuerName != null )
                msgs = ( ( InternalEObject ) issuerName ).eInverseRemove( this,
                        SclPackage.ISSUER_NAME__PARENT_CERTIFICATE, IssuerName.class, msgs );
            if( newIssuerName != null )
                msgs = ( ( InternalEObject ) newIssuerName ).eInverseAdd( this,
                        SclPackage.ISSUER_NAME__PARENT_CERTIFICATE, IssuerName.class, msgs );
            msgs = basicSetIssuerName( newIssuerName, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIssuerNameESet = issuerNameESet;
            issuerNameESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CERTIFICATE__ISSUER_NAME,
                        newIssuerName, newIssuerName, !oldIssuerNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetIssuerName( NotificationChain msgs ) {
        IssuerName oldIssuerName = issuerName;
        issuerName = null;
        boolean oldIssuerNameESet = issuerNameESet;
        issuerNameESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.CERTIFICATE__ISSUER_NAME, oldIssuerName, null, oldIssuerNameESet );
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
    public void unsetIssuerName() {
        if( issuerName != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) issuerName ).eInverseRemove( this, SclPackage.ISSUER_NAME__PARENT_CERTIFICATE,
                    IssuerName.class, msgs );
            msgs = basicUnsetIssuerName( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIssuerNameESet = issuerNameESet;
            issuerNameESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CERTIFICATE__ISSUER_NAME, null,
                        null, oldIssuerNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIssuerName() {
        return issuerNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.CERTIFICATE__SUBJECT:
            if( subject != null )
                msgs = ( ( InternalEObject ) subject ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.CERTIFICATE__SUBJECT, null, msgs );
            return basicSetSubject( ( Subject ) otherEnd, msgs );
        case SclPackage.CERTIFICATE__ISSUER_NAME:
            if( issuerName != null )
                msgs = ( ( InternalEObject ) issuerName ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.CERTIFICATE__ISSUER_NAME, null, msgs );
            return basicSetIssuerName( ( IssuerName ) otherEnd, msgs );
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
        case SclPackage.CERTIFICATE__SUBJECT:
            return basicUnsetSubject( msgs );
        case SclPackage.CERTIFICATE__ISSUER_NAME:
            return basicUnsetIssuerName( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case SclPackage.CERTIFICATE__SERIAL_NUMBER:
            return getSerialNumber();
        case SclPackage.CERTIFICATE__XFER_NUMBER:
            return getXferNumber();
        case SclPackage.CERTIFICATE__SUBJECT:
            return getSubject();
        case SclPackage.CERTIFICATE__ISSUER_NAME:
            return getIssuerName();
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
        case SclPackage.CERTIFICATE__SERIAL_NUMBER:
            setSerialNumber( ( String ) newValue );
            return;
        case SclPackage.CERTIFICATE__XFER_NUMBER:
            setXferNumber( ( Integer ) newValue );
            return;
        case SclPackage.CERTIFICATE__SUBJECT:
            setSubject( ( Subject ) newValue );
            return;
        case SclPackage.CERTIFICATE__ISSUER_NAME:
            setIssuerName( ( IssuerName ) newValue );
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
        case SclPackage.CERTIFICATE__SERIAL_NUMBER:
            unsetSerialNumber();
            return;
        case SclPackage.CERTIFICATE__XFER_NUMBER:
            unsetXferNumber();
            return;
        case SclPackage.CERTIFICATE__SUBJECT:
            unsetSubject();
            return;
        case SclPackage.CERTIFICATE__ISSUER_NAME:
            unsetIssuerName();
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
        case SclPackage.CERTIFICATE__SERIAL_NUMBER:
            return isSetSerialNumber();
        case SclPackage.CERTIFICATE__XFER_NUMBER:
            return isSetXferNumber();
        case SclPackage.CERTIFICATE__SUBJECT:
            return isSetSubject();
        case SclPackage.CERTIFICATE__ISSUER_NAME:
            return isSetIssuerName();
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
        result.append( " (serialNumber: " );
        if( serialNumberESet )
            result.append( serialNumber );
        else
            result.append( "<unset>" );
        result.append( ", xferNumber: " );
        if( xferNumberESet )
            result.append( xferNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CertificateImpl
