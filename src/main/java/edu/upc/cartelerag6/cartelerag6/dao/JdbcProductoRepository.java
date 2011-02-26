package edu.upc.cartelerag6.cartelerag6.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import edu.upc.cartelerag6.cartelerag6.model.Producto;
import edu.upc.cartelerag6.cartelerag6.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class JdbcProductoRepository implements ProductoRepository{
	@Autowired
	private DataSource dataSource;
	

	public Producto obtenerProducto(Integer idProducto) {
		String sql = "select * " +
		"from T_PRODUCTO " +
		"where idProducto = ? "; 
		 
		Producto producto = null;
		producto = new Producto(idProducto, "Polo manga larga", "Polo para niños", 20,50,"Edición limitada", "ruta imagen", "A");

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idProducto);
			rs = ps.executeQuery();
			producto = mapProducto(rs, idProducto);
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception occurred encontrando al producto.", e);
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
	
	private Producto mapProducto(ResultSet rs, int idProducto) throws SQLException {
		Producto producto = null;
		while (rs.next()) {
			if (producto == null) {
				String nomProducto = rs.getString("nomProducto");
				String descProducto = rs.getString("descProducto");
				int precioProducto = rs.getInt("precioProducto");
				int stockProducto = rs.getInt("stockProducto");
				String caracteristicasProducto = rs.getString("caracteristicasProducto");
				String rutaImagenProducto = rs.getString("rutaImagenProducto");
				String estadoProducto = rs.getString("estadoProducto");
				producto = new Producto(idProducto, nomProducto, descProducto, precioProducto, stockProducto, caracteristicasProducto, rutaImagenProducto, estadoProducto);;
				// set internal entity identifier (primary key)
				producto.setIdProducto(idProducto);
			}
		}
		if (producto == null) {
			// no rows returned - throw an empty result exception
			//throw new EmptyResultDataAccessException(1);
		}
		return producto;
	}
}
