/*
*************************************************************************
**  Copyright (c) 2016-2022 CentraleSupélec & EDF.
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
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclObjectImpl#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclObjectImpl#isExplicitLinksBuilt <em>Explicit Links Built</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SclObjectImpl extends MinimalEObjectImpl.Container implements SclObject {
    
    protected static final String EXPLICIT_LINK_CATEGORY = "SCL/ExplicitLinks";
    
    /**
     * The default value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineNumber()
     * @generated
     * @ordered
     */
    protected static final int LINE_NUMBER_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineNumber()
     * @generated
     * @ordered
     */
    protected int lineNumber = LINE_NUMBER_EDEFAULT;

    /**
     * The default value of the '{@link #isExplicitLinksBuilt() <em>Explicit Links Built</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExplicitLinksBuilt()
     * @generated
     * @ordered
     */
    protected static final boolean EXPLICIT_LINKS_BUILT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isExplicitLinksBuilt() <em>Explicit Links Built</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExplicitLinksBuilt()
     * @generated
     * @ordered
     */
    protected boolean explicitLinksBuilt = EXPLICIT_LINKS_BUILT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SclObjectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSclObject();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLineNumber( int newLineNumber ) {
        int oldLineNumber = lineNumber;
        lineNumber = newLineNumber;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SCL_OBJECT__LINE_NUMBER, oldLineNumber,
                    lineNumber ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isExplicitLinksBuilt() {
        return explicitLinksBuilt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExplicitLinksBuilt( boolean newExplicitLinksBuilt ) {
        boolean oldExplicitLinksBuilt = explicitLinksBuilt;
        explicitLinksBuilt = newExplicitLinksBuilt;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SCL_OBJECT__EXPLICIT_LINKS_BUILT,
                    oldExplicitLinksBuilt, explicitLinksBuilt ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean buildExplicitLinks( @NonNull IRiseClipseConsole console, Boolean forceUpdate ) {
        if( ( !forceUpdate ) && isExplicitLinksBuilt() ) return true;

        // Parent's links must be built before children's one
        // because children may need them
        doBuildExplicitLinks( console );

        // Calls on children may lead to recursion
        setExplicitLinksBuilt( true );

        TreeIterator< EObject > it = eAllContents();
        while( it.hasNext() ) {
            EObject o = it.next();
            if( o instanceof SclObject ) {
                ( ( SclObject ) o ).buildExplicitLinks( console, forceUpdate );
            }
        }

        return false;
    }

    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        // Default do nothing
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case SclPackage.SCL_OBJECT__LINE_NUMBER:
            return getLineNumber();
        case SclPackage.SCL_OBJECT__EXPLICIT_LINKS_BUILT:
            return isExplicitLinksBuilt();
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
        case SclPackage.SCL_OBJECT__LINE_NUMBER:
            setLineNumber( ( Integer ) newValue );
            return;
        case SclPackage.SCL_OBJECT__EXPLICIT_LINKS_BUILT:
            setExplicitLinksBuilt( ( Boolean ) newValue );
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
        case SclPackage.SCL_OBJECT__LINE_NUMBER:
            setLineNumber( LINE_NUMBER_EDEFAULT );
            return;
        case SclPackage.SCL_OBJECT__EXPLICIT_LINKS_BUILT:
            setExplicitLinksBuilt( EXPLICIT_LINKS_BUILT_EDEFAULT );
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
        case SclPackage.SCL_OBJECT__LINE_NUMBER:
            return lineNumber != LINE_NUMBER_EDEFAULT;
        case SclPackage.SCL_OBJECT__EXPLICIT_LINKS_BUILT:
            return explicitLinksBuilt != EXPLICIT_LINKS_BUILT_EDEFAULT;
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke( int operationID, EList< ? > arguments ) throws InvocationTargetException {
        switch( operationID ) {
        case SclPackage.SCL_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN:
            return buildExplicitLinks( ( IRiseClipseConsole ) arguments.get( 0 ), ( Boolean ) arguments.get( 1 ) );
        }
        return super.eInvoke( operationID, arguments );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (lineNumber: " );
        result.append( lineNumber );
        result.append( ", explicitLinksBuilt: " );
        result.append( explicitLinksBuilt );
        result.append( ')' );
        return result.toString();
    }

} //SclObjectImpl
