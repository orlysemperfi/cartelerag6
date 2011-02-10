package edu.upc.cartelerag6.cartelerag6.repository;


import java.util.ArrayList;

import edu.upc.cartelerag6.cartelerag6.model.Sugerencia;
import edu.upc.cartelerag6.cartelerag6.model.Usuario;

public interface SugerenciaRepository {

	public void bloquearUsuario(Usuario u1);
	public Sugerencia encontrarSugerencia(String idSugerencia);
	public void deshabilitar(String posicion);
	public ArrayList validacionAlertas();

	
}
