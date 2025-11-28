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

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link FCD Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LinkFCDRefImpl#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LinkFCDRefImpl#getPDO <em>PDO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LinkFCDRefImpl#getPLN <em>PLN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LinkFCDRefImpl#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LinkFCDRefImpl#getResourceUuid <em>Resource Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LinkFCDRefImpl#getTemplateUuid <em>Template Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LinkFCDRefImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LinkFCDRefImpl extends BaseExtensionElementWithDescImpl implements LinkFCDRef {
    /**
     * The default value of the '{@link #getOriginUuid() <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginUuid()
     * @generated
     * @ordered
     */
    protected static final String ORIGIN_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOriginUuid() <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginUuid()
     * @generated
     * @ordered
     */
    protected String originUuid = ORIGIN_UUID_EDEFAULT;

    /**
     * The default value of the '{@link #getPDO() <em>PDO</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPDO()
     * @generated
     * @ordered
     */
    protected static final String PDO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPDO() <em>PDO</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPDO()
     * @generated
     * @ordered
     */
    protected String pDO = PDO_EDEFAULT;

    /**
     * The default value of the '{@link #getPLN() <em>PLN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPLN()
     * @generated
     * @ordered
     */
    protected static final String PLN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPLN() <em>PLN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPLN()
     * @generated
     * @ordered
     */
    protected String pLN = PLN_EDEFAULT;

    /**
     * The default value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceName()
     * @generated
     * @ordered
     */
    protected static final String RESOURCE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceName()
     * @generated
     * @ordered
     */
    protected String resourceName = RESOURCE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getResourceUuid() <em>Resource Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceUuid()
     * @generated
     * @ordered
     */
    protected static final String RESOURCE_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResourceUuid() <em>Resource Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceUuid()
     * @generated
     * @ordered
     */
    protected String resourceUuid = RESOURCE_UUID_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LinkFCDRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getLinkFCDRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOriginUuid() {
        return originUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOriginUuid( String newOriginUuid ) {
        String oldOriginUuid = originUuid;
        originUuid = newOriginUuid;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LINK_FCD_REF__ORIGIN_UUID, oldOriginUuid,
                    originUuid ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPDO() {
        return pDO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPDO( String newPDO ) {
        String oldPDO = pDO;
        pDO = newPDO;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LINK_FCD_REF__PDO, oldPDO, pDO ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPLN() {
        return pLN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPLN( String newPLN ) {
        String oldPLN = pLN;
        pLN = newPLN;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LINK_FCD_REF__PLN, oldPLN, pLN ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getResourceName() {
        return resourceName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResourceName( String newResourceName ) {
        String oldResourceName = resourceName;
        resourceName = newResourceName;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LINK_FCD_REF__RESOURCE_NAME,
                    oldResourceName, resourceName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getResourceUuid() {
        return resourceUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResourceUuid( String newResourceUuid ) {
        String oldResourceUuid = resourceUuid;
        resourceUuid = newResourceUuid;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LINK_FCD_REF__RESOURCE_UUID,
                    oldResourceUuid, resourceUuid ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LINK_FCD_REF__TEMPLATE_UUID,
                    oldTemplateUuid, templateUuid ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LINK_FCD_REF__UUID, oldUuid, uuid ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case AsdPackage.LINK_FCD_REF__ORIGIN_UUID:
            return getOriginUuid();
        case AsdPackage.LINK_FCD_REF__PDO:
            return getPDO();
        case AsdPackage.LINK_FCD_REF__PLN:
            return getPLN();
        case AsdPackage.LINK_FCD_REF__RESOURCE_NAME:
            return getResourceName();
        case AsdPackage.LINK_FCD_REF__RESOURCE_UUID:
            return getResourceUuid();
        case AsdPackage.LINK_FCD_REF__TEMPLATE_UUID:
            return getTemplateUuid();
        case AsdPackage.LINK_FCD_REF__UUID:
            return getUuid();
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
        case AsdPackage.LINK_FCD_REF__ORIGIN_UUID:
            setOriginUuid( ( String ) newValue );
            return;
        case AsdPackage.LINK_FCD_REF__PDO:
            setPDO( ( String ) newValue );
            return;
        case AsdPackage.LINK_FCD_REF__PLN:
            setPLN( ( String ) newValue );
            return;
        case AsdPackage.LINK_FCD_REF__RESOURCE_NAME:
            setResourceName( ( String ) newValue );
            return;
        case AsdPackage.LINK_FCD_REF__RESOURCE_UUID:
            setResourceUuid( ( String ) newValue );
            return;
        case AsdPackage.LINK_FCD_REF__TEMPLATE_UUID:
            setTemplateUuid( ( String ) newValue );
            return;
        case AsdPackage.LINK_FCD_REF__UUID:
            setUuid( ( String ) newValue );
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
        case AsdPackage.LINK_FCD_REF__ORIGIN_UUID:
            setOriginUuid( ORIGIN_UUID_EDEFAULT );
            return;
        case AsdPackage.LINK_FCD_REF__PDO:
            setPDO( PDO_EDEFAULT );
            return;
        case AsdPackage.LINK_FCD_REF__PLN:
            setPLN( PLN_EDEFAULT );
            return;
        case AsdPackage.LINK_FCD_REF__RESOURCE_NAME:
            setResourceName( RESOURCE_NAME_EDEFAULT );
            return;
        case AsdPackage.LINK_FCD_REF__RESOURCE_UUID:
            setResourceUuid( RESOURCE_UUID_EDEFAULT );
            return;
        case AsdPackage.LINK_FCD_REF__TEMPLATE_UUID:
            setTemplateUuid( TEMPLATE_UUID_EDEFAULT );
            return;
        case AsdPackage.LINK_FCD_REF__UUID:
            setUuid( UUID_EDEFAULT );
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
        case AsdPackage.LINK_FCD_REF__ORIGIN_UUID:
            return ORIGIN_UUID_EDEFAULT == null ? originUuid != null : !ORIGIN_UUID_EDEFAULT.equals( originUuid );
        case AsdPackage.LINK_FCD_REF__PDO:
            return PDO_EDEFAULT == null ? pDO != null : !PDO_EDEFAULT.equals( pDO );
        case AsdPackage.LINK_FCD_REF__PLN:
            return PLN_EDEFAULT == null ? pLN != null : !PLN_EDEFAULT.equals( pLN );
        case AsdPackage.LINK_FCD_REF__RESOURCE_NAME:
            return RESOURCE_NAME_EDEFAULT == null ? resourceName != null
                    : !RESOURCE_NAME_EDEFAULT.equals( resourceName );
        case AsdPackage.LINK_FCD_REF__RESOURCE_UUID:
            return RESOURCE_UUID_EDEFAULT == null ? resourceUuid != null
                    : !RESOURCE_UUID_EDEFAULT.equals( resourceUuid );
        case AsdPackage.LINK_FCD_REF__TEMPLATE_UUID:
            return TEMPLATE_UUID_EDEFAULT == null ? templateUuid != null
                    : !TEMPLATE_UUID_EDEFAULT.equals( templateUuid );
        case AsdPackage.LINK_FCD_REF__UUID:
            return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals( uuid );
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
        result.append( " (originUuid: " );
        result.append( originUuid );
        result.append( ", pDO: " );
        result.append( pDO );
        result.append( ", pLN: " );
        result.append( pLN );
        result.append( ", resourceName: " );
        result.append( resourceName );
        result.append( ", resourceUuid: " );
        result.append( resourceUuid );
        result.append( ", templateUuid: " );
        result.append( templateUuid );
        result.append( ", uuid: " );
        result.append( uuid );
        result.append( ')' );
        return result.toString();
    }

} //LinkFCDRefImpl
