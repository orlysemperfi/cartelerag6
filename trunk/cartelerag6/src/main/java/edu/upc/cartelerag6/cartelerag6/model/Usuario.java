package edu.upc.cartelerag6.cartelerag6.model;

import java.util.Date;

public class Usuario {
	private String idUsuario;
	private String login;
	private String password;
	private String estado; //Activo - Suspendido - Bloqueado
	private String nombre;
	private String apellido;
	private String fec_Caducidad;
	private String uni_Trabajo;
	private String puesto;
	private String telefono;
	private String email;
	private String dni;
	
	
	public Usuario(String idUsuario, String login, String password, String estado, String nombre, String apellido, String fec_Caducidad,
			String uni_Trabajo, String puesto, String telefono, String email, String dni) {
	  this.idUsuario = idUsuario;
	  this.login = login;
	  this.password = password;
	  this.estado = estado;
	  this.nombre = nombre;
	  this.apellido = apellido;
	  this.fec_Caducidad = fec_Caducidad;
	  this.uni_Trabajo = uni_Trabajo;
	  this.puesto = puesto;
	  this.telefono = telefono;
	  this.email = email;
	  this.dni = dni;
	}
	
	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFec_Caducidad() {
		return fec_Caducidad;
	}

	public void setFec_Caducidad(String fec_Caducidad) {
		this.fec_Caducidad = fec_Caducidad;
	}

	public String getUni_Trabajo() {
		return uni_Trabajo;
	}

	public void setUni_Trabajo(String uni_Trabajo) {
		this.uni_Trabajo = uni_Trabajo;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}	 
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setNombre(String string) {
		this.nombre = string;
	}

	public void setLogin(String string) {
		this.login = string;
		
	}

	public void setPassword(String string) {
		this.password  = string;
		
	}


	public String getNombre() {
		return this.nombre;
	}

	public String getPassword() {
		return this.password;
	}
	
	public String getLogin() {
		return this.login;
	}
	
	
	
}
