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
		/*
		assertEquals("false", usuario.validacionUsuario( "dbecerradi"));
		assertNotNull(usuario.registrarUsuario("grocachung","guiuliana","activo","guiuliana","roca","02/02/2012","Tgestiona","analista","telefono","groca@tp.com","3454555555"));
		assertNotNull(usuario.encontrarUsuario("dbecerradi"));
		assertEquals("true", usuario.longUsuario("dbecerradi"));
		assertEquals("true", usuario.asignacionContraseña("dbecerradi"));
		assertEquals("true", usuario.bloqueoUsuario("dbecerradi"));
		*/
	}

	@Test
	public void testRegistrarUsuario() {
		Usuario u1 = usuario.registrarUsuario("0", "10101010", "10101010", "A", "Julio", "Vargas", "Analista", Date.valueOf("2020-01-01"), Date.valueOf("2020-01-01"), "353453", "mail", "10101010", "I");
		assertNotNull(u1);
	}
	
}
