package br.com.senai.usuariosmarketplace;

import br.com.senai.usuariosmarketplace.core.service.UsuarioService;

public class InitApp {

	public static void main(String[] args) {
		UsuarioService service = new UsuarioService();
		System.out.println(service.removerAcentoDo("João da Silva"));
		System.out.println(service.fracionar("João da Silva e Albuquerque"));
		System.out.println(service.gerarLoginPor("José da PQP"));
		System.out.println(service.gerarHashDa("12312312"));
	}

}
