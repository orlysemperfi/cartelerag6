package edu.upc.cartelerag6.cartelerag6;

import org.junit.Test;

import edu.upc.cartelerag6.cartelerag6.repository.PerfilRepository;
import edu.upc.cartelerag6.cartelerag6.repository.PerfilRepositoryImpl;
import static org.junit.Assert.*;

public class PerfilTest {
	PerfilRepository perfilRepository = new PerfilRepositoryImpl();
	
	@Test
	public void PerfilSinRegistros() {
		assertEquals(0, perfilRepository.listarPerfiles().size());
	}

	@Test
	public void PerfilConUnRegistro() {
		perfilRepository.registrarPerfil(1, "Perfil Administrador 1", 1);
		assertEquals(1, perfilRepository.listarPerfiles().size());
	}
	
	@Test
	public void PerfilConVariosRegistros() {
		perfilRepository.registrarPerfil(1, "Perfil Administrador 1", 1);
		perfilRepository.registrarPerfil(2, "Perfil Administrador 2", 1);
		perfilRepository.registrarPerfil(3, "Perfil Administrador 3", 1);
		perfilRepository.registrarPerfil(4, "Perfil Administrador 4", 1);
		assertEquals(4, perfilRepository.listarPerfiles().size());
		try {
			perfilRepository.registrarPerfil(2, "Perfil Administrador 2", 1);	
		}
		catch(Exception ex){
			assertEquals("Perfil ya registrado", ex.getMessage());
		}
	}
	
	@Test
	public void EliminarComentario() {
		perfilRepository.registrarPerfil(1, "Perfil Administrador 1", 1);
		perfilRepository.registrarPerfil(2, "Perfil Administrador 2", 1);
		perfilRepository.registrarPerfil(3, "Perfil Administrador 3", 1);
		perfilRepository.registrarPerfil(4, "Perfil Administrador 4", 1);
		
		perfilRepository.eliminarPerfil(2);
		assertEquals(3, perfilRepository.listarPerfiles().size());
	}
	
	@Test
	public void ActualizarEstado() {
		perfilRepository.registrarPerfil(1, "Perfil Administrador 1", 1);
		perfilRepository.registrarPerfil(2, "Perfil Administrador 2", 1);
		perfilRepository.registrarPerfil(3, "Perfil Administrador 3", 1);
		perfilRepository.actualizarEstado(3, 0);
		assertEquals(Integer.valueOf(0), perfilRepository.listarPerfil(3).getEstado());
	}

}
