/**
 */
package de.cooperateproject.rcptt.ecl.cdoserver;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.rcptt.ecl.cdoserver.CdoserverPackage
 * @generated
 */
public interface CdoserverFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CdoserverFactory eINSTANCE = de.cooperateproject.rcptt.ecl.cdoserver.impl.CdoserverFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Start Cdo Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Cdo Server</em>'.
	 * @generated
	 */
	StartCdoServer createStartCdoServer();

	/**
	 * Returns a new object of class '<em>Stop Cdo Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Cdo Server</em>'.
	 * @generated
	 */
	StopCdoServer createStopCdoServer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CdoserverPackage getCdoserverPackage();

} //CdoserverFactory
