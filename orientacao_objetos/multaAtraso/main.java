public class Main {
    public static void main(String[] args) {
        PedidoLivro pedido = new PedidoLivro();
        pedido.titulo = "Dom Casmurro";
        pedido.diasAtraso = 3;
 
        pedido.exibirDetalhes();
    }
}