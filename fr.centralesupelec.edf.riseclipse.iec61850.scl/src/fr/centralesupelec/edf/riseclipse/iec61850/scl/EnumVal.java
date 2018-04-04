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

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getOrd <em>Ord</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getEnumType <em>Enum Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEnumVal()
 * @model extendedMetaData="kind='simple'"
 * @generated
 */
public interface EnumVal extends SclObject {
    /**
	 * Returns the value of the '<em><b>Ord</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ord</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ord</em>' attribute.
	 * @see #isSetOrd()
	 * @see #unsetOrd()
	 * @see #setOrd(Integer)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEnumVal_Ord()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!EnumVal!ord'"
	 * @generated
	 */
    Integer getOrd();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getOrd <em>Ord</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ord</em>' attribute.
	 * @see #isSetOrd()
	 * @see #unsetOrd()
	 * @see #getOrd()
	 * @generated
	 */
    void setOrd( Integer value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getOrd <em>Ord</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetOrd()
	 * @see #getOrd()
	 * @see #setOrd(Integer)
	 * @generated
	 */
    void unsetOrd();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getOrd <em>Ord</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ord</em>' attribute is set.
	 * @see #unsetOrd()
	 * @see #getOrd()
	 * @see #setOrd(Integer)
	 * @generated
	 */
    boolean isSetOrd();

    /**
	 * Returns the value of the '<em><b>Enum Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getEnumVal <em>Enum Val</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enum Type</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Type</em>' container reference.
	 * @see #setEnumType(EnumType)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEnumVal_EnumType()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getEnumVal
	 * @model opposite="EnumVal" resolveProxies="false" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!EnumVal!EnumType'"
	 * @generated
	 */
    EnumType getEnumType();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getEnumType <em>Enum Type</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Type</em>' container reference.
	 * @see #getEnumType()
	 * @generated
	 */
    void setEnumType( EnumType value );

    /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Value</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEnumVal_Value()
	 * @model default="" required="true"
	 *        extendedMetaData="kind='simple'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!EnumVal!value'"
	 * @generated
	 */
    String getValue();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
    void setValue( String value );

    /**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Desc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #isSetDesc()
	 * @see #unsetDesc()
	 * @see #setDesc(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEnumVal_Desc()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!EnumVal!desc'"
	 * @generated
	 */
    String getDesc();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #isSetDesc()
	 * @see #unsetDesc()
	 * @see #getDesc()
	 * @generated
	 */
    void setDesc(String value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetDesc()
	 * @see #getDesc()
	 * @see #setDesc(String)
	 * @generated
	 */
    void unsetDesc();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getDesc <em>Desc</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Desc</em>' attribute is set.
	 * @see #unsetDesc()
	 * @see #getDesc()
	 * @see #setDesc(String)
	 * @generated
	 */
    boolean isSetDesc();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EnumVal_ord_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv EnumVal_ord_required:\n *   let severity : Integer[1] = \'EnumVal::EnumVal_ord_required\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[1] = self.ord &lt;&gt; null\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'ord attribute shall be present in EnumVal (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'EnumVal::EnumVal_ord_required\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_EnumVal_c_c_EnumVal_ord_required);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.lang.Integer%&gt; ord = this.getOrd();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_ord = ord == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(ord);\n\tfinal /*@NonInvalid\052/ boolean status = BOXED_ord != null;\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (status) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_ord_32_attribute_32_shall_32_be_32_present_32_in_32_EnumVal_32_o_line_32, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_EnumVal_c_c_EnumVal_ord_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateEnumVal_ord_required(DiagnosticChain diagnostics, Map<Object, Object> context);

} // EnumVal
