package com.distribuida.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

//HACEMOS BEAN 
@Repository
public class FacturaDAOImpl implements FacturaDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Factura> findAll() {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		
		return session.createQuery("from Factura",Factura.class).getResultList();
	}

	@Override
	@Transactional
	public Factura findOne(int id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		
		return session.get(Factura.class,id);
	
	}

	@Override
	@Transactional
	public void add(Factura factura) {
		Session session = sessionFactory.getCurrentSession();
		//ADD 0
		// Cliente cliente = new cliente(0,"1566464","nombre","apellido","direccion","tele","correo");
		session.saveOrUpdate(factura);	

	}

	@Override
	@Transactional
	public void up(Factura factura) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getCurrentSession();//
		
		session.saveOrUpdate(factura);
		
		
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();//
		session.delete(findOne(id));

	}

}
