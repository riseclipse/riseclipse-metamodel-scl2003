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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClientServicesItemProvider 
    extends SclObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClientServicesItemProvider(AdapterFactory adapterFactory) {
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

            addBufReportPropertyDescriptor(object);
            addGoosePropertyDescriptor(object);
            addGssePropertyDescriptor(object);
            addMaxAttributesPropertyDescriptor(object);
            addMaxGOOSEPropertyDescriptor(object);
            addMaxReportsPropertyDescriptor(object);
            addMaxSMVPropertyDescriptor(object);
            addReadLogPropertyDescriptor(object);
            addSupportsLdNamePropertyDescriptor(object);
            addSvPropertyDescriptor(object);
            addUnbufReportPropertyDescriptor(object);
            addRGOOSEPropertyDescriptor(object);
            addRSVPropertyDescriptor(object);
            addNoIctBindingPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Buf Report feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBufReportPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ClientServices_bufReport_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ClientServices_bufReport_feature", "_UI_ClientServices_type"),
                 SclPackage.eINSTANCE.getClientServices_BufReport(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Goose feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGoosePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ClientServices_goose_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ClientServices_goose_feature", "_UI_ClientServices_type"),
                 SclPackage.eINSTANCE.getClientServices_Goose(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Gsse feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGssePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ClientServices_gsse_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ClientServices_gsse_feature", "_UI_ClientServices_type"),
                 SclPackage.eINSTANCE.getClientServices_Gsse(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Max Attributes feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxAttributesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ClientServices_maxAttributes_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ClientServices_maxAttributes_feature", "_UI_ClientServices_type"),
                 SclPackage.eINSTANCE.getClientServices_MaxAttributes(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Max GOOSE feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxGOOSEPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ClientServices_maxGOOSE_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ClientServices_maxGOOSE_feature", "_UI_ClientServices_type"),
                 SclPackage.eINSTANCE.getClientServices_MaxGOOSE(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Max Reports feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxReportsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ClientServices_maxReports_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ClientServices_maxReports_feature", "_UI_ClientServices_type"),
                 SclPackage.eINSTANCE.getClientServices_MaxReports(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Max SMV feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxSMVPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ClientServices_maxSMV_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ClientServices_maxSMV_feature", "_UI_ClientServices_type"),
                 SclPackage.eINSTANCE.getClientServices_MaxSMV(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Read Log feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReadLogPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ClientServices_readLog_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ClientServices_readLog_feature", "_UI_ClientServices_type"),
                 SclPackage.eINSTANCE.getClientServices_ReadLog(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Supports Ld Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSupportsLdNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ClientServices_supportsLdName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ClientServices_supportsLdName_feature", "_UI_ClientServices_type"),
                 SclPackage.eINSTANCE.getClientServices_SupportsLdName(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Sv feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSvPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ClientServices_sv_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ClientServices_sv_feature", "_UI_ClientServices_type"),
                 SclPackage.eINSTANCE.getClientServices_Sv(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Unbuf Report feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUnbufReportPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ClientServices_unbufReport_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ClientServices_unbufReport_feature", "_UI_ClientServices_type"),
                 SclPackage.eINSTANCE.getClientServices_UnbufReport(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the RGOOSE feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRGOOSEPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ClientServices_rGOOSE_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ClientServices_rGOOSE_feature", "_UI_ClientServices_type"),
                 SclPackage.eINSTANCE.getClientServices_RGOOSE(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the RSV feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRSVPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ClientServices_rSV_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ClientServices_rSV_feature", "_UI_ClientServices_type"),
                 SclPackage.eINSTANCE.getClientServices_RSV(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the No Ict Binding feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNoIctBindingPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ClientServices_noIctBinding_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ClientServices_noIctBinding_feature", "_UI_ClientServices_type"),
                 SclPackage.eINSTANCE.getClientServices_NoIctBinding(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
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
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(SclPackage.eINSTANCE.getClientServices_TimeSyncProt());
            childrenFeatures.add(SclPackage.eINSTANCE.getClientServices_McSecurity());
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns ClientServices.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ClientServices"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        Boolean labelValue = ((ClientServices)object).getSupportsLdName();
        String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ?
            getString("_UI_ClientServices_type") :
            getString("_UI_ClientServices_type") + " " + label;
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

        switch (notification.getFeatureID(ClientServices.class)) {
            case SclPackage.CLIENT_SERVICES__BUF_REPORT:
            case SclPackage.CLIENT_SERVICES__GOOSE:
            case SclPackage.CLIENT_SERVICES__GSSE:
            case SclPackage.CLIENT_SERVICES__MAX_ATTRIBUTES:
            case SclPackage.CLIENT_SERVICES__MAX_GOOSE:
            case SclPackage.CLIENT_SERVICES__MAX_REPORTS:
            case SclPackage.CLIENT_SERVICES__MAX_SMV:
            case SclPackage.CLIENT_SERVICES__READ_LOG:
            case SclPackage.CLIENT_SERVICES__SUPPORTS_LD_NAME:
            case SclPackage.CLIENT_SERVICES__SV:
            case SclPackage.CLIENT_SERVICES__UNBUF_REPORT:
            case SclPackage.CLIENT_SERVICES__RGOOSE:
            case SclPackage.CLIENT_SERVICES__RSV:
            case SclPackage.CLIENT_SERVICES__NO_ICT_BINDING:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case SclPackage.CLIENT_SERVICES__TIME_SYNC_PROT:
            case SclPackage.CLIENT_SERVICES__MC_SECURITY:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getClientServices_TimeSyncProt(),
                 SclFactory.eINSTANCE.createTimeSyncProt()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getClientServices_McSecurity(),
                 SclFactory.eINSTANCE.createMcSecurity()));
    }

}
