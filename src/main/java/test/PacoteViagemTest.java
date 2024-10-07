package src.main.java.test;

import org.junit.jupiter.api.Test;
import src.main.java.*;
import static org.junit.jupiter.api.Assertions.*;

class PacoteViagemTest {

    @Test
    void deveRetornarPrecoPacoteBasico() {
        PacoteViagem pacote = new PacoteBasico(1000.0f);
        assertEquals(1000.0f, pacote.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteComSeguroViagem() {
        PacoteViagem pacote = new SeguroViagem(new PacoteBasico(1000.0f));
        assertEquals(1200.0f, pacote.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteComAssentoPreferencial() {
        PacoteViagem pacote = new AssentoPreferencial(new PacoteBasico(1000.0f));
        assertEquals(1100.0f, pacote.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteComBagagemExtra() {
        PacoteViagem pacote = new BagagemExtra(new PacoteBasico(1000.0f));
        assertEquals(1050.0f, pacote.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteComTranslado() {
        PacoteViagem pacote = new Translado(new PacoteBasico(1000.0f));
        assertEquals(1150.0f, pacote.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteComSeguroViagemMaisAssentoPreferencial() {
        PacoteViagem pacote = new SeguroViagem(new AssentoPreferencial(new PacoteBasico(1000.0f)));
        assertEquals(1300.0f, pacote.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteComSeguroViagemMaisAssentoPreferencialMaisBagagemExtra() {
        PacoteViagem pacote = new SeguroViagem(new AssentoPreferencial(new BagagemExtra(new PacoteBasico(1000.0f))));
        assertEquals(1350.0f, pacote.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteComSeguroViagemMaisAssentoPreferencialMaisTranslado() {
        PacoteViagem pacote = new SeguroViagem(new AssentoPreferencial(new Translado(new PacoteBasico(1000.0f))));
        assertEquals(1450.0f, pacote.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteComTodosOsAdicionais() {
        PacoteViagem pacote = new SeguroViagem(new AssentoPreferencial(new BagagemExtra(new Translado(new PacoteBasico(1000.0f)))));
        assertEquals(1500.0f, pacote.getPreco());
    }

    @Test
    void deveRetornarDescricaoPacoteBasico() {
        PacoteViagem pacote = new PacoteBasico(1000.0f);
        assertEquals("Pacote básico de viagem", pacote.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPacoteComSeguroViagem() {
        PacoteViagem pacote = new SeguroViagem(new PacoteBasico(1000.0f));
        assertEquals("Pacote básico de viagem + Seguro de viagem", pacote.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPacoteComAssentoPreferencial() {
        PacoteViagem pacote = new AssentoPreferencial(new PacoteBasico(1000.0f));
        assertEquals("Pacote básico de viagem + Assento preferencial", pacote.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPacoteComBagagemExtra() {
        PacoteViagem pacote = new BagagemExtra(new PacoteBasico(1000.0f));
        assertEquals("Pacote básico de viagem + Bagagem extra", pacote.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPacoteComTranslado() {
        PacoteViagem pacote = new Translado(new PacoteBasico(1000.0f));
        assertEquals("Pacote básico de viagem + Serviço de translado", pacote.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPacoteComSeguroViagemMaisAssentoPreferencial() {
        PacoteViagem pacote = new SeguroViagem(new AssentoPreferencial(new PacoteBasico(1000.0f)));
        assertEquals("Pacote básico de viagem + Assento preferencial + Seguro de viagem", pacote.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPacoteComSeguroViagemMaisAssentoPreferencialMaisBagagemExtra() {
        PacoteViagem pacote = new SeguroViagem(new AssentoPreferencial(new BagagemExtra(new PacoteBasico(1000.0f))));
        assertEquals("Pacote básico de viagem + Bagagem extra + Assento preferencial + Seguro de viagem", pacote.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPacoteComSeguroViagemMaisAssentoPreferencialMaisTranslado() {
        PacoteViagem pacote = new SeguroViagem(new AssentoPreferencial(new Translado(new PacoteBasico(1000.0f))));
        assertEquals("Pacote básico de viagem + Serviço de translado + Assento preferencial + Seguro de viagem", pacote.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPacoteComTodosOsAdicionais() {
        PacoteViagem pacote = new SeguroViagem(new AssentoPreferencial(new BagagemExtra(new Translado(new PacoteBasico(1000.0f)))));
        assertEquals("Pacote básico de viagem + Serviço de translado + Bagagem extra + Assento preferencial + Seguro de viagem", pacote.getDescricao());
    }
}
