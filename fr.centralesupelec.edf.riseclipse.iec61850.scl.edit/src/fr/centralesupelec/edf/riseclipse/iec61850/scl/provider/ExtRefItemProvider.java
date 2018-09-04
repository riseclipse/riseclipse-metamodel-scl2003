/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
 *      http://wdi.supelec.fr/software/RiseClipse/
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
public class ExtRefItemProvider extends BaseElementItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtRefItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addDaNamePropertyDescriptor(object);
            addDoNamePropertyDescriptor(object);
            addIedNamePropertyDescriptor(object);
            addIntAddrPropertyDescriptor(object);
            addLdInstPropertyDescriptor(object);
            addLnClassPropertyDescriptor(object);
            addLnInstPropertyDescriptor(object);
            addPrefixPropertyDescriptor(object);
            addServiceTypePropertyDescriptor(object);
            addSrcCBNamePropertyDescriptor(object);
            addSrcLDInstPropertyDescriptor(object);
            addSrcLNClassPropertyDescriptor(object);
            addSrcLNInstPropertyDescriptor(object);
            addSrcPrefixPropertyDescriptor(object);
            addRefersToAnyLNPropertyDescriptor(object);
            addRefersToDataAttributePropertyDescriptor(object);
            addRefersToDataObjectPropertyDescriptor(object);
            addDescPropertyDescriptor(object);
            addPServTPropertyDescriptor(object);
            addPLNPropertyDescriptor(object);
            addPDOPropertyDescriptor(object);
            addPDAPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Da Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDaNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_daName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_daName_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_DaName(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Do Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDoNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_doName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_doName_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_DoName(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Ied Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIedNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_iedName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_iedName_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_IedName(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Int Addr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIntAddrPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_intAddr_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_intAddr_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_IntAddr(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Ld Inst feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLdInstPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_ldInst_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_ldInst_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_LdInst(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Ln Class feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLnClassPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_lnClass_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_lnClass_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_LnClass(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Ln Inst feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLnInstPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_lnInst_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_lnInst_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_LnInst(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Prefix feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPrefixPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_prefix_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_prefix_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_Prefix(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Service Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServiceTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_serviceType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_serviceType_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_ServiceType(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Src CB Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSrcCBNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_srcCBName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_srcCBName_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_SrcCBName(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Src LD Inst feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSrcLDInstPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_srcLDInst_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_srcLDInst_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_SrcLDInst(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Src LN Class feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSrcLNClassPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_srcLNClass_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_srcLNClass_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_SrcLNClass(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Src LN Inst feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSrcLNInstPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_srcLNInst_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_srcLNInst_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_SrcLNInst(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Src Prefix feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSrcPrefixPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_srcPrefix_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_srcPrefix_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_SrcPrefix(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Refers To Any LN feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToAnyLNPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_RefersToAnyLN_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_RefersToAnyLN_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_RefersToAnyLN(),
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Refers To Data Attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToDataAttributePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_RefersToDataAttribute_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_RefersToDataAttribute_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_RefersToDataAttribute(),
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Refers To Data Object feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToDataObjectPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_RefersToDataObject_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_RefersToDataObject_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_RefersToDataObject(),
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Desc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDescPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_desc_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_desc_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_Desc(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the PServ T feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPServTPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_pServT_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_pServT_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_PServT(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the PLN feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPLNPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_pLN_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_pLN_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_PLN(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the PDO feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPDOPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_pDO_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_pDO_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_PDO(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the PDA feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPDAPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExtRef_pDA_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExtRef_pDA_feature", "_UI_ExtRef_type"),
                 SclPackage.eINSTANCE.getExtRef_PDA(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns ExtRef.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ExtRef"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((ExtRef)object).getDaName();
        return label == null || label.length() == 0 ?
            getString("_UI_ExtRef_type") :
            getString("_UI_ExtRef_type") + " " + label;
    }
    

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(ExtRef.class)) {
            case SclPackage.EXT_REF__DA_NAME:
            case SclPackage.EXT_REF__DO_NAME:
            case SclPackage.EXT_REF__IED_NAME:
            case SclPackage.EXT_REF__INT_ADDR:
            case SclPackage.EXT_REF__LD_INST:
            case SclPackage.EXT_REF__LN_CLASS:
            case SclPackage.EXT_REF__LN_INST:
            case SclPackage.EXT_REF__PREFIX:
            case SclPackage.EXT_REF__SERVICE_TYPE:
            case SclPackage.EXT_REF__SRC_CB_NAME:
            case SclPackage.EXT_REF__SRC_LD_INST:
            case SclPackage.EXT_REF__SRC_LN_CLASS:
            case SclPackage.EXT_REF__SRC_LN_INST:
            case SclPackage.EXT_REF__SRC_PREFIX:
            case SclPackage.EXT_REF__DESC:
            case SclPackage.EXT_REF__PSERV_T:
            case SclPackage.EXT_REF__PLN:
            case SclPackage.EXT_REF__PDO:
            case SclPackage.EXT_REF__PDA:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
