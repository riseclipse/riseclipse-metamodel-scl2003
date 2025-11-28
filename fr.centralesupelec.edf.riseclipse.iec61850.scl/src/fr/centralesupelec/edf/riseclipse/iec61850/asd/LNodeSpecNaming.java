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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LNode Spec Naming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LNode identification specification. This is the intended value of the user to be kept even after implementation of the LNode by a real LN in case of a non flexible Device with a different representation of the LN hierarchy
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSIedName <em>SIed Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSLdInst <em>SLd Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSLnClass <em>SLn Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSLnInst <em>SLn Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSPrefix <em>SPrefix</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeSpecNaming()
 * @model extendedMetaData="name='LNodeSpecNaming' kind='elementOnly'"
 * @generated
 */
public interface LNodeSpecNaming extends BaseExtensionElement {
    /**
     * Returns the value of the '<em><b>SIed Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>SIed Name</em>' attribute.
     * @see #setSIedName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeSpecNaming_SIedName()
     * @model extendedMetaData="kind='attribute' name='sIedName'"
     * @generated
     */
    String getSIedName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSIedName <em>SIed Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SIed Name</em>' attribute.
     * @see #getSIedName()
     * @generated
     */
    void setSIedName( String value );

    /**
     * Returns the value of the '<em><b>SLd Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>SLd Inst</em>' attribute.
     * @see #setSLdInst(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeSpecNaming_SLdInst()
     * @model extendedMetaData="kind='attribute' name='sLdInst'"
     * @generated
     */
    String getSLdInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSLdInst <em>SLd Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SLd Inst</em>' attribute.
     * @see #getSLdInst()
     * @generated
     */
    void setSLdInst( String value );

    /**
     * Returns the value of the '<em><b>SLn Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>SLn Class</em>' attribute.
     * @see #setSLnClass(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeSpecNaming_SLnClass()
     * @model extendedMetaData="kind='attribute' name='sLnClass'"
     * @generated
     */
    String getSLnClass();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSLnClass <em>SLn Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SLn Class</em>' attribute.
     * @see #getSLnClass()
     * @generated
     */
    void setSLnClass( String value );

    /**
     * Returns the value of the '<em><b>SLn Inst</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>SLn Inst</em>' attribute.
     * @see #isSetSLnInst()
     * @see #unsetSLnInst()
     * @see #setSLnInst(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeSpecNaming_SLnInst()
     * @model default="" unique="false" unsettable="true"
     *        extendedMetaData="kind='attribute' name='sLnInst'"
     * @generated
     */
    String getSLnInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSLnInst <em>SLn Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SLn Inst</em>' attribute.
     * @see #isSetSLnInst()
     * @see #unsetSLnInst()
     * @see #getSLnInst()
     * @generated
     */
    void setSLnInst( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSLnInst <em>SLn Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSLnInst()
     * @see #getSLnInst()
     * @see #setSLnInst(String)
     * @generated
     */
    void unsetSLnInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSLnInst <em>SLn Inst</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SLn Inst</em>' attribute is set.
     * @see #unsetSLnInst()
     * @see #getSLnInst()
     * @see #setSLnInst(String)
     * @generated
     */
    boolean isSetSLnInst();

    /**
     * Returns the value of the '<em><b>SPrefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>SPrefix</em>' attribute.
     * @see #setSPrefix(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeSpecNaming_SPrefix()
     * @model extendedMetaData="kind='attribute' name='sPrefix'"
     * @generated
     */
    String getSPrefix();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSPrefix <em>SPrefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SPrefix</em>' attribute.
     * @see #getSPrefix()
     * @generated
     */
    void setSPrefix( String value );

} // LNodeSpecNaming
