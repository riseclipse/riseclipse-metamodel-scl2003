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
package fr.centralesupelec.edf.riseclipse.iec61850.scl.util;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.util.RiseClipseFatalException;

public class SclUtilities {

    public static @NonNull SCL getSCL( SclObject object ) {
        EObject scl = object;
        while(( scl != null ) && ! ( scl instanceof SCL )) {
            scl = scl.eContainer();
        }
        if( scl == null ) {
            throw new RiseClipseFatalException( "root container is not SCL", null );
        }
        return ( SCL ) scl;
    }

    public static IED getMyIED( SclObject object ) {
        EObject ied = object;
        while(( ied != null ) && ! ( ied instanceof IED )) {
            ied = ied.eContainer();
        }
        return ( IED ) ied;
    }

    public static Pair< IED, Integer > getIED( @NonNull SCL scl, @NonNull String iedName ) {
        // protect against NPE
        if( scl == null ) return Pair.of( null, 0 );
        
        List< IED > res =
                scl
                .getIED()
                .stream()
                .filter( ied -> iedName.equals(  ied.getName() ))
                .collect( Collectors.toList() );
        
        if( res.size() != 1 ) {
            return Pair.of( null, res.size() );
        }
        return Pair.of( res.get( 0 ), 1 );
    }

    public static Pair< AccessPoint, Integer > getAccessPoint( @NonNull IED ied, @NonNull String apName ) {
        // protect against NPE
        if( ied == null ) return Pair.of( null, 0 );
        
        List< AccessPoint > res =
                ied
                .getAccessPoint()
                .stream()
                .filter( ap -> apName.equals(  ap.getName() ))
                .collect( Collectors.toList() );
        
        if( res.size() != 1 ) {
            return Pair.of( null, res.size() );
        }
        return Pair.of( res.get( 0 ), 1 );
    }

    public static Pair< LDevice, Integer > getLDevice( @NonNull AccessPoint accessPoint, @NonNull String ldInst ) {
        // protect against NPE
        if( ldInst                  == null ) return Pair.of( null, 0 );
        if( accessPoint             == null ) return Pair.of( null, 0 );
        if( accessPoint.getServer() == null ) return Pair.of( null, 0 );
        
        List< LDevice > res = 
                accessPoint
                .getServer()
                .getLDevice()
                .stream()
                .filter( ld -> ldInst.equals( ld.getInst() ))
                .collect( Collectors.toList() );
        
        if( res.size() != 1 ) {
            return Pair.of( null, res.size() );
        }
        return Pair.of( res.get( 0 ), 1 );
    }

    public static Pair< LDevice, Integer > getLDevice( @NonNull IED ied, @NonNull String ldInst ) {
        // protect against NPE
        if( ldInst                  == null ) return Pair.of( null, 0 );
        if( ied                     == null ) return Pair.of( null, 0 );
        
        List< LDevice > res = 
                ied
                .getAccessPoint()
                .stream()
                .map( ap -> ap.getServer() )
                .filter( s -> s != null )
                .map( s -> s.getLDevice() )
                .filter( ld -> ld != null )
                .flatMap( ld -> ld.stream() )
                .filter( ld -> ldInst.equals( ld.getInst() ))
                .collect( Collectors.toList() );
        
        if( res.size() != 1 ) {
            return Pair.of( null, res.size() );
        }
        return Pair.of( res.get( 0 ), 1 );
    }

    public static Pair< AnyLN, Integer > getAnyLN( @NonNull LDevice lDevice, @NonNull String lnClass, @NonNull String lnInst, String prefix ) {
        if( "LLN0".equals( lnClass )) {
            return Pair.of( lDevice.getLN0(), ( lDevice.getLN0() == null ) ? 0 : 1  );
        }
        
        // Null checks must be done as annotation-based null analysis is not enabled (issue #64)
        if( lnClass == null ) return Pair.of( null, 0 );
        if( lnInst == null )  return Pair.of( null, 0 );
        
        List< LN > res =
                lDevice
                .getLN()
                .stream()
                .filter( ln -> lnClass.equals( ln.getLnClass() ) && lnInst.equals( ln.getInst() ) && Objects.equals( prefix, ln.getPrefix() ))
                .collect( Collectors.toList() );
        if( res.size() != 1 ) {
            return Pair.of( null, res.size() );
        }
        return Pair.of( res.get( 0 ), 1 );
    }

    public static Pair< AnyLN, Integer > getAnyLN( @NonNull AccessPoint accessPoint, @NonNull String lnClass, @NonNull String lnInst, String prefix ) {
        if( "LLN0".equals( lnClass )) {
            return Pair.of( null, 0 );
        }
        
        // Null checks must be done as annotation-based null analysis is not enabled (issue #64)
        if( lnClass == null ) return Pair.of( null, 0 );
        if( lnInst == null )  return Pair.of( null, 0 );
        
        List< LN > res =
                accessPoint
                .getLN()
                .stream()
                .filter( ln -> lnClass.equals( ln.getLnClass() ) && lnInst.equals( ln.getInst() ) && Objects.equals( prefix, ln.getPrefix() ))
                .collect( Collectors.toList() );
        if( res.size() != 1 ) {
            return Pair.of( null, res.size() );
        }
        return Pair.of( res.get( 0 ), 1 );
    }

}
