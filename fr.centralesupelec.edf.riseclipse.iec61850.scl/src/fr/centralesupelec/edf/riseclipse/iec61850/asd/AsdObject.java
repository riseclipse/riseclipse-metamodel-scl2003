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
package fr.centralesupelec.edf.riseclipse.iec61850.asd;

import org.eclipse.emf.ecore.EObject;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject#getFilename <em>Filename</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject#isExplicitLinksBuilt <em>Explicit Links Built</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject#getParentPrivate <em>Parent Private</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAsdObject()
 * @model abstract="true"
 * @generated
 */
public interface AsdObject extends EObject {
    /**
     * Returns the value of the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Filename</em>' attribute.
     * @see #setFilename(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAsdObject_Filename()
     * @model required="true"
     * @generated
     */
    String getFilename();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject#getFilename <em>Filename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Filename</em>' attribute.
     * @see #getFilename()
     * @generated
     */
    void setFilename( String value );

    /**
     * Returns the value of the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Line Number</em>' attribute.
     * @see #setLineNumber(int)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAsdObject_LineNumber()
     * @model required="true"
     * @generated
     */
    int getLineNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject#getLineNumber <em>Line Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Line Number</em>' attribute.
     * @see #getLineNumber()
     * @generated
     */
    void setLineNumber( int value );

    /**
     * Returns the value of the '<em><b>Explicit Links Built</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Explicit Links Built</em>' attribute.
     * @see #setExplicitLinksBuilt(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAsdObject_ExplicitLinksBuilt()
     * @model default="false" required="true" transient="true"
     * @generated
     */
    boolean isExplicitLinksBuilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject#isExplicitLinksBuilt <em>Explicit Links Built</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Explicit Links Built</em>' attribute.
     * @see #isExplicitLinksBuilt()
     * @generated
     */
    void setExplicitLinksBuilt( boolean value );

    /**
     * Returns the value of the '<em><b>Parent Private</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Private#getAsdObjects <em>Asd Objects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Private</em>' container reference.
     * @see #setParentPrivate(Private)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAsdObject_ParentPrivate()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Private#getAsdObjects
     * @model opposite="AsdObjects" unsettable="true" ordered="false"
     * @generated
     */
    Private getParentPrivate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject#getParentPrivate <em>Parent Private</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Private</em>' container reference.
     * @see #getParentPrivate()
     * @generated
     */
    void setParentPrivate( Private value );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model consoleType="fr.centralesupelec.edf.riseclipse.iec61850.scl.IRiseClipseConsole"
     * @generated
     */
    boolean buildExplicitLinks( IRiseClipseConsole console, Boolean forceUpdate );

} // AsdObject
