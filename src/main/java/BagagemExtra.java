package src.main.java;

public class BagagemExtra extends PacoteDecorator {

    public BagagemExtra(PacoteViagem pacote) {
        super(pacote);
    }

    public float getPreco() {
        return super.getPreco() + 50.0f;
    }

    public String getDescricao() {
        return super.getDescricao() + " + Bagagem extra";
    }
}

