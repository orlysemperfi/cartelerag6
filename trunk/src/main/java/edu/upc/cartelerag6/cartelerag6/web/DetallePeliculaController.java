package edu.upc.cartelerag6.cartelerag6.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.upc.cartelerag6.cartelerag6.model.Pelicula;
import edu.upc.cartelerag6.cartelerag6.model.Producto;
import edu.upc.cartelerag6.cartelerag6.service.MerchandizingService;
import edu.upc.cartelerag6.cartelerag6.service.PeliculaService;

@Controller
public class DetallePeliculaController {

	@Autowired
	PeliculaService service;
	
	@Autowired
	MerchandizingService service1;
	
	@RequestMapping(value="/detalle")
	public String index(Model model){
		
		List<Pelicula> peliculas = service.MostrarDetallePeliculaActiva(1);
		List<Producto> productos = service1.mostrarProductosPelicula(1);
		model.addAttribute("data", peliculas);
		model.addAttribute("data1", productos);
		
		return "vistaDetallePleicula";
	}
}
