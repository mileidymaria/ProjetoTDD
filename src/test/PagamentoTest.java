package test;

import model.Pagamento;
import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;
import java.time.LocalDateTime;

/**
 * LAB 01
 * CONTEXTO: Dado uma data de vencimento e um data de pagamento, informar se o pagamento foi feito em dia ou se foi feito
 * com atraso, se positivo, quantos dias?
 */
public class PagamentoTest {
    @Test
    public void testaSeOPagamentoEstaEmAtraso(){
        Pagamento pagamento = new Pagamento();
        pagamento.setDataPagamento(LocalDateTime.of(2022, 2, 6, 12, 30));
        pagamento.setDataVencimento(LocalDateTime.of(2022, 2, 4, 12, 30));
        Assert.assertFalse("Pagamento em atraso",pagamento.verificaPagamento()); // em dia
    }

    @Test
    public void testaSeOPagamentoEstaEmDia(){
        Pagamento pagamento = new Pagamento();
        pagamento.setDataPagamento(LocalDateTime.of(2022, 2, 4, 12, 30));
        pagamento.setDataVencimento(LocalDateTime.of(2022, 2, 6, 12, 30));
        Assert.assertTrue("Pagamento em dia",pagamento.verificaPagamento()); // em dia
    }
}
