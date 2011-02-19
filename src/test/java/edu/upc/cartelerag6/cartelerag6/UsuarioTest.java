package edu.upc.cartelerag6.cartelerag6;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import stub.StubUsuarioRepository;

import edu.upc.cartelerag6.cartelerag6.model.Usuario;
//import edu.upc.cartelerag6.cartelerag6.repository.SugerenciaRepository;
import edu.upc.cartelerag6.cartelerag6.repository.UsuarioRepository;
//import edu.upc.cartelerag6.cartelerag6.stub.StubSugerenciaRepository;
//import edu.upc.cartelerag6.cartelerag6.stub.StubUsuarioRepository;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations={
				"classpath:test-infrastructure-config.xml",
				"classpath:application-config.xml"})
public class UsuarioTest {
	
	//@Autowired
	private Usuario usuario;

	
	@Test
	public void testUsuario() {
		UsuarioRepository usuario = new StubUsuarioRepository();
		
		assertNotNull(usuario.encontrarUsuario("dbecerradi"));
		/*
		assertEquals("false", usuario.validacionUsuario("dbecerradi"));
		assertNotNull(usuario.registrarUsuario("grocachung","guiuliana","activo","guiuliana","roca","02/02/2012","Tgestiona","analista","telefono","groca@tp.com","3454555555"));
		assertNotNull(usuario.encontrarUsuario("dbecerradi"));
		assertEquals("true", usuario.longUsuario("dbecerradi"));
		assertEquals("true", usuario.asignacionContraseña("dbecerradi"));
		assertEquals("true", usuario.bloqueoUsuario("dbecerradi"));
		*/
	}

	
}
