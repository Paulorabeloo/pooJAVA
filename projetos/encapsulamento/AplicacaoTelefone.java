package projetos.encapsulamento;

public class AplicacaoTelefone {
    public static void main(String[] args) {
        Telefone telefone;
        telefone = new Telefone();

        telefone.modelo = "FPS02";
        telefone.numero = "9988-7766";
        telefone.custoMinuto = 1.50;
        telefone.creditoInicial = 15.00;

        System.out.println("Modelo...............: " + telefone.getModelo());
        System.out.println("Numero...............: " + telefone.getNumero());
        System.out.println("Custo por minuto.....: " + telefone.getCustoMinuto());
        System.out.println("Credito inicial......: " + telefone.getCreditoInicial());
    }
}
