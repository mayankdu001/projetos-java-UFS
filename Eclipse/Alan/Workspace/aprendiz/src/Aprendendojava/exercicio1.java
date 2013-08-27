package Aprendendojava;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class exercicio1 {

  public static void main(String[] args) {
	         
     Pessoa jovem = new Pessoa ();
     Carro aut = new Carro();	
     Scanner ler = new Scanner(System.in);
          
      System.out.println("informe os dados pessoais");
      System.out.println("nome: ");
      jovem.setNome(ler.next());
      System.out.println("cpf: ");
      jovem.setCpf(ler.next());
      System.out.println("RG: ");
      jovem.setRG(ler.next());
      System.out.println("sexo [M]asculino     [F]eminino: ");
      jovem.setSexo(ler.next().charAt(0));
      System.out.println("estado civil: ");
      jovem.setEstCivil(ler.next());
      System.out.println("idade: ");
      jovem.setIdade(ler.nextInt());
      System.out.println("informe os dados do carro");
      System.out.println("nome car");
      aut.setNomecar(ler.next());
      System.out.println("informe o ano de fabricação");
      aut.setAnofab(ler.next());
      System.out.println("informe os Km rodados");
      aut.setKmandados(ler.nextDouble());
      
      System.out.println("dados pessoais");
      System.out.println("Nome: "+ jovem.getNome());
      System.out.println("Idade: "+jovem.getIdade());
      System.out.println("RG: "+jovem.getRG());
      System.out.println("CPF: "+jovem.getCpf());
      System.out.println("Data Nascimento: "+jovem.getDataNasc());
      System.out.println("Estado Civil: "+ jovem.getEstCivil());
      System.out.println("Sexo: "+jovem.getSexo());
      System.out.println("dados do automovel");
      System.out.println("nome do carro: "+aut.getNomecar());
      System.out.println("Ano de fabricação: "+aut.getAnofab());
      System.out.println("Km rodados: "+aut.getKmandados());
  }

}
