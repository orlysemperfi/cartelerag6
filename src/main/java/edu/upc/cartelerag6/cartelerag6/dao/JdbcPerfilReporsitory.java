package edu.upc.cartelerag6.cartelerag6.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.upc.cartelerag6.cartelerag6.model.Perfil;
import edu.upc.cartelerag6.cartelerag6.repository.PerfilRepository;

@Service
public class JdbcPerfilReporsitory implements PerfilRepository{
	
	@Autowired
	private DataSource dataSource;

	public Perfil registrarPerfil(String idPerfil, String nomPerfil,
			String estado) {
		Perfil perfil = null;
		String sql = "insert into T_PERFIL (idPerfil, nomPerfil, estado) values (?, ?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1,idPerfil);
			ps.setString(2,nomPerfil);
			ps.setString(3, estado);
			
			ps.execute();
			perfil = new Perfil (nomPerfil,estado);
			return perfil;
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception occured insertando un perfil", e);
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

	public boolean inactivarPerfil(Integer idPerfil) {
		String sql = "update T_PERFIL SET estado = ? where idPerfil = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		boolean finactivo = false;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "I");
			ps.setInt(2, idPerfil);
			ps.executeUpdate();
			finactivo = true;
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception occurred actualizando el estado del perfil", e);
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
		return finactivo;

	}

	public Perfil obtenerPerfil(Integer idPerfil) {
		String sql = "select nomPerfil, estado from T_PERFIL " +
		"where idPerfil = ? "; 
		 
		Perfil perfil = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idPerfil);
			rs = ps.executeQuery();
			perfil = mapPerfil(rs, idPerfil);
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception occurred encontrando el perfil", e);
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
		return perfil;

	}
	
	private Perfil mapPerfil(ResultSet rs, int idPerfil) throws SQLException {
		Perfil perfil = null;
		while (rs.next()) {
			if (perfil == null) {
				
				String nomPerfil = rs.getString("nomPerfil");
				String estado = rs.getString("estado");
				
				perfil = new Perfil(nomPerfil, estado);
				// set internal entity identifier (primary key)
				perfil.setIdPerfil(idPerfil);
			}
		}
		if (perfil == null) {
			// no rows returned - throw an empty result exception
			//throw new EmptyResultDataAccessException(1);
		}
		return perfil;
	}

	public ArrayList obtenerListaPerfiles() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean asignarPerfil_Usuario(Integer idPerfil, Integer idUsuario) {
		boolean fasignacion = false;
		String sql = "insert into T_PERFIL_USUARIO(idPerfil, idUsuario, estado) values (?, ?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1,idPerfil);
			ps.setInt(2, idUsuario);
			ps.setString(3, "A");
			
			ps.execute();
			fasignacion = true;
			
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception occured asignando un perfil al usuario", e);
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

		return fasignacion;
	}

	public boolean inactivarPerfil_Usuario(Integer idPerfil, Integer idUsuario) {
		String sql = "update T_PERFIL_USUARIO SET estado = ? where idPerfil = ? and idUsuario = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		boolean finactivo = false;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "I");
			ps.setInt(2, idPerfil);
			ps.setInt(3, idUsuario);
			ps.executeUpdate();
			finactivo = true;
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception occurred inactivando la relacion del perfil_usuario", e);
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
		return finactivo;
	}
	

}
