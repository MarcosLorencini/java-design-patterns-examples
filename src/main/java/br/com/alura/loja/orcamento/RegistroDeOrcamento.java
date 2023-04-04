package br.com.alura.loja.orcamento;


import br.com.alura.loja.http.HttpAdapter;
import br.com.alura.loja.orcamento.situacao.DomainException;

import java.util.Map;

//ADAPTER
//Quando um orcamento for finalizado precisa registrar em um API externa(não importa o que vai ser feito)
//somente chamar esta API para fazer o registro do orcamento
//temos a interface do adaptador na classe mas não precisa saber qual é o adaptador(JavaHttpClient)
// em si(detalhes de implementacao) da chamada da API
public class RegistroDeOrcamento {

    //recebe o adaptador(interface), é flexivel, pode-se trocar o adaptador somente trocando a instancia da classe
    //que implementa este adaptador
    private HttpAdapter http;

    //recebe o adaptador no construtor
    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        //chamada HTTP para a API externa
        //Várias formas: URL Connection, Http Client, lib Rest...
        //Mas não posso chamar aqui, vai misturar o código com detalhes de infra, pois futuramente posso querer
        //alterar a chamada da API.
        //Temos que abstrair esta chamada em outra classe(HttpAdapter) que linka o Registro a API externa

        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orcamento não finalizado");
        }

        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidade", orcamento.getQuantidadeDeItens()
        );

        http.post(url, dados);


    }
}
