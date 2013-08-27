package Eleicao;

import javax.swing.JOptionPane;

public class EleicaoJO {

    public static void main(String[] args) {

        int opcao;
        int contSindico1 = 0;
        int contSindico2 = 0;
        int contSindico3 = 0;

        String PrimeiroCandidato = JOptionPane.showInputDialog("informe o nome do priemiro candidato");
        String SegundoCandidato = JOptionPane.showInputDialog("informe o nome do segundo candidato");
        String TereiroCandidato = JOptionPane.showInputDialog("informe o nome do Terceiro candidato");


        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1-" + PrimeiroCandidato
                    + "\n 2-" + SegundoCandidato
                    + "\n 3-" + TereiroCandidato
                    + "\n 0-sair", "informe a opção"));
            if (opcao == 0) {

                break;
            }
            switch (opcao) {
                case 1:
                    contSindico1++;
                    break;
                case 2:
                    contSindico2++;
                    break;
                case 3:
                    contSindico3++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "candidato não cadastrado");

            }

        } while (opcao != 0);
        
        JOptionPane.showMessageDialog(null, " Votacao Encerrada");
        JOptionPane.showMessageDialog(null, PrimeiroCandidato + " Total de Votos: " + contSindico1
                                  + "\n " + SegundoCandidato + " Total de Votos: " + contSindico2
                                  + "\n " + TereiroCandidato + " Total de Votos: " + contSindico3);
        
       double resul = (contSindico1+contSindico2+contSindico3);
        double percentual = (contSindico1/resul);
        //2JOptionPane.showMessageDialog(null, PrimeiroCandidato+ "Percentua de votos "+ "%.2f"+((percentual)*100));
        System.out.printf("%.2f",((percentual)*100)); 
        double percentual2 = (contSindico2/resul);
        JOptionPane.showMessageDialog(null, SegundoCandidato+ " Percentua de votos "+(percentual2)*100);
        double percentual3 = (contSindico3/resul);
        JOptionPane.showMessageDialog(null, TereiroCandidato+ " Percentua de votos "+(percentual3)*100);
        // percentual 
// total de votos de cada dividido por 
//total de candidatos multiplicado por 100
    }
}
