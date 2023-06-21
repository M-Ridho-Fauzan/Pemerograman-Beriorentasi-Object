package swingCalculatorPenjumP13_2;

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
		calculateButton = new JButton("Hitung");
		calculateButton.setBackground(Color.GREEN);
		calculateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				int num1 = Integer.parseInt(inputField1.getText());
//				int num2 = Integer.parseInt(inputField2.getText());
//				 int result = num1 + num2;
//
//				 String message = "Hasil penjumlahan: " + result;
//				 JOptionPane.showMessageDialog(TugasSwing.this, message, "Hasil",
//				 JOptionPane.INFORMATION_MESSAGE);

				String input1 = inputField1.getText();
				String input2 = inputField2.getText();
				if (input1.isEmpty() || input2.isEmpty()) {
					JOptionPane.showMessageDialog(TugasSwing.this, "Field 1 atau Field 2 masih kosong", "Peringatan",
							JOptionPane.WARNING_MESSAGE);
				} else {
					int num1 = Integer.parseInt(input1);
					int num2 = Integer.parseInt(input2);
					int result = num1 + num2;

					String message = "Hasil penjumlahan: " + result;
					JOptionPane.showMessageDialog(TugasSwing.this, message, "Hasil", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		JPanel inputPanel = new JPanel(new FlowLayout());
		// inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.X_AXIS));
		inputPanel.setBackground(Color.YELLOW);
		inputPanel.add(new JLabel("Angka 1:"));
		inputPanel.add(inputField1);
		inputPanel.add(new JLabel("Angka 2:"));
		inputPanel.add(inputField2);

		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.add(calculateButton);

		setLayout(new BorderLayout());
		add(inputPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);

		setTitle("Kalkulator Penjumlahan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setSize(300, 200);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		TugasSwing form = new TugasSwing();
	}
}
