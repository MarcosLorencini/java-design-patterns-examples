package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
//esta classe que tem a logica a regra do desconto, as classes filhas é que informa se deve ser aplicado e o calculo em si
public abstract class Desconto {

    protected Desconto proximo;
    //se a regra não for válida para uma classe chama a próxim classe
    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    //TEMPLATE METHOD
    //este método foi criado para não ser criado em todas as classe filhas, a regras só é aplicada em uma classe
    //é um método do patter Template Method, funciona como um modelo, uma parte do processo ele faz aqui e outras partes ele
    //delega para as classe filhas
    //é quando tem um algoritimo, porém parte deste algoritimo os processo são iguais para todas as classes filhas, ao inves
    //de repetir o algoritimo em todas as classes filhas, extrai na classe mae e as partes especificas delega para um metodo abstrado
    // que é delegado nas classes filhas, evitando ter código dulplicado.
    public BigDecimal calcular(Orcamento orcamento) {//metodo comum que é extraído para a classe mae
        if(deveAplicar(orcamento)) { //delega para as classes filhas
            return efetuarCalculo(orcamento);//delega para as classes filhas
        }
        return proximo.calcular(orcamento);

    }
    //está implementados nas classes filhas
    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    protected abstract boolean deveAplicar(Orcamento orcamento);
}
