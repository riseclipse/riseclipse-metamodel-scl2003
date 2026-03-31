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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Apply To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableApplyToImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableApplyToImpl#getDaName <em>Da Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableApplyToImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableApplyToImpl#getDoName <em>Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableApplyToImpl#getElement <em>Element</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableApplyToImpl#getElementUuid <em>Element Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableApplyToImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableApplyToImpl#getSGroup <em>SGroup</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableApplyToImpl#getParentVariable <em>Parent Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableApplyToImpl extends BaseExtensionElementWithDescImpl implements VariableApplyTo {
    /**
     * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttribute()
     * @generated
     * @ordered
     */
    protected static final String ATTRIBUTE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttribute()
     * @generated
     * @ordered
     */
    protected String attribute = ATTRIBUTE_EDEFAULT;

    /**
     * The default value of the '{@link #getDaName() <em>Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDaName()
     * @generated
     * @ordered
     */
    protected static final String DA_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDaName() <em>Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDaName()
     * @generated
     * @ordered
     */
    protected String daName = DA_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getDoName() <em>Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDoName()
     * @generated
     * @ordered
     */
    protected static final String DO_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDoName() <em>Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDoName()
     * @generated
     * @ordered
     */
    protected String doName = DO_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElement()
     * @generated
     * @ordered
     */
    protected static final String ELEMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElement()
     * @generated
     * @ordered
     */
    protected String element = ELEMENT_EDEFAULT;

    /**
     * The default value of the '{@link #getElementUuid() <em>Element Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElementUuid()
     * @generated
     * @ordered
     */
    protected static final String ELEMENT_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getElementUuid() <em>Element Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElementUuid()
     * @generated
     * @ordered
     */
    protected String elementUuid = ELEMENT_UUID_EDEFAULT;

    /**
     * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFormat()
     * @generated
     * @ordered
     */
    protected static final String FORMAT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFormat()
     * @generated
     * @ordered
     */
    protected String format = FORMAT_EDEFAULT;

    /**
     * The default value of the '{@link #getSGroup() <em>SGroup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSGroup()
     * @generated
     * @ordered
     */
    protected static final long SGROUP_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getSGroup() <em>SGroup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSGroup()
     * @generated
     * @ordered
     */
    protected long sGroup = SGROUP_EDEFAULT;

    /**
     * This is true if the SGroup attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sGroupESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VariableApplyToImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getVariableApplyTo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAttribute() {
        return attribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAttribute( String newAttribute ) {
        String oldAttribute = attribute;
        attribute = newAttribute;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.VARIABLE_APPLY_TO__ATTRIBUTE,
                    oldAttribute, attribute ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDaName() {
        return daName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDaName( String newDaName ) {
        String oldDaName = daName;
        daName = newDaName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.VARIABLE_APPLY_TO__DA_NAME, oldDaName,
                    daName ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDefaultValue( String newDefaultValue ) {
        String oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.VARIABLE_APPLY_TO__DEFAULT_VALUE,
                    oldDefaultValue, defaultValue ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDoName() {
        return doName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDoName( String newDoName ) {
        String oldDoName = doName;
        doName = newDoName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.VARIABLE_APPLY_TO__DO_NAME, oldDoName,
                    doName ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getElement() {
        return element;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setElement( String newElement ) {
        String oldElement = element;
        element = newElement;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.VARIABLE_APPLY_TO__ELEMENT, oldElement,
                    element ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getElementUuid() {
        return elementUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setElementUuid( String newElementUuid ) {
        String oldElementUuid = elementUuid;
        elementUuid = newElementUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.VARIABLE_APPLY_TO__ELEMENT_UUID,
                    oldElementUuid, elementUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFormat() {
        return format;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFormat( String newFormat ) {
        String oldFormat = format;
        format = newFormat;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.VARIABLE_APPLY_TO__FORMAT, oldFormat,
                    format ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getSGroup() {
        return sGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSGroup( long newSGroup ) {
        long oldSGroup = sGroup;
        sGroup = newSGroup;
        boolean oldSGroupESet = sGroupESet;
        sGroupESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.VARIABLE_APPLY_TO__SGROUP, oldSGroup,
                    sGroup, !oldSGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSGroup() {
        long oldSGroup = sGroup;
        boolean oldSGroupESet = sGroupESet;
        sGroup = SGROUP_EDEFAULT;
        sGroupESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.VARIABLE_APPLY_TO__SGROUP, oldSGroup,
                    SGROUP_EDEFAULT, oldSGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSGroup() {
        return sGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Variable getParentVariable() {
        if( eContainerFeatureID() != AsdPackage.VARIABLE_APPLY_TO__PARENT_VARIABLE ) {
            return null;
        }
        return ( Variable ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentVariable( Variable newParentVariable, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentVariable, AsdPackage.VARIABLE_APPLY_TO__PARENT_VARIABLE,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentVariable( Variable newParentVariable ) {
        if( newParentVariable != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.VARIABLE_APPLY_TO__PARENT_VARIABLE
                        && newParentVariable != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentVariable ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentVariable != null ) {
                msgs = ( ( InternalEObject ) newParentVariable ).eInverseAdd( this,
                        AsdPackage.VARIABLE__VARIABLE_APPLY_TO, Variable.class, msgs );
            }
            msgs = basicSetParentVariable( newParentVariable, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.VARIABLE_APPLY_TO__PARENT_VARIABLE,
                    newParentVariable, newParentVariable ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.VARIABLE_APPLY_TO__PARENT_VARIABLE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentVariable( ( Variable ) otherEnd, msgs );
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
        case AsdPackage.VARIABLE_APPLY_TO__PARENT_VARIABLE:
            return basicSetParentVariable( null, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs ) {
        switch( eContainerFeatureID() ) {
        case AsdPackage.VARIABLE_APPLY_TO__PARENT_VARIABLE:
            return eInternalContainer().eInverseRemove( this, AsdPackage.VARIABLE__VARIABLE_APPLY_TO, Variable.class,
                    msgs );
        }
        return super.eBasicRemoveFromContainerFeature( msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case AsdPackage.VARIABLE_APPLY_TO__ATTRIBUTE:
            return getAttribute();
        case AsdPackage.VARIABLE_APPLY_TO__DA_NAME:
            return getDaName();
        case AsdPackage.VARIABLE_APPLY_TO__DEFAULT_VALUE:
            return getDefaultValue();
        case AsdPackage.VARIABLE_APPLY_TO__DO_NAME:
            return getDoName();
        case AsdPackage.VARIABLE_APPLY_TO__ELEMENT:
            return getElement();
        case AsdPackage.VARIABLE_APPLY_TO__ELEMENT_UUID:
            return getElementUuid();
        case AsdPackage.VARIABLE_APPLY_TO__FORMAT:
            return getFormat();
        case AsdPackage.VARIABLE_APPLY_TO__SGROUP:
            return getSGroup();
        case AsdPackage.VARIABLE_APPLY_TO__PARENT_VARIABLE:
            return getParentVariable();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case AsdPackage.VARIABLE_APPLY_TO__ATTRIBUTE:
            setAttribute( ( String ) newValue );
            return;
        case AsdPackage.VARIABLE_APPLY_TO__DA_NAME:
            setDaName( ( String ) newValue );
            return;
        case AsdPackage.VARIABLE_APPLY_TO__DEFAULT_VALUE:
            setDefaultValue( ( String ) newValue );
            return;
        case AsdPackage.VARIABLE_APPLY_TO__DO_NAME:
            setDoName( ( String ) newValue );
            return;
        case AsdPackage.VARIABLE_APPLY_TO__ELEMENT:
            setElement( ( String ) newValue );
            return;
        case AsdPackage.VARIABLE_APPLY_TO__ELEMENT_UUID:
            setElementUuid( ( String ) newValue );
            return;
        case AsdPackage.VARIABLE_APPLY_TO__FORMAT:
            setFormat( ( String ) newValue );
            return;
        case AsdPackage.VARIABLE_APPLY_TO__SGROUP:
            setSGroup( ( Long ) newValue );
            return;
        case AsdPackage.VARIABLE_APPLY_TO__PARENT_VARIABLE:
            setParentVariable( ( Variable ) newValue );
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
        case AsdPackage.VARIABLE_APPLY_TO__ATTRIBUTE:
            setAttribute( ATTRIBUTE_EDEFAULT );
            return;
        case AsdPackage.VARIABLE_APPLY_TO__DA_NAME:
            setDaName( DA_NAME_EDEFAULT );
            return;
        case AsdPackage.VARIABLE_APPLY_TO__DEFAULT_VALUE:
            setDefaultValue( DEFAULT_VALUE_EDEFAULT );
            return;
        case AsdPackage.VARIABLE_APPLY_TO__DO_NAME:
            setDoName( DO_NAME_EDEFAULT );
            return;
        case AsdPackage.VARIABLE_APPLY_TO__ELEMENT:
            setElement( ELEMENT_EDEFAULT );
            return;
        case AsdPackage.VARIABLE_APPLY_TO__ELEMENT_UUID:
            setElementUuid( ELEMENT_UUID_EDEFAULT );
            return;
        case AsdPackage.VARIABLE_APPLY_TO__FORMAT:
            setFormat( FORMAT_EDEFAULT );
            return;
        case AsdPackage.VARIABLE_APPLY_TO__SGROUP:
            unsetSGroup();
            return;
        case AsdPackage.VARIABLE_APPLY_TO__PARENT_VARIABLE:
            setParentVariable( ( Variable ) null );
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
        case AsdPackage.VARIABLE_APPLY_TO__ATTRIBUTE:
            return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals( attribute );
        case AsdPackage.VARIABLE_APPLY_TO__DA_NAME:
            return DA_NAME_EDEFAULT == null ? daName != null : !DA_NAME_EDEFAULT.equals( daName );
        case AsdPackage.VARIABLE_APPLY_TO__DEFAULT_VALUE:
            return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null
                    : !DEFAULT_VALUE_EDEFAULT.equals( defaultValue );
        case AsdPackage.VARIABLE_APPLY_TO__DO_NAME:
            return DO_NAME_EDEFAULT == null ? doName != null : !DO_NAME_EDEFAULT.equals( doName );
        case AsdPackage.VARIABLE_APPLY_TO__ELEMENT:
            return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals( element );
        case AsdPackage.VARIABLE_APPLY_TO__ELEMENT_UUID:
            return ELEMENT_UUID_EDEFAULT == null ? elementUuid != null : !ELEMENT_UUID_EDEFAULT.equals( elementUuid );
        case AsdPackage.VARIABLE_APPLY_TO__FORMAT:
            return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals( format );
        case AsdPackage.VARIABLE_APPLY_TO__SGROUP:
            return isSetSGroup();
        case AsdPackage.VARIABLE_APPLY_TO__PARENT_VARIABLE:
            return getParentVariable() != null;
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
        result.append( " (attribute: " );
        result.append( attribute );
        result.append( ", daName: " );
        result.append( daName );
        result.append( ", defaultValue: " );
        result.append( defaultValue );
        result.append( ", doName: " );
        result.append( doName );
        result.append( ", element: " );
        result.append( element );
        result.append( ", elementUuid: " );
        result.append( elementUuid );
        result.append( ", format: " );
        result.append( format );
        result.append( ", sGroup: " );
        if( sGroupESet ) {
            result.append( sGroup );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //VariableApplyToImpl
