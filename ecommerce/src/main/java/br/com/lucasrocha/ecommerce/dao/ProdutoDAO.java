package br.com.lucasrocha.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.lucasrocha.ecommerce.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer>{
	
	// aqui terao as consultas customizadas
	
	
}
