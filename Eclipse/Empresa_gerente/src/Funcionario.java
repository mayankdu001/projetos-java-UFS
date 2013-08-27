public class Funcionario {

	private String nome;
	private int idade;
	private int cpf;
	private double salario;

	public Funcionario(String nome, int idade, int cpf, double salario) {

		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.salario = salario;

	}

	public void setNome(String nome, int idade) {
		this.idade = idade;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getCpf() {
		return cpf;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void exibirDados() {

		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("cpf: " + cpf);
		System.out.println("Salario: " + salario);
	}

}
