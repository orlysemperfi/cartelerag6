package edu.upc.cartelerag6.cartelerag6;

import java.util.ArrayList;
import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import edu.upc.cartelerag6.cartelerag6.model.Producto;
import edu.upc.cartelerag6.cartelerag6.model.Venta;
import edu.upc.cartelerag6.cartelerag6.model.Solicitud;
import edu.upc.cartelerag6.cartelerag6.model.Detalle_Venta;
import edu.upc.cartelerag6.cartelerag6.repository.MerchandizingRepository;
import edu.upc.cartelerag6.cartelerag6.repository.ProductoRepository;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations={
				"classpath:test-infrastructure-config.xml",
				"classpath:application-config.xml"})
public class MerchandizingTest {
	
	@Autowired
	private MerchandizingRepository merchandizingRepository;
	
	@Autowired
	private ProductoRepository productoRepository;
	
	//@Test
	public void testMostrarProductosPelicula() {
		ArrayList<Producto>  p1;
		p1 = merchandizingRepository.mostrarProductosPelicula(1);
		assertNotNull(p1);
		assertEquals(true, p1.size() > 0);
	}

	public Solicitud cargaSolicitud() {
		Venta cabecera;
		cabecera = new Venta(1,Date.valueOf("2011-01-01"), "C");
		ArrayList<Detalle_Venta> detalle =  new ArrayList<Detalle_Venta>();
		detalle.add(new Detalle_Venta(1, 1, 1,null, 4, 80.00));
		detalle.add(new Detalle_Venta(1, 2, 1,null, 5, 100.00));
		//detalle.add(new Detalle_Venta(1, 3, null,1, 2, 40.00));
		Solicitud s1 = null;
		s1 = merchandizingRepository.LLenarCarrito(cabecera, detalle);
		return s1;
	}
	
	//@Test
	public void testLlenarCarrito() {
		Solicitud s1 = cargaSolicitud();
		assertEquals(true, s1.getDetalle().size() >= 2);
		assertEquals(1, s1.getDetalle().get(0).getIdProducto().intValue());
	}

	//@Test
	public void testObtenerProducto() {
		Producto p1;
		p1 = productoRepository.obtenerProducto(1);
		assertNotNull(p1);
		assertEquals(1, p1.getIdProducto().intValue());
	}	

	//@Test
	public void testObTenerTotalSolicitud() {
		Solicitud s1 = cargaSolicitud();
		Double dblTotal;
		dblTotal = merchandizingRepository.obtenerTotalSolicitud(s1);
		if (s1 != null) {System.out.println("valor= " + dblTotal.toString());}
		assertNotNull(s1);
		assertEquals( "180.0", dblTotal.toString());
	}

	@Test
	public void testRealizarVenta() {
		Solicitud s1 = cargaSolicitud();
		Boolean blnRpta;
		blnRpta = merchandizingRepository.realizarVenta(s1);
		assertEquals( true, blnRpta);
	}
	
	
}
