package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;

public class LibroServiceImpl implements LibroService {
	
	@Autowired
	private LibroDAO libroDAO;
	@Autowired
	private AutorDAO autorDAO;
	@Autowired
	private CategoriaDAO categoriaDAO;

	@Override
	public List<Libro> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int idLibro, String titulo, String editorial, int numPaginas, String edicion, String idioma,
			Date fechaPublicacion, String descripcion, String tipoPasta, String iSBN, int numEjemplares, String portada,
			String presentacion, float precio,int idAutor, int idCategoria) {
		// TODO Auto-generated method stub
		Autor autor = autorDAO.findOne(idAutor);
		Categoria categoria = categoriaDAO.findOne(idCategoria);
		
		Libro libro = new Libro(idLibro, titulo, editorial, numPaginas, edicion, idioma,
				fechaPublicacion, descripcion, tipoPasta, iSBN, numEjemplares, portada,
				presentacion, precio);
		
		libro.setAutor(autor);
		libro.setCategoria(categoria);
		
		libroDAO.add(libro);
	}

	@Override
	public void up(int id_libro, String titulo, String editorial, int num_paginas, String edicion, String idioma,
			Date fecha_publicacion, String descripcion, String tipo_pasta, String iSBN, int num_ejemplares,
			String portada, String presentacion, float precio, int idAutor, int idCategoria) {
		// TODO Auto-generated method stub
		Autor autor = autorDAO.findOne(idAutor);
		Categoria categoria = categoriaDAO.findOne(idCategoria);
		
		Libro libro = new Libro(id_libro, titulo, editorial, num_paginas, edicion, idioma,
				fecha_publicacion, descripcion, tipo_pasta, iSBN, num_ejemplares, portada,
				presentacion, precio);
		
		libro.setAutor(autor);
		libro.setCategoria(categoria);
		
		libroDAO.up(libro);

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		libroDAO.del(id);

	}

	@Override
	public List<Libro> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return libroDAO.findAll();
	}

}
