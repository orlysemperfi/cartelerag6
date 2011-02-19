package edu.upc.cartelerag6.cartelerag6.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;

import edu.upc.cartelerag6.cartelerag6.model.Sugerencia;
import edu.upc.cartelerag6.cartelerag6.repository.SugerenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JdbcSugerenciaRepository implements SugerenciaRepository{
	@Autowired
	private DataSource dataSource;

 	public Sugerencia registrarSugerencia(String descripcion,
			String estado, String fecha_registro, String fecha_atencion,
			String flag_atencion) {
 		Sugerencia s1 = null;
 		Integer idSugerencia;
 		idSugerencia =0;
		String sql = "insert into T_SUGERENCIA(descripcion, estado, fecha_registro, fecha_atencion, flag_atencion)" +
		" values (?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1,descripcion);
			ps.setString(2, estado);
			ps.setString(3, fecha_registro);
			ps.setString(4, fecha_atencion);
			ps.setString(5, flag_atencion);
			ps.execute();
			s1 = new Sugerencia (idSugerencia, descripcion, estado,fecha_registro, fecha_atencion, flag_atencion);
			return s1;
			
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
	}

	public boolean deshabilitarSugerencia(Integer idSugerencia) {
		String sql = "update T_SUGERENCIA SET estado = ? where idSugerencia = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		boolean fbloqueo = false;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "Deshabilitado");
			ps.setInt(2, idSugerencia);
			ps.executeUpdate();
			fbloqueo = true;
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception occurred actualizando el estado de la sugerencia.", e);
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
}
