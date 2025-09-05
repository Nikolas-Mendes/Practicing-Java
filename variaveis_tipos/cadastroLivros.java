public class cadastroLivros {
    public static void main(String[] args) {
        String titulo = "O Pequeno Principe";
        String autor  = "Saint-Exupéry";
        int numeroPaginas = 96;
        double preco = 20.50;
        char categoria = 'F';
        String categoriaNome;

        if (categoria == 'F') {
            categoriaNome = "Ficção";
        } else if (categoria == 'N') {
            categoriaNome = "Não-Ficção";
        } else if (categoria == 'T') {
            categoriaNome = "Tecnologia";
        } else if (categoria == 'H') {
            categoriaNome = "História";
        } else {
            categoriaNome = "Inválida";
        }

        System.out.println("Livro Cadastrado: " + titulo +
                           ", de " + autor + ". Ele possui " + numeroPaginas + " páginas, custa R$" + preco + " e pertence à categoria " + categoriaNome);
    }
}