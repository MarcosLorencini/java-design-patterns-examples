package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.*;

import java.math.BigDecimal;
//STRATEGY
public class CalculadoraDeImpostos {
    //foi implementado o padrao de projetos strategy. Sempre que tem um algoritimo, validacao, calculo
    //e varia de acordo com determiando parametro ou tipo de informação, normalmente tem um monte de if else ou
    //switch case
    //os ifs são iguais, muda somente o valor a ser comparado

    public BigDecimal calcular(Orcamento orcamento, Imposto tipoImposto) {
    //o metodo fica amarrado a abstracao(interface) somente
        return tipoImposto.calcular(orcamento);

        //o problema é que toda vez que surgir um novo imposto tem que colocar no switch case
        //o ideal é usar um padrao de projeto para resolver
        //o ideal é extrair uma classe para cada imposto(ICMS, ISS) através de uma interface, pois as duas
        //classes possuem o mesmo método(assinatura) o que muda é a implementação.
        //Cada classe tem a sua implementação especifica, SUA ESTRATEGIA DE CALCULO ESPECIFICA
        //não precisa mais mexer nesta classe

        /*switch (tipoImposto) {
            case ICMS :
                return orcamento.getValor().multiply(new BigDecimal("0.1"));
            case ISS :
                return orcamento.getValor().multiply(new BigDecimal("0.06"));
            default :
                return BigDecimal.ZERO;
        }*/
    }
}
