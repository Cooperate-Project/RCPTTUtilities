/**
 */
package de.cooperateproject.rcptt.ecl.cdoserver.impl;

import de.cooperateproject.rcptt.ecl.cdoserver.CdoserverFactory;
import de.cooperateproject.rcptt.ecl.cdoserver.CdoserverPackage;
import de.cooperateproject.rcptt.ecl.cdoserver.StartCdoServer;

import de.cooperateproject.rcptt.ecl.cdoserver.StopCdoServer;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.rcptt.ecl.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CdoserverPackageImpl extends EPackageImpl implements CdoserverPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startCdoServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopCdoServerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.cooperateproject.rcptt.ecl.cdoserver.CdoserverPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CdoserverPackageImpl() {
		super(eNS_URI, CdoserverFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CdoserverPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CdoserverPackage init() {
		if (isInited) return (CdoserverPackage)EPackage.Registry.INSTANCE.getEPackage(CdoserverPackage.eNS_URI);

		// Obtain or create and register package
		CdoserverPackageImpl theCdoserverPackage = (CdoserverPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CdoserverPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CdoserverPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCdoserverPackage.createPackageContents();

		// Initialize created meta-data
		theCdoserverPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCdoserverPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CdoserverPackage.eNS_URI, theCdoserverPackage);
		return theCdoserverPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartCdoServer() {
		return startCdoServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopCdoServer() {
		return stopCdoServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdoserverFactory getCdoserverFactory() {
		return (CdoserverFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		startCdoServerEClass = createEClass(START_CDO_SERVER);

		stopCdoServerEClass = createEClass(STOP_CDO_SERVER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		startCdoServerEClass.getESuperTypes().add(theCorePackage.getCommand());
		stopCdoServerEClass.getESuperTypes().add(theCorePackage.getCommand());

		// Initialize classes and features; add operations and parameters
		initEClass(startCdoServerEClass, StartCdoServer.class, "StartCdoServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stopCdoServerEClass, StopCdoServer.class, "StopCdoServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CdoserverPackageImpl
