package edu.upc.cartelerag6.cartelerag6.repository;


import java.util.ArrayList;

import edu.upc.cartelerag6.cartelerag6.model.Sugerencia;
import edu.upc.cartelerag6.cartelerag6.model.Usuario;

public interface SugerenciaRepository {

	
	public Sugerencia encontrarSugerencia(String idSugerencia);
	public boolean deshabilitar(String posicion);
	public ArrayList validacionAlertas();
	public Sugerencia registrarSugerencia(String idSugerencia, String descripcion, String estado,
			String fecha_registro, String fecha_atencion, String flag_atencion);
	
}
