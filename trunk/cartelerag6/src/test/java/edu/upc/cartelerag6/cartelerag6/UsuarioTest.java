package edu.upc.cartelerag6.cartelerag6;

import org.junit.Test;

import edu.upc.cartelerag6.cartelerag6.model.Usuario;
import edu.upc.cartelerag6.cartelerag6.repository.UsuarioRepository;
import static org.junit.Assert.*;


public class UsuarioTest {
	UsuarioRepository usuarioRepository
		= new UsuarioRepository();
	
	@Test
	public void crearUsuario(){
		Usuario u1 = new Usuario();
		u1.setNombre("Juan Perez");
		u1.setLogin("juan.perez@gmail.com");
		u1.setPassword("123");
		usuarioRepository.grabarUsuario(u1);		
		assertTrue(u1.getId()!=null);
	}
	
}
