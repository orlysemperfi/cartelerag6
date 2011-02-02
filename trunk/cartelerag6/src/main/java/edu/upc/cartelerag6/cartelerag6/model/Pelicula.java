package edu.upc.cartelerag6.cartelerag6.model;

public class Pelicula {
	private String id;
	private String nombre;
	private String anioProduccion;
	private String genero;
	
	//Id
	public void setId(String valor) {
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
	
}
