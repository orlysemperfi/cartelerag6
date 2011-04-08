package edu.upc.cartelerag6.cartelerag6.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.upc.cartelerag6.cartelerag6.model.Producto;
import edu.upc.cartelerag6.cartelerag6.repository.MerchandizingRepository;
import edu.upc.cartelerag6.cartelerag6.service.MerchandizingService;
import java.util.List;

@Service
public class MerchandizingServiceImpl implements MerchandizingService{
	@Autowired
	private MerchandizingRepository repository;
	
	public List<Producto> mostrarProductosPelicula(Integer idPelicula) {		
		return repository.mostrarProductosPelicula(idPelicula);
	}
}
