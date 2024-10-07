package src.main.java;

public class Translado extends PacoteDecorator {

    public Translado(PacoteViagem pacote) {
        super(pacote);
    }

    public float getPreco() {
        return super.getPreco() + 150.0f;
    }

    public String getDescricao() {
        return super.getDescricao() + " + Serviço de translado";
    }
}
