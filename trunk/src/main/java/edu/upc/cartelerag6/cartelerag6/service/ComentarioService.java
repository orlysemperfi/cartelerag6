package edu.upc.cartelerag6.cartelerag6.service;

import java.sql.Date;
import java.util.ArrayList;

import edu.upc.cartelerag6.cartelerag6.model.Comentario;

public interface ComentarioService {
	public Comentario registrarComentario(Integer idComentario, Integer idPelicula, String txComentario, String estado, Date fechaCreacion);
	public Boolean actualizarEstado(Integer idComentario, Integer idPelicula, String estado);
	public ArrayList<Comentario> listarComentarios(Integer idPelicula, String estado);
	public Comentario listarComentario(Integer idComentario, Integer idPelicula);
	public Boolean eliminarComentario(Integer idComentario, Integer idPelicula);	
}
