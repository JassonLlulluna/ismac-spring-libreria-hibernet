package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Factura;

public interface FacturaDAO {
	
	public List<Factura> findAll();
	public  Factura findOne(int id );
	public  void add (Factura autor);
	public  void up (Factura autor );	
	public  void del (int id );

}
