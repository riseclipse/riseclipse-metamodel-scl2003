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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getParentServices <em>Parent Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getGoose <em>Goose</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getRGOOSE <em>RGOOSE</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGOOSE()
 * @model
 * @generated
 */
public interface GOOSE extends ServiceWithMax {
    /**
     * Returns the value of the '<em><b>Fixed Offs</b></em>' attribute.
     * The default value is <code>"false"</code>.
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
     * @model default="false" unsettable="true"
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
     * Returns the value of the '<em><b>Parent Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGOOSE <em>GOOSE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Services</em>' container reference.
     * @see #setParentServices(Services)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGOOSE_ParentServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGOOSE
     * @model opposite="GOOSE" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Services getParentServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getParentServices <em>Parent Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Services</em>' container reference.
     * @see #getParentServices()
     * @generated
     */
    void setParentServices( Services value );

    /**
     * Returns the value of the '<em><b>Goose</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Goose</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Goose</em>' attribute.
     * @see #isSetGoose()
     * @see #unsetGoose()
     * @see #setGoose(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGOOSE_Goose()
     * @model default="true" unsettable="true"
     * @generated
     */
    Boolean getGoose();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getGoose <em>Goose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Goose</em>' attribute.
     * @see #isSetGoose()
     * @see #unsetGoose()
     * @see #getGoose()
     * @generated
     */
    void setGoose( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getGoose <em>Goose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGoose()
     * @see #getGoose()
     * @see #setGoose(Boolean)
     * @generated
     */
    void unsetGoose();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getGoose <em>Goose</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Goose</em>' attribute is set.
     * @see #unsetGoose()
     * @see #getGoose()
     * @see #setGoose(Boolean)
     * @generated
     */
    boolean isSetGoose();

    /**
     * Returns the value of the '<em><b>RGOOSE</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RGOOSE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RGOOSE</em>' attribute.
     * @see #isSetRGOOSE()
     * @see #unsetRGOOSE()
     * @see #setRGOOSE(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGOOSE_RGOOSE()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getRGOOSE();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getRGOOSE <em>RGOOSE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RGOOSE</em>' attribute.
     * @see #isSetRGOOSE()
     * @see #unsetRGOOSE()
     * @see #getRGOOSE()
     * @generated
     */
    void setRGOOSE( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getRGOOSE <em>RGOOSE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRGOOSE()
     * @see #getRGOOSE()
     * @see #setRGOOSE(Boolean)
     * @generated
     */
    void unsetRGOOSE();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getRGOOSE <em>RGOOSE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>RGOOSE</em>' attribute is set.
     * @see #unsetRGOOSE()
     * @see #getRGOOSE()
     * @see #setRGOOSE(Boolean)
     * @generated
     */
    boolean isSetRGOOSE();

} // GOOSE
