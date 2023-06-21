package abstrak_dan_Interface2;

public class KartuElektronik extends Kartu {
	private String pin;

	public KartuElektronik(String pin) {
		this.pin = pin;
	}

	public boolean otentikasiPin(String pinInput) {
		if (pin.equals(pinInput)) {
			return true;
		} else {
			return false;
		}
	}

	public String encodePin(String pin) {
		return null;
	}
}
