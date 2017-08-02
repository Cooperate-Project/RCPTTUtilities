/**
 */
package de.cooperateproject.rcptt.ecl.cooperate.cooperate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.rcptt.ecl.cooperate.cooperate.CooperatePackage
 * @generated
 */
public interface CooperateFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CooperateFactory eINSTANCE = de.cooperateproject.rcptt.ecl.cooperate.cooperate.impl.CooperateFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Start Cooperate Repository</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Start Cooperate Repository</em>'.
     * @generated
     */
    StartCooperateRepository createStartCooperateRepository();

    /**
     * Returns a new object of class '<em>Stop Cooperate Repository</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Stop Cooperate Repository</em>'.
     * @generated
     */
    StopCooperateRepository createStopCooperateRepository();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CooperatePackage getCooperatePackage();

} //CooperateFactory
