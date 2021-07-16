package com.isidrocorp.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.isidrocorp.projeto.model.Cliente;
import com.isidrocorp.projeto.repo.ClienteRepo;

@RestController
public class ClienteController {
	
	@Autowired
	private ClienteRepo repo;
	
	@GetMapping("/clientes")
	public java.util.List<Cliente> index(){
		return (java.util.List<Cliente>) repo.findAll();
	}
	
	@GetMapping("/clientes/{codigo}")
	public ResponseEntity<Cliente> show(@PathVariable int codigo){
		var cliente = repo.findById(codigo).orElse(null);
		return ResponseEntity.ok(cliente);
	}
}
