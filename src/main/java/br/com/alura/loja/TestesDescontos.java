package br.com.alura.loja;

import br.com.alura.loja.descontos.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

//CHAIN OF RESPONSABILITY junto com o TEMPLATE METHOD
public class TestesDescontos {

    public static void main(String[] args) {

        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));

        primeiro.aplicarDescontoExtra();
        primeiro.aprovar();
        primeiro.aplicarDescontoExtra();
        primeiro.reprovar();//gera exception


    }
}
