public class Moto extends Veiculo {
    private String guidao;

    public void setGuidao(String g) {
        guidao = g;
    }

    public String getGuidao() {
        return guidao;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de guidão: " + guidao);
    }
}
