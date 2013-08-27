package ProjetoHeranca;

public class Aluno extends Pessoa {

	private int matricula;
	private double notas;
	private int salas;
	private String turmas;

	public Aluno(String a_nome, int a_idade, char a_sexo, int a_matricula,
			double a_notas, int a_salas, String a_turmas) {
		super(a_nome, a_idade, a_sexo);

		this.matricula = matricula;
		this.notas = notas;
		this.salas = salas;
		this.turmas = turmas;

	}

	public Aluno() {
		super();
		matricula = 0;
		notas = 0.0;
		salas = 0;
		turmas = null;

	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}

	public int getSalas() {
		return salas;
	}

	public void setSalas(int salas) {
		this.salas = salas;
	}
	
	

}
