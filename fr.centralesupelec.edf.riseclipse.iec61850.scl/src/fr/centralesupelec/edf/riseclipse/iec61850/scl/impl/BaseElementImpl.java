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
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BaseElementImpl#getPrivate <em>Private</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BaseElementImpl#getText <em>Text</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BaseElementImpl#getAny <em>Any</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BaseElementImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BaseElementImpl extends ExplicitLinkResolverImpl implements BaseElement {
    /**
     * The cached value of the '{@link #getPrivate() <em>Private</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrivate()
     * @generated
     * @ordered
     */
    protected EList<Private> private_;

    /**
     * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getText()
     * @generated
     * @ordered
     */
    protected Text text;

    /**
     * This is true if the Text containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean textESet;

    /**
     * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAny()
     * @generated
     * @ordered
     */
    protected FeatureMap any;

    /**
     * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #getAnyAttribute()
     * @generated
     * @ordered
     */
    protected FeatureMap anyAttribute;

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    protected BaseElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getBaseElement();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Private> getPrivate() {
        if (private_ == null) {
            private_ = new EObjectContainmentWithInverseEList.Unsettable<Private>(Private.class, this, SclPackage.BASE_ELEMENT__PRIVATE, SclPackage.PRIVATE__BASE_ELEMENT);
        }
        return private_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrivate() {
        if (private_ != null) ((InternalEList.Unsettable<?>)private_).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrivate() {
        return private_ != null && ((InternalEList.Unsettable<?>)private_).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Text getText() {
        return text;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetText( Text newText, NotificationChain msgs ) {
        Text oldText = text;
        text = newText;
        boolean oldTextESet = textESet;
        textESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.BASE_ELEMENT__TEXT, oldText, newText, !oldTextESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setText( Text newText ) {
        if (newText != text) {
            NotificationChain msgs = null;
            if (text != null)
                msgs = ((InternalEObject)text).eInverseRemove(this, SclPackage.TEXT__BASE_ELEMENT, Text.class, msgs);
            if (newText != null)
                msgs = ((InternalEObject)newText).eInverseAdd(this, SclPackage.TEXT__BASE_ELEMENT, Text.class, msgs);
            msgs = basicSetText(newText, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldTextESet = textESet;
            textESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.BASE_ELEMENT__TEXT, newText, newText, !oldTextESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetText( NotificationChain msgs ) {
        Text oldText = text;
        text = null;
        boolean oldTextESet = textESet;
        textESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.BASE_ELEMENT__TEXT, oldText, null, oldTextESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetText() {
        if (text != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)text).eInverseRemove(this, SclPackage.TEXT__BASE_ELEMENT, Text.class, msgs);
            msgs = basicUnsetText(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldTextESet = textESet;
            textESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.BASE_ELEMENT__TEXT, null, null, oldTextESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetText() {
        return textESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, SclPackage.BASE_ELEMENT__ANY);
        }
        return any;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FeatureMap getAnyAttribute() {
        if (anyAttribute == null) {
            anyAttribute = new BasicFeatureMap(this, SclPackage.BASE_ELEMENT__ANY_ATTRIBUTE);
        }
        return anyAttribute;
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
            case SclPackage.BASE_ELEMENT__PRIVATE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrivate()).basicAdd(otherEnd, msgs);
            case SclPackage.BASE_ELEMENT__TEXT:
                if (text != null)
                    msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.BASE_ELEMENT__TEXT, null, msgs);
                return basicSetText((Text)otherEnd, msgs);
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
            case SclPackage.BASE_ELEMENT__PRIVATE:
                return ((InternalEList<?>)getPrivate()).basicRemove(otherEnd, msgs);
            case SclPackage.BASE_ELEMENT__TEXT:
                return basicUnsetText(msgs);
            case SclPackage.BASE_ELEMENT__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
            case SclPackage.BASE_ELEMENT__ANY_ATTRIBUTE:
                return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
            case SclPackage.BASE_ELEMENT__PRIVATE:
                return getPrivate();
            case SclPackage.BASE_ELEMENT__TEXT:
                return getText();
            case SclPackage.BASE_ELEMENT__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case SclPackage.BASE_ELEMENT__ANY_ATTRIBUTE:
                if (coreType) return getAnyAttribute();
                return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
            case SclPackage.BASE_ELEMENT__PRIVATE:
                getPrivate().clear();
                getPrivate().addAll((Collection<? extends Private>)newValue);
                return;
            case SclPackage.BASE_ELEMENT__TEXT:
                setText((Text)newValue);
                return;
            case SclPackage.BASE_ELEMENT__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case SclPackage.BASE_ELEMENT__ANY_ATTRIBUTE:
                ((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
            case SclPackage.BASE_ELEMENT__PRIVATE:
                unsetPrivate();
                return;
            case SclPackage.BASE_ELEMENT__TEXT:
                unsetText();
                return;
            case SclPackage.BASE_ELEMENT__ANY:
                getAny().clear();
                return;
            case SclPackage.BASE_ELEMENT__ANY_ATTRIBUTE:
                getAnyAttribute().clear();
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
            case SclPackage.BASE_ELEMENT__PRIVATE:
                return isSetPrivate();
            case SclPackage.BASE_ELEMENT__TEXT:
                return isSetText();
            case SclPackage.BASE_ELEMENT__ANY:
                return any != null && !any.isEmpty();
            case SclPackage.BASE_ELEMENT__ANY_ATTRIBUTE:
                return anyAttribute != null && !anyAttribute.isEmpty();
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
        result.append(" (any: ");
        result.append(any);
        result.append(", anyAttribute: ");
        result.append(anyAttribute);
        result.append(')');
        return result.toString();
    }

} //BaseElementImpl
