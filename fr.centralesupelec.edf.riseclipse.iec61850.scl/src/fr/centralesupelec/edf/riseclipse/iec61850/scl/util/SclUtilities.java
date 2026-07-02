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

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;

public class SclUtilities {

    private static Map< String, String > daTypes = new HashMap<>();
    private static Map< String, List< String > > cdcOrder = new HashMap<>();
    private static Map< String, List< String > > constructedAttributeOrder = new HashMap<>();
	
    public static @NonNull SCL getSCL( SclObject object ) {
        EObject scl = object;
        while(( scl != null ) && ! ( scl instanceof SCL )) {
            scl = scl.eContainer();
        }
        if( scl == null ) {
            AbstractRiseClipseConsole.getConsole().emergency( "SCL/Utility", 0, "root container is not SCL" );
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

    public static Pair< AnyLN, Integer > getAnyLN( @NonNull LDevice lDevice, @NonNull String lnName ) {
        if( "LLN0".equals( lnName )) {
            return Pair.of( lDevice.getLN0(), ( lDevice.getLN0() == null ) ? 0 : 1  );
        }
        
        // Null checks must be done as annotation-based null analysis is not enabled (issue #64)
        if( lnName == null ) return Pair.of( null, 0 );
        
        List< LN > res =
                lDevice
                .getLN()
                .stream()
                .filter( ln -> lnName.equals( ln.getPrefix() + ln.getLnClass() + ln.getInst() ))
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

    public static List< String > getCdcOrder( String cdc, String fc ) {
        if( cdcOrder.isEmpty() ) {
            getOrderFromNSD();
        }

        if( !cdcOrder.containsKey( cdc ) ) {
            return cdcOrder.getOrDefault( cdc + "::" + fc, new ArrayList< String >() );
        }

        return cdcOrder.getOrDefault( cdc, new ArrayList< String >() );
    }

    public static List< String > getConstructedAttributeOrder( String cdc, String daName ) {
        if( constructedAttributeOrder.isEmpty() || daTypes.isEmpty() ) {
            getOrderFromNSD();
        }

        return constructedAttributeOrder.getOrDefault( daTypes.getOrDefault( cdc + "." + daName, "" ), new ArrayList< String >() );
    }

    public static List< String > getConstructedAttributeOrder( String cdc, String daName, String bdaName ) {
        if( constructedAttributeOrder.isEmpty() || daTypes.isEmpty() ) {
            getOrderFromNSD();
        }
        
        String bdaType = daTypes.getOrDefault( cdc + "." + daName, "" );

        return constructedAttributeOrder.getOrDefault( daTypes.getOrDefault( bdaType + "." + bdaName, "" ), new ArrayList< String >() );
    }

    private static void getOrderFromNSD() {
        try( InputStream inputStream = SclUtilities.class.getResourceAsStream( "/IEC_61850-7-3_2007B5.nsd" ) ) {
            if( inputStream != null ) {
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                Document document = db.parse( inputStream );

                if( document.getDocumentElement().getElementsByTagName( "CDCs" ).getLength() > 0 ) {
                    NodeList cdcs = ( ( Element ) document.getDocumentElement().getElementsByTagName( "CDCs" ).item( 0 ) )
                            .getElementsByTagName( "CDC" );

                    for( int i = 0; i < cdcs.getLength(); i++ ) {
                        List< String > config = new ArrayList<>();

                        Element cdc = ( Element ) cdcs.item( i );
                        String cdcName = cdc.getAttribute( "name" );
                        if( !cdc.getAttribute( "variant" ).isEmpty() ) {
                            cdcName += "::" + cdc.getAttribute( "variant" );
                        }

                        NodeList sdoList = cdc.getElementsByTagName( "SubDataObject" );
                        for( int j = 0; j < sdoList.getLength(); j++ ) {
                            config.add( ( ( Element ) sdoList.item( j ) ).getAttribute( "name" ) );
                        }

                        NodeList daList = cdc.getElementsByTagName( "DataAttribute" );
                        for( int j = 0; j < daList.getLength(); j++ ) {
                            String daName = ( ( Element ) daList.item( j ) ).getAttribute( "name" );
                            config.add( daName );

                            if( "CONSTRUCTED".equals( ( ( Element ) daList.item( j ) ).getAttribute( "typeKind" ) ) ) {
                                daTypes.put( cdcName + "." + daName,
                                        ( ( Element ) daList.item( j ) ).getAttribute( "type" ) );
                            }
                        }

                        cdcOrder.put( cdcName, config );
                    }
                } else {
                    AbstractRiseClipseConsole.getConsole().alert( "SCL/Utility", 1, "cannot find CDCs tag" );
                }

                // Constructed attributes
                if( document.getDocumentElement().getElementsByTagName( "ConstructedAttributes" ).getLength() > 0 ) {
                    NodeList constructedAttributes = ( ( Element ) document.getDocumentElement()
                            .getElementsByTagName( "ConstructedAttributes" ).item( 0 ) )
                                    .getElementsByTagName( "ConstructedAttribute" );

                    for( int i = 0; i < constructedAttributes.getLength(); i++ ) {
                        List< String > config = new ArrayList<>();

                        Element constructedAttribute = ( Element ) constructedAttributes.item( i );

                        NodeList bdaList = constructedAttribute.getElementsByTagName( "SubDataAttribute" );
                        for( int j = 0; j < bdaList.getLength(); j++ ) {
                            String bdaName = ( ( Element ) bdaList.item( j ) ).getAttribute( "name" );
                            config.add( bdaName );
                            
                            if( "CONSTRUCTED".equals( constructedAttribute.getAttribute( "typeKind" ) ) ) {
                                daTypes.put( constructedAttribute.getAttribute( "name" ) + "." + bdaName,
                                        constructedAttribute.getAttribute( "type" ) );
                            }
                        }

                        constructedAttributeOrder.put( constructedAttribute.getAttribute( "name" ), config );

                    }
                } else {
                    AbstractRiseClipseConsole.getConsole().alert( "SCL/Utility", 1,
                            "cannot find ConstructedAttributes tag" );
                }
            }

        }
        catch( IOException | SAXException | ParserConfigurationException e ) {
            AbstractRiseClipseConsole.getConsole().alert( "SCL/Utility", 1,
                    "Error while reading IEC_61850-7-3_2007B5.nsd" );
        }

        try( InputStream inputStream = SclUtilities.class.getResourceAsStream( "/IEC_61850-8-1_2003A3.snsd" ) ) {
            if( inputStream != null ) {
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                Document document = db.parse( inputStream );

                if( document.getDocumentElement().getElementsByTagName( "ServiceCDCs" ).getLength() > 0 ) {
                   NodeList cdcs = ( ( Element ) document.getDocumentElement().getElementsByTagName( "ServiceCDCs" )
                            .item( 0 ) ).getElementsByTagName( "ServiceCDC" );
    
                    for( int i = 0; i < cdcs.getLength(); i++ ) {
                        Element cdc = ( Element ) cdcs.item( i );
                        String cdcName = cdc.getAttribute( "cdc" );
    
                        List< String > config = cdcOrder.getOrDefault( cdc.getAttribute( "cdc" ), new ArrayList<>() );
    
                        NodeList sdoList = cdc.getElementsByTagName( "ServiceSubDataObject" );
                        for( int j = 0; j < sdoList.getLength(); j++ ) {
                            config.add( ( ( Element ) sdoList.item( j ) ).getAttribute( "name" ) );
                        }
    
                        NodeList daList = cdc.getElementsByTagName( "ServiceDataAttribute" );
                        for( int j = 0; j < daList.getLength(); j++ ) {
                            String daName = ( ( Element ) daList.item( j ) ).getAttribute( "name" );
                            config.add( daName );
    
                            if( "CONSTRUCTED".equals( ( ( Element ) daList.item( j ) ).getAttribute( "typeKind" ) ) ) {
                                daTypes.put( cdcName + "." + daName,
                                        ( ( Element ) daList.item( j ) ).getAttribute( "type" ) );
                            }
                        }
    
                        cdcOrder.put( cdcName, config );
                    }
                } else {
                    AbstractRiseClipseConsole.getConsole().alert( "SCL/Utility", 1, "cannot find ServiceCDCs tag" );
                }

                // Constructed attributes
                if( document.getDocumentElement().getElementsByTagName( "ServiceConstructedAttributes" ).getLength() > 0 ) {
                    NodeList constructedAttributes = ( ( Element ) document.getDocumentElement()
                            .getElementsByTagName( "ServiceConstructedAttributes" ).item( 0 ) )
                                    .getElementsByTagName( "ServiceConstructedAttribute" );

                    for( int i = 0; i < constructedAttributes.getLength(); i++ ) {
                        List< String > config = new ArrayList<>();

                        Element constructedAttribute = ( Element ) constructedAttributes.item( i );

                        NodeList bdaList = constructedAttribute.getElementsByTagName( "SubDataAttribute" );
                        for( int j = 0; j < bdaList.getLength(); j++ ) {
                            String bdaName = ( ( Element ) bdaList.item( j ) ).getAttribute( "name" );
                            config.add( bdaName );
                            
                            if( "CONSTRUCTED".equals( constructedAttribute.getAttribute( "typeKind" ) ) ) {
                                daTypes.put( constructedAttribute.getAttribute( "name" ) + "." + bdaName,
                                        constructedAttribute.getAttribute( "type" ) );
                            }
                        }

                        constructedAttributeOrder.put( constructedAttribute.getAttribute( "name" ), config );

                    }
                } else {
                    AbstractRiseClipseConsole.getConsole().alert( "SCL/Utility", 1,
                            "cannot find ServiceConstructedAttributes tag" );
                }
            }

        }
        catch( IOException | SAXException | ParserConfigurationException e ) {
            AbstractRiseClipseConsole.getConsole().alert( "SCL/Utility", 1,
                    "Error while reading IEC_61850-8-1_2003A3.snsd" );
        }
    }
}
