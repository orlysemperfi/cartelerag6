package edu.upc.cartelerag6.cartelerag6;

import org.junit.Test;

import edu.upc.cartelerag6.cartelerag6.repository.ComentarioRepository;
import static org.junit.Assert.*;


public class ComentarioTest {
	ComentarioRepository comentarioRepository = new ComentarioRepository();
	
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
		comentarioRepository.registrarComentario( 1, "Test de comentario");
		comentarioRepository.registrarComentario( 2, "Test de comentario 2");
		comentarioRepository.registrarComentario( 3, "Test de comentario 3");
		comentarioRepository.registrarComentario( 4, "Test de comentario 4");
		assertEquals(4, comentarioRepository.listarComentarios().size());
		try {
			comentarioRepository.registrarComentario( 2, "Test de comentario 2");	
		}
		catch(Exception ex){
			assertEquals("Código ya registrado", ex.getMessage());
		}
	}
	
	@Test
	public void EliminarComentario() {
		comentarioRepository.eliminarComentario(2);
		//System.out.println(comentarioRepository.listarComentarios().size());
		assertEquals(3, comentarioRepository.listarComentarios().size());
	}
	
	@Test
	public void ActualizarEstado() {
		comentarioRepository.actualizarEstado(3, "Rechazado");
		//System.out.println("estado: " + comentarioRepository.listarComentario(2).getEstado());
		assertEquals("Rechazado", comentarioRepository.listarComentario(3).getEstado());
	}
}
