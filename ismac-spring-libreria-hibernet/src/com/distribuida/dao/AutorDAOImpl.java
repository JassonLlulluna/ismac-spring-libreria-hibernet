package com.distribuida.dao;

import java.util.List;

import javax.persistence.Column;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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
	@Transactional
	public Autor findOne(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		
		Query<Autor> query =session.createQuery("SELECT au FROM Autor au WHERE idAutor =: keyIdAutor",Autor.class);
		query.setParameter("keyIdAutor", id);
		
		return query.getSingleResult();
	}
	
	

	@Override
	@Transactional
	public void add(Autor autor) {
		// TODO Auto-generated method stub
		
		
		Session session=sessionFactory.getCurrentSession();
		
		//HQL INSERT TO VALUES no admite
		//INSERT INTO .... SELECT ... 
		
		session.saveOrUpdate(autor);

		
		
		
	}
	
	

	@Override
	@Transactional
	public void up(Autor autor) {
		// TODO Auto-generated method stub
		
		
		Session session=sessionFactory.getCurrentSession();
		Query<Autor> query =session.createQuery("UPDATE Autor SET nombre=:nombre, apellido=:apellido, pais=:pais, direccion=:direccion, telefono=:telefono, correo=:correo WHERE idAutor=:idAutor " ,Autor.class);

		
		query.setParameter("nombre", autor.getNombre());
		query.setParameter("apellido", autor.getApellido());
		query.setParameter("direccion", autor.getDireccion());
		query.setParameter("telefono", autor.getTelefono());
		query.setParameter("correo", autor.getCorreo());
		query.setParameter("idAutor", autor.getIdAutor());
		
	
		query.executeUpdate();
		
	}
	
	

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
