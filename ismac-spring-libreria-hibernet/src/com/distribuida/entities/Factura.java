package com.distribuida.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Factura {
	
	
	//ATRIBUTOS
		private int id_factura; 
		private int fecha;         
		private float total_neto; 
		private float iva; 
		private float total;
		
		//GENERAMOS CLIENTE
		@Autowired
		private Cliente cliente;  //CLIENTE
		

		
		//CONSTRUCTOR VACIO
		public Factura() {}
		
		
		//CONSTRUCTOR CON CLIENTE
		public Factura(Cliente cliente) {
			this.cliente=cliente;
		}
		
		
		
		
		//METODOS SET Y GET
		public int getId_factura() {
			return id_factura;
		}
		public void setId_factura(int id_factura) {
			this.id_factura = id_factura;
		}
		public int getFecha() {
			return fecha;
		}
		public void setFecha(int fecha) {
			this.fecha = fecha;
		}
		public float getTotal_neto() {
			return total_neto;
		}
		public void setTotal_neto(float total_neto) {
			this.total_neto = total_neto;
		}
		public float getIva() {
			return iva;
		}
		public void setIva(float iva) {
			this.iva = iva;
		}
		public float getTotal() {
			return total;
		}
		public void setTotal(float total) {
			this.total = total;
		}

		
	
		//INYECTAR POR SET Y GET A CLIENTE
		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		
		
		//IMPRIMIR DATOS 
		@Override
		public String toString() {
			return "Factura [id_factura=" + id_factura + ", fecha=" + fecha + ", total_neto=" + total_neto + ", iva="
					+ iva + ", total=" + total + ", cliente=" + cliente + "]";
		}
		
		
		
		
		
		
		
		

}
