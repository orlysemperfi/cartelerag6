package edu.upc.cartelerag6.cartelerag6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import edu.upc.cartelerag6.cartelerag6.model.Pelicula;
import edu.upc.cartelerag6.cartelerag6.repository.PeliculaRepository;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations={
				"classpath:test-infrastructure-config.xml",
				"classpath:application-config.xml"})
public class PeliculaTest {
	
	@Autowired
	private PeliculaRepository peliculaRepository;

	
	@Test
	public void testPeliculaActiva() {
		Pelicula p1;
		p1 = peliculaRepository.MostrarDetallePeliculaActiva(1);
		assertNotNull(p1.getIdPelicula());
		assertEquals(1, p1.getIdPelicula());
		assertEquals("Activo", p1.getEstado());
	}
	
	@Test
	public void MostrarDetallePeliculaInactiva() {
		Pelicula p1;
		p1 = peliculaRepository.MostrarDetallePeliculaActiva(2);
		assertNotNull(p1.getIdPelicula());
		assertEquals(2, p1.getIdPelicula());
		assertEquals("Inactivo", p1.getEstado());
	}
}
