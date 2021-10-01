package com.justaproject.manco.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justaproject.manco.dao.EmpresaDao;
import com.justaproject.manco.interfaces.EmpresaInterface;
import com.justaproject.manco.model.Empresa;


@Service
@Transactional
public class EmpresaService implements EmpresaInterface{

	
	@Autowired
	EmpresaDao dao;
	
	@Override
	public Empresa getOne(String CIF) {
		return dao.findById(CIF).get();
	}

	@Override
	public List<Empresa> getAll() {
		return (List<Empresa>) dao.findAll();
	}

	@Override
	public void save(Empresa empresa) {
		dao.save(empresa);
		
	}

	@Override
	public void update(Empresa empresa, String CIF) {
		dao.findById(CIF).ifPresent((x)->{
			dao.save(empresa);
			});
		
	}

	@Override
	public void deleteOne(String CIF) {
		dao.deleteById(CIF);
		
	}

}
