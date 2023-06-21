package classDanObject_P5;

public class MataKuliah_L2 {

	private String kode;
	private String nama;
	private String index;
	private int sks;

	// Konstruktor
	public MataKuliah_L2(String kode, String nama, String index, int sks) {
		super();
		this.kode = kode;
		this.nama = nama;
		this.index = index;
		this.sks = sks;
	}

	public String getIndex() {
		return index;
	}

	public int getSks() {
		return sks;
	}

	public double nilaiIndex(String index) {
		// Berdasarkan index matakuliah
		// A = 4, AB = 3.5, B = 3, BC = 2.5, C = 2, E = 0
		switch (index) {
		case "A":
			return 4.0;
		case "AB":
			return 3.5;
		case "B":
			return 3.0;
		case "BC":
			return 2.5;
		case "C":
			return 2.0;
		default:
			return 0.0;
		}
	}

	public String display() {
		return kode + " - " + nama + " - " + index;
	}
}