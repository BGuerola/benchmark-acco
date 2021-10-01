package com.justaproject.manco.interfaces;

import java.util.List;

import com.justaproject.manco.model.Empresa;

public interface EmpresaInterface {
	
	public Empresa getOne(String CIF);
	public List<Empresa>getAll();
	public void save(Empresa entidad);
	public void update(Empresa entidad, String CIF);
	public void deleteOne(String CIF);
	
}
