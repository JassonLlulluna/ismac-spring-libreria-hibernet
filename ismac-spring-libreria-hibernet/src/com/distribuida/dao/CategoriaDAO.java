package com.distribuida.dao;

import com.distribuida.entities.Categoria;

public interface CategoriaDAO {
	
	public Categoria findOne(int id);
	
	public void add(Categoria categoria);
	
	public void up(Categoria categoria);
	
	public void del(int id);
	
}
