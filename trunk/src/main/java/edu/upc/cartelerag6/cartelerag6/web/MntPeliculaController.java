package edu.upc.cartelerag6.cartelerag6.web;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.upc.cartelerag6.cartelerag6.model.Pelicula;
import edu.upc.cartelerag6.cartelerag6.service.PeliculaService;

@Controller
public class MntPeliculaController {

	@Autowired
    PeliculaService service;
	
    public PeliculaService getUsuarioService() {
        return service;
    }

    public void setUsuarioService(PeliculaService service) {
        this.service = service;
    }

    @RequestMapping(value="/admin/mnt_peliculas")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
      request.setAttribute("peliculas", service.obtenerTodasPeliculas());
      return new ModelAndView("/admin/mnt_peliculas");
  }

  public ModelAndView insertar(HttpServletRequest request, HttpServletResponse response) {
      return new ModelAndView("/admin/mnt_peliculas_insert");
  }

  public ModelAndView doInsertar(HttpServletRequest request, HttpServletResponse response) {
	  String nomPelicula = request.getParameter("nomPelicula");
	  String anioProduccion =  request.getParameter("anioProduccion"); 
	  String duracion =   request.getParameter("duracion"); 
	  String paisOrigen   = request.getParameter("paisOrigen");
	  String genero  = request.getParameter("genero"); 
	  String tipoEmision  = request.getParameter("tipoEmision"); 
	  String flagSubtitulo = request.getParameter("flagSubtitulo");
	  int flagComentario = 1; 
	  String publicoObjetivo  = request.getParameter("publicoObjetivo"); 
	  String sinopsis =  request.getParameter("sinopsis");
	  java.sql.Date fecIniCartelera = Date.valueOf("2011-04-09"); 
	  java.sql.Date fecFinCartelera = Date.valueOf("2011-04-09");
	  String estado = request.getParameter("estado");
	  String poster = request.getParameter("poster"); 
	  String trailer	=  request.getParameter("trailer");
	  
	  return null;

	  /*
	  Pelicula pelicula = new Pelicula();
      Usuario vo = new Usuario();
      vo.setIdUsuario(request.getParameter("idUsuario"));
      vo.setClave(request.getParameter("clave"));
      vo.setNombres(request.getParameter("nombres"));
      return new ModelAndView(new RedirectView("usuarios_mantener.htm", true));
      */
  }

  public ModelAndView doInsertar2(HttpServletRequest request, HttpServletResponse response) {
/*
      Usuario vo = new Usuario();
      vo.setIdUsuario(request.getParameter("idUsuario"));
      vo.setClave(request.getParameter("clave"));
      vo.setNombres(request.getParameter("nombres"));
     
      try {
          PrintWriter out = response.getWriter();
          out.println("Se insert&oacute; correctamente");
          out.close();
      } catch (IOException ex) {
          Logger.getLogger(UsuariosController.class.getName()).log(Level.SEVERE, null, ex);
      }
*/      
      return null;
      
  }
    
	
}
