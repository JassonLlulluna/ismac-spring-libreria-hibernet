package com.distribuida.entities;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="cliente")
public class Cliente {
	
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cliente")
	private int id_cliente;
	@Column(name="cedula")
	private String cedula;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido")
	private String apellido;
//	@Column(name="edad")
//	private int edad;
//	@Column(name="fecha_nac")
//	private Date fecha_nac; // date
	@Column(name="direccion")
	private String direccion;
	@Column(name="telefono")
	private String telefono; // string
	@Column(name="correo")
	private String correo;
	
	
	
	//METODO CONSTRUCTOR VACIO
	public Cliente() {
	
	}
	
	


	
	public Cliente(int id_cliente, String cedula, String nombre, String apellido, String direccion, String telefono,
			String correo) {
	
		this.id_cliente = id_cliente;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
	}
	
	





	//METODOS SET Y GET ESTABLECER Y MOSTRAR
	public int getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


//	public int getEdad() {
//		return edad;
//	}
//
//
//	public void setEdad(int edad) {
//		this.edad = edad;
//	}
//
//
//	public Date getFecha_nac() {
//		return fecha_nac;
//	}
//
//
//	public void setFecha_nac(Date fecha_nac) {
//		this.fecha_nac = fecha_nac;
//	}
//

	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	
	@PostConstruct
	public void despuesCreacion() {
		System.out.println("Despues de la creacion del bean");
	}

	@PreDestroy
	public void antesDestruccion() {
		System.out.println("Antes de la destruccion del bean");
	}
	
	
	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido="
				+ apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + "]";
	}
	

	
	
	
	
	
	

}
