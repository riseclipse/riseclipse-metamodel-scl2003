/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
**
**  This file is part of the RiseClipse tool
**
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Val;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNImpl#getParentAccessPoint <em>Parent Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNImpl#getParentLDevice <em>Parent LDevice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNImpl#getRefersToControlWithIEDName <em>Refers To Control With IED Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LNImpl extends AnyLNImpl implements LN {
    /**
     * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected static final String PREFIX_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected String prefix = PREFIX_EDEFAULT;

    /**
     * This is true if the Prefix attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean prefixESet;

    /**
     * The cached value of the '{@link #getRefersToControlWithIEDName() <em>Refers To Control With IED Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToControlWithIEDName()
     * @generated
     * @ordered
     */
    protected ControlWithIEDName refersToControlWithIEDName;

    /**
     * This is true if the Refers To Control With IED Name reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToControlWithIEDNameESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LNImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getLN();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPrefix() {
        return prefix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPrefix( String newPrefix ) {
        String oldPrefix = prefix;
        prefix = newPrefix;
        boolean oldPrefixESet = prefixESet;
        prefixESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LN__PREFIX, oldPrefix, prefix,
                    !oldPrefixESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrefix() {
        String oldPrefix = prefix;
        boolean oldPrefixESet = prefixESet;
        prefix = PREFIX_EDEFAULT;
        prefixESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.LN__PREFIX, oldPrefix, PREFIX_EDEFAULT,
                    oldPrefixESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrefix() {
        return prefixESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccessPoint getParentAccessPoint() {
        if( eContainerFeatureID() != SclPackage.LN__PARENT_ACCESS_POINT ) {
            return null;
        }
        return ( AccessPoint ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAccessPoint( AccessPoint newParentAccessPoint, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentAccessPoint, SclPackage.LN__PARENT_ACCESS_POINT, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAccessPoint( AccessPoint newParentAccessPoint ) {
        if( newParentAccessPoint != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LN__PARENT_ACCESS_POINT && newParentAccessPoint != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentAccessPoint ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentAccessPoint != null ) {
                msgs = ( ( InternalEObject ) newParentAccessPoint ).eInverseAdd( this, SclPackage.ACCESS_POINT__LN,
                        AccessPoint.class, msgs );
            }
            msgs = basicSetParentAccessPoint( newParentAccessPoint, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LN__PARENT_ACCESS_POINT,
                    newParentAccessPoint, newParentAccessPoint ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LDevice getParentLDevice() {
        if( eContainerFeatureID() != SclPackage.LN__PARENT_LDEVICE ) {
            return null;
        }
        return ( LDevice ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentLDevice( LDevice newParentLDevice, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentLDevice, SclPackage.LN__PARENT_LDEVICE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentLDevice( LDevice newParentLDevice ) {
        if( newParentLDevice != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LN__PARENT_LDEVICE && newParentLDevice != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentLDevice ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentLDevice != null ) {
                msgs = ( ( InternalEObject ) newParentLDevice ).eInverseAdd( this, SclPackage.LDEVICE__LN,
                        LDevice.class, msgs );
            }
            msgs = basicSetParentLDevice( newParentLDevice, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LN__PARENT_LDEVICE, newParentLDevice,
                    newParentLDevice ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlWithIEDName getRefersToControlWithIEDName() {
        return refersToControlWithIEDName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToControlWithIEDName( ControlWithIEDName newRefersToControlWithIEDName,
            NotificationChain msgs ) {
        ControlWithIEDName oldRefersToControlWithIEDName = refersToControlWithIEDName;
        refersToControlWithIEDName = newRefersToControlWithIEDName;
        boolean oldRefersToControlWithIEDNameESet = refersToControlWithIEDNameESet;
        refersToControlWithIEDNameESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.LN__REFERS_TO_CONTROL_WITH_IED_NAME, oldRefersToControlWithIEDName,
                    newRefersToControlWithIEDName, !oldRefersToControlWithIEDNameESet );
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
    public void setRefersToControlWithIEDName( ControlWithIEDName newRefersToControlWithIEDName ) {
        if( newRefersToControlWithIEDName != refersToControlWithIEDName ) {
            NotificationChain msgs = null;
            if( refersToControlWithIEDName != null ) {
                msgs = ( ( InternalEObject ) refersToControlWithIEDName ).eInverseRemove( this,
                        SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_LN, ControlWithIEDName.class, msgs );
            }
            if( newRefersToControlWithIEDName != null ) {
                msgs = ( ( InternalEObject ) newRefersToControlWithIEDName ).eInverseAdd( this,
                        SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_LN, ControlWithIEDName.class, msgs );
            }
            msgs = basicSetRefersToControlWithIEDName( newRefersToControlWithIEDName, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToControlWithIEDNameESet = refersToControlWithIEDNameESet;
            refersToControlWithIEDNameESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LN__REFERS_TO_CONTROL_WITH_IED_NAME,
                        newRefersToControlWithIEDName, newRefersToControlWithIEDName,
                        !oldRefersToControlWithIEDNameESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToControlWithIEDName( NotificationChain msgs ) {
        ControlWithIEDName oldRefersToControlWithIEDName = refersToControlWithIEDName;
        refersToControlWithIEDName = null;
        boolean oldRefersToControlWithIEDNameESet = refersToControlWithIEDNameESet;
        refersToControlWithIEDNameESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.LN__REFERS_TO_CONTROL_WITH_IED_NAME, oldRefersToControlWithIEDName, null,
                    oldRefersToControlWithIEDNameESet );
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
    public void unsetRefersToControlWithIEDName() {
        if( refersToControlWithIEDName != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToControlWithIEDName ).eInverseRemove( this,
                    SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_LN, ControlWithIEDName.class, msgs );
            msgs = basicUnsetRefersToControlWithIEDName( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToControlWithIEDNameESet = refersToControlWithIEDNameESet;
            refersToControlWithIEDNameESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        SclPackage.LN__REFERS_TO_CONTROL_WITH_IED_NAME, null, null,
                        oldRefersToControlWithIEDNameESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToControlWithIEDName() {
        return refersToControlWithIEDNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.LN__PARENT_ACCESS_POINT:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentAccessPoint( ( AccessPoint ) otherEnd, msgs );
        case SclPackage.LN__PARENT_LDEVICE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentLDevice( ( LDevice ) otherEnd, msgs );
        case SclPackage.LN__REFERS_TO_CONTROL_WITH_IED_NAME:
            if( refersToControlWithIEDName != null ) {
                msgs = ( ( InternalEObject ) refersToControlWithIEDName ).eInverseRemove( this,
                        SclPackage.CONTROL_WITH_IED_NAME__REFERRED_BY_LN, ControlWithIEDName.class, msgs );
            }
            return basicSetRefersToControlWithIEDName( ( ControlWithIEDName ) otherEnd, msgs );
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
        case SclPackage.LN__PARENT_ACCESS_POINT:
            return basicSetParentAccessPoint( null, msgs );
        case SclPackage.LN__PARENT_LDEVICE:
            return basicSetParentLDevice( null, msgs );
        case SclPackage.LN__REFERS_TO_CONTROL_WITH_IED_NAME:
            return basicUnsetRefersToControlWithIEDName( msgs );
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
        case SclPackage.LN__PARENT_ACCESS_POINT:
            return eInternalContainer().eInverseRemove( this, SclPackage.ACCESS_POINT__LN, AccessPoint.class, msgs );
        case SclPackage.LN__PARENT_LDEVICE:
            return eInternalContainer().eInverseRemove( this, SclPackage.LDEVICE__LN, LDevice.class, msgs );
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
        case SclPackage.LN__PREFIX:
            return getPrefix();
        case SclPackage.LN__PARENT_ACCESS_POINT:
            return getParentAccessPoint();
        case SclPackage.LN__PARENT_LDEVICE:
            return getParentLDevice();
        case SclPackage.LN__REFERS_TO_CONTROL_WITH_IED_NAME:
            return getRefersToControlWithIEDName();
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
        case SclPackage.LN__PREFIX:
            setPrefix( ( String ) newValue );
            return;
        case SclPackage.LN__PARENT_ACCESS_POINT:
            setParentAccessPoint( ( AccessPoint ) newValue );
            return;
        case SclPackage.LN__PARENT_LDEVICE:
            setParentLDevice( ( LDevice ) newValue );
            return;
        case SclPackage.LN__REFERS_TO_CONTROL_WITH_IED_NAME:
            setRefersToControlWithIEDName( ( ControlWithIEDName ) newValue );
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
        case SclPackage.LN__PREFIX:
            unsetPrefix();
            return;
        case SclPackage.LN__PARENT_ACCESS_POINT:
            setParentAccessPoint( ( AccessPoint ) null );
            return;
        case SclPackage.LN__PARENT_LDEVICE:
            setParentLDevice( ( LDevice ) null );
            return;
        case SclPackage.LN__REFERS_TO_CONTROL_WITH_IED_NAME:
            unsetRefersToControlWithIEDName();
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
        case SclPackage.LN__PREFIX:
            return isSetPrefix();
        case SclPackage.LN__PARENT_ACCESS_POINT:
            return getParentAccessPoint() != null;
        case SclPackage.LN__PARENT_LDEVICE:
            return getParentLDevice() != null;
        case SclPackage.LN__REFERS_TO_CONTROL_WITH_IED_NAME:
            return isSetRefersToControlWithIEDName();
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
        result.append( " (prefix: " );
        if( prefixESet ) {
            result.append( prefix );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(), "LN.doBuildExplicitLinks()" );

        //@formatter:off

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String doiName;
        if( "LGOS".equals( getLnClass() )) {
            doiName = "GoCBRef";
        }
        else if( "LSVS".equals( getLnClass() )) {
            doiName = "SvCBRef";
        }
        else {
            return;
        }

         String messagePrefix = "while resolving link to ControlWithIEDName from LN lnClass=\"" + getLnClass() + "\": ";

        List< DOI > cBRef =
             getDOI()
            .stream()
            .filter( doi -> doiName.equals( doi.getName() ))
            .collect( Collectors.toList() );
        if( ( cBRef.size() > 1 ) || ( cBRef.size() == 0 ) ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, "found no DOI named ", doiName );
            return;
        }

        // Look for DAI name="setSrcRef" in GrRef
        List< DAI > setSrcRef =
                 cBRef
                .get( 0 )
                .getDAI()
                .stream()
                .filter( dai -> "setSrcRef".equals( dai.getName() ))
                .toList();
        if( ( setSrcRef.size() == 0 ) || ( setSrcRef.size() > 1 ) || ( setSrcRef.get( 0 ).getVal().size() == 0 ) || ( setSrcRef.get( 0 ).getVal().size() > 1 ) ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  messagePrefix, "found several Val in setSrcRef on line ",
            //                  setSrcRef.get( 0 ).getLineNumber() );
            return;
        }

        Val val = setSrcRef.get( 0 ).getVal().get( 0 );
        String controlWithIEDName = val.getValue();
        if( ( controlWithIEDName == null ) || ( controlWithIEDName.length() <= 1 ) || ( controlWithIEDName.indexOf( '/' ) == -1 ) ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  messagePrefix, "Val of setSrcRef on line ", setSrcRef.get( 0 ).getLineNumber(),
            //                  " is illformed, it should contain \"/\"" );
            return;
        }
        if( ( controlWithIEDName.indexOf( '.' ) == -1 )
         || ( controlWithIEDName.indexOf( '.' ) != controlWithIEDName.indexOf( '/' ) + 5 )
         || ! "/LLN0.".equals( controlWithIEDName.subSequence( controlWithIEDName.indexOf( '/' ), controlWithIEDName.indexOf( '.' ) + 1 ))) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  messagePrefix, "Val of setSrcRef on line ", setSrcRef.get( 0 ).getLineNumber(),
            //                  " is illformed, it should contain \"/LLN0.\"" );
            return;
        }

        SCL scl = getParentLDevice().getParentServer().getParentAccessPoint().getParentIED().getParentSCL();
        List< IED > ieds =
                 scl
                .getIED()
                .stream()
                .filter( ied -> controlWithIEDName.startsWith( ied.getName() ))
                .toList();
        if( ieds.size() > 1 ) {
             console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                              messagePrefix, "found several IED whose name is the start of ",
                              controlWithIEDName, " on line ", val.getLineNumber() );
            return;
        }
        List< LDevice > lDevices = null;
        if( ieds.size() == 1 ) {
            String ldInst = controlWithIEDName.substring( ieds.get( 0 ).getName().length(), controlWithIEDName.indexOf( '/' ));
            lDevices =
                     ieds
                    .get( 0 )
                    .getAccessPoint()
                    .stream()
                    .map( ap -> ap.getServer() )
                    .filter(  s -> s != null  )
                    .flatMap( s -> s.getLDevice().stream() )
                    .filter( ld -> ( ld != null ) && ld.getInst().equals( ldInst ))
                    .toList();
            if( lDevices.size() == 0 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //                  messagePrefix, "found no LDevice whose inst is ", ldInst,
                //                  " in IED on line ", ieds.get( 0 ).getLineNumber() );
                return;
            }
            if( lDevices.size() > 1 ) {
                 console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                  messagePrefix, "found several LDevice whose inst is ", ldInst,
                                  " in IED on line ", ieds.get( 0 ).getLineNumber() );
                return;
            }

        }
        else {
            // look for ldName which should be unique (see issue #38)
            String ldName = controlWithIEDName.substring( 0, controlWithIEDName.indexOf( '/' ));
            lDevices =
                    scl
                   .getIED()
                   .stream()
                   .flatMap( ied -> ied.getAccessPoint().stream() )
                   .map( ap -> ap.getServer() )
                   .filter( s -> s != null )
                   .flatMap( s -> s.getLDevice().stream() )
                   .peek( ld -> System.out.println( ))
                   .filter( ld -> ldName.equals( ld.getLdName() ))
                   .toList();
            if( lDevices.size() == 0 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //                  messagePrefix, "found no LDevice whose ldName is ", ldName );
                return;
            }
            if( lDevices.size() > 1 ) {
                 console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                  messagePrefix, "found several LDevice whose ldName is ", ldName );
                return;
            }

        }
        LN0 ln0 = lDevices.get( 0 ).getLN0();
        if( ln0 == null ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  messagePrefix, "found no LN0 in LDevice on line ", lDevices.get( 0 ).getLineNumber() );
            return;
        }

        List< ControlWithIEDName > controls =
                Collections.< ControlWithIEDName >unmodifiableList(
                        ( "LGOS".equals( getLnClass() ) ? ln0.getGSEControl() : ln0.getSampledValueControl() )
                .stream()
                .filter( control -> control.getName().equals( controlWithIEDName.substring( controlWithIEDName.indexOf( '.' ) + 1 )))
                .toList()
        );
        if( controls.size() == 0 ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  messagePrefix, "found no ControlWithIEDName whose name is ",
            //                  controlWithIEDName.substring( controlWithIEDName.indexOf( '.' ) + 1 ),
            //                  " in LN0 on line ", ln0.getLineNumber() );
            return;
        }
        if( controls.size() > 1 ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  messagePrefix, "found several ControlWithIEDName whose name is ",
            //                  controlWithIEDName.substring( controlWithIEDName.indexOf( '.' ) + 1 ),
            //                  " in LN0 on line ", ln0.getLineNumber() );
            return;
        }

        console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "LN ", getLnClass(), " supervises ControlWithIEDName ", controls.get( 0 ), " at line ", controls.get( 0 ).getLineNumber() );
        setRefersToControlWithIEDName( controls.get( 0 ));

        //@formatter:on
    }

    @Override
    public String getXpath() {
        String parentXpath = "";
        if( getParentLDevice() != null ) {
            parentXpath = getParentLDevice().getXpath();
        }
        if( getParentAccessPoint() != null ) {
            parentXpath = getParentAccessPoint().getXpath();
        }
        String prefixXpath = "";
        if( !getPrefix().isEmpty() ) {
            prefixXpath = "[@prefix='" + getPrefix() + "']";
        }
        return parentXpath + "/scl:LN" + prefixXpath + "[@lnClass='" + getLnClass() + "'][@inst='" + getInst() + "']";
    }

} //LNImpl
