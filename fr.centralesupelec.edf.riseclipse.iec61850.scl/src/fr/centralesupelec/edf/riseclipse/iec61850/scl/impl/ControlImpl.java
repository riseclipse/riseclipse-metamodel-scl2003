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

import java.util.List;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Control;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclSwitch;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlImpl#getDatSet <em>Dat Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlImpl#getRefersToDataSet <em>Refers To Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ControlImpl extends UnNamingImpl implements Control {
    /**
     * The default value of the '{@link #getDatSet() <em>Dat Set</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDatSet()
     * @generated
     * @ordered
     */
    protected static final String DAT_SET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDatSet() <em>Dat Set</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDatSet()
     * @generated
     * @ordered
     */
    protected String datSet = DAT_SET_EDEFAULT;

    /**
     * This is true if the Dat Set attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean datSetESet;

    /**
     * The cached value of the '{@link #getRefersToDataSet() <em>Refers To Data Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToDataSet()
     * @generated
     * @ordered
     */
    protected DataSet refersToDataSet;

    /**
     * This is true if the Refers To Data Set reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToDataSetESet;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ControlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getControl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getDatSet() {
        if( isSetRefersToDataSet() )
            return getRefersToDataSet().getName();
        else
            return datSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDatSet( String newDatSet ) {
        String oldDatSet = datSet;
        datSet = newDatSet;
        boolean oldDatSetESet = datSetESet;
        datSetESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL__DAT_SET, oldDatSet, datSet, !oldDatSetESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDatSet() {
        String oldDatSet = datSet;
        boolean oldDatSetESet = datSetESet;
        datSet = DAT_SET_EDEFAULT;
        datSetESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL__DAT_SET, oldDatSet, DAT_SET_EDEFAULT, oldDatSetESet));
    }

    /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
    public boolean isSetDatSet() {
        return isSetRefersToDataSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataSet getRefersToDataSet() {
        return refersToDataSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToDataSet(DataSet newRefersToDataSet, NotificationChain msgs) {
        DataSet oldRefersToDataSet = refersToDataSet;
        refersToDataSet = newRefersToDataSet;
        boolean oldRefersToDataSetESet = refersToDataSetESet;
        refersToDataSetESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL__REFERS_TO_DATA_SET, oldRefersToDataSet, newRefersToDataSet, !oldRefersToDataSetESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRefersToDataSet(DataSet newRefersToDataSet) {
        if (newRefersToDataSet != refersToDataSet) {
            NotificationChain msgs = null;
            if (refersToDataSet != null)
                msgs = ((InternalEObject)refersToDataSet).eInverseRemove(this, SclPackage.DATA_SET__REFERRED_BY_CONTROL, DataSet.class, msgs);
            if (newRefersToDataSet != null)
                msgs = ((InternalEObject)newRefersToDataSet).eInverseAdd(this, SclPackage.DATA_SET__REFERRED_BY_CONTROL, DataSet.class, msgs);
            msgs = basicSetRefersToDataSet(newRefersToDataSet, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToDataSetESet = refersToDataSetESet;
            refersToDataSetESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL__REFERS_TO_DATA_SET, newRefersToDataSet, newRefersToDataSet, !oldRefersToDataSetESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToDataSet(NotificationChain msgs) {
        DataSet oldRefersToDataSet = refersToDataSet;
        refersToDataSet = null;
        boolean oldRefersToDataSetESet = refersToDataSetESet;
        refersToDataSetESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL__REFERS_TO_DATA_SET, oldRefersToDataSet, null, oldRefersToDataSetESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetRefersToDataSet() {
        if (refersToDataSet != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)refersToDataSet).eInverseRemove(this, SclPackage.DATA_SET__REFERRED_BY_CONTROL, DataSet.class, msgs);
            msgs = basicUnsetRefersToDataSet(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToDataSetESet = refersToDataSetESet;
            refersToDataSetESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL__REFERS_TO_DATA_SET, null, null, oldRefersToDataSetESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetRefersToDataSet() {
        return refersToDataSetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL__NAME, oldName, name, !oldNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL__NAME, oldName, NAME_EDEFAULT, oldNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.CONTROL__REFERS_TO_DATA_SET:
                if (refersToDataSet != null)
                    msgs = ((InternalEObject)refersToDataSet).eInverseRemove(this, SclPackage.DATA_SET__REFERRED_BY_CONTROL, DataSet.class, msgs);
                return basicSetRefersToDataSet((DataSet)otherEnd, msgs);
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
            case SclPackage.CONTROL__REFERS_TO_DATA_SET:
                return basicUnsetRefersToDataSet(msgs);
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
            case SclPackage.CONTROL__DAT_SET:
                return getDatSet();
            case SclPackage.CONTROL__REFERS_TO_DATA_SET:
                return getRefersToDataSet();
            case SclPackage.CONTROL__NAME:
                return getName();
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
            case SclPackage.CONTROL__DAT_SET:
                setDatSet((String)newValue);
                return;
            case SclPackage.CONTROL__REFERS_TO_DATA_SET:
                setRefersToDataSet((DataSet)newValue);
                return;
            case SclPackage.CONTROL__NAME:
                setName((String)newValue);
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
            case SclPackage.CONTROL__DAT_SET:
                unsetDatSet();
                return;
            case SclPackage.CONTROL__REFERS_TO_DATA_SET:
                unsetRefersToDataSet();
                return;
            case SclPackage.CONTROL__NAME:
                unsetName();
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
            case SclPackage.CONTROL__DAT_SET:
                return isSetDatSet();
            case SclPackage.CONTROL__REFERS_TO_DATA_SET:
                return isSetRefersToDataSet();
            case SclPackage.CONTROL__NAME:
                return isSetName();
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
        result.append(" (datSet: ");
        if (datSetESet) result.append(datSet); else result.append("<unset>");
        result.append(", name: ");
        if (nameESet) result.append(name); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

    @Override
    protected void doResolveLinks() {
        // name    Name of the report control block. This name is relative to the LN hosting the RCB, and shall be unique within the LN
        // desc    The description text 
        // datSet  The name of the data set to be sent by the report control block; datSet should only be missing within an ICD-File,
        //         or to indicate an unused control block. The referenced data set must be in the same LN as the control block.

        // Resolve only if attribute has been read
        // Cannot use isSetDatSet() Here
        if( !datSetESet ) return;

        // find an DataSet with
        //   DataSet.name == Control.datSet
        SclSwitch< Boolean > s = new SclSwitch< Boolean >() {

            @Override
            public Boolean caseDataSet( DataSet object ) {
                return object.getName().equals( getDatSet() );
            }

            @Override
            public Boolean defaultCase( EObject object ) {
                return false;
            }

        };

        List< DataSet > res = shallowSearchObjects( getAnyLN().getDataSet(), s );
        String mess = "DataSet( name = " + getDatSet() + " ) for Control on line " + getLineNumber() + " ( name = "
                + getName() + " )";
        if( res.isEmpty() ) {
            AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess );
        }
        else if( res.size() > 1 ) {
            AbstractRiseClipseConsole.getConsole().error( "found several " + mess );
        }
        else {
            //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
            setRefersToDataSet( res.get( 0 ) );
        }
    }

    // TODO: redesign this
    public AnyLN getAnyLN() {
        return null;
    }

} //ControlImpl
