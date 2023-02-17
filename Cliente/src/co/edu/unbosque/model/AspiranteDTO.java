package co.edu.unbosque.model;

import java.io.Serializable;

public class AspiranteDTO implements Serializable{
private String nombre;
private String apellido;
private int edad;
private long cedula;
private String cargo;



public AspiranteDTO() {
	

}

public AspiranteDTO(String nombre, String apellido, int edad, long cedula, String cargo) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.cedula = cedula;
	this.cargo = cargo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public long getCedula() {
	return cedula;
}

public void setCedula(long cedula) {
	this.cedula = cedula;
}

public String getCargo() {
	return cargo;
}

public void setCargo(String cargo) {
	this.cargo = cargo;
}



}
