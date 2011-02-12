package edu.upc.cartelerag6.cartelerag6;

import org.junit.Test;
import edu.upc.cartelerag6.cartelerag6.repository.ComentarioRepository;
import edu.upc.cartelerag6.cartelerag6.repository.ComentarioRepositoryImpl;
import static org.junit.Assert.*;


public class ComentarioTest {
	ComentarioRepository comentarioRepository = new ComentarioRepositoryImpl();
	
	@Test
	public void ComentarioSinRegistros() {
		assertEquals(0, comentarioRepository.listarComentarios().size());
	}

	@Test
	public void ComentarioConUnRegistro() {
		comentarioRepository.registrarComentario( 1, "Test de comentario");
		assertEquals(1, comentarioRepository.listarComentarios().size());
	}
	
	@Test
	public void ComentarioConVariosRegistros() {
		comentarioRepository.registrarComentario(1, "Test de comentario");
		comentarioRepository.registrarComentario(2, "Test de comentario 2");
		comentarioRepository.registrarComentario(3, "Test de comentario 3");
		comentarioRepository.registrarComentario(4, "Test de comentario 4");
		assertEquals(4, comentarioRepository.listarComentarios().size());
		try {
			comentarioRepository.registrarComentario(2, "Test de comentario 2");	
		}
		catch(Exception ex){
			assertEquals("Comentario ya registrado", ex.getMessage());
		}
	}
	
	@Test
	public void EliminarComentario() {
		comentarioRepository.registrarComentario(1, "Test de comentario");
		comentarioRepository.registrarComentario(2, "Test de comentario 2");
		comentarioRepository.registrarComentario(3, "Test de comentario 3");
		comentarioRepository.registrarComentario(4, "Test de comentario 4");
		
		comentarioRepository.eliminarComentario(2);
		assertEquals(3, comentarioRepository.listarComentarios().size());
	}
	
	@Test
	public void ActualizarEstado() {
		comentarioRepository.registrarComentario(1, "Test de comentario");
		comentarioRepository.registrarComentario(2, "Test de comentario 2");
		comentarioRepository.registrarComentario(3, "Test de comentario 3");
		comentarioRepository.actualizarEstado(3, "Rechazado");
		assertEquals("Rechazado", comentarioRepository.listarComentario(3).getEstado());
	}
}
