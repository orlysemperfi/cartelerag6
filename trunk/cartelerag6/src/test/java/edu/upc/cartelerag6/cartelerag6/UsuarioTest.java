package edu.upc.cartelerag6.cartelerag6;

import junit.framework.TestCase;

import org.junit.Test;

import edu.upc.cartelerag6.cartelerag6.model.Usuario;
import edu.upc.cartelerag6.cartelerag6.repository.StubSugerenciaRepository;
import edu.upc.cartelerag6.cartelerag6.repository.StubUsuarioRepository;
import edu.upc.cartelerag6.cartelerag6.repository.SugerenciaRepository;
import edu.upc.cartelerag6.cartelerag6.repository.UsuarioRepository;
import edu.upc.cartelerag6.cartelerag6.repository.UsuarioRepositoryI;
import static org.junit.Assert.*;


public class UsuarioTest extends TestCase {
	
	
	@Test
	public void testUsuario() {
		UsuarioRepositoryI usuario = new StubUsuarioRepository();
		assertNotNull(usuario.encontrarUsuario("dbecerradi"));
		assertEquals("true", usuario.validacionUsuario("dbecerradi"));
		assertNotNull(usuario.registrarUsuario("grocachung","guiuliana","activo","guiuliana","roca","02/02/2012","Tgestiona","analista","telefono","groca@tp.com","3454555555"));
		assertNotNull(usuario.encontrarUsuario("dbecerradi"));
		assertEquals("true", usuario.longUsuario("dbecerradi"));
		assertEquals("true", usuario.asignacionContraseña("dbecerradi"));
		assertEquals("true", usuario.bloqueoUsuario("dbecerradi"));
	}

	
}
