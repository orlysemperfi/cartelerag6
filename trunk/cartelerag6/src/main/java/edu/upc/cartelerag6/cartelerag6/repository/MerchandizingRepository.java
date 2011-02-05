package edu.upc.cartelerag6.cartelerag6.repository;

import java.util.ArrayList;

import edu.upc.cartelerag6.cartelerag6.model.Merchandizing;
import edu.upc.cartelerag6.cartelerag6.model.Producto;
import edu.upc.cartelerag6.cartelerag6.repository.ProductoRepository;

public class MerchandizingRepository {

	private ArrayList<Merchandizing> merchandizings;
	
	public MerchandizingRepository() {
		merchandizings = new ArrayList<Merchandizing>();
	}
	

	public Producto mostrarProductosPelicula(Integer idPelicula) {
		for (Merchandizing merchandizing: merchandizings) {
			if (merchandizing.getIdPelicula().equals(idPelicula)) {
			}
		}
		return null;
	}
	
}
