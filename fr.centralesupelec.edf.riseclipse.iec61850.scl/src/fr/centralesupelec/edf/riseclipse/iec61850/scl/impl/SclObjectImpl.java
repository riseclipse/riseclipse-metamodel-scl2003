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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanAndOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanOrOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.StringMatchesOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclObjectImpl#getLineNumber <em>Line Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SclObjectImpl extends MinimalEObjectImpl.Container implements SclObject {
    /**
	 * The default value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
    protected static final int LINE_NUMBER_EDEFAULT = -1;

    /**
	 * The cached value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
    protected int lineNumber = LINE_NUMBER_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SclObjectImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.SCL_OBJECT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getLineNumber() {
		return lineNumber;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLineNumber( int newLineNumber ) {
		int oldLineNumber = lineNumber;
		lineNumber = newLineNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SCL_OBJECT__LINE_NUMBER, oldLineNumber, lineNumber));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclAccessPointName(final String s) {
		/**
		 * s.matches('[A-Za-z0-9][0-9A-Za-z_]*')
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_A_m_Za_m_z0_m_9_93_91_0_m_9A_m_Za_m_z__93_a).booleanValue();
		return matches;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclAcsiName(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then s.matches('[A-Za-z][0-9A-Za-z_]*')
		 * else false
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_A_m_Za_m_z_93_91_0_m_9A_m_Za_m_z__93_a).booleanValue();
			symbol_0 = matches;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclAnyName(final String s) {
		/**
		 * true
		 */
		return ValueUtil.TRUE_VALUE;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclAssociationID(final String s) {
		/**
		 * s.matches('[0-9A-Za-z]+')
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_0_m_9A_m_Za_m_z_93_p).booleanValue();
		return matches;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclAttributeNameEnum(final String s) {
		/**
		 *
		 * if validSclPredefinedAttributeNameEnum(s)
		 * then true
		 * else validSclExtensionAttributeNameEnum(s)
		 * endif
		 */
		final /*@Thrown*/ boolean validSclPredefinedAttributeNameEnum = this.validSclPredefinedAttributeNameEnum(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclPredefinedAttributeNameEnum) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@Thrown*/ boolean validSclExtensionAttributeNameEnum = this.validSclExtensionAttributeNameEnum(s);
			symbol_0 = validSclExtensionAttributeNameEnum;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclAuthenticationEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then Set{'none', 'password', 'weak', 'strong', 'certificate'}->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclBasicTypeEnum(final String s) {
		/**
		 * validSclPredefinedBasicTypeEnum(s)
		 */
		final /*@Thrown*/ boolean validSclPredefinedBasicTypeEnum = this.validSclPredefinedBasicTypeEnum(s);
		return validSclPredefinedBasicTypeEnum;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclCBName(final String s) {
		/**
		 * if self.validSclAcsiName(s) then s.size() <= 32 else false endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclAcsiName = this.validSclAcsiName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclAcsiName) {
			final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(s);
			final /*@Thrown*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_32).booleanValue();
			symbol_0 = le;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclCDCEnum(final String s) {
		/**
		 * if validSclPredefinedCDCEnum(s) then true else validSclExtensionCDCEnum(s) endif
		 */
		final /*@Thrown*/ boolean validSclPredefinedCDCEnum = this.validSclPredefinedCDCEnum(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclPredefinedCDCEnum) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@Thrown*/ boolean validSclExtensionCDCEnum = this.validSclExtensionCDCEnum(s);
			symbol_0 = validSclExtensionCDCEnum;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclCommonConductingEquipmentEnum(final String s) {
		/**
		 *
		 * if validSclPredefinedCommonConductingEquipmentEnum(s)
		 * then true
		 * else validSclExtensionEquipmentEnum(s)
		 * endif
		 */
		final /*@Thrown*/ boolean validSclPredefinedCommonConductingEquipmentEnum = this.validSclPredefinedCommonConductingEquipmentEnum(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclPredefinedCommonConductingEquipmentEnum) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@Thrown*/ boolean validSclExtensionEquipmentEnum = this.validSclExtensionEquipmentEnum(s);
			symbol_0 = validSclExtensionEquipmentEnum;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDACount(final String s) {
		/**
		 * s.matches('[0-9]+') or self.validSclAttributeNameEnum(s)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		/*@Caught*/ /*@NonNull*/ Object CAUGHT_matches;
		try {
			final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_0_m_9_93_p).booleanValue();
			CAUGHT_matches = matches;
		}
		catch (Exception e) {
			CAUGHT_matches = ValueUtil.createInvalidValue(e);
		}
		/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclAttributeNameEnum;
		try {
			final /*@Thrown*/ boolean validSclAttributeNameEnum = this.validSclAttributeNameEnum(s);
			CAUGHT_validSclAttributeNameEnum = validSclAttributeNameEnum;
		}
		catch (Exception e) {
			CAUGHT_validSclAttributeNameEnum = ValueUtil.createInvalidValue(e);
		}
		final /*@Thrown*/ Boolean or = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_matches, CAUGHT_validSclAttributeNameEnum);
		return or;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDataName(final String s) {
		/**
		 * if self.validSclRestrName1stU(s) then s.size() <= 12 else false endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclRestrName1stU = this.validSclRestrName1stU(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclRestrName1stU) {
			final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(s);
			final /*@Thrown*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_12).booleanValue();
			symbol_0 = le;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDataSetName(final String s) {
		/**
		 * if self.validSclAcsiName(s) then s.size() <= 32 else false endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclAcsiName = this.validSclAcsiName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclAcsiName) {
			final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(s);
			final /*@Thrown*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_32).booleanValue();
			symbol_0 = le;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNEnum(final String s) {
		/**
		 *
		 * validSclDomainLNGroupAEnum(s) or
		 * validSclDomainLNGroupCEnum(s) or
		 * validSclDomainLNGroupFEnum(s) or
		 * validSclDomainLNGroupGEnum(s) or
		 * validSclDomainLNGroupIEnum(s) or
		 * validSclDomainLNGroupKEnum(s) or
		 * validSclDomainLNGroupMEnum(s) or
		 * validSclDomainLNGroupPEnum(s) or
		 * validSclDomainLNGroupQEnum(s) or
		 * validSclDomainLNGroupREnum(s) or
		 * validSclDomainLNGroupSEnum(s) or
		 * validSclDomainLNGroupTEnum(s) or
		 * validSclDomainLNGroupXEnum(s) or
		 * validSclDomainLNGroupYEnum(s) or
		 * validSclDomainLNGroupZEnum(s)
		 */
		/*@Caught*/ /*@Nullable*/ Object CAUGHT_or_11;
		try {
			/*@Caught*/ /*@Nullable*/ Object CAUGHT_or_10;
			try {
				/*@Caught*/ /*@Nullable*/ Object CAUGHT_or_9;
				try {
					/*@Caught*/ /*@Nullable*/ Object CAUGHT_or_8;
					try {
						/*@Caught*/ /*@Nullable*/ Object CAUGHT_or_7;
						try {
							/*@Caught*/ /*@Nullable*/ Object CAUGHT_or_6;
							try {
								/*@Caught*/ /*@Nullable*/ Object CAUGHT_or_5;
								try {
									/*@Caught*/ /*@Nullable*/ Object CAUGHT_or_4;
									try {
										/*@Caught*/ /*@Nullable*/ Object CAUGHT_or_3;
										try {
											/*@Caught*/ /*@Nullable*/ Object CAUGHT_or_2;
											try {
												/*@Caught*/ /*@Nullable*/ Object CAUGHT_or_1;
												try {
													/*@Caught*/ /*@Nullable*/ Object CAUGHT_or_0;
													try {
														/*@Caught*/ /*@Nullable*/ Object CAUGHT_or;
														try {
															/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclDomainLNGroupAEnum;
															try {
																final /*@Thrown*/ boolean validSclDomainLNGroupAEnum = this.validSclDomainLNGroupAEnum(s);
																CAUGHT_validSclDomainLNGroupAEnum = validSclDomainLNGroupAEnum;
															}
															catch (Exception e) {
																CAUGHT_validSclDomainLNGroupAEnum = ValueUtil.createInvalidValue(e);
															}
															/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclDomainLNGroupCEnum;
															try {
																final /*@Thrown*/ boolean validSclDomainLNGroupCEnum = this.validSclDomainLNGroupCEnum(s);
																CAUGHT_validSclDomainLNGroupCEnum = validSclDomainLNGroupCEnum;
															}
															catch (Exception e) {
																CAUGHT_validSclDomainLNGroupCEnum = ValueUtil.createInvalidValue(e);
															}
															final /*@Thrown*/ Boolean or = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_validSclDomainLNGroupAEnum, CAUGHT_validSclDomainLNGroupCEnum);
															CAUGHT_or = or;
														}
														catch (Exception e) {
															CAUGHT_or = ValueUtil.createInvalidValue(e);
														}
														/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclDomainLNGroupFEnum;
														try {
															final /*@Thrown*/ boolean validSclDomainLNGroupFEnum = this.validSclDomainLNGroupFEnum(s);
															CAUGHT_validSclDomainLNGroupFEnum = validSclDomainLNGroupFEnum;
														}
														catch (Exception e) {
															CAUGHT_validSclDomainLNGroupFEnum = ValueUtil.createInvalidValue(e);
														}
														final /*@Thrown*/ Boolean or_0 = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_or, CAUGHT_validSclDomainLNGroupFEnum);
														CAUGHT_or_0 = or_0;
													}
													catch (Exception e) {
														CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
													}
													/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclDomainLNGroupGEnum;
													try {
														final /*@Thrown*/ boolean validSclDomainLNGroupGEnum = this.validSclDomainLNGroupGEnum(s);
														CAUGHT_validSclDomainLNGroupGEnum = validSclDomainLNGroupGEnum;
													}
													catch (Exception e) {
														CAUGHT_validSclDomainLNGroupGEnum = ValueUtil.createInvalidValue(e);
													}
													final /*@Thrown*/ Boolean or_1 = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_or_0, CAUGHT_validSclDomainLNGroupGEnum);
													CAUGHT_or_1 = or_1;
												}
												catch (Exception e) {
													CAUGHT_or_1 = ValueUtil.createInvalidValue(e);
												}
												/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclDomainLNGroupIEnum;
												try {
													final /*@Thrown*/ boolean validSclDomainLNGroupIEnum = this.validSclDomainLNGroupIEnum(s);
													CAUGHT_validSclDomainLNGroupIEnum = validSclDomainLNGroupIEnum;
												}
												catch (Exception e) {
													CAUGHT_validSclDomainLNGroupIEnum = ValueUtil.createInvalidValue(e);
												}
												final /*@Thrown*/ Boolean or_2 = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_or_1, CAUGHT_validSclDomainLNGroupIEnum);
												CAUGHT_or_2 = or_2;
											}
											catch (Exception e) {
												CAUGHT_or_2 = ValueUtil.createInvalidValue(e);
											}
											/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclDomainLNGroupKEnum;
											try {
												final /*@Thrown*/ boolean validSclDomainLNGroupKEnum = this.validSclDomainLNGroupKEnum(s);
												CAUGHT_validSclDomainLNGroupKEnum = validSclDomainLNGroupKEnum;
											}
											catch (Exception e) {
												CAUGHT_validSclDomainLNGroupKEnum = ValueUtil.createInvalidValue(e);
											}
											final /*@Thrown*/ Boolean or_3 = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_or_2, CAUGHT_validSclDomainLNGroupKEnum);
											CAUGHT_or_3 = or_3;
										}
										catch (Exception e) {
											CAUGHT_or_3 = ValueUtil.createInvalidValue(e);
										}
										/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclDomainLNGroupMEnum;
										try {
											final /*@Thrown*/ boolean validSclDomainLNGroupMEnum = this.validSclDomainLNGroupMEnum(s);
											CAUGHT_validSclDomainLNGroupMEnum = validSclDomainLNGroupMEnum;
										}
										catch (Exception e) {
											CAUGHT_validSclDomainLNGroupMEnum = ValueUtil.createInvalidValue(e);
										}
										final /*@Thrown*/ Boolean or_4 = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_or_3, CAUGHT_validSclDomainLNGroupMEnum);
										CAUGHT_or_4 = or_4;
									}
									catch (Exception e) {
										CAUGHT_or_4 = ValueUtil.createInvalidValue(e);
									}
									/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclDomainLNGroupPEnum;
									try {
										final /*@Thrown*/ boolean validSclDomainLNGroupPEnum = this.validSclDomainLNGroupPEnum(s);
										CAUGHT_validSclDomainLNGroupPEnum = validSclDomainLNGroupPEnum;
									}
									catch (Exception e) {
										CAUGHT_validSclDomainLNGroupPEnum = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean or_5 = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_or_4, CAUGHT_validSclDomainLNGroupPEnum);
									CAUGHT_or_5 = or_5;
								}
								catch (Exception e) {
									CAUGHT_or_5 = ValueUtil.createInvalidValue(e);
								}
								/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclDomainLNGroupQEnum;
								try {
									final /*@Thrown*/ boolean validSclDomainLNGroupQEnum = this.validSclDomainLNGroupQEnum(s);
									CAUGHT_validSclDomainLNGroupQEnum = validSclDomainLNGroupQEnum;
								}
								catch (Exception e) {
									CAUGHT_validSclDomainLNGroupQEnum = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean or_6 = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_or_5, CAUGHT_validSclDomainLNGroupQEnum);
								CAUGHT_or_6 = or_6;
							}
							catch (Exception e) {
								CAUGHT_or_6 = ValueUtil.createInvalidValue(e);
							}
							/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclDomainLNGroupREnum;
							try {
								final /*@Thrown*/ boolean validSclDomainLNGroupREnum = this.validSclDomainLNGroupREnum(s);
								CAUGHT_validSclDomainLNGroupREnum = validSclDomainLNGroupREnum;
							}
							catch (Exception e) {
								CAUGHT_validSclDomainLNGroupREnum = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean or_7 = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_or_6, CAUGHT_validSclDomainLNGroupREnum);
							CAUGHT_or_7 = or_7;
						}
						catch (Exception e) {
							CAUGHT_or_7 = ValueUtil.createInvalidValue(e);
						}
						/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclDomainLNGroupSEnum;
						try {
							final /*@Thrown*/ boolean validSclDomainLNGroupSEnum = this.validSclDomainLNGroupSEnum(s);
							CAUGHT_validSclDomainLNGroupSEnum = validSclDomainLNGroupSEnum;
						}
						catch (Exception e) {
							CAUGHT_validSclDomainLNGroupSEnum = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean or_8 = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_or_7, CAUGHT_validSclDomainLNGroupSEnum);
						CAUGHT_or_8 = or_8;
					}
					catch (Exception e) {
						CAUGHT_or_8 = ValueUtil.createInvalidValue(e);
					}
					/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclDomainLNGroupTEnum;
					try {
						final /*@Thrown*/ boolean validSclDomainLNGroupTEnum = this.validSclDomainLNGroupTEnum(s);
						CAUGHT_validSclDomainLNGroupTEnum = validSclDomainLNGroupTEnum;
					}
					catch (Exception e) {
						CAUGHT_validSclDomainLNGroupTEnum = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean or_9 = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_or_8, CAUGHT_validSclDomainLNGroupTEnum);
					CAUGHT_or_9 = or_9;
				}
				catch (Exception e) {
					CAUGHT_or_9 = ValueUtil.createInvalidValue(e);
				}
				/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclDomainLNGroupXEnum;
				try {
					final /*@Thrown*/ boolean validSclDomainLNGroupXEnum = this.validSclDomainLNGroupXEnum(s);
					CAUGHT_validSclDomainLNGroupXEnum = validSclDomainLNGroupXEnum;
				}
				catch (Exception e) {
					CAUGHT_validSclDomainLNGroupXEnum = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean or_10 = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_or_9, CAUGHT_validSclDomainLNGroupXEnum);
				CAUGHT_or_10 = or_10;
			}
			catch (Exception e) {
				CAUGHT_or_10 = ValueUtil.createInvalidValue(e);
			}
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclDomainLNGroupYEnum;
			try {
				final /*@Thrown*/ boolean validSclDomainLNGroupYEnum = this.validSclDomainLNGroupYEnum(s);
				CAUGHT_validSclDomainLNGroupYEnum = validSclDomainLNGroupYEnum;
			}
			catch (Exception e) {
				CAUGHT_validSclDomainLNGroupYEnum = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ Boolean or_11 = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_or_10, CAUGHT_validSclDomainLNGroupYEnum);
			CAUGHT_or_11 = or_11;
		}
		catch (Exception e) {
			CAUGHT_or_11 = ValueUtil.createInvalidValue(e);
		}
		/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclDomainLNGroupZEnum;
		try {
			final /*@Thrown*/ boolean validSclDomainLNGroupZEnum = this.validSclDomainLNGroupZEnum(s);
			CAUGHT_validSclDomainLNGroupZEnum = validSclDomainLNGroupZEnum;
		}
		catch (Exception e) {
			CAUGHT_validSclDomainLNGroupZEnum = ValueUtil.createInvalidValue(e);
		}
		final /*@Thrown*/ Boolean or_12 = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_or_11, CAUGHT_validSclDomainLNGroupZEnum);
		return or_12;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupAEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then Set{'ANCR', 'ARCO', 'ARIS', 'ATCC', 'AVCO'}->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_0, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupCEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then Set{'CALH', 'CCGR', 'CILO', 'CPOW', 'CSWI', 'CSYN'}->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_1, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupFEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then
		 *   Set{'FCNT', 'FCSD', 'FFIL', 'FLIM', 'FPID', 'FRMP', 'FSPT', 'FXOT', 'FXUT'
		 *   }
		 *   ->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_2, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupGEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then Set{'GAPC', 'GGIO', 'GLOG', 'GSAL'}->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_3, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupIEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then Set{'IARC', 'IHMI', 'ISAF', 'ITCI', 'ITMI', 'ITPC'}->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_4, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupKEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then Set{'KFAN', 'KFIL', 'KPMP', 'KTNK', 'KVLV'}->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_5, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupMEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then
		 *   Set{'MDIF', 'MENV', 'MFLK', 'MHAI', 'MHAN', 'MHYD', 'MMDC', 'MMET', 'MMTN', 'MMTR', 'MMXN', 'MMXU', 'MSQI', 'MSTA'
		 *   }
		 *   ->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_6, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupPEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then
		 *   Set{'PDIF', 'PDIR', 'PDIS', 'PDOP', 'PDUP', 'PFRC', 'PHAR', 'PHIZ', 'PIOC', 'PMRI', 'PMSS', 'POPF', 'PPAM', 'PRTR', 'PSCH', 'PSDE', 'PTEF', 'PTHF', 'PTOC', 'PTOF', 'PTOV', 'PTRC', 'PTTR', 'PTUC', 'PTUF', 'PTUV', 'PUPF', 'PVOC', 'PVPH', 'PZSU'
		 *   }
		 *   ->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_7, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupQEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then Set{'QFVR', 'QITR', 'QIUB', 'QVTR', 'QVUB', 'QVVR'}->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_8, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupREnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then
		 *   Set{'RADR', 'RBDR', 'RBRF', 'RDIR', 'RDRE', 'RDRS', 'RFLO', 'RMXU', 'RPSB', 'RREC', 'RSYN'
		 *   }
		 *   ->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_9, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupSEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then
		 *   Set{'SARC', 'SCBR', 'SIMG', 'SIML', 'SLTC', 'SOPM', 'SPDC', 'SPTR', 'SSWI', 'STMP', 'SVBR'
		 *   }
		 *   ->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_10, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupTEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then
		 *   Set{'TANG', 'TAXD', 'TCTR', 'TDST', 'TFLW', 'TFRQ', 'TGSN', 'THUM', 'TLVL', 'TMGF', 'TMVM', 'TPOS', 'TPRS', 'TRTN', 'TSND', 'TTMP', 'TTNS', 'TVBR', 'TVTR', 'TWPH'
		 *   }
		 *   ->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_11, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupXEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then Set{'XCBR', 'XSWI'}->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_12, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupYEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then Set{'YEFN', 'YLTC', 'YPSH', 'YPTR'}->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_13, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupZEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then
		 *   Set{'ZAXN', 'ZBAT', 'ZBSH', 'ZCAB', 'ZCAP', 'ZCON', 'ZGEN', 'ZGIL', 'ZLIN', 'ZMOT', 'ZREA', 'ZRES', 'ZRRC', 'ZSAR', 'ZSCR', 'ZSMC', 'ZTCF', 'ZTCR'
		 *   }
		 *   ->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_14, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclEmpty(final String s) {
		/**
		 * s.size() <= 0
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(s);
		final /*@Thrown*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_0).booleanValue();
		return le;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclExtensionAttributeNameEnum(final String s) {
		/**
		 * if self.validSclRestrName1stL(s) then s.size() <= 60 else false endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclRestrName1stL = this.validSclRestrName1stL(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclRestrName1stL) {
			final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(s);
			final /*@Thrown*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_60).booleanValue();
			symbol_0 = le;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclExtensionCDCEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then s.matches('[A-Za-z]{1,5}')
		 * else false
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_A_m_Za_m_z_93_123_1_44_5_125).booleanValue();
			symbol_0 = matches;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclExtensionEquipmentEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then s.size() >= 3 and s.matches('E[A-Z]*')
		 * else false
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ Boolean symbol_0;
		if (validSclName) {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_ge;
			try {
				final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(s);
				final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_3).booleanValue();
				CAUGHT_ge = ge;
			}
			catch (Exception e) {
				CAUGHT_ge = ValueUtil.createInvalidValue(e);
			}
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_matches;
			try {
				final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR_E_91_A_m_Z_93_a).booleanValue();
				CAUGHT_matches = matches;
			}
			catch (Exception e) {
				CAUGHT_matches = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ Boolean and = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_ge, CAUGHT_matches);
			symbol_0 = and;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclExtensionGeneralEquipmentEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then s.size() >= 3 and s.matches('E[A-Z]*')
		 * else false
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ Boolean symbol_0;
		if (validSclName) {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_ge;
			try {
				final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(s);
				final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_3).booleanValue();
				CAUGHT_ge = ge;
			}
			catch (Exception e) {
				CAUGHT_ge = ValueUtil.createInvalidValue(e);
			}
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_matches;
			try {
				final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR_E_91_A_m_Z_93_a).booleanValue();
				CAUGHT_matches = matches;
			}
			catch (Exception e) {
				CAUGHT_matches = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ Boolean and = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_ge, CAUGHT_matches);
			symbol_0 = and;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclExtensionLNClassEnum(final String s) {
		/**
		 * if self.validSclName(s) then s.matches('[A-Z]{4}') else false endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_A_m_Z_93_123_4_125).booleanValue();
			symbol_0 = matches;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclExtensionPTypeEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then s.matches('[A-Z][0-9A-Za-z-]*')
		 * else false
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_A_m_Z_93_91_0_m_9A_m_Za_m_z_m_93_a).booleanValue();
			symbol_0 = matches;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclExtensionPhysConnTypeEnum(final String s) {
		/**
		 * s.matches('[A-Z][0-9A-Za-z]*')
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_A_m_Z_93_91_0_m_9A_m_Za_m_z_93_a).booleanValue();
		return matches;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclFullAttributeName(final String s) {
		/**
		 *
		 * s.matches('[a-zA-Z][a-zA-Z0-9]*(([0-9]+))?(.[a-zA-Z][a-zA-Z0-9]*(([0-9]+))?)*')
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_a_m_zA_m_Z_93_91_a_m_zA_m_Z0_m_9_93_a_o_o_91_0_m_9_93_p_e_e_63_o__91_a_m_zA_m_Z_93_91_a_m_zA_m_Z0_m_9_93_a_o_o_91_0_m_9_93_p_e_e_63).booleanValue();
		return matches;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclFullDOName(final String s) {
		/**
		 *
		 * s.matches('[A-Z][0-9A-Za-z]{0,11}(.[a-z][0-9A-Za-z]*(([0-9]+))?)?')
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_A_m_Z_93_91_0_m_9A_m_Za_m_z_93_123_0_44_11_125_o__91_a_m_z_93_91_0_m_9A_m_Za_m_z_93_a_o_o_91_0_m_9_93_p_e_e_63_e_63).booleanValue();
		return matches;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclGeneralEquipmentEnum(final String s) {
		/**
		 *
		 * if validSclPredefinedGeneralEquipmentEnum(s)
		 * then true
		 * else validSclExtensionGeneralEquipmentEnum(s)
		 * endif
		 */
		final /*@Thrown*/ boolean validSclPredefinedGeneralEquipmentEnum = this.validSclPredefinedGeneralEquipmentEnum(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclPredefinedGeneralEquipmentEnum) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@Thrown*/ boolean validSclExtensionGeneralEquipmentEnum = this.validSclExtensionGeneralEquipmentEnum(s);
			symbol_0 = validSclExtensionGeneralEquipmentEnum;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclIEDName(final String s) {
		/**
		 *
		 * if self.validSclVisibleBasicLatin(s)
		 * then s.size() >= 1 and s.size() <= 129
		 * else false
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclVisibleBasicLatin = this.validSclVisibleBasicLatin(s);
		/*@Thrown*/ Boolean symbol_0;
		if (validSclVisibleBasicLatin) {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_ge;
			try {
				final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(s);
				final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_1).booleanValue();
				CAUGHT_ge = ge;
			}
			catch (Exception e) {
				CAUGHT_ge = ValueUtil.createInvalidValue(e);
			}
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_le;
			try {
				final /*@Thrown*/ IntegerValue size_0 = StringSizeOperation.INSTANCE.evaluate(s);
				final /*@Thrown*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size_0, SclTables.INT_129).booleanValue();
				CAUGHT_le = le;
			}
			catch (Exception e) {
				CAUGHT_le = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ Boolean and = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_ge, CAUGHT_le);
			symbol_0 = and;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclIEDNameOrRelative(final String s) {
		/**
		 *
		 * if self.validSclIEDName(s)
		 * then true
		 * else self.validSclOnlyRelativeIEDName(s)
		 * endif
		 */
		final /*@Thrown*/ boolean validSclIEDName = this.validSclIEDName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclIEDName) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@Thrown*/ boolean validSclOnlyRelativeIEDName = this.validSclOnlyRelativeIEDName(s);
			symbol_0 = validSclOnlyRelativeIEDName;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLDInst(final String s) {
		/**
		 * s.matches('[A-Za-z0-9][0-9A-Za-z_]{0,63}')
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_A_m_Za_m_z0_m_9_93_91_0_m_9A_m_Za_m_z__93_123_0_44_63_125).booleanValue();
		return matches;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLDInstOrEmpty(final String s) {
		/**
		 * if self.validSclEmpty(s) then true else self.validSclLDInst(s) endif
		 */
		final /*@Thrown*/ boolean validSclEmpty = this.validSclEmpty(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclEmpty) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@Thrown*/ boolean validSclLDInst = this.validSclLDInst(s);
			symbol_0 = validSclLDInst;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLDName(final String s) {
		/**
		 * s.matches('[A-Za-z][0-9A-Za-z_]{0,63}')
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_A_m_Za_m_z_93_91_0_m_9A_m_Za_m_z__93_123_0_44_63_125).booleanValue();
		return matches;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLLN0Enum(final String s) {
		/**
		 * if self.validSclName(s) then Set{'LLN0'}->includes(s) else false endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_15, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLNClassEnum(final String s) {
		/**
		 *
		 * if validSclPredefinedLNClassEnum(s)
		 * then true
		 * else validSclExtensionLNClassEnum(s)
		 * endif
		 */
		final /*@Thrown*/ boolean validSclPredefinedLNClassEnum = this.validSclPredefinedLNClassEnum(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclPredefinedLNClassEnum) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@Thrown*/ boolean validSclExtensionLNClassEnum = this.validSclExtensionLNClassEnum(s);
			symbol_0 = validSclExtensionLNClassEnum;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLNInst(final String s) {
		/**
		 * s.matches('[0-9]{1,12}')
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_0_m_9_93_123_1_44_12_125).booleanValue();
		return matches;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLNInstOrEmpty(final String s) {
		/**
		 * if self.validSclEmpty(s) then true else self.validSclLNInst(s) endif
		 */
		final /*@Thrown*/ boolean validSclEmpty = this.validSclEmpty(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclEmpty) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@Thrown*/ boolean validSclLNInst = this.validSclLNInst(s);
			symbol_0 = validSclLNInst;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLPHDEnum(final String s) {
		/**
		 * if self.validSclName(s) then Set{'LPHD'}->includes(s) else false endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_16, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLineType(final String s) {
		/**
		 * s.size() >= 1
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(s);
		final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_1).booleanValue();
		return ge;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLogName(final String s) {
		/**
		 * if self.validSclAcsiName(s) then s.size() <= 32 else false endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclAcsiName = this.validSclAcsiName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclAcsiName) {
			final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(s);
			final /*@Thrown*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_32).booleanValue();
			symbol_0 = le;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclMessageID(final String s) {
		/**
		 *
		 * if self.validSclVisibleBasicLatin(s)
		 * then s.size() <= 64
		 * else false
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclVisibleBasicLatin = this.validSclVisibleBasicLatin(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclVisibleBasicLatin) {
			final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(s);
			final /*@Thrown*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_64).booleanValue();
			symbol_0 = le;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclName(final String s) {
		/**
		 * if self.validSclAnyName(s) then s.size() >= 1 else false endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclAnyName = this.validSclAnyName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclAnyName) {
			final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(s);
			final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_1).booleanValue();
			symbol_0 = ge;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclNamespaceName(final String s) {
		/**
		 * s.matches('[ -~]+:20[0-9][0-9][A-Z]?')
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_32_m_126_93_p_c_20_91_0_m_9_93_91_0_m_9_93_91_A_m_Z_93_63).booleanValue();
		return matches;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclOnlyRelativeIEDName(final String s) {
		/**
		 * s.matches('@')
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__64).booleanValue();
		return matches;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPAddr(final String s) {
		/**
		 * s.size() >= 1
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(s);
		final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_1).booleanValue();
		return ge;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPTypeEnum(final String s) {
		/**
		 *
		 * if validSclPredefinedPTypeEnum(s)
		 * then true
		 * else validSclExtensionPTypeEnum(s)
		 * endif
		 */
		final /*@Thrown*/ boolean validSclPredefinedPTypeEnum = this.validSclPredefinedPTypeEnum(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclPredefinedPTypeEnum) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@Thrown*/ boolean validSclExtensionPTypeEnum = this.validSclExtensionPTypeEnum(s);
			symbol_0 = validSclExtensionPTypeEnum;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPTypePhysConnEnum(final String s) {
		/**
		 *
		 * if validSclPredefinedPTypePhysConnEnum(s)
		 * then true
		 * else validSclExtensionPTypeEnum(s)
		 * endif
		 */
		final /*@Thrown*/ boolean validSclPredefinedPTypePhysConnEnum = this.validSclPredefinedPTypePhysConnEnum(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclPredefinedPTypePhysConnEnum) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@Thrown*/ boolean validSclExtensionPTypeEnum = this.validSclExtensionPTypeEnum(s);
			symbol_0 = validSclExtensionPTypeEnum;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPhysConnTypeEnum(final String s) {
		/**
		 *
		 * if validSclPredefinedPhysConnTypeEnum(s)
		 * then true
		 * else validSclExtensionPhysConnTypeEnum(s)
		 * endif
		 */
		final /*@Thrown*/ boolean validSclPredefinedPhysConnTypeEnum = this.validSclPredefinedPhysConnTypeEnum(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclPredefinedPhysConnTypeEnum) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@Thrown*/ boolean validSclExtensionPhysConnTypeEnum = this.validSclExtensionPhysConnTypeEnum(s);
			symbol_0 = validSclExtensionPhysConnTypeEnum;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPowerTransformerEnum(final String s) {
		/**
		 * if self.validSclName(s) then Set{'PTR'}->includes(s) else false endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_17, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPredefinedAttributeNameEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then
		 *   Set{'T', 'Test', 'Check', 'SIUnit', 'Oper', 'SBO', 'SBOw', 'Cancel'
		 *   }
		 *   ->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_18, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPredefinedBasicTypeEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then
		 *   Set{'BOOLEAN', 'INT8', 'INT16', 'INT24', 'INT32', 'INT64', 'INT128', 'INT8U', 'INT16U', 'INT24U', 'INT32U', 'FLOAT32', 'FLOAT64', 'Enum', 'Dbpos', 'Tcmd', 'Quality', 'Timestamp', 'VisString32', 'VisString64', 'VisString65', 'VisString129', 'VisString255', 'Octet64', 'Unicode255', 'Struct', 'EntryTime', 'Check', 'ObjRef', 'Currency', 'PhyComAddr', 'TrgOps', 'OptFlds', 'SvOptFlds', 'EntryID'
		 *   }
		 *   ->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_19, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPredefinedCDCEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then
		 *   Set{'SPS', 'DPS', 'INS', 'ENS', 'ACT', 'ACD', 'SEC', 'BCR', 'HST', 'VSS', 'MV', 'CMV', 'SAV', 'WYE', 'DEL', 'SEQ', 'HMV', 'HWYE', 'HDEL', 'SPC', 'DPC', 'INC', 'ENC', 'BSC', 'ISC', 'APC', 'BAC', 'SPG', 'ING', 'ENG', 'ORG', 'TSG', 'CUG', 'VSG', 'ASG', 'CURVE', 'CSG', 'DPL', 'LPL', 'CSD', 'CST', 'BTS', 'UTS', 'LTS', 'GTS', 'MTS', 'NTS', 'STS', 'CTS', 'OTS', 'VSD'
		 *   }
		 *   ->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_20, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPredefinedCommonConductingEquipmentEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then
		 *   Set{'CBR', 'DIS', 'VTR', 'CTR', 'GEN', 'CAP', 'REA', 'CON', 'MOT', 'EFN', 'PSH', 'BAT', 'BSH', 'CAB', 'GIL', 'LIN', 'RES', 'RRC', 'SAR', 'TCF', 'TCR', 'IFL', 'FAN', 'SCR', 'SMC', 'PMP'
		 *   }
		 *   ->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_21, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPredefinedGeneralEquipmentEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then Set{'AXN', 'BAT', 'MOT', 'FAN', 'FIL', 'PMP', 'TNK', 'VLV'}->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_22, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPredefinedLNClassEnum(final String s) {
		/**
		 * validSclSystemLNGroupEnum(s) or validSclDomainLNEnum(s)
		 */
		/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclSystemLNGroupEnum;
		try {
			final /*@Thrown*/ boolean validSclSystemLNGroupEnum = this.validSclSystemLNGroupEnum(s);
			CAUGHT_validSclSystemLNGroupEnum = validSclSystemLNGroupEnum;
		}
		catch (Exception e) {
			CAUGHT_validSclSystemLNGroupEnum = ValueUtil.createInvalidValue(e);
		}
		/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclDomainLNEnum;
		try {
			final /*@Thrown*/ boolean validSclDomainLNEnum = this.validSclDomainLNEnum(s);
			CAUGHT_validSclDomainLNEnum = validSclDomainLNEnum;
		}
		catch (Exception e) {
			CAUGHT_validSclDomainLNEnum = ValueUtil.createInvalidValue(e);
		}
		final /*@Thrown*/ Boolean or = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_validSclSystemLNGroupEnum, CAUGHT_validSclDomainLNEnum);
		return or;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPredefinedPTypeEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then
		 *   Set{'IP', 'IP-SUBNET', 'IP-GATEWAY', 'OSI-NSAP', 'OSI-TSEL', 'OSI-SSEL', 'OSI-PSEL', 'OSI-AP-Title', 'OSI-AP-Invoke', 'OSI-AE-Qualifier', 'OSI-AE-Invoke', 'MAC-Address', 'APPID', 'VLAN-PRIORITY', 'VLAN-ID', 'SNTP-Port', 'MMS-Port', 'DNSName', 'IPv6FlowLabel', 'IPv6ClassOfTraffic', 'C37-118-IP-Port', 'IP-UDP-PORT', 'IP-TCP-PORT', 'IPv6', 'IPv6-SUBNET', 'IPv6-GATEWAY'
		 *   }
		 *   ->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_23, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPredefinedPTypePhysConnEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then Set{'Type', 'Plug', 'Cable', 'Port'}->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_24, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPredefinedPhysConnTypeEnum(final String s) {
		/**
		 * Set{'Connection', 'RedConn'}->includes(s)
		 */
		final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_25, s).booleanValue();
		return includes;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPrefix(final String s) {
		/**
		 *
		 * if s = ''
		 * then true
		 * else s.matches('[A-Za-z][0-9A-Za-z_]{0,10}')
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ boolean eq = SclTables.STR_.equals(s);
		/*@Thrown*/ boolean symbol_0;
		if (eq) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_A_m_Za_m_z_93_91_0_m_9A_m_Za_m_z__93_123_0_44_10_125).booleanValue();
			symbol_0 = matches;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclProcessName(final String s) {
		/**
		 * s.matches('.+(/.+)*')
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__p_o_s__p_e_a).booleanValue();
		return matches;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclProcessType(final String s) {
		/**
		 * s.size() >= 1
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(s);
		final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_1).booleanValue();
		return ge;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclRedProtEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then Set{'none', 'hsr', 'prp', 'rstp'}->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_26, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclRef(final String s) {
		/**
		 * s.matches('.+/.+/.+/.+(/.+)*')
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__p_s__p_s__p_s__p_o_s__p_e_a).booleanValue();
		return matches;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclRelease(final BigInteger i) {
		/**
		 * i >= 0 and i <= 255
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		/*@Caught*/ /*@NonNull*/ Object CAUGHT_ge;
		try {
			final /*@NonInvalid*/ IntegerValue BOXED_i = i == null ? null : ValueUtil.integerValueOf(i);
			final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_i, SclTables.INT_0).booleanValue();
			CAUGHT_ge = ge;
		}
		catch (Exception e) {
			CAUGHT_ge = ValueUtil.createInvalidValue(e);
		}
		/*@Caught*/ /*@NonNull*/ Object CAUGHT_le;
		try {
			final /*@NonInvalid*/ IntegerValue BOXED_i_0 = i == null ? null : ValueUtil.integerValueOf(i);
			final /*@Thrown*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_i_0, SclTables.INT_255).booleanValue();
			CAUGHT_le = le;
		}
		catch (Exception e) {
			CAUGHT_le = ValueUtil.createInvalidValue(e);
		}
		final /*@Thrown*/ Boolean and = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_ge, CAUGHT_le);
		return and;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclRestrName1stL(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then s.matches('[a-z][0-9A-Za-z]*')
		 * else false
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_a_m_z_93_91_0_m_9A_m_Za_m_z_93_a).booleanValue();
			symbol_0 = matches;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclRestrName1stU(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then s.matches('[A-Z][0-9A-Za-z]*')
		 * else false
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_A_m_Z_93_91_0_m_9A_m_Za_m_z_93_a).booleanValue();
			symbol_0 = matches;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclRevision(final String s) {
		/**
		 * if self.validSclName(s) then s.matches('[A-Z]') else false endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_A_m_Z_93).booleanValue();
			symbol_0 = matches;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclRightEnum(final String s) {
		/**
		 * Set{'full', 'fix', 'dataflow'}->includes(s)
		 */
		final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_27, s).booleanValue();
		return includes;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclSDOCount(final String s) {
		/**
		 * s.matches('[0-9]+') or self.validSclRestrName1stL(s)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		/*@Caught*/ /*@NonNull*/ Object CAUGHT_matches;
		try {
			final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_0_m_9_93_p).booleanValue();
			CAUGHT_matches = matches;
		}
		catch (Exception e) {
			CAUGHT_matches = ValueUtil.createInvalidValue(e);
		}
		/*@Caught*/ /*@NonNull*/ Object CAUGHT_validSclRestrName1stL;
		try {
			final /*@Thrown*/ boolean validSclRestrName1stL = this.validSclRestrName1stL(s);
			CAUGHT_validSclRestrName1stL = validSclRestrName1stL;
		}
		catch (Exception e) {
			CAUGHT_validSclRestrName1stL = ValueUtil.createInvalidValue(e);
		}
		final /*@Thrown*/ Boolean or = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_matches, CAUGHT_validSclRestrName1stL);
		return or;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclSubDataName(final String s) {
		/**
		 *
		 * if self.validSclRestrName1stL(s)
		 * then s.size() >= 1 and s.size() <= 60
		 * else false
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclRestrName1stL = this.validSclRestrName1stL(s);
		/*@Thrown*/ Boolean symbol_0;
		if (validSclRestrName1stL) {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_ge;
			try {
				final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(s);
				final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_1).booleanValue();
				CAUGHT_ge = ge;
			}
			catch (Exception e) {
				CAUGHT_ge = ValueUtil.createInvalidValue(e);
			}
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_le;
			try {
				final /*@Thrown*/ IntegerValue size_0 = StringSizeOperation.INSTANCE.evaluate(s);
				final /*@Thrown*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size_0, SclTables.INT_60).booleanValue();
				CAUGHT_le = le;
			}
			catch (Exception e) {
				CAUGHT_le = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ Boolean and = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_ge, CAUGHT_le);
			symbol_0 = and;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclSystemLNGroupEnum(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then
		 *   Set{'LLN0', 'LPHD', 'LCCH', 'LGOS', 'LSVS', 'LTIM', 'LTMS', 'LTRK'
		 *   }
		 *   ->includes(s)
		 * else false
		 * endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_28, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclTransformerWindingEnum(final String s) {
		/**
		 * if self.validSclName(s) then Set{'PTW'}->includes(s) else false endif
		 */
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(SclTables.Set_29, s).booleanValue();
			symbol_0 = includes;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclVersion(final String s) {
		/**
		 *
		 * if self.validSclName(s)
		 * then s.matches('2[0-2][0-9]{2}')
		 * else false
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean validSclName = this.validSclName(s);
		/*@Thrown*/ boolean symbol_0;
		if (validSclName) {
			final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR_2_91_0_m_2_93_91_0_m_9_93_123_2_125).booleanValue();
			symbol_0 = matches;
		}
		else {
			symbol_0 = ValueUtil.FALSE_VALUE;
		}
		return symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclVisibleBasicLatin(final String s) {
		/**
		 * s.matches('[ -~]*')
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, s, SclTables.STR__91_32_m_126_93_a).booleanValue();
		return matches;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
		switch (featureID) {
			case SclPackage.SCL_OBJECT__LINE_NUMBER:
				return getLineNumber();
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
			case SclPackage.SCL_OBJECT__LINE_NUMBER:
				setLineNumber((Integer)newValue);
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
			case SclPackage.SCL_OBJECT__LINE_NUMBER:
				setLineNumber(LINE_NUMBER_EDEFAULT);
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
			case SclPackage.SCL_OBJECT__LINE_NUMBER:
				return lineNumber != LINE_NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SclPackage.SCL_OBJECT___VALID_SCL_ACCESS_POINT_NAME__STRING:
				return validSclAccessPointName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_ACSI_NAME__STRING:
				return validSclAcsiName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_ANY_NAME__STRING:
				return validSclAnyName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_ASSOCIATION_ID__STRING:
				return validSclAssociationID((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_ATTRIBUTE_NAME_ENUM__STRING:
				return validSclAttributeNameEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_AUTHENTICATION_ENUM__STRING:
				return validSclAuthenticationEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_BASIC_TYPE_ENUM__STRING:
				return validSclBasicTypeEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_CB_NAME__STRING:
				return validSclCBName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_CDC_ENUM__STRING:
				return validSclCDCEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_COMMON_CONDUCTING_EQUIPMENT_ENUM__STRING:
				return validSclCommonConductingEquipmentEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DA_COUNT__STRING:
				return validSclDACount((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DATA_NAME__STRING:
				return validSclDataName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DATA_SET_NAME__STRING:
				return validSclDataSetName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_ENUM__STRING:
				return validSclDomainLNEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_AENUM__STRING:
				return validSclDomainLNGroupAEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_CENUM__STRING:
				return validSclDomainLNGroupCEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_FENUM__STRING:
				return validSclDomainLNGroupFEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_GENUM__STRING:
				return validSclDomainLNGroupGEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_IENUM__STRING:
				return validSclDomainLNGroupIEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_KENUM__STRING:
				return validSclDomainLNGroupKEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_MENUM__STRING:
				return validSclDomainLNGroupMEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_PENUM__STRING:
				return validSclDomainLNGroupPEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_QENUM__STRING:
				return validSclDomainLNGroupQEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_RENUM__STRING:
				return validSclDomainLNGroupREnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_SENUM__STRING:
				return validSclDomainLNGroupSEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_TENUM__STRING:
				return validSclDomainLNGroupTEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_XENUM__STRING:
				return validSclDomainLNGroupXEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_YENUM__STRING:
				return validSclDomainLNGroupYEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_ZENUM__STRING:
				return validSclDomainLNGroupZEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_EMPTY__STRING:
				return validSclEmpty((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_EXTENSION_ATTRIBUTE_NAME_ENUM__STRING:
				return validSclExtensionAttributeNameEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_EXTENSION_CDC_ENUM__STRING:
				return validSclExtensionCDCEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_EXTENSION_EQUIPMENT_ENUM__STRING:
				return validSclExtensionEquipmentEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_EXTENSION_GENERAL_EQUIPMENT_ENUM__STRING:
				return validSclExtensionGeneralEquipmentEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_EXTENSION_LN_CLASS_ENUM__STRING:
				return validSclExtensionLNClassEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_EXTENSION_PTYPE_ENUM__STRING:
				return validSclExtensionPTypeEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_EXTENSION_PHYS_CONN_TYPE_ENUM__STRING:
				return validSclExtensionPhysConnTypeEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_FULL_ATTRIBUTE_NAME__STRING:
				return validSclFullAttributeName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_FULL_DO_NAME__STRING:
				return validSclFullDOName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_GENERAL_EQUIPMENT_ENUM__STRING:
				return validSclGeneralEquipmentEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_IED_NAME__STRING:
				return validSclIEDName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_IED_NAME_OR_RELATIVE__STRING:
				return validSclIEDNameOrRelative((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LD_INST__STRING:
				return validSclLDInst((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LD_INST_OR_EMPTY__STRING:
				return validSclLDInstOrEmpty((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LD_NAME__STRING:
				return validSclLDName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LLN0_ENUM__STRING:
				return validSclLLN0Enum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LN_CLASS_ENUM__STRING:
				return validSclLNClassEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LN_INST__STRING:
				return validSclLNInst((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LN_INST_OR_EMPTY__STRING:
				return validSclLNInstOrEmpty((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LPHD_ENUM__STRING:
				return validSclLPHDEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LINE_TYPE__STRING:
				return validSclLineType((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LOG_NAME__STRING:
				return validSclLogName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_MESSAGE_ID__STRING:
				return validSclMessageID((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_NAME__STRING:
				return validSclName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_NAMESPACE_NAME__STRING:
				return validSclNamespaceName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_ONLY_RELATIVE_IED_NAME__STRING:
				return validSclOnlyRelativeIEDName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PADDR__STRING:
				return validSclPAddr((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PTYPE_ENUM__STRING:
				return validSclPTypeEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PTYPE_PHYS_CONN_ENUM__STRING:
				return validSclPTypePhysConnEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PHYS_CONN_TYPE_ENUM__STRING:
				return validSclPhysConnTypeEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_POWER_TRANSFORMER_ENUM__STRING:
				return validSclPowerTransformerEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREDEFINED_ATTRIBUTE_NAME_ENUM__STRING:
				return validSclPredefinedAttributeNameEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREDEFINED_BASIC_TYPE_ENUM__STRING:
				return validSclPredefinedBasicTypeEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREDEFINED_CDC_ENUM__STRING:
				return validSclPredefinedCDCEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREDEFINED_COMMON_CONDUCTING_EQUIPMENT_ENUM__STRING:
				return validSclPredefinedCommonConductingEquipmentEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREDEFINED_GENERAL_EQUIPMENT_ENUM__STRING:
				return validSclPredefinedGeneralEquipmentEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREDEFINED_LN_CLASS_ENUM__STRING:
				return validSclPredefinedLNClassEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREDEFINED_PTYPE_ENUM__STRING:
				return validSclPredefinedPTypeEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREDEFINED_PTYPE_PHYS_CONN_ENUM__STRING:
				return validSclPredefinedPTypePhysConnEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREDEFINED_PHYS_CONN_TYPE_ENUM__STRING:
				return validSclPredefinedPhysConnTypeEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREFIX__STRING:
				return validSclPrefix((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PROCESS_NAME__STRING:
				return validSclProcessName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PROCESS_TYPE__STRING:
				return validSclProcessType((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_RED_PROT_ENUM__STRING:
				return validSclRedProtEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_REF__STRING:
				return validSclRef((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_RELEASE__BIGINTEGER:
				return validSclRelease((BigInteger)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_RESTR_NAME1ST_L__STRING:
				return validSclRestrName1stL((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_RESTR_NAME1ST_U__STRING:
				return validSclRestrName1stU((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_REVISION__STRING:
				return validSclRevision((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_RIGHT_ENUM__STRING:
				return validSclRightEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_SDO_COUNT__STRING:
				return validSclSDOCount((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_SUB_DATA_NAME__STRING:
				return validSclSubDataName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_SYSTEM_LN_GROUP_ENUM__STRING:
				return validSclSystemLNGroupEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_TRANSFORMER_WINDING_ENUM__STRING:
				return validSclTransformerWindingEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_VERSION__STRING:
				return validSclVersion((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_VISIBLE_BASIC_LATIN__STRING:
				return validSclVisibleBasicLatin((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lineNumber: ");
		result.append(lineNumber);
		result.append(')');
		return result.toString();
	}

} //SclObjectImpl
