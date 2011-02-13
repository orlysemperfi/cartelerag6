package edu.upc.cartelerag6.cartelerag6.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
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
		// TODO Auto-generated method stub
		return false;
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
			throw new RuntimeException("SQL exception occured inserting reward record", e);
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
		// TODO Auto-generated method stub
		return false;
	}

	public Usuario encontrarUsuario(Integer idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean asignacionContraseña(Integer idUsuario) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	

}
