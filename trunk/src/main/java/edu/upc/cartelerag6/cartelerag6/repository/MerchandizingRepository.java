package edu.upc.cartelerag6.cartelerag6.repository;

import java.util.ArrayList;
import java.util.List;

import edu.upc.cartelerag6.cartelerag6.model.Detalle_Venta;
import edu.upc.cartelerag6.cartelerag6.model.Producto;
import edu.upc.cartelerag6.cartelerag6.model.Solicitud;
import edu.upc.cartelerag6.cartelerag6.model.Venta;

public interface MerchandizingRepository {
	
	public List<Producto> mostrarProductosPelicula(Integer idPelicula);
	public Solicitud LLenarCarrito(Venta cabecera, ArrayList<Detalle_Venta> detalle);
	public Double obtenerTotalSolicitud(Solicitud solicitud); 
	public Boolean realizarVenta(Solicitud solicitud);
}
