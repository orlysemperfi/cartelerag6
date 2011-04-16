package edu.upc.cartelerag6.cartelerag6.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import edu.upc.cartelerag6.cartelerag6.model.Pelicula;
import edu.upc.cartelerag6.cartelerag6.model.Usuario;
import edu.upc.cartelerag6.cartelerag6.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public class JdbcUsuarioRepository extends JdbcDaoSupport implements UsuarioRepository{
	@Autowired
	public JdbcUsuarioRepository(DataSource dataSource){
		setDataSource(dataSource);
	}
	
	public Usuario validacionUsuario(Integer idUsuario, String password) {
		System.out.println("Ingresó al jdbc");
		System.out.println("Ingresó al jdbc,usuario:"+ idUsuario);
		Usuario usuario = null;
		String sql = "select idUsuario, login, password, nombre, apellido " +
		"from T_USUARIO " +
		"where idUsuario = ? and password = ?";
		try{
			usuario =
			getJdbcTemplate().queryForObject(sql,
					new Object[]{idUsuario,password}, 
					new UsuarioRowMapper());
		}catch(EmptyResultDataAccessException ex){
			return null;
		}
		return usuario;
	}
	
	private class UsuarioRowMapper 
    implements ParameterizedRowMapper<Usuario>{

	public Usuario mapRow(ResultSet rs, int rowNum)
			throws SQLException {
		Usuario usuario = null;
		int idUsuario = rs.getInt("idUsuario");
		String login = rs.getString("login");
		String password = rs.getString("password");
		String nombre = rs.getString("nombre");
		String apellido = rs.getString("apellido");
		usuario = new Usuario(idUsuario, login, password, nombre, apellido);
		System.out.println("Ingresó al jdbc usuario"+usuario);
		return usuario;
	}		
}

	public boolean registrarUsuario(String login,
			String password, String estado, String nombre, String apellido, String puesto, java.sql.Date fec_Creacion, java.sql.Date fec_Caducidad,
			String telefono, String email, String dni, String tipo) {
		
		
		
		String sql = "insert into T_USUARIO (login,password,estado,nombre,apellido,puesto,fec_Creacion, fec_Caducidad,telefono,email,dni,tipo) values " +
		" (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		getJdbcTemplate().update(sql, 
				login,
				password,
				estado,
				nombre,
				apellido,
				puesto,
				fec_Creacion,
				fec_Caducidad,
				telefono,
				email,
				dni,
				tipo);	
		return true;
		
	}

	public boolean bloqueoUsuario(Integer idUsuario) {
		// TODO Auto-generated method stub
		return false;
	}

	public Usuario encontrarUsuario(Integer idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean asignacionContraseña(Integer idUsuario, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
