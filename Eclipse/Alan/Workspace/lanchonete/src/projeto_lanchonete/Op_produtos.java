package projeto_lanchonete;

import javax.swing.JOptionPane;

public class Op_produtos {
 int posicao = 0;
	public Produto[] cadastrar(Produto[] vetorProduto) {
		vetorProduto[posicao] = new Produto();
		vetorProduto[posicao].setCodigoProduto(Integer.parseInt(JOptionPane.showInputDialog("Codigo: ")));
		vetorProduto[posicao].setNomeProduto(JOptionPane.showInputDialog("Nome:"));
		vetorProduto[posicao].setTipoProduto(JOptionPane.showInputDialog("Tipo: ").charAt(0));
		vetorProduto[posicao].setPrecoProduto(Double.parseDouble(JOptionPane.showInputDialog("Preco: ")));
		posicao++;

		return vetorProduto;
		
		

	}

	public Produto[] alterar(Produto[] vetorProduto) {
		int testCodigo = Integer.parseInt(JOptionPane.showInputDialog("codigo de alteração"));
		int controle =0 ; 
		while ( controle < posicao) {
			if (testCodigo == vetorProduto[controle].getCodigoProduto()) {
			    JOptionPane.showMessageDialog(null, "Codigo: "+vetorProduto[controle].getCodigoProduto()+
			    									"\n Nome: "+ vetorProduto[controle].getNomeProduto()+
			    									"\n Tipo: "+vetorProduto[controle].getTipoProduto()+
			    									"\n Preco: "+vetorProduto[controle].getPrecoProduto());
			    vetorProduto[controle].setCodigoProduto(Integer.parseInt(JOptionPane.showInputDialog("Novo Codigo")));
			    vetorProduto[controle].setNomeProduto(JOptionPane.showInputDialog("Novo Nome"));
			    vetorProduto[controle].setTipoProduto(JOptionPane.showInputDialog("Novo Tipo").charAt(0));
			    vetorProduto[controle].setPrecoProduto(Double.parseDouble(JOptionPane.showInputDialog("Novo Preco")));
				
			}

			controle++;
			
		}
        return vetorProduto;

	}

	public Produto[] excluir(Produto[] vetorProduto) {
		int testcodigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo de exclusão"));
		int controle= 0;
		while (controle < posicao) {
			if (testcodigo == vetorProduto[controle].getCodigoProduto()){
			   JOptionPane.showMessageDialog(null, "Codigo: "+vetorProduto[controle].getCodigoProduto()+
					   							   "\n Nome: "+vetorProduto[controle].getNomeProduto()+
					   							   "\n Tipo: "+vetorProduto[controle].getTipoProduto()+
					   							   "\n Preco: "+vetorProduto[controle].getPrecoProduto());
			  
			}
			controle++;
		}
		
		
		do {
			vetorProduto[controle]= vetorProduto[controle+1];
			controle++;
		} while (controle < posicao);
		posicao--;
		return vetorProduto;
		

	}

	public Produto[] consultar(Produto[] vetorProduto) {
		int opcao;
		do {
			
		
		 opcao = Integer.parseInt(JOptionPane.showInputDialog( "1-Tipo\n" +
																  "2-Codigo"));
		
		switch (opcao) {
		case 1:
			
			
			char testTipo = JOptionPane.showInputDialog("tipo").charAt(0);
		for (int i = 0; i < posicao; i++) {
		 if (testTipo == vetorProduto[i].getTipoProduto()) {
			 
			 JOptionPane.showMessageDialog(null,"Codigo: " + vetorProduto[i].getCodigoProduto()+
					 							"\n Nome: " + vetorProduto[i].getNomeProduto()+
					 							"\n Tipo: " + vetorProduto[i].getTipoProduto()+
					 							"\n Preco: " + vetorProduto[i].getPrecoProduto());
			 
			 
		}
			
		}
		
			break;
		case 2:
			int testCodigo = Integer.parseInt(JOptionPane.showInputDialog("informe o codigo"));
			
			for (int i = 0; i < posicao; i++) {
				if (testCodigo == vetorProduto[i].getCodigoProduto()) {
					JOptionPane.showMessageDialog(null, "Codigo: "+vetorProduto[i].getCodigoProduto()+
														"\n Nome: "+vetorProduto[i].getNomeProduto()+
														"\n Tipo: "+vetorProduto[i].getTipoProduto()+
														"\n Preco"+vetorProduto[i].getPrecoProduto());
					
				}
			}
			
			break;


		default:
			JOptionPane.showMessageDialog(null, "opcao invalida");
			break;
		
		}
		} while (opcao != 2);		
		return vetorProduto;

	}

}
