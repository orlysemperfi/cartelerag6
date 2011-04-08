package edu.upc.cartelerag6.cartelerag6.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.upc.cartelerag6.cartelerag6.model.Pelicula;
import edu.upc.cartelerag6.cartelerag6.service.PeliculaService;


@Controller
public class HomeController {
	
	@Autowired
	PeliculaService service;
	
	@RequestMapping(value="/")
	public String index(Model model){
		
		List<Pelicula> peliculas = service.obtenerTodasPeliculas(); 
		model.addAttribute("data", peliculas);
		
		return "home";
	}


}
