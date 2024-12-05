/**
 */
package tuber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuber.Driver#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link tuber.Driver#getEarnings <em>Earnings</em>}</li>
 * </ul>
 *
 * @see tuber.TuberPackage#getDriver()
 * @model
 * @generated
 */
public interface Driver extends AppUser {
	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' containment reference.
	 * @see #setVehicle(Vehicle)
	 * @see tuber.TuberPackage#getDriver_Vehicle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Vehicle getVehicle();

	/**
	 * Sets the value of the '{@link tuber.Driver#getVehicle <em>Vehicle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle</em>' containment reference.
	 * @see #getVehicle()
	 * @generated
	 */
	void setVehicle(Vehicle value);

	/**
	 * Returns the value of the '<em><b>Earnings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Earnings</em>' attribute.
	 * @see #setEarnings(float)
	 * @see tuber.TuberPackage#getDriver_Earnings()
	 * @model required="true"
	 * @generated
	 */
	float getEarnings();

	/**
	 * Sets the value of the '{@link tuber.Driver#getEarnings <em>Earnings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earnings</em>' attribute.
	 * @see #getEarnings()
	 * @generated
	 */
	void setEarnings(float value);

} // Driver
