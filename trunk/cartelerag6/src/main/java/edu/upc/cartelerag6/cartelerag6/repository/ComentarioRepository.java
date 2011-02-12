package edu.upc.cartelerag6.cartelerag6.repository;

import java.util.ArrayList;
import edu.upc.cartelerag6.cartelerag6.model.Comentario;

public interface ComentarioRepository {
	public void registrarComentario(Integer idComentario, String comentario);
	public void actualizarEstado(Integer idComentario, String estado);
	public ArrayList<Comentario> listarComentarios();
	public Comentario listarComentario(Integer idComentario);
	public void eliminarComentario(Integer idComentario);	
}
