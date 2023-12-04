package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Cliente;

@Repository
public class AutorDAOImpl implements AutorDAO {
	

	@Autowired
	private SessionFactory sessionFactory;
	
	
	//USO LENGUAJE SQL
	
	@Override
	@Transactional
	public List<Autor> findAll() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		
		//SELECT * FROM AUTOR AS AU; SQL
		//SELECT AU FROM AUTOR AU;  HQL
		List<Autor> autores = session.createQuery("SELECT au from Autor au",Autor.class).getResultList();;
		return autores;
	}
	
	

	@Override
	public Autor findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	@Override
	public void add(Autor autor) {
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public void up(Autor autor) {
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
