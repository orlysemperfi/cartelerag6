package edu.upc.cartelerag6.cartelerag6.repository;

import java.util.List;

import edu.upc.cartelerag6.cartelerag6.model.Pelicula;

public interface PeliculaRepository {
	
	public List<Pelicula> MostrarDetallePeliculaActiva(Integer idPelicula);
	public List<Pelicula> MostrarDetallePeliculaInactiva(Integer idPelicula);
	public List<Pelicula> obtenerTodasPeliculas();

}
