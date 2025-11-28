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
package fr.centralesupelec.edf.riseclipse.iec61850.asd.provider;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LogParametersItemProvider extends ControlBlockParametersItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogParametersItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addIntgPdPropertyDescriptor( object );
            addLogEnaPropertyDescriptor( object );
            addLogLdInstPropertyDescriptor( object );
            addLogLnClassPropertyDescriptor( object );
            addLogLnInstPropertyDescriptor( object );
            addLogNamePropertyDescriptor( object );
            addLogPrefixPropertyDescriptor( object );
            addReasonCodePropertyDescriptor( object );
            addReferredByLogParametersRefPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Intg Pd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIntgPdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LogParameters_intgPd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LogParameters_intgPd_feature",
                                "_UI_LogParameters_type" ),
                        AsdPackage.eINSTANCE.getLogParameters_IntgPd(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Log Ena feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLogEnaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LogParameters_logEna_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LogParameters_logEna_feature",
                                "_UI_LogParameters_type" ),
                        AsdPackage.eINSTANCE.getLogParameters_LogEna(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Log Ld Inst feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLogLdInstPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LogParameters_logLdInst_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LogParameters_logLdInst_feature",
                                "_UI_LogParameters_type" ),
                        AsdPackage.eINSTANCE.getLogParameters_LogLdInst(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Log Ln Class feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLogLnClassPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LogParameters_logLnClass_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LogParameters_logLnClass_feature",
                                "_UI_LogParameters_type" ),
                        AsdPackage.eINSTANCE.getLogParameters_LogLnClass(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Log Ln Inst feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLogLnInstPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LogParameters_logLnInst_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LogParameters_logLnInst_feature",
                                "_UI_LogParameters_type" ),
                        AsdPackage.eINSTANCE.getLogParameters_LogLnInst(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Log Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLogNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LogParameters_logName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LogParameters_logName_feature",
                                "_UI_LogParameters_type" ),
                        AsdPackage.eINSTANCE.getLogParameters_LogName(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Log Prefix feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLogPrefixPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LogParameters_logPrefix_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LogParameters_logPrefix_feature",
                                "_UI_LogParameters_type" ),
                        AsdPackage.eINSTANCE.getLogParameters_LogPrefix(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Reason Code feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReasonCodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LogParameters_reasonCode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LogParameters_reasonCode_feature",
                                "_UI_LogParameters_type" ),
                        AsdPackage.eINSTANCE.getLogParameters_ReasonCode(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Log Parameters Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByLogParametersRefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LogParameters_ReferredByLogParametersRef_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_LogParameters_ReferredByLogParametersRef_feature", "_UI_LogParameters_type" ),
                        AsdPackage.eINSTANCE.getLogParameters_ReferredByLogParametersRef(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns LogParameters.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/LogParameters" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( LogParameters ) object ).getFilename();
        return label == null || label.length() == 0 ? getString( "_UI_LogParameters_type" )
                : getString( "_UI_LogParameters_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( LogParameters.class ) ) {
        case AsdPackage.LOG_PARAMETERS__INTG_PD:
        case AsdPackage.LOG_PARAMETERS__LOG_ENA:
        case AsdPackage.LOG_PARAMETERS__LOG_LD_INST:
        case AsdPackage.LOG_PARAMETERS__LOG_LN_CLASS:
        case AsdPackage.LOG_PARAMETERS__LOG_LN_INST:
        case AsdPackage.LOG_PARAMETERS__LOG_NAME:
        case AsdPackage.LOG_PARAMETERS__LOG_PREFIX:
        case AsdPackage.LOG_PARAMETERS__REASON_CODE:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
