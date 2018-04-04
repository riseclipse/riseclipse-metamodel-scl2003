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
 * A representation of the model object '<em><b>Sampled Value Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getNofASDU <em>Nof ASDU</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSecurityEnable <em>Security Enable</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmpMod <em>Smp Mod</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmpRate <em>Smp Rate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmvID <em>Smv ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getLN0 <em>LN0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmvOpts <em>Smv Opts</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSampledValueControl()
 * @model
 * @generated
 */
public interface SampledValueControl extends ControlWithIEDName {
    /**
	 * Returns the value of the '<em><b>Multicast</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Multicast</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Multicast</em>' attribute.
	 * @see #isSetMulticast()
	 * @see #unsetMulticast()
	 * @see #setMulticast(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSampledValueControl_Multicast()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!SampledValueControl!multicast'"
	 * @generated
	 */
    Boolean getMulticast();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getMulticast <em>Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multicast</em>' attribute.
	 * @see #isSetMulticast()
	 * @see #unsetMulticast()
	 * @see #getMulticast()
	 * @generated
	 */
    void setMulticast( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getMulticast <em>Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetMulticast()
	 * @see #getMulticast()
	 * @see #setMulticast(Boolean)
	 * @generated
	 */
    void unsetMulticast();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getMulticast <em>Multicast</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multicast</em>' attribute is set.
	 * @see #unsetMulticast()
	 * @see #getMulticast()
	 * @see #setMulticast(Boolean)
	 * @generated
	 */
    boolean isSetMulticast();

    /**
	 * Returns the value of the '<em><b>Nof ASDU</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nof ASDU</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Nof ASDU</em>' attribute.
	 * @see #isSetNofASDU()
	 * @see #unsetNofASDU()
	 * @see #setNofASDU(Integer)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSampledValueControl_NofASDU()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!SampledValueControl!nofASDU'"
	 * @generated
	 */
    Integer getNofASDU();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getNofASDU <em>Nof ASDU</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nof ASDU</em>' attribute.
	 * @see #isSetNofASDU()
	 * @see #unsetNofASDU()
	 * @see #getNofASDU()
	 * @generated
	 */
    void setNofASDU( Integer value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getNofASDU <em>Nof ASDU</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetNofASDU()
	 * @see #getNofASDU()
	 * @see #setNofASDU(Integer)
	 * @generated
	 */
    void unsetNofASDU();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getNofASDU <em>Nof ASDU</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nof ASDU</em>' attribute is set.
	 * @see #unsetNofASDU()
	 * @see #getNofASDU()
	 * @see #setNofASDU(Integer)
	 * @generated
	 */
    boolean isSetNofASDU();

    /**
	 * Returns the value of the '<em><b>Security Enable</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PredefinedTypeOfSecurityEnum}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Security Enable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Enable</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PredefinedTypeOfSecurityEnum
	 * @see #isSetSecurityEnable()
	 * @see #unsetSecurityEnable()
	 * @see #setSecurityEnable(PredefinedTypeOfSecurityEnum)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSampledValueControl_SecurityEnable()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!SampledValueControl!securityEnable'"
	 * @generated
	 */
    PredefinedTypeOfSecurityEnum getSecurityEnable();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSecurityEnable <em>Security Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Enable</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PredefinedTypeOfSecurityEnum
	 * @see #isSetSecurityEnable()
	 * @see #unsetSecurityEnable()
	 * @see #getSecurityEnable()
	 * @generated
	 */
    void setSecurityEnable( PredefinedTypeOfSecurityEnum value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSecurityEnable <em>Security Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetSecurityEnable()
	 * @see #getSecurityEnable()
	 * @see #setSecurityEnable(PredefinedTypeOfSecurityEnum)
	 * @generated
	 */
    void unsetSecurityEnable();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSecurityEnable <em>Security Enable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security Enable</em>' attribute is set.
	 * @see #unsetSecurityEnable()
	 * @see #getSecurityEnable()
	 * @see #setSecurityEnable(PredefinedTypeOfSecurityEnum)
	 * @generated
	 */
    boolean isSetSecurityEnable();

    /**
	 * Returns the value of the '<em><b>Smp Mod</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpMod}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Smp Mod</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Smp Mod</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpMod
	 * @see #isSetSmpMod()
	 * @see #unsetSmpMod()
	 * @see #setSmpMod(SmpMod)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSampledValueControl_SmpMod()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!SampledValueControl!smpMod'"
	 * @generated
	 */
    SmpMod getSmpMod();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmpMod <em>Smp Mod</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smp Mod</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpMod
	 * @see #isSetSmpMod()
	 * @see #unsetSmpMod()
	 * @see #getSmpMod()
	 * @generated
	 */
    void setSmpMod( SmpMod value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmpMod <em>Smp Mod</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetSmpMod()
	 * @see #getSmpMod()
	 * @see #setSmpMod(SmpMod)
	 * @generated
	 */
    void unsetSmpMod();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmpMod <em>Smp Mod</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Smp Mod</em>' attribute is set.
	 * @see #unsetSmpMod()
	 * @see #getSmpMod()
	 * @see #setSmpMod(SmpMod)
	 * @generated
	 */
    boolean isSetSmpMod();

    /**
	 * Returns the value of the '<em><b>Smp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Smp Rate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Smp Rate</em>' attribute.
	 * @see #isSetSmpRate()
	 * @see #unsetSmpRate()
	 * @see #setSmpRate(Integer)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSampledValueControl_SmpRate()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!SampledValueControl!smpRate'"
	 * @generated
	 */
    Integer getSmpRate();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmpRate <em>Smp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smp Rate</em>' attribute.
	 * @see #isSetSmpRate()
	 * @see #unsetSmpRate()
	 * @see #getSmpRate()
	 * @generated
	 */
    void setSmpRate( Integer value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmpRate <em>Smp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetSmpRate()
	 * @see #getSmpRate()
	 * @see #setSmpRate(Integer)
	 * @generated
	 */
    void unsetSmpRate();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmpRate <em>Smp Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Smp Rate</em>' attribute is set.
	 * @see #unsetSmpRate()
	 * @see #getSmpRate()
	 * @see #setSmpRate(Integer)
	 * @generated
	 */
    boolean isSetSmpRate();

    /**
	 * Returns the value of the '<em><b>Smv ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Smv ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Smv ID</em>' attribute.
	 * @see #isSetSmvID()
	 * @see #unsetSmvID()
	 * @see #setSmvID(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSampledValueControl_SmvID()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!SampledValueControl!smvID'"
	 * @generated
	 */
    String getSmvID();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmvID <em>Smv ID</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smv ID</em>' attribute.
	 * @see #isSetSmvID()
	 * @see #unsetSmvID()
	 * @see #getSmvID()
	 * @generated
	 */
    void setSmvID( String value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmvID <em>Smv ID</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetSmvID()
	 * @see #getSmvID()
	 * @see #setSmvID(String)
	 * @generated
	 */
    void unsetSmvID();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmvID <em>Smv ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Smv ID</em>' attribute is set.
	 * @see #unsetSmvID()
	 * @see #getSmvID()
	 * @see #setSmvID(String)
	 * @generated
	 */
    boolean isSetSmvID();

    /**
	 * Returns the value of the '<em><b>LN0</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getSampledValueControl <em>Sampled Value Control</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LN0</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>LN0</em>' container reference.
	 * @see #setLN0(LN0)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSampledValueControl_LN0()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getSampledValueControl
	 * @model opposite="SampledValueControl" resolveProxies="false" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!SampledValueControl!LN0'"
	 * @generated
	 */
    LN0 getLN0();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getLN0 <em>LN0</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LN0</em>' container reference.
	 * @see #getLN0()
	 * @generated
	 */
    void setLN0( LN0 value );

    /**
	 * Returns the value of the '<em><b>Smv Opts</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSampledValueControl <em>Sampled Value Control</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Smv Opts</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Smv Opts</em>' containment reference.
	 * @see #isSetSmvOpts()
	 * @see #unsetSmvOpts()
	 * @see #setSmvOpts(SmvOpts)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSampledValueControl_SmvOpts()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSampledValueControl
	 * @model opposite="SampledValueControl" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!SampledValueControl!SmvOpts'"
	 * @generated
	 */
    SmvOpts getSmvOpts();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmvOpts <em>Smv Opts</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smv Opts</em>' containment reference.
	 * @see #isSetSmvOpts()
	 * @see #unsetSmvOpts()
	 * @see #getSmvOpts()
	 * @generated
	 */
    void setSmvOpts( SmvOpts value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmvOpts <em>Smv Opts</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetSmvOpts()
	 * @see #getSmvOpts()
	 * @see #setSmvOpts(SmvOpts)
	 * @generated
	 */
    void unsetSmvOpts();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmvOpts <em>Smv Opts</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Smv Opts</em>' containment reference is set.
	 * @see #unsetSmvOpts()
	 * @see #getSmvOpts()
	 * @see #setSmvOpts(SmvOpts)
	 * @generated
	 */
    boolean isSetSmvOpts();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_smvID_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv SampledValueControl_smvID_required:\n *   let\n *     severity : Integer[1] = \'SampledValueControl::SampledValueControl_smvID_required\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[1] = self.smvID &lt;&gt; null\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'smvID attribute shall be present in SampledValueControl (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'SampledValueControl::SampledValueControl_smvID_required\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_smvID_required);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; smvID = this.getSmvID();\n\tfinal /*@NonInvalid\052/ boolean status = smvID != null;\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (status) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_smvID_32_attribute_32_shall_32_be_32_present_32_in_32_SampledValueControl_32_o_line_32, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_smvID_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateSampledValueControl_smvID_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_smvID_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv SampledValueControl_smvID_valid:\n *   let\n *     severity : Integer[1] = \'SampledValueControl::SampledValueControl_smvID_valid\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.smvID &lt;&gt; null implies\n *           self.validSclMessageID(smvID)\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'smvID attribute shall be present in SampledValueControl (line \' +\n *               self.lineNumber.toString() + \'). \' + \'Current value is \' +\n *               self.smvID.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'SampledValueControl::SampledValueControl_smvID_valid\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_smvID_valid);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; smvID_0 = this.getSmvID();\n\t\tfinal /*@NonInvalid\052/ boolean ne = smvID_0 != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@Thrown\052/ boolean validSclMessageID = ((&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject%&gt;)this).validSclMessageID(smvID_0);\n\t\t\tstatus = validSclMessageID;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_smvID_32_attribute_32_shall_32_be_32_present_32_in_32_SampledValueControl_32_o_line_32, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e__32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(smvID_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_smvID_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateSampledValueControl_smvID_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_smpRate_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv SampledValueControl_smpRate_required:\n *   let\n *     severity : Integer[1] = \'SampledValueControl::SampledValueControl_smpRate_required\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[1] = self.smpRate &lt;&gt; null\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'smpRate attribute shall be present in SampledValueControl (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'SampledValueControl::SampledValueControl_smpRate_required\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_smpRate_required);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.lang.Integer%&gt; smpRate = this.getSmpRate();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_smpRate = smpRate == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(smpRate);\n\tfinal /*@NonInvalid\052/ boolean status = BOXED_smpRate != null;\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (status) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_smpRate_32_attribute_32_shall_32_be_32_present_32_in_32_SampledValueControl_32_o_line_32, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_smpRate_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateSampledValueControl_smpRate_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_smpRate_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv SampledValueControl_smpRate_valid:\n *   let\n *     severity : Integer[1] = \'SampledValueControl::SampledValueControl_smpRate_valid\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.smpRate &lt;&gt; null implies self.smpRate &gt;= 0\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'smpRate attribute shall be valid in SampledValueControl (line \' +\n *               self.lineNumber.toString() + \'). \' + \'Current value is \' +\n *               self.smpRate.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'SampledValueControl::SampledValueControl_smpRate_valid\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_smpRate_valid);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Integer%&gt; smpRate_0 = this.getSmpRate();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_smpRate_0 = smpRate_0 == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(smpRate_0);\n\t\tfinal /*@NonInvalid\052/ boolean ne = BOXED_smpRate_0 != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, BOXED_smpRate_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\t\t\tstatus = ge;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_smpRate_32_attribute_32_shall_32_be_32_valid_32_in_32_SampledValueControl_32_o_line_32, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e__32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_smpRate_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_smpRate_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateSampledValueControl_smpRate_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_nofASDU_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv SampledValueControl_nofASDU_required:\n *   let\n *     severity : Integer[1] = \'SampledValueControl::SampledValueControl_nofASDU_required\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[1] = self.nofASDU &lt;&gt; null\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'nofASDU attribute shall be present in SampledValueControl (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'SampledValueControl::SampledValueControl_nofASDU_required\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_nofASDU_required);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.lang.Integer%&gt; nofASDU = this.getNofASDU();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_nofASDU = nofASDU == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(nofASDU);\n\tfinal /*@NonInvalid\052/ boolean status = BOXED_nofASDU != null;\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (status) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_nofASDU_32_attribute_32_shall_32_be_32_present_32_in_32_SampledValueControl_32_o_line_32, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_nofASDU_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateSampledValueControl_nofASDU_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_nofASDU_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv SampledValueControl_nofASDU_valid:\n *   let\n *     severity : Integer[1] = \'SampledValueControl::SampledValueControl_nofASDU_valid\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.nofASDU &lt;&gt; null implies self.nofASDU &gt;= 0\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'nofASDU attribute shall be present in SampledValueControl (line \' +\n *               self.lineNumber.toString() + \'). \' + \'Current value is \' +\n *               self.nofASDU.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'SampledValueControl::SampledValueControl_nofASDU_valid\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_nofASDU_valid);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Integer%&gt; nofASDU = this.getNofASDU();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_nofASDU = nofASDU == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(nofASDU);\n\t\tfinal /*@NonInvalid\052/ boolean ne = BOXED_nofASDU != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, BOXED_nofASDU, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\t\t\tstatus = ge;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_nofASDU_32_attribute_32_shall_32_be_32_present_32_in_32_SampledValueControl_32_o_line_32, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e__32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_nofASDU);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_nofASDU_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateSampledValueControl_nofASDU_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_confRev_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv SampledValueControl_confRev_required:\n *   let\n *     severity : Integer[1] = \'SampledValueControl::SampledValueControl_confRev_required\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[1] = self.confRev &lt;&gt; null\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'confRev attribute shall be present in SampledValueControl (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'SampledValueControl::SampledValueControl_confRev_required\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_confRev_required);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.lang.Integer%&gt; confRev = this.getConfRev();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_confRev = confRev == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(confRev);\n\tfinal /*@NonInvalid\052/ boolean status = BOXED_confRev != null;\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (status) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_confRev_32_attribute_32_shall_32_be_32_present_32_in_32_SampledValueControl_32_o_line_32, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_confRev_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateSampledValueControl_confRev_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_confRev_unsignedInt'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv SampledValueControl_confRev_unsignedInt:\n *   let\n *     severity : Integer[1] = \'SampledValueControl::SampledValueControl_confRev_unsignedInt\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.confRev &lt;&gt; null implies self.confRev &gt;= 0\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'confRev attribute shall be valid in SampledValueControl (line \' +\n *               self.lineNumber.toString() + \'). \' + \'Current value is \' +\n *               self.confRev.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'SampledValueControl::SampledValueControl_confRev_unsignedInt\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_confRev_unsignedInt);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Integer%&gt; confRev_0 = this.getConfRev();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_confRev_0 = confRev_0 == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(confRev_0);\n\t\tfinal /*@NonInvalid\052/ boolean ne = BOXED_confRev_0 != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, BOXED_confRev_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\t\t\tstatus = ge;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_confRev_32_attribute_32_shall_32_be_32_valid_32_in_32_SampledValueControl_32_o_line_32, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e__32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_confRev_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_confRev_unsignedInt, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateSampledValueControl_confRev_unsignedInt(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_one_SmvOpts_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv SampledValueControl_one_SmvOpts_required:\n *   let\n *     severity : Integer[1] = \'SampledValueControl::SampledValueControl_one_SmvOpts_required\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[1] = self.SmvOpts &lt;&gt; null\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'SampledValueControl shall contain a SmvOpts (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'SampledValueControl::SampledValueControl_one_SmvOpts_required\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_one_SmvOpts_required);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts%&gt; SmvOpts = this.getSmvOpts();\n\tfinal /*@NonInvalid\052/ boolean status = SmvOpts != null;\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (status) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_32_shall_32_contain_32_a_32_SmvOpts_32_o_line_32, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_one_SmvOpts_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateSampledValueControl_one_SmvOpts_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_multicast'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv SampledValueControl_multicast:\n *   let\n *     severity : Integer[1] = \'SampledValueControl::SampledValueControl_multicast\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = not self.multicast implies\n *           self.IEDName-&gt;size() &lt;= 1\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'If Multicast is FALSE, a maximum of one client IED shall be assigned to the SampledValueControl (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'SampledValueControl::SampledValueControl_multicast\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_multicast);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_3;\nif (le) {\n\tsymbol_3 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_2;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; multicast = this.getMulticast();\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; not = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanNotOperation%&gt;.INSTANCE.evaluate(multicast);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName%&gt;&gt; IEDName = this.getIEDName();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_IEDName = idResolver.createSetOfAll(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.SET_CLSSid_IEDName, IEDName);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation%&gt;.INSTANCE.evaluate(BOXED_IEDName);\n\t\tfinal /*@NonInvalid\052/ boolean le_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_1).booleanValue();\n\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; status = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation%&gt;.INSTANCE.evaluate(not, le_0);\n\t\tfinal /*@Thrown\052/ boolean symbol_0 = status == Boolean.TRUE;\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_2;\n\t\tif (symbol_0) {\n\t\t\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_If_32_Multicast_32_is_32_FALSE_44_32_a_32_maximum_32_of_32_one_32_client_32_IED_32_shall_32_be_32_assi, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\t\tsymbol_2 = symbol_1;\n\t\t}\n\t\tCAUGHT_symbol_2 = symbol_2;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_SampledValueControl_c_c_SampledValueControl_multicast, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_2, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_3 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_3;'"
	 * @generated
	 */
	boolean validateSampledValueControl_multicast(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SampledValueControl
