package edu.upc.cartelerag6.cartelerag6.web;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.upc.cartelerag6.cartelerag6.model.Sala;
import edu.upc.cartelerag6.cartelerag6.service.SalaService;

@Controller
public class AdministracionController {
	@Autowired
	SalaService service;
	
	@RequestMapping(value="/Salas")
	public String index(Model model){
		
		List<Sala> salas = service.obtenerTodasSalas(); 
		model.addAttribute("data", salas);
		
		return "vistaSalas";
	}

}
