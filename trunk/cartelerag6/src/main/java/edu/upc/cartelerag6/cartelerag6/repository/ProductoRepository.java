package edu.upc.cartelerag6.cartelerag6.repository;

import java.util.ArrayList;

import edu.upc.cartelerag6.cartelerag6.model.Producto;

public class ProductoRepository {

	private ArrayList<Producto> productos;
	
	public ProductoRepository() {
		productos = new ArrayList<Producto>();
	}
	

	public Producto getProducto(Integer idProducto) {
		for (Producto producto: productos) {
			if (producto.getIdProducto().equals(idProducto))  {
				return producto;
			}
		}
		return null;
	}	
	
}
