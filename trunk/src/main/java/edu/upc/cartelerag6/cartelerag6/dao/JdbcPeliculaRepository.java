package edu.upc.cartelerag6.cartelerag6.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import edu.upc.cartelerag6.cartelerag6.model.Pelicula;
import edu.upc.cartelerag6.cartelerag6.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;


@Repository
public class JdbcPeliculaRepository extends JdbcDaoSupport implements PeliculaRepository {

	@Autowired
	public JdbcPeliculaRepository(DataSource dataSource){
		setDataSource(dataSource);
	}
	
	public boolean registrarPelicula(String nomPelicula,
			String anioProduccion, String duracion, String paisOrigen,
			String genero, String tipoEmision, String flagSubtitulo,
			int flagComentario, String publicoObjetivo, String sinopsis,
			java.sql.Date fecIniCartelera, java.sql.Date fecFinCartelera, String estado,
			String poster, String trailer) {
		String sql = "insert into T_PELICULA (nomPelicula,anioProduccion, duracion, paisOrigen,genero, tipoEmision, flagSubtitulo,flagComentario, publicoObjetivo, sinopsis,fecIniCartelera, fecFinCartelera, estado,poster, trailer) values " +
		" (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		getJdbcTemplate().execute(sql);
		return true;
	}
	
	

	public List<Pelicula> obtenerTodasPeliculas() {
		String sql = "select * from T_PELICULA";
		List<Pelicula> 
		  peliculas = getJdbcTemplate().query(sql, 
				  	new PeliculaRowMapper());
		return peliculas;
	}

	
	public List<Pelicula>  MostrarDetallePeliculaActiva(Integer idPelicula) {
		String sql = "select idPelicula, nomPelicula,anioProduccion, duracion, paisOrigen,genero, tipoEmision, flagSubtitulo, flagComentario, publicoObjetivo, sinopsis, fecIniCartelera, fecFinCartelera, estado, poster, trailer " +
		"from T_PELICULA " +
		"where idPelicula = ? "; 
		List<Pelicula> 
		  peliculas = getJdbcTemplate().query(sql,
				    new Object[]{idPelicula}, 
				  	new PeliculaRowMapper());
		return peliculas;
	}

	public List<Pelicula> MostrarDetallePeliculaInactiva(Integer idPelicula) {
		String sql = "select idPelicula, nomPelicula,fecIniCartelera, fecFinCartelera, estado, poster" +
		"from T_PELICULA " +
		"where idPelicula = ? "; 
		List<Pelicula> 
		  peliculas = getJdbcTemplate().query(sql,
				    new Object[]{idPelicula}, 
				  	new PeliculaInactivaRowMapper());
		return peliculas;
	}

	private class PeliculaInactivaRowMapper 
    implements ParameterizedRowMapper<Pelicula>{

	public Pelicula mapRow(ResultSet rs, int rowNum)
			throws SQLException {
			Pelicula pelicula = null;
			int idPelicula = rs.getInt("idPelicula");
			String nomPelicula = rs.getString("nomPelicula");
			Date fecIniCartelera = rs.getDate("fecIniCartelera");
			Date fecFinCartelera = rs.getDate("fecFinCartelera");
			String estado = rs.getString("estado");
			String poster = rs.getString("poster");
			pelicula = new Pelicula(idPelicula, nomPelicula, fecIniCartelera, fecFinCartelera, estado, poster);
			return pelicula;
	}		
}
	
	private class PeliculaRowMapper 
	     implements ParameterizedRowMapper<Pelicula>{

		public Pelicula mapRow(ResultSet rs, int rowNum)
				throws SQLException {
			Pelicula pelicula = null;
			int idPelicula = rs.getInt("idPelicula");
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
			return pelicula;
		}		
	}

	
/*
	public Pelicula MostrarDetallePeliculaActiva(Integer idPelicula) {
		String sql = "select idPelicula, nomPelicula,anioProduccion, duracion, paisOrigen,genero, tipoEmision, flagSubtitulo, flagComentario, publicoObjetivo, sinopsis, fecIniCartelera, fecFinCartelera, estado, poster, trailer " +
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

	public Pelicula MostrarDetallePeliculaInactiva(Integer idPelicula) {
		String sql = "select idPelicula, nomPelicula,fecIniCartelera, fecFinCartelera, estado, poster" +
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
			pelicula = mapPeliculaInactiva(rs, idPelicula);
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

	private Pelicula mapPeliculaInactiva(ResultSet rs, int idPelicula) throws SQLException {
		Pelicula pelicula = null;
		while (rs.next()) {
			if (pelicula == null) {
				
				String nomPelicula = rs.getString("nomPelicula");
				Date fecIniCartelera = rs.getDate("fecIniCartelera");
				Date fecFinCartelera = rs.getDate("fecFinCartelera");
				String estado = rs.getString("estado");
				String poster = rs.getString("poster");
				pelicula = new Pelicula(idPelicula, nomPelicula, fecIniCartelera, fecFinCartelera, estado, poster);
			}
		}
		if (pelicula == null) {
			// no rows returned - throw an empty result exception
			//throw new EmptyResultDataAccessException(1);
		}
		return pelicula;
	}*/
}
