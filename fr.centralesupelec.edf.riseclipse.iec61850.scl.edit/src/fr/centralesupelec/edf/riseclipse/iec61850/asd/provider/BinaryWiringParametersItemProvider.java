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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryWiringParametersItemProvider extends WiringParametersItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BinaryWiringParametersItemProvider( AdapterFactory adapterFactory ) {
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

            addDebTmPropertyDescriptor( object );
            addFastOutputPropertyDescriptor( object );
            addOutNamPropertyDescriptor( object );
            addOutOffDlPropertyDescriptor( object );
            addOutOnDlPropertyDescriptor( object );
            addOutRefPropertyDescriptor( object );
            addOutTypPropertyDescriptor( object );
            addVInOffPropertyDescriptor( object );
            addVInOnPropertyDescriptor( object );
            addReferredByBinaryWiringParametersRefPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Deb Tm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDebTmPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BinaryWiringParameters_debTm_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BinaryWiringParameters_debTm_feature",
                                "_UI_BinaryWiringParameters_type" ),
                        AsdPackage.eINSTANCE.getBinaryWiringParameters_DebTm(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fast Output feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFastOutputPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BinaryWiringParameters_fastOutput_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_BinaryWiringParameters_fastOutput_feature", "_UI_BinaryWiringParameters_type" ),
                        AsdPackage.eINSTANCE.getBinaryWiringParameters_FastOutput(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Out Nam feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutNamPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BinaryWiringParameters_outNam_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BinaryWiringParameters_outNam_feature",
                                "_UI_BinaryWiringParameters_type" ),
                        AsdPackage.eINSTANCE.getBinaryWiringParameters_OutNam(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Out Off Dl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutOffDlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BinaryWiringParameters_outOffDl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BinaryWiringParameters_outOffDl_feature",
                                "_UI_BinaryWiringParameters_type" ),
                        AsdPackage.eINSTANCE.getBinaryWiringParameters_OutOffDl(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Out On Dl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutOnDlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BinaryWiringParameters_outOnDl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BinaryWiringParameters_outOnDl_feature",
                                "_UI_BinaryWiringParameters_type" ),
                        AsdPackage.eINSTANCE.getBinaryWiringParameters_OutOnDl(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Out Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutRefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BinaryWiringParameters_outRef_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BinaryWiringParameters_outRef_feature",
                                "_UI_BinaryWiringParameters_type" ),
                        AsdPackage.eINSTANCE.getBinaryWiringParameters_OutRef(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Out Typ feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutTypPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BinaryWiringParameters_outTyp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BinaryWiringParameters_outTyp_feature",
                                "_UI_BinaryWiringParameters_type" ),
                        AsdPackage.eINSTANCE.getBinaryWiringParameters_OutTyp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the VIn Off feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVInOffPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BinaryWiringParameters_vInOff_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BinaryWiringParameters_vInOff_feature",
                                "_UI_BinaryWiringParameters_type" ),
                        AsdPackage.eINSTANCE.getBinaryWiringParameters_VInOff(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the VIn On feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVInOnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BinaryWiringParameters_vInOn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BinaryWiringParameters_vInOn_feature",
                                "_UI_BinaryWiringParameters_type" ),
                        AsdPackage.eINSTANCE.getBinaryWiringParameters_VInOn(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Binary Wiring Parameters Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByBinaryWiringParametersRefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BinaryWiringParameters_ReferredByBinaryWiringParametersRef_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_BinaryWiringParameters_ReferredByBinaryWiringParametersRef_feature",
                                "_UI_BinaryWiringParameters_type" ),
                        AsdPackage.eINSTANCE.getBinaryWiringParameters_ReferredByBinaryWiringParametersRef(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns BinaryWiringParameters.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/BinaryWiringParameters" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( BinaryWiringParameters ) object ).getFilename();
        return label == null || label.length() == 0 ? getString( "_UI_BinaryWiringParameters_type" )
                : getString( "_UI_BinaryWiringParameters_type" ) + " " + label;
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

        switch( notification.getFeatureID( BinaryWiringParameters.class ) ) {
        case AsdPackage.BINARY_WIRING_PARAMETERS__DEB_TM:
        case AsdPackage.BINARY_WIRING_PARAMETERS__FAST_OUTPUT:
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_NAM:
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_OFF_DL:
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_ON_DL:
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_REF:
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_TYP:
        case AsdPackage.BINARY_WIRING_PARAMETERS__VIN_OFF:
        case AsdPackage.BINARY_WIRING_PARAMETERS__VIN_ON:
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
