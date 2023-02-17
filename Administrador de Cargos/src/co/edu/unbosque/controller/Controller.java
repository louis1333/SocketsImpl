package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.AspiranteDAOimpl;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.Ventanas_AD;

public class Controller implements ActionListener {
	private VentanaPrincipal vp;
	private Ventanas_AD adv;
	private AspiranteDAOimpl asp;
	
	public Controller() {
		vp = new VentanaPrincipal();
		asp = new AspiranteDAOimpl();
		adv = new Ventanas_AD();
		vp.setVisible(true);
		oyentes();
	}

	private void oyentes() {
		vp.getAgregar().addActionListener(this);
		vp.getEditar().addActionListener(this);
		vp.getEliminar().addActionListener(this);
		vp.getVer().addActionListener(this);
		vp.getVer_uno().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals("ver")) {
			vp.getLista().setText(asp.mostrarTodo());
		}
		if (comando.equals("agregar")) {
			if (verificar() == true) {
				String nombre = vp.getNombre().getText();
				String apellido = vp.getApellido().getText();
				String edadst = vp.getEdad().getText();
				String cedulast = vp.getCedula().getText();
				String cargo = vp.getCargo().getText();
				if (verificar_num(nombre) == true | (verificar_num(apellido) | (verificar_num(cargo)))) {
					adv.mostrarError("Revise que nombre, apellido y/o cargo no contegan ningun caracter numerico");
				} else {
					if (verificar_solonum(edadst)== true && verificar_solonum(cedulast)== true) {
						int edad = Integer.parseInt ((String)edadst);
						int cedula = Integer.parseInt ((String)cedulast);
						asp.crear(nombre, apellido, edad, cedula, cargo);
						adv.mostrarinfo("Usuario Agregado exitosamente");
						limpiar();
						
					}else {
						adv.mostrarError("Verficar que edad y cedula solo contengan caracteres numericos");
					}
					

				}
			}
		}
		if (comando.equals("ver_uno")) {
			if (vp.getCedula().getText().equals("")) {
				adv.mostrarError("Ingrese un numero de cedula");
			} else {
				int cedula = Integer.parseInt((String) vp.getCedula().getText());
				vp.getLista().setText(asp.mostrarUno(cedula));
				limpiar();
			}
		}
		if (comando.equals("eliminar")) {
			if (vp.getCedula().getText().equals("")) {
				adv.mostrarError("Ingrese un numero de cedula");
			} else {
				int cedula = Integer.parseInt((String) vp.getCedula().getText());
				adv.mostrarinfo(asp.eliminar(cedula));
				limpiar();
			}
		}
		if (comando.equals("editar")) {
			if (verificar() == true) {
				String nombre = vp.getNombre().getText();
				String apellido = vp.getApellido().getText();
				String edadst = vp.getEdad().getText();
				String cedulast = vp.getCedula().getText();
				String cargo = vp.getCargo().getText();
				if (verificar_num(nombre) == true | (verificar_num(apellido) | (verificar_num(cargo)))) {
					adv.mostrarError("Revise que nombre, apellido y/o cargo no contegan ningun caracter numerico");
				} else {
					if (verificar_solonum(edadst)== true && verificar_solonum(cedulast)== true) {
						int edad = Integer.parseInt ((String)edadst);
						int cedula = Integer.parseInt ((String)cedulast);
					adv.mostrarinfo(asp.actualizar(nombre, apellido, edad, cedula, cargo));
					limpiar();
				}else {
					adv.mostrarError("Verficar que edad y cedula solo contengan caracteres numericos");
				}
					}
			}
		}
	}

	public boolean verificar() {
		boolean confirmar = false;
		if (vp.getNombre().getText().equals("") | vp.getApellido().getText().equals("")
				| vp.getEdad().getText().equals("") | vp.getCedula().getText().equals("")
				| vp.getCargo().getText().equals("")) {
			confirmar = false;
		} else {
			confirmar = true;
		}
		if (confirmar == false) {
			adv.mostrarError("Digite todos los datos!");
		}
		return confirmar;

	}

	public void limpiar() {
		vp.getNombre().setText("");
		vp.getApellido().setText("");
		vp.getEdad().setText("");
		vp.getCedula().setText("");
		vp.getCargo().setText("");
	}

	public boolean verificar_num(String str) {
		return str.matches(".*\\d+.*");

	}
	
	public boolean verificar_solonum(String str) {
		return str.matches("^\\d+$");
	}
}
