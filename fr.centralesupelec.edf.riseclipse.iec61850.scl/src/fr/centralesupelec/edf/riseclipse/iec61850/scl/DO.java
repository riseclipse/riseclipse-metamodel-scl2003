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
 * A representation of the model object '<em><b>DO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getTransient <em>Transient</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getParentLNodeType <em>Parent LNode Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getReferredByDOI <em>Referred By DOI</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDO()
 * @model
 * @generated
 */
public interface DO extends AbstractDataObject, INamespaceGetter {
    /**
     * Returns the value of the '<em><b>Transient</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transient</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transient</em>' attribute.
     * @see #isSetTransient()
     * @see #unsetTransient()
     * @see #setTransient(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDO_Transient()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getTransient();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getTransient <em>Transient</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transient</em>' attribute.
     * @see #isSetTransient()
     * @see #unsetTransient()
     * @see #getTransient()
     * @generated
     */
    void setTransient( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getTransient <em>Transient</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetTransient()
     * @see #getTransient()
     * @see #setTransient(Boolean)
     * @generated
     */
    void unsetTransient();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getTransient <em>Transient</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transient</em>' attribute is set.
     * @see #unsetTransient()
     * @see #getTransient()
     * @see #setTransient(Boolean)
     * @generated
     */
    boolean isSetTransient();

    /**
     * Returns the value of the '<em><b>Parent LNode Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getDO <em>DO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent LNode Type</em>' container reference.
     * @see #setParentLNodeType(LNodeType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDO_ParentLNodeType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getDO
     * @model opposite="DO" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    LNodeType getParentLNodeType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getParentLNodeType <em>Parent LNode Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent LNode Type</em>' container reference.
     * @see #getParentLNodeType()
     * @generated
     */
    void setParentLNodeType( LNodeType value );

    /**
     * Returns the value of the '<em><b>Access Control</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Access Control</em>' attribute.
     * @see #isSetAccessControl()
     * @see #unsetAccessControl()
     * @see #setAccessControl(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDO_AccessControl()
     * @model unsettable="true"
     * @generated
     */
    String getAccessControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getAccessControl <em>Access Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Access Control</em>' attribute.
     * @see #isSetAccessControl()
     * @see #unsetAccessControl()
     * @see #getAccessControl()
     * @generated
     */
    void setAccessControl( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getAccessControl <em>Access Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccessControl()
     * @see #getAccessControl()
     * @see #setAccessControl(String)
     * @generated
     */
    void unsetAccessControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getAccessControl <em>Access Control</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Access Control</em>' attribute is set.
     * @see #unsetAccessControl()
     * @see #getAccessControl()
     * @see #setAccessControl(String)
     * @generated
     */
    boolean isSetAccessControl();

    /**
     * Returns the value of the '<em><b>Referred By DOI</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getRefersToDO <em>Refers To DO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By DOI</em>' reference list.
     * @see #isSetReferredByDOI()
     * @see #unsetReferredByDOI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDO_ReferredByDOI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getRefersToDO
     * @model opposite="RefersToDO" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< DOI > getReferredByDOI();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getReferredByDOI <em>Referred By DOI</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByDOI()
     * @see #getReferredByDOI()
     * @generated
     */
    void unsetReferredByDOI();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getReferredByDOI <em>Referred By DOI</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By DOI</em>' reference list is set.
     * @see #unsetReferredByDOI()
     * @see #getReferredByDOI()
     * @generated
     */
    boolean isSetReferredByDOI();

} // DO
