package edu.upc.cartelerag6.cartelerag6.model;

public class Usuario {
	private String nombre;
	private String login;
	private String password;
	private Integer id;
	private Integer flagComentario;
	
	public void setNombre(String string) {
		this.nombre = string;
	}

	public void setLogin(String string) {
		this.login = string;
		
	}

	public void setPassword(String string) {
		this.password  = string;
		
	}

	public Integer getId() {
		
		return this.id;
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
	
	public void setId(Integer integer) {
		this.id = integer;
		
	}

	public void setFlagComentario(Integer valor) {
		this.flagComentario = valor;
	}
	
	public Integer getFlagComentario() {
		return this.flagComentario;
	}
	
}
