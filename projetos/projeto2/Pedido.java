package projetos.projeto2;

public class Pedido {
    private int mesa;
    private String cliente;
    private String harcom;
    private String produto;
    private double preco;
    private int quantidade;
    
    public static void main(String[] args) {
        Pedido pedido;
        pedido = new Pedido();
        
        pedido.mesa = 1;
        pedido.cliente = "João";
        pedido.harcom = "Coca-Cola";
        pedido.produto = "Pizza";
        pedido.preco = 30.00;
        pedido.quantidade = 2;
        
        System.out.println("Mesa: " + pedido.mesa);
        System.out.println("Cliente: " + pedido.cliente);
        System.out.println("Harcom: " + pedido.harcom);
        System.out.println("Produto: " + pedido.produto);
        System.out.println("Preço: " + pedido.preco);
        System.out.println("Quantidade: " + pedido.quantidade);
    }
}

