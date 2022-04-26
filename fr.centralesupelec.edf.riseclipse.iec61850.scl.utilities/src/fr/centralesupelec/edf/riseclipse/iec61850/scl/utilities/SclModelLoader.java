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
package fr.centralesupelec.edf.riseclipse.iec61850.scl.utilities;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclResourceFactoryImpl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclResourceSetImpl;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseModelLoader;

public class SclModelLoader extends AbstractRiseClipseModelLoader {

    public SclModelLoader() {
        super( new SclResourceSetImpl( false ));

        // Register the appropriate resource factory to handle all file
        // extensions.
        getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap()
                .put( Resource.Factory.Registry.DEFAULT_EXTENSION, new SclResourceFactoryImpl() );

        // Register the package to ensure it is available during loading.
        getResourceSet().getPackageRegistry().put( SclPackage.eNS_URI, SclPackage.eINSTANCE );
    }

    public void reset() {
        super.reset( new SclResourceSetImpl( false ));

        // Register the appropriate resource factory to handle all file
        // extensions.
        getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap()
                .put( Resource.Factory.Registry.DEFAULT_EXTENSION, new SclResourceFactoryImpl() );

        // Register the package to ensure it is available during loading.
        getResourceSet().getPackageRegistry().put( SclPackage.eNS_URI, SclPackage.eINSTANCE );
    }

    public Resource loadWithoutValidation( String name ) {
        Object eValidator = EValidator.Registry.INSTANCE.remove( SclPackage.eINSTANCE );

        Resource resource = load( name, AbstractRiseClipseConsole.getConsole() );

        if( eValidator != null ) {
            EValidator.Registry.INSTANCE.put( SclPackage.eINSTANCE, eValidator );
        }
        return resource;
    }

    public static void main( String[] args ) {
        SclModelLoader loader = new SclModelLoader();

        for( int i = 0; i < args.length; ++i ) {
            @SuppressWarnings( "unused" )
            Resource resource = loader.load( args[i], AbstractRiseClipseConsole.getConsole() );
        }
    }

}
