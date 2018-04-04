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
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getReferredByFCDA <em>Referred By FCDA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getReferredByExtRef <em>Referred By Ext Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataAttribute()
 * @model abstract="true"
 * @generated
 */
public interface DataAttribute extends UnNaming {
    /**
	 * Returns the value of the '<em><b>Referred By FCDA</b></em>' reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToDataAttribute <em>Refers To Data Attribute</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By FCDA</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred By FCDA</em>' reference list.
	 * @see #isSetReferredByFCDA()
	 * @see #unsetReferredByFCDA()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataAttribute_ReferredByFCDA()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToDataAttribute
	 * @model opposite="RefersToDataAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!DataAttribute!ReferredByFCDA'"
	 * @generated
	 */
    EList<FCDA> getReferredByFCDA();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getReferredByFCDA <em>Referred By FCDA</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetReferredByFCDA()
	 * @see #getReferredByFCDA()
	 * @generated
	 */
    void unsetReferredByFCDA();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getReferredByFCDA <em>Referred By FCDA</em>}' reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Referred By FCDA</em>' reference list is set.
	 * @see #unsetReferredByFCDA()
	 * @see #getReferredByFCDA()
	 * @generated
	 */
    boolean isSetReferredByFCDA();

    /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataAttribute_Name()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!DataAttribute!name'"
	 * @generated
	 */
    String getName();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
    void setName(String value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
    void unsetName();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
    boolean isSetName();

    /**
	 * Returns the value of the '<em><b>Referred By Ext Ref</b></em>' reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToDataAttribute <em>Refers To Data Attribute</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Ext Ref</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred By Ext Ref</em>' reference list.
	 * @see #isSetReferredByExtRef()
	 * @see #unsetReferredByExtRef()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataAttribute_ReferredByExtRef()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToDataAttribute
	 * @model opposite="RefersToDataAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!DataAttribute!ReferredByExtRef'"
	 * @generated
	 */
    EList<ExtRef> getReferredByExtRef();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getReferredByExtRef <em>Referred By Ext Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetReferredByExtRef()
	 * @see #getReferredByExtRef()
	 * @generated
	 */
    void unsetReferredByExtRef();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getReferredByExtRef <em>Referred By Ext Ref</em>}' reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Referred By Ext Ref</em>' reference list is set.
	 * @see #unsetReferredByExtRef()
	 * @see #getReferredByExtRef()
	 * @generated
	 */
    boolean isSetReferredByExtRef();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DataAttribute_name_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv DataAttribute_name_required:\n *   let\n *     severity : Integer[1] = \'DataAttribute::DataAttribute_name_required\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[1] = self.name &lt;&gt; null\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'name attribute shall be present in \' +\n *               self.oclType()\n *               .toString() + \' (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'DataAttribute::DataAttribute_name_required\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_DataAttribute_c_c_DataAttribute_name_required);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; name = this.getName();\n\tfinal /*@NonInvalid\052/ boolean status = name != null;\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (status) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; oclType = (&lt;%org.eclipse.ocl.pivot.Class%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclTypeOperation%&gt;.INSTANCE.evaluate(executor, this);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(oclType);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_name_32_attribute_32_shall_32_be_32_present_32_in_32, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__32_o_line_32);\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, toString_0);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_DataAttribute_c_c_DataAttribute_name_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateDataAttribute_name_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DataAttribute_name_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv DataAttribute_name_valid:\n *   let\n *     severity : Integer[1] = \'DataAttribute::DataAttribute_name_valid\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.name &lt;&gt; null implies\n *           self.validSclAttributeNameEnum(name)\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'name attribute shall be valid in \' +\n *               self.oclType()\n *               .toString() + \' (line \' +\n *               self.lineNumber.toString() + \'). \' + \'Current value is \' +\n *               self.name.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'DataAttribute::DataAttribute_name_valid\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_DataAttribute_c_c_DataAttribute_name_valid);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; name_0 = this.getName();\n\t\tfinal /*@NonInvalid\052/ boolean ne = name_0 != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@Thrown\052/ boolean validSclAttributeNameEnum = ((&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject%&gt;)this).validSclAttributeNameEnum(name_0);\n\t\t\tstatus = validSclAttributeNameEnum;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; oclType = (&lt;%org.eclipse.ocl.pivot.Class%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclTypeOperation%&gt;.INSTANCE.evaluate(executor, this);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(oclType);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_name_32_attribute_32_shall_32_be_32_valid_32_in_32, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__32_o_line_32);\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, toString_0);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e__32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_3 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_2, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_1 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(name_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_4 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_3, toString_1);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_4, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_DataAttribute_c_c_DataAttribute_name_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateDataAttribute_name_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DataAttribute
