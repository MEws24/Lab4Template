/**
 */
package tuber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuber.SafetyIssue#getRide <em>Ride</em>}</li>
 * </ul>
 *
 * @see tuber.TuberPackage#getSafetyIssue()
 * @model
 * @generated
 */
public interface SafetyIssue extends HelpCentreCall {
	/**
	 * Returns the value of the '<em><b>Ride</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ride</em>' reference.
	 * @see #setRide(Ride)
	 * @see tuber.TuberPackage#getSafetyIssue_Ride()
	 * @model required="true"
	 * @generated
	 */
	Ride getRide();

	/**
	 * Sets the value of the '{@link tuber.SafetyIssue#getRide <em>Ride</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ride</em>' reference.
	 * @see #getRide()
	 * @generated
	 */
	void setRide(Ride value);

} // SafetyIssue
