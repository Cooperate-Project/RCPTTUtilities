/**
 */
package de.cooperateproject.rcptt.ecl.cooperate.cooperate.impl;

import de.cooperateproject.rcptt.ecl.cooperate.cooperate.CooperateFactory;
import de.cooperateproject.rcptt.ecl.cooperate.cooperate.CooperatePackage;
import de.cooperateproject.rcptt.ecl.cooperate.cooperate.StartCooperateRepository;
import de.cooperateproject.rcptt.ecl.cooperate.cooperate.StopCooperateRepository;

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
public class CooperatePackageImpl extends EPackageImpl implements CooperatePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass startCooperateRepositoryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stopCooperateRepositoryEClass = null;

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
     * @see de.cooperateproject.rcptt.ecl.cooperate.cooperate.CooperatePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private CooperatePackageImpl() {
        super(eNS_URI, CooperateFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link CooperatePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static CooperatePackage init() {
        if (isInited) return (CooperatePackage)EPackage.Registry.INSTANCE.getEPackage(CooperatePackage.eNS_URI);

        // Obtain or create and register package
        CooperatePackageImpl theCooperatePackage = (CooperatePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CooperatePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CooperatePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        CorePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theCooperatePackage.createPackageContents();

        // Initialize created meta-data
        theCooperatePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theCooperatePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CooperatePackage.eNS_URI, theCooperatePackage);
        return theCooperatePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStartCooperateRepository() {
        return startCooperateRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStopCooperateRepository() {
        return stopCooperateRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CooperateFactory getCooperateFactory() {
        return (CooperateFactory)getEFactoryInstance();
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
        startCooperateRepositoryEClass = createEClass(START_COOPERATE_REPOSITORY);

        stopCooperateRepositoryEClass = createEClass(STOP_COOPERATE_REPOSITORY);
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
        startCooperateRepositoryEClass.getESuperTypes().add(theCorePackage.getCommand());
        stopCooperateRepositoryEClass.getESuperTypes().add(theCorePackage.getCommand());

        // Initialize classes and features; add operations and parameters
        initEClass(startCooperateRepositoryEClass, StartCooperateRepository.class, "StartCooperateRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(stopCooperateRepositoryEClass, StopCooperateRepository.class, "StopCooperateRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //CooperatePackageImpl
