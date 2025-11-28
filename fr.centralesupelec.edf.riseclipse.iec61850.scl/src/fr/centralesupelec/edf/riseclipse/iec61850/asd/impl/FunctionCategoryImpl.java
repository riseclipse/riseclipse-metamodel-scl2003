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
package fr.centralesupelec.edf.riseclipse.iec61850.asd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionCategoryImpl#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionCategoryImpl#getFunctionCatRef <em>Function Cat Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionCategoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionCategoryImpl#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionCategoryImpl#getTemplateUuid <em>Template Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionCategoryImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionCategoryImpl#getReferredByFunctionCategoryRef <em>Referred By Function Category Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionCategoryImpl extends BaseExtensionElementWithDescImpl implements FunctionCategory {
    /**
     * The cached value of the '{@link #getSubCategory() <em>Sub Category</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubCategory()
     * @generated
     * @ordered
     */
    protected EList< SubCategory > subCategory;

    /**
     * The cached value of the '{@link #getFunctionCatRef() <em>Function Cat Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionCatRef()
     * @generated
     * @ordered
     */
    protected EList< FunctionCatRef > functionCatRef;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getOriginUuid() <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginUuid()
     * @generated
     * @ordered
     */
    protected static final String ORIGIN_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOriginUuid() <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginUuid()
     * @generated
     * @ordered
     */
    protected String originUuid = ORIGIN_UUID_EDEFAULT;

    /**
     * The default value of the '{@link #getTemplateUuid() <em>Template Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemplateUuid()
     * @generated
     * @ordered
     */
    protected static final String TEMPLATE_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTemplateUuid() <em>Template Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemplateUuid()
     * @generated
     * @ordered
     */
    protected String templateUuid = TEMPLATE_UUID_EDEFAULT;

    /**
     * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUuid()
     * @generated
     * @ordered
     */
    protected static final String UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUuid()
     * @generated
     * @ordered
     */
    protected String uuid = UUID_EDEFAULT;

    /**
     * The cached value of the '{@link #getReferredByFunctionCategoryRef() <em>Referred By Function Category Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByFunctionCategoryRef()
     * @generated
     * @ordered
     */
    protected EList< FunctionCategoryRef > referredByFunctionCategoryRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FunctionCategoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getFunctionCategory();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SubCategory > getSubCategory() {
        if( subCategory == null ) {
            subCategory = new EObjectContainmentWithInverseEList.Unsettable< >( SubCategory.class, this,
                    AsdPackage.FUNCTION_CATEGORY__SUB_CATEGORY, AsdPackage.SUB_CATEGORY__PARENT_FUNCTION_CATEGORY );
        }
        return subCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubCategory() {
        if( subCategory != null ) {
            ( ( InternalEList.Unsettable< ? > ) subCategory ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubCategory() {
        return subCategory != null && ( ( InternalEList.Unsettable< ? > ) subCategory ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FunctionCatRef > getFunctionCatRef() {
        if( functionCatRef == null ) {
            functionCatRef = new EObjectContainmentWithInverseEList.Unsettable< >( FunctionCatRef.class,
                    this, AsdPackage.FUNCTION_CATEGORY__FUNCTION_CAT_REF,
                    AsdPackage.FUNCTION_CAT_REF__PARENT_FUNCTION_CATEGORY );
        }
        return functionCatRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFunctionCatRef() {
        if( functionCatRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) functionCatRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFunctionCatRef() {
        return functionCatRef != null && ( ( InternalEList.Unsettable< ? > ) functionCatRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_CATEGORY__NAME, oldName,
                    name ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOriginUuid() {
        return originUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOriginUuid( String newOriginUuid ) {
        String oldOriginUuid = originUuid;
        originUuid = newOriginUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_CATEGORY__ORIGIN_UUID,
                    oldOriginUuid, originUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTemplateUuid() {
        return templateUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTemplateUuid( String newTemplateUuid ) {
        String oldTemplateUuid = templateUuid;
        templateUuid = newTemplateUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_CATEGORY__TEMPLATE_UUID,
                    oldTemplateUuid, templateUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUuid() {
        return uuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUuid( String newUuid ) {
        String oldUuid = uuid;
        uuid = newUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_CATEGORY__UUID, oldUuid,
                    uuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FunctionCategoryRef > getReferredByFunctionCategoryRef() {
        if( referredByFunctionCategoryRef == null ) {
            referredByFunctionCategoryRef = new EObjectWithInverseResolvingEList.Unsettable< >(
                    FunctionCategoryRef.class, this, AsdPackage.FUNCTION_CATEGORY__REFERRED_BY_FUNCTION_CATEGORY_REF,
                    AsdPackage.FUNCTION_CATEGORY_REF__REFERS_TO_FUNCTION_CATEGORY );
        }
        return referredByFunctionCategoryRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByFunctionCategoryRef() {
        if( referredByFunctionCategoryRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByFunctionCategoryRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByFunctionCategoryRef() {
        return referredByFunctionCategoryRef != null
                && ( ( InternalEList.Unsettable< ? > ) referredByFunctionCategoryRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.FUNCTION_CATEGORY__SUB_CATEGORY:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSubCategory() ).basicAdd( otherEnd,
                    msgs );
        case AsdPackage.FUNCTION_CATEGORY__FUNCTION_CAT_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFunctionCatRef() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.FUNCTION_CATEGORY__REFERRED_BY_FUNCTION_CATEGORY_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByFunctionCategoryRef() )
                    .basicAdd( otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.FUNCTION_CATEGORY__SUB_CATEGORY:
            return ( ( InternalEList< ? > ) getSubCategory() ).basicRemove( otherEnd, msgs );
        case AsdPackage.FUNCTION_CATEGORY__FUNCTION_CAT_REF:
            return ( ( InternalEList< ? > ) getFunctionCatRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.FUNCTION_CATEGORY__REFERRED_BY_FUNCTION_CATEGORY_REF:
            return ( ( InternalEList< ? > ) getReferredByFunctionCategoryRef() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case AsdPackage.FUNCTION_CATEGORY__SUB_CATEGORY:
            return getSubCategory();
        case AsdPackage.FUNCTION_CATEGORY__FUNCTION_CAT_REF:
            return getFunctionCatRef();
        case AsdPackage.FUNCTION_CATEGORY__NAME:
            return getName();
        case AsdPackage.FUNCTION_CATEGORY__ORIGIN_UUID:
            return getOriginUuid();
        case AsdPackage.FUNCTION_CATEGORY__TEMPLATE_UUID:
            return getTemplateUuid();
        case AsdPackage.FUNCTION_CATEGORY__UUID:
            return getUuid();
        case AsdPackage.FUNCTION_CATEGORY__REFERRED_BY_FUNCTION_CATEGORY_REF:
            return getReferredByFunctionCategoryRef();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case AsdPackage.FUNCTION_CATEGORY__SUB_CATEGORY:
            getSubCategory().clear();
            getSubCategory().addAll( ( Collection< ? extends SubCategory > ) newValue );
            return;
        case AsdPackage.FUNCTION_CATEGORY__FUNCTION_CAT_REF:
            getFunctionCatRef().clear();
            getFunctionCatRef().addAll( ( Collection< ? extends FunctionCatRef > ) newValue );
            return;
        case AsdPackage.FUNCTION_CATEGORY__NAME:
            setName( ( String ) newValue );
            return;
        case AsdPackage.FUNCTION_CATEGORY__ORIGIN_UUID:
            setOriginUuid( ( String ) newValue );
            return;
        case AsdPackage.FUNCTION_CATEGORY__TEMPLATE_UUID:
            setTemplateUuid( ( String ) newValue );
            return;
        case AsdPackage.FUNCTION_CATEGORY__UUID:
            setUuid( ( String ) newValue );
            return;
        case AsdPackage.FUNCTION_CATEGORY__REFERRED_BY_FUNCTION_CATEGORY_REF:
            getReferredByFunctionCategoryRef().clear();
            getReferredByFunctionCategoryRef().addAll( ( Collection< ? extends FunctionCategoryRef > ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case AsdPackage.FUNCTION_CATEGORY__SUB_CATEGORY:
            unsetSubCategory();
            return;
        case AsdPackage.FUNCTION_CATEGORY__FUNCTION_CAT_REF:
            unsetFunctionCatRef();
            return;
        case AsdPackage.FUNCTION_CATEGORY__NAME:
            setName( NAME_EDEFAULT );
            return;
        case AsdPackage.FUNCTION_CATEGORY__ORIGIN_UUID:
            setOriginUuid( ORIGIN_UUID_EDEFAULT );
            return;
        case AsdPackage.FUNCTION_CATEGORY__TEMPLATE_UUID:
            setTemplateUuid( TEMPLATE_UUID_EDEFAULT );
            return;
        case AsdPackage.FUNCTION_CATEGORY__UUID:
            setUuid( UUID_EDEFAULT );
            return;
        case AsdPackage.FUNCTION_CATEGORY__REFERRED_BY_FUNCTION_CATEGORY_REF:
            unsetReferredByFunctionCategoryRef();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case AsdPackage.FUNCTION_CATEGORY__SUB_CATEGORY:
            return isSetSubCategory();
        case AsdPackage.FUNCTION_CATEGORY__FUNCTION_CAT_REF:
            return isSetFunctionCatRef();
        case AsdPackage.FUNCTION_CATEGORY__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals( name );
        case AsdPackage.FUNCTION_CATEGORY__ORIGIN_UUID:
            return ORIGIN_UUID_EDEFAULT == null ? originUuid != null : !ORIGIN_UUID_EDEFAULT.equals( originUuid );
        case AsdPackage.FUNCTION_CATEGORY__TEMPLATE_UUID:
            return TEMPLATE_UUID_EDEFAULT == null ? templateUuid != null
                    : !TEMPLATE_UUID_EDEFAULT.equals( templateUuid );
        case AsdPackage.FUNCTION_CATEGORY__UUID:
            return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals( uuid );
        case AsdPackage.FUNCTION_CATEGORY__REFERRED_BY_FUNCTION_CATEGORY_REF:
            return isSetReferredByFunctionCategoryRef();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (name: " );
        result.append( name );
        result.append( ", originUuid: " );
        result.append( originUuid );
        result.append( ", templateUuid: " );
        result.append( templateUuid );
        result.append( ", uuid: " );
        result.append( uuid );
        result.append( ')' );
        return result.toString();
    }

} //FunctionCategoryImpl
