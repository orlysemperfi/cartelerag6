package edu.upc.cartelerag6.cartelerag6.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import edu.upc.cartelerag6.cartelerag6.model.Sugerencia;
import edu.upc.cartelerag6.cartelerag6.model.Usuario;

public class StubSugerenciaRepository implements SugerenciaRepository{
	
	private Map<String, Sugerencia> sugerencia = new HashMap<String, Sugerencia>();
	

	public StubSugerenciaRepository() {
		Sugerencia s = new Sugerencia("001", "Debería ser más eficiente el servicio de delivery","habilitado","02/02/20111","02/02/20111","pendiente");
		sugerencia.put("001", s);
	}

	public void bloquearUsuario(Usuario u1) {
	}
	
	
	public void deshabilitar(String posicion) {
		Sugerencia s = encontrarSugerencia(posicion);
		s.setEstado("deshabilitado");
	}

	public ArrayList validacionAlertas() {
		
		ArrayList listapendientes = null;
		
		for (int i = 0; i < sugerencia.size(); i++) {
			int posicion = sugerencia.hashCode(); 
			Sugerencia s = sugerencia.get(posicion);
			
			if (s.getEstado().equals("pendiente")) {
				listapendientes.add(s);
			}
		}
			
		return listapendientes;
	}

	public Sugerencia encontrarSugerencia(String idSugerencia) {
		Sugerencia s = sugerencia.get(idSugerencia);
		if (s == null) {
			System.out.println("Se deshabilitó la sugerencia " + s.getIdSugerencia());
		}
		return s;
	}

}
