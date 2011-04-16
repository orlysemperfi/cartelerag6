package edu.upc.cartelerag6.cartelerag6.model;

import java.io.Serializable;
import java.util.Date;

public class Reserva implements Serializable{
	private static final long serialVersionUID = -7789783307702730765L;
	private int idReserva;
	private String cliente;
	private String sala;
	private String horario;
	private int nroEntradas;
	private String tipoPago;
	private String direccionEnvio;
	private Date fecha;

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getNroEntradas() {
		return nroEntradas;
	}

	public void setNroEntradas(int nroEntradas) {
		this.nroEntradas = nroEntradas;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}


	public String getDireccionEnvio() {
		return direccionEnvio;
	}

	public void setDireccionEnvio(String direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}

	
	public Reserva(int idReserva, String cliente, String sala, String horario, int nroEntradas, String tipoPago, String direccionEnvio,Date fecha) {
		//super();
		this.idReserva = idReserva;
		this.cliente = cliente;
		this.sala = sala;
		this.horario = horario;
		this.nroEntradas = nroEntradas;
		this.tipoPago = tipoPago;
		this.direccionEnvio = direccionEnvio;
		this.fecha = fecha;
	}

}

