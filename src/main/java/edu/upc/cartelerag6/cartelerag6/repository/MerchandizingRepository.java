package edu.upc.cartelerag6.cartelerag6.repository;

import java.util.ArrayList;

import edu.upc.cartelerag6.cartelerag6.model.Producto;


public interface MerchandizingRepository {
	
	public ArrayList<Producto> mostrarProductosPelicula(Integer idPelicula);
}
