package edu.upc.cartelerag6.cartelerag6.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.upc.cartelerag6.cartelerag6.model.Pelicula;
import edu.upc.cartelerag6.cartelerag6.service.PeliculaService;

@Controller
public class BoletosController {

	@Autowired
	PeliculaService service;
	
	@RequestMapping(value="/boletos")
	public String index(Model model){
		
		List<Pelicula> peliculas = service.obtenerTodasPeliculas(); 
		model.addAttribute("data", peliculas);
		
		return "vistaMantPeliculas";
	}
}
