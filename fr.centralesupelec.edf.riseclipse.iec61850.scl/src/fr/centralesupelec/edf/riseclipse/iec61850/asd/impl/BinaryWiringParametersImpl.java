/**
 *  Copyright (c) 2016-2024 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
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
 *      https://riseclipse.github.io/
 *
 */
package fr.centralesupelec.edf.riseclipse.iec61850.asd.impl;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.OutTypEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Wiring Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersImpl#getDebTm <em>Deb Tm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersImpl#isFastOutput <em>Fast Output</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersImpl#getOutNam <em>Out Nam</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersImpl#getOutOffDl <em>Out Off Dl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersImpl#getOutOnDl <em>Out On Dl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersImpl#getOutRef <em>Out Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersImpl#getOutTyp <em>Out Typ</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersImpl#getVInOff <em>VIn Off</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersImpl#getVInOn <em>VIn On</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersImpl#getParentServiceSpecifications <em>Parent Service Specifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersImpl#getReferredByBinaryWiringParametersRef <em>Referred By Binary Wiring Parameters Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryWiringParametersImpl extends WiringParametersImpl implements BinaryWiringParameters {
    /**
     * The default value of the '{@link #getDebTm() <em>Deb Tm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDebTm()
     * @generated
     * @ordered
     */
    protected static final BigInteger DEB_TM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDebTm() <em>Deb Tm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDebTm()
     * @generated
     * @ordered
     */
    protected BigInteger debTm = DEB_TM_EDEFAULT;

    /**
     * The default value of the '{@link #isFastOutput() <em>Fast Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFastOutput()
     * @generated
     * @ordered
     */
    protected static final boolean FAST_OUTPUT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isFastOutput() <em>Fast Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFastOutput()
     * @generated
     * @ordered
     */
    protected boolean fastOutput = FAST_OUTPUT_EDEFAULT;

    /**
     * This is true if the Fast Output attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fastOutputESet;

    /**
     * The default value of the '{@link #getOutNam() <em>Out Nam</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutNam()
     * @generated
     * @ordered
     */
    protected static final String OUT_NAM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutNam() <em>Out Nam</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutNam()
     * @generated
     * @ordered
     */
    protected String outNam = OUT_NAM_EDEFAULT;

    /**
     * The default value of the '{@link #getOutOffDl() <em>Out Off Dl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutOffDl()
     * @generated
     * @ordered
     */
    protected static final float OUT_OFF_DL_EDEFAULT = 0.0F;

    /**
     * The cached value of the '{@link #getOutOffDl() <em>Out Off Dl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutOffDl()
     * @generated
     * @ordered
     */
    protected float outOffDl = OUT_OFF_DL_EDEFAULT;

    /**
     * This is true if the Out Off Dl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean outOffDlESet;

    /**
     * The default value of the '{@link #getOutOnDl() <em>Out On Dl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutOnDl()
     * @generated
     * @ordered
     */
    protected static final float OUT_ON_DL_EDEFAULT = 0.0F;

    /**
     * The cached value of the '{@link #getOutOnDl() <em>Out On Dl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutOnDl()
     * @generated
     * @ordered
     */
    protected float outOnDl = OUT_ON_DL_EDEFAULT;

    /**
     * This is true if the Out On Dl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean outOnDlESet;

    /**
     * The default value of the '{@link #getOutRef() <em>Out Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutRef()
     * @generated
     * @ordered
     */
    protected static final String OUT_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutRef() <em>Out Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutRef()
     * @generated
     * @ordered
     */
    protected String outRef = OUT_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getOutTyp() <em>Out Typ</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutTyp()
     * @generated
     * @ordered
     */
    protected static final OutTypEnum OUT_TYP_EDEFAULT = OutTypEnum.NORMALLY_OPEN;

    /**
     * The cached value of the '{@link #getOutTyp() <em>Out Typ</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutTyp()
     * @generated
     * @ordered
     */
    protected OutTypEnum outTyp = OUT_TYP_EDEFAULT;

    /**
     * This is true if the Out Typ attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean outTypESet;

    /**
     * The default value of the '{@link #getVInOff() <em>VIn Off</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVInOff()
     * @generated
     * @ordered
     */
    protected static final float VIN_OFF_EDEFAULT = 0.0F;

    /**
     * The cached value of the '{@link #getVInOff() <em>VIn Off</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVInOff()
     * @generated
     * @ordered
     */
    protected float vInOff = VIN_OFF_EDEFAULT;

    /**
     * This is true if the VIn Off attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vInOffESet;

    /**
     * The default value of the '{@link #getVInOn() <em>VIn On</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVInOn()
     * @generated
     * @ordered
     */
    protected static final float VIN_ON_EDEFAULT = 0.0F;

    /**
     * The cached value of the '{@link #getVInOn() <em>VIn On</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVInOn()
     * @generated
     * @ordered
     */
    protected float vInOn = VIN_ON_EDEFAULT;

    /**
     * This is true if the VIn On attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vInOnESet;

    /**
     * The cached value of the '{@link #getReferredByBinaryWiringParametersRef() <em>Referred By Binary Wiring Parameters Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByBinaryWiringParametersRef()
     * @generated
     * @ordered
     */
    protected EList< BinaryWiringParametersRef > referredByBinaryWiringParametersRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BinaryWiringParametersImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getBinaryWiringParameters();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getDebTm() {
        return debTm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDebTm( BigInteger newDebTm ) {
        BigInteger oldDebTm = debTm;
        debTm = newDebTm;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BINARY_WIRING_PARAMETERS__DEB_TM,
                    oldDebTm, debTm ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFastOutput() {
        return fastOutput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFastOutput( boolean newFastOutput ) {
        boolean oldFastOutput = fastOutput;
        fastOutput = newFastOutput;
        boolean oldFastOutputESet = fastOutputESet;
        fastOutputESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BINARY_WIRING_PARAMETERS__FAST_OUTPUT,
                    oldFastOutput, fastOutput, !oldFastOutputESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFastOutput() {
        boolean oldFastOutput = fastOutput;
        boolean oldFastOutputESet = fastOutputESet;
        fastOutput = FAST_OUTPUT_EDEFAULT;
        fastOutputESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.BINARY_WIRING_PARAMETERS__FAST_OUTPUT,
                    oldFastOutput, FAST_OUTPUT_EDEFAULT, oldFastOutputESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFastOutput() {
        return fastOutputESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOutNam() {
        return outNam;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutNam( String newOutNam ) {
        String oldOutNam = outNam;
        outNam = newOutNam;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BINARY_WIRING_PARAMETERS__OUT_NAM,
                    oldOutNam, outNam ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public float getOutOffDl() {
        return outOffDl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutOffDl( float newOutOffDl ) {
        float oldOutOffDl = outOffDl;
        outOffDl = newOutOffDl;
        boolean oldOutOffDlESet = outOffDlESet;
        outOffDlESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BINARY_WIRING_PARAMETERS__OUT_OFF_DL,
                    oldOutOffDl, outOffDl, !oldOutOffDlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOutOffDl() {
        float oldOutOffDl = outOffDl;
        boolean oldOutOffDlESet = outOffDlESet;
        outOffDl = OUT_OFF_DL_EDEFAULT;
        outOffDlESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.BINARY_WIRING_PARAMETERS__OUT_OFF_DL,
                    oldOutOffDl, OUT_OFF_DL_EDEFAULT, oldOutOffDlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutOffDl() {
        return outOffDlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public float getOutOnDl() {
        return outOnDl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutOnDl( float newOutOnDl ) {
        float oldOutOnDl = outOnDl;
        outOnDl = newOutOnDl;
        boolean oldOutOnDlESet = outOnDlESet;
        outOnDlESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BINARY_WIRING_PARAMETERS__OUT_ON_DL,
                    oldOutOnDl, outOnDl, !oldOutOnDlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOutOnDl() {
        float oldOutOnDl = outOnDl;
        boolean oldOutOnDlESet = outOnDlESet;
        outOnDl = OUT_ON_DL_EDEFAULT;
        outOnDlESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.BINARY_WIRING_PARAMETERS__OUT_ON_DL,
                    oldOutOnDl, OUT_ON_DL_EDEFAULT, oldOutOnDlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutOnDl() {
        return outOnDlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOutRef() {
        return outRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutRef( String newOutRef ) {
        String oldOutRef = outRef;
        outRef = newOutRef;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BINARY_WIRING_PARAMETERS__OUT_REF,
                    oldOutRef, outRef ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OutTypEnum getOutTyp() {
        return outTyp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutTyp( OutTypEnum newOutTyp ) {
        OutTypEnum oldOutTyp = outTyp;
        outTyp = newOutTyp == null ? OUT_TYP_EDEFAULT : newOutTyp;
        boolean oldOutTypESet = outTypESet;
        outTypESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BINARY_WIRING_PARAMETERS__OUT_TYP,
                    oldOutTyp, outTyp, !oldOutTypESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOutTyp() {
        OutTypEnum oldOutTyp = outTyp;
        boolean oldOutTypESet = outTypESet;
        outTyp = OUT_TYP_EDEFAULT;
        outTypESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.BINARY_WIRING_PARAMETERS__OUT_TYP,
                    oldOutTyp, OUT_TYP_EDEFAULT, oldOutTypESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutTyp() {
        return outTypESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public float getVInOff() {
        return vInOff;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVInOff( float newVInOff ) {
        float oldVInOff = vInOff;
        vInOff = newVInOff;
        boolean oldVInOffESet = vInOffESet;
        vInOffESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BINARY_WIRING_PARAMETERS__VIN_OFF,
                    oldVInOff, vInOff, !oldVInOffESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVInOff() {
        float oldVInOff = vInOff;
        boolean oldVInOffESet = vInOffESet;
        vInOff = VIN_OFF_EDEFAULT;
        vInOffESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.BINARY_WIRING_PARAMETERS__VIN_OFF,
                    oldVInOff, VIN_OFF_EDEFAULT, oldVInOffESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVInOff() {
        return vInOffESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public float getVInOn() {
        return vInOn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVInOn( float newVInOn ) {
        float oldVInOn = vInOn;
        vInOn = newVInOn;
        boolean oldVInOnESet = vInOnESet;
        vInOnESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.BINARY_WIRING_PARAMETERS__VIN_ON,
                    oldVInOn, vInOn, !oldVInOnESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVInOn() {
        float oldVInOn = vInOn;
        boolean oldVInOnESet = vInOnESet;
        vInOn = VIN_ON_EDEFAULT;
        vInOnESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.BINARY_WIRING_PARAMETERS__VIN_ON,
                    oldVInOn, VIN_ON_EDEFAULT, oldVInOnESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVInOn() {
        return vInOnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceSpecifications getParentServiceSpecifications() {
        if( eContainerFeatureID() != AsdPackage.BINARY_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS ) {
            return null;
        }
        return ( ServiceSpecifications ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServiceSpecifications( ServiceSpecifications newParentServiceSpecifications,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServiceSpecifications,
                AsdPackage.BINARY_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentServiceSpecifications( ServiceSpecifications newParentServiceSpecifications ) {
        if( newParentServiceSpecifications != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.BINARY_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS
                        && newParentServiceSpecifications != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServiceSpecifications ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentServiceSpecifications != null ) {
                msgs = ( ( InternalEObject ) newParentServiceSpecifications ).eInverseAdd( this,
                        AsdPackage.SERVICE_SPECIFICATIONS__BINARY_WIRING_PARAMETERS, ServiceSpecifications.class,
                        msgs );
            }
            msgs = basicSetParentServiceSpecifications( newParentServiceSpecifications, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.BINARY_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS, newParentServiceSpecifications,
                    newParentServiceSpecifications ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< BinaryWiringParametersRef > getReferredByBinaryWiringParametersRef() {
        if( referredByBinaryWiringParametersRef == null ) {
            referredByBinaryWiringParametersRef = new EObjectWithInverseResolvingEList.Unsettable< >(
                    BinaryWiringParametersRef.class, this,
                    AsdPackage.BINARY_WIRING_PARAMETERS__REFERRED_BY_BINARY_WIRING_PARAMETERS_REF,
                    AsdPackage.BINARY_WIRING_PARAMETERS_REF__REFERS_TO_BINARY_WIRING_PARAMETERS );
        }
        return referredByBinaryWiringParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByBinaryWiringParametersRef() {
        if( referredByBinaryWiringParametersRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByBinaryWiringParametersRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByBinaryWiringParametersRef() {
        return referredByBinaryWiringParametersRef != null
                && ( ( InternalEList.Unsettable< ? > ) referredByBinaryWiringParametersRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.BINARY_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentServiceSpecifications( ( ServiceSpecifications ) otherEnd, msgs );
        case AsdPackage.BINARY_WIRING_PARAMETERS__REFERRED_BY_BINARY_WIRING_PARAMETERS_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByBinaryWiringParametersRef() )
                    .basicAdd( otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.BINARY_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return basicSetParentServiceSpecifications( null, msgs );
        case AsdPackage.BINARY_WIRING_PARAMETERS__REFERRED_BY_BINARY_WIRING_PARAMETERS_REF:
            return ( ( InternalEList< ? > ) getReferredByBinaryWiringParametersRef() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs ) {
        switch( eContainerFeatureID() ) {
        case AsdPackage.BINARY_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return eInternalContainer().eInverseRemove( this,
                    AsdPackage.SERVICE_SPECIFICATIONS__BINARY_WIRING_PARAMETERS, ServiceSpecifications.class, msgs );
        }
        return super.eBasicRemoveFromContainerFeature( msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case AsdPackage.BINARY_WIRING_PARAMETERS__DEB_TM:
            return getDebTm();
        case AsdPackage.BINARY_WIRING_PARAMETERS__FAST_OUTPUT:
            return isFastOutput();
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_NAM:
            return getOutNam();
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_OFF_DL:
            return getOutOffDl();
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_ON_DL:
            return getOutOnDl();
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_REF:
            return getOutRef();
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_TYP:
            return getOutTyp();
        case AsdPackage.BINARY_WIRING_PARAMETERS__VIN_OFF:
            return getVInOff();
        case AsdPackage.BINARY_WIRING_PARAMETERS__VIN_ON:
            return getVInOn();
        case AsdPackage.BINARY_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return getParentServiceSpecifications();
        case AsdPackage.BINARY_WIRING_PARAMETERS__REFERRED_BY_BINARY_WIRING_PARAMETERS_REF:
            return getReferredByBinaryWiringParametersRef();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case AsdPackage.BINARY_WIRING_PARAMETERS__DEB_TM:
            setDebTm( ( BigInteger ) newValue );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__FAST_OUTPUT:
            setFastOutput( ( Boolean ) newValue );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_NAM:
            setOutNam( ( String ) newValue );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_OFF_DL:
            setOutOffDl( ( Float ) newValue );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_ON_DL:
            setOutOnDl( ( Float ) newValue );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_REF:
            setOutRef( ( String ) newValue );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_TYP:
            setOutTyp( ( OutTypEnum ) newValue );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__VIN_OFF:
            setVInOff( ( Float ) newValue );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__VIN_ON:
            setVInOn( ( Float ) newValue );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            setParentServiceSpecifications( ( ServiceSpecifications ) newValue );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__REFERRED_BY_BINARY_WIRING_PARAMETERS_REF:
            getReferredByBinaryWiringParametersRef().clear();
            getReferredByBinaryWiringParametersRef()
                    .addAll( ( Collection< ? extends BinaryWiringParametersRef > ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case AsdPackage.BINARY_WIRING_PARAMETERS__DEB_TM:
            setDebTm( DEB_TM_EDEFAULT );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__FAST_OUTPUT:
            unsetFastOutput();
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_NAM:
            setOutNam( OUT_NAM_EDEFAULT );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_OFF_DL:
            unsetOutOffDl();
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_ON_DL:
            unsetOutOnDl();
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_REF:
            setOutRef( OUT_REF_EDEFAULT );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_TYP:
            unsetOutTyp();
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__VIN_OFF:
            unsetVInOff();
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__VIN_ON:
            unsetVInOn();
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            setParentServiceSpecifications( ( ServiceSpecifications ) null );
            return;
        case AsdPackage.BINARY_WIRING_PARAMETERS__REFERRED_BY_BINARY_WIRING_PARAMETERS_REF:
            unsetReferredByBinaryWiringParametersRef();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case AsdPackage.BINARY_WIRING_PARAMETERS__DEB_TM:
            return DEB_TM_EDEFAULT == null ? debTm != null : !DEB_TM_EDEFAULT.equals( debTm );
        case AsdPackage.BINARY_WIRING_PARAMETERS__FAST_OUTPUT:
            return isSetFastOutput();
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_NAM:
            return OUT_NAM_EDEFAULT == null ? outNam != null : !OUT_NAM_EDEFAULT.equals( outNam );
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_OFF_DL:
            return isSetOutOffDl();
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_ON_DL:
            return isSetOutOnDl();
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_REF:
            return OUT_REF_EDEFAULT == null ? outRef != null : !OUT_REF_EDEFAULT.equals( outRef );
        case AsdPackage.BINARY_WIRING_PARAMETERS__OUT_TYP:
            return isSetOutTyp();
        case AsdPackage.BINARY_WIRING_PARAMETERS__VIN_OFF:
            return isSetVInOff();
        case AsdPackage.BINARY_WIRING_PARAMETERS__VIN_ON:
            return isSetVInOn();
        case AsdPackage.BINARY_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS:
            return getParentServiceSpecifications() != null;
        case AsdPackage.BINARY_WIRING_PARAMETERS__REFERRED_BY_BINARY_WIRING_PARAMETERS_REF:
            return isSetReferredByBinaryWiringParametersRef();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (debTm: " );
        result.append( debTm );
        result.append( ", fastOutput: " );
        if( fastOutputESet ) {
            result.append( fastOutput );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", outNam: " );
        result.append( outNam );
        result.append( ", outOffDl: " );
        if( outOffDlESet ) {
            result.append( outOffDl );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", outOnDl: " );
        if( outOnDlESet ) {
            result.append( outOnDl );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", outRef: " );
        result.append( outRef );
        result.append( ", outTyp: " );
        if( outTypESet ) {
            result.append( outTyp );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", vInOff: " );
        if( vInOffESet ) {
            result.append( vInOff );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", vInOn: " );
        if( vInOnESet ) {
            result.append( vInOn );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //BinaryWiringParametersImpl
