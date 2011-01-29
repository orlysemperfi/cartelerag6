package edu.upc.cartelerag6.cartelerag6.repository;

import edu.upc.cartelerag6.cartelerag6.model.Usuario;

public class UsuarioRepository {

	public void grabarUsuario(Usuario u1) {
		u1.setId(new Integer("0"));
		System.out.println("Se grabo usuario "
				+ u1.getNombre() + "con id "+
				u1.getId());	
		
	}

}
