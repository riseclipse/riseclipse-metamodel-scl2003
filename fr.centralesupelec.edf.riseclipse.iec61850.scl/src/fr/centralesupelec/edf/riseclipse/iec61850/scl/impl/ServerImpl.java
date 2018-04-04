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
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Association;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Server;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerImpl#getAccessPoint <em>Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerImpl#getLDevice <em>LDevice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerImpl extends UnNamingImpl implements Server {
    /**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
    protected static final Integer TIMEOUT_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
    protected Integer timeout = TIMEOUT_EDEFAULT;

    /**
	 * This is true if the Timeout attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean timeoutESet;

    /**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
    protected EList<Association> association;

    /**
	 * The cached value of the '{@link #getAuthentication() <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAuthentication()
	 * @generated
	 * @ordered
	 */
    protected Authentication authentication;

    /**
	 * This is true if the Authentication containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean authenticationESet;

    /**
	 * The cached value of the '{@link #getLDevice() <em>LDevice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLDevice()
	 * @generated
	 * @ordered
	 */
    protected EList<LDevice> lDevice;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ServerImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.SERVER;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Integer getTimeout() {
		return timeout;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTimeout( Integer newTimeout ) {
		Integer oldTimeout = timeout;
		timeout = newTimeout;
		boolean oldTimeoutESet = timeoutESet;
		timeoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVER__TIMEOUT, oldTimeout, timeout, !oldTimeoutESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetTimeout() {
		Integer oldTimeout = timeout;
		boolean oldTimeoutESet = timeoutESet;
		timeout = TIMEOUT_EDEFAULT;
		timeoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVER__TIMEOUT, oldTimeout, TIMEOUT_EDEFAULT, oldTimeoutESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetTimeout() {
		return timeoutESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AccessPoint getAccessPoint() {
		if (eContainerFeatureID() != SclPackage.SERVER__ACCESS_POINT) return null;
		return (AccessPoint)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetAccessPoint( AccessPoint newAccessPoint, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newAccessPoint, SclPackage.SERVER__ACCESS_POINT, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAccessPoint( AccessPoint newAccessPoint ) {
		if (newAccessPoint != eInternalContainer() || (eContainerFeatureID() != SclPackage.SERVER__ACCESS_POINT && newAccessPoint != null)) {
			if (EcoreUtil.isAncestor(this, newAccessPoint))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAccessPoint != null)
				msgs = ((InternalEObject)newAccessPoint).eInverseAdd(this, SclPackage.ACCESS_POINT__SERVER, AccessPoint.class, msgs);
			msgs = basicSetAccessPoint(newAccessPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVER__ACCESS_POINT, newAccessPoint, newAccessPoint));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Association> getAssociation() {
		if (association == null) {
			association = new EObjectContainmentWithInverseEList.Unsettable<Association>(Association.class, this, SclPackage.SERVER__ASSOCIATION, SclPackage.ASSOCIATION__SERVER);
		}
		return association;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetAssociation() {
		if (association != null) ((InternalEList.Unsettable<?>)association).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetAssociation() {
		return association != null && ((InternalEList.Unsettable<?>)association).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Authentication getAuthentication() {
		return authentication;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetAuthentication( Authentication newAuthentication, NotificationChain msgs ) {
		Authentication oldAuthentication = authentication;
		authentication = newAuthentication;
		boolean oldAuthenticationESet = authenticationESet;
		authenticationESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVER__AUTHENTICATION, oldAuthentication, newAuthentication, !oldAuthenticationESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAuthentication( Authentication newAuthentication ) {
		if (newAuthentication != authentication) {
			NotificationChain msgs = null;
			if (authentication != null)
				msgs = ((InternalEObject)authentication).eInverseRemove(this, SclPackage.AUTHENTICATION__SERVER, Authentication.class, msgs);
			if (newAuthentication != null)
				msgs = ((InternalEObject)newAuthentication).eInverseAdd(this, SclPackage.AUTHENTICATION__SERVER, Authentication.class, msgs);
			msgs = basicSetAuthentication(newAuthentication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAuthenticationESet = authenticationESet;
			authenticationESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVER__AUTHENTICATION, newAuthentication, newAuthentication, !oldAuthenticationESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetAuthentication( NotificationChain msgs ) {
		Authentication oldAuthentication = authentication;
		authentication = null;
		boolean oldAuthenticationESet = authenticationESet;
		authenticationESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVER__AUTHENTICATION, oldAuthentication, null, oldAuthenticationESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetAuthentication() {
		if (authentication != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)authentication).eInverseRemove(this, SclPackage.AUTHENTICATION__SERVER, Authentication.class, msgs);
			msgs = basicUnsetAuthentication(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAuthenticationESet = authenticationESet;
			authenticationESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVER__AUTHENTICATION, null, null, oldAuthenticationESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetAuthentication() {
		return authenticationESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<LDevice> getLDevice() {
		if (lDevice == null) {
			lDevice = new EObjectContainmentWithInverseEList.Unsettable<LDevice>(LDevice.class, this, SclPackage.SERVER__LDEVICE, SclPackage.LDEVICE__SERVER);
		}
		return lDevice;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetLDevice() {
		if (lDevice != null) ((InternalEList.Unsettable<?>)lDevice).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetLDevice() {
		return lDevice != null && ((InternalEList.Unsettable<?>)lDevice).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServer_timeout_unsigned_int(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv Server_timeout_unsigned_int:
		 *   let
		 *     severity : Integer[1] = 'Server::Server_timeout_unsigned_int'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.timeout <> null implies self.timeout >= 0
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'timeout attribute shall be valid in Server (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.timeout.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'Server::Server_timeout_unsigned_int'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_Server_c_c_Server_timeout_unsigned_int);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ Integer timeout_0 = this.getTimeout();
				final /*@NonInvalid*/ IntegerValue BOXED_timeout_0 = timeout_0 == null ? null : ValueUtil.integerValueOf(timeout_0);
				final /*@NonInvalid*/ boolean ne = BOXED_timeout_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_timeout_0, SclTables.INT_0).booleanValue();
					status = ge;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_timeout_32_attribute_32_shall_32_be_32_valid_32_in_32_Server_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_timeout_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_Server_c_c_Server_timeout_unsigned_int, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServer_one_Authentication_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv Server_one_Authentication_required:
		 *   let
		 *     severity : Integer[1] = 'Server::Server_one_Authentication_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.Authentication <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'Server shall contain one Authentication (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'Server::Server_one_Authentication_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_Server_c_c_Server_one_Authentication_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ Authentication Authentication = this.getAuthentication();
			final /*@NonInvalid*/ boolean status = Authentication != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_Server_32_shall_32_contain_32_one_32_Authentication_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_Server_c_c_Server_one_Authentication_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServer_at_least_one_LDevice_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv Server_at_least_one_LDevice_required:
		 *   let
		 *     severity : Integer[1] = 'Server::Server_at_least_one_LDevice_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[1] = self.LDevice->notEmpty()
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'Server shall contain at least one LDevice (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'Server::Server_at_least_one_LDevice_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_Server_c_c_Server_at_least_one_LDevice_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ List<LDevice> LDevice = this.getLDevice();
			final /*@NonInvalid*/ SetValue BOXED_LDevice = idResolver.createSetOfAll(SclTables.SET_CLSSid_LDevice, LDevice);
			final /*@NonInvalid*/ boolean status = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_LDevice).booleanValue();
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_Server_32_shall_32_contain_32_at_32_least_32_one_32_LDevice_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_Server_c_c_Server_at_least_one_LDevice_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.SERVER__ACCESS_POINT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAccessPoint((AccessPoint)otherEnd, msgs);
			case SclPackage.SERVER__ASSOCIATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociation()).basicAdd(otherEnd, msgs);
			case SclPackage.SERVER__AUTHENTICATION:
				if (authentication != null)
					msgs = ((InternalEObject)authentication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVER__AUTHENTICATION, null, msgs);
				return basicSetAuthentication((Authentication)otherEnd, msgs);
			case SclPackage.SERVER__LDEVICE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLDevice()).basicAdd(otherEnd, msgs);
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
			case SclPackage.SERVER__ACCESS_POINT:
				return basicSetAccessPoint(null, msgs);
			case SclPackage.SERVER__ASSOCIATION:
				return ((InternalEList<?>)getAssociation()).basicRemove(otherEnd, msgs);
			case SclPackage.SERVER__AUTHENTICATION:
				return basicUnsetAuthentication(msgs);
			case SclPackage.SERVER__LDEVICE:
				return ((InternalEList<?>)getLDevice()).basicRemove(otherEnd, msgs);
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
			case SclPackage.SERVER__ACCESS_POINT:
				return eInternalContainer().eInverseRemove(this, SclPackage.ACCESS_POINT__SERVER, AccessPoint.class, msgs);
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
			case SclPackage.SERVER__TIMEOUT:
				return getTimeout();
			case SclPackage.SERVER__ACCESS_POINT:
				return getAccessPoint();
			case SclPackage.SERVER__ASSOCIATION:
				return getAssociation();
			case SclPackage.SERVER__AUTHENTICATION:
				return getAuthentication();
			case SclPackage.SERVER__LDEVICE:
				return getLDevice();
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
			case SclPackage.SERVER__TIMEOUT:
				setTimeout((Integer)newValue);
				return;
			case SclPackage.SERVER__ACCESS_POINT:
				setAccessPoint((AccessPoint)newValue);
				return;
			case SclPackage.SERVER__ASSOCIATION:
				getAssociation().clear();
				getAssociation().addAll((Collection<? extends Association>)newValue);
				return;
			case SclPackage.SERVER__AUTHENTICATION:
				setAuthentication((Authentication)newValue);
				return;
			case SclPackage.SERVER__LDEVICE:
				getLDevice().clear();
				getLDevice().addAll((Collection<? extends LDevice>)newValue);
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
			case SclPackage.SERVER__TIMEOUT:
				unsetTimeout();
				return;
			case SclPackage.SERVER__ACCESS_POINT:
				setAccessPoint((AccessPoint)null);
				return;
			case SclPackage.SERVER__ASSOCIATION:
				unsetAssociation();
				return;
			case SclPackage.SERVER__AUTHENTICATION:
				unsetAuthentication();
				return;
			case SclPackage.SERVER__LDEVICE:
				unsetLDevice();
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
			case SclPackage.SERVER__TIMEOUT:
				return isSetTimeout();
			case SclPackage.SERVER__ACCESS_POINT:
				return getAccessPoint() != null;
			case SclPackage.SERVER__ASSOCIATION:
				return isSetAssociation();
			case SclPackage.SERVER__AUTHENTICATION:
				return isSetAuthentication();
			case SclPackage.SERVER__LDEVICE:
				return isSetLDevice();
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
			case SclPackage.SERVER___VALIDATE_SERVER_TIMEOUT_UNSIGNED_INT__DIAGNOSTICCHAIN_MAP:
				return validateServer_timeout_unsigned_int((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SERVER___VALIDATE_SERVER_ONE_AUTHENTICATION_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateServer_one_Authentication_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SERVER___VALIDATE_SERVER_AT_LEAST_ONE_LDEVICE_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateServer_at_least_one_LDevice_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (timeout: ");
		if (timeoutESet) result.append(timeout); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ServerImpl
