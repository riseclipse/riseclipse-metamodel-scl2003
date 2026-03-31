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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LNode Spec Naming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeSpecNamingImpl#getSIedName <em>SIed Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeSpecNamingImpl#getSLdInst <em>SLd Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeSpecNamingImpl#getSLnClass <em>SLn Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeSpecNamingImpl#getSLnInst <em>SLn Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeSpecNamingImpl#getSPrefix <em>SPrefix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LNodeSpecNamingImpl extends BaseExtensionElementImpl implements LNodeSpecNaming {
    /**
     * The default value of the '{@link #getSIedName() <em>SIed Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSIedName()
     * @generated
     * @ordered
     */
    protected static final String SIED_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSIedName() <em>SIed Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSIedName()
     * @generated
     * @ordered
     */
    protected String sIedName = SIED_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getSLdInst() <em>SLd Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSLdInst()
     * @generated
     * @ordered
     */
    protected static final String SLD_INST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSLdInst() <em>SLd Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSLdInst()
     * @generated
     * @ordered
     */
    protected String sLdInst = SLD_INST_EDEFAULT;

    /**
     * The default value of the '{@link #getSLnClass() <em>SLn Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSLnClass()
     * @generated
     * @ordered
     */
    protected static final String SLN_CLASS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSLnClass() <em>SLn Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSLnClass()
     * @generated
     * @ordered
     */
    protected String sLnClass = SLN_CLASS_EDEFAULT;

    /**
     * The default value of the '{@link #getSLnInst() <em>SLn Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSLnInst()
     * @generated
     * @ordered
     */
    protected static final String SLN_INST_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getSLnInst() <em>SLn Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSLnInst()
     * @generated
     * @ordered
     */
    protected String sLnInst = SLN_INST_EDEFAULT;

    /**
     * This is true if the SLn Inst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sLnInstESet;

    /**
     * The default value of the '{@link #getSPrefix() <em>SPrefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSPrefix()
     * @generated
     * @ordered
     */
    protected static final String SPREFIX_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getSPrefix() <em>SPrefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSPrefix()
     * @generated
     * @ordered
     */
    protected String sPrefix = SPREFIX_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LNodeSpecNamingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getLNodeSpecNaming();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSIedName() {
        return sIedName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSIedName( String newSIedName ) {
        String oldSIedName = sIedName;
        sIedName = newSIedName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LNODE_SPEC_NAMING__SIED_NAME,
                    oldSIedName, sIedName ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSLdInst() {
        return sLdInst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSLdInst( String newSLdInst ) {
        String oldSLdInst = sLdInst;
        sLdInst = newSLdInst;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LNODE_SPEC_NAMING__SLD_INST, oldSLdInst,
                    sLdInst ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSLnClass() {
        return sLnClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSLnClass( String newSLnClass ) {
        String oldSLnClass = sLnClass;
        sLnClass = newSLnClass;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LNODE_SPEC_NAMING__SLN_CLASS,
                    oldSLnClass, sLnClass ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSLnInst() {
        return sLnInst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSLnInst( String newSLnInst ) {
        String oldSLnInst = sLnInst;
        sLnInst = newSLnInst;
        boolean oldSLnInstESet = sLnInstESet;
        sLnInstESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LNODE_SPEC_NAMING__SLN_INST, oldSLnInst,
                    sLnInst, !oldSLnInstESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSLnInst() {
        String oldSLnInst = sLnInst;
        boolean oldSLnInstESet = sLnInstESet;
        sLnInst = SLN_INST_EDEFAULT;
        sLnInstESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.LNODE_SPEC_NAMING__SLN_INST,
                    oldSLnInst, SLN_INST_EDEFAULT, oldSLnInstESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSLnInst() {
        return sLnInstESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSPrefix() {
        return sPrefix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSPrefix( String newSPrefix ) {
        String oldSPrefix = sPrefix;
        sPrefix = newSPrefix;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LNODE_SPEC_NAMING__SPREFIX, oldSPrefix,
                    sPrefix ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case AsdPackage.LNODE_SPEC_NAMING__SIED_NAME:
            return getSIedName();
        case AsdPackage.LNODE_SPEC_NAMING__SLD_INST:
            return getSLdInst();
        case AsdPackage.LNODE_SPEC_NAMING__SLN_CLASS:
            return getSLnClass();
        case AsdPackage.LNODE_SPEC_NAMING__SLN_INST:
            return getSLnInst();
        case AsdPackage.LNODE_SPEC_NAMING__SPREFIX:
            return getSPrefix();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case AsdPackage.LNODE_SPEC_NAMING__SIED_NAME:
            setSIedName( ( String ) newValue );
            return;
        case AsdPackage.LNODE_SPEC_NAMING__SLD_INST:
            setSLdInst( ( String ) newValue );
            return;
        case AsdPackage.LNODE_SPEC_NAMING__SLN_CLASS:
            setSLnClass( ( String ) newValue );
            return;
        case AsdPackage.LNODE_SPEC_NAMING__SLN_INST:
            setSLnInst( ( String ) newValue );
            return;
        case AsdPackage.LNODE_SPEC_NAMING__SPREFIX:
            setSPrefix( ( String ) newValue );
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
        case AsdPackage.LNODE_SPEC_NAMING__SIED_NAME:
            setSIedName( SIED_NAME_EDEFAULT );
            return;
        case AsdPackage.LNODE_SPEC_NAMING__SLD_INST:
            setSLdInst( SLD_INST_EDEFAULT );
            return;
        case AsdPackage.LNODE_SPEC_NAMING__SLN_CLASS:
            setSLnClass( SLN_CLASS_EDEFAULT );
            return;
        case AsdPackage.LNODE_SPEC_NAMING__SLN_INST:
            unsetSLnInst();
            return;
        case AsdPackage.LNODE_SPEC_NAMING__SPREFIX:
            setSPrefix( SPREFIX_EDEFAULT );
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
        case AsdPackage.LNODE_SPEC_NAMING__SIED_NAME:
            return SIED_NAME_EDEFAULT == null ? sIedName != null : !SIED_NAME_EDEFAULT.equals( sIedName );
        case AsdPackage.LNODE_SPEC_NAMING__SLD_INST:
            return SLD_INST_EDEFAULT == null ? sLdInst != null : !SLD_INST_EDEFAULT.equals( sLdInst );
        case AsdPackage.LNODE_SPEC_NAMING__SLN_CLASS:
            return SLN_CLASS_EDEFAULT == null ? sLnClass != null : !SLN_CLASS_EDEFAULT.equals( sLnClass );
        case AsdPackage.LNODE_SPEC_NAMING__SLN_INST:
            return isSetSLnInst();
        case AsdPackage.LNODE_SPEC_NAMING__SPREFIX:
            return SPREFIX_EDEFAULT == null ? sPrefix != null : !SPREFIX_EDEFAULT.equals( sPrefix );
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
        result.append( " (sIedName: " );
        result.append( sIedName );
        result.append( ", sLdInst: " );
        result.append( sLdInst );
        result.append( ", sLnClass: " );
        result.append( sLnClass );
        result.append( ", sLnInst: " );
        if( sLnInstESet ) {
            result.append( sLnInst );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", sPrefix: " );
        result.append( sPrefix );
        result.append( ')' );
        return result.toString();
    }

} //LNodeSpecNamingImpl
