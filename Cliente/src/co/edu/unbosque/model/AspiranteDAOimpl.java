package co.edu.unbosque.model;

import java.util.ArrayList;

import java.util.List;

import co.edu.unbosque.model.persistence.FileHandler;


public class AspiranteDAOimpl implements AspiranteDAO{
private ArrayList<AspiranteDTO> lista;

public AspiranteDAOimpl() {
	lista = new ArrayList<>();
	cargarserial();
}

	private void cargarserial() {
	Object aux = FileHandler.readSerializable("aspirantes.dat");
	lista = (ArrayList<AspiranteDTO>) aux;
}

	public void crear(String nombre, String apellido, int edad, long cedula, String cargo) {
		AspiranteDTO aux = new AspiranteDTO(nombre, apellido, edad, cedula, cargo);
		lista.add(aux);
		FileHandler.writeSerializable(lista, "aspirantes.dat");
	}


}