/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo_Ram;

/**
 * 
 * @author Alan
 */
public class Fornecedor extends Pessoa {
	private int cnpj;

	public Fornecedor(int matricula, String nome, String rua, String cidade,
			int telefone, int cnpj) {
		super(matricula, nome, rua, cidade, telefone);
		this.cnpj = cnpj;

	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getCnpj() {
		return cnpj;
	}

}
