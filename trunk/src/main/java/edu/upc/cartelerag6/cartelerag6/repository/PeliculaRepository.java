package edu.upc.cartelerag6.cartelerag6.repository;

import edu.upc.cartelerag6.cartelerag6.model.Pelicula;

public interface PeliculaRepository {
	
	public Pelicula MostrarDetallePeliculaActiva(Integer idPelicula);
	public Pelicula MostrarDetallePeliculaInactiva(Integer idPelicula);
}
