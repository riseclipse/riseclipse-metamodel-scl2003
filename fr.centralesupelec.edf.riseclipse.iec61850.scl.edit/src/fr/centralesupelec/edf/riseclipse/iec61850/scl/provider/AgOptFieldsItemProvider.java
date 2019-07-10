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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AgOptFieldsItemProvider
        extends ItemProviderAdapter
        implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AgOptFieldsItemProvider( AdapterFactory adapterFactory ) {
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

            addBufOvflPropertyDescriptor( object );
            addConfigRefPropertyDescriptor( object );
            addDataRefPropertyDescriptor( object );
            addDataSetPropertyDescriptor( object );
            addEntryIDPropertyDescriptor( object );
            addReasonCodePropertyDescriptor( object );
            addSeqNumPropertyDescriptor( object );
            addTimeStampPropertyDescriptor( object );
            addSegmentationPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Buf Ovfl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBufOvflPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgOptFields_bufOvfl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgOptFields_bufOvfl_feature",
                                "_UI_AgOptFields_type" ),
                        SclPackage.eINSTANCE.getAgOptFields_BufOvfl(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Config Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConfigRefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgOptFields_configRef_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgOptFields_configRef_feature",
                                "_UI_AgOptFields_type" ),
                        SclPackage.eINSTANCE.getAgOptFields_ConfigRef(),
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
                        getString( "_UI_AgOptFields_dataRef_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgOptFields_dataRef_feature",
                                "_UI_AgOptFields_type" ),
                        SclPackage.eINSTANCE.getAgOptFields_DataRef(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getString( "_UI_AgOptFields_dataSet_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgOptFields_dataSet_feature",
                                "_UI_AgOptFields_type" ),
                        SclPackage.eINSTANCE.getAgOptFields_DataSet(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Entry ID feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEntryIDPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgOptFields_entryID_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgOptFields_entryID_feature",
                                "_UI_AgOptFields_type" ),
                        SclPackage.eINSTANCE.getAgOptFields_EntryID(),
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
                        getString( "_UI_AgOptFields_reasonCode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgOptFields_reasonCode_feature",
                                "_UI_AgOptFields_type" ),
                        SclPackage.eINSTANCE.getAgOptFields_ReasonCode(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Seq Num feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSeqNumPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgOptFields_seqNum_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgOptFields_seqNum_feature",
                                "_UI_AgOptFields_type" ),
                        SclPackage.eINSTANCE.getAgOptFields_SeqNum(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Time Stamp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimeStampPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgOptFields_timeStamp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgOptFields_timeStamp_feature",
                                "_UI_AgOptFields_type" ),
                        SclPackage.eINSTANCE.getAgOptFields_TimeStamp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Segmentation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSegmentationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AgOptFields_segmentation_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AgOptFields_segmentation_feature",
                                "_UI_AgOptFields_type" ),
                        SclPackage.eINSTANCE.getAgOptFields_Segmentation(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        Boolean labelValue = ( ( AgOptFields ) object ).getBufOvfl();
        String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ? getString( "_UI_AgOptFields_type" )
                : getString( "_UI_AgOptFields_type" ) + " " + label;
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

        switch( notification.getFeatureID( AgOptFields.class ) ) {
        case SclPackage.AG_OPT_FIELDS__BUF_OVFL:
        case SclPackage.AG_OPT_FIELDS__CONFIG_REF:
        case SclPackage.AG_OPT_FIELDS__DATA_REF:
        case SclPackage.AG_OPT_FIELDS__DATA_SET:
        case SclPackage.AG_OPT_FIELDS__ENTRY_ID:
        case SclPackage.AG_OPT_FIELDS__REASON_CODE:
        case SclPackage.AG_OPT_FIELDS__SEQ_NUM:
        case SclPackage.AG_OPT_FIELDS__TIME_STAMP:
        case SclPackage.AG_OPT_FIELDS__SEGMENTATION:
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

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return SCLEditPlugin.INSTANCE;
    }

}
