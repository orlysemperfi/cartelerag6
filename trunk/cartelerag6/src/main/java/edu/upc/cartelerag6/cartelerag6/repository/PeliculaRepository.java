package edu.upc.cartelerag6.cartelerag6.repository;
import java.util.ArrayList;
import edu.upc.cartelerag6.cartelerag6.model.Pelicula;

public interface PeliculaRepository {
	public void registrarPelicula(Integer idPelicula, String nombrePelicula, String anioProduccion, String genero, Integer flagComentario, Integer flagTrailer, String urlTrailer);
	public void actualizarPelicula(Integer idPelicula, String nombrePelicula, String anioProduccion, String genero, Integer flagComentario, Integer flagTrailer, String urlTrailer);
	public void eliminarPelicula(Integer idPelicula);
	public ArrayList<Pelicula> listarPeliculas();
	public Pelicula listarPelicula(Integer idPelicula);
	public void actualizarFlagComentario(Integer idPelicula, Integer flagComentario);
}
