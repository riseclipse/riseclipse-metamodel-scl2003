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
 * A representation of the model object '<em><b>DO Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getCdc <em>Cdc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getIedType <em>Ied Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getDA <em>DA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredByDO <em>Referred By DO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getDataTypeTemplates <em>Data Type Templates</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getSDO <em>SDO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredBySDO <em>Referred By SDO</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType()
 * @model
 * @generated
 */
public interface DOType extends IDNaming {
    /**
	 * Returns the value of the '<em><b>Cdc</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cdc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Cdc</em>' attribute.
	 * @see #isSetCdc()
	 * @see #unsetCdc()
	 * @see #setCdc(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType_Cdc()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!DOType!cdc'"
	 * @generated
	 */
    String getCdc();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getCdc <em>Cdc</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cdc</em>' attribute.
	 * @see #isSetCdc()
	 * @see #unsetCdc()
	 * @see #getCdc()
	 * @generated
	 */
    void setCdc( String value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getCdc <em>Cdc</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetCdc()
	 * @see #getCdc()
	 * @see #setCdc(String)
	 * @generated
	 */
    void unsetCdc();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getCdc <em>Cdc</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cdc</em>' attribute is set.
	 * @see #unsetCdc()
	 * @see #getCdc()
	 * @see #setCdc(String)
	 * @generated
	 */
    boolean isSetCdc();

    /**
	 * Returns the value of the '<em><b>Ied Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ied Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ied Type</em>' attribute.
	 * @see #isSetIedType()
	 * @see #unsetIedType()
	 * @see #setIedType(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType_IedType()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!DOType!iedType'"
	 * @generated
	 */
    String getIedType();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getIedType <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ied Type</em>' attribute.
	 * @see #isSetIedType()
	 * @see #unsetIedType()
	 * @see #getIedType()
	 * @generated
	 */
    void setIedType( String value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getIedType <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetIedType()
	 * @see #getIedType()
	 * @see #setIedType(String)
	 * @generated
	 */
    void unsetIedType();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getIedType <em>Ied Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ied Type</em>' attribute is set.
	 * @see #unsetIedType()
	 * @see #getIedType()
	 * @see #setIedType(String)
	 * @generated
	 */
    boolean isSetIedType();

    /**
	 * Returns the value of the '<em><b>DA</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getDOType <em>DO Type</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DA</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>DA</em>' containment reference list.
	 * @see #isSetDA()
	 * @see #unsetDA()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType_DA()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getDOType
	 * @model opposite="DOType" containment="true" unsettable="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!DOType!DA'"
	 * @generated
	 */
    EList<DA> getDA();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getDA <em>DA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetDA()
	 * @see #getDA()
	 * @generated
	 */
    void unsetDA();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getDA <em>DA</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>DA</em>' containment reference list is set.
	 * @see #unsetDA()
	 * @see #getDA()
	 * @generated
	 */
    boolean isSetDA();

    /**
	 * Returns the value of the '<em><b>Referred By DO</b></em>' reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getRefersToDOType <em>Refers To DO Type</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By DO</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred By DO</em>' reference list.
	 * @see #isSetReferredByDO()
	 * @see #unsetReferredByDO()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType_ReferredByDO()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getRefersToDOType
	 * @model opposite="RefersToDOType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!DOType!ReferredByDO'"
	 * @generated
	 */
    EList<DO> getReferredByDO();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredByDO <em>Referred By DO</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetReferredByDO()
	 * @see #getReferredByDO()
	 * @generated
	 */
    void unsetReferredByDO();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredByDO <em>Referred By DO</em>}' reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Referred By DO</em>' reference list is set.
	 * @see #unsetReferredByDO()
	 * @see #getReferredByDO()
	 * @generated
	 */
    boolean isSetReferredByDO();

    /**
	 * Returns the value of the '<em><b>Data Type Templates</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDOType <em>DO Type</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type Templates</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Templates</em>' container reference.
	 * @see #setDataTypeTemplates(DataTypeTemplates)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType_DataTypeTemplates()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDOType
	 * @model opposite="DOType" resolveProxies="false" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!DOType!DataTypeTemplates'"
	 * @generated
	 */
    DataTypeTemplates getDataTypeTemplates();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getDataTypeTemplates <em>Data Type Templates</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Templates</em>' container reference.
	 * @see #getDataTypeTemplates()
	 * @generated
	 */
    void setDataTypeTemplates( DataTypeTemplates value );

    /**
	 * Returns the value of the '<em><b>SDO</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getDOType <em>DO Type</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SDO</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>SDO</em>' containment reference list.
	 * @see #isSetSDO()
	 * @see #unsetSDO()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType_SDO()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getDOType
	 * @model opposite="DOType" containment="true" unsettable="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!DOType!SDO'"
	 * @generated
	 */
    EList<SDO> getSDO();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getSDO <em>SDO</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetSDO()
	 * @see #getSDO()
	 * @generated
	 */
    void unsetSDO();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getSDO <em>SDO</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SDO</em>' containment reference list is set.
	 * @see #unsetSDO()
	 * @see #getSDO()
	 * @generated
	 */
    boolean isSetSDO();

    /**
	 * Returns the value of the '<em><b>Referred By SDO</b></em>' reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getRefersToDOType <em>Refers To DO Type</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By SDO</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred By SDO</em>' reference list.
	 * @see #isSetReferredBySDO()
	 * @see #unsetReferredBySDO()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType_ReferredBySDO()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getRefersToDOType
	 * @model opposite="RefersToDOType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!DOType!ReferredBySDO'"
	 * @generated
	 */
    EList<SDO> getReferredBySDO();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredBySDO <em>Referred By SDO</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetReferredBySDO()
	 * @see #getReferredBySDO()
	 * @generated
	 */
    void unsetReferredBySDO();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredBySDO <em>Referred By SDO</em>}' reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Referred By SDO</em>' reference list is set.
	 * @see #unsetReferredBySDO()
	 * @see #getReferredBySDO()
	 * @generated
	 */
    boolean isSetReferredBySDO();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DOType_cdc_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv DOType_cdc_required:\n *   let severity : Integer[1] = \'DOType::DOType_cdc_required\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[1] = self.cdc &lt;&gt; null\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'cdc attribute shall be present in DOType (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'DOType::DOType_cdc_required\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_DOType_c_c_DOType_cdc_required);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; cdc = this.getCdc();\n\tfinal /*@NonInvalid\052/ boolean status = cdc != null;\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (status) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_cdc_32_attribute_32_shall_32_be_32_present_32_in_32_DOType_32_o_line_32, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_DOType_c_c_DOType_cdc_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateDOType_cdc_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DOType_cdc_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv DOType_cdc_valid:\n *   let severity : Integer[1] = \'DOType::DOType_cdc_valid\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.cdc &lt;&gt; null implies\n *           self.validSclCDCEnum(cdc)\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'cdc attribute shall be valid in DOType (line \' +\n *               self.lineNumber.toString() + \'). \' + \'Current value is \' +\n *               self.cdc.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'DOType::DOType_cdc_valid\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_DOType_c_c_DOType_cdc_valid);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; cdc_0 = this.getCdc();\n\t\tfinal /*@NonInvalid\052/ boolean ne = cdc_0 != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@Thrown\052/ boolean validSclCDCEnum = ((&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject%&gt;)this).validSclCDCEnum(cdc_0);\n\t\t\tstatus = validSclCDCEnum;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_cdc_32_attribute_32_shall_32_be_32_valid_32_in_32_DOType_32_o_line_32, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e__32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(cdc_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_DOType_c_c_DOType_cdc_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateDOType_cdc_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DOType_iedType_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv DOType_iedType_valid:\n *   let severity : Integer[1] = \'DOType::DOType_iedType_valid\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.iedType &lt;&gt; null implies\n *           self.validSclAnyName(iedType)\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'iedType attribute shall be valid in DOType (line \' +\n *               self.lineNumber.toString() + \'). \' + \'Current value is \' +\n *               self.iedType.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'DOType::DOType_iedType_valid\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_DOType_c_c_DOType_iedType_valid);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; iedType_0 = this.getIedType();\n\t\tfinal /*@NonInvalid\052/ boolean ne = iedType_0 != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@Thrown\052/ boolean validSclAnyName = ((&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject%&gt;)this).validSclAnyName(iedType_0);\n\t\t\tstatus = validSclAnyName;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_iedType_32_attribute_32_shall_32_be_32_valid_32_in_32_DOType_32_o_line_32, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e__32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(iedType_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_DOType_c_c_DOType_iedType_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateDOType_iedType_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DOType_at_least_one_SDO_or_DA_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv DOType_at_least_one_SDO_or_DA_required:\n *   let\n *     severity : Integer[1] = \'DOType::DOType_at_least_one_SDO_or_DA_required\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let\n *           status : Boolean[?] = self.SDO-&gt;notEmpty() or\n *           self.DA-&gt;notEmpty()\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'DOType shall contain at least one SDO or DA (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'DOType::DOType_at_least_one_SDO_or_DA_required\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_DOType_c_c_DOType_at_least_one_SDO_or_DA_required);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO%&gt;&gt; SDO = this.getSDO();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_SDO = idResolver.createSetOfAll(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.SET_CLSSid_SDO, SDO);\n\tfinal /*@NonInvalid\052/ boolean notEmpty = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation%&gt;.INSTANCE.evaluate(BOXED_SDO).booleanValue();\n\t/*@NonInvalid\052/ boolean status;\n\tif (notEmpty) {\n\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.DA%&gt;&gt; DA = this.getDA();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_DA = idResolver.createSetOfAll(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.SET_CLSSid_DA, DA);\n\t\tfinal /*@NonInvalid\052/ boolean notEmpty_0 = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation%&gt;.INSTANCE.evaluate(BOXED_DA).booleanValue();\n\t\tstatus = notEmpty_0;\n\t}\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (status) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_DOType_32_shall_32_contain_32_at_32_least_32_one_32_SDO_32_or_32_DA_32_o_line_32, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_DOType_c_c_DOType_at_least_one_SDO_or_DA_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateDOType_at_least_one_SDO_or_DA_required(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DOType
