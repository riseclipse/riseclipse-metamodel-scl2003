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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableRefImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableRefImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableRefImpl#getVariableUuid <em>Variable Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableRefImpl#getParentAbstractFunctionalVariant <em>Parent Abstract Functional Variant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableRefImpl#getParentFunctionRoleContent <em>Parent Function Role Content</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableRefImpl#getRefersToVariable <em>Refers To Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableRefImpl extends FunctionalVariantRefContainerImpl implements VariableRef {
    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariable()
     * @generated
     * @ordered
     */
    protected static final String VARIABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariable()
     * @generated
     * @ordered
     */
    protected String variable = VARIABLE_EDEFAULT;

    /**
     * The default value of the '{@link #getVariableUuid() <em>Variable Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariableUuid()
     * @generated
     * @ordered
     */
    protected static final String VARIABLE_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVariableUuid() <em>Variable Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariableUuid()
     * @generated
     * @ordered
     */
    protected String variableUuid = VARIABLE_UUID_EDEFAULT;

    /**
     * The cached value of the '{@link #getRefersToVariable() <em>Refers To Variable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToVariable()
     * @generated
     * @ordered
     */
    protected Variable refersToVariable;

    /**
     * This is true if the Refers To Variable reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToVariableESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VariableRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getVariableRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue( String newValue ) {
        String oldValue = value;
        value = newValue;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.VARIABLE_REF__VALUE, oldValue, value ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVariable() {
        return variable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVariable( String newVariable ) {
        String oldVariable = variable;
        variable = newVariable;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.VARIABLE_REF__VARIABLE, oldVariable,
                    variable ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVariableUuid() {
        return variableUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVariableUuid( String newVariableUuid ) {
        String oldVariableUuid = variableUuid;
        variableUuid = newVariableUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.VARIABLE_REF__VARIABLE_UUID,
                    oldVariableUuid, variableUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AbstractFunctionalVariant getParentAbstractFunctionalVariant() {
        if( eContainerFeatureID() != AsdPackage.VARIABLE_REF__PARENT_ABSTRACT_FUNCTIONAL_VARIANT ) {
            return null;
        }
        return ( AbstractFunctionalVariant ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAbstractFunctionalVariant(
            AbstractFunctionalVariant newParentAbstractFunctionalVariant, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentAbstractFunctionalVariant,
                AsdPackage.VARIABLE_REF__PARENT_ABSTRACT_FUNCTIONAL_VARIANT, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAbstractFunctionalVariant( AbstractFunctionalVariant newParentAbstractFunctionalVariant ) {
        if( newParentAbstractFunctionalVariant != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.VARIABLE_REF__PARENT_ABSTRACT_FUNCTIONAL_VARIANT
                        && newParentAbstractFunctionalVariant != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentAbstractFunctionalVariant ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentAbstractFunctionalVariant != null ) {
                msgs = ( ( InternalEObject ) newParentAbstractFunctionalVariant ).eInverseAdd( this,
                        AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__VARIABLE_REF, AbstractFunctionalVariant.class, msgs );
            }
            msgs = basicSetParentAbstractFunctionalVariant( newParentAbstractFunctionalVariant, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.VARIABLE_REF__PARENT_ABSTRACT_FUNCTIONAL_VARIANT, newParentAbstractFunctionalVariant,
                    newParentAbstractFunctionalVariant ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionRoleContent getParentFunctionRoleContent() {
        if( eContainerFeatureID() != AsdPackage.VARIABLE_REF__PARENT_FUNCTION_ROLE_CONTENT ) {
            return null;
        }
        return ( FunctionRoleContent ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentFunctionRoleContent( FunctionRoleContent newParentFunctionRoleContent,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentFunctionRoleContent,
                AsdPackage.VARIABLE_REF__PARENT_FUNCTION_ROLE_CONTENT, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentFunctionRoleContent( FunctionRoleContent newParentFunctionRoleContent ) {
        if( newParentFunctionRoleContent != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.VARIABLE_REF__PARENT_FUNCTION_ROLE_CONTENT
                        && newParentFunctionRoleContent != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentFunctionRoleContent ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentFunctionRoleContent != null ) {
                msgs = ( ( InternalEObject ) newParentFunctionRoleContent ).eInverseAdd( this,
                        AsdPackage.FUNCTION_ROLE_CONTENT__VARIABLE_REF, FunctionRoleContent.class, msgs );
            }
            msgs = basicSetParentFunctionRoleContent( newParentFunctionRoleContent, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.VARIABLE_REF__PARENT_FUNCTION_ROLE_CONTENT, newParentFunctionRoleContent,
                    newParentFunctionRoleContent ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Variable getRefersToVariable() {
        if( refersToVariable != null && refersToVariable.eIsProxy() ) {
            InternalEObject oldRefersToVariable = ( InternalEObject ) refersToVariable;
            refersToVariable = ( Variable ) eResolveProxy( oldRefersToVariable );
            if( refersToVariable != oldRefersToVariable ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.VARIABLE_REF__REFERS_TO_VARIABLE, oldRefersToVariable, refersToVariable ) );
                }
            }
        }
        return refersToVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Variable basicGetRefersToVariable() {
        return refersToVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToVariable( Variable newRefersToVariable, NotificationChain msgs ) {
        Variable oldRefersToVariable = refersToVariable;
        refersToVariable = newRefersToVariable;
        boolean oldRefersToVariableESet = refersToVariableESet;
        refersToVariableESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.VARIABLE_REF__REFERS_TO_VARIABLE, oldRefersToVariable, newRefersToVariable,
                    !oldRefersToVariableESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToVariable( Variable newRefersToVariable ) {
        if( newRefersToVariable != refersToVariable ) {
            NotificationChain msgs = null;
            if( refersToVariable != null ) {
                msgs = ( ( InternalEObject ) refersToVariable ).eInverseRemove( this,
                        AsdPackage.VARIABLE__REFERRED_BY_VARIABLE_REF, Variable.class, msgs );
            }
            if( newRefersToVariable != null ) {
                msgs = ( ( InternalEObject ) newRefersToVariable ).eInverseAdd( this,
                        AsdPackage.VARIABLE__REFERRED_BY_VARIABLE_REF, Variable.class, msgs );
            }
            msgs = basicSetRefersToVariable( newRefersToVariable, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToVariableESet = refersToVariableESet;
            refersToVariableESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.VARIABLE_REF__REFERS_TO_VARIABLE,
                        newRefersToVariable, newRefersToVariable, !oldRefersToVariableESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToVariable( NotificationChain msgs ) {
        Variable oldRefersToVariable = refersToVariable;
        refersToVariable = null;
        boolean oldRefersToVariableESet = refersToVariableESet;
        refersToVariableESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.VARIABLE_REF__REFERS_TO_VARIABLE, oldRefersToVariable, null, oldRefersToVariableESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToVariable() {
        if( refersToVariable != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToVariable ).eInverseRemove( this,
                    AsdPackage.VARIABLE__REFERRED_BY_VARIABLE_REF, Variable.class, msgs );
            msgs = basicUnsetRefersToVariable( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToVariableESet = refersToVariableESet;
            refersToVariableESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.VARIABLE_REF__REFERS_TO_VARIABLE,
                        null, null, oldRefersToVariableESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToVariable() {
        return refersToVariableESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.VARIABLE_REF__PARENT_ABSTRACT_FUNCTIONAL_VARIANT:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentAbstractFunctionalVariant( ( AbstractFunctionalVariant ) otherEnd, msgs );
        case AsdPackage.VARIABLE_REF__PARENT_FUNCTION_ROLE_CONTENT:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentFunctionRoleContent( ( FunctionRoleContent ) otherEnd, msgs );
        case AsdPackage.VARIABLE_REF__REFERS_TO_VARIABLE:
            if( refersToVariable != null ) {
                msgs = ( ( InternalEObject ) refersToVariable ).eInverseRemove( this,
                        AsdPackage.VARIABLE__REFERRED_BY_VARIABLE_REF, Variable.class, msgs );
            }
            return basicSetRefersToVariable( ( Variable ) otherEnd, msgs );
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
        case AsdPackage.VARIABLE_REF__PARENT_ABSTRACT_FUNCTIONAL_VARIANT:
            return basicSetParentAbstractFunctionalVariant( null, msgs );
        case AsdPackage.VARIABLE_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return basicSetParentFunctionRoleContent( null, msgs );
        case AsdPackage.VARIABLE_REF__REFERS_TO_VARIABLE:
            return basicUnsetRefersToVariable( msgs );
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
        case AsdPackage.VARIABLE_REF__PARENT_ABSTRACT_FUNCTIONAL_VARIANT:
            return eInternalContainer().eInverseRemove( this, AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__VARIABLE_REF,
                    AbstractFunctionalVariant.class, msgs );
        case AsdPackage.VARIABLE_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return eInternalContainer().eInverseRemove( this, AsdPackage.FUNCTION_ROLE_CONTENT__VARIABLE_REF,
                    FunctionRoleContent.class, msgs );
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
        case AsdPackage.VARIABLE_REF__VALUE:
            return getValue();
        case AsdPackage.VARIABLE_REF__VARIABLE:
            return getVariable();
        case AsdPackage.VARIABLE_REF__VARIABLE_UUID:
            return getVariableUuid();
        case AsdPackage.VARIABLE_REF__PARENT_ABSTRACT_FUNCTIONAL_VARIANT:
            return getParentAbstractFunctionalVariant();
        case AsdPackage.VARIABLE_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return getParentFunctionRoleContent();
        case AsdPackage.VARIABLE_REF__REFERS_TO_VARIABLE:
            if( resolve ) {
                return getRefersToVariable();
            }
            return basicGetRefersToVariable();
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
        case AsdPackage.VARIABLE_REF__VALUE:
            setValue( ( String ) newValue );
            return;
        case AsdPackage.VARIABLE_REF__VARIABLE:
            setVariable( ( String ) newValue );
            return;
        case AsdPackage.VARIABLE_REF__VARIABLE_UUID:
            setVariableUuid( ( String ) newValue );
            return;
        case AsdPackage.VARIABLE_REF__PARENT_ABSTRACT_FUNCTIONAL_VARIANT:
            setParentAbstractFunctionalVariant( ( AbstractFunctionalVariant ) newValue );
            return;
        case AsdPackage.VARIABLE_REF__PARENT_FUNCTION_ROLE_CONTENT:
            setParentFunctionRoleContent( ( FunctionRoleContent ) newValue );
            return;
        case AsdPackage.VARIABLE_REF__REFERS_TO_VARIABLE:
            setRefersToVariable( ( Variable ) newValue );
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
        case AsdPackage.VARIABLE_REF__VALUE:
            setValue( VALUE_EDEFAULT );
            return;
        case AsdPackage.VARIABLE_REF__VARIABLE:
            setVariable( VARIABLE_EDEFAULT );
            return;
        case AsdPackage.VARIABLE_REF__VARIABLE_UUID:
            setVariableUuid( VARIABLE_UUID_EDEFAULT );
            return;
        case AsdPackage.VARIABLE_REF__PARENT_ABSTRACT_FUNCTIONAL_VARIANT:
            setParentAbstractFunctionalVariant( ( AbstractFunctionalVariant ) null );
            return;
        case AsdPackage.VARIABLE_REF__PARENT_FUNCTION_ROLE_CONTENT:
            setParentFunctionRoleContent( ( FunctionRoleContent ) null );
            return;
        case AsdPackage.VARIABLE_REF__REFERS_TO_VARIABLE:
            unsetRefersToVariable();
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
        case AsdPackage.VARIABLE_REF__VALUE:
            return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals( value );
        case AsdPackage.VARIABLE_REF__VARIABLE:
            return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals( variable );
        case AsdPackage.VARIABLE_REF__VARIABLE_UUID:
            return VARIABLE_UUID_EDEFAULT == null ? variableUuid != null
                    : !VARIABLE_UUID_EDEFAULT.equals( variableUuid );
        case AsdPackage.VARIABLE_REF__PARENT_ABSTRACT_FUNCTIONAL_VARIANT:
            return getParentAbstractFunctionalVariant() != null;
        case AsdPackage.VARIABLE_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return getParentFunctionRoleContent() != null;
        case AsdPackage.VARIABLE_REF__REFERS_TO_VARIABLE:
            return isSetRefersToVariable();
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
        result.append( " (value: " );
        result.append( value );
        result.append( ", variable: " );
        result.append( variable );
        result.append( ", variableUuid: " );
        result.append( variableUuid );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "VariableRef.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from VariableRef: ";
        doBuildExplicitLinkWithVariable( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithVariable( @NonNull IRiseClipseConsole console,
            @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for Variable) ";

        SCL sclRoot = AsdUtilities.getSCL( this );

        if( getVariableUuid() != null && !getVariableUuid().isEmpty() ) {
            List< Variable > res = new ArrayList<>();

            TreeIterator< EObject > it = sclRoot.eAllContents();
            while( it.hasNext() ) {
                EObject o = it.next();
                if( o instanceof Variable && getVariableUuid().equals( ( ( Variable ) o ).getUuid() ) ) {
                    res.add( ( Variable ) o );
                }
            }

            if( res.size() == 1 ) {
                setRefersToVariable( res.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "VariableRef refers to Variable( id = ", getVariableUuid(), " ) on line ",
                        getRefersToVariable().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                //         " Variable( uuid = ", getVariableUuid(), " )" );
            }

        }
        else if( getVariable() != null && !getVariable().isEmpty() ) {

            String[] variablePath = getVariable().split( "/" );

            Pair< LNodeContainer, Integer > res1 = AsdUtilities.getLNodeContainer(
                    sclRoot,
                    Arrays.copyOf( variablePath, variablePath.length - 1 ) );
            if( res1.getLeft() == null ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res1.getRight() == 0 ) ? "cannot find " : "found several " ),
                //         "LNodeContainer( name = ", variablePath[variablePath.length - 2], " )" );
                return;
            }
            console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "found LNodeContainer( name = ", variablePath[variablePath.length - 2],
                    " ) on line ",
                    res1.getLeft().getLineNumber() );

            List< Variable > res2 = res1.getLeft().getPrivate()
                    .stream()
                    .filter( p -> "eIEC61850-6-100".equals( p.getType() ) )
                    .map( Private::getAsdObjects )
                    .flatMap( Collection::stream )
                    .filter( o -> o instanceof Variable && variablePath[variablePath.length - 1]
                            .equals( ( ( Variable ) o ).getName() ) )
                    .map( v -> ( Variable ) v )
                    .toList();

            if( res2.size() != 1 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res2.size() == 0 ) ? "cannot find" : "found several" ),
                //         " Variable( name = ", variablePath[variablePath.length - 1], " )" );
                return;
            }

            setRefersToVariable( res2.get( 0 ) );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "VariableRef refers to Variable( name = ", variablePath[variablePath.length - 1], " )", " on line ",
                    getRefersToVariable().getLineNumber() );

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because variable and variableUuid are missing" );
        }

    }

} //VariableRefImpl
