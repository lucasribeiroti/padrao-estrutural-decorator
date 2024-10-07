package src.main.java;

public class AssentoPreferencial extends PacoteDecorator {

    public AssentoPreferencial(PacoteViagem pacote) {
        super(pacote);
    }

    public float getPreco() {
        return super.getPreco() + 100.0f;
    }

    public String getDescricao() {
        return super.getDescricao() + " + Assento preferencial";
    }
}
