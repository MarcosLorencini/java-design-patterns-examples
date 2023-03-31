package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

//CHAIN OF RESPONSABILITY
//aqui o strategy nao vai funcionar, no Strategy já recebemos o parametro da regra a ser aplicada(ICMS, ISS)
// pois o cenario pode cair em varios if s diferentes, não sabemos qual o
//desconto ou mais descontos deve ser aplicado, ou seja, tem que percorrer cada cenario de desconto

public class CalculadoraDeDescontos {
    //não fica repetido nas classe filhas
    public BigDecimal calcular(Orcamento orcamento) {
        //será criada uma classe para cada condição
        //se o 1 cenario for aplicadro chama o calcular, caso contrário chama outro cenario...
        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()));
        return cadeiaDeDescontos.calcular(orcamento);
    }
}
