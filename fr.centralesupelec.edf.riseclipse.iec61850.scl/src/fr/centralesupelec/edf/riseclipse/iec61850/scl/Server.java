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
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAccessPoint <em>Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAssociation <em>Association</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getLDevice <em>LDevice</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends UnNaming {
    /**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #isSetTimeout()
	 * @see #unsetTimeout()
	 * @see #setTimeout(Integer)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServer_Timeout()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Server!timeout'"
	 * @generated
	 */
    Integer getTimeout();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #isSetTimeout()
	 * @see #unsetTimeout()
	 * @see #getTimeout()
	 * @generated
	 */
    void setTimeout( Integer value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetTimeout()
	 * @see #getTimeout()
	 * @see #setTimeout(Integer)
	 * @generated
	 */
    void unsetTimeout();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getTimeout <em>Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Timeout</em>' attribute is set.
	 * @see #unsetTimeout()
	 * @see #getTimeout()
	 * @see #setTimeout(Integer)
	 * @generated
	 */
    boolean isSetTimeout();

    /**
	 * Returns the value of the '<em><b>Access Point</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Access Point</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Point</em>' container reference.
	 * @see #setAccessPoint(AccessPoint)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServer_AccessPoint()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServer
	 * @model opposite="Server" resolveProxies="false" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Server!AccessPoint'"
	 * @generated
	 */
    AccessPoint getAccessPoint();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAccessPoint <em>Access Point</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Point</em>' container reference.
	 * @see #getAccessPoint()
	 * @generated
	 */
    void setAccessPoint( AccessPoint value );

    /**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Association</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' containment reference list.
	 * @see #isSetAssociation()
	 * @see #unsetAssociation()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServer_Association()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getServer
	 * @model opposite="Server" containment="true" unsettable="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Server!Association'"
	 * @generated
	 */
    EList<Association> getAssociation();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAssociation <em>Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetAssociation()
	 * @see #getAssociation()
	 * @generated
	 */
    void unsetAssociation();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAssociation <em>Association</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Association</em>' containment reference list is set.
	 * @see #unsetAssociation()
	 * @see #getAssociation()
	 * @generated
	 */
    boolean isSetAssociation();

    /**
	 * Returns the value of the '<em><b>Authentication</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Authentication</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' containment reference.
	 * @see #isSetAuthentication()
	 * @see #unsetAuthentication()
	 * @see #setAuthentication(Authentication)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServer_Authentication()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getServer
	 * @model opposite="Server" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Server!Authentication'"
	 * @generated
	 */
    Authentication getAuthentication();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAuthentication <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' containment reference.
	 * @see #isSetAuthentication()
	 * @see #unsetAuthentication()
	 * @see #getAuthentication()
	 * @generated
	 */
    void setAuthentication( Authentication value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAuthentication <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetAuthentication()
	 * @see #getAuthentication()
	 * @see #setAuthentication(Authentication)
	 * @generated
	 */
    void unsetAuthentication();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAuthentication <em>Authentication</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Authentication</em>' containment reference is set.
	 * @see #unsetAuthentication()
	 * @see #getAuthentication()
	 * @see #setAuthentication(Authentication)
	 * @generated
	 */
    boolean isSetAuthentication();

    /**
	 * Returns the value of the '<em><b>LDevice</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LDevice</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>LDevice</em>' containment reference list.
	 * @see #isSetLDevice()
	 * @see #unsetLDevice()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServer_LDevice()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getServer
	 * @model opposite="Server" containment="true" unsettable="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Server!LDevice'"
	 * @generated
	 */
    EList<LDevice> getLDevice();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getLDevice <em>LDevice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetLDevice()
	 * @see #getLDevice()
	 * @generated
	 */
    void unsetLDevice();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getLDevice <em>LDevice</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>LDevice</em>' containment reference list is set.
	 * @see #unsetLDevice()
	 * @see #getLDevice()
	 * @generated
	 */
    boolean isSetLDevice();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Server_timeout_unsigned_int'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv Server_timeout_unsigned_int:\n *   let\n *     severity : Integer[1] = \'Server::Server_timeout_unsigned_int\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.timeout &lt;&gt; null implies self.timeout &gt;= 0\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'timeout attribute shall be valid in Server (line \' +\n *               self.lineNumber.toString() + \'). \' + \'Current value is \' +\n *               self.timeout.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'Server::Server_timeout_unsigned_int\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Server_c_c_Server_timeout_unsigned_int);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Integer%&gt; timeout_0 = this.getTimeout();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_timeout_0 = timeout_0 == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(timeout_0);\n\t\tfinal /*@NonInvalid\052/ boolean ne = BOXED_timeout_0 != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, BOXED_timeout_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\t\t\tstatus = ge;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_timeout_32_attribute_32_shall_32_be_32_valid_32_in_32_Server_32_o_line_32, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e__32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_timeout_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Server_c_c_Server_timeout_unsigned_int, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateServer_timeout_unsigned_int(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Server_one_Authentication_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv Server_one_Authentication_required:\n *   let\n *     severity : Integer[1] = \'Server::Server_one_Authentication_required\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[1] = self.Authentication &lt;&gt; null\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'Server shall contain one Authentication (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'Server::Server_one_Authentication_required\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Server_c_c_Server_one_Authentication_required);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication%&gt; Authentication = this.getAuthentication();\n\tfinal /*@NonInvalid\052/ boolean status = Authentication != null;\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (status) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Server_32_shall_32_contain_32_one_32_Authentication_32_o_line_32, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Server_c_c_Server_one_Authentication_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateServer_one_Authentication_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Server_at_least_one_LDevice_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv Server_at_least_one_LDevice_required:\n *   let\n *     severity : Integer[1] = \'Server::Server_at_least_one_LDevice_required\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let\n *           status : Boolean[1] = self.LDevice-&gt;notEmpty()\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'Server shall contain at least one LDevice (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'Server::Server_at_least_one_LDevice_required\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Server_c_c_Server_at_least_one_LDevice_required);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice%&gt;&gt; LDevice = this.getLDevice();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_LDevice = idResolver.createSetOfAll(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.SET_CLSSid_LDevice, LDevice);\n\tfinal /*@NonInvalid\052/ boolean status = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation%&gt;.INSTANCE.evaluate(BOXED_LDevice).booleanValue();\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (status) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Server_32_shall_32_contain_32_at_32_least_32_one_32_LDevice_32_o_line_32, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Server_c_c_Server_at_least_one_LDevice_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateServer_at_least_one_LDevice_required(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Server
