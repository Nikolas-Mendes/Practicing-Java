public class verificacaoIdade {
    public static void main(String[] args) {
        String mensagem;
        int idade = 18;
        
        if (idade >= 18) {
            mensagem = "Você é maior de idade.";
        } else {
            mensagem = "Você é menor de idade.";
        }
 
        System.out.println(mensagem);
    }
}