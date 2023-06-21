package abstrak_dan_Interface2;

public class InterfaceMain {
	public static void main(String[] args) {
		boolean inputNpm;
		boolean inputPin;

		DatNpm NPM1 = new DatNpm("admin");
		KartuElektronik kartu1 = new KartuElektronik("123");
		inputNpm = NPM1.otentikasiNpm("asd2");
		inputPin = kartu1.otentikasiPin("123");
		System.out.println("Otentikasi npm: " + inputNpm);
		System.out.println("Otentikasi pin: " + inputPin);

		System.out.print("\n== dari keduanya menghasilkan: ");
		if (inputNpm && inputPin == true) {
			System.out.println(true);
			System.out.println("Npm dan pin sama");
		} else {
			System.out.println(false);
			System.out.println("Npm dan Pin berbeda");
		}
	}
}
