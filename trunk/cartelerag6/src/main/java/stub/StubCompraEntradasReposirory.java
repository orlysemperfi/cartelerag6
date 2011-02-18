package edu.upc.cartelerag6.cartelerag6.stub;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import edu.upc.cartelerag6.cartelerag6.model.Venta;
import edu.upc.cartelerag6.cartelerag6.model.Detalle_Venta;
import edu.upc.cartelerag6.cartelerag6.model.Sugerencia;


public class StubCompraEntradasReposirory {

	public Venta registrarCompra(String idCompra, String fecha,
			String direcEnvio, Double importeImpuesto, Double importeTotal,
			String tipoPago) {
		// TODO Auto-generated method stub
		return null;
	}

	public Detalle_Venta registrarDetalleCompra(Integer item,
			String idProducto, Integer cantProducto, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean actualizarStock(String idProducto) {
		// TODO Auto-generated method stub
		return false;
	}
	/*
	private Map<String, Venta> compra = new HashMap<String, Venta>();
	private Map<Integer, Detalle_Venta> detalleCompra = new HashMap<Integer, Detalle_Venta>();
	private Map<String, StockProducto> stock = new HashMap<String, StockProducto>();
	
	public Venta registrarCompra(String idCompra, String fecha,
			String direcEnvio, Double importeImpuesto, Double importeTotal,
			String tipoPago) {
		
		Venta c = new Venta(idCompra, fecha, direcEnvio, importeImpuesto, importeTotal, tipoPago);
		compra.put(idCompra,c);
		return c;
	}

	public Detalle_Venta registrarDetalleCompra(Integer item, String idProducto, Integer cantProducto,
			Double importe) {
		Detalle_Venta d = new Detalle_Venta(item, idProducto, cantProducto, importe);
		detalleCompra.put(item,d);
		return d;
		
	}

	public boolean actualizarStock(String idProducto) {
		// TODO Auto-generated method stub
		return false;
	}
*/
}
