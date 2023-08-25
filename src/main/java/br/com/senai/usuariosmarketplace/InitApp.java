package br.com.senai.usuariosmarketplace;

import br.com.senai.usuariosmarketplace.core.dao.ManagerDb;
import br.com.senai.usuariosmarketplace.core.domain.Usuario;

public class InitApp {

	public static void main(String[] args) {
		ManagerDb.getInstance().getConexao();
		System.out.println("Conecotu");
		Usuario usuario = new Usuario("jose.silva", "José da Silva", "jose23232");
		System.out.println(usuario.getLogin());
	}

}
