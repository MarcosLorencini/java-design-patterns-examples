package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
//STRATEGY
//DECORATOR
public class TestesImpostos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        //passa a classe q representa o imposto a ser calculado
        //um imposto pode decorar com outro imposto
        //qualquer imposto pede outro imposto, mas se não tem mais passa nulo
        //consegue decorar um imposto com o outro sem alterar o código
        //um imposto não conhece o outro, só recebe no construtor
        //no caso o decorator é um objeto é composto por oturo e esta composição vai alterar o comporta
        //mento original
        //exemplo arvore de natal e decorar ela com pisca pisca
        System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));


    }
}
