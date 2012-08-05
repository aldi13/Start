package pl.sawicka;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrows {

	public int readIntegerArgument(String argumentName) throws IOException {
		boolean goodInput = false;

		System.out.print("Podaj " + argumentName + ": ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		while (!goodInput) {
			try {
				x = Integer.parseInt(br.readLine());
				if (x >= 1 & x <= 5) {
					goodInput = true;
				} else {
					System.out.print("Niepoprawny parametr - " + argumentName
							+ " musi byæ liczb¹ od 1 do 5! Podaj "
							+ argumentName + ": ");
				}
			} catch (NumberFormatException e) {
				System.out.print("Niepoprawny parametr - " + argumentName
						+ " musi byæ liczb¹ od 1 do 5! Podaj " + argumentName
						+ ": ");
			}
		}
		return x;
	}

	public String readWayArgument() throws IOException {
		System.out.print("Jaki kierunek? : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String way = null;

		boolean goodInput = false;
		while (!goodInput) {
			way = br.readLine();
			if ("n".equals(way) || "s".equals(way) || "w".equals(way)
					|| "e".equals(way)) {
				goodInput = true;
			} else {
				System.out.println("Podaj poprawny kierunek (n, s, e lub w): ");
			}
		}
		return way;
	}

	public static void main(String[] args) throws IOException {

		Arrows a = new Arrows();
		final int x = a.readIntegerArgument("N");
		final String w = a.readWayArgument();

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MyFrame(x, w);
			}
		});
	}
}