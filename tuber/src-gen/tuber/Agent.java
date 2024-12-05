/**
 */
package tuber;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuber.Agent#getName <em>Name</em>}</li>
 *   <li>{@link tuber.Agent#getRides <em>Rides</em>}</li>
 *   <li>{@link tuber.Agent#getCity <em>City</em>}</li>
 *   <li>{@link tuber.Agent#getUsers <em>Users</em>}</li>
 *   <li>{@link tuber.Agent#getRevenue <em>Revenue</em>}</li>
 * </ul>
 *
 * @see tuber.TuberPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tuber.TuberPackage#getAgent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tuber.Agent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rides</b></em>' containment reference list.
	 * The list contents are of type {@link tuber.Ride}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rides</em>' containment reference list.
	 * @see tuber.TuberPackage#getAgent_Rides()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ride> getRides();

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * The literals are from the enumeration {@link tuber.City}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see tuber.City
	 * @see #setCity(City)
	 * @see tuber.TuberPackage#getAgent_City()
	 * @model required="true"
	 * @generated
	 */
	City getCity();

	/**
	 * Sets the value of the '{@link tuber.Agent#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see tuber.City
	 * @see #getCity()
	 * @generated
	 */
	void setCity(City value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link tuber.AppUser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see tuber.TuberPackage#getAgent_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<AppUser> getUsers();

	/**
	 * Returns the value of the '<em><b>Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revenue</em>' attribute.
	 * @see #setRevenue(float)
	 * @see tuber.TuberPackage#getAgent_Revenue()
	 * @model required="true"
	 * @generated
	 */
	float getRevenue();

	/**
	 * Sets the value of the '{@link tuber.Agent#getRevenue <em>Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revenue</em>' attribute.
	 * @see #getRevenue()
	 * @generated
	 */
	void setRevenue(float value);

} // Agent
