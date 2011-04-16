package edu.upc.cartelerag6.cartelerag6.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.upc.cartelerag6.cartelerag6.model.Pelicula;
import edu.upc.cartelerag6.cartelerag6.model.Usuario;
import edu.upc.cartelerag6.cartelerag6.service.PeliculaService;
import edu.upc.cartelerag6.cartelerag6.service.UsuarioService;


@Controller
public class HomeController {
	
	@Autowired
	PeliculaService service;
	UsuarioService service1;
	
	@RequestMapping(value="/")
	public String index(Model model){
		
		List<Pelicula> peliculas = service.obtenerTodasPeliculas(); 
		model.addAttribute("data", peliculas);
		
		return "home";
	}
	
	
	
	
	@RequestMapping(value="/home")
	public String index1(Model model){
		System.out.println("Ingresó al controler");
		//home = service1.validacionUsuario(idUsuario);
		
		//return VIEW_REDIRECT_HOME + "?id="+idUsuario;
		model.addAttribute("usuario", new Usuario());
		return "/login";
	}



}
