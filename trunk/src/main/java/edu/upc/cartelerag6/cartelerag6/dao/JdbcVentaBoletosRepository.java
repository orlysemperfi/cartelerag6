package edu.upc.cartelerag6.cartelerag6.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.upc.cartelerag6.cartelerag6.model.Detalle_Venta;
import edu.upc.cartelerag6.cartelerag6.model.Venta;
import edu.upc.cartelerag6.cartelerag6.repository.VentaBoletosRepository;

@Service
public class JdbcVentaBoletosRepository implements VentaBoletosRepository {
	@Autowired
	private DataSource dataSource;

	
	public Integer registrarVenta(Date fecha, Double importeImpuesto,
			Double importeTotal, String tipoPago, int idUsuario) {
		
		String sql = "insert into T_VENTA (fecha, importeimpuesto, importetotal, tipopago)  values (?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);

			ps.setDate(1, fecha);
			ps.setDouble(2, importeImpuesto);
			ps.setDouble(3, importeTotal);
			ps.setString(1, tipoPago);
			ps.execute();

			try {
				String sql2 = "CALL IDENTITY();";
				PreparedStatement ps2 = null;
				ResultSet rs = null;
				ps2 = conn.prepareStatement(sql2);
				rs = ps2.executeQuery();
				if (rs.next()) {
					int indiceVenta = rs.getInt(1);
					return indiceVenta;
					}				
			}
			catch (SQLException e) {
				throw new RuntimeException("Error al insertar detalle de venta.", e);
			}
		
			return 0;
		
		} catch (SQLException e) {
			throw new RuntimeException("Error al insertar cabecera de venta.", e);
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

	public Boolean registrarDetalleVenta(int idVenta, int idProducto,
			int horario, int cantidad, Double importe) {
		String sql = "insert into T_DETALLE_VENTA (idventa, idproducto, idhorario, cantproducto, importe)  values (?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);

			ps.setInt(1, idVenta);
			ps.setInt(2, idProducto);
			ps.setInt(3, horario);
			ps.setInt(4, cantidad);
			ps.setDouble(5, importe);			
			ps.execute();

		
			return true;
		
		} catch (SQLException e) {
			throw new RuntimeException("Error al insertar detalle de venta.", e);
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

	public Boolean eliminarItem(int idVenta, int idItem) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean eliminarVenta(int idVenta) {
		// TODO Auto-generated method stub
		return null;
	}


	public ArrayList<Venta> obtenerVentas() {
		String sql = "select * " +
		"from T_VENTA ";
		
		ArrayList<Venta> ventas = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			ventas = mapVentas(rs);
		} catch (SQLException e) {
			throw new RuntimeException("Error al obtener ventas.", e);
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
		return ventas;
	}

	private ArrayList<Venta>  mapVentas(ResultSet rs) throws SQLException {
		Venta venta = null;
		ArrayList<Venta> ventas = new ArrayList<Venta>(); 
		while (rs.next()) {
			if (venta == null) {
				Integer idVenta = rs.getInt("idventa");
				Date fecha = rs.getDate("fecha");
				Double importeImpuesto = rs.getDouble("importeimpuesto");
				Double importeTotal = rs.getDouble("importetotal");
				String tipoPago = rs.getString("tipopago");
				
				venta = new Venta(idVenta, fecha, importeImpuesto, importeTotal, tipoPago);
				if (venta != null){ 
					ventas.add(venta);
					venta = null;
				}
				
			}
		}
		return ventas;
	}	
	
	
	public ArrayList<Detalle_Venta> obtenerDetalleVentas(int idVenta) {
		// TODO Auto-generated method stub
		return null;
	}


}
