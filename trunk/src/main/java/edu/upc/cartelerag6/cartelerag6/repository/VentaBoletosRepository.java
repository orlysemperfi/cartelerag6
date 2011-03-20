package edu.upc.cartelerag6.cartelerag6.repository;

import java.sql.Date;
import java.util.ArrayList;
import edu.upc.cartelerag6.cartelerag6.model.Detalle_Venta;
import edu.upc.cartelerag6.cartelerag6.model.Venta;

public interface VentaBoletosRepository {
	public Integer registrarVenta(Date fecha, Double importeImpuesto, Double importeTotal, String tipoPago, int idUsuario);
	public Boolean registrarDetalleVenta(int idVenta, int idProducto, int horario, int cantidad, Double importe);
	public Boolean eliminarItem (int idVenta, int idItem);
	public Boolean eliminarVenta (int idVenta);
	public ArrayList<Venta> obtenerVentas();
	public ArrayList<Detalle_Venta> obtenerDetalleVentas(int idVenta);
}
