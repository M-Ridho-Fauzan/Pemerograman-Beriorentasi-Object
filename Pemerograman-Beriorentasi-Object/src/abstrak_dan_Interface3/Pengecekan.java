package abstrak_dan_Interface3;

public abstract class Pengecekan {
	public abstract boolean cekOtentikasi();

	public boolean otentikasiKartu(Kartu kartu) {
		return kartu.otentikasiPin("123");
	}

	public boolean otentikasiNpm(Npm npm) {
		return npm.otentikasiNpm("admin");
	}
}
