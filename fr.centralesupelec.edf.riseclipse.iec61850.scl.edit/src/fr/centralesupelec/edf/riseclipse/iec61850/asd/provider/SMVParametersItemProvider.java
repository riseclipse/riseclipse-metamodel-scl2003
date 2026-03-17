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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SMVParametersItemProvider extends ControlBlockParametersItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SMVParametersItemProvider( AdapterFactory adapterFactory ) {
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

            addMulticastPropertyDescriptor( object );
            addNofASDUPropertyDescriptor( object );
            addSecurityEnabledPropertyDescriptor( object );
            addSmpModPropertyDescriptor( object );
            addSmpRatePropertyDescriptor( object );
            addSmvIdPropertyDescriptor( object );
            addReferredBySMVParametersRefPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Multicast feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMulticastPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SMVParameters_multicast_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SMVParameters_multicast_feature",
                                "_UI_SMVParameters_type" ),
                        AsdPackage.eINSTANCE.getSMVParameters_Multicast(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Nof ASDU feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNofASDUPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SMVParameters_nofASDU_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SMVParameters_nofASDU_feature",
                                "_UI_SMVParameters_type" ),
                        AsdPackage.eINSTANCE.getSMVParameters_NofASDU(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Security Enabled feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSecurityEnabledPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SMVParameters_securityEnabled_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SMVParameters_securityEnabled_feature",
                                "_UI_SMVParameters_type" ),
                        AsdPackage.eINSTANCE.getSMVParameters_SecurityEnabled(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Smp Mod feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSmpModPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SMVParameters_smpMod_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SMVParameters_smpMod_feature",
                                "_UI_SMVParameters_type" ),
                        AsdPackage.eINSTANCE.getSMVParameters_SmpMod(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Smp Rate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSmpRatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SMVParameters_smpRate_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SMVParameters_smpRate_feature",
                                "_UI_SMVParameters_type" ),
                        AsdPackage.eINSTANCE.getSMVParameters_SmpRate(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Smv Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSmvIdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SMVParameters_smvId_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SMVParameters_smvId_feature",
                                "_UI_SMVParameters_type" ),
                        AsdPackage.eINSTANCE.getSMVParameters_SmvId(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By SMV Parameters Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredBySMVParametersRefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SMVParameters_ReferredBySMVParametersRef_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SMVParameters_ReferredBySMVParametersRef_feature", "_UI_SMVParameters_type" ),
                        AsdPackage.eINSTANCE.getSMVParameters_ReferredBySMVParametersRef(),
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
            childrenFeatures.add( AsdPackage.eINSTANCE.getSMVParameters_L2CommParameters() );
            childrenFeatures.add( AsdPackage.eINSTANCE.getSMVParameters_L3IPv4CommParameters() );
            childrenFeatures.add( AsdPackage.eINSTANCE.getSMVParameters_L3IPv6CommParameters() );
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
     * This returns SMVParameters.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/SMVParameters" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( SMVParameters ) object ).getFilename();
        return label == null || label.length() == 0 ? getString( "_UI_SMVParameters_type" )
                : getString( "_UI_SMVParameters_type" ) + " " + label;
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

        switch( notification.getFeatureID( SMVParameters.class ) ) {
        case AsdPackage.SMV_PARAMETERS__MULTICAST:
        case AsdPackage.SMV_PARAMETERS__NOF_ASDU:
        case AsdPackage.SMV_PARAMETERS__SECURITY_ENABLED:
        case AsdPackage.SMV_PARAMETERS__SMP_MOD:
        case AsdPackage.SMV_PARAMETERS__SMP_RATE:
        case AsdPackage.SMV_PARAMETERS__SMV_ID:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case AsdPackage.SMV_PARAMETERS__L2_COMM_PARAMETERS:
        case AsdPackage.SMV_PARAMETERS__L3I_PV4_COMM_PARAMETERS:
        case AsdPackage.SMV_PARAMETERS__L3I_PV6_COMM_PARAMETERS:
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

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getSMVParameters_L2CommParameters(),
                AsdFactory.eINSTANCE.createL2CommParameters() ) );

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getSMVParameters_L3IPv4CommParameters(),
                AsdFactory.eINSTANCE.createL3IPv4CommParameters() ) );

        newChildDescriptors.add( createChildParameter( AsdPackage.eINSTANCE.getSMVParameters_L3IPv6CommParameters(),
                AsdFactory.eINSTANCE.createL3IPv6CommParameters() ) );
    }

}
