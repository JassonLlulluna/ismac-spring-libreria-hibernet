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
	
		
		List<Cliente> clientes=clienteDAO.findAll();
		
		
		//System.out.println(clientes.toString());
		
		for(Cliente cliente :clientes) {
			System.out.println(cliente.toString());
			
		}
		
		
		context.close();

		
		
	}

}
