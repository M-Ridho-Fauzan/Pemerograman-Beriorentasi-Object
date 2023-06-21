package classDanObject_P5;

public class MataKuliahMain {
	public static void main(String[] args) {

		// Create Object MataKuliah
		MataKuliah_L2 mk1 = new MataKuliah_L2("001", "Algoritma Pemrograman 1", "A", 3);
		MataKuliah_L2 mk2 = new MataKuliah_L2("002", "Algoritma Pemrograman 2", "AB", 3);
		MataKuliah_L2 mk3 = new MataKuliah_L2("003", "Pemrograman Berorientasi Object", "B", 3);

		// Tampilkan Daftar Matkul
		System.out.println("--- DAFTAR MATA KULIAH ---\n");
		System.out.println(mk1.display());
		System.out.println(mk2.display());
		System.out.println(mk3.display());

		System.out.println("\n--- Nilai IPK ---");
		// Bagaimana Hitung IPK?
		// Rumus: (index nilai * sks) + (index * sks) + .. + (index nilai *
		// sks)/total_sks
		double nilai1 = mk1.nilaiIndex(mk1.getIndex());
		double nilai2 = mk2.nilaiIndex(mk2.getIndex());
		double nilai3 = mk3.nilaiIndex(mk3.getIndex());

		int totalSks = mk1.getSks() + mk2.getSks() + mk3.getSks();

		double ipk = ((nilai1 * mk1.getSks()) + (nilai2 * mk2.getSks()) + (nilai3 * mk3.getSks())) / totalSks;

		System.out.println("\nIPK: " + ipk);
	}

}