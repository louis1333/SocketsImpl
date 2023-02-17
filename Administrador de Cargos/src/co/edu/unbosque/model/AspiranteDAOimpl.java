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

	@Override
	public String actualizar(String nombre, String apellido, int edad, long cedula, String cargo) {
		String res = "";
		boolean encontrado = false;
			for (AspiranteDTO s : lista) {
				if(cedula == s.getCedula()) {
					s.setNombre(nombre);
					s.setApellido(apellido);
					s.setEdad(edad);
					s.setCargo(cargo);
					encontrado = true;
				}
			}
		if (encontrado == true) {
			res = "Usuario editado!";
		}else {
			res = "Usuario no encontrado";
		}
		FileHandler.writeSerializable(lista, "aspirantes.dat");
		return res;
	}

	@Override
	public String eliminar(long cedula) {
	    String res = "";
	    List<AspiranteDTO> elementosAEliminar = new ArrayList<>();
	    for (AspiranteDTO s : lista) {
	        if (cedula == s.getCedula()) {
	            elementosAEliminar.add(s);
	            res = "Usuario eliminado!";
	        }
	    }
	    lista.removeAll(elementosAEliminar);
	    if (res.isEmpty()) {
	        res = "Usuario no encontrado";
	    }
	    FileHandler.writeSerializable(lista, "aspirantes.dat");
	    return res;
	}

	@Override
	public String mostrarUno(long cedula) {
		String res = "";
		for (AspiranteDTO s : lista) {
			if (cedula == s.getCedula()) {
				res += "nombre: "+s.getNombre()+"\n"+
						"apellido: "+s.getApellido()+"\n"+
						"edad: "+s.getEdad()+"\n"+
						"cedula: "+s.getCedula()+"\n"+
						"cargo: "+s.getCargo()+"\n"+
						"------------------------------"+"\n";
			}
		}
		return res;
	}

	@Override
	public String mostrarTodo() {
		String res = "";
		for (AspiranteDTO s : lista) {
			res += "nombre: "+s.getNombre()+"\n"+
					"apellido: "+s.getApellido()+"\n"+
					"edad: "+s.getEdad()+"\n"+
					"cedula: "+s.getCedula()+"\n"+
					"cargo: "+s.getCargo()+"\n"+
					"------------------------------"+"\n";
		}
		return res;
	}
	
}