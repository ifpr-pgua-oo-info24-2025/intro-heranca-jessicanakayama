public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public void setMarca(String m) {
        marca = m;
    }

    public void setModelo(String mod) {
        modelo = mod;
    }

    public void setAno(int a) {
        ano = a;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
