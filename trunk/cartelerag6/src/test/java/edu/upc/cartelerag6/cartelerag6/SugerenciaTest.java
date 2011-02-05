package edu.upc.cartelerag6.cartelerag6;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Iterator;

import junit.framework.Assert;

import org.junit.Test;

import edu.upc.cartelerag6.cartelerag6.model.Sugerencia;
import edu.upc.cartelerag6.cartelerag6.model.Usuario;
import edu.upc.cartelerag6.cartelerag6.repository.SugerenciaRepository;


public class SugerenciaTest {
	
	SugerenciaRepository sugerenciaRepository = new SugerenciaRepository();
	private ArrayList<Usuario>usuarios; 
	private ArrayList<Sugerencia>sugerencias; 
	
	@Test
	//Registrar sugerencias
	public void registrarSugerencia(){
		Sugerencia sugerencia = null;
		sugerencia.registrarSugerencias(001,"Debería ser más eficiente el servicio de delivery", "habilitado", "02/02/2011", "02/02/20111", "pendiente");
		sugerencia.registrarSugerencias(002,"La compra de boletos por web no debe tener cargo", "habilitado", "02/02/2011", "02/02/20111", "pendiente");
	}
	
	//Se bloqueará a los clientes que hagan mal uso del servicio
	public void bloqueoUsuarios(){
		Integer Id = 20505;
		Usuario u1 = null;
		
		for(Usuario u:usuarios){
			if (u.getId() == Id) {
				u1 = u;
				break;
			}
		}
		
		if (u1 != null) {
			u1.setEstado("bloqueado");
			sugerenciaRepository.bloquearUsuario(u1);
		}else{
			sugerenciaRepository.bloquearUsuario(u1);
		}
	}
	
	//Se podrá retirar mensajes que infrinjan la ley o sean ofensivas
	
	public void deshabilitarSugerencia(){
		Integer Id = 20505;
		Integer IdSugerencia = 40302;
		
		Sugerencia sugerencia = null;
		
		for(Sugerencia s:sugerencias){
			if (s.getIdSugerencia()== IdSugerencia) {
				sugerencia = s;
				break;
			}
		}
		
		if (sugerencia != null) {
			sugerencia.setEstado("deshabilitado");
			sugerenciaRepository.deshabilitar(sugerencia);
		}else{
			sugerenciaRepository.deshabilitar(sugerencia);
		}
	}
	
	
	//Validación de alertas pendientes
	
	public void validacionAlertasPendientes(){
		Sugerencia sugerencia = null;
		ArrayList pendiente = sugerencia.buscarSugerenciaAtencion(); 
		
		for (int i = 0; i < pendiente.size(); i++) {
			Sugerencia s = (Sugerencia) pendiente.get(i); 
			sugerenciaRepository.validacionAlertas(s);
		}
			
		}
	
	
	
	
}
