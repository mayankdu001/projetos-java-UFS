public class Administrativo extends Assistentes {
	private String turno;
	private double addNoturno;

	public Administrativo(String nome, int idade, int cpf, double salario,
			int matricula, String turno, double addNoturno) {
		super(nome, idade, cpf, salario, matricula);
		this.turno = turno;
		this.addNoturno = addNoturno;

	}

	public void setTurno(String turno) {

		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setAddNoturno(double addSalarial) {
		this.addNoturno = addSalarial;
	}

	public double getAddNoturno() {
		return addNoturno;
	}

	public double calculoNoturno(double addNoturno) {
		double total = 0;
		if (turno.equals("noite")) {
			total = getSalario() + addNoturno;
		}
		return total;
	}

	@Override
	public void exibirDados() {

		super.exibirDados();
		System.out.println("turno: " + turno);
		System.out.println("Adicional noturno: " + calculoNoturno(addNoturno));
	}

}
