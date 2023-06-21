package inheritance_tugas;

public class MerekMain {

	public static void main(String[] args) {
		Cc mhs = new Cc("Offroad", "4WD", "Toyota", "500");
		System.out.println("\nMerk: " + mhs.getMerk() + "\nTipe: " + mhs.getTipe() + "\nAWD: " + mhs.getAWD() + "\nCC: "
				+ mhs.getCc() + "cc");
	}
}
