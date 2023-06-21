package swingCalculatorPenjumP13_3;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutExample {
	public static void main(String[] args) {
		// Membuat JFrame
		JFrame frame = new JFrame("Contoh BorderLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);

		// Membuat panel untuk menampung komponen
		JPanel panel = new JPanel(new BorderLayout());

		// Membuat komponen-komponen
		JButton buttonCenter = new JButton("Tengah(Center)");
		JButton buttonNorth = new JButton("Utara(North)");
		JButton buttonSouth = new JButton("Selatan(South)");
		JButton buttonWest = new JButton("Barat(West)");
		JButton buttonEast = new JButton("Timur(EAST)");

		// Menambahkan komponen ke panel dengan posisi yang ditentukan
		panel.add(buttonCenter, BorderLayout.CENTER);
		panel.add(buttonNorth, BorderLayout.NORTH);
		panel.add(buttonSouth, BorderLayout.SOUTH);
		panel.add(buttonWest, BorderLayout.WEST);
		panel.add(buttonEast, BorderLayout.EAST);

		// Menambahkan panel ke frame
		frame.getContentPane().add(panel);

		// Menampilkan frame
		frame.setVisible(true);
	}
}
