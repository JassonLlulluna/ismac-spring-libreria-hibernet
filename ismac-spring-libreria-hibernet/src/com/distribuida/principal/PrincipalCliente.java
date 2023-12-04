package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;
import java.util.List;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);
	
		
		
		//CRUD

		//ADD
//		Cliente cliente1 = new Cliente(0,"1566464","nombre","apellido","direccion","tele","correo");
//		clienteDAO.add(cliente1);
		
		//UP
//		Cliente cliente2 = new Cliente(39,"1566464","Paul","Llulluna","Tumbaco","2954445454","correo@gmail.com");
//		clienteDAO.up(cliente2);
		
		//DEL
//		Cliente cliente3 = new Cliente(39,"1566464","Paul","Llulluna","Tumbaco","2954445454","correo@gmail.com");
		clienteDAO.del(39);
		
		//FIND ALL
		List<Cliente> clientes = clienteDAO.findAll();

		
		for(Cliente cliente :clientes) {
			System.out.println(cliente.toString());
			
		}
		//FIND ONE
		Cliente cliente = clienteDAO.findOne(1);
		
		
//		System.out.println(cliente.toString());
//		 
		
		
		
		//System.out.println(clientes.toString());

		
		
		context.close();

		
		
	}

}
