package abstrak_dan_Interface;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n== Intput Lingkaran ==");
		System.out.print("- Masukkan jari-jari lingkaran: ");
		int jari2Lingkaran = scanner.nextInt();
		Lingkaran lingkaran = new Lingkaran(jari2Lingkaran);
		System.out.println("== Lingkaran ==");
		double luasLingkaran = lingkaran.luas();
		System.out.println("Luas: " + luasLingkaran);
		System.out.println(" \n++++++++++++++++++++++++++ ");
		System.out.println("\n== Intput Tabung ==");
		System.out.print("- Masukkan jari-jari tabung: ");
		int jari2Tabung = scanner.nextInt();
		System.out.print("- Masukkan tinggi tabung: ");
		int tinggiTabung = scanner.nextInt();
		System.out.println("== Output Tabung ==");
		Tabung tabung = new Tabung(jari2Tabung, tinggiTabung);
		double luasTabung = tabung.luas();
		System.out.println("Luas Tabung: " + luasTabung);

		scanner.close();
	}
}
