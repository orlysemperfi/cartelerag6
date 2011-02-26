package edu.upc.cartelerag6.cartelerag6.model;


import java.util.Date;

public class Venta {
	private Integer idVenta;
	private Date fecha;
	private Double importeImpuesto;
	private Double importeTotal;
	private String tipoPago;

	
	public Venta(Integer idVenta, Date fecha, String tipoPago) {
		this.idVenta = idVenta;
		this.fecha = fecha;
		this.tipoPago = tipoPago;
	}
	
	public Venta(Integer idVenta, Date fecha, Double importeImpuesto,
			Double importeTotal, String tipoPago) {
		this.idVenta = idVenta;
		this.fecha = fecha;
		this.importeImpuesto = importeImpuesto;
		this.importeTotal = importeTotal;
		this.tipoPago = tipoPago;
	}
	
	public Integer getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public Double getImporteImpuesto() {
		return importeImpuesto;
	}
	public void setImporteImpuesto(Double importeImpuesto) {
		this.importeImpuesto = importeImpuesto;
	}
	public Double getImporteTotal() {
		return importeTotal;
	}
	public void setImporteTotal(Double importeTotal) {
		this.importeTotal = importeTotal;
	}
	public String getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	} 
	
	
		 
}
