package Exe21_06_13;

public class Gerentes extends Funcionarios {
	private String setor;

	public Gerentes(String f_nome, int f_idade, char f_sexo, String f_Cargo,
			double f_Salario, String setor) {
		super(f_nome, f_idade, f_sexo, f_Cargo, f_Salario);
		this.setor = setor;
	}

	public Gerentes() {
		super();
		setor = null;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

}
