/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
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
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.xmi.IllegalValueException;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseResource;
import fr.centralesupelec.edf.riseclipse.util.RiseClipseMetamodel;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseResourceSet;


@SuppressWarnings( "unused" )
public class SclResourceSetImpl extends AbstractRiseClipseResourceSet {
    
    private static final String SCL_SETUP_CATEGORY = "SCL/Setup";

    private SclResourceFactoryImpl resourceFactory;

    public SclResourceSetImpl( boolean strictContent ) {
        super( strictContent );
        
        resourceFactory = new SclResourceFactoryImpl();
    }

    @Override
    protected SclResourceImpl createRiseClipseResource( URI uri, String contentType ) {
        Optional< String > metamodel = RiseClipseMetamodel.findMetamodelFor( uri );
        if( metamodel.isPresent() && SclPackage.eNS_URI.equals( metamodel.get() )) {
            return resourceFactory.createResource( uri );
        }
        return null;
    }

    @Override
    protected void demandLoad( Resource resource ) throws IOException {
        super.demandLoad( resource );

        // Handle errors ignored in AbstractRiseClipseResourceSet.handleErrors()
        @NonNull
        IRiseClipseConsole console = AbstractRiseClipseConsole.getConsole();

        for( Diagnostic error : resource.getErrors() ) {
            if( error instanceof IllegalValueException ) {
                IllegalValueException e = ( IllegalValueException ) error;
                console.error( SCL_SETUP_CATEGORY, resource.getURI().lastSegment(), e.getLine(),
                        ( e.getValue().toString().isEmpty() ? "empty value" : "value \"" + e.getValue() + "\"" ),
                        " is not legal for feature \"", e.getFeature().getName(), "\", it should be a value of ",
                        e.getFeature().getEType().getName() );
            }
            else {
                console.error( SCL_SETUP_CATEGORY, resource.getURI().lastSegment(), error.getLine(),
                           error.getMessage() );
            }
        }
    }

    /* (non-Javadoc)
     * @see fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseResourceSet#finalizeLoad(fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole)
     */
    @Override
    public void finalizeLoad( IRiseClipseConsole console ) {
        buildExplicitLinks( console );
    }

    private void buildExplicitLinks( IRiseClipseConsole console ) {
        for( Resource resource : getResources() ) {
            if( resource.getContents().size() == 0 ) continue;
            if( resource instanceof SclResourceImpl ) {
                SCL scl = null;
                try {
                    scl = ( SCL ) resource.getContents().get( 0 );
                }
                catch( ClassCastException ex ) {
                    console.critical( SCL_SETUP_CATEGORY, 0, resource.getURI(), " is not an SCL file" );
                    continue;
                }
                scl.buildExplicitLinks( console, false );
            }
        }
        
    }

}
