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
	private JButton eliminar;
	private JButton ver_uno;
	private JButton ver;
	private JButton editar;
	private JTextArea lista;

public VentanaPrincipal() {
	setTitle("Servidor");
	setSize(500, 800);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	setLocationRelativeTo(null);
	getContentPane().setLayout(null);
	Color ventanaColor = new Color(214, 255, 241);
	getContentPane().setBackground(ventanaColor);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(10, 500, 466, 211);
	getContentPane().add(scrollPane);
	lista = new JTextArea();
	scrollPane.setViewportView(lista);
	lista.setEditable(false);
	lista.setBackground(Color.lightGray);
	

	
	eliminar = new JButton("Eliminar");
	eliminar.setFont(new Font("Times New Roman", Font.BOLD, 15));
	eliminar.setBounds(20, 300, 210, 60);
	Color eliminarcolor = new Color(234, 214, 255  );
	eliminar.setBackground(eliminarcolor);
	eliminar.setActionCommand("eliminar");
	getContentPane().add(eliminar);
	
	ver = new JButton("Ver todo");
	ver.setFont(new Font("Times New Roman", Font.BOLD, 15));
	ver.setBounds(255, 300, 210, 60);
	Color vercolor = new Color(255, 214, 254  );
	ver.setBackground(vercolor);
	ver.setActionCommand("ver");
	getContentPane().add(ver);
	
	ver_uno = new JButton("Ver uno");
	ver_uno.setFont(new Font("Times New Roman", Font.BOLD, 15));
	ver_uno.setBounds(20, 380, 210, 60);
	ver_uno.setActionCommand("ver_uno");
	getContentPane().add(ver_uno);
	ver_uno.setBackground(Color.lightGray);
	
	editar = new JButton("Editar");
	editar.setFont(new Font("Times New Roman", Font.BOLD, 15));
	editar.setBounds(255, 380, 210, 60);
	Color editarcolor = new Color(255, 243, 164  );
	editar.setBackground(editarcolor);
	editar.setActionCommand("editar");
	getContentPane().add(editar);
	
	nombre = new JTextField();
	nombre.setBounds(210, 40, 200, 30);
	getContentPane().add(nombre);
	nombre.setColumns(10);
	nombre.setBackground(Color.white);

	apellido = new JTextField();
	apellido.setColumns(10);
	apellido.setBounds(210, 85, 200, 30);
	getContentPane().add(apellido);
	apellido.setBackground(Color.white);

	edad = new JTextField();
	edad.setColumns(10);
	edad.setBounds(210, 134, 200, 30);
	getContentPane().add(edad);
	edad.setBackground(Color.white);

	cedula = new JTextField();
	cedula.setColumns(10);
	cedula.setBounds(210, 178, 200, 30);
	getContentPane().add(cedula);
	cedula.setBackground(Color.white);

	cargo = new JTextField();
	cargo.setColumns(10);
	cargo.setBounds(210, 220, 200, 30);
	getContentPane().add(cargo);
	cargo.setBackground(Color.white);
	
	JLabel texto1 = new JLabel("Nombre:");
	texto1.setBounds(50, 40, 200, 20);
	getContentPane().add(texto1);

	JLabel texto2 = new JLabel("Apellido:");
	texto2.setBounds(50, 85, 200, 20);
	getContentPane().add(texto2);

	JLabel texto3 = new JLabel("Edad:");
	texto3.setBounds(50, 134, 225, 20);
	getContentPane().add(texto3);

	JLabel texto4 = new JLabel("Cedula:");
	texto4.setBounds(50, 178, 250, 20);
	getContentPane().add(texto4);

	JLabel texto5 = new JLabel("Cargo:");
	texto5.setBounds(50, 220, 225, 30);
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
