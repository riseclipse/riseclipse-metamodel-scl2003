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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Header;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileReference;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SourceFiles;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Files</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SourceFilesImpl#getSclFileReference <em>Scl File Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SourceFilesImpl#getParentHitem <em>Parent Hitem</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SourceFilesImpl#getParentHeader <em>Parent Header</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceFilesImpl extends BaseElementImpl implements SourceFiles {
    /**
     * The cached value of the '{@link #getSclFileReference() <em>Scl File Reference</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSclFileReference()
     * @generated
     * @ordered
     */
    protected EList< SclFileReference > sclFileReference;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SourceFilesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSourceFiles();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SclFileReference > getSclFileReference() {
        if( sclFileReference == null ) {
            sclFileReference = new EObjectContainmentWithInverseEList.Unsettable< >(
                    SclFileReference.class, this, SclPackage.SOURCE_FILES__SCL_FILE_REFERENCE,
                    SclPackage.SCL_FILE_REFERENCE__PARENT_SOURCE_FILES );
        }
        return sclFileReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSclFileReference() {
        if( sclFileReference != null ) {
            ( ( InternalEList.Unsettable< ? > ) sclFileReference ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSclFileReference() {
        return sclFileReference != null && ( ( InternalEList.Unsettable< ? > ) sclFileReference ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Hitem getParentHitem() {
        if( eContainerFeatureID() != SclPackage.SOURCE_FILES__PARENT_HITEM ) {
            return null;
        }
        return ( Hitem ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentHitem( Hitem newParentHitem, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentHitem, SclPackage.SOURCE_FILES__PARENT_HITEM, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentHitem( Hitem newParentHitem ) {
        if( newParentHitem != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SOURCE_FILES__PARENT_HITEM && newParentHitem != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentHitem ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentHitem != null ) {
                msgs = ( ( InternalEObject ) newParentHitem ).eInverseAdd( this, SclPackage.HITEM__SOURCE_FILES,
                        Hitem.class, msgs );
            }
            msgs = basicSetParentHitem( newParentHitem, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SOURCE_FILES__PARENT_HITEM,
                    newParentHitem, newParentHitem ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Header getParentHeader() {
        if( eContainerFeatureID() != SclPackage.SOURCE_FILES__PARENT_HEADER ) {
            return null;
        }
        return ( Header ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentHeader( Header newParentHeader, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentHeader, SclPackage.SOURCE_FILES__PARENT_HEADER, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentHeader( Header newParentHeader ) {
        if( newParentHeader != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SOURCE_FILES__PARENT_HEADER && newParentHeader != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentHeader ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentHeader != null ) {
                msgs = ( ( InternalEObject ) newParentHeader ).eInverseAdd( this, SclPackage.HEADER__SOURCE_FILES,
                        Header.class, msgs );
            }
            msgs = basicSetParentHeader( newParentHeader, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SOURCE_FILES__PARENT_HEADER,
                    newParentHeader, newParentHeader ) );
        }
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
        case SclPackage.SOURCE_FILES__SCL_FILE_REFERENCE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSclFileReference() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.SOURCE_FILES__PARENT_HITEM:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentHitem( ( Hitem ) otherEnd, msgs );
        case SclPackage.SOURCE_FILES__PARENT_HEADER:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentHeader( ( Header ) otherEnd, msgs );
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
        case SclPackage.SOURCE_FILES__SCL_FILE_REFERENCE:
            return ( ( InternalEList< ? > ) getSclFileReference() ).basicRemove( otherEnd, msgs );
        case SclPackage.SOURCE_FILES__PARENT_HITEM:
            return basicSetParentHitem( null, msgs );
        case SclPackage.SOURCE_FILES__PARENT_HEADER:
            return basicSetParentHeader( null, msgs );
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
        case SclPackage.SOURCE_FILES__PARENT_HITEM:
            return eInternalContainer().eInverseRemove( this, SclPackage.HITEM__SOURCE_FILES, Hitem.class, msgs );
        case SclPackage.SOURCE_FILES__PARENT_HEADER:
            return eInternalContainer().eInverseRemove( this, SclPackage.HEADER__SOURCE_FILES, Header.class, msgs );
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
        case SclPackage.SOURCE_FILES__SCL_FILE_REFERENCE:
            return getSclFileReference();
        case SclPackage.SOURCE_FILES__PARENT_HITEM:
            return getParentHitem();
        case SclPackage.SOURCE_FILES__PARENT_HEADER:
            return getParentHeader();
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
        case SclPackage.SOURCE_FILES__SCL_FILE_REFERENCE:
            getSclFileReference().clear();
            getSclFileReference().addAll( ( Collection< ? extends SclFileReference > ) newValue );
            return;
        case SclPackage.SOURCE_FILES__PARENT_HITEM:
            setParentHitem( ( Hitem ) newValue );
            return;
        case SclPackage.SOURCE_FILES__PARENT_HEADER:
            setParentHeader( ( Header ) newValue );
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
        case SclPackage.SOURCE_FILES__SCL_FILE_REFERENCE:
            unsetSclFileReference();
            return;
        case SclPackage.SOURCE_FILES__PARENT_HITEM:
            setParentHitem( ( Hitem ) null );
            return;
        case SclPackage.SOURCE_FILES__PARENT_HEADER:
            setParentHeader( ( Header ) null );
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
        case SclPackage.SOURCE_FILES__SCL_FILE_REFERENCE:
            return isSetSclFileReference();
        case SclPackage.SOURCE_FILES__PARENT_HITEM:
            return getParentHitem() != null;
        case SclPackage.SOURCE_FILES__PARENT_HEADER:
            return getParentHeader() != null;
        }
        return super.eIsSet( featureID );
    }

} //SourceFilesImpl
