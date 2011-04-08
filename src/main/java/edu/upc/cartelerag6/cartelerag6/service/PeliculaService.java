package edu.upc.cartelerag6.cartelerag6.service;

import java.util.List;
import edu.upc.cartelerag6.cartelerag6.model.Pelicula;


public interface PeliculaService {
	
	List<Pelicula> MostrarDetallePeliculaActiva(Integer idPelicula);
	List<Pelicula> MostrarDetallePeliculaInactiva(Integer idPelicula);
	List<Pelicula> obtenerTodasPeliculas();


}
