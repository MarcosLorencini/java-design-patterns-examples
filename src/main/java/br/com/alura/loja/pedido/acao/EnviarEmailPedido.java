package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.AcaoAposGerarPedidos;
import br.com.alura.loja.pedido.Pedido;

//design patter OBSERVER ficam ouvindo o disparo
public class EnviarEmailPedido implements AcaoAposGerarPedidos {

    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando email com os dados do pedido!");
    }
}
