package reviewMateri_P1;

import java.util.Scanner;

public class PersegiPanjang {

	    private double panjang;
	    private double lebar;

	    public PersegiPanjang(double panjang, double lebar) {
	        this.panjang = panjang;
	        this.lebar = lebar;
	    }

	    public double hitungLuas() {
	        return panjang * lebar;
	    }

	    public double hitungKeliling() {
	        return 2 * (panjang + lebar);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Panjang: ");
	        double panjang = scanner.nextDouble();

	        System.out.print("Lebar: ");
	        double lebar = scanner.nextDouble();

	        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

	        System.out.println("Luas: " + persegiPanjang.hitungLuas());
	        System.out.println("Keliling: " + persegiPanjang.hitungKeliling());
	    }
	}


