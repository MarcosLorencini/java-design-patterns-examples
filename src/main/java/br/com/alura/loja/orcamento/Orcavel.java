package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

//tudo que for orcavel tem que ter o getValor()
public interface Orcavel {

    BigDecimal getValor();
}
