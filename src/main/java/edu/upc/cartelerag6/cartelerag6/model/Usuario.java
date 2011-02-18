package edu.upc.cartelerag6.cartelerag6.model;

import java.util.Date;

public class Usuario {
	private Integer idUsuario;
	private String login;
	private String password;
	private String estado; //Activo - Suspendido - Bloqueado
	private String nombre;
	private String apellido;
	private String puesto;
	private Date fec_Creacion;
	private Date fec_Caducidad;
	private String telefono;
	private String email;
	private String dni;
	private String tipo;
	
	public Usuario(String login2, String password2, String estado2,
			String nombre2, String apellido2, String puesto2,
			java.sql.Date fec_Creacion2, java.sql.Date fec_Caducidad2,
			String telefono2, String email2, String dni2, String tipo2) {
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(int idUsuario) {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public Date getFec_Creacion() {
		return fec_Creacion;
	}
	public void setFec_Creacion(Date fec_Creacion) {
		this.fec_Creacion = fec_Creacion;
	}
	public Date getFec_Caducidad() {
		return fec_Caducidad;
	}
	public void setFec_Caducidad(Date fec_Caducidad) {
		this.fec_Caducidad = fec_Caducidad;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
		
	
	
}
