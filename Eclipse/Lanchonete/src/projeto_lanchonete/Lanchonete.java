package projeto_lanchonete;

import javax.swing.JOptionPane;

public class Lanchonete {

	public static void main(String[] args) {
		
		Produto []vetorProduto = new Produto [100];
		
		Op_produtos opProdutos = new Op_produtos();
		
		int  opcao;
		
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("1-cadastrar \n" +
																 "2- alterar \n" +
																 "3-excluir \n" +
																 "4-consultar \n" +
																 "5-sair","informe a opcao"
																));

			switch (opcao) {
			case 1:
				
				vetorProduto = opProdutos.cadastrar(vetorProduto);
				
				break;
			case 2:
				vetorProduto = opProdutos.alterar(vetorProduto);
				
				break;
			case 3:
				vetorProduto = opProdutos.excluir(vetorProduto);
				
				break;
			case 4:
				vetorProduto = opProdutos.consultar(vetorProduto);
				
				break;
			case 5:
				
				JOptionPane.showMessageDialog(null, "programa finalizado");
				break;

			default:
				JOptionPane.showMessageDialog(null, "opcao invalida");
				break;
			}
		} while (opcao != 5);

	}
}
