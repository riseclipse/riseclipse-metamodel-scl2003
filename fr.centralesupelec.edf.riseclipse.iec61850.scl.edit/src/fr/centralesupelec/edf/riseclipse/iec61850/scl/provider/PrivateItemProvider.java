/*
*************************************************************************
**  Copyright (c) 2016-2024 CentraleSupélec & EDF.
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
package fr.centralesupelec.edf.riseclipse.iec61850.scl.provider;

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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Private} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrivateItemProvider
        extends AnyContentFromOtherNamespaceItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrivateItemProvider( AdapterFactory adapterFactory ) {
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

            addSourcePropertyDescriptor( object );
            addTypePropertyDescriptor( object );
            addValuePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
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
                        getString( "_UI_Private_source_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Private_source_feature",
                                "_UI_Private_type" ),
                        SclPackage.eINSTANCE.getPrivate_Source(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Private_type_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Private_type_feature",
                                "_UI_Private_type" ),
                        SclPackage.eINSTANCE.getPrivate_Type(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValuePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Private_value_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Private_value_feature",
                                "_UI_Private_type" ),
                        SclPackage.eINSTANCE.getPrivate_Value(),
                        false,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
            childrenFeatures.add( SclPackage.eINSTANCE.getPrivate_AsdObjects() );
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
     * This returns Private.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Private" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public String getText( Object object ) {
        StringBuilder s = new StringBuilder();

        s.append( getString( "_UI_Private_type" ) );
        s.append( ": " );

        s.append( getString( "_UI_Private_type_feature" ) );
        s.append( "=\"" );
        s.append( ( ( Private ) object ).getType() );
        s.append( "\" " );

        s.append( "(" );
        s.append( ( ( Private ) object ).getLineNumber() );
        s.append( ")" );

        return s.toString();
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

        switch( notification.getFeatureID( Private.class ) ) {
        case SclPackage.PRIVATE__SOURCE:
        case SclPackage.PRIVATE__TYPE:
        case SclPackage.PRIVATE__VALUE:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case SclPackage.PRIVATE__ASD_OBJECTS:
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

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createAllocationRole() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createAllocationRoleRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createApplication() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createWiringParameters() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createAnalogueWiringParameters() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createServiceParametersRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createAnalogueWiringParametersRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createApplicationSclRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createBayType() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createBehaviorDescription() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createBehaviorDescriptionRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createBehaviorReference() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createBinaryWiringParameters() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createBinaryWiringParametersRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createControlRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createCommServiceSpecifications() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createControllingLNode() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createDAS() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createDOS() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createFunctionCategory() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createFunctionCategoryRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createFunctionCatRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createFunctionRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createFunctionRole() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createFunctionRoleContent() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createFunctionSclRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createFunctionTemplate() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createFunctionalSubVariant() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createFunctionalVariant() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createFunctionalVariantGroup() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createFunctionalVariantRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createGooseParameters() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createGooseParametersRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createLogicVarRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createInputVar() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createVariableRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createInputVarRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createL2CommParameters() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createL3IPv4CommParameters() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createL3IPv6CommParameters() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createLNodeDataRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createLNodeInputRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createLNodeInputs() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createLNodeOutputRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createLNodeOutputs() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createLNodeSpecNaming() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createLogParameters() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createLogParametersRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createOutputVar() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createOutputVarRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createPowerSystemRelation() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createPowerSystemRelationRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createPowerSystemRelations() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createProcessEcho() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createProcessResource() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createProcessResourceRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createProcessResources() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createProject() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createProjectProcessReference() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createReportParameters() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createReportParametersRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createResource() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createSDS() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createServiceSpecifications() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createSignalRole() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createSourceRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createSubCategory() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createSubFunctionTemplate() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createSMVParameters() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createSMVParametersRef() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createSubscriberLNode() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createVariable() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getPrivate_AsdObjects(),
                AsdFactory.eINSTANCE.createVariableApplyTo() ) );
    }

}
