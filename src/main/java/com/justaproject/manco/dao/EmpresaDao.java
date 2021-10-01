package com.justaproject.manco.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.justaproject.manco.model.Empresa;

@Repository
public interface EmpresaDao extends CrudRepository<Empresa, String>{

	//List<Empresa> findByLocalidad(String codPostal);
	//List<Empresa> findByCnae(String codCNAE);

}
