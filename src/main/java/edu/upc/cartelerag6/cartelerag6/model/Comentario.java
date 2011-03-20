package edu.upc.cartelerag6.cartelerag6.model;

import java.util.Date;

public class Comentario {
	private Integer idComentario;
	private Integer idPelicula;
	private String comentario;
	private String estado;			// Pendiente - Rechazado - Publicado
	private Date fechaRegistro;
	
	

	public Integer getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}

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
	
	//fecha Registro
	public void setFechaRegistro(Date valor) {
		this.fechaRegistro = valor;
	}
	
	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public Comentario(Integer idComentario, Integer idPelicula, String txComentario, String estado, Date fechaCreacion){
		this.idComentario =  idComentario;
		this.idPelicula = idPelicula;
		this.comentario =  txComentario;
		this.estado = estado;
		this.fechaRegistro = fechaCreacion;
		//Date d = new Date();
		//this.fechaRegistro = d; 
	}
}
