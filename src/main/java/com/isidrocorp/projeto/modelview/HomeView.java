package com.isidrocorp.projeto.modelview;

import java.util.ArrayList;
import java.util.List;

public class HomeView {
	public String getMensagem() {
		return "Bem vindo a API do time JPA DESCOMPLICADO";
	}
	
	public List<String> getEndpoints() {
		var lista = new ArrayList<String>();
		
		lista.add("/contas");
		lista.add("/contas/1");
		
		lista.add("/clientes");
		lista.add("/clientes/1");
		
		return lista;
	}

}
