/*
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Iterator;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import edu.upc.cartelerag6.cartelerag6.model.Sugerencia;
import edu.upc.cartelerag6.cartelerag6.model.Usuario;
import edu.upc.cartelerag6.cartelerag6.repository.SugerenciaRepository;
import edu.upc.cartelerag6.cartelerag6.stub.StubSugerenciaRepository;


	public class SugerenciaTest extends TestCase{
	
	protected void setUp() throws Exception {
		// create stubs to facilitate fast in-memory testing with dummy data and no external dependencies
		//La interfase se transforma en clase.
		SugerenciaRepository sugerencia = new StubSugerenciaRepository();
		
	}
	
	public void testSugerencia() {
		SugerenciaRepository sugerencia = new StubSugerenciaRepository();
		assertNotNull(sugerencia.encontrarSugerencia("001"));
		assertNotNull(sugerencia.registrarSugerencia("002","zzz","halitado", "08/02/2011","08/02/2011", "pendiente"));
		assertNotNull(sugerencia.deshabilitar("001"));
		ArrayList listaPemdientes = sugerencia.validacionAlertas();
		
		for (int i = 0; i < listaPemdientes.size(); i++) {
			assertNotNull(listaPemdientes.get(i));
		}

		
	}
	
	
	
		
}
*/
package edu.upc.cartelerag6.cartelerag6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import edu.upc.cartelerag6.cartelerag6.model.Sugerencia;
import edu.upc.cartelerag6.cartelerag6.repository.SugerenciaRepository;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations={
				"classpath:test-infrastructure-config.xml",
				"classpath:application-config.xml"})
public class SugerenciaTest {
	
	@Autowired
	private SugerenciaRepository sugerenciaRepository;

	
	@Test
	public void testRegistroSugerencia() {
		Sugerencia s1;
		s1 = sugerenciaRepository.registrarSugerencia("Sugerencia de prueba", "Habilitado", "01/01/2011", "01/01/2011", "Desatendido");
		assertNotNull(s1);
		assertEquals("Sugerencia de prueba", s1.getDescripcion());
	}
	
	@Test
	public void testDeshabilitarSugerencia() {
		boolean Rpta;
		Rpta = false;
		Rpta = sugerenciaRepository.deshabilitarSugerencia(1);
		assertEquals(true,Rpta);
	}
}
