package Aula_01_08_13;
import java.util.Scanner;

public class Mamifero {

	String nome;
	String especie;
	int idade;
	double peso;
	int semana_Gestacao;

	public void andar() {
		System.out.println("animal andando");
	}

	public void comer() {
		System.out.println("animal comendo");
	}

	public void Gestacao() {
		semana_Gestacao = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String p_nome) {
		this.nome = p_nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String p_especie) {
		this.especie = p_especie;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int p_idade) {
		this.idade = p_idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double p_peso) {
		this.peso = p_peso;
	}

	public int getSemana_Gestacao() {
		return semana_Gestacao;
	}

	public void setSemana_Gestacao(int p_semanaGestacao) {
		this.semana_Gestacao = p_semanaGestacao;
	}

	public static void main(String[] args) {
		Scanner lerNome = new Scanner(System.in);

		Mamifero tudo = new Mamifero();
		tudo.setNome("boi");
		tudo.setEspecie("bovina");
		tudo.setIdade(12);
		tudo.setPeso(298.8);
		tudo.setSemana_Gestacao(0);

		System.out.println("nome; " + tudo.getNome());
		System.out.println("especie: " + tudo.getEspecie());
		System.out.println("idade: " + tudo.getIdade());
		System.out.println("peso: " + tudo.getPeso());
		System.out.println("semana de gestaçao: " + tudo.getSemana_Gestacao());

	}

}
