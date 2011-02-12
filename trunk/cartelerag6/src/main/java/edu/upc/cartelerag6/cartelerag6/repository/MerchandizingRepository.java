package edu.upc.cartelerag6.cartelerag6.repository;

import java.util.ArrayList;


import edu.upc.cartelerag6.cartelerag6.model.Merchandizing;

public class MerchandizingRepository {

	private static ArrayList<Merchandizing> merchandizings;
	
	public MerchandizingRepository() {
		merchandizings = new ArrayList<Merchandizing>();
	}
	

	public static  void mostrarProductosPelicula(Integer idPelicula) {
		for (Merchandizing merchandizing: merchandizings) {
			if (merchandizing.getIdPelicula().equals(idPelicula)) {
				System.out.println("Se Visualiza producto con Id "
						+ merchandizing.getIdProducto().toString());					
			}
		}
	}
}
