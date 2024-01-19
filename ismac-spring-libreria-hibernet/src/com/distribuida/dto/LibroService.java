package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;

public interface LibroService {
	
	public List<Libro> findAll();
	public  Libro findOne(int id );
	public  void add (int id_libro, String titulo, String editorial, int num_paginas, String edicion, String idioma,
			Date fecha_publicacion, String descripcion, String tipo_pasta, String iSBN, int num_ejemplares,
			String portada, String presentacion, float precio, int idAutor,  int idCategoria);
	public  void up (int id_libro, String titulo, String editorial, int num_paginas, String edicion, String idioma,
			Date fecha_publicacion, String descripcion, String tipo_pasta, String iSBN, int num_ejemplares,
			String portada, String presentacion, float precio, int idAutor, int idCategoria);	
	public  void del (int id );
	public List<Libro> findAll(String busqueda);

}
