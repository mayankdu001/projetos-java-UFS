package Aula_09_08_13;

public class EscreverExtenso {

	int numero;
	String test;

	public EscreverExtenso() {
		this.numero = 0;

	}

	public String[] unidades = { "", "um", "dois", "tres", "quatro", "cinco",
			"seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze",
			"catorze", "quinse", "dizeseis", "dizessete", "desoito", "desenove"

	};

	public String[] desenas = { "", "", "vinte", "trinta", "quarenta",
			"cinquenta", "cessenta", "setenta", "oitenta", "noventa", "cem"

	};

	public void mostra(int numero) {
		String test2 = null;
		int test3 = 0;
		int test = 0;
		if (numero < 20) {

			System.out.println(unidades[numero - 1]);

		}

		test = numero % 10;
		test3 = (numero - test) / 10;
		if (test > 0) {

			System.out.println(desenas[test3] + " e " + unidades[test]);
		} else {
			System.out.println(desenas[test3]);
		}
	}

}
