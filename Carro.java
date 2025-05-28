public class Carro extends Veiculo {
    private int portas;

    public void setPortas(int p) {
        portas = p;
    }

    public int getPortas() {
        return portas;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de portas: " + portas);
    }
}
