package edu.upc.cartelerag6.cartelerag6.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.upc.cartelerag6.cartelerag6.model.Reserva;
import edu.upc.cartelerag6.cartelerag6.repository.ReservaRepository;
import edu.upc.cartelerag6.cartelerag6.service.ReservaService;
import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	private ReservaRepository repository;
	
	public List<Reserva> obtenerTodasReservas() {		
		return repository.obtenerTodasReservas();
	}

	public boolean  registarReserva(int idReserva, String cliente, String pelicula, String sala, String horario, int nroEntradas, String tipoPago, String direccionEnvio,java.sql.Date fecha) {
		return repository.registarReserva( idReserva, cliente, pelicula, sala, horario, nroEntradas, tipoPago, direccionEnvio, fecha);
	}
	
	public boolean  eliminaReserva(int idReserva){
		return repository.eliminaReserva(idReserva);
	};

}
