public class Tecnico extends Assistentes {

	double bonusSalarial;

	public Tecnico(String nome, int idade, int cpf, double salario,
			int matricula, double bonusSalarial) {
		super(nome, idade, cpf, salario, matricula);

		this.bonusSalarial = bonusSalarial;

	}

	public void setBonus(double bonusSalarial) {
		this.bonusSalarial = getSalario() + bonusSalarial;

	}

	public double getBonus() {
		return bonusSalarial;
	}

	
	@Override
	public void exibirDados() {
		// TODO Auto-generated method stub
		super.exibirDados();
		System.out.println("Bonus Salarial: "+ getBonus());
		System.out.println("salario total: "+(getSalario()+bonusSalarial));
	}
	
	
}
