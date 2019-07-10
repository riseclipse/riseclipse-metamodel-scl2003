/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.provider;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SmvOptsItemProvider
        extends SclObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmvOptsItemProvider( AdapterFactory adapterFactory ) {
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

            addDataSetPropertyDescriptor( object );
            addRefreshTimePropertyDescriptor( object );
            addSampleRatePropertyDescriptor( object );
            addSampleSynchronizedPropertyDescriptor( object );
            addSecurityPropertyDescriptor( object );
            addTimestampPropertyDescriptor( object );
            addSynchSourceIdPropertyDescriptor( object );
            addDataRefPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Data Set feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDataSetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgSmvOpts_dataSet_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgSmvOpts_dataSet_feature",
                                "_UI_AgSmvOpts_type" ),
                        SclPackage.eINSTANCE.getAgSmvOpts_DataSet(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refresh Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefreshTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgSmvOpts_refreshTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgSmvOpts_refreshTime_feature",
                                "_UI_AgSmvOpts_type" ),
                        SclPackage.eINSTANCE.getAgSmvOpts_RefreshTime(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Sample Rate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSampleRatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgSmvOpts_sampleRate_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgSmvOpts_sampleRate_feature",
                                "_UI_AgSmvOpts_type" ),
                        SclPackage.eINSTANCE.getAgSmvOpts_SampleRate(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Sample Synchronized feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSampleSynchronizedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgSmvOpts_sampleSynchronized_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgSmvOpts_sampleSynchronized_feature",
                                "_UI_AgSmvOpts_type" ),
                        SclPackage.eINSTANCE.getAgSmvOpts_SampleSynchronized(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Security feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSecurityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgSmvOpts_security_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgSmvOpts_security_feature",
                                "_UI_AgSmvOpts_type" ),
                        SclPackage.eINSTANCE.getAgSmvOpts_Security(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Timestamp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimestampPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgSmvOpts_timestamp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgSmvOpts_timestamp_feature",
                                "_UI_AgSmvOpts_type" ),
                        SclPackage.eINSTANCE.getAgSmvOpts_Timestamp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Synch Source Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSynchSourceIdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgSmvOpts_synchSourceId_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgSmvOpts_synchSourceId_feature",
                                "_UI_AgSmvOpts_type" ),
                        SclPackage.eINSTANCE.getAgSmvOpts_SynchSourceId(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Data Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDataRefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgSmvOpts_dataRef_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgSmvOpts_dataRef_feature",
                                "_UI_AgSmvOpts_type" ),
                        SclPackage.eINSTANCE.getAgSmvOpts_DataRef(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns SmvOpts.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/SmvOpts" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        SmvOpts smvOpts = ( SmvOpts ) object;
        return getString( "_UI_SmvOpts_type" ) + " " + smvOpts.getLineNumber();
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

        switch( notification.getFeatureID( SmvOpts.class ) ) {
        case SclPackage.SMV_OPTS__DATA_SET:
        case SclPackage.SMV_OPTS__REFRESH_TIME:
        case SclPackage.SMV_OPTS__SAMPLE_RATE:
        case SclPackage.SMV_OPTS__SAMPLE_SYNCHRONIZED:
        case SclPackage.SMV_OPTS__SECURITY:
        case SclPackage.SMV_OPTS__TIMESTAMP:
        case SclPackage.SMV_OPTS__SYNCH_SOURCE_ID:
        case SclPackage.SMV_OPTS__DATA_REF:
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
