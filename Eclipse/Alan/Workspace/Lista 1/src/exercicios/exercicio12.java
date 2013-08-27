package exercicios;

import javax.swing.JOptionPane;

public class exercicio12 {
	public void lernumero(){
		int idade = Integer.parseInt(JOptionPane.showInputDialog("informe a idade"));
		double cpf = Double.parseDouble(JOptionPane.showInputDialog(null,"informe o CPF"));
		float rg = Float.parseFloat(JOptionPane.showInputDialog("informe o RG"));
		byte numerocasa = Byte.parseByte(JOptionPane.showInputDialog("informe o numero da casa"));
		JOptionPane.showMessageDialog(null, " \n CPF: " + cpf
                							+ "\n RG: " + rg + 
                							"\n IDADE: " + idade + 
                							"\n NUMERO DA CASA: " + numerocasa);

		
	}
	public void lerdados() {

		String estado;

		String nome = JOptionPane.showInputDialog("informe o nome");
		char sexo = JOptionPane.showInputDialog("informe o sexo").charAt(0);
		boolean ec = Boolean.parseBoolean(JOptionPane.showInputDialog("informe estado civil TRUE(SOLTEIRO) ou FALSE(CASADO)"));
		String end = JOptionPane.showInputDialog("informe o endereço");
		if (ec == true) {
			estado = "solteiro";
		} else {
			estado = "casado";

		}

		JOptionPane.showMessageDialog(null, "NOME: " + nome + 
				                             "\n SEXO: " + sexo + 
				                             "\n ESTADO CIVIL: " + estado + 
				                             "\n ENDERECO: " + end);

	}

	public static void main(String[] args) {
		
		exercicio12 objeto = new exercicio12();
      int op = Integer.parseInt(JOptionPane.showInputDialog("1-ler dados \n" + "2-ler numero"));
		if (op == 1) {
			objeto.lerdados();	
			objeto.lernumero();
		} else {
			objeto.lernumero();
			objeto.lerdados();	
			

		}
		
        
	}
	
	
	
}
