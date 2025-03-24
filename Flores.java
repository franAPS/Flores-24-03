abstract class Flor {
    private String nome;
    private String cor;

    public Flor(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public abstract void exibirInformacoes();

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }
}

