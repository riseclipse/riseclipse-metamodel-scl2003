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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SourceRefItemProvider extends LinkFCDARefItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SourceRefItemProvider( AdapterFactory adapterFactory ) {
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

            addExtRefAddrPropertyDescriptor( object );
            addExtRefUuidPropertyDescriptor( object );
            addInputPropertyDescriptor( object );
            addInputInstPropertyDescriptor( object );
            addServicePropertyDescriptor( object );
            addSourcePropertyDescriptor( object );
            addSourceDaNamePropertyDescriptor( object );
            addSourceDoNamePropertyDescriptor( object );
            addSourceLNodeUuidPropertyDescriptor( object );
            addReferredByInputVarPropertyDescriptor( object );
            addReferredByLNodeInputRefPropertyDescriptor( object );
            addRefersToSubscriberLNodePropertyDescriptor( object );
            addRefersToProcessResourcePropertyDescriptor( object );
            addRefersToLNodePropertyDescriptor( object );
            addRefersToExtRefPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Ext Ref Addr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExtRefAddrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SourceRef_extRefAddr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SourceRef_extRefAddr_feature",
                                "_UI_SourceRef_type" ),
                        AsdPackage.eINSTANCE.getSourceRef_ExtRefAddr(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ext Ref Uuid feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExtRefUuidPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SourceRef_extRefUuid_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SourceRef_extRefUuid_feature",
                                "_UI_SourceRef_type" ),
                        AsdPackage.eINSTANCE.getSourceRef_ExtRefUuid(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Input feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInputPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SourceRef_input_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SourceRef_input_feature",
                                "_UI_SourceRef_type" ),
                        AsdPackage.eINSTANCE.getSourceRef_Input(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Input Inst feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInputInstPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SourceRef_inputInst_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SourceRef_inputInst_feature",
                                "_UI_SourceRef_type" ),
                        AsdPackage.eINSTANCE.getSourceRef_InputInst(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
                        getString( "_UI_SourceRef_service_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SourceRef_service_feature",
                                "_UI_SourceRef_type" ),
                        AsdPackage.eINSTANCE.getSourceRef_Service(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Source feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSourcePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SourceRef_source_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SourceRef_source_feature",
                                "_UI_SourceRef_type" ),
                        AsdPackage.eINSTANCE.getSourceRef_Source(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Source Da Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSourceDaNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SourceRef_sourceDaName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SourceRef_sourceDaName_feature",
                                "_UI_SourceRef_type" ),
                        AsdPackage.eINSTANCE.getSourceRef_SourceDaName(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Source Do Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSourceDoNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SourceRef_sourceDoName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SourceRef_sourceDoName_feature",
                                "_UI_SourceRef_type" ),
                        AsdPackage.eINSTANCE.getSourceRef_SourceDoName(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Source LNode Uuid feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSourceLNodeUuidPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SourceRef_sourceLNodeUuid_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SourceRef_sourceLNodeUuid_feature",
                                "_UI_SourceRef_type" ),
                        AsdPackage.eINSTANCE.getSourceRef_SourceLNodeUuid(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Input Var feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByInputVarPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SourceRef_ReferredByInputVar_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SourceRef_ReferredByInputVar_feature",
                                "_UI_SourceRef_type" ),
                        AsdPackage.eINSTANCE.getSourceRef_ReferredByInputVar(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By LNode Input Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByLNodeInputRefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SourceRef_ReferredByLNodeInputRef_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SourceRef_ReferredByLNodeInputRef_feature", "_UI_SourceRef_type" ),
                        AsdPackage.eINSTANCE.getSourceRef_ReferredByLNodeInputRef(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Subscriber LNode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToSubscriberLNodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SourceRef_RefersToSubscriberLNode_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SourceRef_RefersToSubscriberLNode_feature", "_UI_SourceRef_type" ),
                        AsdPackage.eINSTANCE.getSourceRef_RefersToSubscriberLNode(),
                        true,
                        false,
                        true,
                        null,
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
                        getString( "_UI_SourceRef_RefersToProcessResource_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SourceRef_RefersToProcessResource_feature", "_UI_SourceRef_type" ),
                        AsdPackage.eINSTANCE.getSourceRef_RefersToProcessResource(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To LNode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToLNodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SourceRef_RefersToLNode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SourceRef_RefersToLNode_feature",
                                "_UI_SourceRef_type" ),
                        AsdPackage.eINSTANCE.getSourceRef_RefersToLNode(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Ext Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToExtRefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SourceRef_RefersToExtRef_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SourceRef_RefersToExtRef_feature",
                                "_UI_SourceRef_type" ),
                        AsdPackage.eINSTANCE.getSourceRef_RefersToExtRef(),
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
            childrenFeatures.add( AsdPackage.eINSTANCE.getSourceRef_GooseParametersRef() );
            childrenFeatures.add( AsdPackage.eINSTANCE.getSourceRef_SMVParametersRef() );
            childrenFeatures.add( AsdPackage.eINSTANCE.getSourceRef_ReportParametersRef() );
            childrenFeatures.add( AsdPackage.eINSTANCE.getSourceRef_BinaryWiringParametersRef() );
            childrenFeatures.add( AsdPackage.eINSTANCE.getSourceRef_AnalogueWiringParametersRef() );
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
     * This returns SourceRef.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/SourceRef" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( SourceRef ) object ).getFilename();
        return label == null || label.length() == 0 ? getString( "_UI_SourceRef_type" )
                : getString( "_UI_SourceRef_type" ) + " " + label;
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

        switch( notification.getFeatureID( SourceRef.class ) ) {
        case AsdPackage.SOURCE_REF__EXT_REF_ADDR:
        case AsdPackage.SOURCE_REF__EXT_REF_UUID:
        case AsdPackage.SOURCE_REF__INPUT:
        case AsdPackage.SOURCE_REF__INPUT_INST:
        case AsdPackage.SOURCE_REF__SERVICE:
        case AsdPackage.SOURCE_REF__SOURCE:
        case AsdPackage.SOURCE_REF__SOURCE_DA_NAME:
        case AsdPackage.SOURCE_REF__SOURCE_DO_NAME:
        case AsdPackage.SOURCE_REF__SOURCE_LNODE_UUID:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case AsdPackage.SOURCE_REF__GOOSE_PARAMETERS_REF:
        case AsdPackage.SOURCE_REF__SMV_PARAMETERS_REF:
        case AsdPackage.SOURCE_REF__REPORT_PARAMETERS_REF:
        case AsdPackage.SOURCE_REF__BINARY_WIRING_PARAMETERS_REF:
        case AsdPackage.SOURCE_REF__ANALOGUE_WIRING_PARAMETERS_REF:
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

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getSourceRef_GooseParametersRef(),
                AsdFactory.eINSTANCE.createGooseParametersRef() ) );

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getSourceRef_SMVParametersRef(),
                AsdFactory.eINSTANCE.createSMVParametersRef() ) );

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getSourceRef_ReportParametersRef(),
                AsdFactory.eINSTANCE.createReportParametersRef() ) );

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getSourceRef_BinaryWiringParametersRef(),
                AsdFactory.eINSTANCE.createBinaryWiringParametersRef() ) );

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getSourceRef_AnalogueWiringParametersRef(),
                AsdFactory.eINSTANCE.createAnalogueWiringParametersRef() ) );
    }

}
