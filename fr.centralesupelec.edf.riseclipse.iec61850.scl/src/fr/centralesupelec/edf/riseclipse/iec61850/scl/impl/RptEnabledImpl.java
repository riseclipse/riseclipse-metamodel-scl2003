/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      http://wdi.supelec.fr/software/RiseClipse/
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rpt Enabled</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.RptEnabledImpl#getMax <em>Max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.RptEnabledImpl#getClientLN <em>Client LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.RptEnabledImpl#getReportControl <em>Report Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RptEnabledImpl extends UnNamingImpl implements RptEnabled {
    /**
     * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMax()
     * @generated
     * @ordered
     */
    protected static final Integer MAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMax()
     * @generated
     * @ordered
     */
    protected Integer max = MAX_EDEFAULT;

    /**
     * This is true if the Max attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxESet;

    /**
     * The cached value of the '{@link #getClientLN() <em>Client LN</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClientLN()
     * @generated
     * @ordered
     */
    protected EList<ClientLN> clientLN;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RptEnabledImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getRptEnabled();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getMax() {
        return max;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMax( Integer newMax ) {
        Integer oldMax = max;
        max = newMax;
        boolean oldMaxESet = maxESet;
        maxESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.RPT_ENABLED__MAX, oldMax, max, !oldMaxESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMax() {
        Integer oldMax = max;
        boolean oldMaxESet = maxESet;
        max = MAX_EDEFAULT;
        maxESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.RPT_ENABLED__MAX, oldMax, MAX_EDEFAULT, oldMaxESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMax() {
        return maxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ClientLN> getClientLN() {
        if (clientLN == null) {
            clientLN = new EObjectContainmentWithInverseEList.Unsettable<ClientLN>(ClientLN.class, this, SclPackage.RPT_ENABLED__CLIENT_LN, SclPackage.CLIENT_LN__RPT_ENABLED);
        }
        return clientLN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetClientLN() {
        if (clientLN != null) ((InternalEList.Unsettable<?>)clientLN).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetClientLN() {
        return clientLN != null && ((InternalEList.Unsettable<?>)clientLN).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReportControl getReportControl() {
        if (eContainerFeatureID() != SclPackage.RPT_ENABLED__REPORT_CONTROL) return null;
        return (ReportControl)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReportControl( ReportControl newReportControl, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newReportControl, SclPackage.RPT_ENABLED__REPORT_CONTROL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReportControl( ReportControl newReportControl ) {
        if (newReportControl != eInternalContainer() || (eContainerFeatureID() != SclPackage.RPT_ENABLED__REPORT_CONTROL && newReportControl != null)) {
            if (EcoreUtil.isAncestor(this, newReportControl))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newReportControl != null)
                msgs = ((InternalEObject)newReportControl).eInverseAdd(this, SclPackage.REPORT_CONTROL__RPT_ENABLED, ReportControl.class, msgs);
            msgs = basicSetReportControl(newReportControl, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.RPT_ENABLED__REPORT_CONTROL, newReportControl, newReportControl));
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
            case SclPackage.RPT_ENABLED__CLIENT_LN:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getClientLN()).basicAdd(otherEnd, msgs);
            case SclPackage.RPT_ENABLED__REPORT_CONTROL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetReportControl((ReportControl)otherEnd, msgs);
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
            case SclPackage.RPT_ENABLED__CLIENT_LN:
                return ((InternalEList<?>)getClientLN()).basicRemove(otherEnd, msgs);
            case SclPackage.RPT_ENABLED__REPORT_CONTROL:
                return basicSetReportControl(null, msgs);
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
            case SclPackage.RPT_ENABLED__REPORT_CONTROL:
                return eInternalContainer().eInverseRemove(this, SclPackage.REPORT_CONTROL__RPT_ENABLED, ReportControl.class, msgs);
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
            case SclPackage.RPT_ENABLED__MAX:
                return getMax();
            case SclPackage.RPT_ENABLED__CLIENT_LN:
                return getClientLN();
            case SclPackage.RPT_ENABLED__REPORT_CONTROL:
                return getReportControl();
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
            case SclPackage.RPT_ENABLED__MAX:
                setMax((Integer)newValue);
                return;
            case SclPackage.RPT_ENABLED__CLIENT_LN:
                getClientLN().clear();
                getClientLN().addAll((Collection<? extends ClientLN>)newValue);
                return;
            case SclPackage.RPT_ENABLED__REPORT_CONTROL:
                setReportControl((ReportControl)newValue);
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
            case SclPackage.RPT_ENABLED__MAX:
                unsetMax();
                return;
            case SclPackage.RPT_ENABLED__CLIENT_LN:
                unsetClientLN();
                return;
            case SclPackage.RPT_ENABLED__REPORT_CONTROL:
                setReportControl((ReportControl)null);
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
            case SclPackage.RPT_ENABLED__MAX:
                return isSetMax();
            case SclPackage.RPT_ENABLED__CLIENT_LN:
                return isSetClientLN();
            case SclPackage.RPT_ENABLED__REPORT_CONTROL:
                return getReportControl() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (max: ");
        if (maxESet) result.append(max); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //RptEnabledImpl
