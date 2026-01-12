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

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubscriberLNodeItemProvider extends BaseExtensionElementWithDescItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubscriberLNodeItemProvider( AdapterFactory adapterFactory ) {
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

            addInputNamePropertyDescriptor( object );
            addPLNPropertyDescriptor( object );
            addResourceNamePropertyDescriptor( object );
            addResourceUuidPropertyDescriptor( object );
            addServicePropertyDescriptor( object );
            addRefersToProcessResourcePropertyDescriptor( object );
            addReferredBySourceRefPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Input Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInputNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SubscriberLNode_inputName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SubscriberLNode_inputName_feature",
                                "_UI_SubscriberLNode_type" ),
                        AsdPackage.eINSTANCE.getSubscriberLNode_InputName(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the PLN feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPLNPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SubscriberLNode_pLN_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SubscriberLNode_pLN_feature",
                                "_UI_SubscriberLNode_type" ),
                        AsdPackage.eINSTANCE.getSubscriberLNode_PLN(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Resource Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addResourceNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SubscriberLNode_resourceName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SubscriberLNode_resourceName_feature",
                                "_UI_SubscriberLNode_type" ),
                        AsdPackage.eINSTANCE.getSubscriberLNode_ResourceName(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Resource Uuid feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addResourceUuidPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SubscriberLNode_resourceUuid_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SubscriberLNode_resourceUuid_feature",
                                "_UI_SubscriberLNode_type" ),
                        AsdPackage.eINSTANCE.getSubscriberLNode_ResourceUuid(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Service feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServicePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SubscriberLNode_service_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SubscriberLNode_service_feature",
                                "_UI_SubscriberLNode_type" ),
                        AsdPackage.eINSTANCE.getSubscriberLNode_Service(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Process Resource feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToProcessResourcePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SubscriberLNode_RefersToProcessResource_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SubscriberLNode_RefersToProcessResource_feature", "_UI_SubscriberLNode_type" ),
                        AsdPackage.eINSTANCE.getSubscriberLNode_RefersToProcessResource(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Source Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredBySourceRefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SubscriberLNode_ReferredBySourceRef_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SubscriberLNode_ReferredBySourceRef_feature", "_UI_SubscriberLNode_type" ),
                        AsdPackage.eINSTANCE.getSubscriberLNode_ReferredBySourceRef(),
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
            childrenFeatures.add( AsdPackage.eINSTANCE.getSubscriberLNode_GooseParametersRef() );
            childrenFeatures.add( AsdPackage.eINSTANCE.getSubscriberLNode_SMVParametersRef() );
            childrenFeatures.add( AsdPackage.eINSTANCE.getSubscriberLNode_ReportParametersRef() );
            childrenFeatures.add( AsdPackage.eINSTANCE.getSubscriberLNode_BinaryWiringParametersRef() );
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
     * This returns SubscriberLNode.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/SubscriberLNode" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( SubscriberLNode ) object ).getFilename();
        return label == null || label.length() == 0 ? getString( "_UI_SubscriberLNode_type" )
                : getString( "_UI_SubscriberLNode_type" ) + " " + label;
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

        switch( notification.getFeatureID( SubscriberLNode.class ) ) {
        case AsdPackage.SUBSCRIBER_LNODE__INPUT_NAME:
        case AsdPackage.SUBSCRIBER_LNODE__PLN:
        case AsdPackage.SUBSCRIBER_LNODE__RESOURCE_NAME:
        case AsdPackage.SUBSCRIBER_LNODE__RESOURCE_UUID:
        case AsdPackage.SUBSCRIBER_LNODE__SERVICE:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__GOOSE_PARAMETERS_REF:
        case AsdPackage.SUBSCRIBER_LNODE__SMV_PARAMETERS_REF:
        case AsdPackage.SUBSCRIBER_LNODE__REPORT_PARAMETERS_REF:
        case AsdPackage.SUBSCRIBER_LNODE__BINARY_WIRING_PARAMETERS_REF:
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

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getSubscriberLNode_GooseParametersRef(),
                AsdFactory.eINSTANCE.createGooseParametersRef() ) );

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getSubscriberLNode_SMVParametersRef(),
                AsdFactory.eINSTANCE.createSMVParametersRef() ) );

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getSubscriberLNode_ReportParametersRef(),
                AsdFactory.eINSTANCE.createReportParametersRef() ) );

        newChildDescriptors
                .add( createChildParameter( AsdPackage.eINSTANCE.getSubscriberLNode_BinaryWiringParametersRef(),
                        AsdFactory.eINSTANCE.createBinaryWiringParametersRef() ) );
    }

}
