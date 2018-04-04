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
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CommunicationImpl#getSubNetwork <em>Sub Network</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CommunicationImpl#getSCL <em>SCL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationImpl extends UnNamingImpl implements Communication {
    /**
	 * The cached value of the '{@link #getSubNetwork() <em>Sub Network</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSubNetwork()
	 * @generated
	 * @ordered
	 */
    protected EList<SubNetwork> subNetwork;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CommunicationImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.COMMUNICATION;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<SubNetwork> getSubNetwork() {
		if (subNetwork == null) {
			subNetwork = new EObjectContainmentWithInverseEList.Unsettable<SubNetwork>(SubNetwork.class, this, SclPackage.COMMUNICATION__SUB_NETWORK, SclPackage.SUB_NETWORK__COMMUNICATION);
		}
		return subNetwork;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSubNetwork() {
		if (subNetwork != null) ((InternalEList.Unsettable<?>)subNetwork).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSubNetwork() {
		return subNetwork != null && ((InternalEList.Unsettable<?>)subNetwork).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SCL getSCL() {
		if (eContainerFeatureID() != SclPackage.COMMUNICATION__SCL) return null;
		return (SCL)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSCL( SCL newSCL, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newSCL, SclPackage.COMMUNICATION__SCL, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSCL( SCL newSCL ) {
		if (newSCL != eInternalContainer() || (eContainerFeatureID() != SclPackage.COMMUNICATION__SCL && newSCL != null)) {
			if (EcoreUtil.isAncestor(this, newSCL))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSCL != null)
				msgs = ((InternalEObject)newSCL).eInverseAdd(this, SclPackage.SCL__COMMUNICATION, SCL.class, msgs);
			msgs = basicSetSCL(newSCL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.COMMUNICATION__SCL, newSCL, newSCL));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunication_nothing(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv Communication_nothing: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunication_at_least_one_SubNetwork_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv Communication_at_least_one_SubNetwork_required:
		 *   let
		 *     severity : Integer[1] = 'Communication::Communication_at_least_one_SubNetwork_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[1] = self.SubNetwork->notEmpty()
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'Communication shall contain at least one SubNetwork (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'Communication::Communication_at_least_one_SubNetwork_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_Communication_c_c_Communication_at_least_one_SubNetwork_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ List<SubNetwork> SubNetwork = this.getSubNetwork();
			final /*@NonInvalid*/ SetValue BOXED_SubNetwork = idResolver.createSetOfAll(SclTables.SET_CLSSid_SubNetwork, SubNetwork);
			final /*@NonInvalid*/ boolean status = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_SubNetwork).booleanValue();
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_Communication_32_shall_32_contain_32_at_32_least_32_one_32_SubNetwork_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_Communication_c_c_Communication_at_least_one_SubNetwork_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.COMMUNICATION__SUB_NETWORK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubNetwork()).basicAdd(otherEnd, msgs);
			case SclPackage.COMMUNICATION__SCL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSCL((SCL)otherEnd, msgs);
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
			case SclPackage.COMMUNICATION__SUB_NETWORK:
				return ((InternalEList<?>)getSubNetwork()).basicRemove(otherEnd, msgs);
			case SclPackage.COMMUNICATION__SCL:
				return basicSetSCL(null, msgs);
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
			case SclPackage.COMMUNICATION__SCL:
				return eInternalContainer().eInverseRemove(this, SclPackage.SCL__COMMUNICATION, SCL.class, msgs);
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
			case SclPackage.COMMUNICATION__SUB_NETWORK:
				return getSubNetwork();
			case SclPackage.COMMUNICATION__SCL:
				return getSCL();
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
			case SclPackage.COMMUNICATION__SUB_NETWORK:
				getSubNetwork().clear();
				getSubNetwork().addAll((Collection<? extends SubNetwork>)newValue);
				return;
			case SclPackage.COMMUNICATION__SCL:
				setSCL((SCL)newValue);
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
			case SclPackage.COMMUNICATION__SUB_NETWORK:
				unsetSubNetwork();
				return;
			case SclPackage.COMMUNICATION__SCL:
				setSCL((SCL)null);
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
			case SclPackage.COMMUNICATION__SUB_NETWORK:
				return isSetSubNetwork();
			case SclPackage.COMMUNICATION__SCL:
				return getSCL() != null;
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
			case SclPackage.COMMUNICATION___VALIDATE_COMMUNICATION_NOTHING__DIAGNOSTICCHAIN_MAP:
				return validateCommunication_nothing((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.COMMUNICATION___VALIDATE_COMMUNICATION_AT_LEAST_ONE_SUB_NETWORK_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateCommunication_at_least_one_SubNetwork_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CommunicationImpl
