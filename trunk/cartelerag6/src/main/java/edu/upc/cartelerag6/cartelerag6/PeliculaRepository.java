package edu.upc.cartelerag6.cartelerag6;

public class PeliculaRepository {

	private ArrayList<Pelicula> peliculas;
	
	public PeliculaRepository() {
		peliculas = new ArrayList<Pelicula>();
	}
	
	
	public String registrarPelicula(String nombrePelicula, String anioProduccion, String genero, Integer flagComentario) {

	}
	
	public void actualizarPelicula(String IdPelicula, String nombrePelicula, String anioProduccion, String genero, Integer flagComentario) {

	}

	public void eliminarPelicula(String idPelicula) {
		
	}

	public ArrayList<Pelicula> listarPeliculas() {
		return peliculas;
	}
	
	public Pelicula listarPelicula(String idPelicula) {
		
	}
	
}
