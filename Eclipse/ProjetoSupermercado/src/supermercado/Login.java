package supermercado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 * 
 * @author Alan
 */
public class Login extends javax.swing.JFrame {
	String nome = null;
	String cpf = null;

	/**
	 * Creates new form Login
	 */
	public Login() {
		super("tela login");
		initComponents();
		setLocationRelativeTo(null);

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		lblUsuario = new javax.swing.JLabel();
		jtfUsuario = new javax.swing.JTextField();
		lblSenha = new javax.swing.JLabel();
		jtfSenha = new javax.swing.JTextField();
		jbtOk = new javax.swing.JButton();
		jbtSair = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		lblUsuario.setText("ID:   ");

		lblSenha.setText("Senha: ");

		jbtOk.setText("OK");
		jbtOk.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtOkActionPerformed(evt);
			}
		});

		jbtSair.setText("Sair");
		jbtSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtSairActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jbtOk)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jbtSair))
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
																.addGroup(
																		layout.createSequentialGroup()
																				.addComponent(
																						lblUsuario)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(
																						jtfUsuario,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						156,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(
																		layout.createSequentialGroup()
																				.addComponent(
																						lblSenha)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																				.addComponent(
																						jtfSenha))))
								.addContainerGap(21, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lblUsuario)
												.addComponent(
														jtfUsuario,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lblSenha)
												.addComponent(
														jtfSenha,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jbtSair)
												.addComponent(jbtOk))
								.addContainerGap(20, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	

	public boolean ler(String recebe, int posicao) {

		boolean axou = false;
		File usuario = new File("src/arquivo/Funcionario/funcionario.txt");
		// esse metodo ler s o arquivo existe s existir ele seta a matriucla
		// certinha
		try {

			// Lerconteudo
			FileReader ler = new FileReader(usuario);
			BufferedReader adicionarLeitura = new BufferedReader(ler);

			String linha = "";

			// equanto houver mais linhas

			// ler pra saber s existe algum arquivo com a mesma matricula
			//System.out.println("vai ler");

			while (adicionarLeitura.ready()) {

				//System.out.println("lendo");
				// lê a proxima linha

				linha = adicionarLeitura.readLine();
				String[] receberConteudo = linha.split(";");

				//System.out.println("vai testar");

				if (recebe.equals(receberConteudo[posicao])) {
					axou = true;
					nome = receberConteudo[1];
					nome += " " + receberConteudo[2];
					cpf = receberConteudo[3];
					//System.out.println("achou" + recebe);
					//System.out.println(recebe + receberConteudo[posicao]);

				}

			}

			adicionarLeitura.close();
			ler.close();
			//System.out.println("saiu da leitura");

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return axou;

	}

	private void jbtOkActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbtOkActionPerformed

		String nomeUsu = jtfUsuario.getText();
		String entrada = jtfSenha.getText();

		Date date = new Date();
		Date test = Calendar.getInstance().getTime();// saida dia mes
														// diaEmNumero HH:mm:ss
														// Ano
		// data
		DateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		String data = formatoData.format(date);// saida (dd/mm/aa)

		// hora
		DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
		String hora = formatoHora.format(date);// saida(HH:mm:ss)
		// _____________________________________________________________________

		// senha =
		//System.out.println("vai testar pra escrever");
		if (ler(nomeUsu, 0) && ler(entrada, 5)) {

			File arquivoSenha = new File("src/arquivo/Login/login.txt");

			try {

				if (!arquivoSenha.exists()) {
					arquivoSenha.createNewFile();
				}

				File[] arquivos = arquivoSenha.listFiles();

				FileWriter escreverArquivo = new FileWriter(arquivoSenha, true);

				BufferedWriter adicionarEscrita = new BufferedWriter(
						escreverArquivo);

				adicionarEscrita.write(nomeUsu + ";");
				adicionarEscrita.write(nome + ";");
				adicionarEscrita.write(cpf + ";");

				adicionarEscrita.write(String.valueOf(data) + ";");
				adicionarEscrita.write(hora + ";");
				adicionarEscrita.write(String.valueOf(test));

				adicionarEscrita.newLine();// depois q adiciona ela pula pra
											// a
											// proxima linha

				// System.out.println("Escreveu: " + data + "hora: " +
				// hora);

				adicionarEscrita.close();
				escreverArquivo.close();
				jtfUsuario.setText(null);
				jtfSenha.setText(null);
				//System.out.println("usuario aceito");
			} catch (IOException e) {
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Login concluido com sucesso");
		} else {
			JOptionPane.showMessageDialog(null, "Usuario N�o Cadastrado");
		}
		/*
		 * else if (!(jtfSenha.getText().equals(entrada))) {
		 * JOptionPane.showMessageDialog(null, "senha não confere"); } else if
		 * (!(jtfUsuario.getText().equals(nome))) {
		 * JOptionPane.showMessageDialog(null, "Usuario Invalido"); }
		 */

	}// GEN-LAST:event_jbtOkActionPerformed

	private void jbtSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbtSairActionPerformed
		dispose();
	}// GEN-LAST:event_jbtSairActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jbtOk;
	private javax.swing.JButton jbtSair;
	private javax.swing.JTextField jtfSenha;
	private javax.swing.JTextField jtfUsuario;
	private javax.swing.JLabel lblSenha;
	private javax.swing.JLabel lblUsuario;
	// End of variables declaration//GEN-END:variables
}
