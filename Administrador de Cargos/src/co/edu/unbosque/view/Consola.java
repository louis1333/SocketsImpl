package co.edu.unbosque.view;

import java.util.Scanner;

public class Consola {
	private Scanner lector;

	public Consola() {
		lector = new Scanner(System.in);
	}

	public void printString(String str) {

		System.out.println(str);
	}

	public void quemarLinea() {
		lector.nextLine();
	}

	public int leerInt() {
		return lector.nextInt();
	}

	public long leerLong() {
		return lector.nextLong();
	}

	public float leerFloat() {
		return lector.nextFloat();
	}

	public double leerDouble() {
		return lector.nextDouble();
	}

	public String leerStringLine() {
		return lector.nextLine();
	}

	public String leerString() {
		return lector.next();
	}
}
