/**
 */
package tuber.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tuber.City;
import tuber.Location;
import tuber.TuberPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tuber.impl.LocationImpl#getLt <em>Lt</em>}</li>
 *   <li>{@link tuber.impl.LocationImpl#getLg <em>Lg</em>}</li>
 *   <li>{@link tuber.impl.LocationImpl#getCity <em>City</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
	/**
	 * The default value of the '{@link #getLt() <em>Lt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLt()
	 * @generated
	 * @ordered
	 */
	protected static final int LT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLt() <em>Lt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLt()
	 * @generated
	 * @ordered
	 */
	protected int lt = LT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLg() <em>Lg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLg()
	 * @generated
	 * @ordered
	 */
	protected static final int LG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLg() <em>Lg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLg()
	 * @generated
	 * @ordered
	 */
	protected int lg = LG_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final City CITY_EDEFAULT = City.WIEN;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected City city = CITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TuberPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLt() {
		return lt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLt(int newLt) {
		int oldLt = lt;
		lt = newLt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.LOCATION__LT, oldLt, lt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLg() {
		return lg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLg(int newLg) {
		int oldLg = lg;
		lg = newLg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.LOCATION__LG, oldLg, lg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public City getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(City newCity) {
		City oldCity = city;
		city = newCity == null ? CITY_EDEFAULT : newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.LOCATION__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TuberPackage.LOCATION__LT:
			return getLt();
		case TuberPackage.LOCATION__LG:
			return getLg();
		case TuberPackage.LOCATION__CITY:
			return getCity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TuberPackage.LOCATION__LT:
			setLt((Integer) newValue);
			return;
		case TuberPackage.LOCATION__LG:
			setLg((Integer) newValue);
			return;
		case TuberPackage.LOCATION__CITY:
			setCity((City) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TuberPackage.LOCATION__LT:
			setLt(LT_EDEFAULT);
			return;
		case TuberPackage.LOCATION__LG:
			setLg(LG_EDEFAULT);
			return;
		case TuberPackage.LOCATION__CITY:
			setCity(CITY_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TuberPackage.LOCATION__LT:
			return lt != LT_EDEFAULT;
		case TuberPackage.LOCATION__LG:
			return lg != LG_EDEFAULT;
		case TuberPackage.LOCATION__CITY:
			return city != CITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (lt: ");
		result.append(lt);
		result.append(", lg: ");
		result.append(lg);
		result.append(", city: ");
		result.append(city);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
