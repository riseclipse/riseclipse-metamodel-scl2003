/**
 *  Copyright (c) 2017 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import java.math.BigDecimal;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voltage Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNomFreq <em>Nom Freq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNumPhases <em>Num Phases</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getBay <em>Bay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getSubstation <em>Substation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getTerminal <em>Terminal</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltageLevel()
 * @model
 * @generated
 */
public interface VoltageLevel extends EquipmentContainer {
    /**
	 * Returns the value of the '<em><b>Nom Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nom Freq</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Freq</em>' attribute.
	 * @see #isSetNomFreq()
	 * @see #unsetNomFreq()
	 * @see #setNomFreq(BigDecimal)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltageLevel_NomFreq()
	 * @model unsettable="true"
	 * @generated
	 */
    BigDecimal getNomFreq();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNomFreq <em>Nom Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Freq</em>' attribute.
	 * @see #isSetNomFreq()
	 * @see #unsetNomFreq()
	 * @see #getNomFreq()
	 * @generated
	 */
    void setNomFreq( BigDecimal value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNomFreq <em>Nom Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetNomFreq()
	 * @see #getNomFreq()
	 * @see #setNomFreq(BigDecimal)
	 * @generated
	 */
    void unsetNomFreq();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNomFreq <em>Nom Freq</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nom Freq</em>' attribute is set.
	 * @see #unsetNomFreq()
	 * @see #getNomFreq()
	 * @see #setNomFreq(BigDecimal)
	 * @generated
	 */
    boolean isSetNomFreq();

    /**
	 * Returns the value of the '<em><b>Num Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Num Phases</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Phases</em>' attribute.
	 * @see #isSetNumPhases()
	 * @see #unsetNumPhases()
	 * @see #setNumPhases(Byte)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltageLevel_NumPhases()
	 * @model unsettable="true"
	 * @generated
	 */
    Byte getNumPhases();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNumPhases <em>Num Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Phases</em>' attribute.
	 * @see #isSetNumPhases()
	 * @see #unsetNumPhases()
	 * @see #getNumPhases()
	 * @generated
	 */
    void setNumPhases( Byte value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNumPhases <em>Num Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetNumPhases()
	 * @see #getNumPhases()
	 * @see #setNumPhases(Byte)
	 * @generated
	 */
    void unsetNumPhases();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNumPhases <em>Num Phases</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Num Phases</em>' attribute is set.
	 * @see #unsetNumPhases()
	 * @see #getNumPhases()
	 * @see #setNumPhases(Byte)
	 * @generated
	 */
    boolean isSetNumPhases();

    /**
	 * Returns the value of the '<em><b>Bay</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getVoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bay</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Bay</em>' containment reference list.
	 * @see #isSetBay()
	 * @see #unsetBay()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltageLevel_Bay()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getVoltageLevel
	 * @model opposite="VoltageLevel" containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
    EList<Bay> getBay();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getBay <em>Bay</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetBay()
	 * @see #getBay()
	 * @generated
	 */
    void unsetBay();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getBay <em>Bay</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bay</em>' containment reference list is set.
	 * @see #unsetBay()
	 * @see #getBay()
	 * @generated
	 */
    boolean isSetBay();

    /**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getVoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see #isSetFunction()
	 * @see #unsetFunction()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltageLevel_Function()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getVoltageLevel
	 * @model opposite="VoltageLevel" containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
    EList<Function> getFunction();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getFunction <em>Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetFunction()
	 * @see #getFunction()
	 * @generated
	 */
    void unsetFunction();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getFunction <em>Function</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Function</em>' containment reference list is set.
	 * @see #unsetFunction()
	 * @see #getFunction()
	 * @generated
	 */
    boolean isSetFunction();

    /**
	 * Returns the value of the '<em><b>Substation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getVoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Substation</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Substation</em>' container reference.
	 * @see #setSubstation(Substation)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltageLevel_Substation()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getVoltageLevel
	 * @model opposite="VoltageLevel" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    Substation getSubstation();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getSubstation <em>Substation</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substation</em>' container reference.
	 * @see #getSubstation()
	 * @generated
	 */
    void setSubstation( Substation value );

    /**
	 * Returns the value of the '<em><b>Voltage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Voltage</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage</em>' containment reference.
	 * @see #isSetVoltage()
	 * @see #unsetVoltage()
	 * @see #setVoltage(Voltage)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltageLevel_Voltage()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
    Voltage getVoltage();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getVoltage <em>Voltage</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage</em>' containment reference.
	 * @see #isSetVoltage()
	 * @see #unsetVoltage()
	 * @see #getVoltage()
	 * @generated
	 */
    void setVoltage( Voltage value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getVoltage <em>Voltage</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetVoltage()
	 * @see #getVoltage()
	 * @see #setVoltage(Voltage)
	 * @generated
	 */
    void unsetVoltage();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getVoltage <em>Voltage</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Voltage</em>' containment reference is set.
	 * @see #unsetVoltage()
	 * @see #getVoltage()
	 * @see #setVoltage(Voltage)
	 * @generated
	 */
    boolean isSetVoltage();

    /**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getVoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Terminal</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference list.
	 * @see #isSetTerminal()
	 * @see #unsetTerminal()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltageLevel_Terminal()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getVoltageLevel
	 * @model opposite="VoltageLevel" resolveProxies="false" unsettable="true" transient="true" ordered="false"
	 * @generated
	 */
    EList<Terminal> getTerminal();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getTerminal <em>Terminal</em>}' reference list.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetTerminal()
	 * @see #getTerminal()
	 * @generated
	 */
    void unsetTerminal();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getTerminal <em>Terminal</em>}' reference list is set.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Terminal</em>' reference list is set.
	 * @see #unsetTerminal()
	 * @see #getTerminal()
	 * @generated
	 */
    boolean isSetTerminal();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VoltageLevel_nomFreq_value'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'nomFreq attribute shall a positive decimal in VoltageLevel (line \' + self.lineNumber.toString() + \').\'\n            + \'Current value is \' + self.nomFreq.toString()\n        ,\n\tstatus : Boolean = \n        self.nomFreq &lt;&gt; null implies self.nomFreq &gt;= 0\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateVoltageLevel_nomFreq_value(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VoltageLevel_numPhases_value'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'numPhases attribute shall be between 1 and 255 in VoltageLevel (line \' + self.lineNumber.toString() + \').\'\n            + \'Current value is \' + self.numPhases.toString()\n        ,\n\tstatus : Boolean = \n        -- test &lt;= 255 is done by XML Handler because it is a byte\n        self.numPhases &lt;&gt; null implies self.numPhases &gt; 0\n\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateVoltageLevel_numPhases_value(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VoltageLevel_at_least_one_Bay_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'VoltageLevel shall contain at least one Bay (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.Bay-&gt;notEmpty()\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateVoltageLevel_at_least_one_Bay_required(DiagnosticChain diagnostics, Map<Object, Object> context);

} // VoltageLevel
