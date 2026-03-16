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

import java.util.List;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Parameters Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogParametersRefImpl#getRefersToLogParameters <em>Refers To Log Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogParametersRefImpl#getParentDAS <em>Parent DAS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogParametersRefImpl#getParentDOS <em>Parent DOS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogParametersRefImpl#getParentSDS <em>Parent SDS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogParametersRefImpl extends ServiceParametersRefImpl implements LogParametersRef {
    /**
     * The cached value of the '{@link #getRefersToLogParameters() <em>Refers To Log Parameters</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToLogParameters()
     * @generated
     * @ordered
     */
    protected LogParameters refersToLogParameters;

    /**
     * This is true if the Refers To Log Parameters reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToLogParametersESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LogParametersRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getLogParametersRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LogParameters getRefersToLogParameters() {
        if( refersToLogParameters != null && refersToLogParameters.eIsProxy() ) {
            InternalEObject oldRefersToLogParameters = ( InternalEObject ) refersToLogParameters;
            refersToLogParameters = ( LogParameters ) eResolveProxy( oldRefersToLogParameters );
            if( refersToLogParameters != oldRefersToLogParameters ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.LOG_PARAMETERS_REF__REFERS_TO_LOG_PARAMETERS, oldRefersToLogParameters,
                            refersToLogParameters ) );
                }
            }
        }
        return refersToLogParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogParameters basicGetRefersToLogParameters() {
        return refersToLogParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToLogParameters( LogParameters newRefersToLogParameters,
            NotificationChain msgs ) {
        LogParameters oldRefersToLogParameters = refersToLogParameters;
        refersToLogParameters = newRefersToLogParameters;
        boolean oldRefersToLogParametersESet = refersToLogParametersESet;
        refersToLogParametersESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.LOG_PARAMETERS_REF__REFERS_TO_LOG_PARAMETERS, oldRefersToLogParameters,
                    newRefersToLogParameters, !oldRefersToLogParametersESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToLogParameters( LogParameters newRefersToLogParameters ) {
        if( newRefersToLogParameters != refersToLogParameters ) {
            NotificationChain msgs = null;
            if( refersToLogParameters != null ) {
                msgs = ( ( InternalEObject ) refersToLogParameters ).eInverseRemove( this,
                        AsdPackage.LOG_PARAMETERS__REFERRED_BY_LOG_PARAMETERS_REF, LogParameters.class, msgs );
            }
            if( newRefersToLogParameters != null ) {
                msgs = ( ( InternalEObject ) newRefersToLogParameters ).eInverseAdd( this,
                        AsdPackage.LOG_PARAMETERS__REFERRED_BY_LOG_PARAMETERS_REF, LogParameters.class, msgs );
            }
            msgs = basicSetRefersToLogParameters( newRefersToLogParameters, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToLogParametersESet = refersToLogParametersESet;
            refersToLogParametersESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.LOG_PARAMETERS_REF__REFERS_TO_LOG_PARAMETERS, newRefersToLogParameters,
                        newRefersToLogParameters, !oldRefersToLogParametersESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToLogParameters( NotificationChain msgs ) {
        LogParameters oldRefersToLogParameters = refersToLogParameters;
        refersToLogParameters = null;
        boolean oldRefersToLogParametersESet = refersToLogParametersESet;
        refersToLogParametersESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.LOG_PARAMETERS_REF__REFERS_TO_LOG_PARAMETERS, oldRefersToLogParameters, null,
                    oldRefersToLogParametersESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToLogParameters() {
        if( refersToLogParameters != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToLogParameters ).eInverseRemove( this,
                    AsdPackage.LOG_PARAMETERS__REFERRED_BY_LOG_PARAMETERS_REF, LogParameters.class, msgs );
            msgs = basicUnsetRefersToLogParameters( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToLogParametersESet = refersToLogParametersESet;
            refersToLogParametersESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.LOG_PARAMETERS_REF__REFERS_TO_LOG_PARAMETERS, null, null,
                        oldRefersToLogParametersESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToLogParameters() {
        return refersToLogParametersESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DAS getParentDAS() {
        if( eContainerFeatureID() != AsdPackage.LOG_PARAMETERS_REF__PARENT_DAS ) {
            return null;
        }
        return ( DAS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentDAS( DAS newParentDAS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDAS, AsdPackage.LOG_PARAMETERS_REF__PARENT_DAS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentDAS( DAS newParentDAS ) {
        if( newParentDAS != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.LOG_PARAMETERS_REF__PARENT_DAS && newParentDAS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDAS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDAS != null ) {
                msgs = ( ( InternalEObject ) newParentDAS ).eInverseAdd( this, AsdPackage.DAS__LOG_PARAMETERS_REF,
                        DAS.class, msgs );
            }
            msgs = basicSetParentDAS( newParentDAS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LOG_PARAMETERS_REF__PARENT_DAS,
                    newParentDAS, newParentDAS ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DOS getParentDOS() {
        if( eContainerFeatureID() != AsdPackage.LOG_PARAMETERS_REF__PARENT_DOS ) {
            return null;
        }
        return ( DOS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentDOS( DOS newParentDOS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDOS, AsdPackage.LOG_PARAMETERS_REF__PARENT_DOS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentDOS( DOS newParentDOS ) {
        if( newParentDOS != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.LOG_PARAMETERS_REF__PARENT_DOS && newParentDOS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDOS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDOS != null ) {
                msgs = ( ( InternalEObject ) newParentDOS ).eInverseAdd( this, AsdPackage.DOS__LOG_PARAMETERS_REF,
                        DOS.class, msgs );
            }
            msgs = basicSetParentDOS( newParentDOS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LOG_PARAMETERS_REF__PARENT_DOS,
                    newParentDOS, newParentDOS ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SDS getParentSDS() {
        if( eContainerFeatureID() != AsdPackage.LOG_PARAMETERS_REF__PARENT_SDS ) {
            return null;
        }
        return ( SDS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSDS( SDS newParentSDS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSDS, AsdPackage.LOG_PARAMETERS_REF__PARENT_SDS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSDS( SDS newParentSDS ) {
        if( newParentSDS != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.LOG_PARAMETERS_REF__PARENT_SDS && newParentSDS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSDS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentSDS != null ) {
                msgs = ( ( InternalEObject ) newParentSDS ).eInverseAdd( this, AsdPackage.SDS__LOG_PARAMETERS_REF,
                        SDS.class, msgs );
            }
            msgs = basicSetParentSDS( newParentSDS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LOG_PARAMETERS_REF__PARENT_SDS,
                    newParentSDS, newParentSDS ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.LOG_PARAMETERS_REF__REFERS_TO_LOG_PARAMETERS:
            if( refersToLogParameters != null ) {
                msgs = ( ( InternalEObject ) refersToLogParameters ).eInverseRemove( this,
                        AsdPackage.LOG_PARAMETERS__REFERRED_BY_LOG_PARAMETERS_REF, LogParameters.class, msgs );
            }
            return basicSetRefersToLogParameters( ( LogParameters ) otherEnd, msgs );
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_DAS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDAS( ( DAS ) otherEnd, msgs );
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_DOS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDOS( ( DOS ) otherEnd, msgs );
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_SDS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSDS( ( SDS ) otherEnd, msgs );
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
        case AsdPackage.LOG_PARAMETERS_REF__REFERS_TO_LOG_PARAMETERS:
            return basicUnsetRefersToLogParameters( msgs );
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_DAS:
            return basicSetParentDAS( null, msgs );
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_DOS:
            return basicSetParentDOS( null, msgs );
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_SDS:
            return basicSetParentSDS( null, msgs );
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
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_DAS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.DAS__LOG_PARAMETERS_REF, DAS.class, msgs );
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_DOS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.DOS__LOG_PARAMETERS_REF, DOS.class, msgs );
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_SDS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SDS__LOG_PARAMETERS_REF, SDS.class, msgs );
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
        case AsdPackage.LOG_PARAMETERS_REF__REFERS_TO_LOG_PARAMETERS:
            if( resolve ) {
                return getRefersToLogParameters();
            }
            return basicGetRefersToLogParameters();
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_DAS:
            return getParentDAS();
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_DOS:
            return getParentDOS();
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_SDS:
            return getParentSDS();
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
        case AsdPackage.LOG_PARAMETERS_REF__REFERS_TO_LOG_PARAMETERS:
            setRefersToLogParameters( ( LogParameters ) newValue );
            return;
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_DAS:
            setParentDAS( ( DAS ) newValue );
            return;
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_DOS:
            setParentDOS( ( DOS ) newValue );
            return;
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_SDS:
            setParentSDS( ( SDS ) newValue );
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
        case AsdPackage.LOG_PARAMETERS_REF__REFERS_TO_LOG_PARAMETERS:
            unsetRefersToLogParameters();
            return;
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_DAS:
            setParentDAS( ( DAS ) null );
            return;
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_DOS:
            setParentDOS( ( DOS ) null );
            return;
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_SDS:
            setParentSDS( ( SDS ) null );
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
        case AsdPackage.LOG_PARAMETERS_REF__REFERS_TO_LOG_PARAMETERS:
            return isSetRefersToLogParameters();
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_DAS:
            return getParentDAS() != null;
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_DOS:
            return getParentDOS() != null;
        case AsdPackage.LOG_PARAMETERS_REF__PARENT_SDS:
            return getParentSDS() != null;
        }
        return super.eIsSet( featureID );
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "LogParametersRef.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from LogParametersRef: ";
        doBuildExplicitLinkWithLogParameters( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithLogParameters( @NonNull IRiseClipseConsole console,
            @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for LogParameters) ";

        if( getId() != null && !getId().isEmpty() ) {
            Pair< ServiceSpecifications, Integer > serviceSpecifications = AsdUtilities
                    .getServiceSpecifications( this );
            if( serviceSpecifications.getLeft() == null ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( serviceSpecifications.getRight() == 0 ) ? "cannot find " : "found several " ),
                //         "ServiceSpecifications" );
                return;
            }

            List< LogParameters > logParameters = serviceSpecifications.getLeft()
                    .getLogParameters().stream()
                    .filter( a -> getId().equals( a.getId() ) )
                    .toList();

            if( logParameters.size() == 1 ) {
                setRefersToLogParameters( logParameters.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "LogParametersRef refers to LogParameters( id = ", getId(),
                        " ) on line ", getRefersToLogParameters().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( logParameters.size() == 0 ) ? "cannot find" : "found several" ),
                //         " LogParameters( id = ", getId(), " ) );
            }

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because allocationRole and allocationRoleUuid are missing" );
        }

    }

} //LogParametersRefImpl
