package edu.upc.cartelerag6.cartelerag6.repository;




import java.sql.Date;

import edu.upc.cartelerag6.cartelerag6.model.Usuario;

public interface UsuarioRepository {
	
	//Se valida la existencia del usuario
	public boolean validacionUsuario(Integer idUsuario);
	//Registrar 
	public Usuario registrarUsuario(int idUsuario, String login, String password,String estado, String nombre, String apellido,
			String puesto, String fec_Creacion, String fec_Caducidad, String telefono, String email, String dni,String tipo);
	public boolean bloqueoUsuario(Integer idUsuario);
	public Usuario encontrarUsuario(Integer idUsuario);
	//Para el cambio de contraseña
	public boolean asignacionContraseña(Integer idUsuario, String password);
	
	
	
	

}
