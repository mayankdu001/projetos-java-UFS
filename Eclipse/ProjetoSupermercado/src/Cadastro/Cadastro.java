package Cadastro;

import Login.Login;
import Funcionario.Funcionario;
import Cliente.Cliente;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import Produto.Produto;

public class Cadastro {

	public void CadastroCliente(Cliente objCliente) {

		File cliente = new File("Arquivos/arquivo/cliente/cadastro_cliente.txt");

		try {

			if (!cliente.exists()) {
				cliente.createNewFile();
			}

			FileWriter escrever = new FileWriter(cliente, true);
			BufferedWriter adicionar = new BufferedWriter(escrever);

			adicionar.write(objCliente.getCodigo() + "#");
			adicionar.write(objCliente.getNome() + "#");
			adicionar.write(objCliente.getSobreNome() + "#");
			adicionar.write(objCliente.getCpf() + "#");
			adicionar.write(objCliente.getRg() + "#");
			adicionar.write(objCliente.getTelefone() + "#");
			adicionar.write(objCliente.getRua() + "#");
			adicionar.write(objCliente.getNumeroRua() + "#");
			adicionar.write(objCliente.getBairro() + "#");
			adicionar.write(objCliente.getCidade() + "#");
			adicionar.write(objCliente.getData() + "#");
			adicionar.write(objCliente.getHora());

			adicionar.newLine();

			adicionar.close();
			escrever.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void cadastroProduto(Produto objProduto) throws IOException {

		File produto = new File("Arquivos/arquivo/Produto/cadastro_produto.txt");
		try {
			if (!produto.exists()) {
				produto.createNewFile();
			}

			FileWriter escrever = new FileWriter(produto, true);
			BufferedWriter adicionar = new BufferedWriter(escrever);

			adicionar.write(objProduto.getCodigo() + "#");
			adicionar.write(objProduto.getNome() + "#");
			adicionar.write(objProduto.getMarca() + "#");
			adicionar.write(objProduto.getModelo() + "#");
			adicionar.write(objProduto.getTamanho() + "#");
			adicionar.write(objProduto.getCor() + "#");
			adicionar.write(String.valueOf(objProduto.getValorEntrada()) + "#");
			adicionar.write(objProduto.getLucro() + "#");
			adicionar.write(String.valueOf(objProduto.getValorSaida()) + "#");
			adicionar.write(objProduto.getOpcaoVenda() + "#");
			adicionar.write(objProduto.getTipoVenda() + "#");
			adicionar.write(objProduto.getData() + "#");
			adicionar.write(objProduto.getHora());

			adicionar.newLine();

			adicionar.close();
			escrever.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void cadastroFuncionario(Funcionario objFuncionario) {
		File funcionario = new File(
				"Arquivos/arquivo/Funcionario/cadastro_funcionario.txt");

		try {
			if (!funcionario.exists()) {
				funcionario.createNewFile();
			}

			FileWriter escrever = new FileWriter(funcionario, true);
			BufferedWriter adicionar = new BufferedWriter(escrever);

			adicionar.write(objFuncionario.getCodigo() + "#");
			adicionar.write(objFuncionario.getNome() + "#");
			adicionar.write(objFuncionario.getSobreNome() + "#");
			adicionar.write(objFuncionario.getCpf() + "#");
			adicionar.write(objFuncionario.getRg() + "#");
			adicionar.write(objFuncionario.getSenha() + "#");
			adicionar.write(objFuncionario.getData() + "#");
			adicionar.write(objFuncionario.getHora());

			adicionar.newLine();

			adicionar.close();
			escrever.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void cadastroLogin(Login objLogin) {
		File login = new File("Arquivos/arquivo/Login/cadastro_login.txt");

		try {
			if (!login.exists()) {
				login.createNewFile();
			}

			FileWriter escrever = new FileWriter(login, true);
			BufferedWriter adicionar = new BufferedWriter(escrever);

			adicionar.write(objLogin.getCodigo() + "#");
			adicionar.write(objLogin.getCodigoFunc() + "#");
			adicionar.write(objLogin.getNome() + " " + objLogin.getSobreNome()
					+ "#");
			adicionar.write(objLogin.getCpf() + "#");
			adicionar.write(objLogin.getData() + "#");
			adicionar.write(objLogin.getHora());

			adicionar.newLine();

			adicionar.close();
			escrever.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
