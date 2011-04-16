package edu.upc.cartelerag6.cartelerag6.service.impl;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import edu.upc.cartelerag6.cartelerag6.model.Usuario;
import edu.upc.cartelerag6.cartelerag6.repository.UsuarioRepository;
import edu.upc.cartelerag6.cartelerag6.service.UsuarioService;



@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioRepository repository;
	

	public Usuario validacionUsuario(Integer idUsuario, String password) {
		System.out.println("Ingresó al service");
		return repository.validacionUsuario(idUsuario, password);
	}


	public boolean registrarUsuario(String login,
			String password, String estado, String nombre, String apellido, String puesto, Date fec_Creacion, Date fec_Caducidad,
			String telefono, String email, String dni, String tipo) {
		
		return repository.registrarUsuario(login, password, estado, nombre, apellido, puesto, fec_Creacion, fec_Caducidad, telefono, email, dni, tipo);
	}


}
