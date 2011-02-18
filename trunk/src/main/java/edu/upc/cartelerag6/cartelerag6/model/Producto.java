package edu.upc.cartelerag6.cartelerag6.model;

public class Producto {
	private Integer idProducto;
	private String  nomProducto;
	private String  descProducto;
	private Integer precioProducto;
	private Integer stockProducto;
	private String 	caracteristicasProducto;
	private String 	rutaImagenProducto;
	private String  estadoProducto;			
	
	public void setIdProducto(Integer valor) {
		this.idProducto = valor;
	}
	
	public Integer getIdProducto() {
		return this.idProducto;
	}
	
	public void setNomProducto(String valor) {
		this.nomProducto = valor;
	}
	
	public String getNomProducto() {
		return this.nomProducto;
	}

	public void setDescProducto(String valor) {
		this.descProducto = valor;
	}
	
	public String getDescProducto() {
		return this.descProducto;
	}

	public void setPrecioProducto(Integer valor) {
		this.precioProducto = valor;
	}
	
	public Integer getPrecioProducto() {
		return this.precioProducto;
	}

	public void setStockProducto(Integer valor) {
		this.stockProducto = valor;
	}
	
	public Integer getStockProducto() {
		return this.stockProducto;
	}
	

	public void setCaracteristicasProducto(String valor) {
		this.caracteristicasProducto = valor;
	}
	
	public String getCaracteristicasProducto() {
		return this.caracteristicasProducto;
	}

	public void setRutaImagenProducto(String valor) {
		this.rutaImagenProducto = valor;
	}
	
	public String getRutaImagenProducto() {
		return this.rutaImagenProducto;
	}


	public void setEstadoProducto(String valor) {
		this.estadoProducto = valor;
	}
	
	public String getEstadoProducto() {
		return this.estadoProducto;
	}

	public Producto(Integer idProducto, String nomProducto, String descProducto, Integer precioProducto, Integer stockProducto, String caracteristicasProducto, String rutaImagenProducto, String estadoProducto){
		
		this.idProducto = idProducto;
		this.nomProducto = nomProducto;
		this.descProducto = descProducto;
		this.precioProducto = precioProducto;
		this.stockProducto = stockProducto;
		this.caracteristicasProducto = caracteristicasProducto;
		this.rutaImagenProducto = rutaImagenProducto;
		this.estadoProducto = estadoProducto;			

	}
}
