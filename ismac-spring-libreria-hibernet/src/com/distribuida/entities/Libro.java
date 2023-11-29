package com.distribuida.entities;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Libro {
	
	//ATRIBUTOS
		private int id_libro;
		private String titulo;
		private String editorial;
		private int num_paginas;
		private String edicion;
		private String idioma;
		private Date fecha_publicacion;
		private String descripcion;
		private String tipo_pasta;
		private String isbn;
		private int num_ejemplares;
		private String portada;
		private String presentacion;
		private float precio;
		
		
		//CATEGORIA Y AUTOR
		@Autowired
		private Categoria categoria;  // CATEGORIA
		@Autowired
		private Autor autor;// AUTOR	
		
		
		
	//METODOS SET Y GET
		
		public int getId_libro() {
			return id_libro;
		}
		public void setId_libro(int id_libro) {   ///SET
			this.id_libro = id_libro;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {   ///SET
			this.titulo = titulo;
		}
		public String getEditorial() {
			return editorial;
		}
		public void setEditorial(String editorial) { ///SET
			this.editorial = editorial;
		}
		public int getNum_paginas() {
			return num_paginas;
		}
		public void setNum_paginas(int num_paginas) { ///SET
			this.num_paginas = num_paginas;
		}
		public String getEdicion() {
			return edicion;
		}
		public void setEdicion(String edicion) {  ///SET
			this.edicion = edicion; 
		}
		public String getIdioma() {
			return idioma;
		}
		public void setIdioma(String idioma) {  ///SET
			this.idioma = idioma;
		}
		public Date getFecha_publicacion() {
			return fecha_publicacion;
		}
		public void setFecha_publicacion(Date fecha_publicacion) { ///SET
			this.fecha_publicacion = fecha_publicacion;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {   ///SET
			this.descripcion = descripcion;
		}
		public String getTipo_pasta() {
			return tipo_pasta;
		}
		public void setTipo_pasta(String tipo_pasta) {   ///SET
			this.tipo_pasta = tipo_pasta;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {   ///SET
			this.isbn = isbn;
		}
		public int getNum_ejemplares() {
			return num_ejemplares;
		}
		public void setNum_ejemplares(int num_ejemplares) {  ///SET
			this.num_ejemplares = num_ejemplares;
		}
		public String getPortada() {
			return portada;
		}
		public void setPortada(String portada) {  ///SET
			this.portada = portada;
		}
		public String getPresentacion() {
			return presentacion;
		}
		public void setPresentacion(String presentacion) {    ///SET
			this.presentacion = presentacion;
		}
		public float getPrecio() {
			return precio;
		}
		public void setPrecio(float precio) {   ///SET
			this.precio = precio;
		}
	
		
		
		
		
		//INYECTAMOS POR SET Y GET A CATEGORIA Y AUTOR
		public Categoria getCategoria() {
			return categoria;
		}
		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		public Autor getAutor() {
			return autor;
		}
		public void setAutor(Autor autor) {
			this.autor = autor;
		}
		
		
		
		
		
		//MOSTRAMOS LOS DATOS
		@Override
		public String toString() {
			return "Libro [id_libro=" + id_libro + ", titulo=" + titulo + ", editorial=" + editorial + ", num_paginas="
					+ num_paginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fecha_publicacion="
					+ fecha_publicacion + ", descripcion=" + descripcion + ", tipo_pasta=" + tipo_pasta + ", isbn="
					+ isbn + ", num_ejemplares=" + num_ejemplares + ", portada=" + portada + ", presentacion="
					+ presentacion + ", precio=" + precio + ", categoria=" + categoria + ", autor=" + autor + "]";
		}
		
		

		
		

		
	

}
