package Data21_06_13;

class Pessoa {
	public String nome; // variavel nome da classe pessoa
	public int idade; // variavel idade da classe pessoa
	public char sexo; // variavel sexo da classe pessoa

	Pessoa(String p_nome, int p_idade, char p_sexo) {
		/*
		 * p_nome p-idade p_sexo parametros onde q vai receber o valor da classe
		 * q chamar a classe pessoa
		 */
		this.nome = p_nome; // o parametro p_nome vai passar o valor dele para a
							// variavel nome
		this.idade = p_idade;// p parametro p_idade vai passar o valor dele para
								// a variavel idade
		this.sexo = p_sexo; // parametro p_sexo vai passar o valor dele para a
							// variavel sexo
	}

}

class Funcionario extends Pessoa {// classe funcionario esta erdando os valores
									// da classe pessoa
	String cargo;// variavel da classe funcionario onde ela tem algo amais q a
					// classe pessoa não tem
	double Salario; // variavel da classe funcionario onde ela tem algo amais q
					// a classe pessoa não tem

	public Funcionario(String f_nome, int f_idade, char f_sexo, String f_cargo,
			double f_salario) {
		/*
		 * String f_nome int f_idade char f_sexoString f_cargodouble f_salario{
		 * o valor não vai pra a classe pessoa pois ele ja esta salvando os
		 * valores dos parametros nas variaveis cargo e salario q é exlusiva da
		 * classe funcionario} parametros onde vai receber o valor da classe q
		 * chamar a classe funcionario
		 */

		super(f_nome, f_idade, f_sexo);
		// vai pegar o valor do parametro da classe
		// funcionario e mandar para o parametro da classe pessoa

		this.cargo = f_cargo;// parametro f_pcargo vao passar o valor pra a
								// variavel cargo
		this.Salario = f_salario;// parametro f_Salario vao passar o valor pra a
									// variavel salario }
	}
}

class Gerente extends Funcionario {
	String setor;// variavel da classe gerente onde não tem nada em comum com a
					// com as outras classes

	public Gerente(String g_nome, int g_idade, char g_sexo, String g_cargo,
			double g_salario, String g_setor) {
		/*
		 * String g_nome int g_idade char g_sexo String g_cargo double g_salario
		 * String g_setor { não vai pra a classe funcionario pois ele ja esta
		 * salvando o valor do parametro na variavel setor q é exlusiva da
		 * classe gerente} parametros da classe gerente e da classe onde ele
		 * esta erdando
		 */
		super(g_nome, g_idade, g_sexo, g_cargo, g_salario);
		// parametros onde vai mandar o valor pra o parametro da classe
		// funcionario
		this.setor = g_setor;// parametro g_setor vai passar o valor para a
								// variavel setor

	}
}

public class Heranca {
	public static void main(String[] args) {
		// metodo principal

		Gerente g1 = new Gerente("Alan", 21, 'M', "Gerente de Projetos", 10000,
				"CPD");
		// g1 objeto do tipo da classe gerente

		System.out.println("Nome : " + g1.nome);
		System.out.println("Idade : " + g1.idade);
		System.out.println("Sexo : " + g1.sexo);
		System.out.println("Cargo : " + g1.cargo);
		System.out.println("Salário : " + g1.Salario);
		System.out.println("Setor : " + g1.setor);
	}
}
