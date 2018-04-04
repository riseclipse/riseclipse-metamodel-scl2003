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

import java.util.List;

import java.util.Map;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclSwitch;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server At</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerAtImpl#getApName <em>Ap Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerAtImpl#getAccessPoint <em>Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerAtImpl#getRefersToAccessPoint <em>Refers To Access Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerAtImpl extends UnNamingImpl implements ServerAt {
    /**
	 * The default value of the '{@link #getApName() <em>Ap Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getApName()
	 * @generated
	 * @ordered
	 */
    protected static final String AP_NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getApName() <em>Ap Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getApName()
	 * @generated
	 * @ordered
	 */
    protected String apName = AP_NAME_EDEFAULT;

    /**
	 * This is true if the Ap Name attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean apNameESet;

    /**
	 * The cached value of the '{@link #getRefersToAccessPoint() <em>Refers To Access Point</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRefersToAccessPoint()
	 * @generated
	 * @ordered
	 */
    protected AccessPoint refersToAccessPoint;

    /**
	 * This is true if the Refers To Access Point reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean refersToAccessPointESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ServerAtImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getServerAt();
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getApName() {
        if( isSetRefersToAccessPoint() ) {
            return getRefersToAccessPoint().getName();
        }
        return apName;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setApName( String newApName ) {
		String oldApName = apName;
		apName = newApName;
		boolean oldApNameESet = apNameESet;
		apNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVER_AT__AP_NAME, oldApName, apName, !oldApNameESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetApName() {
		String oldApName = apName;
		boolean oldApNameESet = apNameESet;
		apName = AP_NAME_EDEFAULT;
		apNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVER_AT__AP_NAME, oldApName, AP_NAME_EDEFAULT, oldApNameESet));
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean isSetApName() {
        return isSetRefersToAccessPoint();
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AccessPoint getAccessPoint() {
		if (eContainerFeatureID() != SclPackage.SERVER_AT__ACCESS_POINT) return null;
		return (AccessPoint)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetAccessPoint( AccessPoint newAccessPoint, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newAccessPoint, SclPackage.SERVER_AT__ACCESS_POINT, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAccessPoint( AccessPoint newAccessPoint ) {
		if (newAccessPoint != eInternalContainer() || (eContainerFeatureID() != SclPackage.SERVER_AT__ACCESS_POINT && newAccessPoint != null)) {
			if (EcoreUtil.isAncestor(this, newAccessPoint))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAccessPoint != null)
				msgs = ((InternalEObject)newAccessPoint).eInverseAdd(this, SclPackage.ACCESS_POINT__SERVER_AT, AccessPoint.class, msgs);
			msgs = basicSetAccessPoint(newAccessPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVER_AT__ACCESS_POINT, newAccessPoint, newAccessPoint));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AccessPoint getRefersToAccessPoint() {
		return refersToAccessPoint;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetRefersToAccessPoint(AccessPoint newRefersToAccessPoint, NotificationChain msgs) {
		AccessPoint oldRefersToAccessPoint = refersToAccessPoint;
		refersToAccessPoint = newRefersToAccessPoint;
		boolean oldRefersToAccessPointESet = refersToAccessPointESet;
		refersToAccessPointESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT, oldRefersToAccessPoint, newRefersToAccessPoint, !oldRefersToAccessPointESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRefersToAccessPoint(AccessPoint newRefersToAccessPoint) {
		if (newRefersToAccessPoint != refersToAccessPoint) {
			NotificationChain msgs = null;
			if (refersToAccessPoint != null)
				msgs = ((InternalEObject)refersToAccessPoint).eInverseRemove(this, SclPackage.ACCESS_POINT__REFERRED_BY_SERVER_AT, AccessPoint.class, msgs);
			if (newRefersToAccessPoint != null)
				msgs = ((InternalEObject)newRefersToAccessPoint).eInverseAdd(this, SclPackage.ACCESS_POINT__REFERRED_BY_SERVER_AT, AccessPoint.class, msgs);
			msgs = basicSetRefersToAccessPoint(newRefersToAccessPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToAccessPointESet = refersToAccessPointESet;
			refersToAccessPointESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT, newRefersToAccessPoint, newRefersToAccessPoint, !oldRefersToAccessPointESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetRefersToAccessPoint(NotificationChain msgs) {
		AccessPoint oldRefersToAccessPoint = refersToAccessPoint;
		refersToAccessPoint = null;
		boolean oldRefersToAccessPointESet = refersToAccessPointESet;
		refersToAccessPointESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT, oldRefersToAccessPoint, null, oldRefersToAccessPointESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetRefersToAccessPoint() {
		if (refersToAccessPoint != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)refersToAccessPoint).eInverseRemove(this, SclPackage.ACCESS_POINT__REFERRED_BY_SERVER_AT, AccessPoint.class, msgs);
			msgs = basicUnsetRefersToAccessPoint(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToAccessPointESet = refersToAccessPointESet;
			refersToAccessPointESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT, null, null, oldRefersToAccessPointESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetRefersToAccessPoint() {
		return refersToAccessPointESet;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServerAt_apName_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ServerAt_apName_required:
		 *   let
		 *     severity : Integer[1] = 'ServerAt::ServerAt_apName_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.apName <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'apName attribute shall be present in ServerAt (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'ServerAt::ServerAt_apName_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ServerAt_c_c_ServerAt_apName_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String apName = this.getApName();
			final /*@NonInvalid*/ boolean status = apName != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_apName_32_attribute_32_shall_32_be_32_present_32_in_32_ServerAt_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ServerAt_c_c_ServerAt_apName_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServerAt_apName_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ServerAt_apName_valid:
		 *   let severity : Integer[1] = 'ServerAt::ServerAt_apName_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.apName <> null implies
		 *           self.validSclAccessPointName(apName)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'apName attribute shall be valid in ServerAt (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.apName.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ServerAt::ServerAt_apName_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ServerAt_c_c_ServerAt_apName_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String apName_0 = this.getApName();
				final /*@NonInvalid*/ boolean ne = apName_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclAccessPointName = ((SclObject)this).validSclAccessPointName(apName_0);
					status = validSclAccessPointName;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_apName_32_attribute_32_shall_32_be_32_valid_32_in_32_ServerAt_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(apName_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ServerAt_c_c_ServerAt_apName_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.SERVER_AT__ACCESS_POINT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAccessPoint((AccessPoint)otherEnd, msgs);
			case SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT:
				if (refersToAccessPoint != null)
					msgs = ((InternalEObject)refersToAccessPoint).eInverseRemove(this, SclPackage.ACCESS_POINT__REFERRED_BY_SERVER_AT, AccessPoint.class, msgs);
				return basicSetRefersToAccessPoint((AccessPoint)otherEnd, msgs);
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
			case SclPackage.SERVER_AT__ACCESS_POINT:
				return basicSetAccessPoint(null, msgs);
			case SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT:
				return basicUnsetRefersToAccessPoint(msgs);
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
			case SclPackage.SERVER_AT__ACCESS_POINT:
				return eInternalContainer().eInverseRemove(this, SclPackage.ACCESS_POINT__SERVER_AT, AccessPoint.class, msgs);
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
			case SclPackage.SERVER_AT__AP_NAME:
				return getApName();
			case SclPackage.SERVER_AT__ACCESS_POINT:
				return getAccessPoint();
			case SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT:
				return getRefersToAccessPoint();
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
			case SclPackage.SERVER_AT__AP_NAME:
				setApName((String)newValue);
				return;
			case SclPackage.SERVER_AT__ACCESS_POINT:
				setAccessPoint((AccessPoint)newValue);
				return;
			case SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT:
				setRefersToAccessPoint((AccessPoint)newValue);
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
			case SclPackage.SERVER_AT__AP_NAME:
				unsetApName();
				return;
			case SclPackage.SERVER_AT__ACCESS_POINT:
				setAccessPoint((AccessPoint)null);
				return;
			case SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT:
				unsetRefersToAccessPoint();
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
			case SclPackage.SERVER_AT__AP_NAME:
				return isSetApName();
			case SclPackage.SERVER_AT__ACCESS_POINT:
				return getAccessPoint() != null;
			case SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT:
				return isSetRefersToAccessPoint();
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
			case SclPackage.SERVER_AT___VALIDATE_SERVER_AT_AP_NAME_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateServerAt_apName_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SERVER_AT___VALIDATE_SERVER_AT_AP_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateServerAt_apName_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (apName: ");
		if (apNameESet) result.append(apName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

    @Override
    protected void doResolveLinks() {
        // Resolve only if attribute has been read
        // Cannot use isSetApName() Here
        if( !apNameESet ) return;

        SclSwitch< Boolean > s = new SclSwitch< Boolean >() {

            @Override
            public Boolean caseAccessPoint( AccessPoint object ) {
                return object.getName().equals( getApName() );
            }

            @Override
            public Boolean defaultCase( EObject object ) {
                return false;
            }

        };

        List< AccessPoint > res = shallowSearchObjects( getAccessPoint().getIED().getAccessPoint(), s );
        String mess = "AccessPoint( name = " + getApName() + " ) for ServerAt on line " + getLineNumber() + " )";
        if( res.isEmpty() ) {
            AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess );
        }
        else if( res.size() > 1 ) {
            AbstractRiseClipseConsole.getConsole().error( "found several " + mess );
        }
        else {
            //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
            setRefersToAccessPoint( res.get( 0 ) );
        }
    }

} //ServerAtImpl
