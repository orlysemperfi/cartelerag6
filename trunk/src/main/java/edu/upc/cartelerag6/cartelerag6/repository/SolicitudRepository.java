package edu.upc.cartelerag6.cartelerag6.repository;

import edu.upc.cartelerag6.cartelerag6.model.Solicitud;
import java.util.ArrayList;

public class SolicitudRepository {

	private ArrayList<Solicitud> solicitudes;
	
	public SolicitudRepository() {
		solicitudes = new ArrayList<Solicitud>();
	}
	
	public static void AgregarSolicitud(Solicitud s1) {
		s1.setIdSolicitud(0);
		System.out.println("Se grabo solicitud con id "+
				s1.getIdSolicitud());	
		
	}
	
}
