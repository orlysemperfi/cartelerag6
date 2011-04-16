package edu.upc.cartelerag6.cartelerag6.repository;


import java.util.List;

import edu.upc.cartelerag6.cartelerag6.model.Sala;

public interface SalaRepository {

	public List<Sala> obtenerTodasSalas();
	public boolean registrarSala(Integer numAsiento, String estado);
}
