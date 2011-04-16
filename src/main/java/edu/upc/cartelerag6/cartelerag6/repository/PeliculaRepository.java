package edu.upc.cartelerag6.cartelerag6.repository;

import java.util.List;

import edu.upc.cartelerag6.cartelerag6.model.Pelicula;

public interface PeliculaRepository {
	
	public List<Pelicula> MostrarDetallePeliculaActiva(Integer idPelicula);
	public List<Pelicula> MostrarDetallePeliculaInactiva(Integer idPelicula);
	public List<Pelicula> obtenerTodasPeliculas();
	public List<Pelicula> obtenerTodasPeliculasPorNombre(String nombre, String genero);
	public boolean registarPelicula(String nomPelicula,
			String anioProduccion, String duracion, String paisOrigen,
			String genero, String tipoEmision, String flagSubtitulo,
			int flagComentario, String publicoObjetivo, String sinopsis,
			java.sql.Date fecIniCartelera, java.sql.Date fecFinCartelera, String estado,
			String poster, String trailer);

}
