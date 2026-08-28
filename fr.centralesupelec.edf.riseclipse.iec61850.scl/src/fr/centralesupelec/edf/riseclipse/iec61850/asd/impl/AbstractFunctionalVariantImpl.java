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
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AgUuidWithOrigin;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalSubVariant;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgUuid;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Functional Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AbstractFunctionalVariantImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AbstractFunctionalVariantImpl#getTemplateUuid <em>Template Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AbstractFunctionalVariantImpl#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AbstractFunctionalVariantImpl#getFunctionalSubVariant <em>Functional Sub Variant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AbstractFunctionalVariantImpl#getVariableRef <em>Variable Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AbstractFunctionalVariantImpl#isIsBaseline <em>Is Baseline</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AbstractFunctionalVariantImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractFunctionalVariantImpl extends BaseExtensionElementWithDescImpl
        implements AbstractFunctionalVariant {
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
     * This is true if the Uuid attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uuidESet;

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
     * This is true if the Template Uuid attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean templateUuidESet;

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
     * This is true if the Origin Uuid attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean originUuidESet;

    /**
     * The cached value of the '{@link #getFunctionalSubVariant() <em>Functional Sub Variant</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionalSubVariant()
     * @generated
     * @ordered
     */
    protected EList< FunctionalSubVariant > functionalSubVariant;

    /**
     * The cached value of the '{@link #getVariableRef() <em>Variable Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariableRef()
     * @generated
     * @ordered
     */
    protected EList< VariableRef > variableRef;

    /**
     * The default value of the '{@link #isIsBaseline() <em>Is Baseline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsBaseline()
     * @generated
     * @ordered
     */
    protected static final boolean IS_BASELINE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsBaseline() <em>Is Baseline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsBaseline()
     * @generated
     * @ordered
     */
    protected boolean isBaseline = IS_BASELINE_EDEFAULT;

    /**
     * This is true if the Is Baseline attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isBaselineESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractFunctionalVariantImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getAbstractFunctionalVariant();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FunctionalSubVariant > getFunctionalSubVariant() {
        if( functionalSubVariant == null ) {
            functionalSubVariant = new EObjectContainmentWithInverseEList.Unsettable< >(
                    FunctionalSubVariant.class, this, AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__FUNCTIONAL_SUB_VARIANT,
                    AsdPackage.FUNCTIONAL_SUB_VARIANT__PARENT_ABSTRACT_FUNCTIONAL_VARIANT );
        }
        return functionalSubVariant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFunctionalSubVariant() {
        if( functionalSubVariant != null ) {
            ( ( InternalEList.Unsettable< ? > ) functionalSubVariant ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFunctionalSubVariant() {
        return functionalSubVariant != null && ( ( InternalEList.Unsettable< ? > ) functionalSubVariant ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< VariableRef > getVariableRef() {
        if( variableRef == null ) {
            variableRef = new EObjectContainmentWithInverseEList.Unsettable< >( VariableRef.class, this,
                    AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__VARIABLE_REF,
                    AsdPackage.VARIABLE_REF__PARENT_ABSTRACT_FUNCTIONAL_VARIANT );
        }
        return variableRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVariableRef() {
        if( variableRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) variableRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVariableRef() {
        return variableRef != null && ( ( InternalEList.Unsettable< ? > ) variableRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isIsBaseline() {
        return isBaseline;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsBaseline( boolean newIsBaseline ) {
        boolean oldIsBaseline = isBaseline;
        isBaseline = newIsBaseline;
        boolean oldIsBaselineESet = isBaselineESet;
        isBaselineESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__IS_BASELINE,
                    oldIsBaseline, isBaseline, !oldIsBaselineESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsBaseline() {
        boolean oldIsBaseline = isBaseline;
        boolean oldIsBaselineESet = isBaselineESet;
        isBaseline = IS_BASELINE_EDEFAULT;
        isBaselineESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__IS_BASELINE, oldIsBaseline, IS_BASELINE_EDEFAULT,
                    oldIsBaselineESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsBaseline() {
        return isBaselineESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__NAME,
                    oldName, name ) );
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
        boolean oldOriginUuidESet = originUuidESet;
        originUuidESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__ORIGIN_UUID,
                    oldOriginUuid, originUuid, !oldOriginUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOriginUuid() {
        String oldOriginUuid = originUuid;
        boolean oldOriginUuidESet = originUuidESet;
        originUuid = ORIGIN_UUID_EDEFAULT;
        originUuidESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__ORIGIN_UUID, oldOriginUuid, ORIGIN_UUID_EDEFAULT,
                    oldOriginUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOriginUuid() {
        return originUuidESet;
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
        boolean oldTemplateUuidESet = templateUuidESet;
        templateUuidESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__TEMPLATE_UUID, oldTemplateUuid, templateUuid,
                    !oldTemplateUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTemplateUuid() {
        String oldTemplateUuid = templateUuid;
        boolean oldTemplateUuidESet = templateUuidESet;
        templateUuid = TEMPLATE_UUID_EDEFAULT;
        templateUuidESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__TEMPLATE_UUID, oldTemplateUuid, TEMPLATE_UUID_EDEFAULT,
                    oldTemplateUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTemplateUuid() {
        return templateUuidESet;
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
        boolean oldUuidESet = uuidESet;
        uuidESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__UUID,
                    oldUuid, uuid, !oldUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUuid() {
        String oldUuid = uuid;
        boolean oldUuidESet = uuidESet;
        uuid = UUID_EDEFAULT;
        uuidESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__UUID,
                    oldUuid, UUID_EDEFAULT, oldUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUuid() {
        return uuidESet;
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
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__FUNCTIONAL_SUB_VARIANT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFunctionalSubVariant() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__VARIABLE_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getVariableRef() ).basicAdd( otherEnd,
                    msgs );
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
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__FUNCTIONAL_SUB_VARIANT:
            return ( ( InternalEList< ? > ) getFunctionalSubVariant() ).basicRemove( otherEnd, msgs );
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__VARIABLE_REF:
            return ( ( InternalEList< ? > ) getVariableRef() ).basicRemove( otherEnd, msgs );
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
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__UUID:
            return getUuid();
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__TEMPLATE_UUID:
            return getTemplateUuid();
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__ORIGIN_UUID:
            return getOriginUuid();
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__FUNCTIONAL_SUB_VARIANT:
            return getFunctionalSubVariant();
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__VARIABLE_REF:
            return getVariableRef();
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__IS_BASELINE:
            return isIsBaseline();
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__NAME:
            return getName();
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
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__UUID:
            setUuid( ( String ) newValue );
            return;
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__TEMPLATE_UUID:
            setTemplateUuid( ( String ) newValue );
            return;
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__ORIGIN_UUID:
            setOriginUuid( ( String ) newValue );
            return;
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__FUNCTIONAL_SUB_VARIANT:
            getFunctionalSubVariant().clear();
            getFunctionalSubVariant().addAll( ( Collection< ? extends FunctionalSubVariant > ) newValue );
            return;
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__VARIABLE_REF:
            getVariableRef().clear();
            getVariableRef().addAll( ( Collection< ? extends VariableRef > ) newValue );
            return;
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__IS_BASELINE:
            setIsBaseline( ( Boolean ) newValue );
            return;
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__NAME:
            setName( ( String ) newValue );
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
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__UUID:
            unsetUuid();
            return;
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__TEMPLATE_UUID:
            unsetTemplateUuid();
            return;
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__ORIGIN_UUID:
            unsetOriginUuid();
            return;
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__FUNCTIONAL_SUB_VARIANT:
            unsetFunctionalSubVariant();
            return;
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__VARIABLE_REF:
            unsetVariableRef();
            return;
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__IS_BASELINE:
            unsetIsBaseline();
            return;
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__NAME:
            setName( NAME_EDEFAULT );
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
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__UUID:
            return isSetUuid();
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__TEMPLATE_UUID:
            return isSetTemplateUuid();
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__ORIGIN_UUID:
            return isSetOriginUuid();
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__FUNCTIONAL_SUB_VARIANT:
            return isSetFunctionalSubVariant();
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__VARIABLE_REF:
            return isSetVariableRef();
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__IS_BASELINE:
            return isSetIsBaseline();
        case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals( name );
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID( int derivedFeatureID, Class< ? > baseClass ) {
        if( baseClass == AgUuid.class ) {
            switch( derivedFeatureID ) {
            case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__UUID:
                return SclPackage.AG_UUID__UUID;
            case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__TEMPLATE_UUID:
                return SclPackage.AG_UUID__TEMPLATE_UUID;
            default:
                return -1;
            }
        }
        if( baseClass == AgUuidWithOrigin.class ) {
            switch( derivedFeatureID ) {
            case AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__ORIGIN_UUID:
                return AsdPackage.AG_UUID_WITH_ORIGIN__ORIGIN_UUID;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID( derivedFeatureID, baseClass );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID( int baseFeatureID, Class< ? > baseClass ) {
        if( baseClass == AgUuid.class ) {
            switch( baseFeatureID ) {
            case SclPackage.AG_UUID__UUID:
                return AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__UUID;
            case SclPackage.AG_UUID__TEMPLATE_UUID:
                return AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__TEMPLATE_UUID;
            default:
                return -1;
            }
        }
        if( baseClass == AgUuidWithOrigin.class ) {
            switch( baseFeatureID ) {
            case AsdPackage.AG_UUID_WITH_ORIGIN__ORIGIN_UUID:
                return AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__ORIGIN_UUID;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
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
        result.append( " (uuid: " );
        if( uuidESet ) {
            result.append( uuid );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", templateUuid: " );
        if( templateUuidESet ) {
            result.append( templateUuid );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", originUuid: " );
        if( originUuidESet ) {
            result.append( originUuid );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", isBaseline: " );
        if( isBaselineESet ) {
            result.append( isBaseline );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", name: " );
        result.append( name );
        result.append( ')' );
        return result.toString();
    }

} //AbstractFunctionalVariantImpl
