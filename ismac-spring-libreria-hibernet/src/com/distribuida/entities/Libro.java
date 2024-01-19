package com.distribuida.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="libro")
public class Libro {
	
	//ATRIBUTOS
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id_libro")
		private int id_libro;
		@Column(name="titulo")
		private String titulo;
		@Column(name="editorial")
		private String editorial;
		@Column(name="num_paginas")
		private int num_paginas;
		@Column(name="edicion")
		private String edicion;
		@Column(name="idioma")
		private String idioma;
		@Column(name="fecha_publicacion")
		private Date fecha_publicacion;
		@Column(name="descripcion")
		private String descripcion;
		@Column(name="tipo_pasta")
		private String tipo_pasta;
		@Column(name="ISBN")
		private String ISBN;
		@Column(name="num_ejemplares")
		private int num_ejemplares;
		@Column(name="portada")
		private String portada;
		@Column(name="presentacion")
		private String presentacion;
		@Column(name="precio")
		private float precio;
		
		
		//CATEGORIA Y AUTOR
		@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
		@JoinColumn(name="id_categoria")	
		private Categoria categoria;  // CATEGORIA
		@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
		@JoinColumn(name="id_autor")	
		private Autor autor;// AUTOR	
		
		//METODO VACIO
		public Libro() {
			
		}
		
		

		


	public Libro(int id_libro, String titulo, String editorial, int num_paginas, String edicion, String idioma,
				Date fecha_publicacion, String descripcion, String tipo_pasta, String iSBN, int num_ejemplares,
				String portada, String presentacion, float precio) {
			
			this.id_libro = id_libro;
			this.titulo = titulo;
			this.editorial = editorial;
			this.num_paginas = num_paginas;
			this.edicion = edicion;
			this.idioma = idioma;
			this.fecha_publicacion = fecha_publicacion;
			this.descripcion = descripcion;
			this.tipo_pasta = tipo_pasta;
			ISBN = iSBN;
			this.num_ejemplares = num_ejemplares;
			this.portada = portada;
			this.presentacion = presentacion;
			this.precio = precio;
			this.categoria = categoria;
			this.autor = autor;
		}






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
		public String getISBN() {
			return ISBN;
		}
		public void setISBN(String ISBN) {   ///SET
			this.ISBN = ISBN;
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
					+ fecha_publicacion + ", descripcion=" + descripcion + ", tipo_pasta=" + tipo_pasta + ", ISBN="
					+ ISBN + ", num_ejemplares=" + num_ejemplares + ", portada=" + portada + ", presentacion="
					+ presentacion + ", precio=" + precio + ", categoria=" + categoria + ", autor=" + autor + "]";
		}
		
		

		
		

		
	

}
