package abstrak_dan_Interface3;

public class DatNpm extends Npm {
	private String npm;

	public DatNpm(String npm) {
		this.npm = npm;
	}

	public boolean otentikasiNpm(String npmInput) {
		if (npm.equals(npmInput)) {
			return true;
		} else {
			return false;
		}
	}

	public String encodeNpm(String npm) {
		return null;
	}

//	Boolean otentikasiAll(String npmInput, String pinInput) {
//		if (otentikasiNpm("123") && otentikasiPin("123")) {
//			return true;
//		} else {
//			return false;
//		}
//	}
}
