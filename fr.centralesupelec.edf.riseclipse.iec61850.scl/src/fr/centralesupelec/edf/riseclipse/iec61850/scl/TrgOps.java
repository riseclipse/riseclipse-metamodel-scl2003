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
 * A representation of the model object '<em><b>Trg Ops</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getDchg <em>Dchg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getDupd <em>Dupd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getGi <em>Gi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getQchg <em>Qchg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getControlWithTriggerOpt <em>Control With Trigger Opt</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTrgOps()
 * @model
 * @generated
 */
public interface TrgOps extends SclObject {
    /**
	 * Returns the value of the '<em><b>Dchg</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dchg</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Dchg</em>' attribute.
	 * @see #isSetDchg()
	 * @see #unsetDchg()
	 * @see #setDchg(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTrgOps_Dchg()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!TrgOps!dchg'"
	 * @generated
	 */
    Boolean getDchg();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getDchg <em>Dchg</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dchg</em>' attribute.
	 * @see #isSetDchg()
	 * @see #unsetDchg()
	 * @see #getDchg()
	 * @generated
	 */
    void setDchg( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getDchg <em>Dchg</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetDchg()
	 * @see #getDchg()
	 * @see #setDchg(Boolean)
	 * @generated
	 */
    void unsetDchg();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getDchg <em>Dchg</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dchg</em>' attribute is set.
	 * @see #unsetDchg()
	 * @see #getDchg()
	 * @see #setDchg(Boolean)
	 * @generated
	 */
    boolean isSetDchg();

    /**
	 * Returns the value of the '<em><b>Dupd</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dupd</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Dupd</em>' attribute.
	 * @see #isSetDupd()
	 * @see #unsetDupd()
	 * @see #setDupd(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTrgOps_Dupd()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!TrgOps!dupd'"
	 * @generated
	 */
    Boolean getDupd();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getDupd <em>Dupd</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dupd</em>' attribute.
	 * @see #isSetDupd()
	 * @see #unsetDupd()
	 * @see #getDupd()
	 * @generated
	 */
    void setDupd( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getDupd <em>Dupd</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetDupd()
	 * @see #getDupd()
	 * @see #setDupd(Boolean)
	 * @generated
	 */
    void unsetDupd();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getDupd <em>Dupd</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dupd</em>' attribute is set.
	 * @see #unsetDupd()
	 * @see #getDupd()
	 * @see #setDupd(Boolean)
	 * @generated
	 */
    boolean isSetDupd();

    /**
	 * Returns the value of the '<em><b>Gi</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gi</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Gi</em>' attribute.
	 * @see #isSetGi()
	 * @see #unsetGi()
	 * @see #setGi(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTrgOps_Gi()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!TrgOps!gi'"
	 * @generated
	 */
    Boolean getGi();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getGi <em>Gi</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gi</em>' attribute.
	 * @see #isSetGi()
	 * @see #unsetGi()
	 * @see #getGi()
	 * @generated
	 */
    void setGi( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getGi <em>Gi</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetGi()
	 * @see #getGi()
	 * @see #setGi(Boolean)
	 * @generated
	 */
    void unsetGi();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getGi <em>Gi</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gi</em>' attribute is set.
	 * @see #unsetGi()
	 * @see #getGi()
	 * @see #setGi(Boolean)
	 * @generated
	 */
    boolean isSetGi();

    /**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Period</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #isSetPeriod()
	 * @see #unsetPeriod()
	 * @see #setPeriod(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTrgOps_Period()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!TrgOps!period'"
	 * @generated
	 */
    Boolean getPeriod();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #isSetPeriod()
	 * @see #unsetPeriod()
	 * @see #getPeriod()
	 * @generated
	 */
    void setPeriod( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetPeriod()
	 * @see #getPeriod()
	 * @see #setPeriod(Boolean)
	 * @generated
	 */
    void unsetPeriod();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getPeriod <em>Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Period</em>' attribute is set.
	 * @see #unsetPeriod()
	 * @see #getPeriod()
	 * @see #setPeriod(Boolean)
	 * @generated
	 */
    boolean isSetPeriod();

    /**
	 * Returns the value of the '<em><b>Qchg</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Qchg</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Qchg</em>' attribute.
	 * @see #isSetQchg()
	 * @see #unsetQchg()
	 * @see #setQchg(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTrgOps_Qchg()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!TrgOps!qchg'"
	 * @generated
	 */
    Boolean getQchg();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getQchg <em>Qchg</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qchg</em>' attribute.
	 * @see #isSetQchg()
	 * @see #unsetQchg()
	 * @see #getQchg()
	 * @generated
	 */
    void setQchg( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getQchg <em>Qchg</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetQchg()
	 * @see #getQchg()
	 * @see #setQchg(Boolean)
	 * @generated
	 */
    void unsetQchg();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getQchg <em>Qchg</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qchg</em>' attribute is set.
	 * @see #unsetQchg()
	 * @see #getQchg()
	 * @see #setQchg(Boolean)
	 * @generated
	 */
    boolean isSetQchg();

    /**
	 * Returns the value of the '<em><b>Control With Trigger Opt</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt#getTrgOps <em>Trg Ops</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Control With Trigger Opt</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Control With Trigger Opt</em>' container reference.
	 * @see #setControlWithTriggerOpt(ControlWithTriggerOpt)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTrgOps_ControlWithTriggerOpt()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt#getTrgOps
	 * @model opposite="TrgOps" resolveProxies="false" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!TrgOps!ControlWithTriggerOpt'"
	 * @generated
	 */
    ControlWithTriggerOpt getControlWithTriggerOpt();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getControlWithTriggerOpt <em>Control With Trigger Opt</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control With Trigger Opt</em>' container reference.
	 * @see #getControlWithTriggerOpt()
	 * @generated
	 */
    void setControlWithTriggerOpt( ControlWithTriggerOpt value );

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TrgOps_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv TrgOps_nothing: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean validateTrgOps_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TrgOps
