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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicesItemProvider 
    extends SclObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServicesItemProvider(AdapterFactory adapterFactory) {
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

            addNameLengthPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Name Length feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNameLengthPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Services_nameLength_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Services_nameLength_feature", "_UI_Services_type"),
                 SclPackage.eINSTANCE.getServices_NameLength(),
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
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_ClientServices());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_CommProt());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_ConfDataSet());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_ConfLNs());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_ConfLdName());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_ConfLogControl());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_ConfReportControl());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_ConfSigRef());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_DataObjectDirectory());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_DataSetDirectory());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_DynAssociation());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_DynDataSet());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_FileHandling());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_GOOSE());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_GSEDir());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_GSESettings());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_GSSE());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_GetCBValues());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_GetDataObjectDefinition());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_GetDataSetValue());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_GetDirectory());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_LogSettings());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_ReadWrite());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_RedProt());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_ReportSettings());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_SMVsc());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_SupSubscription());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_ValueHandling());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_SetDataSetValue());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_SettingGroups());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_TimeSyncProt());
            childrenFeatures.add(SclPackage.eINSTANCE.getServices_TimerActivatedControl());
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
     * This returns Services.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Services"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        Integer labelValue = ((Services)object).getNameLength();
        String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ?
            getString("_UI_Services_type") :
            getString("_UI_Services_type") + " " + label;
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

        switch (notification.getFeatureID(Services.class)) {
            case SclPackage.SERVICES__NAME_LENGTH:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case SclPackage.SERVICES__CLIENT_SERVICES:
            case SclPackage.SERVICES__COMM_PROT:
            case SclPackage.SERVICES__CONF_DATA_SET:
            case SclPackage.SERVICES__CONF_LNS:
            case SclPackage.SERVICES__CONF_LD_NAME:
            case SclPackage.SERVICES__CONF_LOG_CONTROL:
            case SclPackage.SERVICES__CONF_REPORT_CONTROL:
            case SclPackage.SERVICES__CONF_SIG_REF:
            case SclPackage.SERVICES__DATA_OBJECT_DIRECTORY:
            case SclPackage.SERVICES__DATA_SET_DIRECTORY:
            case SclPackage.SERVICES__DYN_ASSOCIATION:
            case SclPackage.SERVICES__DYN_DATA_SET:
            case SclPackage.SERVICES__FILE_HANDLING:
            case SclPackage.SERVICES__GOOSE:
            case SclPackage.SERVICES__GSE_DIR:
            case SclPackage.SERVICES__GSE_SETTINGS:
            case SclPackage.SERVICES__GSSE:
            case SclPackage.SERVICES__GET_CB_VALUES:
            case SclPackage.SERVICES__GET_DATA_OBJECT_DEFINITION:
            case SclPackage.SERVICES__GET_DATA_SET_VALUE:
            case SclPackage.SERVICES__GET_DIRECTORY:
            case SclPackage.SERVICES__LOG_SETTINGS:
            case SclPackage.SERVICES__READ_WRITE:
            case SclPackage.SERVICES__RED_PROT:
            case SclPackage.SERVICES__REPORT_SETTINGS:
            case SclPackage.SERVICES__SM_VSC:
            case SclPackage.SERVICES__SUP_SUBSCRIPTION:
            case SclPackage.SERVICES__VALUE_HANDLING:
            case SclPackage.SERVICES__SET_DATA_SET_VALUE:
            case SclPackage.SERVICES__SETTING_GROUPS:
            case SclPackage.SERVICES__TIME_SYNC_PROT:
            case SclPackage.SERVICES__TIMER_ACTIVATED_CONTROL:
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
                (SclPackage.eINSTANCE.getServices_ClientServices(),
                 SclFactory.eINSTANCE.createClientServices()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_CommProt(),
                 SclFactory.eINSTANCE.createCommProt()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_ConfDataSet(),
                 SclFactory.eINSTANCE.createConfDataSet()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_ConfLNs(),
                 SclFactory.eINSTANCE.createConfLNs()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_ConfLdName(),
                 SclFactory.eINSTANCE.createConfLdName()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_ConfLogControl(),
                 SclFactory.eINSTANCE.createConfLogControl()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_ConfReportControl(),
                 SclFactory.eINSTANCE.createConfReportControl()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_ConfSigRef(),
                 SclFactory.eINSTANCE.createConfSigRef()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_DataObjectDirectory(),
                 SclFactory.eINSTANCE.createDataObjectDirectory()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_DataSetDirectory(),
                 SclFactory.eINSTANCE.createDataSetDirectory()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_DynAssociation(),
                 SclFactory.eINSTANCE.createDynAssociation()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_DynDataSet(),
                 SclFactory.eINSTANCE.createDynDataSet()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_FileHandling(),
                 SclFactory.eINSTANCE.createFileHandling()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_GOOSE(),
                 SclFactory.eINSTANCE.createGOOSE()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_GSEDir(),
                 SclFactory.eINSTANCE.createGSEDir()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_GSESettings(),
                 SclFactory.eINSTANCE.createGSESettings()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_GSSE(),
                 SclFactory.eINSTANCE.createGSSE()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_GetCBValues(),
                 SclFactory.eINSTANCE.createGetCBValues()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_GetDataObjectDefinition(),
                 SclFactory.eINSTANCE.createGetDataObjectDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_GetDataSetValue(),
                 SclFactory.eINSTANCE.createGetDataSetValue()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_GetDirectory(),
                 SclFactory.eINSTANCE.createGetDirectory()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_LogSettings(),
                 SclFactory.eINSTANCE.createLogSettings()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_ReadWrite(),
                 SclFactory.eINSTANCE.createReadWrite()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_RedProt(),
                 SclFactory.eINSTANCE.createRedProt()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_ReportSettings(),
                 SclFactory.eINSTANCE.createReportSettings()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_SMVsc(),
                 SclFactory.eINSTANCE.createSMVsc()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_SupSubscription(),
                 SclFactory.eINSTANCE.createSupSubscription()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_ValueHandling(),
                 SclFactory.eINSTANCE.createValueHandling()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_SetDataSetValue(),
                 SclFactory.eINSTANCE.createSetDataSetValue()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_SettingGroups(),
                 SclFactory.eINSTANCE.createSettingGroups()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_TimeSyncProt(),
                 SclFactory.eINSTANCE.createTimeSyncProt()));

        newChildDescriptors.add
            (createChildParameter
                (SclPackage.eINSTANCE.getServices_TimerActivatedControl(),
                 SclFactory.eINSTANCE.createTimerActivatedControl()));
    }

}
