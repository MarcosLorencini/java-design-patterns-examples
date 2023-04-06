package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
//STRATEGY
//DECORATE
public abstract class  Imposto {
    //pode ser que não exita outro imposto e que seja nulo
    //classe que possui uma composicao dela mesmo
    //a classe está "decorando" a classe com ela mesma
    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    //cada imposto vai ter o seu método para calculo do imposto
    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    //calcula o valor do imposto principal e soma com outro imposto(caso tenha)
    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorOutoImposto = BigDecimal.ZERO;
        if(outro != null ) {
            valorOutoImposto = outro.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorOutoImposto);//soma
    }
}
