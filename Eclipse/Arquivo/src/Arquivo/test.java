package Arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test {

	public static void main(String[] args) {

		String[] palavra = { "computador", "camisa", "carro", "iniciar" };
		String[] dica = { "Informática", "Vestuário", "Automóvel",
				"Sinônimo de começar" };

		File arquivo = new File("C:/Users/ALAN PASSOS/Desktop/Palavras.txt");

		try {

			if (!arquivo.exists()) {
				// cria um arquivo (vazio)
				arquivo.createNewFile();
			}

			// caso seja um diretório, é possível listar seus arquivos e
			// diretórios
			File[] arquivos = arquivo.listFiles();

			// escreve no arquivo
			FileWriter fw = new FileWriter(arquivo, true);

			BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < 3; i++) {
				// char[] str = new palavra[i] ;
				bw.write(palavra[i]);
				bw.newLine();

			}

			// bw.write("palavra");

			// bw.newLine();

			bw.close();
			fw.close();

			// faz a leitura do arquivo
			FileReader fr = new FileReader(arquivo);

			BufferedReader br = new BufferedReader(fr);

			// equanto houver mais linhas
			while (br.ready()) {
				// lê a proxima linha
				String linha = br.readLine();

				// faz algo com a linha
				System.out.println(linha);
			}

			br.close();
			fr.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}
