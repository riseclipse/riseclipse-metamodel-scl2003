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
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getBay <em>Bay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getGeneralEquipmentContainer <em>General Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getSubstation <em>Substation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getSubFunction <em>Sub Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getGeneralEquipment <em>General Equipment</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFunction_Type()
     * @model unsettable="true"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>Bay</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bay</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bay</em>' container reference.
     * @see #setBay(Bay)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFunction_Bay()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getFunction
     * @model opposite="Function" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Bay getBay();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getBay <em>Bay</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bay</em>' container reference.
     * @see #getBay()
     * @generated
     */
    void setBay( Bay value );

    /**
     * Returns the value of the '<em><b>Conducting Equipment</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conducting Equipment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conducting Equipment</em>' containment reference list.
     * @see #isSetConductingEquipment()
     * @see #unsetConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFunction_ConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getFunction
     * @model opposite="Function" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<ConductingEquipment> getConductingEquipment();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getConductingEquipment <em>Conducting Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConductingEquipment()
     * @see #getConductingEquipment()
     * @generated
     */
    void unsetConductingEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getConductingEquipment <em>Conducting Equipment</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Conducting Equipment</em>' containment reference list is set.
     * @see #unsetConductingEquipment()
     * @see #getConductingEquipment()
     * @generated
     */
    boolean isSetConductingEquipment();

    /**
     * Returns the value of the '<em><b>General Equipment Container</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>General Equipment Container</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>General Equipment Container</em>' container reference.
     * @see #setGeneralEquipmentContainer(GeneralEquipmentContainer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFunction_GeneralEquipmentContainer()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer#getFunction
     * @model opposite="Function" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    GeneralEquipmentContainer getGeneralEquipmentContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getGeneralEquipmentContainer <em>General Equipment Container</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>General Equipment Container</em>' container reference.
     * @see #getGeneralEquipmentContainer()
     * @generated
     */
    void setGeneralEquipmentContainer( GeneralEquipmentContainer value );

    /**
     * Returns the value of the '<em><b>Substation</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Substation</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Substation</em>' container reference.
     * @see #setSubstation(Substation)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFunction_Substation()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getFunction
     * @model opposite="Function" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Substation getSubstation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getSubstation <em>Substation</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Substation</em>' container reference.
     * @see #getSubstation()
     * @generated
     */
    void setSubstation( Substation value );

    /**
     * Returns the value of the '<em><b>Voltage Level</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Voltage Level</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Voltage Level</em>' container reference.
     * @see #setVoltageLevel(VoltageLevel)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFunction_VoltageLevel()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getFunction
     * @model opposite="Function" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    VoltageLevel getVoltageLevel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getVoltageLevel <em>Voltage Level</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Level</em>' container reference.
     * @see #getVoltageLevel()
     * @generated
     */
    void setVoltageLevel( VoltageLevel value );

    /**
     * Returns the value of the '<em><b>Sub Function</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Function</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Function</em>' containment reference list.
     * @see #isSetSubFunction()
     * @see #unsetSubFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFunction_SubFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getFunction
     * @model opposite="Function" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<SubFunction> getSubFunction();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getSubFunction <em>Sub Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubFunction()
     * @see #getSubFunction()
     * @generated
     */
    void unsetSubFunction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getSubFunction <em>Sub Function</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sub Function</em>' containment reference list is set.
     * @see #unsetSubFunction()
     * @see #getSubFunction()
     * @generated
     */
    boolean isSetSubFunction();

    /**
     * Returns the value of the '<em><b>General Equipment</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>General Equipment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>General Equipment</em>' containment reference list.
     * @see #isSetGeneralEquipment()
     * @see #unsetGeneralEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFunction_GeneralEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getFunction
     * @model opposite="Function" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<GeneralEquipment> getGeneralEquipment();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getGeneralEquipment <em>General Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGeneralEquipment()
     * @see #getGeneralEquipment()
     * @generated
     */
    void unsetGeneralEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getGeneralEquipment <em>General Equipment</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>General Equipment</em>' containment reference list is set.
     * @see #unsetGeneralEquipment()
     * @see #getGeneralEquipment()
     * @generated
     */
    boolean isSetGeneralEquipment();

} // Function
