package edu.upc.cartelerag6.cartelerag6.model;

import java.util.Date;

public class Solicitud {
	private Integer idSolicitud;
	private Integer idUsario;
	private Date    fechaSolicitud;
	private Date    fechaEntrega;
	private String  productos;
	private String  estadoSolicitud;


	public void setIdSolicitud(Integer valor) {
		this.idSolicitud = valor;
	}
	
	public Integer getIdSolicitud() {
		return this.idSolicitud;
	}
	
	public void setIdUsario(Integer valor) {
		this.idUsario = valor;
	}
	
	public Integer getIdUsario() {
		return this.idUsario;
	}

	public void setFechaSolicitud(Date valor) {
		this.fechaSolicitud = valor;
	}
	
	public Date getFechaSolicitud() {
		return this.fechaSolicitud;
	}

	public void setFechaEntrega(Date valor) {
		this.fechaEntrega = valor;
	}
	
	public Date getFechaEntrega() {
		return this.fechaEntrega;
	}


	public void setProductos(String valor) {
		this.productos = valor;
	}
	
	public String getProductos() {
		return this.productos;
	}


	public void setEstadoSolicitud(String valor) {
		this.estadoSolicitud = valor;
	}
	
	public String getEstadoSolicitud() {
		return this.estadoSolicitud;
	}

	public Solicitud(Integer idSolicitud, Integer idUsario, Date fechaSolicitud, Date fechaEntrega, String productos, String estadoSolicitud){
		
		this.idSolicitud = idSolicitud;
		this.idUsario = idUsario;
		this.fechaSolicitud = fechaSolicitud;
		this.fechaEntrega = fechaEntrega;
		this.productos = productos;
		this.estadoSolicitud = estadoSolicitud;
	}
}
