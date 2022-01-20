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
 * A representation of the model object '<em><b>DOI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getIx <em>Ix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getParentAnyLN <em>Parent Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getDAI <em>DAI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getSDI <em>SDI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getRefersToDO <em>Refers To DO</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOI()
 * @model
 * @generated
 */
public interface DOI extends UnNaming, INamespaceGetter {
    /**
     * Returns the value of the '<em><b>Ix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ix</em>' attribute.
     * @see #isSetIx()
     * @see #unsetIx()
     * @see #setIx(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOI_Ix()
     * @model unsettable="true"
     * @generated
     */
    Integer getIx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getIx <em>Ix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ix</em>' attribute.
     * @see #isSetIx()
     * @see #unsetIx()
     * @see #getIx()
     * @generated
     */
    void setIx( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getIx <em>Ix</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetIx()
     * @see #getIx()
     * @see #setIx(Integer)
     * @generated
     */
    void unsetIx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getIx <em>Ix</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ix</em>' attribute is set.
     * @see #unsetIx()
     * @see #getIx()
     * @see #setIx(Integer)
     * @generated
     */
    boolean isSetIx();

    /**
     * Returns the value of the '<em><b>Parent Any LN</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getDOI <em>DOI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Any LN</em>' container reference.
     * @see #setParentAnyLN(AnyLN)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOI_ParentAnyLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getDOI
     * @model opposite="DOI" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    AnyLN getParentAnyLN();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getParentAnyLN <em>Parent Any LN</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Any LN</em>' container reference.
     * @see #getParentAnyLN()
     * @generated
     */
    void setParentAnyLN( AnyLN value );

    /**
     * Returns the value of the '<em><b>DAI</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getParentDOI <em>Parent DOI</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DAI</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DAI</em>' containment reference list.
     * @see #isSetDAI()
     * @see #unsetDAI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOI_DAI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getParentDOI
     * @model opposite="ParentDOI" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< DAI > getDAI();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getDAI <em>DAI</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDAI()
     * @see #getDAI()
     * @generated
     */
    void unsetDAI();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getDAI <em>DAI</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DAI</em>' containment reference list is set.
     * @see #unsetDAI()
     * @see #getDAI()
     * @generated
     */
    boolean isSetDAI();

    /**
     * Returns the value of the '<em><b>SDI</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getParentDOI <em>Parent DOI</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SDI</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SDI</em>' containment reference list.
     * @see #isSetSDI()
     * @see #unsetSDI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOI_SDI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getParentDOI
     * @model opposite="ParentDOI" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< SDI > getSDI();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getSDI <em>SDI</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSDI()
     * @see #getSDI()
     * @generated
     */
    void unsetSDI();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getSDI <em>SDI</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SDI</em>' containment reference list is set.
     * @see #unsetSDI()
     * @see #getSDI()
     * @generated
     */
    boolean isSetSDI();

    /**
     * Returns the value of the '<em><b>Access Control</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Access Control</em>' attribute.
     * @see #isSetAccessControl()
     * @see #unsetAccessControl()
     * @see #setAccessControl(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOI_AccessControl()
     * @model unsettable="true"
     * @generated
     */
    String getAccessControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getAccessControl <em>Access Control</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getAccessControl <em>Access Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccessControl()
     * @see #getAccessControl()
     * @see #setAccessControl(String)
     * @generated
     */
    void unsetAccessControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getAccessControl <em>Access Control</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOI_Name()
     * @model unsettable="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    boolean isSetName();

    /**
     * Returns the value of the '<em><b>Refers To DO</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getReferredByDOI <em>Referred By DOI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To DO</em>' reference.
     * @see #isSetRefersToDO()
     * @see #unsetRefersToDO()
     * @see #setRefersToDO(DO)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOI_RefersToDO()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getReferredByDOI
     * @model opposite="ReferredByDOI" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    DO getRefersToDO();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getRefersToDO <em>Refers To DO</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To DO</em>' reference.
     * @see #isSetRefersToDO()
     * @see #unsetRefersToDO()
     * @see #getRefersToDO()
     * @generated
     */
    void setRefersToDO( DO value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getRefersToDO <em>Refers To DO</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToDO()
     * @see #getRefersToDO()
     * @see #setRefersToDO(DO)
     * @generated
     */
    void unsetRefersToDO();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getRefersToDO <em>Refers To DO</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To DO</em>' reference is set.
     * @see #unsetRefersToDO()
     * @see #getRefersToDO()
     * @see #setRefersToDO(DO)
     * @generated
     */
    boolean isSetRefersToDO();

} // DOI
