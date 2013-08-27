package Lampada;

/**
 *
 * @author Alan
 */
public class Lampada {

    protected int codigo;
    protected boolean acesa;
    protected int potencia;

    public Lampada(int codigo, boolean acesa, int potencia) {
        this.codigo = codigo;
        this.acesa = acesa;
        this.potencia = potencia;
    }

    public Lampada() {
        this.codigo = 0;
        this.acesa = false;
        this.potencia = 0;
    }

    public void setcodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setAcesa(boolean acesa) {
        this.acesa = acesa;
    }

    public boolean getAcesa() {
        return acesa;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void ligarLampada(int testCod) {
        if (testCod == getCodigo()) {
            if (acesa == false) {
                this.acesa = true;
                System.out.println("Lampada Acesa");
            } else {
                System.out.println("Lampada ja acesa");
            }
        }



    }

    public void desligarLampada(int testCod) {
        if (testCod == codigo) {

            if (verificarLampada()) {
                this.acesa = false;
                System.out.println("Lampada desligada");
            } else {
                System.out.println("Lampada ja desligada");
            }
        }
    }

    public boolean verificarLampada() {

        if (acesa) {

            return true;
        }
        return false;

    }

    public int calcularPotencia(int posicao, Lampada newLamp[]) {
        int potenciaTotal = 0;

        for (int i = 0; i < posicao; i++) {
            if (newLamp[i].verificarLampada()) {

                potenciaTotal += newLamp[i].getPotencia();

            }

        }
        return potenciaTotal;

    }

    public void imprimirDados() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Potencia: " + potencia);
        System.out.println("Acesa: " + acesa);
    }
}
