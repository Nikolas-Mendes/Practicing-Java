public class Principal {
    public static void main(String[] args) {
        Carro gol = new Carro("Gol", "ABC-1234", 2020);
 
        System.out.println("Veículo cadastrado:");
        System.out.println("Modelo: " + gol.getModelo());
        System.out.println("Placa: " + gol.getPlaca());
        System.out.println("Ano: " + gol.getAno());
    }
}