package edu.upc.cartelerag6.cartelerag6.service;

import java.util.List;
import edu.upc.cartelerag6.cartelerag6.model.Pelicula;


public interface PeliculaService {
	
	List<Pelicula> MostrarDetallePeliculaActiva(Integer idPelicula);
	List<Pelicula> MostrarDetallePeliculaInactiva(Integer idPelicula);
	List<Pelicula> obtenerTodasPeliculas();
	List<Pelicula> obtenerTodasPeliculasPorNombre(String nombre, String genero);
	boolean registarPelicula(String nomPelicula,
			String anioProduccion, String duracion, String paisOrigen,
			String genero, String tipoEmision, String flagSubtitulo,
			int flagComentario, String publicoObjetivo, String sinopsis,
			java.sql.Date fecIniCartelera, java.sql.Date fecFinCartelera, String estado,
			String poster, String trailer);

}
