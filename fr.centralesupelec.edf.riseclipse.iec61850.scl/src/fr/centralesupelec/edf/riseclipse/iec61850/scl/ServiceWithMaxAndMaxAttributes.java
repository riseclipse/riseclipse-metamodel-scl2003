/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service With Max And Max Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndMaxAttributes#getMaxAttributes <em>Max Attributes</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServiceWithMaxAndMaxAttributes()
 * @model
 * @generated
 */
public interface ServiceWithMaxAndMaxAttributes extends ServiceWithMax {
    /**
     * Returns the value of the '<em><b>Max Attributes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Attributes</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Attributes</em>' attribute.
     * @see #isSetMaxAttributes()
     * @see #unsetMaxAttributes()
     * @see #setMaxAttributes(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServiceWithMaxAndMaxAttributes_MaxAttributes()
     * @model unsettable="true"
     * @generated
     */
    Integer getMaxAttributes();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndMaxAttributes#getMaxAttributes <em>Max Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Attributes</em>' attribute.
     * @see #isSetMaxAttributes()
     * @see #unsetMaxAttributes()
     * @see #getMaxAttributes()
     * @generated
     */
    void setMaxAttributes( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndMaxAttributes#getMaxAttributes <em>Max Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxAttributes()
     * @see #getMaxAttributes()
     * @see #setMaxAttributes(Integer)
     * @generated
     */
    void unsetMaxAttributes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndMaxAttributes#getMaxAttributes <em>Max Attributes</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Attributes</em>' attribute is set.
     * @see #unsetMaxAttributes()
     * @see #getMaxAttributes()
     * @see #setMaxAttributes(Integer)
     * @generated
     */
    boolean isSetMaxAttributes();

} // ServiceWithMaxAndMaxAttributes
