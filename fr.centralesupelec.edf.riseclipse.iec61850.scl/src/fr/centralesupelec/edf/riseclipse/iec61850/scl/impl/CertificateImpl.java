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

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.library.string.StringMatchesOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IssuerName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Subject;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Certificate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CertificateImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CertificateImpl#getXferNumber <em>Xfer Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CertificateImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CertificateImpl#getIssuerName <em>Issuer Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CertificateImpl extends NamingImpl implements Certificate {
    /**
	 * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
    protected static final String SERIAL_NUMBER_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
    protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

    /**
	 * This is true if the Serial Number attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean serialNumberESet;

    /**
	 * The default value of the '{@link #getXferNumber() <em>Xfer Number</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getXferNumber()
	 * @generated
	 * @ordered
	 */
    protected static final Integer XFER_NUMBER_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getXferNumber() <em>Xfer Number</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getXferNumber()
	 * @generated
	 * @ordered
	 */
    protected Integer xferNumber = XFER_NUMBER_EDEFAULT;

    /**
	 * This is true if the Xfer Number attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean xferNumberESet;

    /**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
    protected Subject subject;

    /**
	 * This is true if the Subject containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean subjectESet;

    /**
	 * The cached value of the '{@link #getIssuerName() <em>Issuer Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIssuerName()
	 * @generated
	 * @ordered
	 */
    protected IssuerName issuerName;

    /**
	 * This is true if the Issuer Name containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean issuerNameESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CertificateImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getCertificate();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getSerialNumber() {
		return serialNumber;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSerialNumber( String newSerialNumber ) {
		String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		boolean oldSerialNumberESet = serialNumberESet;
		serialNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CERTIFICATE__SERIAL_NUMBER, oldSerialNumber, serialNumber, !oldSerialNumberESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSerialNumber() {
		String oldSerialNumber = serialNumber;
		boolean oldSerialNumberESet = serialNumberESet;
		serialNumber = SERIAL_NUMBER_EDEFAULT;
		serialNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CERTIFICATE__SERIAL_NUMBER, oldSerialNumber, SERIAL_NUMBER_EDEFAULT, oldSerialNumberESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSerialNumber() {
		return serialNumberESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Integer getXferNumber() {
		return xferNumber;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setXferNumber( Integer newXferNumber ) {
		Integer oldXferNumber = xferNumber;
		xferNumber = newXferNumber;
		boolean oldXferNumberESet = xferNumberESet;
		xferNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CERTIFICATE__XFER_NUMBER, oldXferNumber, xferNumber, !oldXferNumberESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetXferNumber() {
		Integer oldXferNumber = xferNumber;
		boolean oldXferNumberESet = xferNumberESet;
		xferNumber = XFER_NUMBER_EDEFAULT;
		xferNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CERTIFICATE__XFER_NUMBER, oldXferNumber, XFER_NUMBER_EDEFAULT, oldXferNumberESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetXferNumber() {
		return xferNumberESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Subject getSubject() {
		return subject;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSubject( Subject newSubject, NotificationChain msgs ) {
		Subject oldSubject = subject;
		subject = newSubject;
		boolean oldSubjectESet = subjectESet;
		subjectESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.CERTIFICATE__SUBJECT, oldSubject, newSubject, !oldSubjectESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSubject( Subject newSubject ) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, SclPackage.SUBJECT__CERTIFICATE, Subject.class, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, SclPackage.SUBJECT__CERTIFICATE, Subject.class, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSubjectESet = subjectESet;
			subjectESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CERTIFICATE__SUBJECT, newSubject, newSubject, !oldSubjectESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetSubject( NotificationChain msgs ) {
		Subject oldSubject = subject;
		subject = null;
		boolean oldSubjectESet = subjectESet;
		subjectESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.CERTIFICATE__SUBJECT, oldSubject, null, oldSubjectESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSubject() {
		if (subject != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)subject).eInverseRemove(this, SclPackage.SUBJECT__CERTIFICATE, Subject.class, msgs);
			msgs = basicUnsetSubject(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSubjectESet = subjectESet;
			subjectESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CERTIFICATE__SUBJECT, null, null, oldSubjectESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSubject() {
		return subjectESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IssuerName getIssuerName() {
		return issuerName;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetIssuerName( IssuerName newIssuerName, NotificationChain msgs ) {
		IssuerName oldIssuerName = issuerName;
		issuerName = newIssuerName;
		boolean oldIssuerNameESet = issuerNameESet;
		issuerNameESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.CERTIFICATE__ISSUER_NAME, oldIssuerName, newIssuerName, !oldIssuerNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIssuerName( IssuerName newIssuerName ) {
		if (newIssuerName != issuerName) {
			NotificationChain msgs = null;
			if (issuerName != null)
				msgs = ((InternalEObject)issuerName).eInverseRemove(this, SclPackage.ISSUER_NAME__CERTIFICATE, IssuerName.class, msgs);
			if (newIssuerName != null)
				msgs = ((InternalEObject)newIssuerName).eInverseAdd(this, SclPackage.ISSUER_NAME__CERTIFICATE, IssuerName.class, msgs);
			msgs = basicSetIssuerName(newIssuerName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldIssuerNameESet = issuerNameESet;
			issuerNameESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CERTIFICATE__ISSUER_NAME, newIssuerName, newIssuerName, !oldIssuerNameESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetIssuerName( NotificationChain msgs ) {
		IssuerName oldIssuerName = issuerName;
		issuerName = null;
		boolean oldIssuerNameESet = issuerNameESet;
		issuerNameESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.CERTIFICATE__ISSUER_NAME, oldIssuerName, null, oldIssuerNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetIssuerName() {
		if (issuerName != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)issuerName).eInverseRemove(this, SclPackage.ISSUER_NAME__CERTIFICATE, IssuerName.class, msgs);
			msgs = basicUnsetIssuerName(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldIssuerNameESet = issuerNameESet;
			issuerNameESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CERTIFICATE__ISSUER_NAME, null, null, oldIssuerNameESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetIssuerName() {
		return issuerNameESet;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificate_serialNumber_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv Certificate_serialNumber_required:
		 *   let
		 *     severity : Integer[1] = 'Certificate::Certificate_serialNumber_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.serialNumber <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'serialNumber attribute shall be present in Certificate (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'Certificate::Certificate_serialNumber_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_Certificate_c_c_Certificate_serialNumber_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String serialNumber = this.getSerialNumber();
			final /*@NonInvalid*/ boolean status = serialNumber != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_serialNumber_32_attribute_32_shall_32_be_32_present_32_in_32_Certificate_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_Certificate_c_c_Certificate_serialNumber_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificate_serialNumber_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv Certificate_serialNumber_valid:
		 *   let
		 *     severity : Integer[1] = 'Certificate::Certificate_serialNumber_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.serialNumber <> null implies
		 *           self.serialNumber.matches('[0-9]+')
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'serialNumber attribute shall be valid in Certificate (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.serialNumber.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'Certificate::Certificate_serialNumber_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_Certificate_c_c_Certificate_serialNumber_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String serialNumber = this.getSerialNumber();
				final /*@NonInvalid*/ boolean ne = serialNumber != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, serialNumber, SclTables.STR__91_0_m_9_93_p).booleanValue();
					status = matches;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_serialNumber_32_attribute_32_shall_32_be_32_valid_32_in_32_Certificate_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(serialNumber);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_Certificate_c_c_Certificate_serialNumber_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificate_xferNumber_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv Certificate_xferNumber_valid:
		 *   let
		 *     severity : Integer[1] = 'Certificate::Certificate_xferNumber_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.xferNumber <> null implies self.xferNumber >= 0
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'xferNumber attribute shall be valid in Certificate (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.xferNumber.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'Certificate::Certificate_xferNumber_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_Certificate_c_c_Certificate_xferNumber_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ Integer xferNumber_0 = this.getXferNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_xferNumber_0 = xferNumber_0 == null ? null : ValueUtil.integerValueOf(xferNumber_0);
				final /*@NonInvalid*/ boolean ne = BOXED_xferNumber_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_xferNumber_0, SclTables.INT_0).booleanValue();
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_xferNumber_32_attribute_32_shall_32_be_32_valid_32_in_32_Certificate_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_xferNumber_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_Certificate_c_c_Certificate_xferNumber_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificate_one_Subject_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv Certificate_one_Subject_required:
		 *   let
		 *     severity : Integer[1] = 'Certificate::Certificate_one_Subject_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.Subject <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'Certificate shall contain a Subject (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'Certificate::Certificate_one_Subject_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_Certificate_c_c_Certificate_one_Subject_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ Subject Subject = this.getSubject();
			final /*@NonInvalid*/ boolean status = Subject != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_Certificate_32_shall_32_contain_32_a_32_Subject_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_Certificate_c_c_Certificate_one_Subject_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificate_one_IssuerName_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv Certificate_one_IssuerName_required:
		 *   let
		 *     severity : Integer[1] = 'Certificate::Certificate_one_IssuerName_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.IssuerName <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'Certificate shall contain an IssuerName (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'Certificate::Certificate_one_IssuerName_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_Certificate_c_c_Certificate_one_IssuerName_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ IssuerName IssuerName = this.getIssuerName();
			final /*@NonInvalid*/ boolean status = IssuerName != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_Certificate_32_shall_32_contain_32_an_32_IssuerName_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_Certificate_c_c_Certificate_one_IssuerName_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.CERTIFICATE__SUBJECT:
				if (subject != null)
					msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.CERTIFICATE__SUBJECT, null, msgs);
				return basicSetSubject((Subject)otherEnd, msgs);
			case SclPackage.CERTIFICATE__ISSUER_NAME:
				if (issuerName != null)
					msgs = ((InternalEObject)issuerName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.CERTIFICATE__ISSUER_NAME, null, msgs);
				return basicSetIssuerName((IssuerName)otherEnd, msgs);
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
			case SclPackage.CERTIFICATE__SUBJECT:
				return basicUnsetSubject(msgs);
			case SclPackage.CERTIFICATE__ISSUER_NAME:
				return basicUnsetIssuerName(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
		switch (featureID) {
			case SclPackage.CERTIFICATE__SERIAL_NUMBER:
				return getSerialNumber();
			case SclPackage.CERTIFICATE__XFER_NUMBER:
				return getXferNumber();
			case SclPackage.CERTIFICATE__SUBJECT:
				return getSubject();
			case SclPackage.CERTIFICATE__ISSUER_NAME:
				return getIssuerName();
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
			case SclPackage.CERTIFICATE__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case SclPackage.CERTIFICATE__XFER_NUMBER:
				setXferNumber((Integer)newValue);
				return;
			case SclPackage.CERTIFICATE__SUBJECT:
				setSubject((Subject)newValue);
				return;
			case SclPackage.CERTIFICATE__ISSUER_NAME:
				setIssuerName((IssuerName)newValue);
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
			case SclPackage.CERTIFICATE__SERIAL_NUMBER:
				unsetSerialNumber();
				return;
			case SclPackage.CERTIFICATE__XFER_NUMBER:
				unsetXferNumber();
				return;
			case SclPackage.CERTIFICATE__SUBJECT:
				unsetSubject();
				return;
			case SclPackage.CERTIFICATE__ISSUER_NAME:
				unsetIssuerName();
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
			case SclPackage.CERTIFICATE__SERIAL_NUMBER:
				return isSetSerialNumber();
			case SclPackage.CERTIFICATE__XFER_NUMBER:
				return isSetXferNumber();
			case SclPackage.CERTIFICATE__SUBJECT:
				return isSetSubject();
			case SclPackage.CERTIFICATE__ISSUER_NAME:
				return isSetIssuerName();
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
			case SclPackage.CERTIFICATE___VALIDATE_CERTIFICATE_SERIAL_NUMBER_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateCertificate_serialNumber_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CERTIFICATE___VALIDATE_CERTIFICATE_SERIAL_NUMBER_VALID__DIAGNOSTICCHAIN_MAP:
				return validateCertificate_serialNumber_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CERTIFICATE___VALIDATE_CERTIFICATE_XFER_NUMBER_VALID__DIAGNOSTICCHAIN_MAP:
				return validateCertificate_xferNumber_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CERTIFICATE___VALIDATE_CERTIFICATE_ONE_SUBJECT_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateCertificate_one_Subject_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CERTIFICATE___VALIDATE_CERTIFICATE_ONE_ISSUER_NAME_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateCertificate_one_IssuerName_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (serialNumber: ");
		if (serialNumberESet) result.append(serialNumber); else result.append("<unset>");
		result.append(", xferNumber: ");
		if (xferNumberESet) result.append(xferNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CertificateImpl
