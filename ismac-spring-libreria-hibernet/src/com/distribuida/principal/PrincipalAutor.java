package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Cliente;
import java.util.List;

public class PrincipalAutor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		AutorDAO autorDAO = context.getBean("autorDAOImpl",AutorDAO.class);
	
		List<Autor> autores = autorDAO.findAll();
		
		for(Autor autor :autores) {
			System.out.println(autor.toString());
			
		}
		
		
		context.close();
	}

}
