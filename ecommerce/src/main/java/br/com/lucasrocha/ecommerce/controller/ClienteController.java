package br.com.lucasrocha.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucasrocha.ecommerce.dao.ClienteDAO;
import br.com.lucasrocha.ecommerce.model.Cliente;

@RestController
public class ClienteController {
	
	@Autowired
	private ClienteDAO dao;
	
	@GetMapping("/clientes")
	public List<Cliente> recuperarTodos(){
		List<Cliente> lista;
		lista = (List<Cliente>)dao.findAll();
		return lista;
	}
}
