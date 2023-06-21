package abstrak_dan_Interface3;

public class PengecekanImplementasi extends Pengecekan {
	private KartuElektronik kartu;
	private DatNpm npm;

	public PengecekanImplementasi(KartuElektronik kartu, DatNpm npm) {
		this.kartu = kartu;
		this.npm = npm;
	}

	@Override
	public boolean cekOtentikasi() {
		boolean otentikasiKartu = otentikasiKartu(kartu);
		boolean otentikasiNpm = otentikasiNpm(npm);

		return otentikasiKartu && otentikasiNpm;
	}
}
