package Cliente;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import Principal.Pessoa;

public class Cliente extends Pessoa {
	Date date = new Date();

	private String rua;
	private int numeroRua;
	private String bairro;
	private String cidade;
	private int telefone;

	public Cliente(int codigo, String nome, String sobreNome, int cpf, int rg,String data, String hora,
			String rua, int numeroRua, String bairro, String cidade,
			int telefone) {
		super(codigo, nome, sobreNome, cpf, rg, data, hora);

		this.rua = rua;
		this.numeroRua = numeroRua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.telefone = telefone;

	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumeroRua() {
		return numeroRua;
	}

	public void setNumeroRua(int numeroRua) {
		this.numeroRua = numeroRua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	
}