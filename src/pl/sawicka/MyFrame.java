package pl.sawicka;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {

	public MyFrame(int x, String way) {
		super("Arrows");

		JPanel panel = new MyPanel(x, way);

		add(panel);

		pack();

		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
