package edu.upc.cartelerag6.cartelerag6;

import org.junit.Test;
import edu.upc.cartelerag6.cartelerag6.repository.PeliculaRepository;
import edu.upc.cartelerag6.cartelerag6.repository.PeliculaRepositoryImpl;
import static org.junit.Assert.*;


public class PeliculaTest {
	PeliculaRepository peliculaRepository = new PeliculaRepositoryImpl();
	
	@Test
	public void PeliculaSinRegistros() {
		assertEquals(0, peliculaRepository.listarPeliculas().size());
	}

	@Test
	public void PeliculaConUnRegistro() {
		peliculaRepository.registrarPelicula(1, "Terminator 3", "2003", "Accion", 1, 0, "");
		assertEquals(1, peliculaRepository.listarPeliculas().size());
	}
	
	@Test
	public void PeliculaConVariosRegistros() {
		peliculaRepository.registrarPelicula(1, "Terminator 3", "2003", "Accion", 1, 0, "");
		peliculaRepository.registrarPelicula(2, "Terminator 4", "2004", "Accion", 1, 0, "");
		peliculaRepository.registrarPelicula(3, "Terminator 5", "2005", "Accion", 1, 0, "");
		peliculaRepository.registrarPelicula(4, "Cronicas de Narnia", "2007", "Accion", 1, 0, "");
		assertEquals(4, peliculaRepository.listarPeliculas().size());
		try {
			peliculaRepository.registrarPelicula(2, "Terminator 4", "2004", "Accion", 1, 0, "");	
		}
		catch(Exception ex){
			assertEquals("Pelicula ya registrada", ex.getMessage());
		}
	}
	
	@Test
	public void EliminarPelicula() {
		peliculaRepository.registrarPelicula(1, "Terminator 3", "2003", "Accion", 1, 0, "");
		peliculaRepository.registrarPelicula(2, "Terminator 4", "2004", "Accion", 1, 0, "");
		peliculaRepository.registrarPelicula(3, "Terminator 5", "2005", "Accion", 1, 0, "");
		peliculaRepository.registrarPelicula(4, "Cronicas de Narnia", "2007", "Accion", 1, 0, "");
		
		peliculaRepository.eliminarPelicula(2);
		assertEquals(3, peliculaRepository.listarPeliculas().size());
	}
	
	@Test
	public void ActualizarFlagComentario() {
		peliculaRepository.registrarPelicula(1, "Terminator 3", "2003", "Accion", 1, 0, "");
		peliculaRepository.registrarPelicula(2, "Terminator 4", "2004", "Accion", 1, 0, "");
		peliculaRepository.registrarPelicula(3, "Terminator 5", "2005", "Accion", 1, 0, "");
		peliculaRepository.registrarPelicula(4, "Cronicas de Narnia", "2007", "Accion", 1, 0, "");
		
		peliculaRepository.actualizarFlagComentario(3, 0);
		
		assertEquals(Integer.valueOf(0), peliculaRepository.listarPelicula(3).getFlagComentario());
	}
}
