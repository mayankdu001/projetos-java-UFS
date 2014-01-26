/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo_Ram;

/**
 * 
 * @author Alan
 */
public class Pessoa {
	private int matricula;
	private String nome;
	private char sexo;
	private int rg;
	private int cpf;
	private String rua;
	private String cidade;
	private int telefone;

	public Pessoa(int matricula, String nome, String rua, String cidade,
			int telefone) {

		this.matricula = matricula;
		this.nome = nome;
		this.rua = rua;
		this.cidade = cidade;
		this.telefone = telefone;

	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;

	}

	public int getMatricula() {
		return matricula;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public char getSexo() {
		return sexo;
	}

	public void setRg(int rg) {
		this.rg = rg;

	}

	public int getRg() {
		return rg;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getCpf() {
		return cpf;
	}

	public void setEndereco(String rua) {
		this.rua = rua;
	}

	public String getEndereco() {
		return rua;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getTelefone() {
		return telefone;
	}

}