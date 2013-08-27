public class Assistentes extends Funcionario {

	private int matricula;

	public Assistentes(String nome, int idade, int cpf, double salario,
			int matricula) {
		super(nome, idade, cpf, salario);
		this.matricula = matricula;

	}

	public void matricula(int matricula) {
		this.matricula = matricula;
	}

	public int matricula() {

		return matricula;
	}

	
	@Override
	public void exibirDados() {
		
		System.out.println("matricula: "+matricula);
		super.exibirDados();
		
	}

}
