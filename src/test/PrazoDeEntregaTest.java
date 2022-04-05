package test;

import model.PrazoDeEntrega;
import org.junit.Assert;
import org.junit.Test;

/**
 * LAB 02
 * CONTEXTO 02: Saber o prazo de entrega a partir da informação da origem e do destino
 */
public class PrazoDeEntregaTest {

    @Test
    public void testaPrazoDeEntrega(){
        PrazoDeEntrega prazo = new PrazoDeEntrega ();
        prazo.setOrigem("BA");
        prazo.setDestino("SP");
        Assert.assertTrue(prazo.verificaPrazo() == 10);
    }
}
