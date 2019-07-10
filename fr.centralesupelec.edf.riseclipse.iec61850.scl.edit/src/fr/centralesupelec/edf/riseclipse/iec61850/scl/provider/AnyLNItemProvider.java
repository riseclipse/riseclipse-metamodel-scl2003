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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnyLNItemProvider extends UnNamingItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyLNItemProvider( AdapterFactory adapterFactory ) {
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
            addLnClassPropertyDescriptor( object );
            addLnTypePropertyDescriptor( object );
            addRefersToLNodeTypePropertyDescriptor( object );
            addReferredByClientLNPropertyDescriptor( object );
            addReferredByLogControlPropertyDescriptor( object );
            addReferredByAssociationPropertyDescriptor( object );
            addReferredByIEDNamePropertyDescriptor( object );
            addReferredByLNodePropertyDescriptor( object );
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
                        getString( "_UI_AnyLN_inst_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AnyLN_inst_feature", "_UI_AnyLN_type" ),
                        SclPackage.eINSTANCE.getAnyLN_Inst(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ln Class feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLnClassPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AnyLN_lnClass_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AnyLN_lnClass_feature",
                                "_UI_AnyLN_type" ),
                        SclPackage.eINSTANCE.getAnyLN_LnClass(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ln Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLnTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AnyLN_lnType_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AnyLN_lnType_feature", "_UI_AnyLN_type" ),
                        SclPackage.eINSTANCE.getAnyLN_LnType(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Refers To LNode Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRefersToLNodeTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AnyLN_RefersToLNodeType_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AnyLN_RefersToLNodeType_feature",
                                "_UI_AnyLN_type" ),
                        SclPackage.eINSTANCE.getAnyLN_RefersToLNodeType(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Client LN feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByClientLNPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AnyLN_ReferredByClientLN_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AnyLN_ReferredByClientLN_feature",
                                "_UI_AnyLN_type" ),
                        SclPackage.eINSTANCE.getAnyLN_ReferredByClientLN(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Log Control feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByLogControlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AnyLN_ReferredByLogControl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AnyLN_ReferredByLogControl_feature",
                                "_UI_AnyLN_type" ),
                        SclPackage.eINSTANCE.getAnyLN_ReferredByLogControl(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By Association feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByAssociationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AnyLN_ReferredByAssociation_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AnyLN_ReferredByAssociation_feature",
                                "_UI_AnyLN_type" ),
                        SclPackage.eINSTANCE.getAnyLN_ReferredByAssociation(),
                        true,
                        false,
                        true,
                        null,
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
                        getString( "_UI_AnyLN_ReferredByIEDName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AnyLN_ReferredByIEDName_feature",
                                "_UI_AnyLN_type" ),
                        SclPackage.eINSTANCE.getAnyLN_ReferredByIEDName(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Referred By LNode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferredByLNodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AnyLN_ReferredByLNode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AnyLN_ReferredByLNode_feature",
                                "_UI_AnyLN_type" ),
                        SclPackage.eINSTANCE.getAnyLN_ReferredByLNode(),
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
            childrenFeatures.add( SclPackage.eINSTANCE.getAnyLN_Inputs() );
            childrenFeatures.add( SclPackage.eINSTANCE.getAnyLN_Log() );
            childrenFeatures.add( SclPackage.eINSTANCE.getAnyLN_DOI() );
            childrenFeatures.add( SclPackage.eINSTANCE.getAnyLN_ReportControl() );
            childrenFeatures.add( SclPackage.eINSTANCE.getAnyLN_LogControl() );
            childrenFeatures.add( SclPackage.eINSTANCE.getAnyLN_DataSet() );
            childrenFeatures.add( SclPackage.eINSTANCE.getAnyLN_Control() );
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
     * This returns AnyLN.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/AnyLN" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        AnyLN anyLN = ( AnyLN ) object;
        return getString( "_UI_AnyLN_type" ) + " " + anyLN.getLineNumber();
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

        switch( notification.getFeatureID( AnyLN.class ) ) {
        case SclPackage.ANY_LN__INST:
        case SclPackage.ANY_LN__LN_CLASS:
        case SclPackage.ANY_LN__LN_TYPE:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case SclPackage.ANY_LN__INPUTS:
        case SclPackage.ANY_LN__LOG:
        case SclPackage.ANY_LN__DOI:
        case SclPackage.ANY_LN__REPORT_CONTROL:
        case SclPackage.ANY_LN__LOG_CONTROL:
        case SclPackage.ANY_LN__DATA_SET:
        case SclPackage.ANY_LN__CONTROL:
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

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getAnyLN_Inputs(),
                SclFactory.eINSTANCE.createInputs() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getAnyLN_Log(),
                SclFactory.eINSTANCE.createLog() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getAnyLN_DOI(),
                SclFactory.eINSTANCE.createDOI() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getAnyLN_ReportControl(),
                SclFactory.eINSTANCE.createReportControl() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getAnyLN_LogControl(),
                SclFactory.eINSTANCE.createLogControl() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getAnyLN_DataSet(),
                SclFactory.eINSTANCE.createDataSet() ) );
    }

}
