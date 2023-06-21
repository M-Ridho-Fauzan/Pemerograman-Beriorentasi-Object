package swingP13_1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//di atas merupakan baris impor yang mendefinisikan paket-paket yang akan digunakan dalam kode tersebut.

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//adalah baris impor yang mendefinisikan kelas-kelas dari paket Swing yang akan digunakan dalam pembuatan antarmuka pengguna.

public class HelloWorldForm3 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;// adalah nomor serial yang digunakan untuk tujuan serialisasi
													// kelas.
	private JLabel label;// dek label
	private JButton button;// dek tmbol

	public HelloWorldForm3() {
//		di atas adalah konstruktor kelas HelloWorldForm3
//		yang akan dipanggil saat objek kelas ini dibuat. 
//		Ini akan melakukan inisialisasi awal, seperti membuat label, tombol, 
//		dan mengatur tata letak.

		label = new JLabel();// mendeklarasikan lagi label = JLabel
		label.setText("Hello World");// mengeset label dengan text
		button = new JButton("Klik aku!!");// sama kyak label, tapi btn langsung
		button.addActionListener(this);/*
										 * menambahkan objek this (objek dari kelas HelloWorldForm3) sebagai pendengar
										 * acara untuk tombol. Ini berarti metode actionPerformed dalam kelas
										 * HelloWorldForm3 akan dipanggil saat tombol diklik.
										 */

		setLayout(new GridLayout(2, 1));/*
										 * mengatur tata letak jendela dengan tata letak GridLayout yang memiliki 2
										 * baris dan 1 kolom.
										 */
		add(label);// menambahkan komponen label
		add(button);// dan tombol ke jendela.
		setTitle("My First Program");// judul jendela
		setSize(300, 200);// atur ukuran jendela menjadi lebar 300 piksel dan tinggi 200 piksel.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/*
														 * mengatur operasi penutupan jendela saat tombol penutup di
														 * klik. Dalam kasus ini, aplikasi akan ditutup sepenuhnya.
														 */
		setVisible(true);// mengatur jendela menjadi terlihat atau terlihat oleh pengguna.
	}

	public void actionPerformed(ActionEvent e) { /*
													 * adalah metode yang diimplementasikan dari antarmuka
													 * ActionListener. Ini akan dipanggil saat tombol diklik dan akan
													 * mengubah teks label menjadi "Hallo Dunia1".
													 */
		label.setText("Berubah jir");
	}

	public static void main(String[] args) {
		HelloWorldForm3 form = new HelloWorldForm3();
	}
}

//import java.awt.GridLayout;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.event.AncestorEvent;
//import javax.swing.event.AncestorListener;
//
//public class HelloWorldForm3 extends JFrame implements AncestorListener {
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private JLabel label;
//	private JButton button;
//
//	public HelloWorldForm3() {
//		label = new JLabel();
//		label.setText("Hello World");
//		button = new JButton("Klik aku!!");
//		button.addActionListener((ActionListener) this);
//
//		setLayout(new GridLayout(2, 1));
//		add(label);
//		add(button);
//		setTitle("My First Program");
//		setVisible(true);
//		setSize(300, 200);
//	}
//
//	@Override
//	public void ancestorAdded(AncestorEvent e) {
//		// TODO Auto-generated method stub
//		label.setText("Hallo Dunia1");
//	}
//
//	@Override
//	public void ancestorRemoved(AncestorEvent e) {
//		// TODO Auto-generated method stub
//		label.setText("Hallo Dunia2");
//	}
//
//	@Override
//	public void ancestorMoved(AncestorEvent e) {
//		// TODO Auto-generated method stub
//		label.setText("Hallo Dunia3");
//	}
//}
