package composition;

public class MataKuliahMain {
	public static void main(String[] args) {

		// Create Object MataKuliah
		MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3);
		MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "AB", 3);
		MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Object", "B", 3);

		// Tampilkan Daftar Matkul
		System.out.println("--- DAFTAR MATA KULIAH ---\n");
		System.out.println(mk1.display());
		System.out.println(mk2.display());
		System.out.println(mk3.display());

		System.out.println("\n--- Nilai IPK ---");
		// Bagaimana Hitung IPK?
		// Rumus: (index nilai * sks) + (index * sks) + .. + (index nilai *
		// sks)/total_sks
		int totalSks = mk1.getSks() + mk2.getSks() + mk3.getSks();
		double bobotNilai = mk1.nilaiIndex() * mk1.getSks() + mk2.nilaiIndex() * mk2.getSks()
				+ mk3.nilaiIndex() * mk3.getSks();
		double ipk = bobotNilai / totalSks;
		System.out.println("IPK: " + ipk);
	}

}