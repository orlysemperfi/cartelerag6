package edu.upc.cartelerag6.cartelerag6.model;

public class Comentario {
	private String idPelicula;
	private String idUsuario;
	private String comentario;
	private String estado;			// Pendiente - Rechazado - Publicado
	
	//Id Pelicula
	public void setIdPelicula(String valor) {
		this.idPelicula = valor;
	}
	
	public Integer getIdPelicula() {
		return this.idPelicula;
	}

	//Id Usuario
	public void setIdUsuario(String valor) {
		this.idUsuario = valor;
	}
	
	public Integer getIdUsuario() {
		return this.idUsuario;
	}
	
	//Comentario
	public void setComentario(String valor) {
		this.comentario = valor;
	}
	
	public Integer getComentario() {
		return this.comentario;
	}

	//Estado
	public void setEstado(String valor) {
		this.estado = valor;
	}
	
	public Integer getEstado() {
		return this.estado;
	}
	
}
