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
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionSclRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.HeaderSclRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDSclRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File UUID Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclFileUUIDReferenceImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclFileUUIDReferenceImpl#getFileType <em>File Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclFileUUIDReferenceImpl#getFileUuid <em>File Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclFileUUIDReferenceImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclFileUUIDReferenceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclFileUUIDReferenceImpl#getWhen <em>When</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclFileUUIDReferenceImpl#getParentHeaderSclRef <em>Parent Header Scl Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclFileUUIDReferenceImpl#getParentApplicationSclRef <em>Parent Application Scl Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclFileUUIDReferenceImpl#getParentFunctionSclRef <em>Parent Function Scl Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclFileUUIDReferenceImpl#getParentIEDSclRef <em>Parent IED Scl Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SclFileUUIDReferenceImpl extends SclObjectImpl implements SclFileUUIDReference {
    /**
     * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileName()
     * @generated
     * @ordered
     */
    protected static final String FILE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileName()
     * @generated
     * @ordered
     */
    protected String fileName = FILE_NAME_EDEFAULT;

    /**
     * This is true if the File Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fileNameESet;

    /**
     * The default value of the '{@link #getFileType() <em>File Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileType()
     * @generated
     * @ordered
     */
    protected static final String FILE_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFileType() <em>File Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileType()
     * @generated
     * @ordered
     */
    protected String fileType = FILE_TYPE_EDEFAULT;

    /**
     * This is true if the File Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fileTypeESet;

    /**
     * The default value of the '{@link #getFileUuid() <em>File Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileUuid()
     * @generated
     * @ordered
     */
    protected static final String FILE_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFileUuid() <em>File Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileUuid()
     * @generated
     * @ordered
     */
    protected String fileUuid = FILE_UUID_EDEFAULT;

    /**
     * This is true if the File Uuid attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fileUuidESet;

    /**
     * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevision()
     * @generated
     * @ordered
     */
    protected static final String REVISION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevision()
     * @generated
     * @ordered
     */
    protected String revision = REVISION_EDEFAULT;

    /**
     * This is true if the Revision attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean revisionESet;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected String version = VERSION_EDEFAULT;

    /**
     * This is true if the Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean versionESet;

    /**
     * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWhen()
     * @generated
     * @ordered
     */
    protected static final String WHEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWhen() <em>When</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWhen()
     * @generated
     * @ordered
     */
    protected String when = WHEN_EDEFAULT;

    /**
     * This is true if the When attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean whenESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SclFileUUIDReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSclFileUUIDReference();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFileName() {
        return fileName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFileName( String newFileName ) {
        String oldFileName = fileName;
        fileName = newFileName;
        boolean oldFileNameESet = fileNameESet;
        fileNameESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SCL_FILE_UUID_REFERENCE__FILE_NAME,
                    oldFileName, fileName, !oldFileNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFileName() {
        String oldFileName = fileName;
        boolean oldFileNameESet = fileNameESet;
        fileName = FILE_NAME_EDEFAULT;
        fileNameESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SCL_FILE_UUID_REFERENCE__FILE_NAME,
                    oldFileName, FILE_NAME_EDEFAULT, oldFileNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFileName() {
        return fileNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFileType() {
        return fileType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFileType( String newFileType ) {
        String oldFileType = fileType;
        fileType = newFileType;
        boolean oldFileTypeESet = fileTypeESet;
        fileTypeESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SCL_FILE_UUID_REFERENCE__FILE_TYPE,
                    oldFileType, fileType, !oldFileTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFileType() {
        String oldFileType = fileType;
        boolean oldFileTypeESet = fileTypeESet;
        fileType = FILE_TYPE_EDEFAULT;
        fileTypeESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SCL_FILE_UUID_REFERENCE__FILE_TYPE,
                    oldFileType, FILE_TYPE_EDEFAULT, oldFileTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFileType() {
        return fileTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFileUuid() {
        return fileUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFileUuid( String newFileUuid ) {
        String oldFileUuid = fileUuid;
        fileUuid = newFileUuid;
        boolean oldFileUuidESet = fileUuidESet;
        fileUuidESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SCL_FILE_UUID_REFERENCE__FILE_UUID,
                    oldFileUuid, fileUuid, !oldFileUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFileUuid() {
        String oldFileUuid = fileUuid;
        boolean oldFileUuidESet = fileUuidESet;
        fileUuid = FILE_UUID_EDEFAULT;
        fileUuidESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SCL_FILE_UUID_REFERENCE__FILE_UUID,
                    oldFileUuid, FILE_UUID_EDEFAULT, oldFileUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFileUuid() {
        return fileUuidESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRevision() {
        return revision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRevision( String newRevision ) {
        String oldRevision = revision;
        revision = newRevision;
        boolean oldRevisionESet = revisionESet;
        revisionESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SCL_FILE_UUID_REFERENCE__REVISION,
                    oldRevision, revision, !oldRevisionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRevision() {
        String oldRevision = revision;
        boolean oldRevisionESet = revisionESet;
        revision = REVISION_EDEFAULT;
        revisionESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SCL_FILE_UUID_REFERENCE__REVISION,
                    oldRevision, REVISION_EDEFAULT, oldRevisionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRevision() {
        return revisionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVersion( String newVersion ) {
        String oldVersion = version;
        version = newVersion;
        boolean oldVersionESet = versionESet;
        versionESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SCL_FILE_UUID_REFERENCE__VERSION,
                    oldVersion, version, !oldVersionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVersion() {
        String oldVersion = version;
        boolean oldVersionESet = versionESet;
        version = VERSION_EDEFAULT;
        versionESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SCL_FILE_UUID_REFERENCE__VERSION,
                    oldVersion, VERSION_EDEFAULT, oldVersionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVersion() {
        return versionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getWhen() {
        return when;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWhen( String newWhen ) {
        String oldWhen = when;
        when = newWhen;
        boolean oldWhenESet = whenESet;
        whenESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SCL_FILE_UUID_REFERENCE__WHEN, oldWhen,
                    when, !oldWhenESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWhen() {
        String oldWhen = when;
        boolean oldWhenESet = whenESet;
        when = WHEN_EDEFAULT;
        whenESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SCL_FILE_UUID_REFERENCE__WHEN, oldWhen,
                    WHEN_EDEFAULT, oldWhenESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWhen() {
        return whenESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HeaderSclRef getParentHeaderSclRef() {
        if( eContainerFeatureID() != SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_HEADER_SCL_REF ) {
            return null;
        }
        return ( HeaderSclRef ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentHeaderSclRef( HeaderSclRef newParentHeaderSclRef, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentHeaderSclRef,
                SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_HEADER_SCL_REF, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentHeaderSclRef( HeaderSclRef newParentHeaderSclRef ) {
        if( newParentHeaderSclRef != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_HEADER_SCL_REF
                        && newParentHeaderSclRef != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentHeaderSclRef ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentHeaderSclRef != null ) {
                msgs = ( ( InternalEObject ) newParentHeaderSclRef ).eInverseAdd( this,
                        SclPackage.HEADER_SCL_REF__SCL_FILE_REFERENCE, HeaderSclRef.class, msgs );
            }
            msgs = basicSetParentHeaderSclRef( newParentHeaderSclRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_HEADER_SCL_REF, newParentHeaderSclRef,
                    newParentHeaderSclRef ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ApplicationSclRef getParentApplicationSclRef() {
        if( eContainerFeatureID() != SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_APPLICATION_SCL_REF ) {
            return null;
        }
        return ( ApplicationSclRef ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentApplicationSclRef( ApplicationSclRef newParentApplicationSclRef,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentApplicationSclRef,
                SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_APPLICATION_SCL_REF, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentApplicationSclRef( ApplicationSclRef newParentApplicationSclRef ) {
        if( newParentApplicationSclRef != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_APPLICATION_SCL_REF
                        && newParentApplicationSclRef != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentApplicationSclRef ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentApplicationSclRef != null ) {
                msgs = ( ( InternalEObject ) newParentApplicationSclRef ).eInverseAdd( this,
                        AsdPackage.APPLICATION_SCL_REF__SCL_FILE_REFERENCE, ApplicationSclRef.class, msgs );
            }
            msgs = basicSetParentApplicationSclRef( newParentApplicationSclRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_APPLICATION_SCL_REF, newParentApplicationSclRef,
                    newParentApplicationSclRef ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionSclRef getParentFunctionSclRef() {
        if( eContainerFeatureID() != SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_FUNCTION_SCL_REF ) {
            return null;
        }
        return ( FunctionSclRef ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentFunctionSclRef( FunctionSclRef newParentFunctionSclRef,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentFunctionSclRef,
                SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_FUNCTION_SCL_REF, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentFunctionSclRef( FunctionSclRef newParentFunctionSclRef ) {
        if( newParentFunctionSclRef != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_FUNCTION_SCL_REF
                        && newParentFunctionSclRef != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentFunctionSclRef ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentFunctionSclRef != null ) {
                msgs = ( ( InternalEObject ) newParentFunctionSclRef ).eInverseAdd( this,
                        AsdPackage.FUNCTION_SCL_REF__SCL_FILE_REFERENCE, FunctionSclRef.class, msgs );
            }
            msgs = basicSetParentFunctionSclRef( newParentFunctionSclRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_FUNCTION_SCL_REF, newParentFunctionSclRef,
                    newParentFunctionSclRef ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IEDSclRef getParentIEDSclRef() {
        if( eContainerFeatureID() != SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_IED_SCL_REF ) {
            return null;
        }
        return ( IEDSclRef ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentIEDSclRef( IEDSclRef newParentIEDSclRef, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentIEDSclRef,
                SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_IED_SCL_REF, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentIEDSclRef( IEDSclRef newParentIEDSclRef ) {
        if( newParentIEDSclRef != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_IED_SCL_REF
                        && newParentIEDSclRef != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentIEDSclRef ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentIEDSclRef != null ) {
                msgs = ( ( InternalEObject ) newParentIEDSclRef ).eInverseAdd( this,
                        SclPackage.IED_SCL_REF__SCL_FILE_REFERENCE, IEDSclRef.class, msgs );
            }
            msgs = basicSetParentIEDSclRef( newParentIEDSclRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_IED_SCL_REF, newParentIEDSclRef, newParentIEDSclRef ) );
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
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_HEADER_SCL_REF:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentHeaderSclRef( ( HeaderSclRef ) otherEnd, msgs );
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_APPLICATION_SCL_REF:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentApplicationSclRef( ( ApplicationSclRef ) otherEnd, msgs );
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_FUNCTION_SCL_REF:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentFunctionSclRef( ( FunctionSclRef ) otherEnd, msgs );
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_IED_SCL_REF:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentIEDSclRef( ( IEDSclRef ) otherEnd, msgs );
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
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_HEADER_SCL_REF:
            return basicSetParentHeaderSclRef( null, msgs );
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_APPLICATION_SCL_REF:
            return basicSetParentApplicationSclRef( null, msgs );
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_FUNCTION_SCL_REF:
            return basicSetParentFunctionSclRef( null, msgs );
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_IED_SCL_REF:
            return basicSetParentIEDSclRef( null, msgs );
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
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_HEADER_SCL_REF:
            return eInternalContainer().eInverseRemove( this, SclPackage.HEADER_SCL_REF__SCL_FILE_REFERENCE,
                    HeaderSclRef.class, msgs );
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_APPLICATION_SCL_REF:
            return eInternalContainer().eInverseRemove( this, AsdPackage.APPLICATION_SCL_REF__SCL_FILE_REFERENCE,
                    ApplicationSclRef.class, msgs );
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_FUNCTION_SCL_REF:
            return eInternalContainer().eInverseRemove( this, AsdPackage.FUNCTION_SCL_REF__SCL_FILE_REFERENCE,
                    FunctionSclRef.class, msgs );
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_IED_SCL_REF:
            return eInternalContainer().eInverseRemove( this, SclPackage.IED_SCL_REF__SCL_FILE_REFERENCE,
                    IEDSclRef.class, msgs );
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
        case SclPackage.SCL_FILE_UUID_REFERENCE__FILE_NAME:
            return getFileName();
        case SclPackage.SCL_FILE_UUID_REFERENCE__FILE_TYPE:
            return getFileType();
        case SclPackage.SCL_FILE_UUID_REFERENCE__FILE_UUID:
            return getFileUuid();
        case SclPackage.SCL_FILE_UUID_REFERENCE__REVISION:
            return getRevision();
        case SclPackage.SCL_FILE_UUID_REFERENCE__VERSION:
            return getVersion();
        case SclPackage.SCL_FILE_UUID_REFERENCE__WHEN:
            return getWhen();
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_HEADER_SCL_REF:
            return getParentHeaderSclRef();
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_APPLICATION_SCL_REF:
            return getParentApplicationSclRef();
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_FUNCTION_SCL_REF:
            return getParentFunctionSclRef();
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_IED_SCL_REF:
            return getParentIEDSclRef();
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
        case SclPackage.SCL_FILE_UUID_REFERENCE__FILE_NAME:
            setFileName( ( String ) newValue );
            return;
        case SclPackage.SCL_FILE_UUID_REFERENCE__FILE_TYPE:
            setFileType( ( String ) newValue );
            return;
        case SclPackage.SCL_FILE_UUID_REFERENCE__FILE_UUID:
            setFileUuid( ( String ) newValue );
            return;
        case SclPackage.SCL_FILE_UUID_REFERENCE__REVISION:
            setRevision( ( String ) newValue );
            return;
        case SclPackage.SCL_FILE_UUID_REFERENCE__VERSION:
            setVersion( ( String ) newValue );
            return;
        case SclPackage.SCL_FILE_UUID_REFERENCE__WHEN:
            setWhen( ( String ) newValue );
            return;
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_HEADER_SCL_REF:
            setParentHeaderSclRef( ( HeaderSclRef ) newValue );
            return;
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_APPLICATION_SCL_REF:
            setParentApplicationSclRef( ( ApplicationSclRef ) newValue );
            return;
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_FUNCTION_SCL_REF:
            setParentFunctionSclRef( ( FunctionSclRef ) newValue );
            return;
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_IED_SCL_REF:
            setParentIEDSclRef( ( IEDSclRef ) newValue );
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
        case SclPackage.SCL_FILE_UUID_REFERENCE__FILE_NAME:
            unsetFileName();
            return;
        case SclPackage.SCL_FILE_UUID_REFERENCE__FILE_TYPE:
            unsetFileType();
            return;
        case SclPackage.SCL_FILE_UUID_REFERENCE__FILE_UUID:
            unsetFileUuid();
            return;
        case SclPackage.SCL_FILE_UUID_REFERENCE__REVISION:
            unsetRevision();
            return;
        case SclPackage.SCL_FILE_UUID_REFERENCE__VERSION:
            unsetVersion();
            return;
        case SclPackage.SCL_FILE_UUID_REFERENCE__WHEN:
            unsetWhen();
            return;
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_HEADER_SCL_REF:
            setParentHeaderSclRef( ( HeaderSclRef ) null );
            return;
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_APPLICATION_SCL_REF:
            setParentApplicationSclRef( ( ApplicationSclRef ) null );
            return;
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_FUNCTION_SCL_REF:
            setParentFunctionSclRef( ( FunctionSclRef ) null );
            return;
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_IED_SCL_REF:
            setParentIEDSclRef( ( IEDSclRef ) null );
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
        case SclPackage.SCL_FILE_UUID_REFERENCE__FILE_NAME:
            return isSetFileName();
        case SclPackage.SCL_FILE_UUID_REFERENCE__FILE_TYPE:
            return isSetFileType();
        case SclPackage.SCL_FILE_UUID_REFERENCE__FILE_UUID:
            return isSetFileUuid();
        case SclPackage.SCL_FILE_UUID_REFERENCE__REVISION:
            return isSetRevision();
        case SclPackage.SCL_FILE_UUID_REFERENCE__VERSION:
            return isSetVersion();
        case SclPackage.SCL_FILE_UUID_REFERENCE__WHEN:
            return isSetWhen();
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_HEADER_SCL_REF:
            return getParentHeaderSclRef() != null;
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_APPLICATION_SCL_REF:
            return getParentApplicationSclRef() != null;
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_FUNCTION_SCL_REF:
            return getParentFunctionSclRef() != null;
        case SclPackage.SCL_FILE_UUID_REFERENCE__PARENT_IED_SCL_REF:
            return getParentIEDSclRef() != null;
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
        result.append( " (fileName: " );
        if( fileNameESet ) {
            result.append( fileName );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", fileType: " );
        if( fileTypeESet ) {
            result.append( fileType );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", fileUuid: " );
        if( fileUuidESet ) {
            result.append( fileUuid );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", revision: " );
        if( revisionESet ) {
            result.append( revision );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", version: " );
        if( versionESet ) {
            result.append( version );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", when: " );
        if( whenESet ) {
            result.append( when );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //SclFileUUIDReferenceImpl
