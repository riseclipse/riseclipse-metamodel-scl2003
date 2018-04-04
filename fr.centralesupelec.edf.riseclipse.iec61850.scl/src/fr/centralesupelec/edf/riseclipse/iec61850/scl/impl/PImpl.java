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
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.library.string.StringMatchesOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Address;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.P;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PImpl#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PImpl extends PAddrImpl implements P {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected PImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.P;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Address getAddress() {
		if (eContainerFeatureID() != SclPackage.P__ADDRESS) return null;
		return (Address)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetAddress( Address newAddress, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newAddress, SclPackage.P__ADDRESS, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAddress( Address newAddress ) {
		if (newAddress != eInternalContainer() || (eContainerFeatureID() != SclPackage.P__ADDRESS && newAddress != null)) {
			if (EcoreUtil.isAncestor(this, newAddress))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, SclPackage.ADDRESS__P, Address.class, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.P__ADDRESS, newAddress, newAddress));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP_type_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv P_type_required:
		 *   let severity : Integer[1] = 'P::P_type_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.type <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'type attribute shall be present in P (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'P::P_type_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_P_c_c_P_type_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String type = this.getType();
			final /*@NonInvalid*/ boolean status = type != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_type_32_attribute_32_shall_32_be_32_present_32_in_32_P_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_P_c_c_P_type_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP_type_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv P_type_valid:
		 *   let severity : Integer[1] = 'P::P_type_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.type <> null implies
		 *           self.validSclPTypeEnum(type)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'type attribute shall be valid in P (line ' +
		 *               self.lineNumber.toString() + ')). ' + 'Current value is ' +
		 *               self.type.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'P::P_type_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_P_c_c_P_type_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String type = this.getType();
				final /*@NonInvalid*/ boolean ne = type != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclPTypeEnum = ((SclObject)this).validSclPTypeEnum(type);
					status = validSclPTypeEnum;
				}
				else {
					status = ValueUtil.TRUE_VALUE;
				}
				/*@Thrown*/ Object symbol_1;
				if (status) {
					symbol_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_type_32_attribute_32_shall_32_be_32_valid_32_in_32_P_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e_e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(type);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_P_c_c_P_type_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP_value(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv P_value:
		 *   let severity : Integer[1] = 'P::P_value'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[1] = if self.type = 'IP' or self.type = 'IP-SUBNET' or self.type = 'IP-GATEWAY'
		 *           then
		 *             self.value.matches('([0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5]).([0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5]).([0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5]).([0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])')
		 *           else
		 *             if self.type = 'IPv6' or self.type = 'IPv6-GATEWAY'
		 *             then
		 *               self.value.matches('([0-9a-f]{1,4}:){7}[0-9a-f]{1,4}')
		 *             else
		 *               if self.type = 'IPv6-SUBNET'
		 *               then
		 *                 self.value.matches('/[1-9]|/[1-9][0-9]|/1[0-1][0-9]|/12[0-7]')
		 *               else
		 *                 if self.type = 'DNSName'
		 *                 then
		 *                   self.value.matches('[- \t\n\u000B\f\r]*')
		 *                 else
		 *                   if self.type = 'IPv6FlowLabel'
		 *                   then
		 *                     self.value.matches('[0-9a-fA-F]{1,5}')
		 *                   else
		 *                     if self.type = 'OSI-NSAP'
		 *                     then self.value.matches('[0-9A-F]{1,40}')
		 *                     else
		 *                       if self.type = 'OSI-TSEL'
		 *                       then self.value.matches('[0-9A-F]{1,8}')
		 *                       else true
		 *                       endif
		 *                     endif
		 *                   endif
		 *                 endif
		 *               endif
		 *             endif
		 *           endif
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'content shall be valid according to its type in P (line ' +
		 *               self.lineNumber.toString() + ')). ' + 'Current value is ' +
		 *               self.value.toString() + ' for type ' +
		 *               self.type.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'P::P_value'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_P_c_c_P_value);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_8;
		if (le) {
			symbol_8 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_7;
			try {
				final /*@NonInvalid*/ String type_1 = this.getType();
				final /*@NonInvalid*/ boolean eq = SclTables.STR_IP.equals(type_1);
				/*@NonInvalid*/ boolean or;
				if (eq) {
					or = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ boolean eq_0 = SclTables.STR_IP_m_SUBNET.equals(type_1);
					or = eq_0;
				}
				/*@NonInvalid*/ boolean or_0;
				if (or) {
					or_0 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ boolean eq_1 = SclTables.STR_IP_m_GATEWAY.equals(type_1);
					or_0 = eq_1;
				}
				/*@Thrown*/ boolean status;
				if (or_0) {
					final /*@NonInvalid*/ String value = this.getValue();
					final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, value, SclTables.STR__o_91_0_m_9_93_123_1_44_2_125_124_1_91_0_m_9_93_123_2_125_124_2_91_0_m_4_93_91_0_m_9_93_124_25_91_0_m_5_93_e__o_91_0_m_9_93_123_1_44_2_125_124_1_91_0_m_9_93_123_2_125).booleanValue();
					status = matches;
				}
				else {
					final /*@NonInvalid*/ boolean eq_2 = SclTables.STR_IPv6.equals(type_1);
					/*@NonInvalid*/ boolean or_1;
					if (eq_2) {
						or_1 = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ boolean eq_3 = SclTables.STR_IPv6_m_GATEWAY.equals(type_1);
						or_1 = eq_3;
					}
					/*@Thrown*/ boolean symbol_5;
					if (or_1) {
						final /*@NonInvalid*/ String value_0 = this.getValue();
						final /*@Thrown*/ boolean matches_0 = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, value_0, SclTables.STR__o_91_0_m_9a_m_f_93_123_1_44_4_125_c_e_123_7_125_91_0_m_9a_m_f_93_123_1_44_4_125).booleanValue();
						symbol_5 = matches_0;
					}
					else {
						final /*@NonInvalid*/ boolean eq_4 = SclTables.STR_IPv6_m_SUBNET.equals(type_1);
						/*@Thrown*/ boolean symbol_4;
						if (eq_4) {
							final /*@NonInvalid*/ String value_1 = this.getValue();
							final /*@Thrown*/ boolean matches_1 = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, value_1, SclTables.STR__s_91_1_m_9_93_124_s_91_1_m_9_93_91_0_m_9_93_124_s_1_91_0_m_1_93_91_0_m_9_93_124_s_12_91_0_m_7_93).booleanValue();
							symbol_4 = matches_1;
						}
						else {
							final /*@NonInvalid*/ boolean eq_5 = SclTables.STR_DNSName.equals(type_1);
							/*@Thrown*/ boolean symbol_3;
							if (eq_5) {
								final /*@NonInvalid*/ String value_2 = this.getValue();
								final /*@Thrown*/ boolean matches_2 = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, value_2, SclTables.STR__91_m_32_9_10_11_12_13_93_a).booleanValue();
								symbol_3 = matches_2;
							}
							else {
								final /*@NonInvalid*/ boolean eq_6 = SclTables.STR_IPv6FlowLabel.equals(type_1);
								/*@Thrown*/ boolean symbol_2;
								if (eq_6) {
									final /*@NonInvalid*/ String value_3 = this.getValue();
									final /*@Thrown*/ boolean matches_3 = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, value_3, SclTables.STR__91_0_m_9a_m_fA_m_F_93_123_1_44_5_125).booleanValue();
									symbol_2 = matches_3;
								}
								else {
									final /*@NonInvalid*/ boolean eq_7 = SclTables.STR_OSI_m_NSAP.equals(type_1);
									/*@Thrown*/ boolean symbol_1;
									if (eq_7) {
										final /*@NonInvalid*/ String value_4 = this.getValue();
										final /*@Thrown*/ boolean matches_4 = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, value_4, SclTables.STR__91_0_m_9A_m_F_93_123_1_44_40_125).booleanValue();
										symbol_1 = matches_4;
									}
									else {
										final /*@NonInvalid*/ boolean eq_8 = SclTables.STR_OSI_m_TSEL.equals(type_1);
										/*@Thrown*/ boolean symbol_0;
										if (eq_8) {
											final /*@NonInvalid*/ String value_5 = this.getValue();
											final /*@Thrown*/ boolean matches_5 = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, value_5, SclTables.STR__91_0_m_9A_m_F_93_123_1_44_8_125).booleanValue();
											symbol_0 = matches_5;
										}
										else {
											symbol_0 = ValueUtil.TRUE_VALUE;
										}
										symbol_1 = symbol_0;
									}
									symbol_2 = symbol_1;
								}
								symbol_3 = symbol_2;
							}
							symbol_4 = symbol_3;
						}
						symbol_5 = symbol_4;
					}
					status = symbol_5;
				}
				/*@Thrown*/ Object symbol_7;
				if (status) {
					symbol_7 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_content_32_shall_32_be_32_valid_32_according_32_to_32_its_32_type_32_in_32_P_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e_e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@NonInvalid*/ String value_6 = this.getValue();
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(value_6);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ String sum_3 = StringConcatOperation.INSTANCE.evaluate(sum_2, SclTables.STR__32_for_32_type_32);
					final /*@Thrown*/ String toString_1 = OclAnyToStringOperation.INSTANCE.evaluate(type_1);
					final /*@Thrown*/ String sum_4 = StringConcatOperation.INSTANCE.evaluate(sum_3, toString_1);
					final /*@Thrown*/ TupleValue symbol_6 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_4, status);
					symbol_7 = symbol_6;
				}
				CAUGHT_symbol_7 = symbol_7;
			}
			catch (Exception e) {
				CAUGHT_symbol_7 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_P_c_c_P_value, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_7, SclTables.INT_0).booleanValue();
			symbol_8 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_8;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.P__ADDRESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAddress((Address)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.P__ADDRESS:
				return basicSetAddress(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs ) {
		switch (eContainerFeatureID()) {
			case SclPackage.P__ADDRESS:
				return eInternalContainer().eInverseRemove(this, SclPackage.ADDRESS__P, Address.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
		switch (featureID) {
			case SclPackage.P__ADDRESS:
				return getAddress();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet( int featureID, Object newValue ) {
		switch (featureID) {
			case SclPackage.P__ADDRESS:
				setAddress((Address)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset( int featureID ) {
		switch (featureID) {
			case SclPackage.P__ADDRESS:
				setAddress((Address)null);
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet( int featureID ) {
		switch (featureID) {
			case SclPackage.P__ADDRESS:
				return getAddress() != null;
		}
		return super.eIsSet(featureID);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SclPackage.P___VALIDATE_PTYPE_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateP_type_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.P___VALIDATE_PTYPE_VALID__DIAGNOSTICCHAIN_MAP:
				return validateP_type_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.P___VALIDATE_PVALUE__DIAGNOSTICCHAIN_MAP:
				return validateP_value((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PImpl
