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
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ag DA Trg Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp#getDchg <em>Dchg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp#getDupd <em>Dupd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp#getQchg <em>Qchg</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAgDATrgOp()
 * @model abstract="true"
 * @generated
 */
public interface AgDATrgOp extends EObject {
    /**
     * Returns the value of the '<em><b>Dchg</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dchg</em>' attribute.
     * @see #isSetDchg()
     * @see #unsetDchg()
     * @see #setDchg(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAgDATrgOp_Dchg()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getDchg();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp#getDchg <em>Dchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dchg</em>' attribute.
     * @see #isSetDchg()
     * @see #unsetDchg()
     * @see #getDchg()
     * @generated
     */
    void setDchg( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp#getDchg <em>Dchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDchg()
     * @see #getDchg()
     * @see #setDchg(Boolean)
     * @generated
     */
    void unsetDchg();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp#getDchg <em>Dchg</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dchg</em>' attribute is set.
     * @see #unsetDchg()
     * @see #getDchg()
     * @see #setDchg(Boolean)
     * @generated
     */
    boolean isSetDchg();

    /**
     * Returns the value of the '<em><b>Dupd</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dupd</em>' attribute.
     * @see #isSetDupd()
     * @see #unsetDupd()
     * @see #setDupd(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAgDATrgOp_Dupd()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getDupd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp#getDupd <em>Dupd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dupd</em>' attribute.
     * @see #isSetDupd()
     * @see #unsetDupd()
     * @see #getDupd()
     * @generated
     */
    void setDupd( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp#getDupd <em>Dupd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDupd()
     * @see #getDupd()
     * @see #setDupd(Boolean)
     * @generated
     */
    void unsetDupd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp#getDupd <em>Dupd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dupd</em>' attribute is set.
     * @see #unsetDupd()
     * @see #getDupd()
     * @see #setDupd(Boolean)
     * @generated
     */
    boolean isSetDupd();

    /**
     * Returns the value of the '<em><b>Qchg</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qchg</em>' attribute.
     * @see #isSetQchg()
     * @see #unsetQchg()
     * @see #setQchg(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAgDATrgOp_Qchg()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getQchg();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp#getQchg <em>Qchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qchg</em>' attribute.
     * @see #isSetQchg()
     * @see #unsetQchg()
     * @see #getQchg()
     * @generated
     */
    void setQchg( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp#getQchg <em>Qchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQchg()
     * @see #getQchg()
     * @see #setQchg(Boolean)
     * @generated
     */
    void unsetQchg();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp#getQchg <em>Qchg</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qchg</em>' attribute is set.
     * @see #unsetQchg()
     * @see #getQchg()
     * @see #setQchg(Boolean)
     * @generated
     */
    boolean isSetQchg();

} // AgDATrgOp
