package model;

import java.time.LocalDateTime;
/**
 * LAB 01
 * CONTEXTO: Dado uma data de vencimento e um data de pagamento, informar se o pagamento foi feito em dia ou se foi feito
 * com atraso, se positivo, quantos dias?
 */
public class Pagamento {
    private LocalDateTime dataPagamento;
    private LocalDateTime dataVencimento;

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public LocalDateTime getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDateTime dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean verificaPagamento(){
        //the comparator value, negative if less, positive if greater
        if(this.getDataPagamento().compareTo(this.getDataVencimento()) < 0){
            return true;
        }
        return false;
    }
}
