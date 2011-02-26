package edu.upc.cartelerag6.cartelerag6;

import java.sql.Date;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.upc.cartelerag6.cartelerag6.model.Perfil;
import edu.upc.cartelerag6.cartelerag6.model.Usuario;
import edu.upc.cartelerag6.cartelerag6.repository.PerfilRepository;
import edu.upc.cartelerag6.cartelerag6.repository.UsuarioRepository;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations={
				"classpath:test-infrastructure-config.xml",
				"classpath:application-config.xml"})

public class PerfilTest {

	@Autowired
	private PerfilRepository perfil;
	
	@Test
	public void testRegistrarPerfil() {
		Perfil p1 = perfil.registrarPerfil("1","Administrador", "A");
		assertNotNull(p1);
	}
	
	@Test
	public void testInactivarPerfil() {
		boolean inactivar = perfil.inactivarPerfil(1);
		assertTrue(inactivar);
	}
	
	@Test
	public void testObtenerPerfil() {
		Perfil p1 = perfil.obtenerPerfil(1);
		assertNotNull(p1);
	}
	
	@Test
	public void testAsignarPerfil_Usuario() {
		boolean asignarPerfil = perfil.asignarPerfil_Usuario(1,1);
		assertTrue(asignarPerfil);
	}
	
	@Test
	public void testInactivarPerfil_Usuario() {
		boolean inactivaPerfil_Usuario = perfil.inactivarPerfil_Usuario(1, 1);
		assertTrue(inactivaPerfil_Usuario);
	}
	
	
}
