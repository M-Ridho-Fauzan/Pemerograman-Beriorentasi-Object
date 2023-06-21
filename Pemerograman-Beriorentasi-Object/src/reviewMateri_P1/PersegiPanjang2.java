package reviewMateri_P1;

	import java.util.Scanner;

	public class PersegiPanjang2 {
	    private double panjang;
	    private double lebar;

	    public PersegiPanjang2(double panjang, double lebar) {
	        this.panjang = panjang;
	        this.lebar = lebar;
	    }

	    public double hitungLuas() {
	        return panjang * lebar;
	    }

	    public double hitungKeliling() {
	        return 2 * (panjang + lebar);
	    }

	    public void tampil() {
	        System.out.println("Panjang: " + panjang);
	        System.out.println("Lebar: " + lebar);
	        System.out.println("Luas: " + hitungLuas());
	        System.out.println("Keliling: " + hitungKeliling());
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Panjang: ");
	        double panjang = scanner.nextDouble();

	        System.out.print("Lebar: ");
	        double lebar = scanner.nextDouble();

	        PersegiPanjang2 PersegiPanjang2 = new PersegiPanjang2(panjang, lebar);

	        PersegiPanjang2.tampil();
	    }
	}


