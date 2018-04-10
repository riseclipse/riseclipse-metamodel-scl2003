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
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExplicitLinkResolver;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclSwitch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explicit Link Resolver</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ExplicitLinkResolverImpl extends SclObjectImpl implements ExplicitLinkResolver {

    private boolean isResolved;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExplicitLinkResolverImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getExplicitLinkResolver();
    }

    /**
     */
    public void resolveLinks() {
        if( isResolved ) return;
        doResolveLinks();
        isResolved = true;
        resolveChildren();
    }

    protected void doResolveLinks() {
    }

    private void resolveChildren() {
        // The default implementation propagates the call to included objects
        for( EObject o : eContents() ) {
            if( o instanceof ExplicitLinkResolver ) {
                ( ( ExplicitLinkResolver ) o ).resolveLinks();
            }
        }
    }

    protected void setIsResolved() {
        isResolved = true;
    }

    protected SCL getSCLRoot() {
        EObject scl = this;
        while( ( scl != null ) && !( scl instanceof SCL ) ) {
            scl = scl.eContainer();
        }
        return ( SCL ) scl;
    }

    @SuppressWarnings( "unchecked" )
    protected < T > List< T > deepSearchObjects( EObject from, SclSwitch< Boolean > comparator ) {
        ArrayList< T > res = new ArrayList< T >();

        if( comparator.doSwitch( from ) ) {
            res.add( ( T ) from );
        }

        TreeIterator< EObject > it = from.eAllContents();
        while( it.hasNext() ) {
            EObject o = it.next();
            if( comparator.doSwitch( o ) ) {
                res.add( ( T ) o );
            }
        }

        return res;
    }

    protected < T > List< T > shallowSearchObjects( List< T > list, SclSwitch< Boolean > comparator ) {
        ArrayList< T > res = new ArrayList< T >();

        for( T o : list ) {
            if( comparator.doSwitch( ( EObject ) o ) ) {
                res.add( ( T ) o );
            }
        }

        return res;
    }

    protected < T, U extends EObject > List< T > deepSearchObjects( List< U > list, SclSwitch< Boolean > comparator ) {
        return deepSearchObjectsAux( Collections.< EObject > unmodifiableCollection( list ), comparator );
    }

    @SuppressWarnings( "unchecked" )
    private < T > List< T > deepSearchObjectsAux( Collection< EObject > list, SclSwitch< Boolean > comparator ) {
        ArrayList< T > res = new ArrayList< T >();

        for( EObject o : list ) {
            if( comparator.doSwitch( o ) ) {
                res.add( ( T ) o );
            }

            TreeIterator< EObject > it = o.eAllContents();
            while( it.hasNext() ) {
                EObject x = it.next();
                if( comparator.doSwitch( x ) ) {
                    res.add( ( T ) x );
                }
            }
        }

        return res;
    }

} //ExplicitLinkResolverImpl
