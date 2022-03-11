package br.com.lucasrocha.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.lucasrocha.ecommerce.model.Pedido;

public interface PedidoDAO extends CrudRepository<Pedido, Integer> {

}
