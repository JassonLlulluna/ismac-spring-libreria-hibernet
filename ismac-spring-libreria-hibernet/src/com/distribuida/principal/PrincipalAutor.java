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
	
		
		//CRUD
		
		//AD
//		Autor autor1 = new Autor(0,"nombre","apellido","pais","direccion","telefono","correo");
//		autorDAO.add(autor1);
		
		//UPDATE
//		//UP
		Autor autor2 = new Autor(54,"nombre1","apellido1","pais1","direccion1","telefono1","correo1");
		autorDAO.up(autor2);
		
		//FINDONE
//		Autor autor =  autorDAO.findOne(1);
//		System.out.println(autor.toString());
//		
		//FINDALL
		
		List<Autor> autores = autorDAO.findAll();
		
		for(Autor item :autores) {
			System.out.println(item.toString());
			
		}
		
		
		context.close();
	}

}
