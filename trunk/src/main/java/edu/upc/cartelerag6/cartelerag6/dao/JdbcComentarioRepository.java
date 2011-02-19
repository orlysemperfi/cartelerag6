package edu.upc.cartelerag6.cartelerag6.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

import edu.upc.cartelerag6.cartelerag6.model.Comentario;
import edu.upc.cartelerag6.cartelerag6.repository.ComentarioRepository;

public class JdbcComentarioRepository implements ComentarioRepository {
	@Autowired
	private DataSource dataSource;

	public Comentario registrarComentario(Integer idComentario, Integer idPelicula, String comentario, String estado, String fechaCreacion) {
		Comentario c = null;
		String sql = "insert into T_COMENTARIO(idComentario, idPelicula," +
		"comentario, estado, fechaRegistro) values (?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idComentario);
			ps.setInt(2, 1);
			ps.setString(3, comentario);
			ps.setString(4, estado);
			ps.setString(5, fechaCreacion);
			ps.execute();
			c = new Comentario (idComentario, idPelicula, comentario, estado, fechaCreacion);
			return c;
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception occured insertando a un usuario", e);
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

	public void actualizarEstado(Integer idComentario, String estado) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Comentario> listarComentarios() {
		// TODO Auto-generated method stub
		return null;
	}

	public Comentario listarComentario(Integer idComentario) {
		// TODO Auto-generated method stub
		return null;
	}

	public void eliminarComentario(Integer idComentario) {
		// TODO Auto-generated method stub
		
	}
	
	
	private Comentario mapComentario(ResultSet rs) throws SQLException {
		Comentario comentario = null;
		while (rs.next()) {
			if (comentario == null) {

				 Integer idComentario = rs.getInt("idComentario");
				 Integer idPelicula = rs.getInt("idPelicula");
				 String txComentario = rs.getString("comentario");
				 String estado = rs.getString("estado");
				 String fechaRegistro = rs.getString("fechaRegistro");
				
				comentario = new Comentario(idComentario, idPelicula, txComentario, estado, fechaRegistro);
			}
		}
		if (comentario == null) {
			// no rows returned - throw an empty result exception
			//throw new EmptyResultDataAccessException(1);
		}
		return comentario;
	}	
}