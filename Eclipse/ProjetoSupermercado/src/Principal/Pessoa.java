package Principal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

public class Pessoa {
	Date date = new Date();

	private int codigo;
	private String nome;
	private String sobreNome;
	private int cpf;
	private int rg;
	private String data;
	private String hora;

	public Pessoa(int codigo, String nome, String sobreNome, int cpf, int rg,
			String data, String hora) {
		this.codigo = codigo;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.cpf = cpf;
		this.rg = rg;
		this.data = data;
		this.hora = hora;
	}

	public Pessoa(int codigo, String nome, String sobreNome, int cpf,
			String data, String hora) {
		this.codigo = codigo;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.cpf = cpf;
		this.data = data;
		this.hora = hora;
	}

	public void setCoigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;

	}

	public int getCpf() {
		return cpf;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getRg() {
		return rg;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
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
