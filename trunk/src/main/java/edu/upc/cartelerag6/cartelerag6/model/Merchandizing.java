package edu.upc.cartelerag6.cartelerag6.model;

import java.util.Date;

public class Merchandizing {
	private Integer idPelicula;
	private Integer idProducto;
	private Date    fecInicioVigencia;
	private Date    fecFinVigencia;
	private String  estadoMerchandizing;
	
	
	public void setIdPelicula(Integer valor) {
		this.idPelicula = valor;
	}
	
	public Integer getIdPelicula() {
		return this.idPelicula;
	}
	public void setIdProducto(Integer valor) {
		this.idProducto = valor;
	}
	
	public Integer getIdProducto() {
		return this.idProducto;
	}

	
	public void setFecInicioVigencia(Date valor) {
		this.fecInicioVigencia = valor;
	}
	
	public Date getFecInicioVigencia() {
		return this.fecInicioVigencia;
	}

	public void setFecFinVigencia(Date valor) {
		this.fecFinVigencia = valor;
	}
	
	public Date getFecFinVigencia() {
		return this.fecFinVigencia;
	}

	public void setEstadoMerchandizing(String valor) {
		this.estadoMerchandizing = valor;
	}
	
	public String getEstadoMerchandizing() {
		return this.estadoMerchandizing;
	}

	public Merchandizing(Integer idPelicula, Integer idProducto, Date fecInicioVigencia, Date fecFinVigencia, String estadoMerchandizing){
		this.idPelicula = idPelicula;
		this.idProducto = idProducto;
		this.fecInicioVigencia = fecInicioVigencia;
		this.fecFinVigencia = fecFinVigencia;
		this.estadoMerchandizing = estadoMerchandizing;
	}
}
