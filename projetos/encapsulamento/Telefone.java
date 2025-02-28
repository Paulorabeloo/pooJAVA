package projetos.encapsulamento;

public class Telefone {
    public String modelo;
    public String numero;
    public double custoMinuto;
    public double creditoInicial;
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public double getCustoMinuto() {
        return custoMinuto;
    }
    public void setCustoMinuto(double custoMinuto) {
        this.custoMinuto = custoMinuto;
    }
    public double getCreditoInicial() {
        return creditoInicial;
    }
    public void setCreditoInicial(double creditoInicial) {
        this.creditoInicial = creditoInicial;
    }

    
}
