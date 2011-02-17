package edu.upc.cartelerag6.cartelerag6.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import edu.upc.cartelerag6.cartelerag6.model.Usuario;
import edu.upc.cartelerag6.cartelerag6.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class JdbcUsuarioRepository implements UsuarioRepository{
	@Autowired
	private DataSource dataSource;
	

	public boolean validacionUsuario(Integer idUsuario) {
		String sql = "select idUsuario " +
		"from T_USUARIO " +
		"where idUsuario = ? "; 
		
		boolean fvalid = false;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idUsuario);
			rs = ps.executeQuery();
			fvalid = mapUsuarioVal(rs);
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception validando el ID del usuario", e);
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
		return fvalid;
	}
	
	private boolean mapUsuarioVal(ResultSet rs) throws SQLException {
		Usuario usuario = null;
		boolean validacion = false;
		while (rs.next()) {
			if (usuario == null) {
				String idUsuario = rs.getString("idUsuario");
				usuario = new Usuario(Integer.parseInt(idUsuario));
				// set internal entity identifier (primary key)
				usuario.setIdUsuario(rs.getInt(idUsuario));
			}
			
		}
		if (usuario == null) {
			// no rows returned - throw an empty result exception
			//throw new EmptyResultDataAccessException(1);
		}
		else{
			validacion = true;
		}
		return validacion;
	}
	
	public Usuario registrarUsuario(Integer idUsuario, String login,
			String password, String estado, String nombre, String apellido,
			String puesto, Date fec_Creacion,
			Date fec_Caducidad, String telefono, String email,
			String dni, String tipo) {
		Usuario u = null;
		String sql = "insert into T_USUARIO(login, password, estado, nombre, apellido, puesto, fec_Creacion, fec_Caducidad," +
		"telefono, email, dni, tipo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1,login);
			ps.setString(2, password);
			ps.setString(3, estado);
			ps.setString(4, nombre);
			ps.setString(5, apellido);
			ps.setString(6, puesto);
			ps.setDate(7, fec_Creacion);
			ps.setDate(8, fec_Caducidad);
			ps.setString(9, telefono);
			ps.setString(10, email);
			ps.setString(11, dni);
			ps.setString(12, tipo);
			ps.execute();
			u = new Usuario (login,password,estado,nombre,apellido,puesto,fec_Creacion,fec_Caducidad,telefono,email,dni,tipo);
			return u;
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
	

	public boolean bloqueoUsuario(Integer idUsuario) {
		String sql = "update T_USUARIO SET estado = ? where idUsuario = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		boolean fbloqueo = false;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "bloqueado");
			ps.setInt(2, idUsuario);
			ps.executeUpdate();
			fbloqueo = true;
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception occurred actualizando el estado del usuario", e);
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

	public Usuario encontrarUsuario(Integer idUsuario) {
		String sql = "select login, " +
		"password, estado, nombre, apellido, puesto, fec_Creacion, fec_Caducidad, telefono, email, dni, tipo " +
		"from T_USUARIO " +
		"where idUsuario = ? "; 
		 
		Usuario usuario = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idUsuario);
			rs = ps.executeQuery();
			usuario = mapUsuario(rs, idUsuario);
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception occurred encontrando al usuario", e);
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
		return usuario;
	}
	
	private Usuario mapUsuario(ResultSet rs, int idUsuario) throws SQLException {
		Usuario usuario = null;
		while (rs.next()) {
			if (usuario == null) {
				
				String login = rs.getString("login");
				String password = rs.getString("password");
				String estado = rs.getString("estado");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				String puesto = rs.getString("puesto");
				Date fec_Creacion = rs.getDate("fec_Creacion");
				Date fec_Caducidad = rs.getDate("fec_Caducidad");
				String telefono = rs.getString("telefono");
				String email = rs.getString("email");
				String dni = rs.getString("dni");
				String tipo = rs.getString("tipo");
				usuario = new Usuario(login, password, estado, nombre, apellido, puesto, fec_Creacion, fec_Caducidad,
						telefono, email, dni, tipo);
				// set internal entity identifier (primary key)
				usuario.setIdUsuario(idUsuario);
			}
		}
		if (usuario == null) {
			// no rows returned - throw an empty result exception
			//throw new EmptyResultDataAccessException(1);
		}
		return usuario;
	}


	public boolean asignacionContraseña(Integer idUsuario, String password) {
		String sql = "update T_USUARIO SET password = ? where idUsuario = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		boolean fupdate = false;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, password);
			ps.setInt(2, idUsuario);
			ps.executeUpdate();
			fupdate = true;
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception occurred actualizando el estado del usuario", e);
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
		return fupdate;

	}

	
	
	

}
