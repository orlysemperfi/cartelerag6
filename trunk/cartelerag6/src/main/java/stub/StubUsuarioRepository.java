package edu.upc.cartelerag6.cartelerag6.stub;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import edu.upc.cartelerag6.cartelerag6.model.Sugerencia;
import edu.upc.cartelerag6.cartelerag6.model.Usuario;
import edu.upc.cartelerag6.cartelerag6.repository.UsuarioRepository;

public class StubUsuarioRepository implements UsuarioRepository{

	private Map<String, Usuario> usuario = new HashMap<String, Usuario>();
	
	public StubUsuarioRepository() {
	//	Usuario u = new Usuario("dbecerradi","daniel","dbecerradi","activo","Daniel","Becerra Dias","12/04/2020","Infocorp",
	//			"Administrador","44444444","dbecerrad@hotmail.com","12345678");
		
	//	usuario.put("dbecerradi", u);
		
	}
	
	//Se valida que el usuario no existe
	public boolean validacionUsuario(String idUsuario) {
		boolean flag = false;
		Usuario u = encontrarUsuario(idUsuario);
		
		if (u != null) {
			flag = true;
		}
		
		return flag;
	}
	
	//Registro de usuario
	public Usuario registrarUsuario(String idUsuario, String login,
			String estado, String nombre, String apellido,
			String fec_Caducidad, String uni_Trabajo, String puesto,
			String telefono, String email, String dni) {
		
		//Se valida si el usuario ya existe
		boolean existencia = validacionUsuario(idUsuario);
		   Usuario u = null;
		
		if (existencia == false) {
		//	u = new Usuario (idUsuario,login,"",estado,nombre,apellido,fec_Caducidad,uni_Trabajo,puesto,telefono,email,dni);
		//	usuario.put(idUsuario,u);
			
		}
		
		return u;
	}

	
	public Usuario encontrarUsuario(String idUsuario) {
		Usuario u = usuario.get(idUsuario);
		if (u == null) {
			System.out.println("No se encontró al usuario" + u.getIdUsuario());
		}
		return u;
	}
	
	public boolean longUsuario(String idUsuario) {
		Usuario u = usuario.get(idUsuario);
	//	String user = u.getIdUsuario();
		
	//	if (user.length()< 10) {
	//		return false;
	//	}
		
		return true;
	}

	public boolean asignacionContraseña(String idUsuario) {
		boolean cambioexitoso = false;
		Usuario u = encontrarUsuario(idUsuario);
		if (u != null) {
	//		u.setPassword(u.getIdUsuario());
			cambioexitoso = true;
		}
		return cambioexitoso;
	}

	public boolean bloqueoUsuario(String idUsuario) {
		boolean cambioexitoso = false;
		Usuario u = encontrarUsuario(idUsuario);
		if (u != null) {
			u.setEstado("bloqueado");
			cambioexitoso = true;
		}
		return cambioexitoso;
	}

	public boolean validacionUsuario(Integer idUsuario) {
		// TODO Auto-generated method stub
		return false;
	}

	public Usuario registrarUsuario(Integer idUsuario, String login,
			String password, String estado, String nombre, String apellido,
			String puesto, String fec_Creacion, String fec_Caducidad,
			String telefono, String email, String dni, String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean bloqueoUsuario(Integer idUsuario) {
		// TODO Auto-generated method stub
		return false;
	}

	public Usuario encontrarUsuario(Integer idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean asignacionContraseña(Integer idUsuario) {
		// TODO Auto-generated method stub
		return false;
	}

	public Usuario registrarUsuario(Integer idUsuario, String login,
			String password, String estado, String nombre, String apellido,
			String puesto, java.sql.Date fec_Creacion,
			java.sql.Date fec_Caducidad, String telefono, String email,
			String dni, String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario registrarUsuario(int idUsuario, String login,
			String password, String estado, String nombre, String apellido,
			String puesto, String fec_Creacion, String fec_Caducidad,
			String telefono, String email, String dni, String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean asignacionContraseña(Integer idUsuario, String password) {
		// TODO Auto-generated method stub
		return false;
	}


	
}
