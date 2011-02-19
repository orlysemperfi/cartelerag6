package edu.upc.cartelerag6.cartelerag6;

import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import edu.upc.cartelerag6.cartelerag6.model.Producto;
import edu.upc.cartelerag6.cartelerag6.repository.MerchandizingRepository;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations={
				"classpath:test-infrastructure-config.xml",
				"classpath:application-config.xml"})
public class MerchandizingTest {
	
	@Autowired
	private MerchandizingRepository merchandizingRepository;

	
	@Test
	public void testMostrarProductosPelicula() {
		ArrayList<Producto>  p1;
		p1 = merchandizingRepository.mostrarProductosPelicula(1);
		assertNotNull(p1);
		assertEquals(true, p1.size() > 0);
	}
}
