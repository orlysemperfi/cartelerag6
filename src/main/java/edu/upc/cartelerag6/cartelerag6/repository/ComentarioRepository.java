package edu.upc.cartelerag6.cartelerag6.repository;

import java.util.ArrayList;
import edu.upc.cartelerag6.cartelerag6.model.Comentario;

public interface ComentarioRepository {
	public Comentario registrarComentario(Integer idComentario, Integer idPelicula, String comentario, String estado, String fechaCreacion);
	public void actualizarEstado(Integer idComentario, String estado);
	public ArrayList<Comentario> listarComentarios();
	public Comentario listarComentario(Integer idComentario);
	public void eliminarComentario(Integer idComentario);	
}
