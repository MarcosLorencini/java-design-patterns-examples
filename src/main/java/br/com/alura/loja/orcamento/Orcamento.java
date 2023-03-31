package br.com.alura.loja.orcamento;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

//Design patter STATE igual ao Strategy resolve o probelma de muitos ifs
public class Orcamento {

    private BigDecimal valor;
    private int quantidadeDeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeDeItens) {
        this.valor = valor;
        this.quantidadeDeItens = quantidadeDeItens;
        //quando orçamento é criado fica em analise no primeiro estágio
        this.situacao = new EmAnalise();
    }

    //aplicando o design STATE
    //o desconto vai variar de acordo com a situacao atual do orcamento
    //a calcula a situacao atual do desconto mandando o proprio orcamento
    //a situacao atual vai definir o desconto e transitar para o prox estado quando possível
    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
        System.out.println("Situação atual: "+ situacao +" valor como desconto "+valor);
    }

    //metodos para transitar de estados
    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }


    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }
}
