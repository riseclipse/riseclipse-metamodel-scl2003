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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getCount <em>Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getParentDOType <em>Parent DO Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getReferredBySDI <em>Referred By SDI</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDO()
 * @model
 * @generated
 */
public interface SDO extends AbstractDataObject, INamespaceGetter {
    /**
     * Returns the value of the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Count</em>' attribute.
     * @see #isSetCount()
     * @see #unsetCount()
     * @see #setCount(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDO_Count()
     * @model unsettable="true"
     * @generated
     */
    String getCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getCount <em>Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Count</em>' attribute.
     * @see #isSetCount()
     * @see #unsetCount()
     * @see #getCount()
     * @generated
     */
    void setCount( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getCount <em>Count</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetCount()
     * @see #getCount()
     * @see #setCount(String)
     * @generated
     */
    void unsetCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getCount <em>Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Count</em>' attribute is set.
     * @see #unsetCount()
     * @see #getCount()
     * @see #setCount(String)
     * @generated
     */
    boolean isSetCount();

    /**
     * Returns the value of the '<em><b>Parent DO Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getSDO <em>SDO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DO Type</em>' container reference.
     * @see #setParentDOType(DOType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDO_ParentDOType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getSDO
     * @model opposite="SDO" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    DOType getParentDOType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getParentDOType <em>Parent DO Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DO Type</em>' container reference.
     * @see #getParentDOType()
     * @generated
     */
    void setParentDOType( DOType value );

    /**
     * Returns the value of the '<em><b>Referred By SDI</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getRefersToSDO <em>Refers To SDO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By SDI</em>' reference list.
     * @see #isSetReferredBySDI()
     * @see #unsetReferredBySDI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDO_ReferredBySDI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getRefersToSDO
     * @model opposite="RefersToSDO" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< SDI > getReferredBySDI();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getReferredBySDI <em>Referred By SDI</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredBySDI()
     * @see #getReferredBySDI()
     * @generated
     */
    void unsetReferredBySDI();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getReferredBySDI <em>Referred By SDI</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By SDI</em>' reference list is set.
     * @see #unsetReferredBySDI()
     * @see #getReferredBySDI()
     * @generated
     */
    boolean isSetReferredBySDI();

} // SDO
