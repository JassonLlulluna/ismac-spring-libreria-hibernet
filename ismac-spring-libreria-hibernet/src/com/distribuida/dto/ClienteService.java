package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.Cliente;

public interface ClienteService {
	
	
	public List<Cliente> findAll();
	
	public Cliente findOne(int id);
	
	
	
	//AUMENTAR EL FIND ALL EN 
	//PASAMOS LOS DATOS DEL CLIENTE 
	public void add(int id_cliente, String cedula, String nombre, String apellido, String direccion, String telefono,
			String correo);
	
	public void up(int id_cliente, String cedula, String nombre, String apellido, String direccion, String telefono,
			String correo);
	
	public void del(int id);
	
	

}
