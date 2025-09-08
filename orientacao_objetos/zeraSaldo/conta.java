public class Conta {
    double saldo;

    public void exibirSaldo() {
        System.out.prinf("Saldo atual: %.2f", saldo); 
    }

    public void zerarSaldo() {
	saldo = 0.0;
    }
}