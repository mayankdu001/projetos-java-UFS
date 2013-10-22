/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo_Ram;

/**
 * 
 * @author Alan
 */
public class Funcionario extends Pessoa {
	private double salario;
	private String setor;
	private String cargo;
	private String dateAdmissao;
	private String dateDemissão;
	private String dataAtual;

	public Funcionario(int matricula, String nome, char sexo, int rg, int cpf,
			String endereco, int telefone, double salario, String setor,
			String cargo, String dateAdmissao, String datedemissao, String dataAtual) {
		super(matricula, nome, sexo, rg, cpf, endereco, telefone);
		this.salario = salario;
		this.setor = setor;
		this.cargo = cargo;
		this.dateAdmissao = dateAdmissao;
		this.dateDemissão = dateDemissão;
		this.dataAtual = dataAtual;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setDateAdmissao(String dateAdmissao) {
		this.dateAdmissao = dateAdmissao;
	}

	public String getDateAdmissao() {
		return dateAdmissao;
	}

	public void setDateDemissao(String dateDemissao) {
		this.dateDemissão = dateDemissao;
	}

	public String getDatedemissao() {
		return dateDemissão;
	}
	public void setDataAtual(String dataAtual){
		this.dataAtual = dataAtual;
		
	}
	public String getDataAtual(){
		return dataAtual;
	}

	public double calcularDecimo(String admissao, String dataAtual) {

		int admi = Integer.parseInt(admissao);
		int demi = Integer.parseInt(dataAtual);
		double decimo = (salario / 12) * (demi - admi);

		return decimo;

	}

	public double calcularFerias(String admissao, String dateAtual) {
		int admi = Integer.parseInt(admissao);
		int atual = Integer.parseInt(dateAtual);
		double ferias = ((salario / 12) + salario / 36) * (atual - admi);
		return ferias;

	}

}
