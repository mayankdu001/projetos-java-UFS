package Login;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import Principal.Pessoa;

public class Login extends Pessoa {

	private int codigoFunc;
	private String senhaFunc;

	public Login(int codigo, String nome, String sobreNome, int cpf,
			String data, String hora, int codigoFunc, String senhaFunc) {
		super(codigo, nome, sobreNome, cpf, data, hora);

		this.codigoFunc = codigoFunc;
		this.senhaFunc = senhaFunc;

	}

	public int getCodigoFunc() {
		return codigoFunc;
	}

	public void setCodigoFunc(int codigoFunc) {
		this.codigoFunc = codigoFunc;
	}

	public String getSenhaFunc() {
		return senhaFunc;
	}

	public void setSenhaFunc(String senhaFunc) {
		this.senhaFunc = senhaFunc;
	}

}
