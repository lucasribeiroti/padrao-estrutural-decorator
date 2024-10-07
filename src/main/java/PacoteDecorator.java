package src.main.java;

public abstract class PacoteDecorator implements PacoteViagem {

    private PacoteViagem pacote;

    public PacoteDecorator(PacoteViagem pacote) {
        this.pacote = pacote;
    }

    public PacoteViagem getPacote() {
        return pacote;
    }

    public void setPacote(PacoteViagem pacote) {
        this.pacote = pacote;
    }

    public float getPreco() {
        return pacote.getPreco();
    }

    public String getDescricao() {
        return pacote.getDescricao();
    }
}

