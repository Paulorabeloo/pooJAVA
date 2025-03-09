package projetos.associação;

public class Plano {
    private String nome;
    private double custoMinuto;
    private int creditoInicial;
    private Operadora operadora;

    public int getCreditoInicial() {
        return creditoInicial;
    }

    public void setcreditoInicial(int creditoInicial) {
        this.creditoInicial = creditoInicial;
    }

    public double getCustoMinuto() {
        return custoMinuto;
    }

    public void setCustoMinuto(double custoMinuto) {
        this.custoMinuto = custoMinuto;
    }

    public String getNomeString() {
        return nome;
    }

    public void setNomeString(String nome) {
        this.nome = nome;
    }

    public Operadora getOperadora() {
        return operadora;
    }

    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }
}
