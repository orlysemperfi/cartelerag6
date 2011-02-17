package edu.upc.cartelerag6.cartelerag6.model;

import java.util.Date;

import java.util.Date;

public class Pelicula {
	private Integer idPelicula;
	private String nomPelicula;
	private String anioProduccion;
	private String duracion;
	private String paisOrigen;
	private String genero;
	private String tipoEmision;
	private String flagSubtitulo;
	private Integer flagComentario;		// 1 permitido	- 0 no permitido
	private String publicoObjetivo;
	private String sinopsis;
	private Date fecIniCartelera;
	private Date fecFinCartelera;
	private String estado; //activo - inactivo
	private String poster;
	public Integer getIdPelicula() {
		return idPelicula;
	}
	public void setIdPelicula(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}
	public String getNomPelicula() {
		return nomPelicula;
	}
	public void setNomPelicula(String nomPelicula) {
		this.nomPelicula = nomPelicula;
	}
	public String getAnioProduccion() {
		return anioProduccion;
	}
	public void setAnioProduccion(String anioProduccion) {
		this.anioProduccion = anioProduccion;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTipoEmision() {
		return tipoEmision;
	}
	public void setTipoEmision(String tipoEmision) {
		this.tipoEmision = tipoEmision;
	}
	public String getFlagSubtitulo() {
		return flagSubtitulo;
	}
	public void setFlagSubtitulo(String flagSubtitulo) {
		this.flagSubtitulo = flagSubtitulo;
	}
	public Integer getFlagComentario() {
		return flagComentario;
	}
	public void setFlagComentario(Integer flagComentario) {
		this.flagComentario = flagComentario;
	}
	public String getTrailer() {
		return trailer;
	}
	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}
	public String getPublicoObjetivo() {
		return publicoObjetivo;
	}
	public void setPublicoObjetivo(String publicoObjetivo) {
		this.publicoObjetivo = publicoObjetivo;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public Date getFecIniCartelera() {
		return fecIniCartelera;
	}
	public void setFecIniCartelera(Date fecIniCartelera) {
		this.fecIniCartelera = fecIniCartelera;
	}
	public Date getFecFinCartelera() {
		return fecFinCartelera;
	}
	public void setFecFinCartelera(Date fecFinCartelera) {
		this.fecFinCartelera = fecFinCartelera;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	
	
	
	
}
