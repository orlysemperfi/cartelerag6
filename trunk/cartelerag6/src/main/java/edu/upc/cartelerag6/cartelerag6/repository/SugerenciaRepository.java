package edu.upc.cartelerag6.cartelerag6.repository;

import edu.upc.cartelerag6.cartelerag6.model.Sugerencia;
import edu.upc.cartelerag6.cartelerag6.model.Usuario;

public class SugerenciaRepository {
	
	public void bloquearUsuario(Usuario u1) {
		if (u1 != null) {
			System.out.println("Se bloqueo el usuario " + u1.getNombre() + "con id "+ u1.getId());	
		}else{
			System.out.println("El usuario " + u1.getNombre() + "con id "+ u1.getId()+ "no pudo ser bloquedo");
		}
	}
	
	public void deshabilitar(Sugerencia s) {
		if (s != null) {
			System.out.println("Se deshabilitó la sugerencia " + s.getIdSugerencia());	
		}else{
			System.out.println("La sugerencia " + s.getIdSugerencia() + "no pudo ser deshabilitada");
		}
	}
	
	public void validacionAlertas(Sugerencia s) {
		if (s != null) {
			System.out.println("Esta pendiente por atender la alerta" + s.getIdSugerencia());	
		}else{
			System.out.println("No existen sugerencias por atender");
		}
	}

}
