package com.isidrocorp.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isidrocorp.projeto.model.Conta;
import com.isidrocorp.projeto.repo.ContaRepo;

@RestController
public class ContaController {
	
	@Autowired
	private ContaRepo repo;
	
	@GetMapping("/contas")
	public java.util.List<Conta> recuperarTudo(){
		return (java.util.List<Conta>) repo.findAll();
		
	}
	
	@GetMapping("/teste")
	public String exibir() {
		return "Meu Springboot funciona";
	}

}
