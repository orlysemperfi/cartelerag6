package edu.upc.cartelerag6.cartelerag6.repository;
import java.util.ArrayList;
import edu.upc.cartelerag6.cartelerag6.model.Pelicula;

public class PeliculaRepository {

	private ArrayList<Pelicula> peliculas;
	
	public PeliculaRepository() {
		peliculas = new ArrayList<Pelicula>();
	}
	
	
	public Integer registrarPelicula(String nombrePelicula, String anioProduccion, String genero, Integer flagComentario) {
		return 0;
	}
	
	public void actualizarPelicula(Integer IdPelicula, String nombrePelicula, String anioProduccion, String genero, Integer flagComentario) {

	}

	public void eliminarPelicula(Integer idPelicula) {
		
	}

	public ArrayList<Pelicula> listarPeliculas() {
		return peliculas;
	}
	
	public Pelicula listarPelicula(Integer idPelicula) {
		return null;
	}
	
}