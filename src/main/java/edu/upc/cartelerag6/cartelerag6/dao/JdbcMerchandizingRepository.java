package edu.upc.cartelerag6.cartelerag6.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import edu.upc.cartelerag6.cartelerag6.model.Detalle_Venta;
import edu.upc.cartelerag6.cartelerag6.model.Producto;
import edu.upc.cartelerag6.cartelerag6.model.Solicitud;
import edu.upc.cartelerag6.cartelerag6.model.Venta;
import edu.upc.cartelerag6.cartelerag6.repository.MerchandizingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;



@Repository
public class JdbcMerchandizingRepository extends JdbcDaoSupport implements MerchandizingRepository {
	
	@Autowired
	public JdbcMerchandizingRepository(DataSource dataSource){
		setDataSource(dataSource);
	}	
	

	public List<Producto> mostrarProductosPelicula(Integer idPelicula) {
		String sql = "select T_PRODUCTO.* " +
		"from T_MERCHANDIZING , T_PRODUCTO " +
		"WHERE estadoProducto = 'A' " +
		"AND idPelicula = ? " +
		"AND estadoMerchandizing = 'A' " +
		"AND T_MERCHANDIZING.idProducto = T_PRODUCTO.idProducto";
		
		List<Producto> 
		  productos = getJdbcTemplate().query(sql,
				    new Object[]{idPelicula}, 
				  	new ProductoRowMapper());
		return productos;
	}

	
	private class ProductoRowMapper 
	     implements ParameterizedRowMapper<Producto>{

		public Producto mapRow(ResultSet rs, int rowNum)
				throws SQLException {
			Producto producto = null;
			int idProducto = rs.getInt("idProducto");
			String nomProducto = rs.getString("nomProducto");
			String descProducto = rs.getString("descProducto");
			int precioProducto = rs.getInt("precioProducto");
			int stockProducto = rs.getInt("stockProducto");
			String caracteristicasProducto = rs.getString("caracteristicasProducto");
			String rutaImagenProducto = rs.getString("rutaImagenProducto");
			String estadoProducto = rs.getString("estadoProducto");
			producto = new Producto(idProducto, nomProducto, descProducto, precioProducto, stockProducto, caracteristicasProducto, rutaImagenProducto, estadoProducto);
			return producto;
		}		
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


	public Double obtenerTotalSolicitud(Solicitud solicitud) {
		// TODO Auto-generated method stub
		return null;
	}


	public Boolean realizarVenta(Solicitud solicitud) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
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


	private Boolean actualizaStock(Integer idProducto, Integer intSctock){
		String sql = "update T_PRODUCTO SET stockProducto = ? where idProducto = ? ";
		Connection conn = null;
		PreparedStatement ps = null;
		boolean fbloqueo = false;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, intSctock);
			ps.setInt(2, idProducto);
			ps.executeUpdate();
			fbloqueo = true;
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception occurred actualizando stock del producto", e);
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
		return fbloqueo;
	}

	private Boolean registrarDetalle(Integer idVenta ,Detalle_Venta detalle)
	{
		Producto p1 = null;
		boolean fvalid = false;
		Integer intIdHorario = 0;
		Integer intIdProducto = 0;
		Integer intNuevoStock;
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
			p1 = productoRepository.obtenerProducto(intIdProducto);
			intNuevoStock = p1.getStockProducto() - detalle.getCantProducto();
			fvalid = actualizaStock(intIdProducto,intNuevoStock);
			//fvalid = true;
						
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
	}*/
	
}
