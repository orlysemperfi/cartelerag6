package edu.upc.cartelerag6.cartelerag6.model;

/**
 * @author guiuliana
 *
 */
public class OrdenEnvio {
	
	private Integer numOrden;
	private Integer idVenta;
	private Integer idUsuario;
	private String dirEnvio;
	private String dirReferencia;
	private String observaciones;
	public Integer getNumOrden() {
		return numOrden;
	}
	public void setNumOrden(Integer numOrden) {
		this.numOrden = numOrden;
	}
	public Integer getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getDirEnvio() {
		return dirEnvio;
	}
	public void setDirEnvio(String dirEnvio) {
		this.dirEnvio = dirEnvio;
	}
	public String getDirReferencia() {
		return dirReferencia;
	}
	public void setDirReferencia(String dirReferencia) {
		this.dirReferencia = dirReferencia;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
}
