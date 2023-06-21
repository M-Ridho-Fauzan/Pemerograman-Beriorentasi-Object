package swingP13_1;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm2 extends JFrame {
	private JLabel label;

	public HelloWorldForm2() {
		label = new JLabel();
		label.setText("Hello Dunia");

		add(label);
		setTitle("Program pertama - 2");

		setSize(600, 300);
	}
}
