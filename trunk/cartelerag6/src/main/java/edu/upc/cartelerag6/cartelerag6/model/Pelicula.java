package edu.upc.cartelerag6.cartelerag6.model;

public class Pelicula {
	private Integer id;
	private String nombre;
	private String anioProduccion;
	private String genero;
	private Integer flagComentario;		// 1 permitido	- 0 no permitido
	private Integer flagTrailer;
	private String urlTriler;			
	
	//Id
	public void setId(Integer valor) {
		this.id = valor;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	//Nombre
	public void setNombre(String valor) {
		this.nombre = valor;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	//Año de producción
	public void setAnioProduccion(String valor) {
		this.anioProduccion = valor;
	}
	
	public String getAnioProduccion() {
		return this.anioProduccion;
	}
	
	//Genero
	public void setGenero(String valor) {
		this.genero = valor;
	}
	
	public String getGenero() {
		return this.genero;
	}

	//Flag Comentario
	public void setFlagComentario(Integer valor) {
		this.flagComentario = valor;
	}
	
	public Integer getFlagComentario() {
		return this.flagComentario;
	}

	//Flag Trailer
	public void setFlagTrailer(Integer flagTrailer) {
		this.flagTrailer = flagTrailer;
	}

	public Integer getFlagTrailer() {
		return flagTrailer;
	}

	//Url Trailer a visualizar
	public void setUrlTriler(String urlTriler) {
		this.urlTriler = urlTriler;
	}

	public String getUrlTriler() {
		return urlTriler;
	}
	
	public Pelicula(Integer id, String nombre, String anioProduccion, String genero, Integer flagComentario, Integer flagTrailer, String urlTrailer) {
		this.id = id;
		this.nombre = nombre;
		this.anioProduccion = anioProduccion;
		this.genero = genero;
		this.flagComentario = flagComentario;
		this.flagTrailer = flagTrailer;
		this.urlTriler = urlTrailer;		
	}
}
