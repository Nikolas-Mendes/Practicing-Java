public class Temperatura {
    String nome;
    double nota1;
    double nota2;
 
    public void exibirMedia() {
	double media = (nota1 + nota2) / 2;

        System.out.println("Aluno: " + nome);
        System.out.println("Nota 1: ", nota1);
        System.out.println("Nota 2: ", nota2);
        System.out.printf("Média: %.1f\n", media);
 
        if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else {
	    System.out.println("Situação: Reprovado");
	}
    }
}