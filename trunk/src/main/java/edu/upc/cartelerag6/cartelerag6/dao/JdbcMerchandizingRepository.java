package edu.upc.cartelerag6.cartelerag6.dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import edu.upc.cartelerag6.cartelerag6.model.Detalle_Venta;
import edu.upc.cartelerag6.cartelerag6.model.Producto;
import edu.upc.cartelerag6.cartelerag6.model.Solicitud;
import edu.upc.cartelerag6.cartelerag6.model.Venta;
import edu.upc.cartelerag6.cartelerag6.repository.ProductoRepository;
import edu.upc.cartelerag6.cartelerag6.repository.MerchandizingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JdbcMerchandizingRepository implements MerchandizingRepository{
	@Autowired
	private DataSource dataSource;

	@Autowired
	private ProductoRepository productoRepository;
	
	

	public ArrayList<Producto> mostrarProductosPelicula(Integer idPelicula) {
		String sql = "select T_PRODUCTO.* " +
		"from T_MERCHANDIZING , T_PRODUCTO " +
		"WHERE estadoProducto = 'A' " +
		"AND idPelicula = ? " +
		"AND estadoMerchandizing = 'A' " +
		"AND T_MERCHANDIZING.idProducto = T_PRODUCTO.idProducto";
		
		ArrayList<Producto> producto = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idPelicula);
			rs = ps.executeQuery();
			producto = mapProducto(rs, idPelicula);
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception occurred encontrando productos", e);
		} finally {
			if (rs != null) {
				try {
					// Close to prevent database cursor exhaustion
					rs.close();
				} catch (SQLException ex) {
				}
			}
			if (ps != null) {
				try {
					// Close to prevent database cursor exhaustion
					ps.close();
				} catch (SQLException ex) {
				}
			}
			if (conn != null) {
				try {
					// Close to prevent database connection exhaustion
					conn.close();
				} catch (SQLException ex) {
				}
			}
		}
		return producto;
	}

	
	private ArrayList<Producto>  mapProducto(ResultSet rs, int idPelicula) throws SQLException {
		Producto producto = null;
		ArrayList<Producto> lproductos = new ArrayList<Producto>(); 
		while (rs.next()) {
			if (producto == null) {
				
				int idProducto = rs.getInt("idProducto");
				String nomProducto = rs.getString("nomProducto");
				String descProducto = rs.getString("descProducto");
				int precioProducto = rs.getInt("precioProducto");
				int stockProducto = rs.getInt("stockProducto");
				String caracteristicasProducto = rs.getString("caracteristicasProducto");
				String rutaImagenProducto = rs.getString("rutaImagenProducto");
				String estadoProducto = rs.getString("estadoProducto");
				producto = new Producto(idProducto, nomProducto, descProducto, precioProducto, stockProducto, caracteristicasProducto, rutaImagenProducto, estadoProducto);
				if (producto != null){ lproductos.add(producto);producto = null;}
				
			}
		}
		return lproductos;
	}


	public Solicitud LLenarCarrito(Venta cabecera,
			ArrayList<Detalle_Venta> detalle) {
		
		Solicitud s1 = null;
		if (cabecera != null) {
			s1 = new Solicitud();
			s1.setCabecera(cabecera);
			s1.setFecha_solicitud(cabecera.getFecha());
			if (detalle != null){
				if (detalle.isEmpty() ==false){
					s1.setDetalle(detalle);
				}
				else {s1 = null;}
			}
			else {s1 = null;}
		}
		return s1;
	}
	
	
	public Double obtenerTotalSolicitud(Solicitud solicitud)
	{
		Producto producto;
		Double dblTotal;
		dblTotal = 0.00;
		for(int i = 0; i < solicitud.getDetalle().size(); i++) {
		    producto = productoRepository.obtenerProducto(solicitud.getDetalle().get(i).getIdProducto());
		    dblTotal = dblTotal + (solicitud.getDetalle().get(i).getCantProducto() * Double.parseDouble(producto.getPrecioProducto().toString()));
		}
		return dblTotal;
	}

	private Boolean registrarDetalle(Integer idVenta ,Detalle_Venta detalle)
	{
		boolean fvalid = false;
		Integer intIdHorario = 0;
		Integer intIdProducto = 0;
 		String sql = "insert into T_DETALLE_VENTA(idVenta, idProducto, idHorario, cantProducto, importe) " +
		" values (?, ?, ?, ?, ?) ";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			if (detalle.getIdProducto() != null)
			{
				intIdProducto = detalle.getIdProducto();
			} 
			if (detalle.getIdHorario() != null)
			{
				intIdHorario = detalle.getIdHorario();
			} 
			
			ps.setInt(1,idVenta);
			ps.setInt(2, intIdProducto);
			ps.setInt(3,intIdHorario );
			ps.setInt(4, detalle.getCantProducto());
			ps.setDouble(5, detalle.getImporte());
			
			ps.execute();
			fvalid = true;
						
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception occured insertando sugerencia", e);
		} finally {
			if (ps != null) {
				try {
					// Close to prevent database cursor exhaustion
					ps.close();
				} catch (SQLException ex) {
				}
			}
			if (conn != null) {
				try {
					// Close to prevent database connection exhaustion
					conn.close();
				} catch (SQLException ex) {
				}
			}
		}
		return fvalid;
	}
	
 	public Boolean realizarVenta(Solicitud solicitud) {
 		Date fecha;
 		Double dblImpuesto;
 		Double dblImporteTotal;
 		Integer idVenta = 1;
 		boolean fvalid = false;
 		String strFecha;
		String sql = "insert into T_VENTA(fecha, importeImpuesto, importeTotal, tipoPago) " +
		" values (?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		strFecha = solicitud.getCabecera().getFecha().toString();
		fecha = Date.valueOf(strFecha);
		try {
			dblImpuesto = obtenerTotalSolicitud(solicitud) * 0.19;
			dblImporteTotal = obtenerTotalSolicitud(solicitud);
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setDate(1,fecha);
			ps.setDouble(2, dblImpuesto);
			ps.setDouble(3, dblImporteTotal);
			ps.setString(4, solicitud.getCabecera().getTipoPago());
			ps.execute();
			// Inicio
			for(int i = 0; i < solicitud.getDetalle().size(); i++) {
				fvalid = registrarDetalle(idVenta, solicitud.getDetalle().get(i));
			}
			//Fin
			
			
			
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception occured insertando sugerencia", e);
		} finally {
			if (ps != null) {
				try {
					// Close to prevent database cursor exhaustion
					ps.close();
				} catch (SQLException ex) {
				}
			}
			if (conn != null) {
				try {
					// Close to prevent database connection exhaustion
					conn.close();
				} catch (SQLException ex) {
				}
			}
		}
		return fvalid;
	}
	
}
