package edu.upc.cartelerag6.cartelerag6;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Iterator;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import edu.upc.cartelerag6.cartelerag6.model.Sugerencia;
import edu.upc.cartelerag6.cartelerag6.model.Usuario;
import edu.upc.cartelerag6.cartelerag6.repository.StubSugerenciaRepository;
import edu.upc.cartelerag6.cartelerag6.repository.SugerenciaRepository;


	public class SugerenciaTest extends TestCase{
	
	protected void setUp() throws Exception {
		// create stubs to facilitate fast in-memory testing with dummy data and no external dependencies
		//La interfase se transforma en clase.
		SugerenciaRepository sugerencia = new StubSugerenciaRepository();
		
	}
	
	public void testSugerencia() {
		SugerenciaRepository sugerencia = new StubSugerenciaRepository();
		assertNotNull(sugerencia.encontrarSugerencia("001"));
	}
	
	
	
		
}
