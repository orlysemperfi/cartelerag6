package edu.upc.cartelerag6.cartelerag6.stub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import edu.upc.cartelerag6.cartelerag6.model.Sugerencia;
import edu.upc.cartelerag6.cartelerag6.model.Usuario;
import edu.upc.cartelerag6.cartelerag6.repository.SugerenciaRepository;

public class StubSugerenciaRepository implements SugerenciaRepository{
	
	private Map<String, Sugerencia> sugerencia = new HashMap<String, Sugerencia>();
	

	public StubSugerenciaRepository() {
	//	Sugerencia s = new Sugerencia("001", "Deber�a ser m�s eficiente el servicio de delivery","habilitado","02/02/20111","02/02/20111","pendiente");
	//	sugerencia.put("001", s);
	}

	public boolean deshabilitar(String posicion) {
		boolean f_deshabilitar = false;
		Sugerencia s = encontrarSugerencia(posicion);
		if (s != null) {
			s.setEstado("deshabilitado");
			f_deshabilitar = true;
		}
		
		return f_deshabilitar; 
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
			System.out.println("Se deshabilit� la sugerencia " + s.getIdSugerencia());
		}
		return s;
	}

	public Sugerencia registrarSugerencia(String idSugerencia,
			String descripcion, String estado, String fecha_registro,
			String fecha_atencion, String flag_atencion) {
		
//			Sugerencia s = new Sugerencia(idSugerencia, descripcion, estado, fecha_registro,fecha_atencion, flag_atencion);
	//		sugerencia.put(idSugerencia,s);
			
		
		
	//	return s;
		return null;
	}

}
