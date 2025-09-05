
public class planejandoViagem {
    public static void main(String[] args) {
        double consumoMedio     = 12.5;
        double capacidadeTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem  = 200;
        double autonomiaMaxima;
        double autonomiaAtual;
        String resultado;

        autonomiaMaxima = consumoMedio * capacidadeTanque;
        autonomiaAtual  = consumoMedio * combustivelAtual;

        if (autonomiaAtual >= distanciaViagem) {
            resultado = "Você conseguirá completar a viagem sem precisar abastecer.";
        } else {
            resultado = "Atenção! Você precisará abastecer antes de concluir a viagem.";
        }

        System.out.println("Autonomia máxima do veículo: " + autonomiaMaxima + " km" + 
                           "\nAutonomia atual do veículo: " + autonomiaAtual + " km" + 
                           "\n" + resultado);



    }
}
