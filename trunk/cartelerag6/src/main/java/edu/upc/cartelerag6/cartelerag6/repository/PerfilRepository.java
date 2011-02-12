package edu.upc.cartelerag6.cartelerag6.repository;

import java.util.ArrayList;
import edu.upc.cartelerag6.cartelerag6.model.Perfil;

public class PerfilRepository {

	private ArrayList<Perfil> perfiles;
	
	public PerfilRepository() {
		perfiles = new ArrayList<Perfil>();
	}
	
	public void registrarPerfil(Integer idPerfil, String nombre, Integer estado) {
		if (listarPerfil(idPerfil) == null) {
			Perfil nuevoPerfil = new Perfil(idPerfil, nombre, estado);
			perfiles.add(nuevoPerfil);
		}
		else{
			throw new RuntimeException("Perfil ya registrado");
		}
	}

	public void actualizarEstado(Integer idPerfil, Integer estado) {
		Perfil perfil = listarPerfil(idPerfil);
		if (perfil != null) {
			perfil.setEstado(estado);
		}
	}
	
	public ArrayList<Perfil> listarPerfiles() {
		return perfiles;
	}
	
	public Perfil listarPerfil(Integer idPerfil) {
		for (Perfil perfil: perfiles) {
			if ((perfil.getIdPerfil().equals(idPerfil))) {
				return perfil;
			}
		}
		return null;
	}
	
	public void eliminarComentario(Integer idPerfil) {
		Perfil perfil = listarPerfil(idPerfil);
		if (perfil != null) {
			perfiles.remove(perfil);
		}
	}	
}
