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

	public VentanaPrincipal() {
		setTitle("Aspirantes");
		setBounds(420, 70, 500, 500);
		setLayout(null);
		setResizable(false);
		Color ventanaColor = new Color(214, 255, 241);
		getContentPane().setBackground(ventanaColor);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		agregar = new JButton("Agregar");
		agregar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		agregar.setBounds(20, 340, 440, 60);
		agregar.setActionCommand("agregar");
		getContentPane().add(agregar);
		Color agergarcolor = new Color(220, 255, 184);
		agregar.setBackground(agergarcolor);

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

	public JButton getAgregar() {
		return agregar;
	}

	public void setAgregar(JButton agregar) {
		this.agregar = agregar;

	}
}
