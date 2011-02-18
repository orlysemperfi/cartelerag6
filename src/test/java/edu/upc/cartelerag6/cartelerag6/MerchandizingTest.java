package edu.upc.cartelerag6.cartelerag6;

import org.junit.Test;

import static org.junit.Assert.*;
import edu.upc.cartelerag6.cartelerag6.repository.MerchandizingRepository;
import edu.upc.cartelerag6.cartelerag6.repository.SolicitudRepository;
import edu.upc.cartelerag6.cartelerag6.model.Solicitud;

public class MerchandizingTest {
	MerchandizingRepository merchandizingRepository
	= new MerchandizingRepository();

	@Test
	public void VisualizarMerchandizing(){
		MerchandizingRepository.mostrarProductosPelicula(25);
	}

	@Test
	public void AgregarSolicitud(){
		Solicitud solicitud = new Solicitud (1,1,null,null,"","");
		SolicitudRepository.AgregarSolicitud(solicitud);		
		assertTrue(solicitud.getIdSolicitud()!=null);
	}
}