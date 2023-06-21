package inheritance;

//	Latihan 1 & 2 hanya pakai ini saja(Emang kosong)
public class Mahasiswa extends Orang {

//	Latihan 3

//	public Mahasiswa(String nama, String alamat) {
//		super(nama, alamat);
//	}

//	Latihan 4

	private String nrp;

	public Mahasiswa(String nrp, String nama, String alamat) {
		super(nama, alamat);
		setNrp(nrp);
	}

	public String getNrp() {
		return nrp;
	}

	public void setNrp(String nrp) {
		this.nrp = nrp;
	}
}
