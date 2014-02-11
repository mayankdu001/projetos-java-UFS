import java.util.Scanner;

public class PrincipalEdson {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String diciplina;
		String professor;
		String matricula;
		String aluno;
		String chave;

		Exercicio1 list = null;
		int test;
		boolean entrou = false;

		do {
			System.out.println("1 - Criar Lista");
			System.out.println("2 - Inserir Alunos");
			System.out.println("3 - Remover");
			System.out.println("4 - Imprimir");
			System.out.println("0 - Sair");
			System.out.println("informe a opçao ");
			test = read.nextInt();

			switch (test) {
			// case de cadastro de diciplinas
			case 1:
				System.out.println("Informe o nome da Diciplia");
				diciplina = read.next();
				System.out.println("Informe o nome do professor");
				professor = read.next();


				list = new Exercicio1(diciplina, professor, 0); 

				break;
			// case de cadastro de alunosi
			case 2:
				System.out.println("Informe o nome da Matricula");
				matricula = read.next();
				System.out.println("Informe o nome do Aluno");
				aluno= read.next();
				
				list.inserirDepois(matricula, aluno);

	
	
	

				break;
			case 3:
				System.out.println("Informe o nome da Matricula para a remoção ");
				chave= read.next();

				list.Remover(chave);
				break;
			case 4:
				
				list.Mostrar();
				break;
			case 0:
				System.out.println("Programa finalizado");
				break;
			}

		} while (test != 0);

	}
}