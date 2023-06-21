package composition;

public class Mahasiswa {
	private String NRP;
	private String nama;

	public Mahasiswa() {
//		TODO Auto-generate contructor stub
	}

	public Mahasiswa(String nRP, String nama) {
		super();
		NRP = nRP;
		this.nama = nama;
	}

	public String display() {
		return "NRP: " + NRP + ", Nama: " + nama;
	}

//	Setter & Getter
	// Setter
	public void setNRP(String nRP) {
		this.NRP = nRP;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	// Getter
	public String getNRP() {
		return NRP;
	}

	public String getNama() {
		return nama;
	}

}
