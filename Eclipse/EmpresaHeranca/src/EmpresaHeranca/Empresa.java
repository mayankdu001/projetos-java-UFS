package EmpresaHeranca;

import java.io.ObjectInputStream.GetField;

import javax.swing.JOptionPane;

public class Empresa {

	public static void main(String[] args) {

		Funcionario newFunc = new Funcionario("alan", 'm', 123132133, "baixo","seguranca", 2000);

		Funcionario newFuncionario = new Funcionario();

		System.out.println("com parametros ");

		System.out.println(newFunc.getNome());
		System.out.println(newFunc.getSexo());
		System.out.println(newFunc.getCpf());
		System.out.println(newFunc.getNivel()); 
		System.out.println(newFunc.getCargo());
		System.out.println(newFunc.getSalario());

		System.out.println();
		System.out.println();

		System.out.println("sem parametros");

		System.out.println(newFuncionario.getNome());
		System.out.println(newFuncionario.getSexo());
		System.out.println(newFuncionario.getCpf());
		System.out.println(newFuncionario.getNivel());
		System.out.println(newFuncionario.getCargo());
		System.out.println(newFuncionario.getSalario());

	}

}
