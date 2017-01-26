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
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Line;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal;

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
        return SclPackage.eINSTANCE.getConnectivityNode();
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
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (pathName: ");
        if (pathNameESet) result.append(pathName); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ConnectivityNodeImpl
