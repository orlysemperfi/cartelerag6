package edu.upc.cartelerag6.cartelerag6.model;

import java.io.Serializable;
import java.util.Date;

public class Pelicula implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7789783307702730765L;
	private int idPelicula;
	private String nomPelicula;
	private String anioProduccion;
	private String duracion;
	private String paisOrigen;
	private String genero;
	private String tipoEmision;
	private String flagSubtitulo;
	private int flagComentario;		// 1 permitido	- 0 no permitido
	private String publicoObjetivo;
	private String sinopsis;
	private Date fecIniCartelera;
	private Date fecFinCartelera;
	private String estado; //activo - inactivo
	private String poster;
	private String trailer;
	public int getIdPelicula() {
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
	public Pelicula(int idPelicula, String nomPelicula,
			String anioProduccion, String duracion, String paisOrigen,
			String genero, String tipoEmision, String flagSubtitulo,
			int flagComentario, String publicoObjetivo, String sinopsis,
			java.sql.Date fecIniCartelera, java.sql.Date fecFinCartelera, String estado,
			String poster, String trailer) {
		//super();
		this.idPelicula = idPelicula;
		this.nomPelicula = nomPelicula;
		this.anioProduccion = anioProduccion;
		this.duracion = duracion;
		this.paisOrigen = paisOrigen;
		this.genero = genero;
		this.tipoEmision = tipoEmision;
		this.flagSubtitulo = flagSubtitulo;
		this.flagComentario = flagComentario;
		this.publicoObjetivo = publicoObjetivo;
		this.sinopsis = sinopsis;
		this.fecIniCartelera = fecIniCartelera;
		this.fecFinCartelera = fecFinCartelera;
		this.estado = estado;
		this.poster = poster;
		this.trailer = trailer;
	}
	
	public Pelicula(int idPelicula, String nomPelicula,
			java.sql.Date fecIniCartelera, java.sql.Date fecFinCartelera, String estado,
			String poster) {
		//super();
		this.idPelicula = idPelicula;
		this.nomPelicula = nomPelicula;
		this.fecIniCartelera = fecIniCartelera;
		this.fecFinCartelera = fecFinCartelera;
		this.estado = estado;
		this.poster = poster;
	}

	@Override
	public String toString() {
		return "OfertaLaboral [idPelicula=" + idPelicula + ", nomPelicula=" + nomPelicula + ", genero="
				+ genero + ", fecIniCartelera=" + fecIniCartelera + "]";
	}
	
	
	
}
