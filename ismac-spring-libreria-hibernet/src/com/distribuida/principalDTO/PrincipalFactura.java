package com.distribuida.principalDTO;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

public class PrincipalFactura {
	public static void main(String[] args) {
	
		
		//iniciamos el contenedor
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		//interface podemos gestionar factura PRINCIPIO DE SUSTITUCION
		
		FacturaDAO facturaDAO = context.getBean("facturaDAOImpl",FacturaDAO.class);
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);
		
		
		
		//CRUD
		
		//ADD
		Cliente cliente=clienteDAO.findOne(1);
		Factura factura = new Factura(0,"FAC-0062",new Date(),123.36,14.60,140.56,cliente);
		//facturaDAO.add(factura);
		
		//UP
//		Cliente cliente1=clienteDAO.findOne(2);
//		Factura factura1= new Factura(86,"FAC-0062",new Date(),123.369,14.609,140.569,cliente1);
//		facturaDAO.up(factura1);
//		
		
		//UP
		Cliente cliente1=clienteDAO.findOne(1);
		Factura factura1= new Factura(9,"FAC-0036",new Date(),999,999,999,cliente1);
		//facturaDAO.up(factura1);
		
		
		//DEL
		//Factura factura2 = facturaDAO.findOne(86);
		//facturaDAO.del(86);
		
		facturaDAO.del(16);
		
		//FIND ALL
		List<Factura> facturas = facturaDAO.findAll();
		
		//FINONE
//		Factura factura =facturaDAO.findOne(2);
//		System.out.println(factura.toString());
		
		//IMPRESION
		for(Factura item :facturas) {
			System.out.println(item.toString());
			
		}
		
		
		
		//CERRAR CONTENEDOR
		context.close();
		
	}

}
