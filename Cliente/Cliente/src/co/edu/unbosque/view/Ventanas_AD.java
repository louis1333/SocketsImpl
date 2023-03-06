package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class Ventanas_AD {

	// MENSAJE INFORMACION
	public void mostrarinfo(String info) {
		JOptionPane.showMessageDialog(null, info, "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
	}

	// MENSAJE ADVERTENCIA
	public void mostrarAdv(String info) {
		JOptionPane.showMessageDialog(null, info, "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
	}

	// MENSAJE ERROR
	public void mostrarError(String info) {
		JOptionPane.showMessageDialog(null, info, "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	// LEER DATO
	public double leer(String info) {
		double dato = Double.parseDouble(JOptionPane.showInputDialog(info));
		return dato;
	}

}
