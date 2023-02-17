package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;


public class VentanaPrincipal extends JFrame {
	private JTextField nombre;
	private JTextField apellido;
	private JTextField edad;
	private JTextField cedula;
	private JTextField cargo;
	private JButton agregar;
	private JButton eliminar;
	private JButton ver_uno;
	private JButton ver;
	private JButton editar;
	private JTextArea lista;

public VentanaPrincipal() {
	setTitle("Aspirantes");
	setSize(500, 500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	setLocationRelativeTo(null);
	getContentPane().setLayout(null);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(10, 242, 466, 211);
	getContentPane().add(scrollPane);
	lista = new JTextArea();
	scrollPane.setViewportView(lista);
	lista.setEditable(false);
	lista.setBackground(Color.lightGray);
	
	
	
	agregar = new JButton("Agregar");
	agregar.setFont(new Font("Times New Roman", Font.BOLD, 15));
	agregar.setBounds(300, 30, 97, 31);
	agregar.setActionCommand("agregar");
	getContentPane().add(agregar);
	agregar.setBackground(Color.lightGray);
	
	eliminar = new JButton("Eliminar");
	eliminar.setFont(new Font("Times New Roman", Font.BOLD, 15));
	eliminar.setBounds(300, 190, 97, 31);
	eliminar.setActionCommand("eliminar");
	getContentPane().add(eliminar);
	eliminar.setBackground(Color.lightGray);
	
	ver = new JButton("Ver todo");
	ver.setFont(new Font("Times New Roman", Font.BOLD, 15));
	ver.setBounds(300, 110, 97, 31);
	ver.setActionCommand("ver");
	getContentPane().add(ver);
	ver.setBackground(Color.lightGray);
	
	ver_uno = new JButton("Ver uno");
	ver_uno.setFont(new Font("Times New Roman", Font.BOLD, 15));
	ver_uno.setBounds(300, 150, 97, 31);
	ver_uno.setActionCommand("ver_uno");
	getContentPane().add(ver_uno);
	ver_uno.setBackground(Color.lightGray);
	
	editar = new JButton("Editar");
	editar.setFont(new Font("Times New Roman", Font.BOLD, 15));
	editar.setBounds(300, 70, 97, 31);
	editar.setActionCommand("editar");
	getContentPane().add(editar);
	editar.setBackground(Color.lightGray);
	
	nombre = new JTextField();
	nombre.setBounds(110, 50, 96, 19);
	getContentPane().add(nombre);
	nombre.setColumns(10);
	nombre.setBackground(Color.white);
	
	apellido = new JTextField();
	apellido.setColumns(10);
	apellido.setBounds(110, 80, 96, 19);
	getContentPane().add(apellido);
	apellido.setBackground(Color.white);
	
	
	edad = new JTextField();
	edad.setColumns(10);
	edad.setBounds(110, 110, 96, 19);
	getContentPane().add(edad);
	edad.setBackground(Color.white);
	
	cedula = new JTextField();
	cedula.setColumns(10);
	cedula.setBounds(110, 140, 96, 19);
	getContentPane().add(cedula);
	cedula.setBackground(Color.white);
	
	cargo = new JTextField();
	cargo.setColumns(10);
	cargo.setBounds(110, 170, 96, 19);
	getContentPane().add(cargo);
	cargo.setBackground(Color.white); 
	
	JLabel texto1 = new JLabel("NOMBRE");
	texto1.setBounds(20, 50, 70, 13);
	getContentPane().add(texto1);
	
	JLabel texto2 = new JLabel("APELLIDO");
	texto2.setBounds(20, 80, 70, 17);
	getContentPane().add(texto2);
	
	JLabel texto3 = new JLabel("EDAD");
	texto3.setBounds(20, 110, 70, 13);
	getContentPane().add(texto3);
	
	JLabel texto4 = new JLabel("CEDULA");
	texto4.setBounds(20, 140, 70, 13);
	getContentPane().add(texto4);
	
	JLabel texto5 = new JLabel("CARGO");
	texto5.setBounds(20, 170, 70, 13);
	getContentPane().add(texto5);
	
}

public JTextField getNombre() {
	return nombre;
}

public void setNombre(JTextField nombre) {
	this.nombre = nombre;
}

public JTextField getApellido() {
	return apellido;
}

public void setApellido(JTextField apellido) {
	this.apellido = apellido;
}

public JTextField getEdad() {
	return edad;
}

public void setEdad(JTextField edad) {
	this.edad = edad;
}

public JTextField getCedula() {
	return cedula;
}

public void setCedula(JTextField cedula) {
	this.cedula = cedula;
}

public JTextField getCargo() {
	return cargo;
}

public void setCargo(JTextField cargo) {
	this.cargo = cargo;
}

public JButton getAgregar() {
	return agregar;
}

public void setAgregar(JButton agregar) {
	this.agregar = agregar;
}

public JButton getEliminar() {
	return eliminar;
}

public void setEliminar(JButton eliminar) {
	this.eliminar = eliminar;
}

public JButton getVer_uno() {
	return ver_uno;
}

public void setVer_uno(JButton ver_uno) {
	this.ver_uno = ver_uno;
}

public JButton getVer() {
	return ver;
}

public void setVer(JButton ver) {
	this.ver = ver;
}

public JButton getEditar() {
	return editar;
}

public void setEditar(JButton editar) {
	this.editar = editar;
}

public JTextArea getLista() {
	return lista;
}

public void setLista(JTextArea lista) {
	this.lista = lista;
}
}
