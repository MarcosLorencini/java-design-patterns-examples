package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.*;


import java.time.LocalDateTime;


//design patter COMMAND
public class Pedido {

    private String Cliente;
    private LocalDateTime data;
    private Orcamento orcamento;

    public Pedido(String cliente, LocalDateTime data, Orcamento orcamento) {
        Cliente = cliente;
        this.data = data;
        this.orcamento = orcamento;
    }

    public String getCliente() {
        return Cliente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }
}
