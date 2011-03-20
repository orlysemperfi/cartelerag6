package edu.upc.cartelerag6.cartelerag6.repository;

import java.util.ArrayList;
import edu.upc.cartelerag6.cartelerag6.model.OrdenEnvio;

public interface OrdenEnvioRepository {
	public Boolean registrarOrdenEnvio(int idVenta, int idUsuario, String dirEnvio, String dirReferencia, String observaciones);
	public ArrayList<OrdenEnvio> obtenerOrdenesEnvio();
	
}
