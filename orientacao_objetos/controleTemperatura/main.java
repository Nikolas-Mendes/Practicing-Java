public class Main {
    public static void main(String[] args) {
        Temperatura t = new Temperatura();

        t.local = "Setor A"; 
	t.temperaturaAtual = 39.2;

        t.exibirAlerta();
    }
}