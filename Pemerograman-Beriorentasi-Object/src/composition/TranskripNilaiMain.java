package composition;

public class TranskripNilaiMain {
	public static void main(String[] args) {
		// Create Object MataKuliah
		MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3);
		MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "AB", 3);
		MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Object", "B", 3);

//		Create Objec KHS
		KartuHasilStudi khs = new KartuHasilStudi("20222");
		khs.addMataKuliah(mk1);
		khs.addMataKuliah(mk2);
		khs.addMataKuliah(mk3);

//		Create Object Mahasiswa
		Mahasiswa mhs = new Mahasiswa("303040001", "John");

//		Create object TranskripNilai
		TranskripNilai transkrip = new TranskripNilai(mhs);
		transkrip.addKHS(khs);
		transkrip.display();

	}
}
