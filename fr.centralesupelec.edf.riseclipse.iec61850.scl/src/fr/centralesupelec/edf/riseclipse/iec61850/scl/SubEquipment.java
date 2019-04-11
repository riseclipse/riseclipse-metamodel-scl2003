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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getPhase <em>Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getAbstractConductingEquipment <em>Abstract Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getEqFunction <em>Eq Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getPowerTransformer <em>Power Transformer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getTapChanger <em>Tap Changer</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubEquipment()
 * @model
 * @generated
 */
public interface SubEquipment extends PowerSystemResource, AgVirtual {
    /**
     * Returns the value of the '<em><b>Phase</b></em>' attribute.
     * The default value is <code>"none"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PhaseEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PhaseEnum
     * @see #isSetPhase()
     * @see #unsetPhase()
     * @see #setPhase(PhaseEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubEquipment_Phase()
     * @model default="none" unsettable="true"
     * @generated
     */
    PhaseEnum getPhase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getPhase <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PhaseEnum
     * @see #isSetPhase()
     * @see #unsetPhase()
     * @see #getPhase()
     * @generated
     */
    void setPhase( PhaseEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getPhase <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhase()
     * @see #getPhase()
     * @see #setPhase(PhaseEnum)
     * @generated
     */
    void unsetPhase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getPhase <em>Phase</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase</em>' attribute is set.
     * @see #unsetPhase()
     * @see #getPhase()
     * @see #setPhase(PhaseEnum)
     * @generated
     */
    boolean isSetPhase();

    /**
     * Returns the value of the '<em><b>Abstract Conducting Equipment</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment#getSubEquipment <em>Sub Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abstract Conducting Equipment</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abstract Conducting Equipment</em>' container reference.
     * @see #setAbstractConductingEquipment(AbstractConductingEquipment)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubEquipment_AbstractConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment#getSubEquipment
     * @model opposite="SubEquipment" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    AbstractConductingEquipment getAbstractConductingEquipment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getAbstractConductingEquipment <em>Abstract Conducting Equipment</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abstract Conducting Equipment</em>' container reference.
     * @see #getAbstractConductingEquipment()
     * @generated
     */
    void setAbstractConductingEquipment( AbstractConductingEquipment value );

    /**
     * Returns the value of the '<em><b>Eq Function</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getSubEquipment <em>Sub Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Eq Function</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Eq Function</em>' containment reference list.
     * @see #isSetEqFunction()
     * @see #unsetEqFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubEquipment_EqFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getSubEquipment
     * @model opposite="SubEquipment" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<EqFunction> getEqFunction();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getEqFunction <em>Eq Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEqFunction()
     * @see #getEqFunction()
     * @generated
     */
    void unsetEqFunction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getEqFunction <em>Eq Function</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eq Function</em>' containment reference list is set.
     * @see #unsetEqFunction()
     * @see #getEqFunction()
     * @generated
     */
    boolean isSetEqFunction();

    /**
     * Returns the value of the '<em><b>Power Transformer</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getSubEquipment <em>Sub Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power Transformer</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power Transformer</em>' container reference.
     * @see #setPowerTransformer(PowerTransformer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubEquipment_PowerTransformer()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getSubEquipment
     * @model opposite="SubEquipment" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    PowerTransformer getPowerTransformer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getPowerTransformer <em>Power Transformer</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power Transformer</em>' container reference.
     * @see #getPowerTransformer()
     * @generated
     */
    void setPowerTransformer( PowerTransformer value );

    /**
     * Returns the value of the '<em><b>Tap Changer</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getSubEquipment <em>Sub Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tap Changer</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tap Changer</em>' container reference.
     * @see #setTapChanger(TapChanger)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubEquipment_TapChanger()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getSubEquipment
     * @model opposite="SubEquipment" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    TapChanger getTapChanger();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getTapChanger <em>Tap Changer</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tap Changer</em>' container reference.
     * @see #getTapChanger()
     * @generated
     */
    void setTapChanger( TapChanger value );

} // SubEquipment
