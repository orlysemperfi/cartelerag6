package edu.upc.cartelerag6.cartelerag6.dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import edu.upc.cartelerag6.cartelerag6.model.Producto;
import edu.upc.cartelerag6.cartelerag6.repository.MerchandizingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JdbcMerchandizingRepository implements MerchandizingRepository{
	@Autowired
	private DataSource dataSource;
	

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

	
}
