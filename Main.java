public class Main {
    public static void main(String[] args) {
        // Criando objetos das classes filhas
        Rosa rosa = new Rosa("Vermelha", "Longa");
        Margarida margarida = new Margarida("Branca", 30);
        Tulipa tulipa = new Tulipa("Amarela", "Doce");

        // Exibindo as informações
        rosa.exibirInformacoes();
        margarida.exibirInformacoes();
        tulipa.exibirInformacoes();

        // Usando o toString para impressão direta
        System.out.println(rosa);
        System.out.println(margarida);
        System.out.println(tulipa);
    }
}