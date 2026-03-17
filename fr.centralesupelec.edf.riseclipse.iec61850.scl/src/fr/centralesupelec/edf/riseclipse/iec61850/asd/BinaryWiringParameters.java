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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Wiring Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Binary wiring parameters for service specification
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getDebTm <em>Deb Tm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#isFastOutput <em>Fast Output</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutNam <em>Out Nam</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutOffDl <em>Out Off Dl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutOnDl <em>Out On Dl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutRef <em>Out Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutTyp <em>Out Typ</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getVInOff <em>VIn Off</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getVInOn <em>VIn On</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getReferredByBinaryWiringParametersRef <em>Referred By Binary Wiring Parameters Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBinaryWiringParameters()
 * @model
 * @generated
 */
public interface BinaryWiringParameters extends WiringParameters {
    /**
     * Returns the value of the '<em><b>Deb Tm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Debounce Time to use in LPDI (in ms)
     * <!-- end-model-doc -->
     * @return the value of the '<em>Deb Tm</em>' attribute.
     * @see #setDebTm(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBinaryWiringParameters_DebTm()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
     *        extendedMetaData="kind='attribute' name='debTm'"
     * @generated
     */
    BigInteger getDebTm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getDebTm <em>Deb Tm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deb Tm</em>' attribute.
     * @see #getDebTm()
     * @generated
     */
    void setDebTm( BigInteger value );

    /**
     * Returns the value of the '<em><b>Fast Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates if the output needs to be a fast output in LPDO
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fast Output</em>' attribute.
     * @see #isSetFastOutput()
     * @see #unsetFastOutput()
     * @see #setFastOutput(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBinaryWiringParameters_FastOutput()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='fastOutput'"
     * @generated
     */
    boolean isFastOutput();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#isFastOutput <em>Fast Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fast Output</em>' attribute.
     * @see #isSetFastOutput()
     * @see #unsetFastOutput()
     * @see #isFastOutput()
     * @generated
     */
    void setFastOutput( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#isFastOutput <em>Fast Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFastOutput()
     * @see #isFastOutput()
     * @see #setFastOutput(boolean)
     * @generated
     */
    void unsetFastOutput();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#isFastOutput <em>Fast Output</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fast Output</em>' attribute is set.
     * @see #unsetFastOutput()
     * @see #isFastOutput()
     * @see #setFastOutput(boolean)
     * @generated
     */
    boolean isSetFastOutput();

    /**
     * Returns the value of the '<em><b>Out Nam</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Label text of the output to use in LPDO
     * <!-- end-model-doc -->
     * @return the value of the '<em>Out Nam</em>' attribute.
     * @see #setOutNam(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBinaryWiringParameters_OutNam()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='outNam'"
     * @generated
     */
    String getOutNam();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutNam <em>Out Nam</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Out Nam</em>' attribute.
     * @see #getOutNam()
     * @generated
     */
    void setOutNam( String value );

    /**
     * Returns the value of the '<em><b>Out Off Dl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Delay of the output (drop-off) to use in LPDO
     * <!-- end-model-doc -->
     * @return the value of the '<em>Out Off Dl</em>' attribute.
     * @see #isSetOutOffDl()
     * @see #unsetOutOffDl()
     * @see #setOutOffDl(float)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBinaryWiringParameters_OutOffDl()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
     *        extendedMetaData="kind='attribute' name='outOffDl'"
     * @generated
     */
    float getOutOffDl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutOffDl <em>Out Off Dl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Out Off Dl</em>' attribute.
     * @see #isSetOutOffDl()
     * @see #unsetOutOffDl()
     * @see #getOutOffDl()
     * @generated
     */
    void setOutOffDl( float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutOffDl <em>Out Off Dl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutOffDl()
     * @see #getOutOffDl()
     * @see #setOutOffDl(float)
     * @generated
     */
    void unsetOutOffDl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutOffDl <em>Out Off Dl</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Out Off Dl</em>' attribute is set.
     * @see #unsetOutOffDl()
     * @see #getOutOffDl()
     * @see #setOutOffDl(float)
     * @generated
     */
    boolean isSetOutOffDl();

    /**
     * Returns the value of the '<em><b>Out On Dl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Delay of the output (pick-up) to use in LPDO
     * <!-- end-model-doc -->
     * @return the value of the '<em>Out On Dl</em>' attribute.
     * @see #isSetOutOnDl()
     * @see #unsetOutOnDl()
     * @see #setOutOnDl(float)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBinaryWiringParameters_OutOnDl()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
     *        extendedMetaData="kind='attribute' name='outOnDl'"
     * @generated
     */
    float getOutOnDl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutOnDl <em>Out On Dl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Out On Dl</em>' attribute.
     * @see #isSetOutOnDl()
     * @see #unsetOutOnDl()
     * @see #getOutOnDl()
     * @generated
     */
    void setOutOnDl( float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutOnDl <em>Out On Dl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutOnDl()
     * @see #getOutOnDl()
     * @see #setOutOnDl(float)
     * @generated
     */
    void unsetOutOnDl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutOnDl <em>Out On Dl</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Out On Dl</em>' attribute is set.
     * @see #unsetOutOnDl()
     * @see #getOutOnDl()
     * @see #setOutOnDl(float)
     * @generated
     */
    boolean isSetOutOnDl();

    /**
     * Returns the value of the '<em><b>Out Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference of the output to use in LPDO
     * <!-- end-model-doc -->
     * @return the value of the '<em>Out Ref</em>' attribute.
     * @see #setOutRef(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBinaryWiringParameters_OutRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='outRef'"
     * @generated
     */
    String getOutRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutRef <em>Out Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Out Ref</em>' attribute.
     * @see #getOutRef()
     * @generated
     */
    void setOutRef( String value );

    /**
     * Returns the value of the '<em><b>Out Typ</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutTypEnum}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Physical output type to use in LPDO
     * <!-- end-model-doc -->
     * @return the value of the '<em>Out Typ</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.OutTypEnum
     * @see #isSetOutTyp()
     * @see #unsetOutTyp()
     * @see #setOutTyp(OutTypEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBinaryWiringParameters_OutTyp()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='outTyp'"
     * @generated
     */
    OutTypEnum getOutTyp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutTyp <em>Out Typ</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Out Typ</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.OutTypEnum
     * @see #isSetOutTyp()
     * @see #unsetOutTyp()
     * @see #getOutTyp()
     * @generated
     */
    void setOutTyp( OutTypEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutTyp <em>Out Typ</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutTyp()
     * @see #getOutTyp()
     * @see #setOutTyp(OutTypEnum)
     * @generated
     */
    void unsetOutTyp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutTyp <em>Out Typ</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Out Typ</em>' attribute is set.
     * @see #unsetOutTyp()
     * @see #getOutTyp()
     * @see #setOutTyp(OutTypEnum)
     * @generated
     */
    boolean isSetOutTyp();

    /**
     * Returns the value of the '<em><b>VIn Off</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Drop-off voltage to use in LPDI
     * <!-- end-model-doc -->
     * @return the value of the '<em>VIn Off</em>' attribute.
     * @see #isSetVInOff()
     * @see #unsetVInOff()
     * @see #setVInOff(float)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBinaryWiringParameters_VInOff()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
     *        extendedMetaData="kind='attribute' name='vInOff'"
     * @generated
     */
    float getVInOff();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getVInOff <em>VIn Off</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VIn Off</em>' attribute.
     * @see #isSetVInOff()
     * @see #unsetVInOff()
     * @see #getVInOff()
     * @generated
     */
    void setVInOff( float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getVInOff <em>VIn Off</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVInOff()
     * @see #getVInOff()
     * @see #setVInOff(float)
     * @generated
     */
    void unsetVInOff();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getVInOff <em>VIn Off</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>VIn Off</em>' attribute is set.
     * @see #unsetVInOff()
     * @see #getVInOff()
     * @see #setVInOff(float)
     * @generated
     */
    boolean isSetVInOff();

    /**
     * Returns the value of the '<em><b>VIn On</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pick-up voltage to use in LPDI
     * <!-- end-model-doc -->
     * @return the value of the '<em>VIn On</em>' attribute.
     * @see #isSetVInOn()
     * @see #unsetVInOn()
     * @see #setVInOn(float)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBinaryWiringParameters_VInOn()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
     *        extendedMetaData="kind='attribute' name='vInOn'"
     * @generated
     */
    float getVInOn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getVInOn <em>VIn On</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VIn On</em>' attribute.
     * @see #isSetVInOn()
     * @see #unsetVInOn()
     * @see #getVInOn()
     * @generated
     */
    void setVInOn( float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getVInOn <em>VIn On</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVInOn()
     * @see #getVInOn()
     * @see #setVInOn(float)
     * @generated
     */
    void unsetVInOn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getVInOn <em>VIn On</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>VIn On</em>' attribute is set.
     * @see #unsetVInOn()
     * @see #getVInOn()
     * @see #setVInOn(float)
     * @generated
     */
    boolean isSetVInOn();

    /**
     * Returns the value of the '<em><b>Parent Service Specifications</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getBinaryWiringParameters <em>Binary Wiring Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Service Specifications</em>' container reference.
     * @see #setParentServiceSpecifications(ServiceSpecifications)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBinaryWiringParameters_ParentServiceSpecifications()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getBinaryWiringParameters
     * @model opposite="BinaryWiringParameters" unsettable="true" ordered="false"
     * @generated
     */
    ServiceSpecifications getParentServiceSpecifications();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Service Specifications</em>' container reference.
     * @see #getParentServiceSpecifications()
     * @generated
     */
    void setParentServiceSpecifications( ServiceSpecifications value );

    /**
     * Returns the value of the '<em><b>Referred By Binary Wiring Parameters Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getRefersToBinaryWiringParameters <em>Refers To Binary Wiring Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Binary Wiring Parameters Ref</em>' reference list.
     * @see #isSetReferredByBinaryWiringParametersRef()
     * @see #unsetReferredByBinaryWiringParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBinaryWiringParameters_ReferredByBinaryWiringParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getRefersToBinaryWiringParameters
     * @model opposite="RefersToBinaryWiringParameters" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< BinaryWiringParametersRef > getReferredByBinaryWiringParametersRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getReferredByBinaryWiringParametersRef <em>Referred By Binary Wiring Parameters Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByBinaryWiringParametersRef()
     * @see #getReferredByBinaryWiringParametersRef()
     * @generated
     */
    void unsetReferredByBinaryWiringParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getReferredByBinaryWiringParametersRef <em>Referred By Binary Wiring Parameters Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Binary Wiring Parameters Ref</em>' reference list is set.
     * @see #unsetReferredByBinaryWiringParametersRef()
     * @see #getReferredByBinaryWiringParametersRef()
     * @generated
     */
    boolean isSetReferredByBinaryWiringParametersRef();

} // BinaryWiringParameters
