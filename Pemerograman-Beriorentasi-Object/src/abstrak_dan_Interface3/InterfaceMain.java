package abstrak_dan_Interface3;

import java.util.Scanner;

public class InterfaceMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("===== Login ======= ");
		System.out.print("Nama: ");
		String inputNpm = input.nextLine();
		System.out.print("Sandi: ");
		String inputSandi = input.nextLine();

		DatNpm npm = new DatNpm(inputNpm);
		KartuElektronik kartu = new KartuElektronik(inputSandi);
		// ClassDiagram mm = new ClassDiagram();

		System.out.println("\n======= Hasil ======== ");

		PengecekanImplementasi pengecekan = new PengecekanImplementasi(kartu, npm);
		boolean hasil = pengecekan.cekOtentikasi();

		if (hasil) {
			System.out.println("KartuElektronik dan DatNpm adalah: true.");
		} else {
			System.out.println(
					"Nilai otentikasi dari KartuElektronik dan DatNpm tidak sama atau salah satu adalah false.");
		}
		// System.out.println("\n=== relasi diagram nya: \n");
		// mm.digram();
	}
}