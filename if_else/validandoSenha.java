import java.util.Scanner;

public class validandoSenha {
    public static void main(String[] args) {
        int senha = 123456;
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Digite a senha: ");  
        String tentativaSenha = scanner.nextLine();  

        if (tentativaSenha.equals(senha)) {
            System.out.println("Acesso permitido!");  
        } else {  
            System.out.println("Acesso negado!");  
        }  
    }
}
