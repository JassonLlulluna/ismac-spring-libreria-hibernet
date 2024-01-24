package com.distribuida.principalDTO;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.LibroService;
import com.distribuida.entities.Libro;

public class PrincipalLibroDTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");
		LibroService libroService = context.getBean("libroServiceImpl",LibroService.class);
		
		
		//ADD
	// Service.add(0, "titulo", "editorial", 22,"edicion", "idioma", new Date(), "descrp", "pasta", "isbn", 0, "portafa", "presentacion", 22.22, 1);
		libroService.add(0, "t", "e", 12, "e", "i", new Date(), "d", "t", "is", 22, "p", "p", (float) 22.22, 1,1);
		
		
		
		//finAll
		List<Libro> libros=libroService.findAll();
		
		for(Libro libro:libros) {
			System.out.println(libro.toString());
		}
		
		//FINDONE
		Libro libro =libroService.findOne(1);
		System.out.println(libro.toString());
		
		context.close();

	}
	
	


}
