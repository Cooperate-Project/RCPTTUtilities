/**
 */
package de.cooperateproject.rcptt.ecl.cdoserver.impl;

import de.cooperateproject.rcptt.ecl.cdoserver.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CdoserverFactoryImpl extends EFactoryImpl implements CdoserverFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CdoserverFactory init() {
		try {
			CdoserverFactory theCdoserverFactory = (CdoserverFactory)EPackage.Registry.INSTANCE.getEFactory(CdoserverPackage.eNS_URI);
			if (theCdoserverFactory != null) {
				return theCdoserverFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CdoserverFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdoserverFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CdoserverPackage.START_CDO_SERVER: return createStartCdoServer();
			case CdoserverPackage.STOP_CDO_SERVER: return createStopCdoServer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartCdoServer createStartCdoServer() {
		StartCdoServerImpl startCdoServer = new StartCdoServerImpl();
		return startCdoServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopCdoServer createStopCdoServer() {
		StopCdoServerImpl stopCdoServer = new StopCdoServerImpl();
		return stopCdoServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdoserverPackage getCdoserverPackage() {
		return (CdoserverPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CdoserverPackage getPackage() {
		return CdoserverPackage.eINSTANCE;
	}

} //CdoserverFactoryImpl
