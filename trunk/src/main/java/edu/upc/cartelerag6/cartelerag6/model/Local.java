package edu.upc.cartelerag6.cartelerag6.model;

public class Local {
	
	private Integer idLocal;
	private String nomLocal;
	private String direccion;
	public Integer getIdLocal() {
		return idLocal;
	}
	public void setIdLocal(Integer idLocal) {
		this.idLocal = idLocal;
	}
	public String getNomLocal() {
		return nomLocal;
	}
	public void setNomLocal(String nomLocal) {
		this.nomLocal = nomLocal;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	private String estado;
}
