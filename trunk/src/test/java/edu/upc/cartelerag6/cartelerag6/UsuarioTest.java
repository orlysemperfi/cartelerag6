package edu.upc.cartelerag6.cartelerag6;



import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import edu.upc.cartelerag6.cartelerag6.model.Usuario;
import edu.upc.cartelerag6.cartelerag6.repository.UsuarioRepository;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations={
				"classpath:test-infrastructure-config.xml",
				"classpath:application-config.xml"})
public class UsuarioTest {
	
	@Autowired
	private UsuarioRepository usuario;

	
	@Test
	public void testEncontrarUsuario() {
		//UsuarioRepository usuario = UsuarioRepository;
		
		assertNotNull(usuario.encontrarUsuario(1));
	}

	@Test
	public void testRegistrarUsuario() {
		Usuario u1 = usuario.registrarUsuario("0", "10101010", "10101010", "A", "Julio", "Vargas", "Analista", Date.valueOf("2020-01-01"), Date.valueOf("2020-01-01"), "353453", "mail", "10101010", "I");
		assertNotNull(u1);
	}
	
	@Test
	public void testBloquearUsuario() {
		boolean bloqueo = usuario.bloqueoUsuario(1);
		assertTrue(bloqueo);
	}
	
	@Test
	public void testAsignacionContraseña() {
		boolean asignacion = usuario.asignacionContraseña(1, "password");
		assertTrue(asignacion);
	}
	
}
