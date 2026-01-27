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

import fr.centralesupelec.edf.riseclipse.iec61850.asd.Application;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Scl Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ApplicationSclRefImpl#getSclFileReference <em>Scl File Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ApplicationSclRefImpl#getParentApplication <em>Parent Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationSclRefImpl extends BaseExtensionElementImpl implements ApplicationSclRef {
    /**
     * The cached value of the '{@link #getSclFileReference() <em>Scl File Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSclFileReference()
     * @generated
     * @ordered
     */
    protected SclFileUUIDReference sclFileReference;

    /**
     * This is true if the Scl File Reference containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sclFileReferenceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ApplicationSclRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getApplicationSclRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SclFileUUIDReference getSclFileReference() {
        return sclFileReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSclFileReference( SclFileUUIDReference newSclFileReference,
            NotificationChain msgs ) {
        SclFileUUIDReference oldSclFileReference = sclFileReference;
        sclFileReference = newSclFileReference;
        boolean oldSclFileReferenceESet = sclFileReferenceESet;
        sclFileReferenceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.APPLICATION_SCL_REF__SCL_FILE_REFERENCE, oldSclFileReference, newSclFileReference,
                    !oldSclFileReferenceESet );
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
    public void setSclFileReference( SclFileUUIDReference newSclFileReference ) {
        if( newSclFileReference != sclFileReference ) {
            NotificationChain msgs = null;
            if( sclFileReference != null ) {
                msgs = ( ( InternalEObject ) sclFileReference ).eInverseRemove( this,
                        SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_APPLICATION_SCL_REF, SclFileUUIDReference.class,
                        msgs );
            }
            if( newSclFileReference != null ) {
                msgs = ( ( InternalEObject ) newSclFileReference ).eInverseAdd( this,
                        SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_APPLICATION_SCL_REF, SclFileUUIDReference.class,
                        msgs );
            }
            msgs = basicSetSclFileReference( newSclFileReference, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldSclFileReferenceESet = sclFileReferenceESet;
            sclFileReferenceESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.APPLICATION_SCL_REF__SCL_FILE_REFERENCE, newSclFileReference, newSclFileReference,
                        !oldSclFileReferenceESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSclFileReference( NotificationChain msgs ) {
        SclFileUUIDReference oldSclFileReference = sclFileReference;
        sclFileReference = null;
        boolean oldSclFileReferenceESet = sclFileReferenceESet;
        sclFileReferenceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.APPLICATION_SCL_REF__SCL_FILE_REFERENCE, oldSclFileReference, null,
                    oldSclFileReferenceESet );
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
    public void unsetSclFileReference() {
        if( sclFileReference != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) sclFileReference ).eInverseRemove( this,
                    SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_APPLICATION_SCL_REF, SclFileUUIDReference.class, msgs );
            msgs = basicUnsetSclFileReference( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldSclFileReferenceESet = sclFileReferenceESet;
            sclFileReferenceESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.APPLICATION_SCL_REF__SCL_FILE_REFERENCE, null, null, oldSclFileReferenceESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSclFileReference() {
        return sclFileReferenceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Application getParentApplication() {
        if( eContainerFeatureID() != AsdPackage.APPLICATION_SCL_REF__PARENT_APPLICATION ) {
            return null;
        }
        return ( Application ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentApplication( Application newParentApplication, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentApplication,
                AsdPackage.APPLICATION_SCL_REF__PARENT_APPLICATION, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentApplication( Application newParentApplication ) {
        if( newParentApplication != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.APPLICATION_SCL_REF__PARENT_APPLICATION
                        && newParentApplication != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentApplication ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentApplication != null ) {
                msgs = ( ( InternalEObject ) newParentApplication ).eInverseAdd( this,
                        AsdPackage.APPLICATION__APPLICATION_SCL_REF, Application.class, msgs );
            }
            msgs = basicSetParentApplication( newParentApplication, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.APPLICATION_SCL_REF__PARENT_APPLICATION,
                    newParentApplication, newParentApplication ) );
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
        case AsdPackage.APPLICATION_SCL_REF__SCL_FILE_REFERENCE:
            if( sclFileReference != null ) {
                msgs = ( ( InternalEObject ) sclFileReference ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.APPLICATION_SCL_REF__SCL_FILE_REFERENCE, null, msgs );
            }
            return basicSetSclFileReference( ( SclFileUUIDReference ) otherEnd, msgs );
        case AsdPackage.APPLICATION_SCL_REF__PARENT_APPLICATION:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentApplication( ( Application ) otherEnd, msgs );
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
        case AsdPackage.APPLICATION_SCL_REF__SCL_FILE_REFERENCE:
            return basicUnsetSclFileReference( msgs );
        case AsdPackage.APPLICATION_SCL_REF__PARENT_APPLICATION:
            return basicSetParentApplication( null, msgs );
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
        case AsdPackage.APPLICATION_SCL_REF__PARENT_APPLICATION:
            return eInternalContainer().eInverseRemove( this, AsdPackage.APPLICATION__APPLICATION_SCL_REF,
                    Application.class, msgs );
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
        case AsdPackage.APPLICATION_SCL_REF__SCL_FILE_REFERENCE:
            return getSclFileReference();
        case AsdPackage.APPLICATION_SCL_REF__PARENT_APPLICATION:
            return getParentApplication();
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
        case AsdPackage.APPLICATION_SCL_REF__SCL_FILE_REFERENCE:
            setSclFileReference( ( SclFileUUIDReference ) newValue );
            return;
        case AsdPackage.APPLICATION_SCL_REF__PARENT_APPLICATION:
            setParentApplication( ( Application ) newValue );
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
        case AsdPackage.APPLICATION_SCL_REF__SCL_FILE_REFERENCE:
            unsetSclFileReference();
            return;
        case AsdPackage.APPLICATION_SCL_REF__PARENT_APPLICATION:
            setParentApplication( ( Application ) null );
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
        case AsdPackage.APPLICATION_SCL_REF__SCL_FILE_REFERENCE:
            return isSetSclFileReference();
        case AsdPackage.APPLICATION_SCL_REF__PARENT_APPLICATION:
            return getParentApplication() != null;
        }
        return super.eIsSet( featureID );
    }

} //ApplicationSclRefImpl
