package br.com.alura.loja;


import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

//COMPOSITE
//compor um orçamento antigo em um novo, ou seja, reaproveitar o orcamento antigo
//um orcamento vai ser composto por outro orçamento
// classe ItemOrcamento e a classe Orcamento vai ter que ter algo em comum para fazer isso, seria
//criar uma inerface
public class TestesComposicao {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        //consigo add um item, ou qualquer coisa que seja orcavel
        novo.adicionarItem(antigo);

        System.out.println(novo.getValor());

    }
}
