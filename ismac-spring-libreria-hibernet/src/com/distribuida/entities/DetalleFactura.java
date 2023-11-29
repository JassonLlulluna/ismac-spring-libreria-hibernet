package com.distribuida.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DetalleFactura {
	
	//ATRIBUTOS
	private int id_detallefactura; 
	private int cantidad; 
	private float subtotal;
	
	
	//FACTURA Y LIBRO
	@Autowired
	private Factura factura;  // FACTURA
	@Autowired
	private Libro libro;// LIBRO
	
	
	
	public DetalleFactura(){
		
	}
	
	//METODOS SET Y GET
	public int getId_detallefactura() {
		return id_detallefactura;
	}
	public void setId_detallefactura(int id_detallefactura) {
		this.id_detallefactura = id_detallefactura;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	
	
	
	//INYECTAMOS POR SET Y GET
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	
	
	//IMPRIMIR DATOS
	@Override
	public String toString() {
		return "DetalleFactura [id_detallefactura=" + id_detallefactura + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura + ", libro=" + libro + "]";
	}
	
	
	
	
	
	
	

}
