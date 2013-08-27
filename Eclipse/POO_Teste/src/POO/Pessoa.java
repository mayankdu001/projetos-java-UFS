/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author Alan
 */
public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private boolean contratado;

    public Pessoa() {
        nome = null;
        idade = 0;
        altura = 0;
        contratado = false;

    }

    public Pessoa(String nome, int idade, double altura, boolean contratado) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.contratado = contratado;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;

    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }

    public boolean getContratado() {
        return contratado;
    }
}
