package edu.upc.cartelerag6.cartelerag6.repository;
import java.util.ArrayList;
import edu.upc.cartelerag6.cartelerag6.model.Comentario;

public class ComentarioRepository {

	private ArrayList<Comentario> comentarios;
	
	public ComentarioRepository() {
		comentarios = new ArrayList<Comentario>();
	}
	
	public Integer registrarComentario(Integer idComentario, Integer idPelicula, Integer idUsuario, String comentario) {
		if (listarComentario(idPelicula, idComentario) == null) {
			Comentario nuevoComentario = new Comentario(idComentario, idPelicula, idUsuario, comentario);
			comentarios.add(nuevoComentario);
		}
		return 0;
	}

	public void actualizarEstado(Integer idPelicula, Integer idComentario, String estado) {
		Comentario comentario = listarComentario(idPelicula, idComentario);
		if (comentario != null) {
			comentario.setEstado(estado);
		}
	}
	
	public ArrayList<Comentario> listarComentarios() {
		return comentarios;
	}
	
	public Comentario listarComentario(Integer idPelicula , Integer idComentario) {
		for (Comentario comentario: comentarios) {
			if ((comentario.getIdPelicula().equals(idPelicula)) &&
					(comentario.getIdComentario().equals(idComentario))) {
				return comentario;
			}
		}
		return null;
	}	
}
