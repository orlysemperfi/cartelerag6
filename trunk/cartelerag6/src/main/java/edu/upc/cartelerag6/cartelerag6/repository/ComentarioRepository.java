package edu.upc.cartelerag6.cartelerag6.repository;
import java.util.ArrayList;
import edu.upc.cartelerag6.cartelerag6.model.Comentario;

public class ComentarioRepository {

	private ArrayList<Comentario> comentarios;
	
	public ComentarioRepository() {
		comentarios = new ArrayList<Comentario>();
	}
	
	public void registrarComentario(Integer idComentario, String comentario) {
		if (listarComentario(idComentario) == null) {
			Comentario nuevoComentario = new Comentario(idComentario, comentario);
			comentarios.add(nuevoComentario);
		}
		else{
			throw new RuntimeException("Código ya registrado");
		}
	}

	public void actualizarEstado(Integer idComentario, String estado) {
		Comentario comentario = listarComentario(idComentario);
		if (comentario != null) {
			comentario.setEstado(estado);
		}
	}
	
	public ArrayList<Comentario> listarComentarios() {
		return comentarios;
	}
	
	public Comentario listarComentario(Integer idComentario) {
		for (Comentario comentario: comentarios) {
			if ((comentario.getIdComentario().equals(idComentario))) {
				return comentario;
			}
		}
		return null;
	}
	
	public void eliminarComentario(Integer idComentario) {
		Comentario comentario = listarComentario(idComentario);
		if (comentario != null) {
			comentarios.remove(comentario);
		}
	}	
}
