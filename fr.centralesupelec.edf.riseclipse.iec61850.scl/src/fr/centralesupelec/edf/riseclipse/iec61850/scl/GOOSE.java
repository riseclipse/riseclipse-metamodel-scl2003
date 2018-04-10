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
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GOOSE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getFixedOffs <em>Fixed Offs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGOOSE()
 * @model
 * @generated
 */
public interface GOOSE extends ServiceWithMax {
    /**
     * Returns the value of the '<em><b>Fixed Offs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fixed Offs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fixed Offs</em>' attribute.
     * @see #isSetFixedOffs()
     * @see #unsetFixedOffs()
     * @see #setFixedOffs(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGOOSE_FixedOffs()
     * @model unsettable="true"
     * @generated
     */
    Boolean getFixedOffs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getFixedOffs <em>Fixed Offs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fixed Offs</em>' attribute.
     * @see #isSetFixedOffs()
     * @see #unsetFixedOffs()
     * @see #getFixedOffs()
     * @generated
     */
    void setFixedOffs( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getFixedOffs <em>Fixed Offs</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetFixedOffs()
     * @see #getFixedOffs()
     * @see #setFixedOffs(Boolean)
     * @generated
     */
    void unsetFixedOffs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getFixedOffs <em>Fixed Offs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fixed Offs</em>' attribute is set.
     * @see #unsetFixedOffs()
     * @see #getFixedOffs()
     * @see #setFixedOffs(Boolean)
     * @generated
     */
    boolean isSetFixedOffs();

    /**
     * Returns the value of the '<em><b>Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGOOSE <em>GOOSE</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Services</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Services</em>' container reference.
     * @see #setServices(Services)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGOOSE_Services()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGOOSE
     * @model opposite="GOOSE" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Services getServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getServices <em>Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Services</em>' container reference.
     * @see #getServices()
     * @generated
     */
    void setServices( Services value );

} // GOOSE
