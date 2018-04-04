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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!VoltageLevel!nomFreq'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!VoltageLevel!numPhases'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!VoltageLevel!Bay'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!VoltageLevel!Function'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!VoltageLevel!Substation'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!VoltageLevel!Voltage'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!VoltageLevel!Terminal'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv VoltageLevel_nomFreq_value:\n *   let\n *     severity : Integer[1] = \'VoltageLevel::VoltageLevel_nomFreq_value\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.nomFreq &lt;&gt; null implies self.nomFreq &gt;= 0\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'nomFreq attribute shall a positive decimal in VoltageLevel (line \' +\n *               self.lineNumber.toString() + \').\' + \'Current value is \' +\n *               self.nomFreq.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'VoltageLevel::VoltageLevel_nomFreq_value\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_VoltageLevel_c_c_VoltageLevel_nomFreq_value);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.math.BigDecimal%&gt; nomFreq = this.getNomFreq();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.RealValue%&gt; BOXED_nomFreq = nomFreq == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.realValueOf(nomFreq);\n\t\tfinal /*@NonInvalid\052/ boolean ne = BOXED_nomFreq != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, BOXED_nomFreq, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\t\t\tstatus = ge;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_nomFreq_32_attribute_32_shall_32_a_32_positive_32_decimal_32_in_32_VoltageLevel_32_o_line, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e_);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_nomFreq);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_VoltageLevel_c_c_VoltageLevel_nomFreq_value, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateVoltageLevel_nomFreq_value(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VoltageLevel_numPhases_value'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv VoltageLevel_numPhases_value:\n *   let\n *     severity : Integer[1] = \'VoltageLevel::VoltageLevel_numPhases_value\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.numPhases &lt;&gt; null implies self.numPhases &gt; 0\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'numPhases attribute shall be between 1 and 255 in VoltageLevel (line \' +\n *               self.lineNumber.toString() + \').\' + \'Current value is \' +\n *               self.numPhases.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'VoltageLevel::VoltageLevel_numPhases_value\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_VoltageLevel_c_c_VoltageLevel_numPhases_value);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Byte%&gt; numPhases_0 = this.getNumPhases();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_numPhases_0 = numPhases_0 == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(numPhases_0);\n\t\tfinal /*@NonInvalid\052/ boolean ne = BOXED_numPhases_0 != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@Thrown\052/ boolean gt = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation%&gt;.INSTANCE.evaluate(executor, BOXED_numPhases_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\t\t\tstatus = gt;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_numPhases_32_attribute_32_shall_32_be_32_between_32_1_32_and_32_255_32_in_32_VoltageLevel_32_o, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e_);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_numPhases_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_VoltageLevel_c_c_VoltageLevel_numPhases_value, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateVoltageLevel_numPhases_value(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VoltageLevel_at_least_one_Bay_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv VoltageLevel_at_least_one_Bay_required:\n *   let\n *     severity : Integer[1] = \'VoltageLevel::VoltageLevel_at_least_one_Bay_required\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[1] = self.Bay-&gt;notEmpty()\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'VoltageLevel shall contain at least one Bay (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'VoltageLevel::VoltageLevel_at_least_one_Bay_required\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_VoltageLevel_c_c_VoltageLevel_at_least_one_Bay_required);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay%&gt;&gt; Bay = this.getBay();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_Bay = idResolver.createSetOfAll(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.SET_CLSSid_Bay, Bay);\n\tfinal /*@NonInvalid\052/ boolean status = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation%&gt;.INSTANCE.evaluate(BOXED_Bay).booleanValue();\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (status) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_VoltageLevel_32_shall_32_contain_32_at_32_least_32_one_32_Bay_32_o_line_32, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_VoltageLevel_c_c_VoltageLevel_at_least_one_Bay_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateVoltageLevel_at_least_one_Bay_required(DiagnosticChain diagnostics, Map<Object, Object> context);

} // VoltageLevel
