package edu.upc.cartelerag6.cartelerag6.repository;

import edu.upc.cartelerag6.cartelerag6.model.Sugerencia;

public interface SugerenciaRepository {
	
	public boolean deshabilitarSugerencia(Integer idSugerencia);
	public Sugerencia registrarSugerencia(String descripcion, String estado,
			String fecha_registro, String fecha_atencion, String flag_atencion);
}
