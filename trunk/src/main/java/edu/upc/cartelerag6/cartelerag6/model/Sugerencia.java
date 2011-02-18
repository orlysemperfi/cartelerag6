package edu.upc.cartelerag6.cartelerag6.model;



public class Sugerencia {
	
	private Integer idSugerencia;
	
	private String descripcion;
	private String estado; //Habilitado - Deshabilitado
	private String fecha_registro;
	private String fecha_atencion;
	private String flag_atencion; //Atendido - Desatendido
	
	
	
	public Integer getIdSugerencia() {
		return idSugerencia;
	}
	public void setIdSugerencia(Integer idSugerencia) {
		this.idSugerencia = idSugerencia;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public String getFecha_atencion() {
		return fecha_atencion;
	}
	public void setFecha_atencion(String fecha_atencion) {
		this.fecha_atencion = fecha_atencion;
	}
	public String getFlag_atencion() {
		return flag_atencion;
	}
	public void setFlag_atencion(String flag_atencion) {
		this.flag_atencion = flag_atencion;
	}
	



}
