package swingP13_1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Coba extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JButton button;

	public Coba() {

		label = new JLabel();
		label.setText("Hello World");
		button = new JButton("Klik aku!!");
		button.addActionListener(this);
		// button.setPreferredSize(new Dimension(100, 50));

		// setLayout(new GridLayout(2, 1));
		setLayout(new FlowLayout());
		button.setPreferredSize(new Dimension(100, 50));
		add(label);
		add(button);

		setTitle("My First Program");
		setSize(300, 200);
//		 pack(); // ini akan menyesuaikan dengan isi content
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		label.setText("Berubah jir");
	}

	public static void main(String[] args) {
		Coba form = new Coba();
	}
}

//import java.awt.BorderLayout;
//import java.awt.GridLayout;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//public class Coba extends JFrame {
//	private JLabel label;
//	private JButton button;
//
//	public Coba() {
//		label = new JLabel();
//		label.setText("Hello World");
//		button = new JButton("Klik aku!!");
//		button.addActionListener(e -> label.setText("Berubah jir"));
//
//		JPanel container = new JPanel(new GridLayout(1, 2));
//		container.add(label);
//
//		JPanel buttonContainer = new JPanel(new BorderLayout());
//		buttonContainer.add(button, BorderLayout.CENTER);
//		container.add(buttonContainer);
//
//		setLayout(new GridLayout(2, 1));
//		add(container);
//
//		setTitle("My First Program");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		pack();
//		setVisible(true);
//	}
//
//	public static void main(String[] args) {
//		Coba form = new Coba();
//	}
//}
