package edu.upc.cartelerag6.cartelerag6.model;


import java.util.Date;

public class Horario {
	private Integer idHorario;
	private Integer idSala;
	private Integer idLocal;
	private Integer idPelicula;
	private Date hora;
	private Date fecha;
	private Integer asientosDisponibles;
	private String estado; //Activo - Inactivo
	
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Integer getIdHorario() {
		return idHorario;
	}
	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
	}
	public Integer getAsientosDisponibles() {
		return asientosDisponibles;
	}
	public void setAsientosDisponibles(Integer asientosDisponibles) {
		this.asientosDisponibles = asientosDisponibles;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public void setIdSala(Integer idSala) {
		this.idSala = idSala;
	}
	public Integer getIdSala() {
		return idSala;
	}
	public void setIdLocal(Integer idLocal) {
		this.idLocal = idLocal;
	}
	public Integer getIdLocal() {
		return idLocal;
	}
	public void setIdPelicula(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}
	public Integer getIdPelicula() {
		return idPelicula;
	}
	 
}
