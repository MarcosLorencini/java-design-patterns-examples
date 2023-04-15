package br.com.alura.loja;


import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

//COMPOSITE
//compor um orçamento antigo em um novo, ou seja, reaproveitar o orcamento antigo
//um orcamento vai ser composto por outro orçamento
// classe ItemOrcamento e a classe Orcamento vai ter que ter algo em comum para fazer isso, seria
//criar uma inerface
public class TestesComposite {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        //consigo add um item, ou qualquer coisa que seja orcavel
        novo.adicionarItem(antigo);

        //cria o proxy para o orcamento
        OrcamentoProxy proxy = new OrcamentoProxy(novo);

        //PROXY -
        //simular um cache, para não precisar chamar duas vez qualquer API, guarda o resultado do valor
        //para não chamar novamente
        //o proxy que faz a ponte para o orcamento
        //faz a chamada da api uma unica vez e guarada em cache
        //a primeira chamada demora, a outra chamada as infos estão no cache
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());

    }
}
