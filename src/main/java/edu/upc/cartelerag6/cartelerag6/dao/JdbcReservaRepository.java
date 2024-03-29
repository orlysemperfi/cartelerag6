package edu.upc.cartelerag6.cartelerag6.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import edu.upc.cartelerag6.cartelerag6.model.Reserva;
import edu.upc.cartelerag6.cartelerag6.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;


@Repository
public class JdbcReservaRepository extends JdbcDaoSupport implements ReservaRepository {

	@Autowired
	public JdbcReservaRepository(DataSource dataSource){
		setDataSource(dataSource);
	}
	
	
	public boolean  registarReserva(int idReserva, String cliente,String pelicula, String sala, String horario, int nroEntradas, String tipoPago, String direccionEnvio,java.sql.Date fecha) {
		String sql = "insert into T_RESERVA ( " +
		 " cliente, pelicula , sala, horario, nroEntradas, tipoPago, direccionEnvio,fecha) " +
		 " values (?,?,?,?,?,?,?,?)";
		getJdbcTemplate().update(sql, cliente, pelicula, sala, horario, nroEntradas, tipoPago, direccionEnvio,fecha);
		return true;
	};

	public boolean  eliminaReserva(int idReserva) {
		String sql = "delete from T_RESERVA where idReserva = ? ";
		getJdbcTemplate().update(sql, idReserva);
		return true;
	};

	public List<Reserva> obtenerTodasReservas() {
		String sql = "select * from T_RESERVA";
		List<Reserva> 
		  reservas = getJdbcTemplate().query(sql, 
				  	new ReservaRowMapper());
		return reservas;
	}

	private class ReservaRowMapper 
	     implements ParameterizedRowMapper<Reserva>{

		public Reserva mapRow(ResultSet rs, int rowNum)
				throws SQLException {
			Reserva reserva = null;
			int idReserva = rs.getInt("idReserva");
			String cliente = rs.getString("cliente");
			String pelicula = rs.getString("pelicula");
			String sala = rs.getString("sala");
			String horario = rs.getString("horario");
			int nroEntradas = rs.getInt("nroEntradas");
			String tipoPago = rs.getString("tipoPago");
			String direccionEnvio = rs.getString("direccionEnvio");
			Date fecha = rs.getDate("fecha");
			reserva = new Reserva(idReserva, cliente, pelicula , sala, horario, nroEntradas, tipoPago, direccionEnvio,fecha);
			return reserva;
		}		
	}

	
}
