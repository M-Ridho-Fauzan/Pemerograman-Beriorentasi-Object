package inheritance_tugas;

public class Merek extends Mobil {

	private String merk;

	public Merek(String tipe, String AWD, String merk) {
		super(tipe, AWD);
		setMerk(merk);
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}
}
