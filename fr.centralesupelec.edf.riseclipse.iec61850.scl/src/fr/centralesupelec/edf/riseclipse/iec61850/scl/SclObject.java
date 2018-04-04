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

import java.math.BigInteger;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject#getLineNumber <em>Line Number</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSclObject()
 * @model abstract="true"
 * @generated
 */
public interface SclObject extends EObject {
    /**
	 * Returns the value of the '<em><b>Line Number</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Line Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Number</em>' attribute.
	 * @see #setLineNumber(int)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSclObject_LineNumber()
	 * @model default="-1" required="true" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!SclObject!lineNumber'"
	 * @generated
	 */
    int getLineNumber();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
    void setLineNumber( int value );

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * s.matches(\'[A-Za-z0-9][0-9A-Za-z_]*\')\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_A_m_Za_m_z0_m_9_93_91_0_m_9A_m_Za_m_z__93_a).booleanValue();\nreturn matches;'"
	 * @generated
	 */
	Boolean validSclAccessPointName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then s.matches(\'[A-Za-z][0-9A-Za-z_]*\')\n * else false\n * endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_A_m_Za_m_z_93_91_0_m_9A_m_Za_m_z__93_a).booleanValue();\n\tsymbol_0 = matches;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclAcsiName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	Boolean validSclAnyName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * s.matches(\'[0-9A-Za-z]+\')\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_0_m_9A_m_Za_m_z_93_p).booleanValue();\nreturn matches;'"
	 * @generated
	 */
	Boolean validSclAssociationID(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if validSclPredefinedAttributeNameEnum(s)\n * then true\n * else validSclExtensionAttributeNameEnum(s)\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclPredefinedAttributeNameEnum = this.validSclPredefinedAttributeNameEnum(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclPredefinedAttributeNameEnum) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@Thrown\052/ boolean validSclExtensionAttributeNameEnum = this.validSclExtensionAttributeNameEnum(s);\n\tsymbol_0 = validSclExtensionAttributeNameEnum;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclAttributeNameEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then Set{\'none\', \'password\', \'weak\', \'strong\', \'certificate\'}-&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclAuthenticationEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * validSclPredefinedBasicTypeEnum(s)\n \052/\nfinal /*@Thrown\052/ boolean validSclPredefinedBasicTypeEnum = this.validSclPredefinedBasicTypeEnum(s);\nreturn validSclPredefinedBasicTypeEnum;'"
	 * @generated
	 */
	Boolean validSclBasicTypeEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * if self.validSclAcsiName(s) then s.size() &lt;= 32 else false endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclAcsiName = this.validSclAcsiName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclAcsiName) {\n\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(s);\n\tfinal /*@Thrown\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_32).booleanValue();\n\tsymbol_0 = le;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclCBName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * if validSclPredefinedCDCEnum(s) then true else validSclExtensionCDCEnum(s) endif\n \052/\nfinal /*@Thrown\052/ boolean validSclPredefinedCDCEnum = this.validSclPredefinedCDCEnum(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclPredefinedCDCEnum) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@Thrown\052/ boolean validSclExtensionCDCEnum = this.validSclExtensionCDCEnum(s);\n\tsymbol_0 = validSclExtensionCDCEnum;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclCDCEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if validSclPredefinedCommonConductingEquipmentEnum(s)\n * then true\n * else validSclExtensionEquipmentEnum(s)\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclPredefinedCommonConductingEquipmentEnum = this.validSclPredefinedCommonConductingEquipmentEnum(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclPredefinedCommonConductingEquipmentEnum) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@Thrown\052/ boolean validSclExtensionEquipmentEnum = this.validSclExtensionEquipmentEnum(s);\n\tsymbol_0 = validSclExtensionEquipmentEnum;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclCommonConductingEquipmentEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * s.matches(\'[0-9]+\') or self.validSclAttributeNameEnum(s)\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\n/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_matches;\ntry {\n\tfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_0_m_9_93_p).booleanValue();\n\tCAUGHT_matches = matches;\n}\ncatch (&lt;%java.lang.Exception%&gt; e) {\n\tCAUGHT_matches = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n}\n/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclAttributeNameEnum;\ntry {\n\tfinal /*@Thrown\052/ boolean validSclAttributeNameEnum = this.validSclAttributeNameEnum(s);\n\tCAUGHT_validSclAttributeNameEnum = validSclAttributeNameEnum;\n}\ncatch (&lt;%java.lang.Exception%&gt; e) {\n\tCAUGHT_validSclAttributeNameEnum = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n}\nfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%&gt;.INSTANCE.evaluate(CAUGHT_matches, CAUGHT_validSclAttributeNameEnum);\nreturn or;'"
	 * @generated
	 */
	Boolean validSclDACount(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * if self.validSclRestrName1stU(s) then s.size() &lt;= 12 else false endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclRestrName1stU = this.validSclRestrName1stU(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclRestrName1stU) {\n\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(s);\n\tfinal /*@Thrown\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_12).booleanValue();\n\tsymbol_0 = le;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclDataName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * if self.validSclAcsiName(s) then s.size() &lt;= 32 else false endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclAcsiName = this.validSclAcsiName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclAcsiName) {\n\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(s);\n\tfinal /*@Thrown\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_32).booleanValue();\n\tsymbol_0 = le;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclDataSetName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * validSclDomainLNGroupAEnum(s) or\n * validSclDomainLNGroupCEnum(s) or\n * validSclDomainLNGroupFEnum(s) or\n * validSclDomainLNGroupGEnum(s) or\n * validSclDomainLNGroupIEnum(s) or\n * validSclDomainLNGroupKEnum(s) or\n * validSclDomainLNGroupMEnum(s) or\n * validSclDomainLNGroupPEnum(s) or\n * validSclDomainLNGroupQEnum(s) or\n * validSclDomainLNGroupREnum(s) or\n * validSclDomainLNGroupSEnum(s) or\n * validSclDomainLNGroupTEnum(s) or\n * validSclDomainLNGroupXEnum(s) or\n * validSclDomainLNGroupYEnum(s) or\n * validSclDomainLNGroupZEnum(s)\n \052/\n/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_or_11;\ntry {\n\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_or_10;\n\ttry {\n\t\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_or_9;\n\t\ttry {\n\t\t\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_or_8;\n\t\t\ttry {\n\t\t\t\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_or_7;\n\t\t\t\ttry {\n\t\t\t\t\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_or_6;\n\t\t\t\t\ttry {\n\t\t\t\t\t\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_or_5;\n\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_or_4;\n\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_or_3;\n\t\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\t\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_or_2;\n\t\t\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\t\t\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_or_1;\n\t\t\t\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\t\t\t\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_or_0;\n\t\t\t\t\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\t\t\t\t\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_or;\n\t\t\t\t\t\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\t\t\t\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclDomainLNGroupAEnum;\n\t\t\t\t\t\t\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ boolean validSclDomainLNGroupAEnum = this.validSclDomainLNGroupAEnum(s);\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupAEnum = validSclDomainLNGroupAEnum;\n\t\t\t\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupAEnum = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t\t\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclDomainLNGroupCEnum;\n\t\t\t\t\t\t\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ boolean validSclDomainLNGroupCEnum = this.validSclDomainLNGroupCEnum(s);\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupCEnum = validSclDomainLNGroupCEnum;\n\t\t\t\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupCEnum = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%&gt;.INSTANCE.evaluate(CAUGHT_validSclDomainLNGroupAEnum, CAUGHT_validSclDomainLNGroupCEnum);\n\t\t\t\t\t\t\t\t\t\t\t\t\tCAUGHT_or = or;\n\t\t\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\t\t\t\t\t\tCAUGHT_or = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclDomainLNGroupFEnum;\n\t\t\t\t\t\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ boolean validSclDomainLNGroupFEnum = this.validSclDomainLNGroupFEnum(s);\n\t\t\t\t\t\t\t\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupFEnum = validSclDomainLNGroupFEnum;\n\t\t\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupFEnum = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or_0 = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%&gt;.INSTANCE.evaluate(CAUGHT_or, CAUGHT_validSclDomainLNGroupFEnum);\n\t\t\t\t\t\t\t\t\t\t\t\tCAUGHT_or_0 = or_0;\n\t\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\t\t\t\t\tCAUGHT_or_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclDomainLNGroupGEnum;\n\t\t\t\t\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ boolean validSclDomainLNGroupGEnum = this.validSclDomainLNGroupGEnum(s);\n\t\t\t\t\t\t\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupGEnum = validSclDomainLNGroupGEnum;\n\t\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupGEnum = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or_1 = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%&gt;.INSTANCE.evaluate(CAUGHT_or_0, CAUGHT_validSclDomainLNGroupGEnum);\n\t\t\t\t\t\t\t\t\t\t\tCAUGHT_or_1 = or_1;\n\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\t\t\t\tCAUGHT_or_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclDomainLNGroupIEnum;\n\t\t\t\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ boolean validSclDomainLNGroupIEnum = this.validSclDomainLNGroupIEnum(s);\n\t\t\t\t\t\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupIEnum = validSclDomainLNGroupIEnum;\n\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupIEnum = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or_2 = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%&gt;.INSTANCE.evaluate(CAUGHT_or_1, CAUGHT_validSclDomainLNGroupIEnum);\n\t\t\t\t\t\t\t\t\t\tCAUGHT_or_2 = or_2;\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\t\t\tCAUGHT_or_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclDomainLNGroupKEnum;\n\t\t\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ boolean validSclDomainLNGroupKEnum = this.validSclDomainLNGroupKEnum(s);\n\t\t\t\t\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupKEnum = validSclDomainLNGroupKEnum;\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupKEnum = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or_3 = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%&gt;.INSTANCE.evaluate(CAUGHT_or_2, CAUGHT_validSclDomainLNGroupKEnum);\n\t\t\t\t\t\t\t\t\tCAUGHT_or_3 = or_3;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\t\tCAUGHT_or_3 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclDomainLNGroupMEnum;\n\t\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ boolean validSclDomainLNGroupMEnum = this.validSclDomainLNGroupMEnum(s);\n\t\t\t\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupMEnum = validSclDomainLNGroupMEnum;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupMEnum = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or_4 = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%&gt;.INSTANCE.evaluate(CAUGHT_or_3, CAUGHT_validSclDomainLNGroupMEnum);\n\t\t\t\t\t\t\t\tCAUGHT_or_4 = or_4;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\tCAUGHT_or_4 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclDomainLNGroupPEnum;\n\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ boolean validSclDomainLNGroupPEnum = this.validSclDomainLNGroupPEnum(s);\n\t\t\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupPEnum = validSclDomainLNGroupPEnum;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupPEnum = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or_5 = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%&gt;.INSTANCE.evaluate(CAUGHT_or_4, CAUGHT_validSclDomainLNGroupPEnum);\n\t\t\t\t\t\t\tCAUGHT_or_5 = or_5;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\tCAUGHT_or_5 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t}\n\t\t\t\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclDomainLNGroupQEnum;\n\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\tfinal /*@Thrown\052/ boolean validSclDomainLNGroupQEnum = this.validSclDomainLNGroupQEnum(s);\n\t\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupQEnum = validSclDomainLNGroupQEnum;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupQEnum = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t}\n\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or_6 = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%&gt;.INSTANCE.evaluate(CAUGHT_or_5, CAUGHT_validSclDomainLNGroupQEnum);\n\t\t\t\t\t\tCAUGHT_or_6 = or_6;\n\t\t\t\t\t}\n\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\tCAUGHT_or_6 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t}\n\t\t\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclDomainLNGroupREnum;\n\t\t\t\t\ttry {\n\t\t\t\t\t\tfinal /*@Thrown\052/ boolean validSclDomainLNGroupREnum = this.validSclDomainLNGroupREnum(s);\n\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupREnum = validSclDomainLNGroupREnum;\n\t\t\t\t\t}\n\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\tCAUGHT_validSclDomainLNGroupREnum = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t}\n\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or_7 = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%&gt;.INSTANCE.evaluate(CAUGHT_or_6, CAUGHT_validSclDomainLNGroupREnum);\n\t\t\t\t\tCAUGHT_or_7 = or_7;\n\t\t\t\t}\n\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\tCAUGHT_or_7 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t}\n\t\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclDomainLNGroupSEnum;\n\t\t\t\ttry {\n\t\t\t\t\tfinal /*@Thrown\052/ boolean validSclDomainLNGroupSEnum = this.validSclDomainLNGroupSEnum(s);\n\t\t\t\t\tCAUGHT_validSclDomainLNGroupSEnum = validSclDomainLNGroupSEnum;\n\t\t\t\t}\n\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\tCAUGHT_validSclDomainLNGroupSEnum = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t}\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or_8 = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%&gt;.INSTANCE.evaluate(CAUGHT_or_7, CAUGHT_validSclDomainLNGroupSEnum);\n\t\t\t\tCAUGHT_or_8 = or_8;\n\t\t\t}\n\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\tCAUGHT_or_8 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t}\n\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclDomainLNGroupTEnum;\n\t\t\ttry {\n\t\t\t\tfinal /*@Thrown\052/ boolean validSclDomainLNGroupTEnum = this.validSclDomainLNGroupTEnum(s);\n\t\t\t\tCAUGHT_validSclDomainLNGroupTEnum = validSclDomainLNGroupTEnum;\n\t\t\t}\n\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\tCAUGHT_validSclDomainLNGroupTEnum = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t}\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or_9 = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%&gt;.INSTANCE.evaluate(CAUGHT_or_8, CAUGHT_validSclDomainLNGroupTEnum);\n\t\t\tCAUGHT_or_9 = or_9;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_or_9 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclDomainLNGroupXEnum;\n\t\ttry {\n\t\t\tfinal /*@Thrown\052/ boolean validSclDomainLNGroupXEnum = this.validSclDomainLNGroupXEnum(s);\n\t\t\tCAUGHT_validSclDomainLNGroupXEnum = validSclDomainLNGroupXEnum;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_validSclDomainLNGroupXEnum = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or_10 = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%&gt;.INSTANCE.evaluate(CAUGHT_or_9, CAUGHT_validSclDomainLNGroupXEnum);\n\t\tCAUGHT_or_10 = or_10;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_or_10 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclDomainLNGroupYEnum;\n\ttry {\n\t\tfinal /*@Thrown\052/ boolean validSclDomainLNGroupYEnum = this.validSclDomainLNGroupYEnum(s);\n\t\tCAUGHT_validSclDomainLNGroupYEnum = validSclDomainLNGroupYEnum;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_validSclDomainLNGroupYEnum = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or_11 = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%&gt;.INSTANCE.evaluate(CAUGHT_or_10, CAUGHT_validSclDomainLNGroupYEnum);\n\tCAUGHT_or_11 = or_11;\n}\ncatch (&lt;%java.lang.Exception%&gt; e) {\n\tCAUGHT_or_11 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n}\n/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclDomainLNGroupZEnum;\ntry {\n\tfinal /*@Thrown\052/ boolean validSclDomainLNGroupZEnum = this.validSclDomainLNGroupZEnum(s);\n\tCAUGHT_validSclDomainLNGroupZEnum = validSclDomainLNGroupZEnum;\n}\ncatch (&lt;%java.lang.Exception%&gt; e) {\n\tCAUGHT_validSclDomainLNGroupZEnum = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n}\nfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or_12 = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%&gt;.INSTANCE.evaluate(CAUGHT_or_11, CAUGHT_validSclDomainLNGroupZEnum);\nreturn or_12;'"
	 * @generated
	 */
	Boolean validSclDomainLNEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then Set{\'ANCR\', \'ARCO\', \'ARIS\', \'ATCC\', \'AVCO\'}-&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_0, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupAEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then Set{\'CALH\', \'CCGR\', \'CILO\', \'CPOW\', \'CSWI\', \'CSYN\'}-&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_1, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupCEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then\n *   Set{\'FCNT\', \'FCSD\', \'FFIL\', \'FLIM\', \'FPID\', \'FRMP\', \'FSPT\', \'FXOT\', \'FXUT\'\n *   }\n *   -&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_2, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupFEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then Set{\'GAPC\', \'GGIO\', \'GLOG\', \'GSAL\'}-&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_3, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupGEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then Set{\'IARC\', \'IHMI\', \'ISAF\', \'ITCI\', \'ITMI\', \'ITPC\'}-&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_4, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupIEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then Set{\'KFAN\', \'KFIL\', \'KPMP\', \'KTNK\', \'KVLV\'}-&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_5, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupKEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then\n *   Set{\'MDIF\', \'MENV\', \'MFLK\', \'MHAI\', \'MHAN\', \'MHYD\', \'MMDC\', \'MMET\', \'MMTN\', \'MMTR\', \'MMXN\', \'MMXU\', \'MSQI\', \'MSTA\'\n *   }\n *   -&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_6, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupMEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then\n *   Set{\'PDIF\', \'PDIR\', \'PDIS\', \'PDOP\', \'PDUP\', \'PFRC\', \'PHAR\', \'PHIZ\', \'PIOC\', \'PMRI\', \'PMSS\', \'POPF\', \'PPAM\', \'PRTR\', \'PSCH\', \'PSDE\', \'PTEF\', \'PTHF\', \'PTOC\', \'PTOF\', \'PTOV\', \'PTRC\', \'PTTR\', \'PTUC\', \'PTUF\', \'PTUV\', \'PUPF\', \'PVOC\', \'PVPH\', \'PZSU\'\n *   }\n *   -&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_7, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupPEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then Set{\'QFVR\', \'QITR\', \'QIUB\', \'QVTR\', \'QVUB\', \'QVVR\'}-&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_8, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupQEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then\n *   Set{\'RADR\', \'RBDR\', \'RBRF\', \'RDIR\', \'RDRE\', \'RDRS\', \'RFLO\', \'RMXU\', \'RPSB\', \'RREC\', \'RSYN\'\n *   }\n *   -&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_9, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupREnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then\n *   Set{\'SARC\', \'SCBR\', \'SIMG\', \'SIML\', \'SLTC\', \'SOPM\', \'SPDC\', \'SPTR\', \'SSWI\', \'STMP\', \'SVBR\'\n *   }\n *   -&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_10, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupSEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then\n *   Set{\'TANG\', \'TAXD\', \'TCTR\', \'TDST\', \'TFLW\', \'TFRQ\', \'TGSN\', \'THUM\', \'TLVL\', \'TMGF\', \'TMVM\', \'TPOS\', \'TPRS\', \'TRTN\', \'TSND\', \'TTMP\', \'TTNS\', \'TVBR\', \'TVTR\', \'TWPH\'\n *   }\n *   -&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_11, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupTEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then Set{\'XCBR\', \'XSWI\'}-&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_12, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupXEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then Set{\'YEFN\', \'YLTC\', \'YPSH\', \'YPTR\'}-&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_13, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupYEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then\n *   Set{\'ZAXN\', \'ZBAT\', \'ZBSH\', \'ZCAB\', \'ZCAP\', \'ZCON\', \'ZGEN\', \'ZGIL\', \'ZLIN\', \'ZMOT\', \'ZREA\', \'ZRES\', \'ZRRC\', \'ZSAR\', \'ZSCR\', \'ZSMC\', \'ZTCF\', \'ZTCR\'\n *   }\n *   -&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_14, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupZEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * s.size() &lt;= 0\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(s);\nfinal /*@Thrown\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\nreturn le;'"
	 * @generated
	 */
	Boolean validSclEmpty(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * if self.validSclRestrName1stL(s) then s.size() &lt;= 60 else false endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclRestrName1stL = this.validSclRestrName1stL(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclRestrName1stL) {\n\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(s);\n\tfinal /*@Thrown\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_60).booleanValue();\n\tsymbol_0 = le;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclExtensionAttributeNameEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then s.matches(\'[A-Za-z]{1,5}\')\n * else false\n * endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_A_m_Za_m_z_93_123_1_44_5_125).booleanValue();\n\tsymbol_0 = matches;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclExtensionCDCEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then s.size() &gt;= 3 and s.matches(\'E[A-Z]*\')\n * else false\n * endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ &lt;%java.lang.Boolean%&gt; symbol_0;\nif (validSclName) {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_ge;\n\ttry {\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(s);\n\t\tfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_3).booleanValue();\n\t\tCAUGHT_ge = ge;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_ge = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_matches;\n\ttry {\n\t\tfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_E_91_A_m_Z_93_a).booleanValue();\n\t\tCAUGHT_matches = matches;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_matches = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanAndOperation%&gt;.INSTANCE.evaluate(CAUGHT_ge, CAUGHT_matches);\n\tsymbol_0 = and;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclExtensionEquipmentEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then s.size() &gt;= 3 and s.matches(\'E[A-Z]*\')\n * else false\n * endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ &lt;%java.lang.Boolean%&gt; symbol_0;\nif (validSclName) {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_ge;\n\ttry {\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(s);\n\t\tfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_3).booleanValue();\n\t\tCAUGHT_ge = ge;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_ge = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_matches;\n\ttry {\n\t\tfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_E_91_A_m_Z_93_a).booleanValue();\n\t\tCAUGHT_matches = matches;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_matches = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanAndOperation%&gt;.INSTANCE.evaluate(CAUGHT_ge, CAUGHT_matches);\n\tsymbol_0 = and;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclExtensionGeneralEquipmentEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * if self.validSclName(s) then s.matches(\'[A-Z]{4}\') else false endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_A_m_Z_93_123_4_125).booleanValue();\n\tsymbol_0 = matches;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclExtensionLNClassEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then s.matches(\'[A-Z][0-9A-Za-z-]*\')\n * else false\n * endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_A_m_Z_93_91_0_m_9A_m_Za_m_z_m_93_a).booleanValue();\n\tsymbol_0 = matches;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclExtensionPTypeEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * s.matches(\'[A-Z][0-9A-Za-z]*\')\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_A_m_Z_93_91_0_m_9A_m_Za_m_z_93_a).booleanValue();\nreturn matches;'"
	 * @generated
	 */
	Boolean validSclExtensionPhysConnTypeEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * s.matches(\'[a-zA-Z][a-zA-Z0-9]*(([0-9]+))?(.[a-zA-Z][a-zA-Z0-9]*(([0-9]+))?)*\')\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_a_m_zA_m_Z_93_91_a_m_zA_m_Z0_m_9_93_a_o_o_91_0_m_9_93_p_e_e_63_o__91_a_m_zA_m_Z_93_91_a_m_zA_m_Z0_m_9_93_a_o_o_91_0_m_9_93_p_e_e_63).booleanValue();\nreturn matches;'"
	 * @generated
	 */
	Boolean validSclFullAttributeName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * s.matches(\'[A-Z][0-9A-Za-z]{0,11}(.[a-z][0-9A-Za-z]*(([0-9]+))?)?\')\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_A_m_Z_93_91_0_m_9A_m_Za_m_z_93_123_0_44_11_125_o__91_a_m_z_93_91_0_m_9A_m_Za_m_z_93_a_o_o_91_0_m_9_93_p_e_e_63_e_63).booleanValue();\nreturn matches;'"
	 * @generated
	 */
	Boolean validSclFullDOName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if validSclPredefinedGeneralEquipmentEnum(s)\n * then true\n * else validSclExtensionGeneralEquipmentEnum(s)\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclPredefinedGeneralEquipmentEnum = this.validSclPredefinedGeneralEquipmentEnum(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclPredefinedGeneralEquipmentEnum) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@Thrown\052/ boolean validSclExtensionGeneralEquipmentEnum = this.validSclExtensionGeneralEquipmentEnum(s);\n\tsymbol_0 = validSclExtensionGeneralEquipmentEnum;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclGeneralEquipmentEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclVisibleBasicLatin(s)\n * then s.size() &gt;= 1 and s.size() &lt;= 129\n * else false\n * endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclVisibleBasicLatin = this.validSclVisibleBasicLatin(s);\n/*@Thrown\052/ &lt;%java.lang.Boolean%&gt; symbol_0;\nif (validSclVisibleBasicLatin) {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_ge;\n\ttry {\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(s);\n\t\tfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_1).booleanValue();\n\t\tCAUGHT_ge = ge;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_ge = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_le;\n\ttry {\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(s);\n\t\tfinal /*@Thrown\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_129).booleanValue();\n\t\tCAUGHT_le = le;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_le = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanAndOperation%&gt;.INSTANCE.evaluate(CAUGHT_ge, CAUGHT_le);\n\tsymbol_0 = and;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclIEDName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclIEDName(s)\n * then true\n * else self.validSclOnlyRelativeIEDName(s)\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclIEDName = this.validSclIEDName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclIEDName) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@Thrown\052/ boolean validSclOnlyRelativeIEDName = this.validSclOnlyRelativeIEDName(s);\n\tsymbol_0 = validSclOnlyRelativeIEDName;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclIEDNameOrRelative(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * s.matches(\'[A-Za-z0-9][0-9A-Za-z_]{0,63}\')\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_A_m_Za_m_z0_m_9_93_91_0_m_9A_m_Za_m_z__93_123_0_44_63_125).booleanValue();\nreturn matches;'"
	 * @generated
	 */
	Boolean validSclLDInst(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * if self.validSclEmpty(s) then true else self.validSclLDInst(s) endif\n \052/\nfinal /*@Thrown\052/ boolean validSclEmpty = this.validSclEmpty(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclEmpty) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@Thrown\052/ boolean validSclLDInst = this.validSclLDInst(s);\n\tsymbol_0 = validSclLDInst;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclLDInstOrEmpty(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * s.matches(\'[A-Za-z][0-9A-Za-z_]{0,63}\')\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_A_m_Za_m_z_93_91_0_m_9A_m_Za_m_z__93_123_0_44_63_125).booleanValue();\nreturn matches;'"
	 * @generated
	 */
	Boolean validSclLDName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * if self.validSclName(s) then Set{\'LLN0\'}-&gt;includes(s) else false endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_15, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclLLN0Enum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if validSclPredefinedLNClassEnum(s)\n * then true\n * else validSclExtensionLNClassEnum(s)\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclPredefinedLNClassEnum = this.validSclPredefinedLNClassEnum(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclPredefinedLNClassEnum) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@Thrown\052/ boolean validSclExtensionLNClassEnum = this.validSclExtensionLNClassEnum(s);\n\tsymbol_0 = validSclExtensionLNClassEnum;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclLNClassEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * s.matches(\'[0-9]{1,12}\')\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_0_m_9_93_123_1_44_12_125).booleanValue();\nreturn matches;'"
	 * @generated
	 */
	Boolean validSclLNInst(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * if self.validSclEmpty(s) then true else self.validSclLNInst(s) endif\n \052/\nfinal /*@Thrown\052/ boolean validSclEmpty = this.validSclEmpty(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclEmpty) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@Thrown\052/ boolean validSclLNInst = this.validSclLNInst(s);\n\tsymbol_0 = validSclLNInst;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclLNInstOrEmpty(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * if self.validSclName(s) then Set{\'LPHD\'}-&gt;includes(s) else false endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_16, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclLPHDEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * s.size() &gt;= 1\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(s);\nfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_1).booleanValue();\nreturn ge;'"
	 * @generated
	 */
	Boolean validSclLineType(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * if self.validSclAcsiName(s) then s.size() &lt;= 32 else false endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclAcsiName = this.validSclAcsiName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclAcsiName) {\n\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(s);\n\tfinal /*@Thrown\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_32).booleanValue();\n\tsymbol_0 = le;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclLogName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclVisibleBasicLatin(s)\n * then s.size() &lt;= 64\n * else false\n * endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclVisibleBasicLatin = this.validSclVisibleBasicLatin(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclVisibleBasicLatin) {\n\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(s);\n\tfinal /*@Thrown\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_64).booleanValue();\n\tsymbol_0 = le;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclMessageID(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * if self.validSclAnyName(s) then s.size() &gt;= 1 else false endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclAnyName = this.validSclAnyName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclAnyName) {\n\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(s);\n\tfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_1).booleanValue();\n\tsymbol_0 = ge;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * s.matches(\'[ -~]+:20[0-9][0-9][A-Z]?\')\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_32_m_126_93_p_c_20_91_0_m_9_93_91_0_m_9_93_91_A_m_Z_93_63).booleanValue();\nreturn matches;'"
	 * @generated
	 */
	Boolean validSclNamespaceName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * s.matches(\'@\')\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__64).booleanValue();\nreturn matches;'"
	 * @generated
	 */
	Boolean validSclOnlyRelativeIEDName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * s.size() &gt;= 1\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(s);\nfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_1).booleanValue();\nreturn ge;'"
	 * @generated
	 */
	Boolean validSclPAddr(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if validSclPredefinedPTypeEnum(s)\n * then true\n * else validSclExtensionPTypeEnum(s)\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclPredefinedPTypeEnum = this.validSclPredefinedPTypeEnum(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclPredefinedPTypeEnum) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@Thrown\052/ boolean validSclExtensionPTypeEnum = this.validSclExtensionPTypeEnum(s);\n\tsymbol_0 = validSclExtensionPTypeEnum;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclPTypeEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if validSclPredefinedPTypePhysConnEnum(s)\n * then true\n * else validSclExtensionPTypeEnum(s)\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclPredefinedPTypePhysConnEnum = this.validSclPredefinedPTypePhysConnEnum(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclPredefinedPTypePhysConnEnum) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@Thrown\052/ boolean validSclExtensionPTypeEnum = this.validSclExtensionPTypeEnum(s);\n\tsymbol_0 = validSclExtensionPTypeEnum;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclPTypePhysConnEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if validSclPredefinedPhysConnTypeEnum(s)\n * then true\n * else validSclExtensionPhysConnTypeEnum(s)\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclPredefinedPhysConnTypeEnum = this.validSclPredefinedPhysConnTypeEnum(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclPredefinedPhysConnTypeEnum) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@Thrown\052/ boolean validSclExtensionPhysConnTypeEnum = this.validSclExtensionPhysConnTypeEnum(s);\n\tsymbol_0 = validSclExtensionPhysConnTypeEnum;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclPhysConnTypeEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * if self.validSclName(s) then Set{\'PTR\'}-&gt;includes(s) else false endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_17, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclPowerTransformerEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then\n *   Set{\'T\', \'Test\', \'Check\', \'SIUnit\', \'Oper\', \'SBO\', \'SBOw\', \'Cancel\'\n *   }\n *   -&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_18, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclPredefinedAttributeNameEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then\n *   Set{\'BOOLEAN\', \'INT8\', \'INT16\', \'INT24\', \'INT32\', \'INT64\', \'INT128\', \'INT8U\', \'INT16U\', \'INT24U\', \'INT32U\', \'FLOAT32\', \'FLOAT64\', \'Enum\', \'Dbpos\', \'Tcmd\', \'Quality\', \'Timestamp\', \'VisString32\', \'VisString64\', \'VisString65\', \'VisString129\', \'VisString255\', \'Octet64\', \'Unicode255\', \'Struct\', \'EntryTime\', \'Check\', \'ObjRef\', \'Currency\', \'PhyComAddr\', \'TrgOps\', \'OptFlds\', \'SvOptFlds\', \'EntryID\'\n *   }\n *   -&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_19, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclPredefinedBasicTypeEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then\n *   Set{\'SPS\', \'DPS\', \'INS\', \'ENS\', \'ACT\', \'ACD\', \'SEC\', \'BCR\', \'HST\', \'VSS\', \'MV\', \'CMV\', \'SAV\', \'WYE\', \'DEL\', \'SEQ\', \'HMV\', \'HWYE\', \'HDEL\', \'SPC\', \'DPC\', \'INC\', \'ENC\', \'BSC\', \'ISC\', \'APC\', \'BAC\', \'SPG\', \'ING\', \'ENG\', \'ORG\', \'TSG\', \'CUG\', \'VSG\', \'ASG\', \'CURVE\', \'CSG\', \'DPL\', \'LPL\', \'CSD\', \'CST\', \'BTS\', \'UTS\', \'LTS\', \'GTS\', \'MTS\', \'NTS\', \'STS\', \'CTS\', \'OTS\', \'VSD\'\n *   }\n *   -&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_20, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclPredefinedCDCEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then\n *   Set{\'CBR\', \'DIS\', \'VTR\', \'CTR\', \'GEN\', \'CAP\', \'REA\', \'CON\', \'MOT\', \'EFN\', \'PSH\', \'BAT\', \'BSH\', \'CAB\', \'GIL\', \'LIN\', \'RES\', \'RRC\', \'SAR\', \'TCF\', \'TCR\', \'IFL\', \'FAN\', \'SCR\', \'SMC\', \'PMP\'\n *   }\n *   -&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_21, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclPredefinedCommonConductingEquipmentEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then Set{\'AXN\', \'BAT\', \'MOT\', \'FAN\', \'FIL\', \'PMP\', \'TNK\', \'VLV\'}-&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_22, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclPredefinedGeneralEquipmentEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * validSclSystemLNGroupEnum(s) or validSclDomainLNEnum(s)\n \052/\n/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclSystemLNGroupEnum;\ntry {\n\tfinal /*@Thrown\052/ boolean validSclSystemLNGroupEnum = this.validSclSystemLNGroupEnum(s);\n\tCAUGHT_validSclSystemLNGroupEnum = validSclSystemLNGroupEnum;\n}\ncatch (&lt;%java.lang.Exception%&gt; e) {\n\tCAUGHT_validSclSystemLNGroupEnum = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n}\n/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclDomainLNEnum;\ntry {\n\tfinal /*@Thrown\052/ boolean validSclDomainLNEnum = this.validSclDomainLNEnum(s);\n\tCAUGHT_validSclDomainLNEnum = validSclDomainLNEnum;\n}\ncatch (&lt;%java.lang.Exception%&gt; e) {\n\tCAUGHT_validSclDomainLNEnum = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n}\nfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%&gt;.INSTANCE.evaluate(CAUGHT_validSclSystemLNGroupEnum, CAUGHT_validSclDomainLNEnum);\nreturn or;'"
	 * @generated
	 */
	Boolean validSclPredefinedLNClassEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then\n *   Set{\'IP\', \'IP-SUBNET\', \'IP-GATEWAY\', \'OSI-NSAP\', \'OSI-TSEL\', \'OSI-SSEL\', \'OSI-PSEL\', \'OSI-AP-Title\', \'OSI-AP-Invoke\', \'OSI-AE-Qualifier\', \'OSI-AE-Invoke\', \'MAC-Address\', \'APPID\', \'VLAN-PRIORITY\', \'VLAN-ID\', \'SNTP-Port\', \'MMS-Port\', \'DNSName\', \'IPv6FlowLabel\', \'IPv6ClassOfTraffic\', \'C37-118-IP-Port\', \'IP-UDP-PORT\', \'IP-TCP-PORT\', \'IPv6\', \'IPv6-SUBNET\', \'IPv6-GATEWAY\'\n *   }\n *   -&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_23, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclPredefinedPTypeEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then Set{\'Type\', \'Plug\', \'Cable\', \'Port\'}-&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_24, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclPredefinedPTypePhysConnEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * Set{\'Connection\', \'RedConn\'}-&gt;includes(s)\n \052/\nfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_25, s).booleanValue();\nreturn includes;'"
	 * @generated
	 */
	Boolean validSclPredefinedPhysConnTypeEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if s = \'\'\n * then true\n * else s.matches(\'[A-Za-z][0-9A-Za-z_]{0,10}\')\n * endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ boolean eq = &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_.equals(s);\n/*@Thrown\052/ boolean symbol_0;\nif (eq) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_A_m_Za_m_z_93_91_0_m_9A_m_Za_m_z__93_123_0_44_10_125).booleanValue();\n\tsymbol_0 = matches;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclPrefix(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * s.matches(\'.+(/.+)*\')\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__p_o_s__p_e_a).booleanValue();\nreturn matches;'"
	 * @generated
	 */
	Boolean validSclProcessName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * s.size() &gt;= 1\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(s);\nfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_1).booleanValue();\nreturn ge;'"
	 * @generated
	 */
	Boolean validSclProcessType(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then Set{\'none\', \'hsr\', \'prp\', \'rstp\'}-&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_26, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclRedProtEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * s.matches(\'.+/.+/.+/.+(/.+)*\')\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__p_s__p_s__p_s__p_o_s__p_e_a).booleanValue();\nreturn matches;'"
	 * @generated
	 */
	Boolean validSclRef(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * i &gt;= 0 and i &lt;= 255\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\n/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_ge;\ntry {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_i = i == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(i);\n\tfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, BOXED_i, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tCAUGHT_ge = ge;\n}\ncatch (&lt;%java.lang.Exception%&gt; e) {\n\tCAUGHT_ge = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n}\n/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_le;\ntry {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_i_0 = i == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(i);\n\tfinal /*@Thrown\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, BOXED_i_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_255).booleanValue();\n\tCAUGHT_le = le;\n}\ncatch (&lt;%java.lang.Exception%&gt; e) {\n\tCAUGHT_le = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n}\nfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanAndOperation%&gt;.INSTANCE.evaluate(CAUGHT_ge, CAUGHT_le);\nreturn and;'"
	 * @generated
	 */
	Boolean validSclRelease(BigInteger i);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then s.matches(\'[a-z][0-9A-Za-z]*\')\n * else false\n * endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_a_m_z_93_91_0_m_9A_m_Za_m_z_93_a).booleanValue();\n\tsymbol_0 = matches;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclRestrName1stL(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then s.matches(\'[A-Z][0-9A-Za-z]*\')\n * else false\n * endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_A_m_Z_93_91_0_m_9A_m_Za_m_z_93_a).booleanValue();\n\tsymbol_0 = matches;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclRestrName1stU(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * if self.validSclName(s) then s.matches(\'[A-Z]\') else false endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_A_m_Z_93).booleanValue();\n\tsymbol_0 = matches;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclRevision(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * Set{\'full\', \'fix\', \'dataflow\'}-&gt;includes(s)\n \052/\nfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_27, s).booleanValue();\nreturn includes;'"
	 * @generated
	 */
	Boolean validSclRightEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * s.matches(\'[0-9]+\') or self.validSclRestrName1stL(s)\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\n/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_matches;\ntry {\n\tfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_0_m_9_93_p).booleanValue();\n\tCAUGHT_matches = matches;\n}\ncatch (&lt;%java.lang.Exception%&gt; e) {\n\tCAUGHT_matches = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n}\n/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_validSclRestrName1stL;\ntry {\n\tfinal /*@Thrown\052/ boolean validSclRestrName1stL = this.validSclRestrName1stL(s);\n\tCAUGHT_validSclRestrName1stL = validSclRestrName1stL;\n}\ncatch (&lt;%java.lang.Exception%&gt; e) {\n\tCAUGHT_validSclRestrName1stL = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n}\nfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%&gt;.INSTANCE.evaluate(CAUGHT_matches, CAUGHT_validSclRestrName1stL);\nreturn or;'"
	 * @generated
	 */
	Boolean validSclSDOCount(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclRestrName1stL(s)\n * then s.size() &gt;= 1 and s.size() &lt;= 60\n * else false\n * endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclRestrName1stL = this.validSclRestrName1stL(s);\n/*@Thrown\052/ &lt;%java.lang.Boolean%&gt; symbol_0;\nif (validSclRestrName1stL) {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_ge;\n\ttry {\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(s);\n\t\tfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_1).booleanValue();\n\t\tCAUGHT_ge = ge;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_ge = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_le;\n\ttry {\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(s);\n\t\tfinal /*@Thrown\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_60).booleanValue();\n\t\tCAUGHT_le = le;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_le = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanAndOperation%&gt;.INSTANCE.evaluate(CAUGHT_ge, CAUGHT_le);\n\tsymbol_0 = and;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclSubDataName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then\n *   Set{\'LLN0\', \'LPHD\', \'LCCH\', \'LGOS\', \'LSVS\', \'LTIM\', \'LTMS\', \'LTRK\'\n *   }\n *   -&gt;includes(s)\n * else false\n * endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_28, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclSystemLNGroupEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * if self.validSclName(s) then Set{\'PTW\'}-&gt;includes(s) else false endif\n \052/\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.Set_29, s).booleanValue();\n\tsymbol_0 = includes;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclTransformerWindingEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * if self.validSclName(s)\n * then s.matches(\'2[0-2][0-9]{2}\')\n * else false\n * endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean validSclName = this.validSclName(s);\n/*@Thrown\052/ boolean symbol_0;\nif (validSclName) {\n\tfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_2_91_0_m_2_93_91_0_m_9_93_123_2_125).booleanValue();\n\tsymbol_0 = matches;\n}\nelse {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n}\nreturn symbol_0;'"
	 * @generated
	 */
	Boolean validSclVersion(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * s.matches(\'[ -~]*\')\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@Thrown\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, s, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__91_32_m_126_93_a).booleanValue();\nreturn matches;'"
	 * @generated
	 */
	Boolean validSclVisibleBasicLatin(String s);

} // SclObject
