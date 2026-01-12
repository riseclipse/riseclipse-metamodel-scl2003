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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlRefItemProvider extends LinkFCDRefItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControlRefItemProvider( AdapterFactory adapterFactory ) {
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

            addControlledPropertyDescriptor( object );
            addControlledDoNamePropertyDescriptor( object );
            addControlledLNodeUuidPropertyDescriptor( object );
            addExtCtrlAddrPropertyDescriptor( object );
            addExtCtrlUuidPropertyDescriptor( object );
            addOutputPropertyDescriptor( object );
            addOutputInstPropertyDescriptor( object );
            addReferredByLNodeOutputRefPropertyDescriptor( object );
            addRefersToControllingLNodePropertyDescriptor( object );
            addRefersToProcessResourcePropertyDescriptor( object );
            addReferredByOutputVarPropertyDescriptor( object );
            addRefersToLNodePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Controlled feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addControlledPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ControlRef_controlled_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ControlRef_controlled_feature",
                                "_UI_ControlRef_type" ),
                        AsdPackage.eINSTANCE.getControlRef_Controlled(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Controlled Do Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addControlledDoNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ControlRef_controlledDoName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ControlRef_controlledDoName_feature",
                                "_UI_ControlRef_type" ),
                        AsdPackage.eINSTANCE.getControlRef_ControlledDoName(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Controlled LNode Uuid feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addControlledLNodeUuidPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ControlRef_controlledLNodeUuid_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ControlRef_controlledLNodeUuid_feature",
                                "_UI_ControlRef_type" ),
                        AsdPackage.eINSTANCE.getControlRef_ControlledLNodeUuid(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ext Ctrl Addr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExtCtrlAddrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ControlRef_extCtrlAddr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ControlRef_extCtrlAddr_feature",
                                "_UI_ControlRef_type" ),
                        AsdPackage.eINSTANCE.getControlRef_ExtCtrlAddr(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ext Ctrl Uuid feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExtCtrlUuidPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ControlRef_extCtrlUuid_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ControlRef_extCtrlUuid_feature",
                                "_UI_ControlRef_type" ),
                        AsdPackage.eINSTANCE.getControlRef_ExtCtrlUuid(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Output feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutputPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ControlRef_output_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ControlRef_output_feature",
                                "_UI_ControlRef_type" ),
                        AsdPackage.eINSTANCE.getControlRef_Output(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Output Inst feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutputInstPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ControlRef_outputInst_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ControlRef_outputInst_feature",
                                "_UI_ControlRef_type" ),
                        AsdPackage.eINSTANCE.getControlRef_OutputInst(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By LNode Output Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByLNodeOutputRefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ControlRef_ReferredByLNodeOutputRef_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ControlRef_ReferredByLNodeOutputRef_feature", "_UI_ControlRef_type" ),
                        AsdPackage.eINSTANCE.getControlRef_ReferredByLNodeOutputRef(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Controlling LNode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToControllingLNodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ControlRef_RefersToControllingLNode_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ControlRef_RefersToControllingLNode_feature", "_UI_ControlRef_type" ),
                        AsdPackage.eINSTANCE.getControlRef_RefersToControllingLNode(),
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
                        getString( "_UI_ControlRef_RefersToProcessResource_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ControlRef_RefersToProcessResource_feature", "_UI_ControlRef_type" ),
                        AsdPackage.eINSTANCE.getControlRef_RefersToProcessResource(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Output Var feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByOutputVarPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ControlRef_ReferredByOutputVar_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ControlRef_ReferredByOutputVar_feature",
                                "_UI_ControlRef_type" ),
                        AsdPackage.eINSTANCE.getControlRef_ReferredByOutputVar(),
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
                        getString( "_UI_ControlRef_RefersToLNode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ControlRef_RefersToLNode_feature",
                                "_UI_ControlRef_type" ),
                        AsdPackage.eINSTANCE.getControlRef_RefersToLNode(),
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
            childrenFeatures.add( AsdPackage.eINSTANCE.getControlRef_BinaryWiringParametersRef() );
            childrenFeatures.add( AsdPackage.eINSTANCE.getControlRef_AnalogueWiringParametersRef() );
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
     * This returns ControlRef.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ControlRef" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ControlRef ) object ).getFilename();
        return label == null || label.length() == 0 ? getString( "_UI_ControlRef_type" )
                : getString( "_UI_ControlRef_type" ) + " " + label;
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

        switch( notification.getFeatureID( ControlRef.class ) ) {
        case AsdPackage.CONTROL_REF__CONTROLLED:
        case AsdPackage.CONTROL_REF__CONTROLLED_DO_NAME:
        case AsdPackage.CONTROL_REF__CONTROLLED_LNODE_UUID:
        case AsdPackage.CONTROL_REF__EXT_CTRL_ADDR:
        case AsdPackage.CONTROL_REF__EXT_CTRL_UUID:
        case AsdPackage.CONTROL_REF__OUTPUT:
        case AsdPackage.CONTROL_REF__OUTPUT_INST:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case AsdPackage.CONTROL_REF__BINARY_WIRING_PARAMETERS_REF:
        case AsdPackage.CONTROL_REF__ANALOGUE_WIRING_PARAMETERS_REF:
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

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getControlRef_BinaryWiringParametersRef(),
                AsdFactory.eINSTANCE.createBinaryWiringParametersRef() ) );

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getControlRef_AnalogueWiringParametersRef(),
                AsdFactory.eINSTANCE.createAnalogueWiringParametersRef() ) );
    }

}
