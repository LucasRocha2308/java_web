package br.com.lucasrocha.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucasrocha.ecommerce.dao.ProdutoDAO;
import br.com.lucasrocha.ecommerce.model.Produto;

@RestController
public class ProdutoController {

	@Autowired
	private ProdutoDAO dao;
	
	@GetMapping("/produtos")
	public List<Produto> recuperarTodos(){
		List<Produto> lista;
		lista = (List<Produto>)dao.findAll();
		return lista;
	}
	
//	@GetMapping("/produto1")
//	public Produto recuperarProduto() {
//		return dao.findById(1).get();
//	}
	
}
