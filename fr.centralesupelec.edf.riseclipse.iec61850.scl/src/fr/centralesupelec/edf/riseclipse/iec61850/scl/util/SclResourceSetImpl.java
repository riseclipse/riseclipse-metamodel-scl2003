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
                SCL scl = ( SCL ) resource.getContents().get( 0 );
                scl.buildExplicitLinks( console, false );
            }
        }
        
    }

}
