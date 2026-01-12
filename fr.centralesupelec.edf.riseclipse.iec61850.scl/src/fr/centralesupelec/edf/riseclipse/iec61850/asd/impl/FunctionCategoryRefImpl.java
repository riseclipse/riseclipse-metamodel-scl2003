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

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCategory;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Naming;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Category Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionCategoryRefImpl#getFunctionCategory <em>Function Category</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionCategoryRefImpl#getFunctionCategoryUuid <em>Function Category Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionCategoryRefImpl#getParentFunctionRoleContent <em>Parent Function Role Content</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionCategoryRefImpl#getRefersToFunctionCategory <em>Refers To Function Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionCategoryRefImpl extends FunctionalVariantRefContainerImpl implements FunctionCategoryRef {
    /**
     * The default value of the '{@link #getFunctionCategory() <em>Function Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionCategory()
     * @generated
     * @ordered
     */
    protected static final String FUNCTION_CATEGORY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFunctionCategory() <em>Function Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionCategory()
     * @generated
     * @ordered
     */
    protected String functionCategory = FUNCTION_CATEGORY_EDEFAULT;

    /**
     * The default value of the '{@link #getFunctionCategoryUuid() <em>Function Category Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionCategoryUuid()
     * @generated
     * @ordered
     */
    protected static final String FUNCTION_CATEGORY_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFunctionCategoryUuid() <em>Function Category Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionCategoryUuid()
     * @generated
     * @ordered
     */
    protected String functionCategoryUuid = FUNCTION_CATEGORY_UUID_EDEFAULT;

    /**
     * The cached value of the '{@link #getRefersToFunctionCategory() <em>Refers To Function Category</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToFunctionCategory()
     * @generated
     * @ordered
     */
    protected FunctionCategory refersToFunctionCategory;

    /**
     * This is true if the Refers To Function Category reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToFunctionCategoryESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FunctionCategoryRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getFunctionCategoryRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFunctionCategory() {
        return functionCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFunctionCategory( String newFunctionCategory ) {
        String oldFunctionCategory = functionCategory;
        functionCategory = newFunctionCategory;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_CATEGORY_REF__FUNCTION_CATEGORY,
                    oldFunctionCategory, functionCategory ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFunctionCategoryUuid() {
        return functionCategoryUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFunctionCategoryUuid( String newFunctionCategoryUuid ) {
        String oldFunctionCategoryUuid = functionCategoryUuid;
        functionCategoryUuid = newFunctionCategoryUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.FUNCTION_CATEGORY_REF__FUNCTION_CATEGORY_UUID, oldFunctionCategoryUuid,
                    functionCategoryUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionRoleContent getParentFunctionRoleContent() {
        if( eContainerFeatureID() != AsdPackage.FUNCTION_CATEGORY_REF__PARENT_FUNCTION_ROLE_CONTENT ) {
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
                AsdPackage.FUNCTION_CATEGORY_REF__PARENT_FUNCTION_ROLE_CONTENT, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.FUNCTION_CATEGORY_REF__PARENT_FUNCTION_ROLE_CONTENT
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
                        AsdPackage.FUNCTION_ROLE_CONTENT__FUNCTION_CATEGORY_REF, FunctionRoleContent.class, msgs );
            }
            msgs = basicSetParentFunctionRoleContent( newParentFunctionRoleContent, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.FUNCTION_CATEGORY_REF__PARENT_FUNCTION_ROLE_CONTENT, newParentFunctionRoleContent,
                    newParentFunctionRoleContent ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionCategory getRefersToFunctionCategory() {
        if( refersToFunctionCategory != null && refersToFunctionCategory.eIsProxy() ) {
            InternalEObject oldRefersToFunctionCategory = ( InternalEObject ) refersToFunctionCategory;
            refersToFunctionCategory = ( FunctionCategory ) eResolveProxy( oldRefersToFunctionCategory );
            if( refersToFunctionCategory != oldRefersToFunctionCategory ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.FUNCTION_CATEGORY_REF__REFERS_TO_FUNCTION_CATEGORY, oldRefersToFunctionCategory,
                            refersToFunctionCategory ) );
                }
            }
        }
        return refersToFunctionCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FunctionCategory basicGetRefersToFunctionCategory() {
        return refersToFunctionCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToFunctionCategory( FunctionCategory newRefersToFunctionCategory,
            NotificationChain msgs ) {
        FunctionCategory oldRefersToFunctionCategory = refersToFunctionCategory;
        refersToFunctionCategory = newRefersToFunctionCategory;
        boolean oldRefersToFunctionCategoryESet = refersToFunctionCategoryESet;
        refersToFunctionCategoryESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.FUNCTION_CATEGORY_REF__REFERS_TO_FUNCTION_CATEGORY, oldRefersToFunctionCategory,
                    newRefersToFunctionCategory, !oldRefersToFunctionCategoryESet );
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
    public void setRefersToFunctionCategory( FunctionCategory newRefersToFunctionCategory ) {
        if( newRefersToFunctionCategory != refersToFunctionCategory ) {
            NotificationChain msgs = null;
            if( refersToFunctionCategory != null ) {
                msgs = ( ( InternalEObject ) refersToFunctionCategory ).eInverseRemove( this,
                        AsdPackage.FUNCTION_CATEGORY__REFERRED_BY_FUNCTION_CATEGORY_REF, FunctionCategory.class, msgs );
            }
            if( newRefersToFunctionCategory != null ) {
                msgs = ( ( InternalEObject ) newRefersToFunctionCategory ).eInverseAdd( this,
                        AsdPackage.FUNCTION_CATEGORY__REFERRED_BY_FUNCTION_CATEGORY_REF, FunctionCategory.class, msgs );
            }
            msgs = basicSetRefersToFunctionCategory( newRefersToFunctionCategory, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToFunctionCategoryESet = refersToFunctionCategoryESet;
            refersToFunctionCategoryESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.FUNCTION_CATEGORY_REF__REFERS_TO_FUNCTION_CATEGORY, newRefersToFunctionCategory,
                        newRefersToFunctionCategory, !oldRefersToFunctionCategoryESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToFunctionCategory( NotificationChain msgs ) {
        FunctionCategory oldRefersToFunctionCategory = refersToFunctionCategory;
        refersToFunctionCategory = null;
        boolean oldRefersToFunctionCategoryESet = refersToFunctionCategoryESet;
        refersToFunctionCategoryESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.FUNCTION_CATEGORY_REF__REFERS_TO_FUNCTION_CATEGORY, oldRefersToFunctionCategory, null,
                    oldRefersToFunctionCategoryESet );
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
    public void unsetRefersToFunctionCategory() {
        if( refersToFunctionCategory != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToFunctionCategory ).eInverseRemove( this,
                    AsdPackage.FUNCTION_CATEGORY__REFERRED_BY_FUNCTION_CATEGORY_REF, FunctionCategory.class, msgs );
            msgs = basicUnsetRefersToFunctionCategory( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToFunctionCategoryESet = refersToFunctionCategoryESet;
            refersToFunctionCategoryESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.FUNCTION_CATEGORY_REF__REFERS_TO_FUNCTION_CATEGORY, null, null,
                        oldRefersToFunctionCategoryESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToFunctionCategory() {
        return refersToFunctionCategoryESet;
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
        case AsdPackage.FUNCTION_CATEGORY_REF__PARENT_FUNCTION_ROLE_CONTENT:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentFunctionRoleContent( ( FunctionRoleContent ) otherEnd, msgs );
        case AsdPackage.FUNCTION_CATEGORY_REF__REFERS_TO_FUNCTION_CATEGORY:
            if( refersToFunctionCategory != null ) {
                msgs = ( ( InternalEObject ) refersToFunctionCategory ).eInverseRemove( this,
                        AsdPackage.FUNCTION_CATEGORY__REFERRED_BY_FUNCTION_CATEGORY_REF, FunctionCategory.class, msgs );
            }
            return basicSetRefersToFunctionCategory( ( FunctionCategory ) otherEnd, msgs );
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
        case AsdPackage.FUNCTION_CATEGORY_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return basicSetParentFunctionRoleContent( null, msgs );
        case AsdPackage.FUNCTION_CATEGORY_REF__REFERS_TO_FUNCTION_CATEGORY:
            return basicUnsetRefersToFunctionCategory( msgs );
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
        case AsdPackage.FUNCTION_CATEGORY_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return eInternalContainer().eInverseRemove( this, AsdPackage.FUNCTION_ROLE_CONTENT__FUNCTION_CATEGORY_REF,
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
        case AsdPackage.FUNCTION_CATEGORY_REF__FUNCTION_CATEGORY:
            return getFunctionCategory();
        case AsdPackage.FUNCTION_CATEGORY_REF__FUNCTION_CATEGORY_UUID:
            return getFunctionCategoryUuid();
        case AsdPackage.FUNCTION_CATEGORY_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return getParentFunctionRoleContent();
        case AsdPackage.FUNCTION_CATEGORY_REF__REFERS_TO_FUNCTION_CATEGORY:
            if( resolve ) {
                return getRefersToFunctionCategory();
            }
            return basicGetRefersToFunctionCategory();
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
        case AsdPackage.FUNCTION_CATEGORY_REF__FUNCTION_CATEGORY:
            setFunctionCategory( ( String ) newValue );
            return;
        case AsdPackage.FUNCTION_CATEGORY_REF__FUNCTION_CATEGORY_UUID:
            setFunctionCategoryUuid( ( String ) newValue );
            return;
        case AsdPackage.FUNCTION_CATEGORY_REF__PARENT_FUNCTION_ROLE_CONTENT:
            setParentFunctionRoleContent( ( FunctionRoleContent ) newValue );
            return;
        case AsdPackage.FUNCTION_CATEGORY_REF__REFERS_TO_FUNCTION_CATEGORY:
            setRefersToFunctionCategory( ( FunctionCategory ) newValue );
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
        case AsdPackage.FUNCTION_CATEGORY_REF__FUNCTION_CATEGORY:
            setFunctionCategory( FUNCTION_CATEGORY_EDEFAULT );
            return;
        case AsdPackage.FUNCTION_CATEGORY_REF__FUNCTION_CATEGORY_UUID:
            setFunctionCategoryUuid( FUNCTION_CATEGORY_UUID_EDEFAULT );
            return;
        case AsdPackage.FUNCTION_CATEGORY_REF__PARENT_FUNCTION_ROLE_CONTENT:
            setParentFunctionRoleContent( ( FunctionRoleContent ) null );
            return;
        case AsdPackage.FUNCTION_CATEGORY_REF__REFERS_TO_FUNCTION_CATEGORY:
            unsetRefersToFunctionCategory();
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
        case AsdPackage.FUNCTION_CATEGORY_REF__FUNCTION_CATEGORY:
            return FUNCTION_CATEGORY_EDEFAULT == null ? functionCategory != null
                    : !FUNCTION_CATEGORY_EDEFAULT.equals( functionCategory );
        case AsdPackage.FUNCTION_CATEGORY_REF__FUNCTION_CATEGORY_UUID:
            return FUNCTION_CATEGORY_UUID_EDEFAULT == null ? functionCategoryUuid != null
                    : !FUNCTION_CATEGORY_UUID_EDEFAULT.equals( functionCategoryUuid );
        case AsdPackage.FUNCTION_CATEGORY_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return getParentFunctionRoleContent() != null;
        case AsdPackage.FUNCTION_CATEGORY_REF__REFERS_TO_FUNCTION_CATEGORY:
            return isSetRefersToFunctionCategory();
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
        result.append( " (functionCategory: " );
        result.append( functionCategory );
        result.append( ", functionCategoryUuid: " );
        result.append( functionCategoryUuid );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "FunctionCategoryRef.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from FunctionCategoryRef: ";
        doBuildExplicitLinkWithFunctionCategory( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithFunctionCategory( @NonNull IRiseClipseConsole console,
            @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for FunctionCategory) ";

        SCL sclRoot = AsdUtilities.getSCL( this );

        if( getFunctionCategoryUuid() != null && !getFunctionCategoryUuid().isEmpty() ) {
            List< FunctionCategory > res = new ArrayList<>();

            TreeIterator< EObject > it = sclRoot.eAllContents();
            while( it.hasNext() ) {
                EObject o = it.next();
                if( o instanceof FunctionCategory
                        && getFunctionCategoryUuid().equals( ( ( FunctionCategory ) o ).getUuid() ) ) {
                    res.add( ( FunctionCategory ) o );
                }
            }

            if( res.size() == 1 ) {
                setRefersToFunctionCategory( res.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "SourceRef refers to LNode( id = ", getFunctionCategoryUuid(), " ) on line ",
                        getRefersToFunctionCategory().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                //         " FunctionCategory( uuid = ", getLNodeUuid(), " )" );
            }

        }
        else if( getFunctionCategory() != null && !getFunctionCategory().isEmpty() ) {
            String[] functionCategoryPath = getFunctionCategory().split( "/" );

            if( functionCategoryPath.length < 2 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, "inexpected functionCategory format: ", getFunctionCategory() );
                return;
            }

            List< Naming > content = new ArrayList<>();
            content.addAll( sclRoot.getProcess() );
            content.addAll( sclRoot.getLine() );
            content.addAll( sclRoot.getSubstation() );

            Naming parent = null;
            for( int i = 0; i < functionCategoryPath.length; i++ ) {
                Pair< Naming, Integer > res = AsdUtilities.findByName( content, functionCategoryPath[i], Naming.class );

                if( res.getLeft() != null ) {
                    parent = res.getLeft();
                    content = parent.eContents().stream()
                            .filter( o -> o instanceof LNodeContainer )
                            .map( o -> ( Naming ) o )
                            .toList();
                }

                if( res.getLeft() == null || content.isEmpty() ) {
                    Pair< FunctionCategory, Integer > res1 = getFunctionCategory( parent,
                            Arrays.copyOfRange( functionCategoryPath, i + 1, functionCategoryPath.length ) );

                    if( res1.getLeft() != null ) {
                        setRefersToFunctionCategory( res1.getLeft() );
                        console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                "FunctionCategoryRef refers to FunctionCategory( name = ",
                                functionCategoryPath[functionCategoryPath.length - 1], " )", " on line ",
                                getRefersToFunctionCategory().getLineNumber() );
                        return;
                    }
                    else {
                        break;
                    }
                }
            }

            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, ( ( res1.getRight() == 0 ) ? "cannot find " : "found several " ),
            //         "FunctionCategory( name = ", functionCategoryPath[functionCategoryPath.length - 1], " )" );
        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because source and sourceLNodeUuid are missing" );
        }

    }

    private Pair< FunctionCategory, Integer > getFunctionCategory( Naming parent, String[] path ) {
        if( parent == null || path.length == 0 ) {
            return Pair.of( null, 0 );
        }

        String name = path[0];
        List< FunctionCategory > res1 = parent.getPrivate()
                .stream()
                .filter( p -> "eIEC61850-6-100".equals( p.getType() ) )
                .map( Private::getAsdObjects )
                .flatMap( Collection::stream )
                .filter( o -> o instanceof FunctionCategory && name.equals( ( ( FunctionCategory ) o ).getName() ) )
                .map( f -> ( FunctionCategory ) f )
                .toList();

        if( res1.size() != 1 ) {
            return Pair.of( null, res1.size() );
        }

        FunctionCategory f = res1.get( 0 );

        for( int i = 1; i < path.length; i++ ) {
            String name1 = path[i];
            List< SubCategory > res2 = f.getSubCategory().stream()
                    .filter( s -> name1.equals( s.getName() ) )
                    .toList();

            if( res2.size() != 1 ) {
                return Pair.of( null, res2.size() );
            }

            f = res2.get( 0 );
        }

        return Pair.of( f, 1 );
    }

} //FunctionCategoryRefImpl
