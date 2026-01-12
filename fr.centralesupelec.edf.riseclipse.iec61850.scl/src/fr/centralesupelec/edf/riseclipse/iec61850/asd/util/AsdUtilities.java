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
package fr.centralesupelec.edf.riseclipse.iec61850.asd.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResources;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgUuid;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Line;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Naming;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclUtilities;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;

public class AsdUtilities {

    public static @NonNull SCL getSCL( AsdObject object ) {
        EObject asd = object;
        while(( asd != null ) && ! ( asd instanceof Private )) {
            asd = asd.eContainer();
        }
        if( asd == null ) {
            AbstractRiseClipseConsole.getConsole().emergency( "ASD/Utility", 0, "ASD object is not in Private" );
        }
        return SclUtilities.getSCL( ( Private ) asd );
    }
    
    public static <T extends Naming> Pair< T, Integer > findByName( List< Naming > objects, String name, Class< T > sclClass ) {
        List< Naming > res = objects
                .stream()
                .filter( o -> name.equals( o.getName() ) )
                .toList();

        if( res.size() != 1 ) {
            return Pair.of( null, res.size() );
        }
        
        return Pair.of( sclClass.cast( res.get( 0 ) ), 1 );
    }

    public static <T extends AgUuid> Pair< T, Integer > findByUuid( SCL scl, String uuid, Class< T > sclClass ) {
        List< T > res = new ArrayList<>();

        List< AgUuid > content = new ArrayList<>();
        content.addAll( scl.getProcess() );
        content.addAll( scl.getLine() );
        content.addAll( scl.getSubstation() );

        for( AgUuid parent: content ) {
            TreeIterator< EObject > it = parent.eAllContents();
            while( it.hasNext() ) {
                EObject o = it.next();
                if( sclClass.isInstance( o ) && uuid.equals( sclClass.cast( o ).getUuid() ) ) {
                    res.add( sclClass.cast( o ) );
                }
            }
        }

        if( res.size() != 1 ) {
            return Pair.of( null, res.size() );
        }
        
        return Pair.of( sclClass.cast( res.get( 0 ) ), 1 );
    }

    public static <T extends AgUuid> Pair< T, Integer > findByUuid( List< ? extends BaseElement > content, String uuid, Class< T > sclClass ) {
        List< T > res = new ArrayList<>();

        for( BaseElement parent: content ) {
            TreeIterator< EObject > it = parent.eAllContents();
            while( it.hasNext() ) {
                EObject o = it.next();
                if( sclClass.isInstance( o ) && uuid.equals( sclClass.cast( o ).getUuid() ) ) {
                    res.add( sclClass.cast( o ) );
                }
            }
        }

        if( res.size() != 1 ) {
            return Pair.of( null, res.size() );
        }
        
        return Pair.of( sclClass.cast( res.get( 0 ) ), 1 );
    }

    public static Pair< LNodeContainer, Integer > getLNodeContainer( SclObject root, String[] path ) {
        if( path.length == 0 || root == null ) {
            return root instanceof LNodeContainer ? Pair.of( ( LNodeContainer ) root, 1 ) : Pair.of( null, 0 );
        }
         
        SclObject lnodeContainer = root;
        
        for( int i = 0; i < path.length; i++ ) {
            String name = path[i];
            List< LNodeContainer > res = lnodeContainer.eContents().stream()
                    .filter( o -> o instanceof LNodeContainer && name.equals( ( (LNodeContainer) o ).getName() ) )
                    .map( o -> (LNodeContainer) o )
                    .toList();

            if( res.size() != 1 ) {
                return Pair.of( null, res.size() );
            }
            
            lnodeContainer = res.get( 0 );
        }        

        if( !( lnodeContainer instanceof LNodeContainer ) ) {
            return Pair.of( null, 0 );
        }
        
        return Pair.of( ( LNodeContainer ) lnodeContainer, 1 );
        
    }
    
    public static Pair< LNode, Integer > getLNode( SclObject root, String[] path ) {
        if( path.length == 0 || root == null ) {
            return Pair.of( null, 0 );
        }
        
        Pair< LNodeContainer, Integer > lnodeContainer = getLNodeContainer( root, Arrays.copyOf( path, path.length - 1 ) );

        if( lnodeContainer.getLeft() == null ) {
            return Pair.of( null, 0 );
        }
        
        List< LNode > res1 = lnodeContainer.getLeft().getLNode()
                .stream()
                .filter( o -> path[path.length - 1].equals( o.getPrefix() + o.getLnClass() + o.getLnInst() ) )
                .toList();
    
        if( res1.size() != 1 ) {
            return Pair.of( null, res1.size() );
        }
        
        return Pair.of( res1.get( 0 ), 1 );
        
    }
    
    public static Pair< Function, Integer > getFunctionFromUuid( SCL sclRoot, String functionUuid ) {

        List< Line > projectLines = new ArrayList<>();
        List< Substation > projectSubstations = new ArrayList<>();
        List< Function > projectFunctions = new ArrayList<>();
        projectLines.addAll( sclRoot.getLine() );
        projectSubstations.addAll( sclRoot.getSubstation() );

        sclRoot.getProcess().stream()
                .map( p -> getAllProcesses( p ) )
                .flatMap( Collection::stream )
                .forEach( p -> {
                    projectLines.addAll( p.getLine() );
                    projectSubstations.addAll( p.getSubstation() );
                    projectFunctions.addAll( p.getFunction() );
                } );
        
        projectLines.forEach( l -> projectFunctions.addAll( l.getFunction() ) );

        for( Substation substation : projectSubstations ) {
            projectFunctions.addAll( substation.getFunction() );
            for( VoltageLevel voltageLevel : substation.getVoltageLevel() ) {
                projectFunctions.addAll( voltageLevel.getFunction() );
                for( Bay bay : voltageLevel.getBay() ) {
                    projectFunctions.addAll( bay.getFunction() );
                }
            }
        }

        List< Function > refersToFunction = projectFunctions.stream()
                .filter( f -> functionUuid.equals( f.getUuid() ) )
                .toList();

        if( refersToFunction.size() == 1 ) {
            return Pair.of( refersToFunction.get( 0 ), 1 );
        }
        else {
            return Pair.of( null, refersToFunction.size() );
        }
    }

    private static List< fr.centralesupelec.edf.riseclipse.iec61850.scl.Process > getAllProcesses(
            fr.centralesupelec.edf.riseclipse.iec61850.scl.Process process ) {
        List< fr.centralesupelec.edf.riseclipse.iec61850.scl.Process > subprocesses = new ArrayList<>();
        subprocesses.add( process );

        for( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process subprocess : process.getSubProcesses() ) {
            subprocesses.addAll( getAllProcesses( subprocess ) );
        }

        return subprocesses;

    }
    
    public static Pair< ProcessResource, Integer > getProcessResource( LNodeContainer container, Predicate< ProcessResource > processResourceFilter ) {
        
        List< ProcessResource > res = container.getPrivate()
                .stream()
                .filter( p -> "eIEC61850-6-100".equals( p.getType() ) )
                .map( Private::getAsdObjects )
                .flatMap( Collection::stream )
                .filter( o -> o instanceof ProcessResources )
                .map( p -> ( ( ProcessResources ) p).getProcessResource()  )
                .flatMap( Collection::stream )
                .filter( processResourceFilter )
                .toList();

        if( res.size() == 1 ) {
            return Pair.of( res.get( 0 ), 1 );
        } else if( res.size() == 0 && container.eContainer() instanceof LNodeContainer ) {
            return getProcessResource( ( LNodeContainer ) container.eContainer(), processResourceFilter );
        } else {
            return Pair.of( null, res.size() );
        }
        
    }

    public static Pair< ProcessResource, Integer > getProcessResourceFromSCL( SCL sclRoot, String[] path ) {
        if( path.length < 2 || sclRoot == null ) {
            return Pair.of( null, 0 );
        }
        
        String name = path[0];
        List< LNodeContainer > res = sclRoot.eContents().stream()
                .filter( o -> o instanceof LNodeContainer && name.equals( ( (LNodeContainer) o ).getName() ) )
                .map( o -> (LNodeContainer) o )
                .toList();
    
        if( res.size() != 1 ) {
            return Pair.of( null, res.size() );
        }
        
        LNodeContainer lnodeContainer = res.get( 0 );
        
        for( int i = 1; i < path.length - 1; i++ ) {
            String name1 = path[i];
            List< LNodeContainer > res1 = lnodeContainer.eContents().stream()
                    .filter( o -> o instanceof LNodeContainer && name1.equals( ( (LNodeContainer) o ).getName() ) )
                    .map( o -> (LNodeContainer) o )
                    .toList();

            if( res1.size() != 1 ) {
                return Pair.of( null, res1.size() );
            }
            
            lnodeContainer = res1.get( 0 );
        }        
    
        List< ProcessResource > res2 = lnodeContainer.getPrivate()
                .stream()
                .filter( p -> "eIEC61850-6-100".equals( p.getType() ) )
                .map( Private::getAsdObjects )
                .flatMap( Collection::stream )
                .filter( o -> o instanceof ProcessResources )
                .map( p -> ( ( ProcessResources ) p).getProcessResource()  )
                .flatMap( Collection::stream )
                .filter( p -> path[path.length - 1].equals( p.getName() ) )
                .toList();
    
        if( res2.size() != 1 ) {
            return Pair.of( null, res2.size() );
        }
        
        return Pair.of( res2.get( 0 ), 1 );
    }
    

    public static Pair< ServiceSpecifications, Integer > getServiceSpecifications( AsdObject object ) {
        
        List< ServiceSpecifications > res = getSCL( object ).getPrivate()
                .stream()
                .filter( p -> "eIEC61850-6-100".equals( p.getType() ) )
                .map( Private::getAsdObjects )
                .flatMap( Collection::stream )
                .filter( o -> o instanceof ServiceSpecifications )
                .map( s -> ( ( ServiceSpecifications ) s ) )
                .toList();

        if( res.size() == 1 ) {
            return Pair.of( res.get( 0 ), 1 );
        }
    
        return Pair.of( null, res.size() );
        
    }

    public static String getSourceRefName( SourceRef sourceRef, boolean addInst ) {
        StringBuilder name = new StringBuilder( sourceRef.getInput() );

        if( addInst ) {
            name.append( "(" ).append( sourceRef.getInputInst() ).append( ")" )
                    .append( "." ).append( sourceRef.getPDA() );
        }

        return name.toString();
    }

    public static String getControlRefName( ControlRef controlRef, boolean addInst ) {
        StringBuilder name = new StringBuilder( controlRef.getOutput() );

        if( addInst ) {
            name.append( "(" ).append( controlRef.getOutputInst() ).append( ")" );
        }

        return name.toString();
    }

}
