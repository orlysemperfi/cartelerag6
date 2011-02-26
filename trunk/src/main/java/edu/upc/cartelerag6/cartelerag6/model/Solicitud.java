package edu.upc.cartelerag6.cartelerag6.model;

import java.util.ArrayList;
import java.util.Date;

public class Solicitud {
	
	private Venta cabecera;
	private ArrayList<Detalle_Venta> detalle;
	private Date fecha_solicitud;
	
	public Venta getCabecera() {
		return cabecera;
	}
	public void setCabecera(Venta cabecera) {
		this.cabecera = cabecera;
	}
	
	public Date getFecha_solicitud() {
		return fecha_solicitud;
	}
	public void setFecha_solicitud(Date fecha_solicitud) {
		this.fecha_solicitud = fecha_solicitud;
	}
	public void setDetalle(ArrayList<Detalle_Venta> detalle) {
		this.detalle = detalle;
	}
	public ArrayList<Detalle_Venta> getDetalle() {
		return detalle;
	}
}