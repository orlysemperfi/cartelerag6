package edu.upc.cartelerag6.cartelerag6.model;

public class Pelicula {
	private Integer id;
	private String nombre;
	private String anioProduccion;
	private String genero;
	private Intger flagComentario;		// 1 permitido	- 0 no permitido
	
	//Id
	public void setId(Integer valor) {
		this.id = valor;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	//Nombre
	public void setNombre(String valor) {
		this.id = valor;
	}
	
	public Integer getNombre() {
		return this.nombre;
	}

	//Año de producción
	public void setAnioProduccion(String valor) {
		this.anioProduccion = valor;
	}
	
	public Integer getAnioProduccion() {
		return this.anioProduccion;
	}
	
	//Genero
	public void setGenero(String valor) {
		this.genero = valor;
	}
	
	public Integer getNombre() {
		return this.nombre;
	}

	//Flag Comentario
	public void setFlagComentario(Integer valor) {
		this.flagComentario = valor;
	}
	
	public Integer getFlagComentario() {
		return this.flagComentario;
	}
}
