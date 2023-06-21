package inheritance_tugas;

public class Cc extends Merek {
	private String cc;

	public Cc(String tipe, String AWD, String merk, String cc) {
		super(tipe, AWD, merk);
		setCc(cc);
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}
}
