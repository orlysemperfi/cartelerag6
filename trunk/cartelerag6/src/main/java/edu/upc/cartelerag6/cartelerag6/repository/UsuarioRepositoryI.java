package edu.upc.cartelerag6.cartelerag6.repository;

import java.util.ArrayList;

import edu.upc.cartelerag6.cartelerag6.model.Sugerencia;
import edu.upc.cartelerag6.cartelerag6.model.Usuario;

public interface UsuarioRepositoryI {
	
	public boolean longUsuario(String idUsuario);
	public boolean asignacionContraseña(String idUsuario);
	public boolean bloqueoUsuario(String idUsuario);
	public Usuario encontrarUsuario(String idUsuario);
	public boolean validacionUsuario(String idUsuario);
	public Usuario registrarUsuario(String idUsuario, String login, String estado, String nombre, String apellido, String fec_Caducidad,
			String uni_Trabajo, String puesto, String telefono, String email, String dni);

}
