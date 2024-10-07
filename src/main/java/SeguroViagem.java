package src.main.java;

public class SeguroViagem extends PacoteDecorator {

    public SeguroViagem(PacoteViagem pacote) {
        super(pacote);
    }

    public float getPreco() {
        return super.getPreco() + 200.0f;
    }

    public String getDescricao() {
        return super.getDescricao() + " + Seguro de viagem";
    }
}
