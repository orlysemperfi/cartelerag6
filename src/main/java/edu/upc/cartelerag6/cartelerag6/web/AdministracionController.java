package edu.upc.cartelerag6.cartelerag6.web;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.upc.cartelerag6.cartelerag6.model.Sala;
import edu.upc.cartelerag6.cartelerag6.service.SalaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class AdministracionController {
	private static final String VIEW_REDIRECT_SALA = "redirect:/Salas";
	
	@Autowired
	SalaService service;
	
	@RequestMapping(value="/Salas")
	public String index(Model model){
		
		List<Sala> salas = service.obtenerTodasSalas(); 
		model.addAttribute("data", salas);
		
		return "vistaSalas";
	}

	@RequestMapping(value="/Salas", method=RequestMethod.POST)
	public String grabaSala(HttpServletRequest request, HttpServletResponse response){
		boolean bRpta = false;
		Integer  numAsientos = Integer.valueOf(request.getParameter("txtAsientos")) ;
		String estado = request.getParameter("cboEstado");
		
		bRpta = service.registrarSala(numAsientos, estado);
		
		return VIEW_REDIRECT_SALA;
	}
}
