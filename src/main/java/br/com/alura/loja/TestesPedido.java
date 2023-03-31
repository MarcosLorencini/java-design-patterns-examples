package br.com.alura.loja;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.Pedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;


//design patter COMMAND
public class TestesPedido {
    //represetacao da interface com o usuario, qualquer interface, web, mobile, api
    public static void main(String[] args) {
        //puxa os dados da API, ou interface mobile ou web
        String cliente = "Marcos";
        BigDecimal orcamento = new BigDecimal("300");
        int quatidadeItens = Integer.parseInt("2");

        //é so passar a acao pelo contrutor que a classe que implenta interface será usada
        //representa os dados
        GeraPedido geraPedido = new GeraPedido(cliente, orcamento, quatidadeItens);
        //design patter OBSERVER, pois as 2 classes ficam observando, ouvindo para fazer algo
        //classe que execulta. Aqui passaria as dependencias(PedidoRepository.java, emailService...)
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido())
        );
        geraPedidoHandler.executa(geraPedido);




    }
}
