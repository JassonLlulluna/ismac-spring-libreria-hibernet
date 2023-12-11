package com.distribuida.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="factura")
public class Factura {
	
	
	//ATRIBUTOS
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id_factura")
		private int id_factura; 
		@Column(name="num_factura")
		private String num_factura; 
		@Column(name="fecha")
		private int fecha;  
		@Column(name="total_neto")
		private float total_neto; 
		@Column(name="iva")
		private float iva; 
		@Column(name="total")
		private float total;
		
		
		//NO REMOVE, CONFLICTO CON FK
		@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
		@JoinColumn(name="cliente")
		
		
		
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
		
		
		public String getNum_factura() {
			return num_factura;
		}


		public void setNum_factura(String num_factura) {
			this.num_factura = num_factura;
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
