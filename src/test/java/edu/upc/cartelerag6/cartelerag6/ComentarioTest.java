package edu.upc.cartelerag6.cartelerag6;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import edu.upc.cartelerag6.cartelerag6.repository.ComentarioRepository;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations={
				"classpath:test-infrastructure-config.xml",
				"classpath:application-config.xml"})
public class ComentarioTest {

	@Autowired
	private ComentarioRepository comentario;
	
	@Test
	public void sinComentarios(){
		assertEquals(0, comentario.listarComentarios(1, "Pendiente").size());
	}
	
	@Test
	public void registrarUnComentario() {
		comentario.registrarComentario(1, 1, "Test de comentario", "Pendiente", "01/01/2011");
		assertEquals(1, comentario.listarComentarios(1, "Pendiente").size());
	}
	
	@Test
	public void registrarVariosComentarios() {
		comentario.registrarComentario(1, 1, "Excelente pelicula.", "Pendiente", "01/01/2011");
		comentario.registrarComentario(2, 1, "Poco realismo, mucha ficción.", "Pendiente", "01/01/2011");
		comentario.registrarComentario(3, 1, "Buena, se las recomiendo.", "Pendiente", "01/01/2011");
		comentario.registrarComentario(4, 1, "Pobre, no me gusto!!!!", "Pendiente", "01/01/2011");
		comentario.registrarComentario(5, 1, "la mejor pelicula de la temporada.", "Pendiente", "01/01/2011");
		assertEquals(6, comentario.listarComentarios(1, "Pendiente").size());
	}
	
	@Test
	public void actualizarComentario() {
		comentario.registrarComentario(1, 1, "Test de comentario", "Pendiente", "01/01/2011");
		comentario.actualizarEstado(1, 1, "Rechazado");
		assertEquals("Rechazado", comentario.listarComentario(1, 1).getEstado());
		assertEquals("la mejor pelicula de la temporada.", comentario.listarComentario(6, 1).getComentario());
	}
	
	@Test
	public void eliminarComentario() {
		assertTrue(comentario.eliminarComentario(1, 1));
		assertNull(comentario.listarComentario(1, 1));
	}
	
}


