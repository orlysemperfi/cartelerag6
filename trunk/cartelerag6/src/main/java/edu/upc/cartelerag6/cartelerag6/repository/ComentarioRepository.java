package edu.upc.cartelerag6.cartelerag6.repository;

public class ComentarioRepository {

	private ArrayList<Comentario> comentarios;
	
	public ComentarioRepository() {
		comentarios = new ArrayList<Comentario>();
	}
	
	public Integer registrarComentario(Integer idComentario, Integer idPelicula, Integer idUsuario, String comentario) {
		if (listarComentario(idPelicula, idComentario) == null) {
			String estado = "Pendiente";
			Comentario comentario = new Comentario(IdComentario, idPelicula, idUsuario, Comentario, estado)
			comentarios.add(comentario);
		}
		
	}

	public void actualizarEstado(Integer idComentario, String estado) {
		Comentario comentario = listarComentario(idPelicula, idComentario);
		if (comentario != null) {
			comentarios.setEstado(estado);
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
