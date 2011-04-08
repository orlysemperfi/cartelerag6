package edu.upc.cartelerag6.cartelerag6.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import edu.upc.cartelerag6.cartelerag6.model.Sala;
import edu.upc.cartelerag6.cartelerag6.repository.SalaRepository;


@Repository
public class JdbcSalaRepository extends JdbcDaoSupport implements SalaRepository {

	@Autowired
	public JdbcSalaRepository(DataSource dataSource){
		setDataSource(dataSource);
	}

	public List<Sala> obtenerTodasSalas() {
		String sql = "select * from T_SALA";
		List<Sala> 
		  salas = getJdbcTemplate().query(sql, 
				  	new SalaRowMapper());
		return salas;
	}

	private class SalaRowMapper implements ParameterizedRowMapper<Sala>{

		public Sala mapRow(ResultSet rs, int rowNum)
				throws SQLException {
			Sala sala = null;
			int idSala = rs.getInt("idSala");
			int numAsiento = rs.getInt("numAsiento");
			String estado = rs.getString("estado");
			sala = new Sala(idSala, numAsiento,estado);
			return sala;
		}		
	}
}