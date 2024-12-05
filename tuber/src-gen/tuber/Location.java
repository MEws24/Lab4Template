/**
 */
package tuber;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuber.Location#getLt <em>Lt</em>}</li>
 *   <li>{@link tuber.Location#getLg <em>Lg</em>}</li>
 *   <li>{@link tuber.Location#getCity <em>City</em>}</li>
 * </ul>
 *
 * @see tuber.TuberPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Lt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lt</em>' attribute.
	 * @see #setLt(int)
	 * @see tuber.TuberPackage#getLocation_Lt()
	 * @model required="true"
	 * @generated
	 */
	int getLt();

	/**
	 * Sets the value of the '{@link tuber.Location#getLt <em>Lt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lt</em>' attribute.
	 * @see #getLt()
	 * @generated
	 */
	void setLt(int value);

	/**
	 * Returns the value of the '<em><b>Lg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lg</em>' attribute.
	 * @see #setLg(int)
	 * @see tuber.TuberPackage#getLocation_Lg()
	 * @model required="true"
	 * @generated
	 */
	int getLg();

	/**
	 * Sets the value of the '{@link tuber.Location#getLg <em>Lg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lg</em>' attribute.
	 * @see #getLg()
	 * @generated
	 */
	void setLg(int value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * The literals are from the enumeration {@link tuber.City}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see tuber.City
	 * @see #setCity(City)
	 * @see tuber.TuberPackage#getLocation_City()
	 * @model required="true"
	 * @generated
	 */
	City getCity();

	/**
	 * Sets the value of the '{@link tuber.Location#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see tuber.City
	 * @see #getCity()
	 * @generated
	 */
	void setCity(City value);

} // Location
