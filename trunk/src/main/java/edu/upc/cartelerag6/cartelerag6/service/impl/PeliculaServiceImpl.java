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

	public boolean registarPelicula(String nomPelicula,
			String anioProduccion, String duracion, String paisOrigen,
			String genero, String tipoEmision, String flagSubtitulo,
			int flagComentario, String publicoObjetivo, String sinopsis,
			java.sql.Date fecIniCartelera, java.sql.Date fecFinCartelera, String estado,
			String poster, String trailer) {
		
		return repository.registarPelicula(nomPelicula, anioProduccion, duracion, paisOrigen, genero, tipoEmision, flagSubtitulo, flagComentario, publicoObjetivo, sinopsis, fecIniCartelera, fecFinCartelera, estado, poster, trailer);
	}

	
	public List<Pelicula> MostrarDetallePeliculaActiva(Integer idPelicula) {		
		return repository.MostrarDetallePeliculaActiva(idPelicula);
	}

	public List<Pelicula> MostrarDetallePeliculaInactiva(Integer idPelicula) {		
		return repository.MostrarDetallePeliculaInactiva(idPelicula);
	}

	public List<Pelicula> obtenerTodasPeliculasPorNombre(String nombre, String genero){
		return repository.obtenerTodasPeliculasPorNombre(nombre, genero);
	}
}
