package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
//STRATEGY
public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);
}
