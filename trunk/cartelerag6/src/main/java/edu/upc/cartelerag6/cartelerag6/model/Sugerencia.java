package edu.upc.cartelerag6.cartelerag6.model;

import java.util.ArrayList;

public class Sugerencia {
	
	private String idSugerencia;
	private String descripcion;
	private String estado; //Habilitado - Deshabilitado
	private String fecha_registro;
	private String fecha_atencion;
	private String flag_atencion; //Atendido - Desatendido
	private ArrayList<Sugerencia>sugerencias; 
	
	public Sugerencia(String idSugerencia, String descripcion, String estado,
			String fecha_registro, String fecha_atencion, String flag_atencion) {
	  this.idSugerencia = idSugerencia;
	  this.descripcion = descripcion;
	  this.estado = estado;
	  this.fecha_registro = fecha_registro;
	  this.fecha_atencion = fecha_atencion;
	  this.flag_atencion = flag_atencion;
	}
	public String getIdSugerencia() {
		return idSugerencia;
	}
	public void setIdSugerencia(String idSugerencia) {
		this.idSugerencia = idSugerencia;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public String getFecha_atencion() {
		return fecha_atencion;
	}
	public void setFecha_atencion(String fecha_atencion) {
		this.fecha_atencion = fecha_atencion;
	}
	public String getFlag_atencion() {
		return flag_atencion;
	}
	public void setFlag_atencion(String flag_atencion) {
		this.flag_atencion = flag_atencion;
	}
	
	//Registro de sugerencias
	public void registrarSugerencias(String Id, String descp, String estado, String fec_Regis, String fec_Aten, String flag ){
		buscarSugerencia(Id);
		Sugerencia sugerencia = new Sugerencia(Id, descp, estado, fec_Regis, fec_Aten, flag);
		sugerencias.add(sugerencia);
		
	}
	
	//Buscar sugerencias por código
	
	public void buscarSugerencia(String Id) throws RuntimeException{
		 for (Sugerencia sugerencia: sugerencias) {
			if (sugerencia.getIdSugerencia()== Id) {
				throw new RuntimeException("Código ya registrado");
			}
		}
		
		
	}
	
	//Buscar sugerencias desatendidas
	
	public ArrayList buscarSugerenciaAtencion() throws RuntimeException{
		String flag = "D";
		ArrayList lista = new ArrayList<Sugerencia>();
		Sugerencia sug;
		
		 for (Sugerencia sugerencia: sugerencias) {
			if (sugerencia.getFlag_atencion().equalsIgnoreCase(flag)) {
				sug = sugerencia;
				lista.add(sug);
			}
		}
		return lista;
	}
	
	//Bloquear sugerencias
	
	public void bloquearSugerencia(String Id) throws RuntimeException{
		 for (Sugerencia sugerencia: sugerencias) {
			if (sugerencia.getIdSugerencia().equals(Id)) {
				throw new RuntimeException("Código ya registrado");
			}
		}
		
		
	}


}
