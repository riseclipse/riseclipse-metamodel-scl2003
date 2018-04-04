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
 * A representation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getHeader <em>Header</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getHitem <em>Hitem</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHistory()
 * @model
 * @generated
 */
public interface History extends SclObject {
    /**
	 * Returns the value of the '<em><b>Header</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Header</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' container reference.
	 * @see #setHeader(Header)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHistory_Header()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getHistory
	 * @model opposite="History" resolveProxies="false" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!History!Header'"
	 * @generated
	 */
    Header getHeader();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getHeader <em>Header</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' container reference.
	 * @see #getHeader()
	 * @generated
	 */
    void setHeader( Header value );

    /**
	 * Returns the value of the '<em><b>Hitem</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hitem</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Hitem</em>' containment reference list.
	 * @see #isSetHitem()
	 * @see #unsetHitem()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHistory_Hitem()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getHistory
	 * @model opposite="History" containment="true" unsettable="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!History!Hitem'"
	 * @generated
	 */
    EList<Hitem> getHitem();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getHitem <em>Hitem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetHitem()
	 * @see #getHitem()
	 * @generated
	 */
    void unsetHitem();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getHitem <em>Hitem</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hitem</em>' containment reference list is set.
	 * @see #unsetHitem()
	 * @see #getHitem()
	 * @generated
	 */
    boolean isSetHitem();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='History_at_least_one_Hitem_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv History_at_least_one_Hitem_required:\n *   let\n *     severity : Integer[1] = \'History::History_at_least_one_Hitem_required\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[1] = self.Hitem-&gt;notEmpty()\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'History shall contain at least one Hitem (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'History::History_at_least_one_Hitem_required\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_History_c_c_History_at_least_one_Hitem_required);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem%&gt;&gt; Hitem = this.getHitem();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_Hitem = idResolver.createSetOfAll(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.SET_CLSSid_Hitem, Hitem);\n\tfinal /*@NonInvalid\052/ boolean status = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation%&gt;.INSTANCE.evaluate(BOXED_Hitem).booleanValue();\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (status) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_History_32_shall_32_contain_32_at_32_least_32_one_32_Hitem_32_o_line_32, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_History_c_c_History_at_least_one_Hitem_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateHistory_at_least_one_Hitem_required(DiagnosticChain diagnostics, Map<Object, Object> context);

} // History
