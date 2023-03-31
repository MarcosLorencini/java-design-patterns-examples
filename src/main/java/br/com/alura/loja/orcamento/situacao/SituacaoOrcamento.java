package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.*;

import java.math.BigDecimal;

// classe que represnta os cenarios -
// por exemplo se a classe Aprovar tentar chamar o método reprovar, chama o método reprovar desta classe
public abstract class  SituacaoOrcamento {

    //so deixa a casca aqui e sobrescreve na outras classes
    //se não sobrescrever pega os métodos abaixo

    //não tem desconto
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    //se já tiver aprovado lanca um exception
    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser aprovado!");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser finalizado!");
    }


}
