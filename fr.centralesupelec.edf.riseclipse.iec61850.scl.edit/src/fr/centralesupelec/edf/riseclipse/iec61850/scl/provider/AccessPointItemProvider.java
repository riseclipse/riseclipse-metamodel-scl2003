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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AccessPointItemProvider extends UnNamingItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessPointItemProvider( AdapterFactory adapterFactory ) {
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

            addClockPropertyDescriptor( object );
            addKdcPropertyDescriptor( object );
            addRouterPropertyDescriptor( object );
            addReferredByServerAtPropertyDescriptor( object );
            addNamePropertyDescriptor( object );
            addReferredByConnectedAPPropertyDescriptor( object );
            addReferredByKDCPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Clock feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addClockPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AccessPoint_clock_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AccessPoint_clock_feature",
                                "_UI_AccessPoint_type" ),
                        SclPackage.eINSTANCE.getAccessPoint_Clock(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kdc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AccessPoint_kdc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AccessPoint_kdc_feature",
                                "_UI_AccessPoint_type" ),
                        SclPackage.eINSTANCE.getAccessPoint_Kdc(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Router feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRouterPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AccessPoint_router_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AccessPoint_router_feature",
                                "_UI_AccessPoint_type" ),
                        SclPackage.eINSTANCE.getAccessPoint_Router(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Server At feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByServerAtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AccessPoint_ReferredByServerAt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AccessPoint_ReferredByServerAt_feature",
                                "_UI_AccessPoint_type" ),
                        SclPackage.eINSTANCE.getAccessPoint_ReferredByServerAt(),
                        true,
                        false,
                        true,
                        null,
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
                        getString( "_UI_AccessPoint_name_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AccessPoint_name_feature",
                                "_UI_AccessPoint_type" ),
                        SclPackage.eINSTANCE.getAccessPoint_Name(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Connected AP feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByConnectedAPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AccessPoint_ReferredByConnectedAP_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AccessPoint_ReferredByConnectedAP_feature", "_UI_AccessPoint_type" ),
                        SclPackage.eINSTANCE.getAccessPoint_ReferredByConnectedAP(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By KDC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByKDCPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AccessPoint_ReferredByKDC_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AccessPoint_ReferredByKDC_feature",
                                "_UI_AccessPoint_type" ),
                        SclPackage.eINSTANCE.getAccessPoint_ReferredByKDC(),
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
            childrenFeatures.add( SclPackage.eINSTANCE.getAccessPoint_LN() );
            childrenFeatures.add( SclPackage.eINSTANCE.getAccessPoint_SMVSecurity() );
            childrenFeatures.add( SclPackage.eINSTANCE.getAccessPoint_ServerAt() );
            childrenFeatures.add( SclPackage.eINSTANCE.getAccessPoint_Server() );
            childrenFeatures.add( SclPackage.eINSTANCE.getAccessPoint_Services() );
            childrenFeatures.add( SclPackage.eINSTANCE.getAccessPoint_GOOSESecurity() );
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
     * This returns AccessPoint.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/AccessPoint" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( AccessPoint ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_AccessPoint_type" )
                : getString( "_UI_AccessPoint_type" ) + " " + label;
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

        switch( notification.getFeatureID( AccessPoint.class ) ) {
        case SclPackage.ACCESS_POINT__CLOCK:
        case SclPackage.ACCESS_POINT__KDC:
        case SclPackage.ACCESS_POINT__ROUTER:
        case SclPackage.ACCESS_POINT__NAME:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case SclPackage.ACCESS_POINT__LN:
        case SclPackage.ACCESS_POINT__SMV_SECURITY:
        case SclPackage.ACCESS_POINT__SERVER_AT:
        case SclPackage.ACCESS_POINT__SERVER:
        case SclPackage.ACCESS_POINT__SERVICES:
        case SclPackage.ACCESS_POINT__GOOSE_SECURITY:
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

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getAccessPoint_LN(),
                SclFactory.eINSTANCE.createLN() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getAccessPoint_SMVSecurity(),
                SclFactory.eINSTANCE.createSMVSecurity() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getAccessPoint_ServerAt(),
                SclFactory.eINSTANCE.createServerAt() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getAccessPoint_Server(),
                SclFactory.eINSTANCE.createServer() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getAccessPoint_Services(),
                SclFactory.eINSTANCE.createServices() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getAccessPoint_GOOSESecurity(),
                SclFactory.eINSTANCE.createGOOSESecurity() ) );
    }

}
