//package edu.upc.cartelerag6.cartelerag6.stub;
package stub;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import edu.upc.cartelerag6.cartelerag6.model.Sugerencia;
import edu.upc.cartelerag6.cartelerag6.model.Usuario;
import edu.upc.cartelerag6.cartelerag6.repository.UsuarioRepository;

public class StubUsuarioRepository implements UsuarioRepository{

	private Map<String, Usuario> usuario = new HashMap<String, Usuario>();
	

	//Se valida que el usuario no existe
	public boolean validacionUsuario(Integer idUsuario) {
		boolean flag = false;
		Usuario u = encontrarUsuario(idUsuario);
		
		if (u != null) {
			flag = true;
		}
		
		return flag;
	}
	
	public Usuario encontrarUsuario(Integer idUsuario) {
		Usuario u = usuario.get(idUsuario);
		if (u == null) {
			System.out.println("No se encontró al usuario" + u.getIdUsuario());
		}
		return u;
	}
	
	public boolean longUsuario(Integer idUsuario) {
		Usuario u = usuario.get(idUsuario);
	//	String user = u.getIdUsuario();
		
	//	if (user.length()< 10) {
	//		return false;
	//	}
		
		return true;
	}
/*
	public boolean asignacionContraseña(Integer idUsuario) {
		boolean cambioexitoso = false;
		Usuario u = encontrarUsuario(idUsuario);
		if (u != null) {
	//		u.setPassword(u.getIdUsuario());
			cambioexitoso = true;
		}
		return cambioexitoso;
	}
*/
	public boolean bloqueoUsuario(Integer idUsuario) {
		boolean cambioexitoso = false;
		Usuario u = encontrarUsuario(idUsuario);
		if (u != null) {
			u.setEstado("bloqueado");
			cambioexitoso = true;
		}
		return cambioexitoso;
	}

	public Usuario registrarUsuario(String idUsuario, String login,
			String password, String estado, String nombre, String apellido,
			String puesto, java.sql.Date fec_Creacion,
			java.sql.Date fec_Caducidad, String telefono, String email,
			String dni, String tipo) {
		//Se valida si el usuario ya existe
		boolean existencia = validacionUsuario(1);
		   Usuario u = null;
		
		if (existencia == false) {
		//	u = new Usuario (idUsuario,login,"",estado,nombre,apellido,fec_Caducidad,uni_Trabajo,puesto,telefono,email,dni);
		//	usuario.put(idUsuario,u);
			
		}
		
		return u;
		
	}

	public boolean asignacionContraseña(Integer idUsuario, String password) {
		// TODO Auto-generated method stub
		return false;
	}




	
}
