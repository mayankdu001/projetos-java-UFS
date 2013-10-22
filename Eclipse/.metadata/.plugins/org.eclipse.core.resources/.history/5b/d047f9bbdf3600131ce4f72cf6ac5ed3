package projetoSimulador;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Tela_Execucao extends javax.swing.JFrame {

    Simulador sil = Tela_Regras.sil;
    Executando exe;

    public Tela_Execucao() {
        super("Simulador AFD - testar palavras");
        initComponents();
        setLocation(460, 150);
        
        preencherQuintupla();
       // jBEncerrar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTF_Palavra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTA_Resultado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAquintupla = new javax.swing.JTextArea();
        jBSalvar = new javax.swing.JButton();
        jBPasso = new javax.swing.JButton();
        jBEncerrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Teoria da Computação"));

        jButton1.setText("Testar Palavra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTA_Resultado.setColumns(20);
        jTA_Resultado.setRows(5);
        jScrollPane1.setViewportView(jTA_Resultado);

        jTAquintupla.setColumns(20);
        jTAquintupla.setRows(5);
        jScrollPane2.setViewportView(jTAquintupla);

        jBSalvar.setText("Salvar AFD");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBPasso.setText("Passo a Passo");
        jBPasso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPassoActionPerformed(evt);
            }
        });

        jBEncerrar.setText("Encerrar Passo");
        jBEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEncerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTF_Palavra, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBPasso, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(169, 169, 169))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jBSalvar)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBEncerrar, jBPasso, jButton1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTF_Palavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEncerrar)
                    .addComponent(jBPasso)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSalvar)
                .addGap(8, 8, 8))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBEncerrar, jBPasso, jButton1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exe = new Executando(jTF_Palavra.getText(), sil);
        exe.executa();
        preencherTexto();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        //aqui vc precisa salvar a variavel sil. formato .afd
        
        try{
        salvarSimulador();
        }catch( Exception e){}
    }//GEN-LAST:event_jBSalvarActionPerformed
    Executando as;
    int i = 0;

    private void jBPassoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPassoActionPerformed
        // TODO add your handling code here:
        if (as == null) {
            exe = new Executando(jTF_Palavra.getText(), sil);
            exe.executa();
            as = exe;
            jTA_Resultado.setText("");
        }

        ArrayList<String> z = as.passoApasso;

        jTF_Palavra.setEditable(false);
        while (true) {
            if (preencherPasso(i++, z)) {
                return;
            } else {
                jTF_Palavra.setEditable(true);
                i = 0;
                as = null;
                jButton1.setVisible(true);
     
                return;
            }
        }
    }//GEN-LAST:event_jBPassoActionPerformed


    private void jBEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEncerrarActionPerformed
        jTF_Palavra.setEditable(true);
        jButton1.setVisible(true);
        
        as = null;
        i = 0;
        preencherTexto();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEncerrarActionPerformed

    public boolean preencherPasso(int j, ArrayList<String> a) {

        char []e = jTF_Palavra.getText().toCharArray();
        
        
        if (j < a.size()) {
            
            try{
           // jLLeitura.setText(""+e[j]);
            }
            catch (Exception w){
                return false;
            }
            String[] s = a.get(j).split(" ");
            jTA_Resultado.setText(jTA_Resultado.getText() + a.get(j) + "\n");
            if (s[0].equalsIgnoreCase("validou") || s[0].equalsIgnoreCase("nao validou")) {
                return false;
            }
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Ja concluiu o passo a passo");
            
        }
        return false;
        
        
        
    }

    public void preencherQuintupla() {
        String a = "";
        for (int i = 0; i < sil.alfa.letras.length; i++) {
            a = a + sil.alfa.letras[i] + " ,";
        }
        a = a.substring(0, a.length() - 1);

        a = "{ " + a + " }";
        String[] b = sil.retornaNomeDosEstados();
        String bb = "";
        for (int i = 0; i < b.length; i++) {
            bb = bb + b[i] + " ,";

        }
        bb = bb.substring(0, bb.length() - 1);
        bb = "{ " + bb + " }";


        ArrayList<String> c = sil.trans;
        String cc = "&";

        String d = sil.EstadoInicial;


        ArrayList<String> e = sil.EstadoFinal;

        String ee = "";
        for (int i = 0; i < e.size(); i++) {
            ee = ee + e.get(i) + " ,";

        }
        ee = ee.substring(0, ee.length() - 1);
        ee = "{ " + ee + " }";


        String quintupla = "AFD = ( " + a + " , " + bb + " , " + cc + " , " + d + " , " + ee + " )";
        // preciso imprimir c.
        jTAquintupla.setText(quintupla + "\n" + "& : ");

        for (int i = 0; i < c.size(); i++) {
            jTAquintupla.setText(jTAquintupla.getText() + c.get(i) + "\n");


        }
    }

    public void preencherTexto() {
        jTA_Resultado.setText("");
        ArrayList<String> z;
        if (exe != null) {
            z = exe.passoApasso;

            for (int i = 0; i < z.size(); i++) {
                jTA_Resultado.setText(jTA_Resultado.getText() + z.get(i) + "\n");
            }
        }

    }

    private void salvarSimulador() {        
        JFileChooser fileChooser = new JFileChooser();
        SalvarSimulador record = new SalvarSimulador();
        fileChooser.showSaveDialog(null);
        File f = fileChooser.getSelectedFile();
        //String nome = JOptionPane.showInputDialog("Infome nome do arquivo");
        //String aux = nome + ".afd";
        //File teste = new File(aux);
        //if (teste.exists()) {            
          //  JOptionPane.showMessageDialog(null, "Nome de Arquivo já Existe!!!");
            //salvarSimulador();
            //return;
        //} else {
            record.abrirArquivo(f);
            record.gravarArquivo(sil);
            record.fecharArquivo();
        //}
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEncerrar;
    private javax.swing.JButton jBPasso;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTA_Resultado;
    private javax.swing.JTextArea jTAquintupla;
    private javax.swing.JTextField jTF_Palavra;
    // End of variables declaration//GEN-END:variables
}
