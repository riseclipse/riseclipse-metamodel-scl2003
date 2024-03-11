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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SMVSettingsItemProvider extends ServiceSettingsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SMVSettingsItemProvider( AdapterFactory adapterFactory ) {
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

            addSvIDPropertyDescriptor( object );
            addOptFieldsPropertyDescriptor( object );
            addSmpRateAttributePropertyDescriptor( object );
            addSamplesPerSecAttributePropertyDescriptor( object );
            addPdcTimeStampPropertyDescriptor( object );
            addSynchSrcIdPropertyDescriptor( object );
            addNofASDUPropertyDescriptor( object );
            addKdaParticipantPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Sv ID feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSvIDPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SMVSettings_svID_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SMVSettings_svID_feature",
                                "_UI_SMVSettings_type" ),
                        SclPackage.eINSTANCE.getSMVSettings_SvID(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Opt Fields feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOptFieldsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SMVSettings_optFields_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SMVSettings_optFields_feature",
                                "_UI_SMVSettings_type" ),
                        SclPackage.eINSTANCE.getSMVSettings_OptFields(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Smp Rate Attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSmpRateAttributePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SMVSettings_smpRateAttribute_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SMVSettings_smpRateAttribute_feature",
                                "_UI_SMVSettings_type" ),
                        SclPackage.eINSTANCE.getSMVSettings_SmpRateAttribute(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Samples Per Sec Attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSamplesPerSecAttributePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SMVSettings_samplesPerSecAttribute_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SMVSettings_samplesPerSecAttribute_feature", "_UI_SMVSettings_type" ),
                        SclPackage.eINSTANCE.getSMVSettings_SamplesPerSecAttribute(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pdc Time Stamp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPdcTimeStampPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SMVSettings_pdcTimeStamp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SMVSettings_pdcTimeStamp_feature",
                                "_UI_SMVSettings_type" ),
                        SclPackage.eINSTANCE.getSMVSettings_PdcTimeStamp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Synch Src Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSynchSrcIdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SMVSettings_synchSrcId_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SMVSettings_synchSrcId_feature",
                                "_UI_SMVSettings_type" ),
                        SclPackage.eINSTANCE.getSMVSettings_SynchSrcId(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                        getString( "_UI_SMVSettings_nofASDU_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SMVSettings_nofASDU_feature",
                                "_UI_SMVSettings_type" ),
                        SclPackage.eINSTANCE.getSMVSettings_NofASDU(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kda Participant feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdaParticipantPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SMVSettings_kdaParticipant_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SMVSettings_kdaParticipant_feature",
                                "_UI_SMVSettings_type" ),
                        SclPackage.eINSTANCE.getSMVSettings_KdaParticipant(),
                        true,
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
            childrenFeatures.add( SclPackage.eINSTANCE.getSMVSettings_SmpRate() );
            childrenFeatures.add( SclPackage.eINSTANCE.getSMVSettings_SamplesPerSec() );
            childrenFeatures.add( SclPackage.eINSTANCE.getSMVSettings_SecPerSamples() );
            childrenFeatures.add( SclPackage.eINSTANCE.getSMVSettings_McSecurity() );
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
     * This returns SMVSettings.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/SMVSettings" ) );
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
        
        s.append( getString( "_UI_SMVSettings_type" ));
        s.append( ": " );
        
        s.append( getString( "_UI_ServiceSettings_cbName_feature" ));
        s.append( "=\"" );
        s.append((( SMVSettings ) object ).getCbName() );
        s.append( "\" " );
        
        s.append( "(" );
        s.append((( SMVSettings ) object ).getLineNumber() );
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

        switch( notification.getFeatureID( SMVSettings.class ) ) {
        case SclPackage.SMV_SETTINGS__SV_ID:
        case SclPackage.SMV_SETTINGS__OPT_FIELDS:
        case SclPackage.SMV_SETTINGS__SMP_RATE_ATTRIBUTE:
        case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC_ATTRIBUTE:
        case SclPackage.SMV_SETTINGS__PDC_TIME_STAMP:
        case SclPackage.SMV_SETTINGS__SYNCH_SRC_ID:
        case SclPackage.SMV_SETTINGS__NOF_ASDU:
        case SclPackage.SMV_SETTINGS__KDA_PARTICIPANT:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case SclPackage.SMV_SETTINGS__SMP_RATE:
        case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC:
        case SclPackage.SMV_SETTINGS__SEC_PER_SAMPLES:
        case SclPackage.SMV_SETTINGS__MC_SECURITY:
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

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getSMVSettings_SmpRate(),
                SclFactory.eINSTANCE.createSmpRate() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getSMVSettings_SamplesPerSec(),
                SclFactory.eINSTANCE.createSamplesPerSec() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getSMVSettings_SecPerSamples(),
                SclFactory.eINSTANCE.createSecPerSamples() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getSMVSettings_McSecurity(),
                SclFactory.eINSTANCE.createMcSecurity() ) );
    }

}
