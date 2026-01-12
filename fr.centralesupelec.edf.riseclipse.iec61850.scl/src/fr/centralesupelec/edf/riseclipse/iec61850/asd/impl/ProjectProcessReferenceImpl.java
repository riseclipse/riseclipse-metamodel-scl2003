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

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.Project;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProjectProcessReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Process Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProjectProcessReferenceImpl#getProcessReference <em>Process Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProjectProcessReferenceImpl#getProcessUuid <em>Process Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProjectProcessReferenceImpl#getParentProject <em>Parent Project</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectProcessReferenceImpl extends BaseExtensionElementWithDescImpl implements ProjectProcessReference {
    /**
     * The default value of the '{@link #getProcessReference() <em>Process Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessReference()
     * @generated
     * @ordered
     */
    protected static final String PROCESS_REFERENCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProcessReference() <em>Process Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessReference()
     * @generated
     * @ordered
     */
    protected String processReference = PROCESS_REFERENCE_EDEFAULT;

    /**
     * The default value of the '{@link #getProcessUuid() <em>Process Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessUuid()
     * @generated
     * @ordered
     */
    protected static final String PROCESS_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProcessUuid() <em>Process Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessUuid()
     * @generated
     * @ordered
     */
    protected String processUuid = PROCESS_UUID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProjectProcessReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getProjectProcessReference();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getProcessReference() {
        return processReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setProcessReference( String newProcessReference ) {
        String oldProcessReference = processReference;
        processReference = newProcessReference;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.PROJECT_PROCESS_REFERENCE__PROCESS_REFERENCE, oldProcessReference, processReference ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getProcessUuid() {
        return processUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setProcessUuid( String newProcessUuid ) {
        String oldProcessUuid = processUuid;
        processUuid = newProcessUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.PROJECT_PROCESS_REFERENCE__PROCESS_UUID,
                    oldProcessUuid, processUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Project getParentProject() {
        if( eContainerFeatureID() != AsdPackage.PROJECT_PROCESS_REFERENCE__PARENT_PROJECT ) {
            return null;
        }
        return ( Project ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentProject( Project newParentProject, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentProject,
                AsdPackage.PROJECT_PROCESS_REFERENCE__PARENT_PROJECT, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentProject( Project newParentProject ) {
        if( newParentProject != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.PROJECT_PROCESS_REFERENCE__PARENT_PROJECT
                        && newParentProject != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentProject ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentProject != null ) {
                msgs = ( ( InternalEObject ) newParentProject ).eInverseAdd( this,
                        AsdPackage.PROJECT__PROJECT_PROCESS_REFERENCE, Project.class, msgs );
            }
            msgs = basicSetParentProject( newParentProject, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.PROJECT_PROCESS_REFERENCE__PARENT_PROJECT, newParentProject, newParentProject ) );
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
        case AsdPackage.PROJECT_PROCESS_REFERENCE__PARENT_PROJECT:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentProject( ( Project ) otherEnd, msgs );
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
        case AsdPackage.PROJECT_PROCESS_REFERENCE__PARENT_PROJECT:
            return basicSetParentProject( null, msgs );
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
        case AsdPackage.PROJECT_PROCESS_REFERENCE__PARENT_PROJECT:
            return eInternalContainer().eInverseRemove( this, AsdPackage.PROJECT__PROJECT_PROCESS_REFERENCE,
                    Project.class, msgs );
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
        case AsdPackage.PROJECT_PROCESS_REFERENCE__PROCESS_REFERENCE:
            return getProcessReference();
        case AsdPackage.PROJECT_PROCESS_REFERENCE__PROCESS_UUID:
            return getProcessUuid();
        case AsdPackage.PROJECT_PROCESS_REFERENCE__PARENT_PROJECT:
            return getParentProject();
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
        case AsdPackage.PROJECT_PROCESS_REFERENCE__PROCESS_REFERENCE:
            setProcessReference( ( String ) newValue );
            return;
        case AsdPackage.PROJECT_PROCESS_REFERENCE__PROCESS_UUID:
            setProcessUuid( ( String ) newValue );
            return;
        case AsdPackage.PROJECT_PROCESS_REFERENCE__PARENT_PROJECT:
            setParentProject( ( Project ) newValue );
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
        case AsdPackage.PROJECT_PROCESS_REFERENCE__PROCESS_REFERENCE:
            setProcessReference( PROCESS_REFERENCE_EDEFAULT );
            return;
        case AsdPackage.PROJECT_PROCESS_REFERENCE__PROCESS_UUID:
            setProcessUuid( PROCESS_UUID_EDEFAULT );
            return;
        case AsdPackage.PROJECT_PROCESS_REFERENCE__PARENT_PROJECT:
            setParentProject( ( Project ) null );
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
        case AsdPackage.PROJECT_PROCESS_REFERENCE__PROCESS_REFERENCE:
            return PROCESS_REFERENCE_EDEFAULT == null ? processReference != null
                    : !PROCESS_REFERENCE_EDEFAULT.equals( processReference );
        case AsdPackage.PROJECT_PROCESS_REFERENCE__PROCESS_UUID:
            return PROCESS_UUID_EDEFAULT == null ? processUuid != null : !PROCESS_UUID_EDEFAULT.equals( processUuid );
        case AsdPackage.PROJECT_PROCESS_REFERENCE__PARENT_PROJECT:
            return getParentProject() != null;
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
        result.append( " (processReference: " );
        result.append( processReference );
        result.append( ", processUuid: " );
        result.append( processUuid );
        result.append( ')' );
        return result.toString();
    }

} //ProjectProcessReferenceImpl
