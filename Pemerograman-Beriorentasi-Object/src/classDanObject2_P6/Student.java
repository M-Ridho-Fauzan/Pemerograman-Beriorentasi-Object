package classDanObject2_P6;

public class Student {
	private String nrp;

	public String getNrp() {
		return nrp;
	}

	public void setNrp(String nrp) {
		this.nrp = nrp;
	}

	public static void main(String[] args) {
		Student x = new Student();
		Student y = x;

		x.setNrp("01");
		y.setNrp("02");
		System.out.println(x.getNrp());

		Student z = new Student();
		z.setNrp("03");
		x = z;
		System.out.println(x.getNrp());
		System.out.println(y.getNrp());

	}
}
