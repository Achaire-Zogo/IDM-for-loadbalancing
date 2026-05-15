/**
 */
package org.loadbalancer.nginx.metamodel.nginx;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage
 * @generated
 */
public interface NginxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NginxFactory eINSTANCE = org.loadbalancer.nginx.metamodel.nginx.impl.NginxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config</em>'.
	 * @generated
	 */
	NginxConfig createNginxConfig();

	/**
	 * Returns a new object of class '<em>Upstream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Upstream</em>'.
	 * @generated
	 */
	Upstream createUpstream();

	/**
	 * Returns a new object of class '<em>Upstream Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Upstream Server</em>'.
	 * @generated
	 */
	UpstreamServer createUpstreamServer();

	/**
	 * Returns a new object of class '<em>Server Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Block</em>'.
	 * @generated
	 */
	ServerBlock createServerBlock();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NginxPackage getNginxPackage();

} //NginxFactory
