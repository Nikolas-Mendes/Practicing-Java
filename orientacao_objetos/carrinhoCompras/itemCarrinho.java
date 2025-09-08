public class ItemCarrinho {
    String nome;
    double preco;
    int quantidade;
 
    double calcularTotal() {
        return preco * quantidade;
    }
}