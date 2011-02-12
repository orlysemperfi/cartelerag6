package edu.upc.cartelerag6.cartelerag6.repository;

import java.util.ArrayList;
import edu.upc.cartelerag6.cartelerag6.model.Perfil;

public interface PerfilRepository {
	public void registrarPerfil(Integer idPerfil, String nombre, Integer estado);
	public void actualizarEstado(Integer idPerfil, Integer estado);
	public ArrayList<Perfil> listarPerfiles();
	public Perfil listarPerfil(Integer idPerfil);
	public void eliminarPerfil(Integer idPerfil);
}
