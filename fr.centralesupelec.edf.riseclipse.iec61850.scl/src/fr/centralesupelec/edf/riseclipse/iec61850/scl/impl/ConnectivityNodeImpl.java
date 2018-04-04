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

import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Line;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectivity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectivityNodeImpl#getPathName <em>Path Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectivityNodeImpl#getBay <em>Bay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectivityNodeImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectivityNodeImpl#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectivityNodeImpl extends LNodeContainerImpl implements ConnectivityNode {
    /**
	 * The default value of the '{@link #getPathName() <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPathName()
	 * @generated
	 * @ordered
	 */
    protected static final String PATH_NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getPathName() <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPathName()
	 * @generated
	 * @ordered
	 */
    protected String pathName = PATH_NAME_EDEFAULT;

    /**
	 * This is true if the Path Name attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean pathNameESet;

    /**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
    protected EList<Terminal> terminal;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ConnectivityNodeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.CONNECTIVITY_NODE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getPathName() {
		return pathName;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPathName( String newPathName ) {
		String oldPathName = pathName;
		pathName = newPathName;
		boolean oldPathNameESet = pathNameESet;
		pathNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTIVITY_NODE__PATH_NAME, oldPathName, pathName, !oldPathNameESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetPathName() {
		String oldPathName = pathName;
		boolean oldPathNameESet = pathNameESet;
		pathName = PATH_NAME_EDEFAULT;
		pathNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONNECTIVITY_NODE__PATH_NAME, oldPathName, PATH_NAME_EDEFAULT, oldPathNameESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetPathName() {
		return pathNameESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Bay getBay() {
		if (eContainerFeatureID() != SclPackage.CONNECTIVITY_NODE__BAY) return null;
		return (Bay)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetBay( Bay newBay, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newBay, SclPackage.CONNECTIVITY_NODE__BAY, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBay( Bay newBay ) {
		if (newBay != eInternalContainer() || (eContainerFeatureID() != SclPackage.CONNECTIVITY_NODE__BAY && newBay != null)) {
			if (EcoreUtil.isAncestor(this, newBay))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBay != null)
				msgs = ((InternalEObject)newBay).eInverseAdd(this, SclPackage.BAY__CONNECTIVITY_NODE, Bay.class, msgs);
			msgs = basicSetBay(newBay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTIVITY_NODE__BAY, newBay, newBay));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Terminal> getTerminal() {
		if (terminal == null) {
			terminal = new EObjectWithInverseEList.Unsettable<Terminal>(Terminal.class, this, SclPackage.CONNECTIVITY_NODE__TERMINAL, SclPackage.TERMINAL__CNODE);
		}
		return terminal;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetTerminal() {
		if (terminal != null) ((InternalEList.Unsettable<?>)terminal).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetTerminal() {
		return terminal != null && ((InternalEList.Unsettable<?>)terminal).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Line getLine() {
		if (eContainerFeatureID() != SclPackage.CONNECTIVITY_NODE__LINE) return null;
		return (Line)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLine( Line newLine, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newLine, SclPackage.CONNECTIVITY_NODE__LINE, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLine( Line newLine ) {
		if (newLine != eInternalContainer() || (eContainerFeatureID() != SclPackage.CONNECTIVITY_NODE__LINE && newLine != null)) {
			if (EcoreUtil.isAncestor(this, newLine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLine != null)
				msgs = ((InternalEObject)newLine).eInverseAdd(this, SclPackage.LINE__CONNECTIVITY_NODE, Line.class, msgs);
			msgs = basicSetLine(newLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTIVITY_NODE__LINE, newLine, newLine));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectivityNode_pathName_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ConnectivityNode_pathName_required:
		 *   let
		 *     severity : Integer[1] = 'ConnectivityNode::ConnectivityNode_pathName_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.pathName <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'name attribute shall be present in ConnectivityNode (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'ConnectivityNode::ConnectivityNode_pathName_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ConnectivityNode_c_c_ConnectivityNode_pathName_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String pathName = this.getPathName();
			final /*@NonInvalid*/ boolean status = pathName != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_name_32_attribute_32_shall_32_be_32_present_32_in_32_ConnectivityNode_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ConnectivityNode_c_c_ConnectivityNode_pathName_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectivityNode_pathName_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ConnectivityNode_pathName_valid:
		 *   let
		 *     severity : Integer[1] = 'ConnectivityNode::ConnectivityNode_pathName_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.pathName <> null implies
		 *           self.validSclRef(pathName)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'name attribute shall be valid in ConnectivityNode (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.pathName.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ConnectivityNode::ConnectivityNode_pathName_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ConnectivityNode_c_c_ConnectivityNode_pathName_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String pathName_0 = this.getPathName();
				final /*@NonInvalid*/ boolean ne = pathName_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclRef = ((SclObject)this).validSclRef(pathName_0);
					status = validSclRef;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_name_32_attribute_32_shall_32_be_32_valid_32_in_32_ConnectivityNode_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(pathName_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ConnectivityNode_c_c_ConnectivityNode_pathName_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectivityNode_pathName_value(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ConnectivityNode_pathName_value:
		 *   let
		 *     severity : Integer[1] = 'ConnectivityNode::ConnectivityNode_pathName_value'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.pathName <> null implies self.pathName = self.Bay.VoltageLevel.Substation.name + '/' + self.Bay.VoltageLevel.name + '/' + self.Bay.name + '/' + self.name
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'pathName of ConnectivityNode shall be its path starting from Substation (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' + self.pathName + ', ' + 'expected value is ' + self.Bay.VoltageLevel.Substation.name + '/' + self.Bay.VoltageLevel.name + '/' + self.Bay.name + '/' + self.name, status = status
		 *             }
		 *           endif
		 *       in
		 *         'ConnectivityNode::ConnectivityNode_pathName_value'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ConnectivityNode_c_c_ConnectivityNode_pathName_value);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String pathName_0 = this.getPathName();
				final /*@NonInvalid*/ boolean ne = pathName_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@NonInvalid*/ Bay Bay_1 = this.getBay();
					if (Bay_1 == null) {
						throw new InvalidValueException("Null source for \'\'http://www.iec.ch/61850/2003/SCL\'::Naming::name\'");
					}
					final /*@Thrown*/ VoltageLevel VoltageLevel_0 = Bay_1.getVoltageLevel();
					if (VoltageLevel_0 == null) {
						throw new InvalidValueException("Null source for \'\'http://www.iec.ch/61850/2003/SCL\'::Naming::name\'");
					}
					final /*@Thrown*/ Substation Substation = VoltageLevel_0.getSubstation();
					if (Substation == null) {
						throw new InvalidValueException("Null source for \'\'http://www.iec.ch/61850/2003/SCL\'::Naming::name\'");
					}
					final /*@Thrown*/ String name = Substation.getName();
					final /*@Thrown*/ String sum = StringConcatOperation.INSTANCE.evaluate(name, SclTables.STR_quot);
					final /*@Thrown*/ String name_0 = VoltageLevel_0.getName();
					final /*@Thrown*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, name_0);
					final /*@Thrown*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_quot);
					final /*@Thrown*/ String name_1 = Bay_1.getName();
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, name_1);
					final /*@Thrown*/ String sum_3 = StringConcatOperation.INSTANCE.evaluate(sum_2, SclTables.STR_quot);
					final /*@NonInvalid*/ String name_2 = this.getName();
					final /*@Thrown*/ String sum_4 = StringConcatOperation.INSTANCE.evaluate(sum_3, name_2);
					final /*@Thrown*/ boolean eq = sum_4.equals(pathName_0);
					status = eq;
				}
				else {
					status = ValueUtil.TRUE_VALUE;
				}
				/*@Thrown*/ Object symbol_1;
				if (status) {
					symbol_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ Bay Bay_4 = this.getBay();
					if (Bay_4 == null) {
						throw new InvalidValueException("Null source for \'\'http://www.iec.ch/61850/2003/SCL\'::Naming::name\'");
					}
					final /*@Thrown*/ VoltageLevel VoltageLevel_2 = Bay_4.getVoltageLevel();
					if (VoltageLevel_2 == null) {
						throw new InvalidValueException("Null source for \'\'http://www.iec.ch/61850/2003/SCL\'::Naming::name\'");
					}
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum_5 = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_pathName_32_of_32_ConnectivityNode_32_shall_32_be_32_its_32_path_32_starting_32_from_32_Sub, toString);
					final /*@NonInvalid*/ String sum_6 = StringConcatOperation.INSTANCE.evaluate(sum_5, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_7 = StringConcatOperation.INSTANCE.evaluate(sum_6, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String sum_8 = StringConcatOperation.INSTANCE.evaluate(sum_7, pathName_0);
					final /*@Thrown*/ String sum_9 = StringConcatOperation.INSTANCE.evaluate(sum_8, SclTables.STR__44_32);
					final /*@Thrown*/ String sum_10 = StringConcatOperation.INSTANCE.evaluate(sum_9, SclTables.STR_expected_32_value_32_is_32);
					final /*@Thrown*/ Substation Substation_0 = VoltageLevel_2.getSubstation();
					if (Substation_0 == null) {
						throw new InvalidValueException("Null source for \'\'http://www.iec.ch/61850/2003/SCL\'::Naming::name\'");
					}
					final /*@Thrown*/ String name_3 = Substation_0.getName();
					final /*@Thrown*/ String sum_11 = StringConcatOperation.INSTANCE.evaluate(sum_10, name_3);
					final /*@Thrown*/ String sum_12 = StringConcatOperation.INSTANCE.evaluate(sum_11, SclTables.STR_quot);
					final /*@Thrown*/ String name_4 = VoltageLevel_2.getName();
					final /*@Thrown*/ String sum_13 = StringConcatOperation.INSTANCE.evaluate(sum_12, name_4);
					final /*@Thrown*/ String sum_14 = StringConcatOperation.INSTANCE.evaluate(sum_13, SclTables.STR_quot);
					final /*@Thrown*/ String name_5 = Bay_4.getName();
					final /*@Thrown*/ String sum_15 = StringConcatOperation.INSTANCE.evaluate(sum_14, name_5);
					final /*@Thrown*/ String sum_16 = StringConcatOperation.INSTANCE.evaluate(sum_15, SclTables.STR_quot);
					final /*@NonInvalid*/ String name_6 = this.getName();
					final /*@Thrown*/ String sum_17 = StringConcatOperation.INSTANCE.evaluate(sum_16, name_6);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_17, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ConnectivityNode_c_c_ConnectivityNode_pathName_value, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.CONNECTIVITY_NODE__BAY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBay((Bay)otherEnd, msgs);
			case SclPackage.CONNECTIVITY_NODE__TERMINAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerminal()).basicAdd(otherEnd, msgs);
			case SclPackage.CONNECTIVITY_NODE__LINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLine((Line)otherEnd, msgs);
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
			case SclPackage.CONNECTIVITY_NODE__BAY:
				return basicSetBay(null, msgs);
			case SclPackage.CONNECTIVITY_NODE__TERMINAL:
				return ((InternalEList<?>)getTerminal()).basicRemove(otherEnd, msgs);
			case SclPackage.CONNECTIVITY_NODE__LINE:
				return basicSetLine(null, msgs);
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
			case SclPackage.CONNECTIVITY_NODE__BAY:
				return eInternalContainer().eInverseRemove(this, SclPackage.BAY__CONNECTIVITY_NODE, Bay.class, msgs);
			case SclPackage.CONNECTIVITY_NODE__LINE:
				return eInternalContainer().eInverseRemove(this, SclPackage.LINE__CONNECTIVITY_NODE, Line.class, msgs);
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
			case SclPackage.CONNECTIVITY_NODE__PATH_NAME:
				return getPathName();
			case SclPackage.CONNECTIVITY_NODE__BAY:
				return getBay();
			case SclPackage.CONNECTIVITY_NODE__TERMINAL:
				return getTerminal();
			case SclPackage.CONNECTIVITY_NODE__LINE:
				return getLine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
		switch (featureID) {
			case SclPackage.CONNECTIVITY_NODE__PATH_NAME:
				setPathName((String)newValue);
				return;
			case SclPackage.CONNECTIVITY_NODE__BAY:
				setBay((Bay)newValue);
				return;
			case SclPackage.CONNECTIVITY_NODE__TERMINAL:
				getTerminal().clear();
				getTerminal().addAll((Collection<? extends Terminal>)newValue);
				return;
			case SclPackage.CONNECTIVITY_NODE__LINE:
				setLine((Line)newValue);
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
			case SclPackage.CONNECTIVITY_NODE__PATH_NAME:
				unsetPathName();
				return;
			case SclPackage.CONNECTIVITY_NODE__BAY:
				setBay((Bay)null);
				return;
			case SclPackage.CONNECTIVITY_NODE__TERMINAL:
				unsetTerminal();
				return;
			case SclPackage.CONNECTIVITY_NODE__LINE:
				setLine((Line)null);
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
			case SclPackage.CONNECTIVITY_NODE__PATH_NAME:
				return isSetPathName();
			case SclPackage.CONNECTIVITY_NODE__BAY:
				return getBay() != null;
			case SclPackage.CONNECTIVITY_NODE__TERMINAL:
				return isSetTerminal();
			case SclPackage.CONNECTIVITY_NODE__LINE:
				return getLine() != null;
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
			case SclPackage.CONNECTIVITY_NODE___VALIDATE_CONNECTIVITY_NODE_PATH_NAME_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateConnectivityNode_pathName_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CONNECTIVITY_NODE___VALIDATE_CONNECTIVITY_NODE_PATH_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateConnectivityNode_pathName_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CONNECTIVITY_NODE___VALIDATE_CONNECTIVITY_NODE_PATH_NAME_VALUE__DIAGNOSTICCHAIN_MAP:
				return validateConnectivityNode_pathName_value((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (pathName: ");
		if (pathNameESet) result.append(pathName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConnectivityNodeImpl
