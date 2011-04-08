package edu.upc.cartelerag6.cartelerag6.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.upc.cartelerag6.cartelerag6.model.Sala;
import edu.upc.cartelerag6.cartelerag6.repository.SalaRepository;
import edu.upc.cartelerag6.cartelerag6.service.SalaService;
import java.util.List;

@Service
public class SalaServiceImpl implements SalaService {

	@Autowired
	private SalaRepository repository;
	
	public List<Sala> obtenerTodasSalas() {		
		return repository.obtenerTodasSalas();
	}

}
