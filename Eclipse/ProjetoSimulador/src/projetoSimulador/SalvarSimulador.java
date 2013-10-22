/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projetoSimulador;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.io.File;




public class SalvarSimulador extends JFrame{
    File f;
    public SalvarSimulador(){
   
        
    }
    

    public String getdiretorio() {
        //exibe o dialogo de arquivo para q o usuario possa escolher o arquivo a abrir
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
String x = "";
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.CANCEL_OPTION) {
          //  System.exit(1);
            this.dispose();
        }
try{
        File fileName = fileChooser.getSelectedFile();//obtem o arquivo
        x= ""+fileName.getAbsoluteFile().getPath();
        //exibir erro quando invalido
        if (fileName == null || fileName.getName().equals("")) {
          //  JOptionPane.showMessageDialog(this, "Nome Invalido");
              this.dispose();
         //   System.exit(1);
        }
        return x;
}catch (Exception e){

return "";
}

    }//fim do metodo

     boolean nula = true;
     private ObjectOutputStream output;// objeto usado para gerar sai de texto no arquivo

// permite o usuario abrir o arquivo
public void abrirArquivo(File nome)
{
 // nome=nome+".afd";
    
   
   try
    {
	output = new ObjectOutputStream(new FileOutputStream(nome));
        
    }//fim do try

   catch (IOException ioException)
     {
	JOptionPane.showMessageDialog(null,"erro ao abrir arquivo");
        
     }//fim do catch

}//fim do metodo abrir arquivo

			// adiciona registro ao arquivos
public void gravarArquivo(Simulador record)
{
   try//gera a saida dos valores para o arquivo
    {
      //grava um novo arquivo
    	output.writeObject(record);
    }
   catch(IOException ioException)
     {
	System.err.println("Erro ao gravar no arquivo");
     }
   catch (NoSuchElementException elementException )
     {
       System.err.println("Invalid input. Please try again.\n Entrada inv�lida. Por favor, tente novamente.");
     }
}//fim do metodo addrecord

//fechar o arquivo
public void fecharArquivo()
 {
   try
    {
      if (output != null)
	 {
	   output.close();
	 }
    }
   catch (IOException ioException)
     {
	JOptionPane.showMessageDialog(null, "Erro ao fechar o arquivo");
	System.exit(1);
     }

 }


//**************************************************************************************************
    //METODOS DE LER O ARQUIVOS DA MEMORIA SECUNDARIA E JOGA NA PRINCIPAL
//**************************************************************************************************
private ObjectInputStream input;
private Simulador record;

public boolean abrirLerArquivo(String nome)
 {
 //  nome=nome+".afd";
    try
     {
	input = new ObjectInputStream(new FileInputStream(nome));
        return true;
     }
   catch (IOException ioException)
     {
       //System.err.println("Erro ao abrir o arquivo ");
       JOptionPane.showMessageDialog(null,"Nome do Arquivos não encontrado!!");
       //System.exit(1);
       return false;
     }




  }// fim do metodo abrir arquivo

// ler o arquivo
public void lerArquivo()
{
   try
    {


      record = (Simulador) input.readObject();
    }// fim do try
   catch (EOFException endOFFileException)
     {
	return;
     }
   catch(ClassNotFoundException classNotFoundException)
     {
	System.err.println("O objeto n�o foi encontrado ");
     }
   catch(IOException ioException)
     {
	System.err.println("erro ao  abrir os arquivos");
     }
}// fim do metodo read Record ou gravar arquivo

//fecha o arquivo e termina o aplicativo
public void fecharLerArquivo()
{
   try
    {
      if(input != null)
       {
         input.close();//fecha o arquivo
       }
    }
   catch (IOException ioException)
    {
 	System.exit(1);
    }
}// fim da classe readFile

public Simulador getArquivoSimulador()
{
   return record;
}





}
