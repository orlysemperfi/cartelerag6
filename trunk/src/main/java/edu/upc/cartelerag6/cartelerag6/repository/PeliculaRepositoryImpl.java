package edu.upc.cartelerag6.cartelerag6.repository;

import java.util.ArrayList;

import edu.upc.cartelerag6.cartelerag6.dao.Pelicula;

public class PeliculaRepositoryImpl
	implements PeliculaRepository{
	private ArrayList<Pelicula> peliculas;

	public void registrarPelicula(Integer idPelicula, String nombrePelicula,	String anioProduccion, String genero, Integer flagComentario, Integer flagTrailer, String urlTrailer) {
		if (listarPelicula(idPelicula) == null) {
			Pelicula nuevaPelicula = new Pelicula(idPelicula, nombrePelicula, anioProduccion, genero, flagComentario, flagTrailer, urlTrailer);
			peliculas.add(nuevaPelicula);
		}
		else{
			throw new RuntimeException("Pelicula ya registrada");
		}
	}

	public void actualizarPelicula(Integer idPelicula, String nombrePelicula,
			String anioProduccion, String genero, Integer flagComentario,
			Integer flagTrailer, String urlTrailer) {
		Pelicula pelicula = listarPelicula(idPelicula);
		if (pelicula != null) {
			pelicula.setNombre(nombrePelicula);
			pelicula.setAnioProduccion(anioProduccion);
			pelicula.setGenero(genero);
			pelicula.setFlagComentario(flagComentario);
			pelicula.setFlagTrailer(flagTrailer);
			pelicula.setUrlTriler(urlTrailer);
		}
		else{
			throw new RuntimeException("Código de pelicula no existe.");
		}
	}
	
	public PeliculaRepositoryImpl() {
		peliculas = new ArrayList<Pelicula>();
	}
	

	public void eliminarPelicula(Integer idPelicula) {
		Pelicula pelicula = listarPelicula(idPelicula);
		if (pelicula != null) {
			peliculas.remove(pelicula);
		}		
	}

	public ArrayList<Pelicula> listarPeliculas() {
		return peliculas;
	}
	
	public Pelicula listarPelicula(Integer idPelicula) {
		for (Pelicula pelicula: peliculas) {
			if ((pelicula.getId().equals(idPelicula))) {
				return pelicula;
			}
		}
		return null;
	}

	public void actualizarFlagComentario(Integer idPelicula, Integer flagComentario) {
		Pelicula pelicula = listarPelicula(idPelicula);
		if (pelicula != null) {
			pelicula.setFlagComentario(flagComentario);
		}
	}

}
