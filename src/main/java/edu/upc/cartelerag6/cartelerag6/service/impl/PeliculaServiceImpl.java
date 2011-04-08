package edu.upc.cartelerag6.cartelerag6.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.upc.cartelerag6.cartelerag6.model.Pelicula;
import edu.upc.cartelerag6.cartelerag6.repository.PeliculaRepository;
import edu.upc.cartelerag6.cartelerag6.service.PeliculaService;
import java.util.List;

@Service
public class PeliculaServiceImpl implements PeliculaService {

	@Autowired
	private PeliculaRepository repository;
	
	public List<Pelicula> obtenerTodasPeliculas() {		
		return repository.obtenerTodasPeliculas();
	}
	
	public List<Pelicula> MostrarDetallePeliculaActiva(Integer idPelicula) {		
		return repository.MostrarDetallePeliculaActiva(idPelicula);
	}

	public List<Pelicula> MostrarDetallePeliculaInactiva(Integer idPelicula) {		
		return repository.MostrarDetallePeliculaInactiva(idPelicula);
	}

}
