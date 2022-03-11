package br.com.lucasrocha.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.lucasrocha.ecommerce.model.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {
	
}
