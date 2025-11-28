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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PowerSystemRelationItemProvider extends BaseExtensionElementWithDescItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PowerSystemRelationItemProvider( AdapterFactory adapterFactory ) {
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

            addNamePropertyDescriptor( object );
            addOriginUuidPropertyDescriptor( object );
            addRelationPropertyDescriptor( object );
            addRelationUuidPropertyDescriptor( object );
            addSelectorPropertyDescriptor( object );
            addTemplateUuidPropertyDescriptor( object );
            addUuidPropertyDescriptor( object );
            addReferredByPowerSystemRelationRefPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
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
                        getString( "_UI_PowerSystemRelation_name_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerSystemRelation_name_feature",
                                "_UI_PowerSystemRelation_type" ),
                        AsdPackage.eINSTANCE.getPowerSystemRelation_Name(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getString( "_UI_PowerSystemRelation_originUuid_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerSystemRelation_originUuid_feature",
                                "_UI_PowerSystemRelation_type" ),
                        AsdPackage.eINSTANCE.getPowerSystemRelation_OriginUuid(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Relation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRelationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerSystemRelation_relation_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerSystemRelation_relation_feature",
                                "_UI_PowerSystemRelation_type" ),
                        AsdPackage.eINSTANCE.getPowerSystemRelation_Relation(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Relation Uuid feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRelationUuidPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerSystemRelation_relationUuid_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerSystemRelation_relationUuid_feature",
                                "_UI_PowerSystemRelation_type" ),
                        AsdPackage.eINSTANCE.getPowerSystemRelation_RelationUuid(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Selector feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSelectorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerSystemRelation_selector_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerSystemRelation_selector_feature",
                                "_UI_PowerSystemRelation_type" ),
                        AsdPackage.eINSTANCE.getPowerSystemRelation_Selector(),
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
                        getString( "_UI_PowerSystemRelation_templateUuid_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerSystemRelation_templateUuid_feature",
                                "_UI_PowerSystemRelation_type" ),
                        AsdPackage.eINSTANCE.getPowerSystemRelation_TemplateUuid(),
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
                        getString( "_UI_PowerSystemRelation_uuid_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerSystemRelation_uuid_feature",
                                "_UI_PowerSystemRelation_type" ),
                        AsdPackage.eINSTANCE.getPowerSystemRelation_Uuid(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Power System Relation Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByPowerSystemRelationRefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerSystemRelation_ReferredByPowerSystemRelationRef_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PowerSystemRelation_ReferredByPowerSystemRelationRef_feature",
                                "_UI_PowerSystemRelation_type" ),
                        AsdPackage.eINSTANCE.getPowerSystemRelation_ReferredByPowerSystemRelationRef(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns PowerSystemRelation.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PowerSystemRelation" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PowerSystemRelation ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PowerSystemRelation_type" )
                : getString( "_UI_PowerSystemRelation_type" ) + " " + label;
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

        switch( notification.getFeatureID( PowerSystemRelation.class ) ) {
        case AsdPackage.POWER_SYSTEM_RELATION__NAME:
        case AsdPackage.POWER_SYSTEM_RELATION__ORIGIN_UUID:
        case AsdPackage.POWER_SYSTEM_RELATION__RELATION:
        case AsdPackage.POWER_SYSTEM_RELATION__RELATION_UUID:
        case AsdPackage.POWER_SYSTEM_RELATION__SELECTOR:
        case AsdPackage.POWER_SYSTEM_RELATION__TEMPLATE_UUID:
        case AsdPackage.POWER_SYSTEM_RELATION__UUID:
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
