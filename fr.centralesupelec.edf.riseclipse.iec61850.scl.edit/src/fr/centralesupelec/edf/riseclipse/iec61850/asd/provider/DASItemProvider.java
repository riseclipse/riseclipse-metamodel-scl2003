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

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DASItemProvider extends BaseExtensionElementWithDescItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DASItemProvider( AdapterFactory adapterFactory ) {
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

            addIxPropertyDescriptor( object );
            addMappedDaNamePropertyDescriptor( object );
            addMappedLnUuidPropertyDescriptor( object );
            addNamePropertyDescriptor( object );
            addValImportPropertyDescriptor( object );
            addValKindPropertyDescriptor( object );
            addRefersToAnyLNPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Ix feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DAS_ix_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DAS_ix_feature", "_UI_DAS_type" ),
                        AsdPackage.eINSTANCE.getDAS_Ix(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Mapped Da Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMappedDaNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DAS_mappedDaName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DAS_mappedDaName_feature",
                                "_UI_DAS_type" ),
                        AsdPackage.eINSTANCE.getDAS_MappedDaName(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Mapped Ln Uuid feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMappedLnUuidPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DAS_mappedLnUuid_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DAS_mappedLnUuid_feature",
                                "_UI_DAS_type" ),
                        AsdPackage.eINSTANCE.getDAS_MappedLnUuid(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DAS_name_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DAS_name_feature", "_UI_DAS_type" ),
                        AsdPackage.eINSTANCE.getDAS_Name(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Val Import feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValImportPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DAS_valImport_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DAS_valImport_feature", "_UI_DAS_type" ),
                        AsdPackage.eINSTANCE.getDAS_ValImport(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Val Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DAS_valKind_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DAS_valKind_feature", "_UI_DAS_type" ),
                        AsdPackage.eINSTANCE.getDAS_ValKind(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Any LN feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToAnyLNPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DAS_RefersToAnyLN_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DAS_RefersToAnyLN_feature",
                                "_UI_DAS_type" ),
                        AsdPackage.eINSTANCE.getDAS_RefersToAnyLN(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection< ? extends EStructuralFeature > getChildrenFeatures( Object object ) {
        if( childrenFeatures == null ) {
            super.getChildrenFeatures( object );
            childrenFeatures.add( AsdPackage.eINSTANCE.getDAS_SubscriberLNode() );
            childrenFeatures.add( AsdPackage.eINSTANCE.getDAS_ControllingLNode() );
            childrenFeatures.add( AsdPackage.eINSTANCE.getDAS_ProcessEcho() );
            childrenFeatures.add( AsdPackage.eINSTANCE.getDAS_LogParametersRef() );
            childrenFeatures.add( AsdPackage.eINSTANCE.getDAS_Val() );
            childrenFeatures.add( AsdPackage.eINSTANCE.getDAS_Labels() );
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature( Object object, Object child ) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature( object, child );
    }

    /**
     * This returns DAS.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/DAS" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( DAS ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_DAS_type" )
                : getString( "_UI_DAS_type" ) + " " + label;
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

        switch( notification.getFeatureID( DAS.class ) ) {
        case AsdPackage.DAS__IX:
        case AsdPackage.DAS__MAPPED_DA_NAME:
        case AsdPackage.DAS__MAPPED_LN_UUID:
        case AsdPackage.DAS__NAME:
        case AsdPackage.DAS__VAL_IMPORT:
        case AsdPackage.DAS__VAL_KIND:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case AsdPackage.DAS__SUBSCRIBER_LNODE:
        case AsdPackage.DAS__CONTROLLING_LNODE:
        case AsdPackage.DAS__PROCESS_ECHO:
        case AsdPackage.DAS__LOG_PARAMETERS_REF:
        case AsdPackage.DAS__VAL:
        case AsdPackage.DAS__LABELS:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), true, false ) );
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

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getDAS_SubscriberLNode(),
                AsdFactory.eINSTANCE.createSubscriberLNode() ) );

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getDAS_ControllingLNode(),
                AsdFactory.eINSTANCE.createControllingLNode() ) );

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getDAS_ProcessEcho(),
                AsdFactory.eINSTANCE.createProcessEcho() ) );

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getDAS_LogParametersRef(),
                AsdFactory.eINSTANCE.createLogParametersRef() ) );

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getDAS_Val(),
                SclFactory.eINSTANCE.createVal() ) );

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getDAS_Labels(),
                SclFactory.eINSTANCE.createLabels() ) );
    }

}
