package edu.upc.cartelerag6.cartelerag6.model;

public class Perfil {
	private Integer idPerfil;
	private String nombre;
	private Integer estado;
	
	//Id Perfil
	public void setIdPerfil(Integer valor) {
		this.idPerfil = valor;
	}
	
	public Integer getIdPerfil() {
		return this.idPerfil;
	}
	
	//Nombre Perfil
	public void setNombre(String valor) {
		this.nombre = valor;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	//Estado
	public void setEstado(Integer valor) {
		this.estado = valor;
	}
	
	public Integer getEstado() {
		return this.estado;
	}
	
	public Perfil(Integer idPerfil, String nombre, Integer estado) {
		this.idPerfil = idPerfil;
		this.nombre = nombre;
		this.estado = estado;
	}
}
