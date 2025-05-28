public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro2.setMarca("Chevrolet");
        carro2.setModelo("Onix");
        carro2.setAno(2022);
        carro2.setPortas(4);

        Moto moto = new Moto();
        moto2.setMarca("Honda");
        moto2.setModelo("CG 160");
        moto2.setAno(2023);
        moto2.setGuidao("Esportivo");

        System.out.println("\nInformações do carro:");
        carro2.exibirDetalhes();
        System.out.println("\nInformações da moto:");
        moto2.exibirDetalhes();
    }
}
