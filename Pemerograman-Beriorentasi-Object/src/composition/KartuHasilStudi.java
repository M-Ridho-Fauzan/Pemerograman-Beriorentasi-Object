package composition;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
	private String semester;
	private double ips;
	private int totalSKS;
	private List<MataKuliah> daftarMatakuliah;

	public KartuHasilStudi(String semester) {
		this.semester = semester;
		this.daftarMatakuliah = new ArrayList<>();
	}

	public void addMataKuliah(MataKuliah matakuliah) {
		daftarMatakuliah.add(matakuliah);
	}

	public String display() {
		StringBuilder sb = new StringBuilder();
		for (MataKuliah mk : daftarMatakuliah) {
			sb.append(mk.display());
			sb.append("\n");
		}
		return sb.toString();
	}

	public void hitungIPS() {
		int totalSKS = 0;
		double totalNilai = 0;
		for (MataKuliah mk : daftarMatakuliah) {
			totalSKS += mk.getSks();
			totalNilai += mk.getSks() * mk.nilaiIndex();
		}
		ips = totalNilai / totalSKS;

	}

//	Setter & Getter
	// Getter IPS
	public double getIPS() {
		return ips;
	}

	// Setter IPS
	double setIPS(double IPS) {
		return ips = IPS;
	}

	// Getter SKS

	// Setter SKS
	int setSKS(int sks) {
		return totalSKS = sks;
	}

}
