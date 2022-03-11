package br.com.lucasrocha.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.lucasrocha.ecommerce.model.Departamento;

public interface DepartamentoDAO extends CrudRepository<Departamento, Integer> {
	
}
