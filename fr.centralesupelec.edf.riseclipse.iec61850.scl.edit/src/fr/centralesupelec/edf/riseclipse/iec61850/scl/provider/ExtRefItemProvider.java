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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtRefItemProvider extends DORefItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtRefItemProvider( AdapterFactory adapterFactory ) {
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

            addDaNamePropertyDescriptor( object );
            addIntAddrPropertyDescriptor( object );
            addServiceTypePropertyDescriptor( object );
            addSrcCBNamePropertyDescriptor( object );
            addSrcLDInstPropertyDescriptor( object );
            addSrcLNClassPropertyDescriptor( object );
            addSrcLNInstPropertyDescriptor( object );
            addSrcPrefixPropertyDescriptor( object );
            addRefersToAbstractDataAttributePropertyDescriptor( object );
            addRefersToAbstractDataObjectPropertyDescriptor( object );
            addPServTPropertyDescriptor( object );
            addPDAPropertyDescriptor( object );
            addRefersToControlPropertyDescriptor( object );
            addSrcCBUuidPropertyDescriptor( object );
            addReferredBySourceRefPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Da Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDaNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExtRef_daName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExtRef_daName_feature",
                                "_UI_ExtRef_type" ),
                        SclPackage.eINSTANCE.getExtRef_DaName(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Int Addr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIntAddrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExtRef_intAddr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExtRef_intAddr_feature",
                                "_UI_ExtRef_type" ),
                        SclPackage.eINSTANCE.getExtRef_IntAddr(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Service Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServiceTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExtRef_serviceType_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExtRef_serviceType_feature",
                                "_UI_ExtRef_type" ),
                        SclPackage.eINSTANCE.getExtRef_ServiceType(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Src CB Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSrcCBNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExtRef_srcCBName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExtRef_srcCBName_feature",
                                "_UI_ExtRef_type" ),
                        SclPackage.eINSTANCE.getExtRef_SrcCBName(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Src LD Inst feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSrcLDInstPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExtRef_srcLDInst_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExtRef_srcLDInst_feature",
                                "_UI_ExtRef_type" ),
                        SclPackage.eINSTANCE.getExtRef_SrcLDInst(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Src LN Class feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSrcLNClassPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExtRef_srcLNClass_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExtRef_srcLNClass_feature",
                                "_UI_ExtRef_type" ),
                        SclPackage.eINSTANCE.getExtRef_SrcLNClass(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Src LN Inst feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSrcLNInstPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExtRef_srcLNInst_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExtRef_srcLNInst_feature",
                                "_UI_ExtRef_type" ),
                        SclPackage.eINSTANCE.getExtRef_SrcLNInst(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Src Prefix feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSrcPrefixPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExtRef_srcPrefix_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExtRef_srcPrefix_feature",
                                "_UI_ExtRef_type" ),
                        SclPackage.eINSTANCE.getExtRef_SrcPrefix(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Abstract Data Attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToAbstractDataAttributePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExtRef_RefersToAbstractDataAttribute_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ExtRef_RefersToAbstractDataAttribute_feature", "_UI_ExtRef_type" ),
                        SclPackage.eINSTANCE.getExtRef_RefersToAbstractDataAttribute(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Abstract Data Object feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToAbstractDataObjectPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExtRef_RefersToAbstractDataObject_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ExtRef_RefersToAbstractDataObject_feature", "_UI_ExtRef_type" ),
                        SclPackage.eINSTANCE.getExtRef_RefersToAbstractDataObject(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the PServ T feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPServTPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExtRef_pServT_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExtRef_pServT_feature",
                                "_UI_ExtRef_type" ),
                        SclPackage.eINSTANCE.getExtRef_PServT(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the PDA feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPDAPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExtRef_pDA_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExtRef_pDA_feature", "_UI_ExtRef_type" ),
                        SclPackage.eINSTANCE.getExtRef_PDA(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To Control feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToControlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExtRef_RefersToControl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExtRef_RefersToControl_feature",
                                "_UI_ExtRef_type" ),
                        SclPackage.eINSTANCE.getExtRef_RefersToControl(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Src CB Uuid feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSrcCBUuidPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExtRef_srcCBUuid_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExtRef_srcCBUuid_feature",
                                "_UI_ExtRef_type" ),
                        SclPackage.eINSTANCE.getExtRef_SrcCBUuid(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                        getString( "_UI_ExtRef_ReferredBySourceRef_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExtRef_ReferredBySourceRef_feature",
                                "_UI_ExtRef_type" ),
                        SclPackage.eINSTANCE.getExtRef_ReferredBySourceRef(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns ExtRef.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ExtRef" ) );
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

        s.append( getString( "_UI_ExtRef_type" ) );
        s.append( ": " );

        s.append( getString( "_UI_ExtRef_doName_feature" ) );
        s.append( "=\"" );
        s.append( ( ( ExtRef ) object ).getDoName() );
        s.append( "\" " );

        s.append( getString( "_UI_ExtRef_daName_feature" ) );
        s.append( "=\"" );
        s.append( ( ( ExtRef ) object ).getDaName() );
        s.append( "\" " );

        s.append( "(" );
        s.append( ( ( ExtRef ) object ).getLineNumber() );
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

        switch( notification.getFeatureID( ExtRef.class ) ) {
        case SclPackage.EXT_REF__DA_NAME:
        case SclPackage.EXT_REF__INT_ADDR:
        case SclPackage.EXT_REF__SERVICE_TYPE:
        case SclPackage.EXT_REF__SRC_CB_NAME:
        case SclPackage.EXT_REF__SRC_LD_INST:
        case SclPackage.EXT_REF__SRC_LN_CLASS:
        case SclPackage.EXT_REF__SRC_LN_INST:
        case SclPackage.EXT_REF__SRC_PREFIX:
        case SclPackage.EXT_REF__PSERV_T:
        case SclPackage.EXT_REF__PDA:
        case SclPackage.EXT_REF__SRC_CB_UUID:
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
