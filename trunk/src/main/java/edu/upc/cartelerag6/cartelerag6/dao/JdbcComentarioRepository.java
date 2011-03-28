package edu.upc.cartelerag6.cartelerag6.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;
import edu.upc.cartelerag6.cartelerag6.model.Comentario;
import edu.upc.cartelerag6.cartelerag6.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class JdbcComentarioRepository implements ComentarioRepository {
	@Autowired
	private DataSource dataSource;

	public Comentario registrarComentario(Integer idComentario, Integer idPelicula, String comentario, String estado, Date fechaCreacion) {
		Comentario c = null;
		String sql = "insert into T_COMENTARIO(idPelicula," +
		"comentario, estado, fechaRegistro) values (?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);

			ps.setInt(1, 1);
			ps.setString(2, comentario);
			ps.setString(3, estado);
			ps.setDate(4, fechaCreacion);
			ps.execute();
			c = new Comentario (1, idPelicula, comentario, estado, fechaCreacion);
			return c;
		} catch (SQLException e) {
			throw new RuntimeException("Error al insertar un nuevo comentario.", e);
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

	public Boolean actualizarEstado(Integer idComentario, Integer idPelicula, String estado) {
		Boolean actualizacionOk = false;
		String sql = "update T_COMENTARIO " +
		"Set Estado = ? " +
		"WHERE idComentario = ? and idPelicula = ? ";
		
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, estado);
			ps.setInt(2, idComentario);
			ps.setInt(3, idPelicula);
			ps.executeUpdate();
			actualizacionOk = true;
		} catch (SQLException e) {
			throw new RuntimeException("Error al actualizar comentario.", e);
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
		return actualizacionOk;
	}

	public ArrayList<Comentario> listarComentarios(Integer idPelicula, String estado) {
		String sql = "select * " +
		"from T_COMENTARIO " +
		"WHERE idPelicula = ? " +
		"AND estado = ? ";
		
		ArrayList<Comentario> comentarios = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idPelicula);
			ps.setString(2, estado);
			rs = ps.executeQuery();
			comentarios = mapComentarios(rs);
		} catch (SQLException e) {
			throw new RuntimeException("Error al seleccionar comentarios.", e);
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
		return comentarios;
	}

	public Comentario listarComentario(Integer idComentario, Integer idPelicula) {
		String sql = "select * " +
		"from T_COMENTARIO " +
		"WHERE idComentario = ? " +
		"AND idPelicula = ? ";
		
		Comentario comentario = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idComentario);
			ps.setInt(2, idPelicula);
			rs = ps.executeQuery();
			comentario = mapComentario(rs);
		} catch (SQLException e) {
			throw new RuntimeException("Error al obtener comentario.", e);
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
		return comentario;

	}

	public Boolean eliminarComentario(Integer idComentario, Integer idPelicula) {
		Boolean eliminacionOk = false;
		String sql = "delete from T_COMENTARIO " +
		"WHERE idComentario = ? and idPelicula = ? ";
		
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idComentario);
			ps.setInt(2, idPelicula);
			ps.execute();
			eliminacionOk = true;
		} catch (SQLException e) {
			throw new RuntimeException("Error al eliminar comentario.", e);
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
		return eliminacionOk;
	}
	
	
	private Comentario mapComentario(ResultSet rs) throws SQLException {
		Comentario comentario = null;
		while (rs.next()) {
			if (comentario == null) {

				 Integer idComentario = rs.getInt("idComentario");
				 Integer idPelicula = rs.getInt("idPelicula");
				 String txComentario = rs.getString("comentario");
				 String estado = rs.getString("estado");
				 Date fechaRegistro = rs.getDate("fechaRegistro");
				
				comentario = new Comentario(idComentario, idPelicula, txComentario, estado, fechaRegistro);
			}
		}
		if (comentario == null) {
			// no rows returned - throw an empty result exception
			//throw new EmptyResultDataAccessException(1);
		}
		return comentario;
	}	
	
	private ArrayList<Comentario>  mapComentarios(ResultSet rs) throws SQLException {
		Comentario comentario = null;
		ArrayList<Comentario> comentarios = new ArrayList<Comentario>(); 
		while (rs.next()) {
			if (comentario == null) {
				
				 Integer idComentario = rs.getInt("idComentario");
				 Integer idPelicula = rs.getInt("idPelicula");
				 String txComentario = rs.getString("comentario");
				 String estado = rs.getString("estado");
				 Date fechaRegistro = rs.getDate("fechaRegistro");
				 
				comentario = new Comentario(idComentario, idPelicula, txComentario, estado, fechaRegistro);
				if (comentario != null){ 
					comentarios.add(comentario);
					comentario = null;
				}
				
			}
		}
		return comentarios;
	}	
}
