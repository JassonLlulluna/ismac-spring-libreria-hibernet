package com.distribuida.entities;

import org.springframework.stereotype.Component;

@Component
public class Categoria {
	
	
	//ATRIBUTOS
	private int id_categoria;
	private String categoria;
	private String descripcion;
	
	//NETODO CONSTRUCTOR VACIO
	public Categoria(){
		
	}

	
	
	//METODO SET Y GET
	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	
	
	//MOSTRAR LOS DATOS
	@Override
	public String toString() {
		return "Categoria [id_categoria=" + id_categoria + ", categoria=" + categoria + ", descripcion=" + descripcion
				+ "]";
	}
	
	
	

}
