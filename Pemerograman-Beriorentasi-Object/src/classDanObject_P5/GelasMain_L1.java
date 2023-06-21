package classDanObject_P5;

public class GelasMain_L1 {

	public static void main(String[] args) {
		Gelas_L1 g1 = new Gelas_L1("Hitam");
		Gelas_L1 g2 = new Gelas_L1("Biru");

//		System.out.println("Warna g1 : " + g1.getWarna());
//		System.out.println("Warna g2 : " + g2.getWarna());
//		System.out.println("---------------------------");

		tukarWarnaGelas(g1, g2);
		System.out.println("Warna g1 : " + g1.getWarna());
		System.out.println("Warna g2 : " + g2.getWarna());
	}

	static void tukarWarnaGelas(Gelas_L1 g1, Gelas_L1 g2) {
		Gelas_L1 gTemp = new Gelas_L1("Temp");
		gTemp.setWarna(g1.getWarna());
		g1.setWarna(g2.getWarna());
		g2.setWarna(gTemp.getWarna());
	}
}
