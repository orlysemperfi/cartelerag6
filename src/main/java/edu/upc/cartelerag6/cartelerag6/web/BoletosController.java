package edu.upc.cartelerag6.cartelerag6.web;

import java.sql.Date;
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
import edu.upc.cartelerag6.cartelerag6.model.Producto;
import edu.upc.cartelerag6.cartelerag6.model.Reserva;
import edu.upc.cartelerag6.cartelerag6.service.ReservaService;

@Controller
public class BoletosController {
	private static final String VIEW_REDIRECT_BOLETO = "redirect:/boletos";

	@Autowired
	ReservaService service;
	
	@RequestMapping(value="/boletos")
	public String index(Model model){
		
		List<Reserva> reservas = service.obtenerTodasReservas(); 
		model.addAttribute("data", reservas);
		
		return "boletos";
	}

	@RequestMapping(value="/Eliminaboletos" , method=RequestMethod.GET)
	public String Elimina(@RequestParam("id") Integer id, Model model){
		
		List<Reserva> reservas = service.obtenerTodasReservas(); 
		model.addAttribute("data", reservas);
		
		System.out.println("valor: entro" + id);
		return "boletos";
	}

	@RequestMapping(value="/boletos", method=RequestMethod.POST)
	public String grabaReserva(HttpServletRequest request, HttpServletResponse response){
		boolean bRpta = false;
		String cliente = request.getParameter("cboClientes"); 
		String pelicula = request.getParameter("cboPelicula");
		String sala = request.getParameter("cboSala");
		String horario = request.getParameter("cboHorario");
		int nroEntradas = Integer.valueOf(request.getParameter("txtNro"));
		String tipoPago = request.getParameter("cboTipoPago");
		String direccionEnvio = request.getParameter("txtDirecion");
		Date fecha = Date.valueOf("2011-01-01");
		
		bRpta = service.registarReserva(0,cliente,pelicula,  sala, horario, nroEntradas, tipoPago, direccionEnvio, fecha);
		return VIEW_REDIRECT_BOLETO;
	}
}
