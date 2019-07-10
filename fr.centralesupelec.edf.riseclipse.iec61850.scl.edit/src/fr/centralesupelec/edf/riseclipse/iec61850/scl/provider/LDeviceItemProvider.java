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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LDeviceItemProvider extends UnNamingItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LDeviceItemProvider( AdapterFactory adapterFactory ) {
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

            addInstPropertyDescriptor( object );
            addLdNamePropertyDescriptor( object );
            addReferredByIEDNamePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Inst feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInstPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LDevice_inst_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LDevice_inst_feature",
                                "_UI_LDevice_type" ),
                        SclPackage.eINSTANCE.getLDevice_Inst(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ld Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLdNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LDevice_ldName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LDevice_ldName_feature",
                                "_UI_LDevice_type" ),
                        SclPackage.eINSTANCE.getLDevice_LdName(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By IED Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByIEDNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LDevice_ReferredByIEDName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LDevice_ReferredByIEDName_feature",
                                "_UI_LDevice_type" ),
                        SclPackage.eINSTANCE.getLDevice_ReferredByIEDName(),
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
            childrenFeatures.add( SclPackage.eINSTANCE.getLDevice_AccessControl() );
            childrenFeatures.add( SclPackage.eINSTANCE.getLDevice_LN0() );
            childrenFeatures.add( SclPackage.eINSTANCE.getLDevice_LN() );
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
     * This returns LDevice.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/LDevice" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( LDevice ) object ).getLdName();
        return label == null || label.length() == 0 ? getString( "_UI_LDevice_type" )
                : getString( "_UI_LDevice_type" ) + " " + label;
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

        switch( notification.getFeatureID( LDevice.class ) ) {
        case SclPackage.LDEVICE__INST:
        case SclPackage.LDEVICE__LD_NAME:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case SclPackage.LDEVICE__ACCESS_CONTROL:
        case SclPackage.LDEVICE__LN0:
        case SclPackage.LDEVICE__LN:
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

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getLDevice_AccessControl(),
                SclFactory.eINSTANCE.createAccessControl() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getLDevice_LN0(),
                SclFactory.eINSTANCE.createLN0() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getLDevice_LN(),
                SclFactory.eINSTANCE.createLN() ) );
    }

}
