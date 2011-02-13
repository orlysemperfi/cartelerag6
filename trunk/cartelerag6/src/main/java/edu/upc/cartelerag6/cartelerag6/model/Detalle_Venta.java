package edu.upc.cartelerag6.cartelerag6.model;

import java.util.Date;

public class Detalle_Venta {
	
	private Integer IdVenta;
	private Integer item;
	private Integer idProducto;
	private Integer idHorario;
	private Integer cantProducto;
	private Double importe;
	public Integer getIdVenta() {
		return IdVenta;
	}
	public void setIdVenta(Integer idVenta) {
		IdVenta = idVenta;
	}
	public Integer getItem() {
		return item;
	}
	public void setItem(Integer item) {
		this.item = item;
	}
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public Integer getIdHorario() {
		return idHorario;
	}
	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
	}
	public Integer getCantProducto() {
		return cantProducto;
	}
	public void setCantProducto(Integer cantProducto) {
		this.cantProducto = cantProducto;
	}
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	
	
	
	
}
