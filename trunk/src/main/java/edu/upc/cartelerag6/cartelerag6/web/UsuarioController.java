package edu.upc.cartelerag6.cartelerag6.web;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.opensymphony.module.sitemesh.html.tokenizer.Parser;


import edu.upc.cartelerag6.cartelerag6.model.Pelicula;
import edu.upc.cartelerag6.cartelerag6.model.Sala;
import edu.upc.cartelerag6.cartelerag6.model.Usuario;
import edu.upc.cartelerag6.cartelerag6.service.PeliculaService;
import edu.upc.cartelerag6.cartelerag6.service.SalaService;
import edu.upc.cartelerag6.cartelerag6.service.UsuarioService;

@Controller
public class UsuarioController {
	
	
	@Autowired
	UsuarioService service;
	
	
	
	@RequestMapping(value="/validarUsuario")
	public String validarUsuario(@RequestParam("idUsuario") Integer idUsuario,@RequestParam("password") String password, Model model){
		System.out.println("Ingresó al controler usuario");
		System.out.println("bean usuario:" + idUsuario + "bean password:"+ password);
		String direccion;
		
		Usuario usuario = service.validacionUsuario(idUsuario,password);
		
		System.out.println("usuario:" + usuario);
		
		if(usuario == null){
			direccion = "/login";
		}else{
			direccion = "/home";
		}
		
		model.addAttribute("usuario", usuario);
		
		return direccion;
	}
	
	@RequestMapping(value="/registro")
	public String index(Model model){
		System.out.println("Ingresó al controler registro");
		//home = service1.validacionUsuario(idUsuario);
		
		//return VIEW_REDIRECT_HOME + "?id="+idUsuario;
		
		return "/registro";
	}
	
	@RequestMapping(value="/registrarUsuario")
	public String registrarUsuario(@ModelAttribute("usuario") Usuario usuario, Model model){
		System.out.println("Ingresó al controler registrar usuario");
		System.out.println("bean usuario:" + usuario);
		
		String login = usuario.getLogin();
		String password = usuario.getPassword();
		String nombre = usuario.getNombre();
		String apellido = usuario.getApellido();
		String telefono = usuario.getTelefono();
		String email = usuario.getEmail();
		String dni = usuario.getDni();
		String estado = "A";
		java.sql.Date fec_Creacion = Date.valueOf("2011-04-09");
		java.sql.Date fec_Caducidad = Date.valueOf("2011-04-09"); 
		String puesto = "usuario";
		String tipo = "I";
		
		boolean flag = service.registrarUsuario(login, password, estado, nombre, apellido, puesto, fec_Creacion, fec_Caducidad, telefono, email, dni, tipo);
		
		return "/home";
	}
	
}
	
	