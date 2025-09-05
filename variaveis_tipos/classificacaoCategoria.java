public class classificacaoCategoria {
    public static void main(String[] args) {
        double preco = 50.01;
        String classificacao;

        if (preco <= 50.00) {
            classificacao = "Econômico";
        } else if (preco > 50.00 && preco <= 200.00) {
            classificacao = "Intermediário";
        } else {
            classificacao = "Premium";
        }

        System.err.println("Categoria do Produto: " + classificacao);

    }
}