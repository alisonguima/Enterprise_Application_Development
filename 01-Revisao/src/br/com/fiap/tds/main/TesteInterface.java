package br.com.fiap.tds.main;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.dao.FuncionarioDao;
import br.com.fiap.tds.dao.FuncionarioMySqlDao;
import br.com.fiap.tds.dao.FuncionarioOracleDao;

// View (JSP) <-> Servlet (FuncionarioDao) <-> DAO <-> Banco de Dados

public class TesteInterface {

	public static void main(String[] args) {
		
		//Instanciar um objeto do tipo FuncionarioDao
		FuncionarioDao oracle = new FuncionarioOracleDao();
		FuncionarioDao mysql = new FuncionarioMySqlDao();
		
		//Chamar o método de atualizar funcionário
		oracle.atualizar(new Funcionario());
		mysql.atualizar(new Funcionario());
		
	}
}
