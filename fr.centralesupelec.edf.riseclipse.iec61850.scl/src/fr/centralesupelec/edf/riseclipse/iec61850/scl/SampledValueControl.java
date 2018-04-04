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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'smvID attribute shall be present in SampledValueControl (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.smvID &lt;&gt; null\n\n     \n}.status'"
	 * @generated
	 */
	boolean validateSampledValueControl_smvID_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_smvID_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'smvID attribute shall be present in SampledValueControl (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.smvID.toString()\n        ,\n\tstatus : Boolean = \n        self.smvID &lt;&gt; null implies self.validSclMessageID( smvID )\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateSampledValueControl_smvID_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_smpRate_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'smpRate attribute shall be present in SampledValueControl (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.smpRate &lt;&gt; null\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateSampledValueControl_smpRate_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_smpRate_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'smpRate attribute shall be valid in SampledValueControl (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.smpRate.toString()\n        ,\n\tstatus : Boolean = \n        self.smpRate &lt;&gt; null implies self.smpRate &gt;= 0\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateSampledValueControl_smpRate_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_nofASDU_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'nofASDU attribute shall be present in SampledValueControl (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.nofASDU &lt;&gt; null\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateSampledValueControl_nofASDU_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_nofASDU_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'nofASDU attribute shall be present in SampledValueControl (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.nofASDU.toString()\n        ,\n\tstatus : Boolean = \n        self.nofASDU &lt;&gt; null implies self.nofASDU &gt;= 0\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateSampledValueControl_nofASDU_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_confRev_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'confRev attribute shall be present in SampledValueControl (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.confRev &lt;&gt; null\n    \n    \n}.status'"
	 * @generated
	 */
	boolean validateSampledValueControl_confRev_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_confRev_unsignedInt'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'confRev attribute shall be valid in SampledValueControl (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.confRev.toString()\n        ,\n\tstatus : Boolean = \n        self.confRev &lt;&gt; null implies self.confRev &gt;= 0\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateSampledValueControl_confRev_unsignedInt(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_one_SmvOpts_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'SampledValueControl shall contain a SmvOpts (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.SmvOpts &lt;&gt; null\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateSampledValueControl_one_SmvOpts_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SampledValueControl_multicast'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'If Multicast is FALSE, a maximum of one client IED shall be assigned to the SampledValueControl (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        ( not self.multicast ) implies self.IEDName-&gt;size() &lt;= 1\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateSampledValueControl_multicast(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SampledValueControl
