package edu.upc.cartelerag6.cartelerag6.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import edu.upc.cartelerag6.cartelerag6.model.Pelicula;
import edu.upc.cartelerag6.cartelerag6.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JdbcPeliculaRepository implements PeliculaRepository{
	@Autowired
	private DataSource dataSource;
	

	public Pelicula MostrarDetallePeliculaActiva(Integer idPelicula) {
		String sql = "select login, " +
		"password, estado, nombre, apellido, puesto, fec_Creacion, fec_Caducidad, telefono, email, dni, tipo " +
		"from T_PELICULA " +
		"where idPelicula = ? "; 
		 
		Pelicula pelicula = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idPelicula);
			rs = ps.executeQuery();
			pelicula = mapPelicula(rs, idPelicula);
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception occurred encontrando la película", e);
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
		return pelicula;
	}
	
	private Pelicula mapPelicula(ResultSet rs, int idPelicula) throws SQLException {
		Pelicula pelicula = null;
		while (rs.next()) {
			if (pelicula == null) {
				
				String nomPelicula = rs.getString("nomPelicula");
				String anioProduccion = rs.getString("anioProduccion");
				String duracion = rs.getString("duracion");
				String paisOrigen = rs.getString("paisOrigen");
				String genero = rs.getString("genero");
				String tipoEmision = rs.getString("tipoEmision");
				String flagSubtitulo = rs.getString("flagSubtitulo");
				int flagComentario = rs.getInt("flagComentario");
				String publicoObjetivo = rs.getString("publicoObjetivo");
				String sinopsis = rs.getString("sinopsis");
				Date fecIniCartelera = rs.getDate("fecIniCartelera");
				Date fecFinCartelera = rs.getDate("fecFinCartelera");
				String estado = rs.getString("estado");
				String poster = rs.getString("poster");
				String trailer = rs.getString("trailer");
				pelicula = new Pelicula(idPelicula, nomPelicula,anioProduccion, duracion, paisOrigen,genero, tipoEmision, flagSubtitulo, flagComentario, publicoObjetivo, sinopsis, fecIniCartelera, fecFinCartelera, estado, poster, trailer);
				// set internal entity identifier (primary key)
				pelicula.setIdPelicula(idPelicula);
			}
		}
		if (pelicula == null) {
			// no rows returned - throw an empty result exception
			//throw new EmptyResultDataAccessException(1);
		}
		return pelicula;
	}


	public Pelicula MostrarDetallePeliculaInactiva(Integer idPelicula) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
