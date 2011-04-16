package edu.upc.cartelerag6.cartelerag6.service;

import java.sql.Date;

import edu.upc.cartelerag6.cartelerag6.model.Usuario;

public interface UsuarioService {
	
	Usuario validacionUsuario(Integer idUsuario, String password);
	boolean registrarUsuario(String login,
			String password, String estado, String nombre, String apellido, String puesto, 
			Date fec_Creacion, Date fec_Caducidad,
			String telefono, String email, String dni, String tipo);

}
