import java.util.Scanner;

public class compara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior número é: "  + numero1);
        } else {
            System.out.println("O maior número é: "  + numero2);
        }
    }
}
