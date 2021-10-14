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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSE Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSESettingsImpl#getAppID <em>App ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSESettingsImpl#getDataLabel <em>Data Label</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSESettingsImpl#getParentServices <em>Parent Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSESettingsImpl#getMcSecurity <em>Mc Security</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSESettingsImpl#getKdaParticipant <em>Kda Participant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSESettingsImpl extends ServiceSettingsImpl implements GSESettings {
    /**
     * The default value of the '{@link #getAppID() <em>App ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAppID()
     * @generated
     * @ordered
     */
    protected static final ServiceSettingsEnum APP_ID_EDEFAULT = ServiceSettingsEnum.FIX;

    /**
     * The cached value of the '{@link #getAppID() <em>App ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAppID()
     * @generated
     * @ordered
     */
    protected ServiceSettingsEnum appID = APP_ID_EDEFAULT;

    /**
     * This is true if the App ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean appIDESet;

    /**
     * The default value of the '{@link #getDataLabel() <em>Data Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataLabel()
     * @generated
     * @ordered
     */
    protected static final ServiceSettingsEnum DATA_LABEL_EDEFAULT = ServiceSettingsEnum.FIX;

    /**
     * The cached value of the '{@link #getDataLabel() <em>Data Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataLabel()
     * @generated
     * @ordered
     */
    protected ServiceSettingsEnum dataLabel = DATA_LABEL_EDEFAULT;

    /**
     * This is true if the Data Label attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dataLabelESet;

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
     * The default value of the '{@link #getKdaParticipant() <em>Kda Participant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdaParticipant()
     * @generated
     * @ordered
     */
    protected static final Boolean KDA_PARTICIPANT_EDEFAULT = null;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GSESettingsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getGSESettings();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceSettingsEnum getAppID() {
        return appID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAppID( ServiceSettingsEnum newAppID ) {
        ServiceSettingsEnum oldAppID = appID;
        appID = newAppID == null ? APP_ID_EDEFAULT : newAppID;
        boolean oldAppIDESet = appIDESet;
        appIDESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.GSE_SETTINGS__APP_ID, oldAppID, appID,
                    !oldAppIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAppID() {
        ServiceSettingsEnum oldAppID = appID;
        boolean oldAppIDESet = appIDESet;
        appID = APP_ID_EDEFAULT;
        appIDESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.GSE_SETTINGS__APP_ID, oldAppID,
                    APP_ID_EDEFAULT, oldAppIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAppID() {
        return appIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceSettingsEnum getDataLabel() {
        return dataLabel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDataLabel( ServiceSettingsEnum newDataLabel ) {
        ServiceSettingsEnum oldDataLabel = dataLabel;
        dataLabel = newDataLabel == null ? DATA_LABEL_EDEFAULT : newDataLabel;
        boolean oldDataLabelESet = dataLabelESet;
        dataLabelESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.GSE_SETTINGS__DATA_LABEL, oldDataLabel,
                    dataLabel, !oldDataLabelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDataLabel() {
        ServiceSettingsEnum oldDataLabel = dataLabel;
        boolean oldDataLabelESet = dataLabelESet;
        dataLabel = DATA_LABEL_EDEFAULT;
        dataLabelESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.GSE_SETTINGS__DATA_LABEL, oldDataLabel,
                    DATA_LABEL_EDEFAULT, oldDataLabelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDataLabel() {
        return dataLabelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Services getParentServices() {
        if( eContainerFeatureID() != SclPackage.GSE_SETTINGS__PARENT_SERVICES ) return null;
        return ( Services ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServices( Services newParentServices, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServices, SclPackage.GSE_SETTINGS__PARENT_SERVICES,
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
                || ( eContainerFeatureID() != SclPackage.GSE_SETTINGS__PARENT_SERVICES
                        && newParentServices != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServices ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentServices != null )
                msgs = ( ( InternalEObject ) newParentServices ).eInverseAdd( this, SclPackage.SERVICES__GSE_SETTINGS,
                        Services.class, msgs );
            msgs = basicSetParentServices( newParentServices, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.GSE_SETTINGS__PARENT_SERVICES,
                    newParentServices, newParentServices ) );
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
                    SclPackage.GSE_SETTINGS__MC_SECURITY, oldMcSecurity, newMcSecurity, !oldMcSecurityESet );
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
                        SclPackage.MC_SECURITY__PARENT_GSE_SETTINGS, McSecurity.class, msgs );
            if( newMcSecurity != null )
                msgs = ( ( InternalEObject ) newMcSecurity ).eInverseAdd( this,
                        SclPackage.MC_SECURITY__PARENT_GSE_SETTINGS, McSecurity.class, msgs );
            msgs = basicSetMcSecurity( newMcSecurity, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMcSecurityESet = mcSecurityESet;
            mcSecurityESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.GSE_SETTINGS__MC_SECURITY,
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
                    SclPackage.GSE_SETTINGS__MC_SECURITY, oldMcSecurity, null, oldMcSecurityESet );
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
            msgs = ( ( InternalEObject ) mcSecurity ).eInverseRemove( this, SclPackage.MC_SECURITY__PARENT_GSE_SETTINGS,
                    McSecurity.class, msgs );
            msgs = basicUnsetMcSecurity( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMcSecurityESet = mcSecurityESet;
            mcSecurityESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.GSE_SETTINGS__MC_SECURITY, null,
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.GSE_SETTINGS__KDA_PARTICIPANT,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.GSE_SETTINGS__KDA_PARTICIPANT,
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.GSE_SETTINGS__PARENT_SERVICES:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentServices( ( Services ) otherEnd, msgs );
        case SclPackage.GSE_SETTINGS__MC_SECURITY:
            if( mcSecurity != null )
                msgs = ( ( InternalEObject ) mcSecurity ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.GSE_SETTINGS__MC_SECURITY, null, msgs );
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
        case SclPackage.GSE_SETTINGS__PARENT_SERVICES:
            return basicSetParentServices( null, msgs );
        case SclPackage.GSE_SETTINGS__MC_SECURITY:
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
        case SclPackage.GSE_SETTINGS__PARENT_SERVICES:
            return eInternalContainer().eInverseRemove( this, SclPackage.SERVICES__GSE_SETTINGS, Services.class, msgs );
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
        case SclPackage.GSE_SETTINGS__APP_ID:
            return getAppID();
        case SclPackage.GSE_SETTINGS__DATA_LABEL:
            return getDataLabel();
        case SclPackage.GSE_SETTINGS__PARENT_SERVICES:
            return getParentServices();
        case SclPackage.GSE_SETTINGS__MC_SECURITY:
            return getMcSecurity();
        case SclPackage.GSE_SETTINGS__KDA_PARTICIPANT:
            return getKdaParticipant();
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
        case SclPackage.GSE_SETTINGS__APP_ID:
            setAppID( ( ServiceSettingsEnum ) newValue );
            return;
        case SclPackage.GSE_SETTINGS__DATA_LABEL:
            setDataLabel( ( ServiceSettingsEnum ) newValue );
            return;
        case SclPackage.GSE_SETTINGS__PARENT_SERVICES:
            setParentServices( ( Services ) newValue );
            return;
        case SclPackage.GSE_SETTINGS__MC_SECURITY:
            setMcSecurity( ( McSecurity ) newValue );
            return;
        case SclPackage.GSE_SETTINGS__KDA_PARTICIPANT:
            setKdaParticipant( ( Boolean ) newValue );
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
        case SclPackage.GSE_SETTINGS__APP_ID:
            unsetAppID();
            return;
        case SclPackage.GSE_SETTINGS__DATA_LABEL:
            unsetDataLabel();
            return;
        case SclPackage.GSE_SETTINGS__PARENT_SERVICES:
            setParentServices( ( Services ) null );
            return;
        case SclPackage.GSE_SETTINGS__MC_SECURITY:
            unsetMcSecurity();
            return;
        case SclPackage.GSE_SETTINGS__KDA_PARTICIPANT:
            unsetKdaParticipant();
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
        case SclPackage.GSE_SETTINGS__APP_ID:
            return isSetAppID();
        case SclPackage.GSE_SETTINGS__DATA_LABEL:
            return isSetDataLabel();
        case SclPackage.GSE_SETTINGS__PARENT_SERVICES:
            return getParentServices() != null;
        case SclPackage.GSE_SETTINGS__MC_SECURITY:
            return isSetMcSecurity();
        case SclPackage.GSE_SETTINGS__KDA_PARTICIPANT:
            return isSetKdaParticipant();
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
        result.append( " (appID: " );
        if( appIDESet )
            result.append( appID );
        else
            result.append( "<unset>" );
        result.append( ", dataLabel: " );
        if( dataLabelESet )
            result.append( dataLabel );
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

} //GSESettingsImpl
