package br.com.senai.usuariosmarketplace.core.dao;

import br.com.senai.usuariosmarketplace.core.dao.postgres.DaoPostgresUsuario;

public class FactoryDao {

		private static FactoryDao instance;
	
		public DaoUsuario getDaoUsuario() {
			return new DaoPostgresUsuario();
		}
		
		public static FactoryDao getInstance()  {
			if (instance == null) {
				instance = new FactoryDao();
			}
			return instance;
		}
}
