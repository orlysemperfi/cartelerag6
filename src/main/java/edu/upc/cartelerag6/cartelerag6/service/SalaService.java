package edu.upc.cartelerag6.cartelerag6.service;

import java.util.List;
import edu.upc.cartelerag6.cartelerag6.model.Sala;


public interface SalaService {
	List<Sala> obtenerTodasSalas();
	boolean registrarSala(Integer numAsiento, String estado);

}
