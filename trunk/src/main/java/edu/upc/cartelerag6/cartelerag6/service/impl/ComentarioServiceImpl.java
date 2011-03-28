package edu.upc.cartelerag6.cartelerag6.service.impl;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.upc.cartelerag6.cartelerag6.model.Comentario;
import edu.upc.cartelerag6.cartelerag6.repository.ComentarioRepository;
import edu.upc.cartelerag6.cartelerag6.service.ComentarioService;

@Service
public class ComentarioServiceImpl implements ComentarioService {
	
	@Autowired
	private ComentarioRepository repository;

	public Comentario registrarComentario(Integer idComentario,
			Integer idPelicula, String txComentario, String estado,
			Date fechaCreacion) {
		return repository.registrarComentario(idComentario, idPelicula, txComentario, estado, fechaCreacion);
	}

	public Boolean actualizarEstado(Integer idComentario, Integer idPelicula,
			String estado) {
		return repository.actualizarEstado(idComentario, idPelicula, estado);
	}

	public ArrayList<Comentario> listarComentarios(Integer idPelicula,
			String estado) {
		return repository.listarComentarios(idPelicula, estado);
	}

	public Comentario listarComentario(Integer idComentario, Integer idPelicula) {
		return repository.listarComentario(idComentario, idPelicula);
	}

	public Boolean eliminarComentario(Integer idComentario, Integer idPelicula) {
		return repository.eliminarComentario(idComentario, idPelicula);
	}

}
