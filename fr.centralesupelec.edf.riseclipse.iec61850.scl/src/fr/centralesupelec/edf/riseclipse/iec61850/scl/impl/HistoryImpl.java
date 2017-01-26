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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Header;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.History;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HistoryImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HistoryImpl#getHitem <em>Hitem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoryImpl extends SclObjectImpl implements History {
    /**
     * The cached value of the '{@link #getHitem() <em>Hitem</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHitem()
     * @generated
     * @ordered
     */
    protected EList<Hitem> hitem;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HistoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getHistory();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Header getHeader() {
        if (eContainerFeatureID() != SclPackage.HISTORY__HEADER) return null;
        return (Header)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHeader( Header newHeader, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newHeader, SclPackage.HISTORY__HEADER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHeader( Header newHeader ) {
        if (newHeader != eInternalContainer() || (eContainerFeatureID() != SclPackage.HISTORY__HEADER && newHeader != null)) {
            if (EcoreUtil.isAncestor(this, newHeader))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newHeader != null)
                msgs = ((InternalEObject)newHeader).eInverseAdd(this, SclPackage.HEADER__HISTORY, Header.class, msgs);
            msgs = basicSetHeader(newHeader, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.HISTORY__HEADER, newHeader, newHeader));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Hitem> getHitem() {
        if (hitem == null) {
            hitem = new EObjectContainmentWithInverseEList.Unsettable<Hitem>(Hitem.class, this, SclPackage.HISTORY__HITEM, SclPackage.HITEM__HISTORY);
        }
        return hitem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetHitem() {
        if (hitem != null) ((InternalEList.Unsettable<?>)hitem).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetHitem() {
        return hitem != null && ((InternalEList.Unsettable<?>)hitem).isSet();
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
            case SclPackage.HISTORY__HEADER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetHeader((Header)otherEnd, msgs);
            case SclPackage.HISTORY__HITEM:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getHitem()).basicAdd(otherEnd, msgs);
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
            case SclPackage.HISTORY__HEADER:
                return basicSetHeader(null, msgs);
            case SclPackage.HISTORY__HITEM:
                return ((InternalEList<?>)getHitem()).basicRemove(otherEnd, msgs);
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
            case SclPackage.HISTORY__HEADER:
                return eInternalContainer().eInverseRemove(this, SclPackage.HEADER__HISTORY, Header.class, msgs);
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
            case SclPackage.HISTORY__HEADER:
                return getHeader();
            case SclPackage.HISTORY__HITEM:
                return getHitem();
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
            case SclPackage.HISTORY__HEADER:
                setHeader((Header)newValue);
                return;
            case SclPackage.HISTORY__HITEM:
                getHitem().clear();
                getHitem().addAll((Collection<? extends Hitem>)newValue);
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
            case SclPackage.HISTORY__HEADER:
                setHeader((Header)null);
                return;
            case SclPackage.HISTORY__HITEM:
                unsetHitem();
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
            case SclPackage.HISTORY__HEADER:
                return getHeader() != null;
            case SclPackage.HISTORY__HITEM:
                return isSetHitem();
        }
        return super.eIsSet(featureID);
    }

} //HistoryImpl
