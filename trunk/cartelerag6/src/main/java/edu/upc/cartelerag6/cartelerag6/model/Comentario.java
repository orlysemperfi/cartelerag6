package edu.upc.cartelerag6.cartelerag6.model;

public class Comentario {
	private Integer idPelicula;
	private Integer idUsuario;
	private Integer idComentario;
	private String comentario;
	private String estado;			// Pendiente - Rechazado - Publicado
	
	//Id Pelicula
	public void setIdPelicula(Integer valor) {
		this.idPelicula = valor;
	}
	
	public Integer getIdPelicula() {
		return this.idPelicula;
	}

	//Id Usuario
	public void setIdUsuario(Integer valor) {
		this.idUsuario = valor;
	}
	
	public Integer getIdUsuario() {
		return this.idUsuario;
	}
	
	//Id Comentario
	public void setIdComentario(Integer valor) {
		this.idComentario = valor;
	}
	
	public Integer getIdComentario() {
		return this.idComentario;
	}

	//Comentario
	public void setComentario(String valor) {
		this.comentario = valor;
	}
	
	public String getComentario() {
		return this.comentario;
	}	
	
	//Estado
	public void setEstado(String valor) {
		this.estado = valor;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public Comentario(Integer idPelicula, Integer idUsuario, Integer idComentario, String comentario){
		this.idPelicula = idPelicula;
		this.idUsuario=  idUsuario;
		this.idComentario =  idComentario;
		this.comentario =  comentario;
		this.estado = "Pendiente";	
	}
}
