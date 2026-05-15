/**
 */
package org.loadbalancer.nginx.metamodel.nginx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Upstream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.Upstream#getName <em>Name</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.Upstream#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.Upstream#getServers <em>Servers</em>}</li>
 * </ul>
 *
 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getUpstream()
 * @model
 * @generated
 */
public interface Upstream extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getUpstream_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.loadbalancer.nginx.metamodel.nginx.Upstream#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getUpstream_Algorithm()
	 * @model
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.loadbalancer.nginx.metamodel.nginx.Upstream#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
	 * The list contents are of type {@link org.loadbalancer.nginx.metamodel.nginx.UpstreamServer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' containment reference list.
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getUpstream_Servers()
	 * @model containment="true"
	 * @generated
	 */
	EList<UpstreamServer> getServers();

} // Upstream
