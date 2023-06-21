package composition;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
	private Date tglCetak;
	private double ipk = 3.5;
	private List<KartuHasilStudi> kartuHasilStudi;
	private Mahasiswa mahasiswa;

	public TranskripNilai(Mahasiswa mahasiswa) {
		super();
		this.mahasiswa = mahasiswa;

		kartuHasilStudi = new ArrayList<KartuHasilStudi>();
		tglCetak = new Date();
	}

	public void hitungIPK() {
		// Bagaimana hitung IPK ?
		// Rumus : (index nilai * sks) + (index nilai * sks) +..+ (index nilai *
		// sks)/total_sks
		double total_nilai = 0.0;
		int total_semester = 0;
		for (KartuHasilStudi khs : kartuHasilStudi) {
			khs.hitungIPS();

			total_semester += 1;
			total_nilai += khs.getIPS();
		}
		ipk = total_nilai / total_semester;
	}

	public void addKHS(KartuHasilStudi KHS) {
		kartuHasilStudi.add(KHS);
	}

	public void display() {
		System.out.println(mahasiswa.display());
		System.out.println("Tanggal Cetak: " + tglCetak.toString());
		System.out.println("IPK: " + ipk);
		for (KartuHasilStudi khs : kartuHasilStudi) {
			System.out.println(khs.display());
		}
	}

//	Setter & Getter
}
