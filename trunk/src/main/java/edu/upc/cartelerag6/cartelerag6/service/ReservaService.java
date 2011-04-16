package edu.upc.cartelerag6.cartelerag6.service;

import java.util.List;
import edu.upc.cartelerag6.cartelerag6.model.Reserva;


public interface ReservaService {
	
	boolean  registarReserva(int idReserva, String cliente, String pelicula, String sala, String horario, int nroEntradas, String tipoPago, String direccionEnvio,java.sql.Date fecha);
	List<Reserva> obtenerTodasReservas();
}
