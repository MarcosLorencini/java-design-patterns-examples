package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.AcaoAposGerarPedidos;
import br.com.alura.loja.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedidos {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido foi Gerado: " +pedido);
    }
}
