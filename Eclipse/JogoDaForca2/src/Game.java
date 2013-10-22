/*
 * Universidade Federal de Sergipe 
 * Campus Dr.Alberto Carvalho
 * Curso de Sistemas De Informação
 * Matéria: Programação 2
 * Prof:Mai-Ly Vanessa
 * 
 * Sistema Desenvolvido Por 
 * 
 * Edson Lima 
 * Anderson Andrade
 * Yuri
 * 
 */



import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Game extends JFrame{

JButton lbut1, lbut2, lbut3, lbut4, butxek, butec[], butsb, butreg, butcred, butscor;
Container centro, leste, oeste, sul, norte;//CONTAINER DAS 5 POSIÇÕES DOS BORDER
JPanel p, cpanel, opanel, lpanel[], tecpanel1, tecpanel2, tecpanel3, spanel1, spanel2, spanel3, npanel;
ImageIcon iconC1, iconC2, iconC3, iconC4, iconC5, iconC6, iconC7, iconC8, icon1; // icon to label
JLabel clabel, digite, mostra, tec, score, pts, scor;
JDialog jogaN, newG, score1;

ArrayList palavrasArquivo = new ArrayList();
ArrayList dicasArquivo = new ArrayList();
ArrayList tentativas = new ArrayList();
int numscore = 0 ;
int maxErros = 7 ;
int numErros = 0 ;
boolean thend = true;
//char espaco;

JTextField txtDica, palavraForca, tentar;
String palavraSorteada = new String();

Container p1, s1, s2;
ImageIcon icon2;
JLabel campoImg1, nome1, nome2;
JButton but1, but2;

// BUTOES DO TECLADO
String[] alfa = {"A", "B", "C", "D", "E", "F", "G", "H", "I" , "J", "K", "L",
		"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
		"Ç", "Á", "Ã", "Â", "É", "Ê", "Í", "Ó", "Ô", "Õ", "Ú", " ", "-"};
	public Game() {
		
		super("Jogo da Forca:");
		
		// INTRODUZINDO AS IMAGENS
		iconC1 = new ImageIcon(getClass().getResource("fotos/forca1.jpg"));
		iconC2 = new ImageIcon(getClass().getResource("fotos/forca2.jpg"));
		iconC3 = new ImageIcon(getClass().getResource("fotos/forca3.jpg"));
		iconC4 = new ImageIcon(getClass().getResource("fotos/forca4.jpg"));
		iconC5 = new ImageIcon(getClass().getResource("fotos/forca5.jpg"));
		iconC6 = new ImageIcon(getClass().getResource("fotos/forca6.jpg"));
		iconC7 = new ImageIcon(getClass().getResource("fotos/forca7.jpg"));
		iconC8 = new ImageIcon(getClass().getResource("fotos/forca8.jpg"));
		icon1 = new ImageIcon(getClass().getResource("fotos/xek.jpg"));
		
		// CRIAÇÃO DO CONTAINER PRINCIPAL
		Container cp = getContentPane(); 
		
		// CONTAINER PRINCIPAL ADICIONANDO AO BorderLayout COM ESPAÇAMENTO DE 10PX POR 10PX
		cp.setLayout(new BorderLayout(10, 10)); 
		
		//INICIALIZANDO O CONTAINER NORTE E SUL
		norte = new JPanel();
		
		//MONTANDO O PAINEL LESTE:)
		leste = new JPanel(new GridLayout(15,0,5,5));
		lpanel = new JPanel[13];
		
		for (int i=0; i<lpanel.length; i++){
			lpanel[i] = new JPanel();
		}
		leste.add(lpanel [0].add(lbut2 = new JButton("Start")));
		leste.add(lpanel [1].add(lbut1 = new JButton("Reset")));
		leste.add(lpanel [2].add(lbut3 = new JButton("Cadastro")));
		leste.add(lpanel [3].add(butsb = new JButton("Sobre")));
		leste.add(lpanel [4].add(butreg = new JButton("Regras")));
		leste.add(lpanel [5].add(butcred = new JButton("Creditos")));
		leste.add(lpanel [6].add(lbut4 = new JButton("Sair")));
		leste.add(lpanel [7]);
		leste.add(lpanel [8]);
		leste.add(lpanel [9]);
		leste.add(lpanel [10].add(score = new JLabel("Score:")));
		leste.add(lpanel [11].add(pts = new JLabel("Pts: "+numscore)));
		leste.add(lpanel [12]);
		
		lbut1.setVisible(false);
		//INICIALIZANDO O , MONTANDO O PAINEL CENTRAL
		centro = new JPanel();
		clabel = new JLabel(iconC1);
		centro.add(clabel);
		
		//INICIALIZANDO E MONTANDO O CONTAINER OESTE
		oeste = new JPanel();
		tecpanel1 = new JPanel();
		tecpanel3 = new JPanel();
		tecpanel1.add(tec = new JLabel("Teclado:")).setFont(new Font("Arial", Font.BOLD, 15));
		tecpanel2= new JPanel(new GridLayout(14,6,5,5));//GRID DO TELCADO
		butec = new JButton[39];//BOTOES DO TECLADO
		//INSERINDO CONTEUDO NOS BOTÕES DO TECLADO
		for (int x = 0; x < 39; ++x) {
			butec[x] = new JButton(alfa[x]);
            tecpanel2.add(butec[x]);
            butec[x].addMouseListener(new mouseHandler());
			butec[x].setVisible(false); // SOME O TECLADO
        }
		oeste.setLayout(new BoxLayout(oeste, BoxLayout.Y_AXIS));
		oeste.add(tecpanel1);
		oeste.add(tecpanel2);
		oeste.add(tecpanel3);
		
		//INFORMAÇÕES QUE FICARÃO NO SUL
		sul = new JPanel();
		spanel1 = new JPanel();
		spanel2 = new JPanel();
		spanel3 = new JPanel();
		
		txtDica = new JTextField(35);
		txtDica.setEditable(false);
	    txtDica.setFont(new Font("Verdana", 0, 16));
	    txtDica.setEnabled(false);
	    palavraForca = new JTextField(25);
	    palavraForca.setEditable(false);
	    palavraForca.setFont(new Font("Arial Black", 0, 30));
	    palavraForca.setEnabled
	    (false);
	    tentar = new JTextField(2);
	    tentar.setFont(new Font("Arial Black", 0, 13));
	    tentar.setEnabled(false);
	    digite = new JLabel("Digite uma letra:");
	    digite.setFont(new Font("Comic Sans MS", 1, 14));
	    digite.setEnabled(false);
	    mostra = new JLabel();
	    
	    spanel1.add(mostra);
	    spanel2.add(digite);
	    spanel2.add(tentar);
	    spanel2.add(butxek = new JButton(icon1));
	    spanel2.add(txtDica);
	    spanel3.add(palavraForca);
	    
	    sul.add(spanel1);
	    sul.add(spanel2);
	    sul.add(spanel3);
	    sul.setLayout(new BoxLayout(sul, BoxLayout.Y_AXIS));
	    //UNINDO OS PAINEIS EM UM UNICO CONTAINER
		cp.add(BorderLayout.NORTH, norte);
		cp.add(BorderLayout.SOUTH, sul);
		cp.add(BorderLayout.CENTER, centro);
		cp.add(BorderLayout.EAST, leste);
		cp.add(BorderLayout.WEST, oeste);
 		
		// AÇOES PARA OS BOTOES DO LESTE
		MouseAdapter mouseOption = new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				 if ((e.getSource() == lbut1)){
					 numscore -= 200;
					 pts.setText("Pts: "+numscore);
					 Reset();
				 }else if ((e.getSource() == lbut2)){
				  	 Start();
				 }else if ((e.getSource() == lbut3)){
				 	 Window1(); //CADASTRO
				 }else if ((e.getSource() == lbut4)){
					 System.exit(0);
				 }else if ((e.getSource() == butsb)){
					 Window4(); //SOBRE
				 }else if ((e.getSource() == butreg)){
					 Window5(); //REGRAS
				 }else if ((e.getSource() == butcred)){ // CREDITOS
				 JOptionPane.showMessageDialog(null,
						 "Universidade Federal de Sergipe\n"
				 	   + "Campos Dr 'Alberto Carvalho'\n"
				 	   + "Curso de Sistemas de Informação\n"
				 	   + "Trabalho de programação II\n"
				 	   + "Professora: Mai-ly Vanessa\n"
				 	   + "Desenvolvedores:\n"
				 	   + "Anderson de Andrade Cunha\n"
				 	   + "Edson Barbosa Lima\n"
				 	   + "Iury Batista de Andrade Santos\n");
				 }else{
					 if(!thend){//VERIFICA SE NÃO É O FIM DO JOGO
					        tentarLetra(tentar.getText());//SE NÃO FOR FIM DE JOGO, PEGAR A LETRA ESCRITA E VERIFICA SE TEM NA PALAVRA
					        tentar.setText("");//DEIXA O CAMPO ONDE SÃO DIGITADAS AS LETRAS VAZIO
					 }
				}
			}			    
		};
		lbut1.addMouseListener(mouseOption);
		lbut2.addMouseListener(mouseOption);
		lbut3.addMouseListener(mouseOption);
		lbut4.addMouseListener(mouseOption);
		butxek.addMouseListener(mouseOption);
		butsb.addMouseListener(mouseOption);
		butreg.addMouseListener(mouseOption);
		butcred.addMouseListener(mouseOption);
		
		setResizable(false);
	//	setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	//	setUndecorated(true);
		setVisible(true);
		setSize(800, 600);
	}
	//SORTEIA A PALAVRA
	public void sortearpalavra() {
	    try {
	        File Arquivo = new File("Palavras.txt"); //LÊ O ARQUIVO TXT
	        FileReader leitor = new FileReader(Arquivo);
	        BufferedReader leitorBuf = new BufferedReader(leitor);
	        palavrasArquivo.clear(); //LIMPA O TEMPORARIO QUE ARMAZENA AS PALAVRAS
	        dicasArquivo.clear();	//LIMPA O TEMPORARIO QUE ARMAZENA A DICA
	        String linha=null;

	        while((linha = leitorBuf.readLine()) !=null){
	            String colunas[] = linha.split("#"); //LÊ A LINHA CONTENDO A PALAVRA E A DICA, SABENDO QUE AS MESMAS#
	            palavrasArquivo.add(colunas[0]);	// SAO SEPARADAS PELO CARACTERE
	            dicasArquivo.add(colunas[1]);
	        }
	        leitorBuf.close();

	        int TotalPalavras = palavrasArquivo.size();//LÊ O TAMANHO DA PALAVRA PARA DESENHAR OS TRAÇOS
	        int CodpalavraSorteada = (int) (Math.random()*(TotalPalavras)) ;//SORTEIA UMA PALAVRA RANDOMINCAMENTE
	        palavraSorteada = (String) palavrasArquivo.get(CodpalavraSorteada);//PEGA A PALAVRA SORTEADA
	        palavraSorteada= palavraSorteada.toUpperCase();//COLOCA EM MAIUSCULO
	        txtDica.setText("DICA: "+(String) dicasArquivo.get(CodpalavraSorteada));//PEGA A DICA E EXIBE
	    }
	    catch(Exception ex) {//TRATA TODOS OS TIPOS DE EXEÇÕES
	        System.out.println("Erro: "+ ex.toString());};//MOSTRA A EXEÇÃO
	}
	//DESENHA A PALAVRA EM TRAÇOS
	public void desenharpalavra(boolean MostrarTodaAPalavra){
	    String tempTexto = new String();
	    boolean faltauma = false;
	    for(int n=1;n <= palavraSorteada.length();n++){//PEGA O TAMANHO DA PALAVRA E CRIA OS TRCINHOS
	 //   	espaco = palavraSorteada.charAt(n);
	        if((MostrarTodaAPalavra) || (tentativas.contains(palavraSorteada.substring(n-1, n)))){
	            tempTexto = tempTexto+palavraSorteada.substring(n-1, n);
	          //	if(palavraSorteada.contains(" ")){
	      	  //      		tempTexto = tempTexto+" ";
	        	}else{
	        			tempTexto = tempTexto+"_";
	        			faltauma = true;
	        	}
	        
	        tempTexto=tempTexto+" ";
	}
	    palavraForca.setText(tempTexto);

	    if(!faltauma){
	        thend=true;
	            if ((numErros)<7){//VERIFICA SE O NUMERO DE TENTATICAS É MENOR QUE 7; SE FOR, O USUÁRIO GANHOU 
	            	for (int x = 0; x < 39; ++x) {
	        		    butec[x].setVisible(false);
	        		}
	            	lbut1.setVisible(false);
	            	lbut2.setVisible(false);
	            	lbut3.setVisible(false);
	            	lbut4.setVisible(false);
	            	
	            //	Sound();
	            	numscore += 100;
	            	pts.setText("Pts: "+numscore);
	            	Window2();
	            	newG.pack();
                    newG.setLocationRelativeTo(null);
                    newG.setVisible(true);
	            }
	    }
	}

	public void tentarLetra(String Letra){
	    Letra= Letra.toUpperCase();
	    if(tentativas.contains(Letra)){
	    	numscore -= 10;
	    	pts.setText("Pts: "+numscore);
	    	// MOSTRAR MENSAGEM DE QUE JÁ FOI TENTADA ESTA LETRA
	    	JOptionPane.showMessageDialog(null,"A Letra '"+Letra+"' já foi verificada.");
	    }else{ 
	    	 // ARMAZENA A LETRA NOVA NA LISTA DE TENTATIVAS.
	        tentativas.add(Letra);
	        //MOSTRA A LETRA
	        }
	        if(palavraSorteada.contains(Letra)){
	        	numscore += 50;
	        	pts.setText("Pts: "+numscore);
	            // ACERTOU
	            desenharpalavra(false);
	        }else{
	            numErros=numErros+1;//VAI ADICIONANDO O NUMERO DE TENTATIVAS;# 
	            numscore -= 30;		//SE ERRAR ADICIONA UMA NOVA PARTE DO CORPO
	            pts.setText("Pts: "+numscore);
	            switch(numErros){
	                case(1):{
	                    clabel.setIcon(iconC2);
	                    break;
	                }
	                case(2):{
	                	clabel.setIcon(iconC3);
	                	break;
	                }
	                case(3):{
	                	clabel.setIcon(iconC4);
	                	break;
	                }
	                case(4):{
	                	clabel.setIcon(iconC5);
	                    break;
	                }
	                case(5):{
	                	clabel.setIcon(iconC6);
	                	break;
	                }
	                case(6):{
	                	clabel.setIcon(iconC7);
	                	break;
	                }
	                case(7):{
	                	clabel.setIcon(iconC8);
	                	for (int x = 0; x < 39; ++x) {
		        		    butec[x].setVisible(false);
		        		}
	                	lbut1.setVisible(false);
		            	lbut2.setVisible(false);
		            	lbut3.setVisible(false);
		            	lbut4.setVisible(false);
		            	Window3(); // MOSTRA DERROTA
		            	Window6(); // MOSTRA SCORE
	                	numscore = 0;
	                	pts.setText("Pts: "+numscore);
	                	
		            	thend=true;
	                    desenharpalavra(true);
	                    thend=true;
	                    newG.pack();
	                    newG.setLocationRelativeTo(null);
	                    newG.setVisible(true);
	                    break;  
	                }
	          }
	    }
	}
	public void Reset(){	//RESETA O JOGO
	    for (int x = 0; x < 39; ++x) {
		    butec[x].setVisible(true);
		}
		palavraForca.setText("");
	    tentativas.clear();//ZERA O CONTEUDO DA VARIAVEL
	    sortearpalavra();
	    thend=false;
	    clabel.setIcon(iconC1);
	    numErros=0;
	    desenharpalavra(false);
	    newG.setVisible(false);
	    tentar.setText("");
	}
    
	public void Start(){//METODO DE INICIAR O JOGO
		digite.enable(true);
	    tentar.enable(true);
	    txtDica.enable(true);
	    palavraForca.enable(true);
	    palavraForca.setText("");
	    tentativas.clear();
	    sortearpalavra();
	    thend=false;
	    clabel.setIcon(iconC1);
	    numErros=0;
	    desenharpalavra(false);	
	    tentar.setText("");
	    for (int x = 0; x < 39; ++x) { //INICIALIZANDO O TECLADO
	    butec[x].setVisible(true);
	    lbut1.setVisible(true);
	    lbut2.setVisible(false);
	    }
	}
	public void Style(){ // ESTILOS DE FONTES
		nome1.setFont(new Font("Arial", Font.BOLD, 30));
		nome2.setFont(new Font("Arial", Font.BOLD, 20));
		nome1.setForeground(Color.GREEN);
	}
	public void Window1(){ //CHAMANDO A CLASSE DE CADASTRO DE PALAVRAS E DICAS
		new Cadastro();
	}
	public void Window2(){ //METODO DE VITORIA
		jogaN = new JDialog();
        icon2 = new ImageIcon(getClass().getResource("fotos/forca9.jpg"));
		campoImg1 = new JLabel(icon2);
		p1 = new JPanel();
		s1 = new JPanel();
		s2 = new JPanel();
		nome2 = new JLabel("Continue?");
		but1 = new JButton("Sim");
		but2 = new JButton("Não");

		s2.add(nome2);
		s2.add(but1);
		s2.add(but2);
		nome1 = new JLabel("You WINs");
		jogaN.setLayout(new BorderLayout());
		jogaN.add(BorderLayout.CENTER, p1);
		jogaN.add(BorderLayout.NORTH, s1);
		jogaN.add(BorderLayout.SOUTH, s2);
		p1.add(campoImg1);
		s1.add(nome1);
		Style();
		
    	jogaN.setSize(500,600);
        jogaN.setLocationRelativeTo(null);
    	jogaN.setVisible(true);
    	
        MouseAdapter mouseSN = new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				 if ((e.getSource() == but1)){
					lbut1.setVisible(true);
		            lbut2.setVisible(true);
		            lbut3.setVisible(true);
		            lbut4.setVisible(true);
		            lbut2.setVisible(false);
		            jogaN.dispose();
					Reset();
				 }else{
					System.exit(0);
				 }
			}
		};
		but1.addMouseListener(mouseSN);
		but2.addMouseListener(mouseSN);
    }
	public void Window3(){//METODO DE DERROTA
		jogaN = new JDialog();
        icon2 = new ImageIcon(getClass().getResource("fotos/forca8.gif"));
		campoImg1 = new JLabel(icon2);
		p1 = new JPanel();
		s1 = new JPanel();
		s2 = new JPanel();
		nome2 = new JLabel("Continue?");
		but1 = new JButton("Sim");
		but2 = new JButton("Não");
		
		s2.add(nome2);
		s2.add(but1);
		s2.add(but2);
		nome1 = new JLabel("You LOSEs");
		jogaN.setLayout(new BorderLayout());
		jogaN.add(BorderLayout.CENTER, p1);
		jogaN.add(BorderLayout.NORTH, s1);
		jogaN.add(BorderLayout.SOUTH, s2);
		p1.add(campoImg1);
		s1.add(nome1);
		Style();
		
    	jogaN.setSize(500,600);
        jogaN.setLocationRelativeTo(null);
    	jogaN.setVisible(true);
    	
        MouseAdapter mouseSN = new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				 if ((e.getSource() == but1)){
					lbut1.setVisible(true);
		            lbut2.setVisible(true);
		            lbut3.setVisible(true);
		            lbut4.setVisible(true);
		            lbut2.setVisible(false);
		            jogaN.dispose();
					Reset();
				 }else{
					System.exit(0);
				 }
			}
		};
		but1.addMouseListener(mouseSN);
		but2.addMouseListener(mouseSN);
	}
	public static void main(String[] args) { // METODO MAIN
		new Game();
	}
	public class mouseHandler extends MouseAdapter { // ATRIBUINDO FUNCIONALIDADE AO TECLADO
        public void mousePressed(MouseEvent e) {
                for (int x = 0; x < 39; ++x) {                            
                    if (e.getSource() == butec[x]) {
                        String s = butec[x].getText();
                        tentarLetra(s);
                        butec[x].setVisible(false);
                }            
            }
        }    
	};
	public void Window4(){ // JANELA - SOBRE O JOGO
		new Sobre();
	}
	public void Window5(){ // JANELA DE REGRAS
		new Regras();
	}
	public void Window6(){ // SCORE
		score1 = new JDialog();
		butscor = new JButton("OK");
		JPanel p = new JPanel(new FlowLayout());
		scor = new JLabel("        You: "+numscore+"  pts");
		score1.setLayout(new BorderLayout());
		p.add(butscor);
		score1.add(BorderLayout.NORTH, scor);
		score1.add(BorderLayout.CENTER, p);
		score1.setLocationRelativeTo(null);
    	score1.setVisible(true);
    	score1.setSize(150,90);
    	
    	MouseAdapter mouseScor = new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				 if ((e.getSource() == butscor)){
		            score1.dispose();
				 }
			}
		};
		butscor.addMouseListener(mouseScor);
	}
}