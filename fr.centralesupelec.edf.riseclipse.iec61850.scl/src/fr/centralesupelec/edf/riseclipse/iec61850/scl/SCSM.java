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
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SCSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCSM#isIec61850_8_1 <em>Iec61850 81</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCSM#isIec61850_8_2 <em>Iec61850 82</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCSM#isServerAssociationInitiation <em>Server Association Initiation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCSM#getParentServices <em>Parent Services</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSCSM()
 * @model
 * @generated
 */
public interface SCSM extends ServiceYesNo {
    /**
     * Returns the value of the '<em><b>Iec61850 81</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Iec61850 81</em>' attribute.
     * @see #isSetIec61850_8_1()
     * @see #unsetIec61850_8_1()
     * @see #setIec61850_8_1(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSCSM_Iec61850_8_1()
     * @model default="true" unsettable="true"
     * @generated
     */
    boolean isIec61850_8_1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCSM#isIec61850_8_1 <em>Iec61850 81</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Iec61850 81</em>' attribute.
     * @see #isSetIec61850_8_1()
     * @see #unsetIec61850_8_1()
     * @see #isIec61850_8_1()
     * @generated
     */
    void setIec61850_8_1( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCSM#isIec61850_8_1 <em>Iec61850 81</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIec61850_8_1()
     * @see #isIec61850_8_1()
     * @see #setIec61850_8_1(boolean)
     * @generated
     */
    void unsetIec61850_8_1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCSM#isIec61850_8_1 <em>Iec61850 81</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Iec61850 81</em>' attribute is set.
     * @see #unsetIec61850_8_1()
     * @see #isIec61850_8_1()
     * @see #setIec61850_8_1(boolean)
     * @generated
     */
    boolean isSetIec61850_8_1();

    /**
     * Returns the value of the '<em><b>Iec61850 82</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Iec61850 82</em>' attribute.
     * @see #isSetIec61850_8_2()
     * @see #unsetIec61850_8_2()
     * @see #setIec61850_8_2(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSCSM_Iec61850_8_2()
     * @model default="false" unsettable="true"
     * @generated
     */
    boolean isIec61850_8_2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCSM#isIec61850_8_2 <em>Iec61850 82</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Iec61850 82</em>' attribute.
     * @see #isSetIec61850_8_2()
     * @see #unsetIec61850_8_2()
     * @see #isIec61850_8_2()
     * @generated
     */
    void setIec61850_8_2( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCSM#isIec61850_8_2 <em>Iec61850 82</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIec61850_8_2()
     * @see #isIec61850_8_2()
     * @see #setIec61850_8_2(boolean)
     * @generated
     */
    void unsetIec61850_8_2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCSM#isIec61850_8_2 <em>Iec61850 82</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Iec61850 82</em>' attribute is set.
     * @see #unsetIec61850_8_2()
     * @see #isIec61850_8_2()
     * @see #setIec61850_8_2(boolean)
     * @generated
     */
    boolean isSetIec61850_8_2();

    /**
     * Returns the value of the '<em><b>Server Association Initiation</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Server Association Initiation</em>' attribute.
     * @see #isSetServerAssociationInitiation()
     * @see #unsetServerAssociationInitiation()
     * @see #setServerAssociationInitiation(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSCSM_ServerAssociationInitiation()
     * @model default="false" unsettable="true"
     * @generated
     */
    boolean isServerAssociationInitiation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCSM#isServerAssociationInitiation <em>Server Association Initiation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Server Association Initiation</em>' attribute.
     * @see #isSetServerAssociationInitiation()
     * @see #unsetServerAssociationInitiation()
     * @see #isServerAssociationInitiation()
     * @generated
     */
    void setServerAssociationInitiation( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCSM#isServerAssociationInitiation <em>Server Association Initiation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServerAssociationInitiation()
     * @see #isServerAssociationInitiation()
     * @see #setServerAssociationInitiation(boolean)
     * @generated
     */
    void unsetServerAssociationInitiation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCSM#isServerAssociationInitiation <em>Server Association Initiation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Server Association Initiation</em>' attribute is set.
     * @see #unsetServerAssociationInitiation()
     * @see #isServerAssociationInitiation()
     * @see #setServerAssociationInitiation(boolean)
     * @generated
     */
    boolean isSetServerAssociationInitiation();

    /**
     * Returns the value of the '<em><b>Parent Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSCSM <em>SCSM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Services</em>' container reference.
     * @see #setParentServices(Services)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSCSM_ParentServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSCSM
     * @model opposite="SCSM"
     * @generated
     */
    Services getParentServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCSM#getParentServices <em>Parent Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Services</em>' container reference.
     * @see #getParentServices()
     * @generated
     */
    void setParentServices( Services value );

} // SCSM
