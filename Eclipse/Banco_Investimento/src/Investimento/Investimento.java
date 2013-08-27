package Investimento;

public class Investimento {
// criação dos atributos 

    private String nome;
    private double investimento;
    private double rendimento;
    private double resgate;
    private int tmpAplicado;
    private int tmpPadrao;
    private double taxa;

    public Investimento() {
        // ciando o metodo construtor obrigatorio 
        // obrigatorio para inicializar os atributos
//é importante por q todos os atributos tem q ser inicializados 
        // por isso q precisamos do metodo construtor 
//primeiro construtor 
        this.nome = null;
        this.investimento = 0;
        this.rendimento = 0;
        this.resgate = 0;
        this.tmpAplicado = 0;
        this.tmpPadrao = 0;
        this.taxa = 0;
// quando eu crio o metodo construtor ele vai prenencher 
        // o meu objeto quando eu estancio 
    }

    public Investimento(int p_tmpPadrao, double p_taxa) {
        //segundo construtor mas agora com parametros 

        this.nome = null;
        this.investimento = 0;
        this.rendimento = 0;
        this.resgate = 0;
        this.tmpAplicado = 0;
        this.tmpPadrao = p_tmpPadrao;
        this.taxa = p_taxa;

    }

    public void setNome(String nome) {
        // esse set recebe o valor q eu mandei da classe principal 
        // passei pelo parametro nome e salvei no atributo this.nome
        this.nome = nome;
    }
// get trabalha com get
    // set trabalha com set 

    public String getNome() {
        // get pega o valor q esta salvo no atributo 
        // nome e manda pra o get q eu der lá ..... em algum lugar 
        // 
        return nome;
    }

    public void setInvestimento(double investimento) {
        this.investimento = investimento;
    }

    public double getInvestimento() {
        return investimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;

    }

    public double getRendimento() {
        return rendimento;
    }

    public void setResgate(double resgate) {
        this.resgate = resgate;
    }

    public double getResgate() {
        return resgate;
    }

    public void setTmpAplicacao(int tmpAplicacao) {
        this.tmpAplicado = tmpAplicacao;
    }

    public int getTmpAplicacao() {
        return tmpAplicado;
    }

    public void setTmpPadrao(int tmpPadrao) {
        this.tmpPadrao = tmpPadrao;
    }

    public int getTmpPadrao() {
        return tmpPadrao;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;

    }

    public double getTaxa() {
        return taxa;
    }

    public void calcularRenimento(double p_valorInvest, int p_periodoAplicado, double p_taxa) {
        // verificando o tempo 
        // caso seja verdadeiro ele calcula o rendimento
        // e depois calcula o resgate
        if (verificarTempo(tmpAplicado, tmpPadrao)) {
            rendimento = p_valorInvest * p_periodoAplicado * (p_taxa / 100);
        }

    }

    public void calculoResgate(double p_investimento, double p_rendimento) {
// metodo de calculo de rendimento
        // calculo e ja salvo no atributo resgate

        resgate = p_investimento + p_rendimento;

    }

    public static boolean verificarTempo(int p_tempoAplicado, int p_tempoObrigatorio) {
        boolean status;

        //calculando o tempo de investimento
        if (p_tempoAplicado >= p_tempoObrigatorio) {
            status = true;
        } else {
            status = false;
        }

        return status;

    }
}
