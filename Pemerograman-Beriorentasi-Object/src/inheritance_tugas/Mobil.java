package inheritance_tugas;

public class Mobil {

	protected String tipe;
	protected String AWD;

	public Mobil(String tipe, String AWD) {
		this.tipe = tipe;
		this.AWD = AWD;
	}

	public String getTipe() {
		return tipe;
	}

	public String getAWD() {
		return AWD;
	}

}
