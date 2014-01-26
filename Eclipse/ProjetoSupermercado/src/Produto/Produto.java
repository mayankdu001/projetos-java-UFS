package Produto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {
	Date date = new Date();

	private int codigo;
	private String nome;
	private String modelo;
	private String marca;
	private int tamanho;
	private String cor;
	private double valorEntrada;
	private int lucro;
	private double valorSaida;
	private String opcaoVenda;
	private String tipoVenda;
	private String data;
	private String hora;

	public Produto(int codigo, String nome, String modelo, String marca,
			int tamanho, String cor, double valorEntrada, int lucro,
			double valorSaida, String opcaoVenda, String tipoVenda,
			String data, String hora) {

		this.codigo = codigo;
		this.nome = nome;
		this.modelo = modelo;
		this.marca = marca;
		this.tamanho = tamanho;
		this.cor = cor;
		this.valorEntrada = valorEntrada;
		this.lucro = lucro;
		this.valorSaida = valorSaida;
		this.opcaoVenda = opcaoVenda;
		this.tipoVenda = tipoVenda;
		this.data = data;
		this.hora = hora;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getValorEntrada() {
		return valorEntrada;
	}

	public void setValorEntrada(double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}

	public int getLucro() {
		return lucro;
	}

	public void setLucro(int lucro) {
		this.lucro = lucro;
	}

	public double getValorSaida() {
		return valorSaida;
	}

	public void setValorSaida(double valorSaida) {
		this.valorSaida = valorSaida;
	}

	public String getOpcaoVenda() {
		return opcaoVenda;
	}

	public void setOpcaoVenda(String opcaoVenda) {
		this.opcaoVenda = opcaoVenda;
	}

	public String getTipoVenda() {
		return tipoVenda;
	}

	public void setTipoVenda(String tipoVenda) {
		this.tipoVenda = tipoVenda;
	}

	public void calculoLucro() {

		valorSaida = valorEntrada + (valorEntrada * (lucro / 100));

	}

	public void setData(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getHora() {
		return hora;
	}

	public void data() {
		// data
		DateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		data = formatoData.format(date);// saida (dd/mm/aa)

	}

	public void hora() {
		// hora
		DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
		hora = formatoHora.format(date);// saida(HH:mm:s

	}

}
