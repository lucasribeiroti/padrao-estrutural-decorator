package src.main.java;

public class PacoteBasico implements PacoteViagem {

    private float preco;

    public PacoteBasico(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getDescricao() {
        return "Pacote básico de viagem";
    }
}
