package projetoSimulador;
// versão 0.3
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tela_Regras extends javax.swing.JFrame {

    //******************* todas as declaraçoes ***************************************
    ArrayList<String> funcoes = new ArrayList<String>();
    String alfabeto;
    static Simulador sil;
    Alfabeto alfa;

    //********************************************************************************
    //********************* inicialização do frame ***********************************
    public Tela_Regras() {
    	super("Simulador automoto finito deterministico (AFD)");
        initComponents();
        setLocation(200, 100);
        jP_Regras_Maquina.setVisible(false);
        jM_Criar_Regras.setVisible(false);
        jM_Executar.setVisible(false);


    }

    //********************************************************************************
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jP_Regras_Maquina = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jC_funcoes = new javax.swing.JComboBox();
        jB_Deletar_Funcao = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jCB_Conjunto_Estados = new javax.swing.JComboBox();
        jBEscolherEFinal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jC_Confuntos_Finais = new javax.swing.JComboBox();
        jB_Criar_Estado = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jB_Excluir_E_Final = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jCB_Estados = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jCB_Alfabetos = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jC_Novo_Estado = new javax.swing.JComboBox();
        jB_Criar_Funcao = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jM_Criar_Alfabeto = new javax.swing.JMenu();
        jM_Criar_Regras = new javax.swing.JMenu();
        jM_Executar = new javax.swing.JMenu();
        jM_Carregar_AFD = new javax.swing.JMenu();
        jM_Ajuda = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jP_Regras_Maquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Regras da Maquina "));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Transições"));

        jB_Deletar_Funcao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG-24/Delete.png"))); // NOI18N
        jB_Deletar_Funcao.setText("Deletar Função");
        jB_Deletar_Funcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Deletar_FuncaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jC_funcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jB_Deletar_Funcao, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jC_funcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(jB_Deletar_Funcao)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Estados Finais "));

        jBEscolherEFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG-24/Add.png"))); // NOI18N
        jBEscolherEFinal.setText("Acrescentar Estado Final");
        jBEscolherEFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEscolherEFinalActionPerformed(evt);
            }
        });

        jLabel1.setText("Conjunto de Estados ");

        jLabel2.setText("Conjunto de Esdados Finais ");

        jB_Criar_Estado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG-24/Add.png"))); // NOI18N
        jB_Criar_Estado.setText("Criar Estado");
        jB_Criar_Estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Criar_EstadoActionPerformed(evt);
            }
        });

        jB_Excluir_E_Final.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG-24/Delete.png"))); // NOI18N
        jB_Excluir_E_Final.setText("Excluir Estado Final");
        jB_Excluir_E_Final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Excluir_E_FinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jCB_Conjunto_Estados, 0, 167, Short.MAX_VALUE)
                        .addGap(80, 80, 80))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jC_Confuntos_Finais, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jB_Excluir_E_Final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jB_Criar_Estado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBEscolherEFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(26, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jCB_Conjunto_Estados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jB_Criar_Estado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEscolherEFinal)
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jC_Confuntos_Finais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jB_Excluir_E_Final)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Criação de Transições"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado Atual"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCB_Estados, 0, 96, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jCB_Estados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Alfabeto"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCB_Alfabetos, 0, 86, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jCB_Alfabetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Novo Estado"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jC_Novo_Estado, 0, 94, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jC_Novo_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        jB_Criar_Funcao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/categories/applications-system.png"))); // NOI18N
        jB_Criar_Funcao.setText("Criar Transições");
        jB_Criar_Funcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Criar_FuncaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jB_Criar_Funcao, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jB_Criar_Funcao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG-24/e82ac68d7d15e882918c7abc96951426.png"))); // NOI18N

        javax.swing.GroupLayout jP_Regras_MaquinaLayout = new javax.swing.GroupLayout(jP_Regras_Maquina);
        jP_Regras_Maquina.setLayout(jP_Regras_MaquinaLayout);
        jP_Regras_MaquinaLayout.setHorizontalGroup(
            jP_Regras_MaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Regras_MaquinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Regras_MaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Regras_MaquinaLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addContainerGap())
        );
        jP_Regras_MaquinaLayout.setVerticalGroup(
            jP_Regras_MaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Regras_MaquinaLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jP_Regras_MaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jM_Criar_Alfabeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/categories/applications-graphics.png"))); // NOI18N
        jM_Criar_Alfabeto.setText("Criar Alfabeto");
        jM_Criar_Alfabeto.setToolTipText("Cria o Alfabeto a ser Usar");
        jM_Criar_Alfabeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jM_Criar_AlfabetoMouseClicked(evt);
            }
        });
        jMenuBar1.add(jM_Criar_Alfabeto);

        jM_Criar_Regras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/categories/applications-development.png"))); // NOI18N
        jM_Criar_Regras.setText("Criar Regras");
        jM_Criar_Regras.setToolTipText("Cria as Regras do Automato");
        jM_Criar_Regras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jM_Criar_RegrasMouseClicked(evt);
            }
        });
        jMenuBar1.add(jM_Criar_Regras);

        jM_Executar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG-24/Next.png"))); // NOI18N
        jM_Executar.setText("Executar");
        jM_Executar.setToolTipText("Executa o Simulador ");
        jM_Executar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jM_ExecutarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jM_Executar);

        jM_Carregar_AFD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG-24/Load.png"))); // NOI18N
        jM_Carregar_AFD.setText("Carregar AFD");
        jM_Carregar_AFD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jM_Carregar_AFDMouseClicked(evt);
            }
        });
        jMenuBar1.add(jM_Carregar_AFD);

        jM_Ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG-24/Comment.png"))); // NOI18N
        jM_Ajuda.setText("Ajuda");
        jM_Ajuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jM_AjudaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jM_Ajuda);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG-24/Exit.png"))); // NOI18N
        jMenu3.setText("Sair");
        jMenu3.setToolTipText("Sair do Programa");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP_Regras_Maquina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP_Regras_Maquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_Criar_EstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Criar_EstadoActionPerformed
        sil.criarEstado(JOptionPane.showInputDialog("criar estado"));
        atualizar();
    }//GEN-LAST:event_jB_Criar_EstadoActionPerformed

    private void jB_Criar_FuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Criar_FuncaoActionPerformed
        char x = jCB_Alfabetos.getSelectedItem().toString().charAt(0);

        sil.criarFuncaoNoEstado(jCB_Estados.getSelectedItem().toString(), x, jC_Novo_Estado.getSelectedItem().toString());

        FuncoesGerais();
    }//GEN-LAST:event_jB_Criar_FuncaoActionPerformed

    private void jBEscolherEFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEscolherEFinalActionPerformed
        String x = jCB_Conjunto_Estados.getSelectedItem().toString();// esse eh o nome selecionado no combo estado.
        sil.EscolherEstadoFinal(x);// nesse momento, escolhi o estado final..
        atualizar();
    }//GEN-LAST:event_jBEscolherEFinalActionPerformed

    private void jM_Criar_AlfabetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_Criar_AlfabetoMouseClicked

        alfabeto = "" + JOptionPane.showInputDialog("Informe o Alfabeto");
        if (!alfabeto.equalsIgnoreCase("null") && !alfabeto.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Alfabeto criado com Sucesso");
            alfa = new Alfabeto(alfabeto);
            sil = new Simulador(alfa);
            jM_Criar_Regras.setVisible(false);
            jC_funcoes.removeAllItems();
            atualizar();
            jM_Criar_RegrasMouseClicked(evt);
        }
    }//GEN-LAST:event_jM_Criar_AlfabetoMouseClicked

    private void jM_Criar_RegrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_Criar_RegrasMouseClicked
        jP_Regras_Maquina.setVisible(true);
        sil = new Simulador(alfa);
        jM_Executar.setVisible(true);
        atualizar();
    }//GEN-LAST:event_jM_Criar_RegrasMouseClicked

    private void jB_Deletar_FuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Deletar_FuncaoActionPerformed

        String[] x = jC_funcoes.getSelectedItem().toString().split(" ");
        funcoes.remove(jC_funcoes.getSelectedItem().toString());
        sil.deletarFuncaoNoEstado(x[0], x[2].charAt(0));
        FuncoesGerais();
    }//GEN-LAST:event_jB_Deletar_FuncaoActionPerformed

    private void jM_ExecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_ExecutarMouseClicked
        sil.trans = funcoes;

        if (execucaoTela()) {
            new Tela_Execucao().show();
        } else {
            JOptionPane.showMessageDialog(null, "Falta  a transição e o estado final ");
        }
    }//GEN-LAST:event_jM_ExecutarMouseClicked

    private void jB_Excluir_E_FinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Excluir_E_FinalActionPerformed
        sil.EstadoFinal.remove(jC_Confuntos_Finais.getSelectedItem());
        atualizar();

    }//GEN-LAST:event_jB_Excluir_E_FinalActionPerformed

    private void jM_AjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_AjudaMouseClicked
                        new Tela_Sobre().setVisible(true);

    }//GEN-LAST:event_jM_AjudaMouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jM_Carregar_AFDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_Carregar_AFDMouseClicked

        SalvarSimulador s = new SalvarSimulador();

        if (s.nula) {
            String x = s.getdiretorio();
            if (!x.equalsIgnoreCase("")) {
                carregarArquivo(x, s);
                jM_Criar_Regras.setVisible(false);
                jM_Executar.setVisible(true);
            }
        }
    }//GEN-LAST:event_jM_Carregar_AFDMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Tela_Regras().setVisible(true);
            }
        });
    }

    private void carregarArquivo(String nome, SalvarSimulador input)// acrescentei um parametro
    {
        if (input.abrirLerArquivo(nome)) {
            input.lerArquivo();
            this.sil = input.getArquivoSimulador();
            input.fecharLerArquivo();
            jP_Regras_Maquina.setVisible(true);
            alfa = sil.alfa;
            FuncoesGerais();
            atualizar();
        }
    }

    public void FuncoesGerais() {
        try {
            funcoes.clear();
            for (int i = 0; i < sil.conjEstado.size(); i++) {
                for (int j = 0; j < sil.conjEstado.get(i).celulas.length; j++) {
                    if (sil.conjEstado.get(i).celulas[j] != null) {
                        String estadoAtual = sil.conjEstado.get(i).nomeEstado;
                        char letra = sil.conjEstado.get(i).celulas[j].letra;
                        String Transicao = sil.conjEstado.get(i).celulas[j].vlrEstado;
                        funcoes.add(estadoAtual + " , " + letra + " -> " + Transicao);
                    }
                }
            }
            jC_funcoes.removeAllItems();
            for (int i = 0; i < funcoes.size(); i++) {
                jC_funcoes.addItem(funcoes.get(i));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "caro amigo, se esse aconteceu, a culpa e sua");
        }

    }

    public void atualizar() {
        jCB_Alfabetos.removeAllItems();
        jCB_Estados.removeAllItems();
        jC_Novo_Estado.removeAllItems();
        jCB_Conjunto_Estados.removeAllItems();
        jC_Confuntos_Finais.removeAllItems();
        for (int i = 0; i < alfa.letras.length; i++) {
            jCB_Alfabetos.addItem(alfa.letras[i]);
        }

        for (int i = 0; i < sil.conjEstado.size(); i++) {
            jCB_Estados.addItem(sil.conjEstado.get(i).nomeEstado);
            jC_Novo_Estado.addItem(sil.conjEstado.get(i).nomeEstado);
            jCB_Conjunto_Estados.addItem(sil.conjEstado.get(i).nomeEstado);
        }

        for (int i = 0; i < sil.EstadoFinal.size(); i++) {
            jC_Confuntos_Finais.addItem(sil.EstadoFinal.get(i));

        }
    }

    private boolean execucaoTela() {
        if (sil.EstadoFinal.size() != 0 && jC_funcoes.getItemCount() != 0) {
            return true;
        }
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEscolherEFinal;
    private javax.swing.JButton jB_Criar_Estado;
    private javax.swing.JButton jB_Criar_Funcao;
    private javax.swing.JButton jB_Deletar_Funcao;
    private javax.swing.JButton jB_Excluir_E_Final;
    private javax.swing.JComboBox jCB_Alfabetos;
    private javax.swing.JComboBox jCB_Conjunto_Estados;
    private javax.swing.JComboBox jCB_Estados;
    private javax.swing.JComboBox jC_Confuntos_Finais;
    private javax.swing.JComboBox jC_Novo_Estado;
    private javax.swing.JComboBox jC_funcoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jM_Ajuda;
    private javax.swing.JMenu jM_Carregar_AFD;
    private javax.swing.JMenu jM_Criar_Alfabeto;
    private javax.swing.JMenu jM_Criar_Regras;
    private javax.swing.JMenu jM_Executar;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jP_Regras_Maquina;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
