package com.example.demo.batch.model;

public class Persona {
	
	private String primerNombre;
	private String apellido;
	private String telefono;
	
	
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Persona(String primerNombre, String apellido, String telefono) {
		super();
		this.primerNombre = primerNombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}



	public String getPrimerNombre() {
		return primerNombre;
	}



	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	@Override
	public String toString() {
		return "Persona [primerNombre=" + primerNombre + ", apellido=" + apellido + ", telefono=" + telefono + "]";
	}

	
	
	
	
	
}
