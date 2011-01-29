package edu.upc.cartelerag6.cartelerag6;

public class UsuarioRepository {

	public void grabarUsuario(Usuario u1) {
		u1.setId((new Integer("0")));
		System.out.println("Grabar usuario" + u1.getNombre()  + 
				"con ID" + u1.getId());
	
	}

}
