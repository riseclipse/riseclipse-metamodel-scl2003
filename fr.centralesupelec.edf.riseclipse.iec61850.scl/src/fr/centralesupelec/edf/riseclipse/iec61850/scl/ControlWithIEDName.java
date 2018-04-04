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
 * A representation of the model object '<em><b>Control With IED Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getConfRev <em>Conf Rev</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getIEDName <em>IED Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getReferredByControlBlock <em>Referred By Control Block</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControlWithIEDName()
 * @model
 * @generated
 */
public interface ControlWithIEDName extends Control {
    /**
	 * Returns the value of the '<em><b>Conf Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conf Rev</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Rev</em>' attribute.
	 * @see #isSetConfRev()
	 * @see #unsetConfRev()
	 * @see #setConfRev(Integer)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControlWithIEDName_ConfRev()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!ControlWithIEDName!confRev'"
	 * @generated
	 */
    Integer getConfRev();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getConfRev <em>Conf Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Rev</em>' attribute.
	 * @see #isSetConfRev()
	 * @see #unsetConfRev()
	 * @see #getConfRev()
	 * @generated
	 */
    void setConfRev( Integer value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getConfRev <em>Conf Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetConfRev()
	 * @see #getConfRev()
	 * @see #setConfRev(Integer)
	 * @generated
	 */
    void unsetConfRev();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getConfRev <em>Conf Rev</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conf Rev</em>' attribute is set.
	 * @see #unsetConfRev()
	 * @see #getConfRev()
	 * @see #setConfRev(Integer)
	 * @generated
	 */
    boolean isSetConfRev();

    /**
	 * Returns the value of the '<em><b>IED Name</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getControlWithIEDName <em>Control With IED Name</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IED Name</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>IED Name</em>' containment reference list.
	 * @see #isSetIEDName()
	 * @see #unsetIEDName()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControlWithIEDName_IEDName()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getControlWithIEDName
	 * @model opposite="ControlWithIEDName" containment="true" unsettable="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!ControlWithIEDName!IEDName'"
	 * @generated
	 */
    EList<IEDName> getIEDName();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getIEDName <em>IED Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetIEDName()
	 * @see #getIEDName()
	 * @generated
	 */
    void unsetIEDName();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getIEDName <em>IED Name</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IED Name</em>' containment reference list is set.
	 * @see #unsetIEDName()
	 * @see #getIEDName()
	 * @generated
	 */
    boolean isSetIEDName();

    /**
	 * Returns the value of the '<em><b>Referred By Control Block</b></em>' reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getRefersToControlWithIEDName <em>Refers To Control With IED Name</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Control Block</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred By Control Block</em>' reference list.
	 * @see #isSetReferredByControlBlock()
	 * @see #unsetReferredByControlBlock()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControlWithIEDName_ReferredByControlBlock()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getRefersToControlWithIEDName
	 * @model opposite="RefersToControlWithIEDName" resolveProxies="false" unsettable="true" transient="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!ControlWithIEDName!ReferredByControlBlock'"
	 * @generated
	 */
    EList<ControlBlock> getReferredByControlBlock();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getReferredByControlBlock <em>Referred By Control Block</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetReferredByControlBlock()
	 * @see #getReferredByControlBlock()
	 * @generated
	 */
    void unsetReferredByControlBlock();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getReferredByControlBlock <em>Referred By Control Block</em>}' reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Referred By Control Block</em>' reference list is set.
	 * @see #unsetReferredByControlBlock()
	 * @see #getReferredByControlBlock()
	 * @generated
	 */
    boolean isSetReferredByControlBlock();

    /**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getControlWithIEDName <em>Control With IED Name</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Protocol</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference.
	 * @see #isSetProtocol()
	 * @see #unsetProtocol()
	 * @see #setProtocol(Protocol)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControlWithIEDName_Protocol()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getControlWithIEDName
	 * @model opposite="ControlWithIEDName" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!ControlWithIEDName!Protocol'"
	 * @generated
	 */
    Protocol getProtocol();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #isSetProtocol()
	 * @see #unsetProtocol()
	 * @see #getProtocol()
	 * @generated
	 */
    void setProtocol( Protocol value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetProtocol()
	 * @see #getProtocol()
	 * @see #setProtocol(Protocol)
	 * @generated
	 */
    void unsetProtocol();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getProtocol <em>Protocol</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Protocol</em>' containment reference is set.
	 * @see #unsetProtocol()
	 * @see #getProtocol()
	 * @see #setProtocol(Protocol)
	 * @generated
	 */
    boolean isSetProtocol();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ControlWithIEDName_confRev_unsignedInt'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv ControlWithIEDName_confRev_unsignedInt:\n *   let\n *     severity : Integer[1] = \'ControlWithIEDName::ControlWithIEDName_confRev_unsignedInt\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.confRev &lt;&gt; null implies self.confRev &gt;= 0\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'confRev attribute shall be valid in ControlWithIEDName (line \' +\n *               self.lineNumber.toString() + \'). \' + \'Current value is \' +\n *               self.confRev.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'ControlWithIEDName::ControlWithIEDName_confRev_unsignedInt\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_ControlWithIEDName_c_c_ControlWithIEDName_confRev_unsignedInt);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Integer%&gt; confRev_0 = this.getConfRev();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_confRev_0 = confRev_0 == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(confRev_0);\n\t\tfinal /*@NonInvalid\052/ boolean ne = BOXED_confRev_0 != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, BOXED_confRev_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\t\t\tstatus = ge;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_confRev_32_attribute_32_shall_32_be_32_valid_32_in_32_ControlWithIEDName_32_o_line_32, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e__32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_confRev_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_ControlWithIEDName_c_c_ControlWithIEDName_confRev_unsignedInt, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateControlWithIEDName_confRev_unsignedInt(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ControlWithIEDName
