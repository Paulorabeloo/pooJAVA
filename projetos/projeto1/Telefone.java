package projetos.projeto1;
class telefone {
    String modelo;
    String numero;
    double custoMinuto;
    double creditoInicial;

    public static void main (String[] args) {
        telefone telefone;
        telefone = new telefone();

        telefone.modelo = "Samsung";
        telefone.numero = "123456789";
        telefone.custoMinuto = 0.10;
        telefone.creditoInicial = 10.00;

        System.out.println("Modelo: " + telefone.modelo);
        System.out.println("Numero: " + telefone.numero);
        System.out.println("Custo por minuto: " + telefone.custoMinuto);
        System.out.println("Credito inicial: " + telefone.creditoInicial);
    }
}