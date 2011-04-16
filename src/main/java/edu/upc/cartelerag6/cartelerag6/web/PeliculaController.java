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
public class PeliculaController {
	private static final String VIEW_REDIRECT_PELICULA = "redirect:/peliculas";

	@Autowired
	PeliculaService service;
	
	@RequestMapping(value="/peliculas")
	public String index(Model model){
		
		List<Pelicula> peliculas = service.obtenerTodasPeliculas(); 
		model.addAttribute("data", peliculas);
		
		return "vistaMantPeliculas";
	}
	@RequestMapping(value="/Lpeliculas")
	public String listaPeliculas(Model model){
		
		List<Pelicula> peliculas = service.obtenerTodasPeliculas(); 
		model.addAttribute("data", peliculas);
		
		return "vistaMantPeliculas";
	}
	@RequestMapping(value="/peliculas", method=RequestMethod.POST)
	public String grabaPelicula(HttpServletRequest request, HttpServletResponse response){
		boolean bRpta = false;
		String nomPelicula = "Los Intocables";
		String anioProduccion = "1987";
		String duracion = "119 minutos";
		String paisOrigen = "USA";
		String genero = "DRAMA";
		String tipoEmision = "";  
		String flagSubtitulo= "";
		int flagComentario= 1;
		String publicoObjetivo= "";
		String sinopsis= "Chicago, años 30. Época de la Ley Seca. El idealista agente federal Eliot Ness persigue implacablemente al gángster Al Capone. La falta de pruebas le impide acusarlo de asesinato, extorsión y comercio ilegal de alcohol, pero encontrará un medio para inculparlo por otra clase de delitos. (FILMAFFINITY)";
		java.sql.Date fecIniCartelera = java.sql.Date.valueOf("2011-01-01");
		java.sql.Date fecFinCartelera = java.sql.Date.valueOf("2012-01-01");
		String poster= "resources/images/nueva_pelicula.jpg";
		String trailer= "ruta trailer";
		String estado = "Activo";
		
		//bRpta = service.registarPelicula(nomPelicula, anioProduccion, duracion, paisOrigen, genero, tipoEmision, flagSubtitulo, flagComentario, publicoObjetivo, sinopsis, fecIniCartelera,fecFinCartelera, estado, poster, trailer);
		System.out.println(nomPelicula);
		System.out.println(bRpta );
		return VIEW_REDIRECT_PELICULA;
	}
	


}
