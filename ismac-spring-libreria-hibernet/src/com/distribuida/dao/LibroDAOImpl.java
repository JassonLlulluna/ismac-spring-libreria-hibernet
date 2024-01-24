package com.distribuida.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import com.distribuida.entities.Libro;

public class LibroDAOImpl implements LibroDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Libro> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Libro", Libro.class).getResultList();
		
	}

	@Override
	@Transactional
	public Libro findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Libro.class,id);
		
	}

	@Override
	@Transactional
	public void add(Libro libro) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(libro);

	}

	@Override
	@Transactional
	public void up(Libro libro) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(libro);

	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
		
	}

	@Override
	public List<Libro> findAll(String busqueda) {
		// TODO Auto-generated method stub
		
		 	Session session=sessionFactory.getCurrentSession();
		Query<Libro> query = session.createQuery("SELECT lb from Libro lb WHERE"
				+"lb.titulo LIKE : busqueda"
				+"lb.editorial LIKE : busqueda"
				+"lb.num_paginas LIKE : busqueda"
				+"lb.idioma LIKE : busqueda"
				+"lb.fecha_publicacion LIKE : busqueda"
				+"lb.descripcion LIKE : busqueda"
				+"lb.tipo_pasta LIKE : busqueda"
				+"lb.ISBN LIKE : busqueda"
				+"lb.num_ejemplares LIKE : busqueda"
				+"lb.portada LIKE : busqueda"
				+"lb.presentacion LIKE : busqueda"
				+"lb.precio LIKE : busqueda",Libro.class);
		
		query.setParameter("busqueda","%"+ busqueda+"%");
		
		return query.getResultList();
	
	}

}
