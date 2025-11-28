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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkFCDRefItemProvider extends BaseExtensionElementWithDescItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinkFCDRefItemProvider( AdapterFactory adapterFactory ) {
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

            addOriginUuidPropertyDescriptor( object );
            addPDOPropertyDescriptor( object );
            addPLNPropertyDescriptor( object );
            addResourceNamePropertyDescriptor( object );
            addResourceUuidPropertyDescriptor( object );
            addTemplateUuidPropertyDescriptor( object );
            addUuidPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Origin Uuid feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOriginUuidPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LinkFCDRef_originUuid_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LinkFCDRef_originUuid_feature",
                                "_UI_LinkFCDRef_type" ),
                        AsdPackage.eINSTANCE.getLinkFCDRef_OriginUuid(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the PDO feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPDOPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LinkFCDRef_pDO_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LinkFCDRef_pDO_feature",
                                "_UI_LinkFCDRef_type" ),
                        AsdPackage.eINSTANCE.getLinkFCDRef_PDO(),
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
                        getString( "_UI_LinkFCDRef_pLN_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LinkFCDRef_pLN_feature",
                                "_UI_LinkFCDRef_type" ),
                        AsdPackage.eINSTANCE.getLinkFCDRef_PLN(),
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
                        getString( "_UI_LinkFCDRef_resourceName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LinkFCDRef_resourceName_feature",
                                "_UI_LinkFCDRef_type" ),
                        AsdPackage.eINSTANCE.getLinkFCDRef_ResourceName(),
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
                        getString( "_UI_LinkFCDRef_resourceUuid_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LinkFCDRef_resourceUuid_feature",
                                "_UI_LinkFCDRef_type" ),
                        AsdPackage.eINSTANCE.getLinkFCDRef_ResourceUuid(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Template Uuid feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTemplateUuidPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LinkFCDRef_templateUuid_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LinkFCDRef_templateUuid_feature",
                                "_UI_LinkFCDRef_type" ),
                        AsdPackage.eINSTANCE.getLinkFCDRef_TemplateUuid(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Uuid feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUuidPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LinkFCDRef_uuid_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LinkFCDRef_uuid_feature",
                                "_UI_LinkFCDRef_type" ),
                        AsdPackage.eINSTANCE.getLinkFCDRef_Uuid(),
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
        String label = ( ( LinkFCDRef ) object ).getFilename();
        return label == null || label.length() == 0 ? getString( "_UI_LinkFCDRef_type" )
                : getString( "_UI_LinkFCDRef_type" ) + " " + label;
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

        switch( notification.getFeatureID( LinkFCDRef.class ) ) {
        case AsdPackage.LINK_FCD_REF__ORIGIN_UUID:
        case AsdPackage.LINK_FCD_REF__PDO:
        case AsdPackage.LINK_FCD_REF__PLN:
        case AsdPackage.LINK_FCD_REF__RESOURCE_NAME:
        case AsdPackage.LINK_FCD_REF__RESOURCE_UUID:
        case AsdPackage.LINK_FCD_REF__TEMPLATE_UUID:
        case AsdPackage.LINK_FCD_REF__UUID:
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
