package edu.upc.cartelerag6.cartelerag6.repository;

import java.util.ArrayList;
import edu.upc.cartelerag6.cartelerag6.model.Perfil;

public interface PerfilRepository {
	public Perfil registrarPerfil(Integer idPerfil, String nomPerfil, String estado);
	public boolean inactivarPerfil(Integer idPerfil);
	public Perfil obtenerPerfil(Integer idPerfil);
	public boolean asignarPerfil_Usuario(Integer idPerfil, Integer idUsuario);
	public boolean inactivarPerfil_Usuario(Integer idPerfil, Integer idUsuario);
	public ArrayList obtenerListaPerfiles();
	
}
