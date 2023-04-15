package br.com.alura.loja.orcamento;

import java.math.BigDecimal;


//PROXY
//reaproveita a Classe Orcamento
public class OrcamentoProxy implements Orcavel{

    //informação que vai deixar em cache
    private BigDecimal valor;

    //objeto que está proxiando
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    //sobrescreve o metodo do Orcavel, com comportamento distinto
    //só chama o metedo getValor()(ex. metodo de uma API lento) se for igual a null
    //se não for null ele vai retornar o valor já armazenado em cache(valor)
    @Override
    public BigDecimal getValor() {
        if (valor == null) {
            this.valor = orcamento.getValor();
        }
        return this.valor;
    }
}
