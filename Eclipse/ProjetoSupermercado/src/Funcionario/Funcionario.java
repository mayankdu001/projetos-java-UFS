package Funcionario;

import Principal.Pessoa;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario extends Pessoa {

	private String senha;

	public Funcionario(int codigo, String nome, String sobreNome, int cpf,
			int rg, String data, String hora, String senha) {
		super(codigo, nome, sobreNome, cpf, rg, data, hora);
		this.senha = senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}


}
