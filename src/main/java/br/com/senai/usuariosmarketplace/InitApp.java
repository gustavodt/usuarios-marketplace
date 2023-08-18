package br.com.senai.usuariosmarketplace;

import br.com.senai.usuariosmarketplace.core.dao.ManagerDb;

public class InitApp {

	public static void main(String[] args) {
	ManagerDb.getInstance().getConexao();
	System.out.println("Conectou ao banco");

	}

}
