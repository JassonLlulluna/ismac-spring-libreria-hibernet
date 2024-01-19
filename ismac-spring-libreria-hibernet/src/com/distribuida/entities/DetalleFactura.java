package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="detalle_factura")
public class DetalleFactura {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_detallefactura")
	private int id_detallefactura; 
	@Column(name="cantidad")
	private int cantidad; 
	@Column(name="subtotal")
	private float subtotal;
	
	
	//FACTURA Y LIBRO
	@Column(name="subtotal")
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
