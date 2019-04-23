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
package fr.centralesupelec.edf.riseclipse.iec61850.scl.util;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation;

public class SclUtilities {

    public static DataTypeTemplates get_DataTypeTemplates( SclObject object ) {
        SCL scl = get_SCL( object );
        if( scl == null ) return null;
        return scl.getDataTypeTemplates();
    }

    public static List< IED > get_IEDs( SclObject object ) {
        SCL scl = get_SCL( object );
        if( scl == null ) return null;
        return scl.getIED();
    }

    public static List< Substation > get_Substations( SclObject object ) {
        SCL scl = get_SCL( object );
        if( scl == null ) return null;
        return scl.getSubstation();
    }

    public static SCL get_SCL( SclObject object ) {
        EObject scl = object;
        while(( scl != null ) && ! ( scl instanceof SCL )) {
            scl = scl.eContainer();
        }
        return ( SCL ) scl;
    }

}
