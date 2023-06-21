package swingCalculatorPenjumP13_3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TugasSwing extends JFrame {
	private JTextField inputField1;
	private JTextField inputField2;
	private JButton calculateButton;

	public TugasSwing() {
		inputField1 = new JTextField(10);
		inputField2 = new JTextField(10);
		calculateButton = new JButton("Jumlah");
		calculateButton.setBackground(Color.GREEN);
		calculateButton.addActionListener(new ActionListener() {
//			saat button di click, jalankan method di bawah ini
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(inputField1.getText());
				int num2 = Integer.parseInt(inputField2.getText());
				int result = num1 + num2;

				// notif penjumlahan
				String message = "Jumlah: " + result;
				JOptionPane.showMessageDialog(TugasSwing.this, message, "Hasil", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		JPanel inputPanel = new JPanel(new FlowLayout());
//		inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS)); //
		// mengatur layout posisi dari inputPanae
		inputPanel.setBackground(Color.YELLOW);
		inputPanel.add(new JLabel("Angka 1:"));
		inputPanel.add(inputField1);
		inputPanel.add(new JLabel("Angka 2:"));
		inputPanel.add(inputField2);

		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.add(calculateButton);

//		setLayout(new GridLayout(2, 1));
		setLayout(new BorderLayout());
		add(inputPanel, BorderLayout.NORTH);
		add(buttonPanel, BorderLayout.SOUTH);

		setTitle("Kalkulator Penjumlahan");// judul dari app
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// agar menutup sepenuhnya
//		setSize(300, 200);
		pack(); // ukuran menyesuaikan dengan isi dari content
		setVisible(true);
	}
}
