package edu.upc.cartelerag6.cartelerag6;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.upc.cartelerag6.cartelerag6.repository.OrdenEnvioRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations={
				"classpath:test-infrastructure-config.xml",
				"classpath:application-config.xml"})
public class OrdenEnvioTest {
	@Autowired
	private OrdenEnvioRepository ordenEnvio;
	
	@Test
	public void ceroOrdenesEnvio() {
		assertEquals(0, ordenEnvio.obtenerOrdenesEnvio().size());
	}

	public void variasOrdenesEnvio() {
		int idVenta;
		int idUsuario;
		
		idVenta = 1; 
		idUsuario = 1;
		assertTrue(ordenEnvio.registrarOrdenEnvio(idVenta, idUsuario, "calle los eucaliptos 235", "altura cuadra 23 de javier prado", "..."));
		
		idVenta  =2; 
		idUsuario = 2;
		assertTrue(ordenEnvio.registrarOrdenEnvio(idVenta, idUsuario, "calle los sauces 235", "altura cuadra 30 de javier prado", "..."));
		
		idVenta = 3; 
		idUsuario = 3;
		assertTrue(ordenEnvio.registrarOrdenEnvio(idVenta, idUsuario, "calle las begonias 235", "altura cuadra 12 de javier prado", "..."));
		assertEquals(3, ordenEnvio.obtenerOrdenesEnvio().size());
	}
	
	@Test
	public void registrarOrdenEnvio() {
		assertTrue(ordenEnvio.registrarOrdenEnvio(1, 1, "calle los eucaliptos 235", "altura cuadra 23 de javier prado", "..."));
	}
}
