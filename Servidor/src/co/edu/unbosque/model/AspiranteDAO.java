package co.edu.unbosque.model;

public interface AspiranteDAO {
abstract String actualizar(String nombre, String apellido, int edad, long cedula, String cargo);
abstract String eliminar(long cedula);
abstract String mostrarUno(long cedula);
abstract String mostrarTodo();
}
