package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.*;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {
    // 2% de desc quando aprovado
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }


    //depois de aprovado só pode ser finalizado
    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
