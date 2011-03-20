package edu.upc.cartelerag6.cartelerag6.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.upc.cartelerag6.cartelerag6.model.OrdenEnvio;
import edu.upc.cartelerag6.cartelerag6.repository.OrdenEnvioRepository;

@Service
public class JdbcOrdenEnvioRepository implements OrdenEnvioRepository {
	@Autowired
	private DataSource dataSource;	
	
	public Boolean registrarOrdenEnvio(int idVenta, int idUsuario,
			String dirEnvio, String dirReferencia, String observaciones) {
		OrdenEnvio c = null;
		String sql = "insert into T_ORDEN_ENVIO(idVenta, idUsuario, dirEnvio, dirReferencia, observaciones) " +
		" values (?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);

			ps.setInt(1, idVenta);
			ps.setInt(2, idUsuario);
			ps.setString(3, dirEnvio);
			ps.setString(4, dirReferencia);
			ps.setString(5, observaciones);
			ps.execute();
			c = new OrdenEnvio();
			c.setIdVenta(idVenta);
			c.setIdUsuario(idUsuario);
			c.setDirEnvio(dirEnvio);
			c.setDirReferencia(dirReferencia);
			c.setObservaciones(observaciones);
			return true;
		} catch (SQLException e) {
			throw new RuntimeException("Error al registrar orden de envio.", e);
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
	}

	public ArrayList<OrdenEnvio> obtenerOrdenesEnvio() {
		String sql = "select * " +
		"from T_ORDEN_ENVIO ";
		
		ArrayList<OrdenEnvio> ordenesEnvio = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			ordenesEnvio = mapOrdenesEnvio(rs);
		} catch (SQLException e) {
			throw new RuntimeException("Error al seleccionar Ordenes de Envio.", e);
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
		return ordenesEnvio;
	}

	private ArrayList<OrdenEnvio>  mapOrdenesEnvio(ResultSet rs) throws SQLException {
		OrdenEnvio ordenEnvio = null;
		ArrayList<OrdenEnvio> ordenesEnvio = new ArrayList<OrdenEnvio>(); 
		while (rs.next()) {
			if (ordenEnvio == null) {
				Integer numOrden = rs.getInt("idOrden");
				Integer idVenta = rs.getInt("idVenta");
				Integer idUsuario = rs.getInt("idUsuario");
				String dirEnvio = rs.getString("dirEnvio");
				String dirReferencia = rs.getString("dirReferencia");
				String observaciones = rs.getString("observaciones");
				 
				ordenEnvio = new OrdenEnvio();
				ordenEnvio.setNumOrden(numOrden);
				ordenEnvio.setIdVenta(idVenta);
				ordenEnvio.setIdUsuario(idUsuario);
				ordenEnvio.setDirEnvio(dirEnvio);
				ordenEnvio.setDirReferencia(dirReferencia);
				ordenEnvio.setObservaciones(observaciones);
				if (ordenEnvio != null){ 
					ordenesEnvio.add(ordenEnvio);
					ordenEnvio = null;
				}
			}
		}
		return ordenesEnvio;
	}	
	
	
}
