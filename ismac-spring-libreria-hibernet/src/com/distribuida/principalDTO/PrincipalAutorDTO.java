package com.distribuida.principalDTO;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.ClienteDAO;
import com.distribuida.dto.AutorService;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Cliente;
import java.util.List;

public class PrincipalAutorDTO {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		AutorService autorService = context.getBean("autorServiceImpl",AutorService.class);
	
		
		//CRUD
		
		//AD
//		Autor autor1 = new Autor(0,"nombre","apellido","pais","direccion","telefono","correo");
//		autorDAO.add(autor1);
		autorService.add(0,"nombre1","apellido1","pais1","direccion1","telefono1","correo1");
		//UPDATE
//		//UP

////		
//		//DELETE
//		autorDAO.del(54);
		
		
		//FINDONE
		Autor autor =  autorService.findOne(1);
//		System.out.println(autor.toString());
//		
		//FINDALL
		
		List<Autor> autores = autorService.findAll();
		
		for(Autor item :autores) {
			System.out.println(item.toString());
			
		}
		
		
		context.close();
	}

}
