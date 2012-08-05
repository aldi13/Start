package pl.sawicka;

import java.awt.*;
import java.util.Random;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	int n;
	String way;
	
	public MyPanel(int n1, String way1) {
		n = n1;
		way = way1;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		int i = 0;
		int x = 0;
		int y = 0;
		Random r = new Random();
		
		switch (way) {
		case "s":
			while (i < n) {
				x = r.nextInt(440) + 20;
				y = r.nextInt(440) + 20;
			    g2d.drawLine(x, y - 20, x, y + 10);
				g2d.drawLine(x - 10, y, x, y + 10);
				g2d.drawLine(x + 10, y, x, y + 10);
				i++;
			}
			break;

		case "n":
			while (i < n) {
				x = r.nextInt(440) + 20;
				y = r.nextInt(440) + 20;
				g2d.drawLine(x, y - 20, x, y + 10);
				g2d.drawLine(x - 10, y - 10, x, y - 20);
				g2d.drawLine(x + 10, y - 10, x, y - 20);
				i++;
			}
			break;

		case "e":
			while (i < n) {
				x = r.nextInt(440) + 20;
				y = r.nextInt(440) + 20;
				g2d.drawLine(x - 20, y - 10, x + 10, y - 10);
				g2d.drawLine(x, y, x + 10, y - 10);
				g2d.drawLine(x, y - 20, x + 10, y - 10);
				i++;
			}
			break;

		case "w":
			while (i < n) {
				x = r.nextInt(440) + 20;
				y = r.nextInt(440) + 20;
				g2d.drawLine(x - 20, y - 10, x + 10, y - 10);
				g2d.drawLine(x - 20, y - 10, x - 10, y);
				g2d.drawLine(x - 20, y - 10, x - 10, y - 20);
				i++;
			}
			break;
		}
	}
} 
