package inheritance;

public class InheritanceMain {

//	Latihan 1

//	public static void main(String[] args) {
//		Mahasiswa mhs = new Mahasiswa();
//		mhs.setNama("M Ridho Fauzan");
//		System.out.println(mhs.getNama());
//	}

//	Latihan 2

//	public static void main(String[] args) {
//		Mahasiswa mhs = new Mahasiswa();
//		System.out.println(mhs.getNama() + " - " + mhs.getAlamat());
//	}

//	Latihan 3

//	public static void main(String[] args) {
//		Mahasiswa mhs = new Mahasiswa("M Ridho Fauzan", "Karawang");
//		System.out.println(mhs.getNama() + " - " + mhs.getAlamat());
//	}

//	Latihan 4

	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa("001", "M Ridho Fauzan", "Karawang");
		System.out.println("\n" + mhs.getNrp() + " - " + mhs.getNama() + " - " + mhs.getAlamat());
	}
}
