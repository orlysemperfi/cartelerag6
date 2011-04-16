package edu.upc.cartelerag6.cartelerag6.repository;

import java.util.List;

import edu.upc.cartelerag6.cartelerag6.model.Reserva;

public interface ReservaRepository {
	
	public boolean  registarReserva(int idReserva, String cliente, String pelicula, String sala, String horario, int nroEntradas, String tipoPago, String direccionEnvio,java.sql.Date fecha);
	public List<Reserva> obtenerTodasReservas();
	public boolean  eliminaReserva(int idReserva);
}
