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
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformerWindingItemProvider extends AbstractConductingEquipmentItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransformerWindingItemProvider( AdapterFactory adapterFactory ) {
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

            addTypePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TransformerWinding_type_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerWinding_type_feature",
                                "_UI_TransformerWinding_type" ),
                        SclPackage.eINSTANCE.getTransformerWinding_Type(),
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
            childrenFeatures.add( SclPackage.eINSTANCE.getTransformerWinding_EqFunction() );
            childrenFeatures.add( SclPackage.eINSTANCE.getTransformerWinding_NeutralPoint() );
            childrenFeatures.add( SclPackage.eINSTANCE.getTransformerWinding_TapChanger() );
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
     * This returns TransformerWinding.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/TransformerWinding" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( TransformerWinding ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_TransformerWinding_type" )
                : getString( "_UI_TransformerWinding_type" ) + " " + label;
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

        switch( notification.getFeatureID( TransformerWinding.class ) ) {
        case SclPackage.TRANSFORMER_WINDING__TYPE:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case SclPackage.TRANSFORMER_WINDING__EQ_FUNCTION:
        case SclPackage.TRANSFORMER_WINDING__NEUTRAL_POINT:
        case SclPackage.TRANSFORMER_WINDING__TAP_CHANGER:
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

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getTransformerWinding_EqFunction(),
                SclFactory.eINSTANCE.createEqFunction() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getTransformerWinding_NeutralPoint(),
                SclFactory.eINSTANCE.createNeutralPoint() ) );

        newChildDescriptors.add( createChildParameter( SclPackage.eINSTANCE.getTransformerWinding_TapChanger(),
                SclFactory.eINSTANCE.createTapChanger() ) );
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText( Object owner, Object feature, Object child, Collection< ? > selection ) {
        Object childFeature = feature;
        Object childObject = child;

        if( childFeature instanceof EStructuralFeature
                && FeatureMapUtil.isFeatureMap( ( EStructuralFeature ) childFeature ) ) {
            FeatureMap.Entry entry = ( FeatureMap.Entry ) childObject;
            childFeature = entry.getEStructuralFeature();
            childObject = entry.getValue();
        }

        boolean qualify = childFeature == SclPackage.eINSTANCE.getAbstractConductingEquipment_Terminal() ||
                childFeature == SclPackage.eINSTANCE.getTransformerWinding_NeutralPoint();

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

}
